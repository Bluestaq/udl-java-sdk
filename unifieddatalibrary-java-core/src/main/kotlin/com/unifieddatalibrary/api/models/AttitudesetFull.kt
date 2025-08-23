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
 * AttitudeSet represents a wrapper or collection of Onorbit Attitude 'points' and meta data
 * indicating the specifics of the orientation of an on-orbit object. Attitude is typically
 * distributed in a flat file containing details of the attitude generation as well as a large
 * collection of individual points at varying time steps. AttitudeSet is analogous to this flat
 * file.
 */
class AttitudesetFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val endTime: JsonField<OffsetDateTime>,
    private val frame1: JsonField<String>,
    private val frame2: JsonField<String>,
    private val numPoints: JsonField<Int>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val asRef: JsonField<List<String>>,
    private val attitudeList: JsonField<List<AttitudedataFull>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val esId: JsonField<String>,
    private val eulerRotSeq: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val interpolator: JsonField<String>,
    private val interpolatorDegree: JsonField<Int>,
    private val notes: JsonField<String>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val precAngleInit: JsonField<Double>,
    private val satNo: JsonField<Int>,
    private val spinAngleInit: JsonField<Double>,
    private val stepSize: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("frame1") @ExcludeMissing frame1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("frame2") @ExcludeMissing frame2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numPoints") @ExcludeMissing numPoints: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asRef") @ExcludeMissing asRef: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("attitudeList")
        @ExcludeMissing
        attitudeList: JsonField<List<AttitudedataFull>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("esId") @ExcludeMissing esId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eulerRotSeq")
        @ExcludeMissing
        eulerRotSeq: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interpolator")
        @ExcludeMissing
        interpolator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interpolatorDegree")
        @ExcludeMissing
        interpolatorDegree: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
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
        @JsonProperty("precAngleInit")
        @ExcludeMissing
        precAngleInit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("spinAngleInit")
        @ExcludeMissing
        spinAngleInit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("stepSize") @ExcludeMissing stepSize: JsonField<Int> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        endTime,
        frame1,
        frame2,
        numPoints,
        source,
        startTime,
        type,
        id,
        asRef,
        attitudeList,
        createdAt,
        createdBy,
        esId,
        eulerRotSeq,
        idOnOrbit,
        idSensor,
        interpolator,
        interpolatorDegree,
        notes,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        precAngleInit,
        satNo,
        spinAngleInit,
        stepSize,
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
     * The end time of the attitude ephemeris, in ISO 8601 UTC format, with microsecond precision.
     * If this set is constituted by a single epoch attitude message then endTime should match the
     * startTime.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = endTime.getRequired("endTime")

    /**
     * Reference frame 1 of the quaternion or Euler angle transformation utilized in this attitude
     * parameter or attitude ephemeris. The UDL convention is that transformations occur FROM frame1
     * TO frame2. A specific spacecraft frame or instrument name may be provided with the assumption
     * the consumer understands the location of these frames (ex. SC BODY, J2000, LVLH, ICRF,
     * INSTRUMENTx, THRUSTERx, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frame1(): String = frame1.getRequired("frame1")

    /**
     * Reference frame 2 of the quaternion or Euler angle transformation utilized in this attitude
     * parameter or attitude ephemeris. The UDL convention is that transformations occur FROM frame1
     * TO frame2. A specific spacecraft frame or instrument name may be provided with the assumption
     * the consumer understands the location of these frames (ex. SC BODY, J2000, LVLH, ICRF,
     * INSTRUMENTx, THRUSTERx, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun frame2(): String = frame2.getRequired("frame2")

    /**
     * Number of attitude records contained in this set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numPoints(): Int = numPoints.getRequired("numPoints")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The epoch or start time of the attitude parameter or attitude ephemeris, in ISO 8601 UTC
     * format, with microsecond precision. If this set is constituted by a single attitude parameter
     * message then startTime is the epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * The type of attitude message or messages associated with this set.
     *
     * AEM = Attitude Ephemeris Message, specifying the attitude state of a single object at
     * multiple epochs.
     *
     * APM = Attitude Parameters Message, specifying the attitude state of a single object at a
     * single epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Array of UDL UUIDs of one or more AttitudeSet records associated with this set. For example,
     * a spacecraft Attitude Ephemeris Set might include a reference to an Attitude Parameter
     * Message defining the sensor to body frame transformation for a sensor onboard the spacecraft,
     * which allows for calculation of the sensor orientation in frame2 of the attitude ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asRef(): Optional<List<String>> = asRef.getOptional("asRef")

    /**
     * Collection of attitude data associated with this Attitude Set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun attitudeList(): Optional<List<AttitudedataFull>> = attitudeList.getOptional("attitudeList")

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
     * Unique identifier of the parent (positional) Ephemeris Set, if this data is correlated with
     * an Ephemeris.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun esId(): Optional<String> = esId.getOptional("esId")

    /**
     * The rotation sequence of the Euler angles in which attitude reference frame transformation
     * occurs (from left to right). One, two, or three axis rotations are supported and are
     * represented by one, two, or three characters respectively. Repeated axis rotations are also
     * supported, however, these rotations should not be sequential. The numeric sequence values
     * correspond to the body angles/rates as follows: 1 - xAngle/xRate, 2 - yAngle/yRate, and 3 -
     * zAngle/zRate. Valid sequences are: 123, 132, 213, 231, 312, 321, 121, 131, 212, 232, 313,
     * 323, 12, 13, 21, 23, 31, 32, 1, 2, and 3.
     *
     * The following represent examples of possible rotation sequences: A single rotation about the
     * Y-axis can be expressed as '2', a double rotation with X-Z sequence can be expressed as '13',
     * and a triple rotation with Z-X-Y sequence can be expressed as '312'.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eulerRotSeq(): Optional<String> = eulerRotSeq.getOptional("eulerRotSeq")

    /**
     * Unique identifier of the on-orbit satellite to which this attitude set applies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the sensor to which this attitude set applies IF this set is reporting a
     * single sensor orientation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Recommended interpolation method for estimating attitude ephemeris data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun interpolator(): Optional<String> = interpolator.getOptional("interpolator")

    /**
     * Recommended polynomial interpolation degree.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun interpolatorDegree(): Optional<Int> = interpolatorDegree.getOptional("interpolatorDegree")

    /**
     * Optional notes/comments for this attitude set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

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
     * attitude set. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by the record source to indicate the sensor identifier to which
     * this attitude set applies IF this set is reporting a single sensor orientation. This may be
     * an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Initial precession angle (ECI J2000 frame) in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun precAngleInit(): Optional<Double> = precAngleInit.getOptional("precAngleInit")

    /**
     * Satellite/catalog number of the on-orbit object to which this attitude set applies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Initial spin angle (ECI J2000 frame) in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spinAngleInit(): Optional<Double> = spinAngleInit.getOptional("spinAngleInit")

    /**
     * Attitude ephemeris step size, in seconds. This applies to Attitude Ephemeris Messages (AEM)
     * that employ a fixed step size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stepSize(): Optional<Int> = stepSize.getOptional("stepSize")

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
     * Returns the raw JSON value of [endTime].
     *
     * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

    /**
     * Returns the raw JSON value of [frame1].
     *
     * Unlike [frame1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frame1") @ExcludeMissing fun _frame1(): JsonField<String> = frame1

    /**
     * Returns the raw JSON value of [frame2].
     *
     * Unlike [frame2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frame2") @ExcludeMissing fun _frame2(): JsonField<String> = frame2

    /**
     * Returns the raw JSON value of [numPoints].
     *
     * Unlike [numPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numPoints") @ExcludeMissing fun _numPoints(): JsonField<Int> = numPoints

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [asRef].
     *
     * Unlike [asRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asRef") @ExcludeMissing fun _asRef(): JsonField<List<String>> = asRef

    /**
     * Returns the raw JSON value of [attitudeList].
     *
     * Unlike [attitudeList], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attitudeList")
    @ExcludeMissing
    fun _attitudeList(): JsonField<List<AttitudedataFull>> = attitudeList

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
     * Returns the raw JSON value of [eulerRotSeq].
     *
     * Unlike [eulerRotSeq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eulerRotSeq") @ExcludeMissing fun _eulerRotSeq(): JsonField<String> = eulerRotSeq

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
     * Returns the raw JSON value of [interpolator].
     *
     * Unlike [interpolator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interpolator")
    @ExcludeMissing
    fun _interpolator(): JsonField<String> = interpolator

    /**
     * Returns the raw JSON value of [interpolatorDegree].
     *
     * Unlike [interpolatorDegree], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("interpolatorDegree")
    @ExcludeMissing
    fun _interpolatorDegree(): JsonField<Int> = interpolatorDegree

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

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
     * Returns the raw JSON value of [precAngleInit].
     *
     * Unlike [precAngleInit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("precAngleInit")
    @ExcludeMissing
    fun _precAngleInit(): JsonField<Double> = precAngleInit

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [spinAngleInit].
     *
     * Unlike [spinAngleInit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spinAngleInit")
    @ExcludeMissing
    fun _spinAngleInit(): JsonField<Double> = spinAngleInit

    /**
     * Returns the raw JSON value of [stepSize].
     *
     * Unlike [stepSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stepSize") @ExcludeMissing fun _stepSize(): JsonField<Int> = stepSize

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
         * Returns a mutable builder for constructing an instance of [AttitudesetFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endTime()
         * .frame1()
         * .frame2()
         * .numPoints()
         * .source()
         * .startTime()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AttitudesetFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var endTime: JsonField<OffsetDateTime>? = null
        private var frame1: JsonField<String>? = null
        private var frame2: JsonField<String>? = null
        private var numPoints: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var asRef: JsonField<MutableList<String>>? = null
        private var attitudeList: JsonField<MutableList<AttitudedataFull>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var esId: JsonField<String> = JsonMissing.of()
        private var eulerRotSeq: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var interpolator: JsonField<String> = JsonMissing.of()
        private var interpolatorDegree: JsonField<Int> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var precAngleInit: JsonField<Double> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var spinAngleInit: JsonField<Double> = JsonMissing.of()
        private var stepSize: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(attitudesetFull: AttitudesetFull) = apply {
            classificationMarking = attitudesetFull.classificationMarking
            dataMode = attitudesetFull.dataMode
            endTime = attitudesetFull.endTime
            frame1 = attitudesetFull.frame1
            frame2 = attitudesetFull.frame2
            numPoints = attitudesetFull.numPoints
            source = attitudesetFull.source
            startTime = attitudesetFull.startTime
            type = attitudesetFull.type
            id = attitudesetFull.id
            asRef = attitudesetFull.asRef.map { it.toMutableList() }
            attitudeList = attitudesetFull.attitudeList.map { it.toMutableList() }
            createdAt = attitudesetFull.createdAt
            createdBy = attitudesetFull.createdBy
            esId = attitudesetFull.esId
            eulerRotSeq = attitudesetFull.eulerRotSeq
            idOnOrbit = attitudesetFull.idOnOrbit
            idSensor = attitudesetFull.idSensor
            interpolator = attitudesetFull.interpolator
            interpolatorDegree = attitudesetFull.interpolatorDegree
            notes = attitudesetFull.notes
            onOrbit = attitudesetFull.onOrbit
            origin = attitudesetFull.origin
            origNetwork = attitudesetFull.origNetwork
            origObjectId = attitudesetFull.origObjectId
            origSensorId = attitudesetFull.origSensorId
            precAngleInit = attitudesetFull.precAngleInit
            satNo = attitudesetFull.satNo
            spinAngleInit = attitudesetFull.spinAngleInit
            stepSize = attitudesetFull.stepSize
            additionalProperties = attitudesetFull.additionalProperties.toMutableMap()
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
         * The end time of the attitude ephemeris, in ISO 8601 UTC format, with microsecond
         * precision. If this set is constituted by a single epoch attitude message then endTime
         * should match the startTime.
         */
        fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

        /**
         * Sets [Builder.endTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTime(endTime: JsonField<OffsetDateTime>) = apply { this.endTime = endTime }

        /**
         * Reference frame 1 of the quaternion or Euler angle transformation utilized in this
         * attitude parameter or attitude ephemeris. The UDL convention is that transformations
         * occur FROM frame1 TO frame2. A specific spacecraft frame or instrument name may be
         * provided with the assumption the consumer understands the location of these frames (ex.
         * SC BODY, J2000, LVLH, ICRF, INSTRUMENTx, THRUSTERx, etc.).
         */
        fun frame1(frame1: String) = frame1(JsonField.of(frame1))

        /**
         * Sets [Builder.frame1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frame1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frame1(frame1: JsonField<String>) = apply { this.frame1 = frame1 }

        /**
         * Reference frame 2 of the quaternion or Euler angle transformation utilized in this
         * attitude parameter or attitude ephemeris. The UDL convention is that transformations
         * occur FROM frame1 TO frame2. A specific spacecraft frame or instrument name may be
         * provided with the assumption the consumer understands the location of these frames (ex.
         * SC BODY, J2000, LVLH, ICRF, INSTRUMENTx, THRUSTERx, etc.).
         */
        fun frame2(frame2: String) = frame2(JsonField.of(frame2))

        /**
         * Sets [Builder.frame2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frame2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun frame2(frame2: JsonField<String>) = apply { this.frame2 = frame2 }

        /** Number of attitude records contained in this set. */
        fun numPoints(numPoints: Int) = numPoints(JsonField.of(numPoints))

        /**
         * Sets [Builder.numPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numPoints] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numPoints(numPoints: JsonField<Int>) = apply { this.numPoints = numPoints }

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
         * The epoch or start time of the attitude parameter or attitude ephemeris, in ISO 8601 UTC
         * format, with microsecond precision. If this set is constituted by a single attitude
         * parameter message then startTime is the epoch.
         */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /**
         * The type of attitude message or messages associated with this set.
         *
         * AEM = Attitude Ephemeris Message, specifying the attitude state of a single object at
         * multiple epochs.
         *
         * APM = Attitude Parameters Message, specifying the attitude state of a single object at a
         * single epoch.
         */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Array of UDL UUIDs of one or more AttitudeSet records associated with this set. For
         * example, a spacecraft Attitude Ephemeris Set might include a reference to an Attitude
         * Parameter Message defining the sensor to body frame transformation for a sensor onboard
         * the spacecraft, which allows for calculation of the sensor orientation in frame2 of the
         * attitude ephemeris.
         */
        fun asRef(asRef: List<String>) = asRef(JsonField.of(asRef))

        /**
         * Sets [Builder.asRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asRef] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asRef(asRef: JsonField<List<String>>) = apply {
            this.asRef = asRef.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.asRef].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAsRef(asRef: String) = apply {
            this.asRef =
                (this.asRef ?: JsonField.of(mutableListOf())).also {
                    checkKnown("asRef", it).add(asRef)
                }
        }

        /** Collection of attitude data associated with this Attitude Set. */
        fun attitudeList(attitudeList: List<AttitudedataFull>) =
            attitudeList(JsonField.of(attitudeList))

        /**
         * Sets [Builder.attitudeList] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attitudeList] with a well-typed `List<AttitudedataFull>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attitudeList(attitudeList: JsonField<List<AttitudedataFull>>) = apply {
            this.attitudeList = attitudeList.map { it.toMutableList() }
        }

        /**
         * Adds a single [AttitudedataFull] to [Builder.attitudeList].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAttitudeList(attitudeList: AttitudedataFull) = apply {
            this.attitudeList =
                (this.attitudeList ?: JsonField.of(mutableListOf())).also {
                    checkKnown("attitudeList", it).add(attitudeList)
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
         * Unique identifier of the parent (positional) Ephemeris Set, if this data is correlated
         * with an Ephemeris.
         */
        fun esId(esId: String) = esId(JsonField.of(esId))

        /**
         * Sets [Builder.esId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.esId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun esId(esId: JsonField<String>) = apply { this.esId = esId }

        /**
         * The rotation sequence of the Euler angles in which attitude reference frame
         * transformation occurs (from left to right). One, two, or three axis rotations are
         * supported and are represented by one, two, or three characters respectively. Repeated
         * axis rotations are also supported, however, these rotations should not be sequential. The
         * numeric sequence values correspond to the body angles/rates as follows: 1 - xAngle/xRate,
         * 2 - yAngle/yRate, and 3 - zAngle/zRate. Valid sequences are: 123, 132, 213, 231, 312,
         * 321, 121, 131, 212, 232, 313, 323, 12, 13, 21, 23, 31, 32, 1, 2, and 3.
         *
         * The following represent examples of possible rotation sequences: A single rotation about
         * the Y-axis can be expressed as '2', a double rotation with X-Z sequence can be expressed
         * as '13', and a triple rotation with Z-X-Y sequence can be expressed as '312'.
         */
        fun eulerRotSeq(eulerRotSeq: String) = eulerRotSeq(JsonField.of(eulerRotSeq))

        /**
         * Sets [Builder.eulerRotSeq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eulerRotSeq] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eulerRotSeq(eulerRotSeq: JsonField<String>) = apply { this.eulerRotSeq = eulerRotSeq }

        /** Unique identifier of the on-orbit satellite to which this attitude set applies. */
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
         * Unique identifier of the sensor to which this attitude set applies IF this set is
         * reporting a single sensor orientation.
         */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** Recommended interpolation method for estimating attitude ephemeris data. */
        fun interpolator(interpolator: String) = interpolator(JsonField.of(interpolator))

        /**
         * Sets [Builder.interpolator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interpolator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interpolator(interpolator: JsonField<String>) = apply {
            this.interpolator = interpolator
        }

        /** Recommended polynomial interpolation degree. */
        fun interpolatorDegree(interpolatorDegree: Int) =
            interpolatorDegree(JsonField.of(interpolatorDegree))

        /**
         * Sets [Builder.interpolatorDegree] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interpolatorDegree] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interpolatorDegree(interpolatorDegree: JsonField<Int>) = apply {
            this.interpolatorDegree = interpolatorDegree
        }

        /** Optional notes/comments for this attitude set. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /** Model object representing on-orbit objects or satellites in the system. */
        fun onOrbit(onOrbit: OnorbitFull) = onOrbit(JsonField.of(onOrbit))

        /**
         * Sets [Builder.onOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbit] with a well-typed [OnorbitFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onOrbit(onOrbit: JsonField<OnorbitFull>) = apply { this.onOrbit = onOrbit }

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
         * attitude set. This may be an internal identifier and not necessarily map to a valid
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
         * Optional identifier provided by the record source to indicate the sensor identifier to
         * which this attitude set applies IF this set is reporting a single sensor orientation.
         * This may be an internal identifier and not necessarily a valid sensor ID.
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

        /** Initial precession angle (ECI J2000 frame) in degrees. */
        fun precAngleInit(precAngleInit: Double) = precAngleInit(JsonField.of(precAngleInit))

        /**
         * Sets [Builder.precAngleInit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.precAngleInit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun precAngleInit(precAngleInit: JsonField<Double>) = apply {
            this.precAngleInit = precAngleInit
        }

        /** Satellite/catalog number of the on-orbit object to which this attitude set applies. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Initial spin angle (ECI J2000 frame) in degrees. */
        fun spinAngleInit(spinAngleInit: Double) = spinAngleInit(JsonField.of(spinAngleInit))

        /**
         * Sets [Builder.spinAngleInit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spinAngleInit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spinAngleInit(spinAngleInit: JsonField<Double>) = apply {
            this.spinAngleInit = spinAngleInit
        }

        /**
         * Attitude ephemeris step size, in seconds. This applies to Attitude Ephemeris Messages
         * (AEM) that employ a fixed step size.
         */
        fun stepSize(stepSize: Int) = stepSize(JsonField.of(stepSize))

        /**
         * Sets [Builder.stepSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stepSize] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun stepSize(stepSize: JsonField<Int>) = apply { this.stepSize = stepSize }

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
         * Returns an immutable instance of [AttitudesetFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .endTime()
         * .frame1()
         * .frame2()
         * .numPoints()
         * .source()
         * .startTime()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AttitudesetFull =
            AttitudesetFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("endTime", endTime),
                checkRequired("frame1", frame1),
                checkRequired("frame2", frame2),
                checkRequired("numPoints", numPoints),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                checkRequired("type", type),
                id,
                (asRef ?: JsonMissing.of()).map { it.toImmutable() },
                (attitudeList ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                esId,
                eulerRotSeq,
                idOnOrbit,
                idSensor,
                interpolator,
                interpolatorDegree,
                notes,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                precAngleInit,
                satNo,
                spinAngleInit,
                stepSize,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AttitudesetFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        endTime()
        frame1()
        frame2()
        numPoints()
        source()
        startTime()
        type()
        id()
        asRef()
        attitudeList().ifPresent { it.forEach { it.validate() } }
        createdAt()
        createdBy()
        esId()
        eulerRotSeq()
        idOnOrbit()
        idSensor()
        interpolator()
        interpolatorDegree()
        notes()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        precAngleInit()
        satNo()
        spinAngleInit()
        stepSize()
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
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (frame1.asKnown().isPresent) 1 else 0) +
            (if (frame2.asKnown().isPresent) 1 else 0) +
            (if (numPoints.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (asRef.asKnown().getOrNull()?.size ?: 0) +
            (attitudeList.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (esId.asKnown().isPresent) 1 else 0) +
            (if (eulerRotSeq.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (interpolator.asKnown().isPresent) 1 else 0) +
            (if (interpolatorDegree.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (precAngleInit.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (spinAngleInit.asKnown().isPresent) 1 else 0) +
            (if (stepSize.asKnown().isPresent) 1 else 0)

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

        return other is AttitudesetFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            endTime == other.endTime &&
            frame1 == other.frame1 &&
            frame2 == other.frame2 &&
            numPoints == other.numPoints &&
            source == other.source &&
            startTime == other.startTime &&
            type == other.type &&
            id == other.id &&
            asRef == other.asRef &&
            attitudeList == other.attitudeList &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            esId == other.esId &&
            eulerRotSeq == other.eulerRotSeq &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            interpolator == other.interpolator &&
            interpolatorDegree == other.interpolatorDegree &&
            notes == other.notes &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            precAngleInit == other.precAngleInit &&
            satNo == other.satNo &&
            spinAngleInit == other.spinAngleInit &&
            stepSize == other.stepSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            endTime,
            frame1,
            frame2,
            numPoints,
            source,
            startTime,
            type,
            id,
            asRef,
            attitudeList,
            createdAt,
            createdBy,
            esId,
            eulerRotSeq,
            idOnOrbit,
            idSensor,
            interpolator,
            interpolatorDegree,
            notes,
            onOrbit,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            precAngleInit,
            satNo,
            spinAngleInit,
            stepSize,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AttitudesetFull{classificationMarking=$classificationMarking, dataMode=$dataMode, endTime=$endTime, frame1=$frame1, frame2=$frame2, numPoints=$numPoints, source=$source, startTime=$startTime, type=$type, id=$id, asRef=$asRef, attitudeList=$attitudeList, createdAt=$createdAt, createdBy=$createdBy, esId=$esId, eulerRotSeq=$eulerRotSeq, idOnOrbit=$idOnOrbit, idSensor=$idSensor, interpolator=$interpolator, interpolatorDegree=$interpolatorDegree, notes=$notes, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, precAngleInit=$precAngleInit, satNo=$satNo, spinAngleInit=$spinAngleInit, stepSize=$stepSize, additionalProperties=$additionalProperties}"
}

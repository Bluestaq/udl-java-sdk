// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.gnssrawif

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
 * Global Navigation Satellite System (GNSS) Raw Intermediate Frequency (IF) data are the recorded
 * streams of raw signal samples after down-conversion of the received signal to IF and prior to any
 * processing onboard the receiving spacecraft. These data sets are processed in various geophysical
 * applications and used to characterize Electromagnetic Interference (EMI) in the operating
 * environment.
 */
class GnssRawIfListResponse
private constructor(
    private val centerFreq: JsonField<List<Double>>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val endTime: JsonField<OffsetDateTime>,
    private val fileName: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val bitDepth: JsonField<Int>,
    private val boresight: JsonField<List<Double>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dataRate: JsonField<Double>,
    private val diffCodeBias: JsonField<List<Double>>,
    private val endAlt: JsonField<Double>,
    private val endLat: JsonField<Double>,
    private val endLon: JsonField<Double>,
    private val esId: JsonField<String>,
    private val eventId: JsonField<String>,
    private val fileSize: JsonField<Long>,
    private val idOnOrbit: JsonField<String>,
    private val ifFreq: JsonField<List<Double>>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val postFourier: JsonField<List<String>>,
    private val quat: JsonField<List<Double>>,
    private val receiver: JsonField<String>,
    private val sampleRate: JsonField<List<Int>>,
    private val sampleType: JsonField<String>,
    private val satNo: JsonField<Int>,
    private val sequenceId: JsonField<Int>,
    private val setId: JsonField<String>,
    private val setLength: JsonField<Int>,
    private val srcIds: JsonField<List<String>>,
    private val srcTyps: JsonField<List<String>>,
    private val startAlt: JsonField<Double>,
    private val startIndex: JsonField<Int>,
    private val startLat: JsonField<Double>,
    private val startLon: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("centerFreq")
        @ExcludeMissing
        centerFreq: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("endTime")
        @ExcludeMissing
        endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bitDepth") @ExcludeMissing bitDepth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("boresight")
        @ExcludeMissing
        boresight: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataRate") @ExcludeMissing dataRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("diffCodeBias")
        @ExcludeMissing
        diffCodeBias: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("endAlt") @ExcludeMissing endAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endLat") @ExcludeMissing endLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("endLon") @ExcludeMissing endLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("esId") @ExcludeMissing esId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eventId") @ExcludeMissing eventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileSize") @ExcludeMissing fileSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ifFreq") @ExcludeMissing ifFreq: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postFourier")
        @ExcludeMissing
        postFourier: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("quat") @ExcludeMissing quat: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("receiver") @ExcludeMissing receiver: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sampleRate")
        @ExcludeMissing
        sampleRate: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("sampleType")
        @ExcludeMissing
        sampleType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sequenceID") @ExcludeMissing sequenceId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("setId") @ExcludeMissing setId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("setLength") @ExcludeMissing setLength: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("srcIds") @ExcludeMissing srcIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("srcTyps")
        @ExcludeMissing
        srcTyps: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("startAlt") @ExcludeMissing startAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startIndex") @ExcludeMissing startIndex: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("startLat") @ExcludeMissing startLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("startLon") @ExcludeMissing startLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        centerFreq,
        classificationMarking,
        dataMode,
        endTime,
        fileName,
        source,
        startTime,
        id,
        bitDepth,
        boresight,
        createdAt,
        createdBy,
        dataRate,
        diffCodeBias,
        endAlt,
        endLat,
        endLon,
        esId,
        eventId,
        fileSize,
        idOnOrbit,
        ifFreq,
        origin,
        origNetwork,
        origObjectId,
        postFourier,
        quat,
        receiver,
        sampleRate,
        sampleType,
        satNo,
        sequenceId,
        setId,
        setLength,
        srcIds,
        srcTyps,
        startAlt,
        startIndex,
        startLat,
        startLon,
        tags,
        mutableMapOf(),
    )

    /**
     * The center frequency, in MHz, of the observation bands. More than one band may be reported in
     * each binary file, so this is an array of the center frequency of each band (including an
     * array of length 1 if only one band is present).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun centerFreq(): List<Double> = centerFreq.getRequired("centerFreq")

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
     * End time of the data contained in the associated binary file, in ISO 8601 UTC format with
     * microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun endTime(): OffsetDateTime = endTime.getRequired("endTime")

    /**
     * The file name of the Raw IF Binary file. The files should be in the Hierarchical Data Format
     * (HDF5).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = fileName.getRequired("fileName")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Start time of the data contained in the associated binary file, in ISO 8601 UTC format with
     * microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The number of bits in each datum, for example 2 for 2-bit integers or 8 for 8-bit integers.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bitDepth(): Optional<Int> = bitDepth.getOptional("bitDepth")

    /**
     * Unit vector of the outward facing direction of the receiver boresight in a body-fixed
     * coordinate system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun boresight(): Optional<List<Double>> = boresight.getOptional("boresight")

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
     * The amount of data generated per unit time, expressed in Megabytes/minute.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dataRate(): Optional<Double> = dataRate.getOptional("dataRate")

    /**
     * Differential Code Biases (DCBs) are the systematic errors, or biases, between two GNSS code
     * observations at the same or different frequencies. If applicable, this field should contain
     * an array of DBC with length equal to the number of frequencies in the binary file. The
     * reference frequency should show DCB equal to 0. If null, it is assumed that there is no DCB
     * (all values are 0).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun diffCodeBias(): Optional<List<Double>> = diffCodeBias.getOptional("diffCodeBias")

    /**
     * Spacecraft altitude at end time (endTime), expressed in kilometers above WGS-84 ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endAlt(): Optional<Double> = endAlt.getOptional("endAlt")

    /**
     * WGS-84 spacecraft latitude sub-point at end time (endTime), represented as -90 to 90 degrees
     * (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endLat(): Optional<Double> = endLat.getOptional("endLat")

    /**
     * WGS-84 spacecraft longitude sub-point at end time (endTime), represented as -180 to 180
     * degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun endLon(): Optional<Double> = endLon.getOptional("endLon")

    /**
     * Unique identifier of the parent Ephemeris Set, if this data is correlated with an Ephemeris.
     * If reporting for a spacecraft with multiple onboard GNSS receivers, this ID may be associated
     * with multiple GNSS Raw IF records if each receiver is synced to the ephemeris points.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun esId(): Optional<String> = esId.getOptional("esId")

    /**
     * Optional source-provided identifier for this collection event. This field can be used to
     * associate records related to the same event.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eventId(): Optional<String> = eventId.getOptional("eventId")

    /**
     * The binary file size, in bytes, auto-populated by the system. The maximum file size for this
     * service is 5,000,000 Bytes (5 MB). Files exceeding the maximum size will be rejected.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fileSize(): Optional<Long> = fileSize.getOptional("fileSize")

    /**
     * Unique identifier of the primary satellite on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * The center frequency, in MHz, after downconversion to intermediate frequency. If provided,
     * this array should have the same length as centerFreqs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ifFreq(): Optional<List<Double>> = ifFreq.getOptional("ifFreq")

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
     * Optional identifier provided by the data source to indicate the target object of this record.
     * This may be an internal identifier and not necessarily map to a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * After converting the raw data in the file, to generate (frequency-space) spectra some sets
     * require an additional transformation or correction based on details of the hardware that
     * recorded it. This field marks any such transformations. Currently supported options are NONE
     * (no correction) and MIRRORED (frequency axis is flipped around the corresponding value of
     * ifFreq). If null, it is assumed that NONE applies to all frequency bands.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun postFourier(): Optional<List<String>> = postFourier.getOptional("postFourier")

    /**
     * The quaternion describing the rotation of the body-fixed frame used for this system into the
     * local geodetic frame, at the sample start time (startTime). The array element order
     * convention is scalar component first, followed by the three vector components. For a vector u
     * in the body-fixed frame, the corresponding vector u' in the geodetic frame should satisfy u'
     * = quq\*, where q is this quaternion. The quaternion should be normalized to 1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun quat(): Optional<List<Double>> = quat.getOptional("quat")

    /**
     * The number or ID of the GNSS receiver associated with this data. If reporting for multiple
     * receivers a separate record should be generated for each. If null, it is assumed to indicate
     * that only one receiver is present, or reported.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receiver(): Optional<String> = receiver.getOptional("receiver")

    /**
     * The number of samples taken per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sampleRate(): Optional<List<Int>> = sampleRate.getOptional("sampleRate")

    /**
     * The sample type associated with the IF data. REAL for data with only an I-component or
     * COMPLEX for data with both I & Q components.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sampleType(): Optional<String> = sampleType.getOptional("sampleType")

    /**
     * Satellite/catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * The sequence number of a raw IF record/file within a set. Sequence number should start at 1.
     * If null, then it is assumed that the order of records within a raw IF set is not relevant.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sequenceId(): Optional<Int> = sequenceId.getOptional("sequenceID")

    /**
     * User-defined ID of a set or sequence of records/files. Used to associate a set of related raw
     * IF records.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun setId(): Optional<String> = setId.getOptional("setId")

    /**
     * The number of raw IF records/files in a set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun setLength(): Optional<Int> = setLength.getOptional("setLength")

    /**
     * Array of UUIDs of the UDL data records associated with this GNSSRawIF record. See the
     * associated 'srcTyps' array for the specific types of data, positionally corresponding to the
     * UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
     * corresponding srcTyps array element for the data type of the UUID and use the appropriate API
     * operation to retrieve that object (e.g. /udl/gnssobservationset/{uuid}).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

    /**
     * Array of UDL record types (GNSSSET) associated with this GNSSRawIF record. See the associated
     * 'srcIds' array for the record UUIDs, positionally corresponding to the record types in this
     * array. The 'srcTyps' and 'srcIds' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

    /**
     * Spacecraft altitude at start time (startTime), expressed in kilometers above WGS-84
     * ellipsoid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startAlt(): Optional<Double> = startAlt.getOptional("startAlt")

    /**
     * The index of the sample within the associated binary file that corresponds to the startTime
     * indicated in this record. This is especially useful on high sample-rate sensors when some
     * samples are less than one microsecond before the value of startTime. This index is 0-based.
     * If null, the startIndex is assumed to be 0.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startIndex(): Optional<Int> = startIndex.getOptional("startIndex")

    /**
     * WGS-84 spacecraft latitude sub-point at start time (startTime), represented as -90 to 90
     * degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startLat(): Optional<Double> = startLat.getOptional("startLat")

    /**
     * WGS-84 spacecraft longitude sub-point at start time (startTime), represented as -180 to 180
     * degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun startLon(): Optional<Double> = startLon.getOptional("startLon")

    /**
     * Optional array of provider/source specific tags for this data, where each element is no
     * longer than 32 characters, used for implementing data owner conditional access controls to
     * restrict access to the data. Should be left null by data providers unless conditional access
     * controls are coordinated with the UDL team.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [centerFreq].
     *
     * Unlike [centerFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("centerFreq")
    @ExcludeMissing
    fun _centerFreq(): JsonField<List<Double>> = centerFreq

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
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

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
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [bitDepth].
     *
     * Unlike [bitDepth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bitDepth") @ExcludeMissing fun _bitDepth(): JsonField<Int> = bitDepth

    /**
     * Returns the raw JSON value of [boresight].
     *
     * Unlike [boresight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boresight") @ExcludeMissing fun _boresight(): JsonField<List<Double>> = boresight

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
     * Returns the raw JSON value of [dataRate].
     *
     * Unlike [dataRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataRate") @ExcludeMissing fun _dataRate(): JsonField<Double> = dataRate

    /**
     * Returns the raw JSON value of [diffCodeBias].
     *
     * Unlike [diffCodeBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("diffCodeBias")
    @ExcludeMissing
    fun _diffCodeBias(): JsonField<List<Double>> = diffCodeBias

    /**
     * Returns the raw JSON value of [endAlt].
     *
     * Unlike [endAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endAlt") @ExcludeMissing fun _endAlt(): JsonField<Double> = endAlt

    /**
     * Returns the raw JSON value of [endLat].
     *
     * Unlike [endLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLat") @ExcludeMissing fun _endLat(): JsonField<Double> = endLat

    /**
     * Returns the raw JSON value of [endLon].
     *
     * Unlike [endLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endLon") @ExcludeMissing fun _endLon(): JsonField<Double> = endLon

    /**
     * Returns the raw JSON value of [esId].
     *
     * Unlike [esId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("esId") @ExcludeMissing fun _esId(): JsonField<String> = esId

    /**
     * Returns the raw JSON value of [eventId].
     *
     * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

    /**
     * Returns the raw JSON value of [fileSize].
     *
     * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileSize") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [ifFreq].
     *
     * Unlike [ifFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ifFreq") @ExcludeMissing fun _ifFreq(): JsonField<List<Double>> = ifFreq

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
     * Returns the raw JSON value of [postFourier].
     *
     * Unlike [postFourier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postFourier")
    @ExcludeMissing
    fun _postFourier(): JsonField<List<String>> = postFourier

    /**
     * Returns the raw JSON value of [quat].
     *
     * Unlike [quat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quat") @ExcludeMissing fun _quat(): JsonField<List<Double>> = quat

    /**
     * Returns the raw JSON value of [receiver].
     *
     * Unlike [receiver], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receiver") @ExcludeMissing fun _receiver(): JsonField<String> = receiver

    /**
     * Returns the raw JSON value of [sampleRate].
     *
     * Unlike [sampleRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampleRate") @ExcludeMissing fun _sampleRate(): JsonField<List<Int>> = sampleRate

    /**
     * Returns the raw JSON value of [sampleType].
     *
     * Unlike [sampleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sampleType") @ExcludeMissing fun _sampleType(): JsonField<String> = sampleType

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [sequenceId].
     *
     * Unlike [sequenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceID") @ExcludeMissing fun _sequenceId(): JsonField<Int> = sequenceId

    /**
     * Returns the raw JSON value of [setId].
     *
     * Unlike [setId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("setId") @ExcludeMissing fun _setId(): JsonField<String> = setId

    /**
     * Returns the raw JSON value of [setLength].
     *
     * Unlike [setLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("setLength") @ExcludeMissing fun _setLength(): JsonField<Int> = setLength

    /**
     * Returns the raw JSON value of [srcIds].
     *
     * Unlike [srcIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcIds") @ExcludeMissing fun _srcIds(): JsonField<List<String>> = srcIds

    /**
     * Returns the raw JSON value of [srcTyps].
     *
     * Unlike [srcTyps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("srcTyps") @ExcludeMissing fun _srcTyps(): JsonField<List<String>> = srcTyps

    /**
     * Returns the raw JSON value of [startAlt].
     *
     * Unlike [startAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startAlt") @ExcludeMissing fun _startAlt(): JsonField<Double> = startAlt

    /**
     * Returns the raw JSON value of [startIndex].
     *
     * Unlike [startIndex], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startIndex") @ExcludeMissing fun _startIndex(): JsonField<Int> = startIndex

    /**
     * Returns the raw JSON value of [startLat].
     *
     * Unlike [startLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLat") @ExcludeMissing fun _startLat(): JsonField<Double> = startLat

    /**
     * Returns the raw JSON value of [startLon].
     *
     * Unlike [startLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startLon") @ExcludeMissing fun _startLon(): JsonField<Double> = startLon

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
         * Returns a mutable builder for constructing an instance of [GnssRawIfListResponse].
         *
         * The following fields are required:
         * ```java
         * .centerFreq()
         * .classificationMarking()
         * .dataMode()
         * .endTime()
         * .fileName()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GnssRawIfListResponse]. */
    class Builder internal constructor() {

        private var centerFreq: JsonField<MutableList<Double>>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var endTime: JsonField<OffsetDateTime>? = null
        private var fileName: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var bitDepth: JsonField<Int> = JsonMissing.of()
        private var boresight: JsonField<MutableList<Double>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dataRate: JsonField<Double> = JsonMissing.of()
        private var diffCodeBias: JsonField<MutableList<Double>>? = null
        private var endAlt: JsonField<Double> = JsonMissing.of()
        private var endLat: JsonField<Double> = JsonMissing.of()
        private var endLon: JsonField<Double> = JsonMissing.of()
        private var esId: JsonField<String> = JsonMissing.of()
        private var eventId: JsonField<String> = JsonMissing.of()
        private var fileSize: JsonField<Long> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var ifFreq: JsonField<MutableList<Double>>? = null
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var postFourier: JsonField<MutableList<String>>? = null
        private var quat: JsonField<MutableList<Double>>? = null
        private var receiver: JsonField<String> = JsonMissing.of()
        private var sampleRate: JsonField<MutableList<Int>>? = null
        private var sampleType: JsonField<String> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var sequenceId: JsonField<Int> = JsonMissing.of()
        private var setId: JsonField<String> = JsonMissing.of()
        private var setLength: JsonField<Int> = JsonMissing.of()
        private var srcIds: JsonField<MutableList<String>>? = null
        private var srcTyps: JsonField<MutableList<String>>? = null
        private var startAlt: JsonField<Double> = JsonMissing.of()
        private var startIndex: JsonField<Int> = JsonMissing.of()
        private var startLat: JsonField<Double> = JsonMissing.of()
        private var startLon: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gnssRawIfListResponse: GnssRawIfListResponse) = apply {
            centerFreq = gnssRawIfListResponse.centerFreq.map { it.toMutableList() }
            classificationMarking = gnssRawIfListResponse.classificationMarking
            dataMode = gnssRawIfListResponse.dataMode
            endTime = gnssRawIfListResponse.endTime
            fileName = gnssRawIfListResponse.fileName
            source = gnssRawIfListResponse.source
            startTime = gnssRawIfListResponse.startTime
            id = gnssRawIfListResponse.id
            bitDepth = gnssRawIfListResponse.bitDepth
            boresight = gnssRawIfListResponse.boresight.map { it.toMutableList() }
            createdAt = gnssRawIfListResponse.createdAt
            createdBy = gnssRawIfListResponse.createdBy
            dataRate = gnssRawIfListResponse.dataRate
            diffCodeBias = gnssRawIfListResponse.diffCodeBias.map { it.toMutableList() }
            endAlt = gnssRawIfListResponse.endAlt
            endLat = gnssRawIfListResponse.endLat
            endLon = gnssRawIfListResponse.endLon
            esId = gnssRawIfListResponse.esId
            eventId = gnssRawIfListResponse.eventId
            fileSize = gnssRawIfListResponse.fileSize
            idOnOrbit = gnssRawIfListResponse.idOnOrbit
            ifFreq = gnssRawIfListResponse.ifFreq.map { it.toMutableList() }
            origin = gnssRawIfListResponse.origin
            origNetwork = gnssRawIfListResponse.origNetwork
            origObjectId = gnssRawIfListResponse.origObjectId
            postFourier = gnssRawIfListResponse.postFourier.map { it.toMutableList() }
            quat = gnssRawIfListResponse.quat.map { it.toMutableList() }
            receiver = gnssRawIfListResponse.receiver
            sampleRate = gnssRawIfListResponse.sampleRate.map { it.toMutableList() }
            sampleType = gnssRawIfListResponse.sampleType
            satNo = gnssRawIfListResponse.satNo
            sequenceId = gnssRawIfListResponse.sequenceId
            setId = gnssRawIfListResponse.setId
            setLength = gnssRawIfListResponse.setLength
            srcIds = gnssRawIfListResponse.srcIds.map { it.toMutableList() }
            srcTyps = gnssRawIfListResponse.srcTyps.map { it.toMutableList() }
            startAlt = gnssRawIfListResponse.startAlt
            startIndex = gnssRawIfListResponse.startIndex
            startLat = gnssRawIfListResponse.startLat
            startLon = gnssRawIfListResponse.startLon
            tags = gnssRawIfListResponse.tags.map { it.toMutableList() }
            additionalProperties = gnssRawIfListResponse.additionalProperties.toMutableMap()
        }

        /**
         * The center frequency, in MHz, of the observation bands. More than one band may be
         * reported in each binary file, so this is an array of the center frequency of each band
         * (including an array of length 1 if only one band is present).
         */
        fun centerFreq(centerFreq: List<Double>) = centerFreq(JsonField.of(centerFreq))

        /**
         * Sets [Builder.centerFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerFreq] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun centerFreq(centerFreq: JsonField<List<Double>>) = apply {
            this.centerFreq = centerFreq.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.centerFreq].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCenterFreq(centerFreq: Double) = apply {
            this.centerFreq =
                (this.centerFreq ?: JsonField.of(mutableListOf())).also {
                    checkKnown("centerFreq", it).add(centerFreq)
                }
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
         * End time of the data contained in the associated binary file, in ISO 8601 UTC format with
         * microsecond precision.
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
         * The file name of the Raw IF Binary file. The files should be in the Hierarchical Data
         * Format (HDF5).
         */
        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

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
         * Start time of the data contained in the associated binary file, in ISO 8601 UTC format
         * with microsecond precision.
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
         * The number of bits in each datum, for example 2 for 2-bit integers or 8 for 8-bit
         * integers.
         */
        fun bitDepth(bitDepth: Int) = bitDepth(JsonField.of(bitDepth))

        /**
         * Sets [Builder.bitDepth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bitDepth] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bitDepth(bitDepth: JsonField<Int>) = apply { this.bitDepth = bitDepth }

        /**
         * Unit vector of the outward facing direction of the receiver boresight in a body-fixed
         * coordinate system.
         */
        fun boresight(boresight: List<Double>) = boresight(JsonField.of(boresight))

        /**
         * Sets [Builder.boresight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boresight] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun boresight(boresight: JsonField<List<Double>>) = apply {
            this.boresight = boresight.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.boresight].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBoresight(boresight: Double) = apply {
            this.boresight =
                (this.boresight ?: JsonField.of(mutableListOf())).also {
                    checkKnown("boresight", it).add(boresight)
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

        /** The amount of data generated per unit time, expressed in Megabytes/minute. */
        fun dataRate(dataRate: Double) = dataRate(JsonField.of(dataRate))

        /**
         * Sets [Builder.dataRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataRate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dataRate(dataRate: JsonField<Double>) = apply { this.dataRate = dataRate }

        /**
         * Differential Code Biases (DCBs) are the systematic errors, or biases, between two GNSS
         * code observations at the same or different frequencies. If applicable, this field should
         * contain an array of DBC with length equal to the number of frequencies in the binary
         * file. The reference frequency should show DCB equal to 0. If null, it is assumed that
         * there is no DCB (all values are 0).
         */
        fun diffCodeBias(diffCodeBias: List<Double>) = diffCodeBias(JsonField.of(diffCodeBias))

        /**
         * Sets [Builder.diffCodeBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.diffCodeBias] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun diffCodeBias(diffCodeBias: JsonField<List<Double>>) = apply {
            this.diffCodeBias = diffCodeBias.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [diffCodeBias].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiffCodeBia(diffCodeBia: Double) = apply {
            diffCodeBias =
                (diffCodeBias ?: JsonField.of(mutableListOf())).also {
                    checkKnown("diffCodeBias", it).add(diffCodeBia)
                }
        }

        /**
         * Spacecraft altitude at end time (endTime), expressed in kilometers above WGS-84
         * ellipsoid.
         */
        fun endAlt(endAlt: Double) = endAlt(JsonField.of(endAlt))

        /**
         * Sets [Builder.endAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endAlt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endAlt(endAlt: JsonField<Double>) = apply { this.endAlt = endAlt }

        /**
         * WGS-84 spacecraft latitude sub-point at end time (endTime), represented as -90 to 90
         * degrees (negative values south of equator).
         */
        fun endLat(endLat: Double) = endLat(JsonField.of(endLat))

        /**
         * Sets [Builder.endLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLat(endLat: JsonField<Double>) = apply { this.endLat = endLat }

        /**
         * WGS-84 spacecraft longitude sub-point at end time (endTime), represented as -180 to 180
         * degrees (negative values west of Prime Meridian).
         */
        fun endLon(endLon: Double) = endLon(JsonField.of(endLon))

        /**
         * Sets [Builder.endLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun endLon(endLon: JsonField<Double>) = apply { this.endLon = endLon }

        /**
         * Unique identifier of the parent Ephemeris Set, if this data is correlated with an
         * Ephemeris. If reporting for a spacecraft with multiple onboard GNSS receivers, this ID
         * may be associated with multiple GNSS Raw IF records if each receiver is synced to the
         * ephemeris points.
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
         * Optional source-provided identifier for this collection event. This field can be used to
         * associate records related to the same event.
         */
        fun eventId(eventId: String) = eventId(JsonField.of(eventId))

        /**
         * Sets [Builder.eventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

        /**
         * The binary file size, in bytes, auto-populated by the system. The maximum file size for
         * this service is 5,000,000 Bytes (5 MB). Files exceeding the maximum size will be
         * rejected.
         */
        fun fileSize(fileSize: Long) = fileSize(JsonField.of(fileSize))

        /**
         * Sets [Builder.fileSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

        /** Unique identifier of the primary satellite on-orbit object. */
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
         * The center frequency, in MHz, after downconversion to intermediate frequency. If
         * provided, this array should have the same length as centerFreqs.
         */
        fun ifFreq(ifFreq: List<Double>) = ifFreq(JsonField.of(ifFreq))

        /**
         * Sets [Builder.ifFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ifFreq] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ifFreq(ifFreq: JsonField<List<Double>>) = apply {
            this.ifFreq = ifFreq.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.ifFreq].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIfFreq(ifFreq: Double) = apply {
            this.ifFreq =
                (this.ifFreq ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ifFreq", it).add(ifFreq)
                }
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
         * Optional identifier provided by the data source to indicate the target object of this
         * record. This may be an internal identifier and not necessarily map to a valid satellite
         * number.
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
         * After converting the raw data in the file, to generate (frequency-space) spectra some
         * sets require an additional transformation or correction based on details of the hardware
         * that recorded it. This field marks any such transformations. Currently supported options
         * are NONE (no correction) and MIRRORED (frequency axis is flipped around the corresponding
         * value of ifFreq). If null, it is assumed that NONE applies to all frequency bands.
         */
        fun postFourier(postFourier: List<String>) = postFourier(JsonField.of(postFourier))

        /**
         * Sets [Builder.postFourier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postFourier] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun postFourier(postFourier: JsonField<List<String>>) = apply {
            this.postFourier = postFourier.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.postFourier].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPostFourier(postFourier: String) = apply {
            this.postFourier =
                (this.postFourier ?: JsonField.of(mutableListOf())).also {
                    checkKnown("postFourier", it).add(postFourier)
                }
        }

        /**
         * The quaternion describing the rotation of the body-fixed frame used for this system into
         * the local geodetic frame, at the sample start time (startTime). The array element order
         * convention is scalar component first, followed by the three vector components. For a
         * vector u in the body-fixed frame, the corresponding vector u' in the geodetic frame
         * should satisfy u' = quq\*, where q is this quaternion. The quaternion should be
         * normalized to 1.
         */
        fun quat(quat: List<Double>) = quat(JsonField.of(quat))

        /**
         * Sets [Builder.quat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quat] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun quat(quat: JsonField<List<Double>>) = apply {
            this.quat = quat.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.quat].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addQuat(quat: Double) = apply {
            this.quat =
                (this.quat ?: JsonField.of(mutableListOf())).also {
                    checkKnown("quat", it).add(quat)
                }
        }

        /**
         * The number or ID of the GNSS receiver associated with this data. If reporting for
         * multiple receivers a separate record should be generated for each. If null, it is assumed
         * to indicate that only one receiver is present, or reported.
         */
        fun receiver(receiver: String) = receiver(JsonField.of(receiver))

        /**
         * Sets [Builder.receiver] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receiver] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun receiver(receiver: JsonField<String>) = apply { this.receiver = receiver }

        /** The number of samples taken per second. */
        fun sampleRate(sampleRate: List<Int>) = sampleRate(JsonField.of(sampleRate))

        /**
         * Sets [Builder.sampleRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sampleRate] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sampleRate(sampleRate: JsonField<List<Int>>) = apply {
            this.sampleRate = sampleRate.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.sampleRate].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSampleRate(sampleRate: Int) = apply {
            this.sampleRate =
                (this.sampleRate ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sampleRate", it).add(sampleRate)
                }
        }

        /**
         * The sample type associated with the IF data. REAL for data with only an I-component or
         * COMPLEX for data with both I & Q components.
         */
        fun sampleType(sampleType: String) = sampleType(JsonField.of(sampleType))

        /**
         * Sets [Builder.sampleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sampleType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sampleType(sampleType: JsonField<String>) = apply { this.sampleType = sampleType }

        /** Satellite/catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * The sequence number of a raw IF record/file within a set. Sequence number should start
         * at 1. If null, then it is assumed that the order of records within a raw IF set is not
         * relevant.
         */
        fun sequenceId(sequenceId: Int) = sequenceId(JsonField.of(sequenceId))

        /**
         * Sets [Builder.sequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sequenceId(sequenceId: JsonField<Int>) = apply { this.sequenceId = sequenceId }

        /**
         * User-defined ID of a set or sequence of records/files. Used to associate a set of related
         * raw IF records.
         */
        fun setId(setId: String) = setId(JsonField.of(setId))

        /**
         * Sets [Builder.setId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun setId(setId: JsonField<String>) = apply { this.setId = setId }

        /** The number of raw IF records/files in a set. */
        fun setLength(setLength: Int) = setLength(JsonField.of(setLength))

        /**
         * Sets [Builder.setLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.setLength] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun setLength(setLength: JsonField<Int>) = apply { this.setLength = setLength }

        /**
         * Array of UUIDs of the UDL data records associated with this GNSSRawIF record. See the
         * associated 'srcTyps' array for the specific types of data, positionally corresponding to
         * the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
         * corresponding srcTyps array element for the data type of the UUID and use the appropriate
         * API operation to retrieve that object (e.g. /udl/gnssobservationset/{uuid}).
         */
        fun srcIds(srcIds: List<String>) = srcIds(JsonField.of(srcIds))

        /**
         * Sets [Builder.srcIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun srcIds(srcIds: JsonField<List<String>>) = apply {
            this.srcIds = srcIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [srcIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcId(srcId: String) = apply {
            srcIds =
                (srcIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("srcIds", it).add(srcId)
                }
        }

        /**
         * Array of UDL record types (GNSSSET) associated with this GNSSRawIF record. See the
         * associated 'srcIds' array for the record UUIDs, positionally corresponding to the record
         * types in this array. The 'srcTyps' and 'srcIds' arrays must match in size.
         */
        fun srcTyps(srcTyps: List<String>) = srcTyps(JsonField.of(srcTyps))

        /**
         * Sets [Builder.srcTyps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.srcTyps] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun srcTyps(srcTyps: JsonField<List<String>>) = apply {
            this.srcTyps = srcTyps.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [srcTyps].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSrcTyp(srcTyp: String) = apply {
            srcTyps =
                (srcTyps ?: JsonField.of(mutableListOf())).also {
                    checkKnown("srcTyps", it).add(srcTyp)
                }
        }

        /**
         * Spacecraft altitude at start time (startTime), expressed in kilometers above WGS-84
         * ellipsoid.
         */
        fun startAlt(startAlt: Double) = startAlt(JsonField.of(startAlt))

        /**
         * Sets [Builder.startAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startAlt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startAlt(startAlt: JsonField<Double>) = apply { this.startAlt = startAlt }

        /**
         * The index of the sample within the associated binary file that corresponds to the
         * startTime indicated in this record. This is especially useful on high sample-rate sensors
         * when some samples are less than one microsecond before the value of startTime. This index
         * is 0-based. If null, the startIndex is assumed to be 0.
         */
        fun startIndex(startIndex: Int) = startIndex(JsonField.of(startIndex))

        /**
         * Sets [Builder.startIndex] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startIndex] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startIndex(startIndex: JsonField<Int>) = apply { this.startIndex = startIndex }

        /**
         * WGS-84 spacecraft latitude sub-point at start time (startTime), represented as -90 to 90
         * degrees (negative values south of equator).
         */
        fun startLat(startLat: Double) = startLat(JsonField.of(startLat))

        /**
         * Sets [Builder.startLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLat(startLat: JsonField<Double>) = apply { this.startLat = startLat }

        /**
         * WGS-84 spacecraft longitude sub-point at start time (startTime), represented as -180 to
         * 180 degrees (negative values west of Prime Meridian).
         */
        fun startLon(startLon: Double) = startLon(JsonField.of(startLon))

        /**
         * Sets [Builder.startLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun startLon(startLon: JsonField<Double>) = apply { this.startLon = startLon }

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [GnssRawIfListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .centerFreq()
         * .classificationMarking()
         * .dataMode()
         * .endTime()
         * .fileName()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GnssRawIfListResponse =
            GnssRawIfListResponse(
                checkRequired("centerFreq", centerFreq).map { it.toImmutable() },
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("endTime", endTime),
                checkRequired("fileName", fileName),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                bitDepth,
                (boresight ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                createdBy,
                dataRate,
                (diffCodeBias ?: JsonMissing.of()).map { it.toImmutable() },
                endAlt,
                endLat,
                endLon,
                esId,
                eventId,
                fileSize,
                idOnOrbit,
                (ifFreq ?: JsonMissing.of()).map { it.toImmutable() },
                origin,
                origNetwork,
                origObjectId,
                (postFourier ?: JsonMissing.of()).map { it.toImmutable() },
                (quat ?: JsonMissing.of()).map { it.toImmutable() },
                receiver,
                (sampleRate ?: JsonMissing.of()).map { it.toImmutable() },
                sampleType,
                satNo,
                sequenceId,
                setId,
                setLength,
                (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                startAlt,
                startIndex,
                startLat,
                startLon,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GnssRawIfListResponse = apply {
        if (validated) {
            return@apply
        }

        centerFreq()
        classificationMarking()
        dataMode().validate()
        endTime()
        fileName()
        source()
        startTime()
        id()
        bitDepth()
        boresight()
        createdAt()
        createdBy()
        dataRate()
        diffCodeBias()
        endAlt()
        endLat()
        endLon()
        esId()
        eventId()
        fileSize()
        idOnOrbit()
        ifFreq()
        origin()
        origNetwork()
        origObjectId()
        postFourier()
        quat()
        receiver()
        sampleRate()
        sampleType()
        satNo()
        sequenceId()
        setId()
        setLength()
        srcIds()
        srcTyps()
        startAlt()
        startIndex()
        startLat()
        startLon()
        tags()
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
        (centerFreq.asKnown().getOrNull()?.size ?: 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTime.asKnown().isPresent) 1 else 0) +
            (if (fileName.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (bitDepth.asKnown().isPresent) 1 else 0) +
            (boresight.asKnown().getOrNull()?.size ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dataRate.asKnown().isPresent) 1 else 0) +
            (diffCodeBias.asKnown().getOrNull()?.size ?: 0) +
            (if (endAlt.asKnown().isPresent) 1 else 0) +
            (if (endLat.asKnown().isPresent) 1 else 0) +
            (if (endLon.asKnown().isPresent) 1 else 0) +
            (if (esId.asKnown().isPresent) 1 else 0) +
            (if (eventId.asKnown().isPresent) 1 else 0) +
            (if (fileSize.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (ifFreq.asKnown().getOrNull()?.size ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (postFourier.asKnown().getOrNull()?.size ?: 0) +
            (quat.asKnown().getOrNull()?.size ?: 0) +
            (if (receiver.asKnown().isPresent) 1 else 0) +
            (sampleRate.asKnown().getOrNull()?.size ?: 0) +
            (if (sampleType.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (sequenceId.asKnown().isPresent) 1 else 0) +
            (if (setId.asKnown().isPresent) 1 else 0) +
            (if (setLength.asKnown().isPresent) 1 else 0) +
            (srcIds.asKnown().getOrNull()?.size ?: 0) +
            (srcTyps.asKnown().getOrNull()?.size ?: 0) +
            (if (startAlt.asKnown().isPresent) 1 else 0) +
            (if (startIndex.asKnown().isPresent) 1 else 0) +
            (if (startLat.asKnown().isPresent) 1 else 0) +
            (if (startLon.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

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

        return other is GnssRawIfListResponse &&
            centerFreq == other.centerFreq &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            endTime == other.endTime &&
            fileName == other.fileName &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            bitDepth == other.bitDepth &&
            boresight == other.boresight &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dataRate == other.dataRate &&
            diffCodeBias == other.diffCodeBias &&
            endAlt == other.endAlt &&
            endLat == other.endLat &&
            endLon == other.endLon &&
            esId == other.esId &&
            eventId == other.eventId &&
            fileSize == other.fileSize &&
            idOnOrbit == other.idOnOrbit &&
            ifFreq == other.ifFreq &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            postFourier == other.postFourier &&
            quat == other.quat &&
            receiver == other.receiver &&
            sampleRate == other.sampleRate &&
            sampleType == other.sampleType &&
            satNo == other.satNo &&
            sequenceId == other.sequenceId &&
            setId == other.setId &&
            setLength == other.setLength &&
            srcIds == other.srcIds &&
            srcTyps == other.srcTyps &&
            startAlt == other.startAlt &&
            startIndex == other.startIndex &&
            startLat == other.startLat &&
            startLon == other.startLon &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            centerFreq,
            classificationMarking,
            dataMode,
            endTime,
            fileName,
            source,
            startTime,
            id,
            bitDepth,
            boresight,
            createdAt,
            createdBy,
            dataRate,
            diffCodeBias,
            endAlt,
            endLat,
            endLon,
            esId,
            eventId,
            fileSize,
            idOnOrbit,
            ifFreq,
            origin,
            origNetwork,
            origObjectId,
            postFourier,
            quat,
            receiver,
            sampleRate,
            sampleType,
            satNo,
            sequenceId,
            setId,
            setLength,
            srcIds,
            srcTyps,
            startAlt,
            startIndex,
            startLat,
            startLon,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GnssRawIfListResponse{centerFreq=$centerFreq, classificationMarking=$classificationMarking, dataMode=$dataMode, endTime=$endTime, fileName=$fileName, source=$source, startTime=$startTime, id=$id, bitDepth=$bitDepth, boresight=$boresight, createdAt=$createdAt, createdBy=$createdBy, dataRate=$dataRate, diffCodeBias=$diffCodeBias, endAlt=$endAlt, endLat=$endLat, endLon=$endLon, esId=$esId, eventId=$eventId, fileSize=$fileSize, idOnOrbit=$idOnOrbit, ifFreq=$ifFreq, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, postFourier=$postFourier, quat=$quat, receiver=$receiver, sampleRate=$sampleRate, sampleType=$sampleType, satNo=$satNo, sequenceId=$sequenceId, setId=$setId, setLength=$setLength, srcIds=$srcIds, srcTyps=$srcTyps, startAlt=$startAlt, startIndex=$startIndex, startLat=$startLat, startLon=$startLon, tags=$tags, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.skyimagery.history

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
import com.unifieddatalibrary.api.models.EoObservationFull
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Model representation of sky imagery data. Sky imagery is ground or space based telescope imagery
 * of RSO's and includes metadata on the image (time, source, etc) as well as binary image content
 * (e.g. FITS, EOSSA, EOCHIP, MP4). Binary content must be downloaded individually by ID using the
 * 'getFile' operation.
 */
class HistoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val expStartTime: JsonField<OffsetDateTime>,
    private val imageType: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val annotationKey: JsonField<String>,
    private val calibrationKey: JsonField<String>,
    private val checksumValue: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val description: JsonField<String>,
    private val eoObservations: JsonField<List<EoObservationFull>>,
    private val expEndTime: JsonField<OffsetDateTime>,
    private val filename: JsonField<String>,
    private val filesize: JsonField<Long>,
    private val frameFovHeight: JsonField<Double>,
    private val frameFovWidth: JsonField<Double>,
    private val frameHeightPixels: JsonField<Int>,
    private val frameWidthPixels: JsonField<Int>,
    private val idAttitudeSet: JsonField<String>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val idSoiSet: JsonField<String>,
    private val imageSetId: JsonField<String>,
    private val imageSetLength: JsonField<Int>,
    private val imageSourceInfo: JsonField<String>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val pixelBitDepth: JsonField<Int>,
    private val pixelFovHeight: JsonField<Double>,
    private val pixelFovWidth: JsonField<Double>,
    private val satNo: JsonField<Int>,
    private val senalt: JsonField<Double>,
    private val senlat: JsonField<Double>,
    private val senlon: JsonField<Double>,
    private val senQuat: JsonField<List<Double>>,
    private val senQuatDot: JsonField<List<Double>>,
    private val senx: JsonField<Double>,
    private val seny: JsonField<Double>,
    private val senz: JsonField<Double>,
    private val sequenceId: JsonField<Int>,
    private val sourceDl: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val topLeftStartAz: JsonField<Double>,
    private val topLeftStartEl: JsonField<Double>,
    private val topLeftStopAz: JsonField<Double>,
    private val topLeftStopEl: JsonField<Double>,
    private val transactionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("expStartTime")
        @ExcludeMissing
        expStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("imageType") @ExcludeMissing imageType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("annotationKey")
        @ExcludeMissing
        annotationKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("calibrationKey")
        @ExcludeMissing
        calibrationKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("checksumValue")
        @ExcludeMissing
        checksumValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eoObservations")
        @ExcludeMissing
        eoObservations: JsonField<List<EoObservationFull>> = JsonMissing.of(),
        @JsonProperty("expEndTime")
        @ExcludeMissing
        expEndTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filename") @ExcludeMissing filename: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filesize") @ExcludeMissing filesize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("frameFOVHeight")
        @ExcludeMissing
        frameFovHeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frameFOVWidth")
        @ExcludeMissing
        frameFovWidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("frameHeightPixels")
        @ExcludeMissing
        frameHeightPixels: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("frameWidthPixels")
        @ExcludeMissing
        frameWidthPixels: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("idAttitudeSet")
        @ExcludeMissing
        idAttitudeSet: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSOISet") @ExcludeMissing idSoiSet: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imageSetId")
        @ExcludeMissing
        imageSetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imageSetLength")
        @ExcludeMissing
        imageSetLength: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("imageSourceInfo")
        @ExcludeMissing
        imageSourceInfo: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("pixelBitDepth")
        @ExcludeMissing
        pixelBitDepth: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pixelFOVHeight")
        @ExcludeMissing
        pixelFovHeight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pixelFOVWidth")
        @ExcludeMissing
        pixelFovWidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senalt") @ExcludeMissing senalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlat") @ExcludeMissing senlat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlon") @ExcludeMissing senlon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senQuat")
        @ExcludeMissing
        senQuat: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("senQuatDot")
        @ExcludeMissing
        senQuatDot: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("senx") @ExcludeMissing senx: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("seny") @ExcludeMissing seny: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senz") @ExcludeMissing senz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sequenceId") @ExcludeMissing sequenceId: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("topLeftStartAz")
        @ExcludeMissing
        topLeftStartAz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("topLeftStartEl")
        @ExcludeMissing
        topLeftStartEl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("topLeftStopAz")
        @ExcludeMissing
        topLeftStopAz: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("topLeftStopEl")
        @ExcludeMissing
        topLeftStopEl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        expStartTime,
        imageType,
        source,
        id,
        annotationKey,
        calibrationKey,
        checksumValue,
        createdAt,
        createdBy,
        description,
        eoObservations,
        expEndTime,
        filename,
        filesize,
        frameFovHeight,
        frameFovWidth,
        frameHeightPixels,
        frameWidthPixels,
        idAttitudeSet,
        idOnOrbit,
        idSensor,
        idSoiSet,
        imageSetId,
        imageSetLength,
        imageSourceInfo,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        pixelBitDepth,
        pixelFovHeight,
        pixelFovWidth,
        satNo,
        senalt,
        senlat,
        senlon,
        senQuat,
        senQuatDot,
        senx,
        seny,
        senz,
        sequenceId,
        sourceDl,
        tags,
        topLeftStartAz,
        topLeftStartEl,
        topLeftStopAz,
        topLeftStopEl,
        transactionId,
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
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Start time of the exposure, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expStartTime(): OffsetDateTime = expStartTime.getRequired("expStartTime")

    /**
     * The type of image associated with this record (e.g. FITS, EOSSA, EOCHIP, MP4).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun imageType(): String = imageType.getRequired("imageType")

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
     * Reference to an annotation document associated with this image.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun annotationKey(): Optional<String> = annotationKey.getOptional("annotationKey")

    /**
     * Reference to a calibration document associated with this image.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun calibrationKey(): Optional<String> = calibrationKey.getOptional("calibrationKey")

    /**
     * MD5 value of the file. The ingest/create operation will automatically generate the value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun checksumValue(): Optional<String> = checksumValue.getOptional("checksumValue")

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
     * Optional name/description associated with this image.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * Collection of linked EOObservations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eoObservations(): Optional<List<EoObservationFull>> =
        eoObservations.getOptional("eoObservations")

    /**
     * End time of the exposure, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun expEndTime(): Optional<OffsetDateTime> = expEndTime.getOptional("expEndTime")

    /**
     * Name of the uploaded image file.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filename(): Optional<String> = filename.getOptional("filename")

    /**
     * Size of the image file, in bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun filesize(): Optional<Long> = filesize.getOptional("filesize")

    /**
     * Field Of View frame height, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frameFovHeight(): Optional<Double> = frameFovHeight.getOptional("frameFOVHeight")

    /**
     * Field Of View frame width, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frameFovWidth(): Optional<Double> = frameFovWidth.getOptional("frameFOVWidth")

    /**
     * Frame height of the image, in number of pixels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frameHeightPixels(): Optional<Int> = frameHeightPixels.getOptional("frameHeightPixels")

    /**
     * Frame width of the image, in number of pixels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun frameWidthPixels(): Optional<Int> = frameWidthPixels.getOptional("frameWidthPixels")

    /**
     * Optional identifier of the AttitudeSet data record describing the orientation of an object
     * body.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idAttitudeSet(): Optional<String> = idAttitudeSet.getOptional("idAttitudeSet")

    /**
     * Optional identifier of the target on-orbit object, if correlated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the reporting sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Optional unique identifier of the SOI Observation Set associated with this image.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSoiSet(): Optional<String> = idSoiSet.getOptional("idSOISet")

    /**
     * The user-defined set ID of a sequence of images.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imageSetId(): Optional<String> = imageSetId.getOptional("imageSetId")

    /**
     * The number of images in an image set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imageSetLength(): Optional<Int> = imageSetLength.getOptional("imageSetLength")

    /**
     * String that uniquely identifies the data source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imageSourceInfo(): Optional<String> = imageSourceInfo.getOptional("imageSourceInfo")

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
     * Optional identifier provided by the imaging source to indicate the target onorbit object of
     * this image. This may be an internal identifier and not necessarily a valid satellite number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by the imaging source to indicate the sensor identifier which
     * produced this image. This may be an internal identifier and not necessarily a valid sensor
     * ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Bit depth of the image, in number of pixels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelBitDepth(): Optional<Int> = pixelBitDepth.getOptional("pixelBitDepth")

    /**
     * Field Of View pixel height, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelFovHeight(): Optional<Double> = pixelFovHeight.getOptional("pixelFOVHeight")

    /**
     * Field Of View pixel width, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pixelFovWidth(): Optional<Double> = pixelFovWidth.getOptional("pixelFOVWidth")

    /**
     * Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * Sensor altitude at exposure start epoch, in km. If null, can be obtained from sensor info.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senalt(): Optional<Double> = senalt.getOptional("senalt")

    /**
     * Sensor latitude at exposure start epoch, in degrees. If null, can be obtained from sensor
     * info. -90 to 90 degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlat(): Optional<Double> = senlat.getOptional("senlat")

    /**
     * Sensor longitude at exposure start epoch, in degrees. If null, can be obtained from sensor
     * info. -180 to 180 degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlon(): Optional<Double> = senlon.getOptional("senlon")

    /**
     * The quaternion describing the rotation of the body-fixed frame used for this system into the
     * local geodetic frame, at exposure start epoch (expStartTime). The array element order
     * convention is scalar component first, followed by the three vector components. For a vector u
     * in the body-fixed frame, the corresponding vector u' in the geodetic frame should satisfy u'
     * = quq*, where q is this quaternion.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senQuat(): Optional<List<Double>> = senQuat.getOptional("senQuat")

    /**
     * The derivative of the quaternion describing the rotation of the body-fixed frame used for
     * this system into the local geodetic frame, exposure start epoch (expStartTime). The array
     * element order convention is scalar component first, followed by the three vector components.
     * For a vector u in the body-fixed frame, the corresponding vector u' in the geodetic frame
     * should satisfy u' = quq*, where q is this quaternion.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senQuatDot(): Optional<List<Double>> = senQuatDot.getOptional("senQuatDot")

    /**
     * Sensor x position at exposure start epoch, in km (if mobile/onorbit) in J2000 coordinate
     * frame.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senx(): Optional<Double> = senx.getOptional("senx")

    /**
     * Sensor y position at exposure start epoch, in km (if mobile/onorbit) in J2000 coordinate
     * frame.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun seny(): Optional<Double> = seny.getOptional("seny")

    /**
     * Sensor z position at exposure start epoch, in km (if mobile/onorbit) in J2000 coordinate
     * frame.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senz(): Optional<Double> = senz.getOptional("senz")

    /**
     * The sequence ID of an image within an image set.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sequenceId(): Optional<Int> = sequenceId.getOptional("sequenceId")

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
     * The telescope pointing azimuth, in degrees, at the exposure start epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topLeftStartAz(): Optional<Double> = topLeftStartAz.getOptional("topLeftStartAz")

    /**
     * The telescope pointing elevation, in degrees, at the exposure start epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topLeftStartEl(): Optional<Double> = topLeftStartEl.getOptional("topLeftStartEl")

    /**
     * The telescope pointing azimuth, in degrees, at the exposure stop epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topLeftStopAz(): Optional<Double> = topLeftStopAz.getOptional("topLeftStopAz")

    /**
     * The telescope pointing elevation, in degrees, at the exposure stop epoch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun topLeftStopEl(): Optional<Double> = topLeftStopEl.getOptional("topLeftStopEl")

    /**
     * Optional identifier to track a commercial or marketplace transaction executed to produce this
     * data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

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
     * Returns the raw JSON value of [expStartTime].
     *
     * Unlike [expStartTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expStartTime")
    @ExcludeMissing
    fun _expStartTime(): JsonField<OffsetDateTime> = expStartTime

    /**
     * Returns the raw JSON value of [imageType].
     *
     * Unlike [imageType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageType") @ExcludeMissing fun _imageType(): JsonField<String> = imageType

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
     * Returns the raw JSON value of [annotationKey].
     *
     * Unlike [annotationKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("annotationKey")
    @ExcludeMissing
    fun _annotationKey(): JsonField<String> = annotationKey

    /**
     * Returns the raw JSON value of [calibrationKey].
     *
     * Unlike [calibrationKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("calibrationKey")
    @ExcludeMissing
    fun _calibrationKey(): JsonField<String> = calibrationKey

    /**
     * Returns the raw JSON value of [checksumValue].
     *
     * Unlike [checksumValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checksumValue")
    @ExcludeMissing
    fun _checksumValue(): JsonField<String> = checksumValue

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
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [eoObservations].
     *
     * Unlike [eoObservations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eoObservations")
    @ExcludeMissing
    fun _eoObservations(): JsonField<List<EoObservationFull>> = eoObservations

    /**
     * Returns the raw JSON value of [expEndTime].
     *
     * Unlike [expEndTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expEndTime")
    @ExcludeMissing
    fun _expEndTime(): JsonField<OffsetDateTime> = expEndTime

    /**
     * Returns the raw JSON value of [filename].
     *
     * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

    /**
     * Returns the raw JSON value of [filesize].
     *
     * Unlike [filesize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filesize") @ExcludeMissing fun _filesize(): JsonField<Long> = filesize

    /**
     * Returns the raw JSON value of [frameFovHeight].
     *
     * Unlike [frameFovHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frameFOVHeight")
    @ExcludeMissing
    fun _frameFovHeight(): JsonField<Double> = frameFovHeight

    /**
     * Returns the raw JSON value of [frameFovWidth].
     *
     * Unlike [frameFovWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("frameFOVWidth")
    @ExcludeMissing
    fun _frameFovWidth(): JsonField<Double> = frameFovWidth

    /**
     * Returns the raw JSON value of [frameHeightPixels].
     *
     * Unlike [frameHeightPixels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frameHeightPixels")
    @ExcludeMissing
    fun _frameHeightPixels(): JsonField<Int> = frameHeightPixels

    /**
     * Returns the raw JSON value of [frameWidthPixels].
     *
     * Unlike [frameWidthPixels], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("frameWidthPixels")
    @ExcludeMissing
    fun _frameWidthPixels(): JsonField<Int> = frameWidthPixels

    /**
     * Returns the raw JSON value of [idAttitudeSet].
     *
     * Unlike [idAttitudeSet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAttitudeSet")
    @ExcludeMissing
    fun _idAttitudeSet(): JsonField<String> = idAttitudeSet

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
     * Returns the raw JSON value of [idSoiSet].
     *
     * Unlike [idSoiSet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSOISet") @ExcludeMissing fun _idSoiSet(): JsonField<String> = idSoiSet

    /**
     * Returns the raw JSON value of [imageSetId].
     *
     * Unlike [imageSetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageSetId") @ExcludeMissing fun _imageSetId(): JsonField<String> = imageSetId

    /**
     * Returns the raw JSON value of [imageSetLength].
     *
     * Unlike [imageSetLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageSetLength")
    @ExcludeMissing
    fun _imageSetLength(): JsonField<Int> = imageSetLength

    /**
     * Returns the raw JSON value of [imageSourceInfo].
     *
     * Unlike [imageSourceInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imageSourceInfo")
    @ExcludeMissing
    fun _imageSourceInfo(): JsonField<String> = imageSourceInfo

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
     * Returns the raw JSON value of [pixelBitDepth].
     *
     * Unlike [pixelBitDepth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixelBitDepth")
    @ExcludeMissing
    fun _pixelBitDepth(): JsonField<Int> = pixelBitDepth

    /**
     * Returns the raw JSON value of [pixelFovHeight].
     *
     * Unlike [pixelFovHeight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixelFOVHeight")
    @ExcludeMissing
    fun _pixelFovHeight(): JsonField<Double> = pixelFovHeight

    /**
     * Returns the raw JSON value of [pixelFovWidth].
     *
     * Unlike [pixelFovWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pixelFOVWidth")
    @ExcludeMissing
    fun _pixelFovWidth(): JsonField<Double> = pixelFovWidth

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [senalt].
     *
     * Unlike [senalt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senalt") @ExcludeMissing fun _senalt(): JsonField<Double> = senalt

    /**
     * Returns the raw JSON value of [senlat].
     *
     * Unlike [senlat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlat") @ExcludeMissing fun _senlat(): JsonField<Double> = senlat

    /**
     * Returns the raw JSON value of [senlon].
     *
     * Unlike [senlon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlon") @ExcludeMissing fun _senlon(): JsonField<Double> = senlon

    /**
     * Returns the raw JSON value of [senQuat].
     *
     * Unlike [senQuat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senQuat") @ExcludeMissing fun _senQuat(): JsonField<List<Double>> = senQuat

    /**
     * Returns the raw JSON value of [senQuatDot].
     *
     * Unlike [senQuatDot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senQuatDot")
    @ExcludeMissing
    fun _senQuatDot(): JsonField<List<Double>> = senQuatDot

    /**
     * Returns the raw JSON value of [senx].
     *
     * Unlike [senx], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senx") @ExcludeMissing fun _senx(): JsonField<Double> = senx

    /**
     * Returns the raw JSON value of [seny].
     *
     * Unlike [seny], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("seny") @ExcludeMissing fun _seny(): JsonField<Double> = seny

    /**
     * Returns the raw JSON value of [senz].
     *
     * Unlike [senz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senz") @ExcludeMissing fun _senz(): JsonField<Double> = senz

    /**
     * Returns the raw JSON value of [sequenceId].
     *
     * Unlike [sequenceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sequenceId") @ExcludeMissing fun _sequenceId(): JsonField<Int> = sequenceId

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [topLeftStartAz].
     *
     * Unlike [topLeftStartAz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topLeftStartAz")
    @ExcludeMissing
    fun _topLeftStartAz(): JsonField<Double> = topLeftStartAz

    /**
     * Returns the raw JSON value of [topLeftStartEl].
     *
     * Unlike [topLeftStartEl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topLeftStartEl")
    @ExcludeMissing
    fun _topLeftStartEl(): JsonField<Double> = topLeftStartEl

    /**
     * Returns the raw JSON value of [topLeftStopAz].
     *
     * Unlike [topLeftStopAz], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topLeftStopAz")
    @ExcludeMissing
    fun _topLeftStopAz(): JsonField<Double> = topLeftStopAz

    /**
     * Returns the raw JSON value of [topLeftStopEl].
     *
     * Unlike [topLeftStopEl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("topLeftStopEl")
    @ExcludeMissing
    fun _topLeftStopEl(): JsonField<Double> = topLeftStopEl

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

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
         * Returns a mutable builder for constructing an instance of [HistoryListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .expStartTime()
         * .imageType()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var expStartTime: JsonField<OffsetDateTime>? = null
        private var imageType: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var annotationKey: JsonField<String> = JsonMissing.of()
        private var calibrationKey: JsonField<String> = JsonMissing.of()
        private var checksumValue: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var eoObservations: JsonField<MutableList<EoObservationFull>>? = null
        private var expEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var filename: JsonField<String> = JsonMissing.of()
        private var filesize: JsonField<Long> = JsonMissing.of()
        private var frameFovHeight: JsonField<Double> = JsonMissing.of()
        private var frameFovWidth: JsonField<Double> = JsonMissing.of()
        private var frameHeightPixels: JsonField<Int> = JsonMissing.of()
        private var frameWidthPixels: JsonField<Int> = JsonMissing.of()
        private var idAttitudeSet: JsonField<String> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var idSoiSet: JsonField<String> = JsonMissing.of()
        private var imageSetId: JsonField<String> = JsonMissing.of()
        private var imageSetLength: JsonField<Int> = JsonMissing.of()
        private var imageSourceInfo: JsonField<String> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var pixelBitDepth: JsonField<Int> = JsonMissing.of()
        private var pixelFovHeight: JsonField<Double> = JsonMissing.of()
        private var pixelFovWidth: JsonField<Double> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senalt: JsonField<Double> = JsonMissing.of()
        private var senlat: JsonField<Double> = JsonMissing.of()
        private var senlon: JsonField<Double> = JsonMissing.of()
        private var senQuat: JsonField<MutableList<Double>>? = null
        private var senQuatDot: JsonField<MutableList<Double>>? = null
        private var senx: JsonField<Double> = JsonMissing.of()
        private var seny: JsonField<Double> = JsonMissing.of()
        private var senz: JsonField<Double> = JsonMissing.of()
        private var sequenceId: JsonField<Int> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var topLeftStartAz: JsonField<Double> = JsonMissing.of()
        private var topLeftStartEl: JsonField<Double> = JsonMissing.of()
        private var topLeftStopAz: JsonField<Double> = JsonMissing.of()
        private var topLeftStopEl: JsonField<Double> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyListResponse: HistoryListResponse) = apply {
            classificationMarking = historyListResponse.classificationMarking
            dataMode = historyListResponse.dataMode
            expStartTime = historyListResponse.expStartTime
            imageType = historyListResponse.imageType
            source = historyListResponse.source
            id = historyListResponse.id
            annotationKey = historyListResponse.annotationKey
            calibrationKey = historyListResponse.calibrationKey
            checksumValue = historyListResponse.checksumValue
            createdAt = historyListResponse.createdAt
            createdBy = historyListResponse.createdBy
            description = historyListResponse.description
            eoObservations = historyListResponse.eoObservations.map { it.toMutableList() }
            expEndTime = historyListResponse.expEndTime
            filename = historyListResponse.filename
            filesize = historyListResponse.filesize
            frameFovHeight = historyListResponse.frameFovHeight
            frameFovWidth = historyListResponse.frameFovWidth
            frameHeightPixels = historyListResponse.frameHeightPixels
            frameWidthPixels = historyListResponse.frameWidthPixels
            idAttitudeSet = historyListResponse.idAttitudeSet
            idOnOrbit = historyListResponse.idOnOrbit
            idSensor = historyListResponse.idSensor
            idSoiSet = historyListResponse.idSoiSet
            imageSetId = historyListResponse.imageSetId
            imageSetLength = historyListResponse.imageSetLength
            imageSourceInfo = historyListResponse.imageSourceInfo
            onOrbit = historyListResponse.onOrbit
            origin = historyListResponse.origin
            origNetwork = historyListResponse.origNetwork
            origObjectId = historyListResponse.origObjectId
            origSensorId = historyListResponse.origSensorId
            pixelBitDepth = historyListResponse.pixelBitDepth
            pixelFovHeight = historyListResponse.pixelFovHeight
            pixelFovWidth = historyListResponse.pixelFovWidth
            satNo = historyListResponse.satNo
            senalt = historyListResponse.senalt
            senlat = historyListResponse.senlat
            senlon = historyListResponse.senlon
            senQuat = historyListResponse.senQuat.map { it.toMutableList() }
            senQuatDot = historyListResponse.senQuatDot.map { it.toMutableList() }
            senx = historyListResponse.senx
            seny = historyListResponse.seny
            senz = historyListResponse.senz
            sequenceId = historyListResponse.sequenceId
            sourceDl = historyListResponse.sourceDl
            tags = historyListResponse.tags.map { it.toMutableList() }
            topLeftStartAz = historyListResponse.topLeftStartAz
            topLeftStartEl = historyListResponse.topLeftStartEl
            topLeftStopAz = historyListResponse.topLeftStopAz
            topLeftStopEl = historyListResponse.topLeftStopEl
            transactionId = historyListResponse.transactionId
            additionalProperties = historyListResponse.additionalProperties.toMutableMap()
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
         * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
         * analysis.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
         * requirements, and for validating technical, functional, and performance characteristics.
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
         * both real and simulated data.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        /** Start time of the exposure, in ISO 8601 UTC format with microsecond precision. */
        fun expStartTime(expStartTime: OffsetDateTime) = expStartTime(JsonField.of(expStartTime))

        /**
         * Sets [Builder.expStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expStartTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expStartTime(expStartTime: JsonField<OffsetDateTime>) = apply {
            this.expStartTime = expStartTime
        }

        /** The type of image associated with this record (e.g. FITS, EOSSA, EOCHIP, MP4). */
        fun imageType(imageType: String) = imageType(JsonField.of(imageType))

        /**
         * Sets [Builder.imageType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imageType(imageType: JsonField<String>) = apply { this.imageType = imageType }

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

        /** Reference to an annotation document associated with this image. */
        fun annotationKey(annotationKey: String) = annotationKey(JsonField.of(annotationKey))

        /**
         * Sets [Builder.annotationKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.annotationKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun annotationKey(annotationKey: JsonField<String>) = apply {
            this.annotationKey = annotationKey
        }

        /** Reference to a calibration document associated with this image. */
        fun calibrationKey(calibrationKey: String) = calibrationKey(JsonField.of(calibrationKey))

        /**
         * Sets [Builder.calibrationKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.calibrationKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun calibrationKey(calibrationKey: JsonField<String>) = apply {
            this.calibrationKey = calibrationKey
        }

        /**
         * MD5 value of the file. The ingest/create operation will automatically generate the value.
         */
        fun checksumValue(checksumValue: String) = checksumValue(JsonField.of(checksumValue))

        /**
         * Sets [Builder.checksumValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checksumValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checksumValue(checksumValue: JsonField<String>) = apply {
            this.checksumValue = checksumValue
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

        /** Optional name/description associated with this image. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** Collection of linked EOObservations. */
        fun eoObservations(eoObservations: List<EoObservationFull>) =
            eoObservations(JsonField.of(eoObservations))

        /**
         * Sets [Builder.eoObservations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eoObservations] with a well-typed
         * `List<EoObservationFull>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun eoObservations(eoObservations: JsonField<List<EoObservationFull>>) = apply {
            this.eoObservations = eoObservations.map { it.toMutableList() }
        }

        /**
         * Adds a single [EoObservationFull] to [eoObservations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEoObservation(eoObservation: EoObservationFull) = apply {
            eoObservations =
                (eoObservations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("eoObservations", it).add(eoObservation)
                }
        }

        /** End time of the exposure, in ISO 8601 UTC format with microsecond precision. */
        fun expEndTime(expEndTime: OffsetDateTime) = expEndTime(JsonField.of(expEndTime))

        /**
         * Sets [Builder.expEndTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expEndTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expEndTime(expEndTime: JsonField<OffsetDateTime>) = apply {
            this.expEndTime = expEndTime
        }

        /** Name of the uploaded image file. */
        fun filename(filename: String) = filename(JsonField.of(filename))

        /**
         * Sets [Builder.filename] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filename] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filename(filename: JsonField<String>) = apply { this.filename = filename }

        /** Size of the image file, in bytes. */
        fun filesize(filesize: Long) = filesize(JsonField.of(filesize))

        /**
         * Sets [Builder.filesize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filesize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filesize(filesize: JsonField<Long>) = apply { this.filesize = filesize }

        /** Field Of View frame height, in degrees. */
        fun frameFovHeight(frameFovHeight: Double) = frameFovHeight(JsonField.of(frameFovHeight))

        /**
         * Sets [Builder.frameFovHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameFovHeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frameFovHeight(frameFovHeight: JsonField<Double>) = apply {
            this.frameFovHeight = frameFovHeight
        }

        /** Field Of View frame width, in degrees. */
        fun frameFovWidth(frameFovWidth: Double) = frameFovWidth(JsonField.of(frameFovWidth))

        /**
         * Sets [Builder.frameFovWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameFovWidth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frameFovWidth(frameFovWidth: JsonField<Double>) = apply {
            this.frameFovWidth = frameFovWidth
        }

        /** Frame height of the image, in number of pixels. */
        fun frameHeightPixels(frameHeightPixels: Int) =
            frameHeightPixels(JsonField.of(frameHeightPixels))

        /**
         * Sets [Builder.frameHeightPixels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameHeightPixels] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun frameHeightPixels(frameHeightPixels: JsonField<Int>) = apply {
            this.frameHeightPixels = frameHeightPixels
        }

        /** Frame width of the image, in number of pixels. */
        fun frameWidthPixels(frameWidthPixels: Int) =
            frameWidthPixels(JsonField.of(frameWidthPixels))

        /**
         * Sets [Builder.frameWidthPixels] to an arbitrary JSON value.
         *
         * You should usually call [Builder.frameWidthPixels] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun frameWidthPixels(frameWidthPixels: JsonField<Int>) = apply {
            this.frameWidthPixels = frameWidthPixels
        }

        /**
         * Optional identifier of the AttitudeSet data record describing the orientation of an
         * object body.
         */
        fun idAttitudeSet(idAttitudeSet: String) = idAttitudeSet(JsonField.of(idAttitudeSet))

        /**
         * Sets [Builder.idAttitudeSet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAttitudeSet] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idAttitudeSet(idAttitudeSet: JsonField<String>) = apply {
            this.idAttitudeSet = idAttitudeSet
        }

        /** Optional identifier of the target on-orbit object, if correlated. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Unique identifier of the reporting sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** Optional unique identifier of the SOI Observation Set associated with this image. */
        fun idSoiSet(idSoiSet: String) = idSoiSet(JsonField.of(idSoiSet))

        /**
         * Sets [Builder.idSoiSet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSoiSet] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSoiSet(idSoiSet: JsonField<String>) = apply { this.idSoiSet = idSoiSet }

        /** The user-defined set ID of a sequence of images. */
        fun imageSetId(imageSetId: String) = imageSetId(JsonField.of(imageSetId))

        /**
         * Sets [Builder.imageSetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageSetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imageSetId(imageSetId: JsonField<String>) = apply { this.imageSetId = imageSetId }

        /** The number of images in an image set. */
        fun imageSetLength(imageSetLength: Int) = imageSetLength(JsonField.of(imageSetLength))

        /**
         * Sets [Builder.imageSetLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageSetLength] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun imageSetLength(imageSetLength: JsonField<Int>) = apply {
            this.imageSetLength = imageSetLength
        }

        /** String that uniquely identifies the data source. */
        fun imageSourceInfo(imageSourceInfo: String) =
            imageSourceInfo(JsonField.of(imageSourceInfo))

        /**
         * Sets [Builder.imageSourceInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageSourceInfo] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun imageSourceInfo(imageSourceInfo: JsonField<String>) = apply {
            this.imageSourceInfo = imageSourceInfo
        }

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
         * Optional identifier provided by the imaging source to indicate the target onorbit object
         * of this image. This may be an internal identifier and not necessarily a valid satellite
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
         * Optional identifier provided by the imaging source to indicate the sensor identifier
         * which produced this image. This may be an internal identifier and not necessarily a valid
         * sensor ID.
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

        /** Bit depth of the image, in number of pixels. */
        fun pixelBitDepth(pixelBitDepth: Int) = pixelBitDepth(JsonField.of(pixelBitDepth))

        /**
         * Sets [Builder.pixelBitDepth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelBitDepth] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pixelBitDepth(pixelBitDepth: JsonField<Int>) = apply {
            this.pixelBitDepth = pixelBitDepth
        }

        /** Field Of View pixel height, in degrees. */
        fun pixelFovHeight(pixelFovHeight: Double) = pixelFovHeight(JsonField.of(pixelFovHeight))

        /**
         * Sets [Builder.pixelFovHeight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelFovHeight] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pixelFovHeight(pixelFovHeight: JsonField<Double>) = apply {
            this.pixelFovHeight = pixelFovHeight
        }

        /** Field Of View pixel width, in degrees. */
        fun pixelFovWidth(pixelFovWidth: Double) = pixelFovWidth(JsonField.of(pixelFovWidth))

        /**
         * Sets [Builder.pixelFovWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pixelFovWidth] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pixelFovWidth(pixelFovWidth: JsonField<Double>) = apply {
            this.pixelFovWidth = pixelFovWidth
        }

        /** Catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /**
         * Sensor altitude at exposure start epoch, in km. If null, can be obtained from sensor
         * info.
         */
        fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

        /**
         * Sets [Builder.senalt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senalt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senalt(senalt: JsonField<Double>) = apply { this.senalt = senalt }

        /**
         * Sensor latitude at exposure start epoch, in degrees. If null, can be obtained from sensor
         * info. -90 to 90 degrees (negative values south of equator).
         */
        fun senlat(senlat: Double) = senlat(JsonField.of(senlat))

        /**
         * Sets [Builder.senlat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senlat(senlat: JsonField<Double>) = apply { this.senlat = senlat }

        /**
         * Sensor longitude at exposure start epoch, in degrees. If null, can be obtained from
         * sensor info. -180 to 180 degrees (negative values west of Prime Meridian).
         */
        fun senlon(senlon: Double) = senlon(JsonField.of(senlon))

        /**
         * Sets [Builder.senlon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senlon(senlon: JsonField<Double>) = apply { this.senlon = senlon }

        /**
         * The quaternion describing the rotation of the body-fixed frame used for this system into
         * the local geodetic frame, at exposure start epoch (expStartTime). The array element order
         * convention is scalar component first, followed by the three vector components. For a
         * vector u in the body-fixed frame, the corresponding vector u' in the geodetic frame
         * should satisfy u' = quq*, where q is this quaternion.
         */
        fun senQuat(senQuat: List<Double>) = senQuat(JsonField.of(senQuat))

        /**
         * Sets [Builder.senQuat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senQuat] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun senQuat(senQuat: JsonField<List<Double>>) = apply {
            this.senQuat = senQuat.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.senQuat].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenQuat(senQuat: Double) = apply {
            this.senQuat =
                (this.senQuat ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senQuat", it).add(senQuat)
                }
        }

        /**
         * The derivative of the quaternion describing the rotation of the body-fixed frame used for
         * this system into the local geodetic frame, exposure start epoch (expStartTime). The array
         * element order convention is scalar component first, followed by the three vector
         * components. For a vector u in the body-fixed frame, the corresponding vector u' in the
         * geodetic frame should satisfy u' = quq*, where q is this quaternion.
         */
        fun senQuatDot(senQuatDot: List<Double>) = senQuatDot(JsonField.of(senQuatDot))

        /**
         * Sets [Builder.senQuatDot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senQuatDot] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senQuatDot(senQuatDot: JsonField<List<Double>>) = apply {
            this.senQuatDot = senQuatDot.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.senQuatDot].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenQuatDot(senQuatDot: Double) = apply {
            this.senQuatDot =
                (this.senQuatDot ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senQuatDot", it).add(senQuatDot)
                }
        }

        /**
         * Sensor x position at exposure start epoch, in km (if mobile/onorbit) in J2000 coordinate
         * frame.
         */
        fun senx(senx: Double) = senx(JsonField.of(senx))

        /**
         * Sets [Builder.senx] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senx] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senx(senx: JsonField<Double>) = apply { this.senx = senx }

        /**
         * Sensor y position at exposure start epoch, in km (if mobile/onorbit) in J2000 coordinate
         * frame.
         */
        fun seny(seny: Double) = seny(JsonField.of(seny))

        /**
         * Sets [Builder.seny] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seny] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun seny(seny: JsonField<Double>) = apply { this.seny = seny }

        /**
         * Sensor z position at exposure start epoch, in km (if mobile/onorbit) in J2000 coordinate
         * frame.
         */
        fun senz(senz: Double) = senz(JsonField.of(senz))

        /**
         * Sets [Builder.senz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senz] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senz(senz: JsonField<Double>) = apply { this.senz = senz }

        /** The sequence ID of an image within an image set. */
        fun sequenceId(sequenceId: Int) = sequenceId(JsonField.of(sequenceId))

        /**
         * Sets [Builder.sequenceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sequenceId] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sequenceId(sequenceId: JsonField<Int>) = apply { this.sequenceId = sequenceId }

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

        /** The telescope pointing azimuth, in degrees, at the exposure start epoch. */
        fun topLeftStartAz(topLeftStartAz: Double) = topLeftStartAz(JsonField.of(topLeftStartAz))

        /**
         * Sets [Builder.topLeftStartAz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLeftStartAz] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun topLeftStartAz(topLeftStartAz: JsonField<Double>) = apply {
            this.topLeftStartAz = topLeftStartAz
        }

        /** The telescope pointing elevation, in degrees, at the exposure start epoch. */
        fun topLeftStartEl(topLeftStartEl: Double) = topLeftStartEl(JsonField.of(topLeftStartEl))

        /**
         * Sets [Builder.topLeftStartEl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLeftStartEl] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun topLeftStartEl(topLeftStartEl: JsonField<Double>) = apply {
            this.topLeftStartEl = topLeftStartEl
        }

        /** The telescope pointing azimuth, in degrees, at the exposure stop epoch. */
        fun topLeftStopAz(topLeftStopAz: Double) = topLeftStopAz(JsonField.of(topLeftStopAz))

        /**
         * Sets [Builder.topLeftStopAz] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLeftStopAz] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLeftStopAz(topLeftStopAz: JsonField<Double>) = apply {
            this.topLeftStopAz = topLeftStopAz
        }

        /** The telescope pointing elevation, in degrees, at the exposure stop epoch. */
        fun topLeftStopEl(topLeftStopEl: Double) = topLeftStopEl(JsonField.of(topLeftStopEl))

        /**
         * Sets [Builder.topLeftStopEl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topLeftStopEl] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun topLeftStopEl(topLeftStopEl: JsonField<Double>) = apply {
            this.topLeftStopEl = topLeftStopEl
        }

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
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
         * Returns an immutable instance of [HistoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .expStartTime()
         * .imageType()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryListResponse =
            HistoryListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("expStartTime", expStartTime),
                checkRequired("imageType", imageType),
                checkRequired("source", source),
                id,
                annotationKey,
                calibrationKey,
                checksumValue,
                createdAt,
                createdBy,
                description,
                (eoObservations ?: JsonMissing.of()).map { it.toImmutable() },
                expEndTime,
                filename,
                filesize,
                frameFovHeight,
                frameFovWidth,
                frameHeightPixels,
                frameWidthPixels,
                idAttitudeSet,
                idOnOrbit,
                idSensor,
                idSoiSet,
                imageSetId,
                imageSetLength,
                imageSourceInfo,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                pixelBitDepth,
                pixelFovHeight,
                pixelFovWidth,
                satNo,
                senalt,
                senlat,
                senlon,
                (senQuat ?: JsonMissing.of()).map { it.toImmutable() },
                (senQuatDot ?: JsonMissing.of()).map { it.toImmutable() },
                senx,
                seny,
                senz,
                sequenceId,
                sourceDl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                topLeftStartAz,
                topLeftStartEl,
                topLeftStopAz,
                topLeftStopEl,
                transactionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        expStartTime()
        imageType()
        source()
        id()
        annotationKey()
        calibrationKey()
        checksumValue()
        createdAt()
        createdBy()
        description()
        eoObservations().ifPresent { it.forEach { it.validate() } }
        expEndTime()
        filename()
        filesize()
        frameFovHeight()
        frameFovWidth()
        frameHeightPixels()
        frameWidthPixels()
        idAttitudeSet()
        idOnOrbit()
        idSensor()
        idSoiSet()
        imageSetId()
        imageSetLength()
        imageSourceInfo()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        pixelBitDepth()
        pixelFovHeight()
        pixelFovWidth()
        satNo()
        senalt()
        senlat()
        senlon()
        senQuat()
        senQuatDot()
        senx()
        seny()
        senz()
        sequenceId()
        sourceDl()
        tags()
        topLeftStartAz()
        topLeftStartEl()
        topLeftStopAz()
        topLeftStopEl()
        transactionId()
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
            (if (expStartTime.asKnown().isPresent) 1 else 0) +
            (if (imageType.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (annotationKey.asKnown().isPresent) 1 else 0) +
            (if (calibrationKey.asKnown().isPresent) 1 else 0) +
            (if (checksumValue.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (eoObservations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (expEndTime.asKnown().isPresent) 1 else 0) +
            (if (filename.asKnown().isPresent) 1 else 0) +
            (if (filesize.asKnown().isPresent) 1 else 0) +
            (if (frameFovHeight.asKnown().isPresent) 1 else 0) +
            (if (frameFovWidth.asKnown().isPresent) 1 else 0) +
            (if (frameHeightPixels.asKnown().isPresent) 1 else 0) +
            (if (frameWidthPixels.asKnown().isPresent) 1 else 0) +
            (if (idAttitudeSet.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (idSoiSet.asKnown().isPresent) 1 else 0) +
            (if (imageSetId.asKnown().isPresent) 1 else 0) +
            (if (imageSetLength.asKnown().isPresent) 1 else 0) +
            (if (imageSourceInfo.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (pixelBitDepth.asKnown().isPresent) 1 else 0) +
            (if (pixelFovHeight.asKnown().isPresent) 1 else 0) +
            (if (pixelFovWidth.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senalt.asKnown().isPresent) 1 else 0) +
            (if (senlat.asKnown().isPresent) 1 else 0) +
            (if (senlon.asKnown().isPresent) 1 else 0) +
            (senQuat.asKnown().getOrNull()?.size ?: 0) +
            (senQuatDot.asKnown().getOrNull()?.size ?: 0) +
            (if (senx.asKnown().isPresent) 1 else 0) +
            (if (seny.asKnown().isPresent) 1 else 0) +
            (if (senz.asKnown().isPresent) 1 else 0) +
            (if (sequenceId.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (topLeftStartAz.asKnown().isPresent) 1 else 0) +
            (if (topLeftStartEl.asKnown().isPresent) 1 else 0) +
            (if (topLeftStopAz.asKnown().isPresent) 1 else 0) +
            (if (topLeftStopEl.asKnown().isPresent) 1 else 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and
     * analysis.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
     * requirements, and for validating technical, functional, and performance characteristics.
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include
     * both real and simulated data.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

        return other is HistoryListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            expStartTime == other.expStartTime &&
            imageType == other.imageType &&
            source == other.source &&
            id == other.id &&
            annotationKey == other.annotationKey &&
            calibrationKey == other.calibrationKey &&
            checksumValue == other.checksumValue &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            description == other.description &&
            eoObservations == other.eoObservations &&
            expEndTime == other.expEndTime &&
            filename == other.filename &&
            filesize == other.filesize &&
            frameFovHeight == other.frameFovHeight &&
            frameFovWidth == other.frameFovWidth &&
            frameHeightPixels == other.frameHeightPixels &&
            frameWidthPixels == other.frameWidthPixels &&
            idAttitudeSet == other.idAttitudeSet &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            idSoiSet == other.idSoiSet &&
            imageSetId == other.imageSetId &&
            imageSetLength == other.imageSetLength &&
            imageSourceInfo == other.imageSourceInfo &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            pixelBitDepth == other.pixelBitDepth &&
            pixelFovHeight == other.pixelFovHeight &&
            pixelFovWidth == other.pixelFovWidth &&
            satNo == other.satNo &&
            senalt == other.senalt &&
            senlat == other.senlat &&
            senlon == other.senlon &&
            senQuat == other.senQuat &&
            senQuatDot == other.senQuatDot &&
            senx == other.senx &&
            seny == other.seny &&
            senz == other.senz &&
            sequenceId == other.sequenceId &&
            sourceDl == other.sourceDl &&
            tags == other.tags &&
            topLeftStartAz == other.topLeftStartAz &&
            topLeftStartEl == other.topLeftStartEl &&
            topLeftStopAz == other.topLeftStopAz &&
            topLeftStopEl == other.topLeftStopEl &&
            transactionId == other.transactionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            expStartTime,
            imageType,
            source,
            id,
            annotationKey,
            calibrationKey,
            checksumValue,
            createdAt,
            createdBy,
            description,
            eoObservations,
            expEndTime,
            filename,
            filesize,
            frameFovHeight,
            frameFovWidth,
            frameHeightPixels,
            frameWidthPixels,
            idAttitudeSet,
            idOnOrbit,
            idSensor,
            idSoiSet,
            imageSetId,
            imageSetLength,
            imageSourceInfo,
            onOrbit,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            pixelBitDepth,
            pixelFovHeight,
            pixelFovWidth,
            satNo,
            senalt,
            senlat,
            senlon,
            senQuat,
            senQuatDot,
            senx,
            seny,
            senz,
            sequenceId,
            sourceDl,
            tags,
            topLeftStartAz,
            topLeftStartEl,
            topLeftStopAz,
            topLeftStopEl,
            transactionId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, expStartTime=$expStartTime, imageType=$imageType, source=$source, id=$id, annotationKey=$annotationKey, calibrationKey=$calibrationKey, checksumValue=$checksumValue, createdAt=$createdAt, createdBy=$createdBy, description=$description, eoObservations=$eoObservations, expEndTime=$expEndTime, filename=$filename, filesize=$filesize, frameFovHeight=$frameFovHeight, frameFovWidth=$frameFovWidth, frameHeightPixels=$frameHeightPixels, frameWidthPixels=$frameWidthPixels, idAttitudeSet=$idAttitudeSet, idOnOrbit=$idOnOrbit, idSensor=$idSensor, idSoiSet=$idSoiSet, imageSetId=$imageSetId, imageSetLength=$imageSetLength, imageSourceInfo=$imageSourceInfo, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, pixelBitDepth=$pixelBitDepth, pixelFovHeight=$pixelFovHeight, pixelFovWidth=$pixelFovWidth, satNo=$satNo, senalt=$senalt, senlat=$senlat, senlon=$senlon, senQuat=$senQuat, senQuatDot=$senQuatDot, senx=$senx, seny=$seny, senz=$senz, sequenceId=$sequenceId, sourceDl=$sourceDl, tags=$tags, topLeftStartAz=$topLeftStartAz, topLeftStartEl=$topLeftStartEl, topLeftStopAz=$topLeftStopAz, topLeftStopEl=$topLeftStopEl, transactionId=$transactionId, additionalProperties=$additionalProperties}"
}

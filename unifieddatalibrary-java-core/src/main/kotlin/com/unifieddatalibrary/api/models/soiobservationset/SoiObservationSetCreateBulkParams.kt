// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.soiobservationset

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation intended for initial integration only, to take a list of SOIObservationSet
 * records as a POST body and ingest into the database. This operation is not intended to be used
 * for automated feeds into UDL. Data providers should contact the UDL team for specific role
 * assignments and for instructions on setting up a permanent feed through an alternate mechanism.
 */
class SoiObservationSetCreateBulkParams
private constructor(
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SoiObservationSetCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SoiObservationSetCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(soiObservationSetCreateBulkParams: SoiObservationSetCreateBulkParams) =
            apply {
                body = soiObservationSetCreateBulkParams.body.toMutableList()
                additionalHeaders = soiObservationSetCreateBulkParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    soiObservationSetCreateBulkParams.additionalQueryParams.toBuilder()
            }

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SoiObservationSetCreateBulkParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SoiObservationSetCreateBulkParams =
            SoiObservationSetCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * These services provide operations for posting space object idenfification observation sets.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("numObs") @ExcludeMissing private val numObs: JsonField<Int>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("startTime") @ExcludeMissing private val startTime: JsonField<OffsetDateTime>,
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("binningHoriz") @ExcludeMissing private val binningHoriz: JsonField<Int>,
        @JsonProperty("binningVert") @ExcludeMissing private val binningVert: JsonField<Int>,
        @JsonProperty("brightnessVarianceChangeDetected")
        @ExcludeMissing
        private val brightnessVarianceChangeDetected: JsonField<Boolean>,
        @JsonProperty("calibrations")
        @ExcludeMissing
        private val calibrations: JsonField<List<Calibration>>,
        @JsonProperty("calibrationType")
        @ExcludeMissing
        private val calibrationType: JsonField<String>,
        @JsonProperty("changeConf") @ExcludeMissing private val changeConf: JsonField<String>,
        @JsonProperty("changeDetected")
        @ExcludeMissing
        private val changeDetected: JsonField<Boolean>,
        @JsonProperty("collectionDensityConf")
        @ExcludeMissing
        private val collectionDensityConf: JsonField<String>,
        @JsonProperty("collectionId") @ExcludeMissing private val collectionId: JsonField<String>,
        @JsonProperty("collectionMode")
        @ExcludeMissing
        private val collectionMode: JsonField<String>,
        @JsonProperty("corrQuality") @ExcludeMissing private val corrQuality: JsonField<Double>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("endTime") @ExcludeMissing private val endTime: JsonField<OffsetDateTime>,
        @JsonProperty("gain") @ExcludeMissing private val gain: JsonField<Double>,
        @JsonProperty("idElset") @ExcludeMissing private val idElset: JsonField<String>,
        @JsonProperty("idOnOrbit") @ExcludeMissing private val idOnOrbit: JsonField<String>,
        @JsonProperty("idSensor") @ExcludeMissing private val idSensor: JsonField<String>,
        @JsonProperty("losDeclinationEnd")
        @ExcludeMissing
        private val losDeclinationEnd: JsonField<Double>,
        @JsonProperty("losDeclinationStart")
        @ExcludeMissing
        private val losDeclinationStart: JsonField<Double>,
        @JsonProperty("msgCreateDate")
        @ExcludeMissing
        private val msgCreateDate: JsonField<OffsetDateTime>,
        @JsonProperty("numSpectralFilters")
        @ExcludeMissing
        private val numSpectralFilters: JsonField<Int>,
        @JsonProperty("opticalSOIObservationList")
        @ExcludeMissing
        private val opticalSoiObservationList: JsonField<List<OpticalSoiObservationList>>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origObjectId") @ExcludeMissing private val origObjectId: JsonField<String>,
        @JsonProperty("origSensorId") @ExcludeMissing private val origSensorId: JsonField<String>,
        @JsonProperty("percentSatThreshold")
        @ExcludeMissing
        private val percentSatThreshold: JsonField<Double>,
        @JsonProperty("periodicityChangeDetected")
        @ExcludeMissing
        private val periodicityChangeDetected: JsonField<Boolean>,
        @JsonProperty("periodicityDetectionConf")
        @ExcludeMissing
        private val periodicityDetectionConf: JsonField<String>,
        @JsonProperty("periodicitySamplingConf")
        @ExcludeMissing
        private val periodicitySamplingConf: JsonField<String>,
        @JsonProperty("pixelArrayHeight")
        @ExcludeMissing
        private val pixelArrayHeight: JsonField<Int>,
        @JsonProperty("pixelArrayWidth")
        @ExcludeMissing
        private val pixelArrayWidth: JsonField<Int>,
        @JsonProperty("pixelMax") @ExcludeMissing private val pixelMax: JsonField<Int>,
        @JsonProperty("pixelMin") @ExcludeMissing private val pixelMin: JsonField<Int>,
        @JsonProperty("pointingAngleAzEnd")
        @ExcludeMissing
        private val pointingAngleAzEnd: JsonField<Double>,
        @JsonProperty("pointingAngleAzStart")
        @ExcludeMissing
        private val pointingAngleAzStart: JsonField<Double>,
        @JsonProperty("pointingAngleElEnd")
        @ExcludeMissing
        private val pointingAngleElEnd: JsonField<Double>,
        @JsonProperty("pointingAngleElStart")
        @ExcludeMissing
        private val pointingAngleElStart: JsonField<Double>,
        @JsonProperty("polarAngleEnd") @ExcludeMissing private val polarAngleEnd: JsonField<Double>,
        @JsonProperty("polarAngleStart")
        @ExcludeMissing
        private val polarAngleStart: JsonField<Double>,
        @JsonProperty("radarSOIObservationList")
        @ExcludeMissing
        private val radarSoiObservationList: JsonField<List<RadarSoiObservationList>>,
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        private val referenceFrame: JsonField<ReferenceFrame>,
        @JsonProperty("satelliteName") @ExcludeMissing private val satelliteName: JsonField<String>,
        @JsonProperty("satNo") @ExcludeMissing private val satNo: JsonField<Int>,
        @JsonProperty("senalt") @ExcludeMissing private val senalt: JsonField<Double>,
        @JsonProperty("senlat") @ExcludeMissing private val senlat: JsonField<Double>,
        @JsonProperty("senlon") @ExcludeMissing private val senlon: JsonField<Double>,
        @JsonProperty("senReferenceFrame")
        @ExcludeMissing
        private val senReferenceFrame: JsonField<SenReferenceFrame>,
        @JsonProperty("sensorAsId") @ExcludeMissing private val sensorAsId: JsonField<String>,
        @JsonProperty("senvelx") @ExcludeMissing private val senvelx: JsonField<Double>,
        @JsonProperty("senvely") @ExcludeMissing private val senvely: JsonField<Double>,
        @JsonProperty("senvelz") @ExcludeMissing private val senvelz: JsonField<Double>,
        @JsonProperty("senx") @ExcludeMissing private val senx: JsonField<Double>,
        @JsonProperty("seny") @ExcludeMissing private val seny: JsonField<Double>,
        @JsonProperty("senz") @ExcludeMissing private val senz: JsonField<Double>,
        @JsonProperty("softwareVersion")
        @ExcludeMissing
        private val softwareVersion: JsonField<String>,
        @JsonProperty("solarMag") @ExcludeMissing private val solarMag: JsonField<Double>,
        @JsonProperty("solarPhaseAngleBrightnessChangeDetected")
        @ExcludeMissing
        private val solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("spectralFilters")
        @ExcludeMissing
        private val spectralFilters: JsonField<List<String>>,
        @JsonProperty("starCatName") @ExcludeMissing private val starCatName: JsonField<String>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,
        @JsonProperty("transactionId") @ExcludeMissing private val transactionId: JsonField<String>,
        @JsonProperty("uct") @ExcludeMissing private val uct: JsonField<Boolean>,
        @JsonProperty("validCalibrations")
        @ExcludeMissing
        private val validCalibrations: JsonField<String>,
    ) {

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
         * The number of observation records in the set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun numObs(): Int = numObs.getRequired("numObs")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Observation set detection start time in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

        /**
         * Observation type (OPTICAL, RADAR).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The number of pixels binned horizontally.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun binningHoriz(): Optional<Int> = binningHoriz.getOptional("binningHoriz")

        /**
         * The number of pixels binned vertically.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun binningVert(): Optional<Int> = binningVert.getOptional("binningVert")

        /**
         * Boolean indicating if a brightness variance change event was detected, based on
         * historical collection data for the object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun brightnessVarianceChangeDetected(): Optional<Boolean> =
            brightnessVarianceChangeDetected.getOptional("brightnessVarianceChangeDetected")

        /**
         * Array of SOI Calibrations associated with this SOIObservationSet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calibrations(): Optional<List<Calibration>> = calibrations.getOptional("calibrations")

        /**
         * Type of calibration used by the Sensor (e.g. ALL SKY, DIFFERENTIAL, DEFAULT, NONE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun calibrationType(): Optional<String> = calibrationType.getOptional("calibrationType")

        /**
         * Overall qualitative confidence assessment of change detection results (e.g. HIGH, MEDIUM,
         * LOW).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun changeConf(): Optional<String> = changeConf.getOptional("changeConf")

        /**
         * Boolean indicating if any change event was detected, based on historical collection data
         * for the object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun changeDetected(): Optional<Boolean> = changeDetected.getOptional("changeDetected")

        /**
         * Qualitative Collection Density assessment, with respect to confidence of detecting a
         * change event (e.g. HIGH, MEDIUM, LOW).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun collectionDensityConf(): Optional<String> =
            collectionDensityConf.getOptional("collectionDensityConf")

        /**
         * Universally Unique collection ID. Mechanism to correlate Single Point Photometry (SPP)
         * JSON files to images.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun collectionId(): Optional<String> = collectionId.getOptional("collectionId")

        /**
         * Mode indicating telescope movement during collection (AUTOTRACK, MANUAL AUTOTRACK, MANUAL
         * RATE TRACK, MANUAL SIDEREAL, SIDEREAL, RATE TRACK).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun collectionMode(): Optional<String> = collectionMode.getOptional("collectionMode")

        /**
         * Object Correlation Quality value. Measures how close the observed object's orbit is to
         * matching an object in the catalog. The scale of this field may vary depending on
         * provider. Users should consult the data provider to verify the meaning of the value (e.g.
         * A value of 0.0 indicates a high/strong correlation, while a value closer to 1.0 indicates
         * low/weak correlation).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun corrQuality(): Optional<Double> = corrQuality.getOptional("corrQuality")

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
         * Observation set detection end time in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

        /**
         * The gain used during the collection, in units of photoelectrons per analog-to-digital
         * unit (e-/ADU). If no gain is used, the value = 1.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gain(): Optional<Double> = gain.getOptional("gain")

        /**
         * ID of the UDL Elset of the Space Object under observation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idElset(): Optional<String> = idElset.getOptional("idElset")

        /**
         * Unique identifier of the target on-orbit object, if correlated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * ID of the observing sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Line of sight declination at observation set detection end time. Specified in degrees, in
         * the specified referenceFrame. If referenceFrame is null then J2K should be assumed (e.g
         * -30 to 130.0).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun losDeclinationEnd(): Optional<Double> =
            losDeclinationEnd.getOptional("losDeclinationEnd")

        /**
         * Line of sight declination at observation set detection start time. Specified in degrees,
         * in the specified referenceFrame. If referenceFrame is null then J2K should be assumed
         * (e.g -30 to 130.0).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun losDeclinationStart(): Optional<Double> =
            losDeclinationStart.getOptional("losDeclinationStart")

        /**
         * SOI msgCreateDate time in ISO 8601 UTC time, with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msgCreateDate(): Optional<OffsetDateTime> = msgCreateDate.getOptional("msgCreateDate")

        /**
         * The value is the number of spectral filters used.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numSpectralFilters(): Optional<Int> =
            numSpectralFilters.getOptional("numSpectralFilters")

        /**
         * OpticalSOIObservations associated with this SOIObservationSet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun opticalSoiObservationList(): Optional<List<OpticalSoiObservationList>> =
            opticalSoiObservationList.getOptional("opticalSOIObservationList")

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
         * Optional identifier provided by observation source to indicate the target onorbit object
         * of this observation. This may be an internal identifier and not necessarily a valid
         * satellite number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier provided by the record source to indicate the sensor identifier to
         * which this attitude set applies if this set is reporting a single sensor orientation.
         * This may be an internal identifier and not necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * A threshold for percent of pixels that make up object signal that are beyond the
         * saturation point for the sensor that are removed in the EOSSA file, in range of 0 to 1.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun percentSatThreshold(): Optional<Double> =
            percentSatThreshold.getOptional("percentSatThreshold")

        /**
         * Boolean indicating if a periodicity change event was detected, based on historical
         * collection data for the object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun periodicityChangeDetected(): Optional<Boolean> =
            periodicityChangeDetected.getOptional("periodicityChangeDetected")

        /**
         * Qualitative assessment of the periodicity detection results from the Attitude and Shape
         * Retrieval (ASR) Periodicity Assessment (PA) Tool (e.g. HIGH, MEDIUM, LOW).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun periodicityDetectionConf(): Optional<String> =
            periodicityDetectionConf.getOptional("periodicityDetectionConf")

        /**
         * Qualitative Periodicity Sampling assessment, with respect to confidence of detecting a
         * change event (e.g. HIGH, MEDIUM, LOW).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun periodicitySamplingConf(): Optional<String> =
            periodicitySamplingConf.getOptional("periodicitySamplingConf")

        /**
         * Pixel array size (height) in pixels.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pixelArrayHeight(): Optional<Int> = pixelArrayHeight.getOptional("pixelArrayHeight")

        /**
         * Pixel array size (width) in pixels.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pixelArrayWidth(): Optional<Int> = pixelArrayWidth.getOptional("pixelArrayWidth")

        /**
         * The maximum valid pixel value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pixelMax(): Optional<Int> = pixelMax.getOptional("pixelMax")

        /**
         * The minimum valid pixel value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pixelMin(): Optional<Int> = pixelMin.getOptional("pixelMin")

        /**
         * Pointing angle of the Azimuth gimbal/mount at observation set detection end time.
         * Specified in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointingAngleAzEnd(): Optional<Double> =
            pointingAngleAzEnd.getOptional("pointingAngleAzEnd")

        /**
         * Pointing angle of the Azimuth gimbal/mount at observation set detection start time.
         * Specified in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointingAngleAzStart(): Optional<Double> =
            pointingAngleAzStart.getOptional("pointingAngleAzStart")

        /**
         * Pointing angle of the Elevation gimbal/mount at observation set detection end time.
         * Specified in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointingAngleElEnd(): Optional<Double> =
            pointingAngleElEnd.getOptional("pointingAngleElEnd")

        /**
         * Pointing angle of the Elevation gimbal/mount at observation set detection start time.
         * Specified in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointingAngleElStart(): Optional<Double> =
            pointingAngleElStart.getOptional("pointingAngleElStart")

        /**
         * Polar angle of the gimbal/mount at observation set detection end time in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun polarAngleEnd(): Optional<Double> = polarAngleEnd.getOptional("polarAngleEnd")

        /**
         * Polar angle of the gimbal/mount at observation set detection start time in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun polarAngleStart(): Optional<Double> = polarAngleStart.getOptional("polarAngleStart")

        /**
         * RadarSOIObservations associated with this RadarSOIObservationSet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun radarSoiObservationList(): Optional<List<RadarSoiObservationList>> =
            radarSoiObservationList.getOptional("radarSOIObservationList")

        /**
         * The reference frame of the observation measurements. If the referenceFrame is null it is
         * assumed to be J2000.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun referenceFrame(): Optional<ReferenceFrame> =
            referenceFrame.getOptional("referenceFrame")

        /**
         * Name of the target satellite.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satelliteName(): Optional<String> = satelliteName.getOptional("satelliteName")

        /**
         * Satellite/catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * Sensor altitude at startTime (if mobile/onorbit) in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senalt(): Optional<Double> = senalt.getOptional("senalt")

        /**
         * Sensor WGS84 latitude at startTime (if mobile/onorbit) in degrees. If null, can be
         * obtained from sensor info. -90 to 90 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senlat(): Optional<Double> = senlat.getOptional("senlat")

        /**
         * Sensor WGS84 longitude at startTime (if mobile/onorbit) in degrees. If null, can be
         * obtained from sensor info. -180 to 180 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senlon(): Optional<Double> = senlon.getOptional("senlon")

        /**
         * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
         * assumed to be J2000.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senReferenceFrame(): Optional<SenReferenceFrame> =
            senReferenceFrame.getOptional("senReferenceFrame")

        /**
         * ID of the AttitudeSet record for the observing sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sensorAsId(): Optional<String> = sensorAsId.getOptional("sensorAsId")

        /**
         * Cartesian X velocity of the observing mobile/onorbit sensor at startTime, in kilometers
         * per second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
         * should be assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senvelx(): Optional<Double> = senvelx.getOptional("senvelx")

        /**
         * Cartesian Y velocity of the observing mobile/onorbit sensor at startTime, in kilometers
         * per second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
         * should be assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senvely(): Optional<Double> = senvely.getOptional("senvely")

        /**
         * Cartesian Z velocity of the observing mobile/onorbit sensor at startTime, in kilometers
         * per second, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
         * should be assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senvelz(): Optional<Double> = senvelz.getOptional("senvelz")

        /**
         * Cartesian X position of the observing mobile/onorbit sensor at startTime, in kilometers,
         * in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
         * assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senx(): Optional<Double> = senx.getOptional("senx")

        /**
         * Cartesian Y position of the observing mobile/onorbit sensor at startTime, in kilometers,
         * in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
         * assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun seny(): Optional<Double> = seny.getOptional("seny")

        /**
         * Cartesian Z position of the observing mobile/onorbit sensor at startTime, in kilometers,
         * in the specified senReferenceFrame. If senReferenceFrame is null then J2K should be
         * assumed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senz(): Optional<Double> = senz.getOptional("senz")

        /**
         * Software Version used to Capture, Process, and Deliver the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun softwareVersion(): Optional<String> = softwareVersion.getOptional("softwareVersion")

        /**
         * The in-band solar magnitude at 1 A.U.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun solarMag(): Optional<Double> = solarMag.getOptional("solarMag")

        /**
         * Boolean indicating if a solar phase angle brightness change event was detected, based on
         * historical collection data for the object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun solarPhaseAngleBrightnessChangeDetected(): Optional<Boolean> =
            solarPhaseAngleBrightnessChangeDetected.getOptional(
                "solarPhaseAngleBrightnessChangeDetected"
            )

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * Array of the SpectralFilters keywords, must be present for all values n=1 to
         * numSpectralFilters, in incrementing order of n, and for no other values of n.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spectralFilters(): Optional<List<String>> =
            spectralFilters.getOptional("spectralFilters")

        /**
         * Name of the Star Catalog used for photometry and astrometry.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun starCatName(): Optional<String> = starCatName.getOptional("starCatName")

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

        /**
         * Boolean indicating whether the target object was unable to be correlated to a known
         * object. This flag should only be set to true by data providers after an attempt to
         * correlate to an OnOrbit object was made and failed. If unable to correlate, the
         * 'origObjectId' field may be populated with an internal data provider specific identifier.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun uct(): Optional<Boolean> = uct.getOptional("uct")

        /**
         * Key to indicate which, if any of, the pre/post photometer calibrations are valid for use
         * when generating data for the EOSSA file. If the field is not populated, then the provided
         * calibration data will be used when generating the EOSSA file (e.g. PRE, POST, BOTH,
         * NONE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun validCalibrations(): Optional<String> =
            validCalibrations.getOptional("validCalibrations")

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
         * Returns the raw JSON value of [numObs].
         *
         * Unlike [numObs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numObs") @ExcludeMissing fun _numObs(): JsonField<Int> = numObs

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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [binningHoriz].
         *
         * Unlike [binningHoriz], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("binningHoriz")
        @ExcludeMissing
        fun _binningHoriz(): JsonField<Int> = binningHoriz

        /**
         * Returns the raw JSON value of [binningVert].
         *
         * Unlike [binningVert], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("binningVert")
        @ExcludeMissing
        fun _binningVert(): JsonField<Int> = binningVert

        /**
         * Returns the raw JSON value of [brightnessVarianceChangeDetected].
         *
         * Unlike [brightnessVarianceChangeDetected], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("brightnessVarianceChangeDetected")
        @ExcludeMissing
        fun _brightnessVarianceChangeDetected(): JsonField<Boolean> =
            brightnessVarianceChangeDetected

        /**
         * Returns the raw JSON value of [calibrations].
         *
         * Unlike [calibrations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("calibrations")
        @ExcludeMissing
        fun _calibrations(): JsonField<List<Calibration>> = calibrations

        /**
         * Returns the raw JSON value of [calibrationType].
         *
         * Unlike [calibrationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("calibrationType")
        @ExcludeMissing
        fun _calibrationType(): JsonField<String> = calibrationType

        /**
         * Returns the raw JSON value of [changeConf].
         *
         * Unlike [changeConf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("changeConf")
        @ExcludeMissing
        fun _changeConf(): JsonField<String> = changeConf

        /**
         * Returns the raw JSON value of [changeDetected].
         *
         * Unlike [changeDetected], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("changeDetected")
        @ExcludeMissing
        fun _changeDetected(): JsonField<Boolean> = changeDetected

        /**
         * Returns the raw JSON value of [collectionDensityConf].
         *
         * Unlike [collectionDensityConf], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collectionDensityConf")
        @ExcludeMissing
        fun _collectionDensityConf(): JsonField<String> = collectionDensityConf

        /**
         * Returns the raw JSON value of [collectionId].
         *
         * Unlike [collectionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collectionId")
        @ExcludeMissing
        fun _collectionId(): JsonField<String> = collectionId

        /**
         * Returns the raw JSON value of [collectionMode].
         *
         * Unlike [collectionMode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collectionMode")
        @ExcludeMissing
        fun _collectionMode(): JsonField<String> = collectionMode

        /**
         * Returns the raw JSON value of [corrQuality].
         *
         * Unlike [corrQuality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("corrQuality")
        @ExcludeMissing
        fun _corrQuality(): JsonField<Double> = corrQuality

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
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [gain].
         *
         * Unlike [gain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gain") @ExcludeMissing fun _gain(): JsonField<Double> = gain

        /**
         * Returns the raw JSON value of [idElset].
         *
         * Unlike [idElset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idElset") @ExcludeMissing fun _idElset(): JsonField<String> = idElset

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
         * Returns the raw JSON value of [losDeclinationEnd].
         *
         * Unlike [losDeclinationEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("losDeclinationEnd")
        @ExcludeMissing
        fun _losDeclinationEnd(): JsonField<Double> = losDeclinationEnd

        /**
         * Returns the raw JSON value of [losDeclinationStart].
         *
         * Unlike [losDeclinationStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("losDeclinationStart")
        @ExcludeMissing
        fun _losDeclinationStart(): JsonField<Double> = losDeclinationStart

        /**
         * Returns the raw JSON value of [msgCreateDate].
         *
         * Unlike [msgCreateDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("msgCreateDate")
        @ExcludeMissing
        fun _msgCreateDate(): JsonField<OffsetDateTime> = msgCreateDate

        /**
         * Returns the raw JSON value of [numSpectralFilters].
         *
         * Unlike [numSpectralFilters], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("numSpectralFilters")
        @ExcludeMissing
        fun _numSpectralFilters(): JsonField<Int> = numSpectralFilters

        /**
         * Returns the raw JSON value of [opticalSoiObservationList].
         *
         * Unlike [opticalSoiObservationList], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("opticalSOIObservationList")
        @ExcludeMissing
        fun _opticalSoiObservationList(): JsonField<List<OpticalSoiObservationList>> =
            opticalSoiObservationList

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
         * Returns the raw JSON value of [origObjectId].
         *
         * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origObjectId")
        @ExcludeMissing
        fun _origObjectId(): JsonField<String> = origObjectId

        /**
         * Returns the raw JSON value of [origSensorId].
         *
         * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origSensorId")
        @ExcludeMissing
        fun _origSensorId(): JsonField<String> = origSensorId

        /**
         * Returns the raw JSON value of [percentSatThreshold].
         *
         * Unlike [percentSatThreshold], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("percentSatThreshold")
        @ExcludeMissing
        fun _percentSatThreshold(): JsonField<Double> = percentSatThreshold

        /**
         * Returns the raw JSON value of [periodicityChangeDetected].
         *
         * Unlike [periodicityChangeDetected], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("periodicityChangeDetected")
        @ExcludeMissing
        fun _periodicityChangeDetected(): JsonField<Boolean> = periodicityChangeDetected

        /**
         * Returns the raw JSON value of [periodicityDetectionConf].
         *
         * Unlike [periodicityDetectionConf], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("periodicityDetectionConf")
        @ExcludeMissing
        fun _periodicityDetectionConf(): JsonField<String> = periodicityDetectionConf

        /**
         * Returns the raw JSON value of [periodicitySamplingConf].
         *
         * Unlike [periodicitySamplingConf], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("periodicitySamplingConf")
        @ExcludeMissing
        fun _periodicitySamplingConf(): JsonField<String> = periodicitySamplingConf

        /**
         * Returns the raw JSON value of [pixelArrayHeight].
         *
         * Unlike [pixelArrayHeight], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pixelArrayHeight")
        @ExcludeMissing
        fun _pixelArrayHeight(): JsonField<Int> = pixelArrayHeight

        /**
         * Returns the raw JSON value of [pixelArrayWidth].
         *
         * Unlike [pixelArrayWidth], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pixelArrayWidth")
        @ExcludeMissing
        fun _pixelArrayWidth(): JsonField<Int> = pixelArrayWidth

        /**
         * Returns the raw JSON value of [pixelMax].
         *
         * Unlike [pixelMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pixelMax") @ExcludeMissing fun _pixelMax(): JsonField<Int> = pixelMax

        /**
         * Returns the raw JSON value of [pixelMin].
         *
         * Unlike [pixelMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pixelMin") @ExcludeMissing fun _pixelMin(): JsonField<Int> = pixelMin

        /**
         * Returns the raw JSON value of [pointingAngleAzEnd].
         *
         * Unlike [pointingAngleAzEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pointingAngleAzEnd")
        @ExcludeMissing
        fun _pointingAngleAzEnd(): JsonField<Double> = pointingAngleAzEnd

        /**
         * Returns the raw JSON value of [pointingAngleAzStart].
         *
         * Unlike [pointingAngleAzStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pointingAngleAzStart")
        @ExcludeMissing
        fun _pointingAngleAzStart(): JsonField<Double> = pointingAngleAzStart

        /**
         * Returns the raw JSON value of [pointingAngleElEnd].
         *
         * Unlike [pointingAngleElEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pointingAngleElEnd")
        @ExcludeMissing
        fun _pointingAngleElEnd(): JsonField<Double> = pointingAngleElEnd

        /**
         * Returns the raw JSON value of [pointingAngleElStart].
         *
         * Unlike [pointingAngleElStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pointingAngleElStart")
        @ExcludeMissing
        fun _pointingAngleElStart(): JsonField<Double> = pointingAngleElStart

        /**
         * Returns the raw JSON value of [polarAngleEnd].
         *
         * Unlike [polarAngleEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("polarAngleEnd")
        @ExcludeMissing
        fun _polarAngleEnd(): JsonField<Double> = polarAngleEnd

        /**
         * Returns the raw JSON value of [polarAngleStart].
         *
         * Unlike [polarAngleStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("polarAngleStart")
        @ExcludeMissing
        fun _polarAngleStart(): JsonField<Double> = polarAngleStart

        /**
         * Returns the raw JSON value of [radarSoiObservationList].
         *
         * Unlike [radarSoiObservationList], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("radarSOIObservationList")
        @ExcludeMissing
        fun _radarSoiObservationList(): JsonField<List<RadarSoiObservationList>> =
            radarSoiObservationList

        /**
         * Returns the raw JSON value of [referenceFrame].
         *
         * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        fun _referenceFrame(): JsonField<ReferenceFrame> = referenceFrame

        /**
         * Returns the raw JSON value of [satelliteName].
         *
         * Unlike [satelliteName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("satelliteName")
        @ExcludeMissing
        fun _satelliteName(): JsonField<String> = satelliteName

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
         * Returns the raw JSON value of [senReferenceFrame].
         *
         * Unlike [senReferenceFrame], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("senReferenceFrame")
        @ExcludeMissing
        fun _senReferenceFrame(): JsonField<SenReferenceFrame> = senReferenceFrame

        /**
         * Returns the raw JSON value of [sensorAsId].
         *
         * Unlike [sensorAsId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sensorAsId")
        @ExcludeMissing
        fun _sensorAsId(): JsonField<String> = sensorAsId

        /**
         * Returns the raw JSON value of [senvelx].
         *
         * Unlike [senvelx], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senvelx") @ExcludeMissing fun _senvelx(): JsonField<Double> = senvelx

        /**
         * Returns the raw JSON value of [senvely].
         *
         * Unlike [senvely], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senvely") @ExcludeMissing fun _senvely(): JsonField<Double> = senvely

        /**
         * Returns the raw JSON value of [senvelz].
         *
         * Unlike [senvelz], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senvelz") @ExcludeMissing fun _senvelz(): JsonField<Double> = senvelz

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
         * Returns the raw JSON value of [softwareVersion].
         *
         * Unlike [softwareVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("softwareVersion")
        @ExcludeMissing
        fun _softwareVersion(): JsonField<String> = softwareVersion

        /**
         * Returns the raw JSON value of [solarMag].
         *
         * Unlike [solarMag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("solarMag") @ExcludeMissing fun _solarMag(): JsonField<Double> = solarMag

        /**
         * Returns the raw JSON value of [solarPhaseAngleBrightnessChangeDetected].
         *
         * Unlike [solarPhaseAngleBrightnessChangeDetected], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("solarPhaseAngleBrightnessChangeDetected")
        @ExcludeMissing
        fun _solarPhaseAngleBrightnessChangeDetected(): JsonField<Boolean> =
            solarPhaseAngleBrightnessChangeDetected

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [spectralFilters].
         *
         * Unlike [spectralFilters], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spectralFilters")
        @ExcludeMissing
        fun _spectralFilters(): JsonField<List<String>> = spectralFilters

        /**
         * Returns the raw JSON value of [starCatName].
         *
         * Unlike [starCatName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starCatName")
        @ExcludeMissing
        fun _starCatName(): JsonField<String> = starCatName

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactionId")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        /**
         * Returns the raw JSON value of [uct].
         *
         * Unlike [uct], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uct") @ExcludeMissing fun _uct(): JsonField<Boolean> = uct

        /**
         * Returns the raw JSON value of [validCalibrations].
         *
         * Unlike [validCalibrations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("validCalibrations")
        @ExcludeMissing
        fun _validCalibrations(): JsonField<String> = validCalibrations

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .numObs()
             * .source()
             * .startTime()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var numObs: JsonField<Int>? = null
            private var source: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var type: JsonField<Type>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var binningHoriz: JsonField<Int> = JsonMissing.of()
            private var binningVert: JsonField<Int> = JsonMissing.of()
            private var brightnessVarianceChangeDetected: JsonField<Boolean> = JsonMissing.of()
            private var calibrations: JsonField<MutableList<Calibration>>? = null
            private var calibrationType: JsonField<String> = JsonMissing.of()
            private var changeConf: JsonField<String> = JsonMissing.of()
            private var changeDetected: JsonField<Boolean> = JsonMissing.of()
            private var collectionDensityConf: JsonField<String> = JsonMissing.of()
            private var collectionId: JsonField<String> = JsonMissing.of()
            private var collectionMode: JsonField<String> = JsonMissing.of()
            private var corrQuality: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var gain: JsonField<Double> = JsonMissing.of()
            private var idElset: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var losDeclinationEnd: JsonField<Double> = JsonMissing.of()
            private var losDeclinationStart: JsonField<Double> = JsonMissing.of()
            private var msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var numSpectralFilters: JsonField<Int> = JsonMissing.of()
            private var opticalSoiObservationList:
                JsonField<MutableList<OpticalSoiObservationList>>? =
                null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var percentSatThreshold: JsonField<Double> = JsonMissing.of()
            private var periodicityChangeDetected: JsonField<Boolean> = JsonMissing.of()
            private var periodicityDetectionConf: JsonField<String> = JsonMissing.of()
            private var periodicitySamplingConf: JsonField<String> = JsonMissing.of()
            private var pixelArrayHeight: JsonField<Int> = JsonMissing.of()
            private var pixelArrayWidth: JsonField<Int> = JsonMissing.of()
            private var pixelMax: JsonField<Int> = JsonMissing.of()
            private var pixelMin: JsonField<Int> = JsonMissing.of()
            private var pointingAngleAzEnd: JsonField<Double> = JsonMissing.of()
            private var pointingAngleAzStart: JsonField<Double> = JsonMissing.of()
            private var pointingAngleElEnd: JsonField<Double> = JsonMissing.of()
            private var pointingAngleElStart: JsonField<Double> = JsonMissing.of()
            private var polarAngleEnd: JsonField<Double> = JsonMissing.of()
            private var polarAngleStart: JsonField<Double> = JsonMissing.of()
            private var radarSoiObservationList: JsonField<MutableList<RadarSoiObservationList>>? =
                null
            private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
            private var satelliteName: JsonField<String> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var senalt: JsonField<Double> = JsonMissing.of()
            private var senlat: JsonField<Double> = JsonMissing.of()
            private var senlon: JsonField<Double> = JsonMissing.of()
            private var senReferenceFrame: JsonField<SenReferenceFrame> = JsonMissing.of()
            private var sensorAsId: JsonField<String> = JsonMissing.of()
            private var senvelx: JsonField<Double> = JsonMissing.of()
            private var senvely: JsonField<Double> = JsonMissing.of()
            private var senvelz: JsonField<Double> = JsonMissing.of()
            private var senx: JsonField<Double> = JsonMissing.of()
            private var seny: JsonField<Double> = JsonMissing.of()
            private var senz: JsonField<Double> = JsonMissing.of()
            private var softwareVersion: JsonField<String> = JsonMissing.of()
            private var solarMag: JsonField<Double> = JsonMissing.of()
            private var solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean> =
                JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var spectralFilters: JsonField<MutableList<String>>? = null
            private var starCatName: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var uct: JsonField<Boolean> = JsonMissing.of()
            private var validCalibrations: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                numObs = body.numObs
                source = body.source
                startTime = body.startTime
                type = body.type
                id = body.id
                binningHoriz = body.binningHoriz
                binningVert = body.binningVert
                brightnessVarianceChangeDetected = body.brightnessVarianceChangeDetected
                calibrations = body.calibrations.map { it.toMutableList() }
                calibrationType = body.calibrationType
                changeConf = body.changeConf
                changeDetected = body.changeDetected
                collectionDensityConf = body.collectionDensityConf
                collectionId = body.collectionId
                collectionMode = body.collectionMode
                corrQuality = body.corrQuality
                createdAt = body.createdAt
                createdBy = body.createdBy
                endTime = body.endTime
                gain = body.gain
                idElset = body.idElset
                idOnOrbit = body.idOnOrbit
                idSensor = body.idSensor
                losDeclinationEnd = body.losDeclinationEnd
                losDeclinationStart = body.losDeclinationStart
                msgCreateDate = body.msgCreateDate
                numSpectralFilters = body.numSpectralFilters
                opticalSoiObservationList =
                    body.opticalSoiObservationList.map { it.toMutableList() }
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                origSensorId = body.origSensorId
                percentSatThreshold = body.percentSatThreshold
                periodicityChangeDetected = body.periodicityChangeDetected
                periodicityDetectionConf = body.periodicityDetectionConf
                periodicitySamplingConf = body.periodicitySamplingConf
                pixelArrayHeight = body.pixelArrayHeight
                pixelArrayWidth = body.pixelArrayWidth
                pixelMax = body.pixelMax
                pixelMin = body.pixelMin
                pointingAngleAzEnd = body.pointingAngleAzEnd
                pointingAngleAzStart = body.pointingAngleAzStart
                pointingAngleElEnd = body.pointingAngleElEnd
                pointingAngleElStart = body.pointingAngleElStart
                polarAngleEnd = body.polarAngleEnd
                polarAngleStart = body.polarAngleStart
                radarSoiObservationList = body.radarSoiObservationList.map { it.toMutableList() }
                referenceFrame = body.referenceFrame
                satelliteName = body.satelliteName
                satNo = body.satNo
                senalt = body.senalt
                senlat = body.senlat
                senlon = body.senlon
                senReferenceFrame = body.senReferenceFrame
                sensorAsId = body.sensorAsId
                senvelx = body.senvelx
                senvely = body.senvely
                senvelz = body.senvelz
                senx = body.senx
                seny = body.seny
                senz = body.senz
                softwareVersion = body.softwareVersion
                solarMag = body.solarMag
                solarPhaseAngleBrightnessChangeDetected =
                    body.solarPhaseAngleBrightnessChangeDetected
                sourceDl = body.sourceDl
                spectralFilters = body.spectralFilters.map { it.toMutableList() }
                starCatName = body.starCatName
                tags = body.tags.map { it.toMutableList() }
                transactionId = body.transactionId
                uct = body.uct
                validCalibrations = body.validCalibrations
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

            /** The number of observation records in the set. */
            fun numObs(numObs: Int) = numObs(JsonField.of(numObs))

            /**
             * Sets [Builder.numObs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numObs] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun numObs(numObs: JsonField<Int>) = apply { this.numObs = numObs }

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

            /** Observation set detection start time in ISO 8601 UTC with microsecond precision. */
            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            /** Observation type (OPTICAL, RADAR). */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            /** The number of pixels binned horizontally. */
            fun binningHoriz(binningHoriz: Int) = binningHoriz(JsonField.of(binningHoriz))

            /**
             * Sets [Builder.binningHoriz] to an arbitrary JSON value.
             *
             * You should usually call [Builder.binningHoriz] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun binningHoriz(binningHoriz: JsonField<Int>) = apply {
                this.binningHoriz = binningHoriz
            }

            /** The number of pixels binned vertically. */
            fun binningVert(binningVert: Int) = binningVert(JsonField.of(binningVert))

            /**
             * Sets [Builder.binningVert] to an arbitrary JSON value.
             *
             * You should usually call [Builder.binningVert] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun binningVert(binningVert: JsonField<Int>) = apply { this.binningVert = binningVert }

            /**
             * Boolean indicating if a brightness variance change event was detected, based on
             * historical collection data for the object.
             */
            fun brightnessVarianceChangeDetected(brightnessVarianceChangeDetected: Boolean) =
                brightnessVarianceChangeDetected(JsonField.of(brightnessVarianceChangeDetected))

            /**
             * Sets [Builder.brightnessVarianceChangeDetected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brightnessVarianceChangeDetected] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun brightnessVarianceChangeDetected(
                brightnessVarianceChangeDetected: JsonField<Boolean>
            ) = apply { this.brightnessVarianceChangeDetected = brightnessVarianceChangeDetected }

            /** Array of SOI Calibrations associated with this SOIObservationSet. */
            fun calibrations(calibrations: List<Calibration>) =
                calibrations(JsonField.of(calibrations))

            /**
             * Sets [Builder.calibrations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calibrations] with a well-typed `List<Calibration>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun calibrations(calibrations: JsonField<List<Calibration>>) = apply {
                this.calibrations = calibrations.map { it.toMutableList() }
            }

            /**
             * Adds a single [Calibration] to [calibrations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCalibration(calibration: Calibration) = apply {
                calibrations =
                    (calibrations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("calibrations", it).add(calibration)
                    }
            }

            /**
             * Type of calibration used by the Sensor (e.g. ALL SKY, DIFFERENTIAL, DEFAULT, NONE).
             */
            fun calibrationType(calibrationType: String) =
                calibrationType(JsonField.of(calibrationType))

            /**
             * Sets [Builder.calibrationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calibrationType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calibrationType(calibrationType: JsonField<String>) = apply {
                this.calibrationType = calibrationType
            }

            /**
             * Overall qualitative confidence assessment of change detection results (e.g. HIGH,
             * MEDIUM, LOW).
             */
            fun changeConf(changeConf: String) = changeConf(JsonField.of(changeConf))

            /**
             * Sets [Builder.changeConf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changeConf] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeConf(changeConf: JsonField<String>) = apply { this.changeConf = changeConf }

            /**
             * Boolean indicating if any change event was detected, based on historical collection
             * data for the object.
             */
            fun changeDetected(changeDetected: Boolean) =
                changeDetected(JsonField.of(changeDetected))

            /**
             * Sets [Builder.changeDetected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.changeDetected] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun changeDetected(changeDetected: JsonField<Boolean>) = apply {
                this.changeDetected = changeDetected
            }

            /**
             * Qualitative Collection Density assessment, with respect to confidence of detecting a
             * change event (e.g. HIGH, MEDIUM, LOW).
             */
            fun collectionDensityConf(collectionDensityConf: String) =
                collectionDensityConf(JsonField.of(collectionDensityConf))

            /**
             * Sets [Builder.collectionDensityConf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionDensityConf] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun collectionDensityConf(collectionDensityConf: JsonField<String>) = apply {
                this.collectionDensityConf = collectionDensityConf
            }

            /**
             * Universally Unique collection ID. Mechanism to correlate Single Point Photometry
             * (SPP) JSON files to images.
             */
            fun collectionId(collectionId: String) = collectionId(JsonField.of(collectionId))

            /**
             * Sets [Builder.collectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionId(collectionId: JsonField<String>) = apply {
                this.collectionId = collectionId
            }

            /**
             * Mode indicating telescope movement during collection (AUTOTRACK, MANUAL AUTOTRACK,
             * MANUAL RATE TRACK, MANUAL SIDEREAL, SIDEREAL, RATE TRACK).
             */
            fun collectionMode(collectionMode: String) =
                collectionMode(JsonField.of(collectionMode))

            /**
             * Sets [Builder.collectionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionMode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionMode(collectionMode: JsonField<String>) = apply {
                this.collectionMode = collectionMode
            }

            /**
             * Object Correlation Quality value. Measures how close the observed object's orbit is
             * to matching an object in the catalog. The scale of this field may vary depending on
             * provider. Users should consult the data provider to verify the meaning of the value
             * (e.g. A value of 0.0 indicates a high/strong correlation, while a value closer to 1.0
             * indicates low/weak correlation).
             */
            fun corrQuality(corrQuality: Double) = corrQuality(JsonField.of(corrQuality))

            /**
             * Sets [Builder.corrQuality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.corrQuality] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun corrQuality(corrQuality: JsonField<Double>) = apply {
                this.corrQuality = corrQuality
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

            /** Observation set detection end time in ISO 8601 UTC with microsecond precision. */
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
             * The gain used during the collection, in units of photoelectrons per analog-to-digital
             * unit (e-/ADU). If no gain is used, the value = 1.
             */
            fun gain(gain: Double) = gain(JsonField.of(gain))

            /**
             * Sets [Builder.gain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gain] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun gain(gain: JsonField<Double>) = apply { this.gain = gain }

            /** ID of the UDL Elset of the Space Object under observation. */
            fun idElset(idElset: String) = idElset(JsonField.of(idElset))

            /**
             * Sets [Builder.idElset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idElset] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idElset(idElset: JsonField<String>) = apply { this.idElset = idElset }

            /** Unique identifier of the target on-orbit object, if correlated. */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

            /** ID of the observing sensor. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

            /**
             * Line of sight declination at observation set detection end time. Specified in
             * degrees, in the specified referenceFrame. If referenceFrame is null then J2K should
             * be assumed (e.g -30 to 130.0).
             */
            fun losDeclinationEnd(losDeclinationEnd: Double) =
                losDeclinationEnd(JsonField.of(losDeclinationEnd))

            /**
             * Sets [Builder.losDeclinationEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.losDeclinationEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun losDeclinationEnd(losDeclinationEnd: JsonField<Double>) = apply {
                this.losDeclinationEnd = losDeclinationEnd
            }

            /**
             * Line of sight declination at observation set detection start time. Specified in
             * degrees, in the specified referenceFrame. If referenceFrame is null then J2K should
             * be assumed (e.g -30 to 130.0).
             */
            fun losDeclinationStart(losDeclinationStart: Double) =
                losDeclinationStart(JsonField.of(losDeclinationStart))

            /**
             * Sets [Builder.losDeclinationStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.losDeclinationStart] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun losDeclinationStart(losDeclinationStart: JsonField<Double>) = apply {
                this.losDeclinationStart = losDeclinationStart
            }

            /** SOI msgCreateDate time in ISO 8601 UTC time, with millisecond precision. */
            fun msgCreateDate(msgCreateDate: OffsetDateTime) =
                msgCreateDate(JsonField.of(msgCreateDate))

            /**
             * Sets [Builder.msgCreateDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgCreateDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun msgCreateDate(msgCreateDate: JsonField<OffsetDateTime>) = apply {
                this.msgCreateDate = msgCreateDate
            }

            /** The value is the number of spectral filters used. */
            fun numSpectralFilters(numSpectralFilters: Int) =
                numSpectralFilters(JsonField.of(numSpectralFilters))

            /**
             * Sets [Builder.numSpectralFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numSpectralFilters] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numSpectralFilters(numSpectralFilters: JsonField<Int>) = apply {
                this.numSpectralFilters = numSpectralFilters
            }

            /** OpticalSOIObservations associated with this SOIObservationSet. */
            fun opticalSoiObservationList(
                opticalSoiObservationList: List<OpticalSoiObservationList>
            ) = opticalSoiObservationList(JsonField.of(opticalSoiObservationList))

            /**
             * Sets [Builder.opticalSoiObservationList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.opticalSoiObservationList] with a well-typed
             * `List<OpticalSoiObservationList>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun opticalSoiObservationList(
                opticalSoiObservationList: JsonField<List<OpticalSoiObservationList>>
            ) = apply {
                this.opticalSoiObservationList =
                    opticalSoiObservationList.map { it.toMutableList() }
            }

            /**
             * Adds a single [OpticalSoiObservationList] to [Builder.opticalSoiObservationList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOpticalSoiObservationList(opticalSoiObservationList: OpticalSoiObservationList) =
                apply {
                    this.opticalSoiObservationList =
                        (this.opticalSoiObservationList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("opticalSoiObservationList", it)
                                .add(opticalSoiObservationList)
                        }
                }

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
             * Optional identifier provided by observation source to indicate the target onorbit
             * object of this observation. This may be an internal identifier and not necessarily a
             * valid satellite number.
             */
            fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

            /**
             * Sets [Builder.origObjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origObjectId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origObjectId(origObjectId: JsonField<String>) = apply {
                this.origObjectId = origObjectId
            }

            /**
             * Optional identifier provided by the record source to indicate the sensor identifier
             * to which this attitude set applies if this set is reporting a single sensor
             * orientation. This may be an internal identifier and not necessarily a valid sensor
             * ID.
             */
            fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

            /**
             * Sets [Builder.origSensorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSensorId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSensorId(origSensorId: JsonField<String>) = apply {
                this.origSensorId = origSensorId
            }

            /**
             * A threshold for percent of pixels that make up object signal that are beyond the
             * saturation point for the sensor that are removed in the EOSSA file, in range of 0
             * to 1.
             */
            fun percentSatThreshold(percentSatThreshold: Double) =
                percentSatThreshold(JsonField.of(percentSatThreshold))

            /**
             * Sets [Builder.percentSatThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.percentSatThreshold] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun percentSatThreshold(percentSatThreshold: JsonField<Double>) = apply {
                this.percentSatThreshold = percentSatThreshold
            }

            /**
             * Boolean indicating if a periodicity change event was detected, based on historical
             * collection data for the object.
             */
            fun periodicityChangeDetected(periodicityChangeDetected: Boolean) =
                periodicityChangeDetected(JsonField.of(periodicityChangeDetected))

            /**
             * Sets [Builder.periodicityChangeDetected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodicityChangeDetected] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun periodicityChangeDetected(periodicityChangeDetected: JsonField<Boolean>) = apply {
                this.periodicityChangeDetected = periodicityChangeDetected
            }

            /**
             * Qualitative assessment of the periodicity detection results from the Attitude and
             * Shape Retrieval (ASR) Periodicity Assessment (PA) Tool (e.g. HIGH, MEDIUM, LOW).
             */
            fun periodicityDetectionConf(periodicityDetectionConf: String) =
                periodicityDetectionConf(JsonField.of(periodicityDetectionConf))

            /**
             * Sets [Builder.periodicityDetectionConf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodicityDetectionConf] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodicityDetectionConf(periodicityDetectionConf: JsonField<String>) = apply {
                this.periodicityDetectionConf = periodicityDetectionConf
            }

            /**
             * Qualitative Periodicity Sampling assessment, with respect to confidence of detecting
             * a change event (e.g. HIGH, MEDIUM, LOW).
             */
            fun periodicitySamplingConf(periodicitySamplingConf: String) =
                periodicitySamplingConf(JsonField.of(periodicitySamplingConf))

            /**
             * Sets [Builder.periodicitySamplingConf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.periodicitySamplingConf] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun periodicitySamplingConf(periodicitySamplingConf: JsonField<String>) = apply {
                this.periodicitySamplingConf = periodicitySamplingConf
            }

            /** Pixel array size (height) in pixels. */
            fun pixelArrayHeight(pixelArrayHeight: Int) =
                pixelArrayHeight(JsonField.of(pixelArrayHeight))

            /**
             * Sets [Builder.pixelArrayHeight] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pixelArrayHeight] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pixelArrayHeight(pixelArrayHeight: JsonField<Int>) = apply {
                this.pixelArrayHeight = pixelArrayHeight
            }

            /** Pixel array size (width) in pixels. */
            fun pixelArrayWidth(pixelArrayWidth: Int) =
                pixelArrayWidth(JsonField.of(pixelArrayWidth))

            /**
             * Sets [Builder.pixelArrayWidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pixelArrayWidth] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pixelArrayWidth(pixelArrayWidth: JsonField<Int>) = apply {
                this.pixelArrayWidth = pixelArrayWidth
            }

            /** The maximum valid pixel value. */
            fun pixelMax(pixelMax: Int) = pixelMax(JsonField.of(pixelMax))

            /**
             * Sets [Builder.pixelMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pixelMax] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pixelMax(pixelMax: JsonField<Int>) = apply { this.pixelMax = pixelMax }

            /** The minimum valid pixel value. */
            fun pixelMin(pixelMin: Int) = pixelMin(JsonField.of(pixelMin))

            /**
             * Sets [Builder.pixelMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pixelMin] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pixelMin(pixelMin: JsonField<Int>) = apply { this.pixelMin = pixelMin }

            /**
             * Pointing angle of the Azimuth gimbal/mount at observation set detection end time.
             * Specified in degrees.
             */
            fun pointingAngleAzEnd(pointingAngleAzEnd: Double) =
                pointingAngleAzEnd(JsonField.of(pointingAngleAzEnd))

            /**
             * Sets [Builder.pointingAngleAzEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointingAngleAzEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointingAngleAzEnd(pointingAngleAzEnd: JsonField<Double>) = apply {
                this.pointingAngleAzEnd = pointingAngleAzEnd
            }

            /**
             * Pointing angle of the Azimuth gimbal/mount at observation set detection start time.
             * Specified in degrees.
             */
            fun pointingAngleAzStart(pointingAngleAzStart: Double) =
                pointingAngleAzStart(JsonField.of(pointingAngleAzStart))

            /**
             * Sets [Builder.pointingAngleAzStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointingAngleAzStart] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pointingAngleAzStart(pointingAngleAzStart: JsonField<Double>) = apply {
                this.pointingAngleAzStart = pointingAngleAzStart
            }

            /**
             * Pointing angle of the Elevation gimbal/mount at observation set detection end time.
             * Specified in degrees.
             */
            fun pointingAngleElEnd(pointingAngleElEnd: Double) =
                pointingAngleElEnd(JsonField.of(pointingAngleElEnd))

            /**
             * Sets [Builder.pointingAngleElEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointingAngleElEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointingAngleElEnd(pointingAngleElEnd: JsonField<Double>) = apply {
                this.pointingAngleElEnd = pointingAngleElEnd
            }

            /**
             * Pointing angle of the Elevation gimbal/mount at observation set detection start time.
             * Specified in degrees.
             */
            fun pointingAngleElStart(pointingAngleElStart: Double) =
                pointingAngleElStart(JsonField.of(pointingAngleElStart))

            /**
             * Sets [Builder.pointingAngleElStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointingAngleElStart] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pointingAngleElStart(pointingAngleElStart: JsonField<Double>) = apply {
                this.pointingAngleElStart = pointingAngleElStart
            }

            /** Polar angle of the gimbal/mount at observation set detection end time in degrees. */
            fun polarAngleEnd(polarAngleEnd: Double) = polarAngleEnd(JsonField.of(polarAngleEnd))

            /**
             * Sets [Builder.polarAngleEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polarAngleEnd] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun polarAngleEnd(polarAngleEnd: JsonField<Double>) = apply {
                this.polarAngleEnd = polarAngleEnd
            }

            /**
             * Polar angle of the gimbal/mount at observation set detection start time in degrees.
             */
            fun polarAngleStart(polarAngleStart: Double) =
                polarAngleStart(JsonField.of(polarAngleStart))

            /**
             * Sets [Builder.polarAngleStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polarAngleStart] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun polarAngleStart(polarAngleStart: JsonField<Double>) = apply {
                this.polarAngleStart = polarAngleStart
            }

            /** RadarSOIObservations associated with this RadarSOIObservationSet. */
            fun radarSoiObservationList(radarSoiObservationList: List<RadarSoiObservationList>) =
                radarSoiObservationList(JsonField.of(radarSoiObservationList))

            /**
             * Sets [Builder.radarSoiObservationList] to an arbitrary JSON value.
             *
             * You should usually call [Builder.radarSoiObservationList] with a well-typed
             * `List<RadarSoiObservationList>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun radarSoiObservationList(
                radarSoiObservationList: JsonField<List<RadarSoiObservationList>>
            ) = apply {
                this.radarSoiObservationList = radarSoiObservationList.map { it.toMutableList() }
            }

            /**
             * Adds a single [RadarSoiObservationList] to [Builder.radarSoiObservationList].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRadarSoiObservationList(radarSoiObservationList: RadarSoiObservationList) =
                apply {
                    this.radarSoiObservationList =
                        (this.radarSoiObservationList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("radarSoiObservationList", it).add(radarSoiObservationList)
                        }
                }

            /**
             * The reference frame of the observation measurements. If the referenceFrame is null it
             * is assumed to be J2000.
             */
            fun referenceFrame(referenceFrame: ReferenceFrame) =
                referenceFrame(JsonField.of(referenceFrame))

            /**
             * Sets [Builder.referenceFrame] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceFrame] with a well-typed [ReferenceFrame]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun referenceFrame(referenceFrame: JsonField<ReferenceFrame>) = apply {
                this.referenceFrame = referenceFrame
            }

            /** Name of the target satellite. */
            fun satelliteName(satelliteName: String) = satelliteName(JsonField.of(satelliteName))

            /**
             * Sets [Builder.satelliteName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.satelliteName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun satelliteName(satelliteName: JsonField<String>) = apply {
                this.satelliteName = satelliteName
            }

            /** Satellite/catalog number of the target on-orbit object. */
            fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

            /**
             * Sets [Builder.satNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

            /** Sensor altitude at startTime (if mobile/onorbit) in kilometers. */
            fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

            /**
             * Sets [Builder.senalt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senalt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senalt(senalt: JsonField<Double>) = apply { this.senalt = senalt }

            /**
             * Sensor WGS84 latitude at startTime (if mobile/onorbit) in degrees. If null, can be
             * obtained from sensor info. -90 to 90 degrees (negative values south of equator).
             */
            fun senlat(senlat: Double) = senlat(JsonField.of(senlat))

            /**
             * Sets [Builder.senlat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senlat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senlat(senlat: JsonField<Double>) = apply { this.senlat = senlat }

            /**
             * Sensor WGS84 longitude at startTime (if mobile/onorbit) in degrees. If null, can be
             * obtained from sensor info. -180 to 180 degrees (negative values south of equator).
             */
            fun senlon(senlon: Double) = senlon(JsonField.of(senlon))

            /**
             * Sets [Builder.senlon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senlon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senlon(senlon: JsonField<Double>) = apply { this.senlon = senlon }

            /**
             * The reference frame of the observing sensor state. If the senReferenceFrame is null
             * it is assumed to be J2000.
             */
            fun senReferenceFrame(senReferenceFrame: SenReferenceFrame) =
                senReferenceFrame(JsonField.of(senReferenceFrame))

            /**
             * Sets [Builder.senReferenceFrame] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senReferenceFrame] with a well-typed
             * [SenReferenceFrame] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun senReferenceFrame(senReferenceFrame: JsonField<SenReferenceFrame>) = apply {
                this.senReferenceFrame = senReferenceFrame
            }

            /** ID of the AttitudeSet record for the observing sensor. */
            fun sensorAsId(sensorAsId: String) = sensorAsId(JsonField.of(sensorAsId))

            /**
             * Sets [Builder.sensorAsId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensorAsId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensorAsId(sensorAsId: JsonField<String>) = apply { this.sensorAsId = sensorAsId }

            /**
             * Cartesian X velocity of the observing mobile/onorbit sensor at startTime, in
             * kilometers per second, in the specified senReferenceFrame. If senReferenceFrame is
             * null then J2K should be assumed.
             */
            fun senvelx(senvelx: Double) = senvelx(JsonField.of(senvelx))

            /**
             * Sets [Builder.senvelx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senvelx] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senvelx(senvelx: JsonField<Double>) = apply { this.senvelx = senvelx }

            /**
             * Cartesian Y velocity of the observing mobile/onorbit sensor at startTime, in
             * kilometers per second, in the specified senReferenceFrame. If senReferenceFrame is
             * null then J2K should be assumed.
             */
            fun senvely(senvely: Double) = senvely(JsonField.of(senvely))

            /**
             * Sets [Builder.senvely] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senvely] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senvely(senvely: JsonField<Double>) = apply { this.senvely = senvely }

            /**
             * Cartesian Z velocity of the observing mobile/onorbit sensor at startTime, in
             * kilometers per second, in the specified senReferenceFrame. If senReferenceFrame is
             * null then J2K should be assumed.
             */
            fun senvelz(senvelz: Double) = senvelz(JsonField.of(senvelz))

            /**
             * Sets [Builder.senvelz] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senvelz] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senvelz(senvelz: JsonField<Double>) = apply { this.senvelz = senvelz }

            /**
             * Cartesian X position of the observing mobile/onorbit sensor at startTime, in
             * kilometers, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
             * should be assumed.
             */
            fun senx(senx: Double) = senx(JsonField.of(senx))

            /**
             * Sets [Builder.senx] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senx] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun senx(senx: JsonField<Double>) = apply { this.senx = senx }

            /**
             * Cartesian Y position of the observing mobile/onorbit sensor at startTime, in
             * kilometers, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
             * should be assumed.
             */
            fun seny(seny: Double) = seny(JsonField.of(seny))

            /**
             * Sets [Builder.seny] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seny] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun seny(seny: JsonField<Double>) = apply { this.seny = seny }

            /**
             * Cartesian Z position of the observing mobile/onorbit sensor at startTime, in
             * kilometers, in the specified senReferenceFrame. If senReferenceFrame is null then J2K
             * should be assumed.
             */
            fun senz(senz: Double) = senz(JsonField.of(senz))

            /**
             * Sets [Builder.senz] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senz] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun senz(senz: JsonField<Double>) = apply { this.senz = senz }

            /** Software Version used to Capture, Process, and Deliver the data. */
            fun softwareVersion(softwareVersion: String) =
                softwareVersion(JsonField.of(softwareVersion))

            /**
             * Sets [Builder.softwareVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.softwareVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun softwareVersion(softwareVersion: JsonField<String>) = apply {
                this.softwareVersion = softwareVersion
            }

            /** The in-band solar magnitude at 1 A.U. */
            fun solarMag(solarMag: Double) = solarMag(JsonField.of(solarMag))

            /**
             * Sets [Builder.solarMag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solarMag] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun solarMag(solarMag: JsonField<Double>) = apply { this.solarMag = solarMag }

            /**
             * Boolean indicating if a solar phase angle brightness change event was detected, based
             * on historical collection data for the object.
             */
            fun solarPhaseAngleBrightnessChangeDetected(
                solarPhaseAngleBrightnessChangeDetected: Boolean
            ) =
                solarPhaseAngleBrightnessChangeDetected(
                    JsonField.of(solarPhaseAngleBrightnessChangeDetected)
                )

            /**
             * Sets [Builder.solarPhaseAngleBrightnessChangeDetected] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solarPhaseAngleBrightnessChangeDetected] with a
             * well-typed [Boolean] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun solarPhaseAngleBrightnessChangeDetected(
                solarPhaseAngleBrightnessChangeDetected: JsonField<Boolean>
            ) = apply {
                this.solarPhaseAngleBrightnessChangeDetected =
                    solarPhaseAngleBrightnessChangeDetected
            }

            /**
             * The source data library from which this record was received. This could be a remote
             * or tactical UDL or another data library. If null, the record should be assumed to
             * have originated from the primary Enterprise UDL.
             */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

            /**
             * Array of the SpectralFilters keywords, must be present for all values n=1 to
             * numSpectralFilters, in incrementing order of n, and for no other values of n.
             */
            fun spectralFilters(spectralFilters: List<String>) =
                spectralFilters(JsonField.of(spectralFilters))

            /**
             * Sets [Builder.spectralFilters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spectralFilters] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun spectralFilters(spectralFilters: JsonField<List<String>>) = apply {
                this.spectralFilters = spectralFilters.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [spectralFilters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpectralFilter(spectralFilter: String) = apply {
                spectralFilters =
                    (spectralFilters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("spectralFilters", it).add(spectralFilter)
                    }
            }

            /** Name of the Star Catalog used for photometry and astrometry. */
            fun starCatName(starCatName: String) = starCatName(JsonField.of(starCatName))

            /**
             * Sets [Builder.starCatName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.starCatName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun starCatName(starCatName: JsonField<String>) = apply {
                this.starCatName = starCatName
            }

            /**
             * Optional array of provider/source specific tags for this data, where each element is
             * no longer than 32 characters, used for implementing data owner conditional access
             * controls to restrict access to the data. Should be left null by data providers unless
             * conditional access controls are coordinated with the UDL team.
             */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /**
             * Optional identifier to track a commercial or marketplace transaction executed to
             * produce this data.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /**
             * Boolean indicating whether the target object was unable to be correlated to a known
             * object. This flag should only be set to true by data providers after an attempt to
             * correlate to an OnOrbit object was made and failed. If unable to correlate, the
             * 'origObjectId' field may be populated with an internal data provider specific
             * identifier.
             */
            fun uct(uct: Boolean) = uct(JsonField.of(uct))

            /**
             * Sets [Builder.uct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uct] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

            /**
             * Key to indicate which, if any of, the pre/post photometer calibrations are valid for
             * use when generating data for the EOSSA file. If the field is not populated, then the
             * provided calibration data will be used when generating the EOSSA file (e.g. PRE,
             * POST, BOTH, NONE).
             */
            fun validCalibrations(validCalibrations: String) =
                validCalibrations(JsonField.of(validCalibrations))

            /**
             * Sets [Builder.validCalibrations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validCalibrations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validCalibrations(validCalibrations: JsonField<String>) = apply {
                this.validCalibrations = validCalibrations
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .numObs()
             * .source()
             * .startTime()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("numObs", numObs),
                    checkRequired("source", source),
                    checkRequired("startTime", startTime),
                    checkRequired("type", type),
                    id,
                    binningHoriz,
                    binningVert,
                    brightnessVarianceChangeDetected,
                    (calibrations ?: JsonMissing.of()).map { it.toImmutable() },
                    calibrationType,
                    changeConf,
                    changeDetected,
                    collectionDensityConf,
                    collectionId,
                    collectionMode,
                    corrQuality,
                    createdAt,
                    createdBy,
                    endTime,
                    gain,
                    idElset,
                    idOnOrbit,
                    idSensor,
                    losDeclinationEnd,
                    losDeclinationStart,
                    msgCreateDate,
                    numSpectralFilters,
                    (opticalSoiObservationList ?: JsonMissing.of()).map { it.toImmutable() },
                    origin,
                    origNetwork,
                    origObjectId,
                    origSensorId,
                    percentSatThreshold,
                    periodicityChangeDetected,
                    periodicityDetectionConf,
                    periodicitySamplingConf,
                    pixelArrayHeight,
                    pixelArrayWidth,
                    pixelMax,
                    pixelMin,
                    pointingAngleAzEnd,
                    pointingAngleAzStart,
                    pointingAngleElEnd,
                    pointingAngleElStart,
                    polarAngleEnd,
                    polarAngleStart,
                    (radarSoiObservationList ?: JsonMissing.of()).map { it.toImmutable() },
                    referenceFrame,
                    satelliteName,
                    satNo,
                    senalt,
                    senlat,
                    senlon,
                    senReferenceFrame,
                    sensorAsId,
                    senvelx,
                    senvely,
                    senvelz,
                    senx,
                    seny,
                    senz,
                    softwareVersion,
                    solarMag,
                    solarPhaseAngleBrightnessChangeDetected,
                    sourceDl,
                    (spectralFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    starCatName,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    transactionId,
                    uct,
                    validCalibrations,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            numObs()
            source()
            startTime()
            type().validate()
            id()
            binningHoriz()
            binningVert()
            brightnessVarianceChangeDetected()
            calibrations().ifPresent { it.forEach { it.validate() } }
            calibrationType()
            changeConf()
            changeDetected()
            collectionDensityConf()
            collectionId()
            collectionMode()
            corrQuality()
            createdAt()
            createdBy()
            endTime()
            gain()
            idElset()
            idOnOrbit()
            idSensor()
            losDeclinationEnd()
            losDeclinationStart()
            msgCreateDate()
            numSpectralFilters()
            opticalSoiObservationList().ifPresent { it.forEach { it.validate() } }
            origin()
            origNetwork()
            origObjectId()
            origSensorId()
            percentSatThreshold()
            periodicityChangeDetected()
            periodicityDetectionConf()
            periodicitySamplingConf()
            pixelArrayHeight()
            pixelArrayWidth()
            pixelMax()
            pixelMin()
            pointingAngleAzEnd()
            pointingAngleAzStart()
            pointingAngleElEnd()
            pointingAngleElStart()
            polarAngleEnd()
            polarAngleStart()
            radarSoiObservationList().ifPresent { it.forEach { it.validate() } }
            referenceFrame().ifPresent { it.validate() }
            satelliteName()
            satNo()
            senalt()
            senlat()
            senlon()
            senReferenceFrame().ifPresent { it.validate() }
            sensorAsId()
            senvelx()
            senvely()
            senvelz()
            senx()
            seny()
            senz()
            softwareVersion()
            solarMag()
            solarPhaseAngleBrightnessChangeDetected()
            sourceDl()
            spectralFilters()
            starCatName()
            tags()
            transactionId()
            uct()
            validCalibrations()
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
                (if (numObs.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (binningHoriz.asKnown().isPresent) 1 else 0) +
                (if (binningVert.asKnown().isPresent) 1 else 0) +
                (if (brightnessVarianceChangeDetected.asKnown().isPresent) 1 else 0) +
                (calibrations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (calibrationType.asKnown().isPresent) 1 else 0) +
                (if (changeConf.asKnown().isPresent) 1 else 0) +
                (if (changeDetected.asKnown().isPresent) 1 else 0) +
                (if (collectionDensityConf.asKnown().isPresent) 1 else 0) +
                (if (collectionId.asKnown().isPresent) 1 else 0) +
                (if (collectionMode.asKnown().isPresent) 1 else 0) +
                (if (corrQuality.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (gain.asKnown().isPresent) 1 else 0) +
                (if (idElset.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (losDeclinationEnd.asKnown().isPresent) 1 else 0) +
                (if (losDeclinationStart.asKnown().isPresent) 1 else 0) +
                (if (msgCreateDate.asKnown().isPresent) 1 else 0) +
                (if (numSpectralFilters.asKnown().isPresent) 1 else 0) +
                (opticalSoiObservationList.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (if (percentSatThreshold.asKnown().isPresent) 1 else 0) +
                (if (periodicityChangeDetected.asKnown().isPresent) 1 else 0) +
                (if (periodicityDetectionConf.asKnown().isPresent) 1 else 0) +
                (if (periodicitySamplingConf.asKnown().isPresent) 1 else 0) +
                (if (pixelArrayHeight.asKnown().isPresent) 1 else 0) +
                (if (pixelArrayWidth.asKnown().isPresent) 1 else 0) +
                (if (pixelMax.asKnown().isPresent) 1 else 0) +
                (if (pixelMin.asKnown().isPresent) 1 else 0) +
                (if (pointingAngleAzEnd.asKnown().isPresent) 1 else 0) +
                (if (pointingAngleAzStart.asKnown().isPresent) 1 else 0) +
                (if (pointingAngleElEnd.asKnown().isPresent) 1 else 0) +
                (if (pointingAngleElStart.asKnown().isPresent) 1 else 0) +
                (if (polarAngleEnd.asKnown().isPresent) 1 else 0) +
                (if (polarAngleStart.asKnown().isPresent) 1 else 0) +
                (radarSoiObservationList.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
                (if (satelliteName.asKnown().isPresent) 1 else 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (if (senalt.asKnown().isPresent) 1 else 0) +
                (if (senlat.asKnown().isPresent) 1 else 0) +
                (if (senlon.asKnown().isPresent) 1 else 0) +
                (senReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
                (if (sensorAsId.asKnown().isPresent) 1 else 0) +
                (if (senvelx.asKnown().isPresent) 1 else 0) +
                (if (senvely.asKnown().isPresent) 1 else 0) +
                (if (senvelz.asKnown().isPresent) 1 else 0) +
                (if (senx.asKnown().isPresent) 1 else 0) +
                (if (seny.asKnown().isPresent) 1 else 0) +
                (if (senz.asKnown().isPresent) 1 else 0) +
                (if (softwareVersion.asKnown().isPresent) 1 else 0) +
                (if (solarMag.asKnown().isPresent) 1 else 0) +
                (if (solarPhaseAngleBrightnessChangeDetected.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (spectralFilters.asKnown().getOrNull()?.size ?: 0) +
                (if (starCatName.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0) +
                (if (uct.asKnown().isPresent) 1 else 0) +
                (if (validCalibrations.asKnown().isPresent) 1 else 0)

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

        /** Observation type (OPTICAL, RADAR). */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val OPTICAL = of("OPTICAL")

                @JvmField val RADAR = of("RADAR")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OPTICAL,
                RADAR,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OPTICAL,
                RADAR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    OPTICAL -> Value.OPTICAL
                    RADAR -> Value.RADAR
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
                    OPTICAL -> Known.OPTICAL
                    RADAR -> Known.RADAR
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Schema for SOI Calibration data. */
        class Calibration
        private constructor(
            private val calBgIntensity: JsonField<Double>,
            private val calExtinctionCoeff: JsonField<Double>,
            private val calExtinctionCoeffMaxUnc: JsonField<Double>,
            private val calExtinctionCoeffUnc: JsonField<Double>,
            private val calNumCorrelatedStars: JsonField<Int>,
            private val calNumDetectedStars: JsonField<Int>,
            private val calSkyBg: JsonField<Double>,
            private val calSpectralFilterSolarMag: JsonField<Double>,
            private val calTime: JsonField<OffsetDateTime>,
            private val calType: JsonField<String>,
            private val calZeroPoint: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("calBgIntensity")
                @ExcludeMissing
                calBgIntensity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("calExtinctionCoeff")
                @ExcludeMissing
                calExtinctionCoeff: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("calExtinctionCoeffMaxUnc")
                @ExcludeMissing
                calExtinctionCoeffMaxUnc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("calExtinctionCoeffUnc")
                @ExcludeMissing
                calExtinctionCoeffUnc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("calNumCorrelatedStars")
                @ExcludeMissing
                calNumCorrelatedStars: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("calNumDetectedStars")
                @ExcludeMissing
                calNumDetectedStars: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("calSkyBg")
                @ExcludeMissing
                calSkyBg: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("calSpectralFilterSolarMag")
                @ExcludeMissing
                calSpectralFilterSolarMag: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("calTime")
                @ExcludeMissing
                calTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("calType")
                @ExcludeMissing
                calType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("calZeroPoint")
                @ExcludeMissing
                calZeroPoint: JsonField<Double> = JsonMissing.of(),
            ) : this(
                calBgIntensity,
                calExtinctionCoeff,
                calExtinctionCoeffMaxUnc,
                calExtinctionCoeffUnc,
                calNumCorrelatedStars,
                calNumDetectedStars,
                calSkyBg,
                calSpectralFilterSolarMag,
                calTime,
                calType,
                calZeroPoint,
                mutableMapOf(),
            )

            /**
             * Background intensity, at calibration, specified in kilowatts per steradian per
             * micrometer.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calBgIntensity(): Optional<Double> = calBgIntensity.getOptional("calBgIntensity")

            /**
             * Coefficient value for how much signal would be lost to atmospheric attenuation for a
             * star at zenith, in magnitudes per air mass.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calExtinctionCoeff(): Optional<Double> =
                calExtinctionCoeff.getOptional("calExtinctionCoeff")

            /**
             * Maximum extinction coefficient uncertainty in magnitudes, at calibration (e.g. -5.0
             * to 30.0).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calExtinctionCoeffMaxUnc(): Optional<Double> =
                calExtinctionCoeffMaxUnc.getOptional("calExtinctionCoeffMaxUnc")

            /**
             * Extinction coefficient uncertainty in magnitudes, at calibration, which represents
             * the difference between the measured brightness and predicted brightness of the star
             * with the extinction removed, making it exo-atmospheric (e.g. -5.0 to 30.0).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calExtinctionCoeffUnc(): Optional<Double> =
                calExtinctionCoeffUnc.getOptional("calExtinctionCoeffUnc")

            /**
             * Number of correlated stars in the FOV with the target object, at calibration. Can be
             * 0 for narrow FOV sensors.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calNumCorrelatedStars(): Optional<Int> =
                calNumCorrelatedStars.getOptional("calNumCorrelatedStars")

            /**
             * Number of detected stars in the FOV with the target object, at calibration. Helps
             * identify frames with clouds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calNumDetectedStars(): Optional<Int> =
                calNumDetectedStars.getOptional("calNumDetectedStars")

            /**
             * Average Sky Background signals in magnitudes, at calibration. Sky Background refers
             * to the incoming light from an apparently empty part of the night sky.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calSkyBg(): Optional<Double> = calSkyBg.getOptional("calSkyBg")

            /**
             * In-band solar magnitudes at 1 A.U, at calibration (e.g. -5.0 to 30.0).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calSpectralFilterSolarMag(): Optional<Double> =
                calSpectralFilterSolarMag.getOptional("calSpectralFilterSolarMag")

            /**
             * Start time of calibration in ISO 8601 UTC time, with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calTime(): Optional<OffsetDateTime> = calTime.getOptional("calTime")

            /**
             * Type of calibration (e.g. PRE, MID, POST).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calType(): Optional<String> = calType.getOptional("calType")

            /**
             * Value representing the difference between the catalog magnitude and instrumental
             * magnitude for a set of standard stars, at calibration (e.g. -5.0 to 30.0).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun calZeroPoint(): Optional<Double> = calZeroPoint.getOptional("calZeroPoint")

            /**
             * Returns the raw JSON value of [calBgIntensity].
             *
             * Unlike [calBgIntensity], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("calBgIntensity")
            @ExcludeMissing
            fun _calBgIntensity(): JsonField<Double> = calBgIntensity

            /**
             * Returns the raw JSON value of [calExtinctionCoeff].
             *
             * Unlike [calExtinctionCoeff], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("calExtinctionCoeff")
            @ExcludeMissing
            fun _calExtinctionCoeff(): JsonField<Double> = calExtinctionCoeff

            /**
             * Returns the raw JSON value of [calExtinctionCoeffMaxUnc].
             *
             * Unlike [calExtinctionCoeffMaxUnc], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("calExtinctionCoeffMaxUnc")
            @ExcludeMissing
            fun _calExtinctionCoeffMaxUnc(): JsonField<Double> = calExtinctionCoeffMaxUnc

            /**
             * Returns the raw JSON value of [calExtinctionCoeffUnc].
             *
             * Unlike [calExtinctionCoeffUnc], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("calExtinctionCoeffUnc")
            @ExcludeMissing
            fun _calExtinctionCoeffUnc(): JsonField<Double> = calExtinctionCoeffUnc

            /**
             * Returns the raw JSON value of [calNumCorrelatedStars].
             *
             * Unlike [calNumCorrelatedStars], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("calNumCorrelatedStars")
            @ExcludeMissing
            fun _calNumCorrelatedStars(): JsonField<Int> = calNumCorrelatedStars

            /**
             * Returns the raw JSON value of [calNumDetectedStars].
             *
             * Unlike [calNumDetectedStars], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("calNumDetectedStars")
            @ExcludeMissing
            fun _calNumDetectedStars(): JsonField<Int> = calNumDetectedStars

            /**
             * Returns the raw JSON value of [calSkyBg].
             *
             * Unlike [calSkyBg], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("calSkyBg") @ExcludeMissing fun _calSkyBg(): JsonField<Double> = calSkyBg

            /**
             * Returns the raw JSON value of [calSpectralFilterSolarMag].
             *
             * Unlike [calSpectralFilterSolarMag], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("calSpectralFilterSolarMag")
            @ExcludeMissing
            fun _calSpectralFilterSolarMag(): JsonField<Double> = calSpectralFilterSolarMag

            /**
             * Returns the raw JSON value of [calTime].
             *
             * Unlike [calTime], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("calTime")
            @ExcludeMissing
            fun _calTime(): JsonField<OffsetDateTime> = calTime

            /**
             * Returns the raw JSON value of [calType].
             *
             * Unlike [calType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("calType") @ExcludeMissing fun _calType(): JsonField<String> = calType

            /**
             * Returns the raw JSON value of [calZeroPoint].
             *
             * Unlike [calZeroPoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("calZeroPoint")
            @ExcludeMissing
            fun _calZeroPoint(): JsonField<Double> = calZeroPoint

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

                /** Returns a mutable builder for constructing an instance of [Calibration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Calibration]. */
            class Builder internal constructor() {

                private var calBgIntensity: JsonField<Double> = JsonMissing.of()
                private var calExtinctionCoeff: JsonField<Double> = JsonMissing.of()
                private var calExtinctionCoeffMaxUnc: JsonField<Double> = JsonMissing.of()
                private var calExtinctionCoeffUnc: JsonField<Double> = JsonMissing.of()
                private var calNumCorrelatedStars: JsonField<Int> = JsonMissing.of()
                private var calNumDetectedStars: JsonField<Int> = JsonMissing.of()
                private var calSkyBg: JsonField<Double> = JsonMissing.of()
                private var calSpectralFilterSolarMag: JsonField<Double> = JsonMissing.of()
                private var calTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var calType: JsonField<String> = JsonMissing.of()
                private var calZeroPoint: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(calibration: Calibration) = apply {
                    calBgIntensity = calibration.calBgIntensity
                    calExtinctionCoeff = calibration.calExtinctionCoeff
                    calExtinctionCoeffMaxUnc = calibration.calExtinctionCoeffMaxUnc
                    calExtinctionCoeffUnc = calibration.calExtinctionCoeffUnc
                    calNumCorrelatedStars = calibration.calNumCorrelatedStars
                    calNumDetectedStars = calibration.calNumDetectedStars
                    calSkyBg = calibration.calSkyBg
                    calSpectralFilterSolarMag = calibration.calSpectralFilterSolarMag
                    calTime = calibration.calTime
                    calType = calibration.calType
                    calZeroPoint = calibration.calZeroPoint
                    additionalProperties = calibration.additionalProperties.toMutableMap()
                }

                /**
                 * Background intensity, at calibration, specified in kilowatts per steradian per
                 * micrometer.
                 */
                fun calBgIntensity(calBgIntensity: Double) =
                    calBgIntensity(JsonField.of(calBgIntensity))

                /**
                 * Sets [Builder.calBgIntensity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calBgIntensity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun calBgIntensity(calBgIntensity: JsonField<Double>) = apply {
                    this.calBgIntensity = calBgIntensity
                }

                /**
                 * Coefficient value for how much signal would be lost to atmospheric attenuation
                 * for a star at zenith, in magnitudes per air mass.
                 */
                fun calExtinctionCoeff(calExtinctionCoeff: Double) =
                    calExtinctionCoeff(JsonField.of(calExtinctionCoeff))

                /**
                 * Sets [Builder.calExtinctionCoeff] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calExtinctionCoeff] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun calExtinctionCoeff(calExtinctionCoeff: JsonField<Double>) = apply {
                    this.calExtinctionCoeff = calExtinctionCoeff
                }

                /**
                 * Maximum extinction coefficient uncertainty in magnitudes, at calibration (e.g.
                 * -5.0 to 30.0).
                 */
                fun calExtinctionCoeffMaxUnc(calExtinctionCoeffMaxUnc: Double) =
                    calExtinctionCoeffMaxUnc(JsonField.of(calExtinctionCoeffMaxUnc))

                /**
                 * Sets [Builder.calExtinctionCoeffMaxUnc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calExtinctionCoeffMaxUnc] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun calExtinctionCoeffMaxUnc(calExtinctionCoeffMaxUnc: JsonField<Double>) = apply {
                    this.calExtinctionCoeffMaxUnc = calExtinctionCoeffMaxUnc
                }

                /**
                 * Extinction coefficient uncertainty in magnitudes, at calibration, which
                 * represents the difference between the measured brightness and predicted
                 * brightness of the star with the extinction removed, making it exo-atmospheric
                 * (e.g. -5.0 to 30.0).
                 */
                fun calExtinctionCoeffUnc(calExtinctionCoeffUnc: Double) =
                    calExtinctionCoeffUnc(JsonField.of(calExtinctionCoeffUnc))

                /**
                 * Sets [Builder.calExtinctionCoeffUnc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calExtinctionCoeffUnc] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun calExtinctionCoeffUnc(calExtinctionCoeffUnc: JsonField<Double>) = apply {
                    this.calExtinctionCoeffUnc = calExtinctionCoeffUnc
                }

                /**
                 * Number of correlated stars in the FOV with the target object, at calibration. Can
                 * be 0 for narrow FOV sensors.
                 */
                fun calNumCorrelatedStars(calNumCorrelatedStars: Int) =
                    calNumCorrelatedStars(JsonField.of(calNumCorrelatedStars))

                /**
                 * Sets [Builder.calNumCorrelatedStars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calNumCorrelatedStars] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun calNumCorrelatedStars(calNumCorrelatedStars: JsonField<Int>) = apply {
                    this.calNumCorrelatedStars = calNumCorrelatedStars
                }

                /**
                 * Number of detected stars in the FOV with the target object, at calibration. Helps
                 * identify frames with clouds.
                 */
                fun calNumDetectedStars(calNumDetectedStars: Int) =
                    calNumDetectedStars(JsonField.of(calNumDetectedStars))

                /**
                 * Sets [Builder.calNumDetectedStars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calNumDetectedStars] with a well-typed [Int]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun calNumDetectedStars(calNumDetectedStars: JsonField<Int>) = apply {
                    this.calNumDetectedStars = calNumDetectedStars
                }

                /**
                 * Average Sky Background signals in magnitudes, at calibration. Sky Background
                 * refers to the incoming light from an apparently empty part of the night sky.
                 */
                fun calSkyBg(calSkyBg: Double) = calSkyBg(JsonField.of(calSkyBg))

                /**
                 * Sets [Builder.calSkyBg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calSkyBg] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun calSkyBg(calSkyBg: JsonField<Double>) = apply { this.calSkyBg = calSkyBg }

                /** In-band solar magnitudes at 1 A.U, at calibration (e.g. -5.0 to 30.0). */
                fun calSpectralFilterSolarMag(calSpectralFilterSolarMag: Double) =
                    calSpectralFilterSolarMag(JsonField.of(calSpectralFilterSolarMag))

                /**
                 * Sets [Builder.calSpectralFilterSolarMag] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calSpectralFilterSolarMag] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun calSpectralFilterSolarMag(calSpectralFilterSolarMag: JsonField<Double>) =
                    apply {
                        this.calSpectralFilterSolarMag = calSpectralFilterSolarMag
                    }

                /** Start time of calibration in ISO 8601 UTC time, with millisecond precision. */
                fun calTime(calTime: OffsetDateTime) = calTime(JsonField.of(calTime))

                /**
                 * Sets [Builder.calTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun calTime(calTime: JsonField<OffsetDateTime>) = apply { this.calTime = calTime }

                /** Type of calibration (e.g. PRE, MID, POST). */
                fun calType(calType: String) = calType(JsonField.of(calType))

                /**
                 * Sets [Builder.calType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun calType(calType: JsonField<String>) = apply { this.calType = calType }

                /**
                 * Value representing the difference between the catalog magnitude and instrumental
                 * magnitude for a set of standard stars, at calibration (e.g. -5.0 to 30.0).
                 */
                fun calZeroPoint(calZeroPoint: Double) = calZeroPoint(JsonField.of(calZeroPoint))

                /**
                 * Sets [Builder.calZeroPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.calZeroPoint] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun calZeroPoint(calZeroPoint: JsonField<Double>) = apply {
                    this.calZeroPoint = calZeroPoint
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
                 * Returns an immutable instance of [Calibration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Calibration =
                    Calibration(
                        calBgIntensity,
                        calExtinctionCoeff,
                        calExtinctionCoeffMaxUnc,
                        calExtinctionCoeffUnc,
                        calNumCorrelatedStars,
                        calNumDetectedStars,
                        calSkyBg,
                        calSpectralFilterSolarMag,
                        calTime,
                        calType,
                        calZeroPoint,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Calibration = apply {
                if (validated) {
                    return@apply
                }

                calBgIntensity()
                calExtinctionCoeff()
                calExtinctionCoeffMaxUnc()
                calExtinctionCoeffUnc()
                calNumCorrelatedStars()
                calNumDetectedStars()
                calSkyBg()
                calSpectralFilterSolarMag()
                calTime()
                calType()
                calZeroPoint()
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
                (if (calBgIntensity.asKnown().isPresent) 1 else 0) +
                    (if (calExtinctionCoeff.asKnown().isPresent) 1 else 0) +
                    (if (calExtinctionCoeffMaxUnc.asKnown().isPresent) 1 else 0) +
                    (if (calExtinctionCoeffUnc.asKnown().isPresent) 1 else 0) +
                    (if (calNumCorrelatedStars.asKnown().isPresent) 1 else 0) +
                    (if (calNumDetectedStars.asKnown().isPresent) 1 else 0) +
                    (if (calSkyBg.asKnown().isPresent) 1 else 0) +
                    (if (calSpectralFilterSolarMag.asKnown().isPresent) 1 else 0) +
                    (if (calTime.asKnown().isPresent) 1 else 0) +
                    (if (calType.asKnown().isPresent) 1 else 0) +
                    (if (calZeroPoint.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Calibration &&
                    calBgIntensity == other.calBgIntensity &&
                    calExtinctionCoeff == other.calExtinctionCoeff &&
                    calExtinctionCoeffMaxUnc == other.calExtinctionCoeffMaxUnc &&
                    calExtinctionCoeffUnc == other.calExtinctionCoeffUnc &&
                    calNumCorrelatedStars == other.calNumCorrelatedStars &&
                    calNumDetectedStars == other.calNumDetectedStars &&
                    calSkyBg == other.calSkyBg &&
                    calSpectralFilterSolarMag == other.calSpectralFilterSolarMag &&
                    calTime == other.calTime &&
                    calType == other.calType &&
                    calZeroPoint == other.calZeroPoint &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    calBgIntensity,
                    calExtinctionCoeff,
                    calExtinctionCoeffMaxUnc,
                    calExtinctionCoeffUnc,
                    calNumCorrelatedStars,
                    calNumDetectedStars,
                    calSkyBg,
                    calSpectralFilterSolarMag,
                    calTime,
                    calType,
                    calZeroPoint,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Calibration{calBgIntensity=$calBgIntensity, calExtinctionCoeff=$calExtinctionCoeff, calExtinctionCoeffMaxUnc=$calExtinctionCoeffMaxUnc, calExtinctionCoeffUnc=$calExtinctionCoeffUnc, calNumCorrelatedStars=$calNumCorrelatedStars, calNumDetectedStars=$calNumDetectedStars, calSkyBg=$calSkyBg, calSpectralFilterSolarMag=$calSpectralFilterSolarMag, calTime=$calTime, calType=$calType, calZeroPoint=$calZeroPoint, additionalProperties=$additionalProperties}"
        }

        /**
         * An Optical SOI record contains observation information taken from a sensor about a Space
         * Object.
         */
        class OpticalSoiObservationList
        private constructor(
            private val obStartTime: JsonField<OffsetDateTime>,
            private val currentSpectralFilterNum: JsonField<Long>,
            private val declinations: JsonField<List<Double>>,
            private val expDuration: JsonField<Double>,
            private val extinctionCoeffs: JsonField<List<Double>>,
            private val extinctionCoeffsUnc: JsonField<List<Double>>,
            private val intensities: JsonField<List<Double>>,
            private val intensityTimes: JsonField<List<OffsetDateTime>>,
            private val localSkyBgs: JsonField<List<Double>>,
            private val localSkyBgsUnc: JsonField<List<Double>>,
            private val numCorrelatedStars: JsonField<List<Int>>,
            private val numDetectedStars: JsonField<List<Int>>,
            private val percentSats: JsonField<List<Double>>,
            private val raRates: JsonField<List<Double>>,
            private val ras: JsonField<List<Double>>,
            private val skyBgs: JsonField<List<Double>>,
            private val zeroPoints: JsonField<List<Double>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("obStartTime")
                @ExcludeMissing
                obStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currentSpectralFilterNum")
                @ExcludeMissing
                currentSpectralFilterNum: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("declinations")
                @ExcludeMissing
                declinations: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("expDuration")
                @ExcludeMissing
                expDuration: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("extinctionCoeffs")
                @ExcludeMissing
                extinctionCoeffs: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("extinctionCoeffsUnc")
                @ExcludeMissing
                extinctionCoeffsUnc: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("intensities")
                @ExcludeMissing
                intensities: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("intensityTimes")
                @ExcludeMissing
                intensityTimes: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
                @JsonProperty("localSkyBgs")
                @ExcludeMissing
                localSkyBgs: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("localSkyBgsUnc")
                @ExcludeMissing
                localSkyBgsUnc: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("numCorrelatedStars")
                @ExcludeMissing
                numCorrelatedStars: JsonField<List<Int>> = JsonMissing.of(),
                @JsonProperty("numDetectedStars")
                @ExcludeMissing
                numDetectedStars: JsonField<List<Int>> = JsonMissing.of(),
                @JsonProperty("percentSats")
                @ExcludeMissing
                percentSats: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("raRates")
                @ExcludeMissing
                raRates: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("ras")
                @ExcludeMissing
                ras: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("skyBgs")
                @ExcludeMissing
                skyBgs: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("zeroPoints")
                @ExcludeMissing
                zeroPoints: JsonField<List<Double>> = JsonMissing.of(),
            ) : this(
                obStartTime,
                currentSpectralFilterNum,
                declinations,
                expDuration,
                extinctionCoeffs,
                extinctionCoeffsUnc,
                intensities,
                intensityTimes,
                localSkyBgs,
                localSkyBgsUnc,
                numCorrelatedStars,
                numDetectedStars,
                percentSats,
                raRates,
                ras,
                skyBgs,
                zeroPoints,
                mutableMapOf(),
            )

            /**
             * Observation detection start time in ISO 8601 UTC with microsecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun obStartTime(): OffsetDateTime = obStartTime.getRequired("obStartTime")

            /**
             * The reference number, x, where x ranges from 1 to n, where n is the number specified
             * in spectralFilters that corresponds to the spectral filter used.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun currentSpectralFilterNum(): Optional<Long> =
                currentSpectralFilterNum.getOptional("currentSpectralFilterNum")

            /**
             * Array of declination values, in degrees, of the Target object from the frame of
             * reference of the sensor. A value is provided for each element in the intensities
             * field, at the middle of the frame’s exposure time.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun declinations(): Optional<List<Double>> = declinations.getOptional("declinations")

            /**
             * Image exposure duration in seconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun expDuration(): Optional<Double> = expDuration.getOptional("expDuration")

            /**
             * Array of coefficients for how much signal would be lost to atmospheric attenuation
             * for a star at zenith for each element in intensities, in magnitudes per air mass.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun extinctionCoeffs(): Optional<List<Double>> =
                extinctionCoeffs.getOptional("extinctionCoeffs")

            /**
             * Array of extinction coefficient uncertainties for each element in intensities. Each
             * value represents the difference between the measured brightness and predicted
             * brightness of the star with the extinction removed, making it exo-atmospheric (e.g.
             * -5.0 to 30.0).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun extinctionCoeffsUnc(): Optional<List<Double>> =
                extinctionCoeffsUnc.getOptional("extinctionCoeffsUnc")

            /**
             * Array of intensities of the Space Object for observations, in kilowatts per steradian
             * per micrometer.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun intensities(): Optional<List<Double>> = intensities.getOptional("intensities")

            /**
             * Array of start times for each intensity measurement. The 1st value in the array will
             * match obStartTime.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun intensityTimes(): Optional<List<OffsetDateTime>> =
                intensityTimes.getOptional("intensityTimes")

            /**
             * Array of local average Sky Background signals, in magnitudes, with a value
             * corresponding to the time of each intensity measurement. Sky Background refers to the
             * incoming light from an apparently empty part of the night sky.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun localSkyBgs(): Optional<List<Double>> = localSkyBgs.getOptional("localSkyBgs")

            /**
             * Array of uncertainty of the local average Sky Background signal, in magnitudes, with
             * a value corresponding to the time of each intensity measurement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun localSkyBgsUnc(): Optional<List<Double>> =
                localSkyBgsUnc.getOptional("localSkyBgsUnc")

            /**
             * Array of the number of correlated stars in the FOV with a value for each element in
             * the intensities field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun numCorrelatedStars(): Optional<List<Int>> =
                numCorrelatedStars.getOptional("numCorrelatedStars")

            /**
             * Array of the number of detected stars in the FOV with a value for each element in the
             * intensities field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun numDetectedStars(): Optional<List<Int>> =
                numDetectedStars.getOptional("numDetectedStars")

            /**
             * Array of values giving the percent of pixels that make up the object signal that are
             * beyond the saturation point for the sensor, with a value for each element in the
             * intensities field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun percentSats(): Optional<List<Double>> = percentSats.getOptional("percentSats")

            /**
             * Array of right ascension rate values, in degrees per second, measuring the rate the
             * telescope is moving to track the Target object from the frame of reference of the
             * sensor, for each element in the intensities field, at the middle of the frame’s
             * exposure time.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun raRates(): Optional<List<Double>> = raRates.getOptional("raRates")

            /**
             * Array of right ascension values, in degrees, of the Target object from the frame of
             * reference of the sensor. A value is provided for each element in the intensities
             * field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ras(): Optional<List<Double>> = ras.getOptional("ras")

            /**
             * Array of average Sky Background signals, in magnitudes, with a value corresponding to
             * the time of each intensity measurement. Sky Background refers to the incoming light
             * from an apparently empty part of the night sky.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun skyBgs(): Optional<List<Double>> = skyBgs.getOptional("skyBgs")

            /**
             * Array of values for the zero-point in magnitudes, calculated at the time of each
             * intensity measurement. It is the difference between the catalog mag and instrumental
             * mag for a set of standard stars (e.g. -5.0 to 30.0).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zeroPoints(): Optional<List<Double>> = zeroPoints.getOptional("zeroPoints")

            /**
             * Returns the raw JSON value of [obStartTime].
             *
             * Unlike [obStartTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("obStartTime")
            @ExcludeMissing
            fun _obStartTime(): JsonField<OffsetDateTime> = obStartTime

            /**
             * Returns the raw JSON value of [currentSpectralFilterNum].
             *
             * Unlike [currentSpectralFilterNum], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("currentSpectralFilterNum")
            @ExcludeMissing
            fun _currentSpectralFilterNum(): JsonField<Long> = currentSpectralFilterNum

            /**
             * Returns the raw JSON value of [declinations].
             *
             * Unlike [declinations], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("declinations")
            @ExcludeMissing
            fun _declinations(): JsonField<List<Double>> = declinations

            /**
             * Returns the raw JSON value of [expDuration].
             *
             * Unlike [expDuration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expDuration")
            @ExcludeMissing
            fun _expDuration(): JsonField<Double> = expDuration

            /**
             * Returns the raw JSON value of [extinctionCoeffs].
             *
             * Unlike [extinctionCoeffs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("extinctionCoeffs")
            @ExcludeMissing
            fun _extinctionCoeffs(): JsonField<List<Double>> = extinctionCoeffs

            /**
             * Returns the raw JSON value of [extinctionCoeffsUnc].
             *
             * Unlike [extinctionCoeffsUnc], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("extinctionCoeffsUnc")
            @ExcludeMissing
            fun _extinctionCoeffsUnc(): JsonField<List<Double>> = extinctionCoeffsUnc

            /**
             * Returns the raw JSON value of [intensities].
             *
             * Unlike [intensities], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("intensities")
            @ExcludeMissing
            fun _intensities(): JsonField<List<Double>> = intensities

            /**
             * Returns the raw JSON value of [intensityTimes].
             *
             * Unlike [intensityTimes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("intensityTimes")
            @ExcludeMissing
            fun _intensityTimes(): JsonField<List<OffsetDateTime>> = intensityTimes

            /**
             * Returns the raw JSON value of [localSkyBgs].
             *
             * Unlike [localSkyBgs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("localSkyBgs")
            @ExcludeMissing
            fun _localSkyBgs(): JsonField<List<Double>> = localSkyBgs

            /**
             * Returns the raw JSON value of [localSkyBgsUnc].
             *
             * Unlike [localSkyBgsUnc], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("localSkyBgsUnc")
            @ExcludeMissing
            fun _localSkyBgsUnc(): JsonField<List<Double>> = localSkyBgsUnc

            /**
             * Returns the raw JSON value of [numCorrelatedStars].
             *
             * Unlike [numCorrelatedStars], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("numCorrelatedStars")
            @ExcludeMissing
            fun _numCorrelatedStars(): JsonField<List<Int>> = numCorrelatedStars

            /**
             * Returns the raw JSON value of [numDetectedStars].
             *
             * Unlike [numDetectedStars], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("numDetectedStars")
            @ExcludeMissing
            fun _numDetectedStars(): JsonField<List<Int>> = numDetectedStars

            /**
             * Returns the raw JSON value of [percentSats].
             *
             * Unlike [percentSats], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("percentSats")
            @ExcludeMissing
            fun _percentSats(): JsonField<List<Double>> = percentSats

            /**
             * Returns the raw JSON value of [raRates].
             *
             * Unlike [raRates], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("raRates")
            @ExcludeMissing
            fun _raRates(): JsonField<List<Double>> = raRates

            /**
             * Returns the raw JSON value of [ras].
             *
             * Unlike [ras], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ras") @ExcludeMissing fun _ras(): JsonField<List<Double>> = ras

            /**
             * Returns the raw JSON value of [skyBgs].
             *
             * Unlike [skyBgs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("skyBgs") @ExcludeMissing fun _skyBgs(): JsonField<List<Double>> = skyBgs

            /**
             * Returns the raw JSON value of [zeroPoints].
             *
             * Unlike [zeroPoints], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("zeroPoints")
            @ExcludeMissing
            fun _zeroPoints(): JsonField<List<Double>> = zeroPoints

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
                 * [OpticalSoiObservationList].
                 *
                 * The following fields are required:
                 * ```java
                 * .obStartTime()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OpticalSoiObservationList]. */
            class Builder internal constructor() {

                private var obStartTime: JsonField<OffsetDateTime>? = null
                private var currentSpectralFilterNum: JsonField<Long> = JsonMissing.of()
                private var declinations: JsonField<MutableList<Double>>? = null
                private var expDuration: JsonField<Double> = JsonMissing.of()
                private var extinctionCoeffs: JsonField<MutableList<Double>>? = null
                private var extinctionCoeffsUnc: JsonField<MutableList<Double>>? = null
                private var intensities: JsonField<MutableList<Double>>? = null
                private var intensityTimes: JsonField<MutableList<OffsetDateTime>>? = null
                private var localSkyBgs: JsonField<MutableList<Double>>? = null
                private var localSkyBgsUnc: JsonField<MutableList<Double>>? = null
                private var numCorrelatedStars: JsonField<MutableList<Int>>? = null
                private var numDetectedStars: JsonField<MutableList<Int>>? = null
                private var percentSats: JsonField<MutableList<Double>>? = null
                private var raRates: JsonField<MutableList<Double>>? = null
                private var ras: JsonField<MutableList<Double>>? = null
                private var skyBgs: JsonField<MutableList<Double>>? = null
                private var zeroPoints: JsonField<MutableList<Double>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(opticalSoiObservationList: OpticalSoiObservationList) = apply {
                    obStartTime = opticalSoiObservationList.obStartTime
                    currentSpectralFilterNum = opticalSoiObservationList.currentSpectralFilterNum
                    declinations = opticalSoiObservationList.declinations.map { it.toMutableList() }
                    expDuration = opticalSoiObservationList.expDuration
                    extinctionCoeffs =
                        opticalSoiObservationList.extinctionCoeffs.map { it.toMutableList() }
                    extinctionCoeffsUnc =
                        opticalSoiObservationList.extinctionCoeffsUnc.map { it.toMutableList() }
                    intensities = opticalSoiObservationList.intensities.map { it.toMutableList() }
                    intensityTimes =
                        opticalSoiObservationList.intensityTimes.map { it.toMutableList() }
                    localSkyBgs = opticalSoiObservationList.localSkyBgs.map { it.toMutableList() }
                    localSkyBgsUnc =
                        opticalSoiObservationList.localSkyBgsUnc.map { it.toMutableList() }
                    numCorrelatedStars =
                        opticalSoiObservationList.numCorrelatedStars.map { it.toMutableList() }
                    numDetectedStars =
                        opticalSoiObservationList.numDetectedStars.map { it.toMutableList() }
                    percentSats = opticalSoiObservationList.percentSats.map { it.toMutableList() }
                    raRates = opticalSoiObservationList.raRates.map { it.toMutableList() }
                    ras = opticalSoiObservationList.ras.map { it.toMutableList() }
                    skyBgs = opticalSoiObservationList.skyBgs.map { it.toMutableList() }
                    zeroPoints = opticalSoiObservationList.zeroPoints.map { it.toMutableList() }
                    additionalProperties =
                        opticalSoiObservationList.additionalProperties.toMutableMap()
                }

                /** Observation detection start time in ISO 8601 UTC with microsecond precision. */
                fun obStartTime(obStartTime: OffsetDateTime) =
                    obStartTime(JsonField.of(obStartTime))

                /**
                 * Sets [Builder.obStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.obStartTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun obStartTime(obStartTime: JsonField<OffsetDateTime>) = apply {
                    this.obStartTime = obStartTime
                }

                /**
                 * The reference number, x, where x ranges from 1 to n, where n is the number
                 * specified in spectralFilters that corresponds to the spectral filter used.
                 */
                fun currentSpectralFilterNum(currentSpectralFilterNum: Long) =
                    currentSpectralFilterNum(JsonField.of(currentSpectralFilterNum))

                /**
                 * Sets [Builder.currentSpectralFilterNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currentSpectralFilterNum] with a well-typed
                 * [Long] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun currentSpectralFilterNum(currentSpectralFilterNum: JsonField<Long>) = apply {
                    this.currentSpectralFilterNum = currentSpectralFilterNum
                }

                /**
                 * Array of declination values, in degrees, of the Target object from the frame of
                 * reference of the sensor. A value is provided for each element in the intensities
                 * field, at the middle of the frame’s exposure time.
                 */
                fun declinations(declinations: List<Double>) =
                    declinations(JsonField.of(declinations))

                /**
                 * Sets [Builder.declinations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.declinations] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun declinations(declinations: JsonField<List<Double>>) = apply {
                    this.declinations = declinations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [declinations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDeclination(declination: Double) = apply {
                    declinations =
                        (declinations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("declinations", it).add(declination)
                        }
                }

                /** Image exposure duration in seconds. */
                fun expDuration(expDuration: Double) = expDuration(JsonField.of(expDuration))

                /**
                 * Sets [Builder.expDuration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expDuration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun expDuration(expDuration: JsonField<Double>) = apply {
                    this.expDuration = expDuration
                }

                /**
                 * Array of coefficients for how much signal would be lost to atmospheric
                 * attenuation for a star at zenith for each element in intensities, in magnitudes
                 * per air mass.
                 */
                fun extinctionCoeffs(extinctionCoeffs: List<Double>) =
                    extinctionCoeffs(JsonField.of(extinctionCoeffs))

                /**
                 * Sets [Builder.extinctionCoeffs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extinctionCoeffs] with a well-typed
                 * `List<Double>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun extinctionCoeffs(extinctionCoeffs: JsonField<List<Double>>) = apply {
                    this.extinctionCoeffs = extinctionCoeffs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [extinctionCoeffs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExtinctionCoeff(extinctionCoeff: Double) = apply {
                    extinctionCoeffs =
                        (extinctionCoeffs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("extinctionCoeffs", it).add(extinctionCoeff)
                        }
                }

                /**
                 * Array of extinction coefficient uncertainties for each element in intensities.
                 * Each value represents the difference between the measured brightness and
                 * predicted brightness of the star with the extinction removed, making it
                 * exo-atmospheric (e.g. -5.0 to 30.0).
                 */
                fun extinctionCoeffsUnc(extinctionCoeffsUnc: List<Double>) =
                    extinctionCoeffsUnc(JsonField.of(extinctionCoeffsUnc))

                /**
                 * Sets [Builder.extinctionCoeffsUnc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extinctionCoeffsUnc] with a well-typed
                 * `List<Double>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun extinctionCoeffsUnc(extinctionCoeffsUnc: JsonField<List<Double>>) = apply {
                    this.extinctionCoeffsUnc = extinctionCoeffsUnc.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.extinctionCoeffsUnc].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addExtinctionCoeffsUnc(extinctionCoeffsUnc: Double) = apply {
                    this.extinctionCoeffsUnc =
                        (this.extinctionCoeffsUnc ?: JsonField.of(mutableListOf())).also {
                            checkKnown("extinctionCoeffsUnc", it).add(extinctionCoeffsUnc)
                        }
                }

                /**
                 * Array of intensities of the Space Object for observations, in kilowatts per
                 * steradian per micrometer.
                 */
                fun intensities(intensities: List<Double>) = intensities(JsonField.of(intensities))

                /**
                 * Sets [Builder.intensities] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.intensities] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun intensities(intensities: JsonField<List<Double>>) = apply {
                    this.intensities = intensities.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [intensities].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIntensity(intensity: Double) = apply {
                    intensities =
                        (intensities ?: JsonField.of(mutableListOf())).also {
                            checkKnown("intensities", it).add(intensity)
                        }
                }

                /**
                 * Array of start times for each intensity measurement. The 1st value in the array
                 * will match obStartTime.
                 */
                fun intensityTimes(intensityTimes: List<OffsetDateTime>) =
                    intensityTimes(JsonField.of(intensityTimes))

                /**
                 * Sets [Builder.intensityTimes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.intensityTimes] with a well-typed
                 * `List<OffsetDateTime>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun intensityTimes(intensityTimes: JsonField<List<OffsetDateTime>>) = apply {
                    this.intensityTimes = intensityTimes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [OffsetDateTime] to [intensityTimes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIntensityTime(intensityTime: OffsetDateTime) = apply {
                    intensityTimes =
                        (intensityTimes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("intensityTimes", it).add(intensityTime)
                        }
                }

                /**
                 * Array of local average Sky Background signals, in magnitudes, with a value
                 * corresponding to the time of each intensity measurement. Sky Background refers to
                 * the incoming light from an apparently empty part of the night sky.
                 */
                fun localSkyBgs(localSkyBgs: List<Double>) = localSkyBgs(JsonField.of(localSkyBgs))

                /**
                 * Sets [Builder.localSkyBgs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localSkyBgs] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun localSkyBgs(localSkyBgs: JsonField<List<Double>>) = apply {
                    this.localSkyBgs = localSkyBgs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [localSkyBgs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLocalSkyBg(localSkyBg: Double) = apply {
                    localSkyBgs =
                        (localSkyBgs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("localSkyBgs", it).add(localSkyBg)
                        }
                }

                /**
                 * Array of uncertainty of the local average Sky Background signal, in magnitudes,
                 * with a value corresponding to the time of each intensity measurement.
                 */
                fun localSkyBgsUnc(localSkyBgsUnc: List<Double>) =
                    localSkyBgsUnc(JsonField.of(localSkyBgsUnc))

                /**
                 * Sets [Builder.localSkyBgsUnc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.localSkyBgsUnc] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun localSkyBgsUnc(localSkyBgsUnc: JsonField<List<Double>>) = apply {
                    this.localSkyBgsUnc = localSkyBgsUnc.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.localSkyBgsUnc].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLocalSkyBgsUnc(localSkyBgsUnc: Double) = apply {
                    this.localSkyBgsUnc =
                        (this.localSkyBgsUnc ?: JsonField.of(mutableListOf())).also {
                            checkKnown("localSkyBgsUnc", it).add(localSkyBgsUnc)
                        }
                }

                /**
                 * Array of the number of correlated stars in the FOV with a value for each element
                 * in the intensities field.
                 */
                fun numCorrelatedStars(numCorrelatedStars: List<Int>) =
                    numCorrelatedStars(JsonField.of(numCorrelatedStars))

                /**
                 * Sets [Builder.numCorrelatedStars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numCorrelatedStars] with a well-typed
                 * `List<Int>` value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun numCorrelatedStars(numCorrelatedStars: JsonField<List<Int>>) = apply {
                    this.numCorrelatedStars = numCorrelatedStars.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Int] to [numCorrelatedStars].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addNumCorrelatedStar(numCorrelatedStar: Int) = apply {
                    numCorrelatedStars =
                        (numCorrelatedStars ?: JsonField.of(mutableListOf())).also {
                            checkKnown("numCorrelatedStars", it).add(numCorrelatedStar)
                        }
                }

                /**
                 * Array of the number of detected stars in the FOV with a value for each element in
                 * the intensities field.
                 */
                fun numDetectedStars(numDetectedStars: List<Int>) =
                    numDetectedStars(JsonField.of(numDetectedStars))

                /**
                 * Sets [Builder.numDetectedStars] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.numDetectedStars] with a well-typed `List<Int>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun numDetectedStars(numDetectedStars: JsonField<List<Int>>) = apply {
                    this.numDetectedStars = numDetectedStars.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Int] to [numDetectedStars].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addNumDetectedStar(numDetectedStar: Int) = apply {
                    numDetectedStars =
                        (numDetectedStars ?: JsonField.of(mutableListOf())).also {
                            checkKnown("numDetectedStars", it).add(numDetectedStar)
                        }
                }

                /**
                 * Array of values giving the percent of pixels that make up the object signal that
                 * are beyond the saturation point for the sensor, with a value for each element in
                 * the intensities field.
                 */
                fun percentSats(percentSats: List<Double>) = percentSats(JsonField.of(percentSats))

                /**
                 * Sets [Builder.percentSats] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.percentSats] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun percentSats(percentSats: JsonField<List<Double>>) = apply {
                    this.percentSats = percentSats.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [percentSats].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPercentSat(percentSat: Double) = apply {
                    percentSats =
                        (percentSats ?: JsonField.of(mutableListOf())).also {
                            checkKnown("percentSats", it).add(percentSat)
                        }
                }

                /**
                 * Array of right ascension rate values, in degrees per second, measuring the rate
                 * the telescope is moving to track the Target object from the frame of reference of
                 * the sensor, for each element in the intensities field, at the middle of the
                 * frame’s exposure time.
                 */
                fun raRates(raRates: List<Double>) = raRates(JsonField.of(raRates))

                /**
                 * Sets [Builder.raRates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.raRates] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun raRates(raRates: JsonField<List<Double>>) = apply {
                    this.raRates = raRates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [raRates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRaRate(raRate: Double) = apply {
                    raRates =
                        (raRates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("raRates", it).add(raRate)
                        }
                }

                /**
                 * Array of right ascension values, in degrees, of the Target object from the frame
                 * of reference of the sensor. A value is provided for each element in the
                 * intensities field.
                 */
                fun ras(ras: List<Double>) = ras(JsonField.of(ras))

                /**
                 * Sets [Builder.ras] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ras] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ras(ras: JsonField<List<Double>>) = apply {
                    this.ras = ras.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [ras].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRa(ra: Double) = apply {
                    ras =
                        (ras ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ras", it).add(ra)
                        }
                }

                /**
                 * Array of average Sky Background signals, in magnitudes, with a value
                 * corresponding to the time of each intensity measurement. Sky Background refers to
                 * the incoming light from an apparently empty part of the night sky.
                 */
                fun skyBgs(skyBgs: List<Double>) = skyBgs(JsonField.of(skyBgs))

                /**
                 * Sets [Builder.skyBgs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.skyBgs] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun skyBgs(skyBgs: JsonField<List<Double>>) = apply {
                    this.skyBgs = skyBgs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [skyBgs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSkyBg(skyBg: Double) = apply {
                    skyBgs =
                        (skyBgs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("skyBgs", it).add(skyBg)
                        }
                }

                /**
                 * Array of values for the zero-point in magnitudes, calculated at the time of each
                 * intensity measurement. It is the difference between the catalog mag and
                 * instrumental mag for a set of standard stars (e.g. -5.0 to 30.0).
                 */
                fun zeroPoints(zeroPoints: List<Double>) = zeroPoints(JsonField.of(zeroPoints))

                /**
                 * Sets [Builder.zeroPoints] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zeroPoints] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun zeroPoints(zeroPoints: JsonField<List<Double>>) = apply {
                    this.zeroPoints = zeroPoints.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [zeroPoints].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addZeroPoint(zeroPoint: Double) = apply {
                    zeroPoints =
                        (zeroPoints ?: JsonField.of(mutableListOf())).also {
                            checkKnown("zeroPoints", it).add(zeroPoint)
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
                 * Returns an immutable instance of [OpticalSoiObservationList].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .obStartTime()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OpticalSoiObservationList =
                    OpticalSoiObservationList(
                        checkRequired("obStartTime", obStartTime),
                        currentSpectralFilterNum,
                        (declinations ?: JsonMissing.of()).map { it.toImmutable() },
                        expDuration,
                        (extinctionCoeffs ?: JsonMissing.of()).map { it.toImmutable() },
                        (extinctionCoeffsUnc ?: JsonMissing.of()).map { it.toImmutable() },
                        (intensities ?: JsonMissing.of()).map { it.toImmutable() },
                        (intensityTimes ?: JsonMissing.of()).map { it.toImmutable() },
                        (localSkyBgs ?: JsonMissing.of()).map { it.toImmutable() },
                        (localSkyBgsUnc ?: JsonMissing.of()).map { it.toImmutable() },
                        (numCorrelatedStars ?: JsonMissing.of()).map { it.toImmutable() },
                        (numDetectedStars ?: JsonMissing.of()).map { it.toImmutable() },
                        (percentSats ?: JsonMissing.of()).map { it.toImmutable() },
                        (raRates ?: JsonMissing.of()).map { it.toImmutable() },
                        (ras ?: JsonMissing.of()).map { it.toImmutable() },
                        (skyBgs ?: JsonMissing.of()).map { it.toImmutable() },
                        (zeroPoints ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OpticalSoiObservationList = apply {
                if (validated) {
                    return@apply
                }

                obStartTime()
                currentSpectralFilterNum()
                declinations()
                expDuration()
                extinctionCoeffs()
                extinctionCoeffsUnc()
                intensities()
                intensityTimes()
                localSkyBgs()
                localSkyBgsUnc()
                numCorrelatedStars()
                numDetectedStars()
                percentSats()
                raRates()
                ras()
                skyBgs()
                zeroPoints()
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
                (if (obStartTime.asKnown().isPresent) 1 else 0) +
                    (if (currentSpectralFilterNum.asKnown().isPresent) 1 else 0) +
                    (declinations.asKnown().getOrNull()?.size ?: 0) +
                    (if (expDuration.asKnown().isPresent) 1 else 0) +
                    (extinctionCoeffs.asKnown().getOrNull()?.size ?: 0) +
                    (extinctionCoeffsUnc.asKnown().getOrNull()?.size ?: 0) +
                    (intensities.asKnown().getOrNull()?.size ?: 0) +
                    (intensityTimes.asKnown().getOrNull()?.size ?: 0) +
                    (localSkyBgs.asKnown().getOrNull()?.size ?: 0) +
                    (localSkyBgsUnc.asKnown().getOrNull()?.size ?: 0) +
                    (numCorrelatedStars.asKnown().getOrNull()?.size ?: 0) +
                    (numDetectedStars.asKnown().getOrNull()?.size ?: 0) +
                    (percentSats.asKnown().getOrNull()?.size ?: 0) +
                    (raRates.asKnown().getOrNull()?.size ?: 0) +
                    (ras.asKnown().getOrNull()?.size ?: 0) +
                    (skyBgs.asKnown().getOrNull()?.size ?: 0) +
                    (zeroPoints.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OpticalSoiObservationList &&
                    obStartTime == other.obStartTime &&
                    currentSpectralFilterNum == other.currentSpectralFilterNum &&
                    declinations == other.declinations &&
                    expDuration == other.expDuration &&
                    extinctionCoeffs == other.extinctionCoeffs &&
                    extinctionCoeffsUnc == other.extinctionCoeffsUnc &&
                    intensities == other.intensities &&
                    intensityTimes == other.intensityTimes &&
                    localSkyBgs == other.localSkyBgs &&
                    localSkyBgsUnc == other.localSkyBgsUnc &&
                    numCorrelatedStars == other.numCorrelatedStars &&
                    numDetectedStars == other.numDetectedStars &&
                    percentSats == other.percentSats &&
                    raRates == other.raRates &&
                    ras == other.ras &&
                    skyBgs == other.skyBgs &&
                    zeroPoints == other.zeroPoints &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    obStartTime,
                    currentSpectralFilterNum,
                    declinations,
                    expDuration,
                    extinctionCoeffs,
                    extinctionCoeffsUnc,
                    intensities,
                    intensityTimes,
                    localSkyBgs,
                    localSkyBgsUnc,
                    numCorrelatedStars,
                    numDetectedStars,
                    percentSats,
                    raRates,
                    ras,
                    skyBgs,
                    zeroPoints,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OpticalSoiObservationList{obStartTime=$obStartTime, currentSpectralFilterNum=$currentSpectralFilterNum, declinations=$declinations, expDuration=$expDuration, extinctionCoeffs=$extinctionCoeffs, extinctionCoeffsUnc=$extinctionCoeffsUnc, intensities=$intensities, intensityTimes=$intensityTimes, localSkyBgs=$localSkyBgs, localSkyBgsUnc=$localSkyBgsUnc, numCorrelatedStars=$numCorrelatedStars, numDetectedStars=$numDetectedStars, percentSats=$percentSats, raRates=$raRates, ras=$ras, skyBgs=$skyBgs, zeroPoints=$zeroPoints, additionalProperties=$additionalProperties}"
        }

        /**
         * A Radar SOI record contains observation information taken from a sensor about a Space
         * Object.
         */
        class RadarSoiObservationList
        private constructor(
            private val obStartTime: JsonField<OffsetDateTime>,
            private val aspectAngles: JsonField<List<Double>>,
            private val azimuthBiases: JsonField<List<Double>>,
            private val azimuthRates: JsonField<List<Double>>,
            private val azimuths: JsonField<List<Double>>,
            private val beta: JsonField<Double>,
            private val centerFrequency: JsonField<Double>,
            private val crossRangeRes: JsonField<List<Double>>,
            private val deltaTimes: JsonField<List<Double>>,
            private val doppler2XRs: JsonField<List<Double>>,
            private val elevationBiases: JsonField<List<Double>>,
            private val elevationRates: JsonField<List<Double>>,
            private val elevations: JsonField<List<Double>>,
            private val idAttitudeSet: JsonField<String>,
            private val idStateVector: JsonField<String>,
            private val integrationAngles: JsonField<List<Double>>,
            private val kappa: JsonField<Double>,
            private val peakAmplitudes: JsonField<List<Double>>,
            private val polarizations: JsonField<List<String>>,
            private val projAngVels: JsonField<List<Double>>,
            private val pulseBandwidth: JsonField<Double>,
            private val rangeAccels: JsonField<List<Double>>,
            private val rangeBiases: JsonField<List<Double>>,
            private val rangeRates: JsonField<List<Double>>,
            private val ranges: JsonField<List<Double>>,
            private val rcsErrorEsts: JsonField<List<Double>>,
            private val rcsValues: JsonField<List<Double>>,
            private val rspaces: JsonField<List<Double>>,
            private val spectralWidths: JsonField<List<Double>>,
            private val tovs: JsonField<List<OffsetDateTime>>,
            private val xaccel: JsonField<List<Double>>,
            private val xpos: JsonField<List<Double>>,
            private val xspaces: JsonField<List<Double>>,
            private val xvel: JsonField<List<Double>>,
            private val yaccel: JsonField<List<Double>>,
            private val ypos: JsonField<List<Double>>,
            private val yvel: JsonField<List<Double>>,
            private val zaccel: JsonField<List<Double>>,
            private val zpos: JsonField<List<Double>>,
            private val zvel: JsonField<List<Double>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("obStartTime")
                @ExcludeMissing
                obStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("aspectAngles")
                @ExcludeMissing
                aspectAngles: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("azimuthBiases")
                @ExcludeMissing
                azimuthBiases: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("azimuthRates")
                @ExcludeMissing
                azimuthRates: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("azimuths")
                @ExcludeMissing
                azimuths: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("beta") @ExcludeMissing beta: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("centerFrequency")
                @ExcludeMissing
                centerFrequency: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("crossRangeRes")
                @ExcludeMissing
                crossRangeRes: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("deltaTimes")
                @ExcludeMissing
                deltaTimes: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("doppler2XRs")
                @ExcludeMissing
                doppler2XRs: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("elevationBiases")
                @ExcludeMissing
                elevationBiases: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("elevationRates")
                @ExcludeMissing
                elevationRates: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("elevations")
                @ExcludeMissing
                elevations: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("idAttitudeSet")
                @ExcludeMissing
                idAttitudeSet: JsonField<String> = JsonMissing.of(),
                @JsonProperty("idStateVector")
                @ExcludeMissing
                idStateVector: JsonField<String> = JsonMissing.of(),
                @JsonProperty("integrationAngles")
                @ExcludeMissing
                integrationAngles: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("kappa") @ExcludeMissing kappa: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("peakAmplitudes")
                @ExcludeMissing
                peakAmplitudes: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("polarizations")
                @ExcludeMissing
                polarizations: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("projAngVels")
                @ExcludeMissing
                projAngVels: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("pulseBandwidth")
                @ExcludeMissing
                pulseBandwidth: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("rangeAccels")
                @ExcludeMissing
                rangeAccels: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rangeBiases")
                @ExcludeMissing
                rangeBiases: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rangeRates")
                @ExcludeMissing
                rangeRates: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("ranges")
                @ExcludeMissing
                ranges: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rcsErrorEsts")
                @ExcludeMissing
                rcsErrorEsts: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rcsValues")
                @ExcludeMissing
                rcsValues: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rspaces")
                @ExcludeMissing
                rspaces: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("spectralWidths")
                @ExcludeMissing
                spectralWidths: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("tovs")
                @ExcludeMissing
                tovs: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
                @JsonProperty("xaccel")
                @ExcludeMissing
                xaccel: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("xpos")
                @ExcludeMissing
                xpos: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("xspaces")
                @ExcludeMissing
                xspaces: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("xvel")
                @ExcludeMissing
                xvel: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("yaccel")
                @ExcludeMissing
                yaccel: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("ypos")
                @ExcludeMissing
                ypos: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("yvel")
                @ExcludeMissing
                yvel: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("zaccel")
                @ExcludeMissing
                zaccel: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("zpos")
                @ExcludeMissing
                zpos: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("zvel")
                @ExcludeMissing
                zvel: JsonField<List<Double>> = JsonMissing.of(),
            ) : this(
                obStartTime,
                aspectAngles,
                azimuthBiases,
                azimuthRates,
                azimuths,
                beta,
                centerFrequency,
                crossRangeRes,
                deltaTimes,
                doppler2XRs,
                elevationBiases,
                elevationRates,
                elevations,
                idAttitudeSet,
                idStateVector,
                integrationAngles,
                kappa,
                peakAmplitudes,
                polarizations,
                projAngVels,
                pulseBandwidth,
                rangeAccels,
                rangeBiases,
                rangeRates,
                ranges,
                rcsErrorEsts,
                rcsValues,
                rspaces,
                spectralWidths,
                tovs,
                xaccel,
                xpos,
                xspaces,
                xvel,
                yaccel,
                ypos,
                yvel,
                zaccel,
                zpos,
                zvel,
                mutableMapOf(),
            )

            /**
             * Observation detection start time in ISO 8601 UTC format with microsecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun obStartTime(): OffsetDateTime = obStartTime.getRequired("obStartTime")

            /**
             * Array of the aspect angle at the center of the image in degrees. The 'tovs' and
             * 'aspectAngles' arrays must match in size, if 'aspectAngles' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun aspectAngles(): Optional<List<Double>> = aspectAngles.getOptional("aspectAngles")

            /**
             * Array of sensor azimuth angle biases in degrees. The 'tovs' and 'azimuthBiases'
             * arrays must match in size, if 'azimuthBiases' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun azimuthBiases(): Optional<List<Double>> = azimuthBiases.getOptional("azimuthBiases")

            /**
             * Array of the azimuth rate of target at image center in degrees per second. The 'tovs'
             * and 'azimuthRates' arrays must match in size, if 'azimuthRates' is provided. If there
             * is an associated image the azimuth rate is assumed to be at image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun azimuthRates(): Optional<List<Double>> = azimuthRates.getOptional("azimuthRates")

            /**
             * Array of the azimuth angle to target at image center in degrees. The 'tovs' and
             * 'azimuths' arrays must match in size, if 'azimuths' is provided. If there is an
             * associated image the azimuth angle is assumed to be at image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun azimuths(): Optional<List<Double>> = azimuths.getOptional("azimuths")

            /**
             * Beta angle (between target and radar-image frame z axis) in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun beta(): Optional<Double> = beta.getOptional("beta")

            /**
             * Radar center frequency of the radar in hertz.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun centerFrequency(): Optional<Double> = centerFrequency.getOptional("centerFrequency")

            /**
             * Array of cross-range resolutions (accounting for weighting function) in kilometers.
             * The 'tovs' and 'crossRangeRes' arrays must match in size, if 'crossRangeRes' is
             * provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun crossRangeRes(): Optional<List<Double>> = crossRangeRes.getOptional("crossRangeRes")

            /**
             * Array of average Interpulse spacing in seconds. The 'tovs' and 'deltaTimes' arrays
             * must match in size, if 'deltaTimes' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun deltaTimes(): Optional<List<Double>> = deltaTimes.getOptional("deltaTimes")

            /**
             * Array of conversion factors between Doppler in hertz and cross-range in meters. The
             * 'tovs' and 'doppler2XRs' arrays must match in size, if 'doppler2XRs' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun doppler2XRs(): Optional<List<Double>> = doppler2XRs.getOptional("doppler2XRs")

            /**
             * Array of sensor elevation biases in degrees. The 'tovs' and 'elevationBiases' arrays
             * must match in size, if 'elevationBiases' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun elevationBiases(): Optional<List<Double>> =
                elevationBiases.getOptional("elevationBiases")

            /**
             * Array of the elevation rate of target at image center in degrees per second. The
             * 'tovs' and 'elevationRates' arrays must match in size, if 'elevationRates' is
             * provided. If there is an associated image the elevation rate is assumed to be at
             * image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun elevationRates(): Optional<List<Double>> =
                elevationRates.getOptional("elevationRates")

            /**
             * Array of the elevation angle to target at image center in degrees. The 'tovs' and
             * 'elevations' arrays must match in size, if 'elevations' is provided. If there is an
             * associated image the elevation angle is assumed to be at image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun elevations(): Optional<List<Double>> = elevations.getOptional("elevations")

            /**
             * Optional id of assumed AttitudeSet of object being observed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idAttitudeSet(): Optional<String> = idAttitudeSet.getOptional("idAttitudeSet")

            /**
             * Optional id of assumed StateVector of object being observed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idStateVector(): Optional<String> = idStateVector.getOptional("idStateVector")

            /**
             * Array of Integration angles in degrees. The 'tovs' and 'integrationAngles' arrays
             * must match in size, if 'integrationAngles' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun integrationAngles(): Optional<List<Double>> =
                integrationAngles.getOptional("integrationAngles")

            /**
             * Kappa angle (between radar-line-of-sight and target-frame x axis) in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun kappa(): Optional<Double> = kappa.getOptional("kappa")

            /**
             * Array of the peak pixel amplitude for each image in decibels. The 'tovs' and
             * 'peakAmplitudes' arrays must match in size, if 'peakAmplitudes' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun peakAmplitudes(): Optional<List<Double>> =
                peakAmplitudes.getOptional("peakAmplitudes")

            /**
             * Array of sensor polarizations when collecting the data. Polarization is a property of
             * electromagnetic waves that describes the orientation of their oscillations. Possible
             * values are H - (Horizontally Polarized) Perpendicular to Earth's surface, V -
             * (Vertically Polarized) Parallel to Earth's surface, L - (Left Hand Circularly
             * Polarized) Rotating left relative to the Earth's surface, R - (Right Hand Circularly
             * Polarized) Rotating right relative to the Earth's surface.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun polarizations(): Optional<List<String>> = polarizations.getOptional("polarizations")

            /**
             * Array of the component of target angular velocity observable by radar in radians per
             * second. The 'tovs' and 'projAngVels' arrays must match in size, if 'projAngVels' is
             * provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun projAngVels(): Optional<List<Double>> = projAngVels.getOptional("projAngVels")

            /**
             * Bandwidth of radar pulse in hertz.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pulseBandwidth(): Optional<Double> = pulseBandwidth.getOptional("pulseBandwidth")

            /**
             * Array of the range acceleratons of target in kilometers per second squared. The
             * 'tovs' and 'rangeAccels' arrays must match in size, if 'rangeAccels' is provided. If
             * there is an associated image the range acceleration is assumed to be at image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rangeAccels(): Optional<List<Double>> = rangeAccels.getOptional("rangeAccels")

            /**
             * Array of sensor range biases in kilometers. The 'tovs' and 'rangeBiases' arrays must
             * match in size, if 'rangeBiases' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rangeBiases(): Optional<List<Double>> = rangeBiases.getOptional("rangeBiases")

            /**
             * Array of the range rate of target at image center in kilometers per second. The
             * 'tovs' and 'rangeRates' arrays must match in size, if 'rangeRates' is provided. If
             * there is an associated image the range rate is assumed to be at image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rangeRates(): Optional<List<Double>> = rangeRates.getOptional("rangeRates")

            /**
             * Array of the range to target at image center in kilometers. The 'tovs' and 'ranges'
             * arrays must match in size, if 'ranges' is provided. If there is an associated image
             * the range is assumed to be at image center.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ranges(): Optional<List<Double>> = ranges.getOptional("ranges")

            /**
             * Array of error estimates of RCS values, in square meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rcsErrorEsts(): Optional<List<Double>> = rcsErrorEsts.getOptional("rcsErrorEsts")

            /**
             * Array of observed radar cross section (RCS) values, in square meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rcsValues(): Optional<List<Double>> = rcsValues.getOptional("rcsValues")

            /**
             * Array of range sample spacing in meters. The 'tovs' and 'rspaces' arrays must match
             * in size, if 'rspaces' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rspaces(): Optional<List<Double>> = rspaces.getOptional("rspaces")

            /**
             * Array of spectral widths, in hertz. The spectral width of a satellite can help
             * determine if an object is stable or tumbling which is often useful to distinguish a
             * rocket body from an active stabilized payload or to deduce a rotational period of
             * slowly tumbling objects at GEO.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun spectralWidths(): Optional<List<Double>> =
                spectralWidths.getOptional("spectralWidths")

            /**
             * Array of the times of validity in ISO 8601 UTC format with microsecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tovs(): Optional<List<OffsetDateTime>> = tovs.getOptional("tovs")

            /**
             * Array of the cartesian X accelerations, in kilometers per second squared, in the
             * specified referenceFrame. If referenceFrame is null then J2K should be assumed. The
             * 'tovs' and 'xaccel' arrays must match in size, if 'xaccel' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xaccel(): Optional<List<Double>> = xaccel.getOptional("xaccel")

            /**
             * Array of the cartesian X positions of the target, in kilometers, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed. The 'tovs' and
             * 'xpos' arrays must match in size, if 'xpos' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xpos(): Optional<List<Double>> = xpos.getOptional("xpos")

            /**
             * Array of cross-range sample spacing in meters. The 'tovs' and 'xspaces' arrays must
             * match in size, if 'xspaces' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xspaces(): Optional<List<Double>> = xspaces.getOptional("xspaces")

            /**
             * Array of the cartesian X velocities of target, in kilometers per second, in the
             * specified referenceFrame. If referenceFrame is null then J2K should be assumed. The
             * 'tovs' and 'xvel' arrays must match in size, if 'xvel' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xvel(): Optional<List<Double>> = xvel.getOptional("xvel")

            /**
             * Array of the cartesian Y accelerations, in kilometers per second squared, in the
             * specified referenceFrame. If referenceFrame is null then J2K should be assumed. The
             * 'tovs' and 'yaccel' arrays must match in size, if 'yaccel' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yaccel(): Optional<List<Double>> = yaccel.getOptional("yaccel")

            /**
             * Array of the cartesian Y positions of the target, in kilometers, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed. The 'tovs' and
             * 'ypos' arrays must match in size, if 'ypos' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ypos(): Optional<List<Double>> = ypos.getOptional("ypos")

            /**
             * Array of the cartesian Y velocities of target, in kilometers per second, in the
             * specified referenceFrame. If referenceFrame is null then J2K should be assumed. The
             * 'tovs' and 'yvel' arrays must match in size, if 'yvel' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yvel(): Optional<List<Double>> = yvel.getOptional("yvel")

            /**
             * Array of the cartesian Z accelerations, in kilometers per second squared, in the
             * specified referenceFrame. If referenceFrame is null then J2K should be assumed. The
             * 'tovs' and 'zaccel' arrays must match in size, if 'zaccel' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zaccel(): Optional<List<Double>> = zaccel.getOptional("zaccel")

            /**
             * Array of the cartesian Z positions of the target, in kilometers, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed. The 'tovs' and
             * 'zpos' arrays must match in size, if 'zpos' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zpos(): Optional<List<Double>> = zpos.getOptional("zpos")

            /**
             * Array of the cartesian Z velocities of target, in kilometers per second, in the
             * specified referenceFrame. If referenceFrame is null then J2K should be assumed. The
             * 'tovs' and 'zvel' arrays must match in size, if 'zvel' is provided.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zvel(): Optional<List<Double>> = zvel.getOptional("zvel")

            /**
             * Returns the raw JSON value of [obStartTime].
             *
             * Unlike [obStartTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("obStartTime")
            @ExcludeMissing
            fun _obStartTime(): JsonField<OffsetDateTime> = obStartTime

            /**
             * Returns the raw JSON value of [aspectAngles].
             *
             * Unlike [aspectAngles], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("aspectAngles")
            @ExcludeMissing
            fun _aspectAngles(): JsonField<List<Double>> = aspectAngles

            /**
             * Returns the raw JSON value of [azimuthBiases].
             *
             * Unlike [azimuthBiases], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azimuthBiases")
            @ExcludeMissing
            fun _azimuthBiases(): JsonField<List<Double>> = azimuthBiases

            /**
             * Returns the raw JSON value of [azimuthRates].
             *
             * Unlike [azimuthRates], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azimuthRates")
            @ExcludeMissing
            fun _azimuthRates(): JsonField<List<Double>> = azimuthRates

            /**
             * Returns the raw JSON value of [azimuths].
             *
             * Unlike [azimuths], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("azimuths")
            @ExcludeMissing
            fun _azimuths(): JsonField<List<Double>> = azimuths

            /**
             * Returns the raw JSON value of [beta].
             *
             * Unlike [beta], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("beta") @ExcludeMissing fun _beta(): JsonField<Double> = beta

            /**
             * Returns the raw JSON value of [centerFrequency].
             *
             * Unlike [centerFrequency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("centerFrequency")
            @ExcludeMissing
            fun _centerFrequency(): JsonField<Double> = centerFrequency

            /**
             * Returns the raw JSON value of [crossRangeRes].
             *
             * Unlike [crossRangeRes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("crossRangeRes")
            @ExcludeMissing
            fun _crossRangeRes(): JsonField<List<Double>> = crossRangeRes

            /**
             * Returns the raw JSON value of [deltaTimes].
             *
             * Unlike [deltaTimes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("deltaTimes")
            @ExcludeMissing
            fun _deltaTimes(): JsonField<List<Double>> = deltaTimes

            /**
             * Returns the raw JSON value of [doppler2XRs].
             *
             * Unlike [doppler2XRs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("doppler2XRs")
            @ExcludeMissing
            fun _doppler2XRs(): JsonField<List<Double>> = doppler2XRs

            /**
             * Returns the raw JSON value of [elevationBiases].
             *
             * Unlike [elevationBiases], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("elevationBiases")
            @ExcludeMissing
            fun _elevationBiases(): JsonField<List<Double>> = elevationBiases

            /**
             * Returns the raw JSON value of [elevationRates].
             *
             * Unlike [elevationRates], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("elevationRates")
            @ExcludeMissing
            fun _elevationRates(): JsonField<List<Double>> = elevationRates

            /**
             * Returns the raw JSON value of [elevations].
             *
             * Unlike [elevations], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("elevations")
            @ExcludeMissing
            fun _elevations(): JsonField<List<Double>> = elevations

            /**
             * Returns the raw JSON value of [idAttitudeSet].
             *
             * Unlike [idAttitudeSet], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("idAttitudeSet")
            @ExcludeMissing
            fun _idAttitudeSet(): JsonField<String> = idAttitudeSet

            /**
             * Returns the raw JSON value of [idStateVector].
             *
             * Unlike [idStateVector], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("idStateVector")
            @ExcludeMissing
            fun _idStateVector(): JsonField<String> = idStateVector

            /**
             * Returns the raw JSON value of [integrationAngles].
             *
             * Unlike [integrationAngles], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("integrationAngles")
            @ExcludeMissing
            fun _integrationAngles(): JsonField<List<Double>> = integrationAngles

            /**
             * Returns the raw JSON value of [kappa].
             *
             * Unlike [kappa], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("kappa") @ExcludeMissing fun _kappa(): JsonField<Double> = kappa

            /**
             * Returns the raw JSON value of [peakAmplitudes].
             *
             * Unlike [peakAmplitudes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("peakAmplitudes")
            @ExcludeMissing
            fun _peakAmplitudes(): JsonField<List<Double>> = peakAmplitudes

            /**
             * Returns the raw JSON value of [polarizations].
             *
             * Unlike [polarizations], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("polarizations")
            @ExcludeMissing
            fun _polarizations(): JsonField<List<String>> = polarizations

            /**
             * Returns the raw JSON value of [projAngVels].
             *
             * Unlike [projAngVels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("projAngVels")
            @ExcludeMissing
            fun _projAngVels(): JsonField<List<Double>> = projAngVels

            /**
             * Returns the raw JSON value of [pulseBandwidth].
             *
             * Unlike [pulseBandwidth], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pulseBandwidth")
            @ExcludeMissing
            fun _pulseBandwidth(): JsonField<Double> = pulseBandwidth

            /**
             * Returns the raw JSON value of [rangeAccels].
             *
             * Unlike [rangeAccels], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rangeAccels")
            @ExcludeMissing
            fun _rangeAccels(): JsonField<List<Double>> = rangeAccels

            /**
             * Returns the raw JSON value of [rangeBiases].
             *
             * Unlike [rangeBiases], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rangeBiases")
            @ExcludeMissing
            fun _rangeBiases(): JsonField<List<Double>> = rangeBiases

            /**
             * Returns the raw JSON value of [rangeRates].
             *
             * Unlike [rangeRates], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rangeRates")
            @ExcludeMissing
            fun _rangeRates(): JsonField<List<Double>> = rangeRates

            /**
             * Returns the raw JSON value of [ranges].
             *
             * Unlike [ranges], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ranges") @ExcludeMissing fun _ranges(): JsonField<List<Double>> = ranges

            /**
             * Returns the raw JSON value of [rcsErrorEsts].
             *
             * Unlike [rcsErrorEsts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rcsErrorEsts")
            @ExcludeMissing
            fun _rcsErrorEsts(): JsonField<List<Double>> = rcsErrorEsts

            /**
             * Returns the raw JSON value of [rcsValues].
             *
             * Unlike [rcsValues], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rcsValues")
            @ExcludeMissing
            fun _rcsValues(): JsonField<List<Double>> = rcsValues

            /**
             * Returns the raw JSON value of [rspaces].
             *
             * Unlike [rspaces], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rspaces")
            @ExcludeMissing
            fun _rspaces(): JsonField<List<Double>> = rspaces

            /**
             * Returns the raw JSON value of [spectralWidths].
             *
             * Unlike [spectralWidths], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("spectralWidths")
            @ExcludeMissing
            fun _spectralWidths(): JsonField<List<Double>> = spectralWidths

            /**
             * Returns the raw JSON value of [tovs].
             *
             * Unlike [tovs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tovs")
            @ExcludeMissing
            fun _tovs(): JsonField<List<OffsetDateTime>> = tovs

            /**
             * Returns the raw JSON value of [xaccel].
             *
             * Unlike [xaccel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xaccel") @ExcludeMissing fun _xaccel(): JsonField<List<Double>> = xaccel

            /**
             * Returns the raw JSON value of [xpos].
             *
             * Unlike [xpos], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xpos") @ExcludeMissing fun _xpos(): JsonField<List<Double>> = xpos

            /**
             * Returns the raw JSON value of [xspaces].
             *
             * Unlike [xspaces], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xspaces")
            @ExcludeMissing
            fun _xspaces(): JsonField<List<Double>> = xspaces

            /**
             * Returns the raw JSON value of [xvel].
             *
             * Unlike [xvel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xvel") @ExcludeMissing fun _xvel(): JsonField<List<Double>> = xvel

            /**
             * Returns the raw JSON value of [yaccel].
             *
             * Unlike [yaccel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("yaccel") @ExcludeMissing fun _yaccel(): JsonField<List<Double>> = yaccel

            /**
             * Returns the raw JSON value of [ypos].
             *
             * Unlike [ypos], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ypos") @ExcludeMissing fun _ypos(): JsonField<List<Double>> = ypos

            /**
             * Returns the raw JSON value of [yvel].
             *
             * Unlike [yvel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("yvel") @ExcludeMissing fun _yvel(): JsonField<List<Double>> = yvel

            /**
             * Returns the raw JSON value of [zaccel].
             *
             * Unlike [zaccel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zaccel") @ExcludeMissing fun _zaccel(): JsonField<List<Double>> = zaccel

            /**
             * Returns the raw JSON value of [zpos].
             *
             * Unlike [zpos], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zpos") @ExcludeMissing fun _zpos(): JsonField<List<Double>> = zpos

            /**
             * Returns the raw JSON value of [zvel].
             *
             * Unlike [zvel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zvel") @ExcludeMissing fun _zvel(): JsonField<List<Double>> = zvel

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
                 * [RadarSoiObservationList].
                 *
                 * The following fields are required:
                 * ```java
                 * .obStartTime()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RadarSoiObservationList]. */
            class Builder internal constructor() {

                private var obStartTime: JsonField<OffsetDateTime>? = null
                private var aspectAngles: JsonField<MutableList<Double>>? = null
                private var azimuthBiases: JsonField<MutableList<Double>>? = null
                private var azimuthRates: JsonField<MutableList<Double>>? = null
                private var azimuths: JsonField<MutableList<Double>>? = null
                private var beta: JsonField<Double> = JsonMissing.of()
                private var centerFrequency: JsonField<Double> = JsonMissing.of()
                private var crossRangeRes: JsonField<MutableList<Double>>? = null
                private var deltaTimes: JsonField<MutableList<Double>>? = null
                private var doppler2XRs: JsonField<MutableList<Double>>? = null
                private var elevationBiases: JsonField<MutableList<Double>>? = null
                private var elevationRates: JsonField<MutableList<Double>>? = null
                private var elevations: JsonField<MutableList<Double>>? = null
                private var idAttitudeSet: JsonField<String> = JsonMissing.of()
                private var idStateVector: JsonField<String> = JsonMissing.of()
                private var integrationAngles: JsonField<MutableList<Double>>? = null
                private var kappa: JsonField<Double> = JsonMissing.of()
                private var peakAmplitudes: JsonField<MutableList<Double>>? = null
                private var polarizations: JsonField<MutableList<String>>? = null
                private var projAngVels: JsonField<MutableList<Double>>? = null
                private var pulseBandwidth: JsonField<Double> = JsonMissing.of()
                private var rangeAccels: JsonField<MutableList<Double>>? = null
                private var rangeBiases: JsonField<MutableList<Double>>? = null
                private var rangeRates: JsonField<MutableList<Double>>? = null
                private var ranges: JsonField<MutableList<Double>>? = null
                private var rcsErrorEsts: JsonField<MutableList<Double>>? = null
                private var rcsValues: JsonField<MutableList<Double>>? = null
                private var rspaces: JsonField<MutableList<Double>>? = null
                private var spectralWidths: JsonField<MutableList<Double>>? = null
                private var tovs: JsonField<MutableList<OffsetDateTime>>? = null
                private var xaccel: JsonField<MutableList<Double>>? = null
                private var xpos: JsonField<MutableList<Double>>? = null
                private var xspaces: JsonField<MutableList<Double>>? = null
                private var xvel: JsonField<MutableList<Double>>? = null
                private var yaccel: JsonField<MutableList<Double>>? = null
                private var ypos: JsonField<MutableList<Double>>? = null
                private var yvel: JsonField<MutableList<Double>>? = null
                private var zaccel: JsonField<MutableList<Double>>? = null
                private var zpos: JsonField<MutableList<Double>>? = null
                private var zvel: JsonField<MutableList<Double>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(radarSoiObservationList: RadarSoiObservationList) = apply {
                    obStartTime = radarSoiObservationList.obStartTime
                    aspectAngles = radarSoiObservationList.aspectAngles.map { it.toMutableList() }
                    azimuthBiases = radarSoiObservationList.azimuthBiases.map { it.toMutableList() }
                    azimuthRates = radarSoiObservationList.azimuthRates.map { it.toMutableList() }
                    azimuths = radarSoiObservationList.azimuths.map { it.toMutableList() }
                    beta = radarSoiObservationList.beta
                    centerFrequency = radarSoiObservationList.centerFrequency
                    crossRangeRes = radarSoiObservationList.crossRangeRes.map { it.toMutableList() }
                    deltaTimes = radarSoiObservationList.deltaTimes.map { it.toMutableList() }
                    doppler2XRs = radarSoiObservationList.doppler2XRs.map { it.toMutableList() }
                    elevationBiases =
                        radarSoiObservationList.elevationBiases.map { it.toMutableList() }
                    elevationRates =
                        radarSoiObservationList.elevationRates.map { it.toMutableList() }
                    elevations = radarSoiObservationList.elevations.map { it.toMutableList() }
                    idAttitudeSet = radarSoiObservationList.idAttitudeSet
                    idStateVector = radarSoiObservationList.idStateVector
                    integrationAngles =
                        radarSoiObservationList.integrationAngles.map { it.toMutableList() }
                    kappa = radarSoiObservationList.kappa
                    peakAmplitudes =
                        radarSoiObservationList.peakAmplitudes.map { it.toMutableList() }
                    polarizations = radarSoiObservationList.polarizations.map { it.toMutableList() }
                    projAngVels = radarSoiObservationList.projAngVels.map { it.toMutableList() }
                    pulseBandwidth = radarSoiObservationList.pulseBandwidth
                    rangeAccels = radarSoiObservationList.rangeAccels.map { it.toMutableList() }
                    rangeBiases = radarSoiObservationList.rangeBiases.map { it.toMutableList() }
                    rangeRates = radarSoiObservationList.rangeRates.map { it.toMutableList() }
                    ranges = radarSoiObservationList.ranges.map { it.toMutableList() }
                    rcsErrorEsts = radarSoiObservationList.rcsErrorEsts.map { it.toMutableList() }
                    rcsValues = radarSoiObservationList.rcsValues.map { it.toMutableList() }
                    rspaces = radarSoiObservationList.rspaces.map { it.toMutableList() }
                    spectralWidths =
                        radarSoiObservationList.spectralWidths.map { it.toMutableList() }
                    tovs = radarSoiObservationList.tovs.map { it.toMutableList() }
                    xaccel = radarSoiObservationList.xaccel.map { it.toMutableList() }
                    xpos = radarSoiObservationList.xpos.map { it.toMutableList() }
                    xspaces = radarSoiObservationList.xspaces.map { it.toMutableList() }
                    xvel = radarSoiObservationList.xvel.map { it.toMutableList() }
                    yaccel = radarSoiObservationList.yaccel.map { it.toMutableList() }
                    ypos = radarSoiObservationList.ypos.map { it.toMutableList() }
                    yvel = radarSoiObservationList.yvel.map { it.toMutableList() }
                    zaccel = radarSoiObservationList.zaccel.map { it.toMutableList() }
                    zpos = radarSoiObservationList.zpos.map { it.toMutableList() }
                    zvel = radarSoiObservationList.zvel.map { it.toMutableList() }
                    additionalProperties =
                        radarSoiObservationList.additionalProperties.toMutableMap()
                }

                /**
                 * Observation detection start time in ISO 8601 UTC format with microsecond
                 * precision.
                 */
                fun obStartTime(obStartTime: OffsetDateTime) =
                    obStartTime(JsonField.of(obStartTime))

                /**
                 * Sets [Builder.obStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.obStartTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun obStartTime(obStartTime: JsonField<OffsetDateTime>) = apply {
                    this.obStartTime = obStartTime
                }

                /**
                 * Array of the aspect angle at the center of the image in degrees. The 'tovs' and
                 * 'aspectAngles' arrays must match in size, if 'aspectAngles' is provided.
                 */
                fun aspectAngles(aspectAngles: List<Double>) =
                    aspectAngles(JsonField.of(aspectAngles))

                /**
                 * Sets [Builder.aspectAngles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.aspectAngles] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun aspectAngles(aspectAngles: JsonField<List<Double>>) = apply {
                    this.aspectAngles = aspectAngles.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [aspectAngles].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAspectAngle(aspectAngle: Double) = apply {
                    aspectAngles =
                        (aspectAngles ?: JsonField.of(mutableListOf())).also {
                            checkKnown("aspectAngles", it).add(aspectAngle)
                        }
                }

                /**
                 * Array of sensor azimuth angle biases in degrees. The 'tovs' and 'azimuthBiases'
                 * arrays must match in size, if 'azimuthBiases' is provided.
                 */
                fun azimuthBiases(azimuthBiases: List<Double>) =
                    azimuthBiases(JsonField.of(azimuthBiases))

                /**
                 * Sets [Builder.azimuthBiases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azimuthBiases] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun azimuthBiases(azimuthBiases: JsonField<List<Double>>) = apply {
                    this.azimuthBiases = azimuthBiases.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [azimuthBiases].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAzimuthBiase(azimuthBiase: Double) = apply {
                    azimuthBiases =
                        (azimuthBiases ?: JsonField.of(mutableListOf())).also {
                            checkKnown("azimuthBiases", it).add(azimuthBiase)
                        }
                }

                /**
                 * Array of the azimuth rate of target at image center in degrees per second. The
                 * 'tovs' and 'azimuthRates' arrays must match in size, if 'azimuthRates' is
                 * provided. If there is an associated image the azimuth rate is assumed to be at
                 * image center.
                 */
                fun azimuthRates(azimuthRates: List<Double>) =
                    azimuthRates(JsonField.of(azimuthRates))

                /**
                 * Sets [Builder.azimuthRates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azimuthRates] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun azimuthRates(azimuthRates: JsonField<List<Double>>) = apply {
                    this.azimuthRates = azimuthRates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [azimuthRates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAzimuthRate(azimuthRate: Double) = apply {
                    azimuthRates =
                        (azimuthRates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("azimuthRates", it).add(azimuthRate)
                        }
                }

                /**
                 * Array of the azimuth angle to target at image center in degrees. The 'tovs' and
                 * 'azimuths' arrays must match in size, if 'azimuths' is provided. If there is an
                 * associated image the azimuth angle is assumed to be at image center.
                 */
                fun azimuths(azimuths: List<Double>) = azimuths(JsonField.of(azimuths))

                /**
                 * Sets [Builder.azimuths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.azimuths] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun azimuths(azimuths: JsonField<List<Double>>) = apply {
                    this.azimuths = azimuths.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [azimuths].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAzimuth(azimuth: Double) = apply {
                    azimuths =
                        (azimuths ?: JsonField.of(mutableListOf())).also {
                            checkKnown("azimuths", it).add(azimuth)
                        }
                }

                /** Beta angle (between target and radar-image frame z axis) in degrees. */
                fun beta(beta: Double) = beta(JsonField.of(beta))

                /**
                 * Sets [Builder.beta] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beta] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun beta(beta: JsonField<Double>) = apply { this.beta = beta }

                /** Radar center frequency of the radar in hertz. */
                fun centerFrequency(centerFrequency: Double) =
                    centerFrequency(JsonField.of(centerFrequency))

                /**
                 * Sets [Builder.centerFrequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.centerFrequency] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun centerFrequency(centerFrequency: JsonField<Double>) = apply {
                    this.centerFrequency = centerFrequency
                }

                /**
                 * Array of cross-range resolutions (accounting for weighting function) in
                 * kilometers. The 'tovs' and 'crossRangeRes' arrays must match in size, if
                 * 'crossRangeRes' is provided.
                 */
                fun crossRangeRes(crossRangeRes: List<Double>) =
                    crossRangeRes(JsonField.of(crossRangeRes))

                /**
                 * Sets [Builder.crossRangeRes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.crossRangeRes] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun crossRangeRes(crossRangeRes: JsonField<List<Double>>) = apply {
                    this.crossRangeRes = crossRangeRes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [crossRangeRes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCrossRangeRe(crossRangeRe: Double) = apply {
                    crossRangeRes =
                        (crossRangeRes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("crossRangeRes", it).add(crossRangeRe)
                        }
                }

                /**
                 * Array of average Interpulse spacing in seconds. The 'tovs' and 'deltaTimes'
                 * arrays must match in size, if 'deltaTimes' is provided.
                 */
                fun deltaTimes(deltaTimes: List<Double>) = deltaTimes(JsonField.of(deltaTimes))

                /**
                 * Sets [Builder.deltaTimes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.deltaTimes] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun deltaTimes(deltaTimes: JsonField<List<Double>>) = apply {
                    this.deltaTimes = deltaTimes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [deltaTimes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDeltaTime(deltaTime: Double) = apply {
                    deltaTimes =
                        (deltaTimes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("deltaTimes", it).add(deltaTime)
                        }
                }

                /**
                 * Array of conversion factors between Doppler in hertz and cross-range in meters.
                 * The 'tovs' and 'doppler2XRs' arrays must match in size, if 'doppler2XRs' is
                 * provided.
                 */
                fun doppler2XRs(doppler2XRs: List<Double>) = doppler2XRs(JsonField.of(doppler2XRs))

                /**
                 * Sets [Builder.doppler2XRs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doppler2XRs] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun doppler2XRs(doppler2XRs: JsonField<List<Double>>) = apply {
                    this.doppler2XRs = doppler2XRs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [doppler2XRs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addDoppler2Xr(doppler2XR: Double) = apply {
                    doppler2XRs =
                        (doppler2XRs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("doppler2XRs", it).add(doppler2XR)
                        }
                }

                /**
                 * Array of sensor elevation biases in degrees. The 'tovs' and 'elevationBiases'
                 * arrays must match in size, if 'elevationBiases' is provided.
                 */
                fun elevationBiases(elevationBiases: List<Double>) =
                    elevationBiases(JsonField.of(elevationBiases))

                /**
                 * Sets [Builder.elevationBiases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elevationBiases] with a well-typed
                 * `List<Double>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun elevationBiases(elevationBiases: JsonField<List<Double>>) = apply {
                    this.elevationBiases = elevationBiases.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [elevationBiases].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addElevationBiase(elevationBiase: Double) = apply {
                    elevationBiases =
                        (elevationBiases ?: JsonField.of(mutableListOf())).also {
                            checkKnown("elevationBiases", it).add(elevationBiase)
                        }
                }

                /**
                 * Array of the elevation rate of target at image center in degrees per second. The
                 * 'tovs' and 'elevationRates' arrays must match in size, if 'elevationRates' is
                 * provided. If there is an associated image the elevation rate is assumed to be at
                 * image center.
                 */
                fun elevationRates(elevationRates: List<Double>) =
                    elevationRates(JsonField.of(elevationRates))

                /**
                 * Sets [Builder.elevationRates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elevationRates] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun elevationRates(elevationRates: JsonField<List<Double>>) = apply {
                    this.elevationRates = elevationRates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [elevationRates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addElevationRate(elevationRate: Double) = apply {
                    elevationRates =
                        (elevationRates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("elevationRates", it).add(elevationRate)
                        }
                }

                /**
                 * Array of the elevation angle to target at image center in degrees. The 'tovs' and
                 * 'elevations' arrays must match in size, if 'elevations' is provided. If there is
                 * an associated image the elevation angle is assumed to be at image center.
                 */
                fun elevations(elevations: List<Double>) = elevations(JsonField.of(elevations))

                /**
                 * Sets [Builder.elevations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.elevations] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun elevations(elevations: JsonField<List<Double>>) = apply {
                    this.elevations = elevations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [elevations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addElevation(elevation: Double) = apply {
                    elevations =
                        (elevations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("elevations", it).add(elevation)
                        }
                }

                /** Optional id of assumed AttitudeSet of object being observed. */
                fun idAttitudeSet(idAttitudeSet: String) =
                    idAttitudeSet(JsonField.of(idAttitudeSet))

                /**
                 * Sets [Builder.idAttitudeSet] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idAttitudeSet] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idAttitudeSet(idAttitudeSet: JsonField<String>) = apply {
                    this.idAttitudeSet = idAttitudeSet
                }

                /** Optional id of assumed StateVector of object being observed. */
                fun idStateVector(idStateVector: String) =
                    idStateVector(JsonField.of(idStateVector))

                /**
                 * Sets [Builder.idStateVector] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idStateVector] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idStateVector(idStateVector: JsonField<String>) = apply {
                    this.idStateVector = idStateVector
                }

                /**
                 * Array of Integration angles in degrees. The 'tovs' and 'integrationAngles' arrays
                 * must match in size, if 'integrationAngles' is provided.
                 */
                fun integrationAngles(integrationAngles: List<Double>) =
                    integrationAngles(JsonField.of(integrationAngles))

                /**
                 * Sets [Builder.integrationAngles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.integrationAngles] with a well-typed
                 * `List<Double>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun integrationAngles(integrationAngles: JsonField<List<Double>>) = apply {
                    this.integrationAngles = integrationAngles.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [integrationAngles].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIntegrationAngle(integrationAngle: Double) = apply {
                    integrationAngles =
                        (integrationAngles ?: JsonField.of(mutableListOf())).also {
                            checkKnown("integrationAngles", it).add(integrationAngle)
                        }
                }

                /** Kappa angle (between radar-line-of-sight and target-frame x axis) in degrees. */
                fun kappa(kappa: Double) = kappa(JsonField.of(kappa))

                /**
                 * Sets [Builder.kappa] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kappa] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun kappa(kappa: JsonField<Double>) = apply { this.kappa = kappa }

                /**
                 * Array of the peak pixel amplitude for each image in decibels. The 'tovs' and
                 * 'peakAmplitudes' arrays must match in size, if 'peakAmplitudes' is provided.
                 */
                fun peakAmplitudes(peakAmplitudes: List<Double>) =
                    peakAmplitudes(JsonField.of(peakAmplitudes))

                /**
                 * Sets [Builder.peakAmplitudes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.peakAmplitudes] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun peakAmplitudes(peakAmplitudes: JsonField<List<Double>>) = apply {
                    this.peakAmplitudes = peakAmplitudes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [peakAmplitudes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPeakAmplitude(peakAmplitude: Double) = apply {
                    peakAmplitudes =
                        (peakAmplitudes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("peakAmplitudes", it).add(peakAmplitude)
                        }
                }

                /**
                 * Array of sensor polarizations when collecting the data. Polarization is a
                 * property of electromagnetic waves that describes the orientation of their
                 * oscillations. Possible values are H - (Horizontally Polarized) Perpendicular to
                 * Earth's surface, V - (Vertically Polarized) Parallel to Earth's surface, L -
                 * (Left Hand Circularly Polarized) Rotating left relative to the Earth's surface,
                 * R - (Right Hand Circularly Polarized) Rotating right relative to the Earth's
                 * surface.
                 */
                fun polarizations(polarizations: List<String>) =
                    polarizations(JsonField.of(polarizations))

                /**
                 * Sets [Builder.polarizations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.polarizations] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun polarizations(polarizations: JsonField<List<String>>) = apply {
                    this.polarizations = polarizations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [polarizations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPolarization(polarization: String) = apply {
                    polarizations =
                        (polarizations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("polarizations", it).add(polarization)
                        }
                }

                /**
                 * Array of the component of target angular velocity observable by radar in radians
                 * per second. The 'tovs' and 'projAngVels' arrays must match in size, if
                 * 'projAngVels' is provided.
                 */
                fun projAngVels(projAngVels: List<Double>) = projAngVels(JsonField.of(projAngVels))

                /**
                 * Sets [Builder.projAngVels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.projAngVels] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun projAngVels(projAngVels: JsonField<List<Double>>) = apply {
                    this.projAngVels = projAngVels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [projAngVels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProjAngVel(projAngVel: Double) = apply {
                    projAngVels =
                        (projAngVels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("projAngVels", it).add(projAngVel)
                        }
                }

                /** Bandwidth of radar pulse in hertz. */
                fun pulseBandwidth(pulseBandwidth: Double) =
                    pulseBandwidth(JsonField.of(pulseBandwidth))

                /**
                 * Sets [Builder.pulseBandwidth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pulseBandwidth] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pulseBandwidth(pulseBandwidth: JsonField<Double>) = apply {
                    this.pulseBandwidth = pulseBandwidth
                }

                /**
                 * Array of the range acceleratons of target in kilometers per second squared. The
                 * 'tovs' and 'rangeAccels' arrays must match in size, if 'rangeAccels' is provided.
                 * If there is an associated image the range acceleration is assumed to be at image
                 * center.
                 */
                fun rangeAccels(rangeAccels: List<Double>) = rangeAccels(JsonField.of(rangeAccels))

                /**
                 * Sets [Builder.rangeAccels] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rangeAccels] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rangeAccels(rangeAccels: JsonField<List<Double>>) = apply {
                    this.rangeAccels = rangeAccels.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [rangeAccels].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRangeAccel(rangeAccel: Double) = apply {
                    rangeAccels =
                        (rangeAccels ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rangeAccels", it).add(rangeAccel)
                        }
                }

                /**
                 * Array of sensor range biases in kilometers. The 'tovs' and 'rangeBiases' arrays
                 * must match in size, if 'rangeBiases' is provided.
                 */
                fun rangeBiases(rangeBiases: List<Double>) = rangeBiases(JsonField.of(rangeBiases))

                /**
                 * Sets [Builder.rangeBiases] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rangeBiases] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rangeBiases(rangeBiases: JsonField<List<Double>>) = apply {
                    this.rangeBiases = rangeBiases.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [rangeBiases].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRangeBiase(rangeBiase: Double) = apply {
                    rangeBiases =
                        (rangeBiases ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rangeBiases", it).add(rangeBiase)
                        }
                }

                /**
                 * Array of the range rate of target at image center in kilometers per second. The
                 * 'tovs' and 'rangeRates' arrays must match in size, if 'rangeRates' is provided.
                 * If there is an associated image the range rate is assumed to be at image center.
                 */
                fun rangeRates(rangeRates: List<Double>) = rangeRates(JsonField.of(rangeRates))

                /**
                 * Sets [Builder.rangeRates] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rangeRates] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rangeRates(rangeRates: JsonField<List<Double>>) = apply {
                    this.rangeRates = rangeRates.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [rangeRates].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRangeRate(rangeRate: Double) = apply {
                    rangeRates =
                        (rangeRates ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rangeRates", it).add(rangeRate)
                        }
                }

                /**
                 * Array of the range to target at image center in kilometers. The 'tovs' and
                 * 'ranges' arrays must match in size, if 'ranges' is provided. If there is an
                 * associated image the range is assumed to be at image center.
                 */
                fun ranges(ranges: List<Double>) = ranges(JsonField.of(ranges))

                /**
                 * Sets [Builder.ranges] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ranges] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ranges(ranges: JsonField<List<Double>>) = apply {
                    this.ranges = ranges.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [ranges].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRange(range: Double) = apply {
                    ranges =
                        (ranges ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ranges", it).add(range)
                        }
                }

                /** Array of error estimates of RCS values, in square meters. */
                fun rcsErrorEsts(rcsErrorEsts: List<Double>) =
                    rcsErrorEsts(JsonField.of(rcsErrorEsts))

                /**
                 * Sets [Builder.rcsErrorEsts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcsErrorEsts] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rcsErrorEsts(rcsErrorEsts: JsonField<List<Double>>) = apply {
                    this.rcsErrorEsts = rcsErrorEsts.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [rcsErrorEsts].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcsErrorEst(rcsErrorEst: Double) = apply {
                    rcsErrorEsts =
                        (rcsErrorEsts ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcsErrorEsts", it).add(rcsErrorEst)
                        }
                }

                /** Array of observed radar cross section (RCS) values, in square meters. */
                fun rcsValues(rcsValues: List<Double>) = rcsValues(JsonField.of(rcsValues))

                /**
                 * Sets [Builder.rcsValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcsValues] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun rcsValues(rcsValues: JsonField<List<Double>>) = apply {
                    this.rcsValues = rcsValues.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [rcsValues].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcsValue(rcsValue: Double) = apply {
                    rcsValues =
                        (rcsValues ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcsValues", it).add(rcsValue)
                        }
                }

                /**
                 * Array of range sample spacing in meters. The 'tovs' and 'rspaces' arrays must
                 * match in size, if 'rspaces' is provided.
                 */
                fun rspaces(rspaces: List<Double>) = rspaces(JsonField.of(rspaces))

                /**
                 * Sets [Builder.rspaces] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rspaces] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rspaces(rspaces: JsonField<List<Double>>) = apply {
                    this.rspaces = rspaces.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [rspaces].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRspace(rspace: Double) = apply {
                    rspaces =
                        (rspaces ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rspaces", it).add(rspace)
                        }
                }

                /**
                 * Array of spectral widths, in hertz. The spectral width of a satellite can help
                 * determine if an object is stable or tumbling which is often useful to distinguish
                 * a rocket body from an active stabilized payload or to deduce a rotational period
                 * of slowly tumbling objects at GEO.
                 */
                fun spectralWidths(spectralWidths: List<Double>) =
                    spectralWidths(JsonField.of(spectralWidths))

                /**
                 * Sets [Builder.spectralWidths] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.spectralWidths] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun spectralWidths(spectralWidths: JsonField<List<Double>>) = apply {
                    this.spectralWidths = spectralWidths.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [spectralWidths].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSpectralWidth(spectralWidth: Double) = apply {
                    spectralWidths =
                        (spectralWidths ?: JsonField.of(mutableListOf())).also {
                            checkKnown("spectralWidths", it).add(spectralWidth)
                        }
                }

                /**
                 * Array of the times of validity in ISO 8601 UTC format with microsecond precision.
                 */
                fun tovs(tovs: List<OffsetDateTime>) = tovs(JsonField.of(tovs))

                /**
                 * Sets [Builder.tovs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tovs] with a well-typed `List<OffsetDateTime>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun tovs(tovs: JsonField<List<OffsetDateTime>>) = apply {
                    this.tovs = tovs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [OffsetDateTime] to [tovs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTov(tov: OffsetDateTime) = apply {
                    tovs =
                        (tovs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tovs", it).add(tov)
                        }
                }

                /**
                 * Array of the cartesian X accelerations, in kilometers per second squared, in the
                 * specified referenceFrame. If referenceFrame is null then J2K should be assumed.
                 * The 'tovs' and 'xaccel' arrays must match in size, if 'xaccel' is provided.
                 */
                fun xaccel(xaccel: List<Double>) = xaccel(JsonField.of(xaccel))

                /**
                 * Sets [Builder.xaccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xaccel] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xaccel(xaccel: JsonField<List<Double>>) = apply {
                    this.xaccel = xaccel.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.xaccel].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addXaccel(xaccel: Double) = apply {
                    this.xaccel =
                        (this.xaccel ?: JsonField.of(mutableListOf())).also {
                            checkKnown("xaccel", it).add(xaccel)
                        }
                }

                /**
                 * Array of the cartesian X positions of the target, in kilometers, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed. The 'tovs'
                 * and 'xpos' arrays must match in size, if 'xpos' is provided.
                 */
                fun xpos(xpos: List<Double>) = xpos(JsonField.of(xpos))

                /**
                 * Sets [Builder.xpos] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xpos] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xpos(xpos: JsonField<List<Double>>) = apply {
                    this.xpos = xpos.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [xpos].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addXpo(xpo: Double) = apply {
                    xpos =
                        (xpos ?: JsonField.of(mutableListOf())).also {
                            checkKnown("xpos", it).add(xpo)
                        }
                }

                /**
                 * Array of cross-range sample spacing in meters. The 'tovs' and 'xspaces' arrays
                 * must match in size, if 'xspaces' is provided.
                 */
                fun xspaces(xspaces: List<Double>) = xspaces(JsonField.of(xspaces))

                /**
                 * Sets [Builder.xspaces] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xspaces] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xspaces(xspaces: JsonField<List<Double>>) = apply {
                    this.xspaces = xspaces.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [xspaces].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addXspace(xspace: Double) = apply {
                    xspaces =
                        (xspaces ?: JsonField.of(mutableListOf())).also {
                            checkKnown("xspaces", it).add(xspace)
                        }
                }

                /**
                 * Array of the cartesian X velocities of target, in kilometers per second, in the
                 * specified referenceFrame. If referenceFrame is null then J2K should be assumed.
                 * The 'tovs' and 'xvel' arrays must match in size, if 'xvel' is provided.
                 */
                fun xvel(xvel: List<Double>) = xvel(JsonField.of(xvel))

                /**
                 * Sets [Builder.xvel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xvel] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xvel(xvel: JsonField<List<Double>>) = apply {
                    this.xvel = xvel.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.xvel].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addXvel(xvel: Double) = apply {
                    this.xvel =
                        (this.xvel ?: JsonField.of(mutableListOf())).also {
                            checkKnown("xvel", it).add(xvel)
                        }
                }

                /**
                 * Array of the cartesian Y accelerations, in kilometers per second squared, in the
                 * specified referenceFrame. If referenceFrame is null then J2K should be assumed.
                 * The 'tovs' and 'yaccel' arrays must match in size, if 'yaccel' is provided.
                 */
                fun yaccel(yaccel: List<Double>) = yaccel(JsonField.of(yaccel))

                /**
                 * Sets [Builder.yaccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yaccel] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yaccel(yaccel: JsonField<List<Double>>) = apply {
                    this.yaccel = yaccel.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.yaccel].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addYaccel(yaccel: Double) = apply {
                    this.yaccel =
                        (this.yaccel ?: JsonField.of(mutableListOf())).also {
                            checkKnown("yaccel", it).add(yaccel)
                        }
                }

                /**
                 * Array of the cartesian Y positions of the target, in kilometers, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed. The 'tovs'
                 * and 'ypos' arrays must match in size, if 'ypos' is provided.
                 */
                fun ypos(ypos: List<Double>) = ypos(JsonField.of(ypos))

                /**
                 * Sets [Builder.ypos] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ypos] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ypos(ypos: JsonField<List<Double>>) = apply {
                    this.ypos = ypos.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [ypos].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addYpo(ypo: Double) = apply {
                    ypos =
                        (ypos ?: JsonField.of(mutableListOf())).also {
                            checkKnown("ypos", it).add(ypo)
                        }
                }

                /**
                 * Array of the cartesian Y velocities of target, in kilometers per second, in the
                 * specified referenceFrame. If referenceFrame is null then J2K should be assumed.
                 * The 'tovs' and 'yvel' arrays must match in size, if 'yvel' is provided.
                 */
                fun yvel(yvel: List<Double>) = yvel(JsonField.of(yvel))

                /**
                 * Sets [Builder.yvel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yvel] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yvel(yvel: JsonField<List<Double>>) = apply {
                    this.yvel = yvel.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.yvel].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addYvel(yvel: Double) = apply {
                    this.yvel =
                        (this.yvel ?: JsonField.of(mutableListOf())).also {
                            checkKnown("yvel", it).add(yvel)
                        }
                }

                /**
                 * Array of the cartesian Z accelerations, in kilometers per second squared, in the
                 * specified referenceFrame. If referenceFrame is null then J2K should be assumed.
                 * The 'tovs' and 'zaccel' arrays must match in size, if 'zaccel' is provided.
                 */
                fun zaccel(zaccel: List<Double>) = zaccel(JsonField.of(zaccel))

                /**
                 * Sets [Builder.zaccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zaccel] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zaccel(zaccel: JsonField<List<Double>>) = apply {
                    this.zaccel = zaccel.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.zaccel].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addZaccel(zaccel: Double) = apply {
                    this.zaccel =
                        (this.zaccel ?: JsonField.of(mutableListOf())).also {
                            checkKnown("zaccel", it).add(zaccel)
                        }
                }

                /**
                 * Array of the cartesian Z positions of the target, in kilometers, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed. The 'tovs'
                 * and 'zpos' arrays must match in size, if 'zpos' is provided.
                 */
                fun zpos(zpos: List<Double>) = zpos(JsonField.of(zpos))

                /**
                 * Sets [Builder.zpos] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zpos] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zpos(zpos: JsonField<List<Double>>) = apply {
                    this.zpos = zpos.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [zpos].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addZpo(zpo: Double) = apply {
                    zpos =
                        (zpos ?: JsonField.of(mutableListOf())).also {
                            checkKnown("zpos", it).add(zpo)
                        }
                }

                /**
                 * Array of the cartesian Z velocities of target, in kilometers per second, in the
                 * specified referenceFrame. If referenceFrame is null then J2K should be assumed.
                 * The 'tovs' and 'zvel' arrays must match in size, if 'zvel' is provided.
                 */
                fun zvel(zvel: List<Double>) = zvel(JsonField.of(zvel))

                /**
                 * Sets [Builder.zvel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zvel] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zvel(zvel: JsonField<List<Double>>) = apply {
                    this.zvel = zvel.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.zvel].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addZvel(zvel: Double) = apply {
                    this.zvel =
                        (this.zvel ?: JsonField.of(mutableListOf())).also {
                            checkKnown("zvel", it).add(zvel)
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
                 * Returns an immutable instance of [RadarSoiObservationList].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .obStartTime()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RadarSoiObservationList =
                    RadarSoiObservationList(
                        checkRequired("obStartTime", obStartTime),
                        (aspectAngles ?: JsonMissing.of()).map { it.toImmutable() },
                        (azimuthBiases ?: JsonMissing.of()).map { it.toImmutable() },
                        (azimuthRates ?: JsonMissing.of()).map { it.toImmutable() },
                        (azimuths ?: JsonMissing.of()).map { it.toImmutable() },
                        beta,
                        centerFrequency,
                        (crossRangeRes ?: JsonMissing.of()).map { it.toImmutable() },
                        (deltaTimes ?: JsonMissing.of()).map { it.toImmutable() },
                        (doppler2XRs ?: JsonMissing.of()).map { it.toImmutable() },
                        (elevationBiases ?: JsonMissing.of()).map { it.toImmutable() },
                        (elevationRates ?: JsonMissing.of()).map { it.toImmutable() },
                        (elevations ?: JsonMissing.of()).map { it.toImmutable() },
                        idAttitudeSet,
                        idStateVector,
                        (integrationAngles ?: JsonMissing.of()).map { it.toImmutable() },
                        kappa,
                        (peakAmplitudes ?: JsonMissing.of()).map { it.toImmutable() },
                        (polarizations ?: JsonMissing.of()).map { it.toImmutable() },
                        (projAngVels ?: JsonMissing.of()).map { it.toImmutable() },
                        pulseBandwidth,
                        (rangeAccels ?: JsonMissing.of()).map { it.toImmutable() },
                        (rangeBiases ?: JsonMissing.of()).map { it.toImmutable() },
                        (rangeRates ?: JsonMissing.of()).map { it.toImmutable() },
                        (ranges ?: JsonMissing.of()).map { it.toImmutable() },
                        (rcsErrorEsts ?: JsonMissing.of()).map { it.toImmutable() },
                        (rcsValues ?: JsonMissing.of()).map { it.toImmutable() },
                        (rspaces ?: JsonMissing.of()).map { it.toImmutable() },
                        (spectralWidths ?: JsonMissing.of()).map { it.toImmutable() },
                        (tovs ?: JsonMissing.of()).map { it.toImmutable() },
                        (xaccel ?: JsonMissing.of()).map { it.toImmutable() },
                        (xpos ?: JsonMissing.of()).map { it.toImmutable() },
                        (xspaces ?: JsonMissing.of()).map { it.toImmutable() },
                        (xvel ?: JsonMissing.of()).map { it.toImmutable() },
                        (yaccel ?: JsonMissing.of()).map { it.toImmutable() },
                        (ypos ?: JsonMissing.of()).map { it.toImmutable() },
                        (yvel ?: JsonMissing.of()).map { it.toImmutable() },
                        (zaccel ?: JsonMissing.of()).map { it.toImmutable() },
                        (zpos ?: JsonMissing.of()).map { it.toImmutable() },
                        (zvel ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RadarSoiObservationList = apply {
                if (validated) {
                    return@apply
                }

                obStartTime()
                aspectAngles()
                azimuthBiases()
                azimuthRates()
                azimuths()
                beta()
                centerFrequency()
                crossRangeRes()
                deltaTimes()
                doppler2XRs()
                elevationBiases()
                elevationRates()
                elevations()
                idAttitudeSet()
                idStateVector()
                integrationAngles()
                kappa()
                peakAmplitudes()
                polarizations()
                projAngVels()
                pulseBandwidth()
                rangeAccels()
                rangeBiases()
                rangeRates()
                ranges()
                rcsErrorEsts()
                rcsValues()
                rspaces()
                spectralWidths()
                tovs()
                xaccel()
                xpos()
                xspaces()
                xvel()
                yaccel()
                ypos()
                yvel()
                zaccel()
                zpos()
                zvel()
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
                (if (obStartTime.asKnown().isPresent) 1 else 0) +
                    (aspectAngles.asKnown().getOrNull()?.size ?: 0) +
                    (azimuthBiases.asKnown().getOrNull()?.size ?: 0) +
                    (azimuthRates.asKnown().getOrNull()?.size ?: 0) +
                    (azimuths.asKnown().getOrNull()?.size ?: 0) +
                    (if (beta.asKnown().isPresent) 1 else 0) +
                    (if (centerFrequency.asKnown().isPresent) 1 else 0) +
                    (crossRangeRes.asKnown().getOrNull()?.size ?: 0) +
                    (deltaTimes.asKnown().getOrNull()?.size ?: 0) +
                    (doppler2XRs.asKnown().getOrNull()?.size ?: 0) +
                    (elevationBiases.asKnown().getOrNull()?.size ?: 0) +
                    (elevationRates.asKnown().getOrNull()?.size ?: 0) +
                    (elevations.asKnown().getOrNull()?.size ?: 0) +
                    (if (idAttitudeSet.asKnown().isPresent) 1 else 0) +
                    (if (idStateVector.asKnown().isPresent) 1 else 0) +
                    (integrationAngles.asKnown().getOrNull()?.size ?: 0) +
                    (if (kappa.asKnown().isPresent) 1 else 0) +
                    (peakAmplitudes.asKnown().getOrNull()?.size ?: 0) +
                    (polarizations.asKnown().getOrNull()?.size ?: 0) +
                    (projAngVels.asKnown().getOrNull()?.size ?: 0) +
                    (if (pulseBandwidth.asKnown().isPresent) 1 else 0) +
                    (rangeAccels.asKnown().getOrNull()?.size ?: 0) +
                    (rangeBiases.asKnown().getOrNull()?.size ?: 0) +
                    (rangeRates.asKnown().getOrNull()?.size ?: 0) +
                    (ranges.asKnown().getOrNull()?.size ?: 0) +
                    (rcsErrorEsts.asKnown().getOrNull()?.size ?: 0) +
                    (rcsValues.asKnown().getOrNull()?.size ?: 0) +
                    (rspaces.asKnown().getOrNull()?.size ?: 0) +
                    (spectralWidths.asKnown().getOrNull()?.size ?: 0) +
                    (tovs.asKnown().getOrNull()?.size ?: 0) +
                    (xaccel.asKnown().getOrNull()?.size ?: 0) +
                    (xpos.asKnown().getOrNull()?.size ?: 0) +
                    (xspaces.asKnown().getOrNull()?.size ?: 0) +
                    (xvel.asKnown().getOrNull()?.size ?: 0) +
                    (yaccel.asKnown().getOrNull()?.size ?: 0) +
                    (ypos.asKnown().getOrNull()?.size ?: 0) +
                    (yvel.asKnown().getOrNull()?.size ?: 0) +
                    (zaccel.asKnown().getOrNull()?.size ?: 0) +
                    (zpos.asKnown().getOrNull()?.size ?: 0) +
                    (zvel.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RadarSoiObservationList &&
                    obStartTime == other.obStartTime &&
                    aspectAngles == other.aspectAngles &&
                    azimuthBiases == other.azimuthBiases &&
                    azimuthRates == other.azimuthRates &&
                    azimuths == other.azimuths &&
                    beta == other.beta &&
                    centerFrequency == other.centerFrequency &&
                    crossRangeRes == other.crossRangeRes &&
                    deltaTimes == other.deltaTimes &&
                    doppler2XRs == other.doppler2XRs &&
                    elevationBiases == other.elevationBiases &&
                    elevationRates == other.elevationRates &&
                    elevations == other.elevations &&
                    idAttitudeSet == other.idAttitudeSet &&
                    idStateVector == other.idStateVector &&
                    integrationAngles == other.integrationAngles &&
                    kappa == other.kappa &&
                    peakAmplitudes == other.peakAmplitudes &&
                    polarizations == other.polarizations &&
                    projAngVels == other.projAngVels &&
                    pulseBandwidth == other.pulseBandwidth &&
                    rangeAccels == other.rangeAccels &&
                    rangeBiases == other.rangeBiases &&
                    rangeRates == other.rangeRates &&
                    ranges == other.ranges &&
                    rcsErrorEsts == other.rcsErrorEsts &&
                    rcsValues == other.rcsValues &&
                    rspaces == other.rspaces &&
                    spectralWidths == other.spectralWidths &&
                    tovs == other.tovs &&
                    xaccel == other.xaccel &&
                    xpos == other.xpos &&
                    xspaces == other.xspaces &&
                    xvel == other.xvel &&
                    yaccel == other.yaccel &&
                    ypos == other.ypos &&
                    yvel == other.yvel &&
                    zaccel == other.zaccel &&
                    zpos == other.zpos &&
                    zvel == other.zvel &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    obStartTime,
                    aspectAngles,
                    azimuthBiases,
                    azimuthRates,
                    azimuths,
                    beta,
                    centerFrequency,
                    crossRangeRes,
                    deltaTimes,
                    doppler2XRs,
                    elevationBiases,
                    elevationRates,
                    elevations,
                    idAttitudeSet,
                    idStateVector,
                    integrationAngles,
                    kappa,
                    peakAmplitudes,
                    polarizations,
                    projAngVels,
                    pulseBandwidth,
                    rangeAccels,
                    rangeBiases,
                    rangeRates,
                    ranges,
                    rcsErrorEsts,
                    rcsValues,
                    rspaces,
                    spectralWidths,
                    tovs,
                    xaccel,
                    xpos,
                    xspaces,
                    xvel,
                    yaccel,
                    ypos,
                    yvel,
                    zaccel,
                    zpos,
                    zvel,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RadarSoiObservationList{obStartTime=$obStartTime, aspectAngles=$aspectAngles, azimuthBiases=$azimuthBiases, azimuthRates=$azimuthRates, azimuths=$azimuths, beta=$beta, centerFrequency=$centerFrequency, crossRangeRes=$crossRangeRes, deltaTimes=$deltaTimes, doppler2XRs=$doppler2XRs, elevationBiases=$elevationBiases, elevationRates=$elevationRates, elevations=$elevations, idAttitudeSet=$idAttitudeSet, idStateVector=$idStateVector, integrationAngles=$integrationAngles, kappa=$kappa, peakAmplitudes=$peakAmplitudes, polarizations=$polarizations, projAngVels=$projAngVels, pulseBandwidth=$pulseBandwidth, rangeAccels=$rangeAccels, rangeBiases=$rangeBiases, rangeRates=$rangeRates, ranges=$ranges, rcsErrorEsts=$rcsErrorEsts, rcsValues=$rcsValues, rspaces=$rspaces, spectralWidths=$spectralWidths, tovs=$tovs, xaccel=$xaccel, xpos=$xpos, xspaces=$xspaces, xvel=$xvel, yaccel=$yaccel, ypos=$ypos, yvel=$yvel, zaccel=$zaccel, zpos=$zpos, zvel=$zvel, additionalProperties=$additionalProperties}"
        }

        /**
         * The reference frame of the observation measurements. If the referenceFrame is null it is
         * assumed to be J2000.
         */
        class ReferenceFrame
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val J2000 = of("J2000")

                @JvmField val EFG_TDR = of("EFG/TDR")

                @JvmField val ECR_ECEF = of("ECR/ECEF")

                @JvmField val TEME = of("TEME")

                @JvmField val ITRF = of("ITRF")

                @JvmField val GCRF = of("GCRF")

                @JvmStatic fun of(value: String) = ReferenceFrame(JsonField.of(value))
            }

            /** An enum containing [ReferenceFrame]'s known values. */
            enum class Known {
                J2000,
                EFG_TDR,
                ECR_ECEF,
                TEME,
                ITRF,
                GCRF,
            }

            /**
             * An enum containing [ReferenceFrame]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ReferenceFrame] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                J2000,
                EFG_TDR,
                ECR_ECEF,
                TEME,
                ITRF,
                GCRF,
                /**
                 * An enum member indicating that [ReferenceFrame] was instantiated with an unknown
                 * value.
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
                    J2000 -> Value.J2000
                    EFG_TDR -> Value.EFG_TDR
                    ECR_ECEF -> Value.ECR_ECEF
                    TEME -> Value.TEME
                    ITRF -> Value.ITRF
                    GCRF -> Value.GCRF
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
                    J2000 -> Known.J2000
                    EFG_TDR -> Known.EFG_TDR
                    ECR_ECEF -> Known.ECR_ECEF
                    TEME -> Known.TEME
                    ITRF -> Known.ITRF
                    GCRF -> Known.GCRF
                    else ->
                        throw UnifieddatalibraryInvalidDataException(
                            "Unknown ReferenceFrame: $value"
                        )
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

            fun validate(): ReferenceFrame = apply {
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

                return other is ReferenceFrame && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The reference frame of the observing sensor state. If the senReferenceFrame is null it is
         * assumed to be J2000.
         */
        class SenReferenceFrame
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val J2000 = of("J2000")

                @JvmField val EFG_TDR = of("EFG/TDR")

                @JvmField val ECR_ECEF = of("ECR/ECEF")

                @JvmField val TEME = of("TEME")

                @JvmField val ITRF = of("ITRF")

                @JvmField val GCRF = of("GCRF")

                @JvmStatic fun of(value: String) = SenReferenceFrame(JsonField.of(value))
            }

            /** An enum containing [SenReferenceFrame]'s known values. */
            enum class Known {
                J2000,
                EFG_TDR,
                ECR_ECEF,
                TEME,
                ITRF,
                GCRF,
            }

            /**
             * An enum containing [SenReferenceFrame]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SenReferenceFrame] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                J2000,
                EFG_TDR,
                ECR_ECEF,
                TEME,
                ITRF,
                GCRF,
                /**
                 * An enum member indicating that [SenReferenceFrame] was instantiated with an
                 * unknown value.
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
                    J2000 -> Value.J2000
                    EFG_TDR -> Value.EFG_TDR
                    ECR_ECEF -> Value.ECR_ECEF
                    TEME -> Value.TEME
                    ITRF -> Value.ITRF
                    GCRF -> Value.GCRF
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
                    J2000 -> Known.J2000
                    EFG_TDR -> Known.EFG_TDR
                    ECR_ECEF -> Known.ECR_ECEF
                    TEME -> Known.TEME
                    ITRF -> Known.ITRF
                    GCRF -> Known.GCRF
                    else ->
                        throw UnifieddatalibraryInvalidDataException(
                            "Unknown SenReferenceFrame: $value"
                        )
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

            fun validate(): SenReferenceFrame = apply {
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

                return other is SenReferenceFrame && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                numObs == other.numObs &&
                source == other.source &&
                startTime == other.startTime &&
                type == other.type &&
                id == other.id &&
                binningHoriz == other.binningHoriz &&
                binningVert == other.binningVert &&
                brightnessVarianceChangeDetected == other.brightnessVarianceChangeDetected &&
                calibrations == other.calibrations &&
                calibrationType == other.calibrationType &&
                changeConf == other.changeConf &&
                changeDetected == other.changeDetected &&
                collectionDensityConf == other.collectionDensityConf &&
                collectionId == other.collectionId &&
                collectionMode == other.collectionMode &&
                corrQuality == other.corrQuality &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                endTime == other.endTime &&
                gain == other.gain &&
                idElset == other.idElset &&
                idOnOrbit == other.idOnOrbit &&
                idSensor == other.idSensor &&
                losDeclinationEnd == other.losDeclinationEnd &&
                losDeclinationStart == other.losDeclinationStart &&
                msgCreateDate == other.msgCreateDate &&
                numSpectralFilters == other.numSpectralFilters &&
                opticalSoiObservationList == other.opticalSoiObservationList &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                origSensorId == other.origSensorId &&
                percentSatThreshold == other.percentSatThreshold &&
                periodicityChangeDetected == other.periodicityChangeDetected &&
                periodicityDetectionConf == other.periodicityDetectionConf &&
                periodicitySamplingConf == other.periodicitySamplingConf &&
                pixelArrayHeight == other.pixelArrayHeight &&
                pixelArrayWidth == other.pixelArrayWidth &&
                pixelMax == other.pixelMax &&
                pixelMin == other.pixelMin &&
                pointingAngleAzEnd == other.pointingAngleAzEnd &&
                pointingAngleAzStart == other.pointingAngleAzStart &&
                pointingAngleElEnd == other.pointingAngleElEnd &&
                pointingAngleElStart == other.pointingAngleElStart &&
                polarAngleEnd == other.polarAngleEnd &&
                polarAngleStart == other.polarAngleStart &&
                radarSoiObservationList == other.radarSoiObservationList &&
                referenceFrame == other.referenceFrame &&
                satelliteName == other.satelliteName &&
                satNo == other.satNo &&
                senalt == other.senalt &&
                senlat == other.senlat &&
                senlon == other.senlon &&
                senReferenceFrame == other.senReferenceFrame &&
                sensorAsId == other.sensorAsId &&
                senvelx == other.senvelx &&
                senvely == other.senvely &&
                senvelz == other.senvelz &&
                senx == other.senx &&
                seny == other.seny &&
                senz == other.senz &&
                softwareVersion == other.softwareVersion &&
                solarMag == other.solarMag &&
                solarPhaseAngleBrightnessChangeDetected ==
                    other.solarPhaseAngleBrightnessChangeDetected &&
                sourceDl == other.sourceDl &&
                spectralFilters == other.spectralFilters &&
                starCatName == other.starCatName &&
                tags == other.tags &&
                transactionId == other.transactionId &&
                uct == other.uct &&
                validCalibrations == other.validCalibrations
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                numObs,
                source,
                startTime,
                type,
                id,
                binningHoriz,
                binningVert,
                brightnessVarianceChangeDetected,
                calibrations,
                calibrationType,
                changeConf,
                changeDetected,
                collectionDensityConf,
                collectionId,
                collectionMode,
                corrQuality,
                createdAt,
                createdBy,
                endTime,
                gain,
                idElset,
                idOnOrbit,
                idSensor,
                losDeclinationEnd,
                losDeclinationStart,
                msgCreateDate,
                numSpectralFilters,
                opticalSoiObservationList,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                percentSatThreshold,
                periodicityChangeDetected,
                periodicityDetectionConf,
                periodicitySamplingConf,
                pixelArrayHeight,
                pixelArrayWidth,
                pixelMax,
                pixelMin,
                pointingAngleAzEnd,
                pointingAngleAzStart,
                pointingAngleElEnd,
                pointingAngleElStart,
                polarAngleEnd,
                polarAngleStart,
                radarSoiObservationList,
                referenceFrame,
                satelliteName,
                satNo,
                senalt,
                senlat,
                senlon,
                senReferenceFrame,
                sensorAsId,
                senvelx,
                senvely,
                senvelz,
                senx,
                seny,
                senz,
                softwareVersion,
                solarMag,
                solarPhaseAngleBrightnessChangeDetected,
                sourceDl,
                spectralFilters,
                starCatName,
                tags,
                transactionId,
                uct,
                validCalibrations,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, numObs=$numObs, source=$source, startTime=$startTime, type=$type, id=$id, binningHoriz=$binningHoriz, binningVert=$binningVert, brightnessVarianceChangeDetected=$brightnessVarianceChangeDetected, calibrations=$calibrations, calibrationType=$calibrationType, changeConf=$changeConf, changeDetected=$changeDetected, collectionDensityConf=$collectionDensityConf, collectionId=$collectionId, collectionMode=$collectionMode, corrQuality=$corrQuality, createdAt=$createdAt, createdBy=$createdBy, endTime=$endTime, gain=$gain, idElset=$idElset, idOnOrbit=$idOnOrbit, idSensor=$idSensor, losDeclinationEnd=$losDeclinationEnd, losDeclinationStart=$losDeclinationStart, msgCreateDate=$msgCreateDate, numSpectralFilters=$numSpectralFilters, opticalSoiObservationList=$opticalSoiObservationList, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, percentSatThreshold=$percentSatThreshold, periodicityChangeDetected=$periodicityChangeDetected, periodicityDetectionConf=$periodicityDetectionConf, periodicitySamplingConf=$periodicitySamplingConf, pixelArrayHeight=$pixelArrayHeight, pixelArrayWidth=$pixelArrayWidth, pixelMax=$pixelMax, pixelMin=$pixelMin, pointingAngleAzEnd=$pointingAngleAzEnd, pointingAngleAzStart=$pointingAngleAzStart, pointingAngleElEnd=$pointingAngleElEnd, pointingAngleElStart=$pointingAngleElStart, polarAngleEnd=$polarAngleEnd, polarAngleStart=$polarAngleStart, radarSoiObservationList=$radarSoiObservationList, referenceFrame=$referenceFrame, satelliteName=$satelliteName, satNo=$satNo, senalt=$senalt, senlat=$senlat, senlon=$senlon, senReferenceFrame=$senReferenceFrame, sensorAsId=$sensorAsId, senvelx=$senvelx, senvely=$senvely, senvelz=$senvelz, senx=$senx, seny=$seny, senz=$senz, softwareVersion=$softwareVersion, solarMag=$solarMag, solarPhaseAngleBrightnessChangeDetected=$solarPhaseAngleBrightnessChangeDetected, sourceDl=$sourceDl, spectralFilters=$spectralFilters, starCatName=$starCatName, tags=$tags, transactionId=$transactionId, uct=$uct, validCalibrations=$validCalibrations}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SoiObservationSetCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SoiObservationSetCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

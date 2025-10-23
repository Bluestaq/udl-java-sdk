// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.weatherdata

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
 * Service operation to take multiple WeatherData as a POST body and ingest into the database. A
 * specific role is required to perform this service operation. Please contact the UDL team for
 * assistance.
 */
class WeatherDataCreateBulkParams
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
         * Returns a mutable builder for constructing an instance of [WeatherDataCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WeatherDataCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(weatherDataCreateBulkParams: WeatherDataCreateBulkParams) = apply {
            body = weatherDataCreateBulkParams.body.toMutableList()
            additionalHeaders = weatherDataCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = weatherDataCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [WeatherDataCreateBulkParams].
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
        fun build(): WeatherDataCreateBulkParams =
            WeatherDataCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * These services provide for posting and querying Weather Data. Weather Data integrates dynamic
     * data measured by Doppler/CG such as signal power and noise levels, to produce useful weather
     * information.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val obTime: JsonField<OffsetDateTime>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val angleOrientation: JsonField<Double>,
        private val avgRefPwr: JsonField<Double>,
        private val avgTxPwr: JsonField<Double>,
        private val checksum: JsonField<Int>,
        private val coIntegs: JsonField<List<Int>>,
        private val consRecs: JsonField<List<Int>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val doppVels: JsonField<List<Double>>,
        private val fileCreation: JsonField<OffsetDateTime>,
        private val firstGuessAvgs: JsonField<List<Int>>,
        private val idSensor: JsonField<String>,
        private val interpulsePeriods: JsonField<List<Double>>,
        private val lightDetSensors: JsonField<List<Int>>,
        private val lightEventNum: JsonField<Int>,
        private val noiseLvls: JsonField<List<Double>>,
        private val numElements: JsonField<Int>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val origSensorId: JsonField<String>,
        private val posConfidence: JsonField<Double>,
        private val qcValue: JsonField<Int>,
        private val sectorNum: JsonField<Int>,
        private val semiMajorAxis: JsonField<Double>,
        private val semiMinorAxis: JsonField<Double>,
        private val sigPwrs: JsonField<List<Double>>,
        private val sigStrength: JsonField<Double>,
        private val snrs: JsonField<List<Double>>,
        private val specAvgs: JsonField<List<Int>>,
        private val specWidths: JsonField<List<Double>>,
        private val srcIds: JsonField<List<String>>,
        private val srcTyps: JsonField<List<String>>,
        private val tdAvgSampleNums: JsonField<List<Int>>,
        private val termAlt: JsonField<Double>,
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
            @JsonProperty("obTime")
            @ExcludeMissing
            obTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("angleOrientation")
            @ExcludeMissing
            angleOrientation: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgRefPwr")
            @ExcludeMissing
            avgRefPwr: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("avgTxPwr")
            @ExcludeMissing
            avgTxPwr: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("checksum") @ExcludeMissing checksum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("coIntegs")
            @ExcludeMissing
            coIntegs: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("consRecs")
            @ExcludeMissing
            consRecs: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("doppVels")
            @ExcludeMissing
            doppVels: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("fileCreation")
            @ExcludeMissing
            fileCreation: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("firstGuessAvgs")
            @ExcludeMissing
            firstGuessAvgs: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("idSensor")
            @ExcludeMissing
            idSensor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("interpulsePeriods")
            @ExcludeMissing
            interpulsePeriods: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("lightDetSensors")
            @ExcludeMissing
            lightDetSensors: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("lightEventNum")
            @ExcludeMissing
            lightEventNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("noiseLvls")
            @ExcludeMissing
            noiseLvls: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("numElements")
            @ExcludeMissing
            numElements: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origSensorId")
            @ExcludeMissing
            origSensorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("posConfidence")
            @ExcludeMissing
            posConfidence: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("qcValue") @ExcludeMissing qcValue: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("sectorNum") @ExcludeMissing sectorNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("semiMajorAxis")
            @ExcludeMissing
            semiMajorAxis: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("semiMinorAxis")
            @ExcludeMissing
            semiMinorAxis: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("sigPwrs")
            @ExcludeMissing
            sigPwrs: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("sigStrength")
            @ExcludeMissing
            sigStrength: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("snrs") @ExcludeMissing snrs: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("specAvgs")
            @ExcludeMissing
            specAvgs: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("specWidths")
            @ExcludeMissing
            specWidths: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("srcIds")
            @ExcludeMissing
            srcIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("srcTyps")
            @ExcludeMissing
            srcTyps: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tdAvgSampleNums")
            @ExcludeMissing
            tdAvgSampleNums: JsonField<List<Int>> = JsonMissing.of(),
            @JsonProperty("termAlt") @ExcludeMissing termAlt: JsonField<Double> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            obTime,
            source,
            id,
            angleOrientation,
            avgRefPwr,
            avgTxPwr,
            checksum,
            coIntegs,
            consRecs,
            createdAt,
            createdBy,
            doppVels,
            fileCreation,
            firstGuessAvgs,
            idSensor,
            interpulsePeriods,
            lightDetSensors,
            lightEventNum,
            noiseLvls,
            numElements,
            origin,
            origNetwork,
            origSensorId,
            posConfidence,
            qcValue,
            sectorNum,
            semiMajorAxis,
            semiMinorAxis,
            sigPwrs,
            sigStrength,
            snrs,
            specAvgs,
            specWidths,
            srcIds,
            srcTyps,
            tdAvgSampleNums,
            termAlt,
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
         * Datetime of the weather observation in ISO 8601 UTC datetime format with microsecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obTime(): OffsetDateTime = obTime.getRequired("obTime")

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
         * Angle of orientation of the 50% positional confidence ellipse, in degrees clockwise from
         * true north.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun angleOrientation(): Optional<Double> = angleOrientation.getOptional("angleOrientation")

        /**
         * Average power of the reflected signal received by the radar, in Watts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgRefPwr(): Optional<Double> = avgRefPwr.getOptional("avgRefPwr")

        /**
         * Average transmitted power of the radar, in kilowatts.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun avgTxPwr(): Optional<Double> = avgTxPwr.getOptional("avgTxPwr")

        /**
         * Checksum value for the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun checksum(): Optional<Int> = checksum.getOptional("checksum")

        /**
         * Array of the number(s) of measurements used in coherent integrations used for radar data
         * processing. Users should consult the data provider for information on the coherent
         * integrations array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun coIntegs(): Optional<List<Int>> = coIntegs.getOptional("coIntegs")

        /**
         * Array of the number(s) of records in consensus for a radar beam. Users should consult the
         * data provider for information on the consensus records array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun consRecs(): Optional<List<Int>> = consRecs.getOptional("consRecs")

        /**
         * Time the row was created in the database.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Array of full scale Nyquist Doppler velocities measured by radar, in meters per second.
         * Nyquist velocity refers to the maximum velocity magnitude that the radar system can
         * unambiguously detect. Doppler velocities with absolute values exceeding the Nyquist
         * threshold suffer from aliasing at the time of collection. Users should consult the data
         * provider for information on the doppler velocities array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun doppVels(): Optional<List<Double>> = doppVels.getOptional("doppVels")

        /**
         * Datetime the system files were created.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fileCreation(): Optional<OffsetDateTime> = fileCreation.getOptional("fileCreation")

        /**
         * Array of average maximum number(s) of consecutive instances in which the same first guess
         * velocity is used in radar data processing to estimate wind speed. Users should consult
         * the data provider for information on the first guess averages array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun firstGuessAvgs(): Optional<List<Int>> = firstGuessAvgs.getOptional("firstGuessAvgs")

        /**
         * Unique identifier of the sensor making the weather measurement.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Array of the elapsed time(s) from the beginning of one pulse to the beginning of the next
         * pulse for a radar beam, in microseconds. Users should consult the data provider for
         * information on the interpulse periods array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun interpulsePeriods(): Optional<List<Double>> =
            interpulsePeriods.getOptional("interpulsePeriods")

        /**
         * Array of sensor(s) that participated in the lightning event location determination.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lightDetSensors(): Optional<List<Int>> = lightDetSensors.getOptional("lightDetSensors")

        /**
         * Number of sensors used in the lightning event location solution.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lightEventNum(): Optional<Int> = lightEventNum.getOptional("lightEventNum")

        /**
         * Array of noise level(s) measured by radar, in decibels. Users should consult the data
         * provider for information on the noise levels array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun noiseLvls(): Optional<List<Double>> = noiseLvls.getOptional("noiseLvls")

        /**
         * Number of antennas across all sectors within the radar coverage area.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numElements(): Optional<Int> = numElements.getOptional("numElements")

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
         * Optional identifier provided by the record source. This may be an internal identifier and
         * not necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * The positional confidence of the calculated lightning event location using the chi-square
         * statistical method.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun posConfidence(): Optional<Double> = posConfidence.getOptional("posConfidence")

        /**
         * Quality control flag value, as defined by the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun qcValue(): Optional<Int> = qcValue.getOptional("qcValue")

        /**
         * Number of sectors within the radar coverage area, each containing a number of antennas.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sectorNum(): Optional<Int> = sectorNum.getOptional("sectorNum")

        /**
         * Semi-major axis of the 50% positional confidence ellipse, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun semiMajorAxis(): Optional<Double> = semiMajorAxis.getOptional("semiMajorAxis")

        /**
         * Semi-minor axis of the 50% positional confidence ellipse, in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun semiMinorAxis(): Optional<Double> = semiMinorAxis.getOptional("semiMinorAxis")

        /**
         * Array of signal power(s) measured by the sensor, in decibels. Users should consult the
         * data provider for information on the signal powers array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sigPwrs(): Optional<List<Double>> = sigPwrs.getOptional("sigPwrs")

        /**
         * Signal strength of the electromagnetic energy received due to a lightning event, in
         * kiloamps.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sigStrength(): Optional<Double> = sigStrength.getOptional("sigStrength")

        /**
         * Array of signal to noise ratio(s) for a radar beam, in decibels. Users should consult the
         * data provider for information on the signal to noise ratios array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun snrs(): Optional<List<Double>> = snrs.getOptional("snrs")

        /**
         * Array of the number(s) of spectral averages used in radar data processing. Users should
         * consult the data provider for information on the spectral averages array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun specAvgs(): Optional<List<Int>> = specAvgs.getOptional("specAvgs")

        /**
         * Array of width(s) of the distribution in Doppler velocity measured by radar, in
         * meters/second. Spectral width depends on the particle size distribution, the wind shear
         * across the radar beam, and turbulence. Users should consult the data provider for
         * information on the spectral widths array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun specWidths(): Optional<List<Double>> = specWidths.getOptional("specWidths")

        /**
         * Array of UUID(s) of the UDL data record(s) that are related to this WeatherData record.
         * See the associated 'srcTyps' array for the specific types of data, positionally
         * corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in
         * size. See the corresponding srcTyps array element for the data type of the UUID and use
         * the appropriate API operation to retrieve that object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

        /**
         * Array of UDL record types (SENSOR, WEATHERREPORT) that are related to this WeatherData
         * record. See the associated 'srcIds' array for the record UUIDs, positionally
         * corresponding to the record types in this array. The 'srcTyps' and 'srcIds' arrays must
         * match in size.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

        /**
         * Array of the number(s) of radar samples used in time domain averaging for radar data
         * processing. Time domain averaging improves the quality of the measured signal by reducing
         * random noise and enhancing the signal-to-noise ratio. Users should consult the data
         * provider for information on the time domain sample numbers array structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tdAvgSampleNums(): Optional<List<Int>> = tdAvgSampleNums.getOptional("tdAvgSampleNums")

        /**
         * Last altitude with recorded measurements in this record, in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun termAlt(): Optional<Double> = termAlt.getOptional("termAlt")

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
         * Returns the raw JSON value of [obTime].
         *
         * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obTime") @ExcludeMissing fun _obTime(): JsonField<OffsetDateTime> = obTime

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
         * Returns the raw JSON value of [angleOrientation].
         *
         * Unlike [angleOrientation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("angleOrientation")
        @ExcludeMissing
        fun _angleOrientation(): JsonField<Double> = angleOrientation

        /**
         * Returns the raw JSON value of [avgRefPwr].
         *
         * Unlike [avgRefPwr], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avgRefPwr") @ExcludeMissing fun _avgRefPwr(): JsonField<Double> = avgRefPwr

        /**
         * Returns the raw JSON value of [avgTxPwr].
         *
         * Unlike [avgTxPwr], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("avgTxPwr") @ExcludeMissing fun _avgTxPwr(): JsonField<Double> = avgTxPwr

        /**
         * Returns the raw JSON value of [checksum].
         *
         * Unlike [checksum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("checksum") @ExcludeMissing fun _checksum(): JsonField<Int> = checksum

        /**
         * Returns the raw JSON value of [coIntegs].
         *
         * Unlike [coIntegs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coIntegs") @ExcludeMissing fun _coIntegs(): JsonField<List<Int>> = coIntegs

        /**
         * Returns the raw JSON value of [consRecs].
         *
         * Unlike [consRecs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("consRecs") @ExcludeMissing fun _consRecs(): JsonField<List<Int>> = consRecs

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
         * Returns the raw JSON value of [doppVels].
         *
         * Unlike [doppVels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("doppVels")
        @ExcludeMissing
        fun _doppVels(): JsonField<List<Double>> = doppVels

        /**
         * Returns the raw JSON value of [fileCreation].
         *
         * Unlike [fileCreation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fileCreation")
        @ExcludeMissing
        fun _fileCreation(): JsonField<OffsetDateTime> = fileCreation

        /**
         * Returns the raw JSON value of [firstGuessAvgs].
         *
         * Unlike [firstGuessAvgs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("firstGuessAvgs")
        @ExcludeMissing
        fun _firstGuessAvgs(): JsonField<List<Int>> = firstGuessAvgs

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

        /**
         * Returns the raw JSON value of [interpulsePeriods].
         *
         * Unlike [interpulsePeriods], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("interpulsePeriods")
        @ExcludeMissing
        fun _interpulsePeriods(): JsonField<List<Double>> = interpulsePeriods

        /**
         * Returns the raw JSON value of [lightDetSensors].
         *
         * Unlike [lightDetSensors], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lightDetSensors")
        @ExcludeMissing
        fun _lightDetSensors(): JsonField<List<Int>> = lightDetSensors

        /**
         * Returns the raw JSON value of [lightEventNum].
         *
         * Unlike [lightEventNum], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lightEventNum")
        @ExcludeMissing
        fun _lightEventNum(): JsonField<Int> = lightEventNum

        /**
         * Returns the raw JSON value of [noiseLvls].
         *
         * Unlike [noiseLvls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("noiseLvls")
        @ExcludeMissing
        fun _noiseLvls(): JsonField<List<Double>> = noiseLvls

        /**
         * Returns the raw JSON value of [numElements].
         *
         * Unlike [numElements], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numElements")
        @ExcludeMissing
        fun _numElements(): JsonField<Int> = numElements

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
         * Returns the raw JSON value of [origSensorId].
         *
         * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origSensorId")
        @ExcludeMissing
        fun _origSensorId(): JsonField<String> = origSensorId

        /**
         * Returns the raw JSON value of [posConfidence].
         *
         * Unlike [posConfidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("posConfidence")
        @ExcludeMissing
        fun _posConfidence(): JsonField<Double> = posConfidence

        /**
         * Returns the raw JSON value of [qcValue].
         *
         * Unlike [qcValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("qcValue") @ExcludeMissing fun _qcValue(): JsonField<Int> = qcValue

        /**
         * Returns the raw JSON value of [sectorNum].
         *
         * Unlike [sectorNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sectorNum") @ExcludeMissing fun _sectorNum(): JsonField<Int> = sectorNum

        /**
         * Returns the raw JSON value of [semiMajorAxis].
         *
         * Unlike [semiMajorAxis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("semiMajorAxis")
        @ExcludeMissing
        fun _semiMajorAxis(): JsonField<Double> = semiMajorAxis

        /**
         * Returns the raw JSON value of [semiMinorAxis].
         *
         * Unlike [semiMinorAxis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("semiMinorAxis")
        @ExcludeMissing
        fun _semiMinorAxis(): JsonField<Double> = semiMinorAxis

        /**
         * Returns the raw JSON value of [sigPwrs].
         *
         * Unlike [sigPwrs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sigPwrs") @ExcludeMissing fun _sigPwrs(): JsonField<List<Double>> = sigPwrs

        /**
         * Returns the raw JSON value of [sigStrength].
         *
         * Unlike [sigStrength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sigStrength")
        @ExcludeMissing
        fun _sigStrength(): JsonField<Double> = sigStrength

        /**
         * Returns the raw JSON value of [snrs].
         *
         * Unlike [snrs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snrs") @ExcludeMissing fun _snrs(): JsonField<List<Double>> = snrs

        /**
         * Returns the raw JSON value of [specAvgs].
         *
         * Unlike [specAvgs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specAvgs") @ExcludeMissing fun _specAvgs(): JsonField<List<Int>> = specAvgs

        /**
         * Returns the raw JSON value of [specWidths].
         *
         * Unlike [specWidths], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specWidths")
        @ExcludeMissing
        fun _specWidths(): JsonField<List<Double>> = specWidths

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
         * Returns the raw JSON value of [tdAvgSampleNums].
         *
         * Unlike [tdAvgSampleNums], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tdAvgSampleNums")
        @ExcludeMissing
        fun _tdAvgSampleNums(): JsonField<List<Int>> = tdAvgSampleNums

        /**
         * Returns the raw JSON value of [termAlt].
         *
         * Unlike [termAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("termAlt") @ExcludeMissing fun _termAlt(): JsonField<Double> = termAlt

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .obTime()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var obTime: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var angleOrientation: JsonField<Double> = JsonMissing.of()
            private var avgRefPwr: JsonField<Double> = JsonMissing.of()
            private var avgTxPwr: JsonField<Double> = JsonMissing.of()
            private var checksum: JsonField<Int> = JsonMissing.of()
            private var coIntegs: JsonField<MutableList<Int>>? = null
            private var consRecs: JsonField<MutableList<Int>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var doppVels: JsonField<MutableList<Double>>? = null
            private var fileCreation: JsonField<OffsetDateTime> = JsonMissing.of()
            private var firstGuessAvgs: JsonField<MutableList<Int>>? = null
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var interpulsePeriods: JsonField<MutableList<Double>>? = null
            private var lightDetSensors: JsonField<MutableList<Int>>? = null
            private var lightEventNum: JsonField<Int> = JsonMissing.of()
            private var noiseLvls: JsonField<MutableList<Double>>? = null
            private var numElements: JsonField<Int> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var posConfidence: JsonField<Double> = JsonMissing.of()
            private var qcValue: JsonField<Int> = JsonMissing.of()
            private var sectorNum: JsonField<Int> = JsonMissing.of()
            private var semiMajorAxis: JsonField<Double> = JsonMissing.of()
            private var semiMinorAxis: JsonField<Double> = JsonMissing.of()
            private var sigPwrs: JsonField<MutableList<Double>>? = null
            private var sigStrength: JsonField<Double> = JsonMissing.of()
            private var snrs: JsonField<MutableList<Double>>? = null
            private var specAvgs: JsonField<MutableList<Int>>? = null
            private var specWidths: JsonField<MutableList<Double>>? = null
            private var srcIds: JsonField<MutableList<String>>? = null
            private var srcTyps: JsonField<MutableList<String>>? = null
            private var tdAvgSampleNums: JsonField<MutableList<Int>>? = null
            private var termAlt: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                obTime = body.obTime
                source = body.source
                id = body.id
                angleOrientation = body.angleOrientation
                avgRefPwr = body.avgRefPwr
                avgTxPwr = body.avgTxPwr
                checksum = body.checksum
                coIntegs = body.coIntegs.map { it.toMutableList() }
                consRecs = body.consRecs.map { it.toMutableList() }
                createdAt = body.createdAt
                createdBy = body.createdBy
                doppVels = body.doppVels.map { it.toMutableList() }
                fileCreation = body.fileCreation
                firstGuessAvgs = body.firstGuessAvgs.map { it.toMutableList() }
                idSensor = body.idSensor
                interpulsePeriods = body.interpulsePeriods.map { it.toMutableList() }
                lightDetSensors = body.lightDetSensors.map { it.toMutableList() }
                lightEventNum = body.lightEventNum
                noiseLvls = body.noiseLvls.map { it.toMutableList() }
                numElements = body.numElements
                origin = body.origin
                origNetwork = body.origNetwork
                origSensorId = body.origSensorId
                posConfidence = body.posConfidence
                qcValue = body.qcValue
                sectorNum = body.sectorNum
                semiMajorAxis = body.semiMajorAxis
                semiMinorAxis = body.semiMinorAxis
                sigPwrs = body.sigPwrs.map { it.toMutableList() }
                sigStrength = body.sigStrength
                snrs = body.snrs.map { it.toMutableList() }
                specAvgs = body.specAvgs.map { it.toMutableList() }
                specWidths = body.specWidths.map { it.toMutableList() }
                srcIds = body.srcIds.map { it.toMutableList() }
                srcTyps = body.srcTyps.map { it.toMutableList() }
                tdAvgSampleNums = body.tdAvgSampleNums.map { it.toMutableList() }
                termAlt = body.termAlt
                additionalProperties = body.additionalProperties.toMutableMap()
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

            /**
             * Datetime of the weather observation in ISO 8601 UTC datetime format with microsecond
             * precision.
             */
            fun obTime(obTime: OffsetDateTime) = obTime(JsonField.of(obTime))

            /**
             * Sets [Builder.obTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obTime(obTime: JsonField<OffsetDateTime>) = apply { this.obTime = obTime }

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

            /**
             * Angle of orientation of the 50% positional confidence ellipse, in degrees clockwise
             * from true north.
             */
            fun angleOrientation(angleOrientation: Double) =
                angleOrientation(JsonField.of(angleOrientation))

            /**
             * Sets [Builder.angleOrientation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.angleOrientation] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun angleOrientation(angleOrientation: JsonField<Double>) = apply {
                this.angleOrientation = angleOrientation
            }

            /** Average power of the reflected signal received by the radar, in Watts. */
            fun avgRefPwr(avgRefPwr: Double) = avgRefPwr(JsonField.of(avgRefPwr))

            /**
             * Sets [Builder.avgRefPwr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgRefPwr] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgRefPwr(avgRefPwr: JsonField<Double>) = apply { this.avgRefPwr = avgRefPwr }

            /** Average transmitted power of the radar, in kilowatts. */
            fun avgTxPwr(avgTxPwr: Double) = avgTxPwr(JsonField.of(avgTxPwr))

            /**
             * Sets [Builder.avgTxPwr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avgTxPwr] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avgTxPwr(avgTxPwr: JsonField<Double>) = apply { this.avgTxPwr = avgTxPwr }

            /** Checksum value for the data. */
            fun checksum(checksum: Int) = checksum(JsonField.of(checksum))

            /**
             * Sets [Builder.checksum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checksum] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checksum(checksum: JsonField<Int>) = apply { this.checksum = checksum }

            /**
             * Array of the number(s) of measurements used in coherent integrations used for radar
             * data processing. Users should consult the data provider for information on the
             * coherent integrations array structure.
             */
            fun coIntegs(coIntegs: List<Int>) = coIntegs(JsonField.of(coIntegs))

            /**
             * Sets [Builder.coIntegs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coIntegs] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coIntegs(coIntegs: JsonField<List<Int>>) = apply {
                this.coIntegs = coIntegs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [coIntegs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCoInteg(coInteg: Int) = apply {
                coIntegs =
                    (coIntegs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("coIntegs", it).add(coInteg)
                    }
            }

            /**
             * Array of the number(s) of records in consensus for a radar beam. Users should consult
             * the data provider for information on the consensus records array structure.
             */
            fun consRecs(consRecs: List<Int>) = consRecs(JsonField.of(consRecs))

            /**
             * Sets [Builder.consRecs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consRecs] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun consRecs(consRecs: JsonField<List<Int>>) = apply {
                this.consRecs = consRecs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [consRecs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addConsRec(consRec: Int) = apply {
                consRecs =
                    (consRecs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("consRecs", it).add(consRec)
                    }
            }

            /** Time the row was created in the database. */
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

            /** Application user who created the row in the database. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /**
             * Array of full scale Nyquist Doppler velocities measured by radar, in meters per
             * second. Nyquist velocity refers to the maximum velocity magnitude that the radar
             * system can unambiguously detect. Doppler velocities with absolute values exceeding
             * the Nyquist threshold suffer from aliasing at the time of collection. Users should
             * consult the data provider for information on the doppler velocities array structure.
             */
            fun doppVels(doppVels: List<Double>) = doppVels(JsonField.of(doppVels))

            /**
             * Sets [Builder.doppVels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.doppVels] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun doppVels(doppVels: JsonField<List<Double>>) = apply {
                this.doppVels = doppVels.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [doppVels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDoppVel(doppVel: Double) = apply {
                doppVels =
                    (doppVels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("doppVels", it).add(doppVel)
                    }
            }

            /** Datetime the system files were created. */
            fun fileCreation(fileCreation: OffsetDateTime) =
                fileCreation(JsonField.of(fileCreation))

            /**
             * Sets [Builder.fileCreation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileCreation] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fileCreation(fileCreation: JsonField<OffsetDateTime>) = apply {
                this.fileCreation = fileCreation
            }

            /**
             * Array of average maximum number(s) of consecutive instances in which the same first
             * guess velocity is used in radar data processing to estimate wind speed. Users should
             * consult the data provider for information on the first guess averages array
             * structure.
             */
            fun firstGuessAvgs(firstGuessAvgs: List<Int>) =
                firstGuessAvgs(JsonField.of(firstGuessAvgs))

            /**
             * Sets [Builder.firstGuessAvgs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstGuessAvgs] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstGuessAvgs(firstGuessAvgs: JsonField<List<Int>>) = apply {
                this.firstGuessAvgs = firstGuessAvgs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [firstGuessAvgs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFirstGuessAvg(firstGuessAvg: Int) = apply {
                firstGuessAvgs =
                    (firstGuessAvgs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("firstGuessAvgs", it).add(firstGuessAvg)
                    }
            }

            /** Unique identifier of the sensor making the weather measurement. */
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
             * Array of the elapsed time(s) from the beginning of one pulse to the beginning of the
             * next pulse for a radar beam, in microseconds. Users should consult the data provider
             * for information on the interpulse periods array structure.
             */
            fun interpulsePeriods(interpulsePeriods: List<Double>) =
                interpulsePeriods(JsonField.of(interpulsePeriods))

            /**
             * Sets [Builder.interpulsePeriods] to an arbitrary JSON value.
             *
             * You should usually call [Builder.interpulsePeriods] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun interpulsePeriods(interpulsePeriods: JsonField<List<Double>>) = apply {
                this.interpulsePeriods = interpulsePeriods.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [interpulsePeriods].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInterpulsePeriod(interpulsePeriod: Double) = apply {
                interpulsePeriods =
                    (interpulsePeriods ?: JsonField.of(mutableListOf())).also {
                        checkKnown("interpulsePeriods", it).add(interpulsePeriod)
                    }
            }

            /**
             * Array of sensor(s) that participated in the lightning event location determination.
             */
            fun lightDetSensors(lightDetSensors: List<Int>) =
                lightDetSensors(JsonField.of(lightDetSensors))

            /**
             * Sets [Builder.lightDetSensors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lightDetSensors] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lightDetSensors(lightDetSensors: JsonField<List<Int>>) = apply {
                this.lightDetSensors = lightDetSensors.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [lightDetSensors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLightDetSensor(lightDetSensor: Int) = apply {
                lightDetSensors =
                    (lightDetSensors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lightDetSensors", it).add(lightDetSensor)
                    }
            }

            /** Number of sensors used in the lightning event location solution. */
            fun lightEventNum(lightEventNum: Int) = lightEventNum(JsonField.of(lightEventNum))

            /**
             * Sets [Builder.lightEventNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lightEventNum] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lightEventNum(lightEventNum: JsonField<Int>) = apply {
                this.lightEventNum = lightEventNum
            }

            /**
             * Array of noise level(s) measured by radar, in decibels. Users should consult the data
             * provider for information on the noise levels array structure.
             */
            fun noiseLvls(noiseLvls: List<Double>) = noiseLvls(JsonField.of(noiseLvls))

            /**
             * Sets [Builder.noiseLvls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.noiseLvls] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun noiseLvls(noiseLvls: JsonField<List<Double>>) = apply {
                this.noiseLvls = noiseLvls.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [noiseLvls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNoiseLvl(noiseLvl: Double) = apply {
                noiseLvls =
                    (noiseLvls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("noiseLvls", it).add(noiseLvl)
                    }
            }

            /** Number of antennas across all sectors within the radar coverage area. */
            fun numElements(numElements: Int) = numElements(JsonField.of(numElements))

            /**
             * Sets [Builder.numElements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numElements] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numElements(numElements: JsonField<Int>) = apply { this.numElements = numElements }

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
             * Optional identifier provided by the record source. This may be an internal identifier
             * and not necessarily a valid sensor ID.
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
             * The positional confidence of the calculated lightning event location using the
             * chi-square statistical method.
             */
            fun posConfidence(posConfidence: Double) = posConfidence(JsonField.of(posConfidence))

            /**
             * Sets [Builder.posConfidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.posConfidence] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun posConfidence(posConfidence: JsonField<Double>) = apply {
                this.posConfidence = posConfidence
            }

            /** Quality control flag value, as defined by the data provider. */
            fun qcValue(qcValue: Int) = qcValue(JsonField.of(qcValue))

            /**
             * Sets [Builder.qcValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.qcValue] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun qcValue(qcValue: JsonField<Int>) = apply { this.qcValue = qcValue }

            /**
             * Number of sectors within the radar coverage area, each containing a number of
             * antennas.
             */
            fun sectorNum(sectorNum: Int) = sectorNum(JsonField.of(sectorNum))

            /**
             * Sets [Builder.sectorNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sectorNum] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sectorNum(sectorNum: JsonField<Int>) = apply { this.sectorNum = sectorNum }

            /** Semi-major axis of the 50% positional confidence ellipse, in kilometers. */
            fun semiMajorAxis(semiMajorAxis: Double) = semiMajorAxis(JsonField.of(semiMajorAxis))

            /**
             * Sets [Builder.semiMajorAxis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.semiMajorAxis] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun semiMajorAxis(semiMajorAxis: JsonField<Double>) = apply {
                this.semiMajorAxis = semiMajorAxis
            }

            /** Semi-minor axis of the 50% positional confidence ellipse, in kilometers. */
            fun semiMinorAxis(semiMinorAxis: Double) = semiMinorAxis(JsonField.of(semiMinorAxis))

            /**
             * Sets [Builder.semiMinorAxis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.semiMinorAxis] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun semiMinorAxis(semiMinorAxis: JsonField<Double>) = apply {
                this.semiMinorAxis = semiMinorAxis
            }

            /**
             * Array of signal power(s) measured by the sensor, in decibels. Users should consult
             * the data provider for information on the signal powers array structure.
             */
            fun sigPwrs(sigPwrs: List<Double>) = sigPwrs(JsonField.of(sigPwrs))

            /**
             * Sets [Builder.sigPwrs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sigPwrs] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sigPwrs(sigPwrs: JsonField<List<Double>>) = apply {
                this.sigPwrs = sigPwrs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [sigPwrs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSigPwr(sigPwr: Double) = apply {
                sigPwrs =
                    (sigPwrs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sigPwrs", it).add(sigPwr)
                    }
            }

            /**
             * Signal strength of the electromagnetic energy received due to a lightning event, in
             * kiloamps.
             */
            fun sigStrength(sigStrength: Double) = sigStrength(JsonField.of(sigStrength))

            /**
             * Sets [Builder.sigStrength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sigStrength] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sigStrength(sigStrength: JsonField<Double>) = apply {
                this.sigStrength = sigStrength
            }

            /**
             * Array of signal to noise ratio(s) for a radar beam, in decibels. Users should consult
             * the data provider for information on the signal to noise ratios array structure.
             */
            fun snrs(snrs: List<Double>) = snrs(JsonField.of(snrs))

            /**
             * Sets [Builder.snrs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snrs] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snrs(snrs: JsonField<List<Double>>) = apply {
                this.snrs = snrs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [snrs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSnr(snr: Double) = apply {
                snrs =
                    (snrs ?: JsonField.of(mutableListOf())).also { checkKnown("snrs", it).add(snr) }
            }

            /**
             * Array of the number(s) of spectral averages used in radar data processing. Users
             * should consult the data provider for information on the spectral averages array
             * structure.
             */
            fun specAvgs(specAvgs: List<Int>) = specAvgs(JsonField.of(specAvgs))

            /**
             * Sets [Builder.specAvgs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specAvgs] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun specAvgs(specAvgs: JsonField<List<Int>>) = apply {
                this.specAvgs = specAvgs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [specAvgs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecAvg(specAvg: Int) = apply {
                specAvgs =
                    (specAvgs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specAvgs", it).add(specAvg)
                    }
            }

            /**
             * Array of width(s) of the distribution in Doppler velocity measured by radar, in
             * meters/second. Spectral width depends on the particle size distribution, the wind
             * shear across the radar beam, and turbulence. Users should consult the data provider
             * for information on the spectral widths array structure.
             */
            fun specWidths(specWidths: List<Double>) = specWidths(JsonField.of(specWidths))

            /**
             * Sets [Builder.specWidths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specWidths] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun specWidths(specWidths: JsonField<List<Double>>) = apply {
                this.specWidths = specWidths.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [specWidths].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecWidth(specWidth: Double) = apply {
                specWidths =
                    (specWidths ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specWidths", it).add(specWidth)
                    }
            }

            /**
             * Array of UUID(s) of the UDL data record(s) that are related to this WeatherData
             * record. See the associated 'srcTyps' array for the specific types of data,
             * positionally corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds'
             * arrays must match in size. See the corresponding srcTyps array element for the data
             * type of the UUID and use the appropriate API operation to retrieve that object.
             */
            fun srcIds(srcIds: List<String>) = srcIds(JsonField.of(srcIds))

            /**
             * Sets [Builder.srcIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.srcIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Array of UDL record types (SENSOR, WEATHERREPORT) that are related to this
             * WeatherData record. See the associated 'srcIds' array for the record UUIDs,
             * positionally corresponding to the record types in this array. The 'srcTyps' and
             * 'srcIds' arrays must match in size.
             */
            fun srcTyps(srcTyps: List<String>) = srcTyps(JsonField.of(srcTyps))

            /**
             * Sets [Builder.srcTyps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.srcTyps] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Array of the number(s) of radar samples used in time domain averaging for radar data
             * processing. Time domain averaging improves the quality of the measured signal by
             * reducing random noise and enhancing the signal-to-noise ratio. Users should consult
             * the data provider for information on the time domain sample numbers array structure.
             */
            fun tdAvgSampleNums(tdAvgSampleNums: List<Int>) =
                tdAvgSampleNums(JsonField.of(tdAvgSampleNums))

            /**
             * Sets [Builder.tdAvgSampleNums] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tdAvgSampleNums] with a well-typed `List<Int>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tdAvgSampleNums(tdAvgSampleNums: JsonField<List<Int>>) = apply {
                this.tdAvgSampleNums = tdAvgSampleNums.map { it.toMutableList() }
            }

            /**
             * Adds a single [Int] to [tdAvgSampleNums].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTdAvgSampleNum(tdAvgSampleNum: Int) = apply {
                tdAvgSampleNums =
                    (tdAvgSampleNums ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tdAvgSampleNums", it).add(tdAvgSampleNum)
                    }
            }

            /** Last altitude with recorded measurements in this record, in meters. */
            fun termAlt(termAlt: Double) = termAlt(JsonField.of(termAlt))

            /**
             * Sets [Builder.termAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termAlt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun termAlt(termAlt: JsonField<Double>) = apply { this.termAlt = termAlt }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .obTime()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("obTime", obTime),
                    checkRequired("source", source),
                    id,
                    angleOrientation,
                    avgRefPwr,
                    avgTxPwr,
                    checksum,
                    (coIntegs ?: JsonMissing.of()).map { it.toImmutable() },
                    (consRecs ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    createdBy,
                    (doppVels ?: JsonMissing.of()).map { it.toImmutable() },
                    fileCreation,
                    (firstGuessAvgs ?: JsonMissing.of()).map { it.toImmutable() },
                    idSensor,
                    (interpulsePeriods ?: JsonMissing.of()).map { it.toImmutable() },
                    (lightDetSensors ?: JsonMissing.of()).map { it.toImmutable() },
                    lightEventNum,
                    (noiseLvls ?: JsonMissing.of()).map { it.toImmutable() },
                    numElements,
                    origin,
                    origNetwork,
                    origSensorId,
                    posConfidence,
                    qcValue,
                    sectorNum,
                    semiMajorAxis,
                    semiMinorAxis,
                    (sigPwrs ?: JsonMissing.of()).map { it.toImmutable() },
                    sigStrength,
                    (snrs ?: JsonMissing.of()).map { it.toImmutable() },
                    (specAvgs ?: JsonMissing.of()).map { it.toImmutable() },
                    (specWidths ?: JsonMissing.of()).map { it.toImmutable() },
                    (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                    (tdAvgSampleNums ?: JsonMissing.of()).map { it.toImmutable() },
                    termAlt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            obTime()
            source()
            id()
            angleOrientation()
            avgRefPwr()
            avgTxPwr()
            checksum()
            coIntegs()
            consRecs()
            createdAt()
            createdBy()
            doppVels()
            fileCreation()
            firstGuessAvgs()
            idSensor()
            interpulsePeriods()
            lightDetSensors()
            lightEventNum()
            noiseLvls()
            numElements()
            origin()
            origNetwork()
            origSensorId()
            posConfidence()
            qcValue()
            sectorNum()
            semiMajorAxis()
            semiMinorAxis()
            sigPwrs()
            sigStrength()
            snrs()
            specAvgs()
            specWidths()
            srcIds()
            srcTyps()
            tdAvgSampleNums()
            termAlt()
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
                (if (obTime.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (angleOrientation.asKnown().isPresent) 1 else 0) +
                (if (avgRefPwr.asKnown().isPresent) 1 else 0) +
                (if (avgTxPwr.asKnown().isPresent) 1 else 0) +
                (if (checksum.asKnown().isPresent) 1 else 0) +
                (coIntegs.asKnown().getOrNull()?.size ?: 0) +
                (consRecs.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (doppVels.asKnown().getOrNull()?.size ?: 0) +
                (if (fileCreation.asKnown().isPresent) 1 else 0) +
                (firstGuessAvgs.asKnown().getOrNull()?.size ?: 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (interpulsePeriods.asKnown().getOrNull()?.size ?: 0) +
                (lightDetSensors.asKnown().getOrNull()?.size ?: 0) +
                (if (lightEventNum.asKnown().isPresent) 1 else 0) +
                (noiseLvls.asKnown().getOrNull()?.size ?: 0) +
                (if (numElements.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (if (posConfidence.asKnown().isPresent) 1 else 0) +
                (if (qcValue.asKnown().isPresent) 1 else 0) +
                (if (sectorNum.asKnown().isPresent) 1 else 0) +
                (if (semiMajorAxis.asKnown().isPresent) 1 else 0) +
                (if (semiMinorAxis.asKnown().isPresent) 1 else 0) +
                (sigPwrs.asKnown().getOrNull()?.size ?: 0) +
                (if (sigStrength.asKnown().isPresent) 1 else 0) +
                (snrs.asKnown().getOrNull()?.size ?: 0) +
                (specAvgs.asKnown().getOrNull()?.size ?: 0) +
                (specWidths.asKnown().getOrNull()?.size ?: 0) +
                (srcIds.asKnown().getOrNull()?.size ?: 0) +
                (srcTyps.asKnown().getOrNull()?.size ?: 0) +
                (tdAvgSampleNums.asKnown().getOrNull()?.size ?: 0) +
                (if (termAlt.asKnown().isPresent) 1 else 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                obTime == other.obTime &&
                source == other.source &&
                id == other.id &&
                angleOrientation == other.angleOrientation &&
                avgRefPwr == other.avgRefPwr &&
                avgTxPwr == other.avgTxPwr &&
                checksum == other.checksum &&
                coIntegs == other.coIntegs &&
                consRecs == other.consRecs &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                doppVels == other.doppVels &&
                fileCreation == other.fileCreation &&
                firstGuessAvgs == other.firstGuessAvgs &&
                idSensor == other.idSensor &&
                interpulsePeriods == other.interpulsePeriods &&
                lightDetSensors == other.lightDetSensors &&
                lightEventNum == other.lightEventNum &&
                noiseLvls == other.noiseLvls &&
                numElements == other.numElements &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origSensorId == other.origSensorId &&
                posConfidence == other.posConfidence &&
                qcValue == other.qcValue &&
                sectorNum == other.sectorNum &&
                semiMajorAxis == other.semiMajorAxis &&
                semiMinorAxis == other.semiMinorAxis &&
                sigPwrs == other.sigPwrs &&
                sigStrength == other.sigStrength &&
                snrs == other.snrs &&
                specAvgs == other.specAvgs &&
                specWidths == other.specWidths &&
                srcIds == other.srcIds &&
                srcTyps == other.srcTyps &&
                tdAvgSampleNums == other.tdAvgSampleNums &&
                termAlt == other.termAlt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                obTime,
                source,
                id,
                angleOrientation,
                avgRefPwr,
                avgTxPwr,
                checksum,
                coIntegs,
                consRecs,
                createdAt,
                createdBy,
                doppVels,
                fileCreation,
                firstGuessAvgs,
                idSensor,
                interpulsePeriods,
                lightDetSensors,
                lightEventNum,
                noiseLvls,
                numElements,
                origin,
                origNetwork,
                origSensorId,
                posConfidence,
                qcValue,
                sectorNum,
                semiMajorAxis,
                semiMinorAxis,
                sigPwrs,
                sigStrength,
                snrs,
                specAvgs,
                specWidths,
                srcIds,
                srcTyps,
                tdAvgSampleNums,
                termAlt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, obTime=$obTime, source=$source, id=$id, angleOrientation=$angleOrientation, avgRefPwr=$avgRefPwr, avgTxPwr=$avgTxPwr, checksum=$checksum, coIntegs=$coIntegs, consRecs=$consRecs, createdAt=$createdAt, createdBy=$createdBy, doppVels=$doppVels, fileCreation=$fileCreation, firstGuessAvgs=$firstGuessAvgs, idSensor=$idSensor, interpulsePeriods=$interpulsePeriods, lightDetSensors=$lightDetSensors, lightEventNum=$lightEventNum, noiseLvls=$noiseLvls, numElements=$numElements, origin=$origin, origNetwork=$origNetwork, origSensorId=$origSensorId, posConfidence=$posConfidence, qcValue=$qcValue, sectorNum=$sectorNum, semiMajorAxis=$semiMajorAxis, semiMinorAxis=$semiMinorAxis, sigPwrs=$sigPwrs, sigStrength=$sigStrength, snrs=$snrs, specAvgs=$specAvgs, specWidths=$specWidths, srcIds=$srcIds, srcTyps=$srcTyps, tdAvgSampleNums=$tdAvgSampleNums, termAlt=$termAlt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WeatherDataCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WeatherDataCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

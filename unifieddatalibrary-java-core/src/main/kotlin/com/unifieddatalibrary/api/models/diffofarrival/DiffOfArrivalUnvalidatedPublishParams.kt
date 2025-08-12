// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.diffofarrival

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.diffofarrival.DiffOfArrivalUnvalidatedPublishParams
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Service operation to take multiple TDOA/FDOA records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
class DiffOfArrivalUnvalidatedPublishParams private constructor(
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
         * Returns a mutable builder for constructing an instance of [DiffOfArrivalUnvalidatedPublishParams].
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [DiffOfArrivalUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(diffOfArrivalUnvalidatedPublishParams: DiffOfArrivalUnvalidatedPublishParams) =
            apply {
                body = diffOfArrivalUnvalidatedPublishParams.body.toMutableList()
                additionalHeaders = diffOfArrivalUnvalidatedPublishParams.additionalHeaders.toBuilder()
                additionalQueryParams = diffOfArrivalUnvalidatedPublishParams.additionalQueryParams.toBuilder()
            }

        fun body(body: List<Body>) =
            apply {
                this.body = body.toMutableList()
            }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) =
            apply {
                this.body = (this.body ?: mutableListOf()).apply { add(body) }
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [DiffOfArrivalUnvalidatedPublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DiffOfArrivalUnvalidatedPublishParams =
            DiffOfArrivalUnvalidatedPublishParams(
              checkRequired(
                "body", body
              ).toImmutable(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Model representation of Signal time and frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor phenomenologies and sensor triangulation. */
    class Body @JsonCreator private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("obTime") @ExcludeMissing private val obTime: JsonField<OffsetDateTime>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("bandwidth") @ExcludeMissing private val bandwidth: JsonField<Double>,
        @JsonProperty("collectionMode") @ExcludeMissing private val collectionMode: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("deltaRange") @ExcludeMissing private val deltaRange: JsonField<Double>,
        @JsonProperty("deltaRangeRate") @ExcludeMissing private val deltaRangeRate: JsonField<Double>,
        @JsonProperty("deltaRangeRateUnc") @ExcludeMissing private val deltaRangeRateUnc: JsonField<Double>,
        @JsonProperty("deltaRangeUnc") @ExcludeMissing private val deltaRangeUnc: JsonField<Double>,
        @JsonProperty("descriptor") @ExcludeMissing private val descriptor: JsonField<String>,
        @JsonProperty("fdoa") @ExcludeMissing private val fdoa: JsonField<Double>,
        @JsonProperty("fdoaUnc") @ExcludeMissing private val fdoaUnc: JsonField<Double>,
        @JsonProperty("frequency") @ExcludeMissing private val frequency: JsonField<Double>,
        @JsonProperty("idOnOrbit") @ExcludeMissing private val idOnOrbit: JsonField<String>,
        @JsonProperty("idSensor1") @ExcludeMissing private val idSensor1: JsonField<String>,
        @JsonProperty("idSensor2") @ExcludeMissing private val idSensor2: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origObjectId") @ExcludeMissing private val origObjectId: JsonField<String>,
        @JsonProperty("origSensorId1") @ExcludeMissing private val origSensorId1: JsonField<String>,
        @JsonProperty("origSensorId2") @ExcludeMissing private val origSensorId2: JsonField<String>,
        @JsonProperty("rawFileURI") @ExcludeMissing private val rawFileUri: JsonField<String>,
        @JsonProperty("satNo") @ExcludeMissing private val satNo: JsonField<Int>,
        @JsonProperty("sen2alt") @ExcludeMissing private val sen2alt: JsonField<Double>,
        @JsonProperty("sen2lat") @ExcludeMissing private val sen2lat: JsonField<Double>,
        @JsonProperty("sen2lon") @ExcludeMissing private val sen2lon: JsonField<Double>,
        @JsonProperty("senalt") @ExcludeMissing private val senalt: JsonField<Double>,
        @JsonProperty("senlat") @ExcludeMissing private val senlat: JsonField<Double>,
        @JsonProperty("senlon") @ExcludeMissing private val senlon: JsonField<Double>,
        @JsonProperty("sensor1Delay") @ExcludeMissing private val sensor1Delay: JsonField<Double>,
        @JsonProperty("sensor2Delay") @ExcludeMissing private val sensor2Delay: JsonField<Double>,
        @JsonProperty("snr") @ExcludeMissing private val snr: JsonField<Double>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,
        @JsonProperty("taskId") @ExcludeMissing private val taskId: JsonField<String>,
        @JsonProperty("tdoa") @ExcludeMissing private val tdoa: JsonField<Double>,
        @JsonProperty("tdoaUnc") @ExcludeMissing private val tdoaUnc: JsonField<Double>,
        @JsonProperty("transactionId") @ExcludeMissing private val transactionId: JsonField<String>,
        @JsonProperty("uct") @ExcludeMissing private val uct: JsonField<Boolean>,

    ) {

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Ob detection time in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun obTime(): OffsetDateTime = obTime.getRequired("obTime")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Bandwidth of the signal in Hz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun bandwidth(): Optional<Double> = bandwidth.getOptional("bandwidth")

        /**
         * Collection mode (e.g. SURVEY, SPOT_SEARCH, NEIGHBORHOOD_WATCH, DIRECTED_SEARCH, MANUAL, etc).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun collectionMode(): Optional<String> = collectionMode.getOptional("collectionMode")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Delta range, in km. Delta range calculation convention is (sensor2 - sensor1).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun deltaRange(): Optional<Double> = deltaRange.getOptional("deltaRange")

        /**
         * Delta range rate, in km/sec. Delta range rate calculation convention is (sensor2 - sensor1).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun deltaRangeRate(): Optional<Double> = deltaRangeRate.getOptional("deltaRangeRate")

        /**
         * One sigma uncertainty in the delta range rate, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun deltaRangeRateUnc(): Optional<Double> = deltaRangeRateUnc.getOptional("deltaRangeRateUnc")

        /**
         * One sigma uncertainty in delta range, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun deltaRangeUnc(): Optional<Double> = deltaRangeUnc.getOptional("deltaRangeUnc")

        /**
         * Optional source-provided and searchable metadata or descriptor of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

        /**
         * Frequency difference of arrival of the center frequency signal, in Hz. FDOA calculation convention is (sensor2 - sensor1).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun fdoa(): Optional<Double> = fdoa.getOptional("fdoa")

        /**
         * One sigma uncertainty in frequency difference of arrival of the center frequency signal, in Hz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun fdoaUnc(): Optional<Double> = fdoaUnc.getOptional("fdoaUnc")

        /**
         * Center frequency of the collect in Hz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun frequency(): Optional<Double> = frequency.getOptional("frequency")

        /**
         * Unique identifier of the target on-orbit object, if correlated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Sensor ID of the primary/1st sensor used for this measurement.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idSensor1(): Optional<String> = idSensor1.getOptional("idSensor1")

        /**
         * Sensor ID of the secondary/2nd sensor used for this measurement.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idSensor2(): Optional<String> = idSensor2.getOptional("idSensor2")

        /**
         * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Optional identifier provided by observation source to indicate the target onorbit object of this observation. This may be an internal identifier and not necessarily a valid satellite number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier provided by DOA source to indicate the primary/1st sensor identifier used for this measurement. This may be an internal identifier and not necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId1(): Optional<String> = origSensorId1.getOptional("origSensorId1")

        /**
         * Optional identifier provided by DOA source to indicate the secondary/2nd sensor identifier used for this this observation. This may be an internal identifier and not necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId2(): Optional<String> = origSensorId2.getOptional("origSensorId2")

        /**
         * Optional URI location in the document repository of the raw file parsed by the system to produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id= to this value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

        /**
         * Catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * Sensor 2 altitude at obTime (if mobile/onorbit) in km. If null, can be obtained from sensor info.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sen2alt(): Optional<Double> = sen2alt.getOptional("sen2alt")

        /**
         * Sensor 2 WGS84 latitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sen2lat(): Optional<Double> = sen2lat.getOptional("sen2lat")

        /**
         * Sensor 2 WGS84 longitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sen2lon(): Optional<Double> = sen2lon.getOptional("sen2lon")

        /**
         * Sensor altitude at obTime (if mobile/onorbit) in km. If null, can be obtained from sensor info.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun senalt(): Optional<Double> = senalt.getOptional("senalt")

        /**
         * Sensor WGS84 latitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info. -90 to 90 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun senlat(): Optional<Double> = senlat.getOptional("senlat")

        /**
         * Sensor WGS84 longitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info. -180 to 180 degrees (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun senlon(): Optional<Double> = senlon.getOptional("senlon")

        /**
         * The signal arrival delay relative to sensor 1 in seconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sensor1Delay(): Optional<Double> = sensor1Delay.getOptional("sensor1Delay")

        /**
         * The signal arrival delay relative to sensor 2 in seconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sensor2Delay(): Optional<Double> = sensor2Delay.getOptional("sensor2Delay")

        /**
         * Signal to noise ratio, in dB.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun snr(): Optional<Double> = snr.getOptional("snr")

        /**
         * The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * Optional array of provider/source specific tags for this data, where each element is no longer than 32 characters, used for implementing data owner conditional access controls to restrict access to the data. Should be left null by data providers unless conditional access controls are coordinated with the UDL team.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Optional identifier to indicate the specific tasking which produced this observation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun taskId(): Optional<String> = taskId.getOptional("taskId")

        /**
         * Time difference of arrival of the center frequency signal, in seconds. TDOA calculation convention is (sensor2 - sensor1).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun tdoa(): Optional<Double> = tdoa.getOptional("tdoa")

        /**
         * One sigma uncertainty in time difference of arrival of the center frequency signal, in seconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun tdoaUnc(): Optional<Double> = tdoaUnc.getOptional("tdoaUnc")

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce this data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

        /**
         * Boolean indicating this observation is part of an uncorrelated track or was unable to be correlated to a known object. This flag should only be set to true by data providers after an attempt to correlate to an on-orbit object was made and failed. If unable to correlate, the 'origObjectId' field may be populated with an internal data provider specific identifier.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun uct(): Optional<Boolean> = uct.getOptional("uct")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        fun _classificationMarking(): JsonField<String> = classificationMarking

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode")
        @ExcludeMissing
        fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [obTime].
         *
         * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obTime")
        @ExcludeMissing
        fun _obTime(): JsonField<OffsetDateTime> = obTime

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [bandwidth].
         *
         * Unlike [bandwidth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bandwidth")
        @ExcludeMissing
        fun _bandwidth(): JsonField<Double> = bandwidth

        /**
         * Returns the raw JSON value of [collectionMode].
         *
         * Unlike [collectionMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("collectionMode")
        @ExcludeMissing
        fun _collectionMode(): JsonField<String> = collectionMode

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
        @JsonProperty("createdBy")
        @ExcludeMissing
        fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [deltaRange].
         *
         * Unlike [deltaRange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaRange")
        @ExcludeMissing
        fun _deltaRange(): JsonField<Double> = deltaRange

        /**
         * Returns the raw JSON value of [deltaRangeRate].
         *
         * Unlike [deltaRangeRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaRangeRate")
        @ExcludeMissing
        fun _deltaRangeRate(): JsonField<Double> = deltaRangeRate

        /**
         * Returns the raw JSON value of [deltaRangeRateUnc].
         *
         * Unlike [deltaRangeRateUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaRangeRateUnc")
        @ExcludeMissing
        fun _deltaRangeRateUnc(): JsonField<Double> = deltaRangeRateUnc

        /**
         * Returns the raw JSON value of [deltaRangeUnc].
         *
         * Unlike [deltaRangeUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaRangeUnc")
        @ExcludeMissing
        fun _deltaRangeUnc(): JsonField<Double> = deltaRangeUnc

        /**
         * Returns the raw JSON value of [descriptor].
         *
         * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Returns the raw JSON value of [fdoa].
         *
         * Unlike [fdoa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fdoa")
        @ExcludeMissing
        fun _fdoa(): JsonField<Double> = fdoa

        /**
         * Returns the raw JSON value of [fdoaUnc].
         *
         * Unlike [fdoaUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fdoaUnc")
        @ExcludeMissing
        fun _fdoaUnc(): JsonField<Double> = fdoaUnc

        /**
         * Returns the raw JSON value of [frequency].
         *
         * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frequency")
        @ExcludeMissing
        fun _frequency(): JsonField<Double> = frequency

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit")
        @ExcludeMissing
        fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [idSensor1].
         *
         * Unlike [idSensor1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor1")
        @ExcludeMissing
        fun _idSensor1(): JsonField<String> = idSensor1

        /**
         * Returns the raw JSON value of [idSensor2].
         *
         * Unlike [idSensor2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor2")
        @ExcludeMissing
        fun _idSensor2(): JsonField<String> = idSensor2

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin")
        @ExcludeMissing
        fun _origin(): JsonField<String> = origin

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
         * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origObjectId")
        @ExcludeMissing
        fun _origObjectId(): JsonField<String> = origObjectId

        /**
         * Returns the raw JSON value of [origSensorId1].
         *
         * Unlike [origSensorId1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origSensorId1")
        @ExcludeMissing
        fun _origSensorId1(): JsonField<String> = origSensorId1

        /**
         * Returns the raw JSON value of [origSensorId2].
         *
         * Unlike [origSensorId2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origSensorId2")
        @ExcludeMissing
        fun _origSensorId2(): JsonField<String> = origSensorId2

        /**
         * Returns the raw JSON value of [rawFileUri].
         *
         * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        fun _rawFileUri(): JsonField<String> = rawFileUri

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo")
        @ExcludeMissing
        fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [sen2alt].
         *
         * Unlike [sen2alt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sen2alt")
        @ExcludeMissing
        fun _sen2alt(): JsonField<Double> = sen2alt

        /**
         * Returns the raw JSON value of [sen2lat].
         *
         * Unlike [sen2lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sen2lat")
        @ExcludeMissing
        fun _sen2lat(): JsonField<Double> = sen2lat

        /**
         * Returns the raw JSON value of [sen2lon].
         *
         * Unlike [sen2lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sen2lon")
        @ExcludeMissing
        fun _sen2lon(): JsonField<Double> = sen2lon

        /**
         * Returns the raw JSON value of [senalt].
         *
         * Unlike [senalt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senalt")
        @ExcludeMissing
        fun _senalt(): JsonField<Double> = senalt

        /**
         * Returns the raw JSON value of [senlat].
         *
         * Unlike [senlat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senlat")
        @ExcludeMissing
        fun _senlat(): JsonField<Double> = senlat

        /**
         * Returns the raw JSON value of [senlon].
         *
         * Unlike [senlon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senlon")
        @ExcludeMissing
        fun _senlon(): JsonField<Double> = senlon

        /**
         * Returns the raw JSON value of [sensor1Delay].
         *
         * Unlike [sensor1Delay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sensor1Delay")
        @ExcludeMissing
        fun _sensor1Delay(): JsonField<Double> = sensor1Delay

        /**
         * Returns the raw JSON value of [sensor2Delay].
         *
         * Unlike [sensor2Delay], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sensor2Delay")
        @ExcludeMissing
        fun _sensor2Delay(): JsonField<Double> = sensor2Delay

        /**
         * Returns the raw JSON value of [snr].
         *
         * Unlike [snr], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("snr")
        @ExcludeMissing
        fun _snr(): JsonField<Double> = snr

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL")
        @ExcludeMissing
        fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags")
        @ExcludeMissing
        fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [taskId].
         *
         * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskId")
        @ExcludeMissing
        fun _taskId(): JsonField<String> = taskId

        /**
         * Returns the raw JSON value of [tdoa].
         *
         * Unlike [tdoa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tdoa")
        @ExcludeMissing
        fun _tdoa(): JsonField<Double> = tdoa

        /**
         * Returns the raw JSON value of [tdoaUnc].
         *
         * Unlike [tdoaUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tdoaUnc")
        @ExcludeMissing
        fun _tdoaUnc(): JsonField<Double> = tdoaUnc

        /**
         * Returns the raw JSON value of [transactionId].
         *
         * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transactionId")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        /**
         * Returns the raw JSON value of [uct].
         *
         * Unlike [uct], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uct")
        @ExcludeMissing
        fun _uct(): JsonField<Boolean> = uct

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .obTime()
             * .source()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var obTime: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var bandwidth: JsonField<Double> = JsonMissing.of()
            private var collectionMode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var deltaRange: JsonField<Double> = JsonMissing.of()
            private var deltaRangeRate: JsonField<Double> = JsonMissing.of()
            private var deltaRangeRateUnc: JsonField<Double> = JsonMissing.of()
            private var deltaRangeUnc: JsonField<Double> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var fdoa: JsonField<Double> = JsonMissing.of()
            private var fdoaUnc: JsonField<Double> = JsonMissing.of()
            private var frequency: JsonField<Double> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idSensor1: JsonField<String> = JsonMissing.of()
            private var idSensor2: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origSensorId1: JsonField<String> = JsonMissing.of()
            private var origSensorId2: JsonField<String> = JsonMissing.of()
            private var rawFileUri: JsonField<String> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var sen2alt: JsonField<Double> = JsonMissing.of()
            private var sen2lat: JsonField<Double> = JsonMissing.of()
            private var sen2lon: JsonField<Double> = JsonMissing.of()
            private var senalt: JsonField<Double> = JsonMissing.of()
            private var senlat: JsonField<Double> = JsonMissing.of()
            private var senlon: JsonField<Double> = JsonMissing.of()
            private var sensor1Delay: JsonField<Double> = JsonMissing.of()
            private var sensor2Delay: JsonField<Double> = JsonMissing.of()
            private var snr: JsonField<Double> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var taskId: JsonField<String> = JsonMissing.of()
            private var tdoa: JsonField<Double> = JsonMissing.of()
            private var tdoaUnc: JsonField<Double> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var uct: JsonField<Boolean> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    classificationMarking = body.classificationMarking
                    dataMode = body.dataMode
                    obTime = body.obTime
                    source = body.source
                    id = body.id
                    bandwidth = body.bandwidth
                    collectionMode = body.collectionMode
                    createdAt = body.createdAt
                    createdBy = body.createdBy
                    deltaRange = body.deltaRange
                    deltaRangeRate = body.deltaRangeRate
                    deltaRangeRateUnc = body.deltaRangeRateUnc
                    deltaRangeUnc = body.deltaRangeUnc
                    descriptor = body.descriptor
                    fdoa = body.fdoa
                    fdoaUnc = body.fdoaUnc
                    frequency = body.frequency
                    idOnOrbit = body.idOnOrbit
                    idSensor1 = body.idSensor1
                    idSensor2 = body.idSensor2
                    origin = body.origin
                    origNetwork = body.origNetwork
                    origObjectId = body.origObjectId
                    origSensorId1 = body.origSensorId1
                    origSensorId2 = body.origSensorId2
                    rawFileUri = body.rawFileUri
                    satNo = body.satNo
                    sen2alt = body.sen2alt
                    sen2lat = body.sen2lat
                    sen2lon = body.sen2lon
                    senalt = body.senalt
                    senlat = body.senlat
                    senlon = body.senlon
                    sensor1Delay = body.sensor1Delay
                    sensor2Delay = body.sensor2Delay
                    snr = body.snr
                    sourceDl = body.sourceDl
                    tags = body.tags.map { it.toMutableList() }
                    taskId = body.taskId
                    tdoa = body.tdoa
                    tdoaUnc = body.tdoaUnc
                    transactionId = body.transactionId
                    uct = body.uct
                }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) =
                apply {
                    this.classificationMarking = classificationMarking
                }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) =
                apply {
                    this.dataMode = dataMode
                }

            /** Ob detection time in ISO 8601 UTC with microsecond precision. */
            fun obTime(obTime: OffsetDateTime) = obTime(JsonField.of(obTime))

            /**
             * Sets [Builder.obTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obTime(obTime: JsonField<OffsetDateTime>) =
                apply {
                    this.obTime = obTime
                }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) =
                apply {
                    this.source = source
                }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun id(id: JsonField<String>) =
                apply {
                    this.id = id
                }

            /** Bandwidth of the signal in Hz. */
            fun bandwidth(bandwidth: Double) = bandwidth(JsonField.of(bandwidth))

            /**
             * Sets [Builder.bandwidth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bandwidth] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bandwidth(bandwidth: JsonField<Double>) =
                apply {
                    this.bandwidth = bandwidth
                }

            /** Collection mode (e.g. SURVEY, SPOT_SEARCH, NEIGHBORHOOD_WATCH, DIRECTED_SEARCH, MANUAL, etc). */
            fun collectionMode(collectionMode: String) = collectionMode(JsonField.of(collectionMode))

            /**
             * Sets [Builder.collectionMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionMode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionMode(collectionMode: JsonField<String>) =
                apply {
                    this.collectionMode = collectionMode
                }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply {
                    this.createdAt = createdAt
                }

            /** Application user who created the row in the database, auto-populated by the system. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) =
                apply {
                    this.createdBy = createdBy
                }

            /** Delta range, in km. Delta range calculation convention is (sensor2 - sensor1). */
            fun deltaRange(deltaRange: Double) = deltaRange(JsonField.of(deltaRange))

            /**
             * Sets [Builder.deltaRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaRange] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaRange(deltaRange: JsonField<Double>) =
                apply {
                    this.deltaRange = deltaRange
                }

            /** Delta range rate, in km/sec. Delta range rate calculation convention is (sensor2 - sensor1). */
            fun deltaRangeRate(deltaRangeRate: Double) = deltaRangeRate(JsonField.of(deltaRangeRate))

            /**
             * Sets [Builder.deltaRangeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaRangeRate] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaRangeRate(deltaRangeRate: JsonField<Double>) =
                apply {
                    this.deltaRangeRate = deltaRangeRate
                }

            /** One sigma uncertainty in the delta range rate, in km/sec. */
            fun deltaRangeRateUnc(deltaRangeRateUnc: Double) = deltaRangeRateUnc(JsonField.of(deltaRangeRateUnc))

            /**
             * Sets [Builder.deltaRangeRateUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaRangeRateUnc] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaRangeRateUnc(deltaRangeRateUnc: JsonField<Double>) =
                apply {
                    this.deltaRangeRateUnc = deltaRangeRateUnc
                }

            /** One sigma uncertainty in delta range, in km. */
            fun deltaRangeUnc(deltaRangeUnc: Double) = deltaRangeUnc(JsonField.of(deltaRangeUnc))

            /**
             * Sets [Builder.deltaRangeUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaRangeUnc] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaRangeUnc(deltaRangeUnc: JsonField<Double>) =
                apply {
                    this.deltaRangeUnc = deltaRangeUnc
                }

            /** Optional source-provided and searchable metadata or descriptor of the data. */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /**
             * Sets [Builder.descriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.descriptor] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun descriptor(descriptor: JsonField<String>) =
                apply {
                    this.descriptor = descriptor
                }

            /** Frequency difference of arrival of the center frequency signal, in Hz. FDOA calculation convention is (sensor2 - sensor1). */
            fun fdoa(fdoa: Double) = fdoa(JsonField.of(fdoa))

            /**
             * Sets [Builder.fdoa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fdoa] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fdoa(fdoa: JsonField<Double>) =
                apply {
                    this.fdoa = fdoa
                }

            /** One sigma uncertainty in frequency difference of arrival of the center frequency signal, in Hz. */
            fun fdoaUnc(fdoaUnc: Double) = fdoaUnc(JsonField.of(fdoaUnc))

            /**
             * Sets [Builder.fdoaUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fdoaUnc] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fdoaUnc(fdoaUnc: JsonField<Double>) =
                apply {
                    this.fdoaUnc = fdoaUnc
                }

            /** Center frequency of the collect in Hz. */
            fun frequency(frequency: Double) = frequency(JsonField.of(frequency))

            /**
             * Sets [Builder.frequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frequency] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frequency(frequency: JsonField<Double>) =
                apply {
                    this.frequency = frequency
                }

            /** Unique identifier of the target on-orbit object, if correlated. */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) =
                apply {
                    this.idOnOrbit = idOnOrbit
                }

            /** Sensor ID of the primary/1st sensor used for this measurement. */
            fun idSensor1(idSensor1: String) = idSensor1(JsonField.of(idSensor1))

            /**
             * Sets [Builder.idSensor1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor1] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor1(idSensor1: JsonField<String>) =
                apply {
                    this.idSensor1 = idSensor1
                }

            /** Sensor ID of the secondary/2nd sensor used for this measurement. */
            fun idSensor2(idSensor2: String) = idSensor2(JsonField.of(idSensor2))

            /**
             * Sets [Builder.idSensor2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor2] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor2(idSensor2: JsonField<String>) =
                apply {
                    this.idSensor2 = idSensor2
                }

            /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) =
                apply {
                    this.origin = origin
                }

            /** The originating source network on which this record was created, auto-populated by the system. */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) =
                apply {
                    this.origNetwork = origNetwork
                }

            /** Optional identifier provided by observation source to indicate the target onorbit object of this observation. This may be an internal identifier and not necessarily a valid satellite number. */
            fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

            /**
             * Sets [Builder.origObjectId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origObjectId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origObjectId(origObjectId: JsonField<String>) =
                apply {
                    this.origObjectId = origObjectId
                }

            /** Optional identifier provided by DOA source to indicate the primary/1st sensor identifier used for this measurement. This may be an internal identifier and not necessarily a valid sensor ID. */
            fun origSensorId1(origSensorId1: String) = origSensorId1(JsonField.of(origSensorId1))

            /**
             * Sets [Builder.origSensorId1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSensorId1] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSensorId1(origSensorId1: JsonField<String>) =
                apply {
                    this.origSensorId1 = origSensorId1
                }

            /** Optional identifier provided by DOA source to indicate the secondary/2nd sensor identifier used for this this observation. This may be an internal identifier and not necessarily a valid sensor ID. */
            fun origSensorId2(origSensorId2: String) = origSensorId2(JsonField.of(origSensorId2))

            /**
             * Sets [Builder.origSensorId2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSensorId2] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSensorId2(origSensorId2: JsonField<String>) =
                apply {
                    this.origSensorId2 = origSensorId2
                }

            /** Optional URI location in the document repository of the raw file parsed by the system to produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id= to this value. */
            fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

            /**
             * Sets [Builder.rawFileUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawFileUri] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawFileUri(rawFileUri: JsonField<String>) =
                apply {
                    this.rawFileUri = rawFileUri
                }

            /** Catalog number of the target on-orbit object. */
            fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

            /**
             * Sets [Builder.satNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun satNo(satNo: JsonField<Int>) =
                apply {
                    this.satNo = satNo
                }

            /** Sensor 2 altitude at obTime (if mobile/onorbit) in km. If null, can be obtained from sensor info. */
            fun sen2alt(sen2alt: Double) = sen2alt(JsonField.of(sen2alt))

            /**
             * Sets [Builder.sen2alt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sen2alt] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sen2alt(sen2alt: JsonField<Double>) =
                apply {
                    this.sen2alt = sen2alt
                }

            /** Sensor 2 WGS84 latitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info. */
            fun sen2lat(sen2lat: Double) = sen2lat(JsonField.of(sen2lat))

            /**
             * Sets [Builder.sen2lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sen2lat] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sen2lat(sen2lat: JsonField<Double>) =
                apply {
                    this.sen2lat = sen2lat
                }

            /** Sensor 2 WGS84 longitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info. */
            fun sen2lon(sen2lon: Double) = sen2lon(JsonField.of(sen2lon))

            /**
             * Sets [Builder.sen2lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sen2lon] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sen2lon(sen2lon: JsonField<Double>) =
                apply {
                    this.sen2lon = sen2lon
                }

            /** Sensor altitude at obTime (if mobile/onorbit) in km. If null, can be obtained from sensor info. */
            fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

            /**
             * Sets [Builder.senalt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senalt] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senalt(senalt: JsonField<Double>) =
                apply {
                    this.senalt = senalt
                }

            /** Sensor WGS84 latitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info. -90 to 90 degrees (negative values south of equator). */
            fun senlat(senlat: Double) = senlat(JsonField.of(senlat))

            /**
             * Sets [Builder.senlat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senlat] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senlat(senlat: JsonField<Double>) =
                apply {
                    this.senlat = senlat
                }

            /** Sensor WGS84 longitude at obTime (if mobile/onorbit) in degrees. If null, can be obtained from sensor info. -180 to 180 degrees (negative values west of Prime Meridian). */
            fun senlon(senlon: Double) = senlon(JsonField.of(senlon))

            /**
             * Sets [Builder.senlon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senlon] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senlon(senlon: JsonField<Double>) =
                apply {
                    this.senlon = senlon
                }

            /** The signal arrival delay relative to sensor 1 in seconds. */
            fun sensor1Delay(sensor1Delay: Double) = sensor1Delay(JsonField.of(sensor1Delay))

            /**
             * Sets [Builder.sensor1Delay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensor1Delay] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensor1Delay(sensor1Delay: JsonField<Double>) =
                apply {
                    this.sensor1Delay = sensor1Delay
                }

            /** The signal arrival delay relative to sensor 2 in seconds. */
            fun sensor2Delay(sensor2Delay: Double) = sensor2Delay(JsonField.of(sensor2Delay))

            /**
             * Sets [Builder.sensor2Delay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sensor2Delay] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sensor2Delay(sensor2Delay: JsonField<Double>) =
                apply {
                    this.sensor2Delay = sensor2Delay
                }

            /** Signal to noise ratio, in dB. */
            fun snr(snr: Double) = snr(JsonField.of(snr))

            /**
             * Sets [Builder.snr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.snr] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun snr(snr: JsonField<Double>) =
                apply {
                    this.snr = snr
                }

            /** The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL. */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) =
                apply {
                    this.sourceDl = sourceDl
                }

            /** Optional array of provider/source specific tags for this data, where each element is no longer than 32 characters, used for implementing data owner conditional access controls to restrict access to the data. Should be left null by data providers unless conditional access controls are coordinated with the UDL team. */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) =
                apply {
                    this.tags = tags.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) =
                apply {
                    tags = (tags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tags", it).add(tag)
                    }
                }

            /** Optional identifier to indicate the specific tasking which produced this observation. */
            fun taskId(taskId: String) = taskId(JsonField.of(taskId))

            /**
             * Sets [Builder.taskId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskId(taskId: JsonField<String>) =
                apply {
                    this.taskId = taskId
                }

            /** Time difference of arrival of the center frequency signal, in seconds. TDOA calculation convention is (sensor2 - sensor1). */
            fun tdoa(tdoa: Double) = tdoa(JsonField.of(tdoa))

            /**
             * Sets [Builder.tdoa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tdoa] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tdoa(tdoa: JsonField<Double>) =
                apply {
                    this.tdoa = tdoa
                }

            /** One sigma uncertainty in time difference of arrival of the center frequency signal, in seconds. */
            fun tdoaUnc(tdoaUnc: Double) = tdoaUnc(JsonField.of(tdoaUnc))

            /**
             * Sets [Builder.tdoaUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tdoaUnc] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tdoaUnc(tdoaUnc: JsonField<Double>) =
                apply {
                    this.tdoaUnc = tdoaUnc
                }

            /** Optional identifier to track a commercial or marketplace transaction executed to produce this data. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * Sets [Builder.transactionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionId(transactionId: JsonField<String>) =
                apply {
                    this.transactionId = transactionId
                }

            /** Boolean indicating this observation is part of an uncorrelated track or was unable to be correlated to a known object. This flag should only be set to true by data providers after an attempt to correlate to an on-orbit object was made and failed. If unable to correlate, the 'origObjectId' field may be populated with an internal data provider specific identifier. */
            fun uct(uct: Boolean) = uct(JsonField.of(uct))

            /**
             * Sets [Builder.uct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uct] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uct(uct: JsonField<Boolean>) =
                apply {
                    this.uct = uct
                }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
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
                  checkRequired(
                    "classificationMarking", classificationMarking
                  ),
                  checkRequired(
                    "dataMode", dataMode
                  ),
                  checkRequired(
                    "obTime", obTime
                  ),
                  checkRequired(
                    "source", source
                  ),
                  id,
                  bandwidth,
                  collectionMode,
                  createdAt,
                  createdBy,
                  deltaRange,
                  deltaRangeRate,
                  deltaRangeRateUnc,
                  deltaRangeUnc,
                  descriptor,
                  fdoa,
                  fdoaUnc,
                  frequency,
                  idOnOrbit,
                  idSensor1,
                  idSensor2,
                  origin,
                  origNetwork,
                  origObjectId,
                  origSensorId1,
                  origSensorId2,
                  rawFileUri,
                  satNo,
                  sen2alt,
                  sen2lat,
                  sen2lon,
                  senalt,
                  senlat,
                  senlon,
                  sensor1Delay,
                  sensor2Delay,
                  snr,
                  sourceDl,
                  (tags ?: JsonMissing.of()).map { it.toImmutable() },
                  taskId,
                  tdoa,
                  tdoaUnc,
                  transactionId,
                  uct,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                classificationMarking()
                dataMode().validate()
                obTime()
                source()
                id()
                bandwidth()
                collectionMode()
                createdAt()
                createdBy()
                deltaRange()
                deltaRangeRate()
                deltaRangeRateUnc()
                deltaRangeUnc()
                descriptor()
                fdoa()
                fdoaUnc()
                frequency()
                idOnOrbit()
                idSensor1()
                idSensor2()
                origin()
                origNetwork()
                origObjectId()
                origSensorId1()
                origSensorId2()
                rawFileUri()
                satNo()
                sen2alt()
                sen2lat()
                sen2lon()
                senalt()
                senlat()
                senlon()
                sensor1Delay()
                sensor2Delay()
                snr()
                sourceDl()
                tags()
                taskId()
                tdoa()
                tdoaUnc()
                transactionId()
                uct()
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
        internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (obTime.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (bandwidth.asKnown().isPresent) 1 else 0) + (if (collectionMode.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (deltaRange.asKnown().isPresent) 1 else 0) + (if (deltaRangeRate.asKnown().isPresent) 1 else 0) + (if (deltaRangeRateUnc.asKnown().isPresent) 1 else 0) + (if (deltaRangeUnc.asKnown().isPresent) 1 else 0) + (if (descriptor.asKnown().isPresent) 1 else 0) + (if (fdoa.asKnown().isPresent) 1 else 0) + (if (fdoaUnc.asKnown().isPresent) 1 else 0) + (if (frequency.asKnown().isPresent) 1 else 0) + (if (idOnOrbit.asKnown().isPresent) 1 else 0) + (if (idSensor1.asKnown().isPresent) 1 else 0) + (if (idSensor2.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (origObjectId.asKnown().isPresent) 1 else 0) + (if (origSensorId1.asKnown().isPresent) 1 else 0) + (if (origSensorId2.asKnown().isPresent) 1 else 0) + (if (rawFileUri.asKnown().isPresent) 1 else 0) + (if (satNo.asKnown().isPresent) 1 else 0) + (if (sen2alt.asKnown().isPresent) 1 else 0) + (if (sen2lat.asKnown().isPresent) 1 else 0) + (if (sen2lon.asKnown().isPresent) 1 else 0) + (if (senalt.asKnown().isPresent) 1 else 0) + (if (senlat.asKnown().isPresent) 1 else 0) + (if (senlon.asKnown().isPresent) 1 else 0) + (if (sensor1Delay.asKnown().isPresent) 1 else 0) + (if (sensor2Delay.asKnown().isPresent) 1 else 0) + (if (snr.asKnown().isPresent) 1 else 0) + (if (sourceDl.asKnown().isPresent) 1 else 0) + (tags.asKnown().getOrNull()?.size ?: 0) + (if (taskId.asKnown().isPresent) 1 else 0) + (if (tdoa.asKnown().isPresent) 1 else 0) + (if (tdoaUnc.asKnown().isPresent) 1 else 0) + (if (transactionId.asKnown().isPresent) 1 else 0) + (if (uct.asKnown().isPresent) 1 else 0)

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        class DataMode @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

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
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
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
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
             * primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): DataMode =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && classificationMarking == other.classificationMarking && dataMode == other.dataMode && obTime == other.obTime && source == other.source && id == other.id && bandwidth == other.bandwidth && collectionMode == other.collectionMode && createdAt == other.createdAt && createdBy == other.createdBy && deltaRange == other.deltaRange && deltaRangeRate == other.deltaRangeRate && deltaRangeRateUnc == other.deltaRangeRateUnc && deltaRangeUnc == other.deltaRangeUnc && descriptor == other.descriptor && fdoa == other.fdoa && fdoaUnc == other.fdoaUnc && frequency == other.frequency && idOnOrbit == other.idOnOrbit && idSensor1 == other.idSensor1 && idSensor2 == other.idSensor2 && origin == other.origin && origNetwork == other.origNetwork && origObjectId == other.origObjectId && origSensorId1 == other.origSensorId1 && origSensorId2 == other.origSensorId2 && rawFileUri == other.rawFileUri && satNo == other.satNo && sen2alt == other.sen2alt && sen2lat == other.sen2lat && sen2lon == other.sen2lon && senalt == other.senalt && senlat == other.senlat && senlon == other.senlon && sensor1Delay == other.sensor1Delay && sensor2Delay == other.sensor2Delay && snr == other.snr && sourceDl == other.sourceDl && tags == other.tags && taskId == other.taskId && tdoa == other.tdoa && tdoaUnc == other.tdoaUnc && transactionId == other.transactionId && uct == other.uct /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, obTime, source, id, bandwidth, collectionMode, createdAt, createdBy, deltaRange, deltaRangeRate, deltaRangeRateUnc, deltaRangeUnc, descriptor, fdoa, fdoaUnc, frequency, idOnOrbit, idSensor1, idSensor2, origin, origNetwork, origObjectId, origSensorId1, origSensorId2, rawFileUri, satNo, sen2alt, sen2lat, sen2lon, senalt, senlat, senlon, sensor1Delay, sensor2Delay, snr, sourceDl, tags, taskId, tdoa, tdoaUnc, transactionId, uct) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, obTime=$obTime, source=$source, id=$id, bandwidth=$bandwidth, collectionMode=$collectionMode, createdAt=$createdAt, createdBy=$createdBy, deltaRange=$deltaRange, deltaRangeRate=$deltaRangeRate, deltaRangeRateUnc=$deltaRangeRateUnc, deltaRangeUnc=$deltaRangeUnc, descriptor=$descriptor, fdoa=$fdoa, fdoaUnc=$fdoaUnc, frequency=$frequency, idOnOrbit=$idOnOrbit, idSensor1=$idSensor1, idSensor2=$idSensor2, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId1=$origSensorId1, origSensorId2=$origSensorId2, rawFileUri=$rawFileUri, satNo=$satNo, sen2alt=$sen2alt, sen2lat=$sen2lat, sen2lon=$sen2lon, senalt=$senalt, senlat=$senlat, senlon=$senlon, sensor1Delay=$sensor1Delay, sensor2Delay=$sensor2Delay, snr=$snr, sourceDl=$sourceDl, tags=$tags, taskId=$taskId, tdoa=$tdoa, tdoaUnc=$tdoaUnc, transactionId=$transactionId, uct=$uct}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is DiffOfArrivalUnvalidatedPublishParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "DiffOfArrivalUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

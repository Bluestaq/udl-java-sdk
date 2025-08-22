// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitthrusterstatus

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation intended for initial integration only, to take a list of onorbitthrusterstatus
 * records as a POST body and ingest into the database. This operation is not intended to be used
 * for automated feeds into UDL. Data providers should contact the UDL team for specific role
 * assignments and for instructions on setting up a permanent feed through an alternate mechanism.
 */
class OnorbitthrusterstatusCreateBulkParams
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
         * [OnorbitthrusterstatusCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbitthrusterstatusCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            onorbitthrusterstatusCreateBulkParams: OnorbitthrusterstatusCreateBulkParams
        ) = apply {
            body = onorbitthrusterstatusCreateBulkParams.body.toMutableList()
            additionalHeaders = onorbitthrusterstatusCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                onorbitthrusterstatusCreateBulkParams.additionalQueryParams.toBuilder()
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
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [OnorbitthrusterstatusCreateBulkParams].
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
        fun build(): OnorbitthrusterstatusCreateBulkParams =
            OnorbitthrusterstatusCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Status information for OnorbitThruster objects. */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("idOnorbitThruster")
        @ExcludeMissing
        private val idOnorbitThruster: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("statusTime")
        @ExcludeMissing
        private val statusTime: JsonField<OffsetDateTime>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("estDeltaV") @ExcludeMissing private val estDeltaV: JsonField<Double>,
        @JsonProperty("fuelMass") @ExcludeMissing private val fuelMass: JsonField<Double>,
        @JsonProperty("fuelMassUnc") @ExcludeMissing private val fuelMassUnc: JsonField<Double>,
        @JsonProperty("isp") @ExcludeMissing private val isp: JsonField<Double>,
        @JsonProperty("maxDeltaV") @ExcludeMissing private val maxDeltaV: JsonField<Double>,
        @JsonProperty("minDeltaV") @ExcludeMissing private val minDeltaV: JsonField<Double>,
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String>,
        @JsonProperty("operational") @ExcludeMissing private val operational: JsonField<Boolean>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("propMassAvg") @ExcludeMissing private val propMassAvg: JsonField<Double>,
        @JsonProperty("propMassMax") @ExcludeMissing private val propMassMax: JsonField<Double>,
        @JsonProperty("propMassMedian")
        @ExcludeMissing
        private val propMassMedian: JsonField<Double>,
        @JsonProperty("propMassMin") @ExcludeMissing private val propMassMin: JsonField<Double>,
        @JsonProperty("thrustMax") @ExcludeMissing private val thrustMax: JsonField<Double>,
        @JsonProperty("totalDeltaV") @ExcludeMissing private val totalDeltaV: JsonField<Double>,
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
         * ID of the associated OnorbitThruster record. This ID can be used to obtain additional
         * information on an onorbit thruster object using the 'get by ID' operation (e.g.
         * /udl/onorbitthruster/{id}). For example, the OnorbitThruster object with
         * idOnorbitThruster = abc would be queried as /udl/onorbitthruster/abc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun idOnorbitThruster(): String = idOnorbitThruster.getRequired("idOnorbitThruster")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Datetime of the thruster status observation in ISO 8601 UTC datetime format with
         * millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun statusTime(): OffsetDateTime = statusTime.getRequired("statusTime")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

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
         * Estimated available delta-velocity for this thruster, in meters per second.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estDeltaV(): Optional<Double> = estDeltaV.getOptional("estDeltaV")

        /**
         * Total fuel mass available for this thruster's type, in kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelMass(): Optional<Double> = fuelMass.getOptional("fuelMass")

        /**
         * 1-sigma uncertainty of the total fuel mass available for this thruster type, in
         * kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelMassUnc(): Optional<Double> = fuelMassUnc.getOptional("fuelMassUnc")

        /**
         * Specific impulse for this thruster, in seconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun isp(): Optional<Double> = isp.getOptional("isp")

        /**
         * Maximum available delta-velocity for this thruster, in meters per second.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maxDeltaV(): Optional<Double> = maxDeltaV.getOptional("maxDeltaV")

        /**
         * Minimum available delta-velocity for this thruster, in meters per second.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun minDeltaV(): Optional<Double> = minDeltaV.getOptional("minDeltaV")

        /**
         * Identifier of this thruster.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Flag indicating if this thruster is operational.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun operational(): Optional<Boolean> = operational.getOptional("operational")

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
         * Average available propellant mass for this thruster's type, in kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun propMassAvg(): Optional<Double> = propMassAvg.getOptional("propMassAvg")

        /**
         * Maximum available propellant mass for this thruster's type, in kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun propMassMax(): Optional<Double> = propMassMax.getOptional("propMassMax")

        /**
         * Median available propellant mass for this thruster's type, in kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun propMassMedian(): Optional<Double> = propMassMedian.getOptional("propMassMedian")

        /**
         * Minimum available propellant mass for this thruster's type, in kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun propMassMin(): Optional<Double> = propMassMin.getOptional("propMassMin")

        /**
         * Maximum available thrust for this thruster, in newtons.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun thrustMax(): Optional<Double> = thrustMax.getOptional("thrustMax")

        /**
         * Total delta-velocity available for this thruster's type, in meters per second.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalDeltaV(): Optional<Double> = totalDeltaV.getOptional("totalDeltaV")

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
         * Returns the raw JSON value of [idOnorbitThruster].
         *
         * Unlike [idOnorbitThruster], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idOnorbitThruster")
        @ExcludeMissing
        fun _idOnorbitThruster(): JsonField<String> = idOnorbitThruster

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [statusTime].
         *
         * Unlike [statusTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statusTime")
        @ExcludeMissing
        fun _statusTime(): JsonField<OffsetDateTime> = statusTime

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Returns the raw JSON value of [estDeltaV].
         *
         * Unlike [estDeltaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("estDeltaV") @ExcludeMissing fun _estDeltaV(): JsonField<Double> = estDeltaV

        /**
         * Returns the raw JSON value of [fuelMass].
         *
         * Unlike [fuelMass], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelMass") @ExcludeMissing fun _fuelMass(): JsonField<Double> = fuelMass

        /**
         * Returns the raw JSON value of [fuelMassUnc].
         *
         * Unlike [fuelMassUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelMassUnc")
        @ExcludeMissing
        fun _fuelMassUnc(): JsonField<Double> = fuelMassUnc

        /**
         * Returns the raw JSON value of [isp].
         *
         * Unlike [isp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isp") @ExcludeMissing fun _isp(): JsonField<Double> = isp

        /**
         * Returns the raw JSON value of [maxDeltaV].
         *
         * Unlike [maxDeltaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxDeltaV") @ExcludeMissing fun _maxDeltaV(): JsonField<Double> = maxDeltaV

        /**
         * Returns the raw JSON value of [minDeltaV].
         *
         * Unlike [minDeltaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minDeltaV") @ExcludeMissing fun _minDeltaV(): JsonField<Double> = minDeltaV

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [operational].
         *
         * Unlike [operational], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operational")
        @ExcludeMissing
        fun _operational(): JsonField<Boolean> = operational

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
         * Returns the raw JSON value of [propMassAvg].
         *
         * Unlike [propMassAvg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("propMassAvg")
        @ExcludeMissing
        fun _propMassAvg(): JsonField<Double> = propMassAvg

        /**
         * Returns the raw JSON value of [propMassMax].
         *
         * Unlike [propMassMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("propMassMax")
        @ExcludeMissing
        fun _propMassMax(): JsonField<Double> = propMassMax

        /**
         * Returns the raw JSON value of [propMassMedian].
         *
         * Unlike [propMassMedian], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("propMassMedian")
        @ExcludeMissing
        fun _propMassMedian(): JsonField<Double> = propMassMedian

        /**
         * Returns the raw JSON value of [propMassMin].
         *
         * Unlike [propMassMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("propMassMin")
        @ExcludeMissing
        fun _propMassMin(): JsonField<Double> = propMassMin

        /**
         * Returns the raw JSON value of [thrustMax].
         *
         * Unlike [thrustMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thrustMax") @ExcludeMissing fun _thrustMax(): JsonField<Double> = thrustMax

        /**
         * Returns the raw JSON value of [totalDeltaV].
         *
         * Unlike [totalDeltaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("totalDeltaV")
        @ExcludeMissing
        fun _totalDeltaV(): JsonField<Double> = totalDeltaV

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .idOnorbitThruster()
             * .source()
             * .statusTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var idOnorbitThruster: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var statusTime: JsonField<OffsetDateTime>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var estDeltaV: JsonField<Double> = JsonMissing.of()
            private var fuelMass: JsonField<Double> = JsonMissing.of()
            private var fuelMassUnc: JsonField<Double> = JsonMissing.of()
            private var isp: JsonField<Double> = JsonMissing.of()
            private var maxDeltaV: JsonField<Double> = JsonMissing.of()
            private var minDeltaV: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var operational: JsonField<Boolean> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var propMassAvg: JsonField<Double> = JsonMissing.of()
            private var propMassMax: JsonField<Double> = JsonMissing.of()
            private var propMassMedian: JsonField<Double> = JsonMissing.of()
            private var propMassMin: JsonField<Double> = JsonMissing.of()
            private var thrustMax: JsonField<Double> = JsonMissing.of()
            private var totalDeltaV: JsonField<Double> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                idOnorbitThruster = body.idOnorbitThruster
                source = body.source
                statusTime = body.statusTime
                id = body.id
                createdAt = body.createdAt
                createdBy = body.createdBy
                estDeltaV = body.estDeltaV
                fuelMass = body.fuelMass
                fuelMassUnc = body.fuelMassUnc
                isp = body.isp
                maxDeltaV = body.maxDeltaV
                minDeltaV = body.minDeltaV
                name = body.name
                operational = body.operational
                origin = body.origin
                origNetwork = body.origNetwork
                propMassAvg = body.propMassAvg
                propMassMax = body.propMassMax
                propMassMedian = body.propMassMedian
                propMassMin = body.propMassMin
                thrustMax = body.thrustMax
                totalDeltaV = body.totalDeltaV
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
             * ID of the associated OnorbitThruster record. This ID can be used to obtain additional
             * information on an onorbit thruster object using the 'get by ID' operation (e.g.
             * /udl/onorbitthruster/{id}). For example, the OnorbitThruster object with
             * idOnorbitThruster = abc would be queried as /udl/onorbitthruster/abc.
             */
            fun idOnorbitThruster(idOnorbitThruster: String) =
                idOnorbitThruster(JsonField.of(idOnorbitThruster))

            /**
             * Sets [Builder.idOnorbitThruster] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnorbitThruster] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnorbitThruster(idOnorbitThruster: JsonField<String>) = apply {
                this.idOnorbitThruster = idOnorbitThruster
            }

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

            /**
             * Datetime of the thruster status observation in ISO 8601 UTC datetime format with
             * millisecond precision.
             */
            fun statusTime(statusTime: OffsetDateTime) = statusTime(JsonField.of(statusTime))

            /**
             * Sets [Builder.statusTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusTime(statusTime: JsonField<OffsetDateTime>) = apply {
                this.statusTime = statusTime
            }

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

            /** Estimated available delta-velocity for this thruster, in meters per second. */
            fun estDeltaV(estDeltaV: Double) = estDeltaV(JsonField.of(estDeltaV))

            /**
             * Sets [Builder.estDeltaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estDeltaV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun estDeltaV(estDeltaV: JsonField<Double>) = apply { this.estDeltaV = estDeltaV }

            /** Total fuel mass available for this thruster's type, in kilograms. */
            fun fuelMass(fuelMass: Double) = fuelMass(JsonField.of(fuelMass))

            /**
             * Sets [Builder.fuelMass] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelMass] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelMass(fuelMass: JsonField<Double>) = apply { this.fuelMass = fuelMass }

            /**
             * 1-sigma uncertainty of the total fuel mass available for this thruster type, in
             * kilograms.
             */
            fun fuelMassUnc(fuelMassUnc: Double) = fuelMassUnc(JsonField.of(fuelMassUnc))

            /**
             * Sets [Builder.fuelMassUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelMassUnc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelMassUnc(fuelMassUnc: JsonField<Double>) = apply {
                this.fuelMassUnc = fuelMassUnc
            }

            /** Specific impulse for this thruster, in seconds. */
            fun isp(isp: Double) = isp(JsonField.of(isp))

            /**
             * Sets [Builder.isp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isp] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun isp(isp: JsonField<Double>) = apply { this.isp = isp }

            /** Maximum available delta-velocity for this thruster, in meters per second. */
            fun maxDeltaV(maxDeltaV: Double) = maxDeltaV(JsonField.of(maxDeltaV))

            /**
             * Sets [Builder.maxDeltaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxDeltaV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxDeltaV(maxDeltaV: JsonField<Double>) = apply { this.maxDeltaV = maxDeltaV }

            /** Minimum available delta-velocity for this thruster, in meters per second. */
            fun minDeltaV(minDeltaV: Double) = minDeltaV(JsonField.of(minDeltaV))

            /**
             * Sets [Builder.minDeltaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minDeltaV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minDeltaV(minDeltaV: JsonField<Double>) = apply { this.minDeltaV = minDeltaV }

            /** Identifier of this thruster. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Flag indicating if this thruster is operational. */
            fun operational(operational: Boolean) = operational(JsonField.of(operational))

            /**
             * Sets [Builder.operational] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operational] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operational(operational: JsonField<Boolean>) = apply {
                this.operational = operational
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

            /** Average available propellant mass for this thruster's type, in kilograms. */
            fun propMassAvg(propMassAvg: Double) = propMassAvg(JsonField.of(propMassAvg))

            /**
             * Sets [Builder.propMassAvg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propMassAvg] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun propMassAvg(propMassAvg: JsonField<Double>) = apply {
                this.propMassAvg = propMassAvg
            }

            /** Maximum available propellant mass for this thruster's type, in kilograms. */
            fun propMassMax(propMassMax: Double) = propMassMax(JsonField.of(propMassMax))

            /**
             * Sets [Builder.propMassMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propMassMax] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun propMassMax(propMassMax: JsonField<Double>) = apply {
                this.propMassMax = propMassMax
            }

            /** Median available propellant mass for this thruster's type, in kilograms. */
            fun propMassMedian(propMassMedian: Double) =
                propMassMedian(JsonField.of(propMassMedian))

            /**
             * Sets [Builder.propMassMedian] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propMassMedian] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun propMassMedian(propMassMedian: JsonField<Double>) = apply {
                this.propMassMedian = propMassMedian
            }

            /** Minimum available propellant mass for this thruster's type, in kilograms. */
            fun propMassMin(propMassMin: Double) = propMassMin(JsonField.of(propMassMin))

            /**
             * Sets [Builder.propMassMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.propMassMin] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun propMassMin(propMassMin: JsonField<Double>) = apply {
                this.propMassMin = propMassMin
            }

            /** Maximum available thrust for this thruster, in newtons. */
            fun thrustMax(thrustMax: Double) = thrustMax(JsonField.of(thrustMax))

            /**
             * Sets [Builder.thrustMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.thrustMax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun thrustMax(thrustMax: JsonField<Double>) = apply { this.thrustMax = thrustMax }

            /** Total delta-velocity available for this thruster's type, in meters per second. */
            fun totalDeltaV(totalDeltaV: Double) = totalDeltaV(JsonField.of(totalDeltaV))

            /**
             * Sets [Builder.totalDeltaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalDeltaV] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalDeltaV(totalDeltaV: JsonField<Double>) = apply {
                this.totalDeltaV = totalDeltaV
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
             * .idOnorbitThruster()
             * .source()
             * .statusTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("idOnorbitThruster", idOnorbitThruster),
                    checkRequired("source", source),
                    checkRequired("statusTime", statusTime),
                    id,
                    createdAt,
                    createdBy,
                    estDeltaV,
                    fuelMass,
                    fuelMassUnc,
                    isp,
                    maxDeltaV,
                    minDeltaV,
                    name,
                    operational,
                    origin,
                    origNetwork,
                    propMassAvg,
                    propMassMax,
                    propMassMedian,
                    propMassMin,
                    thrustMax,
                    totalDeltaV,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            idOnorbitThruster()
            source()
            statusTime()
            id()
            createdAt()
            createdBy()
            estDeltaV()
            fuelMass()
            fuelMassUnc()
            isp()
            maxDeltaV()
            minDeltaV()
            name()
            operational()
            origin()
            origNetwork()
            propMassAvg()
            propMassMax()
            propMassMedian()
            propMassMin()
            thrustMax()
            totalDeltaV()
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
                (if (idOnorbitThruster.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (statusTime.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (estDeltaV.asKnown().isPresent) 1 else 0) +
                (if (fuelMass.asKnown().isPresent) 1 else 0) +
                (if (fuelMassUnc.asKnown().isPresent) 1 else 0) +
                (if (isp.asKnown().isPresent) 1 else 0) +
                (if (maxDeltaV.asKnown().isPresent) 1 else 0) +
                (if (minDeltaV.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (operational.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (propMassAvg.asKnown().isPresent) 1 else 0) +
                (if (propMassMax.asKnown().isPresent) 1 else 0) +
                (if (propMassMedian.asKnown().isPresent) 1 else 0) +
                (if (propMassMin.asKnown().isPresent) 1 else 0) +
                (if (thrustMax.asKnown().isPresent) 1 else 0) +
                (if (totalDeltaV.asKnown().isPresent) 1 else 0)

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
                idOnorbitThruster == other.idOnorbitThruster &&
                source == other.source &&
                statusTime == other.statusTime &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                estDeltaV == other.estDeltaV &&
                fuelMass == other.fuelMass &&
                fuelMassUnc == other.fuelMassUnc &&
                isp == other.isp &&
                maxDeltaV == other.maxDeltaV &&
                minDeltaV == other.minDeltaV &&
                name == other.name &&
                operational == other.operational &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                propMassAvg == other.propMassAvg &&
                propMassMax == other.propMassMax &&
                propMassMedian == other.propMassMedian &&
                propMassMin == other.propMassMin &&
                thrustMax == other.thrustMax &&
                totalDeltaV == other.totalDeltaV
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                idOnorbitThruster,
                source,
                statusTime,
                id,
                createdAt,
                createdBy,
                estDeltaV,
                fuelMass,
                fuelMassUnc,
                isp,
                maxDeltaV,
                minDeltaV,
                name,
                operational,
                origin,
                origNetwork,
                propMassAvg,
                propMassMax,
                propMassMedian,
                propMassMin,
                thrustMax,
                totalDeltaV,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, idOnorbitThruster=$idOnorbitThruster, source=$source, statusTime=$statusTime, id=$id, createdAt=$createdAt, createdBy=$createdBy, estDeltaV=$estDeltaV, fuelMass=$fuelMass, fuelMassUnc=$fuelMassUnc, isp=$isp, maxDeltaV=$maxDeltaV, minDeltaV=$minDeltaV, name=$name, operational=$operational, origin=$origin, origNetwork=$origNetwork, propMassAvg=$propMassAvg, propMassMax=$propMassMax, propMassMedian=$propMassMedian, propMassMin=$propMassMin, thrustMax=$thrustMax, totalDeltaV=$totalDeltaV}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitthrusterstatusCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OnorbitthrusterstatusCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

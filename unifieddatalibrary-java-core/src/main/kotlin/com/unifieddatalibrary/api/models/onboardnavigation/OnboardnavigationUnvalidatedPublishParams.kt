// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onboardnavigation

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
 * Service operation to take a list of onboard navigation records as a POST body and ingest into the
 * database. This operation is intended to be used for automated feeds into UDL. A specific role is
 * required to perform this service operation. Please contact the UDL team for assistance.
 */
class OnboardnavigationUnvalidatedPublishParams
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
         * [OnboardnavigationUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnboardnavigationUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            onboardnavigationUnvalidatedPublishParams: OnboardnavigationUnvalidatedPublishParams
        ) = apply {
            body = onboardnavigationUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders =
                onboardnavigationUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                onboardnavigationUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [OnboardnavigationUnvalidatedPublishParams].
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
        fun build(): OnboardnavigationUnvalidatedPublishParams =
            OnboardnavigationUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * These services provide spacecraft positional data derived from on-board navigational sensors.
     * Navigational points are provided in kilometers and in a user specified reference frame, with
     * ECI J2K being preferred.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val deltaPos: JsonField<List<List<Double>>>,
        private val endTime: JsonField<OffsetDateTime>,
        private val esId: JsonField<String>,
        private val idOnOrbit: JsonField<String>,
        private val idStateVector: JsonField<String>,
        private val mag: JsonField<List<List<Double>>>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val origObjectId: JsonField<String>,
        private val referenceFrame: JsonField<ReferenceFrame>,
        private val satNo: JsonField<Int>,
        private val starCatLoadTime: JsonField<OffsetDateTime>,
        private val starCatName: JsonField<String>,
        private val starTracker: JsonField<List<List<Double>>>,
        private val sunSensor: JsonField<List<List<Double>>>,
        private val ts: JsonField<List<OffsetDateTime>>,
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
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("startTime")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("deltaPos")
            @ExcludeMissing
            deltaPos: JsonField<List<List<Double>>> = JsonMissing.of(),
            @JsonProperty("endTime")
            @ExcludeMissing
            endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("esId") @ExcludeMissing esId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idOnOrbit")
            @ExcludeMissing
            idOnOrbit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idStateVector")
            @ExcludeMissing
            idStateVector: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mag")
            @ExcludeMissing
            mag: JsonField<List<List<Double>>> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origObjectId")
            @ExcludeMissing
            origObjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referenceFrame")
            @ExcludeMissing
            referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of(),
            @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("starCatLoadTime")
            @ExcludeMissing
            starCatLoadTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starCatName")
            @ExcludeMissing
            starCatName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starTracker")
            @ExcludeMissing
            starTracker: JsonField<List<List<Double>>> = JsonMissing.of(),
            @JsonProperty("sunSensor")
            @ExcludeMissing
            sunSensor: JsonField<List<List<Double>>> = JsonMissing.of(),
            @JsonProperty("ts")
            @ExcludeMissing
            ts: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            startTime,
            id,
            createdAt,
            createdBy,
            deltaPos,
            endTime,
            esId,
            idOnOrbit,
            idStateVector,
            mag,
            origin,
            origNetwork,
            origObjectId,
            referenceFrame,
            satNo,
            starCatLoadTime,
            starCatName,
            starTracker,
            sunSensor,
            ts,
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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Start time of the sensor data, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

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
         * Arrays of spacecraft delta position (X, Y, Z), in km, in the specified referenceFrame,
         * between the onboard state and the last accepted sensor position.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaPos(): Optional<List<List<Double>>> = deltaPos.getOptional("deltaPos")

        /**
         * End time of the sensor data, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

        /**
         * Unique identifier of the parent EphemerisSet, if this data is correlated with an
         * Ephemeris. If multiple nav sensor records are required, this ID may be associated with
         * each of those records if each is synced to the ephemeris points.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun esId(): Optional<String> = esId.getOptional("esId")

        /**
         * Unique identifier of the primary satellite on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Unique identifier of the last onboard state vector.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idStateVector(): Optional<String> = idStateVector.getOptional("idStateVector")

        /**
         * Arrays of spacecraft position (X, Y, Z), in km, in the specified referenceFrame, based on
         * the onboard magnetometer, at each epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mag(): Optional<List<List<Double>>> = mag.getOptional("mag")

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
         * Optional identifier provided by the data source to indicate the target object of this
         * record. This may be an internal identifier and not necessarily map to a valid satellite
         * number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * The reference frame in which the sensor derived positions are provided. If the
         * referenceFrame is null it is assumed to be J2000. Note that this frame is assumed to
         * apply to all of the sensor data in this record. If onboard sensors process positional
         * estimates in different frames then separate records should be generated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun referenceFrame(): Optional<ReferenceFrame> =
            referenceFrame.getOptional("referenceFrame")

        /**
         * Satellite/catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * The last load time of the current star catalog onboard this spacecraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun starCatLoadTime(): Optional<OffsetDateTime> =
            starCatLoadTime.getOptional("starCatLoadTime")

        /**
         * The name or identifier the star catalog in use.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun starCatName(): Optional<String> = starCatName.getOptional("starCatName")

        /**
         * Arrays of spacecraft position (X, Y, Z), in km, in the specified referenceFrame, based on
         * the onboard star tracker, at each epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun starTracker(): Optional<List<List<Double>>> = starTracker.getOptional("starTracker")

        /**
         * Arrays of spacecraft position (X, Y, Z), in km, in the specified referenceFrame, based on
         * the onboard sun sensor, at each epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sunSensor(): Optional<List<List<Double>>> = sunSensor.getOptional("sunSensor")

        /**
         * Array of epochs of the observations, in ISO 8601 UTC format. The epochs are assumed to
         * correspond to all sensor data in this record. If sensors do not share a common epoch then
         * separate records should be generated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ts(): Optional<List<OffsetDateTime>> = ts.getOptional("ts")

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
         * Returns the raw JSON value of [deltaPos].
         *
         * Unlike [deltaPos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaPos")
        @ExcludeMissing
        fun _deltaPos(): JsonField<List<List<Double>>> = deltaPos

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

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
         * Returns the raw JSON value of [idStateVector].
         *
         * Unlike [idStateVector], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idStateVector")
        @ExcludeMissing
        fun _idStateVector(): JsonField<String> = idStateVector

        /**
         * Returns the raw JSON value of [mag].
         *
         * Unlike [mag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mag") @ExcludeMissing fun _mag(): JsonField<List<List<Double>>> = mag

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
         * Returns the raw JSON value of [referenceFrame].
         *
         * Unlike [referenceFrame], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referenceFrame")
        @ExcludeMissing
        fun _referenceFrame(): JsonField<ReferenceFrame> = referenceFrame

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [starCatLoadTime].
         *
         * Unlike [starCatLoadTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starCatLoadTime")
        @ExcludeMissing
        fun _starCatLoadTime(): JsonField<OffsetDateTime> = starCatLoadTime

        /**
         * Returns the raw JSON value of [starCatName].
         *
         * Unlike [starCatName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starCatName")
        @ExcludeMissing
        fun _starCatName(): JsonField<String> = starCatName

        /**
         * Returns the raw JSON value of [starTracker].
         *
         * Unlike [starTracker], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starTracker")
        @ExcludeMissing
        fun _starTracker(): JsonField<List<List<Double>>> = starTracker

        /**
         * Returns the raw JSON value of [sunSensor].
         *
         * Unlike [sunSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sunSensor")
        @ExcludeMissing
        fun _sunSensor(): JsonField<List<List<Double>>> = sunSensor

        /**
         * Returns the raw JSON value of [ts].
         *
         * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<List<OffsetDateTime>> = ts

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
             * .source()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var deltaPos: JsonField<MutableList<List<Double>>>? = null
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var esId: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idStateVector: JsonField<String> = JsonMissing.of()
            private var mag: JsonField<MutableList<List<Double>>>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var starCatLoadTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var starCatName: JsonField<String> = JsonMissing.of()
            private var starTracker: JsonField<MutableList<List<Double>>>? = null
            private var sunSensor: JsonField<MutableList<List<Double>>>? = null
            private var ts: JsonField<MutableList<OffsetDateTime>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                startTime = body.startTime
                id = body.id
                createdAt = body.createdAt
                createdBy = body.createdBy
                deltaPos = body.deltaPos.map { it.toMutableList() }
                endTime = body.endTime
                esId = body.esId
                idOnOrbit = body.idOnOrbit
                idStateVector = body.idStateVector
                mag = body.mag.map { it.toMutableList() }
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                referenceFrame = body.referenceFrame
                satNo = body.satNo
                starCatLoadTime = body.starCatLoadTime
                starCatName = body.starCatName
                starTracker = body.starTracker.map { it.toMutableList() }
                sunSensor = body.sunSensor.map { it.toMutableList() }
                ts = body.ts.map { it.toMutableList() }
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
             * Indicator of whether the data is REAL, TEST, EXERCISE, or SIMULATED data:
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
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

            /** Start time of the sensor data, in ISO 8601 UTC format. */
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

            /**
             * Arrays of spacecraft delta position (X, Y, Z), in km, in the specified
             * referenceFrame, between the onboard state and the last accepted sensor position.
             */
            fun deltaPos(deltaPos: List<List<Double>>) = deltaPos(JsonField.of(deltaPos))

            /**
             * Sets [Builder.deltaPos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaPos] with a well-typed `List<List<Double>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deltaPos(deltaPos: JsonField<List<List<Double>>>) = apply {
                this.deltaPos = deltaPos.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Double>] to [deltaPos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDeltaPo(deltaPo: List<Double>) = apply {
                deltaPos =
                    (deltaPos ?: JsonField.of(mutableListOf())).also {
                        checkKnown("deltaPos", it).add(deltaPo)
                    }
            }

            /** End time of the sensor data, in ISO 8601 UTC format. */
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
             * Unique identifier of the parent EphemerisSet, if this data is correlated with an
             * Ephemeris. If multiple nav sensor records are required, this ID may be associated
             * with each of those records if each is synced to the ephemeris points.
             */
            fun esId(esId: String) = esId(JsonField.of(esId))

            /**
             * Sets [Builder.esId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.esId] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun esId(esId: JsonField<String>) = apply { this.esId = esId }

            /** Unique identifier of the primary satellite on-orbit object. */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

            /** Unique identifier of the last onboard state vector. */
            fun idStateVector(idStateVector: String) = idStateVector(JsonField.of(idStateVector))

            /**
             * Sets [Builder.idStateVector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idStateVector] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idStateVector(idStateVector: JsonField<String>) = apply {
                this.idStateVector = idStateVector
            }

            /**
             * Arrays of spacecraft position (X, Y, Z), in km, in the specified referenceFrame,
             * based on the onboard magnetometer, at each epoch.
             */
            fun mag(mag: List<List<Double>>) = mag(JsonField.of(mag))

            /**
             * Sets [Builder.mag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mag] with a well-typed `List<List<Double>>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mag(mag: JsonField<List<List<Double>>>) = apply {
                this.mag = mag.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Double>] to [Builder.mag].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMag(mag: List<Double>) = apply {
                this.mag =
                    (this.mag ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mag", it).add(mag)
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
             * Optional identifier provided by the data source to indicate the target object of this
             * record. This may be an internal identifier and not necessarily map to a valid
             * satellite number.
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
             * The reference frame in which the sensor derived positions are provided. If the
             * referenceFrame is null it is assumed to be J2000. Note that this frame is assumed to
             * apply to all of the sensor data in this record. If onboard sensors process positional
             * estimates in different frames then separate records should be generated.
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

            /** The last load time of the current star catalog onboard this spacecraft. */
            fun starCatLoadTime(starCatLoadTime: OffsetDateTime) =
                starCatLoadTime(JsonField.of(starCatLoadTime))

            /**
             * Sets [Builder.starCatLoadTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.starCatLoadTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun starCatLoadTime(starCatLoadTime: JsonField<OffsetDateTime>) = apply {
                this.starCatLoadTime = starCatLoadTime
            }

            /** The name or identifier the star catalog in use. */
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
             * Arrays of spacecraft position (X, Y, Z), in km, in the specified referenceFrame,
             * based on the onboard star tracker, at each epoch.
             */
            fun starTracker(starTracker: List<List<Double>>) =
                starTracker(JsonField.of(starTracker))

            /**
             * Sets [Builder.starTracker] to an arbitrary JSON value.
             *
             * You should usually call [Builder.starTracker] with a well-typed `List<List<Double>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun starTracker(starTracker: JsonField<List<List<Double>>>) = apply {
                this.starTracker = starTracker.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Double>] to [Builder.starTracker].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStarTracker(starTracker: List<Double>) = apply {
                this.starTracker =
                    (this.starTracker ?: JsonField.of(mutableListOf())).also {
                        checkKnown("starTracker", it).add(starTracker)
                    }
            }

            /**
             * Arrays of spacecraft position (X, Y, Z), in km, in the specified referenceFrame,
             * based on the onboard sun sensor, at each epoch.
             */
            fun sunSensor(sunSensor: List<List<Double>>) = sunSensor(JsonField.of(sunSensor))

            /**
             * Sets [Builder.sunSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sunSensor] with a well-typed `List<List<Double>>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sunSensor(sunSensor: JsonField<List<List<Double>>>) = apply {
                this.sunSensor = sunSensor.map { it.toMutableList() }
            }

            /**
             * Adds a single [List<Double>] to [Builder.sunSensor].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSunSensor(sunSensor: List<Double>) = apply {
                this.sunSensor =
                    (this.sunSensor ?: JsonField.of(mutableListOf())).also {
                        checkKnown("sunSensor", it).add(sunSensor)
                    }
            }

            /**
             * Array of epochs of the observations, in ISO 8601 UTC format. The epochs are assumed
             * to correspond to all sensor data in this record. If sensors do not share a common
             * epoch then separate records should be generated.
             */
            fun ts(ts: List<OffsetDateTime>) = ts(JsonField.of(ts))

            /**
             * Sets [Builder.ts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ts] with a well-typed `List<OffsetDateTime>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ts(ts: JsonField<List<OffsetDateTime>>) = apply {
                this.ts = ts.map { it.toMutableList() }
            }

            /**
             * Adds a single [OffsetDateTime] to [ts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addT(t: OffsetDateTime) = apply {
                ts = (ts ?: JsonField.of(mutableListOf())).also { checkKnown("ts", it).add(t) }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("startTime", startTime),
                    id,
                    createdAt,
                    createdBy,
                    (deltaPos ?: JsonMissing.of()).map { it.toImmutable() },
                    endTime,
                    esId,
                    idOnOrbit,
                    idStateVector,
                    (mag ?: JsonMissing.of()).map { it.toImmutable() },
                    origin,
                    origNetwork,
                    origObjectId,
                    referenceFrame,
                    satNo,
                    starCatLoadTime,
                    starCatName,
                    (starTracker ?: JsonMissing.of()).map { it.toImmutable() },
                    (sunSensor ?: JsonMissing.of()).map { it.toImmutable() },
                    (ts ?: JsonMissing.of()).map { it.toImmutable() },
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
            source()
            startTime()
            id()
            createdAt()
            createdBy()
            deltaPos()
            endTime()
            esId()
            idOnOrbit()
            idStateVector()
            mag()
            origin()
            origNetwork()
            origObjectId()
            referenceFrame().ifPresent { it.validate() }
            satNo()
            starCatLoadTime()
            starCatName()
            starTracker()
            sunSensor()
            ts()
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
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (deltaPos.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (esId.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (idStateVector.asKnown().isPresent) 1 else 0) +
                (mag.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (if (starCatLoadTime.asKnown().isPresent) 1 else 0) +
                (if (starCatName.asKnown().isPresent) 1 else 0) +
                (starTracker.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (sunSensor.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0) +
                (ts.asKnown().getOrNull()?.size ?: 0)

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

        /**
         * The reference frame in which the sensor derived positions are provided. If the
         * referenceFrame is null it is assumed to be J2000. Note that this frame is assumed to
         * apply to all of the sensor data in this record. If onboard sensors process positional
         * estimates in different frames then separate records should be generated.
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                startTime == other.startTime &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                deltaPos == other.deltaPos &&
                endTime == other.endTime &&
                esId == other.esId &&
                idOnOrbit == other.idOnOrbit &&
                idStateVector == other.idStateVector &&
                mag == other.mag &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                referenceFrame == other.referenceFrame &&
                satNo == other.satNo &&
                starCatLoadTime == other.starCatLoadTime &&
                starCatName == other.starCatName &&
                starTracker == other.starTracker &&
                sunSensor == other.sunSensor &&
                ts == other.ts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                startTime,
                id,
                createdAt,
                createdBy,
                deltaPos,
                endTime,
                esId,
                idOnOrbit,
                idStateVector,
                mag,
                origin,
                origNetwork,
                origObjectId,
                referenceFrame,
                satNo,
                starCatLoadTime,
                starCatName,
                starTracker,
                sunSensor,
                ts,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, startTime=$startTime, id=$id, createdAt=$createdAt, createdBy=$createdBy, deltaPos=$deltaPos, endTime=$endTime, esId=$esId, idOnOrbit=$idOnOrbit, idStateVector=$idStateVector, mag=$mag, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, referenceFrame=$referenceFrame, satNo=$satNo, starCatLoadTime=$starCatLoadTime, starCatName=$starCatName, starTracker=$starTracker, sunSensor=$sunSensor, ts=$ts, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnboardnavigationUnvalidatedPublishParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OnboardnavigationUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

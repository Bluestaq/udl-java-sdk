// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.collectrequests

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
 * Service operation intended for initial integration only, to take a list of CollectRequest as a
 * POST body and ingest into the database. This operation is not intended to be used for automated
 * feeds into UDL. Data providers should contact the UDL team for specific role assignments and for
 * instructions on setting up a permanent feed through an alternate mechanism.
 */
class CollectRequestCreateBulkParams
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
         * [CollectRequestCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CollectRequestCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(collectRequestCreateBulkParams: CollectRequestCreateBulkParams) = apply {
            body = collectRequestCreateBulkParams.body.toMutableList()
            additionalHeaders = collectRequestCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = collectRequestCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [CollectRequestCreateBulkParams].
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
        fun build(): CollectRequestCreateBulkParams =
            CollectRequestCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Collect Requests support several types of individual requests, or planned/scheduled tasks on
     * sensors and/or orbital objects. Options are provided to accomodate most common sensor contact
     * and collection applications, including single sensor-object tasking, search operations, and
     * TT&C support. Multiple requests originating from a plan or schedule may be associated to a
     * sensor plan if desired.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("startTime") @ExcludeMissing private val startTime: JsonField<OffsetDateTime>,
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("alt") @ExcludeMissing private val alt: JsonField<Double>,
        @JsonProperty("argOfPerigee") @ExcludeMissing private val argOfPerigee: JsonField<Double>,
        @JsonProperty("az") @ExcludeMissing private val az: JsonField<Double>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("customer") @ExcludeMissing private val customer: JsonField<String>,
        @JsonProperty("dec") @ExcludeMissing private val dec: JsonField<Double>,
        @JsonProperty("duration") @ExcludeMissing private val duration: JsonField<Int>,
        @JsonProperty("dwellId") @ExcludeMissing private val dwellId: JsonField<String>,
        @JsonProperty("eccentricity") @ExcludeMissing private val eccentricity: JsonField<Double>,
        @JsonProperty("el") @ExcludeMissing private val el: JsonField<Double>,
        @JsonProperty("elset") @ExcludeMissing private val elset: JsonField<Elset>,
        @JsonProperty("endTime") @ExcludeMissing private val endTime: JsonField<OffsetDateTime>,
        @JsonProperty("epoch") @ExcludeMissing private val epoch: JsonField<OffsetDateTime>,
        @JsonProperty("esId") @ExcludeMissing private val esId: JsonField<String>,
        @JsonProperty("extentAz") @ExcludeMissing private val extentAz: JsonField<Double>,
        @JsonProperty("extentEl") @ExcludeMissing private val extentEl: JsonField<Double>,
        @JsonProperty("extentRange") @ExcludeMissing private val extentRange: JsonField<Double>,
        @JsonProperty("externalId") @ExcludeMissing private val externalId: JsonField<String>,
        @JsonProperty("frameRate") @ExcludeMissing private val frameRate: JsonField<Double>,
        @JsonProperty("freq") @ExcludeMissing private val freq: JsonField<Double>,
        @JsonProperty("freqMax") @ExcludeMissing private val freqMax: JsonField<Double>,
        @JsonProperty("freqMin") @ExcludeMissing private val freqMin: JsonField<Double>,
        @JsonProperty("idElset") @ExcludeMissing private val idElset: JsonField<String>,
        @JsonProperty("idManifold") @ExcludeMissing private val idManifold: JsonField<String>,
        @JsonProperty("idOnOrbit") @ExcludeMissing private val idOnOrbit: JsonField<String>,
        @JsonProperty("idParentReq") @ExcludeMissing private val idParentReq: JsonField<String>,
        @JsonProperty("idPlan") @ExcludeMissing private val idPlan: JsonField<String>,
        @JsonProperty("idSensor") @ExcludeMissing private val idSensor: JsonField<String>,
        @JsonProperty("idStateVector") @ExcludeMissing private val idStateVector: JsonField<String>,
        @JsonProperty("inclination") @ExcludeMissing private val inclination: JsonField<Double>,
        @JsonProperty("integrationTime")
        @ExcludeMissing
        private val integrationTime: JsonField<Double>,
        @JsonProperty("iron") @ExcludeMissing private val iron: JsonField<Int>,
        @JsonProperty("irradiance") @ExcludeMissing private val irradiance: JsonField<Double>,
        @JsonProperty("lat") @ExcludeMissing private val lat: JsonField<Double>,
        @JsonProperty("lon") @ExcludeMissing private val lon: JsonField<Double>,
        @JsonProperty("msgCreateDate")
        @ExcludeMissing
        private val msgCreateDate: JsonField<OffsetDateTime>,
        @JsonProperty("msgType") @ExcludeMissing private val msgType: JsonField<String>,
        @JsonProperty("notes") @ExcludeMissing private val notes: JsonField<String>,
        @JsonProperty("numFrames") @ExcludeMissing private val numFrames: JsonField<Int>,
        @JsonProperty("numObs") @ExcludeMissing private val numObs: JsonField<Int>,
        @JsonProperty("numTracks") @ExcludeMissing private val numTracks: JsonField<Int>,
        @JsonProperty("obType") @ExcludeMissing private val obType: JsonField<String>,
        @JsonProperty("orbitRegime") @ExcludeMissing private val orbitRegime: JsonField<String>,
        @JsonProperty("orientAngle") @ExcludeMissing private val orientAngle: JsonField<Double>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origObjectId") @ExcludeMissing private val origObjectId: JsonField<String>,
        @JsonProperty("origSensorId") @ExcludeMissing private val origSensorId: JsonField<String>,
        @JsonProperty("planIndex") @ExcludeMissing private val planIndex: JsonField<Int>,
        @JsonProperty("polarization") @ExcludeMissing private val polarization: JsonField<String>,
        @JsonProperty("priority") @ExcludeMissing private val priority: JsonField<String>,
        @JsonProperty("ra") @ExcludeMissing private val ra: JsonField<Double>,
        @JsonProperty("raan") @ExcludeMissing private val raan: JsonField<Double>,
        @JsonProperty("range") @ExcludeMissing private val range: JsonField<Double>,
        @JsonProperty("rcs") @ExcludeMissing private val rcs: JsonField<Double>,
        @JsonProperty("rcsMax") @ExcludeMissing private val rcsMax: JsonField<Double>,
        @JsonProperty("rcsMin") @ExcludeMissing private val rcsMin: JsonField<Double>,
        @JsonProperty("reflectance") @ExcludeMissing private val reflectance: JsonField<Double>,
        @JsonProperty("satNo") @ExcludeMissing private val satNo: JsonField<Int>,
        @JsonProperty("scenario") @ExcludeMissing private val scenario: JsonField<String>,
        @JsonProperty("semiMajorAxis") @ExcludeMissing private val semiMajorAxis: JsonField<Double>,
        @JsonProperty("spectralModel") @ExcludeMissing private val spectralModel: JsonField<String>,
        @JsonProperty("srchInc") @ExcludeMissing private val srchInc: JsonField<Double>,
        @JsonProperty("srchPattern") @ExcludeMissing private val srchPattern: JsonField<String>,
        @JsonProperty("stateVector")
        @ExcludeMissing
        private val stateVector: JsonField<StateVector>,
        @JsonProperty("stopAlt") @ExcludeMissing private val stopAlt: JsonField<Double>,
        @JsonProperty("stopLat") @ExcludeMissing private val stopLat: JsonField<Double>,
        @JsonProperty("stopLon") @ExcludeMissing private val stopLon: JsonField<Double>,
        @JsonProperty("suffix") @ExcludeMissing private val suffix: JsonField<String>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,
        @JsonProperty("targetSize") @ExcludeMissing private val targetSize: JsonField<Double>,
        @JsonProperty("taskCategory") @ExcludeMissing private val taskCategory: JsonField<Int>,
        @JsonProperty("taskGroup") @ExcludeMissing private val taskGroup: JsonField<String>,
        @JsonProperty("taskId") @ExcludeMissing private val taskId: JsonField<String>,
        @JsonProperty("transactionId") @ExcludeMissing private val transactionId: JsonField<String>,
        @JsonProperty("trueAnomoly") @ExcludeMissing private val trueAnomoly: JsonField<Double>,
        @JsonProperty("uctFollowUp") @ExcludeMissing private val uctFollowUp: JsonField<Boolean>,
        @JsonProperty("visMag") @ExcludeMissing private val visMag: JsonField<Double>,
        @JsonProperty("visMagMax") @ExcludeMissing private val visMagMax: JsonField<Double>,
        @JsonProperty("visMagMin") @ExcludeMissing private val visMagMin: JsonField<Double>,
        @JsonProperty("xAngle") @ExcludeMissing private val xAngle: JsonField<Double>,
        @JsonProperty("yAngle") @ExcludeMissing private val yAngle: JsonField<Double>,
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
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * The start time or earliest time of the collect or contact request window, in ISO 8601 UTC
         * format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

        /**
         * The type of this collect or contact request (DIRECTED SEARCH, DWELL, OBJECT, POL, RATE
         * TRACK, SEARCH, SOI, STARE, TTC, VOLUME SEARCH, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Height above WGS-84 ellipsoid (HAE), in kilometers. If an accompanying stopAlt is
         * provided, then alt value can be assumed to be the starting altitude of a volume
         * definition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alt(): Optional<Double> = alt.getOptional("alt")

        /**
         * The argument of perigee is the angle, in degrees, formed between the perigee and the
         * ascending node.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun argOfPerigee(): Optional<Double> = argOfPerigee.getOptional("argOfPerigee")

        /**
         * The expected or directed azimuth angle, in degrees, for search or target acquisition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun az(): Optional<Double> = az.getOptional("az")

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
         * The customer for this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun customer(): Optional<String> = customer.getOptional("customer")

        /**
         * The expected or directed declination angle, in degrees, for search or target acquisition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dec(): Optional<Double> = dec.getOptional("dec")

        /**
         * The duration of the collect request, in seconds. If both duration and endTime are
         * provided, the endTime is assumed to take precedence.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun duration(): Optional<Int> = duration.getOptional("duration")

        /**
         * The dwell ID associated with this request. A dwell ID is dwell point specific and a DWELL
         * request consist of many dwell point requests.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dwellId(): Optional<String> = dwellId.getOptional("dwellId")

        /**
         * The orbital eccentricity of an astronomical object is a parameter that determines the
         * amount by which its orbit around another body deviates from a perfect circle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eccentricity(): Optional<Double> = eccentricity.getOptional("eccentricity")

        /**
         * The expected or directed elevation angle, in degrees, for search or target acquisition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun el(): Optional<Double> = el.getOptional("el")

        /**
         * An element set is a collection of Keplerian orbital elements describing an orbit of a
         * particular satellite. The data is used along with an orbit propagator in order to predict
         * the motion of a satellite. The element set, or elset for short, consists of
         * identification data, the classical elements and drag parameters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elset(): Optional<Elset> = elset.getOptional("elset")

        /**
         * The end time of the collect or contact request window, in ISO 8601 UTC format. If no
         * endTime or duration is provided it is assumed the request is either ongoing or that the
         * request is for a specified number of tracks (numTracks). If both duration and endTime are
         * provided, the endTime is assumed to take precedence.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

        /**
         * Epoch time, in ISO 8601 UTC format, of the orbital elements.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun epoch(): Optional<OffsetDateTime> = epoch.getOptional("epoch")

        /**
         * ID of the UDL Ephemeris Set of the object associated with this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun esId(): Optional<String> = esId.getOptional("esId")

        /**
         * The extent of the azimuth angle, in degrees, from center azimuth to define a spatial
         * volume.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun extentAz(): Optional<Double> = extentAz.getOptional("extentAz")

        /**
         * The extent of the elevation angle, in degrees, from center elevation to define a spatial
         * volume.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun extentEl(): Optional<Double> = extentEl.getOptional("extentEl")

        /**
         * The extent of the range, in km, from center range to define a spatial volume.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun extentRange(): Optional<Double> = extentRange.getOptional("extentRange")

        /**
         * Optional ID from external systems. This field has no meaning within UDL and is provided
         * as a convenience for systems that require tracking of an internal system generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("externalId")

        /**
         * For optical sensors, the frame rate of the camera, in Hz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun frameRate(): Optional<Double> = frameRate.getOptional("frameRate")

        /**
         * The estimated or expected emission frequency of the target, in MHz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun freq(): Optional<Double> = freq.getOptional("freq")

        /**
         * The maximum frequency of interest, in MHz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun freqMax(): Optional<Double> = freqMax.getOptional("freqMax")

        /**
         * The minimum frequency of interest, in MHz. If only minimum frequency is provided it is
         * assumed to be minimum reportable frequency.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun freqMin(): Optional<Double> = freqMin.getOptional("freqMin")

        /**
         * ID of the UDL Elset of the object associated with this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idElset(): Optional<String> = idElset.getOptional("idElset")

        /**
         * ID of the UDL Manifold Elset of the object associated with this request. A Manifold Elset
         * provides theoretical Keplerian orbital elements belonging to an object of interest's
         * manifold describing a possible/theoretical orbit for an object of interest for tasking
         * purposes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idManifold(): Optional<String> = idManifold.getOptional("idManifold")

        /**
         * Unique identifier of the target on-orbit object for this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * The unique ID of the collect request record from which this request originated. This may
         * be used for cases of sensor-to-sensor tasking, such as tip/cue operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idParentReq(): Optional<String> = idParentReq.getOptional("idParentReq")

        /**
         * Unique identifier of the parent plan or schedule associated with this request. If null,
         * this request is assumed not associated with a plan or schedule.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idPlan(): Optional<String> = idPlan.getOptional("idPlan")

        /**
         * Unique identifier of the requested/scheduled/planned sensor associated with this request.
         * If both idSensor and origSensorId are null then the request is assumed to be a general
         * request for observations or contact on an object, if specified, or an area/volume. In
         * this case, the requester may specify a desired obType.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * ID of the UDL State Vector of the object or central vector associated with this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idStateVector(): Optional<String> = idStateVector.getOptional("idStateVector")

        /**
         * The angle, in degrees, between the equator and the orbit plane when looking from the
         * center of the Earth. Inclination ranges from 0-180 degrees, with 0-90 representing
         * posigrade orbits and 90-180 representing retrograde orbits.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun inclination(): Optional<Double> = inclination.getOptional("inclination")

        /**
         * For optical sensors, the integration time per camera frame, in milliseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun integrationTime(): Optional<Double> = integrationTime.getOptional("integrationTime")

        /**
         * Inter-Range Operations Number. Four-digit identifier used to schedule and identify AFSCN
         * contact support for booster, launch, and on-orbit operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun iron(): Optional<Int> = iron.getOptional("iron")

        /**
         * The target object irradiance value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun irradiance(): Optional<Double> = irradiance.getOptional("irradiance")

        /**
         * WGS-84 latitude, in degrees. -90 to 90 degrees (negative values south of equator). If an
         * accompanying stopLat is provided, then the lat value can be assumed to be the starting
         * latitude of a volume definition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * WGS-84 longitude, in degrees. -180 to 180 degrees (negative values west of Prime
         * Meridian). If an accompanying stopLon is provided, then lon value can be assumed to be
         * the starting longitude of a volume definition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Optional<Double> = lon.getOptional("lon")

        /**
         * The timestamp of the external message from which this request originated, if applicable,
         * in ISO8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msgCreateDate(): Optional<OffsetDateTime> = msgCreateDate.getOptional("msgCreateDate")

        /**
         * The type of external message from which this request originated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msgType(): Optional<String> = msgType.getOptional("msgType")

        /**
         * Notes or comments associated with this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun notes(): Optional<String> = notes.getOptional("notes")

        /**
         * For optical sensors, the requested number of frames to capture at each sensor step.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numFrames(): Optional<Int> = numFrames.getOptional("numFrames")

        /**
         * The number of requested observations on the target.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numObs(): Optional<Int> = numObs.getOptional("numObs")

        /**
         * The number of requested tracks on the target. If numTracks is not provided it is assumed
         * to indicate all possible observations every pass over the request duration or within the
         * request start/end window.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numTracks(): Optional<Int> = numTracks.getOptional("numTracks")

        /**
         * Optional type of observation (EO, IR, RADAR, RF-ACTIVE, RF-PASSIVE, OTHER) requested.
         * This field may correspond to a request of a specific sensor, or to a general non sensor
         * specific request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obType(): Optional<String> = obType.getOptional("obType")

        /**
         * The orbit regime of the target (GEO, HEO, LAUNCH, LEO, MEO, OTHER).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun orbitRegime(): Optional<String> = orbitRegime.getOptional("orbitRegime")

        /**
         * The magnitude of rotation, in degrees, between the xAngle direction and locally defined
         * equinoctial plane. A positive value indicates clockwise rotation about the sensor
         * boresight vector.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun orientAngle(): Optional<Double> = orientAngle.getOptional("orientAngle")

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
         * request. This may be an internal identifier and not necessarily map to a valid satellite
         * number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier provided by the source to indicate the sensor identifier
         * requested/scheduled/planned for this request. This may be an internal identifier and not
         * necessarily a valid sensor ID. If both idSensor and origSensorId are null then the
         * request is assumed to be a general request for observations or contact on an object, if
         * specified, or an area/volume. In this case, the requester may specify a desired obType.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * Index number (integer) for records within a collection plan or schedule.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun planIndex(): Optional<Int> = planIndex.getOptional("planIndex")

        /**
         * The RF polarization (H, LHC, RHC, V).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun polarization(): Optional<String> = polarization.getOptional("polarization")

        /**
         * The priority of the collect request (EMERGENCY, FLASH, IMMEDIATE, PRIORITY, ROUTINE).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun priority(): Optional<String> = priority.getOptional("priority")

        /**
         * The expected or directed right ascension angle, in degrees, for search or target
         * acquisition.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ra(): Optional<Double> = ra.getOptional("ra")

        /**
         * Right ascension of the ascending node, or RAAN is the angle as measured in degrees
         * eastwards (or, as seen from the north, counterclockwise) from the First Point of Aries to
         * the ascending node.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun raan(): Optional<Double> = raan.getOptional("raan")

        /**
         * The expected acquisition range or defined center range, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun range(): Optional<Double> = range.getOptional("range")

        /**
         * The Radar Cross-Section of the target, in m^2.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rcs(): Optional<Double> = rcs.getOptional("rcs")

        /**
         * The maximum Radar Cross-Section of the target, in m^2.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rcsMax(): Optional<Double> = rcsMax.getOptional("rcsMax")

        /**
         * The minimum Radar Cross-Section of the target, in m^2. If only minimum RCS is provided it
         * is assumed to be minimum reportable RCS.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rcsMin(): Optional<Double> = rcsMin.getOptional("rcsMin")

        /**
         * The fraction of solar energy reflected from target.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reflectance(): Optional<Double> = reflectance.getOptional("reflectance")

        /**
         * Satellite/catalog number of the target on-orbit object for this request.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * Pre-coordinated code, direction, or configuration to be executed by the sensor or site
         * for this collect or contact.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun scenario(): Optional<String> = scenario.getOptional("scenario")

        /**
         * The average of the periapsis and apoapsis distances, in kilometers. For circular orbits,
         * the semimajor axis is the distance between the centers of the bodies.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun semiMajorAxis(): Optional<Double> = semiMajorAxis.getOptional("semiMajorAxis")

        /**
         * The spectral model used for the irradiance calculation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spectralModel(): Optional<String> = spectralModel.getOptional("spectralModel")

        /**
         * The maximum inclination, in degrees, to be used in search operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srchInc(): Optional<Double> = srchInc.getOptional("srchInc")

        /**
         * The search pattern to be executed for this request (e.g. PICKET-FENCE, SCAN, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srchPattern(): Optional<String> = srchPattern.getOptional("srchPattern")

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * OnOrbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that, together with their time (epoch) (t), uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stateVector(): Optional<StateVector> = stateVector.getOptional("stateVector")

        /**
         * The stopping HAE WGS-84 height above ellipsoid (HAE), of a volume definition, in
         * kilometers. The stopAlt value is only meaningful if a (starting) alt value is provided.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stopAlt(): Optional<Double> = stopAlt.getOptional("stopAlt")

        /**
         * The stopping WGS-84 latitude of a volume definition, in degrees. -90 to 90 degrees
         * (negative values south of equator). The stopLat value is only meaningful if a (starting)
         * lat value is provided.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stopLat(): Optional<Double> = stopLat.getOptional("stopLat")

        /**
         * The stopping WGS-84 longitude of a volume definition, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian). The stopLon value is only meaningful if a
         * (starting) lon value is provided.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stopLon(): Optional<Double> = stopLon.getOptional("stopLon")

        /**
         * The (SSN) tasking suffix (A-Z) associated with this request. The suffix defines the
         * amount of observational data and the frequency of collection. Note that suffix
         * definitions are sensor type specific.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun suffix(): Optional<String> = suffix.getOptional("suffix")

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
         * The minimum object (diameter) size, in meters, to be reported.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun targetSize(): Optional<Double> = targetSize.getOptional("targetSize")

        /**
         * The (SSN) tasking category (1-5) associated with this request. The tasking category
         * defines the priority of gathering and transmitting the requested observational data. Note
         * that category definitions are sensor type specific.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun taskCategory(): Optional<Int> = taskCategory.getOptional("taskCategory")

        /**
         * The tasking group to which the target object is assigned.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun taskGroup(): Optional<String> = taskGroup.getOptional("taskGroup")

        /**
         * Task ID associated with this request. A task ID may be associated with a single collect
         * request or may be used to tie together the sub-requests of a full collect, for example a
         * DWELL consisting of many dwell points.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun taskId(): Optional<String> = taskId.getOptional("taskId")

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

        /**
         * The true anomaly defines the angular position, in degrees, of the object on it's orbital
         * path as measured from the orbit focal point at epoch. The true anomaly is referenced from
         * perigee.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trueAnomoly(): Optional<Double> = trueAnomoly.getOptional("trueAnomoly")

        /**
         * Boolean indicating that this collect request is UCT follow-up.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun uctFollowUp(): Optional<Boolean> = uctFollowUp.getOptional("uctFollowUp")

        /**
         * The estimated or expected visual magnitude of the target, in Magnitudes (M).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun visMag(): Optional<Double> = visMag.getOptional("visMag")

        /**
         * The maximum estimated or expected visual magnitude of the target, in Magnitudes (M).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun visMagMax(): Optional<Double> = visMagMax.getOptional("visMagMax")

        /**
         * The minimum estimated or expected visual magnitude of the target, in Magnitudes (M). If
         * only minimum vismag is provided it is assumed to be minimum reportable vismag.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun visMagMin(): Optional<Double> = visMagMin.getOptional("visMagMin")

        /**
         * The angular distance, in degrees, in the sensor-x direction from scan center defined by
         * the central vector. The specification of xAngle and yAngle defines a rectangle of width
         * 2*xAngle and height 2*yAngle centered about the central vector.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun xAngle(): Optional<Double> = xAngle.getOptional("xAngle")

        /**
         * The angular distance, in degrees, in the sensor-y direction from scan center defined by
         * the central vector. The specification of xAngle and yAngle defines a rectangle of width
         * 2*xAngle and height 2*yAngle centered about the central vector.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun yAngle(): Optional<Double> = yAngle.getOptional("yAngle")

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
         * Returns the raw JSON value of [alt].
         *
         * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

        /**
         * Returns the raw JSON value of [argOfPerigee].
         *
         * Unlike [argOfPerigee], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("argOfPerigee")
        @ExcludeMissing
        fun _argOfPerigee(): JsonField<Double> = argOfPerigee

        /**
         * Returns the raw JSON value of [az].
         *
         * Unlike [az], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("az") @ExcludeMissing fun _az(): JsonField<Double> = az

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
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<String> = customer

        /**
         * Returns the raw JSON value of [dec].
         *
         * Unlike [dec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dec") @ExcludeMissing fun _dec(): JsonField<Double> = dec

        /**
         * Returns the raw JSON value of [duration].
         *
         * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Int> = duration

        /**
         * Returns the raw JSON value of [dwellId].
         *
         * Unlike [dwellId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dwellId") @ExcludeMissing fun _dwellId(): JsonField<String> = dwellId

        /**
         * Returns the raw JSON value of [eccentricity].
         *
         * Unlike [eccentricity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eccentricity")
        @ExcludeMissing
        fun _eccentricity(): JsonField<Double> = eccentricity

        /**
         * Returns the raw JSON value of [el].
         *
         * Unlike [el], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("el") @ExcludeMissing fun _el(): JsonField<Double> = el

        /**
         * Returns the raw JSON value of [elset].
         *
         * Unlike [elset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elset") @ExcludeMissing fun _elset(): JsonField<Elset> = elset

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endTime") @ExcludeMissing fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [epoch].
         *
         * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<OffsetDateTime> = epoch

        /**
         * Returns the raw JSON value of [esId].
         *
         * Unlike [esId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("esId") @ExcludeMissing fun _esId(): JsonField<String> = esId

        /**
         * Returns the raw JSON value of [extentAz].
         *
         * Unlike [extentAz], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extentAz") @ExcludeMissing fun _extentAz(): JsonField<Double> = extentAz

        /**
         * Returns the raw JSON value of [extentEl].
         *
         * Unlike [extentEl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extentEl") @ExcludeMissing fun _extentEl(): JsonField<Double> = extentEl

        /**
         * Returns the raw JSON value of [extentRange].
         *
         * Unlike [extentRange], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("extentRange")
        @ExcludeMissing
        fun _extentRange(): JsonField<Double> = extentRange

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [frameRate].
         *
         * Unlike [frameRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("frameRate") @ExcludeMissing fun _frameRate(): JsonField<Double> = frameRate

        /**
         * Returns the raw JSON value of [freq].
         *
         * Unlike [freq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freq") @ExcludeMissing fun _freq(): JsonField<Double> = freq

        /**
         * Returns the raw JSON value of [freqMax].
         *
         * Unlike [freqMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freqMax") @ExcludeMissing fun _freqMax(): JsonField<Double> = freqMax

        /**
         * Returns the raw JSON value of [freqMin].
         *
         * Unlike [freqMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freqMin") @ExcludeMissing fun _freqMin(): JsonField<Double> = freqMin

        /**
         * Returns the raw JSON value of [idElset].
         *
         * Unlike [idElset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idElset") @ExcludeMissing fun _idElset(): JsonField<String> = idElset

        /**
         * Returns the raw JSON value of [idManifold].
         *
         * Unlike [idManifold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idManifold")
        @ExcludeMissing
        fun _idManifold(): JsonField<String> = idManifold

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [idParentReq].
         *
         * Unlike [idParentReq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idParentReq")
        @ExcludeMissing
        fun _idParentReq(): JsonField<String> = idParentReq

        /**
         * Returns the raw JSON value of [idPlan].
         *
         * Unlike [idPlan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idPlan") @ExcludeMissing fun _idPlan(): JsonField<String> = idPlan

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

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
         * Returns the raw JSON value of [inclination].
         *
         * Unlike [inclination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("inclination")
        @ExcludeMissing
        fun _inclination(): JsonField<Double> = inclination

        /**
         * Returns the raw JSON value of [integrationTime].
         *
         * Unlike [integrationTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integrationTime")
        @ExcludeMissing
        fun _integrationTime(): JsonField<Double> = integrationTime

        /**
         * Returns the raw JSON value of [iron].
         *
         * Unlike [iron], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iron") @ExcludeMissing fun _iron(): JsonField<Int> = iron

        /**
         * Returns the raw JSON value of [irradiance].
         *
         * Unlike [irradiance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("irradiance")
        @ExcludeMissing
        fun _irradiance(): JsonField<Double> = irradiance

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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
         * Returns the raw JSON value of [msgType].
         *
         * Unlike [msgType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgType") @ExcludeMissing fun _msgType(): JsonField<String> = msgType

        /**
         * Returns the raw JSON value of [notes].
         *
         * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

        /**
         * Returns the raw JSON value of [numFrames].
         *
         * Unlike [numFrames], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numFrames") @ExcludeMissing fun _numFrames(): JsonField<Int> = numFrames

        /**
         * Returns the raw JSON value of [numObs].
         *
         * Unlike [numObs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numObs") @ExcludeMissing fun _numObs(): JsonField<Int> = numObs

        /**
         * Returns the raw JSON value of [numTracks].
         *
         * Unlike [numTracks], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numTracks") @ExcludeMissing fun _numTracks(): JsonField<Int> = numTracks

        /**
         * Returns the raw JSON value of [obType].
         *
         * Unlike [obType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obType") @ExcludeMissing fun _obType(): JsonField<String> = obType

        /**
         * Returns the raw JSON value of [orbitRegime].
         *
         * Unlike [orbitRegime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orbitRegime")
        @ExcludeMissing
        fun _orbitRegime(): JsonField<String> = orbitRegime

        /**
         * Returns the raw JSON value of [orientAngle].
         *
         * Unlike [orientAngle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orientAngle")
        @ExcludeMissing
        fun _orientAngle(): JsonField<Double> = orientAngle

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
         * Returns the raw JSON value of [planIndex].
         *
         * Unlike [planIndex], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planIndex") @ExcludeMissing fun _planIndex(): JsonField<Int> = planIndex

        /**
         * Returns the raw JSON value of [polarization].
         *
         * Unlike [polarization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("polarization")
        @ExcludeMissing
        fun _polarization(): JsonField<String> = polarization

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

        /**
         * Returns the raw JSON value of [ra].
         *
         * Unlike [ra], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ra") @ExcludeMissing fun _ra(): JsonField<Double> = ra

        /**
         * Returns the raw JSON value of [raan].
         *
         * Unlike [raan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raan") @ExcludeMissing fun _raan(): JsonField<Double> = raan

        /**
         * Returns the raw JSON value of [range].
         *
         * Unlike [range], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("range") @ExcludeMissing fun _range(): JsonField<Double> = range

        /**
         * Returns the raw JSON value of [rcs].
         *
         * Unlike [rcs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rcs") @ExcludeMissing fun _rcs(): JsonField<Double> = rcs

        /**
         * Returns the raw JSON value of [rcsMax].
         *
         * Unlike [rcsMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rcsMax") @ExcludeMissing fun _rcsMax(): JsonField<Double> = rcsMax

        /**
         * Returns the raw JSON value of [rcsMin].
         *
         * Unlike [rcsMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rcsMin") @ExcludeMissing fun _rcsMin(): JsonField<Double> = rcsMin

        /**
         * Returns the raw JSON value of [reflectance].
         *
         * Unlike [reflectance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reflectance")
        @ExcludeMissing
        fun _reflectance(): JsonField<Double> = reflectance

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [scenario].
         *
         * Unlike [scenario], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scenario") @ExcludeMissing fun _scenario(): JsonField<String> = scenario

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
         * Returns the raw JSON value of [spectralModel].
         *
         * Unlike [spectralModel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("spectralModel")
        @ExcludeMissing
        fun _spectralModel(): JsonField<String> = spectralModel

        /**
         * Returns the raw JSON value of [srchInc].
         *
         * Unlike [srchInc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("srchInc") @ExcludeMissing fun _srchInc(): JsonField<Double> = srchInc

        /**
         * Returns the raw JSON value of [srchPattern].
         *
         * Unlike [srchPattern], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("srchPattern")
        @ExcludeMissing
        fun _srchPattern(): JsonField<String> = srchPattern

        /**
         * Returns the raw JSON value of [stateVector].
         *
         * Unlike [stateVector], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stateVector")
        @ExcludeMissing
        fun _stateVector(): JsonField<StateVector> = stateVector

        /**
         * Returns the raw JSON value of [stopAlt].
         *
         * Unlike [stopAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stopAlt") @ExcludeMissing fun _stopAlt(): JsonField<Double> = stopAlt

        /**
         * Returns the raw JSON value of [stopLat].
         *
         * Unlike [stopLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stopLat") @ExcludeMissing fun _stopLat(): JsonField<Double> = stopLat

        /**
         * Returns the raw JSON value of [stopLon].
         *
         * Unlike [stopLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stopLon") @ExcludeMissing fun _stopLon(): JsonField<Double> = stopLon

        /**
         * Returns the raw JSON value of [suffix].
         *
         * Unlike [suffix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("suffix") @ExcludeMissing fun _suffix(): JsonField<String> = suffix

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [targetSize].
         *
         * Unlike [targetSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("targetSize")
        @ExcludeMissing
        fun _targetSize(): JsonField<Double> = targetSize

        /**
         * Returns the raw JSON value of [taskCategory].
         *
         * Unlike [taskCategory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("taskCategory")
        @ExcludeMissing
        fun _taskCategory(): JsonField<Int> = taskCategory

        /**
         * Returns the raw JSON value of [taskGroup].
         *
         * Unlike [taskGroup], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskGroup") @ExcludeMissing fun _taskGroup(): JsonField<String> = taskGroup

        /**
         * Returns the raw JSON value of [taskId].
         *
         * Unlike [taskId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskId") @ExcludeMissing fun _taskId(): JsonField<String> = taskId

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
         * Returns the raw JSON value of [trueAnomoly].
         *
         * Unlike [trueAnomoly], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trueAnomoly")
        @ExcludeMissing
        fun _trueAnomoly(): JsonField<Double> = trueAnomoly

        /**
         * Returns the raw JSON value of [uctFollowUp].
         *
         * Unlike [uctFollowUp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uctFollowUp")
        @ExcludeMissing
        fun _uctFollowUp(): JsonField<Boolean> = uctFollowUp

        /**
         * Returns the raw JSON value of [visMag].
         *
         * Unlike [visMag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visMag") @ExcludeMissing fun _visMag(): JsonField<Double> = visMag

        /**
         * Returns the raw JSON value of [visMagMax].
         *
         * Unlike [visMagMax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visMagMax") @ExcludeMissing fun _visMagMax(): JsonField<Double> = visMagMax

        /**
         * Returns the raw JSON value of [visMagMin].
         *
         * Unlike [visMagMin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("visMagMin") @ExcludeMissing fun _visMagMin(): JsonField<Double> = visMagMin

        /**
         * Returns the raw JSON value of [xAngle].
         *
         * Unlike [xAngle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("xAngle") @ExcludeMissing fun _xAngle(): JsonField<Double> = xAngle

        /**
         * Returns the raw JSON value of [yAngle].
         *
         * Unlike [yAngle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("yAngle") @ExcludeMissing fun _yAngle(): JsonField<Double> = yAngle

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
             * .type()
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
            private var type: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var alt: JsonField<Double> = JsonMissing.of()
            private var argOfPerigee: JsonField<Double> = JsonMissing.of()
            private var az: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var customer: JsonField<String> = JsonMissing.of()
            private var dec: JsonField<Double> = JsonMissing.of()
            private var duration: JsonField<Int> = JsonMissing.of()
            private var dwellId: JsonField<String> = JsonMissing.of()
            private var eccentricity: JsonField<Double> = JsonMissing.of()
            private var el: JsonField<Double> = JsonMissing.of()
            private var elset: JsonField<Elset> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var epoch: JsonField<OffsetDateTime> = JsonMissing.of()
            private var esId: JsonField<String> = JsonMissing.of()
            private var extentAz: JsonField<Double> = JsonMissing.of()
            private var extentEl: JsonField<Double> = JsonMissing.of()
            private var extentRange: JsonField<Double> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var frameRate: JsonField<Double> = JsonMissing.of()
            private var freq: JsonField<Double> = JsonMissing.of()
            private var freqMax: JsonField<Double> = JsonMissing.of()
            private var freqMin: JsonField<Double> = JsonMissing.of()
            private var idElset: JsonField<String> = JsonMissing.of()
            private var idManifold: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idParentReq: JsonField<String> = JsonMissing.of()
            private var idPlan: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var idStateVector: JsonField<String> = JsonMissing.of()
            private var inclination: JsonField<Double> = JsonMissing.of()
            private var integrationTime: JsonField<Double> = JsonMissing.of()
            private var iron: JsonField<Int> = JsonMissing.of()
            private var irradiance: JsonField<Double> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var lon: JsonField<Double> = JsonMissing.of()
            private var msgCreateDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var msgType: JsonField<String> = JsonMissing.of()
            private var notes: JsonField<String> = JsonMissing.of()
            private var numFrames: JsonField<Int> = JsonMissing.of()
            private var numObs: JsonField<Int> = JsonMissing.of()
            private var numTracks: JsonField<Int> = JsonMissing.of()
            private var obType: JsonField<String> = JsonMissing.of()
            private var orbitRegime: JsonField<String> = JsonMissing.of()
            private var orientAngle: JsonField<Double> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var planIndex: JsonField<Int> = JsonMissing.of()
            private var polarization: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<String> = JsonMissing.of()
            private var ra: JsonField<Double> = JsonMissing.of()
            private var raan: JsonField<Double> = JsonMissing.of()
            private var range: JsonField<Double> = JsonMissing.of()
            private var rcs: JsonField<Double> = JsonMissing.of()
            private var rcsMax: JsonField<Double> = JsonMissing.of()
            private var rcsMin: JsonField<Double> = JsonMissing.of()
            private var reflectance: JsonField<Double> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var scenario: JsonField<String> = JsonMissing.of()
            private var semiMajorAxis: JsonField<Double> = JsonMissing.of()
            private var spectralModel: JsonField<String> = JsonMissing.of()
            private var srchInc: JsonField<Double> = JsonMissing.of()
            private var srchPattern: JsonField<String> = JsonMissing.of()
            private var stateVector: JsonField<StateVector> = JsonMissing.of()
            private var stopAlt: JsonField<Double> = JsonMissing.of()
            private var stopLat: JsonField<Double> = JsonMissing.of()
            private var stopLon: JsonField<Double> = JsonMissing.of()
            private var suffix: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var targetSize: JsonField<Double> = JsonMissing.of()
            private var taskCategory: JsonField<Int> = JsonMissing.of()
            private var taskGroup: JsonField<String> = JsonMissing.of()
            private var taskId: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var trueAnomoly: JsonField<Double> = JsonMissing.of()
            private var uctFollowUp: JsonField<Boolean> = JsonMissing.of()
            private var visMag: JsonField<Double> = JsonMissing.of()
            private var visMagMax: JsonField<Double> = JsonMissing.of()
            private var visMagMin: JsonField<Double> = JsonMissing.of()
            private var xAngle: JsonField<Double> = JsonMissing.of()
            private var yAngle: JsonField<Double> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                startTime = body.startTime
                type = body.type
                id = body.id
                alt = body.alt
                argOfPerigee = body.argOfPerigee
                az = body.az
                createdAt = body.createdAt
                createdBy = body.createdBy
                customer = body.customer
                dec = body.dec
                duration = body.duration
                dwellId = body.dwellId
                eccentricity = body.eccentricity
                el = body.el
                elset = body.elset
                endTime = body.endTime
                epoch = body.epoch
                esId = body.esId
                extentAz = body.extentAz
                extentEl = body.extentEl
                extentRange = body.extentRange
                externalId = body.externalId
                frameRate = body.frameRate
                freq = body.freq
                freqMax = body.freqMax
                freqMin = body.freqMin
                idElset = body.idElset
                idManifold = body.idManifold
                idOnOrbit = body.idOnOrbit
                idParentReq = body.idParentReq
                idPlan = body.idPlan
                idSensor = body.idSensor
                idStateVector = body.idStateVector
                inclination = body.inclination
                integrationTime = body.integrationTime
                iron = body.iron
                irradiance = body.irradiance
                lat = body.lat
                lon = body.lon
                msgCreateDate = body.msgCreateDate
                msgType = body.msgType
                notes = body.notes
                numFrames = body.numFrames
                numObs = body.numObs
                numTracks = body.numTracks
                obType = body.obType
                orbitRegime = body.orbitRegime
                orientAngle = body.orientAngle
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                origSensorId = body.origSensorId
                planIndex = body.planIndex
                polarization = body.polarization
                priority = body.priority
                ra = body.ra
                raan = body.raan
                range = body.range
                rcs = body.rcs
                rcsMax = body.rcsMax
                rcsMin = body.rcsMin
                reflectance = body.reflectance
                satNo = body.satNo
                scenario = body.scenario
                semiMajorAxis = body.semiMajorAxis
                spectralModel = body.spectralModel
                srchInc = body.srchInc
                srchPattern = body.srchPattern
                stateVector = body.stateVector
                stopAlt = body.stopAlt
                stopLat = body.stopLat
                stopLon = body.stopLon
                suffix = body.suffix
                tags = body.tags.map { it.toMutableList() }
                targetSize = body.targetSize
                taskCategory = body.taskCategory
                taskGroup = body.taskGroup
                taskId = body.taskId
                transactionId = body.transactionId
                trueAnomoly = body.trueAnomoly
                uctFollowUp = body.uctFollowUp
                visMag = body.visMag
                visMagMax = body.visMagMax
                visMagMin = body.visMagMin
                xAngle = body.xAngle
                yAngle = body.yAngle
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
             * The start time or earliest time of the collect or contact request window, in ISO 8601
             * UTC format.
             */
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

            /**
             * The type of this collect or contact request (DIRECTED SEARCH, DWELL, OBJECT, POL,
             * RATE TRACK, SEARCH, SOI, STARE, TTC, VOLUME SEARCH, etc.).
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Height above WGS-84 ellipsoid (HAE), in kilometers. If an accompanying stopAlt is
             * provided, then alt value can be assumed to be the starting altitude of a volume
             * definition.
             */
            fun alt(alt: Double) = alt(JsonField.of(alt))

            /**
             * Sets [Builder.alt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

            /**
             * The argument of perigee is the angle, in degrees, formed between the perigee and the
             * ascending node.
             */
            fun argOfPerigee(argOfPerigee: Double) = argOfPerigee(JsonField.of(argOfPerigee))

            /**
             * Sets [Builder.argOfPerigee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.argOfPerigee] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun argOfPerigee(argOfPerigee: JsonField<Double>) = apply {
                this.argOfPerigee = argOfPerigee
            }

            /**
             * The expected or directed azimuth angle, in degrees, for search or target acquisition.
             */
            fun az(az: Double) = az(JsonField.of(az))

            /**
             * Sets [Builder.az] to an arbitrary JSON value.
             *
             * You should usually call [Builder.az] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun az(az: JsonField<Double>) = apply { this.az = az }

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

            /** The customer for this request. */
            fun customer(customer: String) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<String>) = apply { this.customer = customer }

            /**
             * The expected or directed declination angle, in degrees, for search or target
             * acquisition.
             */
            fun dec(dec: Double) = dec(JsonField.of(dec))

            /**
             * Sets [Builder.dec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dec] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun dec(dec: JsonField<Double>) = apply { this.dec = dec }

            /**
             * The duration of the collect request, in seconds. If both duration and endTime are
             * provided, the endTime is assumed to take precedence.
             */
            fun duration(duration: Int) = duration(JsonField.of(duration))

            /**
             * Sets [Builder.duration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duration] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun duration(duration: JsonField<Int>) = apply { this.duration = duration }

            /**
             * The dwell ID associated with this request. A dwell ID is dwell point specific and a
             * DWELL request consist of many dwell point requests.
             */
            fun dwellId(dwellId: String) = dwellId(JsonField.of(dwellId))

            /**
             * Sets [Builder.dwellId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dwellId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dwellId(dwellId: JsonField<String>) = apply { this.dwellId = dwellId }

            /**
             * The orbital eccentricity of an astronomical object is a parameter that determines the
             * amount by which its orbit around another body deviates from a perfect circle.
             */
            fun eccentricity(eccentricity: Double) = eccentricity(JsonField.of(eccentricity))

            /**
             * Sets [Builder.eccentricity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eccentricity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eccentricity(eccentricity: JsonField<Double>) = apply {
                this.eccentricity = eccentricity
            }

            /**
             * The expected or directed elevation angle, in degrees, for search or target
             * acquisition.
             */
            fun el(el: Double) = el(JsonField.of(el))

            /**
             * Sets [Builder.el] to an arbitrary JSON value.
             *
             * You should usually call [Builder.el] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun el(el: JsonField<Double>) = apply { this.el = el }

            /**
             * An element set is a collection of Keplerian orbital elements describing an orbit of a
             * particular satellite. The data is used along with an orbit propagator in order to
             * predict the motion of a satellite. The element set, or elset for short, consists of
             * identification data, the classical elements and drag parameters.
             */
            fun elset(elset: Elset) = elset(JsonField.of(elset))

            /**
             * Sets [Builder.elset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elset] with a well-typed [Elset] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun elset(elset: JsonField<Elset>) = apply { this.elset = elset }

            /**
             * The end time of the collect or contact request window, in ISO 8601 UTC format. If no
             * endTime or duration is provided it is assumed the request is either ongoing or that
             * the request is for a specified number of tracks (numTracks). If both duration and
             * endTime are provided, the endTime is assumed to take precedence.
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

            /** Epoch time, in ISO 8601 UTC format, of the orbital elements. */
            fun epoch(epoch: OffsetDateTime) = epoch(JsonField.of(epoch))

            /**
             * Sets [Builder.epoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.epoch] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun epoch(epoch: JsonField<OffsetDateTime>) = apply { this.epoch = epoch }

            /** ID of the UDL Ephemeris Set of the object associated with this request. */
            fun esId(esId: String) = esId(JsonField.of(esId))

            /**
             * Sets [Builder.esId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.esId] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun esId(esId: JsonField<String>) = apply { this.esId = esId }

            /**
             * The extent of the azimuth angle, in degrees, from center azimuth to define a spatial
             * volume.
             */
            fun extentAz(extentAz: Double) = extentAz(JsonField.of(extentAz))

            /**
             * Sets [Builder.extentAz] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extentAz] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extentAz(extentAz: JsonField<Double>) = apply { this.extentAz = extentAz }

            /**
             * The extent of the elevation angle, in degrees, from center elevation to define a
             * spatial volume.
             */
            fun extentEl(extentEl: Double) = extentEl(JsonField.of(extentEl))

            /**
             * Sets [Builder.extentEl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extentEl] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extentEl(extentEl: JsonField<Double>) = apply { this.extentEl = extentEl }

            /** The extent of the range, in km, from center range to define a spatial volume. */
            fun extentRange(extentRange: Double) = extentRange(JsonField.of(extentRange))

            /**
             * Sets [Builder.extentRange] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extentRange] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extentRange(extentRange: JsonField<Double>) = apply {
                this.extentRange = extentRange
            }

            /**
             * Optional ID from external systems. This field has no meaning within UDL and is
             * provided as a convenience for systems that require tracking of an internal system
             * generated ID.
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** For optical sensors, the frame rate of the camera, in Hz. */
            fun frameRate(frameRate: Double) = frameRate(JsonField.of(frameRate))

            /**
             * Sets [Builder.frameRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.frameRate] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun frameRate(frameRate: JsonField<Double>) = apply { this.frameRate = frameRate }

            /** The estimated or expected emission frequency of the target, in MHz. */
            fun freq(freq: Double) = freq(JsonField.of(freq))

            /**
             * Sets [Builder.freq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freq] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun freq(freq: JsonField<Double>) = apply { this.freq = freq }

            /** The maximum frequency of interest, in MHz. */
            fun freqMax(freqMax: Double) = freqMax(JsonField.of(freqMax))

            /**
             * Sets [Builder.freqMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freqMax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freqMax(freqMax: JsonField<Double>) = apply { this.freqMax = freqMax }

            /**
             * The minimum frequency of interest, in MHz. If only minimum frequency is provided it
             * is assumed to be minimum reportable frequency.
             */
            fun freqMin(freqMin: Double) = freqMin(JsonField.of(freqMin))

            /**
             * Sets [Builder.freqMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freqMin] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freqMin(freqMin: JsonField<Double>) = apply { this.freqMin = freqMin }

            /** ID of the UDL Elset of the object associated with this request. */
            fun idElset(idElset: String) = idElset(JsonField.of(idElset))

            /**
             * Sets [Builder.idElset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idElset] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idElset(idElset: JsonField<String>) = apply { this.idElset = idElset }

            /**
             * ID of the UDL Manifold Elset of the object associated with this request. A Manifold
             * Elset provides theoretical Keplerian orbital elements belonging to an object of
             * interest's manifold describing a possible/theoretical orbit for an object of interest
             * for tasking purposes.
             */
            fun idManifold(idManifold: String) = idManifold(JsonField.of(idManifold))

            /**
             * Sets [Builder.idManifold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idManifold] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idManifold(idManifold: JsonField<String>) = apply { this.idManifold = idManifold }

            /** Unique identifier of the target on-orbit object for this request. */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

            /**
             * The unique ID of the collect request record from which this request originated. This
             * may be used for cases of sensor-to-sensor tasking, such as tip/cue operations.
             */
            fun idParentReq(idParentReq: String) = idParentReq(JsonField.of(idParentReq))

            /**
             * Sets [Builder.idParentReq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idParentReq] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idParentReq(idParentReq: JsonField<String>) = apply {
                this.idParentReq = idParentReq
            }

            /**
             * Unique identifier of the parent plan or schedule associated with this request. If
             * null, this request is assumed not associated with a plan or schedule.
             */
            fun idPlan(idPlan: String) = idPlan(JsonField.of(idPlan))

            /**
             * Sets [Builder.idPlan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idPlan] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idPlan(idPlan: JsonField<String>) = apply { this.idPlan = idPlan }

            /**
             * Unique identifier of the requested/scheduled/planned sensor associated with this
             * request. If both idSensor and origSensorId are null then the request is assumed to be
             * a general request for observations or contact on an object, if specified, or an
             * area/volume. In this case, the requester may specify a desired obType.
             */
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
             * ID of the UDL State Vector of the object or central vector associated with this
             * request.
             */
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
             * The angle, in degrees, between the equator and the orbit plane when looking from the
             * center of the Earth. Inclination ranges from 0-180 degrees, with 0-90 representing
             * posigrade orbits and 90-180 representing retrograde orbits.
             */
            fun inclination(inclination: Double) = inclination(JsonField.of(inclination))

            /**
             * Sets [Builder.inclination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inclination] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inclination(inclination: JsonField<Double>) = apply {
                this.inclination = inclination
            }

            /** For optical sensors, the integration time per camera frame, in milliseconds. */
            fun integrationTime(integrationTime: Double) =
                integrationTime(JsonField.of(integrationTime))

            /**
             * Sets [Builder.integrationTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun integrationTime(integrationTime: JsonField<Double>) = apply {
                this.integrationTime = integrationTime
            }

            /**
             * Inter-Range Operations Number. Four-digit identifier used to schedule and identify
             * AFSCN contact support for booster, launch, and on-orbit operations.
             */
            fun iron(iron: Int) = iron(JsonField.of(iron))

            /**
             * Sets [Builder.iron] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iron] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iron(iron: JsonField<Int>) = apply { this.iron = iron }

            /** The target object irradiance value. */
            fun irradiance(irradiance: Double) = irradiance(JsonField.of(irradiance))

            /**
             * Sets [Builder.irradiance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.irradiance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun irradiance(irradiance: JsonField<Double>) = apply { this.irradiance = irradiance }

            /**
             * WGS-84 latitude, in degrees. -90 to 90 degrees (negative values south of equator). If
             * an accompanying stopLat is provided, then the lat value can be assumed to be the
             * starting latitude of a volume definition.
             */
            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            /**
             * WGS-84 longitude, in degrees. -180 to 180 degrees (negative values west of Prime
             * Meridian). If an accompanying stopLon is provided, then lon value can be assumed to
             * be the starting longitude of a volume definition.
             */
            fun lon(lon: Double) = lon(JsonField.of(lon))

            /**
             * Sets [Builder.lon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

            /**
             * The timestamp of the external message from which this request originated, if
             * applicable, in ISO8601 UTC format with millisecond precision.
             */
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

            /** The type of external message from which this request originated. */
            fun msgType(msgType: String) = msgType(JsonField.of(msgType))

            /**
             * Sets [Builder.msgType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgType(msgType: JsonField<String>) = apply { this.msgType = msgType }

            /** Notes or comments associated with this request. */
            fun notes(notes: String) = notes(JsonField.of(notes))

            /**
             * Sets [Builder.notes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

            /**
             * For optical sensors, the requested number of frames to capture at each sensor step.
             */
            fun numFrames(numFrames: Int) = numFrames(JsonField.of(numFrames))

            /**
             * Sets [Builder.numFrames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numFrames] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numFrames(numFrames: JsonField<Int>) = apply { this.numFrames = numFrames }

            /** The number of requested observations on the target. */
            fun numObs(numObs: Int) = numObs(JsonField.of(numObs))

            /**
             * Sets [Builder.numObs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numObs] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun numObs(numObs: JsonField<Int>) = apply { this.numObs = numObs }

            /**
             * The number of requested tracks on the target. If numTracks is not provided it is
             * assumed to indicate all possible observations every pass over the request duration or
             * within the request start/end window.
             */
            fun numTracks(numTracks: Int) = numTracks(JsonField.of(numTracks))

            /**
             * Sets [Builder.numTracks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numTracks] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numTracks(numTracks: JsonField<Int>) = apply { this.numTracks = numTracks }

            /**
             * Optional type of observation (EO, IR, RADAR, RF-ACTIVE, RF-PASSIVE, OTHER) requested.
             * This field may correspond to a request of a specific sensor, or to a general non
             * sensor specific request.
             */
            fun obType(obType: String) = obType(JsonField.of(obType))

            /**
             * Sets [Builder.obType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obType(obType: JsonField<String>) = apply { this.obType = obType }

            /** The orbit regime of the target (GEO, HEO, LAUNCH, LEO, MEO, OTHER). */
            fun orbitRegime(orbitRegime: String) = orbitRegime(JsonField.of(orbitRegime))

            /**
             * Sets [Builder.orbitRegime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orbitRegime] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orbitRegime(orbitRegime: JsonField<String>) = apply {
                this.orbitRegime = orbitRegime
            }

            /**
             * The magnitude of rotation, in degrees, between the xAngle direction and locally
             * defined equinoctial plane. A positive value indicates clockwise rotation about the
             * sensor boresight vector.
             */
            fun orientAngle(orientAngle: Double) = orientAngle(JsonField.of(orientAngle))

            /**
             * Sets [Builder.orientAngle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orientAngle] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orientAngle(orientAngle: JsonField<Double>) = apply {
                this.orientAngle = orientAngle
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
             * request. This may be an internal identifier and not necessarily map to a valid
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
             * Optional identifier provided by the source to indicate the sensor identifier
             * requested/scheduled/planned for this request. This may be an internal identifier and
             * not necessarily a valid sensor ID. If both idSensor and origSensorId are null then
             * the request is assumed to be a general request for observations or contact on an
             * object, if specified, or an area/volume. In this case, the requester may specify a
             * desired obType.
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

            /** Index number (integer) for records within a collection plan or schedule. */
            fun planIndex(planIndex: Int) = planIndex(JsonField.of(planIndex))

            /**
             * Sets [Builder.planIndex] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planIndex] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planIndex(planIndex: JsonField<Int>) = apply { this.planIndex = planIndex }

            /** The RF polarization (H, LHC, RHC, V). */
            fun polarization(polarization: String) = polarization(JsonField.of(polarization))

            /**
             * Sets [Builder.polarization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polarization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun polarization(polarization: JsonField<String>) = apply {
                this.polarization = polarization
            }

            /**
             * The priority of the collect request (EMERGENCY, FLASH, IMMEDIATE, PRIORITY, ROUTINE).
             */
            fun priority(priority: String) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<String>) = apply { this.priority = priority }

            /**
             * The expected or directed right ascension angle, in degrees, for search or target
             * acquisition.
             */
            fun ra(ra: Double) = ra(JsonField.of(ra))

            /**
             * Sets [Builder.ra] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ra] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ra(ra: JsonField<Double>) = apply { this.ra = ra }

            /**
             * Right ascension of the ascending node, or RAAN is the angle as measured in degrees
             * eastwards (or, as seen from the north, counterclockwise) from the First Point of
             * Aries to the ascending node.
             */
            fun raan(raan: Double) = raan(JsonField.of(raan))

            /**
             * Sets [Builder.raan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raan] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun raan(raan: JsonField<Double>) = apply { this.raan = raan }

            /** The expected acquisition range or defined center range, in km. */
            fun range(range: Double) = range(JsonField.of(range))

            /**
             * Sets [Builder.range] to an arbitrary JSON value.
             *
             * You should usually call [Builder.range] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun range(range: JsonField<Double>) = apply { this.range = range }

            /** The Radar Cross-Section of the target, in m^2. */
            fun rcs(rcs: Double) = rcs(JsonField.of(rcs))

            /**
             * Sets [Builder.rcs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rcs] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rcs(rcs: JsonField<Double>) = apply { this.rcs = rcs }

            /** The maximum Radar Cross-Section of the target, in m^2. */
            fun rcsMax(rcsMax: Double) = rcsMax(JsonField.of(rcsMax))

            /**
             * Sets [Builder.rcsMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rcsMax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rcsMax(rcsMax: JsonField<Double>) = apply { this.rcsMax = rcsMax }

            /**
             * The minimum Radar Cross-Section of the target, in m^2. If only minimum RCS is
             * provided it is assumed to be minimum reportable RCS.
             */
            fun rcsMin(rcsMin: Double) = rcsMin(JsonField.of(rcsMin))

            /**
             * Sets [Builder.rcsMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rcsMin] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rcsMin(rcsMin: JsonField<Double>) = apply { this.rcsMin = rcsMin }

            /** The fraction of solar energy reflected from target. */
            fun reflectance(reflectance: Double) = reflectance(JsonField.of(reflectance))

            /**
             * Sets [Builder.reflectance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reflectance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reflectance(reflectance: JsonField<Double>) = apply {
                this.reflectance = reflectance
            }

            /** Satellite/catalog number of the target on-orbit object for this request. */
            fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

            /**
             * Sets [Builder.satNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

            /**
             * Pre-coordinated code, direction, or configuration to be executed by the sensor or
             * site for this collect or contact.
             */
            fun scenario(scenario: String) = scenario(JsonField.of(scenario))

            /**
             * Sets [Builder.scenario] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scenario] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scenario(scenario: JsonField<String>) = apply { this.scenario = scenario }

            /**
             * The average of the periapsis and apoapsis distances, in kilometers. For circular
             * orbits, the semimajor axis is the distance between the centers of the bodies.
             */
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

            /** The spectral model used for the irradiance calculation. */
            fun spectralModel(spectralModel: String) = spectralModel(JsonField.of(spectralModel))

            /**
             * Sets [Builder.spectralModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spectralModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun spectralModel(spectralModel: JsonField<String>) = apply {
                this.spectralModel = spectralModel
            }

            /** The maximum inclination, in degrees, to be used in search operations. */
            fun srchInc(srchInc: Double) = srchInc(JsonField.of(srchInc))

            /**
             * Sets [Builder.srchInc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.srchInc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun srchInc(srchInc: JsonField<Double>) = apply { this.srchInc = srchInc }

            /**
             * The search pattern to be executed for this request (e.g. PICKET-FENCE, SCAN, etc.).
             */
            fun srchPattern(srchPattern: String) = srchPattern(JsonField.of(srchPattern))

            /**
             * Sets [Builder.srchPattern] to an arbitrary JSON value.
             *
             * You should usually call [Builder.srchPattern] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun srchPattern(srchPattern: JsonField<String>) = apply {
                this.srchPattern = srchPattern
            }

            /**
             * This service provides operations for querying and manipulation of state vectors for
             * OnOrbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
             * that, together with their time (epoch) (t), uniquely determine the trajectory of the
             * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
             * positions/velocities in UDL, but in some cases data may be in another frame depending
             * on the provider and/or datatype. Please see the 'Discover' tab in the storefront to
             * confirm coordinate frames by data provider.
             */
            fun stateVector(stateVector: StateVector) = stateVector(JsonField.of(stateVector))

            /**
             * Sets [Builder.stateVector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateVector] with a well-typed [StateVector] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateVector(stateVector: JsonField<StateVector>) = apply {
                this.stateVector = stateVector
            }

            /**
             * The stopping HAE WGS-84 height above ellipsoid (HAE), of a volume definition, in
             * kilometers. The stopAlt value is only meaningful if a (starting) alt value is
             * provided.
             */
            fun stopAlt(stopAlt: Double) = stopAlt(JsonField.of(stopAlt))

            /**
             * Sets [Builder.stopAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopAlt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopAlt(stopAlt: JsonField<Double>) = apply { this.stopAlt = stopAlt }

            /**
             * The stopping WGS-84 latitude of a volume definition, in degrees. -90 to 90 degrees
             * (negative values south of equator). The stopLat value is only meaningful if a
             * (starting) lat value is provided.
             */
            fun stopLat(stopLat: Double) = stopLat(JsonField.of(stopLat))

            /**
             * Sets [Builder.stopLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopLat(stopLat: JsonField<Double>) = apply { this.stopLat = stopLat }

            /**
             * The stopping WGS-84 longitude of a volume definition, in degrees. -180 to 180 degrees
             * (negative values west of Prime Meridian). The stopLon value is only meaningful if a
             * (starting) lon value is provided.
             */
            fun stopLon(stopLon: Double) = stopLon(JsonField.of(stopLon))

            /**
             * Sets [Builder.stopLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopLon(stopLon: JsonField<Double>) = apply { this.stopLon = stopLon }

            /**
             * The (SSN) tasking suffix (A-Z) associated with this request. The suffix defines the
             * amount of observational data and the frequency of collection. Note that suffix
             * definitions are sensor type specific.
             */
            fun suffix(suffix: String) = suffix(JsonField.of(suffix))

            /**
             * Sets [Builder.suffix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.suffix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun suffix(suffix: JsonField<String>) = apply { this.suffix = suffix }

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

            /** The minimum object (diameter) size, in meters, to be reported. */
            fun targetSize(targetSize: Double) = targetSize(JsonField.of(targetSize))

            /**
             * Sets [Builder.targetSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetSize] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetSize(targetSize: JsonField<Double>) = apply { this.targetSize = targetSize }

            /**
             * The (SSN) tasking category (1-5) associated with this request. The tasking category
             * defines the priority of gathering and transmitting the requested observational data.
             * Note that category definitions are sensor type specific.
             */
            fun taskCategory(taskCategory: Int) = taskCategory(JsonField.of(taskCategory))

            /**
             * Sets [Builder.taskCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskCategory] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskCategory(taskCategory: JsonField<Int>) = apply {
                this.taskCategory = taskCategory
            }

            /** The tasking group to which the target object is assigned. */
            fun taskGroup(taskGroup: String) = taskGroup(JsonField.of(taskGroup))

            /**
             * Sets [Builder.taskGroup] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskGroup] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskGroup(taskGroup: JsonField<String>) = apply { this.taskGroup = taskGroup }

            /**
             * Task ID associated with this request. A task ID may be associated with a single
             * collect request or may be used to tie together the sub-requests of a full collect,
             * for example a DWELL consisting of many dwell points.
             */
            fun taskId(taskId: String) = taskId(JsonField.of(taskId))

            /**
             * Sets [Builder.taskId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskId(taskId: JsonField<String>) = apply { this.taskId = taskId }

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
             * The true anomaly defines the angular position, in degrees, of the object on it's
             * orbital path as measured from the orbit focal point at epoch. The true anomaly is
             * referenced from perigee.
             */
            fun trueAnomoly(trueAnomoly: Double) = trueAnomoly(JsonField.of(trueAnomoly))

            /**
             * Sets [Builder.trueAnomoly] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trueAnomoly] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trueAnomoly(trueAnomoly: JsonField<Double>) = apply {
                this.trueAnomoly = trueAnomoly
            }

            /** Boolean indicating that this collect request is UCT follow-up. */
            fun uctFollowUp(uctFollowUp: Boolean) = uctFollowUp(JsonField.of(uctFollowUp))

            /**
             * Sets [Builder.uctFollowUp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uctFollowUp] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uctFollowUp(uctFollowUp: JsonField<Boolean>) = apply {
                this.uctFollowUp = uctFollowUp
            }

            /** The estimated or expected visual magnitude of the target, in Magnitudes (M). */
            fun visMag(visMag: Double) = visMag(JsonField.of(visMag))

            /**
             * Sets [Builder.visMag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visMag] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun visMag(visMag: JsonField<Double>) = apply { this.visMag = visMag }

            /**
             * The maximum estimated or expected visual magnitude of the target, in Magnitudes (M).
             */
            fun visMagMax(visMagMax: Double) = visMagMax(JsonField.of(visMagMax))

            /**
             * Sets [Builder.visMagMax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visMagMax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun visMagMax(visMagMax: JsonField<Double>) = apply { this.visMagMax = visMagMax }

            /**
             * The minimum estimated or expected visual magnitude of the target, in Magnitudes (M).
             * If only minimum vismag is provided it is assumed to be minimum reportable vismag.
             */
            fun visMagMin(visMagMin: Double) = visMagMin(JsonField.of(visMagMin))

            /**
             * Sets [Builder.visMagMin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.visMagMin] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun visMagMin(visMagMin: JsonField<Double>) = apply { this.visMagMin = visMagMin }

            /**
             * The angular distance, in degrees, in the sensor-x direction from scan center defined
             * by the central vector. The specification of xAngle and yAngle defines a rectangle of
             * width 2*xAngle and height 2*yAngle centered about the central vector.
             */
            fun xAngle(xAngle: Double) = xAngle(JsonField.of(xAngle))

            /**
             * Sets [Builder.xAngle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.xAngle] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun xAngle(xAngle: JsonField<Double>) = apply { this.xAngle = xAngle }

            /**
             * The angular distance, in degrees, in the sensor-y direction from scan center defined
             * by the central vector. The specification of xAngle and yAngle defines a rectangle of
             * width 2*xAngle and height 2*yAngle centered about the central vector.
             */
            fun yAngle(yAngle: Double) = yAngle(JsonField.of(yAngle))

            /**
             * Sets [Builder.yAngle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.yAngle] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun yAngle(yAngle: JsonField<Double>) = apply { this.yAngle = yAngle }

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
             * .type()
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
                    checkRequired("type", type),
                    id,
                    alt,
                    argOfPerigee,
                    az,
                    createdAt,
                    createdBy,
                    customer,
                    dec,
                    duration,
                    dwellId,
                    eccentricity,
                    el,
                    elset,
                    endTime,
                    epoch,
                    esId,
                    extentAz,
                    extentEl,
                    extentRange,
                    externalId,
                    frameRate,
                    freq,
                    freqMax,
                    freqMin,
                    idElset,
                    idManifold,
                    idOnOrbit,
                    idParentReq,
                    idPlan,
                    idSensor,
                    idStateVector,
                    inclination,
                    integrationTime,
                    iron,
                    irradiance,
                    lat,
                    lon,
                    msgCreateDate,
                    msgType,
                    notes,
                    numFrames,
                    numObs,
                    numTracks,
                    obType,
                    orbitRegime,
                    orientAngle,
                    origin,
                    origNetwork,
                    origObjectId,
                    origSensorId,
                    planIndex,
                    polarization,
                    priority,
                    ra,
                    raan,
                    range,
                    rcs,
                    rcsMax,
                    rcsMin,
                    reflectance,
                    satNo,
                    scenario,
                    semiMajorAxis,
                    spectralModel,
                    srchInc,
                    srchPattern,
                    stateVector,
                    stopAlt,
                    stopLat,
                    stopLon,
                    suffix,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    targetSize,
                    taskCategory,
                    taskGroup,
                    taskId,
                    transactionId,
                    trueAnomoly,
                    uctFollowUp,
                    visMag,
                    visMagMax,
                    visMagMin,
                    xAngle,
                    yAngle,
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
            type()
            id()
            alt()
            argOfPerigee()
            az()
            createdAt()
            createdBy()
            customer()
            dec()
            duration()
            dwellId()
            eccentricity()
            el()
            elset().ifPresent { it.validate() }
            endTime()
            epoch()
            esId()
            extentAz()
            extentEl()
            extentRange()
            externalId()
            frameRate()
            freq()
            freqMax()
            freqMin()
            idElset()
            idManifold()
            idOnOrbit()
            idParentReq()
            idPlan()
            idSensor()
            idStateVector()
            inclination()
            integrationTime()
            iron()
            irradiance()
            lat()
            lon()
            msgCreateDate()
            msgType()
            notes()
            numFrames()
            numObs()
            numTracks()
            obType()
            orbitRegime()
            orientAngle()
            origin()
            origNetwork()
            origObjectId()
            origSensorId()
            planIndex()
            polarization()
            priority()
            ra()
            raan()
            range()
            rcs()
            rcsMax()
            rcsMin()
            reflectance()
            satNo()
            scenario()
            semiMajorAxis()
            spectralModel()
            srchInc()
            srchPattern()
            stateVector().ifPresent { it.validate() }
            stopAlt()
            stopLat()
            stopLon()
            suffix()
            tags()
            targetSize()
            taskCategory()
            taskGroup()
            taskId()
            transactionId()
            trueAnomoly()
            uctFollowUp()
            visMag()
            visMagMax()
            visMagMin()
            xAngle()
            yAngle()
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
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (alt.asKnown().isPresent) 1 else 0) +
                (if (argOfPerigee.asKnown().isPresent) 1 else 0) +
                (if (az.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (customer.asKnown().isPresent) 1 else 0) +
                (if (dec.asKnown().isPresent) 1 else 0) +
                (if (duration.asKnown().isPresent) 1 else 0) +
                (if (dwellId.asKnown().isPresent) 1 else 0) +
                (if (eccentricity.asKnown().isPresent) 1 else 0) +
                (if (el.asKnown().isPresent) 1 else 0) +
                (elset.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endTime.asKnown().isPresent) 1 else 0) +
                (if (epoch.asKnown().isPresent) 1 else 0) +
                (if (esId.asKnown().isPresent) 1 else 0) +
                (if (extentAz.asKnown().isPresent) 1 else 0) +
                (if (extentEl.asKnown().isPresent) 1 else 0) +
                (if (extentRange.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (frameRate.asKnown().isPresent) 1 else 0) +
                (if (freq.asKnown().isPresent) 1 else 0) +
                (if (freqMax.asKnown().isPresent) 1 else 0) +
                (if (freqMin.asKnown().isPresent) 1 else 0) +
                (if (idElset.asKnown().isPresent) 1 else 0) +
                (if (idManifold.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (idParentReq.asKnown().isPresent) 1 else 0) +
                (if (idPlan.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (idStateVector.asKnown().isPresent) 1 else 0) +
                (if (inclination.asKnown().isPresent) 1 else 0) +
                (if (integrationTime.asKnown().isPresent) 1 else 0) +
                (if (iron.asKnown().isPresent) 1 else 0) +
                (if (irradiance.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (msgCreateDate.asKnown().isPresent) 1 else 0) +
                (if (msgType.asKnown().isPresent) 1 else 0) +
                (if (notes.asKnown().isPresent) 1 else 0) +
                (if (numFrames.asKnown().isPresent) 1 else 0) +
                (if (numObs.asKnown().isPresent) 1 else 0) +
                (if (numTracks.asKnown().isPresent) 1 else 0) +
                (if (obType.asKnown().isPresent) 1 else 0) +
                (if (orbitRegime.asKnown().isPresent) 1 else 0) +
                (if (orientAngle.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (if (planIndex.asKnown().isPresent) 1 else 0) +
                (if (polarization.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (ra.asKnown().isPresent) 1 else 0) +
                (if (raan.asKnown().isPresent) 1 else 0) +
                (if (range.asKnown().isPresent) 1 else 0) +
                (if (rcs.asKnown().isPresent) 1 else 0) +
                (if (rcsMax.asKnown().isPresent) 1 else 0) +
                (if (rcsMin.asKnown().isPresent) 1 else 0) +
                (if (reflectance.asKnown().isPresent) 1 else 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (if (scenario.asKnown().isPresent) 1 else 0) +
                (if (semiMajorAxis.asKnown().isPresent) 1 else 0) +
                (if (spectralModel.asKnown().isPresent) 1 else 0) +
                (if (srchInc.asKnown().isPresent) 1 else 0) +
                (if (srchPattern.asKnown().isPresent) 1 else 0) +
                (stateVector.asKnown().getOrNull()?.validity() ?: 0) +
                (if (stopAlt.asKnown().isPresent) 1 else 0) +
                (if (stopLat.asKnown().isPresent) 1 else 0) +
                (if (stopLon.asKnown().isPresent) 1 else 0) +
                (if (suffix.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (targetSize.asKnown().isPresent) 1 else 0) +
                (if (taskCategory.asKnown().isPresent) 1 else 0) +
                (if (taskGroup.asKnown().isPresent) 1 else 0) +
                (if (taskId.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0) +
                (if (trueAnomoly.asKnown().isPresent) 1 else 0) +
                (if (uctFollowUp.asKnown().isPresent) 1 else 0) +
                (if (visMag.asKnown().isPresent) 1 else 0) +
                (if (visMagMax.asKnown().isPresent) 1 else 0) +
                (if (visMagMin.asKnown().isPresent) 1 else 0) +
                (if (xAngle.asKnown().isPresent) 1 else 0) +
                (if (yAngle.asKnown().isPresent) 1 else 0)

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

        /**
         * An element set is a collection of Keplerian orbital elements describing an orbit of a
         * particular satellite. The data is used along with an orbit propagator in order to predict
         * the motion of a satellite. The element set, or elset for short, consists of
         * identification data, the classical elements and drag parameters.
         */
        class Elset
        private constructor(
            private val classificationMarking: JsonField<String>,
            private val dataMode: JsonField<DataMode>,
            private val epoch: JsonField<OffsetDateTime>,
            private val source: JsonField<String>,
            private val agom: JsonField<Double>,
            private val algorithm: JsonField<String>,
            private val apogee: JsonField<Double>,
            private val argOfPerigee: JsonField<Double>,
            private val ballisticCoeff: JsonField<Double>,
            private val bStar: JsonField<Double>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val descriptor: JsonField<String>,
            private val eccentricity: JsonField<Double>,
            private val ephemType: JsonField<Long>,
            private val idElset: JsonField<String>,
            private val idOnOrbit: JsonField<String>,
            private val idOrbitDetermination: JsonField<String>,
            private val inclination: JsonField<Double>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val meanAnomaly: JsonField<Double>,
            private val meanMotion: JsonField<Double>,
            private val meanMotionDDot: JsonField<Double>,
            private val meanMotionDot: JsonField<Double>,
            private val origin: JsonField<String>,
            private val origNetwork: JsonField<String>,
            private val origObjectId: JsonField<String>,
            private val perigee: JsonField<Double>,
            private val period: JsonField<Double>,
            private val raan: JsonField<Double>,
            private val rawFileUri: JsonField<String>,
            private val revNo: JsonField<Int>,
            private val satNo: JsonField<Int>,
            private val semiMajorAxis: JsonField<Double>,
            private val sourcedData: JsonField<List<String>>,
            private val sourcedDataTypes: JsonField<List<SourcedDataType>>,
            private val sourceDl: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val transactionId: JsonField<String>,
            private val uct: JsonField<Boolean>,
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
                @JsonProperty("epoch")
                @ExcludeMissing
                epoch: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("agom") @ExcludeMissing agom: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("algorithm")
                @ExcludeMissing
                algorithm: JsonField<String> = JsonMissing.of(),
                @JsonProperty("apogee")
                @ExcludeMissing
                apogee: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("argOfPerigee")
                @ExcludeMissing
                argOfPerigee: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ballisticCoeff")
                @ExcludeMissing
                ballisticCoeff: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("bStar") @ExcludeMissing bStar: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("createdBy")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("descriptor")
                @ExcludeMissing
                descriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("eccentricity")
                @ExcludeMissing
                eccentricity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ephemType")
                @ExcludeMissing
                ephemType: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("idElset")
                @ExcludeMissing
                idElset: JsonField<String> = JsonMissing.of(),
                @JsonProperty("idOnOrbit")
                @ExcludeMissing
                idOnOrbit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("idOrbitDetermination")
                @ExcludeMissing
                idOrbitDetermination: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inclination")
                @ExcludeMissing
                inclination: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("meanAnomaly")
                @ExcludeMissing
                meanAnomaly: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("meanMotion")
                @ExcludeMissing
                meanMotion: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("meanMotionDDot")
                @ExcludeMissing
                meanMotionDDot: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("meanMotionDot")
                @ExcludeMissing
                meanMotionDot: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("origin")
                @ExcludeMissing
                origin: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origNetwork")
                @ExcludeMissing
                origNetwork: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origObjectId")
                @ExcludeMissing
                origObjectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("perigee")
                @ExcludeMissing
                perigee: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("period")
                @ExcludeMissing
                period: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("raan") @ExcludeMissing raan: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("rawFileURI")
                @ExcludeMissing
                rawFileUri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("revNo") @ExcludeMissing revNo: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("semiMajorAxis")
                @ExcludeMissing
                semiMajorAxis: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("sourcedData")
                @ExcludeMissing
                sourcedData: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("sourcedDataTypes")
                @ExcludeMissing
                sourcedDataTypes: JsonField<List<SourcedDataType>> = JsonMissing.of(),
                @JsonProperty("sourceDL")
                @ExcludeMissing
                sourceDl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("transactionId")
                @ExcludeMissing
                transactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
            ) : this(
                classificationMarking,
                dataMode,
                epoch,
                source,
                agom,
                algorithm,
                apogee,
                argOfPerigee,
                ballisticCoeff,
                bStar,
                createdAt,
                createdBy,
                descriptor,
                eccentricity,
                ephemType,
                idElset,
                idOnOrbit,
                idOrbitDetermination,
                inclination,
                line1,
                line2,
                meanAnomaly,
                meanMotion,
                meanMotionDDot,
                meanMotionDot,
                origin,
                origNetwork,
                origObjectId,
                perigee,
                period,
                raan,
                rawFileUri,
                revNo,
                satNo,
                semiMajorAxis,
                sourcedData,
                sourcedDataTypes,
                sourceDl,
                tags,
                transactionId,
                uct,
                mutableMapOf(),
            )

            /**
             * Classification marking of the data in IC/CAPCO Portion-marked format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun classificationMarking(): String =
                classificationMarking.getRequired("classificationMarking")

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
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun dataMode(): DataMode = dataMode.getRequired("dataMode")

            /**
             * Elset epoch time in ISO 8601 UTC format, with microsecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun epoch(): OffsetDateTime = epoch.getRequired("epoch")

            /**
             * Source of the data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun source(): String = source.getRequired("source")

            /**
             * AGOM, expressed in m^2/kg, is the value of the (averaged) object Area times the solar
             * radiation pressure coefficient(Gamma) over the object Mass. Applicable only with
             * ephemType4.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun agom(): Optional<Double> = agom.getOptional("agom")

            /**
             * Optional algorithm used to produce this record.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun algorithm(): Optional<String> = algorithm.getOptional("algorithm")

            /**
             * The orbit point furthest from the center of the earth in kilometers. If not provided,
             * apogee will be computed from the TLE according to the following. Using mu, the
             * standard gravitational parameter for the earth (398600.4418), semi-major axis A =
             * (mu/(n _ 2 _ pi/(24*3600))^2)(1/3). Using semi-major axis A, eccentricity E, apogee =
             * (A * (1 + E)) in km. Note that the calculations are for computing the apogee radius
             * from the center of the earth, to compute apogee altitude the radius of the earth
             * should be subtracted (6378.135 km).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun apogee(): Optional<Double> = apogee.getOptional("apogee")

            /**
             * The argument of perigee is the angle in degrees formed between the perigee and the
             * ascending node. If the perigee would occur at the ascending node, the argument of
             * perigee would be 0.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun argOfPerigee(): Optional<Double> = argOfPerigee.getOptional("argOfPerigee")

            /**
             * Ballistic coefficient, in m^2/kg. Applicable only with ephemType4.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ballisticCoeff(): Optional<Double> = ballisticCoeff.getOptional("ballisticCoeff")

            /**
             * The drag term for SGP4 orbital model, used for calculating decay constants for
             * altitude, eccentricity etc, measured in inverse earth radii.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bStar(): Optional<Double> = bStar.getOptional("bStar")

            /**
             * Time the row was created in the database, auto-populated by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

            /**
             * Application user who created the row in the database, auto-populated by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

            /**
             * Optional source-provided and searchable metadata or descriptor of the data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

            /**
             * The orbital eccentricity of an astronomical object is a parameter that determines the
             * amount by which its orbit around another body deviates from a perfect circle. A value
             * of 0 is a circular orbit, values between 0 and 1 form an elliptic orbit, 1 is a
             * parabolic escape orbit, and greater than 1 is a hyperbolic escape orbit.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun eccentricity(): Optional<Double> = eccentricity.getOptional("eccentricity")

            /**
             * The ephemeris type associated with this TLE:
             *
             * 0:&nbsp;SGP (or SGP4 with Kozai mean motion)
             *
             * 1:&nbsp;SGP (Kozai mean motion)
             *
             * 2:&nbsp;SGP4 (Brouver mean motion)
             *
             * 3:&nbsp;SDP4
             *
             * 4:&nbsp;SGP4-XP
             *
             * 5:&nbsp;SDP8
             *
             * 6:&nbsp;SP (osculating mean motion)
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ephemType(): Optional<Long> = ephemType.getOptional("ephemType")

            /**
             * Unique identifier of the record, auto-generated by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idElset(): Optional<String> = idElset.getOptional("idElset")

            /**
             * Unique identifier of the satellite on-orbit object, if correlated. For the public
             * catalog, the idOnOrbit is typically the satellite number as a string, but may be a
             * UUID for analyst or other unknown or untracked satellites.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

            /**
             * Unique identifier of the OD solution record that produced this elset. This ID can be
             * used to obtain additional information on an OrbitDetermination object using the 'get
             * by ID' operation (e.g. /udl/orbitdetermination/{id}). For example, the
             * OrbitDetermination with idOrbitDetermination = abc would be queried as
             * /udl/orbitdetermination/abc.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idOrbitDetermination(): Optional<String> =
                idOrbitDetermination.getOptional("idOrbitDetermination")

            /**
             * The angle between the equator and the orbit when looking from the center of the
             * Earth. If the orbit went exactly around the equator from left to right, then the
             * inclination would be 0. The inclination ranges from 0 to 180 degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun inclination(): Optional<Double> = inclination.getOptional("inclination")

            /**
             * Read only derived/generated line1 of a legacy TLE (two line element set) format,
             * ignored on create/edit operations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun line1(): Optional<String> = line1.getOptional("line1")

            /**
             * Read only derived/generated line2 of a legacy TLE (two line element set) format,
             * ignored on create/edit operations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun line2(): Optional<String> = line2.getOptional("line2")

            /**
             * Where the satellite is in its orbital path. The mean anomaly ranges from 0 to 360
             * degrees. The mean anomaly is referenced to the perigee. If the satellite were at the
             * perigee, the mean anomaly would be 0.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun meanAnomaly(): Optional<Double> = meanAnomaly.getOptional("meanAnomaly")

            /**
             * Mean motion is the angular speed required for a body to complete one orbit, assuming
             * constant speed in a circular orbit which completes in the same time as the variable
             * speed, elliptical orbit of the actual body. Measured in revolutions per day.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun meanMotion(): Optional<Double> = meanMotion.getOptional("meanMotion")

            /**
             * 2nd derivative of the mean motion with respect to time. Units are revolutions per day
             * cubed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun meanMotionDDot(): Optional<Double> = meanMotionDDot.getOptional("meanMotionDDot")

            /**
             * 1st derivative of the mean motion with respect to time. Units are revolutions per day
             * squared.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun meanMotionDot(): Optional<Double> = meanMotionDot.getOptional("meanMotionDot")

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun origin(): Optional<String> = origin.getOptional("origin")

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

            /**
             * Optional identifier provided by elset source to indicate the target onorbit object of
             * this elset. This may be an internal identifier and not necessarily map to a valid
             * satellite number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

            /**
             * The orbit point nearest to the center of the earth in kilometers. If not provided,
             * perigee will be computed from the TLE according to the following. Using mu, the
             * standard gravitational parameter for the earth (398600.4418), semi-major axis A =
             * (mu/(n _ 2 _ pi/(24*3600))^2)(1/3). Using semi-major axis A, eccentricity E, perigee
             * = (A * (1 - E)) in km. Note that the calculations are for computing the perigee
             * radius from the center of the earth, to compute perigee altitude the radius of the
             * earth should be subtracted (6378.135 km).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun perigee(): Optional<Double> = perigee.getOptional("perigee")

            /**
             * Period of the orbit equal to inverse of mean motion, in minutes.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun period(): Optional<Double> = period.getOptional("period")

            /**
             * Right ascension of the ascending node, or RAAN is the angle as measured in degrees
             * eastwards (or, as seen from the north, counterclockwise) from the First Point of
             * Aries to the ascending node, which is where the orbit crosses the equator when
             * traveling north.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun raan(): Optional<Double> = raan.getOptional("raan")

            /**
             * Optional URI location in the document repository of the raw file parsed by the system
             * to produce this record. To download the raw file, prepend
             * https://udl-hostname/scs/download?id= to this value.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

            /**
             * The current revolution number. The value is incremented when a satellite crosses the
             * equator on an ascending pass.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun revNo(): Optional<Int> = revNo.getOptional("revNo")

            /**
             * Satellite/catalog number of the target on-orbit object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun satNo(): Optional<Int> = satNo.getOptional("satNo")

            /**
             * The sum of the periapsis and apoapsis distances divided by two. For circular orbits,
             * the semimajor axis is the distance between the centers of the bodies, not the
             * distance of the bodies from the center of mass. Units are kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun semiMajorAxis(): Optional<Double> = semiMajorAxis.getOptional("semiMajorAxis")

            /**
             * Optional array of UDL data (observation) UUIDs used to build this element set. See
             * the associated sourcedDataTypes array for the specific types of observations for the
             * positionally corresponding UUIDs in this array (the two arrays must match in size).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourcedData(): Optional<List<String>> = sourcedData.getOptional("sourcedData")

            /**
             * Optional array of UDL observation data types used to build this element set (e.g. EO,
             * RADAR, RF, DOA). See the associated sourcedData array for the specific UUIDs of
             * observations for the positionally corresponding data types in this array (the two
             * arrays must match in size).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourcedDataTypes(): Optional<List<SourcedDataType>> =
                sourcedDataTypes.getOptional("sourcedDataTypes")

            /**
             * The source data library from which this record was received. This could be a remote
             * or tactical UDL or another data library. If null, the record should be assumed to
             * have originated from the primary Enterprise UDL.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

            /**
             * Optional array of provider/source specific tags for this data, where each element is
             * no longer than 32 characters, used for implementing data owner conditional access
             * controls to restrict access to the data. Should be left null by data providers unless
             * conditional access controls are coordinated with the UDL team.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * Optional identifier to track a commercial or marketplace transaction executed to
             * produce this data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

            /**
             * Boolean indicating this Elset was unable to be correlated to a known object. This
             * flag should only be set to true by data providers after an attempt to correlate to an
             * on-orbit object was made and failed. If unable to correlate, the 'origObjectId' field
             * may be populated with an internal data provider specific identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun uct(): Optional<Boolean> = uct.getOptional("uct")

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
             * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataMode")
            @ExcludeMissing
            fun _dataMode(): JsonField<DataMode> = dataMode

            /**
             * Returns the raw JSON value of [epoch].
             *
             * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<OffsetDateTime> = epoch

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [agom].
             *
             * Unlike [agom], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("agom") @ExcludeMissing fun _agom(): JsonField<Double> = agom

            /**
             * Returns the raw JSON value of [algorithm].
             *
             * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("algorithm")
            @ExcludeMissing
            fun _algorithm(): JsonField<String> = algorithm

            /**
             * Returns the raw JSON value of [apogee].
             *
             * Unlike [apogee], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("apogee") @ExcludeMissing fun _apogee(): JsonField<Double> = apogee

            /**
             * Returns the raw JSON value of [argOfPerigee].
             *
             * Unlike [argOfPerigee], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("argOfPerigee")
            @ExcludeMissing
            fun _argOfPerigee(): JsonField<Double> = argOfPerigee

            /**
             * Returns the raw JSON value of [ballisticCoeff].
             *
             * Unlike [ballisticCoeff], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("ballisticCoeff")
            @ExcludeMissing
            fun _ballisticCoeff(): JsonField<Double> = ballisticCoeff

            /**
             * Returns the raw JSON value of [bStar].
             *
             * Unlike [bStar], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bStar") @ExcludeMissing fun _bStar(): JsonField<Double> = bStar

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdBy")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [descriptor].
             *
             * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("descriptor")
            @ExcludeMissing
            fun _descriptor(): JsonField<String> = descriptor

            /**
             * Returns the raw JSON value of [eccentricity].
             *
             * Unlike [eccentricity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("eccentricity")
            @ExcludeMissing
            fun _eccentricity(): JsonField<Double> = eccentricity

            /**
             * Returns the raw JSON value of [ephemType].
             *
             * Unlike [ephemType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("ephemType") @ExcludeMissing fun _ephemType(): JsonField<Long> = ephemType

            /**
             * Returns the raw JSON value of [idElset].
             *
             * Unlike [idElset], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("idElset") @ExcludeMissing fun _idElset(): JsonField<String> = idElset

            /**
             * Returns the raw JSON value of [idOnOrbit].
             *
             * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("idOnOrbit")
            @ExcludeMissing
            fun _idOnOrbit(): JsonField<String> = idOnOrbit

            /**
             * Returns the raw JSON value of [idOrbitDetermination].
             *
             * Unlike [idOrbitDetermination], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("idOrbitDetermination")
            @ExcludeMissing
            fun _idOrbitDetermination(): JsonField<String> = idOrbitDetermination

            /**
             * Returns the raw JSON value of [inclination].
             *
             * Unlike [inclination], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inclination")
            @ExcludeMissing
            fun _inclination(): JsonField<Double> = inclination

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * Returns the raw JSON value of [meanAnomaly].
             *
             * Unlike [meanAnomaly], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("meanAnomaly")
            @ExcludeMissing
            fun _meanAnomaly(): JsonField<Double> = meanAnomaly

            /**
             * Returns the raw JSON value of [meanMotion].
             *
             * Unlike [meanMotion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("meanMotion")
            @ExcludeMissing
            fun _meanMotion(): JsonField<Double> = meanMotion

            /**
             * Returns the raw JSON value of [meanMotionDDot].
             *
             * Unlike [meanMotionDDot], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("meanMotionDDot")
            @ExcludeMissing
            fun _meanMotionDDot(): JsonField<Double> = meanMotionDDot

            /**
             * Returns the raw JSON value of [meanMotionDot].
             *
             * Unlike [meanMotionDot], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("meanMotionDot")
            @ExcludeMissing
            fun _meanMotionDot(): JsonField<Double> = meanMotionDot

            /**
             * Returns the raw JSON value of [origin].
             *
             * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

            /**
             * Returns the raw JSON value of [origNetwork].
             *
             * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Returns the raw JSON value of [perigee].
             *
             * Unlike [perigee], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("perigee") @ExcludeMissing fun _perigee(): JsonField<Double> = perigee

            /**
             * Returns the raw JSON value of [period].
             *
             * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Double> = period

            /**
             * Returns the raw JSON value of [raan].
             *
             * Unlike [raan], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("raan") @ExcludeMissing fun _raan(): JsonField<Double> = raan

            /**
             * Returns the raw JSON value of [rawFileUri].
             *
             * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rawFileURI")
            @ExcludeMissing
            fun _rawFileUri(): JsonField<String> = rawFileUri

            /**
             * Returns the raw JSON value of [revNo].
             *
             * Unlike [revNo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("revNo") @ExcludeMissing fun _revNo(): JsonField<Int> = revNo

            /**
             * Returns the raw JSON value of [satNo].
             *
             * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

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
             * Returns the raw JSON value of [sourcedData].
             *
             * Unlike [sourcedData], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourcedData")
            @ExcludeMissing
            fun _sourcedData(): JsonField<List<String>> = sourcedData

            /**
             * Returns the raw JSON value of [sourcedDataTypes].
             *
             * Unlike [sourcedDataTypes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sourcedDataTypes")
            @ExcludeMissing
            fun _sourcedDataTypes(): JsonField<List<SourcedDataType>> = sourcedDataTypes

            /**
             * Returns the raw JSON value of [sourceDl].
             *
             * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

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
                 * Returns a mutable builder for constructing an instance of [Elset].
                 *
                 * The following fields are required:
                 * ```java
                 * .classificationMarking()
                 * .dataMode()
                 * .epoch()
                 * .source()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Elset]. */
            class Builder internal constructor() {

                private var classificationMarking: JsonField<String>? = null
                private var dataMode: JsonField<DataMode>? = null
                private var epoch: JsonField<OffsetDateTime>? = null
                private var source: JsonField<String>? = null
                private var agom: JsonField<Double> = JsonMissing.of()
                private var algorithm: JsonField<String> = JsonMissing.of()
                private var apogee: JsonField<Double> = JsonMissing.of()
                private var argOfPerigee: JsonField<Double> = JsonMissing.of()
                private var ballisticCoeff: JsonField<Double> = JsonMissing.of()
                private var bStar: JsonField<Double> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var descriptor: JsonField<String> = JsonMissing.of()
                private var eccentricity: JsonField<Double> = JsonMissing.of()
                private var ephemType: JsonField<Long> = JsonMissing.of()
                private var idElset: JsonField<String> = JsonMissing.of()
                private var idOnOrbit: JsonField<String> = JsonMissing.of()
                private var idOrbitDetermination: JsonField<String> = JsonMissing.of()
                private var inclination: JsonField<Double> = JsonMissing.of()
                private var line1: JsonField<String> = JsonMissing.of()
                private var line2: JsonField<String> = JsonMissing.of()
                private var meanAnomaly: JsonField<Double> = JsonMissing.of()
                private var meanMotion: JsonField<Double> = JsonMissing.of()
                private var meanMotionDDot: JsonField<Double> = JsonMissing.of()
                private var meanMotionDot: JsonField<Double> = JsonMissing.of()
                private var origin: JsonField<String> = JsonMissing.of()
                private var origNetwork: JsonField<String> = JsonMissing.of()
                private var origObjectId: JsonField<String> = JsonMissing.of()
                private var perigee: JsonField<Double> = JsonMissing.of()
                private var period: JsonField<Double> = JsonMissing.of()
                private var raan: JsonField<Double> = JsonMissing.of()
                private var rawFileUri: JsonField<String> = JsonMissing.of()
                private var revNo: JsonField<Int> = JsonMissing.of()
                private var satNo: JsonField<Int> = JsonMissing.of()
                private var semiMajorAxis: JsonField<Double> = JsonMissing.of()
                private var sourcedData: JsonField<MutableList<String>>? = null
                private var sourcedDataTypes: JsonField<MutableList<SourcedDataType>>? = null
                private var sourceDl: JsonField<String> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var uct: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(elset: Elset) = apply {
                    classificationMarking = elset.classificationMarking
                    dataMode = elset.dataMode
                    epoch = elset.epoch
                    source = elset.source
                    agom = elset.agom
                    algorithm = elset.algorithm
                    apogee = elset.apogee
                    argOfPerigee = elset.argOfPerigee
                    ballisticCoeff = elset.ballisticCoeff
                    bStar = elset.bStar
                    createdAt = elset.createdAt
                    createdBy = elset.createdBy
                    descriptor = elset.descriptor
                    eccentricity = elset.eccentricity
                    ephemType = elset.ephemType
                    idElset = elset.idElset
                    idOnOrbit = elset.idOnOrbit
                    idOrbitDetermination = elset.idOrbitDetermination
                    inclination = elset.inclination
                    line1 = elset.line1
                    line2 = elset.line2
                    meanAnomaly = elset.meanAnomaly
                    meanMotion = elset.meanMotion
                    meanMotionDDot = elset.meanMotionDDot
                    meanMotionDot = elset.meanMotionDot
                    origin = elset.origin
                    origNetwork = elset.origNetwork
                    origObjectId = elset.origObjectId
                    perigee = elset.perigee
                    period = elset.period
                    raan = elset.raan
                    rawFileUri = elset.rawFileUri
                    revNo = elset.revNo
                    satNo = elset.satNo
                    semiMajorAxis = elset.semiMajorAxis
                    sourcedData = elset.sourcedData.map { it.toMutableList() }
                    sourcedDataTypes = elset.sourcedDataTypes.map { it.toMutableList() }
                    sourceDl = elset.sourceDl
                    tags = elset.tags.map { it.toMutableList() }
                    transactionId = elset.transactionId
                    uct = elset.uct
                    additionalProperties = elset.additionalProperties.toMutableMap()
                }

                /** Classification marking of the data in IC/CAPCO Portion-marked format. */
                fun classificationMarking(classificationMarking: String) =
                    classificationMarking(JsonField.of(classificationMarking))

                /**
                 * Sets [Builder.classificationMarking] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.classificationMarking] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * REAL:&nbsp;Data collected or produced that pertains to real-world objects,
                 * events, and analysis.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

                /** Elset epoch time in ISO 8601 UTC format, with microsecond precision. */
                fun epoch(epoch: OffsetDateTime) = epoch(JsonField.of(epoch))

                /**
                 * Sets [Builder.epoch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.epoch] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun epoch(epoch: JsonField<OffsetDateTime>) = apply { this.epoch = epoch }

                /** Source of the data. */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /**
                 * AGOM, expressed in m^2/kg, is the value of the (averaged) object Area times the
                 * solar radiation pressure coefficient(Gamma) over the object Mass. Applicable only
                 * with ephemType4.
                 */
                fun agom(agom: Double) = agom(JsonField.of(agom))

                /**
                 * Sets [Builder.agom] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agom] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun agom(agom: JsonField<Double>) = apply { this.agom = agom }

                /** Optional algorithm used to produce this record. */
                fun algorithm(algorithm: String) = algorithm(JsonField.of(algorithm))

                /**
                 * Sets [Builder.algorithm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.algorithm] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun algorithm(algorithm: JsonField<String>) = apply { this.algorithm = algorithm }

                /**
                 * The orbit point furthest from the center of the earth in kilometers. If not
                 * provided, apogee will be computed from the TLE according to the following. Using
                 * mu, the standard gravitational parameter for the earth (398600.4418), semi-major
                 * axis A = (mu/(n _ 2 _ pi/(24*3600))^2)(1/3). Using semi-major axis A,
                 * eccentricity E, apogee = (A * (1 + E)) in km. Note that the calculations are for
                 * computing the apogee radius from the center of the earth, to compute apogee
                 * altitude the radius of the earth should be subtracted (6378.135 km).
                 */
                fun apogee(apogee: Double) = apogee(JsonField.of(apogee))

                /**
                 * Sets [Builder.apogee] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.apogee] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun apogee(apogee: JsonField<Double>) = apply { this.apogee = apogee }

                /**
                 * The argument of perigee is the angle in degrees formed between the perigee and
                 * the ascending node. If the perigee would occur at the ascending node, the
                 * argument of perigee would be 0.
                 */
                fun argOfPerigee(argOfPerigee: Double) = argOfPerigee(JsonField.of(argOfPerigee))

                /**
                 * Sets [Builder.argOfPerigee] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.argOfPerigee] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun argOfPerigee(argOfPerigee: JsonField<Double>) = apply {
                    this.argOfPerigee = argOfPerigee
                }

                /** Ballistic coefficient, in m^2/kg. Applicable only with ephemType4. */
                fun ballisticCoeff(ballisticCoeff: Double) =
                    ballisticCoeff(JsonField.of(ballisticCoeff))

                /**
                 * Sets [Builder.ballisticCoeff] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ballisticCoeff] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ballisticCoeff(ballisticCoeff: JsonField<Double>) = apply {
                    this.ballisticCoeff = ballisticCoeff
                }

                /**
                 * The drag term for SGP4 orbital model, used for calculating decay constants for
                 * altitude, eccentricity etc, measured in inverse earth radii.
                 */
                fun bStar(bStar: Double) = bStar(JsonField.of(bStar))

                /**
                 * Sets [Builder.bStar] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bStar] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun bStar(bStar: JsonField<Double>) = apply { this.bStar = bStar }

                /** Time the row was created in the database, auto-populated by the system. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * Application user who created the row in the database, auto-populated by the
                 * system.
                 */
                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                /** Optional source-provided and searchable metadata or descriptor of the data. */
                fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

                /**
                 * Sets [Builder.descriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.descriptor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun descriptor(descriptor: JsonField<String>) = apply {
                    this.descriptor = descriptor
                }

                /**
                 * The orbital eccentricity of an astronomical object is a parameter that determines
                 * the amount by which its orbit around another body deviates from a perfect circle.
                 * A value of 0 is a circular orbit, values between 0 and 1 form an elliptic orbit,
                 * 1 is a parabolic escape orbit, and greater than 1 is a hyperbolic escape orbit.
                 */
                fun eccentricity(eccentricity: Double) = eccentricity(JsonField.of(eccentricity))

                /**
                 * Sets [Builder.eccentricity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eccentricity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eccentricity(eccentricity: JsonField<Double>) = apply {
                    this.eccentricity = eccentricity
                }

                /**
                 * The ephemeris type associated with this TLE:
                 *
                 * 0:&nbsp;SGP (or SGP4 with Kozai mean motion)
                 *
                 * 1:&nbsp;SGP (Kozai mean motion)
                 *
                 * 2:&nbsp;SGP4 (Brouver mean motion)
                 *
                 * 3:&nbsp;SDP4
                 *
                 * 4:&nbsp;SGP4-XP
                 *
                 * 5:&nbsp;SDP8
                 *
                 * 6:&nbsp;SP (osculating mean motion)
                 */
                fun ephemType(ephemType: Long) = ephemType(JsonField.of(ephemType))

                /**
                 * Sets [Builder.ephemType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ephemType] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ephemType(ephemType: JsonField<Long>) = apply { this.ephemType = ephemType }

                /** Unique identifier of the record, auto-generated by the system. */
                fun idElset(idElset: String) = idElset(JsonField.of(idElset))

                /**
                 * Sets [Builder.idElset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idElset] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idElset(idElset: JsonField<String>) = apply { this.idElset = idElset }

                /**
                 * Unique identifier of the satellite on-orbit object, if correlated. For the public
                 * catalog, the idOnOrbit is typically the satellite number as a string, but may be
                 * a UUID for analyst or other unknown or untracked satellites.
                 */
                fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

                /**
                 * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idOnOrbit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

                /**
                 * Unique identifier of the OD solution record that produced this elset. This ID can
                 * be used to obtain additional information on an OrbitDetermination object using
                 * the 'get by ID' operation (e.g. /udl/orbitdetermination/{id}). For example, the
                 * OrbitDetermination with idOrbitDetermination = abc would be queried as
                 * /udl/orbitdetermination/abc.
                 */
                fun idOrbitDetermination(idOrbitDetermination: String) =
                    idOrbitDetermination(JsonField.of(idOrbitDetermination))

                /**
                 * Sets [Builder.idOrbitDetermination] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idOrbitDetermination] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun idOrbitDetermination(idOrbitDetermination: JsonField<String>) = apply {
                    this.idOrbitDetermination = idOrbitDetermination
                }

                /**
                 * The angle between the equator and the orbit when looking from the center of the
                 * Earth. If the orbit went exactly around the equator from left to right, then the
                 * inclination would be 0. The inclination ranges from 0 to 180 degrees.
                 */
                fun inclination(inclination: Double) = inclination(JsonField.of(inclination))

                /**
                 * Sets [Builder.inclination] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inclination] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inclination(inclination: JsonField<Double>) = apply {
                    this.inclination = inclination
                }

                /**
                 * Read only derived/generated line1 of a legacy TLE (two line element set) format,
                 * ignored on create/edit operations.
                 */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /**
                 * Read only derived/generated line2 of a legacy TLE (two line element set) format,
                 * ignored on create/edit operations.
                 */
                fun line2(line2: String) = line2(JsonField.of(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /**
                 * Where the satellite is in its orbital path. The mean anomaly ranges from 0 to 360
                 * degrees. The mean anomaly is referenced to the perigee. If the satellite were at
                 * the perigee, the mean anomaly would be 0.
                 */
                fun meanAnomaly(meanAnomaly: Double) = meanAnomaly(JsonField.of(meanAnomaly))

                /**
                 * Sets [Builder.meanAnomaly] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meanAnomaly] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun meanAnomaly(meanAnomaly: JsonField<Double>) = apply {
                    this.meanAnomaly = meanAnomaly
                }

                /**
                 * Mean motion is the angular speed required for a body to complete one orbit,
                 * assuming constant speed in a circular orbit which completes in the same time as
                 * the variable speed, elliptical orbit of the actual body. Measured in revolutions
                 * per day.
                 */
                fun meanMotion(meanMotion: Double) = meanMotion(JsonField.of(meanMotion))

                /**
                 * Sets [Builder.meanMotion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meanMotion] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun meanMotion(meanMotion: JsonField<Double>) = apply {
                    this.meanMotion = meanMotion
                }

                /**
                 * 2nd derivative of the mean motion with respect to time. Units are revolutions per
                 * day cubed.
                 */
                fun meanMotionDDot(meanMotionDDot: Double) =
                    meanMotionDDot(JsonField.of(meanMotionDDot))

                /**
                 * Sets [Builder.meanMotionDDot] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meanMotionDDot] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun meanMotionDDot(meanMotionDDot: JsonField<Double>) = apply {
                    this.meanMotionDDot = meanMotionDDot
                }

                /**
                 * 1st derivative of the mean motion with respect to time. Units are revolutions per
                 * day squared.
                 */
                fun meanMotionDot(meanMotionDot: Double) =
                    meanMotionDot(JsonField.of(meanMotionDot))

                /**
                 * Sets [Builder.meanMotionDot] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meanMotionDot] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun meanMotionDot(meanMotionDot: JsonField<Double>) = apply {
                    this.meanMotionDot = meanMotionDot
                }

                /**
                 * Originating system or organization which produced the data, if different from the
                 * source. The origin may be different than the source if the source was a mediating
                 * system which forwarded the data on behalf of the origin system. If null, the
                 * source may be assumed to be the origin.
                 */
                fun origin(origin: String) = origin(JsonField.of(origin))

                /**
                 * Sets [Builder.origin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origin] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origin(origin: JsonField<String>) = apply { this.origin = origin }

                /**
                 * The originating source network on which this record was created, auto-populated
                 * by the system.
                 */
                fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

                /**
                 * Sets [Builder.origNetwork] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origNetwork] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origNetwork(origNetwork: JsonField<String>) = apply {
                    this.origNetwork = origNetwork
                }

                /**
                 * Optional identifier provided by elset source to indicate the target onorbit
                 * object of this elset. This may be an internal identifier and not necessarily map
                 * to a valid satellite number.
                 */
                fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

                /**
                 * Sets [Builder.origObjectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origObjectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origObjectId(origObjectId: JsonField<String>) = apply {
                    this.origObjectId = origObjectId
                }

                /**
                 * The orbit point nearest to the center of the earth in kilometers. If not
                 * provided, perigee will be computed from the TLE according to the following. Using
                 * mu, the standard gravitational parameter for the earth (398600.4418), semi-major
                 * axis A = (mu/(n _ 2 _ pi/(24*3600))^2)(1/3). Using semi-major axis A,
                 * eccentricity E, perigee = (A * (1 - E)) in km. Note that the calculations are for
                 * computing the perigee radius from the center of the earth, to compute perigee
                 * altitude the radius of the earth should be subtracted (6378.135 km).
                 */
                fun perigee(perigee: Double) = perigee(JsonField.of(perigee))

                /**
                 * Sets [Builder.perigee] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.perigee] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun perigee(perigee: JsonField<Double>) = apply { this.perigee = perigee }

                /** Period of the orbit equal to inverse of mean motion, in minutes. */
                fun period(period: Double) = period(JsonField.of(period))

                /**
                 * Sets [Builder.period] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.period] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun period(period: JsonField<Double>) = apply { this.period = period }

                /**
                 * Right ascension of the ascending node, or RAAN is the angle as measured in
                 * degrees eastwards (or, as seen from the north, counterclockwise) from the First
                 * Point of Aries to the ascending node, which is where the orbit crosses the
                 * equator when traveling north.
                 */
                fun raan(raan: Double) = raan(JsonField.of(raan))

                /**
                 * Sets [Builder.raan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.raan] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun raan(raan: JsonField<Double>) = apply { this.raan = raan }

                /**
                 * Optional URI location in the document repository of the raw file parsed by the
                 * system to produce this record. To download the raw file, prepend
                 * https://udl-hostname/scs/download?id= to this value.
                 */
                fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

                /**
                 * Sets [Builder.rawFileUri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rawFileUri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rawFileUri(rawFileUri: JsonField<String>) = apply {
                    this.rawFileUri = rawFileUri
                }

                /**
                 * The current revolution number. The value is incremented when a satellite crosses
                 * the equator on an ascending pass.
                 */
                fun revNo(revNo: Int) = revNo(JsonField.of(revNo))

                /**
                 * Sets [Builder.revNo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revNo] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun revNo(revNo: JsonField<Int>) = apply { this.revNo = revNo }

                /** Satellite/catalog number of the target on-orbit object. */
                fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

                /**
                 * Sets [Builder.satNo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.satNo] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

                /**
                 * The sum of the periapsis and apoapsis distances divided by two. For circular
                 * orbits, the semimajor axis is the distance between the centers of the bodies, not
                 * the distance of the bodies from the center of mass. Units are kilometers.
                 */
                fun semiMajorAxis(semiMajorAxis: Double) =
                    semiMajorAxis(JsonField.of(semiMajorAxis))

                /**
                 * Sets [Builder.semiMajorAxis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.semiMajorAxis] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun semiMajorAxis(semiMajorAxis: JsonField<Double>) = apply {
                    this.semiMajorAxis = semiMajorAxis
                }

                /**
                 * Optional array of UDL data (observation) UUIDs used to build this element set.
                 * See the associated sourcedDataTypes array for the specific types of observations
                 * for the positionally corresponding UUIDs in this array (the two arrays must match
                 * in size).
                 */
                fun sourcedData(sourcedData: List<String>) = sourcedData(JsonField.of(sourcedData))

                /**
                 * Sets [Builder.sourcedData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourcedData] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sourcedData(sourcedData: JsonField<List<String>>) = apply {
                    this.sourcedData = sourcedData.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.sourcedData].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSourcedData(sourcedData: String) = apply {
                    this.sourcedData =
                        (this.sourcedData ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sourcedData", it).add(sourcedData)
                        }
                }

                /**
                 * Optional array of UDL observation data types used to build this element set (e.g.
                 * EO, RADAR, RF, DOA). See the associated sourcedData array for the specific UUIDs
                 * of observations for the positionally corresponding data types in this array (the
                 * two arrays must match in size).
                 */
                fun sourcedDataTypes(sourcedDataTypes: List<SourcedDataType>) =
                    sourcedDataTypes(JsonField.of(sourcedDataTypes))

                /**
                 * Sets [Builder.sourcedDataTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourcedDataTypes] with a well-typed
                 * `List<SourcedDataType>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun sourcedDataTypes(sourcedDataTypes: JsonField<List<SourcedDataType>>) = apply {
                    this.sourcedDataTypes = sourcedDataTypes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SourcedDataType] to [sourcedDataTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSourcedDataType(sourcedDataType: SourcedDataType) = apply {
                    sourcedDataTypes =
                        (sourcedDataTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sourcedDataTypes", it).add(sourcedDataType)
                        }
                }

                /**
                 * The source data library from which this record was received. This could be a
                 * remote or tactical UDL or another data library. If null, the record should be
                 * assumed to have originated from the primary Enterprise UDL.
                 */
                fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

                /**
                 * Sets [Builder.sourceDl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceDl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

                /**
                 * Optional array of provider/source specific tags for this data, where each element
                 * is no longer than 32 characters, used for implementing data owner conditional
                 * access controls to restrict access to the data. Should be left null by data
                 * providers unless conditional access controls are coordinated with the UDL team.
                 */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /**
                 * Optional identifier to track a commercial or marketplace transaction executed to
                 * produce this data.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * Sets [Builder.transactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * Boolean indicating this Elset was unable to be correlated to a known object. This
                 * flag should only be set to true by data providers after an attempt to correlate
                 * to an on-orbit object was made and failed. If unable to correlate, the
                 * 'origObjectId' field may be populated with an internal data provider specific
                 * identifier.
                 */
                fun uct(uct: Boolean) = uct(JsonField.of(uct))

                /**
                 * Sets [Builder.uct] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uct] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Elset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .classificationMarking()
                 * .dataMode()
                 * .epoch()
                 * .source()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Elset =
                    Elset(
                        checkRequired("classificationMarking", classificationMarking),
                        checkRequired("dataMode", dataMode),
                        checkRequired("epoch", epoch),
                        checkRequired("source", source),
                        agom,
                        algorithm,
                        apogee,
                        argOfPerigee,
                        ballisticCoeff,
                        bStar,
                        createdAt,
                        createdBy,
                        descriptor,
                        eccentricity,
                        ephemType,
                        idElset,
                        idOnOrbit,
                        idOrbitDetermination,
                        inclination,
                        line1,
                        line2,
                        meanAnomaly,
                        meanMotion,
                        meanMotionDDot,
                        meanMotionDot,
                        origin,
                        origNetwork,
                        origObjectId,
                        perigee,
                        period,
                        raan,
                        rawFileUri,
                        revNo,
                        satNo,
                        semiMajorAxis,
                        (sourcedData ?: JsonMissing.of()).map { it.toImmutable() },
                        (sourcedDataTypes ?: JsonMissing.of()).map { it.toImmutable() },
                        sourceDl,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        transactionId,
                        uct,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Elset = apply {
                if (validated) {
                    return@apply
                }

                classificationMarking()
                dataMode().validate()
                epoch()
                source()
                agom()
                algorithm()
                apogee()
                argOfPerigee()
                ballisticCoeff()
                bStar()
                createdAt()
                createdBy()
                descriptor()
                eccentricity()
                ephemType()
                idElset()
                idOnOrbit()
                idOrbitDetermination()
                inclination()
                line1()
                line2()
                meanAnomaly()
                meanMotion()
                meanMotionDDot()
                meanMotionDot()
                origin()
                origNetwork()
                origObjectId()
                perigee()
                period()
                raan()
                rawFileUri()
                revNo()
                satNo()
                semiMajorAxis()
                sourcedData()
                sourcedDataTypes().ifPresent { it.forEach { it.validate() } }
                sourceDl()
                tags()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                    (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (epoch.asKnown().isPresent) 1 else 0) +
                    (if (source.asKnown().isPresent) 1 else 0) +
                    (if (agom.asKnown().isPresent) 1 else 0) +
                    (if (algorithm.asKnown().isPresent) 1 else 0) +
                    (if (apogee.asKnown().isPresent) 1 else 0) +
                    (if (argOfPerigee.asKnown().isPresent) 1 else 0) +
                    (if (ballisticCoeff.asKnown().isPresent) 1 else 0) +
                    (if (bStar.asKnown().isPresent) 1 else 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (createdBy.asKnown().isPresent) 1 else 0) +
                    (if (descriptor.asKnown().isPresent) 1 else 0) +
                    (if (eccentricity.asKnown().isPresent) 1 else 0) +
                    (if (ephemType.asKnown().isPresent) 1 else 0) +
                    (if (idElset.asKnown().isPresent) 1 else 0) +
                    (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                    (if (idOrbitDetermination.asKnown().isPresent) 1 else 0) +
                    (if (inclination.asKnown().isPresent) 1 else 0) +
                    (if (line1.asKnown().isPresent) 1 else 0) +
                    (if (line2.asKnown().isPresent) 1 else 0) +
                    (if (meanAnomaly.asKnown().isPresent) 1 else 0) +
                    (if (meanMotion.asKnown().isPresent) 1 else 0) +
                    (if (meanMotionDDot.asKnown().isPresent) 1 else 0) +
                    (if (meanMotionDot.asKnown().isPresent) 1 else 0) +
                    (if (origin.asKnown().isPresent) 1 else 0) +
                    (if (origNetwork.asKnown().isPresent) 1 else 0) +
                    (if (origObjectId.asKnown().isPresent) 1 else 0) +
                    (if (perigee.asKnown().isPresent) 1 else 0) +
                    (if (period.asKnown().isPresent) 1 else 0) +
                    (if (raan.asKnown().isPresent) 1 else 0) +
                    (if (rawFileUri.asKnown().isPresent) 1 else 0) +
                    (if (revNo.asKnown().isPresent) 1 else 0) +
                    (if (satNo.asKnown().isPresent) 1 else 0) +
                    (if (semiMajorAxis.asKnown().isPresent) 1 else 0) +
                    (sourcedData.asKnown().getOrNull()?.size ?: 0) +
                    (sourcedDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (sourceDl.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (transactionId.asKnown().isPresent) 1 else 0) +
                    (if (uct.asKnown().isPresent) 1 else 0)

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
            class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REAL,
                    TEST,
                    SIMULATED,
                    EXERCISE,
                    /**
                     * An enum member indicating that [DataMode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        REAL -> Known.REAL
                        TEST -> Known.TEST
                        SIMULATED -> Known.SIMULATED
                        EXERCISE -> Known.EXERCISE
                        else ->
                            throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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

            class SourcedDataType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EO = of("EO")

                    @JvmField val RADAR = of("RADAR")

                    @JvmField val RF = of("RF")

                    @JvmField val DOA = of("DOA")

                    @JvmField val ELSET = of("ELSET")

                    @JvmField val SV = of("SV")

                    @JvmStatic fun of(value: String) = SourcedDataType(JsonField.of(value))
                }

                /** An enum containing [SourcedDataType]'s known values. */
                enum class Known {
                    EO,
                    RADAR,
                    RF,
                    DOA,
                    ELSET,
                    SV,
                }

                /**
                 * An enum containing [SourcedDataType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [SourcedDataType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EO,
                    RADAR,
                    RF,
                    DOA,
                    ELSET,
                    SV,
                    /**
                     * An enum member indicating that [SourcedDataType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EO -> Value.EO
                        RADAR -> Value.RADAR
                        RF -> Value.RF
                        DOA -> Value.DOA
                        ELSET -> Value.ELSET
                        SV -> Value.SV
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        EO -> Known.EO
                        RADAR -> Known.RADAR
                        RF -> Known.RF
                        DOA -> Known.DOA
                        ELSET -> Known.ELSET
                        SV -> Known.SV
                        else ->
                            throw UnifieddatalibraryInvalidDataException(
                                "Unknown SourcedDataType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        UnifieddatalibraryInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SourcedDataType = apply {
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

                    return other is SourcedDataType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Elset &&
                    classificationMarking == other.classificationMarking &&
                    dataMode == other.dataMode &&
                    epoch == other.epoch &&
                    source == other.source &&
                    agom == other.agom &&
                    algorithm == other.algorithm &&
                    apogee == other.apogee &&
                    argOfPerigee == other.argOfPerigee &&
                    ballisticCoeff == other.ballisticCoeff &&
                    bStar == other.bStar &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    descriptor == other.descriptor &&
                    eccentricity == other.eccentricity &&
                    ephemType == other.ephemType &&
                    idElset == other.idElset &&
                    idOnOrbit == other.idOnOrbit &&
                    idOrbitDetermination == other.idOrbitDetermination &&
                    inclination == other.inclination &&
                    line1 == other.line1 &&
                    line2 == other.line2 &&
                    meanAnomaly == other.meanAnomaly &&
                    meanMotion == other.meanMotion &&
                    meanMotionDDot == other.meanMotionDDot &&
                    meanMotionDot == other.meanMotionDot &&
                    origin == other.origin &&
                    origNetwork == other.origNetwork &&
                    origObjectId == other.origObjectId &&
                    perigee == other.perigee &&
                    period == other.period &&
                    raan == other.raan &&
                    rawFileUri == other.rawFileUri &&
                    revNo == other.revNo &&
                    satNo == other.satNo &&
                    semiMajorAxis == other.semiMajorAxis &&
                    sourcedData == other.sourcedData &&
                    sourcedDataTypes == other.sourcedDataTypes &&
                    sourceDl == other.sourceDl &&
                    tags == other.tags &&
                    transactionId == other.transactionId &&
                    uct == other.uct &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    classificationMarking,
                    dataMode,
                    epoch,
                    source,
                    agom,
                    algorithm,
                    apogee,
                    argOfPerigee,
                    ballisticCoeff,
                    bStar,
                    createdAt,
                    createdBy,
                    descriptor,
                    eccentricity,
                    ephemType,
                    idElset,
                    idOnOrbit,
                    idOrbitDetermination,
                    inclination,
                    line1,
                    line2,
                    meanAnomaly,
                    meanMotion,
                    meanMotionDDot,
                    meanMotionDot,
                    origin,
                    origNetwork,
                    origObjectId,
                    perigee,
                    period,
                    raan,
                    rawFileUri,
                    revNo,
                    satNo,
                    semiMajorAxis,
                    sourcedData,
                    sourcedDataTypes,
                    sourceDl,
                    tags,
                    transactionId,
                    uct,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Elset{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, agom=$agom, algorithm=$algorithm, apogee=$apogee, argOfPerigee=$argOfPerigee, ballisticCoeff=$ballisticCoeff, bStar=$bStar, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, eccentricity=$eccentricity, ephemType=$ephemType, idElset=$idElset, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, inclination=$inclination, line1=$line1, line2=$line2, meanAnomaly=$meanAnomaly, meanMotion=$meanMotion, meanMotionDDot=$meanMotionDDot, meanMotionDot=$meanMotionDot, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, perigee=$perigee, period=$period, raan=$raan, rawFileUri=$rawFileUri, revNo=$revNo, satNo=$satNo, semiMajorAxis=$semiMajorAxis, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, uct=$uct, additionalProperties=$additionalProperties}"
        }

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * OnOrbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that, together with their time (epoch) (t), uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         */
        class StateVector
        private constructor(
            private val classificationMarking: JsonField<String>,
            private val dataMode: JsonField<DataMode>,
            private val epoch: JsonField<OffsetDateTime>,
            private val source: JsonField<String>,
            private val actualOdSpan: JsonField<Double>,
            private val algorithm: JsonField<String>,
            private val alt1ReferenceFrame: JsonField<String>,
            private val alt2ReferenceFrame: JsonField<String>,
            private val area: JsonField<Double>,
            private val bDot: JsonField<Double>,
            private val cmOffset: JsonField<Double>,
            private val cov: JsonField<List<Double>>,
            private val covMethod: JsonField<String>,
            private val covReferenceFrame: JsonField<CovReferenceFrame>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val descriptor: JsonField<String>,
            private val dragArea: JsonField<Double>,
            private val dragCoeff: JsonField<Double>,
            private val dragModel: JsonField<String>,
            private val edr: JsonField<Double>,
            private val eqCov: JsonField<List<Double>>,
            private val errorControl: JsonField<Double>,
            private val fixedStep: JsonField<Boolean>,
            private val geopotentialModel: JsonField<String>,
            private val iau1980Terms: JsonField<Int>,
            private val idOnOrbit: JsonField<String>,
            private val idOrbitDetermination: JsonField<String>,
            private val idStateVector: JsonField<String>,
            private val integratorMode: JsonField<String>,
            private val inTrackThrust: JsonField<Boolean>,
            private val lastObEnd: JsonField<OffsetDateTime>,
            private val lastObStart: JsonField<OffsetDateTime>,
            private val leapSecondTime: JsonField<OffsetDateTime>,
            private val lunarSolar: JsonField<Boolean>,
            private val mass: JsonField<Double>,
            private val obsAvailable: JsonField<Int>,
            private val obsUsed: JsonField<Int>,
            private val origin: JsonField<String>,
            private val origNetwork: JsonField<String>,
            private val origObjectId: JsonField<String>,
            private val partials: JsonField<String>,
            private val pedigree: JsonField<String>,
            private val polarMotionX: JsonField<Double>,
            private val polarMotionY: JsonField<Double>,
            private val posUnc: JsonField<Double>,
            private val rawFileUri: JsonField<String>,
            private val recOdSpan: JsonField<Double>,
            private val referenceFrame: JsonField<ReferenceFrame>,
            private val residualsAcc: JsonField<Double>,
            private val revNo: JsonField<Int>,
            private val rms: JsonField<Double>,
            private val satNo: JsonField<Int>,
            private val sigmaPosUvw: JsonField<List<Double>>,
            private val sigmaVelUvw: JsonField<List<Double>>,
            private val solarFluxApAvg: JsonField<Double>,
            private val solarFluxF10: JsonField<Double>,
            private val solarFluxF10Avg: JsonField<Double>,
            private val solarRadPress: JsonField<Boolean>,
            private val solarRadPressCoeff: JsonField<Double>,
            private val solidEarthTides: JsonField<Boolean>,
            private val sourcedData: JsonField<List<String>>,
            private val sourcedDataTypes: JsonField<List<SourcedDataType>>,
            private val sourceDl: JsonField<String>,
            private val srpArea: JsonField<Double>,
            private val stepMode: JsonField<String>,
            private val stepSize: JsonField<Double>,
            private val stepSizeSelection: JsonField<String>,
            private val tags: JsonField<List<String>>,
            private val taiUtc: JsonField<Double>,
            private val thrustAccel: JsonField<Double>,
            private val tracksAvail: JsonField<Int>,
            private val tracksUsed: JsonField<Int>,
            private val transactionId: JsonField<String>,
            private val uct: JsonField<Boolean>,
            private val ut1Rate: JsonField<Double>,
            private val ut1Utc: JsonField<Double>,
            private val velUnc: JsonField<Double>,
            private val xaccel: JsonField<Double>,
            private val xpos: JsonField<Double>,
            private val xposAlt1: JsonField<Double>,
            private val xposAlt2: JsonField<Double>,
            private val xvel: JsonField<Double>,
            private val xvelAlt1: JsonField<Double>,
            private val xvelAlt2: JsonField<Double>,
            private val yaccel: JsonField<Double>,
            private val ypos: JsonField<Double>,
            private val yposAlt1: JsonField<Double>,
            private val yposAlt2: JsonField<Double>,
            private val yvel: JsonField<Double>,
            private val yvelAlt1: JsonField<Double>,
            private val yvelAlt2: JsonField<Double>,
            private val zaccel: JsonField<Double>,
            private val zpos: JsonField<Double>,
            private val zposAlt1: JsonField<Double>,
            private val zposAlt2: JsonField<Double>,
            private val zvel: JsonField<Double>,
            private val zvelAlt1: JsonField<Double>,
            private val zvelAlt2: JsonField<Double>,
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
                @JsonProperty("epoch")
                @ExcludeMissing
                epoch: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("source")
                @ExcludeMissing
                source: JsonField<String> = JsonMissing.of(),
                @JsonProperty("actualODSpan")
                @ExcludeMissing
                actualOdSpan: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("algorithm")
                @ExcludeMissing
                algorithm: JsonField<String> = JsonMissing.of(),
                @JsonProperty("alt1ReferenceFrame")
                @ExcludeMissing
                alt1ReferenceFrame: JsonField<String> = JsonMissing.of(),
                @JsonProperty("alt2ReferenceFrame")
                @ExcludeMissing
                alt2ReferenceFrame: JsonField<String> = JsonMissing.of(),
                @JsonProperty("area") @ExcludeMissing area: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("bDot") @ExcludeMissing bDot: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cmOffset")
                @ExcludeMissing
                cmOffset: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cov")
                @ExcludeMissing
                cov: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("covMethod")
                @ExcludeMissing
                covMethod: JsonField<String> = JsonMissing.of(),
                @JsonProperty("covReferenceFrame")
                @ExcludeMissing
                covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("createdBy")
                @ExcludeMissing
                createdBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("descriptor")
                @ExcludeMissing
                descriptor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dragArea")
                @ExcludeMissing
                dragArea: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("dragCoeff")
                @ExcludeMissing
                dragCoeff: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("dragModel")
                @ExcludeMissing
                dragModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("edr") @ExcludeMissing edr: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("eqCov")
                @ExcludeMissing
                eqCov: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("errorControl")
                @ExcludeMissing
                errorControl: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("fixedStep")
                @ExcludeMissing
                fixedStep: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("geopotentialModel")
                @ExcludeMissing
                geopotentialModel: JsonField<String> = JsonMissing.of(),
                @JsonProperty("iau1980Terms")
                @ExcludeMissing
                iau1980Terms: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("idOnOrbit")
                @ExcludeMissing
                idOnOrbit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("idOrbitDetermination")
                @ExcludeMissing
                idOrbitDetermination: JsonField<String> = JsonMissing.of(),
                @JsonProperty("idStateVector")
                @ExcludeMissing
                idStateVector: JsonField<String> = JsonMissing.of(),
                @JsonProperty("integratorMode")
                @ExcludeMissing
                integratorMode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("inTrackThrust")
                @ExcludeMissing
                inTrackThrust: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("lastObEnd")
                @ExcludeMissing
                lastObEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("lastObStart")
                @ExcludeMissing
                lastObStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("leapSecondTime")
                @ExcludeMissing
                leapSecondTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("lunarSolar")
                @ExcludeMissing
                lunarSolar: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("mass") @ExcludeMissing mass: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("obsAvailable")
                @ExcludeMissing
                obsAvailable: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("obsUsed") @ExcludeMissing obsUsed: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("origin")
                @ExcludeMissing
                origin: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origNetwork")
                @ExcludeMissing
                origNetwork: JsonField<String> = JsonMissing.of(),
                @JsonProperty("origObjectId")
                @ExcludeMissing
                origObjectId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("partials")
                @ExcludeMissing
                partials: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pedigree")
                @ExcludeMissing
                pedigree: JsonField<String> = JsonMissing.of(),
                @JsonProperty("polarMotionX")
                @ExcludeMissing
                polarMotionX: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("polarMotionY")
                @ExcludeMissing
                polarMotionY: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("posUnc")
                @ExcludeMissing
                posUnc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("rawFileURI")
                @ExcludeMissing
                rawFileUri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recODSpan")
                @ExcludeMissing
                recOdSpan: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("referenceFrame")
                @ExcludeMissing
                referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of(),
                @JsonProperty("residualsAcc")
                @ExcludeMissing
                residualsAcc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("revNo") @ExcludeMissing revNo: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("rms") @ExcludeMissing rms: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("sigmaPosUVW")
                @ExcludeMissing
                sigmaPosUvw: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("sigmaVelUVW")
                @ExcludeMissing
                sigmaVelUvw: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("solarFluxAPAvg")
                @ExcludeMissing
                solarFluxApAvg: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("solarFluxF10")
                @ExcludeMissing
                solarFluxF10: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("solarFluxF10Avg")
                @ExcludeMissing
                solarFluxF10Avg: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("solarRadPress")
                @ExcludeMissing
                solarRadPress: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("solarRadPressCoeff")
                @ExcludeMissing
                solarRadPressCoeff: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("solidEarthTides")
                @ExcludeMissing
                solidEarthTides: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("sourcedData")
                @ExcludeMissing
                sourcedData: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("sourcedDataTypes")
                @ExcludeMissing
                sourcedDataTypes: JsonField<List<SourcedDataType>> = JsonMissing.of(),
                @JsonProperty("sourceDL")
                @ExcludeMissing
                sourceDl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("srpArea")
                @ExcludeMissing
                srpArea: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("stepMode")
                @ExcludeMissing
                stepMode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("stepSize")
                @ExcludeMissing
                stepSize: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("stepSizeSelection")
                @ExcludeMissing
                stepSizeSelection: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tags")
                @ExcludeMissing
                tags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("taiUtc")
                @ExcludeMissing
                taiUtc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("thrustAccel")
                @ExcludeMissing
                thrustAccel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tracksAvail")
                @ExcludeMissing
                tracksAvail: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("tracksUsed")
                @ExcludeMissing
                tracksUsed: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("transactionId")
                @ExcludeMissing
                transactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("uct") @ExcludeMissing uct: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("ut1Rate")
                @ExcludeMissing
                ut1Rate: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ut1Utc")
                @ExcludeMissing
                ut1Utc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("velUnc")
                @ExcludeMissing
                velUnc: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xaccel")
                @ExcludeMissing
                xaccel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xpos") @ExcludeMissing xpos: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xposAlt1")
                @ExcludeMissing
                xposAlt1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xposAlt2")
                @ExcludeMissing
                xposAlt2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xvel") @ExcludeMissing xvel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xvelAlt1")
                @ExcludeMissing
                xvelAlt1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("xvelAlt2")
                @ExcludeMissing
                xvelAlt2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("yaccel")
                @ExcludeMissing
                yaccel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("ypos") @ExcludeMissing ypos: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("yposAlt1")
                @ExcludeMissing
                yposAlt1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("yposAlt2")
                @ExcludeMissing
                yposAlt2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("yvel") @ExcludeMissing yvel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("yvelAlt1")
                @ExcludeMissing
                yvelAlt1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("yvelAlt2")
                @ExcludeMissing
                yvelAlt2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zaccel")
                @ExcludeMissing
                zaccel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zpos") @ExcludeMissing zpos: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zposAlt1")
                @ExcludeMissing
                zposAlt1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zposAlt2")
                @ExcludeMissing
                zposAlt2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zvel") @ExcludeMissing zvel: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zvelAlt1")
                @ExcludeMissing
                zvelAlt1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("zvelAlt2")
                @ExcludeMissing
                zvelAlt2: JsonField<Double> = JsonMissing.of(),
            ) : this(
                classificationMarking,
                dataMode,
                epoch,
                source,
                actualOdSpan,
                algorithm,
                alt1ReferenceFrame,
                alt2ReferenceFrame,
                area,
                bDot,
                cmOffset,
                cov,
                covMethod,
                covReferenceFrame,
                createdAt,
                createdBy,
                descriptor,
                dragArea,
                dragCoeff,
                dragModel,
                edr,
                eqCov,
                errorControl,
                fixedStep,
                geopotentialModel,
                iau1980Terms,
                idOnOrbit,
                idOrbitDetermination,
                idStateVector,
                integratorMode,
                inTrackThrust,
                lastObEnd,
                lastObStart,
                leapSecondTime,
                lunarSolar,
                mass,
                obsAvailable,
                obsUsed,
                origin,
                origNetwork,
                origObjectId,
                partials,
                pedigree,
                polarMotionX,
                polarMotionY,
                posUnc,
                rawFileUri,
                recOdSpan,
                referenceFrame,
                residualsAcc,
                revNo,
                rms,
                satNo,
                sigmaPosUvw,
                sigmaVelUvw,
                solarFluxApAvg,
                solarFluxF10,
                solarFluxF10Avg,
                solarRadPress,
                solarRadPressCoeff,
                solidEarthTides,
                sourcedData,
                sourcedDataTypes,
                sourceDl,
                srpArea,
                stepMode,
                stepSize,
                stepSizeSelection,
                tags,
                taiUtc,
                thrustAccel,
                tracksAvail,
                tracksUsed,
                transactionId,
                uct,
                ut1Rate,
                ut1Utc,
                velUnc,
                xaccel,
                xpos,
                xposAlt1,
                xposAlt2,
                xvel,
                xvelAlt1,
                xvelAlt2,
                yaccel,
                ypos,
                yposAlt1,
                yposAlt2,
                yvel,
                yvelAlt1,
                yvelAlt2,
                zaccel,
                zpos,
                zposAlt1,
                zposAlt2,
                zvel,
                zvelAlt1,
                zvelAlt2,
                mutableMapOf(),
            )

            /**
             * Classification marking of the data in IC/CAPCO Portion-marked format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun classificationMarking(): String =
                classificationMarking.getRequired("classificationMarking")

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
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun dataMode(): DataMode = dataMode.getRequired("dataMode")

            /**
             * Time of validity for state vector in ISO 8601 UTC datetime format, with microsecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun epoch(): OffsetDateTime = epoch.getRequired("epoch")

            /**
             * Source of the data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type or is unexpectedly missing or null (e.g. if the server responded with an
             *   unexpected value).
             */
            fun source(): String = source.getRequired("source")

            /**
             * The actual time span used for the OD of the object, expressed in days.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun actualOdSpan(): Optional<Double> = actualOdSpan.getOptional("actualODSpan")

            /**
             * Optional algorithm used to produce this record.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun algorithm(): Optional<String> = algorithm.getOptional("algorithm")

            /**
             * The reference frame of the alternate1 (Alt1) cartesian orbital state.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun alt1ReferenceFrame(): Optional<String> =
                alt1ReferenceFrame.getOptional("alt1ReferenceFrame")

            /**
             * The reference frame of the alternate2 (Alt2) cartesian orbital state.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun alt2ReferenceFrame(): Optional<String> =
                alt2ReferenceFrame.getOptional("alt2ReferenceFrame")

            /**
             * The actual area of the object at it's largest cross-section, expressed in meters^2.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun area(): Optional<Double> = area.getOptional("area")

            /**
             * First derivative of drag/ballistic coefficient (m2/kg-s).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bDot(): Optional<Double> = bDot.getOptional("bDot")

            /**
             * Model parameter value for center of mass offset (m).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cmOffset(): Optional<Double> = cmOffset.getOptional("cmOffset")

            /**
             * Covariance matrix, in kilometer and second based units, in the specified
             * covReferenceFrame. If the covReferenceFrame is null it is assumed to be J2000. The
             * array values (1-21) represent the lower triangular half of the position-velocity
             * covariance matrix. The size of the covariance matrix is dynamic, depending on whether
             * the covariance for position only or position & velocity. The covariance elements are
             * position dependent within the array with values ordered as follows:
             *
             * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR&nbsp;&nbsp;
             *
             * x&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1
             *
             * y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3
             *
             * z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;6
             *
             * x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;&nbsp;10
             *
             * y'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
             *
             * z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp;&nbsp;21&nbsp;
             *
             * The cov array should contain only the lower left triangle values from top left down
             * to bottom right, in order.
             *
             * If additional covariance terms are included for DRAG, SRP, and/or THRUST, the matrix
             * can be extended with the following order of elements:
             *
             * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR
             *
             * DRG&nbsp;&nbsp;&nbsp;22&nbsp;&nbsp;23&nbsp;&nbsp;24&nbsp;&nbsp;25&nbsp;&nbsp;26&nbsp;&nbsp;&nbsp;27&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;28&nbsp;&nbsp;
             *
             * SRP&nbsp;&nbsp;&nbsp;29&nbsp;&nbsp;30&nbsp;&nbsp;31&nbsp;&nbsp;32&nbsp;&nbsp;33&nbsp;&nbsp;&nbsp;34&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;35&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;36&nbsp;&nbsp;
             *
             * THR&nbsp;&nbsp;&nbsp;37&nbsp;&nbsp;38&nbsp;&nbsp;39&nbsp;&nbsp;40&nbsp;&nbsp;41&nbsp;&nbsp;&nbsp;42&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;43&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;44&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45&nbsp;
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cov(): Optional<List<Double>> = cov.getOptional("cov")

            /**
             * The method used to generate the covariance during the orbit determination (OD) that
             * produced the state vector, or whether an arbitrary, non-calculated default value was
             * used (CALCULATED, DEFAULT).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun covMethod(): Optional<String> = covMethod.getOptional("covMethod")

            /**
             * The reference frame of the covariance matrix elements. If the covReferenceFrame is
             * null it is assumed to be J2000.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun covReferenceFrame(): Optional<CovReferenceFrame> =
                covReferenceFrame.getOptional("covReferenceFrame")

            /**
             * Time the row was created in the database, auto-populated by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

            /**
             * Application user who created the row in the database, auto-populated by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

            /**
             * Optional source-provided and searchable metadata or descriptor of the data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

            /**
             * The effective area of the object exposed to atmospheric drag, expressed in meters^2.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dragArea(): Optional<Double> = dragArea.getOptional("dragArea")

            /**
             * Area-to-mass ratio coefficient for atmospheric ballistic drag (m2/kg).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dragCoeff(): Optional<Double> = dragCoeff.getOptional("dragCoeff")

            /**
             * The Drag Model used for this vector (e.g. HARRIS-PRIESTER, JAC70, JBH09, MSIS90,
             * NONE, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dragModel(): Optional<String> = dragModel.getOptional("dragModel")

            /**
             * Model parameter value for energy dissipation rate (EDR) (w/kg).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun edr(): Optional<Double> = edr.getOptional("edr")

            /**
             * The covariance matrix values represent the lower triangular half of the covariance
             * matrix in terms of equinoctial elements.&nbsp; The size of the covariance matrix is
             * dynamic.&nbsp; The values are outputted in order across each row, i.e.:
             *
             * 1&nbsp;&nbsp; 2&nbsp;&nbsp; 3&nbsp;&nbsp; 4&nbsp;&nbsp; 5
             *
             * 6&nbsp;&nbsp; 7&nbsp;&nbsp; 8&nbsp;&nbsp; 9&nbsp; 10
             *
             * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
             *
             * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
             *
             * 51&nbsp; 52&nbsp; 53&nbsp; 54&nbsp; 55
             *
             * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
             *
             * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
             *
             * The ordering of values is as follows:
             *
             * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Af&nbsp;&nbsp;
             * Ag&nbsp;&nbsp; L&nbsp;&nbsp;&nbsp; N&nbsp;&nbsp; Chi&nbsp; Psi&nbsp;&nbsp;
             * B&nbsp;&nbsp; BDOT AGOM&nbsp; T&nbsp;&nbsp; C1&nbsp;&nbsp; C2&nbsp; ...
             *
             * Af&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1
             *
             * Ag&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp; 3
             *
             * L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4&nbsp;&nbsp;&nbsp;
             * 5&nbsp;&nbsp;&nbsp; 6
             *
             * N&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7&nbsp;&nbsp;&nbsp;
             * 8&nbsp;&nbsp;&nbsp; 9&nbsp;&nbsp; 10
             *
             * Chi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 11&nbsp;&nbsp; 12&nbsp;&nbsp; 13&nbsp;&nbsp;
             * 14&nbsp;&nbsp; 15
             *
             * Psi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 16&nbsp;&nbsp; 17&nbsp;&nbsp; 18&nbsp;&nbsp;
             * 19&nbsp;&nbsp; 20&nbsp;&nbsp; 21
             *
             * B&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 22&nbsp;&nbsp; 23&nbsp;&nbsp;
             * 24 &nbsp;&nbsp;25&nbsp;&nbsp; 26&nbsp;&nbsp; 27&nbsp;&nbsp; 28
             *
             * BDOT&nbsp;&nbsp; 29&nbsp;&nbsp; 30&nbsp;&nbsp; 31&nbsp;&nbsp; 32&nbsp;&nbsp;
             * 33&nbsp;&nbsp; 34&nbsp;&nbsp; 35&nbsp;&nbsp; 36
             *
             * AGOM&nbsp; 37&nbsp;&nbsp; 38&nbsp;&nbsp; 39&nbsp;&nbsp; 40&nbsp;&nbsp; 41&nbsp;&nbsp;
             * 42&nbsp;&nbsp; 43&nbsp;&nbsp; 44&nbsp;&nbsp; 45
             *
             * T&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 46&nbsp;&nbsp;
             * 47&nbsp;&nbsp; 48&nbsp;&nbsp; 49&nbsp;&nbsp; 50&nbsp;&nbsp; 51&nbsp;&nbsp;
             * 52&nbsp;&nbsp; 53&nbsp;&nbsp; 54&nbsp;&nbsp; 55
             *
             * C1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 56&nbsp;&nbsp; 57&nbsp;&nbsp;
             * 58&nbsp;&nbsp; 59&nbsp;&nbsp; 60&nbsp;&nbsp; 61&nbsp;&nbsp; 62&nbsp;&nbsp;
             * 63&nbsp;&nbsp; 64&nbsp;&nbsp; 65&nbsp;&nbsp; 66
             *
             * C2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 67&nbsp;&nbsp; 68&nbsp;&nbsp;
             * 69&nbsp;&nbsp; 70&nbsp;&nbsp; 71&nbsp; &nbsp;72&nbsp;&nbsp; 73&nbsp;&nbsp;
             * 74&nbsp;&nbsp; 75&nbsp;&nbsp; 76&nbsp;&nbsp; 77&nbsp;&nbsp; 78
             *
             * :
             *
             * :
             *
             * where C1, C2, etc, are the "consider parameters" that may be added to the covariance
             * matrix.&nbsp; The covariance matrix will be as large as the last element/model
             * parameter needed.&nbsp; In other words, if the DC solved for all 6 elements plus
             * AGOM, the covariance matrix will be 9x9 (and the rows for B and BDOT will be all
             * zeros).&nbsp; If the covariance matrix is unavailable, the size will be set to 0x0,
             * and no data will follow.&nbsp; The cov field should contain only the lower left
             * triangle values from top left down to bottom right, in order.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun eqCov(): Optional<List<Double>> = eqCov.getOptional("eqCov")

            /**
             * Integrator error control.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun errorControl(): Optional<Double> = errorControl.getOptional("errorControl")

            /**
             * Boolean indicating use of fixed step size for this vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fixedStep(): Optional<Boolean> = fixedStep.getOptional("fixedStep")

            /**
             * Geopotential model used for this vector (e.g. EGM-96, WGS-84, WGS-72, JGM-2, or
             * GEM-T3), including mm degree zonals, nn degree/order tesserals. E.g. EGM-96 24Z,24T.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun geopotentialModel(): Optional<String> =
                geopotentialModel.getOptional("geopotentialModel")

            /**
             * Number of terms used in the IAU 1980 nutation model (4, 50, or 106).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun iau1980Terms(): Optional<Int> = iau1980Terms.getOptional("iau1980Terms")

            /**
             * Unique identifier of the satellite on-orbit object, if correlated. For the public
             * catalog, the idOnOrbit is typically the satellite number as a string, but may be a
             * UUID for analyst or other unknown or untracked satellites.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

            /**
             * Unique identifier of the OD solution record that produced this state vector. This ID
             * can be used to obtain additional information on an OrbitDetermination object using
             * the 'get by ID' operation (e.g. /udl/orbitdetermination/{id}). For example, the
             * OrbitDetermination with idOrbitDetermination = abc would be queries as
             * /udl/orbitdetermination/abc.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idOrbitDetermination(): Optional<String> =
                idOrbitDetermination.getOptional("idOrbitDetermination")

            /**
             * Unique identifier of the record, auto-generated by the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun idStateVector(): Optional<String> = idStateVector.getOptional("idStateVector")

            /**
             * Integrator Mode.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun integratorMode(): Optional<String> = integratorMode.getOptional("integratorMode")

            /**
             * Boolean indicating use of in-track thrust perturbations for this vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun inTrackThrust(): Optional<Boolean> = inTrackThrust.getOptional("inTrackThrust")

            /**
             * The end of the time interval containing the time of the last accepted observation, in
             * ISO 8601 UTC format with microsecond precision. For an exact observation time, the
             * firstObTime and lastObTime are the same.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lastObEnd(): Optional<OffsetDateTime> = lastObEnd.getOptional("lastObEnd")

            /**
             * The start of the time interval containing the time of the last accepted observation,
             * in ISO 8601 UTC format with microsecond precision. For an exact observation time, the
             * firstObTime and lastObTime are the same.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lastObStart(): Optional<OffsetDateTime> = lastObStart.getOptional("lastObStart")

            /**
             * Time of the next leap second after epoch in ISO 8601 UTC time. If the next leap
             * second is not known, the time of the previous leap second is used.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun leapSecondTime(): Optional<OffsetDateTime> =
                leapSecondTime.getOptional("leapSecondTime")

            /**
             * Boolean indicating use of lunar/solar perturbations for this vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lunarSolar(): Optional<Boolean> = lunarSolar.getOptional("lunarSolar")

            /**
             * The mass of the object, in kilograms.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun mass(): Optional<Double> = mass.getOptional("mass")

            /**
             * The number of observations available for the OD of the object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun obsAvailable(): Optional<Int> = obsAvailable.getOptional("obsAvailable")

            /**
             * The number of observations accepted for the OD of the object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun obsUsed(): Optional<Int> = obsUsed.getOptional("obsUsed")

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun origin(): Optional<String> = origin.getOptional("origin")

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

            /**
             * Optional identifier provided by state vector source to indicate the target onorbit
             * object of this state vector. This may be an internal identifier and not necessarily
             * map to a valid satellite number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

            /**
             * Type of partial derivatives used (ANALYTIC, FULL NUM, or FAST NUM).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun partials(): Optional<String> = partials.getOptional("partials")

            /**
             * The pedigree of state vector, or methods used for its generation to include state
             * update/orbit determination, propagation from another state, or a state from a
             * calibration satellite (e.g. ORBIT_UPDATE, PROPAGATION, CALIBRATION, CONJUNCTION,
             * FLIGHT_PLAN).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pedigree(): Optional<String> = pedigree.getOptional("pedigree")

            /**
             * Polar Wander Motion X (arc seconds).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun polarMotionX(): Optional<Double> = polarMotionX.getOptional("polarMotionX")

            /**
             * Polar Wander Motion Y (arc seconds).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun polarMotionY(): Optional<Double> = polarMotionY.getOptional("polarMotionY")

            /**
             * One sigma position uncertainty, in kilometers.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun posUnc(): Optional<Double> = posUnc.getOptional("posUnc")

            /**
             * Optional URI location in the document repository of the raw file parsed by the system
             * to produce this record. To download the raw file, prepend
             * https://udl-hostname/scs/download?id= to this value.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

            /**
             * The recommended OD time span calculated for the object, expressed in days.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun recOdSpan(): Optional<Double> = recOdSpan.getOptional("recODSpan")

            /**
             * The reference frame of the cartesian orbital states. If the referenceFrame is null it
             * is assumed to be J2000.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun referenceFrame(): Optional<ReferenceFrame> =
                referenceFrame.getOptional("referenceFrame")

            /**
             * The percentage of residuals accepted in the OD of the object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun residualsAcc(): Optional<Double> = residualsAcc.getOptional("residualsAcc")

            /**
             * Epoch revolution number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun revNo(): Optional<Int> = revNo.getOptional("revNo")

            /**
             * The Weighted Root Mean Squared (RMS) of the differential correction on the target
             * object that produced this vector. WRMS is a quality indicator of the state vector
             * update, with a value of 1.00 being optimal. WRMS applies to Batch Least Squares (BLS)
             * processes.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rms(): Optional<Double> = rms.getOptional("rms")

            /**
             * Satellite/Catalog number of the target OnOrbit object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun satNo(): Optional<Int> = satNo.getOptional("satNo")

            /**
             * Array containing the standard deviation of error in target object position, U, V and
             * W direction respectively (km).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sigmaPosUvw(): Optional<List<Double>> = sigmaPosUvw.getOptional("sigmaPosUVW")

            /**
             * Array containing the standard deviation of error in target object velocity, U, V and
             * W direction respectively (km/sec).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sigmaVelUvw(): Optional<List<Double>> = sigmaVelUvw.getOptional("sigmaVelUVW")

            /**
             * Average solar flux geomagnetic index.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun solarFluxApAvg(): Optional<Double> = solarFluxApAvg.getOptional("solarFluxAPAvg")

            /**
             * F10 (10.7 cm) solar flux value.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun solarFluxF10(): Optional<Double> = solarFluxF10.getOptional("solarFluxF10")

            /**
             * F10 (10.7 cm) solar flux 81-day average value.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun solarFluxF10Avg(): Optional<Double> = solarFluxF10Avg.getOptional("solarFluxF10Avg")

            /**
             * Boolean indicating use of solar radiation pressure perturbations for this vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun solarRadPress(): Optional<Boolean> = solarRadPress.getOptional("solarRadPress")

            /**
             * Area-to-mass ratio coefficient for solar radiation pressure.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun solarRadPressCoeff(): Optional<Double> =
                solarRadPressCoeff.getOptional("solarRadPressCoeff")

            /**
             * Boolean indicating use of solid earth tide perturbations for this vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun solidEarthTides(): Optional<Boolean> =
                solidEarthTides.getOptional("solidEarthTides")

            /**
             * Optional array of UDL data (observation) UUIDs used to build this state vector. See
             * the associated sourcedDataTypes array for the specific types of observations for the
             * positionally corresponding UUIDs in this array (the two arrays must match in size).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourcedData(): Optional<List<String>> = sourcedData.getOptional("sourcedData")

            /**
             * Optional array of UDL observation data types used to build this state vector (e.g.
             * EO, RADAR, RF, DOA). See the associated sourcedData array for the specific UUIDs of
             * observations for the positionally corresponding data types in this array (the two
             * arrays must match in size).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourcedDataTypes(): Optional<List<SourcedDataType>> =
                sourcedDataTypes.getOptional("sourcedDataTypes")

            /**
             * The source data library from which this record was received. This could be a remote
             * or tactical UDL or another data library. If null, the record should be assumed to
             * have originated from the primary Enterprise UDL.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

            /**
             * The effective area of the object exposed to solar radiation pressure, expressed in
             * meters^2.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun srpArea(): Optional<Double> = srpArea.getOptional("srpArea")

            /**
             * Integrator step mode (AUTO, TIME, or S).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun stepMode(): Optional<String> = stepMode.getOptional("stepMode")

            /**
             * Initial integration step size (seconds).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun stepSize(): Optional<Double> = stepSize.getOptional("stepSize")

            /**
             * Initial step size selection (AUTO or MANUAL).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun stepSizeSelection(): Optional<String> =
                stepSizeSelection.getOptional("stepSizeSelection")

            /**
             * Optional array of provider/source specific tags for this data, where each element is
             * no longer than 32 characters, used for implementing data owner conditional access
             * controls to restrict access to the data. Should be left null by data providers unless
             * conditional access controls are coordinated with the UDL team.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tags(): Optional<List<String>> = tags.getOptional("tags")

            /**
             * TAI (Temps Atomique International) minus UTC (Universal Time Coordinates) offset in
             * seconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taiUtc(): Optional<Double> = taiUtc.getOptional("taiUtc")

            /**
             * Model parameter value for thrust acceleration (m/s2).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun thrustAccel(): Optional<Double> = thrustAccel.getOptional("thrustAccel")

            /**
             * The number of sensor tracks available for the OD of the object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tracksAvail(): Optional<Int> = tracksAvail.getOptional("tracksAvail")

            /**
             * The number of sensor tracks accepted for the OD of the object.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun tracksUsed(): Optional<Int> = tracksUsed.getOptional("tracksUsed")

            /**
             * Optional identifier to track a commercial or marketplace transaction executed to
             * produce this data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

            /**
             * Boolean indicating this state vector was unable to be correlated to a known object.
             * This flag should only be set to true by data providers after an attempt to correlate
             * to an OnOrbit object was made and failed. If unable to correlate, the 'origObjectId'
             * field may be populated with an internal data provider specific identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun uct(): Optional<Boolean> = uct.getOptional("uct")

            /**
             * Rate of change of UT1 (milliseconds/day) - first derivative of ut1Utc.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ut1Rate(): Optional<Double> = ut1Rate.getOptional("ut1Rate")

            /**
             * Universal Time-1 (UT1) minus UTC offset, in seconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ut1Utc(): Optional<Double> = ut1Utc.getOptional("ut1Utc")

            /**
             * One sigma velocity uncertainty, in kilometers/second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun velUnc(): Optional<Double> = velUnc.getOptional("velUnc")

            /**
             * Cartesian X acceleration of target, in kilometers/second^2, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xaccel(): Optional<Double> = xaccel.getOptional("xaccel")

            /**
             * Cartesian X position of the target, in kilometers, in the specified referenceFrame.
             * If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xpos(): Optional<Double> = xpos.getOptional("xpos")

            /**
             * Cartesian X position of the target, in kilometers, in the specified
             * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xposAlt1(): Optional<Double> = xposAlt1.getOptional("xposAlt1")

            /**
             * Cartesian X position of the target, in kilometers, in the specified
             * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xposAlt2(): Optional<Double> = xposAlt2.getOptional("xposAlt2")

            /**
             * Cartesian X velocity of target, in kilometers/second, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xvel(): Optional<Double> = xvel.getOptional("xvel")

            /**
             * Cartesian X velocity of the target, in kilometers/second, in the specified
             * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xvelAlt1(): Optional<Double> = xvelAlt1.getOptional("xvelAlt1")

            /**
             * Cartesian X velocity of the target, in kilometers/second, in the specified
             * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun xvelAlt2(): Optional<Double> = xvelAlt2.getOptional("xvelAlt2")

            /**
             * Cartesian Y acceleration of target, in kilometers/second^2, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yaccel(): Optional<Double> = yaccel.getOptional("yaccel")

            /**
             * Cartesian Y position of the target, in kilometers, in the specified referenceFrame.
             * If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ypos(): Optional<Double> = ypos.getOptional("ypos")

            /**
             * Cartesian Y position of the target, in kilometers, in the specified
             * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yposAlt1(): Optional<Double> = yposAlt1.getOptional("yposAlt1")

            /**
             * Cartesian Y position of the target, in kilometers, in the specified
             * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yposAlt2(): Optional<Double> = yposAlt2.getOptional("yposAlt2")

            /**
             * Cartesian Y velocity of target, in kilometers/second, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yvel(): Optional<Double> = yvel.getOptional("yvel")

            /**
             * Cartesian Y velocity of the target, in kilometers/second, in the specified
             * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yvelAlt1(): Optional<Double> = yvelAlt1.getOptional("yvelAlt1")

            /**
             * Cartesian Y velocity of the target, in kilometers/second, in the specified
             * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun yvelAlt2(): Optional<Double> = yvelAlt2.getOptional("yvelAlt2")

            /**
             * Cartesian Z acceleration of target, in kilometers/second^2, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zaccel(): Optional<Double> = zaccel.getOptional("zaccel")

            /**
             * Cartesian Z position of the target, in kilometers, in the specified referenceFrame.
             * If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zpos(): Optional<Double> = zpos.getOptional("zpos")

            /**
             * Cartesian Z position of the target, in kilometers, in the specified
             * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zposAlt1(): Optional<Double> = zposAlt1.getOptional("zposAlt1")

            /**
             * Cartesian Z position of the target, in kilometers, in the specified
             * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zposAlt2(): Optional<Double> = zposAlt2.getOptional("zposAlt2")

            /**
             * Cartesian Z velocity of target, in kilometers/second, in the specified
             * referenceFrame. If referenceFrame is null then J2K should be assumed.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zvel(): Optional<Double> = zvel.getOptional("zvel")

            /**
             * Cartesian Z velocity of the target, in kilometers/second, in the specified
             * alt1ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zvelAlt1(): Optional<Double> = zvelAlt1.getOptional("zvelAlt1")

            /**
             * Cartesian Z velocity of the target, in kilometers/second, in the specified
             * alt2ReferenceFrame. Alternate reference frames are optional and are intended to allow
             * a data source to provide an equivalent vector in a different cartesian frame than the
             * primary vector.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun zvelAlt2(): Optional<Double> = zvelAlt2.getOptional("zvelAlt2")

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
             * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataMode")
            @ExcludeMissing
            fun _dataMode(): JsonField<DataMode> = dataMode

            /**
             * Returns the raw JSON value of [epoch].
             *
             * Unlike [epoch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("epoch") @ExcludeMissing fun _epoch(): JsonField<OffsetDateTime> = epoch

            /**
             * Returns the raw JSON value of [source].
             *
             * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

            /**
             * Returns the raw JSON value of [actualOdSpan].
             *
             * Unlike [actualOdSpan], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("actualODSpan")
            @ExcludeMissing
            fun _actualOdSpan(): JsonField<Double> = actualOdSpan

            /**
             * Returns the raw JSON value of [algorithm].
             *
             * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("algorithm")
            @ExcludeMissing
            fun _algorithm(): JsonField<String> = algorithm

            /**
             * Returns the raw JSON value of [alt1ReferenceFrame].
             *
             * Unlike [alt1ReferenceFrame], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("alt1ReferenceFrame")
            @ExcludeMissing
            fun _alt1ReferenceFrame(): JsonField<String> = alt1ReferenceFrame

            /**
             * Returns the raw JSON value of [alt2ReferenceFrame].
             *
             * Unlike [alt2ReferenceFrame], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("alt2ReferenceFrame")
            @ExcludeMissing
            fun _alt2ReferenceFrame(): JsonField<String> = alt2ReferenceFrame

            /**
             * Returns the raw JSON value of [area].
             *
             * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("area") @ExcludeMissing fun _area(): JsonField<Double> = area

            /**
             * Returns the raw JSON value of [bDot].
             *
             * Unlike [bDot], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("bDot") @ExcludeMissing fun _bDot(): JsonField<Double> = bDot

            /**
             * Returns the raw JSON value of [cmOffset].
             *
             * Unlike [cmOffset], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cmOffset") @ExcludeMissing fun _cmOffset(): JsonField<Double> = cmOffset

            /**
             * Returns the raw JSON value of [cov].
             *
             * Unlike [cov], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cov") @ExcludeMissing fun _cov(): JsonField<List<Double>> = cov

            /**
             * Returns the raw JSON value of [covMethod].
             *
             * Unlike [covMethod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("covMethod")
            @ExcludeMissing
            fun _covMethod(): JsonField<String> = covMethod

            /**
             * Returns the raw JSON value of [covReferenceFrame].
             *
             * Unlike [covReferenceFrame], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("covReferenceFrame")
            @ExcludeMissing
            fun _covReferenceFrame(): JsonField<CovReferenceFrame> = covReferenceFrame

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [createdBy].
             *
             * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdBy")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            /**
             * Returns the raw JSON value of [descriptor].
             *
             * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("descriptor")
            @ExcludeMissing
            fun _descriptor(): JsonField<String> = descriptor

            /**
             * Returns the raw JSON value of [dragArea].
             *
             * Unlike [dragArea], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dragArea") @ExcludeMissing fun _dragArea(): JsonField<Double> = dragArea

            /**
             * Returns the raw JSON value of [dragCoeff].
             *
             * Unlike [dragCoeff], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dragCoeff")
            @ExcludeMissing
            fun _dragCoeff(): JsonField<Double> = dragCoeff

            /**
             * Returns the raw JSON value of [dragModel].
             *
             * Unlike [dragModel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dragModel")
            @ExcludeMissing
            fun _dragModel(): JsonField<String> = dragModel

            /**
             * Returns the raw JSON value of [edr].
             *
             * Unlike [edr], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("edr") @ExcludeMissing fun _edr(): JsonField<Double> = edr

            /**
             * Returns the raw JSON value of [eqCov].
             *
             * Unlike [eqCov], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("eqCov") @ExcludeMissing fun _eqCov(): JsonField<List<Double>> = eqCov

            /**
             * Returns the raw JSON value of [errorControl].
             *
             * Unlike [errorControl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("errorControl")
            @ExcludeMissing
            fun _errorControl(): JsonField<Double> = errorControl

            /**
             * Returns the raw JSON value of [fixedStep].
             *
             * Unlike [fixedStep], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fixedStep")
            @ExcludeMissing
            fun _fixedStep(): JsonField<Boolean> = fixedStep

            /**
             * Returns the raw JSON value of [geopotentialModel].
             *
             * Unlike [geopotentialModel], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("geopotentialModel")
            @ExcludeMissing
            fun _geopotentialModel(): JsonField<String> = geopotentialModel

            /**
             * Returns the raw JSON value of [iau1980Terms].
             *
             * Unlike [iau1980Terms], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("iau1980Terms")
            @ExcludeMissing
            fun _iau1980Terms(): JsonField<Int> = iau1980Terms

            /**
             * Returns the raw JSON value of [idOnOrbit].
             *
             * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("idOnOrbit")
            @ExcludeMissing
            fun _idOnOrbit(): JsonField<String> = idOnOrbit

            /**
             * Returns the raw JSON value of [idOrbitDetermination].
             *
             * Unlike [idOrbitDetermination], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("idOrbitDetermination")
            @ExcludeMissing
            fun _idOrbitDetermination(): JsonField<String> = idOrbitDetermination

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
             * Returns the raw JSON value of [integratorMode].
             *
             * Unlike [integratorMode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("integratorMode")
            @ExcludeMissing
            fun _integratorMode(): JsonField<String> = integratorMode

            /**
             * Returns the raw JSON value of [inTrackThrust].
             *
             * Unlike [inTrackThrust], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("inTrackThrust")
            @ExcludeMissing
            fun _inTrackThrust(): JsonField<Boolean> = inTrackThrust

            /**
             * Returns the raw JSON value of [lastObEnd].
             *
             * Unlike [lastObEnd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lastObEnd")
            @ExcludeMissing
            fun _lastObEnd(): JsonField<OffsetDateTime> = lastObEnd

            /**
             * Returns the raw JSON value of [lastObStart].
             *
             * Unlike [lastObStart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lastObStart")
            @ExcludeMissing
            fun _lastObStart(): JsonField<OffsetDateTime> = lastObStart

            /**
             * Returns the raw JSON value of [leapSecondTime].
             *
             * Unlike [leapSecondTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("leapSecondTime")
            @ExcludeMissing
            fun _leapSecondTime(): JsonField<OffsetDateTime> = leapSecondTime

            /**
             * Returns the raw JSON value of [lunarSolar].
             *
             * Unlike [lunarSolar], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lunarSolar")
            @ExcludeMissing
            fun _lunarSolar(): JsonField<Boolean> = lunarSolar

            /**
             * Returns the raw JSON value of [mass].
             *
             * Unlike [mass], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("mass") @ExcludeMissing fun _mass(): JsonField<Double> = mass

            /**
             * Returns the raw JSON value of [obsAvailable].
             *
             * Unlike [obsAvailable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("obsAvailable")
            @ExcludeMissing
            fun _obsAvailable(): JsonField<Int> = obsAvailable

            /**
             * Returns the raw JSON value of [obsUsed].
             *
             * Unlike [obsUsed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("obsUsed") @ExcludeMissing fun _obsUsed(): JsonField<Int> = obsUsed

            /**
             * Returns the raw JSON value of [origin].
             *
             * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

            /**
             * Returns the raw JSON value of [origNetwork].
             *
             * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected
             * type.
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
             * Returns the raw JSON value of [partials].
             *
             * Unlike [partials], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("partials") @ExcludeMissing fun _partials(): JsonField<String> = partials

            /**
             * Returns the raw JSON value of [pedigree].
             *
             * Unlike [pedigree], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pedigree") @ExcludeMissing fun _pedigree(): JsonField<String> = pedigree

            /**
             * Returns the raw JSON value of [polarMotionX].
             *
             * Unlike [polarMotionX], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("polarMotionX")
            @ExcludeMissing
            fun _polarMotionX(): JsonField<Double> = polarMotionX

            /**
             * Returns the raw JSON value of [polarMotionY].
             *
             * Unlike [polarMotionY], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("polarMotionY")
            @ExcludeMissing
            fun _polarMotionY(): JsonField<Double> = polarMotionY

            /**
             * Returns the raw JSON value of [posUnc].
             *
             * Unlike [posUnc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("posUnc") @ExcludeMissing fun _posUnc(): JsonField<Double> = posUnc

            /**
             * Returns the raw JSON value of [rawFileUri].
             *
             * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rawFileURI")
            @ExcludeMissing
            fun _rawFileUri(): JsonField<String> = rawFileUri

            /**
             * Returns the raw JSON value of [recOdSpan].
             *
             * Unlike [recOdSpan], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recODSpan")
            @ExcludeMissing
            fun _recOdSpan(): JsonField<Double> = recOdSpan

            /**
             * Returns the raw JSON value of [referenceFrame].
             *
             * Unlike [referenceFrame], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("referenceFrame")
            @ExcludeMissing
            fun _referenceFrame(): JsonField<ReferenceFrame> = referenceFrame

            /**
             * Returns the raw JSON value of [residualsAcc].
             *
             * Unlike [residualsAcc], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("residualsAcc")
            @ExcludeMissing
            fun _residualsAcc(): JsonField<Double> = residualsAcc

            /**
             * Returns the raw JSON value of [revNo].
             *
             * Unlike [revNo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("revNo") @ExcludeMissing fun _revNo(): JsonField<Int> = revNo

            /**
             * Returns the raw JSON value of [rms].
             *
             * Unlike [rms], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rms") @ExcludeMissing fun _rms(): JsonField<Double> = rms

            /**
             * Returns the raw JSON value of [satNo].
             *
             * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

            /**
             * Returns the raw JSON value of [sigmaPosUvw].
             *
             * Unlike [sigmaPosUvw], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sigmaPosUVW")
            @ExcludeMissing
            fun _sigmaPosUvw(): JsonField<List<Double>> = sigmaPosUvw

            /**
             * Returns the raw JSON value of [sigmaVelUvw].
             *
             * Unlike [sigmaVelUvw], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sigmaVelUVW")
            @ExcludeMissing
            fun _sigmaVelUvw(): JsonField<List<Double>> = sigmaVelUvw

            /**
             * Returns the raw JSON value of [solarFluxApAvg].
             *
             * Unlike [solarFluxApAvg], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("solarFluxAPAvg")
            @ExcludeMissing
            fun _solarFluxApAvg(): JsonField<Double> = solarFluxApAvg

            /**
             * Returns the raw JSON value of [solarFluxF10].
             *
             * Unlike [solarFluxF10], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("solarFluxF10")
            @ExcludeMissing
            fun _solarFluxF10(): JsonField<Double> = solarFluxF10

            /**
             * Returns the raw JSON value of [solarFluxF10Avg].
             *
             * Unlike [solarFluxF10Avg], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("solarFluxF10Avg")
            @ExcludeMissing
            fun _solarFluxF10Avg(): JsonField<Double> = solarFluxF10Avg

            /**
             * Returns the raw JSON value of [solarRadPress].
             *
             * Unlike [solarRadPress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("solarRadPress")
            @ExcludeMissing
            fun _solarRadPress(): JsonField<Boolean> = solarRadPress

            /**
             * Returns the raw JSON value of [solarRadPressCoeff].
             *
             * Unlike [solarRadPressCoeff], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("solarRadPressCoeff")
            @ExcludeMissing
            fun _solarRadPressCoeff(): JsonField<Double> = solarRadPressCoeff

            /**
             * Returns the raw JSON value of [solidEarthTides].
             *
             * Unlike [solidEarthTides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("solidEarthTides")
            @ExcludeMissing
            fun _solidEarthTides(): JsonField<Boolean> = solidEarthTides

            /**
             * Returns the raw JSON value of [sourcedData].
             *
             * Unlike [sourcedData], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourcedData")
            @ExcludeMissing
            fun _sourcedData(): JsonField<List<String>> = sourcedData

            /**
             * Returns the raw JSON value of [sourcedDataTypes].
             *
             * Unlike [sourcedDataTypes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sourcedDataTypes")
            @ExcludeMissing
            fun _sourcedDataTypes(): JsonField<List<SourcedDataType>> = sourcedDataTypes

            /**
             * Returns the raw JSON value of [sourceDl].
             *
             * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

            /**
             * Returns the raw JSON value of [srpArea].
             *
             * Unlike [srpArea], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("srpArea") @ExcludeMissing fun _srpArea(): JsonField<Double> = srpArea

            /**
             * Returns the raw JSON value of [stepMode].
             *
             * Unlike [stepMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stepMode") @ExcludeMissing fun _stepMode(): JsonField<String> = stepMode

            /**
             * Returns the raw JSON value of [stepSize].
             *
             * Unlike [stepSize], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stepSize") @ExcludeMissing fun _stepSize(): JsonField<Double> = stepSize

            /**
             * Returns the raw JSON value of [stepSizeSelection].
             *
             * Unlike [stepSizeSelection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("stepSizeSelection")
            @ExcludeMissing
            fun _stepSizeSelection(): JsonField<String> = stepSizeSelection

            /**
             * Returns the raw JSON value of [tags].
             *
             * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

            /**
             * Returns the raw JSON value of [taiUtc].
             *
             * Unlike [taiUtc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("taiUtc") @ExcludeMissing fun _taiUtc(): JsonField<Double> = taiUtc

            /**
             * Returns the raw JSON value of [thrustAccel].
             *
             * Unlike [thrustAccel], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("thrustAccel")
            @ExcludeMissing
            fun _thrustAccel(): JsonField<Double> = thrustAccel

            /**
             * Returns the raw JSON value of [tracksAvail].
             *
             * Unlike [tracksAvail], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tracksAvail")
            @ExcludeMissing
            fun _tracksAvail(): JsonField<Int> = tracksAvail

            /**
             * Returns the raw JSON value of [tracksUsed].
             *
             * Unlike [tracksUsed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tracksUsed")
            @ExcludeMissing
            fun _tracksUsed(): JsonField<Int> = tracksUsed

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
             * Returns the raw JSON value of [ut1Rate].
             *
             * Unlike [ut1Rate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ut1Rate") @ExcludeMissing fun _ut1Rate(): JsonField<Double> = ut1Rate

            /**
             * Returns the raw JSON value of [ut1Utc].
             *
             * Unlike [ut1Utc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ut1Utc") @ExcludeMissing fun _ut1Utc(): JsonField<Double> = ut1Utc

            /**
             * Returns the raw JSON value of [velUnc].
             *
             * Unlike [velUnc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("velUnc") @ExcludeMissing fun _velUnc(): JsonField<Double> = velUnc

            /**
             * Returns the raw JSON value of [xaccel].
             *
             * Unlike [xaccel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xaccel") @ExcludeMissing fun _xaccel(): JsonField<Double> = xaccel

            /**
             * Returns the raw JSON value of [xpos].
             *
             * Unlike [xpos], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xpos") @ExcludeMissing fun _xpos(): JsonField<Double> = xpos

            /**
             * Returns the raw JSON value of [xposAlt1].
             *
             * Unlike [xposAlt1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("xposAlt1") @ExcludeMissing fun _xposAlt1(): JsonField<Double> = xposAlt1

            /**
             * Returns the raw JSON value of [xposAlt2].
             *
             * Unlike [xposAlt2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("xposAlt2") @ExcludeMissing fun _xposAlt2(): JsonField<Double> = xposAlt2

            /**
             * Returns the raw JSON value of [xvel].
             *
             * Unlike [xvel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("xvel") @ExcludeMissing fun _xvel(): JsonField<Double> = xvel

            /**
             * Returns the raw JSON value of [xvelAlt1].
             *
             * Unlike [xvelAlt1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("xvelAlt1") @ExcludeMissing fun _xvelAlt1(): JsonField<Double> = xvelAlt1

            /**
             * Returns the raw JSON value of [xvelAlt2].
             *
             * Unlike [xvelAlt2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("xvelAlt2") @ExcludeMissing fun _xvelAlt2(): JsonField<Double> = xvelAlt2

            /**
             * Returns the raw JSON value of [yaccel].
             *
             * Unlike [yaccel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("yaccel") @ExcludeMissing fun _yaccel(): JsonField<Double> = yaccel

            /**
             * Returns the raw JSON value of [ypos].
             *
             * Unlike [ypos], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ypos") @ExcludeMissing fun _ypos(): JsonField<Double> = ypos

            /**
             * Returns the raw JSON value of [yposAlt1].
             *
             * Unlike [yposAlt1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("yposAlt1") @ExcludeMissing fun _yposAlt1(): JsonField<Double> = yposAlt1

            /**
             * Returns the raw JSON value of [yposAlt2].
             *
             * Unlike [yposAlt2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("yposAlt2") @ExcludeMissing fun _yposAlt2(): JsonField<Double> = yposAlt2

            /**
             * Returns the raw JSON value of [yvel].
             *
             * Unlike [yvel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("yvel") @ExcludeMissing fun _yvel(): JsonField<Double> = yvel

            /**
             * Returns the raw JSON value of [yvelAlt1].
             *
             * Unlike [yvelAlt1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("yvelAlt1") @ExcludeMissing fun _yvelAlt1(): JsonField<Double> = yvelAlt1

            /**
             * Returns the raw JSON value of [yvelAlt2].
             *
             * Unlike [yvelAlt2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("yvelAlt2") @ExcludeMissing fun _yvelAlt2(): JsonField<Double> = yvelAlt2

            /**
             * Returns the raw JSON value of [zaccel].
             *
             * Unlike [zaccel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zaccel") @ExcludeMissing fun _zaccel(): JsonField<Double> = zaccel

            /**
             * Returns the raw JSON value of [zpos].
             *
             * Unlike [zpos], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zpos") @ExcludeMissing fun _zpos(): JsonField<Double> = zpos

            /**
             * Returns the raw JSON value of [zposAlt1].
             *
             * Unlike [zposAlt1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("zposAlt1") @ExcludeMissing fun _zposAlt1(): JsonField<Double> = zposAlt1

            /**
             * Returns the raw JSON value of [zposAlt2].
             *
             * Unlike [zposAlt2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("zposAlt2") @ExcludeMissing fun _zposAlt2(): JsonField<Double> = zposAlt2

            /**
             * Returns the raw JSON value of [zvel].
             *
             * Unlike [zvel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zvel") @ExcludeMissing fun _zvel(): JsonField<Double> = zvel

            /**
             * Returns the raw JSON value of [zvelAlt1].
             *
             * Unlike [zvelAlt1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("zvelAlt1") @ExcludeMissing fun _zvelAlt1(): JsonField<Double> = zvelAlt1

            /**
             * Returns the raw JSON value of [zvelAlt2].
             *
             * Unlike [zvelAlt2], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("zvelAlt2") @ExcludeMissing fun _zvelAlt2(): JsonField<Double> = zvelAlt2

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
                 * Returns a mutable builder for constructing an instance of [StateVector].
                 *
                 * The following fields are required:
                 * ```java
                 * .classificationMarking()
                 * .dataMode()
                 * .epoch()
                 * .source()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [StateVector]. */
            class Builder internal constructor() {

                private var classificationMarking: JsonField<String>? = null
                private var dataMode: JsonField<DataMode>? = null
                private var epoch: JsonField<OffsetDateTime>? = null
                private var source: JsonField<String>? = null
                private var actualOdSpan: JsonField<Double> = JsonMissing.of()
                private var algorithm: JsonField<String> = JsonMissing.of()
                private var alt1ReferenceFrame: JsonField<String> = JsonMissing.of()
                private var alt2ReferenceFrame: JsonField<String> = JsonMissing.of()
                private var area: JsonField<Double> = JsonMissing.of()
                private var bDot: JsonField<Double> = JsonMissing.of()
                private var cmOffset: JsonField<Double> = JsonMissing.of()
                private var cov: JsonField<MutableList<Double>>? = null
                private var covMethod: JsonField<String> = JsonMissing.of()
                private var covReferenceFrame: JsonField<CovReferenceFrame> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var descriptor: JsonField<String> = JsonMissing.of()
                private var dragArea: JsonField<Double> = JsonMissing.of()
                private var dragCoeff: JsonField<Double> = JsonMissing.of()
                private var dragModel: JsonField<String> = JsonMissing.of()
                private var edr: JsonField<Double> = JsonMissing.of()
                private var eqCov: JsonField<MutableList<Double>>? = null
                private var errorControl: JsonField<Double> = JsonMissing.of()
                private var fixedStep: JsonField<Boolean> = JsonMissing.of()
                private var geopotentialModel: JsonField<String> = JsonMissing.of()
                private var iau1980Terms: JsonField<Int> = JsonMissing.of()
                private var idOnOrbit: JsonField<String> = JsonMissing.of()
                private var idOrbitDetermination: JsonField<String> = JsonMissing.of()
                private var idStateVector: JsonField<String> = JsonMissing.of()
                private var integratorMode: JsonField<String> = JsonMissing.of()
                private var inTrackThrust: JsonField<Boolean> = JsonMissing.of()
                private var lastObEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastObStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var leapSecondTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lunarSolar: JsonField<Boolean> = JsonMissing.of()
                private var mass: JsonField<Double> = JsonMissing.of()
                private var obsAvailable: JsonField<Int> = JsonMissing.of()
                private var obsUsed: JsonField<Int> = JsonMissing.of()
                private var origin: JsonField<String> = JsonMissing.of()
                private var origNetwork: JsonField<String> = JsonMissing.of()
                private var origObjectId: JsonField<String> = JsonMissing.of()
                private var partials: JsonField<String> = JsonMissing.of()
                private var pedigree: JsonField<String> = JsonMissing.of()
                private var polarMotionX: JsonField<Double> = JsonMissing.of()
                private var polarMotionY: JsonField<Double> = JsonMissing.of()
                private var posUnc: JsonField<Double> = JsonMissing.of()
                private var rawFileUri: JsonField<String> = JsonMissing.of()
                private var recOdSpan: JsonField<Double> = JsonMissing.of()
                private var referenceFrame: JsonField<ReferenceFrame> = JsonMissing.of()
                private var residualsAcc: JsonField<Double> = JsonMissing.of()
                private var revNo: JsonField<Int> = JsonMissing.of()
                private var rms: JsonField<Double> = JsonMissing.of()
                private var satNo: JsonField<Int> = JsonMissing.of()
                private var sigmaPosUvw: JsonField<MutableList<Double>>? = null
                private var sigmaVelUvw: JsonField<MutableList<Double>>? = null
                private var solarFluxApAvg: JsonField<Double> = JsonMissing.of()
                private var solarFluxF10: JsonField<Double> = JsonMissing.of()
                private var solarFluxF10Avg: JsonField<Double> = JsonMissing.of()
                private var solarRadPress: JsonField<Boolean> = JsonMissing.of()
                private var solarRadPressCoeff: JsonField<Double> = JsonMissing.of()
                private var solidEarthTides: JsonField<Boolean> = JsonMissing.of()
                private var sourcedData: JsonField<MutableList<String>>? = null
                private var sourcedDataTypes: JsonField<MutableList<SourcedDataType>>? = null
                private var sourceDl: JsonField<String> = JsonMissing.of()
                private var srpArea: JsonField<Double> = JsonMissing.of()
                private var stepMode: JsonField<String> = JsonMissing.of()
                private var stepSize: JsonField<Double> = JsonMissing.of()
                private var stepSizeSelection: JsonField<String> = JsonMissing.of()
                private var tags: JsonField<MutableList<String>>? = null
                private var taiUtc: JsonField<Double> = JsonMissing.of()
                private var thrustAccel: JsonField<Double> = JsonMissing.of()
                private var tracksAvail: JsonField<Int> = JsonMissing.of()
                private var tracksUsed: JsonField<Int> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var uct: JsonField<Boolean> = JsonMissing.of()
                private var ut1Rate: JsonField<Double> = JsonMissing.of()
                private var ut1Utc: JsonField<Double> = JsonMissing.of()
                private var velUnc: JsonField<Double> = JsonMissing.of()
                private var xaccel: JsonField<Double> = JsonMissing.of()
                private var xpos: JsonField<Double> = JsonMissing.of()
                private var xposAlt1: JsonField<Double> = JsonMissing.of()
                private var xposAlt2: JsonField<Double> = JsonMissing.of()
                private var xvel: JsonField<Double> = JsonMissing.of()
                private var xvelAlt1: JsonField<Double> = JsonMissing.of()
                private var xvelAlt2: JsonField<Double> = JsonMissing.of()
                private var yaccel: JsonField<Double> = JsonMissing.of()
                private var ypos: JsonField<Double> = JsonMissing.of()
                private var yposAlt1: JsonField<Double> = JsonMissing.of()
                private var yposAlt2: JsonField<Double> = JsonMissing.of()
                private var yvel: JsonField<Double> = JsonMissing.of()
                private var yvelAlt1: JsonField<Double> = JsonMissing.of()
                private var yvelAlt2: JsonField<Double> = JsonMissing.of()
                private var zaccel: JsonField<Double> = JsonMissing.of()
                private var zpos: JsonField<Double> = JsonMissing.of()
                private var zposAlt1: JsonField<Double> = JsonMissing.of()
                private var zposAlt2: JsonField<Double> = JsonMissing.of()
                private var zvel: JsonField<Double> = JsonMissing.of()
                private var zvelAlt1: JsonField<Double> = JsonMissing.of()
                private var zvelAlt2: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(stateVector: StateVector) = apply {
                    classificationMarking = stateVector.classificationMarking
                    dataMode = stateVector.dataMode
                    epoch = stateVector.epoch
                    source = stateVector.source
                    actualOdSpan = stateVector.actualOdSpan
                    algorithm = stateVector.algorithm
                    alt1ReferenceFrame = stateVector.alt1ReferenceFrame
                    alt2ReferenceFrame = stateVector.alt2ReferenceFrame
                    area = stateVector.area
                    bDot = stateVector.bDot
                    cmOffset = stateVector.cmOffset
                    cov = stateVector.cov.map { it.toMutableList() }
                    covMethod = stateVector.covMethod
                    covReferenceFrame = stateVector.covReferenceFrame
                    createdAt = stateVector.createdAt
                    createdBy = stateVector.createdBy
                    descriptor = stateVector.descriptor
                    dragArea = stateVector.dragArea
                    dragCoeff = stateVector.dragCoeff
                    dragModel = stateVector.dragModel
                    edr = stateVector.edr
                    eqCov = stateVector.eqCov.map { it.toMutableList() }
                    errorControl = stateVector.errorControl
                    fixedStep = stateVector.fixedStep
                    geopotentialModel = stateVector.geopotentialModel
                    iau1980Terms = stateVector.iau1980Terms
                    idOnOrbit = stateVector.idOnOrbit
                    idOrbitDetermination = stateVector.idOrbitDetermination
                    idStateVector = stateVector.idStateVector
                    integratorMode = stateVector.integratorMode
                    inTrackThrust = stateVector.inTrackThrust
                    lastObEnd = stateVector.lastObEnd
                    lastObStart = stateVector.lastObStart
                    leapSecondTime = stateVector.leapSecondTime
                    lunarSolar = stateVector.lunarSolar
                    mass = stateVector.mass
                    obsAvailable = stateVector.obsAvailable
                    obsUsed = stateVector.obsUsed
                    origin = stateVector.origin
                    origNetwork = stateVector.origNetwork
                    origObjectId = stateVector.origObjectId
                    partials = stateVector.partials
                    pedigree = stateVector.pedigree
                    polarMotionX = stateVector.polarMotionX
                    polarMotionY = stateVector.polarMotionY
                    posUnc = stateVector.posUnc
                    rawFileUri = stateVector.rawFileUri
                    recOdSpan = stateVector.recOdSpan
                    referenceFrame = stateVector.referenceFrame
                    residualsAcc = stateVector.residualsAcc
                    revNo = stateVector.revNo
                    rms = stateVector.rms
                    satNo = stateVector.satNo
                    sigmaPosUvw = stateVector.sigmaPosUvw.map { it.toMutableList() }
                    sigmaVelUvw = stateVector.sigmaVelUvw.map { it.toMutableList() }
                    solarFluxApAvg = stateVector.solarFluxApAvg
                    solarFluxF10 = stateVector.solarFluxF10
                    solarFluxF10Avg = stateVector.solarFluxF10Avg
                    solarRadPress = stateVector.solarRadPress
                    solarRadPressCoeff = stateVector.solarRadPressCoeff
                    solidEarthTides = stateVector.solidEarthTides
                    sourcedData = stateVector.sourcedData.map { it.toMutableList() }
                    sourcedDataTypes = stateVector.sourcedDataTypes.map { it.toMutableList() }
                    sourceDl = stateVector.sourceDl
                    srpArea = stateVector.srpArea
                    stepMode = stateVector.stepMode
                    stepSize = stateVector.stepSize
                    stepSizeSelection = stateVector.stepSizeSelection
                    tags = stateVector.tags.map { it.toMutableList() }
                    taiUtc = stateVector.taiUtc
                    thrustAccel = stateVector.thrustAccel
                    tracksAvail = stateVector.tracksAvail
                    tracksUsed = stateVector.tracksUsed
                    transactionId = stateVector.transactionId
                    uct = stateVector.uct
                    ut1Rate = stateVector.ut1Rate
                    ut1Utc = stateVector.ut1Utc
                    velUnc = stateVector.velUnc
                    xaccel = stateVector.xaccel
                    xpos = stateVector.xpos
                    xposAlt1 = stateVector.xposAlt1
                    xposAlt2 = stateVector.xposAlt2
                    xvel = stateVector.xvel
                    xvelAlt1 = stateVector.xvelAlt1
                    xvelAlt2 = stateVector.xvelAlt2
                    yaccel = stateVector.yaccel
                    ypos = stateVector.ypos
                    yposAlt1 = stateVector.yposAlt1
                    yposAlt2 = stateVector.yposAlt2
                    yvel = stateVector.yvel
                    yvelAlt1 = stateVector.yvelAlt1
                    yvelAlt2 = stateVector.yvelAlt2
                    zaccel = stateVector.zaccel
                    zpos = stateVector.zpos
                    zposAlt1 = stateVector.zposAlt1
                    zposAlt2 = stateVector.zposAlt2
                    zvel = stateVector.zvel
                    zvelAlt1 = stateVector.zvelAlt1
                    zvelAlt2 = stateVector.zvelAlt2
                    additionalProperties = stateVector.additionalProperties.toMutableMap()
                }

                /** Classification marking of the data in IC/CAPCO Portion-marked format. */
                fun classificationMarking(classificationMarking: String) =
                    classificationMarking(JsonField.of(classificationMarking))

                /**
                 * Sets [Builder.classificationMarking] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.classificationMarking] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
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
                 * REAL:&nbsp;Data collected or produced that pertains to real-world objects,
                 * events, and analysis.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

                /**
                 * Time of validity for state vector in ISO 8601 UTC datetime format, with
                 * microsecond precision.
                 */
                fun epoch(epoch: OffsetDateTime) = epoch(JsonField.of(epoch))

                /**
                 * Sets [Builder.epoch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.epoch] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun epoch(epoch: JsonField<OffsetDateTime>) = apply { this.epoch = epoch }

                /** Source of the data. */
                fun source(source: String) = source(JsonField.of(source))

                /**
                 * Sets [Builder.source] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.source] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun source(source: JsonField<String>) = apply { this.source = source }

                /** The actual time span used for the OD of the object, expressed in days. */
                fun actualOdSpan(actualOdSpan: Double) = actualOdSpan(JsonField.of(actualOdSpan))

                /**
                 * Sets [Builder.actualOdSpan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.actualOdSpan] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun actualOdSpan(actualOdSpan: JsonField<Double>) = apply {
                    this.actualOdSpan = actualOdSpan
                }

                /** Optional algorithm used to produce this record. */
                fun algorithm(algorithm: String) = algorithm(JsonField.of(algorithm))

                /**
                 * Sets [Builder.algorithm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.algorithm] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun algorithm(algorithm: JsonField<String>) = apply { this.algorithm = algorithm }

                /** The reference frame of the alternate1 (Alt1) cartesian orbital state. */
                fun alt1ReferenceFrame(alt1ReferenceFrame: String) =
                    alt1ReferenceFrame(JsonField.of(alt1ReferenceFrame))

                /**
                 * Sets [Builder.alt1ReferenceFrame] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alt1ReferenceFrame] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun alt1ReferenceFrame(alt1ReferenceFrame: JsonField<String>) = apply {
                    this.alt1ReferenceFrame = alt1ReferenceFrame
                }

                /** The reference frame of the alternate2 (Alt2) cartesian orbital state. */
                fun alt2ReferenceFrame(alt2ReferenceFrame: String) =
                    alt2ReferenceFrame(JsonField.of(alt2ReferenceFrame))

                /**
                 * Sets [Builder.alt2ReferenceFrame] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alt2ReferenceFrame] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun alt2ReferenceFrame(alt2ReferenceFrame: JsonField<String>) = apply {
                    this.alt2ReferenceFrame = alt2ReferenceFrame
                }

                /**
                 * The actual area of the object at it's largest cross-section, expressed in
                 * meters^2.
                 */
                fun area(area: Double) = area(JsonField.of(area))

                /**
                 * Sets [Builder.area] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.area] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun area(area: JsonField<Double>) = apply { this.area = area }

                /** First derivative of drag/ballistic coefficient (m2/kg-s). */
                fun bDot(bDot: Double) = bDot(JsonField.of(bDot))

                /**
                 * Sets [Builder.bDot] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bDot] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun bDot(bDot: JsonField<Double>) = apply { this.bDot = bDot }

                /** Model parameter value for center of mass offset (m). */
                fun cmOffset(cmOffset: Double) = cmOffset(JsonField.of(cmOffset))

                /**
                 * Sets [Builder.cmOffset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cmOffset] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cmOffset(cmOffset: JsonField<Double>) = apply { this.cmOffset = cmOffset }

                /**
                 * Covariance matrix, in kilometer and second based units, in the specified
                 * covReferenceFrame. If the covReferenceFrame is null it is assumed to be J2000.
                 * The array values (1-21) represent the lower triangular half of the
                 * position-velocity covariance matrix. The size of the covariance matrix is
                 * dynamic, depending on whether the covariance for position only or position &
                 * velocity. The covariance elements are position dependent within the array with
                 * values ordered as follows:
                 *
                 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR&nbsp;&nbsp;
                 *
                 * x&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1
                 *
                 * y&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;&nbsp;3
                 *
                 * z&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;6
                 *
                 * x'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;&nbsp;10
                 *
                 * y'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
                 *
                 * z'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp;&nbsp;21&nbsp;
                 *
                 * The cov array should contain only the lower left triangle values from top left
                 * down to bottom right, in order.
                 *
                 * If additional covariance terms are included for DRAG, SRP, and/or THRUST, the
                 * matrix can be extended with the following order of elements:
                 *
                 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;&nbsp;&nbsp;y&nbsp;&nbsp;&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;&nbsp;&nbsp;y'&nbsp;&nbsp;&nbsp;&nbsp;z'&nbsp;&nbsp;&nbsp;&nbsp;DRG&nbsp;&nbsp;&nbsp;&nbsp;SRP&nbsp;&nbsp;&nbsp;&nbsp;THR
                 *
                 * DRG&nbsp;&nbsp;&nbsp;22&nbsp;&nbsp;23&nbsp;&nbsp;24&nbsp;&nbsp;25&nbsp;&nbsp;26&nbsp;&nbsp;&nbsp;27&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;28&nbsp;&nbsp;
                 *
                 * SRP&nbsp;&nbsp;&nbsp;29&nbsp;&nbsp;30&nbsp;&nbsp;31&nbsp;&nbsp;32&nbsp;&nbsp;33&nbsp;&nbsp;&nbsp;34&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;35&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;36&nbsp;&nbsp;
                 *
                 * THR&nbsp;&nbsp;&nbsp;37&nbsp;&nbsp;38&nbsp;&nbsp;39&nbsp;&nbsp;40&nbsp;&nbsp;41&nbsp;&nbsp;&nbsp;42&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;43&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;44&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;45&nbsp;
                 */
                fun cov(cov: List<Double>) = cov(JsonField.of(cov))

                /**
                 * Sets [Builder.cov] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cov] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cov(cov: JsonField<List<Double>>) = apply {
                    this.cov = cov.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.cov].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCov(cov: Double) = apply {
                    this.cov =
                        (this.cov ?: JsonField.of(mutableListOf())).also {
                            checkKnown("cov", it).add(cov)
                        }
                }

                /**
                 * The method used to generate the covariance during the orbit determination (OD)
                 * that produced the state vector, or whether an arbitrary, non-calculated default
                 * value was used (CALCULATED, DEFAULT).
                 */
                fun covMethod(covMethod: String) = covMethod(JsonField.of(covMethod))

                /**
                 * Sets [Builder.covMethod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.covMethod] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun covMethod(covMethod: JsonField<String>) = apply { this.covMethod = covMethod }

                /**
                 * The reference frame of the covariance matrix elements. If the covReferenceFrame
                 * is null it is assumed to be J2000.
                 */
                fun covReferenceFrame(covReferenceFrame: CovReferenceFrame) =
                    covReferenceFrame(JsonField.of(covReferenceFrame))

                /**
                 * Sets [Builder.covReferenceFrame] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.covReferenceFrame] with a well-typed
                 * [CovReferenceFrame] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun covReferenceFrame(covReferenceFrame: JsonField<CovReferenceFrame>) = apply {
                    this.covReferenceFrame = covReferenceFrame
                }

                /** Time the row was created in the database, auto-populated by the system. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * Application user who created the row in the database, auto-populated by the
                 * system.
                 */
                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                /**
                 * Sets [Builder.createdBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                /** Optional source-provided and searchable metadata or descriptor of the data. */
                fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

                /**
                 * Sets [Builder.descriptor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.descriptor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun descriptor(descriptor: JsonField<String>) = apply {
                    this.descriptor = descriptor
                }

                /**
                 * The effective area of the object exposed to atmospheric drag, expressed in
                 * meters^2.
                 */
                fun dragArea(dragArea: Double) = dragArea(JsonField.of(dragArea))

                /**
                 * Sets [Builder.dragArea] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dragArea] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dragArea(dragArea: JsonField<Double>) = apply { this.dragArea = dragArea }

                /** Area-to-mass ratio coefficient for atmospheric ballistic drag (m2/kg). */
                fun dragCoeff(dragCoeff: Double) = dragCoeff(JsonField.of(dragCoeff))

                /**
                 * Sets [Builder.dragCoeff] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dragCoeff] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dragCoeff(dragCoeff: JsonField<Double>) = apply { this.dragCoeff = dragCoeff }

                /**
                 * The Drag Model used for this vector (e.g. HARRIS-PRIESTER, JAC70, JBH09, MSIS90,
                 * NONE, etc.).
                 */
                fun dragModel(dragModel: String) = dragModel(JsonField.of(dragModel))

                /**
                 * Sets [Builder.dragModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dragModel] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dragModel(dragModel: JsonField<String>) = apply { this.dragModel = dragModel }

                /** Model parameter value for energy dissipation rate (EDR) (w/kg). */
                fun edr(edr: Double) = edr(JsonField.of(edr))

                /**
                 * Sets [Builder.edr] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.edr] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun edr(edr: JsonField<Double>) = apply { this.edr = edr }

                /**
                 * The covariance matrix values represent the lower triangular half of the
                 * covariance matrix in terms of equinoctial elements.&nbsp; The size of the
                 * covariance matrix is dynamic.&nbsp; The values are outputted in order across each
                 * row, i.e.:
                 *
                 * 1&nbsp;&nbsp; 2&nbsp;&nbsp; 3&nbsp;&nbsp; 4&nbsp;&nbsp; 5
                 *
                 * 6&nbsp;&nbsp; 7&nbsp;&nbsp; 8&nbsp;&nbsp; 9&nbsp; 10
                 *
                 * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
                 *
                 * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
                 *
                 * 51&nbsp; 52&nbsp; 53&nbsp; 54&nbsp; 55
                 *
                 * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
                 *
                 * :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :&nbsp;&nbsp; :
                 *
                 * The ordering of values is as follows:
                 *
                 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Af&nbsp;&nbsp;
                 * Ag&nbsp;&nbsp; L&nbsp;&nbsp;&nbsp; N&nbsp;&nbsp; Chi&nbsp; Psi&nbsp;&nbsp;
                 * B&nbsp;&nbsp; BDOT AGOM&nbsp; T&nbsp;&nbsp; C1&nbsp;&nbsp; C2&nbsp; ...
                 *
                 * Af&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 1
                 *
                 * Ag&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 2&nbsp;&nbsp;&nbsp; 3
                 *
                 * L&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 4&nbsp;&nbsp;&nbsp;
                 * 5&nbsp;&nbsp;&nbsp; 6
                 *
                 * N&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 7&nbsp;&nbsp;&nbsp;
                 * 8&nbsp;&nbsp;&nbsp; 9&nbsp;&nbsp; 10
                 *
                 * Chi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 11&nbsp;&nbsp; 12&nbsp;&nbsp;
                 * 13&nbsp;&nbsp; 14&nbsp;&nbsp; 15
                 *
                 * Psi&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 16&nbsp;&nbsp; 17&nbsp;&nbsp;
                 * 18&nbsp;&nbsp; 19&nbsp;&nbsp; 20&nbsp;&nbsp; 21
                 *
                 * B&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 22&nbsp;&nbsp;
                 * 23&nbsp;&nbsp; 24 &nbsp;&nbsp;25&nbsp;&nbsp; 26&nbsp;&nbsp; 27&nbsp;&nbsp; 28
                 *
                 * BDOT&nbsp;&nbsp; 29&nbsp;&nbsp; 30&nbsp;&nbsp; 31&nbsp;&nbsp; 32&nbsp;&nbsp;
                 * 33&nbsp;&nbsp; 34&nbsp;&nbsp; 35&nbsp;&nbsp; 36
                 *
                 * AGOM&nbsp; 37&nbsp;&nbsp; 38&nbsp;&nbsp; 39&nbsp;&nbsp; 40&nbsp;&nbsp;
                 * 41&nbsp;&nbsp; 42&nbsp;&nbsp; 43&nbsp;&nbsp; 44&nbsp;&nbsp; 45
                 *
                 * T&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 46&nbsp;&nbsp;
                 * 47&nbsp;&nbsp; 48&nbsp;&nbsp; 49&nbsp;&nbsp; 50&nbsp;&nbsp; 51&nbsp;&nbsp;
                 * 52&nbsp;&nbsp; 53&nbsp;&nbsp; 54&nbsp;&nbsp; 55
                 *
                 * C1&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 56&nbsp;&nbsp; 57&nbsp;&nbsp;
                 * 58&nbsp;&nbsp; 59&nbsp;&nbsp; 60&nbsp;&nbsp; 61&nbsp;&nbsp; 62&nbsp;&nbsp;
                 * 63&nbsp;&nbsp; 64&nbsp;&nbsp; 65&nbsp;&nbsp; 66
                 *
                 * C2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 67&nbsp;&nbsp; 68&nbsp;&nbsp;
                 * 69&nbsp;&nbsp; 70&nbsp;&nbsp; 71&nbsp; &nbsp;72&nbsp;&nbsp; 73&nbsp;&nbsp;
                 * 74&nbsp;&nbsp; 75&nbsp;&nbsp; 76&nbsp;&nbsp; 77&nbsp;&nbsp; 78
                 *
                 * :
                 *
                 * :
                 *
                 * where C1, C2, etc, are the "consider parameters" that may be added to the
                 * covariance matrix.&nbsp; The covariance matrix will be as large as the last
                 * element/model parameter needed.&nbsp; In other words, if the DC solved for all 6
                 * elements plus AGOM, the covariance matrix will be 9x9 (and the rows for B and
                 * BDOT will be all zeros).&nbsp; If the covariance matrix is unavailable, the size
                 * will be set to 0x0, and no data will follow.&nbsp; The cov field should contain
                 * only the lower left triangle values from top left down to bottom right, in order.
                 */
                fun eqCov(eqCov: List<Double>) = eqCov(JsonField.of(eqCov))

                /**
                 * Sets [Builder.eqCov] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eqCov] with a well-typed `List<Double>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eqCov(eqCov: JsonField<List<Double>>) = apply {
                    this.eqCov = eqCov.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.eqCov].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEqCov(eqCov: Double) = apply {
                    this.eqCov =
                        (this.eqCov ?: JsonField.of(mutableListOf())).also {
                            checkKnown("eqCov", it).add(eqCov)
                        }
                }

                /** Integrator error control. */
                fun errorControl(errorControl: Double) = errorControl(JsonField.of(errorControl))

                /**
                 * Sets [Builder.errorControl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.errorControl] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun errorControl(errorControl: JsonField<Double>) = apply {
                    this.errorControl = errorControl
                }

                /** Boolean indicating use of fixed step size for this vector. */
                fun fixedStep(fixedStep: Boolean) = fixedStep(JsonField.of(fixedStep))

                /**
                 * Sets [Builder.fixedStep] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedStep] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fixedStep(fixedStep: JsonField<Boolean>) = apply { this.fixedStep = fixedStep }

                /**
                 * Geopotential model used for this vector (e.g. EGM-96, WGS-84, WGS-72, JGM-2, or
                 * GEM-T3), including mm degree zonals, nn degree/order tesserals. E.g. EGM-96
                 * 24Z,24T.
                 */
                fun geopotentialModel(geopotentialModel: String) =
                    geopotentialModel(JsonField.of(geopotentialModel))

                /**
                 * Sets [Builder.geopotentialModel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geopotentialModel] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun geopotentialModel(geopotentialModel: JsonField<String>) = apply {
                    this.geopotentialModel = geopotentialModel
                }

                /** Number of terms used in the IAU 1980 nutation model (4, 50, or 106). */
                fun iau1980Terms(iau1980Terms: Int) = iau1980Terms(JsonField.of(iau1980Terms))

                /**
                 * Sets [Builder.iau1980Terms] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.iau1980Terms] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun iau1980Terms(iau1980Terms: JsonField<Int>) = apply {
                    this.iau1980Terms = iau1980Terms
                }

                /**
                 * Unique identifier of the satellite on-orbit object, if correlated. For the public
                 * catalog, the idOnOrbit is typically the satellite number as a string, but may be
                 * a UUID for analyst or other unknown or untracked satellites.
                 */
                fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

                /**
                 * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idOnOrbit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

                /**
                 * Unique identifier of the OD solution record that produced this state vector. This
                 * ID can be used to obtain additional information on an OrbitDetermination object
                 * using the 'get by ID' operation (e.g. /udl/orbitdetermination/{id}). For example,
                 * the OrbitDetermination with idOrbitDetermination = abc would be queries as
                 * /udl/orbitdetermination/abc.
                 */
                fun idOrbitDetermination(idOrbitDetermination: String) =
                    idOrbitDetermination(JsonField.of(idOrbitDetermination))

                /**
                 * Sets [Builder.idOrbitDetermination] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.idOrbitDetermination] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun idOrbitDetermination(idOrbitDetermination: JsonField<String>) = apply {
                    this.idOrbitDetermination = idOrbitDetermination
                }

                /** Unique identifier of the record, auto-generated by the system. */
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

                /** Integrator Mode. */
                fun integratorMode(integratorMode: String) =
                    integratorMode(JsonField.of(integratorMode))

                /**
                 * Sets [Builder.integratorMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.integratorMode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun integratorMode(integratorMode: JsonField<String>) = apply {
                    this.integratorMode = integratorMode
                }

                /** Boolean indicating use of in-track thrust perturbations for this vector. */
                fun inTrackThrust(inTrackThrust: Boolean) =
                    inTrackThrust(JsonField.of(inTrackThrust))

                /**
                 * Sets [Builder.inTrackThrust] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.inTrackThrust] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun inTrackThrust(inTrackThrust: JsonField<Boolean>) = apply {
                    this.inTrackThrust = inTrackThrust
                }

                /**
                 * The end of the time interval containing the time of the last accepted
                 * observation, in ISO 8601 UTC format with microsecond precision. For an exact
                 * observation time, the firstObTime and lastObTime are the same.
                 */
                fun lastObEnd(lastObEnd: OffsetDateTime) = lastObEnd(JsonField.of(lastObEnd))

                /**
                 * Sets [Builder.lastObEnd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastObEnd] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun lastObEnd(lastObEnd: JsonField<OffsetDateTime>) = apply {
                    this.lastObEnd = lastObEnd
                }

                /**
                 * The start of the time interval containing the time of the last accepted
                 * observation, in ISO 8601 UTC format with microsecond precision. For an exact
                 * observation time, the firstObTime and lastObTime are the same.
                 */
                fun lastObStart(lastObStart: OffsetDateTime) =
                    lastObStart(JsonField.of(lastObStart))

                /**
                 * Sets [Builder.lastObStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastObStart] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun lastObStart(lastObStart: JsonField<OffsetDateTime>) = apply {
                    this.lastObStart = lastObStart
                }

                /**
                 * Time of the next leap second after epoch in ISO 8601 UTC time. If the next leap
                 * second is not known, the time of the previous leap second is used.
                 */
                fun leapSecondTime(leapSecondTime: OffsetDateTime) =
                    leapSecondTime(JsonField.of(leapSecondTime))

                /**
                 * Sets [Builder.leapSecondTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.leapSecondTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun leapSecondTime(leapSecondTime: JsonField<OffsetDateTime>) = apply {
                    this.leapSecondTime = leapSecondTime
                }

                /** Boolean indicating use of lunar/solar perturbations for this vector. */
                fun lunarSolar(lunarSolar: Boolean) = lunarSolar(JsonField.of(lunarSolar))

                /**
                 * Sets [Builder.lunarSolar] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lunarSolar] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lunarSolar(lunarSolar: JsonField<Boolean>) = apply {
                    this.lunarSolar = lunarSolar
                }

                /** The mass of the object, in kilograms. */
                fun mass(mass: Double) = mass(JsonField.of(mass))

                /**
                 * Sets [Builder.mass] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mass] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun mass(mass: JsonField<Double>) = apply { this.mass = mass }

                /** The number of observations available for the OD of the object. */
                fun obsAvailable(obsAvailable: Int) = obsAvailable(JsonField.of(obsAvailable))

                /**
                 * Sets [Builder.obsAvailable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.obsAvailable] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun obsAvailable(obsAvailable: JsonField<Int>) = apply {
                    this.obsAvailable = obsAvailable
                }

                /** The number of observations accepted for the OD of the object. */
                fun obsUsed(obsUsed: Int) = obsUsed(JsonField.of(obsUsed))

                /**
                 * Sets [Builder.obsUsed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.obsUsed] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun obsUsed(obsUsed: JsonField<Int>) = apply { this.obsUsed = obsUsed }

                /**
                 * Originating system or organization which produced the data, if different from the
                 * source. The origin may be different than the source if the source was a mediating
                 * system which forwarded the data on behalf of the origin system. If null, the
                 * source may be assumed to be the origin.
                 */
                fun origin(origin: String) = origin(JsonField.of(origin))

                /**
                 * Sets [Builder.origin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origin] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origin(origin: JsonField<String>) = apply { this.origin = origin }

                /**
                 * The originating source network on which this record was created, auto-populated
                 * by the system.
                 */
                fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

                /**
                 * Sets [Builder.origNetwork] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origNetwork] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origNetwork(origNetwork: JsonField<String>) = apply {
                    this.origNetwork = origNetwork
                }

                /**
                 * Optional identifier provided by state vector source to indicate the target
                 * onorbit object of this state vector. This may be an internal identifier and not
                 * necessarily map to a valid satellite number.
                 */
                fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

                /**
                 * Sets [Builder.origObjectId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.origObjectId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun origObjectId(origObjectId: JsonField<String>) = apply {
                    this.origObjectId = origObjectId
                }

                /** Type of partial derivatives used (ANALYTIC, FULL NUM, or FAST NUM). */
                fun partials(partials: String) = partials(JsonField.of(partials))

                /**
                 * Sets [Builder.partials] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partials] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun partials(partials: JsonField<String>) = apply { this.partials = partials }

                /**
                 * The pedigree of state vector, or methods used for its generation to include state
                 * update/orbit determination, propagation from another state, or a state from a
                 * calibration satellite (e.g. ORBIT_UPDATE, PROPAGATION, CALIBRATION, CONJUNCTION,
                 * FLIGHT_PLAN).
                 */
                fun pedigree(pedigree: String) = pedigree(JsonField.of(pedigree))

                /**
                 * Sets [Builder.pedigree] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pedigree] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pedigree(pedigree: JsonField<String>) = apply { this.pedigree = pedigree }

                /** Polar Wander Motion X (arc seconds). */
                fun polarMotionX(polarMotionX: Double) = polarMotionX(JsonField.of(polarMotionX))

                /**
                 * Sets [Builder.polarMotionX] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.polarMotionX] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun polarMotionX(polarMotionX: JsonField<Double>) = apply {
                    this.polarMotionX = polarMotionX
                }

                /** Polar Wander Motion Y (arc seconds). */
                fun polarMotionY(polarMotionY: Double) = polarMotionY(JsonField.of(polarMotionY))

                /**
                 * Sets [Builder.polarMotionY] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.polarMotionY] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun polarMotionY(polarMotionY: JsonField<Double>) = apply {
                    this.polarMotionY = polarMotionY
                }

                /** One sigma position uncertainty, in kilometers. */
                fun posUnc(posUnc: Double) = posUnc(JsonField.of(posUnc))

                /**
                 * Sets [Builder.posUnc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.posUnc] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun posUnc(posUnc: JsonField<Double>) = apply { this.posUnc = posUnc }

                /**
                 * Optional URI location in the document repository of the raw file parsed by the
                 * system to produce this record. To download the raw file, prepend
                 * https://udl-hostname/scs/download?id= to this value.
                 */
                fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

                /**
                 * Sets [Builder.rawFileUri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rawFileUri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rawFileUri(rawFileUri: JsonField<String>) = apply {
                    this.rawFileUri = rawFileUri
                }

                /** The recommended OD time span calculated for the object, expressed in days. */
                fun recOdSpan(recOdSpan: Double) = recOdSpan(JsonField.of(recOdSpan))

                /**
                 * Sets [Builder.recOdSpan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recOdSpan] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recOdSpan(recOdSpan: JsonField<Double>) = apply { this.recOdSpan = recOdSpan }

                /**
                 * The reference frame of the cartesian orbital states. If the referenceFrame is
                 * null it is assumed to be J2000.
                 */
                fun referenceFrame(referenceFrame: ReferenceFrame) =
                    referenceFrame(JsonField.of(referenceFrame))

                /**
                 * Sets [Builder.referenceFrame] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.referenceFrame] with a well-typed
                 * [ReferenceFrame] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun referenceFrame(referenceFrame: JsonField<ReferenceFrame>) = apply {
                    this.referenceFrame = referenceFrame
                }

                /** The percentage of residuals accepted in the OD of the object. */
                fun residualsAcc(residualsAcc: Double) = residualsAcc(JsonField.of(residualsAcc))

                /**
                 * Sets [Builder.residualsAcc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.residualsAcc] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun residualsAcc(residualsAcc: JsonField<Double>) = apply {
                    this.residualsAcc = residualsAcc
                }

                /** Epoch revolution number. */
                fun revNo(revNo: Int) = revNo(JsonField.of(revNo))

                /**
                 * Sets [Builder.revNo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revNo] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun revNo(revNo: JsonField<Int>) = apply { this.revNo = revNo }

                /**
                 * The Weighted Root Mean Squared (RMS) of the differential correction on the target
                 * object that produced this vector. WRMS is a quality indicator of the state vector
                 * update, with a value of 1.00 being optimal. WRMS applies to Batch Least Squares
                 * (BLS) processes.
                 */
                fun rms(rms: Double) = rms(JsonField.of(rms))

                /**
                 * Sets [Builder.rms] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rms] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rms(rms: JsonField<Double>) = apply { this.rms = rms }

                /** Satellite/Catalog number of the target OnOrbit object. */
                fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

                /**
                 * Sets [Builder.satNo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.satNo] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

                /**
                 * Array containing the standard deviation of error in target object position, U, V
                 * and W direction respectively (km).
                 */
                fun sigmaPosUvw(sigmaPosUvw: List<Double>) = sigmaPosUvw(JsonField.of(sigmaPosUvw))

                /**
                 * Sets [Builder.sigmaPosUvw] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sigmaPosUvw] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sigmaPosUvw(sigmaPosUvw: JsonField<List<Double>>) = apply {
                    this.sigmaPosUvw = sigmaPosUvw.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.sigmaPosUvw].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSigmaPosUvw(sigmaPosUvw: Double) = apply {
                    this.sigmaPosUvw =
                        (this.sigmaPosUvw ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sigmaPosUvw", it).add(sigmaPosUvw)
                        }
                }

                /**
                 * Array containing the standard deviation of error in target object velocity, U, V
                 * and W direction respectively (km/sec).
                 */
                fun sigmaVelUvw(sigmaVelUvw: List<Double>) = sigmaVelUvw(JsonField.of(sigmaVelUvw))

                /**
                 * Sets [Builder.sigmaVelUvw] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sigmaVelUvw] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sigmaVelUvw(sigmaVelUvw: JsonField<List<Double>>) = apply {
                    this.sigmaVelUvw = sigmaVelUvw.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.sigmaVelUvw].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSigmaVelUvw(sigmaVelUvw: Double) = apply {
                    this.sigmaVelUvw =
                        (this.sigmaVelUvw ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sigmaVelUvw", it).add(sigmaVelUvw)
                        }
                }

                /** Average solar flux geomagnetic index. */
                fun solarFluxApAvg(solarFluxApAvg: Double) =
                    solarFluxApAvg(JsonField.of(solarFluxApAvg))

                /**
                 * Sets [Builder.solarFluxApAvg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solarFluxApAvg] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solarFluxApAvg(solarFluxApAvg: JsonField<Double>) = apply {
                    this.solarFluxApAvg = solarFluxApAvg
                }

                /** F10 (10.7 cm) solar flux value. */
                fun solarFluxF10(solarFluxF10: Double) = solarFluxF10(JsonField.of(solarFluxF10))

                /**
                 * Sets [Builder.solarFluxF10] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solarFluxF10] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solarFluxF10(solarFluxF10: JsonField<Double>) = apply {
                    this.solarFluxF10 = solarFluxF10
                }

                /** F10 (10.7 cm) solar flux 81-day average value. */
                fun solarFluxF10Avg(solarFluxF10Avg: Double) =
                    solarFluxF10Avg(JsonField.of(solarFluxF10Avg))

                /**
                 * Sets [Builder.solarFluxF10Avg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solarFluxF10Avg] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun solarFluxF10Avg(solarFluxF10Avg: JsonField<Double>) = apply {
                    this.solarFluxF10Avg = solarFluxF10Avg
                }

                /**
                 * Boolean indicating use of solar radiation pressure perturbations for this vector.
                 */
                fun solarRadPress(solarRadPress: Boolean) =
                    solarRadPress(JsonField.of(solarRadPress))

                /**
                 * Sets [Builder.solarRadPress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solarRadPress] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun solarRadPress(solarRadPress: JsonField<Boolean>) = apply {
                    this.solarRadPress = solarRadPress
                }

                /** Area-to-mass ratio coefficient for solar radiation pressure. */
                fun solarRadPressCoeff(solarRadPressCoeff: Double) =
                    solarRadPressCoeff(JsonField.of(solarRadPressCoeff))

                /**
                 * Sets [Builder.solarRadPressCoeff] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solarRadPressCoeff] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun solarRadPressCoeff(solarRadPressCoeff: JsonField<Double>) = apply {
                    this.solarRadPressCoeff = solarRadPressCoeff
                }

                /** Boolean indicating use of solid earth tide perturbations for this vector. */
                fun solidEarthTides(solidEarthTides: Boolean) =
                    solidEarthTides(JsonField.of(solidEarthTides))

                /**
                 * Sets [Builder.solidEarthTides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.solidEarthTides] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun solidEarthTides(solidEarthTides: JsonField<Boolean>) = apply {
                    this.solidEarthTides = solidEarthTides
                }

                /**
                 * Optional array of UDL data (observation) UUIDs used to build this state vector.
                 * See the associated sourcedDataTypes array for the specific types of observations
                 * for the positionally corresponding UUIDs in this array (the two arrays must match
                 * in size).
                 */
                fun sourcedData(sourcedData: List<String>) = sourcedData(JsonField.of(sourcedData))

                /**
                 * Sets [Builder.sourcedData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourcedData] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun sourcedData(sourcedData: JsonField<List<String>>) = apply {
                    this.sourcedData = sourcedData.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.sourcedData].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSourcedData(sourcedData: String) = apply {
                    this.sourcedData =
                        (this.sourcedData ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sourcedData", it).add(sourcedData)
                        }
                }

                /**
                 * Optional array of UDL observation data types used to build this state vector
                 * (e.g. EO, RADAR, RF, DOA). See the associated sourcedData array for the specific
                 * UUIDs of observations for the positionally corresponding data types in this array
                 * (the two arrays must match in size).
                 */
                fun sourcedDataTypes(sourcedDataTypes: List<SourcedDataType>) =
                    sourcedDataTypes(JsonField.of(sourcedDataTypes))

                /**
                 * Sets [Builder.sourcedDataTypes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourcedDataTypes] with a well-typed
                 * `List<SourcedDataType>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun sourcedDataTypes(sourcedDataTypes: JsonField<List<SourcedDataType>>) = apply {
                    this.sourcedDataTypes = sourcedDataTypes.map { it.toMutableList() }
                }

                /**
                 * Adds a single [SourcedDataType] to [sourcedDataTypes].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSourcedDataType(sourcedDataType: SourcedDataType) = apply {
                    sourcedDataTypes =
                        (sourcedDataTypes ?: JsonField.of(mutableListOf())).also {
                            checkKnown("sourcedDataTypes", it).add(sourcedDataType)
                        }
                }

                /**
                 * The source data library from which this record was received. This could be a
                 * remote or tactical UDL or another data library. If null, the record should be
                 * assumed to have originated from the primary Enterprise UDL.
                 */
                fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

                /**
                 * Sets [Builder.sourceDl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceDl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

                /**
                 * The effective area of the object exposed to solar radiation pressure, expressed
                 * in meters^2.
                 */
                fun srpArea(srpArea: Double) = srpArea(JsonField.of(srpArea))

                /**
                 * Sets [Builder.srpArea] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.srpArea] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun srpArea(srpArea: JsonField<Double>) = apply { this.srpArea = srpArea }

                /** Integrator step mode (AUTO, TIME, or S). */
                fun stepMode(stepMode: String) = stepMode(JsonField.of(stepMode))

                /**
                 * Sets [Builder.stepMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stepMode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stepMode(stepMode: JsonField<String>) = apply { this.stepMode = stepMode }

                /** Initial integration step size (seconds). */
                fun stepSize(stepSize: Double) = stepSize(JsonField.of(stepSize))

                /**
                 * Sets [Builder.stepSize] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stepSize] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stepSize(stepSize: JsonField<Double>) = apply { this.stepSize = stepSize }

                /** Initial step size selection (AUTO or MANUAL). */
                fun stepSizeSelection(stepSizeSelection: String) =
                    stepSizeSelection(JsonField.of(stepSizeSelection))

                /**
                 * Sets [Builder.stepSizeSelection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stepSizeSelection] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun stepSizeSelection(stepSizeSelection: JsonField<String>) = apply {
                    this.stepSizeSelection = stepSizeSelection
                }

                /**
                 * Optional array of provider/source specific tags for this data, where each element
                 * is no longer than 32 characters, used for implementing data owner conditional
                 * access controls to restrict access to the data. Should be left null by data
                 * providers unless conditional access controls are coordinated with the UDL team.
                 */
                fun tags(tags: List<String>) = tags(JsonField.of(tags))

                /**
                 * Sets [Builder.tags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tags] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                        (tags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tags", it).add(tag)
                        }
                }

                /**
                 * TAI (Temps Atomique International) minus UTC (Universal Time Coordinates) offset
                 * in seconds.
                 */
                fun taiUtc(taiUtc: Double) = taiUtc(JsonField.of(taiUtc))

                /**
                 * Sets [Builder.taiUtc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taiUtc] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taiUtc(taiUtc: JsonField<Double>) = apply { this.taiUtc = taiUtc }

                /** Model parameter value for thrust acceleration (m/s2). */
                fun thrustAccel(thrustAccel: Double) = thrustAccel(JsonField.of(thrustAccel))

                /**
                 * Sets [Builder.thrustAccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thrustAccel] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun thrustAccel(thrustAccel: JsonField<Double>) = apply {
                    this.thrustAccel = thrustAccel
                }

                /** The number of sensor tracks available for the OD of the object. */
                fun tracksAvail(tracksAvail: Int) = tracksAvail(JsonField.of(tracksAvail))

                /**
                 * Sets [Builder.tracksAvail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tracksAvail] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tracksAvail(tracksAvail: JsonField<Int>) = apply {
                    this.tracksAvail = tracksAvail
                }

                /** The number of sensor tracks accepted for the OD of the object. */
                fun tracksUsed(tracksUsed: Int) = tracksUsed(JsonField.of(tracksUsed))

                /**
                 * Sets [Builder.tracksUsed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tracksUsed] with a well-typed [Int] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tracksUsed(tracksUsed: JsonField<Int>) = apply { this.tracksUsed = tracksUsed }

                /**
                 * Optional identifier to track a commercial or marketplace transaction executed to
                 * produce this data.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * Sets [Builder.transactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * Boolean indicating this state vector was unable to be correlated to a known
                 * object. This flag should only be set to true by data providers after an attempt
                 * to correlate to an OnOrbit object was made and failed. If unable to correlate,
                 * the 'origObjectId' field may be populated with an internal data provider specific
                 * identifier.
                 */
                fun uct(uct: Boolean) = uct(JsonField.of(uct))

                /**
                 * Sets [Builder.uct] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uct] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

                /** Rate of change of UT1 (milliseconds/day) - first derivative of ut1Utc. */
                fun ut1Rate(ut1Rate: Double) = ut1Rate(JsonField.of(ut1Rate))

                /**
                 * Sets [Builder.ut1Rate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ut1Rate] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ut1Rate(ut1Rate: JsonField<Double>) = apply { this.ut1Rate = ut1Rate }

                /** Universal Time-1 (UT1) minus UTC offset, in seconds. */
                fun ut1Utc(ut1Utc: Double) = ut1Utc(JsonField.of(ut1Utc))

                /**
                 * Sets [Builder.ut1Utc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ut1Utc] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ut1Utc(ut1Utc: JsonField<Double>) = apply { this.ut1Utc = ut1Utc }

                /** One sigma velocity uncertainty, in kilometers/second. */
                fun velUnc(velUnc: Double) = velUnc(JsonField.of(velUnc))

                /**
                 * Sets [Builder.velUnc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.velUnc] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun velUnc(velUnc: JsonField<Double>) = apply { this.velUnc = velUnc }

                /**
                 * Cartesian X acceleration of target, in kilometers/second^2, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun xaccel(xaccel: Double) = xaccel(JsonField.of(xaccel))

                /**
                 * Sets [Builder.xaccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xaccel] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xaccel(xaccel: JsonField<Double>) = apply { this.xaccel = xaccel }

                /**
                 * Cartesian X position of the target, in kilometers, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun xpos(xpos: Double) = xpos(JsonField.of(xpos))

                /**
                 * Sets [Builder.xpos] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xpos] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun xpos(xpos: JsonField<Double>) = apply { this.xpos = xpos }

                /**
                 * Cartesian X position of the target, in kilometers, in the specified
                 * alt1ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun xposAlt1(xposAlt1: Double) = xposAlt1(JsonField.of(xposAlt1))

                /**
                 * Sets [Builder.xposAlt1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xposAlt1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xposAlt1(xposAlt1: JsonField<Double>) = apply { this.xposAlt1 = xposAlt1 }

                /**
                 * Cartesian X position of the target, in kilometers, in the specified
                 * alt2ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun xposAlt2(xposAlt2: Double) = xposAlt2(JsonField.of(xposAlt2))

                /**
                 * Sets [Builder.xposAlt2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xposAlt2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xposAlt2(xposAlt2: JsonField<Double>) = apply { this.xposAlt2 = xposAlt2 }

                /**
                 * Cartesian X velocity of target, in kilometers/second, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun xvel(xvel: Double) = xvel(JsonField.of(xvel))

                /**
                 * Sets [Builder.xvel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xvel] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun xvel(xvel: JsonField<Double>) = apply { this.xvel = xvel }

                /**
                 * Cartesian X velocity of the target, in kilometers/second, in the specified
                 * alt1ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun xvelAlt1(xvelAlt1: Double) = xvelAlt1(JsonField.of(xvelAlt1))

                /**
                 * Sets [Builder.xvelAlt1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xvelAlt1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xvelAlt1(xvelAlt1: JsonField<Double>) = apply { this.xvelAlt1 = xvelAlt1 }

                /**
                 * Cartesian X velocity of the target, in kilometers/second, in the specified
                 * alt2ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun xvelAlt2(xvelAlt2: Double) = xvelAlt2(JsonField.of(xvelAlt2))

                /**
                 * Sets [Builder.xvelAlt2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.xvelAlt2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun xvelAlt2(xvelAlt2: JsonField<Double>) = apply { this.xvelAlt2 = xvelAlt2 }

                /**
                 * Cartesian Y acceleration of target, in kilometers/second^2, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun yaccel(yaccel: Double) = yaccel(JsonField.of(yaccel))

                /**
                 * Sets [Builder.yaccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yaccel] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yaccel(yaccel: JsonField<Double>) = apply { this.yaccel = yaccel }

                /**
                 * Cartesian Y position of the target, in kilometers, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun ypos(ypos: Double) = ypos(JsonField.of(ypos))

                /**
                 * Sets [Builder.ypos] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ypos] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun ypos(ypos: JsonField<Double>) = apply { this.ypos = ypos }

                /**
                 * Cartesian Y position of the target, in kilometers, in the specified
                 * alt1ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun yposAlt1(yposAlt1: Double) = yposAlt1(JsonField.of(yposAlt1))

                /**
                 * Sets [Builder.yposAlt1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yposAlt1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yposAlt1(yposAlt1: JsonField<Double>) = apply { this.yposAlt1 = yposAlt1 }

                /**
                 * Cartesian Y position of the target, in kilometers, in the specified
                 * alt2ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun yposAlt2(yposAlt2: Double) = yposAlt2(JsonField.of(yposAlt2))

                /**
                 * Sets [Builder.yposAlt2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yposAlt2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yposAlt2(yposAlt2: JsonField<Double>) = apply { this.yposAlt2 = yposAlt2 }

                /**
                 * Cartesian Y velocity of target, in kilometers/second, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun yvel(yvel: Double) = yvel(JsonField.of(yvel))

                /**
                 * Sets [Builder.yvel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yvel] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun yvel(yvel: JsonField<Double>) = apply { this.yvel = yvel }

                /**
                 * Cartesian Y velocity of the target, in kilometers/second, in the specified
                 * alt1ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun yvelAlt1(yvelAlt1: Double) = yvelAlt1(JsonField.of(yvelAlt1))

                /**
                 * Sets [Builder.yvelAlt1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yvelAlt1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yvelAlt1(yvelAlt1: JsonField<Double>) = apply { this.yvelAlt1 = yvelAlt1 }

                /**
                 * Cartesian Y velocity of the target, in kilometers/second, in the specified
                 * alt2ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun yvelAlt2(yvelAlt2: Double) = yvelAlt2(JsonField.of(yvelAlt2))

                /**
                 * Sets [Builder.yvelAlt2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.yvelAlt2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun yvelAlt2(yvelAlt2: JsonField<Double>) = apply { this.yvelAlt2 = yvelAlt2 }

                /**
                 * Cartesian Z acceleration of target, in kilometers/second^2, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun zaccel(zaccel: Double) = zaccel(JsonField.of(zaccel))

                /**
                 * Sets [Builder.zaccel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zaccel] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zaccel(zaccel: JsonField<Double>) = apply { this.zaccel = zaccel }

                /**
                 * Cartesian Z position of the target, in kilometers, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun zpos(zpos: Double) = zpos(JsonField.of(zpos))

                /**
                 * Sets [Builder.zpos] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zpos] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun zpos(zpos: JsonField<Double>) = apply { this.zpos = zpos }

                /**
                 * Cartesian Z position of the target, in kilometers, in the specified
                 * alt1ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun zposAlt1(zposAlt1: Double) = zposAlt1(JsonField.of(zposAlt1))

                /**
                 * Sets [Builder.zposAlt1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zposAlt1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zposAlt1(zposAlt1: JsonField<Double>) = apply { this.zposAlt1 = zposAlt1 }

                /**
                 * Cartesian Z position of the target, in kilometers, in the specified
                 * alt2ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun zposAlt2(zposAlt2: Double) = zposAlt2(JsonField.of(zposAlt2))

                /**
                 * Sets [Builder.zposAlt2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zposAlt2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zposAlt2(zposAlt2: JsonField<Double>) = apply { this.zposAlt2 = zposAlt2 }

                /**
                 * Cartesian Z velocity of target, in kilometers/second, in the specified
                 * referenceFrame. If referenceFrame is null then J2K should be assumed.
                 */
                fun zvel(zvel: Double) = zvel(JsonField.of(zvel))

                /**
                 * Sets [Builder.zvel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zvel] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun zvel(zvel: JsonField<Double>) = apply { this.zvel = zvel }

                /**
                 * Cartesian Z velocity of the target, in kilometers/second, in the specified
                 * alt1ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun zvelAlt1(zvelAlt1: Double) = zvelAlt1(JsonField.of(zvelAlt1))

                /**
                 * Sets [Builder.zvelAlt1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zvelAlt1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zvelAlt1(zvelAlt1: JsonField<Double>) = apply { this.zvelAlt1 = zvelAlt1 }

                /**
                 * Cartesian Z velocity of the target, in kilometers/second, in the specified
                 * alt2ReferenceFrame. Alternate reference frames are optional and are intended to
                 * allow a data source to provide an equivalent vector in a different cartesian
                 * frame than the primary vector.
                 */
                fun zvelAlt2(zvelAlt2: Double) = zvelAlt2(JsonField.of(zvelAlt2))

                /**
                 * Sets [Builder.zvelAlt2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zvelAlt2] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun zvelAlt2(zvelAlt2: JsonField<Double>) = apply { this.zvelAlt2 = zvelAlt2 }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [StateVector].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .classificationMarking()
                 * .dataMode()
                 * .epoch()
                 * .source()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): StateVector =
                    StateVector(
                        checkRequired("classificationMarking", classificationMarking),
                        checkRequired("dataMode", dataMode),
                        checkRequired("epoch", epoch),
                        checkRequired("source", source),
                        actualOdSpan,
                        algorithm,
                        alt1ReferenceFrame,
                        alt2ReferenceFrame,
                        area,
                        bDot,
                        cmOffset,
                        (cov ?: JsonMissing.of()).map { it.toImmutable() },
                        covMethod,
                        covReferenceFrame,
                        createdAt,
                        createdBy,
                        descriptor,
                        dragArea,
                        dragCoeff,
                        dragModel,
                        edr,
                        (eqCov ?: JsonMissing.of()).map { it.toImmutable() },
                        errorControl,
                        fixedStep,
                        geopotentialModel,
                        iau1980Terms,
                        idOnOrbit,
                        idOrbitDetermination,
                        idStateVector,
                        integratorMode,
                        inTrackThrust,
                        lastObEnd,
                        lastObStart,
                        leapSecondTime,
                        lunarSolar,
                        mass,
                        obsAvailable,
                        obsUsed,
                        origin,
                        origNetwork,
                        origObjectId,
                        partials,
                        pedigree,
                        polarMotionX,
                        polarMotionY,
                        posUnc,
                        rawFileUri,
                        recOdSpan,
                        referenceFrame,
                        residualsAcc,
                        revNo,
                        rms,
                        satNo,
                        (sigmaPosUvw ?: JsonMissing.of()).map { it.toImmutable() },
                        (sigmaVelUvw ?: JsonMissing.of()).map { it.toImmutable() },
                        solarFluxApAvg,
                        solarFluxF10,
                        solarFluxF10Avg,
                        solarRadPress,
                        solarRadPressCoeff,
                        solidEarthTides,
                        (sourcedData ?: JsonMissing.of()).map { it.toImmutable() },
                        (sourcedDataTypes ?: JsonMissing.of()).map { it.toImmutable() },
                        sourceDl,
                        srpArea,
                        stepMode,
                        stepSize,
                        stepSizeSelection,
                        (tags ?: JsonMissing.of()).map { it.toImmutable() },
                        taiUtc,
                        thrustAccel,
                        tracksAvail,
                        tracksUsed,
                        transactionId,
                        uct,
                        ut1Rate,
                        ut1Utc,
                        velUnc,
                        xaccel,
                        xpos,
                        xposAlt1,
                        xposAlt2,
                        xvel,
                        xvelAlt1,
                        xvelAlt2,
                        yaccel,
                        ypos,
                        yposAlt1,
                        yposAlt2,
                        yvel,
                        yvelAlt1,
                        yvelAlt2,
                        zaccel,
                        zpos,
                        zposAlt1,
                        zposAlt2,
                        zvel,
                        zvelAlt1,
                        zvelAlt2,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): StateVector = apply {
                if (validated) {
                    return@apply
                }

                classificationMarking()
                dataMode().validate()
                epoch()
                source()
                actualOdSpan()
                algorithm()
                alt1ReferenceFrame()
                alt2ReferenceFrame()
                area()
                bDot()
                cmOffset()
                cov()
                covMethod()
                covReferenceFrame().ifPresent { it.validate() }
                createdAt()
                createdBy()
                descriptor()
                dragArea()
                dragCoeff()
                dragModel()
                edr()
                eqCov()
                errorControl()
                fixedStep()
                geopotentialModel()
                iau1980Terms()
                idOnOrbit()
                idOrbitDetermination()
                idStateVector()
                integratorMode()
                inTrackThrust()
                lastObEnd()
                lastObStart()
                leapSecondTime()
                lunarSolar()
                mass()
                obsAvailable()
                obsUsed()
                origin()
                origNetwork()
                origObjectId()
                partials()
                pedigree()
                polarMotionX()
                polarMotionY()
                posUnc()
                rawFileUri()
                recOdSpan()
                referenceFrame().ifPresent { it.validate() }
                residualsAcc()
                revNo()
                rms()
                satNo()
                sigmaPosUvw()
                sigmaVelUvw()
                solarFluxApAvg()
                solarFluxF10()
                solarFluxF10Avg()
                solarRadPress()
                solarRadPressCoeff()
                solidEarthTides()
                sourcedData()
                sourcedDataTypes().ifPresent { it.forEach { it.validate() } }
                sourceDl()
                srpArea()
                stepMode()
                stepSize()
                stepSizeSelection()
                tags()
                taiUtc()
                thrustAccel()
                tracksAvail()
                tracksUsed()
                transactionId()
                uct()
                ut1Rate()
                ut1Utc()
                velUnc()
                xaccel()
                xpos()
                xposAlt1()
                xposAlt2()
                xvel()
                xvelAlt1()
                xvelAlt2()
                yaccel()
                ypos()
                yposAlt1()
                yposAlt2()
                yvel()
                yvelAlt1()
                yvelAlt2()
                zaccel()
                zpos()
                zposAlt1()
                zposAlt2()
                zvel()
                zvelAlt1()
                zvelAlt2()
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
                    (if (epoch.asKnown().isPresent) 1 else 0) +
                    (if (source.asKnown().isPresent) 1 else 0) +
                    (if (actualOdSpan.asKnown().isPresent) 1 else 0) +
                    (if (algorithm.asKnown().isPresent) 1 else 0) +
                    (if (alt1ReferenceFrame.asKnown().isPresent) 1 else 0) +
                    (if (alt2ReferenceFrame.asKnown().isPresent) 1 else 0) +
                    (if (area.asKnown().isPresent) 1 else 0) +
                    (if (bDot.asKnown().isPresent) 1 else 0) +
                    (if (cmOffset.asKnown().isPresent) 1 else 0) +
                    (cov.asKnown().getOrNull()?.size ?: 0) +
                    (if (covMethod.asKnown().isPresent) 1 else 0) +
                    (covReferenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (createdBy.asKnown().isPresent) 1 else 0) +
                    (if (descriptor.asKnown().isPresent) 1 else 0) +
                    (if (dragArea.asKnown().isPresent) 1 else 0) +
                    (if (dragCoeff.asKnown().isPresent) 1 else 0) +
                    (if (dragModel.asKnown().isPresent) 1 else 0) +
                    (if (edr.asKnown().isPresent) 1 else 0) +
                    (eqCov.asKnown().getOrNull()?.size ?: 0) +
                    (if (errorControl.asKnown().isPresent) 1 else 0) +
                    (if (fixedStep.asKnown().isPresent) 1 else 0) +
                    (if (geopotentialModel.asKnown().isPresent) 1 else 0) +
                    (if (iau1980Terms.asKnown().isPresent) 1 else 0) +
                    (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                    (if (idOrbitDetermination.asKnown().isPresent) 1 else 0) +
                    (if (idStateVector.asKnown().isPresent) 1 else 0) +
                    (if (integratorMode.asKnown().isPresent) 1 else 0) +
                    (if (inTrackThrust.asKnown().isPresent) 1 else 0) +
                    (if (lastObEnd.asKnown().isPresent) 1 else 0) +
                    (if (lastObStart.asKnown().isPresent) 1 else 0) +
                    (if (leapSecondTime.asKnown().isPresent) 1 else 0) +
                    (if (lunarSolar.asKnown().isPresent) 1 else 0) +
                    (if (mass.asKnown().isPresent) 1 else 0) +
                    (if (obsAvailable.asKnown().isPresent) 1 else 0) +
                    (if (obsUsed.asKnown().isPresent) 1 else 0) +
                    (if (origin.asKnown().isPresent) 1 else 0) +
                    (if (origNetwork.asKnown().isPresent) 1 else 0) +
                    (if (origObjectId.asKnown().isPresent) 1 else 0) +
                    (if (partials.asKnown().isPresent) 1 else 0) +
                    (if (pedigree.asKnown().isPresent) 1 else 0) +
                    (if (polarMotionX.asKnown().isPresent) 1 else 0) +
                    (if (polarMotionY.asKnown().isPresent) 1 else 0) +
                    (if (posUnc.asKnown().isPresent) 1 else 0) +
                    (if (rawFileUri.asKnown().isPresent) 1 else 0) +
                    (if (recOdSpan.asKnown().isPresent) 1 else 0) +
                    (referenceFrame.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (residualsAcc.asKnown().isPresent) 1 else 0) +
                    (if (revNo.asKnown().isPresent) 1 else 0) +
                    (if (rms.asKnown().isPresent) 1 else 0) +
                    (if (satNo.asKnown().isPresent) 1 else 0) +
                    (sigmaPosUvw.asKnown().getOrNull()?.size ?: 0) +
                    (sigmaVelUvw.asKnown().getOrNull()?.size ?: 0) +
                    (if (solarFluxApAvg.asKnown().isPresent) 1 else 0) +
                    (if (solarFluxF10.asKnown().isPresent) 1 else 0) +
                    (if (solarFluxF10Avg.asKnown().isPresent) 1 else 0) +
                    (if (solarRadPress.asKnown().isPresent) 1 else 0) +
                    (if (solarRadPressCoeff.asKnown().isPresent) 1 else 0) +
                    (if (solidEarthTides.asKnown().isPresent) 1 else 0) +
                    (sourcedData.asKnown().getOrNull()?.size ?: 0) +
                    (sourcedDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (sourceDl.asKnown().isPresent) 1 else 0) +
                    (if (srpArea.asKnown().isPresent) 1 else 0) +
                    (if (stepMode.asKnown().isPresent) 1 else 0) +
                    (if (stepSize.asKnown().isPresent) 1 else 0) +
                    (if (stepSizeSelection.asKnown().isPresent) 1 else 0) +
                    (tags.asKnown().getOrNull()?.size ?: 0) +
                    (if (taiUtc.asKnown().isPresent) 1 else 0) +
                    (if (thrustAccel.asKnown().isPresent) 1 else 0) +
                    (if (tracksAvail.asKnown().isPresent) 1 else 0) +
                    (if (tracksUsed.asKnown().isPresent) 1 else 0) +
                    (if (transactionId.asKnown().isPresent) 1 else 0) +
                    (if (uct.asKnown().isPresent) 1 else 0) +
                    (if (ut1Rate.asKnown().isPresent) 1 else 0) +
                    (if (ut1Utc.asKnown().isPresent) 1 else 0) +
                    (if (velUnc.asKnown().isPresent) 1 else 0) +
                    (if (xaccel.asKnown().isPresent) 1 else 0) +
                    (if (xpos.asKnown().isPresent) 1 else 0) +
                    (if (xposAlt1.asKnown().isPresent) 1 else 0) +
                    (if (xposAlt2.asKnown().isPresent) 1 else 0) +
                    (if (xvel.asKnown().isPresent) 1 else 0) +
                    (if (xvelAlt1.asKnown().isPresent) 1 else 0) +
                    (if (xvelAlt2.asKnown().isPresent) 1 else 0) +
                    (if (yaccel.asKnown().isPresent) 1 else 0) +
                    (if (ypos.asKnown().isPresent) 1 else 0) +
                    (if (yposAlt1.asKnown().isPresent) 1 else 0) +
                    (if (yposAlt2.asKnown().isPresent) 1 else 0) +
                    (if (yvel.asKnown().isPresent) 1 else 0) +
                    (if (yvelAlt1.asKnown().isPresent) 1 else 0) +
                    (if (yvelAlt2.asKnown().isPresent) 1 else 0) +
                    (if (zaccel.asKnown().isPresent) 1 else 0) +
                    (if (zpos.asKnown().isPresent) 1 else 0) +
                    (if (zposAlt1.asKnown().isPresent) 1 else 0) +
                    (if (zposAlt2.asKnown().isPresent) 1 else 0) +
                    (if (zvel.asKnown().isPresent) 1 else 0) +
                    (if (zvelAlt1.asKnown().isPresent) 1 else 0) +
                    (if (zvelAlt2.asKnown().isPresent) 1 else 0)

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
            class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    REAL,
                    TEST,
                    SIMULATED,
                    EXERCISE,
                    /**
                     * An enum member indicating that [DataMode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        REAL -> Known.REAL
                        TEST -> Known.TEST
                        SIMULATED -> Known.SIMULATED
                        EXERCISE -> Known.EXERCISE
                        else ->
                            throw UnifieddatalibraryInvalidDataException("Unknown DataMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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
             * The reference frame of the covariance matrix elements. If the covReferenceFrame is
             * null it is assumed to be J2000.
             */
            class CovReferenceFrame
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val J2000 = of("J2000")

                    @JvmField val UVW = of("UVW")

                    @JvmField val EFG_TDR = of("EFG/TDR")

                    @JvmField val TEME = of("TEME")

                    @JvmField val GCRF = of("GCRF")

                    @JvmStatic fun of(value: String) = CovReferenceFrame(JsonField.of(value))
                }

                /** An enum containing [CovReferenceFrame]'s known values. */
                enum class Known {
                    J2000,
                    UVW,
                    EFG_TDR,
                    TEME,
                    GCRF,
                }

                /**
                 * An enum containing [CovReferenceFrame]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [CovReferenceFrame] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    J2000,
                    UVW,
                    EFG_TDR,
                    TEME,
                    GCRF,
                    /**
                     * An enum member indicating that [CovReferenceFrame] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        J2000 -> Value.J2000
                        UVW -> Value.UVW
                        EFG_TDR -> Value.EFG_TDR
                        TEME -> Value.TEME
                        GCRF -> Value.GCRF
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        J2000 -> Known.J2000
                        UVW -> Known.UVW
                        EFG_TDR -> Known.EFG_TDR
                        TEME -> Known.TEME
                        GCRF -> Known.GCRF
                        else ->
                            throw UnifieddatalibraryInvalidDataException(
                                "Unknown CovReferenceFrame: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        UnifieddatalibraryInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): CovReferenceFrame = apply {
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

                    return other is CovReferenceFrame && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The reference frame of the cartesian orbital states. If the referenceFrame is null it
             * is assumed to be J2000.
             */
            class ReferenceFrame
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * An enum containing [ReferenceFrame]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ReferenceFrame] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [ReferenceFrame] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
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
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
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

            class SourcedDataType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val EO = of("EO")

                    @JvmField val RADAR = of("RADAR")

                    @JvmField val RF = of("RF")

                    @JvmField val DOA = of("DOA")

                    @JvmField val ELSET = of("ELSET")

                    @JvmField val SV = of("SV")

                    @JvmStatic fun of(value: String) = SourcedDataType(JsonField.of(value))
                }

                /** An enum containing [SourcedDataType]'s known values. */
                enum class Known {
                    EO,
                    RADAR,
                    RF,
                    DOA,
                    ELSET,
                    SV,
                }

                /**
                 * An enum containing [SourcedDataType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [SourcedDataType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EO,
                    RADAR,
                    RF,
                    DOA,
                    ELSET,
                    SV,
                    /**
                     * An enum member indicating that [SourcedDataType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EO -> Value.EO
                        RADAR -> Value.RADAR
                        RF -> Value.RF
                        DOA -> Value.DOA
                        ELSET -> Value.ELSET
                        SV -> Value.SV
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        EO -> Known.EO
                        RADAR -> Known.RADAR
                        RF -> Known.RF
                        DOA -> Known.DOA
                        ELSET -> Known.ELSET
                        SV -> Known.SV
                        else ->
                            throw UnifieddatalibraryInvalidDataException(
                                "Unknown SourcedDataType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        UnifieddatalibraryInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): SourcedDataType = apply {
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

                    return other is SourcedDataType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StateVector &&
                    classificationMarking == other.classificationMarking &&
                    dataMode == other.dataMode &&
                    epoch == other.epoch &&
                    source == other.source &&
                    actualOdSpan == other.actualOdSpan &&
                    algorithm == other.algorithm &&
                    alt1ReferenceFrame == other.alt1ReferenceFrame &&
                    alt2ReferenceFrame == other.alt2ReferenceFrame &&
                    area == other.area &&
                    bDot == other.bDot &&
                    cmOffset == other.cmOffset &&
                    cov == other.cov &&
                    covMethod == other.covMethod &&
                    covReferenceFrame == other.covReferenceFrame &&
                    createdAt == other.createdAt &&
                    createdBy == other.createdBy &&
                    descriptor == other.descriptor &&
                    dragArea == other.dragArea &&
                    dragCoeff == other.dragCoeff &&
                    dragModel == other.dragModel &&
                    edr == other.edr &&
                    eqCov == other.eqCov &&
                    errorControl == other.errorControl &&
                    fixedStep == other.fixedStep &&
                    geopotentialModel == other.geopotentialModel &&
                    iau1980Terms == other.iau1980Terms &&
                    idOnOrbit == other.idOnOrbit &&
                    idOrbitDetermination == other.idOrbitDetermination &&
                    idStateVector == other.idStateVector &&
                    integratorMode == other.integratorMode &&
                    inTrackThrust == other.inTrackThrust &&
                    lastObEnd == other.lastObEnd &&
                    lastObStart == other.lastObStart &&
                    leapSecondTime == other.leapSecondTime &&
                    lunarSolar == other.lunarSolar &&
                    mass == other.mass &&
                    obsAvailable == other.obsAvailable &&
                    obsUsed == other.obsUsed &&
                    origin == other.origin &&
                    origNetwork == other.origNetwork &&
                    origObjectId == other.origObjectId &&
                    partials == other.partials &&
                    pedigree == other.pedigree &&
                    polarMotionX == other.polarMotionX &&
                    polarMotionY == other.polarMotionY &&
                    posUnc == other.posUnc &&
                    rawFileUri == other.rawFileUri &&
                    recOdSpan == other.recOdSpan &&
                    referenceFrame == other.referenceFrame &&
                    residualsAcc == other.residualsAcc &&
                    revNo == other.revNo &&
                    rms == other.rms &&
                    satNo == other.satNo &&
                    sigmaPosUvw == other.sigmaPosUvw &&
                    sigmaVelUvw == other.sigmaVelUvw &&
                    solarFluxApAvg == other.solarFluxApAvg &&
                    solarFluxF10 == other.solarFluxF10 &&
                    solarFluxF10Avg == other.solarFluxF10Avg &&
                    solarRadPress == other.solarRadPress &&
                    solarRadPressCoeff == other.solarRadPressCoeff &&
                    solidEarthTides == other.solidEarthTides &&
                    sourcedData == other.sourcedData &&
                    sourcedDataTypes == other.sourcedDataTypes &&
                    sourceDl == other.sourceDl &&
                    srpArea == other.srpArea &&
                    stepMode == other.stepMode &&
                    stepSize == other.stepSize &&
                    stepSizeSelection == other.stepSizeSelection &&
                    tags == other.tags &&
                    taiUtc == other.taiUtc &&
                    thrustAccel == other.thrustAccel &&
                    tracksAvail == other.tracksAvail &&
                    tracksUsed == other.tracksUsed &&
                    transactionId == other.transactionId &&
                    uct == other.uct &&
                    ut1Rate == other.ut1Rate &&
                    ut1Utc == other.ut1Utc &&
                    velUnc == other.velUnc &&
                    xaccel == other.xaccel &&
                    xpos == other.xpos &&
                    xposAlt1 == other.xposAlt1 &&
                    xposAlt2 == other.xposAlt2 &&
                    xvel == other.xvel &&
                    xvelAlt1 == other.xvelAlt1 &&
                    xvelAlt2 == other.xvelAlt2 &&
                    yaccel == other.yaccel &&
                    ypos == other.ypos &&
                    yposAlt1 == other.yposAlt1 &&
                    yposAlt2 == other.yposAlt2 &&
                    yvel == other.yvel &&
                    yvelAlt1 == other.yvelAlt1 &&
                    yvelAlt2 == other.yvelAlt2 &&
                    zaccel == other.zaccel &&
                    zpos == other.zpos &&
                    zposAlt1 == other.zposAlt1 &&
                    zposAlt2 == other.zposAlt2 &&
                    zvel == other.zvel &&
                    zvelAlt1 == other.zvelAlt1 &&
                    zvelAlt2 == other.zvelAlt2 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    classificationMarking,
                    dataMode,
                    epoch,
                    source,
                    actualOdSpan,
                    algorithm,
                    alt1ReferenceFrame,
                    alt2ReferenceFrame,
                    area,
                    bDot,
                    cmOffset,
                    cov,
                    covMethod,
                    covReferenceFrame,
                    createdAt,
                    createdBy,
                    descriptor,
                    dragArea,
                    dragCoeff,
                    dragModel,
                    edr,
                    eqCov,
                    errorControl,
                    fixedStep,
                    geopotentialModel,
                    iau1980Terms,
                    idOnOrbit,
                    idOrbitDetermination,
                    idStateVector,
                    integratorMode,
                    inTrackThrust,
                    lastObEnd,
                    lastObStart,
                    leapSecondTime,
                    lunarSolar,
                    mass,
                    obsAvailable,
                    obsUsed,
                    origin,
                    origNetwork,
                    origObjectId,
                    partials,
                    pedigree,
                    polarMotionX,
                    polarMotionY,
                    posUnc,
                    rawFileUri,
                    recOdSpan,
                    referenceFrame,
                    residualsAcc,
                    revNo,
                    rms,
                    satNo,
                    sigmaPosUvw,
                    sigmaVelUvw,
                    solarFluxApAvg,
                    solarFluxF10,
                    solarFluxF10Avg,
                    solarRadPress,
                    solarRadPressCoeff,
                    solidEarthTides,
                    sourcedData,
                    sourcedDataTypes,
                    sourceDl,
                    srpArea,
                    stepMode,
                    stepSize,
                    stepSizeSelection,
                    tags,
                    taiUtc,
                    thrustAccel,
                    tracksAvail,
                    tracksUsed,
                    transactionId,
                    uct,
                    ut1Rate,
                    ut1Utc,
                    velUnc,
                    xaccel,
                    xpos,
                    xposAlt1,
                    xposAlt2,
                    xvel,
                    xvelAlt1,
                    xvelAlt2,
                    yaccel,
                    ypos,
                    yposAlt1,
                    yposAlt2,
                    yvel,
                    yvelAlt1,
                    yvelAlt2,
                    zaccel,
                    zpos,
                    zposAlt1,
                    zposAlt2,
                    zvel,
                    zvelAlt1,
                    zvelAlt2,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "StateVector{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, actualOdSpan=$actualOdSpan, algorithm=$algorithm, alt1ReferenceFrame=$alt1ReferenceFrame, alt2ReferenceFrame=$alt2ReferenceFrame, area=$area, bDot=$bDot, cmOffset=$cmOffset, cov=$cov, covMethod=$covMethod, covReferenceFrame=$covReferenceFrame, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, dragArea=$dragArea, dragCoeff=$dragCoeff, dragModel=$dragModel, edr=$edr, eqCov=$eqCov, errorControl=$errorControl, fixedStep=$fixedStep, geopotentialModel=$geopotentialModel, iau1980Terms=$iau1980Terms, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, idStateVector=$idStateVector, integratorMode=$integratorMode, inTrackThrust=$inTrackThrust, lastObEnd=$lastObEnd, lastObStart=$lastObStart, leapSecondTime=$leapSecondTime, lunarSolar=$lunarSolar, mass=$mass, obsAvailable=$obsAvailable, obsUsed=$obsUsed, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, partials=$partials, pedigree=$pedigree, polarMotionX=$polarMotionX, polarMotionY=$polarMotionY, posUnc=$posUnc, rawFileUri=$rawFileUri, recOdSpan=$recOdSpan, referenceFrame=$referenceFrame, residualsAcc=$residualsAcc, revNo=$revNo, rms=$rms, satNo=$satNo, sigmaPosUvw=$sigmaPosUvw, sigmaVelUvw=$sigmaVelUvw, solarFluxApAvg=$solarFluxApAvg, solarFluxF10=$solarFluxF10, solarFluxF10Avg=$solarFluxF10Avg, solarRadPress=$solarRadPress, solarRadPressCoeff=$solarRadPressCoeff, solidEarthTides=$solidEarthTides, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, srpArea=$srpArea, stepMode=$stepMode, stepSize=$stepSize, stepSizeSelection=$stepSizeSelection, tags=$tags, taiUtc=$taiUtc, thrustAccel=$thrustAccel, tracksAvail=$tracksAvail, tracksUsed=$tracksUsed, transactionId=$transactionId, uct=$uct, ut1Rate=$ut1Rate, ut1Utc=$ut1Utc, velUnc=$velUnc, xaccel=$xaccel, xpos=$xpos, xposAlt1=$xposAlt1, xposAlt2=$xposAlt2, xvel=$xvel, xvelAlt1=$xvelAlt1, xvelAlt2=$xvelAlt2, yaccel=$yaccel, ypos=$ypos, yposAlt1=$yposAlt1, yposAlt2=$yposAlt2, yvel=$yvel, yvelAlt1=$yvelAlt1, yvelAlt2=$yvelAlt2, zaccel=$zaccel, zpos=$zpos, zposAlt1=$zposAlt1, zposAlt2=$zposAlt2, zvel=$zvel, zvelAlt1=$zvelAlt1, zvelAlt2=$zvelAlt2, additionalProperties=$additionalProperties}"
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
                type == other.type &&
                id == other.id &&
                alt == other.alt &&
                argOfPerigee == other.argOfPerigee &&
                az == other.az &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                customer == other.customer &&
                dec == other.dec &&
                duration == other.duration &&
                dwellId == other.dwellId &&
                eccentricity == other.eccentricity &&
                el == other.el &&
                elset == other.elset &&
                endTime == other.endTime &&
                epoch == other.epoch &&
                esId == other.esId &&
                extentAz == other.extentAz &&
                extentEl == other.extentEl &&
                extentRange == other.extentRange &&
                externalId == other.externalId &&
                frameRate == other.frameRate &&
                freq == other.freq &&
                freqMax == other.freqMax &&
                freqMin == other.freqMin &&
                idElset == other.idElset &&
                idManifold == other.idManifold &&
                idOnOrbit == other.idOnOrbit &&
                idParentReq == other.idParentReq &&
                idPlan == other.idPlan &&
                idSensor == other.idSensor &&
                idStateVector == other.idStateVector &&
                inclination == other.inclination &&
                integrationTime == other.integrationTime &&
                iron == other.iron &&
                irradiance == other.irradiance &&
                lat == other.lat &&
                lon == other.lon &&
                msgCreateDate == other.msgCreateDate &&
                msgType == other.msgType &&
                notes == other.notes &&
                numFrames == other.numFrames &&
                numObs == other.numObs &&
                numTracks == other.numTracks &&
                obType == other.obType &&
                orbitRegime == other.orbitRegime &&
                orientAngle == other.orientAngle &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                origSensorId == other.origSensorId &&
                planIndex == other.planIndex &&
                polarization == other.polarization &&
                priority == other.priority &&
                ra == other.ra &&
                raan == other.raan &&
                range == other.range &&
                rcs == other.rcs &&
                rcsMax == other.rcsMax &&
                rcsMin == other.rcsMin &&
                reflectance == other.reflectance &&
                satNo == other.satNo &&
                scenario == other.scenario &&
                semiMajorAxis == other.semiMajorAxis &&
                spectralModel == other.spectralModel &&
                srchInc == other.srchInc &&
                srchPattern == other.srchPattern &&
                stateVector == other.stateVector &&
                stopAlt == other.stopAlt &&
                stopLat == other.stopLat &&
                stopLon == other.stopLon &&
                suffix == other.suffix &&
                tags == other.tags &&
                targetSize == other.targetSize &&
                taskCategory == other.taskCategory &&
                taskGroup == other.taskGroup &&
                taskId == other.taskId &&
                transactionId == other.transactionId &&
                trueAnomoly == other.trueAnomoly &&
                uctFollowUp == other.uctFollowUp &&
                visMag == other.visMag &&
                visMagMax == other.visMagMax &&
                visMagMin == other.visMagMin &&
                xAngle == other.xAngle &&
                yAngle == other.yAngle
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                startTime,
                type,
                id,
                alt,
                argOfPerigee,
                az,
                createdAt,
                createdBy,
                customer,
                dec,
                duration,
                dwellId,
                eccentricity,
                el,
                elset,
                endTime,
                epoch,
                esId,
                extentAz,
                extentEl,
                extentRange,
                externalId,
                frameRate,
                freq,
                freqMax,
                freqMin,
                idElset,
                idManifold,
                idOnOrbit,
                idParentReq,
                idPlan,
                idSensor,
                idStateVector,
                inclination,
                integrationTime,
                iron,
                irradiance,
                lat,
                lon,
                msgCreateDate,
                msgType,
                notes,
                numFrames,
                numObs,
                numTracks,
                obType,
                orbitRegime,
                orientAngle,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                planIndex,
                polarization,
                priority,
                ra,
                raan,
                range,
                rcs,
                rcsMax,
                rcsMin,
                reflectance,
                satNo,
                scenario,
                semiMajorAxis,
                spectralModel,
                srchInc,
                srchPattern,
                stateVector,
                stopAlt,
                stopLat,
                stopLon,
                suffix,
                tags,
                targetSize,
                taskCategory,
                taskGroup,
                taskId,
                transactionId,
                trueAnomoly,
                uctFollowUp,
                visMag,
                visMagMax,
                visMagMin,
                xAngle,
                yAngle,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, startTime=$startTime, type=$type, id=$id, alt=$alt, argOfPerigee=$argOfPerigee, az=$az, createdAt=$createdAt, createdBy=$createdBy, customer=$customer, dec=$dec, duration=$duration, dwellId=$dwellId, eccentricity=$eccentricity, el=$el, elset=$elset, endTime=$endTime, epoch=$epoch, esId=$esId, extentAz=$extentAz, extentEl=$extentEl, extentRange=$extentRange, externalId=$externalId, frameRate=$frameRate, freq=$freq, freqMax=$freqMax, freqMin=$freqMin, idElset=$idElset, idManifold=$idManifold, idOnOrbit=$idOnOrbit, idParentReq=$idParentReq, idPlan=$idPlan, idSensor=$idSensor, idStateVector=$idStateVector, inclination=$inclination, integrationTime=$integrationTime, iron=$iron, irradiance=$irradiance, lat=$lat, lon=$lon, msgCreateDate=$msgCreateDate, msgType=$msgType, notes=$notes, numFrames=$numFrames, numObs=$numObs, numTracks=$numTracks, obType=$obType, orbitRegime=$orbitRegime, orientAngle=$orientAngle, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, planIndex=$planIndex, polarization=$polarization, priority=$priority, ra=$ra, raan=$raan, range=$range, rcs=$rcs, rcsMax=$rcsMax, rcsMin=$rcsMin, reflectance=$reflectance, satNo=$satNo, scenario=$scenario, semiMajorAxis=$semiMajorAxis, spectralModel=$spectralModel, srchInc=$srchInc, srchPattern=$srchPattern, stateVector=$stateVector, stopAlt=$stopAlt, stopLat=$stopLat, stopLon=$stopLon, suffix=$suffix, tags=$tags, targetSize=$targetSize, taskCategory=$taskCategory, taskGroup=$taskGroup, taskId=$taskId, transactionId=$transactionId, trueAnomoly=$trueAnomoly, uctFollowUp=$uctFollowUp, visMag=$visMag, visMagMax=$visMagMax, visMagMin=$visMagMin, xAngle=$xAngle, yAngle=$yAngle}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CollectRequestCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CollectRequestCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

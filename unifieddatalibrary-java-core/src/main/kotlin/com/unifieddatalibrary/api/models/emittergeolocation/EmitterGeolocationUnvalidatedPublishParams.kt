// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.emittergeolocation

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
import com.unifieddatalibrary.api.models.emittergeolocation.EmitterGeolocationUnvalidatedPublishParams
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Service operation to take multiple emittergeolocation records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
class EmitterGeolocationUnvalidatedPublishParams private constructor(
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
         * Returns a mutable builder for constructing an instance of [EmitterGeolocationUnvalidatedPublishParams].
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

    /** A builder for [EmitterGeolocationUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(emitterGeolocationUnvalidatedPublishParams: EmitterGeolocationUnvalidatedPublishParams) =
            apply {
                body = emitterGeolocationUnvalidatedPublishParams.body.toMutableList()
                additionalHeaders = emitterGeolocationUnvalidatedPublishParams.additionalHeaders.toBuilder()
                additionalQueryParams = emitterGeolocationUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [EmitterGeolocationUnvalidatedPublishParams].
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
        fun build(): EmitterGeolocationUnvalidatedPublishParams =
            EmitterGeolocationUnvalidatedPublishParams(
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

    /** Model representation of Emitter geolocation data for a signal of interest. */
    class Body @JsonCreator private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("signalOfInterestType") @ExcludeMissing private val signalOfInterestType: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("startTime") @ExcludeMissing private val startTime: JsonField<OffsetDateTime>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("agjson") @ExcludeMissing private val agjson: JsonField<String>,
        @JsonProperty("algVersion") @ExcludeMissing private val algVersion: JsonField<String>,
        @JsonProperty("andims") @ExcludeMissing private val andims: JsonField<Int>,
        @JsonProperty("area") @ExcludeMissing private val area: JsonField<String>,
        @JsonProperty("asrid") @ExcludeMissing private val asrid: JsonField<Int>,
        @JsonProperty("atext") @ExcludeMissing private val atext: JsonField<String>,
        @JsonProperty("atype") @ExcludeMissing private val atype: JsonField<String>,
        @JsonProperty("centerFreq") @ExcludeMissing private val centerFreq: JsonField<Double>,
        @JsonProperty("cluster") @ExcludeMissing private val cluster: JsonField<String>,
        @JsonProperty("confArea") @ExcludeMissing private val confArea: JsonField<Double>,
        @JsonProperty("constellation") @ExcludeMissing private val constellation: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("createdTs") @ExcludeMissing private val createdTs: JsonField<OffsetDateTime>,
        @JsonProperty("detectAlt") @ExcludeMissing private val detectAlt: JsonField<Double>,
        @JsonProperty("detectLat") @ExcludeMissing private val detectLat: JsonField<Double>,
        @JsonProperty("detectLon") @ExcludeMissing private val detectLon: JsonField<Double>,
        @JsonProperty("endTime") @ExcludeMissing private val endTime: JsonField<OffsetDateTime>,
        @JsonProperty("errEllp") @ExcludeMissing private val errEllp: JsonField<List<Double>>,
        @JsonProperty("externalId") @ExcludeMissing private val externalId: JsonField<String>,
        @JsonProperty("idOnOrbit") @ExcludeMissing private val idOnOrbit: JsonField<String>,
        @JsonProperty("idRFEmitter") @ExcludeMissing private val idRfEmitter: JsonField<String>,
        @JsonProperty("idSensor") @ExcludeMissing private val idSensor: JsonField<String>,
        @JsonProperty("maxFreq") @ExcludeMissing private val maxFreq: JsonField<Double>,
        @JsonProperty("minFreq") @ExcludeMissing private val minFreq: JsonField<Double>,
        @JsonProperty("numBursts") @ExcludeMissing private val numBursts: JsonField<Int>,
        @JsonProperty("orderId") @ExcludeMissing private val orderId: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origObjectId") @ExcludeMissing private val origObjectId: JsonField<String>,
        @JsonProperty("origRFEmitterId") @ExcludeMissing private val origRfEmitterId: JsonField<String>,
        @JsonProperty("origSensorId") @ExcludeMissing private val origSensorId: JsonField<String>,
        @JsonProperty("passGroupId") @ExcludeMissing private val passGroupId: JsonField<String>,
        @JsonProperty("receivedTs") @ExcludeMissing private val receivedTs: JsonField<OffsetDateTime>,
        @JsonProperty("satNo") @ExcludeMissing private val satNo: JsonField<Int>,
        @JsonProperty("signalOfInterest") @ExcludeMissing private val signalOfInterest: JsonField<String>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,

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
         * Type of the signal of interest of this Emitter Geo Location (e.g. RF).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun signalOfInterestType(): String = signalOfInterestType.getRequired("signalOfInterestType")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * The start time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation of the geometry/geography, of the image as projected on the ground. GeoJSON Reference: https://geojson.org/. Ignored if included with a POST or PUT request that also specifies a valid 'area' or 'atext' field.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun agjson(): Optional<String> = agjson.getOptional("agjson")

        /**
         * The EmitterGeo algorithm type and version used in Emitter geolocation calculations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun algVersion(): Optional<String> = algVersion.getOptional("algVersion")

        /**
         * Number of dimensions of the geometry depicted by region.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun andims(): Optional<Int> = andims.getOptional("andims")

        /**
         * Optional geographical region or polygon (lat/lon pairs) of the area surrounding the Point of Interest as projected on the ground.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun area(): Optional<String> = area.getOptional("area")

        /**
         * Geographical spatial_ref_sys for region.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun asrid(): Optional<Int> = asrid.getOptional("asrid")

        /**
         * Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text representation of the geometry/geography, of the image as projected on the ground. WKT reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included with a POST or PUT request that also specifies a valid 'area' field.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun atext(): Optional<String> = atext.getOptional("atext")

        /**
         * Type of region as projected on the ground.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun atype(): Optional<String> = atype.getOptional("atype")

        /**
         * The detected signal frequency in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun centerFreq(): Optional<Double> = centerFreq.getOptional("centerFreq")

        /**
         * The name(s) of the subset of constellation spacecraft that made this detection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun cluster(): Optional<String> = cluster.getOptional("cluster")

        /**
         * The area of the confidence ellipse specified in meters squared to contain the emitter with a 95% probability.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun confArea(): Optional<Double> = confArea.getOptional("confArea")

        /**
         * The name of the satellite constellation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun constellation(): Optional<String> = constellation.getOptional("constellation")

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
         * Specifies the creation time associated with the order in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdTs(): Optional<OffsetDateTime> = createdTs.getOptional("createdTs")

        /**
         * The altitude relative to WGS-84 ellipsoid, in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun detectAlt(): Optional<Double> = detectAlt.getOptional("detectAlt")

        /**
         * WGS-84 latitude of the most likely emitter location coordinate point, in degrees. -90 to 90 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun detectLat(): Optional<Double> = detectLat.getOptional("detectLat")

        /**
         * WGS-84 longitude of the most likely emitter location coordinate point, in degrees. -180 to 180 degrees (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun detectLon(): Optional<Double> = detectLon.getOptional("detectLon")

        /**
         * The end time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

        /**
         * Confidence ellipsoid about the detection location [semi-major axis (m), semi-minor axis (m), orientation (deg)].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun errEllp(): Optional<List<Double>> = errEllp.getOptional("errEllp")

        /**
         * Optional ID from external systems. This field has no meaning within UDL and is provided as a convenience for systems that require tracking of an internal system generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("externalId")

        /**
         * Unique identifier of the satellite used to identify and geolocate Emitter signals of interest. This ID can be used to obtain additional information on an OnOrbit object using the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the onorbit object with idOnOrbit = abc would be queried as /udl/onorbit/abc. Used when Emitter geolocation is done by a single satellite.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Optional identifier of the geolocated signal of interest RF Emitter for this observation. This ID can be used to obtain additional information on an RF Emitter object using the 'get by ID' operation (e.g. /udl/rfemitter/{id}). For example, the rfemitter object with idRFEmitter = abc would be queried as /udl/rfemitter/abc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idRfEmitter(): Optional<String> = idRfEmitter.getOptional("idRFEmitter")

        /**
         * Unique identifier of the reporting sensor. This ID can be used to obtain additional information on a sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For example, the sensor with idSensor = abc would be queried as /udl/sensor/abc. Used when Emitter geolocation is done by a single sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * The maximum detected frequency in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun maxFreq(): Optional<Double> = maxFreq.getOptional("maxFreq")

        /**
         * The minimum detected frequency in megahertz.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun minFreq(): Optional<Double> = minFreq.getOptional("minFreq")

        /**
         * The count of single-burst observations used for this geolocation observation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun numBursts(): Optional<Int> = numBursts.getOptional("numBursts")

        /**
         * The order identifier for this Emitter Geo Location data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun orderId(): Optional<String> = orderId.getOptional("orderId")

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
         * Optional identifier of the satellite used to identify and geolocate Emitter signals of interest of this observation. This may be an internal identifier and not necessarily a valid satellite number. Used when Emitter geolocation is done by a single satellite.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier of the emitter of interest for this observation. This may be an internal identifier and not necessarily a valid emitter Id.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origRfEmitterId(): Optional<String> = origRfEmitterId.getOptional("origRFEmitterId")

        /**
         * Optional identifier provided by observation source to indicate the sensor identifier which produced this Emitter Geo Location. This may be an internal identifier and not necessarily a valid sensor ID. Used when Emitter geolocation is done by a single sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * Optional external identifier referencing the entity used in the calculation of the geolocation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun passGroupId(): Optional<String> = passGroupId.getOptional("passGroupId")

        /**
         * The time representing the mean of the constituent single-burst observations in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun receivedTs(): Optional<OffsetDateTime> = receivedTs.getOptional("receivedTs")

        /**
         * Satellite/catalog number of the on-orbit spacecraft used to identify and geolocate Emitter signals of interest of this detection. Used when Emitter geolocation is done by a single satellite.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * The name of the signal of interest.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun signalOfInterest(): Optional<String> = signalOfInterest.getOptional("signalOfInterest")

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
         * Returns the raw JSON value of [signalOfInterestType].
         *
         * Unlike [signalOfInterestType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signalOfInterestType")
        @ExcludeMissing
        fun _signalOfInterestType(): JsonField<String> = signalOfInterestType

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<String> = source

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
        @JsonProperty("id")
        @ExcludeMissing
        fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [agjson].
         *
         * Unlike [agjson], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agjson")
        @ExcludeMissing
        fun _agjson(): JsonField<String> = agjson

        /**
         * Returns the raw JSON value of [algVersion].
         *
         * Unlike [algVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("algVersion")
        @ExcludeMissing
        fun _algVersion(): JsonField<String> = algVersion

        /**
         * Returns the raw JSON value of [andims].
         *
         * Unlike [andims], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("andims")
        @ExcludeMissing
        fun _andims(): JsonField<Int> = andims

        /**
         * Returns the raw JSON value of [area].
         *
         * Unlike [area], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("area")
        @ExcludeMissing
        fun _area(): JsonField<String> = area

        /**
         * Returns the raw JSON value of [asrid].
         *
         * Unlike [asrid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asrid")
        @ExcludeMissing
        fun _asrid(): JsonField<Int> = asrid

        /**
         * Returns the raw JSON value of [atext].
         *
         * Unlike [atext], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("atext")
        @ExcludeMissing
        fun _atext(): JsonField<String> = atext

        /**
         * Returns the raw JSON value of [atype].
         *
         * Unlike [atype], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("atype")
        @ExcludeMissing
        fun _atype(): JsonField<String> = atype

        /**
         * Returns the raw JSON value of [centerFreq].
         *
         * Unlike [centerFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("centerFreq")
        @ExcludeMissing
        fun _centerFreq(): JsonField<Double> = centerFreq

        /**
         * Returns the raw JSON value of [cluster].
         *
         * Unlike [cluster], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cluster")
        @ExcludeMissing
        fun _cluster(): JsonField<String> = cluster

        /**
         * Returns the raw JSON value of [confArea].
         *
         * Unlike [confArea], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("confArea")
        @ExcludeMissing
        fun _confArea(): JsonField<Double> = confArea

        /**
         * Returns the raw JSON value of [constellation].
         *
         * Unlike [constellation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("constellation")
        @ExcludeMissing
        fun _constellation(): JsonField<String> = constellation

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
         * Returns the raw JSON value of [createdTs].
         *
         * Unlike [createdTs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdTs")
        @ExcludeMissing
        fun _createdTs(): JsonField<OffsetDateTime> = createdTs

        /**
         * Returns the raw JSON value of [detectAlt].
         *
         * Unlike [detectAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detectAlt")
        @ExcludeMissing
        fun _detectAlt(): JsonField<Double> = detectAlt

        /**
         * Returns the raw JSON value of [detectLat].
         *
         * Unlike [detectLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detectLat")
        @ExcludeMissing
        fun _detectLat(): JsonField<Double> = detectLat

        /**
         * Returns the raw JSON value of [detectLon].
         *
         * Unlike [detectLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("detectLon")
        @ExcludeMissing
        fun _detectLon(): JsonField<Double> = detectLon

        /**
         * Returns the raw JSON value of [endTime].
         *
         * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endTime")
        @ExcludeMissing
        fun _endTime(): JsonField<OffsetDateTime> = endTime

        /**
         * Returns the raw JSON value of [errEllp].
         *
         * Unlike [errEllp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errEllp")
        @ExcludeMissing
        fun _errEllp(): JsonField<List<Double>> = errEllp

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit")
        @ExcludeMissing
        fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [idRfEmitter].
         *
         * Unlike [idRfEmitter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idRFEmitter")
        @ExcludeMissing
        fun _idRfEmitter(): JsonField<String> = idRfEmitter

        /**
         * Returns the raw JSON value of [idSensor].
         *
         * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSensor")
        @ExcludeMissing
        fun _idSensor(): JsonField<String> = idSensor

        /**
         * Returns the raw JSON value of [maxFreq].
         *
         * Unlike [maxFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxFreq")
        @ExcludeMissing
        fun _maxFreq(): JsonField<Double> = maxFreq

        /**
         * Returns the raw JSON value of [minFreq].
         *
         * Unlike [minFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minFreq")
        @ExcludeMissing
        fun _minFreq(): JsonField<Double> = minFreq

        /**
         * Returns the raw JSON value of [numBursts].
         *
         * Unlike [numBursts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numBursts")
        @ExcludeMissing
        fun _numBursts(): JsonField<Int> = numBursts

        /**
         * Returns the raw JSON value of [orderId].
         *
         * Unlike [orderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orderId")
        @ExcludeMissing
        fun _orderId(): JsonField<String> = orderId

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
         * Returns the raw JSON value of [origRfEmitterId].
         *
         * Unlike [origRfEmitterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origRFEmitterId")
        @ExcludeMissing
        fun _origRfEmitterId(): JsonField<String> = origRfEmitterId

        /**
         * Returns the raw JSON value of [origSensorId].
         *
         * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origSensorId")
        @ExcludeMissing
        fun _origSensorId(): JsonField<String> = origSensorId

        /**
         * Returns the raw JSON value of [passGroupId].
         *
         * Unlike [passGroupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("passGroupId")
        @ExcludeMissing
        fun _passGroupId(): JsonField<String> = passGroupId

        /**
         * Returns the raw JSON value of [receivedTs].
         *
         * Unlike [receivedTs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("receivedTs")
        @ExcludeMissing
        fun _receivedTs(): JsonField<OffsetDateTime> = receivedTs

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo")
        @ExcludeMissing
        fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [signalOfInterest].
         *
         * Unlike [signalOfInterest], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signalOfInterest")
        @ExcludeMissing
        fun _signalOfInterest(): JsonField<String> = signalOfInterest

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
             * .signalOfInterestType()
             * .source()
             * .startTime()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var signalOfInterestType: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var agjson: JsonField<String> = JsonMissing.of()
            private var algVersion: JsonField<String> = JsonMissing.of()
            private var andims: JsonField<Int> = JsonMissing.of()
            private var area: JsonField<String> = JsonMissing.of()
            private var asrid: JsonField<Int> = JsonMissing.of()
            private var atext: JsonField<String> = JsonMissing.of()
            private var atype: JsonField<String> = JsonMissing.of()
            private var centerFreq: JsonField<Double> = JsonMissing.of()
            private var cluster: JsonField<String> = JsonMissing.of()
            private var confArea: JsonField<Double> = JsonMissing.of()
            private var constellation: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var createdTs: JsonField<OffsetDateTime> = JsonMissing.of()
            private var detectAlt: JsonField<Double> = JsonMissing.of()
            private var detectLat: JsonField<Double> = JsonMissing.of()
            private var detectLon: JsonField<Double> = JsonMissing.of()
            private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var errEllp: JsonField<MutableList<Double>>? = null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idRfEmitter: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var maxFreq: JsonField<Double> = JsonMissing.of()
            private var minFreq: JsonField<Double> = JsonMissing.of()
            private var numBursts: JsonField<Int> = JsonMissing.of()
            private var orderId: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origRfEmitterId: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var passGroupId: JsonField<String> = JsonMissing.of()
            private var receivedTs: JsonField<OffsetDateTime> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var signalOfInterest: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    classificationMarking = body.classificationMarking
                    dataMode = body.dataMode
                    signalOfInterestType = body.signalOfInterestType
                    source = body.source
                    startTime = body.startTime
                    id = body.id
                    agjson = body.agjson
                    algVersion = body.algVersion
                    andims = body.andims
                    area = body.area
                    asrid = body.asrid
                    atext = body.atext
                    atype = body.atype
                    centerFreq = body.centerFreq
                    cluster = body.cluster
                    confArea = body.confArea
                    constellation = body.constellation
                    createdAt = body.createdAt
                    createdBy = body.createdBy
                    createdTs = body.createdTs
                    detectAlt = body.detectAlt
                    detectLat = body.detectLat
                    detectLon = body.detectLon
                    endTime = body.endTime
                    errEllp = body.errEllp.map { it.toMutableList() }
                    externalId = body.externalId
                    idOnOrbit = body.idOnOrbit
                    idRfEmitter = body.idRfEmitter
                    idSensor = body.idSensor
                    maxFreq = body.maxFreq
                    minFreq = body.minFreq
                    numBursts = body.numBursts
                    orderId = body.orderId
                    origin = body.origin
                    origNetwork = body.origNetwork
                    origObjectId = body.origObjectId
                    origRfEmitterId = body.origRfEmitterId
                    origSensorId = body.origSensorId
                    passGroupId = body.passGroupId
                    receivedTs = body.receivedTs
                    satNo = body.satNo
                    signalOfInterest = body.signalOfInterest
                    sourceDl = body.sourceDl
                    tags = body.tags.map { it.toMutableList() }
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

            /** Type of the signal of interest of this Emitter Geo Location (e.g. RF). */
            fun signalOfInterestType(signalOfInterestType: String) = signalOfInterestType(JsonField.of(signalOfInterestType))

            /**
             * Sets [Builder.signalOfInterestType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signalOfInterestType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signalOfInterestType(signalOfInterestType: JsonField<String>) =
                apply {
                    this.signalOfInterestType = signalOfInterestType
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

            /** The start time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond precision. */
            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) =
                apply {
                    this.startTime = startTime
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

            /** Geographical region or polygon (lat/lon pairs), as depicted by the GeoJSON representation of the geometry/geography, of the image as projected on the ground. GeoJSON Reference: https://geojson.org/. Ignored if included with a POST or PUT request that also specifies a valid 'area' or 'atext' field. */
            fun agjson(agjson: String) = agjson(JsonField.of(agjson))

            /**
             * Sets [Builder.agjson] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agjson] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agjson(agjson: JsonField<String>) =
                apply {
                    this.agjson = agjson
                }

            /** The EmitterGeo algorithm type and version used in Emitter geolocation calculations. */
            fun algVersion(algVersion: String) = algVersion(JsonField.of(algVersion))

            /**
             * Sets [Builder.algVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.algVersion] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun algVersion(algVersion: JsonField<String>) =
                apply {
                    this.algVersion = algVersion
                }

            /** Number of dimensions of the geometry depicted by region. */
            fun andims(andims: Int) = andims(JsonField.of(andims))

            /**
             * Sets [Builder.andims] to an arbitrary JSON value.
             *
             * You should usually call [Builder.andims] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun andims(andims: JsonField<Int>) =
                apply {
                    this.andims = andims
                }

            /** Optional geographical region or polygon (lat/lon pairs) of the area surrounding the Point of Interest as projected on the ground. */
            fun area(area: String) = area(JsonField.of(area))

            /**
             * Sets [Builder.area] to an arbitrary JSON value.
             *
             * You should usually call [Builder.area] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun area(area: JsonField<String>) =
                apply {
                    this.area = area
                }

            /** Geographical spatial_ref_sys for region. */
            fun asrid(asrid: Int) = asrid(JsonField.of(asrid))

            /**
             * Sets [Builder.asrid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asrid] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asrid(asrid: JsonField<Int>) =
                apply {
                    this.asrid = asrid
                }

            /** Geographical region or polygon (lon/lat pairs), as depicted by the Well-Known Text representation of the geometry/geography, of the image as projected on the ground. WKT reference: https://www.opengeospatial.org/standards/wkt-crs. Ignored if included with a POST or PUT request that also specifies a valid 'area' field. */
            fun atext(atext: String) = atext(JsonField.of(atext))

            /**
             * Sets [Builder.atext] to an arbitrary JSON value.
             *
             * You should usually call [Builder.atext] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun atext(atext: JsonField<String>) =
                apply {
                    this.atext = atext
                }

            /** Type of region as projected on the ground. */
            fun atype(atype: String) = atype(JsonField.of(atype))

            /**
             * Sets [Builder.atype] to an arbitrary JSON value.
             *
             * You should usually call [Builder.atype] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun atype(atype: JsonField<String>) =
                apply {
                    this.atype = atype
                }

            /** The detected signal frequency in megahertz. */
            fun centerFreq(centerFreq: Double) = centerFreq(JsonField.of(centerFreq))

            /**
             * Sets [Builder.centerFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.centerFreq] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun centerFreq(centerFreq: JsonField<Double>) =
                apply {
                    this.centerFreq = centerFreq
                }

            /** The name(s) of the subset of constellation spacecraft that made this detection. */
            fun cluster(cluster: String) = cluster(JsonField.of(cluster))

            /**
             * Sets [Builder.cluster] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cluster] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cluster(cluster: JsonField<String>) =
                apply {
                    this.cluster = cluster
                }

            /** The area of the confidence ellipse specified in meters squared to contain the emitter with a 95% probability. */
            fun confArea(confArea: Double) = confArea(JsonField.of(confArea))

            /**
             * Sets [Builder.confArea] to an arbitrary JSON value.
             *
             * You should usually call [Builder.confArea] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun confArea(confArea: JsonField<Double>) =
                apply {
                    this.confArea = confArea
                }

            /** The name of the satellite constellation. */
            fun constellation(constellation: String) = constellation(JsonField.of(constellation))

            /**
             * Sets [Builder.constellation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.constellation] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun constellation(constellation: JsonField<String>) =
                apply {
                    this.constellation = constellation
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

            /** Specifies the creation time associated with the order in ISO 8601 UTC with microsecond precision. */
            fun createdTs(createdTs: OffsetDateTime) = createdTs(JsonField.of(createdTs))

            /**
             * Sets [Builder.createdTs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdTs] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdTs(createdTs: JsonField<OffsetDateTime>) =
                apply {
                    this.createdTs = createdTs
                }

            /** The altitude relative to WGS-84 ellipsoid, in meters. */
            fun detectAlt(detectAlt: Double) = detectAlt(JsonField.of(detectAlt))

            /**
             * Sets [Builder.detectAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectAlt] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detectAlt(detectAlt: JsonField<Double>) =
                apply {
                    this.detectAlt = detectAlt
                }

            /** WGS-84 latitude of the most likely emitter location coordinate point, in degrees. -90 to 90 degrees (negative values south of equator). */
            fun detectLat(detectLat: Double) = detectLat(JsonField.of(detectLat))

            /**
             * Sets [Builder.detectLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectLat] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detectLat(detectLat: JsonField<Double>) =
                apply {
                    this.detectLat = detectLat
                }

            /** WGS-84 longitude of the most likely emitter location coordinate point, in degrees. -180 to 180 degrees (negative values west of Prime Meridian). */
            fun detectLon(detectLon: Double) = detectLon(JsonField.of(detectLon))

            /**
             * Sets [Builder.detectLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detectLon] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun detectLon(detectLon: JsonField<Double>) =
                apply {
                    this.detectLon = detectLon
                }

            /** The end time for this Emitter Geo Location data set in ISO 8601 UTC with microsecond precision. */
            fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

            /**
             * Sets [Builder.endTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTime(endTime: JsonField<OffsetDateTime>) =
                apply {
                    this.endTime = endTime
                }

            /** Confidence ellipsoid about the detection location [semi-major axis (m), semi-minor axis (m), orientation (deg)]. */
            fun errEllp(errEllp: List<Double>) = errEllp(JsonField.of(errEllp))

            /**
             * Sets [Builder.errEllp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errEllp] with a well-typed `List<Double>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errEllp(errEllp: JsonField<List<Double>>) =
                apply {
                    this.errEllp = errEllp.map { it.toMutableList() }
                }

            /**
             * Adds a single [Double] to [Builder.errEllp].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addErrEllp(errEllp: Double) =
                apply {
                    this.errEllp = (this.errEllp ?: JsonField.of(mutableListOf())).also {
                        checkKnown("errEllp", it).add(errEllp)
                    }
                }

            /** Optional ID from external systems. This field has no meaning within UDL and is provided as a convenience for systems that require tracking of an internal system generated ID. */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) =
                apply {
                    this.externalId = externalId
                }

            /** Unique identifier of the satellite used to identify and geolocate Emitter signals of interest. This ID can be used to obtain additional information on an OnOrbit object using the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the onorbit object with idOnOrbit = abc would be queried as /udl/onorbit/abc. Used when Emitter geolocation is done by a single satellite. */
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

            /** Optional identifier of the geolocated signal of interest RF Emitter for this observation. This ID can be used to obtain additional information on an RF Emitter object using the 'get by ID' operation (e.g. /udl/rfemitter/{id}). For example, the rfemitter object with idRFEmitter = abc would be queried as /udl/rfemitter/abc. */
            fun idRfEmitter(idRfEmitter: String) = idRfEmitter(JsonField.of(idRfEmitter))

            /**
             * Sets [Builder.idRfEmitter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idRfEmitter] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idRfEmitter(idRfEmitter: JsonField<String>) =
                apply {
                    this.idRfEmitter = idRfEmitter
                }

            /** Unique identifier of the reporting sensor. This ID can be used to obtain additional information on a sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For example, the sensor with idSensor = abc would be queried as /udl/sensor/abc. Used when Emitter geolocation is done by a single sensor. */
            fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

            /**
             * Sets [Builder.idSensor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSensor(idSensor: JsonField<String>) =
                apply {
                    this.idSensor = idSensor
                }

            /** The maximum detected frequency in megahertz. */
            fun maxFreq(maxFreq: Double) = maxFreq(JsonField.of(maxFreq))

            /**
             * Sets [Builder.maxFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxFreq] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxFreq(maxFreq: JsonField<Double>) =
                apply {
                    this.maxFreq = maxFreq
                }

            /** The minimum detected frequency in megahertz. */
            fun minFreq(minFreq: Double) = minFreq(JsonField.of(minFreq))

            /**
             * Sets [Builder.minFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minFreq] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minFreq(minFreq: JsonField<Double>) =
                apply {
                    this.minFreq = minFreq
                }

            /** The count of single-burst observations used for this geolocation observation. */
            fun numBursts(numBursts: Int) = numBursts(JsonField.of(numBursts))

            /**
             * Sets [Builder.numBursts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numBursts] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numBursts(numBursts: JsonField<Int>) =
                apply {
                    this.numBursts = numBursts
                }

            /** The order identifier for this Emitter Geo Location data set. */
            fun orderId(orderId: String) = orderId(JsonField.of(orderId))

            /**
             * Sets [Builder.orderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orderId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orderId(orderId: JsonField<String>) =
                apply {
                    this.orderId = orderId
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

            /** Optional identifier of the satellite used to identify and geolocate Emitter signals of interest of this observation. This may be an internal identifier and not necessarily a valid satellite number. Used when Emitter geolocation is done by a single satellite. */
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

            /** Optional identifier of the emitter of interest for this observation. This may be an internal identifier and not necessarily a valid emitter Id. */
            fun origRfEmitterId(origRfEmitterId: String) = origRfEmitterId(JsonField.of(origRfEmitterId))

            /**
             * Sets [Builder.origRfEmitterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origRfEmitterId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origRfEmitterId(origRfEmitterId: JsonField<String>) =
                apply {
                    this.origRfEmitterId = origRfEmitterId
                }

            /** Optional identifier provided by observation source to indicate the sensor identifier which produced this Emitter Geo Location. This may be an internal identifier and not necessarily a valid sensor ID. Used when Emitter geolocation is done by a single sensor. */
            fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

            /**
             * Sets [Builder.origSensorId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSensorId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSensorId(origSensorId: JsonField<String>) =
                apply {
                    this.origSensorId = origSensorId
                }

            /** Optional external identifier referencing the entity used in the calculation of the geolocation. */
            fun passGroupId(passGroupId: String) = passGroupId(JsonField.of(passGroupId))

            /**
             * Sets [Builder.passGroupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passGroupId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passGroupId(passGroupId: JsonField<String>) =
                apply {
                    this.passGroupId = passGroupId
                }

            /** The time representing the mean of the constituent single-burst observations in ISO 8601 UTC with microsecond precision. */
            fun receivedTs(receivedTs: OffsetDateTime) = receivedTs(JsonField.of(receivedTs))

            /**
             * Sets [Builder.receivedTs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receivedTs] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receivedTs(receivedTs: JsonField<OffsetDateTime>) =
                apply {
                    this.receivedTs = receivedTs
                }

            /** Satellite/catalog number of the on-orbit spacecraft used to identify and geolocate Emitter signals of interest of this detection. Used when Emitter geolocation is done by a single satellite. */
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

            /** The name of the signal of interest. */
            fun signalOfInterest(signalOfInterest: String) = signalOfInterest(JsonField.of(signalOfInterest))

            /**
             * Sets [Builder.signalOfInterest] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signalOfInterest] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signalOfInterest(signalOfInterest: JsonField<String>) =
                apply {
                    this.signalOfInterest = signalOfInterest
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
             * .signalOfInterestType()
             * .source()
             * .startTime()
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
                    "signalOfInterestType", signalOfInterestType
                  ),
                  checkRequired(
                    "source", source
                  ),
                  checkRequired(
                    "startTime", startTime
                  ),
                  id,
                  agjson,
                  algVersion,
                  andims,
                  area,
                  asrid,
                  atext,
                  atype,
                  centerFreq,
                  cluster,
                  confArea,
                  constellation,
                  createdAt,
                  createdBy,
                  createdTs,
                  detectAlt,
                  detectLat,
                  detectLon,
                  endTime,
                  (errEllp ?: JsonMissing.of()).map { it.toImmutable() },
                  externalId,
                  idOnOrbit,
                  idRfEmitter,
                  idSensor,
                  maxFreq,
                  minFreq,
                  numBursts,
                  orderId,
                  origin,
                  origNetwork,
                  origObjectId,
                  origRfEmitterId,
                  origSensorId,
                  passGroupId,
                  receivedTs,
                  satNo,
                  signalOfInterest,
                  sourceDl,
                  (tags ?: JsonMissing.of()).map { it.toImmutable() },
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
                signalOfInterestType()
                source()
                startTime()
                id()
                agjson()
                algVersion()
                andims()
                area()
                asrid()
                atext()
                atype()
                centerFreq()
                cluster()
                confArea()
                constellation()
                createdAt()
                createdBy()
                createdTs()
                detectAlt()
                detectLat()
                detectLon()
                endTime()
                errEllp()
                externalId()
                idOnOrbit()
                idRfEmitter()
                idSensor()
                maxFreq()
                minFreq()
                numBursts()
                orderId()
                origin()
                origNetwork()
                origObjectId()
                origRfEmitterId()
                origSensorId()
                passGroupId()
                receivedTs()
                satNo()
                signalOfInterest()
                sourceDl()
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
        internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (signalOfInterestType.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (startTime.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (agjson.asKnown().isPresent) 1 else 0) + (if (algVersion.asKnown().isPresent) 1 else 0) + (if (andims.asKnown().isPresent) 1 else 0) + (if (area.asKnown().isPresent) 1 else 0) + (if (asrid.asKnown().isPresent) 1 else 0) + (if (atext.asKnown().isPresent) 1 else 0) + (if (atype.asKnown().isPresent) 1 else 0) + (if (centerFreq.asKnown().isPresent) 1 else 0) + (if (cluster.asKnown().isPresent) 1 else 0) + (if (confArea.asKnown().isPresent) 1 else 0) + (if (constellation.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (createdTs.asKnown().isPresent) 1 else 0) + (if (detectAlt.asKnown().isPresent) 1 else 0) + (if (detectLat.asKnown().isPresent) 1 else 0) + (if (detectLon.asKnown().isPresent) 1 else 0) + (if (endTime.asKnown().isPresent) 1 else 0) + (errEllp.asKnown().getOrNull()?.size ?: 0) + (if (externalId.asKnown().isPresent) 1 else 0) + (if (idOnOrbit.asKnown().isPresent) 1 else 0) + (if (idRfEmitter.asKnown().isPresent) 1 else 0) + (if (idSensor.asKnown().isPresent) 1 else 0) + (if (maxFreq.asKnown().isPresent) 1 else 0) + (if (minFreq.asKnown().isPresent) 1 else 0) + (if (numBursts.asKnown().isPresent) 1 else 0) + (if (orderId.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (origObjectId.asKnown().isPresent) 1 else 0) + (if (origRfEmitterId.asKnown().isPresent) 1 else 0) + (if (origSensorId.asKnown().isPresent) 1 else 0) + (if (passGroupId.asKnown().isPresent) 1 else 0) + (if (receivedTs.asKnown().isPresent) 1 else 0) + (if (satNo.asKnown().isPresent) 1 else 0) + (if (signalOfInterest.asKnown().isPresent) 1 else 0) + (if (sourceDl.asKnown().isPresent) 1 else 0) + (tags.asKnown().getOrNull()?.size ?: 0)

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

          return /* spotless:off */ other is Body && classificationMarking == other.classificationMarking && dataMode == other.dataMode && signalOfInterestType == other.signalOfInterestType && source == other.source && startTime == other.startTime && id == other.id && agjson == other.agjson && algVersion == other.algVersion && andims == other.andims && area == other.area && asrid == other.asrid && atext == other.atext && atype == other.atype && centerFreq == other.centerFreq && cluster == other.cluster && confArea == other.confArea && constellation == other.constellation && createdAt == other.createdAt && createdBy == other.createdBy && createdTs == other.createdTs && detectAlt == other.detectAlt && detectLat == other.detectLat && detectLon == other.detectLon && endTime == other.endTime && errEllp == other.errEllp && externalId == other.externalId && idOnOrbit == other.idOnOrbit && idRfEmitter == other.idRfEmitter && idSensor == other.idSensor && maxFreq == other.maxFreq && minFreq == other.minFreq && numBursts == other.numBursts && orderId == other.orderId && origin == other.origin && origNetwork == other.origNetwork && origObjectId == other.origObjectId && origRfEmitterId == other.origRfEmitterId && origSensorId == other.origSensorId && passGroupId == other.passGroupId && receivedTs == other.receivedTs && satNo == other.satNo && signalOfInterest == other.signalOfInterest && sourceDl == other.sourceDl && tags == other.tags /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, signalOfInterestType, source, startTime, id, agjson, algVersion, andims, area, asrid, atext, atype, centerFreq, cluster, confArea, constellation, createdAt, createdBy, createdTs, detectAlt, detectLat, detectLon, endTime, errEllp, externalId, idOnOrbit, idRfEmitter, idSensor, maxFreq, minFreq, numBursts, orderId, origin, origNetwork, origObjectId, origRfEmitterId, origSensorId, passGroupId, receivedTs, satNo, signalOfInterest, sourceDl, tags) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, signalOfInterestType=$signalOfInterestType, source=$source, startTime=$startTime, id=$id, agjson=$agjson, algVersion=$algVersion, andims=$andims, area=$area, asrid=$asrid, atext=$atext, atype=$atype, centerFreq=$centerFreq, cluster=$cluster, confArea=$confArea, constellation=$constellation, createdAt=$createdAt, createdBy=$createdBy, createdTs=$createdTs, detectAlt=$detectAlt, detectLat=$detectLat, detectLon=$detectLon, endTime=$endTime, errEllp=$errEllp, externalId=$externalId, idOnOrbit=$idOnOrbit, idRfEmitter=$idRfEmitter, idSensor=$idSensor, maxFreq=$maxFreq, minFreq=$minFreq, numBursts=$numBursts, orderId=$orderId, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origRfEmitterId=$origRfEmitterId, origSensorId=$origSensorId, passGroupId=$passGroupId, receivedTs=$receivedTs, satNo=$satNo, signalOfInterest=$signalOfInterest, sourceDl=$sourceDl, tags=$tags}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EmitterGeolocationUnvalidatedPublishParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "EmitterGeolocationUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

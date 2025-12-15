// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.swir

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
 * Service operation intended for initial integration only, to take a list of SWIR records as a POST
 * body and ingest into the database. This operation is not intended to be used for automated feeds
 * into UDL. Data providers should contact the UDL team for specific role assignments and for
 * instructions on setting up a permanent feed through an alternate mechanism.
 */
class SwirCreateBulkParams
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
         * Returns a mutable builder for constructing an instance of [SwirCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SwirCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(swirCreateBulkParams: SwirCreateBulkParams) = apply {
            body = swirCreateBulkParams.body.toMutableList()
            additionalHeaders = swirCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = swirCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [SwirCreateBulkParams].
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
        fun build(): SwirCreateBulkParams =
            SwirCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Data representing observed short wave infrared (SWIR) measurements. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val ts: JsonField<OffsetDateTime>,
        private val id: JsonField<String>,
        private val absFluxes: JsonField<List<Double>>,
        private val badWave: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val fluxRatios: JsonField<List<Double>>,
        private val idOnOrbit: JsonField<String>,
        private val lat: JsonField<Double>,
        private val locationName: JsonField<String>,
        private val lon: JsonField<Double>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val origObjectId: JsonField<String>,
        private val ratioWavelengths: JsonField<List<Double>>,
        private val satNo: JsonField<Int>,
        private val solarPhaseAngle: JsonField<Double>,
        private val wavelengths: JsonField<List<Double>>,
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
            @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("absFluxes")
            @ExcludeMissing
            absFluxes: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("badWave") @ExcludeMissing badWave: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fluxRatios")
            @ExcludeMissing
            fluxRatios: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("idOnOrbit")
            @ExcludeMissing
            idOnOrbit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("locationName")
            @ExcludeMissing
            locationName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origObjectId")
            @ExcludeMissing
            origObjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ratioWavelengths")
            @ExcludeMissing
            ratioWavelengths: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("solarPhaseAngle")
            @ExcludeMissing
            solarPhaseAngle: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("wavelengths")
            @ExcludeMissing
            wavelengths: JsonField<List<Double>> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            source,
            ts,
            id,
            absFluxes,
            badWave,
            createdAt,
            createdBy,
            fluxRatios,
            idOnOrbit,
            lat,
            locationName,
            lon,
            origin,
            origNetwork,
            origObjectId,
            ratioWavelengths,
            satNo,
            solarPhaseAngle,
            wavelengths,
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
         * Data timestamp in ISO8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun ts(): OffsetDateTime = ts.getRequired("ts")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Array of absolute flux measurement data, in Watts per square centimeter per micron. This
         * array should correspond with the same-sized array of wavelengths.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun absFluxes(): Optional<List<Double>> = absFluxes.getOptional("absFluxes")

        /**
         * User comments concerning sensor or data limitations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun badWave(): Optional<String> = badWave.getOptional("badWave")

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
         * Array of flux ratio data. This array should correspond with the same-sized array of
         * ratioWavelengths.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fluxRatios(): Optional<List<Double>> = fluxRatios.getOptional("fluxRatios")

        /**
         * Unique identifier of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Spacecraft WGS84 latitude, in degrees at obTime. -90 to 90 degrees (negative values south
         * of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * Location/name of the observing sensor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun locationName(): Optional<String> = locationName.getOptional("locationName")

        /**
         * Spacecraft WGS84 longitude at ob time, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Optional<Double> = lon.getOptional("lon")

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
         * Original object ID or Catalog Number provided by source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Array of ratio wavelength data. This array should correspond with the same-sized array of
         * fluxRatios.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ratioWavelengths(): Optional<List<Double>> =
            ratioWavelengths.getOptional("ratioWavelengths")

        /**
         * Satellite/catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * The angle, in degrees, between the target-to-observer vector and the target-to-sun
         * vector.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun solarPhaseAngle(): Optional<Double> = solarPhaseAngle.getOptional("solarPhaseAngle")

        /**
         * Array of wavelengths, in microns. This array should correspond with the same-sized array
         * of absFluxes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun wavelengths(): Optional<List<Double>> = wavelengths.getOptional("wavelengths")

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
         * Returns the raw JSON value of [ts].
         *
         * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<OffsetDateTime> = ts

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [absFluxes].
         *
         * Unlike [absFluxes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("absFluxes")
        @ExcludeMissing
        fun _absFluxes(): JsonField<List<Double>> = absFluxes

        /**
         * Returns the raw JSON value of [badWave].
         *
         * Unlike [badWave], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("badWave") @ExcludeMissing fun _badWave(): JsonField<String> = badWave

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
         * Returns the raw JSON value of [fluxRatios].
         *
         * Unlike [fluxRatios], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fluxRatios")
        @ExcludeMissing
        fun _fluxRatios(): JsonField<List<Double>> = fluxRatios

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [locationName].
         *
         * Unlike [locationName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("locationName")
        @ExcludeMissing
        fun _locationName(): JsonField<String> = locationName

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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
         * Returns the raw JSON value of [ratioWavelengths].
         *
         * Unlike [ratioWavelengths], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ratioWavelengths")
        @ExcludeMissing
        fun _ratioWavelengths(): JsonField<List<Double>> = ratioWavelengths

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [solarPhaseAngle].
         *
         * Unlike [solarPhaseAngle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("solarPhaseAngle")
        @ExcludeMissing
        fun _solarPhaseAngle(): JsonField<Double> = solarPhaseAngle

        /**
         * Returns the raw JSON value of [wavelengths].
         *
         * Unlike [wavelengths], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wavelengths")
        @ExcludeMissing
        fun _wavelengths(): JsonField<List<Double>> = wavelengths

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
             * .ts()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var ts: JsonField<OffsetDateTime>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var absFluxes: JsonField<MutableList<Double>>? = null
            private var badWave: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var fluxRatios: JsonField<MutableList<Double>>? = null
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var locationName: JsonField<String> = JsonMissing.of()
            private var lon: JsonField<Double> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var ratioWavelengths: JsonField<MutableList<Double>>? = null
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var solarPhaseAngle: JsonField<Double> = JsonMissing.of()
            private var wavelengths: JsonField<MutableList<Double>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                ts = body.ts
                id = body.id
                absFluxes = body.absFluxes.map { it.toMutableList() }
                badWave = body.badWave
                createdAt = body.createdAt
                createdBy = body.createdBy
                fluxRatios = body.fluxRatios.map { it.toMutableList() }
                idOnOrbit = body.idOnOrbit
                lat = body.lat
                locationName = body.locationName
                lon = body.lon
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                ratioWavelengths = body.ratioWavelengths.map { it.toMutableList() }
                satNo = body.satNo
                solarPhaseAngle = body.solarPhaseAngle
                wavelengths = body.wavelengths.map { it.toMutableList() }
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

            /** Data timestamp in ISO8601 UTC format. */
            fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

            /**
             * Sets [Builder.ts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

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
             * Array of absolute flux measurement data, in Watts per square centimeter per micron.
             * This array should correspond with the same-sized array of wavelengths.
             */
            fun absFluxes(absFluxes: List<Double>) = absFluxes(JsonField.of(absFluxes))

            /**
             * Sets [Builder.absFluxes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.absFluxes] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun absFluxes(absFluxes: JsonField<List<Double>>) = apply {
                this.absFluxes = absFluxes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [absFluxes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAbsFlux(absFlux: Double) = apply {
                absFluxes =
                    (absFluxes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("absFluxes", it).add(absFlux)
                    }
            }

            /** User comments concerning sensor or data limitations. */
            fun badWave(badWave: String) = badWave(JsonField.of(badWave))

            /**
             * Sets [Builder.badWave] to an arbitrary JSON value.
             *
             * You should usually call [Builder.badWave] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun badWave(badWave: JsonField<String>) = apply { this.badWave = badWave }

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
             * Array of flux ratio data. This array should correspond with the same-sized array of
             * ratioWavelengths.
             */
            fun fluxRatios(fluxRatios: List<Double>) = fluxRatios(JsonField.of(fluxRatios))

            /**
             * Sets [Builder.fluxRatios] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fluxRatios] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fluxRatios(fluxRatios: JsonField<List<Double>>) = apply {
                this.fluxRatios = fluxRatios.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [fluxRatios].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFluxRatio(fluxRatio: Double) = apply {
                fluxRatios =
                    (fluxRatios ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fluxRatios", it).add(fluxRatio)
                    }
            }

            /** Unique identifier of the target on-orbit object. */
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
             * Spacecraft WGS84 latitude, in degrees at obTime. -90 to 90 degrees (negative values
             * south of equator).
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

            /** Location/name of the observing sensor. */
            fun locationName(locationName: String) = locationName(JsonField.of(locationName))

            /**
             * Sets [Builder.locationName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationName(locationName: JsonField<String>) = apply {
                this.locationName = locationName
            }

            /**
             * Spacecraft WGS84 longitude at ob time, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
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

            /** Original object ID or Catalog Number provided by source. */
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
             * Array of ratio wavelength data. This array should correspond with the same-sized
             * array of fluxRatios.
             */
            fun ratioWavelengths(ratioWavelengths: List<Double>) =
                ratioWavelengths(JsonField.of(ratioWavelengths))

            /**
             * Sets [Builder.ratioWavelengths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ratioWavelengths] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ratioWavelengths(ratioWavelengths: JsonField<List<Double>>) = apply {
                this.ratioWavelengths = ratioWavelengths.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [ratioWavelengths].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRatioWavelength(ratioWavelength: Double) = apply {
                ratioWavelengths =
                    (ratioWavelengths ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ratioWavelengths", it).add(ratioWavelength)
                    }
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

            /**
             * The angle, in degrees, between the target-to-observer vector and the target-to-sun
             * vector.
             */
            fun solarPhaseAngle(solarPhaseAngle: Double) =
                solarPhaseAngle(JsonField.of(solarPhaseAngle))

            /**
             * Sets [Builder.solarPhaseAngle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.solarPhaseAngle] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun solarPhaseAngle(solarPhaseAngle: JsonField<Double>) = apply {
                this.solarPhaseAngle = solarPhaseAngle
            }

            /**
             * Array of wavelengths, in microns. This array should correspond with the same-sized
             * array of absFluxes.
             */
            fun wavelengths(wavelengths: List<Double>) = wavelengths(JsonField.of(wavelengths))

            /**
             * Sets [Builder.wavelengths] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wavelengths] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wavelengths(wavelengths: JsonField<List<Double>>) = apply {
                this.wavelengths = wavelengths.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [wavelengths].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addWavelength(wavelength: Double) = apply {
                wavelengths =
                    (wavelengths ?: JsonField.of(mutableListOf())).also {
                        checkKnown("wavelengths", it).add(wavelength)
                    }
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
             * .ts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    checkRequired("ts", ts),
                    id,
                    (absFluxes ?: JsonMissing.of()).map { it.toImmutable() },
                    badWave,
                    createdAt,
                    createdBy,
                    (fluxRatios ?: JsonMissing.of()).map { it.toImmutable() },
                    idOnOrbit,
                    lat,
                    locationName,
                    lon,
                    origin,
                    origNetwork,
                    origObjectId,
                    (ratioWavelengths ?: JsonMissing.of()).map { it.toImmutable() },
                    satNo,
                    solarPhaseAngle,
                    (wavelengths ?: JsonMissing.of()).map { it.toImmutable() },
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
            ts()
            id()
            absFluxes()
            badWave()
            createdAt()
            createdBy()
            fluxRatios()
            idOnOrbit()
            lat()
            locationName()
            lon()
            origin()
            origNetwork()
            origObjectId()
            ratioWavelengths()
            satNo()
            solarPhaseAngle()
            wavelengths()
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
                (if (ts.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (absFluxes.asKnown().getOrNull()?.size ?: 0) +
                (if (badWave.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (fluxRatios.asKnown().getOrNull()?.size ?: 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (locationName.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (ratioWavelengths.asKnown().getOrNull()?.size ?: 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (if (solarPhaseAngle.asKnown().isPresent) 1 else 0) +
                (wavelengths.asKnown().getOrNull()?.size ?: 0)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                ts == other.ts &&
                id == other.id &&
                absFluxes == other.absFluxes &&
                badWave == other.badWave &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                fluxRatios == other.fluxRatios &&
                idOnOrbit == other.idOnOrbit &&
                lat == other.lat &&
                locationName == other.locationName &&
                lon == other.lon &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                ratioWavelengths == other.ratioWavelengths &&
                satNo == other.satNo &&
                solarPhaseAngle == other.solarPhaseAngle &&
                wavelengths == other.wavelengths &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                ts,
                id,
                absFluxes,
                badWave,
                createdAt,
                createdBy,
                fluxRatios,
                idOnOrbit,
                lat,
                locationName,
                lon,
                origin,
                origNetwork,
                origObjectId,
                ratioWavelengths,
                satNo,
                solarPhaseAngle,
                wavelengths,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, id=$id, absFluxes=$absFluxes, badWave=$badWave, createdAt=$createdAt, createdBy=$createdBy, fluxRatios=$fluxRatios, idOnOrbit=$idOnOrbit, lat=$lat, locationName=$locationName, lon=$lon, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, ratioWavelengths=$ratioWavelengths, satNo=$satNo, solarPhaseAngle=$solarPhaseAngle, wavelengths=$wavelengths, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SwirCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SwirCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

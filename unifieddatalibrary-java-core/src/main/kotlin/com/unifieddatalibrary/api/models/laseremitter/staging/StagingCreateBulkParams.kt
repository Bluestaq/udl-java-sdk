// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.laseremitter.staging

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.Params
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.http.Headers
import com.unifieddatalibrary.api.core.http.QueryParams
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Service operation to take multiple LaserEmitterStaging records as a POST body and ingest into the
 * staging database. This API allows users to create, manage, and review LaserEmitterStaging records
 * in a staging environment before their incorporation into the production UDL. It supports
 * workflows involving validation, review, and approval of emitter data to ensure consistency,
 * compliance, and data quality. A specific role is required to perform this service operation.
 * Please contact the UDL team for assistance.
 */
class StagingCreateBulkParams
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
         * Returns a mutable builder for constructing an instance of [StagingCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StagingCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(stagingCreateBulkParams: StagingCreateBulkParams) = apply {
            body = stagingCreateBulkParams.body.toMutableList()
            additionalHeaders = stagingCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = stagingCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [StagingCreateBulkParams].
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
        fun build(): StagingCreateBulkParams =
            StagingCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Model representation of a nominal laser emitter. This entity contains minimal information
     * used to stage laser emitter entities.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val laserName: JsonField<String>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val altitude: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val laserType: JsonField<String>,
        private val lat: JsonField<Double>,
        private val locationCountry: JsonField<String>,
        private val lon: JsonField<Double>,
        private val ownerCountry: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("laserName")
            @ExcludeMissing
            laserName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altitude")
            @ExcludeMissing
            altitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("laserType")
            @ExcludeMissing
            laserType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("locationCountry")
            @ExcludeMissing
            locationCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ownerCountry")
            @ExcludeMissing
            ownerCountry: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            laserName,
            source,
            id,
            altitude,
            createdAt,
            createdBy,
            laserType,
            lat,
            locationCountry,
            lon,
            ownerCountry,
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
         * Unique name of this Laser Emitter.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun laserName(): String = laserName.getRequired("laserName")

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
         * Emitter altitude relative to WGS-84 ellipsoid, in kilometers. Positive values indicate an
         * emitter height above ellipsoid, and negative values indicate an emitter height below
         * ellipsoid.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altitude(): Optional<Double> = altitude.getOptional("altitude")

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
         * The type of laser (e.g. CONTINUOUS WAVE, PULSED, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun laserType(): Optional<String> = laserType.getOptional("laserType")

        /**
         * WGS-84 latitude of the emitter, in degrees. -90 to 90 degrees (negative values south of
         * equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * The DoD Standard Country Code designator for the country or political entity to which the
         * Laser Emitter equipment geographic coordinates reside. This value is typically the ISO
         * 3166 Alpha-2 two-character country code, however it can also represent various
         * consortiums that do not appear in the ISO document. The code must correspond to an
         * existing country in the UDL’s country API. Call udl/country/{code} to get any associated
         * FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified
         * country code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun locationCountry(): Optional<String> = locationCountry.getOptional("locationCountry")

        /**
         * WGS-84 longitude of the emitter, in degrees. -180 to 180 degrees (negative values west of
         * Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Optional<Double> = lon.getOptional("lon")

        /**
         * The DoD Standard Country Code designator for the country or political entity owning the
         * Laser Emitter. This value is typically the ISO 3166 Alpha-2 two-character country code,
         * however it can also represent various consortiums that do not appear in the ISO document.
         * The code must correspond to an existing country in the UDL’s country API. Call
         * udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code
         * values that exist for the specified country code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ownerCountry(): Optional<String> = ownerCountry.getOptional("ownerCountry")

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
         * Returns the raw JSON value of [laserName].
         *
         * Unlike [laserName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("laserName") @ExcludeMissing fun _laserName(): JsonField<String> = laserName

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
         * Returns the raw JSON value of [altitude].
         *
         * Unlike [altitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altitude") @ExcludeMissing fun _altitude(): JsonField<Double> = altitude

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
         * Returns the raw JSON value of [laserType].
         *
         * Unlike [laserType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("laserType") @ExcludeMissing fun _laserType(): JsonField<String> = laserType

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [locationCountry].
         *
         * Unlike [locationCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("locationCountry")
        @ExcludeMissing
        fun _locationCountry(): JsonField<String> = locationCountry

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

        /**
         * Returns the raw JSON value of [ownerCountry].
         *
         * Unlike [ownerCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ownerCountry")
        @ExcludeMissing
        fun _ownerCountry(): JsonField<String> = ownerCountry

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
             * .laserName()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var laserName: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var altitude: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var laserType: JsonField<String> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var locationCountry: JsonField<String> = JsonMissing.of()
            private var lon: JsonField<Double> = JsonMissing.of()
            private var ownerCountry: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                laserName = body.laserName
                source = body.source
                id = body.id
                altitude = body.altitude
                createdAt = body.createdAt
                createdBy = body.createdBy
                laserType = body.laserType
                lat = body.lat
                locationCountry = body.locationCountry
                lon = body.lon
                ownerCountry = body.ownerCountry
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

            /** Unique name of this Laser Emitter. */
            fun laserName(laserName: String) = laserName(JsonField.of(laserName))

            /**
             * Sets [Builder.laserName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.laserName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun laserName(laserName: JsonField<String>) = apply { this.laserName = laserName }

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
             * Emitter altitude relative to WGS-84 ellipsoid, in kilometers. Positive values
             * indicate an emitter height above ellipsoid, and negative values indicate an emitter
             * height below ellipsoid.
             */
            fun altitude(altitude: Double) = altitude(JsonField.of(altitude))

            /**
             * Sets [Builder.altitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altitude(altitude: JsonField<Double>) = apply { this.altitude = altitude }

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

            /** The type of laser (e.g. CONTINUOUS WAVE, PULSED, etc.). */
            fun laserType(laserType: String) = laserType(JsonField.of(laserType))

            /**
             * Sets [Builder.laserType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.laserType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun laserType(laserType: JsonField<String>) = apply { this.laserType = laserType }

            /**
             * WGS-84 latitude of the emitter, in degrees. -90 to 90 degrees (negative values south
             * of equator).
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
             * The DoD Standard Country Code designator for the country or political entity to which
             * the Laser Emitter equipment geographic coordinates reside. This value is typically
             * the ISO 3166 Alpha-2 two-character country code, however it can also represent
             * various consortiums that do not appear in the ISO document. The code must correspond
             * to an existing country in the UDL’s country API. Call udl/country/{code} to get any
             * associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the
             * specified country code.
             */
            fun locationCountry(locationCountry: String) =
                locationCountry(JsonField.of(locationCountry))

            /**
             * Sets [Builder.locationCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locationCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locationCountry(locationCountry: JsonField<String>) = apply {
                this.locationCountry = locationCountry
            }

            /**
             * WGS-84 longitude of the emitter, in degrees. -180 to 180 degrees (negative values
             * west of Prime Meridian).
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
             * The DoD Standard Country Code designator for the country or political entity owning
             * the Laser Emitter. This value is typically the ISO 3166 Alpha-2 two-character country
             * code, however it can also represent various consortiums that do not appear in the ISO
             * document. The code must correspond to an existing country in the UDL’s country API.
             * Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or
             * alternate code values that exist for the specified country code.
             */
            fun ownerCountry(ownerCountry: String) = ownerCountry(JsonField.of(ownerCountry))

            /**
             * Sets [Builder.ownerCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownerCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownerCountry(ownerCountry: JsonField<String>) = apply {
                this.ownerCountry = ownerCountry
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
             * .laserName()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("laserName", laserName),
                    checkRequired("source", source),
                    id,
                    altitude,
                    createdAt,
                    createdBy,
                    laserType,
                    lat,
                    locationCountry,
                    lon,
                    ownerCountry,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            laserName()
            source()
            id()
            altitude()
            createdAt()
            createdBy()
            laserType()
            lat()
            locationCountry()
            lon()
            ownerCountry()
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
                (if (laserName.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (altitude.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (laserType.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (locationCountry.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (ownerCountry.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                laserName == other.laserName &&
                source == other.source &&
                id == other.id &&
                altitude == other.altitude &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                laserType == other.laserType &&
                lat == other.lat &&
                locationCountry == other.locationCountry &&
                lon == other.lon &&
                ownerCountry == other.ownerCountry &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                laserName,
                source,
                id,
                altitude,
                createdAt,
                createdBy,
                laserType,
                lat,
                locationCountry,
                lon,
                ownerCountry,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, laserName=$laserName, source=$source, id=$id, altitude=$altitude, createdAt=$createdAt, createdBy=$createdBy, laserType=$laserType, lat=$lat, locationCountry=$locationCountry, lon=$lon, ownerCountry=$ownerCountry, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StagingCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StagingCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

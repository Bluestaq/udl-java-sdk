// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.mti

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to take a list of Moving Target Indicator (MTI) formatted data as a POST body
 * and ingest into the database. This operation is intended to be used for automated feeds into UDL.
 * A specific role is required to perform this service operation. Please contact the UDL team for
 * assistance.
 */
class MtiUnvalidatedPublishParams
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
         * Returns a mutable builder for constructing an instance of [MtiUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MtiUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(mtiUnvalidatedPublishParams: MtiUnvalidatedPublishParams) = apply {
            body = mtiUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders = mtiUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams = mtiUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [MtiUnvalidatedPublishParams].
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
        fun build(): MtiUnvalidatedPublishParams =
            MtiUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Information on the mission and flight plans, the type and configuration of the platform, and
     * the reference time.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("dwells") @ExcludeMissing private val dwells: JsonField<List<Dwell>>,
        @JsonProperty("freeTexts") @ExcludeMissing private val freeTexts: JsonField<List<FreeText>>,
        @JsonProperty("hrrs") @ExcludeMissing private val hrrs: JsonField<List<Hrr>>,
        @JsonProperty("jobDefs") @ExcludeMissing private val jobDefs: JsonField<List<JobDef>>,
        @JsonProperty("jobRequests")
        @ExcludeMissing
        private val jobRequests: JsonField<List<JobRequest>>,
        @JsonProperty("missions") @ExcludeMissing private val missions: JsonField<List<Mission>>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("p10") @ExcludeMissing private val p10: JsonField<Int>,
        @JsonProperty("p3") @ExcludeMissing private val p3: JsonField<String>,
        @JsonProperty("p6") @ExcludeMissing private val p6: JsonField<String>,
        @JsonProperty("p7") @ExcludeMissing private val p7: JsonField<String>,
        @JsonProperty("p8") @ExcludeMissing private val p8: JsonField<String>,
        @JsonProperty("p9") @ExcludeMissing private val p9: JsonField<Int>,
        @JsonProperty("platformLocs")
        @ExcludeMissing
        private val platformLocs: JsonField<List<PlatformLoc>>,
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
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dwells(): Optional<List<Dwell>> = dwells.getOptional("dwells")

        /**
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun freeTexts(): Optional<List<FreeText>> = freeTexts.getOptional("freeTexts")

        /**
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hrrs(): Optional<List<Hrr>> = hrrs.getOptional("hrrs")

        /**
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun jobDefs(): Optional<List<JobDef>> = jobDefs.getOptional("jobDefs")

        /**
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun jobRequests(): Optional<List<JobRequest>> = jobRequests.getOptional("jobRequests")

        /**
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missions(): Optional<List<Mission>> = missions.getOptional("missions")

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
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun p10(): Optional<Int> = p10.getOptional("p10")

        /**
         * Nationality of the platform providing the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun p3(): Optional<String> = p3.getOptional("p3")

        /**
         * Control / handling marking.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun p6(): Optional<String> = p6.getOptional("p6")

        /**
         * Data record exercise indicator.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun p7(): Optional<String> = p7.getOptional("p7")

        /**
         * ID of the platform providing the data (tail number for air platform, name and numerical
         * designator for space-based platforms).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun p8(): Optional<String> = p8.getOptional("p8")

        /**
         * Integer field, assigned by the platform, that uniquely identifies the mission for the
         * platform.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun p9(): Optional<Int> = p9.getOptional("p9")

        /**
         * A platform-assigned number identifying the specific request or task that pertains to all
         * Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun platformLocs(): Optional<List<PlatformLoc>> = platformLocs.getOptional("platformLocs")

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
         * Returns the raw JSON value of [dwells].
         *
         * Unlike [dwells], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dwells") @ExcludeMissing fun _dwells(): JsonField<List<Dwell>> = dwells

        /**
         * Returns the raw JSON value of [freeTexts].
         *
         * Unlike [freeTexts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freeTexts")
        @ExcludeMissing
        fun _freeTexts(): JsonField<List<FreeText>> = freeTexts

        /**
         * Returns the raw JSON value of [hrrs].
         *
         * Unlike [hrrs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hrrs") @ExcludeMissing fun _hrrs(): JsonField<List<Hrr>> = hrrs

        /**
         * Returns the raw JSON value of [jobDefs].
         *
         * Unlike [jobDefs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jobDefs") @ExcludeMissing fun _jobDefs(): JsonField<List<JobDef>> = jobDefs

        /**
         * Returns the raw JSON value of [jobRequests].
         *
         * Unlike [jobRequests], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jobRequests")
        @ExcludeMissing
        fun _jobRequests(): JsonField<List<JobRequest>> = jobRequests

        /**
         * Returns the raw JSON value of [missions].
         *
         * Unlike [missions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missions")
        @ExcludeMissing
        fun _missions(): JsonField<List<Mission>> = missions

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
         * Returns the raw JSON value of [p10].
         *
         * Unlike [p10], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p10") @ExcludeMissing fun _p10(): JsonField<Int> = p10

        /**
         * Returns the raw JSON value of [p3].
         *
         * Unlike [p3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p3") @ExcludeMissing fun _p3(): JsonField<String> = p3

        /**
         * Returns the raw JSON value of [p6].
         *
         * Unlike [p6], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p6") @ExcludeMissing fun _p6(): JsonField<String> = p6

        /**
         * Returns the raw JSON value of [p7].
         *
         * Unlike [p7], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p7") @ExcludeMissing fun _p7(): JsonField<String> = p7

        /**
         * Returns the raw JSON value of [p8].
         *
         * Unlike [p8], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p8") @ExcludeMissing fun _p8(): JsonField<String> = p8

        /**
         * Returns the raw JSON value of [p9].
         *
         * Unlike [p9], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("p9") @ExcludeMissing fun _p9(): JsonField<Int> = p9

        /**
         * Returns the raw JSON value of [platformLocs].
         *
         * Unlike [platformLocs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platformLocs")
        @ExcludeMissing
        fun _platformLocs(): JsonField<List<PlatformLoc>> = platformLocs

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var dwells: JsonField<MutableList<Dwell>>? = null
            private var freeTexts: JsonField<MutableList<FreeText>>? = null
            private var hrrs: JsonField<MutableList<Hrr>>? = null
            private var jobDefs: JsonField<MutableList<JobDef>>? = null
            private var jobRequests: JsonField<MutableList<JobRequest>>? = null
            private var missions: JsonField<MutableList<Mission>>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var p10: JsonField<Int> = JsonMissing.of()
            private var p3: JsonField<String> = JsonMissing.of()
            private var p6: JsonField<String> = JsonMissing.of()
            private var p7: JsonField<String> = JsonMissing.of()
            private var p8: JsonField<String> = JsonMissing.of()
            private var p9: JsonField<Int> = JsonMissing.of()
            private var platformLocs: JsonField<MutableList<PlatformLoc>>? = null

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                id = body.id
                createdAt = body.createdAt
                createdBy = body.createdBy
                dwells = body.dwells.map { it.toMutableList() }
                freeTexts = body.freeTexts.map { it.toMutableList() }
                hrrs = body.hrrs.map { it.toMutableList() }
                jobDefs = body.jobDefs.map { it.toMutableList() }
                jobRequests = body.jobRequests.map { it.toMutableList() }
                missions = body.missions.map { it.toMutableList() }
                origin = body.origin
                origNetwork = body.origNetwork
                p10 = body.p10
                p3 = body.p3
                p6 = body.p6
                p7 = body.p7
                p8 = body.p8
                p9 = body.p9
                platformLocs = body.platformLocs.map { it.toMutableList() }
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
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun dwells(dwells: List<Dwell>) = dwells(JsonField.of(dwells))

            /**
             * Sets [Builder.dwells] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dwells] with a well-typed `List<Dwell>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dwells(dwells: JsonField<List<Dwell>>) = apply {
                this.dwells = dwells.map { it.toMutableList() }
            }

            /**
             * Adds a single [Dwell] to [dwells].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDwell(dwell: Dwell) = apply {
                dwells =
                    (dwells ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dwells", it).add(dwell)
                    }
            }

            /**
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun freeTexts(freeTexts: List<FreeText>) = freeTexts(JsonField.of(freeTexts))

            /**
             * Sets [Builder.freeTexts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeTexts] with a well-typed `List<FreeText>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeTexts(freeTexts: JsonField<List<FreeText>>) = apply {
                this.freeTexts = freeTexts.map { it.toMutableList() }
            }

            /**
             * Adds a single [FreeText] to [freeTexts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFreeText(freeText: FreeText) = apply {
                freeTexts =
                    (freeTexts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("freeTexts", it).add(freeText)
                    }
            }

            /**
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun hrrs(hrrs: List<Hrr>) = hrrs(JsonField.of(hrrs))

            /**
             * Sets [Builder.hrrs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hrrs] with a well-typed `List<Hrr>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hrrs(hrrs: JsonField<List<Hrr>>) = apply {
                this.hrrs = hrrs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Hrr] to [hrrs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addHrr(hrr: Hrr) = apply {
                hrrs =
                    (hrrs ?: JsonField.of(mutableListOf())).also { checkKnown("hrrs", it).add(hrr) }
            }

            /**
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun jobDefs(jobDefs: List<JobDef>) = jobDefs(JsonField.of(jobDefs))

            /**
             * Sets [Builder.jobDefs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobDefs] with a well-typed `List<JobDef>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobDefs(jobDefs: JsonField<List<JobDef>>) = apply {
                this.jobDefs = jobDefs.map { it.toMutableList() }
            }

            /**
             * Adds a single [JobDef] to [jobDefs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addJobDef(jobDef: JobDef) = apply {
                jobDefs =
                    (jobDefs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("jobDefs", it).add(jobDef)
                    }
            }

            /**
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun jobRequests(jobRequests: List<JobRequest>) = jobRequests(JsonField.of(jobRequests))

            /**
             * Sets [Builder.jobRequests] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobRequests] with a well-typed `List<JobRequest>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun jobRequests(jobRequests: JsonField<List<JobRequest>>) = apply {
                this.jobRequests = jobRequests.map { it.toMutableList() }
            }

            /**
             * Adds a single [JobRequest] to [jobRequests].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addJobRequest(jobRequest: JobRequest) = apply {
                jobRequests =
                    (jobRequests ?: JsonField.of(mutableListOf())).also {
                        checkKnown("jobRequests", it).add(jobRequest)
                    }
            }

            /**
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun missions(missions: List<Mission>) = missions(JsonField.of(missions))

            /**
             * Sets [Builder.missions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missions] with a well-typed `List<Mission>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missions(missions: JsonField<List<Mission>>) = apply {
                this.missions = missions.map { it.toMutableList() }
            }

            /**
             * Adds a single [Mission] to [missions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMission(mission: Mission) = apply {
                missions =
                    (missions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("missions", it).add(mission)
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
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun p10(p10: Int) = p10(JsonField.of(p10))

            /**
             * Sets [Builder.p10] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p10] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p10(p10: JsonField<Int>) = apply { this.p10 = p10 }

            /** Nationality of the platform providing the data. */
            fun p3(p3: String) = p3(JsonField.of(p3))

            /**
             * Sets [Builder.p3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p3] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p3(p3: JsonField<String>) = apply { this.p3 = p3 }

            /** Control / handling marking. */
            fun p6(p6: String) = p6(JsonField.of(p6))

            /**
             * Sets [Builder.p6] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p6] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p6(p6: JsonField<String>) = apply { this.p6 = p6 }

            /** Data record exercise indicator. */
            fun p7(p7: String) = p7(JsonField.of(p7))

            /**
             * Sets [Builder.p7] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p7] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p7(p7: JsonField<String>) = apply { this.p7 = p7 }

            /**
             * ID of the platform providing the data (tail number for air platform, name and
             * numerical designator for space-based platforms).
             */
            fun p8(p8: String) = p8(JsonField.of(p8))

            /**
             * Sets [Builder.p8] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p8] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p8(p8: JsonField<String>) = apply { this.p8 = p8 }

            /**
             * Integer field, assigned by the platform, that uniquely identifies the mission for the
             * platform.
             */
            fun p9(p9: Int) = p9(JsonField.of(p9))

            /**
             * Sets [Builder.p9] to an arbitrary JSON value.
             *
             * You should usually call [Builder.p9] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun p9(p9: JsonField<Int>) = apply { this.p9 = p9 }

            /**
             * A platform-assigned number identifying the specific request or task that pertains to
             * all Dwell, HRR, and Range-Doppler segments in the packet. Job ID is unique within a
             * mission.
             */
            fun platformLocs(platformLocs: List<PlatformLoc>) =
                platformLocs(JsonField.of(platformLocs))

            /**
             * Sets [Builder.platformLocs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformLocs] with a well-typed `List<PlatformLoc>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun platformLocs(platformLocs: JsonField<List<PlatformLoc>>) = apply {
                this.platformLocs = platformLocs.map { it.toMutableList() }
            }

            /**
             * Adds a single [PlatformLoc] to [platformLocs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPlatformLoc(platformLoc: PlatformLoc) = apply {
                platformLocs =
                    (platformLocs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("platformLocs", it).add(platformLoc)
                    }
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    id,
                    createdAt,
                    createdBy,
                    (dwells ?: JsonMissing.of()).map { it.toImmutable() },
                    (freeTexts ?: JsonMissing.of()).map { it.toImmutable() },
                    (hrrs ?: JsonMissing.of()).map { it.toImmutable() },
                    (jobDefs ?: JsonMissing.of()).map { it.toImmutable() },
                    (jobRequests ?: JsonMissing.of()).map { it.toImmutable() },
                    (missions ?: JsonMissing.of()).map { it.toImmutable() },
                    origin,
                    origNetwork,
                    p10,
                    p3,
                    p6,
                    p7,
                    p8,
                    p9,
                    (platformLocs ?: JsonMissing.of()).map { it.toImmutable() },
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
            id()
            createdAt()
            createdBy()
            dwells().ifPresent { it.forEach { it.validate() } }
            freeTexts().ifPresent { it.forEach { it.validate() } }
            hrrs().ifPresent { it.forEach { it.validate() } }
            jobDefs().ifPresent { it.forEach { it.validate() } }
            jobRequests().ifPresent { it.forEach { it.validate() } }
            missions().ifPresent { it.forEach { it.validate() } }
            origin()
            origNetwork()
            p10()
            p3()
            p6()
            p7()
            p8()
            p9()
            platformLocs().ifPresent { it.forEach { it.validate() } }
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
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (dwells.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (freeTexts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (hrrs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (jobDefs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (jobRequests.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (missions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (p10.asKnown().isPresent) 1 else 0) +
                (if (p3.asKnown().isPresent) 1 else 0) +
                (if (p6.asKnown().isPresent) 1 else 0) +
                (if (p7.asKnown().isPresent) 1 else 0) +
                (if (p8.asKnown().isPresent) 1 else 0) +
                (if (p9.asKnown().isPresent) 1 else 0) +
                (platformLocs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        class Dwell
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val d10: JsonField<Double>,
            private val d11: JsonField<Double>,
            private val d12: JsonField<Int>,
            private val d13: JsonField<Int>,
            private val d14: JsonField<Int>,
            private val d15: JsonField<Double>,
            private val d16: JsonField<Int>,
            private val d17: JsonField<Long>,
            private val d18: JsonField<Long>,
            private val d19: JsonField<Int>,
            private val d2: JsonField<Int>,
            private val d20: JsonField<Int>,
            private val d21: JsonField<Double>,
            private val d22: JsonField<Double>,
            private val d23: JsonField<Double>,
            private val d24: JsonField<Double>,
            private val d25: JsonField<Double>,
            private val d26: JsonField<Double>,
            private val d27: JsonField<Double>,
            private val d28: JsonField<Double>,
            private val d29: JsonField<Double>,
            private val d3: JsonField<Int>,
            private val d30: JsonField<Double>,
            private val d31: JsonField<Long>,
            private val d32: JsonField<List<D32>>,
            private val d4: JsonField<Boolean>,
            private val d5: JsonField<Int>,
            private val d6: JsonField<Long>,
            private val d7: JsonField<Double>,
            private val d8: JsonField<Double>,
            private val d9: JsonField<Int>,
            private val dwellts: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("d10") @ExcludeMissing d10: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d11") @ExcludeMissing d11: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d12") @ExcludeMissing d12: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d13") @ExcludeMissing d13: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d14") @ExcludeMissing d14: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d15") @ExcludeMissing d15: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d16") @ExcludeMissing d16: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d17") @ExcludeMissing d17: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("d18") @ExcludeMissing d18: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("d19") @ExcludeMissing d19: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d2") @ExcludeMissing d2: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d20") @ExcludeMissing d20: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d21") @ExcludeMissing d21: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d22") @ExcludeMissing d22: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d23") @ExcludeMissing d23: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d24") @ExcludeMissing d24: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d25") @ExcludeMissing d25: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d26") @ExcludeMissing d26: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d27") @ExcludeMissing d27: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d28") @ExcludeMissing d28: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d29") @ExcludeMissing d29: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d3") @ExcludeMissing d3: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d30") @ExcludeMissing d30: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d31") @ExcludeMissing d31: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("d32") @ExcludeMissing d32: JsonField<List<D32>> = JsonMissing.of(),
                @JsonProperty("d4") @ExcludeMissing d4: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("d5") @ExcludeMissing d5: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("d6") @ExcludeMissing d6: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("d7") @ExcludeMissing d7: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d8") @ExcludeMissing d8: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("d9") @ExcludeMissing d9: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("dwellts")
                @ExcludeMissing
                dwellts: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                d10,
                d11,
                d12,
                d13,
                d14,
                d15,
                d16,
                d17,
                d18,
                d19,
                d2,
                d20,
                d21,
                d22,
                d23,
                d24,
                d25,
                d26,
                d27,
                d28,
                d29,
                d3,
                d30,
                d31,
                d32,
                d4,
                d5,
                d6,
                d7,
                d8,
                d9,
                dwellts,
                mutableMapOf(),
            )

            /**
             * Factor which modifies the value of the reported target latitude (Delta Latitude,
             * field D32.4).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d10(): Optional<Double> = d10.getOptional("d10")

            /**
             * Factor which modifies the value of the reported target longitude (Delta Longitude,
             * field D32.5).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d11(): Optional<Double> = d11.getOptional("d11")

            /**
             * Standard deviation in the estimated horizontal sensor location at the time of the
             * dwell, measured along the sensor track direction (field D15), in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d12(): Optional<Int> = d12.getOptional("d12")

            /**
             * Standard deviation in the estimated horizontal sensor location at the time of the
             * dwell, measured orthogonal to the sensor track direction (field D15), in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d13(): Optional<Int> = d13.getOptional("d13")

            /**
             * Standard deviation of the sensor altitude estimate (field D9), in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d14(): Optional<Int> = d14.getOptional("d14")

            /**
             * Ground track of the sensor at the time of the dwell, as the angle in degrees
             * (clockwise) from True North.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d15(): Optional<Double> = d15.getOptional("d15")

            /**
             * Ground speed of the sensor at the time of the dwell, in millimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d16(): Optional<Int> = d16.getOptional("d16")

            /**
             * Velocity of the sensor in the vertical direction, in decimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d17(): Optional<Long> = d17.getOptional("d17")

            /**
             * Standard deviation of the estimate of the sensor track, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d18(): Optional<Long> = d18.getOptional("d18")

            /**
             * Standard deviation of estimate of the sensor speed, in millimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d19(): Optional<Int> = d19.getOptional("d19")

            /**
             * Sequential count of a revisit of the bounding area in the last sent Job Definition
             * Segment, where a Revisit Index of '0' indicates the first revisit.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d2(): Optional<Int> = d2.getOptional("d2")

            /**
             * Standard deviation of estimate of the sensor vertical velocity, expressed in
             * centimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d20(): Optional<Int> = d20.getOptional("d20")

            /**
             * Heading of the platform at the time of the dwell, as the angle in degrees (clockwise)
             * from True North to the roll axis of the platform.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d21(): Optional<Double> = d21.getOptional("d21")

            /**
             * Pitch angle of the platform at the time of the dwell, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d22(): Optional<Double> = d22.getOptional("d22")

            /**
             * Roll angle of the platform at the time of the dwell, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d23(): Optional<Double> = d23.getOptional("d23")

            /**
             * The North-South position of the center of the dwell area, expressed as degrees North
             * (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d24(): Optional<Double> = d24.getOptional("d24")

            /**
             * The East-West position of the center of the dwell area, expressed as degrees East
             * (positive, 0 to 180) or West (negative, 0 to -180) of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d25(): Optional<Double> = d25.getOptional("d25")

            /**
             * Distance on the earth surface, expressed in kilometers, from the near edge to the
             * center of the dwell area.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d26(): Optional<Double> = d26.getOptional("d26")

            /**
             * For dwell based radars, one-half of the 3-dB beamwidth. For non-dwell based radars,
             * the angle between the beginning of the dwell to the center of the dwell. Measured in
             * degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d27(): Optional<Double> = d27.getOptional("d27")

            /**
             * Rotation of the sensor broadside face about the local vertical axis of the platform,
             * in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d28(): Optional<Double> = d28.getOptional("d28")

            /**
             * Rotation angle of the sensor about the transverse axis of the sensor broadside, in
             * degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d29(): Optional<Double> = d29.getOptional("d29")

            /**
             * Temporally sequential count of a dwell within the revisit of a particular bounding
             * area for a given job ID.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d3(): Optional<Int> = d3.getOptional("d3")

            /**
             * Rotation angle of the sensor about the transverse axis of the sensor broadside, in
             * degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d30(): Optional<Double> = d30.getOptional("d30")

            /**
             * Minimum velocity component, along the line of sight, which can be detected by the
             * sensor, in decimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d31(): Optional<Long> = d31.getOptional("d31")

            /**
             * Minimum velocity component, along the line of sight, which can be detected by the
             * sensor, in decimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d32(): Optional<List<D32>> = d32.getOptional("d32")

            /**
             * Flag indicating the last dwell of the revisit.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d4(): Optional<Boolean> = d4.getOptional("d4")

            /**
             * Count of the total number of targets reported during this dwell and sent in this
             * Dwell Segment.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d5(): Optional<Int> = d5.getOptional("d5")

            /**
             * Elapsed time, expressed in milliseconds, from midnight at the beginning of the day
             * specified in the Reference Time fields (missionRefTime) of the Mission Segment.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d6(): Optional<Long> = d6.getOptional("d6")

            /**
             * North-South position of the sensor at the temporal center of the dwell, in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d7(): Optional<Double> = d7.getOptional("d7")

            /**
             * The East-West position of the sensor at the temporal center of the dwell, in degrees
             * East (positive, 0 to 180) or West (negative, 0 to -180) of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d8(): Optional<Double> = d8.getOptional("d8")

            /**
             * The altitude of the sensor at temporal center of the dwell, above the WGS 84
             * ellipsoid, expressed in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun d9(): Optional<Int> = d9.getOptional("d9")

            /**
             * Dwell timestamp in ISO8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dwellts(): Optional<OffsetDateTime> = dwellts.getOptional("dwellts")

            /**
             * Returns the raw JSON value of [d10].
             *
             * Unlike [d10], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d10") @ExcludeMissing fun _d10(): JsonField<Double> = d10

            /**
             * Returns the raw JSON value of [d11].
             *
             * Unlike [d11], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d11") @ExcludeMissing fun _d11(): JsonField<Double> = d11

            /**
             * Returns the raw JSON value of [d12].
             *
             * Unlike [d12], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d12") @ExcludeMissing fun _d12(): JsonField<Int> = d12

            /**
             * Returns the raw JSON value of [d13].
             *
             * Unlike [d13], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d13") @ExcludeMissing fun _d13(): JsonField<Int> = d13

            /**
             * Returns the raw JSON value of [d14].
             *
             * Unlike [d14], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d14") @ExcludeMissing fun _d14(): JsonField<Int> = d14

            /**
             * Returns the raw JSON value of [d15].
             *
             * Unlike [d15], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d15") @ExcludeMissing fun _d15(): JsonField<Double> = d15

            /**
             * Returns the raw JSON value of [d16].
             *
             * Unlike [d16], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d16") @ExcludeMissing fun _d16(): JsonField<Int> = d16

            /**
             * Returns the raw JSON value of [d17].
             *
             * Unlike [d17], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d17") @ExcludeMissing fun _d17(): JsonField<Long> = d17

            /**
             * Returns the raw JSON value of [d18].
             *
             * Unlike [d18], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d18") @ExcludeMissing fun _d18(): JsonField<Long> = d18

            /**
             * Returns the raw JSON value of [d19].
             *
             * Unlike [d19], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d19") @ExcludeMissing fun _d19(): JsonField<Int> = d19

            /**
             * Returns the raw JSON value of [d2].
             *
             * Unlike [d2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d2") @ExcludeMissing fun _d2(): JsonField<Int> = d2

            /**
             * Returns the raw JSON value of [d20].
             *
             * Unlike [d20], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d20") @ExcludeMissing fun _d20(): JsonField<Int> = d20

            /**
             * Returns the raw JSON value of [d21].
             *
             * Unlike [d21], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d21") @ExcludeMissing fun _d21(): JsonField<Double> = d21

            /**
             * Returns the raw JSON value of [d22].
             *
             * Unlike [d22], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d22") @ExcludeMissing fun _d22(): JsonField<Double> = d22

            /**
             * Returns the raw JSON value of [d23].
             *
             * Unlike [d23], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d23") @ExcludeMissing fun _d23(): JsonField<Double> = d23

            /**
             * Returns the raw JSON value of [d24].
             *
             * Unlike [d24], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d24") @ExcludeMissing fun _d24(): JsonField<Double> = d24

            /**
             * Returns the raw JSON value of [d25].
             *
             * Unlike [d25], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d25") @ExcludeMissing fun _d25(): JsonField<Double> = d25

            /**
             * Returns the raw JSON value of [d26].
             *
             * Unlike [d26], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d26") @ExcludeMissing fun _d26(): JsonField<Double> = d26

            /**
             * Returns the raw JSON value of [d27].
             *
             * Unlike [d27], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d27") @ExcludeMissing fun _d27(): JsonField<Double> = d27

            /**
             * Returns the raw JSON value of [d28].
             *
             * Unlike [d28], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d28") @ExcludeMissing fun _d28(): JsonField<Double> = d28

            /**
             * Returns the raw JSON value of [d29].
             *
             * Unlike [d29], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d29") @ExcludeMissing fun _d29(): JsonField<Double> = d29

            /**
             * Returns the raw JSON value of [d3].
             *
             * Unlike [d3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d3") @ExcludeMissing fun _d3(): JsonField<Int> = d3

            /**
             * Returns the raw JSON value of [d30].
             *
             * Unlike [d30], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d30") @ExcludeMissing fun _d30(): JsonField<Double> = d30

            /**
             * Returns the raw JSON value of [d31].
             *
             * Unlike [d31], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d31") @ExcludeMissing fun _d31(): JsonField<Long> = d31

            /**
             * Returns the raw JSON value of [d32].
             *
             * Unlike [d32], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d32") @ExcludeMissing fun _d32(): JsonField<List<D32>> = d32

            /**
             * Returns the raw JSON value of [d4].
             *
             * Unlike [d4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d4") @ExcludeMissing fun _d4(): JsonField<Boolean> = d4

            /**
             * Returns the raw JSON value of [d5].
             *
             * Unlike [d5], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d5") @ExcludeMissing fun _d5(): JsonField<Int> = d5

            /**
             * Returns the raw JSON value of [d6].
             *
             * Unlike [d6], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d6") @ExcludeMissing fun _d6(): JsonField<Long> = d6

            /**
             * Returns the raw JSON value of [d7].
             *
             * Unlike [d7], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d7") @ExcludeMissing fun _d7(): JsonField<Double> = d7

            /**
             * Returns the raw JSON value of [d8].
             *
             * Unlike [d8], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d8") @ExcludeMissing fun _d8(): JsonField<Double> = d8

            /**
             * Returns the raw JSON value of [d9].
             *
             * Unlike [d9], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("d9") @ExcludeMissing fun _d9(): JsonField<Int> = d9

            /**
             * Returns the raw JSON value of [dwellts].
             *
             * Unlike [dwellts], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dwellts")
            @ExcludeMissing
            fun _dwellts(): JsonField<OffsetDateTime> = dwellts

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

                /** Returns a mutable builder for constructing an instance of [Dwell]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dwell]. */
            class Builder internal constructor() {

                private var d10: JsonField<Double> = JsonMissing.of()
                private var d11: JsonField<Double> = JsonMissing.of()
                private var d12: JsonField<Int> = JsonMissing.of()
                private var d13: JsonField<Int> = JsonMissing.of()
                private var d14: JsonField<Int> = JsonMissing.of()
                private var d15: JsonField<Double> = JsonMissing.of()
                private var d16: JsonField<Int> = JsonMissing.of()
                private var d17: JsonField<Long> = JsonMissing.of()
                private var d18: JsonField<Long> = JsonMissing.of()
                private var d19: JsonField<Int> = JsonMissing.of()
                private var d2: JsonField<Int> = JsonMissing.of()
                private var d20: JsonField<Int> = JsonMissing.of()
                private var d21: JsonField<Double> = JsonMissing.of()
                private var d22: JsonField<Double> = JsonMissing.of()
                private var d23: JsonField<Double> = JsonMissing.of()
                private var d24: JsonField<Double> = JsonMissing.of()
                private var d25: JsonField<Double> = JsonMissing.of()
                private var d26: JsonField<Double> = JsonMissing.of()
                private var d27: JsonField<Double> = JsonMissing.of()
                private var d28: JsonField<Double> = JsonMissing.of()
                private var d29: JsonField<Double> = JsonMissing.of()
                private var d3: JsonField<Int> = JsonMissing.of()
                private var d30: JsonField<Double> = JsonMissing.of()
                private var d31: JsonField<Long> = JsonMissing.of()
                private var d32: JsonField<MutableList<D32>>? = null
                private var d4: JsonField<Boolean> = JsonMissing.of()
                private var d5: JsonField<Int> = JsonMissing.of()
                private var d6: JsonField<Long> = JsonMissing.of()
                private var d7: JsonField<Double> = JsonMissing.of()
                private var d8: JsonField<Double> = JsonMissing.of()
                private var d9: JsonField<Int> = JsonMissing.of()
                private var dwellts: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dwell: Dwell) = apply {
                    d10 = dwell.d10
                    d11 = dwell.d11
                    d12 = dwell.d12
                    d13 = dwell.d13
                    d14 = dwell.d14
                    d15 = dwell.d15
                    d16 = dwell.d16
                    d17 = dwell.d17
                    d18 = dwell.d18
                    d19 = dwell.d19
                    d2 = dwell.d2
                    d20 = dwell.d20
                    d21 = dwell.d21
                    d22 = dwell.d22
                    d23 = dwell.d23
                    d24 = dwell.d24
                    d25 = dwell.d25
                    d26 = dwell.d26
                    d27 = dwell.d27
                    d28 = dwell.d28
                    d29 = dwell.d29
                    d3 = dwell.d3
                    d30 = dwell.d30
                    d31 = dwell.d31
                    d32 = dwell.d32.map { it.toMutableList() }
                    d4 = dwell.d4
                    d5 = dwell.d5
                    d6 = dwell.d6
                    d7 = dwell.d7
                    d8 = dwell.d8
                    d9 = dwell.d9
                    dwellts = dwell.dwellts
                    additionalProperties = dwell.additionalProperties.toMutableMap()
                }

                /**
                 * Factor which modifies the value of the reported target latitude (Delta Latitude,
                 * field D32.4).
                 */
                fun d10(d10: Double) = d10(JsonField.of(d10))

                /**
                 * Sets [Builder.d10] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d10] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d10(d10: JsonField<Double>) = apply { this.d10 = d10 }

                /**
                 * Factor which modifies the value of the reported target longitude (Delta
                 * Longitude, field D32.5).
                 */
                fun d11(d11: Double) = d11(JsonField.of(d11))

                /**
                 * Sets [Builder.d11] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d11] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d11(d11: JsonField<Double>) = apply { this.d11 = d11 }

                /**
                 * Standard deviation in the estimated horizontal sensor location at the time of the
                 * dwell, measured along the sensor track direction (field D15), in centimeters.
                 */
                fun d12(d12: Int) = d12(JsonField.of(d12))

                /**
                 * Sets [Builder.d12] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d12] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d12(d12: JsonField<Int>) = apply { this.d12 = d12 }

                /**
                 * Standard deviation in the estimated horizontal sensor location at the time of the
                 * dwell, measured orthogonal to the sensor track direction (field D15), in
                 * centimeters.
                 */
                fun d13(d13: Int) = d13(JsonField.of(d13))

                /**
                 * Sets [Builder.d13] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d13] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d13(d13: JsonField<Int>) = apply { this.d13 = d13 }

                /**
                 * Standard deviation of the sensor altitude estimate (field D9), in centimeters.
                 */
                fun d14(d14: Int) = d14(JsonField.of(d14))

                /**
                 * Sets [Builder.d14] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d14] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d14(d14: JsonField<Int>) = apply { this.d14 = d14 }

                /**
                 * Ground track of the sensor at the time of the dwell, as the angle in degrees
                 * (clockwise) from True North.
                 */
                fun d15(d15: Double) = d15(JsonField.of(d15))

                /**
                 * Sets [Builder.d15] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d15] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d15(d15: JsonField<Double>) = apply { this.d15 = d15 }

                /**
                 * Ground speed of the sensor at the time of the dwell, in millimeters per second.
                 */
                fun d16(d16: Int) = d16(JsonField.of(d16))

                /**
                 * Sets [Builder.d16] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d16] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d16(d16: JsonField<Int>) = apply { this.d16 = d16 }

                /** Velocity of the sensor in the vertical direction, in decimeters per second. */
                fun d17(d17: Long) = d17(JsonField.of(d17))

                /**
                 * Sets [Builder.d17] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d17] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d17(d17: JsonField<Long>) = apply { this.d17 = d17 }

                /** Standard deviation of the estimate of the sensor track, in degrees. */
                fun d18(d18: Long) = d18(JsonField.of(d18))

                /**
                 * Sets [Builder.d18] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d18] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d18(d18: JsonField<Long>) = apply { this.d18 = d18 }

                /**
                 * Standard deviation of estimate of the sensor speed, in millimeters per second.
                 */
                fun d19(d19: Int) = d19(JsonField.of(d19))

                /**
                 * Sets [Builder.d19] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d19] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d19(d19: JsonField<Int>) = apply { this.d19 = d19 }

                /**
                 * Sequential count of a revisit of the bounding area in the last sent Job
                 * Definition Segment, where a Revisit Index of '0' indicates the first revisit.
                 */
                fun d2(d2: Int) = d2(JsonField.of(d2))

                /**
                 * Sets [Builder.d2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d2] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d2(d2: JsonField<Int>) = apply { this.d2 = d2 }

                /**
                 * Standard deviation of estimate of the sensor vertical velocity, expressed in
                 * centimeters per second.
                 */
                fun d20(d20: Int) = d20(JsonField.of(d20))

                /**
                 * Sets [Builder.d20] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d20] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d20(d20: JsonField<Int>) = apply { this.d20 = d20 }

                /**
                 * Heading of the platform at the time of the dwell, as the angle in degrees
                 * (clockwise) from True North to the roll axis of the platform.
                 */
                fun d21(d21: Double) = d21(JsonField.of(d21))

                /**
                 * Sets [Builder.d21] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d21] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d21(d21: JsonField<Double>) = apply { this.d21 = d21 }

                /** Pitch angle of the platform at the time of the dwell, in degrees. */
                fun d22(d22: Double) = d22(JsonField.of(d22))

                /**
                 * Sets [Builder.d22] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d22] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d22(d22: JsonField<Double>) = apply { this.d22 = d22 }

                /** Roll angle of the platform at the time of the dwell, in degrees. */
                fun d23(d23: Double) = d23(JsonField.of(d23))

                /**
                 * Sets [Builder.d23] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d23] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d23(d23: JsonField<Double>) = apply { this.d23 = d23 }

                /**
                 * The North-South position of the center of the dwell area, expressed as degrees
                 * North (positive) or South (negative) of the Equator.
                 */
                fun d24(d24: Double) = d24(JsonField.of(d24))

                /**
                 * Sets [Builder.d24] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d24] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d24(d24: JsonField<Double>) = apply { this.d24 = d24 }

                /**
                 * The East-West position of the center of the dwell area, expressed as degrees East
                 * (positive, 0 to 180) or West (negative, 0 to -180) of the Prime Meridian.
                 */
                fun d25(d25: Double) = d25(JsonField.of(d25))

                /**
                 * Sets [Builder.d25] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d25] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d25(d25: JsonField<Double>) = apply { this.d25 = d25 }

                /**
                 * Distance on the earth surface, expressed in kilometers, from the near edge to the
                 * center of the dwell area.
                 */
                fun d26(d26: Double) = d26(JsonField.of(d26))

                /**
                 * Sets [Builder.d26] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d26] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d26(d26: JsonField<Double>) = apply { this.d26 = d26 }

                /**
                 * For dwell based radars, one-half of the 3-dB beamwidth. For non-dwell based
                 * radars, the angle between the beginning of the dwell to the center of the dwell.
                 * Measured in degrees.
                 */
                fun d27(d27: Double) = d27(JsonField.of(d27))

                /**
                 * Sets [Builder.d27] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d27] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d27(d27: JsonField<Double>) = apply { this.d27 = d27 }

                /**
                 * Rotation of the sensor broadside face about the local vertical axis of the
                 * platform, in degrees.
                 */
                fun d28(d28: Double) = d28(JsonField.of(d28))

                /**
                 * Sets [Builder.d28] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d28] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d28(d28: JsonField<Double>) = apply { this.d28 = d28 }

                /**
                 * Rotation angle of the sensor about the transverse axis of the sensor broadside,
                 * in degrees.
                 */
                fun d29(d29: Double) = d29(JsonField.of(d29))

                /**
                 * Sets [Builder.d29] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d29] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d29(d29: JsonField<Double>) = apply { this.d29 = d29 }

                /**
                 * Temporally sequential count of a dwell within the revisit of a particular
                 * bounding area for a given job ID.
                 */
                fun d3(d3: Int) = d3(JsonField.of(d3))

                /**
                 * Sets [Builder.d3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d3] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d3(d3: JsonField<Int>) = apply { this.d3 = d3 }

                /**
                 * Rotation angle of the sensor about the transverse axis of the sensor broadside,
                 * in degrees.
                 */
                fun d30(d30: Double) = d30(JsonField.of(d30))

                /**
                 * Sets [Builder.d30] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d30] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d30(d30: JsonField<Double>) = apply { this.d30 = d30 }

                /**
                 * Minimum velocity component, along the line of sight, which can be detected by the
                 * sensor, in decimeters per second.
                 */
                fun d31(d31: Long) = d31(JsonField.of(d31))

                /**
                 * Sets [Builder.d31] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d31] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d31(d31: JsonField<Long>) = apply { this.d31 = d31 }

                /**
                 * Minimum velocity component, along the line of sight, which can be detected by the
                 * sensor, in decimeters per second.
                 */
                fun d32(d32: List<D32>) = d32(JsonField.of(d32))

                /**
                 * Sets [Builder.d32] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d32] with a well-typed `List<D32>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun d32(d32: JsonField<List<D32>>) = apply {
                    this.d32 = d32.map { it.toMutableList() }
                }

                /**
                 * Adds a single [D32] to [Builder.d32].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addD32(d32: D32) = apply {
                    this.d32 =
                        (this.d32 ?: JsonField.of(mutableListOf())).also {
                            checkKnown("d32", it).add(d32)
                        }
                }

                /** Flag indicating the last dwell of the revisit. */
                fun d4(d4: Boolean) = d4(JsonField.of(d4))

                /**
                 * Sets [Builder.d4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d4] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d4(d4: JsonField<Boolean>) = apply { this.d4 = d4 }

                /**
                 * Count of the total number of targets reported during this dwell and sent in this
                 * Dwell Segment.
                 */
                fun d5(d5: Int) = d5(JsonField.of(d5))

                /**
                 * Sets [Builder.d5] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d5] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d5(d5: JsonField<Int>) = apply { this.d5 = d5 }

                /**
                 * Elapsed time, expressed in milliseconds, from midnight at the beginning of the
                 * day specified in the Reference Time fields (missionRefTime) of the Mission
                 * Segment.
                 */
                fun d6(d6: Long) = d6(JsonField.of(d6))

                /**
                 * Sets [Builder.d6] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d6] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d6(d6: JsonField<Long>) = apply { this.d6 = d6 }

                /**
                 * North-South position of the sensor at the temporal center of the dwell, in
                 * degrees.
                 */
                fun d7(d7: Double) = d7(JsonField.of(d7))

                /**
                 * Sets [Builder.d7] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d7] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d7(d7: JsonField<Double>) = apply { this.d7 = d7 }

                /**
                 * The East-West position of the sensor at the temporal center of the dwell, in
                 * degrees East (positive, 0 to 180) or West (negative, 0 to -180) of the Prime
                 * Meridian.
                 */
                fun d8(d8: Double) = d8(JsonField.of(d8))

                /**
                 * Sets [Builder.d8] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d8] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun d8(d8: JsonField<Double>) = apply { this.d8 = d8 }

                /**
                 * The altitude of the sensor at temporal center of the dwell, above the WGS 84
                 * ellipsoid, expressed in centimeters.
                 */
                fun d9(d9: Int) = d9(JsonField.of(d9))

                /**
                 * Sets [Builder.d9] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.d9] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun d9(d9: JsonField<Int>) = apply { this.d9 = d9 }

                /** Dwell timestamp in ISO8601 UTC format. */
                fun dwellts(dwellts: OffsetDateTime) = dwellts(JsonField.of(dwellts))

                /**
                 * Sets [Builder.dwellts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dwellts] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun dwellts(dwellts: JsonField<OffsetDateTime>) = apply { this.dwellts = dwellts }

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
                 * Returns an immutable instance of [Dwell].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dwell =
                    Dwell(
                        d10,
                        d11,
                        d12,
                        d13,
                        d14,
                        d15,
                        d16,
                        d17,
                        d18,
                        d19,
                        d2,
                        d20,
                        d21,
                        d22,
                        d23,
                        d24,
                        d25,
                        d26,
                        d27,
                        d28,
                        d29,
                        d3,
                        d30,
                        d31,
                        (d32 ?: JsonMissing.of()).map { it.toImmutable() },
                        d4,
                        d5,
                        d6,
                        d7,
                        d8,
                        d9,
                        dwellts,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Dwell = apply {
                if (validated) {
                    return@apply
                }

                d10()
                d11()
                d12()
                d13()
                d14()
                d15()
                d16()
                d17()
                d18()
                d19()
                d2()
                d20()
                d21()
                d22()
                d23()
                d24()
                d25()
                d26()
                d27()
                d28()
                d29()
                d3()
                d30()
                d31()
                d32().ifPresent { it.forEach { it.validate() } }
                d4()
                d5()
                d6()
                d7()
                d8()
                d9()
                dwellts()
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
                (if (d10.asKnown().isPresent) 1 else 0) +
                    (if (d11.asKnown().isPresent) 1 else 0) +
                    (if (d12.asKnown().isPresent) 1 else 0) +
                    (if (d13.asKnown().isPresent) 1 else 0) +
                    (if (d14.asKnown().isPresent) 1 else 0) +
                    (if (d15.asKnown().isPresent) 1 else 0) +
                    (if (d16.asKnown().isPresent) 1 else 0) +
                    (if (d17.asKnown().isPresent) 1 else 0) +
                    (if (d18.asKnown().isPresent) 1 else 0) +
                    (if (d19.asKnown().isPresent) 1 else 0) +
                    (if (d2.asKnown().isPresent) 1 else 0) +
                    (if (d20.asKnown().isPresent) 1 else 0) +
                    (if (d21.asKnown().isPresent) 1 else 0) +
                    (if (d22.asKnown().isPresent) 1 else 0) +
                    (if (d23.asKnown().isPresent) 1 else 0) +
                    (if (d24.asKnown().isPresent) 1 else 0) +
                    (if (d25.asKnown().isPresent) 1 else 0) +
                    (if (d26.asKnown().isPresent) 1 else 0) +
                    (if (d27.asKnown().isPresent) 1 else 0) +
                    (if (d28.asKnown().isPresent) 1 else 0) +
                    (if (d29.asKnown().isPresent) 1 else 0) +
                    (if (d3.asKnown().isPresent) 1 else 0) +
                    (if (d30.asKnown().isPresent) 1 else 0) +
                    (if (d31.asKnown().isPresent) 1 else 0) +
                    (d32.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (d4.asKnown().isPresent) 1 else 0) +
                    (if (d5.asKnown().isPresent) 1 else 0) +
                    (if (d6.asKnown().isPresent) 1 else 0) +
                    (if (d7.asKnown().isPresent) 1 else 0) +
                    (if (d8.asKnown().isPresent) 1 else 0) +
                    (if (d9.asKnown().isPresent) 1 else 0) +
                    (if (dwellts.asKnown().isPresent) 1 else 0)

            /**
             * A grouping of zero or more target reports for which the sensor provides a single
             * time, sensor position, reference position on the ground with simple estimates for the
             * observed area at the reported time, and other pertinent data.
             */
            class D32
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val d32_1: JsonField<Int>,
                private val d32_10: JsonField<String>,
                private val d32_11: JsonField<Long>,
                private val d32_12: JsonField<Int>,
                private val d32_13: JsonField<Int>,
                private val d32_14: JsonField<Long>,
                private val d32_15: JsonField<Long>,
                private val d32_16: JsonField<Long>,
                private val d32_17: JsonField<Long>,
                private val d32_18: JsonField<Long>,
                private val d32_2: JsonField<Double>,
                private val d32_3: JsonField<Double>,
                private val d32_4: JsonField<Long>,
                private val d32_5: JsonField<Long>,
                private val d32_6: JsonField<Long>,
                private val d32_7: JsonField<Long>,
                private val d32_8: JsonField<Int>,
                private val d32_9: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("d32_1") @ExcludeMissing d32_1: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("d32_10")
                    @ExcludeMissing
                    d32_10: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("d32_11")
                    @ExcludeMissing
                    d32_11: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_12")
                    @ExcludeMissing
                    d32_12: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("d32_13")
                    @ExcludeMissing
                    d32_13: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("d32_14")
                    @ExcludeMissing
                    d32_14: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_15")
                    @ExcludeMissing
                    d32_15: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_16")
                    @ExcludeMissing
                    d32_16: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_17")
                    @ExcludeMissing
                    d32_17: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_18")
                    @ExcludeMissing
                    d32_18: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_2")
                    @ExcludeMissing
                    d32_2: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("d32_3")
                    @ExcludeMissing
                    d32_3: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("d32_4")
                    @ExcludeMissing
                    d32_4: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_5")
                    @ExcludeMissing
                    d32_5: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_6")
                    @ExcludeMissing
                    d32_6: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_7")
                    @ExcludeMissing
                    d32_7: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("d32_8") @ExcludeMissing d32_8: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("d32_9") @ExcludeMissing d32_9: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    d32_1,
                    d32_10,
                    d32_11,
                    d32_12,
                    d32_13,
                    d32_14,
                    d32_15,
                    d32_16,
                    d32_17,
                    d32_18,
                    d32_2,
                    d32_3,
                    d32_4,
                    d32_5,
                    d32_6,
                    d32_7,
                    d32_8,
                    d32_9,
                    mutableMapOf(),
                )

                /**
                 * Sequential count of this MTI report within the dwell.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_1(): Optional<Int> = d32_1.getOptional("d32_1")

                /**
                 * The classification of the target (i.e. vehicle, aircraft, …).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_10(): Optional<String> = d32_10.getOptional("d32_10")

                /**
                 * Estimated probability that the target classification field is correctly
                 * classified.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_11(): Optional<Long> = d32_11.getOptional("d32_11")

                /**
                 * Standard deviation of the estimated slant range of the reported detection, in
                 * centimeters.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_12(): Optional<Int> = d32_12.getOptional("d32_12")

                /**
                 * Standard deviation of the position estimate, in the cross-range direction, of the
                 * reported detection, in decimeters.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_13(): Optional<Int> = d32_13.getOptional("d32_13")

                /**
                 * Standard deviation of the estimated geodetic height, in meters.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_14(): Optional<Long> = d32_14.getOptional("d32_14")

                /**
                 * Standard deviation of the measured line-of-sight velocity component, in
                 * centimeters per second.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_15(): Optional<Long> = d32_15.getOptional("d32_15")

                /**
                 * The Truth Tag- Application is the Application Field truncated to 8 bits, from the
                 * Entity State Protocol Data Unit (PDU) used to generate the MTI Target.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_16(): Optional<Long> = d32_16.getOptional("d32_16")

                /**
                 * The Truth Tag - Entity is the Entity Field from the Entity State PDU used to
                 * generate the MTI Target.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_17(): Optional<Long> = d32_17.getOptional("d32_17")

                /**
                 * Estimated radar cross section of the target return, in half-decibels.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_18(): Optional<Long> = d32_18.getOptional("d32_18")

                /**
                 * The North-South position of the reported detection, expressed as degrees North
                 * (positive) or South (negative) of the Equator.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_2(): Optional<Double> = d32_2.getOptional("d32_2")

                /**
                 * The East-West position of the reported detection, expressed as degrees East
                 * (positive) from the Prime Meridian.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_3(): Optional<Double> = d32_3.getOptional("d32_3")

                /**
                 * The North-South position of the reported detection, expressed as degrees North
                 * (positive) or South (negative) from the Dwell Area Center Latitude.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_4(): Optional<Long> = d32_4.getOptional("d32_4")

                /**
                 * The East-West position of the reported detection, expressed as degrees East
                 * (positive, 0 to 180) or West (negative, 0 to -180) of the Prime Meridian from the
                 * Dwell Area Center Longitude.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_5(): Optional<Long> = d32_5.getOptional("d32_5")

                /**
                 * Height of the reported detection, referenced to its position above the WGS 84
                 * ellipsoid, in meters.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_6(): Optional<Long> = d32_6.getOptional("d32_6")

                /**
                 * The component of velocity for the reported detection, expressed in centimeters
                 * per second, corrected for platform motion, along the line of sight between the
                 * sensor and the reported detection, where the positive direction is away from the
                 * sensor.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_7(): Optional<Long> = d32_7.getOptional("d32_7")

                /**
                 * The target wrap velocity permits trackers to un-wrap velocities for targets with
                 * line-of-sight components large enough to exceed the first velocity period.
                 * Expressed in centimeters/sec.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_8(): Optional<Int> = d32_8.getOptional("d32_8")

                /**
                 * Estimated signal-to-noise ratio (SNR) of the target return, in decibels.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun d32_9(): Optional<Long> = d32_9.getOptional("d32_9")

                /**
                 * Returns the raw JSON value of [d32_1].
                 *
                 * Unlike [d32_1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_1") @ExcludeMissing fun _d32_1(): JsonField<Int> = d32_1

                /**
                 * Returns the raw JSON value of [d32_10].
                 *
                 * Unlike [d32_10], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_10") @ExcludeMissing fun _d32_10(): JsonField<String> = d32_10

                /**
                 * Returns the raw JSON value of [d32_11].
                 *
                 * Unlike [d32_11], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_11") @ExcludeMissing fun _d32_11(): JsonField<Long> = d32_11

                /**
                 * Returns the raw JSON value of [d32_12].
                 *
                 * Unlike [d32_12], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_12") @ExcludeMissing fun _d32_12(): JsonField<Int> = d32_12

                /**
                 * Returns the raw JSON value of [d32_13].
                 *
                 * Unlike [d32_13], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_13") @ExcludeMissing fun _d32_13(): JsonField<Int> = d32_13

                /**
                 * Returns the raw JSON value of [d32_14].
                 *
                 * Unlike [d32_14], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_14") @ExcludeMissing fun _d32_14(): JsonField<Long> = d32_14

                /**
                 * Returns the raw JSON value of [d32_15].
                 *
                 * Unlike [d32_15], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_15") @ExcludeMissing fun _d32_15(): JsonField<Long> = d32_15

                /**
                 * Returns the raw JSON value of [d32_16].
                 *
                 * Unlike [d32_16], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_16") @ExcludeMissing fun _d32_16(): JsonField<Long> = d32_16

                /**
                 * Returns the raw JSON value of [d32_17].
                 *
                 * Unlike [d32_17], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_17") @ExcludeMissing fun _d32_17(): JsonField<Long> = d32_17

                /**
                 * Returns the raw JSON value of [d32_18].
                 *
                 * Unlike [d32_18], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_18") @ExcludeMissing fun _d32_18(): JsonField<Long> = d32_18

                /**
                 * Returns the raw JSON value of [d32_2].
                 *
                 * Unlike [d32_2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_2") @ExcludeMissing fun _d32_2(): JsonField<Double> = d32_2

                /**
                 * Returns the raw JSON value of [d32_3].
                 *
                 * Unlike [d32_3], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_3") @ExcludeMissing fun _d32_3(): JsonField<Double> = d32_3

                /**
                 * Returns the raw JSON value of [d32_4].
                 *
                 * Unlike [d32_4], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_4") @ExcludeMissing fun _d32_4(): JsonField<Long> = d32_4

                /**
                 * Returns the raw JSON value of [d32_5].
                 *
                 * Unlike [d32_5], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_5") @ExcludeMissing fun _d32_5(): JsonField<Long> = d32_5

                /**
                 * Returns the raw JSON value of [d32_6].
                 *
                 * Unlike [d32_6], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_6") @ExcludeMissing fun _d32_6(): JsonField<Long> = d32_6

                /**
                 * Returns the raw JSON value of [d32_7].
                 *
                 * Unlike [d32_7], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_7") @ExcludeMissing fun _d32_7(): JsonField<Long> = d32_7

                /**
                 * Returns the raw JSON value of [d32_8].
                 *
                 * Unlike [d32_8], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_8") @ExcludeMissing fun _d32_8(): JsonField<Int> = d32_8

                /**
                 * Returns the raw JSON value of [d32_9].
                 *
                 * Unlike [d32_9], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("d32_9") @ExcludeMissing fun _d32_9(): JsonField<Long> = d32_9

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

                    /** Returns a mutable builder for constructing an instance of [D32]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [D32]. */
                class Builder internal constructor() {

                    private var d32_1: JsonField<Int> = JsonMissing.of()
                    private var d32_10: JsonField<String> = JsonMissing.of()
                    private var d32_11: JsonField<Long> = JsonMissing.of()
                    private var d32_12: JsonField<Int> = JsonMissing.of()
                    private var d32_13: JsonField<Int> = JsonMissing.of()
                    private var d32_14: JsonField<Long> = JsonMissing.of()
                    private var d32_15: JsonField<Long> = JsonMissing.of()
                    private var d32_16: JsonField<Long> = JsonMissing.of()
                    private var d32_17: JsonField<Long> = JsonMissing.of()
                    private var d32_18: JsonField<Long> = JsonMissing.of()
                    private var d32_2: JsonField<Double> = JsonMissing.of()
                    private var d32_3: JsonField<Double> = JsonMissing.of()
                    private var d32_4: JsonField<Long> = JsonMissing.of()
                    private var d32_5: JsonField<Long> = JsonMissing.of()
                    private var d32_6: JsonField<Long> = JsonMissing.of()
                    private var d32_7: JsonField<Long> = JsonMissing.of()
                    private var d32_8: JsonField<Int> = JsonMissing.of()
                    private var d32_9: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(d32: D32) = apply {
                        d32_1 = d32.d32_1
                        d32_10 = d32.d32_10
                        d32_11 = d32.d32_11
                        d32_12 = d32.d32_12
                        d32_13 = d32.d32_13
                        d32_14 = d32.d32_14
                        d32_15 = d32.d32_15
                        d32_16 = d32.d32_16
                        d32_17 = d32.d32_17
                        d32_18 = d32.d32_18
                        d32_2 = d32.d32_2
                        d32_3 = d32.d32_3
                        d32_4 = d32.d32_4
                        d32_5 = d32.d32_5
                        d32_6 = d32.d32_6
                        d32_7 = d32.d32_7
                        d32_8 = d32.d32_8
                        d32_9 = d32.d32_9
                        additionalProperties = d32.additionalProperties.toMutableMap()
                    }

                    /** Sequential count of this MTI report within the dwell. */
                    fun d32_1(d32_1: Int) = d32_1(JsonField.of(d32_1))

                    /**
                     * Sets [Builder.d32_1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_1] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_1(d32_1: JsonField<Int>) = apply { this.d32_1 = d32_1 }

                    /** The classification of the target (i.e. vehicle, aircraft, …). */
                    fun d32_10(d32_10: String) = d32_10(JsonField.of(d32_10))

                    /**
                     * Sets [Builder.d32_10] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_10] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_10(d32_10: JsonField<String>) = apply { this.d32_10 = d32_10 }

                    /**
                     * Estimated probability that the target classification field is correctly
                     * classified.
                     */
                    fun d32_11(d32_11: Long) = d32_11(JsonField.of(d32_11))

                    /**
                     * Sets [Builder.d32_11] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_11] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_11(d32_11: JsonField<Long>) = apply { this.d32_11 = d32_11 }

                    /**
                     * Standard deviation of the estimated slant range of the reported detection, in
                     * centimeters.
                     */
                    fun d32_12(d32_12: Int) = d32_12(JsonField.of(d32_12))

                    /**
                     * Sets [Builder.d32_12] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_12] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_12(d32_12: JsonField<Int>) = apply { this.d32_12 = d32_12 }

                    /**
                     * Standard deviation of the position estimate, in the cross-range direction, of
                     * the reported detection, in decimeters.
                     */
                    fun d32_13(d32_13: Int) = d32_13(JsonField.of(d32_13))

                    /**
                     * Sets [Builder.d32_13] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_13] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_13(d32_13: JsonField<Int>) = apply { this.d32_13 = d32_13 }

                    /** Standard deviation of the estimated geodetic height, in meters. */
                    fun d32_14(d32_14: Long) = d32_14(JsonField.of(d32_14))

                    /**
                     * Sets [Builder.d32_14] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_14] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_14(d32_14: JsonField<Long>) = apply { this.d32_14 = d32_14 }

                    /**
                     * Standard deviation of the measured line-of-sight velocity component, in
                     * centimeters per second.
                     */
                    fun d32_15(d32_15: Long) = d32_15(JsonField.of(d32_15))

                    /**
                     * Sets [Builder.d32_15] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_15] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_15(d32_15: JsonField<Long>) = apply { this.d32_15 = d32_15 }

                    /**
                     * The Truth Tag- Application is the Application Field truncated to 8 bits, from
                     * the Entity State Protocol Data Unit (PDU) used to generate the MTI Target.
                     */
                    fun d32_16(d32_16: Long) = d32_16(JsonField.of(d32_16))

                    /**
                     * Sets [Builder.d32_16] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_16] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_16(d32_16: JsonField<Long>) = apply { this.d32_16 = d32_16 }

                    /**
                     * The Truth Tag - Entity is the Entity Field from the Entity State PDU used to
                     * generate the MTI Target.
                     */
                    fun d32_17(d32_17: Long) = d32_17(JsonField.of(d32_17))

                    /**
                     * Sets [Builder.d32_17] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_17] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_17(d32_17: JsonField<Long>) = apply { this.d32_17 = d32_17 }

                    /** Estimated radar cross section of the target return, in half-decibels. */
                    fun d32_18(d32_18: Long) = d32_18(JsonField.of(d32_18))

                    /**
                     * Sets [Builder.d32_18] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_18] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_18(d32_18: JsonField<Long>) = apply { this.d32_18 = d32_18 }

                    /**
                     * The North-South position of the reported detection, expressed as degrees
                     * North (positive) or South (negative) of the Equator.
                     */
                    fun d32_2(d32_2: Double) = d32_2(JsonField.of(d32_2))

                    /**
                     * Sets [Builder.d32_2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_2] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_2(d32_2: JsonField<Double>) = apply { this.d32_2 = d32_2 }

                    /**
                     * The East-West position of the reported detection, expressed as degrees East
                     * (positive) from the Prime Meridian.
                     */
                    fun d32_3(d32_3: Double) = d32_3(JsonField.of(d32_3))

                    /**
                     * Sets [Builder.d32_3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_3] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_3(d32_3: JsonField<Double>) = apply { this.d32_3 = d32_3 }

                    /**
                     * The North-South position of the reported detection, expressed as degrees
                     * North (positive) or South (negative) from the Dwell Area Center Latitude.
                     */
                    fun d32_4(d32_4: Long) = d32_4(JsonField.of(d32_4))

                    /**
                     * Sets [Builder.d32_4] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_4] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_4(d32_4: JsonField<Long>) = apply { this.d32_4 = d32_4 }

                    /**
                     * The East-West position of the reported detection, expressed as degrees East
                     * (positive, 0 to 180) or West (negative, 0 to -180) of the Prime Meridian from
                     * the Dwell Area Center Longitude.
                     */
                    fun d32_5(d32_5: Long) = d32_5(JsonField.of(d32_5))

                    /**
                     * Sets [Builder.d32_5] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_5] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_5(d32_5: JsonField<Long>) = apply { this.d32_5 = d32_5 }

                    /**
                     * Height of the reported detection, referenced to its position above the WGS 84
                     * ellipsoid, in meters.
                     */
                    fun d32_6(d32_6: Long) = d32_6(JsonField.of(d32_6))

                    /**
                     * Sets [Builder.d32_6] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_6] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_6(d32_6: JsonField<Long>) = apply { this.d32_6 = d32_6 }

                    /**
                     * The component of velocity for the reported detection, expressed in
                     * centimeters per second, corrected for platform motion, along the line of
                     * sight between the sensor and the reported detection, where the positive
                     * direction is away from the sensor.
                     */
                    fun d32_7(d32_7: Long) = d32_7(JsonField.of(d32_7))

                    /**
                     * Sets [Builder.d32_7] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_7] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_7(d32_7: JsonField<Long>) = apply { this.d32_7 = d32_7 }

                    /**
                     * The target wrap velocity permits trackers to un-wrap velocities for targets
                     * with line-of-sight components large enough to exceed the first velocity
                     * period. Expressed in centimeters/sec.
                     */
                    fun d32_8(d32_8: Int) = d32_8(JsonField.of(d32_8))

                    /**
                     * Sets [Builder.d32_8] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_8] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_8(d32_8: JsonField<Int>) = apply { this.d32_8 = d32_8 }

                    /** Estimated signal-to-noise ratio (SNR) of the target return, in decibels. */
                    fun d32_9(d32_9: Long) = d32_9(JsonField.of(d32_9))

                    /**
                     * Sets [Builder.d32_9] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.d32_9] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun d32_9(d32_9: JsonField<Long>) = apply { this.d32_9 = d32_9 }

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
                     * Returns an immutable instance of [D32].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): D32 =
                        D32(
                            d32_1,
                            d32_10,
                            d32_11,
                            d32_12,
                            d32_13,
                            d32_14,
                            d32_15,
                            d32_16,
                            d32_17,
                            d32_18,
                            d32_2,
                            d32_3,
                            d32_4,
                            d32_5,
                            d32_6,
                            d32_7,
                            d32_8,
                            d32_9,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): D32 = apply {
                    if (validated) {
                        return@apply
                    }

                    d32_1()
                    d32_10()
                    d32_11()
                    d32_12()
                    d32_13()
                    d32_14()
                    d32_15()
                    d32_16()
                    d32_17()
                    d32_18()
                    d32_2()
                    d32_3()
                    d32_4()
                    d32_5()
                    d32_6()
                    d32_7()
                    d32_8()
                    d32_9()
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
                    (if (d32_1.asKnown().isPresent) 1 else 0) +
                        (if (d32_10.asKnown().isPresent) 1 else 0) +
                        (if (d32_11.asKnown().isPresent) 1 else 0) +
                        (if (d32_12.asKnown().isPresent) 1 else 0) +
                        (if (d32_13.asKnown().isPresent) 1 else 0) +
                        (if (d32_14.asKnown().isPresent) 1 else 0) +
                        (if (d32_15.asKnown().isPresent) 1 else 0) +
                        (if (d32_16.asKnown().isPresent) 1 else 0) +
                        (if (d32_17.asKnown().isPresent) 1 else 0) +
                        (if (d32_18.asKnown().isPresent) 1 else 0) +
                        (if (d32_2.asKnown().isPresent) 1 else 0) +
                        (if (d32_3.asKnown().isPresent) 1 else 0) +
                        (if (d32_4.asKnown().isPresent) 1 else 0) +
                        (if (d32_5.asKnown().isPresent) 1 else 0) +
                        (if (d32_6.asKnown().isPresent) 1 else 0) +
                        (if (d32_7.asKnown().isPresent) 1 else 0) +
                        (if (d32_8.asKnown().isPresent) 1 else 0) +
                        (if (d32_9.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is D32 &&
                        d32_1 == other.d32_1 &&
                        d32_10 == other.d32_10 &&
                        d32_11 == other.d32_11 &&
                        d32_12 == other.d32_12 &&
                        d32_13 == other.d32_13 &&
                        d32_14 == other.d32_14 &&
                        d32_15 == other.d32_15 &&
                        d32_16 == other.d32_16 &&
                        d32_17 == other.d32_17 &&
                        d32_18 == other.d32_18 &&
                        d32_2 == other.d32_2 &&
                        d32_3 == other.d32_3 &&
                        d32_4 == other.d32_4 &&
                        d32_5 == other.d32_5 &&
                        d32_6 == other.d32_6 &&
                        d32_7 == other.d32_7 &&
                        d32_8 == other.d32_8 &&
                        d32_9 == other.d32_9 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        d32_1,
                        d32_10,
                        d32_11,
                        d32_12,
                        d32_13,
                        d32_14,
                        d32_15,
                        d32_16,
                        d32_17,
                        d32_18,
                        d32_2,
                        d32_3,
                        d32_4,
                        d32_5,
                        d32_6,
                        d32_7,
                        d32_8,
                        d32_9,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "D32{d32_1=$d32_1, d32_10=$d32_10, d32_11=$d32_11, d32_12=$d32_12, d32_13=$d32_13, d32_14=$d32_14, d32_15=$d32_15, d32_16=$d32_16, d32_17=$d32_17, d32_18=$d32_18, d32_2=$d32_2, d32_3=$d32_3, d32_4=$d32_4, d32_5=$d32_5, d32_6=$d32_6, d32_7=$d32_7, d32_8=$d32_8, d32_9=$d32_9, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dwell &&
                    d10 == other.d10 &&
                    d11 == other.d11 &&
                    d12 == other.d12 &&
                    d13 == other.d13 &&
                    d14 == other.d14 &&
                    d15 == other.d15 &&
                    d16 == other.d16 &&
                    d17 == other.d17 &&
                    d18 == other.d18 &&
                    d19 == other.d19 &&
                    d2 == other.d2 &&
                    d20 == other.d20 &&
                    d21 == other.d21 &&
                    d22 == other.d22 &&
                    d23 == other.d23 &&
                    d24 == other.d24 &&
                    d25 == other.d25 &&
                    d26 == other.d26 &&
                    d27 == other.d27 &&
                    d28 == other.d28 &&
                    d29 == other.d29 &&
                    d3 == other.d3 &&
                    d30 == other.d30 &&
                    d31 == other.d31 &&
                    d32 == other.d32 &&
                    d4 == other.d4 &&
                    d5 == other.d5 &&
                    d6 == other.d6 &&
                    d7 == other.d7 &&
                    d8 == other.d8 &&
                    d9 == other.d9 &&
                    dwellts == other.dwellts &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    d10,
                    d11,
                    d12,
                    d13,
                    d14,
                    d15,
                    d16,
                    d17,
                    d18,
                    d19,
                    d2,
                    d20,
                    d21,
                    d22,
                    d23,
                    d24,
                    d25,
                    d26,
                    d27,
                    d28,
                    d29,
                    d3,
                    d30,
                    d31,
                    d32,
                    d4,
                    d5,
                    d6,
                    d7,
                    d8,
                    d9,
                    dwellts,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dwell{d10=$d10, d11=$d11, d12=$d12, d13=$d13, d14=$d14, d15=$d15, d16=$d16, d17=$d17, d18=$d18, d19=$d19, d2=$d2, d20=$d20, d21=$d21, d22=$d22, d23=$d23, d24=$d24, d25=$d25, d26=$d26, d27=$d27, d28=$d28, d29=$d29, d3=$d3, d30=$d30, d31=$d31, d32=$d32, d4=$d4, d5=$d5, d6=$d6, d7=$d7, d8=$d8, d9=$d9, dwellts=$dwellts, additionalProperties=$additionalProperties}"
        }

        class FreeText
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val f1: JsonField<String>,
            private val f2: JsonField<String>,
            private val f3: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("f1") @ExcludeMissing f1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("f2") @ExcludeMissing f2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("f3") @ExcludeMissing f3: JsonField<String> = JsonMissing.of(),
            ) : this(f1, f2, f3, mutableMapOf())

            /**
             * The originator of the Free Text message.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun f1(): Optional<String> = f1.getOptional("f1")

            /**
             * The recipient for which the Free Text message is intended.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun f2(): Optional<String> = f2.getOptional("f2")

            /**
             * Free text data message.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun f3(): Optional<String> = f3.getOptional("f3")

            /**
             * Returns the raw JSON value of [f1].
             *
             * Unlike [f1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("f1") @ExcludeMissing fun _f1(): JsonField<String> = f1

            /**
             * Returns the raw JSON value of [f2].
             *
             * Unlike [f2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("f2") @ExcludeMissing fun _f2(): JsonField<String> = f2

            /**
             * Returns the raw JSON value of [f3].
             *
             * Unlike [f3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("f3") @ExcludeMissing fun _f3(): JsonField<String> = f3

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

                /** Returns a mutable builder for constructing an instance of [FreeText]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FreeText]. */
            class Builder internal constructor() {

                private var f1: JsonField<String> = JsonMissing.of()
                private var f2: JsonField<String> = JsonMissing.of()
                private var f3: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(freeText: FreeText) = apply {
                    f1 = freeText.f1
                    f2 = freeText.f2
                    f3 = freeText.f3
                    additionalProperties = freeText.additionalProperties.toMutableMap()
                }

                /** The originator of the Free Text message. */
                fun f1(f1: String) = f1(JsonField.of(f1))

                /**
                 * Sets [Builder.f1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.f1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun f1(f1: JsonField<String>) = apply { this.f1 = f1 }

                /** The recipient for which the Free Text message is intended. */
                fun f2(f2: String) = f2(JsonField.of(f2))

                /**
                 * Sets [Builder.f2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.f2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun f2(f2: JsonField<String>) = apply { this.f2 = f2 }

                /** Free text data message. */
                fun f3(f3: String) = f3(JsonField.of(f3))

                /**
                 * Sets [Builder.f3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.f3] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun f3(f3: JsonField<String>) = apply { this.f3 = f3 }

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
                 * Returns an immutable instance of [FreeText].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FreeText = FreeText(f1, f2, f3, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): FreeText = apply {
                if (validated) {
                    return@apply
                }

                f1()
                f2()
                f3()
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
                (if (f1.asKnown().isPresent) 1 else 0) +
                    (if (f2.asKnown().isPresent) 1 else 0) +
                    (if (f3.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FreeText &&
                    f1 == other.f1 &&
                    f2 == other.f2 &&
                    f3 == other.f3 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(f1, f2, f3, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FreeText{f1=$f1, f2=$f2, f3=$f3, additionalProperties=$additionalProperties}"
        }

        class Hrr
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val h10: JsonField<Long>,
            private val h11: JsonField<Double>,
            private val h12: JsonField<Double>,
            private val h13: JsonField<Double>,
            private val h14: JsonField<Double>,
            private val h15: JsonField<Double>,
            private val h16: JsonField<String>,
            private val h17: JsonField<String>,
            private val h18: JsonField<String>,
            private val h19: JsonField<Double>,
            private val h2: JsonField<Int>,
            private val h20: JsonField<Long>,
            private val h21: JsonField<Long>,
            private val h22: JsonField<Long>,
            private val h23: JsonField<String>,
            private val h24: JsonField<String>,
            private val h27: JsonField<Long>,
            private val h28: JsonField<Long>,
            private val h29: JsonField<Long>,
            private val h3: JsonField<Int>,
            private val h30: JsonField<Long>,
            private val h31: JsonField<Long>,
            private val h32: JsonField<List<H32>>,
            private val h4: JsonField<Boolean>,
            private val h5: JsonField<Int>,
            private val h6: JsonField<Int>,
            private val h7: JsonField<Int>,
            private val h8: JsonField<Int>,
            private val h9: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("h10") @ExcludeMissing h10: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h11") @ExcludeMissing h11: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("h12") @ExcludeMissing h12: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("h13") @ExcludeMissing h13: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("h14") @ExcludeMissing h14: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("h15") @ExcludeMissing h15: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("h16") @ExcludeMissing h16: JsonField<String> = JsonMissing.of(),
                @JsonProperty("h17") @ExcludeMissing h17: JsonField<String> = JsonMissing.of(),
                @JsonProperty("h18") @ExcludeMissing h18: JsonField<String> = JsonMissing.of(),
                @JsonProperty("h19") @ExcludeMissing h19: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("h2") @ExcludeMissing h2: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("h20") @ExcludeMissing h20: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h21") @ExcludeMissing h21: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h22") @ExcludeMissing h22: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h23") @ExcludeMissing h23: JsonField<String> = JsonMissing.of(),
                @JsonProperty("h24") @ExcludeMissing h24: JsonField<String> = JsonMissing.of(),
                @JsonProperty("h27") @ExcludeMissing h27: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h28") @ExcludeMissing h28: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h29") @ExcludeMissing h29: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h3") @ExcludeMissing h3: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("h30") @ExcludeMissing h30: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h31") @ExcludeMissing h31: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("h32") @ExcludeMissing h32: JsonField<List<H32>> = JsonMissing.of(),
                @JsonProperty("h4") @ExcludeMissing h4: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("h5") @ExcludeMissing h5: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("h6") @ExcludeMissing h6: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("h7") @ExcludeMissing h7: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("h8") @ExcludeMissing h8: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("h9") @ExcludeMissing h9: JsonField<Long> = JsonMissing.of(),
            ) : this(
                h10,
                h11,
                h12,
                h13,
                h14,
                h15,
                h16,
                h17,
                h18,
                h19,
                h2,
                h20,
                h21,
                h22,
                h23,
                h24,
                h27,
                h28,
                h29,
                h3,
                h30,
                h31,
                h32,
                h4,
                h5,
                h6,
                h7,
                h8,
                h9,
                mutableMapOf(),
            )

            /**
             * Detection threshold used to isolate significant target scatterer pixels, expressed as
             * power relative to clutter mean in negative quarter-decibels.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h10(): Optional<Long> = h10.getOptional("h10")

            /**
             * 3dB range impulse response of the radar, expressed in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h11(): Optional<Double> = h11.getOptional("h11")

            /**
             * Slant Range pixel spacing after over sampling, expressed in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h12(): Optional<Double> = h12.getOptional("h12")

            /**
             * 3dB Doppler resolution of the radar, expressed in Hertz.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h13(): Optional<Double> = h13.getOptional("h13")

            /**
             * Doppler pixel spacing after over sampling, expressed in Hertz.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h14(): Optional<Double> = h14.getOptional("h14")

            /**
             * Center Frequency of the radar in GHz.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h15(): Optional<Double> = h15.getOptional("h15")

            /**
             * Enumeration table denoting the compression technique used.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h16(): Optional<String> = h16.getOptional("h16")

            /**
             * Enumeration table indicating the spectral weighting used in the range compression
             * process.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h17(): Optional<String> = h17.getOptional("h17")

            /**
             * Enumeration table indicating the spectral weighting used in the cross-range or
             * Doppler compression process.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h18(): Optional<String> = h18.getOptional("h18")

            /**
             * Initial power of the peak scatterer, expressed in dB.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h19(): Optional<Double> = h19.getOptional("h19")

            /**
             * Sequential count of a revisit of the bounding area for a given job ID.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h2(): Optional<Int> = h2.getOptional("h2")

            /**
             * RCS of the peak scatterer, expressed in half-decibels (dB/2).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h20(): Optional<Long> = h20.getOptional("h20")

            /**
             * When the RDM does not correlate to a single MTI report index or when the center range
             * bin does not correlate to the center of the dwell; provide the range sample offset in
             * meters from Dwell Center (positive is away from the sensor) of the first scatterer
             * record.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h21(): Optional<Long> = h21.getOptional("h21")

            /**
             * When the RDM does not correlate to a single MTI report index or the center doppler
             * bin does not correlate to the doppler centroid of the dwell; Doppler sample value in
             * Hz of the first scatterer record.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h22(): Optional<Long> = h22.getOptional("h22")

            /**
             * Enumeration field which designates the type of data being delivered.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h23(): Optional<String> = h23.getOptional("h23")

            /**
             * Flag field to indicate the additional signal processing techniques applied to the
             * data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h24(): Optional<String> = h24.getOptional("h24")

            /**
             * Number of pixels in the range dimension of the chip.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h27(): Optional<Long> = h27.getOptional("h27")

            /**
             * Distance from Range Bin to closest edge in the entire chip, expressed in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h28(): Optional<Long> = h28.getOptional("h28")

            /**
             * Relative velocity to skin line.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h29(): Optional<Long> = h29.getOptional("h29")

            /**
             * Sequential count of a dwell within the revisit of a particular bounding area for a
             * given job ID.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h3(): Optional<Int> = h3.getOptional("h3")

            /**
             * Computed object length based upon HRR profile, in meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h30(): Optional<Long> = h30.getOptional("h30")

            /**
             * Standard deviation of estimate of the object length, expressed in meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h31(): Optional<Long> = h31.getOptional("h31")

            /**
             * Standard deviation of estimate of the object length, expressed in meters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h32(): Optional<List<H32>> = h32.getOptional("h32")

            /**
             * Flag to indicate the last dwell of the revisit.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h4(): Optional<Boolean> = h4.getOptional("h4")

            /**
             * Sequential index of the associated MTI Report.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h5(): Optional<Int> = h5.getOptional("h5")

            /**
             * Number of Range Doppler pixels that exceed target scatterer threshold and are
             * reported in this segment.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h6(): Optional<Int> = h6.getOptional("h6")

            /**
             * Number of Range Bins/Samples in a Range Doppler Chip.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h7(): Optional<Int> = h7.getOptional("h7")

            /**
             * Number of Doppler bins in a Range-Doppler chip.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h8(): Optional<Int> = h8.getOptional("h8")

            /**
             * The Peak Scatter returns the maximum power level (e.g. in milliwatts, or dBm)
             * registered by the sensor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun h9(): Optional<Long> = h9.getOptional("h9")

            /**
             * Returns the raw JSON value of [h10].
             *
             * Unlike [h10], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h10") @ExcludeMissing fun _h10(): JsonField<Long> = h10

            /**
             * Returns the raw JSON value of [h11].
             *
             * Unlike [h11], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h11") @ExcludeMissing fun _h11(): JsonField<Double> = h11

            /**
             * Returns the raw JSON value of [h12].
             *
             * Unlike [h12], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h12") @ExcludeMissing fun _h12(): JsonField<Double> = h12

            /**
             * Returns the raw JSON value of [h13].
             *
             * Unlike [h13], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h13") @ExcludeMissing fun _h13(): JsonField<Double> = h13

            /**
             * Returns the raw JSON value of [h14].
             *
             * Unlike [h14], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h14") @ExcludeMissing fun _h14(): JsonField<Double> = h14

            /**
             * Returns the raw JSON value of [h15].
             *
             * Unlike [h15], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h15") @ExcludeMissing fun _h15(): JsonField<Double> = h15

            /**
             * Returns the raw JSON value of [h16].
             *
             * Unlike [h16], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h16") @ExcludeMissing fun _h16(): JsonField<String> = h16

            /**
             * Returns the raw JSON value of [h17].
             *
             * Unlike [h17], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h17") @ExcludeMissing fun _h17(): JsonField<String> = h17

            /**
             * Returns the raw JSON value of [h18].
             *
             * Unlike [h18], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h18") @ExcludeMissing fun _h18(): JsonField<String> = h18

            /**
             * Returns the raw JSON value of [h19].
             *
             * Unlike [h19], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h19") @ExcludeMissing fun _h19(): JsonField<Double> = h19

            /**
             * Returns the raw JSON value of [h2].
             *
             * Unlike [h2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h2") @ExcludeMissing fun _h2(): JsonField<Int> = h2

            /**
             * Returns the raw JSON value of [h20].
             *
             * Unlike [h20], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h20") @ExcludeMissing fun _h20(): JsonField<Long> = h20

            /**
             * Returns the raw JSON value of [h21].
             *
             * Unlike [h21], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h21") @ExcludeMissing fun _h21(): JsonField<Long> = h21

            /**
             * Returns the raw JSON value of [h22].
             *
             * Unlike [h22], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h22") @ExcludeMissing fun _h22(): JsonField<Long> = h22

            /**
             * Returns the raw JSON value of [h23].
             *
             * Unlike [h23], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h23") @ExcludeMissing fun _h23(): JsonField<String> = h23

            /**
             * Returns the raw JSON value of [h24].
             *
             * Unlike [h24], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h24") @ExcludeMissing fun _h24(): JsonField<String> = h24

            /**
             * Returns the raw JSON value of [h27].
             *
             * Unlike [h27], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h27") @ExcludeMissing fun _h27(): JsonField<Long> = h27

            /**
             * Returns the raw JSON value of [h28].
             *
             * Unlike [h28], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h28") @ExcludeMissing fun _h28(): JsonField<Long> = h28

            /**
             * Returns the raw JSON value of [h29].
             *
             * Unlike [h29], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h29") @ExcludeMissing fun _h29(): JsonField<Long> = h29

            /**
             * Returns the raw JSON value of [h3].
             *
             * Unlike [h3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h3") @ExcludeMissing fun _h3(): JsonField<Int> = h3

            /**
             * Returns the raw JSON value of [h30].
             *
             * Unlike [h30], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h30") @ExcludeMissing fun _h30(): JsonField<Long> = h30

            /**
             * Returns the raw JSON value of [h31].
             *
             * Unlike [h31], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h31") @ExcludeMissing fun _h31(): JsonField<Long> = h31

            /**
             * Returns the raw JSON value of [h32].
             *
             * Unlike [h32], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h32") @ExcludeMissing fun _h32(): JsonField<List<H32>> = h32

            /**
             * Returns the raw JSON value of [h4].
             *
             * Unlike [h4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h4") @ExcludeMissing fun _h4(): JsonField<Boolean> = h4

            /**
             * Returns the raw JSON value of [h5].
             *
             * Unlike [h5], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h5") @ExcludeMissing fun _h5(): JsonField<Int> = h5

            /**
             * Returns the raw JSON value of [h6].
             *
             * Unlike [h6], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h6") @ExcludeMissing fun _h6(): JsonField<Int> = h6

            /**
             * Returns the raw JSON value of [h7].
             *
             * Unlike [h7], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h7") @ExcludeMissing fun _h7(): JsonField<Int> = h7

            /**
             * Returns the raw JSON value of [h8].
             *
             * Unlike [h8], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h8") @ExcludeMissing fun _h8(): JsonField<Int> = h8

            /**
             * Returns the raw JSON value of [h9].
             *
             * Unlike [h9], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("h9") @ExcludeMissing fun _h9(): JsonField<Long> = h9

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

                /** Returns a mutable builder for constructing an instance of [Hrr]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Hrr]. */
            class Builder internal constructor() {

                private var h10: JsonField<Long> = JsonMissing.of()
                private var h11: JsonField<Double> = JsonMissing.of()
                private var h12: JsonField<Double> = JsonMissing.of()
                private var h13: JsonField<Double> = JsonMissing.of()
                private var h14: JsonField<Double> = JsonMissing.of()
                private var h15: JsonField<Double> = JsonMissing.of()
                private var h16: JsonField<String> = JsonMissing.of()
                private var h17: JsonField<String> = JsonMissing.of()
                private var h18: JsonField<String> = JsonMissing.of()
                private var h19: JsonField<Double> = JsonMissing.of()
                private var h2: JsonField<Int> = JsonMissing.of()
                private var h20: JsonField<Long> = JsonMissing.of()
                private var h21: JsonField<Long> = JsonMissing.of()
                private var h22: JsonField<Long> = JsonMissing.of()
                private var h23: JsonField<String> = JsonMissing.of()
                private var h24: JsonField<String> = JsonMissing.of()
                private var h27: JsonField<Long> = JsonMissing.of()
                private var h28: JsonField<Long> = JsonMissing.of()
                private var h29: JsonField<Long> = JsonMissing.of()
                private var h3: JsonField<Int> = JsonMissing.of()
                private var h30: JsonField<Long> = JsonMissing.of()
                private var h31: JsonField<Long> = JsonMissing.of()
                private var h32: JsonField<MutableList<H32>>? = null
                private var h4: JsonField<Boolean> = JsonMissing.of()
                private var h5: JsonField<Int> = JsonMissing.of()
                private var h6: JsonField<Int> = JsonMissing.of()
                private var h7: JsonField<Int> = JsonMissing.of()
                private var h8: JsonField<Int> = JsonMissing.of()
                private var h9: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(hrr: Hrr) = apply {
                    h10 = hrr.h10
                    h11 = hrr.h11
                    h12 = hrr.h12
                    h13 = hrr.h13
                    h14 = hrr.h14
                    h15 = hrr.h15
                    h16 = hrr.h16
                    h17 = hrr.h17
                    h18 = hrr.h18
                    h19 = hrr.h19
                    h2 = hrr.h2
                    h20 = hrr.h20
                    h21 = hrr.h21
                    h22 = hrr.h22
                    h23 = hrr.h23
                    h24 = hrr.h24
                    h27 = hrr.h27
                    h28 = hrr.h28
                    h29 = hrr.h29
                    h3 = hrr.h3
                    h30 = hrr.h30
                    h31 = hrr.h31
                    h32 = hrr.h32.map { it.toMutableList() }
                    h4 = hrr.h4
                    h5 = hrr.h5
                    h6 = hrr.h6
                    h7 = hrr.h7
                    h8 = hrr.h8
                    h9 = hrr.h9
                    additionalProperties = hrr.additionalProperties.toMutableMap()
                }

                /**
                 * Detection threshold used to isolate significant target scatterer pixels,
                 * expressed as power relative to clutter mean in negative quarter-decibels.
                 */
                fun h10(h10: Long) = h10(JsonField.of(h10))

                /**
                 * Sets [Builder.h10] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h10] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h10(h10: JsonField<Long>) = apply { this.h10 = h10 }

                /** 3dB range impulse response of the radar, expressed in centimeters. */
                fun h11(h11: Double) = h11(JsonField.of(h11))

                /**
                 * Sets [Builder.h11] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h11] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h11(h11: JsonField<Double>) = apply { this.h11 = h11 }

                /** Slant Range pixel spacing after over sampling, expressed in centimeters. */
                fun h12(h12: Double) = h12(JsonField.of(h12))

                /**
                 * Sets [Builder.h12] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h12] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h12(h12: JsonField<Double>) = apply { this.h12 = h12 }

                /** 3dB Doppler resolution of the radar, expressed in Hertz. */
                fun h13(h13: Double) = h13(JsonField.of(h13))

                /**
                 * Sets [Builder.h13] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h13] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h13(h13: JsonField<Double>) = apply { this.h13 = h13 }

                /** Doppler pixel spacing after over sampling, expressed in Hertz. */
                fun h14(h14: Double) = h14(JsonField.of(h14))

                /**
                 * Sets [Builder.h14] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h14] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h14(h14: JsonField<Double>) = apply { this.h14 = h14 }

                /** Center Frequency of the radar in GHz. */
                fun h15(h15: Double) = h15(JsonField.of(h15))

                /**
                 * Sets [Builder.h15] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h15] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h15(h15: JsonField<Double>) = apply { this.h15 = h15 }

                /** Enumeration table denoting the compression technique used. */
                fun h16(h16: String) = h16(JsonField.of(h16))

                /**
                 * Sets [Builder.h16] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h16] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h16(h16: JsonField<String>) = apply { this.h16 = h16 }

                /**
                 * Enumeration table indicating the spectral weighting used in the range compression
                 * process.
                 */
                fun h17(h17: String) = h17(JsonField.of(h17))

                /**
                 * Sets [Builder.h17] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h17] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h17(h17: JsonField<String>) = apply { this.h17 = h17 }

                /**
                 * Enumeration table indicating the spectral weighting used in the cross-range or
                 * Doppler compression process.
                 */
                fun h18(h18: String) = h18(JsonField.of(h18))

                /**
                 * Sets [Builder.h18] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h18] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h18(h18: JsonField<String>) = apply { this.h18 = h18 }

                /** Initial power of the peak scatterer, expressed in dB. */
                fun h19(h19: Double) = h19(JsonField.of(h19))

                /**
                 * Sets [Builder.h19] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h19] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h19(h19: JsonField<Double>) = apply { this.h19 = h19 }

                /** Sequential count of a revisit of the bounding area for a given job ID. */
                fun h2(h2: Int) = h2(JsonField.of(h2))

                /**
                 * Sets [Builder.h2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h2] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h2(h2: JsonField<Int>) = apply { this.h2 = h2 }

                /** RCS of the peak scatterer, expressed in half-decibels (dB/2). */
                fun h20(h20: Long) = h20(JsonField.of(h20))

                /**
                 * Sets [Builder.h20] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h20] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h20(h20: JsonField<Long>) = apply { this.h20 = h20 }

                /**
                 * When the RDM does not correlate to a single MTI report index or when the center
                 * range bin does not correlate to the center of the dwell; provide the range sample
                 * offset in meters from Dwell Center (positive is away from the sensor) of the
                 * first scatterer record.
                 */
                fun h21(h21: Long) = h21(JsonField.of(h21))

                /**
                 * Sets [Builder.h21] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h21] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h21(h21: JsonField<Long>) = apply { this.h21 = h21 }

                /**
                 * When the RDM does not correlate to a single MTI report index or the center
                 * doppler bin does not correlate to the doppler centroid of the dwell; Doppler
                 * sample value in Hz of the first scatterer record.
                 */
                fun h22(h22: Long) = h22(JsonField.of(h22))

                /**
                 * Sets [Builder.h22] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h22] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h22(h22: JsonField<Long>) = apply { this.h22 = h22 }

                /** Enumeration field which designates the type of data being delivered. */
                fun h23(h23: String) = h23(JsonField.of(h23))

                /**
                 * Sets [Builder.h23] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h23] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h23(h23: JsonField<String>) = apply { this.h23 = h23 }

                /**
                 * Flag field to indicate the additional signal processing techniques applied to the
                 * data.
                 */
                fun h24(h24: String) = h24(JsonField.of(h24))

                /**
                 * Sets [Builder.h24] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h24] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h24(h24: JsonField<String>) = apply { this.h24 = h24 }

                /** Number of pixels in the range dimension of the chip. */
                fun h27(h27: Long) = h27(JsonField.of(h27))

                /**
                 * Sets [Builder.h27] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h27] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h27(h27: JsonField<Long>) = apply { this.h27 = h27 }

                /**
                 * Distance from Range Bin to closest edge in the entire chip, expressed in
                 * centimeters.
                 */
                fun h28(h28: Long) = h28(JsonField.of(h28))

                /**
                 * Sets [Builder.h28] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h28] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h28(h28: JsonField<Long>) = apply { this.h28 = h28 }

                /** Relative velocity to skin line. */
                fun h29(h29: Long) = h29(JsonField.of(h29))

                /**
                 * Sets [Builder.h29] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h29] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h29(h29: JsonField<Long>) = apply { this.h29 = h29 }

                /**
                 * Sequential count of a dwell within the revisit of a particular bounding area for
                 * a given job ID.
                 */
                fun h3(h3: Int) = h3(JsonField.of(h3))

                /**
                 * Sets [Builder.h3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h3] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h3(h3: JsonField<Int>) = apply { this.h3 = h3 }

                /** Computed object length based upon HRR profile, in meters. */
                fun h30(h30: Long) = h30(JsonField.of(h30))

                /**
                 * Sets [Builder.h30] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h30] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h30(h30: JsonField<Long>) = apply { this.h30 = h30 }

                /** Standard deviation of estimate of the object length, expressed in meters. */
                fun h31(h31: Long) = h31(JsonField.of(h31))

                /**
                 * Sets [Builder.h31] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h31] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h31(h31: JsonField<Long>) = apply { this.h31 = h31 }

                /** Standard deviation of estimate of the object length, expressed in meters. */
                fun h32(h32: List<H32>) = h32(JsonField.of(h32))

                /**
                 * Sets [Builder.h32] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h32] with a well-typed `List<H32>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun h32(h32: JsonField<List<H32>>) = apply {
                    this.h32 = h32.map { it.toMutableList() }
                }

                /**
                 * Adds a single [H32] to [Builder.h32].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addH32(h32: H32) = apply {
                    this.h32 =
                        (this.h32 ?: JsonField.of(mutableListOf())).also {
                            checkKnown("h32", it).add(h32)
                        }
                }

                /** Flag to indicate the last dwell of the revisit. */
                fun h4(h4: Boolean) = h4(JsonField.of(h4))

                /**
                 * Sets [Builder.h4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h4] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun h4(h4: JsonField<Boolean>) = apply { this.h4 = h4 }

                /** Sequential index of the associated MTI Report. */
                fun h5(h5: Int) = h5(JsonField.of(h5))

                /**
                 * Sets [Builder.h5] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h5] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h5(h5: JsonField<Int>) = apply { this.h5 = h5 }

                /**
                 * Number of Range Doppler pixels that exceed target scatterer threshold and are
                 * reported in this segment.
                 */
                fun h6(h6: Int) = h6(JsonField.of(h6))

                /**
                 * Sets [Builder.h6] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h6] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h6(h6: JsonField<Int>) = apply { this.h6 = h6 }

                /** Number of Range Bins/Samples in a Range Doppler Chip. */
                fun h7(h7: Int) = h7(JsonField.of(h7))

                /**
                 * Sets [Builder.h7] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h7] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h7(h7: JsonField<Int>) = apply { this.h7 = h7 }

                /** Number of Doppler bins in a Range-Doppler chip. */
                fun h8(h8: Int) = h8(JsonField.of(h8))

                /**
                 * Sets [Builder.h8] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h8] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h8(h8: JsonField<Int>) = apply { this.h8 = h8 }

                /**
                 * The Peak Scatter returns the maximum power level (e.g. in milliwatts, or dBm)
                 * registered by the sensor.
                 */
                fun h9(h9: Long) = h9(JsonField.of(h9))

                /**
                 * Sets [Builder.h9] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.h9] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun h9(h9: JsonField<Long>) = apply { this.h9 = h9 }

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
                 * Returns an immutable instance of [Hrr].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Hrr =
                    Hrr(
                        h10,
                        h11,
                        h12,
                        h13,
                        h14,
                        h15,
                        h16,
                        h17,
                        h18,
                        h19,
                        h2,
                        h20,
                        h21,
                        h22,
                        h23,
                        h24,
                        h27,
                        h28,
                        h29,
                        h3,
                        h30,
                        h31,
                        (h32 ?: JsonMissing.of()).map { it.toImmutable() },
                        h4,
                        h5,
                        h6,
                        h7,
                        h8,
                        h9,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Hrr = apply {
                if (validated) {
                    return@apply
                }

                h10()
                h11()
                h12()
                h13()
                h14()
                h15()
                h16()
                h17()
                h18()
                h19()
                h2()
                h20()
                h21()
                h22()
                h23()
                h24()
                h27()
                h28()
                h29()
                h3()
                h30()
                h31()
                h32().ifPresent { it.forEach { it.validate() } }
                h4()
                h5()
                h6()
                h7()
                h8()
                h9()
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
                (if (h10.asKnown().isPresent) 1 else 0) +
                    (if (h11.asKnown().isPresent) 1 else 0) +
                    (if (h12.asKnown().isPresent) 1 else 0) +
                    (if (h13.asKnown().isPresent) 1 else 0) +
                    (if (h14.asKnown().isPresent) 1 else 0) +
                    (if (h15.asKnown().isPresent) 1 else 0) +
                    (if (h16.asKnown().isPresent) 1 else 0) +
                    (if (h17.asKnown().isPresent) 1 else 0) +
                    (if (h18.asKnown().isPresent) 1 else 0) +
                    (if (h19.asKnown().isPresent) 1 else 0) +
                    (if (h2.asKnown().isPresent) 1 else 0) +
                    (if (h20.asKnown().isPresent) 1 else 0) +
                    (if (h21.asKnown().isPresent) 1 else 0) +
                    (if (h22.asKnown().isPresent) 1 else 0) +
                    (if (h23.asKnown().isPresent) 1 else 0) +
                    (if (h24.asKnown().isPresent) 1 else 0) +
                    (if (h27.asKnown().isPresent) 1 else 0) +
                    (if (h28.asKnown().isPresent) 1 else 0) +
                    (if (h29.asKnown().isPresent) 1 else 0) +
                    (if (h3.asKnown().isPresent) 1 else 0) +
                    (if (h30.asKnown().isPresent) 1 else 0) +
                    (if (h31.asKnown().isPresent) 1 else 0) +
                    (h32.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (h4.asKnown().isPresent) 1 else 0) +
                    (if (h5.asKnown().isPresent) 1 else 0) +
                    (if (h6.asKnown().isPresent) 1 else 0) +
                    (if (h7.asKnown().isPresent) 1 else 0) +
                    (if (h8.asKnown().isPresent) 1 else 0) +
                    (if (h9.asKnown().isPresent) 1 else 0)

            /**
             * HRR Scatterer record for a target pixel that exceeds the target detection threshold.
             */
            class H32
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val h32_1: JsonField<Int>,
                private val h32_2: JsonField<Int>,
                private val h32_3: JsonField<Int>,
                private val h32_4: JsonField<Int>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("h32_1") @ExcludeMissing h32_1: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("h32_2") @ExcludeMissing h32_2: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("h32_3") @ExcludeMissing h32_3: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("h32_4") @ExcludeMissing h32_4: JsonField<Int> = JsonMissing.of(),
                ) : this(h32_1, h32_2, h32_3, h32_4, mutableMapOf())

                /**
                 * Scatterer’s power magnitude.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun h32_1(): Optional<Int> = h32_1.getOptional("h32_1")

                /**
                 * Scatterer’s complex phase, in degrees.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun h32_2(): Optional<Int> = h32_2.getOptional("h32_2")

                /**
                 * Scatterer’s Range index relative to Range-Doppler chip, where increasing index
                 * equates to increasing range.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun h32_3(): Optional<Int> = h32_3.getOptional("h32_3")

                /**
                 * Scatterer’s Doppler index relative to Range-Doppler chip, where increasing index
                 * equates to increasing Doppler.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun h32_4(): Optional<Int> = h32_4.getOptional("h32_4")

                /**
                 * Returns the raw JSON value of [h32_1].
                 *
                 * Unlike [h32_1], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("h32_1") @ExcludeMissing fun _h32_1(): JsonField<Int> = h32_1

                /**
                 * Returns the raw JSON value of [h32_2].
                 *
                 * Unlike [h32_2], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("h32_2") @ExcludeMissing fun _h32_2(): JsonField<Int> = h32_2

                /**
                 * Returns the raw JSON value of [h32_3].
                 *
                 * Unlike [h32_3], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("h32_3") @ExcludeMissing fun _h32_3(): JsonField<Int> = h32_3

                /**
                 * Returns the raw JSON value of [h32_4].
                 *
                 * Unlike [h32_4], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("h32_4") @ExcludeMissing fun _h32_4(): JsonField<Int> = h32_4

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

                    /** Returns a mutable builder for constructing an instance of [H32]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [H32]. */
                class Builder internal constructor() {

                    private var h32_1: JsonField<Int> = JsonMissing.of()
                    private var h32_2: JsonField<Int> = JsonMissing.of()
                    private var h32_3: JsonField<Int> = JsonMissing.of()
                    private var h32_4: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(h32: H32) = apply {
                        h32_1 = h32.h32_1
                        h32_2 = h32.h32_2
                        h32_3 = h32.h32_3
                        h32_4 = h32.h32_4
                        additionalProperties = h32.additionalProperties.toMutableMap()
                    }

                    /** Scatterer’s power magnitude. */
                    fun h32_1(h32_1: Int) = h32_1(JsonField.of(h32_1))

                    /**
                     * Sets [Builder.h32_1] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h32_1] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun h32_1(h32_1: JsonField<Int>) = apply { this.h32_1 = h32_1 }

                    /** Scatterer’s complex phase, in degrees. */
                    fun h32_2(h32_2: Int) = h32_2(JsonField.of(h32_2))

                    /**
                     * Sets [Builder.h32_2] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h32_2] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun h32_2(h32_2: JsonField<Int>) = apply { this.h32_2 = h32_2 }

                    /**
                     * Scatterer’s Range index relative to Range-Doppler chip, where increasing
                     * index equates to increasing range.
                     */
                    fun h32_3(h32_3: Int) = h32_3(JsonField.of(h32_3))

                    /**
                     * Sets [Builder.h32_3] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h32_3] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun h32_3(h32_3: JsonField<Int>) = apply { this.h32_3 = h32_3 }

                    /**
                     * Scatterer’s Doppler index relative to Range-Doppler chip, where increasing
                     * index equates to increasing Doppler.
                     */
                    fun h32_4(h32_4: Int) = h32_4(JsonField.of(h32_4))

                    /**
                     * Sets [Builder.h32_4] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.h32_4] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun h32_4(h32_4: JsonField<Int>) = apply { this.h32_4 = h32_4 }

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
                     * Returns an immutable instance of [H32].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): H32 =
                        H32(h32_1, h32_2, h32_3, h32_4, additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                fun validate(): H32 = apply {
                    if (validated) {
                        return@apply
                    }

                    h32_1()
                    h32_2()
                    h32_3()
                    h32_4()
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
                    (if (h32_1.asKnown().isPresent) 1 else 0) +
                        (if (h32_2.asKnown().isPresent) 1 else 0) +
                        (if (h32_3.asKnown().isPresent) 1 else 0) +
                        (if (h32_4.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is H32 &&
                        h32_1 == other.h32_1 &&
                        h32_2 == other.h32_2 &&
                        h32_3 == other.h32_3 &&
                        h32_4 == other.h32_4 &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(h32_1, h32_2, h32_3, h32_4, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "H32{h32_1=$h32_1, h32_2=$h32_2, h32_3=$h32_3, h32_4=$h32_4, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Hrr &&
                    h10 == other.h10 &&
                    h11 == other.h11 &&
                    h12 == other.h12 &&
                    h13 == other.h13 &&
                    h14 == other.h14 &&
                    h15 == other.h15 &&
                    h16 == other.h16 &&
                    h17 == other.h17 &&
                    h18 == other.h18 &&
                    h19 == other.h19 &&
                    h2 == other.h2 &&
                    h20 == other.h20 &&
                    h21 == other.h21 &&
                    h22 == other.h22 &&
                    h23 == other.h23 &&
                    h24 == other.h24 &&
                    h27 == other.h27 &&
                    h28 == other.h28 &&
                    h29 == other.h29 &&
                    h3 == other.h3 &&
                    h30 == other.h30 &&
                    h31 == other.h31 &&
                    h32 == other.h32 &&
                    h4 == other.h4 &&
                    h5 == other.h5 &&
                    h6 == other.h6 &&
                    h7 == other.h7 &&
                    h8 == other.h8 &&
                    h9 == other.h9 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    h10,
                    h11,
                    h12,
                    h13,
                    h14,
                    h15,
                    h16,
                    h17,
                    h18,
                    h19,
                    h2,
                    h20,
                    h21,
                    h22,
                    h23,
                    h24,
                    h27,
                    h28,
                    h29,
                    h3,
                    h30,
                    h31,
                    h32,
                    h4,
                    h5,
                    h6,
                    h7,
                    h8,
                    h9,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Hrr{h10=$h10, h11=$h11, h12=$h12, h13=$h13, h14=$h14, h15=$h15, h16=$h16, h17=$h17, h18=$h18, h19=$h19, h2=$h2, h20=$h20, h21=$h21, h22=$h22, h23=$h23, h24=$h24, h27=$h27, h28=$h28, h29=$h29, h3=$h3, h30=$h30, h31=$h31, h32=$h32, h4=$h4, h5=$h5, h6=$h6, h7=$h7, h8=$h8, h9=$h9, additionalProperties=$additionalProperties}"
        }

        /**
         * The means for the platform to pass information pertaining to the sensor job that will be
         * performed and details of the location parameters (terrain elevation model and geoid
         * model) used in the measurement.
         */
        class JobDef
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val j1: JsonField<Long>,
            private val j10: JsonField<Double>,
            private val j11: JsonField<Double>,
            private val j12: JsonField<Double>,
            private val j13: JsonField<Double>,
            private val j14: JsonField<String>,
            private val j15: JsonField<Int>,
            private val j16: JsonField<Int>,
            private val j17: JsonField<Int>,
            private val j18: JsonField<Int>,
            private val j19: JsonField<Long>,
            private val j2: JsonField<String>,
            private val j20: JsonField<Int>,
            private val j21: JsonField<Int>,
            private val j22: JsonField<Double>,
            private val j23: JsonField<Int>,
            private val j24: JsonField<Long>,
            private val j25: JsonField<Long>,
            private val j26: JsonField<Long>,
            private val j27: JsonField<String>,
            private val j28: JsonField<String>,
            private val j3: JsonField<String>,
            private val j4: JsonField<Long>,
            private val j5: JsonField<Long>,
            private val j6: JsonField<Double>,
            private val j7: JsonField<Double>,
            private val j8: JsonField<Double>,
            private val j9: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("j1") @ExcludeMissing j1: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j10") @ExcludeMissing j10: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j11") @ExcludeMissing j11: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j12") @ExcludeMissing j12: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j13") @ExcludeMissing j13: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j14") @ExcludeMissing j14: JsonField<String> = JsonMissing.of(),
                @JsonProperty("j15") @ExcludeMissing j15: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j16") @ExcludeMissing j16: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j17") @ExcludeMissing j17: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j18") @ExcludeMissing j18: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j19") @ExcludeMissing j19: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j2") @ExcludeMissing j2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("j20") @ExcludeMissing j20: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j21") @ExcludeMissing j21: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j22") @ExcludeMissing j22: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j23") @ExcludeMissing j23: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("j24") @ExcludeMissing j24: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j25") @ExcludeMissing j25: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j26") @ExcludeMissing j26: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j27") @ExcludeMissing j27: JsonField<String> = JsonMissing.of(),
                @JsonProperty("j28") @ExcludeMissing j28: JsonField<String> = JsonMissing.of(),
                @JsonProperty("j3") @ExcludeMissing j3: JsonField<String> = JsonMissing.of(),
                @JsonProperty("j4") @ExcludeMissing j4: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j5") @ExcludeMissing j5: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("j6") @ExcludeMissing j6: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j7") @ExcludeMissing j7: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j8") @ExcludeMissing j8: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("j9") @ExcludeMissing j9: JsonField<Double> = JsonMissing.of(),
            ) : this(
                j1,
                j10,
                j11,
                j12,
                j13,
                j14,
                j15,
                j16,
                j17,
                j18,
                j19,
                j2,
                j20,
                j21,
                j22,
                j23,
                j24,
                j25,
                j26,
                j27,
                j28,
                j3,
                j4,
                j5,
                j6,
                j7,
                j8,
                j9,
                mutableMapOf(),
            )

            /**
             * A platform assigned number identifying the specific request or task to which the
             * specific dwell pertains.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j1(): Optional<Long> = j1.getOptional("j1")

            /**
             * North-South position of the third corner (Point C) defining the area for sensor
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j10(): Optional<Double> = j10.getOptional("j10")

            /**
             * East-West position of the third corner (Point C) defining the area for sensor
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j11(): Optional<Double> = j11.getOptional("j11")

            /**
             * North-South position of the fourth corner (Point D) defining the area for sensor
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j12(): Optional<Double> = j12.getOptional("j12")

            /**
             * East-West position of the fourth corner (Point D) defining the area for sensor
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j13(): Optional<Double> = j13.getOptional("j13")

            /**
             * Mode in which the radar will operate for the given job ID.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j14(): Optional<String> = j14.getOptional("j14")

            /**
             * The nominal revisit interval for the job ID, expressed in deciseconds. Value of zero,
             * indicates that the sensor is not revisiting the previous area.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j15(): Optional<Int> = j15.getOptional("j15")

            /**
             * Nominal estimate of the standard deviation in the estimated horizontal (along track)
             * sensor location, expressed in decimeters. measured along the sensor track direction
             * defined in the Dwell segment.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j16(): Optional<Int> = j16.getOptional("j16")

            /**
             * Nominal estimate of the standard deviation in the estimated horizontal sensor
             * location, measured orthogonal to the track direction, expressed in decimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j17(): Optional<Int> = j17.getOptional("j17")

            /**
             * Nominal estimate of the standard deviation of the measured sensor altitude, expressed
             * in decimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j18(): Optional<Int> = j18.getOptional("j18")

            /**
             * Standard deviation of the estimate of sensor track heading, expressed in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j19(): Optional<Long> = j19.getOptional("j19")

            /**
             * The type of sensor or the platform.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j2(): Optional<String> = j2.getOptional("j2")

            /**
             * Nominal standard deviation of the estimate of sensor speed, expressed in millimeters
             * per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j20(): Optional<Int> = j20.getOptional("j20")

            /**
             * Nominal standard deviation of the slant range of the reported detection, expressed in
             * centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j21(): Optional<Int> = j21.getOptional("j21")

            /**
             * Nominal standard deviation of the measured cross angle to the reported detection,
             * expressed in degrees.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j22(): Optional<Double> = j22.getOptional("j22")

            /**
             * Nominal standard deviation of the velocity line-of-sight component, expressed in
             * centimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j23(): Optional<Int> = j23.getOptional("j23")

            /**
             * Nominal minimum velocity component along the line of sight, which can be detected by
             * the sensor, expressed in decimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j24(): Optional<Long> = j24.getOptional("j24")

            /**
             * Nominal probability that an unobscured ten square-meter target will be detected
             * within the given area of surveillance.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j25(): Optional<Long> = j25.getOptional("j25")

            /**
             * The expected density of False Alarms (FA), expressed as the negative of the decibel
             * value.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j26(): Optional<Long> = j26.getOptional("j26")

            /**
             * The terrain elevation model used for developing the target reports.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j27(): Optional<String> = j27.getOptional("j27")

            /**
             * The geoid model used for developing the target reports.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j28(): Optional<String> = j28.getOptional("j28")

            /**
             * Identifier of the particular variant of the sensor type.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j3(): Optional<String> = j3.getOptional("j3")

            /**
             * Flag field indicating whether filtering has been applied to the targets detected
             * within the dwell area.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j4(): Optional<Long> = j4.getOptional("j4")

            /**
             * Priority of this tasking request relative to all other active tasking requests
             * scheduled for execution on the specified platform.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j5(): Optional<Long> = j5.getOptional("j5")

            /**
             * North-South position of the first corner (Point A) defining the area for sensor
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j6(): Optional<Double> = j6.getOptional("j6")

            /**
             * East-West position of the first corner (Point A) defining the area for sensor
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j7(): Optional<Double> = j7.getOptional("j7")

            /**
             * North-South position of the second corner (Point B) defining the area for sensor
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j8(): Optional<Double> = j8.getOptional("j8")

            /**
             * East-West position of the second corner (Point B) defining the area for sensor
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun j9(): Optional<Double> = j9.getOptional("j9")

            /**
             * Returns the raw JSON value of [j1].
             *
             * Unlike [j1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j1") @ExcludeMissing fun _j1(): JsonField<Long> = j1

            /**
             * Returns the raw JSON value of [j10].
             *
             * Unlike [j10], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j10") @ExcludeMissing fun _j10(): JsonField<Double> = j10

            /**
             * Returns the raw JSON value of [j11].
             *
             * Unlike [j11], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j11") @ExcludeMissing fun _j11(): JsonField<Double> = j11

            /**
             * Returns the raw JSON value of [j12].
             *
             * Unlike [j12], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j12") @ExcludeMissing fun _j12(): JsonField<Double> = j12

            /**
             * Returns the raw JSON value of [j13].
             *
             * Unlike [j13], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j13") @ExcludeMissing fun _j13(): JsonField<Double> = j13

            /**
             * Returns the raw JSON value of [j14].
             *
             * Unlike [j14], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j14") @ExcludeMissing fun _j14(): JsonField<String> = j14

            /**
             * Returns the raw JSON value of [j15].
             *
             * Unlike [j15], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j15") @ExcludeMissing fun _j15(): JsonField<Int> = j15

            /**
             * Returns the raw JSON value of [j16].
             *
             * Unlike [j16], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j16") @ExcludeMissing fun _j16(): JsonField<Int> = j16

            /**
             * Returns the raw JSON value of [j17].
             *
             * Unlike [j17], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j17") @ExcludeMissing fun _j17(): JsonField<Int> = j17

            /**
             * Returns the raw JSON value of [j18].
             *
             * Unlike [j18], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j18") @ExcludeMissing fun _j18(): JsonField<Int> = j18

            /**
             * Returns the raw JSON value of [j19].
             *
             * Unlike [j19], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j19") @ExcludeMissing fun _j19(): JsonField<Long> = j19

            /**
             * Returns the raw JSON value of [j2].
             *
             * Unlike [j2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j2") @ExcludeMissing fun _j2(): JsonField<String> = j2

            /**
             * Returns the raw JSON value of [j20].
             *
             * Unlike [j20], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j20") @ExcludeMissing fun _j20(): JsonField<Int> = j20

            /**
             * Returns the raw JSON value of [j21].
             *
             * Unlike [j21], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j21") @ExcludeMissing fun _j21(): JsonField<Int> = j21

            /**
             * Returns the raw JSON value of [j22].
             *
             * Unlike [j22], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j22") @ExcludeMissing fun _j22(): JsonField<Double> = j22

            /**
             * Returns the raw JSON value of [j23].
             *
             * Unlike [j23], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j23") @ExcludeMissing fun _j23(): JsonField<Int> = j23

            /**
             * Returns the raw JSON value of [j24].
             *
             * Unlike [j24], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j24") @ExcludeMissing fun _j24(): JsonField<Long> = j24

            /**
             * Returns the raw JSON value of [j25].
             *
             * Unlike [j25], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j25") @ExcludeMissing fun _j25(): JsonField<Long> = j25

            /**
             * Returns the raw JSON value of [j26].
             *
             * Unlike [j26], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j26") @ExcludeMissing fun _j26(): JsonField<Long> = j26

            /**
             * Returns the raw JSON value of [j27].
             *
             * Unlike [j27], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j27") @ExcludeMissing fun _j27(): JsonField<String> = j27

            /**
             * Returns the raw JSON value of [j28].
             *
             * Unlike [j28], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j28") @ExcludeMissing fun _j28(): JsonField<String> = j28

            /**
             * Returns the raw JSON value of [j3].
             *
             * Unlike [j3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j3") @ExcludeMissing fun _j3(): JsonField<String> = j3

            /**
             * Returns the raw JSON value of [j4].
             *
             * Unlike [j4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j4") @ExcludeMissing fun _j4(): JsonField<Long> = j4

            /**
             * Returns the raw JSON value of [j5].
             *
             * Unlike [j5], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j5") @ExcludeMissing fun _j5(): JsonField<Long> = j5

            /**
             * Returns the raw JSON value of [j6].
             *
             * Unlike [j6], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j6") @ExcludeMissing fun _j6(): JsonField<Double> = j6

            /**
             * Returns the raw JSON value of [j7].
             *
             * Unlike [j7], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j7") @ExcludeMissing fun _j7(): JsonField<Double> = j7

            /**
             * Returns the raw JSON value of [j8].
             *
             * Unlike [j8], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j8") @ExcludeMissing fun _j8(): JsonField<Double> = j8

            /**
             * Returns the raw JSON value of [j9].
             *
             * Unlike [j9], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("j9") @ExcludeMissing fun _j9(): JsonField<Double> = j9

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

                /** Returns a mutable builder for constructing an instance of [JobDef]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [JobDef]. */
            class Builder internal constructor() {

                private var j1: JsonField<Long> = JsonMissing.of()
                private var j10: JsonField<Double> = JsonMissing.of()
                private var j11: JsonField<Double> = JsonMissing.of()
                private var j12: JsonField<Double> = JsonMissing.of()
                private var j13: JsonField<Double> = JsonMissing.of()
                private var j14: JsonField<String> = JsonMissing.of()
                private var j15: JsonField<Int> = JsonMissing.of()
                private var j16: JsonField<Int> = JsonMissing.of()
                private var j17: JsonField<Int> = JsonMissing.of()
                private var j18: JsonField<Int> = JsonMissing.of()
                private var j19: JsonField<Long> = JsonMissing.of()
                private var j2: JsonField<String> = JsonMissing.of()
                private var j20: JsonField<Int> = JsonMissing.of()
                private var j21: JsonField<Int> = JsonMissing.of()
                private var j22: JsonField<Double> = JsonMissing.of()
                private var j23: JsonField<Int> = JsonMissing.of()
                private var j24: JsonField<Long> = JsonMissing.of()
                private var j25: JsonField<Long> = JsonMissing.of()
                private var j26: JsonField<Long> = JsonMissing.of()
                private var j27: JsonField<String> = JsonMissing.of()
                private var j28: JsonField<String> = JsonMissing.of()
                private var j3: JsonField<String> = JsonMissing.of()
                private var j4: JsonField<Long> = JsonMissing.of()
                private var j5: JsonField<Long> = JsonMissing.of()
                private var j6: JsonField<Double> = JsonMissing.of()
                private var j7: JsonField<Double> = JsonMissing.of()
                private var j8: JsonField<Double> = JsonMissing.of()
                private var j9: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jobDef: JobDef) = apply {
                    j1 = jobDef.j1
                    j10 = jobDef.j10
                    j11 = jobDef.j11
                    j12 = jobDef.j12
                    j13 = jobDef.j13
                    j14 = jobDef.j14
                    j15 = jobDef.j15
                    j16 = jobDef.j16
                    j17 = jobDef.j17
                    j18 = jobDef.j18
                    j19 = jobDef.j19
                    j2 = jobDef.j2
                    j20 = jobDef.j20
                    j21 = jobDef.j21
                    j22 = jobDef.j22
                    j23 = jobDef.j23
                    j24 = jobDef.j24
                    j25 = jobDef.j25
                    j26 = jobDef.j26
                    j27 = jobDef.j27
                    j28 = jobDef.j28
                    j3 = jobDef.j3
                    j4 = jobDef.j4
                    j5 = jobDef.j5
                    j6 = jobDef.j6
                    j7 = jobDef.j7
                    j8 = jobDef.j8
                    j9 = jobDef.j9
                    additionalProperties = jobDef.additionalProperties.toMutableMap()
                }

                /**
                 * A platform assigned number identifying the specific request or task to which the
                 * specific dwell pertains.
                 */
                fun j1(j1: Long) = j1(JsonField.of(j1))

                /**
                 * Sets [Builder.j1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j1] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j1(j1: JsonField<Long>) = apply { this.j1 = j1 }

                /**
                 * North-South position of the third corner (Point C) defining the area for sensor
                 * service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun j10(j10: Double) = j10(JsonField.of(j10))

                /**
                 * Sets [Builder.j10] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j10] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j10(j10: JsonField<Double>) = apply { this.j10 = j10 }

                /**
                 * East-West position of the third corner (Point C) defining the area for sensor
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun j11(j11: Double) = j11(JsonField.of(j11))

                /**
                 * Sets [Builder.j11] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j11] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j11(j11: JsonField<Double>) = apply { this.j11 = j11 }

                /**
                 * North-South position of the fourth corner (Point D) defining the area for sensor
                 * service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun j12(j12: Double) = j12(JsonField.of(j12))

                /**
                 * Sets [Builder.j12] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j12] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j12(j12: JsonField<Double>) = apply { this.j12 = j12 }

                /**
                 * East-West position of the fourth corner (Point D) defining the area for sensor
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun j13(j13: Double) = j13(JsonField.of(j13))

                /**
                 * Sets [Builder.j13] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j13] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j13(j13: JsonField<Double>) = apply { this.j13 = j13 }

                /** Mode in which the radar will operate for the given job ID. */
                fun j14(j14: String) = j14(JsonField.of(j14))

                /**
                 * Sets [Builder.j14] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j14] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j14(j14: JsonField<String>) = apply { this.j14 = j14 }

                /**
                 * The nominal revisit interval for the job ID, expressed in deciseconds. Value of
                 * zero, indicates that the sensor is not revisiting the previous area.
                 */
                fun j15(j15: Int) = j15(JsonField.of(j15))

                /**
                 * Sets [Builder.j15] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j15] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j15(j15: JsonField<Int>) = apply { this.j15 = j15 }

                /**
                 * Nominal estimate of the standard deviation in the estimated horizontal (along
                 * track) sensor location, expressed in decimeters. measured along the sensor track
                 * direction defined in the Dwell segment.
                 */
                fun j16(j16: Int) = j16(JsonField.of(j16))

                /**
                 * Sets [Builder.j16] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j16] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j16(j16: JsonField<Int>) = apply { this.j16 = j16 }

                /**
                 * Nominal estimate of the standard deviation in the estimated horizontal sensor
                 * location, measured orthogonal to the track direction, expressed in decimeters.
                 */
                fun j17(j17: Int) = j17(JsonField.of(j17))

                /**
                 * Sets [Builder.j17] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j17] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j17(j17: JsonField<Int>) = apply { this.j17 = j17 }

                /**
                 * Nominal estimate of the standard deviation of the measured sensor altitude,
                 * expressed in decimeters.
                 */
                fun j18(j18: Int) = j18(JsonField.of(j18))

                /**
                 * Sets [Builder.j18] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j18] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j18(j18: JsonField<Int>) = apply { this.j18 = j18 }

                /**
                 * Standard deviation of the estimate of sensor track heading, expressed in degrees.
                 */
                fun j19(j19: Long) = j19(JsonField.of(j19))

                /**
                 * Sets [Builder.j19] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j19] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j19(j19: JsonField<Long>) = apply { this.j19 = j19 }

                /** The type of sensor or the platform. */
                fun j2(j2: String) = j2(JsonField.of(j2))

                /**
                 * Sets [Builder.j2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j2(j2: JsonField<String>) = apply { this.j2 = j2 }

                /**
                 * Nominal standard deviation of the estimate of sensor speed, expressed in
                 * millimeters per second.
                 */
                fun j20(j20: Int) = j20(JsonField.of(j20))

                /**
                 * Sets [Builder.j20] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j20] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j20(j20: JsonField<Int>) = apply { this.j20 = j20 }

                /**
                 * Nominal standard deviation of the slant range of the reported detection,
                 * expressed in centimeters.
                 */
                fun j21(j21: Int) = j21(JsonField.of(j21))

                /**
                 * Sets [Builder.j21] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j21] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j21(j21: JsonField<Int>) = apply { this.j21 = j21 }

                /**
                 * Nominal standard deviation of the measured cross angle to the reported detection,
                 * expressed in degrees.
                 */
                fun j22(j22: Double) = j22(JsonField.of(j22))

                /**
                 * Sets [Builder.j22] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j22] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j22(j22: JsonField<Double>) = apply { this.j22 = j22 }

                /**
                 * Nominal standard deviation of the velocity line-of-sight component, expressed in
                 * centimeters per second.
                 */
                fun j23(j23: Int) = j23(JsonField.of(j23))

                /**
                 * Sets [Builder.j23] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j23] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j23(j23: JsonField<Int>) = apply { this.j23 = j23 }

                /**
                 * Nominal minimum velocity component along the line of sight, which can be detected
                 * by the sensor, expressed in decimeters per second.
                 */
                fun j24(j24: Long) = j24(JsonField.of(j24))

                /**
                 * Sets [Builder.j24] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j24] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j24(j24: JsonField<Long>) = apply { this.j24 = j24 }

                /**
                 * Nominal probability that an unobscured ten square-meter target will be detected
                 * within the given area of surveillance.
                 */
                fun j25(j25: Long) = j25(JsonField.of(j25))

                /**
                 * Sets [Builder.j25] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j25] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j25(j25: JsonField<Long>) = apply { this.j25 = j25 }

                /**
                 * The expected density of False Alarms (FA), expressed as the negative of the
                 * decibel value.
                 */
                fun j26(j26: Long) = j26(JsonField.of(j26))

                /**
                 * Sets [Builder.j26] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j26] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j26(j26: JsonField<Long>) = apply { this.j26 = j26 }

                /** The terrain elevation model used for developing the target reports. */
                fun j27(j27: String) = j27(JsonField.of(j27))

                /**
                 * Sets [Builder.j27] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j27] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j27(j27: JsonField<String>) = apply { this.j27 = j27 }

                /** The geoid model used for developing the target reports. */
                fun j28(j28: String) = j28(JsonField.of(j28))

                /**
                 * Sets [Builder.j28] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j28] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j28(j28: JsonField<String>) = apply { this.j28 = j28 }

                /** Identifier of the particular variant of the sensor type. */
                fun j3(j3: String) = j3(JsonField.of(j3))

                /**
                 * Sets [Builder.j3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j3] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j3(j3: JsonField<String>) = apply { this.j3 = j3 }

                /**
                 * Flag field indicating whether filtering has been applied to the targets detected
                 * within the dwell area.
                 */
                fun j4(j4: Long) = j4(JsonField.of(j4))

                /**
                 * Sets [Builder.j4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j4] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j4(j4: JsonField<Long>) = apply { this.j4 = j4 }

                /**
                 * Priority of this tasking request relative to all other active tasking requests
                 * scheduled for execution on the specified platform.
                 */
                fun j5(j5: Long) = j5(JsonField.of(j5))

                /**
                 * Sets [Builder.j5] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j5] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun j5(j5: JsonField<Long>) = apply { this.j5 = j5 }

                /**
                 * North-South position of the first corner (Point A) defining the area for sensor
                 * service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun j6(j6: Double) = j6(JsonField.of(j6))

                /**
                 * Sets [Builder.j6] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j6] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j6(j6: JsonField<Double>) = apply { this.j6 = j6 }

                /**
                 * East-West position of the first corner (Point A) defining the area for sensor
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun j7(j7: Double) = j7(JsonField.of(j7))

                /**
                 * Sets [Builder.j7] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j7] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j7(j7: JsonField<Double>) = apply { this.j7 = j7 }

                /**
                 * North-South position of the second corner (Point B) defining the area for sensor
                 * service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun j8(j8: Double) = j8(JsonField.of(j8))

                /**
                 * Sets [Builder.j8] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j8] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j8(j8: JsonField<Double>) = apply { this.j8 = j8 }

                /**
                 * East-West position of the second corner (Point B) defining the area for sensor
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun j9(j9: Double) = j9(JsonField.of(j9))

                /**
                 * Sets [Builder.j9] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.j9] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun j9(j9: JsonField<Double>) = apply { this.j9 = j9 }

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
                 * Returns an immutable instance of [JobDef].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): JobDef =
                    JobDef(
                        j1,
                        j10,
                        j11,
                        j12,
                        j13,
                        j14,
                        j15,
                        j16,
                        j17,
                        j18,
                        j19,
                        j2,
                        j20,
                        j21,
                        j22,
                        j23,
                        j24,
                        j25,
                        j26,
                        j27,
                        j28,
                        j3,
                        j4,
                        j5,
                        j6,
                        j7,
                        j8,
                        j9,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): JobDef = apply {
                if (validated) {
                    return@apply
                }

                j1()
                j10()
                j11()
                j12()
                j13()
                j14()
                j15()
                j16()
                j17()
                j18()
                j19()
                j2()
                j20()
                j21()
                j22()
                j23()
                j24()
                j25()
                j26()
                j27()
                j28()
                j3()
                j4()
                j5()
                j6()
                j7()
                j8()
                j9()
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
                (if (j1.asKnown().isPresent) 1 else 0) +
                    (if (j10.asKnown().isPresent) 1 else 0) +
                    (if (j11.asKnown().isPresent) 1 else 0) +
                    (if (j12.asKnown().isPresent) 1 else 0) +
                    (if (j13.asKnown().isPresent) 1 else 0) +
                    (if (j14.asKnown().isPresent) 1 else 0) +
                    (if (j15.asKnown().isPresent) 1 else 0) +
                    (if (j16.asKnown().isPresent) 1 else 0) +
                    (if (j17.asKnown().isPresent) 1 else 0) +
                    (if (j18.asKnown().isPresent) 1 else 0) +
                    (if (j19.asKnown().isPresent) 1 else 0) +
                    (if (j2.asKnown().isPresent) 1 else 0) +
                    (if (j20.asKnown().isPresent) 1 else 0) +
                    (if (j21.asKnown().isPresent) 1 else 0) +
                    (if (j22.asKnown().isPresent) 1 else 0) +
                    (if (j23.asKnown().isPresent) 1 else 0) +
                    (if (j24.asKnown().isPresent) 1 else 0) +
                    (if (j25.asKnown().isPresent) 1 else 0) +
                    (if (j26.asKnown().isPresent) 1 else 0) +
                    (if (j27.asKnown().isPresent) 1 else 0) +
                    (if (j28.asKnown().isPresent) 1 else 0) +
                    (if (j3.asKnown().isPresent) 1 else 0) +
                    (if (j4.asKnown().isPresent) 1 else 0) +
                    (if (j5.asKnown().isPresent) 1 else 0) +
                    (if (j6.asKnown().isPresent) 1 else 0) +
                    (if (j7.asKnown().isPresent) 1 else 0) +
                    (if (j8.asKnown().isPresent) 1 else 0) +
                    (if (j9.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is JobDef &&
                    j1 == other.j1 &&
                    j10 == other.j10 &&
                    j11 == other.j11 &&
                    j12 == other.j12 &&
                    j13 == other.j13 &&
                    j14 == other.j14 &&
                    j15 == other.j15 &&
                    j16 == other.j16 &&
                    j17 == other.j17 &&
                    j18 == other.j18 &&
                    j19 == other.j19 &&
                    j2 == other.j2 &&
                    j20 == other.j20 &&
                    j21 == other.j21 &&
                    j22 == other.j22 &&
                    j23 == other.j23 &&
                    j24 == other.j24 &&
                    j25 == other.j25 &&
                    j26 == other.j26 &&
                    j27 == other.j27 &&
                    j28 == other.j28 &&
                    j3 == other.j3 &&
                    j4 == other.j4 &&
                    j5 == other.j5 &&
                    j6 == other.j6 &&
                    j7 == other.j7 &&
                    j8 == other.j8 &&
                    j9 == other.j9 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    j1,
                    j10,
                    j11,
                    j12,
                    j13,
                    j14,
                    j15,
                    j16,
                    j17,
                    j18,
                    j19,
                    j2,
                    j20,
                    j21,
                    j22,
                    j23,
                    j24,
                    j25,
                    j26,
                    j27,
                    j28,
                    j3,
                    j4,
                    j5,
                    j6,
                    j7,
                    j8,
                    j9,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JobDef{j1=$j1, j10=$j10, j11=$j11, j12=$j12, j13=$j13, j14=$j14, j15=$j15, j16=$j16, j17=$j17, j18=$j18, j19=$j19, j2=$j2, j20=$j20, j21=$j21, j22=$j22, j23=$j23, j24=$j24, j25=$j25, j26=$j26, j27=$j27, j28=$j28, j3=$j3, j4=$j4, j5=$j5, j6=$j6, j7=$j7, j8=$j8, j9=$j9, additionalProperties=$additionalProperties}"
        }

        class JobRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val jobReqEst: JsonField<OffsetDateTime>,
            private val r1: JsonField<String>,
            private val r10: JsonField<Double>,
            private val r11: JsonField<Double>,
            private val r12: JsonField<String>,
            private val r13: JsonField<Int>,
            private val r14: JsonField<Int>,
            private val r2: JsonField<String>,
            private val r21: JsonField<Int>,
            private val r22: JsonField<Int>,
            private val r23: JsonField<Int>,
            private val r24: JsonField<String>,
            private val r25: JsonField<String>,
            private val r26: JsonField<Boolean>,
            private val r3: JsonField<Long>,
            private val r4: JsonField<Double>,
            private val r5: JsonField<Double>,
            private val r6: JsonField<Double>,
            private val r7: JsonField<Double>,
            private val r8: JsonField<Double>,
            private val r9: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("jobReqEst")
                @ExcludeMissing
                jobReqEst: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("r1") @ExcludeMissing r1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("r10") @ExcludeMissing r10: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r11") @ExcludeMissing r11: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r12") @ExcludeMissing r12: JsonField<String> = JsonMissing.of(),
                @JsonProperty("r13") @ExcludeMissing r13: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("r14") @ExcludeMissing r14: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("r2") @ExcludeMissing r2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("r21") @ExcludeMissing r21: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("r22") @ExcludeMissing r22: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("r23") @ExcludeMissing r23: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("r24") @ExcludeMissing r24: JsonField<String> = JsonMissing.of(),
                @JsonProperty("r25") @ExcludeMissing r25: JsonField<String> = JsonMissing.of(),
                @JsonProperty("r26") @ExcludeMissing r26: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("r3") @ExcludeMissing r3: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("r4") @ExcludeMissing r4: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r5") @ExcludeMissing r5: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r6") @ExcludeMissing r6: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r7") @ExcludeMissing r7: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r8") @ExcludeMissing r8: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("r9") @ExcludeMissing r9: JsonField<Double> = JsonMissing.of(),
            ) : this(
                jobReqEst,
                r1,
                r10,
                r11,
                r12,
                r13,
                r14,
                r2,
                r21,
                r22,
                r23,
                r24,
                r25,
                r26,
                r3,
                r4,
                r5,
                r6,
                r7,
                r8,
                r9,
                mutableMapOf(),
            )

            /**
             * Specifies the Earliest Start Time for which the service is requested. Composite of
             * fields R15-R20.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun jobReqEst(): Optional<OffsetDateTime> = jobReqEst.getOptional("jobReqEst")

            /**
             * The requestor of the sensor service.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r1(): Optional<String> = r1.getOptional("r1")

            /**
             * North-South position of the fourth corner (Point D) defining the requested area for
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r10(): Optional<Double> = r10.getOptional("r10")

            /**
             * East-West position of the fourth corner (Point D) defining the requested area for
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r11(): Optional<Double> = r11.getOptional("r11")

            /**
             * Identifies the radar mode requested by the requestor.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r12(): Optional<String> = r12.getOptional("r12")

            /**
             * Specifies the radar range resolution requested by the requestor, expressed in
             * centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r13(): Optional<Int> = r13.getOptional("r13")

            /**
             * Specifies the radar cross-range resolution requested by the requestor, expressed in
             * decimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r14(): Optional<Int> = r14.getOptional("r14")

            /**
             * Identifier for the tasking message sent by the requesting station.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r2(): Optional<String> = r2.getOptional("r2")

            /**
             * Specifies the maximum time from the requested start time after which the request is
             * to be abandoned, expressed in seconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r21(): Optional<Int> = r21.getOptional("r21")

            /**
             * Specifies the time duration for the radar job, measured from the actual start of the
             * job, expressed in seconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r22(): Optional<Int> = r22.getOptional("r22")

            /**
             * Specifies the revisit interval for the radar job, expressed in deciseconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r23(): Optional<Int> = r23.getOptional("r23")

            /**
             * the type of sensor or the platform.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r24(): Optional<String> = r24.getOptional("r24")

            /**
             * The particular variant of the sensor type.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r25(): Optional<String> = r25.getOptional("r25")

            /**
             * Flag field indicating that it is an initial request (flag = 0) or the desire of the
             * requestor to cancel (flag = 1) the requested job.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r26(): Optional<Boolean> = r26.getOptional("r26")

            /**
             * The priority of the request relative to other requests originated by the requesting
             * station.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r3(): Optional<Long> = r3.getOptional("r3")

            /**
             * North-South position of the first corner (Point A) defining the requested area for
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r4(): Optional<Double> = r4.getOptional("r4")

            /**
             * East-West position of the first corner (Point A) defining the requested area for
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r5(): Optional<Double> = r5.getOptional("r5")

            /**
             * North-South position of the second corner (Point B) defining the requested area for
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r6(): Optional<Double> = r6.getOptional("r6")

            /**
             * East-West position of the second corner (Point B) defining the requested area for
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r7(): Optional<Double> = r7.getOptional("r7")

            /**
             * North-South position of the third corner (Point C) defining the requested area for
             * service, expressed as degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r8(): Optional<Double> = r8.getOptional("r8")

            /**
             * East-West position of the third corner (Point C) defining the requested area for
             * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to -180)
             * of the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun r9(): Optional<Double> = r9.getOptional("r9")

            /**
             * Returns the raw JSON value of [jobReqEst].
             *
             * Unlike [jobReqEst], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("jobReqEst")
            @ExcludeMissing
            fun _jobReqEst(): JsonField<OffsetDateTime> = jobReqEst

            /**
             * Returns the raw JSON value of [r1].
             *
             * Unlike [r1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r1") @ExcludeMissing fun _r1(): JsonField<String> = r1

            /**
             * Returns the raw JSON value of [r10].
             *
             * Unlike [r10], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r10") @ExcludeMissing fun _r10(): JsonField<Double> = r10

            /**
             * Returns the raw JSON value of [r11].
             *
             * Unlike [r11], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r11") @ExcludeMissing fun _r11(): JsonField<Double> = r11

            /**
             * Returns the raw JSON value of [r12].
             *
             * Unlike [r12], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r12") @ExcludeMissing fun _r12(): JsonField<String> = r12

            /**
             * Returns the raw JSON value of [r13].
             *
             * Unlike [r13], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r13") @ExcludeMissing fun _r13(): JsonField<Int> = r13

            /**
             * Returns the raw JSON value of [r14].
             *
             * Unlike [r14], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r14") @ExcludeMissing fun _r14(): JsonField<Int> = r14

            /**
             * Returns the raw JSON value of [r2].
             *
             * Unlike [r2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r2") @ExcludeMissing fun _r2(): JsonField<String> = r2

            /**
             * Returns the raw JSON value of [r21].
             *
             * Unlike [r21], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r21") @ExcludeMissing fun _r21(): JsonField<Int> = r21

            /**
             * Returns the raw JSON value of [r22].
             *
             * Unlike [r22], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r22") @ExcludeMissing fun _r22(): JsonField<Int> = r22

            /**
             * Returns the raw JSON value of [r23].
             *
             * Unlike [r23], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r23") @ExcludeMissing fun _r23(): JsonField<Int> = r23

            /**
             * Returns the raw JSON value of [r24].
             *
             * Unlike [r24], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r24") @ExcludeMissing fun _r24(): JsonField<String> = r24

            /**
             * Returns the raw JSON value of [r25].
             *
             * Unlike [r25], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r25") @ExcludeMissing fun _r25(): JsonField<String> = r25

            /**
             * Returns the raw JSON value of [r26].
             *
             * Unlike [r26], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r26") @ExcludeMissing fun _r26(): JsonField<Boolean> = r26

            /**
             * Returns the raw JSON value of [r3].
             *
             * Unlike [r3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r3") @ExcludeMissing fun _r3(): JsonField<Long> = r3

            /**
             * Returns the raw JSON value of [r4].
             *
             * Unlike [r4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r4") @ExcludeMissing fun _r4(): JsonField<Double> = r4

            /**
             * Returns the raw JSON value of [r5].
             *
             * Unlike [r5], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r5") @ExcludeMissing fun _r5(): JsonField<Double> = r5

            /**
             * Returns the raw JSON value of [r6].
             *
             * Unlike [r6], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r6") @ExcludeMissing fun _r6(): JsonField<Double> = r6

            /**
             * Returns the raw JSON value of [r7].
             *
             * Unlike [r7], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r7") @ExcludeMissing fun _r7(): JsonField<Double> = r7

            /**
             * Returns the raw JSON value of [r8].
             *
             * Unlike [r8], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r8") @ExcludeMissing fun _r8(): JsonField<Double> = r8

            /**
             * Returns the raw JSON value of [r9].
             *
             * Unlike [r9], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("r9") @ExcludeMissing fun _r9(): JsonField<Double> = r9

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

                /** Returns a mutable builder for constructing an instance of [JobRequest]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [JobRequest]. */
            class Builder internal constructor() {

                private var jobReqEst: JsonField<OffsetDateTime> = JsonMissing.of()
                private var r1: JsonField<String> = JsonMissing.of()
                private var r10: JsonField<Double> = JsonMissing.of()
                private var r11: JsonField<Double> = JsonMissing.of()
                private var r12: JsonField<String> = JsonMissing.of()
                private var r13: JsonField<Int> = JsonMissing.of()
                private var r14: JsonField<Int> = JsonMissing.of()
                private var r2: JsonField<String> = JsonMissing.of()
                private var r21: JsonField<Int> = JsonMissing.of()
                private var r22: JsonField<Int> = JsonMissing.of()
                private var r23: JsonField<Int> = JsonMissing.of()
                private var r24: JsonField<String> = JsonMissing.of()
                private var r25: JsonField<String> = JsonMissing.of()
                private var r26: JsonField<Boolean> = JsonMissing.of()
                private var r3: JsonField<Long> = JsonMissing.of()
                private var r4: JsonField<Double> = JsonMissing.of()
                private var r5: JsonField<Double> = JsonMissing.of()
                private var r6: JsonField<Double> = JsonMissing.of()
                private var r7: JsonField<Double> = JsonMissing.of()
                private var r8: JsonField<Double> = JsonMissing.of()
                private var r9: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(jobRequest: JobRequest) = apply {
                    jobReqEst = jobRequest.jobReqEst
                    r1 = jobRequest.r1
                    r10 = jobRequest.r10
                    r11 = jobRequest.r11
                    r12 = jobRequest.r12
                    r13 = jobRequest.r13
                    r14 = jobRequest.r14
                    r2 = jobRequest.r2
                    r21 = jobRequest.r21
                    r22 = jobRequest.r22
                    r23 = jobRequest.r23
                    r24 = jobRequest.r24
                    r25 = jobRequest.r25
                    r26 = jobRequest.r26
                    r3 = jobRequest.r3
                    r4 = jobRequest.r4
                    r5 = jobRequest.r5
                    r6 = jobRequest.r6
                    r7 = jobRequest.r7
                    r8 = jobRequest.r8
                    r9 = jobRequest.r9
                    additionalProperties = jobRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Specifies the Earliest Start Time for which the service is requested. Composite
                 * of fields R15-R20.
                 */
                fun jobReqEst(jobReqEst: OffsetDateTime) = jobReqEst(JsonField.of(jobReqEst))

                /**
                 * Sets [Builder.jobReqEst] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.jobReqEst] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun jobReqEst(jobReqEst: JsonField<OffsetDateTime>) = apply {
                    this.jobReqEst = jobReqEst
                }

                /** The requestor of the sensor service. */
                fun r1(r1: String) = r1(JsonField.of(r1))

                /**
                 * Sets [Builder.r1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r1(r1: JsonField<String>) = apply { this.r1 = r1 }

                /**
                 * North-South position of the fourth corner (Point D) defining the requested area
                 * for service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun r10(r10: Double) = r10(JsonField.of(r10))

                /**
                 * Sets [Builder.r10] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r10] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r10(r10: JsonField<Double>) = apply { this.r10 = r10 }

                /**
                 * East-West position of the fourth corner (Point D) defining the requested area for
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun r11(r11: Double) = r11(JsonField.of(r11))

                /**
                 * Sets [Builder.r11] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r11] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r11(r11: JsonField<Double>) = apply { this.r11 = r11 }

                /** Identifies the radar mode requested by the requestor. */
                fun r12(r12: String) = r12(JsonField.of(r12))

                /**
                 * Sets [Builder.r12] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r12] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r12(r12: JsonField<String>) = apply { this.r12 = r12 }

                /**
                 * Specifies the radar range resolution requested by the requestor, expressed in
                 * centimeters.
                 */
                fun r13(r13: Int) = r13(JsonField.of(r13))

                /**
                 * Sets [Builder.r13] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r13] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun r13(r13: JsonField<Int>) = apply { this.r13 = r13 }

                /**
                 * Specifies the radar cross-range resolution requested by the requestor, expressed
                 * in decimeters.
                 */
                fun r14(r14: Int) = r14(JsonField.of(r14))

                /**
                 * Sets [Builder.r14] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r14] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun r14(r14: JsonField<Int>) = apply { this.r14 = r14 }

                /** Identifier for the tasking message sent by the requesting station. */
                fun r2(r2: String) = r2(JsonField.of(r2))

                /**
                 * Sets [Builder.r2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r2(r2: JsonField<String>) = apply { this.r2 = r2 }

                /**
                 * Specifies the maximum time from the requested start time after which the request
                 * is to be abandoned, expressed in seconds.
                 */
                fun r21(r21: Int) = r21(JsonField.of(r21))

                /**
                 * Sets [Builder.r21] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r21] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun r21(r21: JsonField<Int>) = apply { this.r21 = r21 }

                /**
                 * Specifies the time duration for the radar job, measured from the actual start of
                 * the job, expressed in seconds.
                 */
                fun r22(r22: Int) = r22(JsonField.of(r22))

                /**
                 * Sets [Builder.r22] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r22] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun r22(r22: JsonField<Int>) = apply { this.r22 = r22 }

                /** Specifies the revisit interval for the radar job, expressed in deciseconds. */
                fun r23(r23: Int) = r23(JsonField.of(r23))

                /**
                 * Sets [Builder.r23] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r23] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun r23(r23: JsonField<Int>) = apply { this.r23 = r23 }

                /** the type of sensor or the platform. */
                fun r24(r24: String) = r24(JsonField.of(r24))

                /**
                 * Sets [Builder.r24] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r24] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r24(r24: JsonField<String>) = apply { this.r24 = r24 }

                /** The particular variant of the sensor type. */
                fun r25(r25: String) = r25(JsonField.of(r25))

                /**
                 * Sets [Builder.r25] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r25] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r25(r25: JsonField<String>) = apply { this.r25 = r25 }

                /**
                 * Flag field indicating that it is an initial request (flag = 0) or the desire of
                 * the requestor to cancel (flag = 1) the requested job.
                 */
                fun r26(r26: Boolean) = r26(JsonField.of(r26))

                /**
                 * Sets [Builder.r26] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r26] with a well-typed [Boolean] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r26(r26: JsonField<Boolean>) = apply { this.r26 = r26 }

                /**
                 * The priority of the request relative to other requests originated by the
                 * requesting station.
                 */
                fun r3(r3: Long) = r3(JsonField.of(r3))

                /**
                 * Sets [Builder.r3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r3] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun r3(r3: JsonField<Long>) = apply { this.r3 = r3 }

                /**
                 * North-South position of the first corner (Point A) defining the requested area
                 * for service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun r4(r4: Double) = r4(JsonField.of(r4))

                /**
                 * Sets [Builder.r4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r4] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r4(r4: JsonField<Double>) = apply { this.r4 = r4 }

                /**
                 * East-West position of the first corner (Point A) defining the requested area for
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun r5(r5: Double) = r5(JsonField.of(r5))

                /**
                 * Sets [Builder.r5] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r5] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r5(r5: JsonField<Double>) = apply { this.r5 = r5 }

                /**
                 * North-South position of the second corner (Point B) defining the requested area
                 * for service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun r6(r6: Double) = r6(JsonField.of(r6))

                /**
                 * Sets [Builder.r6] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r6] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r6(r6: JsonField<Double>) = apply { this.r6 = r6 }

                /**
                 * East-West position of the second corner (Point B) defining the requested area for
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun r7(r7: Double) = r7(JsonField.of(r7))

                /**
                 * Sets [Builder.r7] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r7] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r7(r7: JsonField<Double>) = apply { this.r7 = r7 }

                /**
                 * North-South position of the third corner (Point C) defining the requested area
                 * for service, expressed as degrees North (positive) or South (negative) of the
                 * Equator.
                 */
                fun r8(r8: Double) = r8(JsonField.of(r8))

                /**
                 * Sets [Builder.r8] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r8] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r8(r8: JsonField<Double>) = apply { this.r8 = r8 }

                /**
                 * East-West position of the third corner (Point C) defining the requested area for
                 * service, expressed as degrees East (positive, 0 to 180) or West (negative, 0 to
                 * -180) of the Prime Meridian.
                 */
                fun r9(r9: Double) = r9(JsonField.of(r9))

                /**
                 * Sets [Builder.r9] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.r9] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun r9(r9: JsonField<Double>) = apply { this.r9 = r9 }

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
                 * Returns an immutable instance of [JobRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): JobRequest =
                    JobRequest(
                        jobReqEst,
                        r1,
                        r10,
                        r11,
                        r12,
                        r13,
                        r14,
                        r2,
                        r21,
                        r22,
                        r23,
                        r24,
                        r25,
                        r26,
                        r3,
                        r4,
                        r5,
                        r6,
                        r7,
                        r8,
                        r9,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): JobRequest = apply {
                if (validated) {
                    return@apply
                }

                jobReqEst()
                r1()
                r10()
                r11()
                r12()
                r13()
                r14()
                r2()
                r21()
                r22()
                r23()
                r24()
                r25()
                r26()
                r3()
                r4()
                r5()
                r6()
                r7()
                r8()
                r9()
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
                (if (jobReqEst.asKnown().isPresent) 1 else 0) +
                    (if (r1.asKnown().isPresent) 1 else 0) +
                    (if (r10.asKnown().isPresent) 1 else 0) +
                    (if (r11.asKnown().isPresent) 1 else 0) +
                    (if (r12.asKnown().isPresent) 1 else 0) +
                    (if (r13.asKnown().isPresent) 1 else 0) +
                    (if (r14.asKnown().isPresent) 1 else 0) +
                    (if (r2.asKnown().isPresent) 1 else 0) +
                    (if (r21.asKnown().isPresent) 1 else 0) +
                    (if (r22.asKnown().isPresent) 1 else 0) +
                    (if (r23.asKnown().isPresent) 1 else 0) +
                    (if (r24.asKnown().isPresent) 1 else 0) +
                    (if (r25.asKnown().isPresent) 1 else 0) +
                    (if (r26.asKnown().isPresent) 1 else 0) +
                    (if (r3.asKnown().isPresent) 1 else 0) +
                    (if (r4.asKnown().isPresent) 1 else 0) +
                    (if (r5.asKnown().isPresent) 1 else 0) +
                    (if (r6.asKnown().isPresent) 1 else 0) +
                    (if (r7.asKnown().isPresent) 1 else 0) +
                    (if (r8.asKnown().isPresent) 1 else 0) +
                    (if (r9.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is JobRequest &&
                    jobReqEst == other.jobReqEst &&
                    r1 == other.r1 &&
                    r10 == other.r10 &&
                    r11 == other.r11 &&
                    r12 == other.r12 &&
                    r13 == other.r13 &&
                    r14 == other.r14 &&
                    r2 == other.r2 &&
                    r21 == other.r21 &&
                    r22 == other.r22 &&
                    r23 == other.r23 &&
                    r24 == other.r24 &&
                    r25 == other.r25 &&
                    r26 == other.r26 &&
                    r3 == other.r3 &&
                    r4 == other.r4 &&
                    r5 == other.r5 &&
                    r6 == other.r6 &&
                    r7 == other.r7 &&
                    r8 == other.r8 &&
                    r9 == other.r9 &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    jobReqEst,
                    r1,
                    r10,
                    r11,
                    r12,
                    r13,
                    r14,
                    r2,
                    r21,
                    r22,
                    r23,
                    r24,
                    r25,
                    r26,
                    r3,
                    r4,
                    r5,
                    r6,
                    r7,
                    r8,
                    r9,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "JobRequest{jobReqEst=$jobReqEst, r1=$r1, r10=$r10, r11=$r11, r12=$r12, r13=$r13, r14=$r14, r2=$r2, r21=$r21, r22=$r22, r23=$r23, r24=$r24, r25=$r25, r26=$r26, r3=$r3, r4=$r4, r5=$r5, r6=$r6, r7=$r7, r8=$r8, r9=$r9, additionalProperties=$additionalProperties}"
        }

        class Mission
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val m1: JsonField<String>,
            private val m2: JsonField<String>,
            private val m3: JsonField<String>,
            private val m4: JsonField<String>,
            private val msnRefTs: JsonField<LocalDate>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("m1") @ExcludeMissing m1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("m2") @ExcludeMissing m2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("m3") @ExcludeMissing m3: JsonField<String> = JsonMissing.of(),
                @JsonProperty("m4") @ExcludeMissing m4: JsonField<String> = JsonMissing.of(),
                @JsonProperty("msnRefTs")
                @ExcludeMissing
                msnRefTs: JsonField<LocalDate> = JsonMissing.of(),
            ) : this(m1, m2, m3, m4, msnRefTs, mutableMapOf())

            /**
             * The mission plan id.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun m1(): Optional<String> = m1.getOptional("m1")

            /**
             * Unique identification of the flight plan.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun m2(): Optional<String> = m2.getOptional("m2")

            /**
             * Platform type that originated the data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun m3(): Optional<String> = m3.getOptional("m3")

            /**
             * Identification of the platform variant, modifications, etc.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun m4(): Optional<String> = m4.getOptional("m4")

            /**
             * Mission origination date.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun msnRefTs(): Optional<LocalDate> = msnRefTs.getOptional("msnRefTs")

            /**
             * Returns the raw JSON value of [m1].
             *
             * Unlike [m1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("m1") @ExcludeMissing fun _m1(): JsonField<String> = m1

            /**
             * Returns the raw JSON value of [m2].
             *
             * Unlike [m2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("m2") @ExcludeMissing fun _m2(): JsonField<String> = m2

            /**
             * Returns the raw JSON value of [m3].
             *
             * Unlike [m3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("m3") @ExcludeMissing fun _m3(): JsonField<String> = m3

            /**
             * Returns the raw JSON value of [m4].
             *
             * Unlike [m4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("m4") @ExcludeMissing fun _m4(): JsonField<String> = m4

            /**
             * Returns the raw JSON value of [msnRefTs].
             *
             * Unlike [msnRefTs], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("msnRefTs")
            @ExcludeMissing
            fun _msnRefTs(): JsonField<LocalDate> = msnRefTs

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

                /** Returns a mutable builder for constructing an instance of [Mission]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Mission]. */
            class Builder internal constructor() {

                private var m1: JsonField<String> = JsonMissing.of()
                private var m2: JsonField<String> = JsonMissing.of()
                private var m3: JsonField<String> = JsonMissing.of()
                private var m4: JsonField<String> = JsonMissing.of()
                private var msnRefTs: JsonField<LocalDate> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(mission: Mission) = apply {
                    m1 = mission.m1
                    m2 = mission.m2
                    m3 = mission.m3
                    m4 = mission.m4
                    msnRefTs = mission.msnRefTs
                    additionalProperties = mission.additionalProperties.toMutableMap()
                }

                /** The mission plan id. */
                fun m1(m1: String) = m1(JsonField.of(m1))

                /**
                 * Sets [Builder.m1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.m1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun m1(m1: JsonField<String>) = apply { this.m1 = m1 }

                /** Unique identification of the flight plan. */
                fun m2(m2: String) = m2(JsonField.of(m2))

                /**
                 * Sets [Builder.m2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.m2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun m2(m2: JsonField<String>) = apply { this.m2 = m2 }

                /** Platform type that originated the data. */
                fun m3(m3: String) = m3(JsonField.of(m3))

                /**
                 * Sets [Builder.m3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.m3] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun m3(m3: JsonField<String>) = apply { this.m3 = m3 }

                /** Identification of the platform variant, modifications, etc. */
                fun m4(m4: String) = m4(JsonField.of(m4))

                /**
                 * Sets [Builder.m4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.m4] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun m4(m4: JsonField<String>) = apply { this.m4 = m4 }

                /** Mission origination date. */
                fun msnRefTs(msnRefTs: LocalDate) = msnRefTs(JsonField.of(msnRefTs))

                /**
                 * Sets [Builder.msnRefTs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.msnRefTs] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun msnRefTs(msnRefTs: JsonField<LocalDate>) = apply { this.msnRefTs = msnRefTs }

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
                 * Returns an immutable instance of [Mission].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Mission =
                    Mission(m1, m2, m3, m4, msnRefTs, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Mission = apply {
                if (validated) {
                    return@apply
                }

                m1()
                m2()
                m3()
                m4()
                msnRefTs()
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
                (if (m1.asKnown().isPresent) 1 else 0) +
                    (if (m2.asKnown().isPresent) 1 else 0) +
                    (if (m3.asKnown().isPresent) 1 else 0) +
                    (if (m4.asKnown().isPresent) 1 else 0) +
                    (if (msnRefTs.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Mission &&
                    m1 == other.m1 &&
                    m2 == other.m2 &&
                    m3 == other.m3 &&
                    m4 == other.m4 &&
                    msnRefTs == other.msnRefTs &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(m1, m2, m3, m4, msnRefTs, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Mission{m1=$m1, m2=$m2, m3=$m3, m4=$m4, msnRefTs=$msnRefTs, additionalProperties=$additionalProperties}"
        }

        class PlatformLoc
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val l1: JsonField<Long>,
            private val l2: JsonField<Double>,
            private val l3: JsonField<Double>,
            private val l4: JsonField<Int>,
            private val l5: JsonField<Double>,
            private val l6: JsonField<Int>,
            private val l7: JsonField<Long>,
            private val platlocts: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("l1") @ExcludeMissing l1: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("l2") @ExcludeMissing l2: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("l3") @ExcludeMissing l3: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("l4") @ExcludeMissing l4: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("l5") @ExcludeMissing l5: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("l6") @ExcludeMissing l6: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("l7") @ExcludeMissing l7: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("platlocts")
                @ExcludeMissing
                platlocts: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(l1, l2, l3, l4, l5, l6, l7, platlocts, mutableMapOf())

            /**
             * Elapsed time, expressed in milliseconds, from midnight at the beginning of the day
             * specified in the Reference Time fields of the Mission Segment to the time the report
             * is prepared.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l1(): Optional<Long> = l1.getOptional("l1")

            /**
             * North-South position of the platform at the time the report is prepared, expressed as
             * degrees North (positive) or South (negative) of the Equator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l2(): Optional<Double> = l2.getOptional("l2")

            /**
             * East-West position of the platform at the time the report is prepared, expressed as
             * degrees East (positive) from the Prime Meridian.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l3(): Optional<Double> = l3.getOptional("l3")

            /**
             * Altitude of the platform at the time the report is prepared, referenced to its
             * position above the WGS-84 ellipsoid, in centimeters.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l4(): Optional<Int> = l4.getOptional("l4")

            /**
             * Ground track of the platform at the time the report is prepared, expressed as the
             * angle in degrees (clockwise) from True North.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l5(): Optional<Double> = l5.getOptional("l5")

            /**
             * Ground speed of the platform at the time the report is prepared, expressed as
             * millimeters per second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l6(): Optional<Int> = l6.getOptional("l6")

            /**
             * Velocity of the platform in the vertical direction, expressed as decimeters per
             * second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun l7(): Optional<Long> = l7.getOptional("l7")

            /**
             * Platform location timestamp in ISO8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun platlocts(): Optional<OffsetDateTime> = platlocts.getOptional("platlocts")

            /**
             * Returns the raw JSON value of [l1].
             *
             * Unlike [l1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l1") @ExcludeMissing fun _l1(): JsonField<Long> = l1

            /**
             * Returns the raw JSON value of [l2].
             *
             * Unlike [l2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l2") @ExcludeMissing fun _l2(): JsonField<Double> = l2

            /**
             * Returns the raw JSON value of [l3].
             *
             * Unlike [l3], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l3") @ExcludeMissing fun _l3(): JsonField<Double> = l3

            /**
             * Returns the raw JSON value of [l4].
             *
             * Unlike [l4], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l4") @ExcludeMissing fun _l4(): JsonField<Int> = l4

            /**
             * Returns the raw JSON value of [l5].
             *
             * Unlike [l5], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l5") @ExcludeMissing fun _l5(): JsonField<Double> = l5

            /**
             * Returns the raw JSON value of [l6].
             *
             * Unlike [l6], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l6") @ExcludeMissing fun _l6(): JsonField<Int> = l6

            /**
             * Returns the raw JSON value of [l7].
             *
             * Unlike [l7], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("l7") @ExcludeMissing fun _l7(): JsonField<Long> = l7

            /**
             * Returns the raw JSON value of [platlocts].
             *
             * Unlike [platlocts], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("platlocts")
            @ExcludeMissing
            fun _platlocts(): JsonField<OffsetDateTime> = platlocts

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

                /** Returns a mutable builder for constructing an instance of [PlatformLoc]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PlatformLoc]. */
            class Builder internal constructor() {

                private var l1: JsonField<Long> = JsonMissing.of()
                private var l2: JsonField<Double> = JsonMissing.of()
                private var l3: JsonField<Double> = JsonMissing.of()
                private var l4: JsonField<Int> = JsonMissing.of()
                private var l5: JsonField<Double> = JsonMissing.of()
                private var l6: JsonField<Int> = JsonMissing.of()
                private var l7: JsonField<Long> = JsonMissing.of()
                private var platlocts: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(platformLoc: PlatformLoc) = apply {
                    l1 = platformLoc.l1
                    l2 = platformLoc.l2
                    l3 = platformLoc.l3
                    l4 = platformLoc.l4
                    l5 = platformLoc.l5
                    l6 = platformLoc.l6
                    l7 = platformLoc.l7
                    platlocts = platformLoc.platlocts
                    additionalProperties = platformLoc.additionalProperties.toMutableMap()
                }

                /**
                 * Elapsed time, expressed in milliseconds, from midnight at the beginning of the
                 * day specified in the Reference Time fields of the Mission Segment to the time the
                 * report is prepared.
                 */
                fun l1(l1: Long) = l1(JsonField.of(l1))

                /**
                 * Sets [Builder.l1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l1] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun l1(l1: JsonField<Long>) = apply { this.l1 = l1 }

                /**
                 * North-South position of the platform at the time the report is prepared,
                 * expressed as degrees North (positive) or South (negative) of the Equator.
                 */
                fun l2(l2: Double) = l2(JsonField.of(l2))

                /**
                 * Sets [Builder.l2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l2] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun l2(l2: JsonField<Double>) = apply { this.l2 = l2 }

                /**
                 * East-West position of the platform at the time the report is prepared, expressed
                 * as degrees East (positive) from the Prime Meridian.
                 */
                fun l3(l3: Double) = l3(JsonField.of(l3))

                /**
                 * Sets [Builder.l3] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l3] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun l3(l3: JsonField<Double>) = apply { this.l3 = l3 }

                /**
                 * Altitude of the platform at the time the report is prepared, referenced to its
                 * position above the WGS-84 ellipsoid, in centimeters.
                 */
                fun l4(l4: Int) = l4(JsonField.of(l4))

                /**
                 * Sets [Builder.l4] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l4] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun l4(l4: JsonField<Int>) = apply { this.l4 = l4 }

                /**
                 * Ground track of the platform at the time the report is prepared, expressed as the
                 * angle in degrees (clockwise) from True North.
                 */
                fun l5(l5: Double) = l5(JsonField.of(l5))

                /**
                 * Sets [Builder.l5] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l5] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun l5(l5: JsonField<Double>) = apply { this.l5 = l5 }

                /**
                 * Ground speed of the platform at the time the report is prepared, expressed as
                 * millimeters per second.
                 */
                fun l6(l6: Int) = l6(JsonField.of(l6))

                /**
                 * Sets [Builder.l6] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l6] with a well-typed [Int] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun l6(l6: JsonField<Int>) = apply { this.l6 = l6 }

                /**
                 * Velocity of the platform in the vertical direction, expressed as decimeters per
                 * second.
                 */
                fun l7(l7: Long) = l7(JsonField.of(l7))

                /**
                 * Sets [Builder.l7] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.l7] with a well-typed [Long] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun l7(l7: JsonField<Long>) = apply { this.l7 = l7 }

                /** Platform location timestamp in ISO8601 UTC format. */
                fun platlocts(platlocts: OffsetDateTime) = platlocts(JsonField.of(platlocts))

                /**
                 * Sets [Builder.platlocts] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platlocts] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun platlocts(platlocts: JsonField<OffsetDateTime>) = apply {
                    this.platlocts = platlocts
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
                 * Returns an immutable instance of [PlatformLoc].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PlatformLoc =
                    PlatformLoc(
                        l1,
                        l2,
                        l3,
                        l4,
                        l5,
                        l6,
                        l7,
                        platlocts,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PlatformLoc = apply {
                if (validated) {
                    return@apply
                }

                l1()
                l2()
                l3()
                l4()
                l5()
                l6()
                l7()
                platlocts()
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
                (if (l1.asKnown().isPresent) 1 else 0) +
                    (if (l2.asKnown().isPresent) 1 else 0) +
                    (if (l3.asKnown().isPresent) 1 else 0) +
                    (if (l4.asKnown().isPresent) 1 else 0) +
                    (if (l5.asKnown().isPresent) 1 else 0) +
                    (if (l6.asKnown().isPresent) 1 else 0) +
                    (if (l7.asKnown().isPresent) 1 else 0) +
                    (if (platlocts.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlatformLoc &&
                    l1 == other.l1 &&
                    l2 == other.l2 &&
                    l3 == other.l3 &&
                    l4 == other.l4 &&
                    l5 == other.l5 &&
                    l6 == other.l6 &&
                    l7 == other.l7 &&
                    platlocts == other.platlocts &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(l1, l2, l3, l4, l5, l6, l7, platlocts, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlatformLoc{l1=$l1, l2=$l2, l3=$l3, l4=$l4, l5=$l5, l6=$l6, l7=$l7, platlocts=$platlocts, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                id == other.id &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                dwells == other.dwells &&
                freeTexts == other.freeTexts &&
                hrrs == other.hrrs &&
                jobDefs == other.jobDefs &&
                jobRequests == other.jobRequests &&
                missions == other.missions &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                p10 == other.p10 &&
                p3 == other.p3 &&
                p6 == other.p6 &&
                p7 == other.p7 &&
                p8 == other.p8 &&
                p9 == other.p9 &&
                platformLocs == other.platformLocs
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                id,
                createdAt,
                createdBy,
                dwells,
                freeTexts,
                hrrs,
                jobDefs,
                jobRequests,
                missions,
                origin,
                origNetwork,
                p10,
                p3,
                p6,
                p7,
                p8,
                p9,
                platformLocs,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, dwells=$dwells, freeTexts=$freeTexts, hrrs=$hrrs, jobDefs=$jobDefs, jobRequests=$jobRequests, missions=$missions, origin=$origin, origNetwork=$origNetwork, p10=$p10, p3=$p3, p6=$p6, p7=$p7, p8=$p8, p9=$p9, platformLocs=$platformLocs}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MtiUnvalidatedPublishParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MtiUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

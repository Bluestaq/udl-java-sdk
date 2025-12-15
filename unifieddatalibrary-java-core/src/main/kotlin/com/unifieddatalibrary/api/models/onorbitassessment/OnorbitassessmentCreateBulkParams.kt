// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbitassessment

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
 * Service operation intended for initial integration only, to take a list of OnorbitAssessment
 * records as a POST body and ingest into the database. This operation is not intended to be used
 * for automated feeds into UDL. Data providers should contact the UDL team for specific role
 * assignments and for instructions on setting up a permanent feed through an alternate mechanism.
 */
class OnorbitassessmentCreateBulkParams
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
         * [OnorbitassessmentCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbitassessmentCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(onorbitassessmentCreateBulkParams: OnorbitassessmentCreateBulkParams) =
            apply {
                body = onorbitassessmentCreateBulkParams.body.toMutableList()
                additionalHeaders = onorbitassessmentCreateBulkParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    onorbitassessmentCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [OnorbitassessmentCreateBulkParams].
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
        fun build(): OnorbitassessmentCreateBulkParams =
            OnorbitassessmentCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Spacecraft characterization results from analysis of MASINT data. Supports results of both
     * the overall assessment of a particular spacecraft as well as of individual signature
     * packages.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val assmtTime: JsonField<OffsetDateTime>,
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val assessment: JsonField<String>,
        private val assmtDetails: JsonField<String>,
        private val assmtLevel: JsonField<String>,
        private val assmtRotPeriod: JsonField<Double>,
        private val assmtSubType: JsonField<String>,
        private val assmtUrl: JsonField<String>,
        private val autoAssmt: JsonField<Boolean>,
        private val collectionUrl: JsonField<String>,
        private val components: JsonField<List<String>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val idOnOrbit: JsonField<String>,
        private val idSensor: JsonField<String>,
        private val obDuration: JsonField<Double>,
        private val obTime: JsonField<OffsetDateTime>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val origObjectId: JsonField<String>,
        private val origSensorId: JsonField<String>,
        private val satNo: JsonField<Int>,
        private val sigDataType: JsonField<String>,
        private val sourceDl: JsonField<String>,
        private val srcIds: JsonField<List<String>>,
        private val srcTyps: JsonField<List<String>>,
        private val tags: JsonField<List<String>>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("assmtTime")
            @ExcludeMissing
            assmtTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assessment")
            @ExcludeMissing
            assessment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assmtDetails")
            @ExcludeMissing
            assmtDetails: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assmtLevel")
            @ExcludeMissing
            assmtLevel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assmtRotPeriod")
            @ExcludeMissing
            assmtRotPeriod: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("assmtSubType")
            @ExcludeMissing
            assmtSubType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("assmtURL")
            @ExcludeMissing
            assmtUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("autoAssmt")
            @ExcludeMissing
            autoAssmt: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("collectionURL")
            @ExcludeMissing
            collectionUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("components")
            @ExcludeMissing
            components: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idOnOrbit")
            @ExcludeMissing
            idOnOrbit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idSensor")
            @ExcludeMissing
            idSensor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obDuration")
            @ExcludeMissing
            obDuration: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("obTime")
            @ExcludeMissing
            obTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origObjectId")
            @ExcludeMissing
            origObjectId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origSensorId")
            @ExcludeMissing
            origSensorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("sigDataType")
            @ExcludeMissing
            sigDataType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceDL")
            @ExcludeMissing
            sourceDl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("srcIds")
            @ExcludeMissing
            srcIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("srcTyps")
            @ExcludeMissing
            srcTyps: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("transactionId")
            @ExcludeMissing
            transactionId: JsonField<String> = JsonMissing.of(),
        ) : this(
            assmtTime,
            classificationMarking,
            dataMode,
            source,
            id,
            assessment,
            assmtDetails,
            assmtLevel,
            assmtRotPeriod,
            assmtSubType,
            assmtUrl,
            autoAssmt,
            collectionUrl,
            components,
            createdAt,
            createdBy,
            idOnOrbit,
            idSensor,
            obDuration,
            obTime,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            satNo,
            sigDataType,
            sourceDl,
            srcIds,
            srcTyps,
            tags,
            transactionId,
            mutableMapOf(),
        )

        /**
         * The time of the assessment, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun assmtTime(): OffsetDateTime = assmtTime.getRequired("assmtTime")

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
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The overall assessment of the on-orbit object. The assessment will vary depending on the
         * assessment level. If assmtLevel = SATELLITE, then expected values include HEALTHY, NO
         * DATA, UNHEALTHY, and UNKNOWN. If assmtLevel = SIGNATURE, then expected values include
         * ANOMALOUS, BAD, NOMINAL, and UNKNOWN.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assessment(): Optional<String> = assessment.getOptional("assessment")

        /**
         * Comments and details concerning this assessment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assmtDetails(): Optional<String> = assmtDetails.getOptional("assmtDetails")

        /**
         * The level (SATELLITE, SIGNATURE) of this assessment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assmtLevel(): Optional<String> = assmtLevel.getOptional("assmtLevel")

        /**
         * The rotational period, in seconds, determined in the assessment of the on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assmtRotPeriod(): Optional<Double> = assmtRotPeriod.getOptional("assmtRotPeriod")

        /**
         * The sub-type for this assessment. The sub-type provides an additional level of
         * specification when the assessment level = SIGNATURE, and will vary based on the overall
         * assessment. If assessment = ANOMALOUS, then expected values include ACTIVITY OBSERVED,
         * BAD CONFIGURATION, MANEUVERING, OTHER, POSSIBLE SAFE MODE, UNSTABLE, and WRONG ATTITUDE.
         * If assessment = BAD, then expected values include BAD-MISSING STATE VECTOR,
         * CORRUPT-NOISY, CROSS-TAG, DROPOUTS, INSUFFICIENT DATA, INSUFFICIENT LOOK ANGLE, NO
         * CROSSOVER, and SHORT. If assessment = NOMINAL, then expected values include ACTIVITY
         * OBSERVED, GRAVITY GRADIENT, HORIZON STABLE, INERTIAL, MANEUVERING, SPIN STABLE, and
         * STABLE. If assessment = UNKNOWN, then expected values include NO COHORT, and OTHER.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assmtSubType(): Optional<String> = assmtSubType.getOptional("assmtSubType")

        /**
         * URL to an external location containing additional assessment information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assmtUrl(): Optional<String> = assmtUrl.getOptional("assmtURL")

        /**
         * Flag indicating whether this assessment was auto-generated (true) or produced by an
         * analyst.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun autoAssmt(): Optional<Boolean> = autoAssmt.getOptional("autoAssmt")

        /**
         * URL to an external location containing the data that was used to make this assessment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun collectionUrl(): Optional<String> = collectionUrl.getOptional("collectionURL")

        /**
         * Array of the affected spacecraft component(s) relevant to this assessment, if
         * non-nominal.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun components(): Optional<List<String>> = components.getOptional("components")

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
         * Unique identifier of the target satellite on-orbit object to which this assessment
         * applies. This ID can be used to obtain additional information on an OnOrbit object using
         * the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the OnOrbit with
         * idOnOrbit = 25544 would be queried as /udl/onorbit/25544.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Unique identifier of the sensor from which the signature data applied in this assessment
         * was collected. This ID can be used to obtain additional information on a sensor using the
         * 'get by ID' operation (e.g. /udl/sensor/{id}). For example, the sensor with idSensor =
         * abc would be queried as /udl/sensor/abc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * The total duration, in hours, of the signature or set of signatures used to create this
         * assessment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obDuration(): Optional<Double> = obDuration.getOptional("obDuration")

        /**
         * The observation time, in ISO 8601 UTC format with millisecond precision. For
         * non-instantaneous collections, the observation time will correspond to the earliest
         * timestamp in the signature or signature set data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obTime(): Optional<OffsetDateTime> = obTime.getOptional("obTime")

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
         * Optional identifier provided by the source to indicate the target on-orbit object to
         * which this assessment applies. This may be an internal identifier and not necessarily map
         * to a valid satellite number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier provided by the observation source to indicate the sensor which
         * produced this observation. This may be an internal identifier and not necessarily a valid
         * sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * Satellite/Catalog number of the target on-orbit object to which this assessment applies.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * The observation data type (LONG DWELL, NARROWBAND, PHOTOMETRIC POL, PHOTOMETRY, RANGE
         * PROFILER, WIDEBAND, etc.) contained in the signature. Applies when assmtLevel =
         * SIGNATURE.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sigDataType(): Optional<String> = sigDataType.getOptional("sigDataType")

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
         * Array of UUIDs of the UDL data records that are related to this assessment. See the
         * associated 'srcTyps' array for the specific types of data, positionally corresponding to
         * the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
         * corresponding srcTyps array element for the data type of the UUID and use the appropriate
         * API operation to retrieve that object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

        /**
         * Array of UDL record types (DOA, ELSET, EO, ESID, GROUNDIMAGE, POI, MANEUVER, MTI, RADAR,
         * RF, SIGACT, SKYIMAGE, SV, TRACK, etc.) that are related to this assessment. See the
         * associated 'srcIds' array for the record UUIDs, positionally corresponding to the record
         * types in this array. The 'srcTyps' and 'srcIds' arrays must match in size.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

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
         * Returns the raw JSON value of [assmtTime].
         *
         * Unlike [assmtTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assmtTime")
        @ExcludeMissing
        fun _assmtTime(): JsonField<OffsetDateTime> = assmtTime

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
         * Returns the raw JSON value of [assessment].
         *
         * Unlike [assessment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assessment")
        @ExcludeMissing
        fun _assessment(): JsonField<String> = assessment

        /**
         * Returns the raw JSON value of [assmtDetails].
         *
         * Unlike [assmtDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("assmtDetails")
        @ExcludeMissing
        fun _assmtDetails(): JsonField<String> = assmtDetails

        /**
         * Returns the raw JSON value of [assmtLevel].
         *
         * Unlike [assmtLevel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assmtLevel")
        @ExcludeMissing
        fun _assmtLevel(): JsonField<String> = assmtLevel

        /**
         * Returns the raw JSON value of [assmtRotPeriod].
         *
         * Unlike [assmtRotPeriod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("assmtRotPeriod")
        @ExcludeMissing
        fun _assmtRotPeriod(): JsonField<Double> = assmtRotPeriod

        /**
         * Returns the raw JSON value of [assmtSubType].
         *
         * Unlike [assmtSubType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("assmtSubType")
        @ExcludeMissing
        fun _assmtSubType(): JsonField<String> = assmtSubType

        /**
         * Returns the raw JSON value of [assmtUrl].
         *
         * Unlike [assmtUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assmtURL") @ExcludeMissing fun _assmtUrl(): JsonField<String> = assmtUrl

        /**
         * Returns the raw JSON value of [autoAssmt].
         *
         * Unlike [autoAssmt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("autoAssmt") @ExcludeMissing fun _autoAssmt(): JsonField<Boolean> = autoAssmt

        /**
         * Returns the raw JSON value of [collectionUrl].
         *
         * Unlike [collectionUrl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("collectionURL")
        @ExcludeMissing
        fun _collectionUrl(): JsonField<String> = collectionUrl

        /**
         * Returns the raw JSON value of [components].
         *
         * Unlike [components], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("components")
        @ExcludeMissing
        fun _components(): JsonField<List<String>> = components

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
         * Returns the raw JSON value of [obDuration].
         *
         * Unlike [obDuration], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obDuration")
        @ExcludeMissing
        fun _obDuration(): JsonField<Double> = obDuration

        /**
         * Returns the raw JSON value of [obTime].
         *
         * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obTime") @ExcludeMissing fun _obTime(): JsonField<OffsetDateTime> = obTime

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
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [sigDataType].
         *
         * Unlike [sigDataType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sigDataType")
        @ExcludeMissing
        fun _sigDataType(): JsonField<String> = sigDataType

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

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
             * .assmtTime()
             * .classificationMarking()
             * .dataMode()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var assmtTime: JsonField<OffsetDateTime>? = null
            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var assessment: JsonField<String> = JsonMissing.of()
            private var assmtDetails: JsonField<String> = JsonMissing.of()
            private var assmtLevel: JsonField<String> = JsonMissing.of()
            private var assmtRotPeriod: JsonField<Double> = JsonMissing.of()
            private var assmtSubType: JsonField<String> = JsonMissing.of()
            private var assmtUrl: JsonField<String> = JsonMissing.of()
            private var autoAssmt: JsonField<Boolean> = JsonMissing.of()
            private var collectionUrl: JsonField<String> = JsonMissing.of()
            private var components: JsonField<MutableList<String>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var obDuration: JsonField<Double> = JsonMissing.of()
            private var obTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var sigDataType: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var srcIds: JsonField<MutableList<String>>? = null
            private var srcTyps: JsonField<MutableList<String>>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                assmtTime = body.assmtTime
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                id = body.id
                assessment = body.assessment
                assmtDetails = body.assmtDetails
                assmtLevel = body.assmtLevel
                assmtRotPeriod = body.assmtRotPeriod
                assmtSubType = body.assmtSubType
                assmtUrl = body.assmtUrl
                autoAssmt = body.autoAssmt
                collectionUrl = body.collectionUrl
                components = body.components.map { it.toMutableList() }
                createdAt = body.createdAt
                createdBy = body.createdBy
                idOnOrbit = body.idOnOrbit
                idSensor = body.idSensor
                obDuration = body.obDuration
                obTime = body.obTime
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                origSensorId = body.origSensorId
                satNo = body.satNo
                sigDataType = body.sigDataType
                sourceDl = body.sourceDl
                srcIds = body.srcIds.map { it.toMutableList() }
                srcTyps = body.srcTyps.map { it.toMutableList() }
                tags = body.tags.map { it.toMutableList() }
                transactionId = body.transactionId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The time of the assessment, in ISO 8601 UTC format with millisecond precision. */
            fun assmtTime(assmtTime: OffsetDateTime) = assmtTime(JsonField.of(assmtTime))

            /**
             * Sets [Builder.assmtTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assmtTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assmtTime(assmtTime: JsonField<OffsetDateTime>) = apply {
                this.assmtTime = assmtTime
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
             * The overall assessment of the on-orbit object. The assessment will vary depending on
             * the assessment level. If assmtLevel = SATELLITE, then expected values include
             * HEALTHY, NO DATA, UNHEALTHY, and UNKNOWN. If assmtLevel = SIGNATURE, then expected
             * values include ANOMALOUS, BAD, NOMINAL, and UNKNOWN.
             */
            fun assessment(assessment: String) = assessment(JsonField.of(assessment))

            /**
             * Sets [Builder.assessment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assessment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assessment(assessment: JsonField<String>) = apply { this.assessment = assessment }

            /** Comments and details concerning this assessment. */
            fun assmtDetails(assmtDetails: String) = assmtDetails(JsonField.of(assmtDetails))

            /**
             * Sets [Builder.assmtDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assmtDetails] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assmtDetails(assmtDetails: JsonField<String>) = apply {
                this.assmtDetails = assmtDetails
            }

            /** The level (SATELLITE, SIGNATURE) of this assessment. */
            fun assmtLevel(assmtLevel: String) = assmtLevel(JsonField.of(assmtLevel))

            /**
             * Sets [Builder.assmtLevel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assmtLevel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assmtLevel(assmtLevel: JsonField<String>) = apply { this.assmtLevel = assmtLevel }

            /**
             * The rotational period, in seconds, determined in the assessment of the on-orbit
             * object.
             */
            fun assmtRotPeriod(assmtRotPeriod: Double) =
                assmtRotPeriod(JsonField.of(assmtRotPeriod))

            /**
             * Sets [Builder.assmtRotPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assmtRotPeriod] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assmtRotPeriod(assmtRotPeriod: JsonField<Double>) = apply {
                this.assmtRotPeriod = assmtRotPeriod
            }

            /**
             * The sub-type for this assessment. The sub-type provides an additional level of
             * specification when the assessment level = SIGNATURE, and will vary based on the
             * overall assessment. If assessment = ANOMALOUS, then expected values include ACTIVITY
             * OBSERVED, BAD CONFIGURATION, MANEUVERING, OTHER, POSSIBLE SAFE MODE, UNSTABLE, and
             * WRONG ATTITUDE. If assessment = BAD, then expected values include BAD-MISSING STATE
             * VECTOR, CORRUPT-NOISY, CROSS-TAG, DROPOUTS, INSUFFICIENT DATA, INSUFFICIENT LOOK
             * ANGLE, NO CROSSOVER, and SHORT. If assessment = NOMINAL, then expected values include
             * ACTIVITY OBSERVED, GRAVITY GRADIENT, HORIZON STABLE, INERTIAL, MANEUVERING, SPIN
             * STABLE, and STABLE. If assessment = UNKNOWN, then expected values include NO COHORT,
             * and OTHER.
             */
            fun assmtSubType(assmtSubType: String) = assmtSubType(JsonField.of(assmtSubType))

            /**
             * Sets [Builder.assmtSubType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assmtSubType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assmtSubType(assmtSubType: JsonField<String>) = apply {
                this.assmtSubType = assmtSubType
            }

            /** URL to an external location containing additional assessment information. */
            fun assmtUrl(assmtUrl: String) = assmtUrl(JsonField.of(assmtUrl))

            /**
             * Sets [Builder.assmtUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assmtUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assmtUrl(assmtUrl: JsonField<String>) = apply { this.assmtUrl = assmtUrl }

            /**
             * Flag indicating whether this assessment was auto-generated (true) or produced by an
             * analyst.
             */
            fun autoAssmt(autoAssmt: Boolean) = autoAssmt(JsonField.of(autoAssmt))

            /**
             * Sets [Builder.autoAssmt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoAssmt] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoAssmt(autoAssmt: JsonField<Boolean>) = apply { this.autoAssmt = autoAssmt }

            /**
             * URL to an external location containing the data that was used to make this
             * assessment.
             */
            fun collectionUrl(collectionUrl: String) = collectionUrl(JsonField.of(collectionUrl))

            /**
             * Sets [Builder.collectionUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun collectionUrl(collectionUrl: JsonField<String>) = apply {
                this.collectionUrl = collectionUrl
            }

            /**
             * Array of the affected spacecraft component(s) relevant to this assessment, if
             * non-nominal.
             */
            fun components(components: List<String>) = components(JsonField.of(components))

            /**
             * Sets [Builder.components] to an arbitrary JSON value.
             *
             * You should usually call [Builder.components] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun components(components: JsonField<List<String>>) = apply {
                this.components = components.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [components].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addComponent(component: String) = apply {
                components =
                    (components ?: JsonField.of(mutableListOf())).also {
                        checkKnown("components", it).add(component)
                    }
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

            /**
             * Unique identifier of the target satellite on-orbit object to which this assessment
             * applies. This ID can be used to obtain additional information on an OnOrbit object
             * using the 'get by ID' operation (e.g. /udl/onorbit/{id}). For example, the OnOrbit
             * with idOnOrbit = 25544 would be queried as /udl/onorbit/25544.
             */
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
             * Unique identifier of the sensor from which the signature data applied in this
             * assessment was collected. This ID can be used to obtain additional information on a
             * sensor using the 'get by ID' operation (e.g. /udl/sensor/{id}). For example, the
             * sensor with idSensor = abc would be queried as /udl/sensor/abc.
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
             * The total duration, in hours, of the signature or set of signatures used to create
             * this assessment.
             */
            fun obDuration(obDuration: Double) = obDuration(JsonField.of(obDuration))

            /**
             * Sets [Builder.obDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obDuration] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obDuration(obDuration: JsonField<Double>) = apply { this.obDuration = obDuration }

            /**
             * The observation time, in ISO 8601 UTC format with millisecond precision. For
             * non-instantaneous collections, the observation time will correspond to the earliest
             * timestamp in the signature or signature set data.
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
             * Optional identifier provided by the source to indicate the target on-orbit object to
             * which this assessment applies. This may be an internal identifier and not necessarily
             * map to a valid satellite number.
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
             * Optional identifier provided by the observation source to indicate the sensor which
             * produced this observation. This may be an internal identifier and not necessarily a
             * valid sensor ID.
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
             * Satellite/Catalog number of the target on-orbit object to which this assessment
             * applies.
             */
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
             * The observation data type (LONG DWELL, NARROWBAND, PHOTOMETRIC POL, PHOTOMETRY, RANGE
             * PROFILER, WIDEBAND, etc.) contained in the signature. Applies when assmtLevel =
             * SIGNATURE.
             */
            fun sigDataType(sigDataType: String) = sigDataType(JsonField.of(sigDataType))

            /**
             * Sets [Builder.sigDataType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sigDataType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sigDataType(sigDataType: JsonField<String>) = apply {
                this.sigDataType = sigDataType
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
             * Array of UUIDs of the UDL data records that are related to this assessment. See the
             * associated 'srcTyps' array for the specific types of data, positionally corresponding
             * to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See
             * the corresponding srcTyps array element for the data type of the UUID and use the
             * appropriate API operation to retrieve that object.
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
             * Array of UDL record types (DOA, ELSET, EO, ESID, GROUNDIMAGE, POI, MANEUVER, MTI,
             * RADAR, RF, SIGACT, SKYIMAGE, SV, TRACK, etc.) that are related to this assessment.
             * See the associated 'srcIds' array for the record UUIDs, positionally corresponding to
             * the record types in this array. The 'srcTyps' and 'srcIds' arrays must match in size.
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
             * .assmtTime()
             * .classificationMarking()
             * .dataMode()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("assmtTime", assmtTime),
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    id,
                    assessment,
                    assmtDetails,
                    assmtLevel,
                    assmtRotPeriod,
                    assmtSubType,
                    assmtUrl,
                    autoAssmt,
                    collectionUrl,
                    (components ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    createdBy,
                    idOnOrbit,
                    idSensor,
                    obDuration,
                    obTime,
                    origin,
                    origNetwork,
                    origObjectId,
                    origSensorId,
                    satNo,
                    sigDataType,
                    sourceDl,
                    (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    transactionId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            assmtTime()
            classificationMarking()
            dataMode().validate()
            source()
            id()
            assessment()
            assmtDetails()
            assmtLevel()
            assmtRotPeriod()
            assmtSubType()
            assmtUrl()
            autoAssmt()
            collectionUrl()
            components()
            createdAt()
            createdBy()
            idOnOrbit()
            idSensor()
            obDuration()
            obTime()
            origin()
            origNetwork()
            origObjectId()
            origSensorId()
            satNo()
            sigDataType()
            sourceDl()
            srcIds()
            srcTyps()
            tags()
            transactionId()
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
            (if (assmtTime.asKnown().isPresent) 1 else 0) +
                (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (assessment.asKnown().isPresent) 1 else 0) +
                (if (assmtDetails.asKnown().isPresent) 1 else 0) +
                (if (assmtLevel.asKnown().isPresent) 1 else 0) +
                (if (assmtRotPeriod.asKnown().isPresent) 1 else 0) +
                (if (assmtSubType.asKnown().isPresent) 1 else 0) +
                (if (assmtUrl.asKnown().isPresent) 1 else 0) +
                (if (autoAssmt.asKnown().isPresent) 1 else 0) +
                (if (collectionUrl.asKnown().isPresent) 1 else 0) +
                (components.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (obDuration.asKnown().isPresent) 1 else 0) +
                (if (obTime.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (if (sigDataType.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (srcIds.asKnown().getOrNull()?.size ?: 0) +
                (srcTyps.asKnown().getOrNull()?.size ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0)

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
                assmtTime == other.assmtTime &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                id == other.id &&
                assessment == other.assessment &&
                assmtDetails == other.assmtDetails &&
                assmtLevel == other.assmtLevel &&
                assmtRotPeriod == other.assmtRotPeriod &&
                assmtSubType == other.assmtSubType &&
                assmtUrl == other.assmtUrl &&
                autoAssmt == other.autoAssmt &&
                collectionUrl == other.collectionUrl &&
                components == other.components &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                idOnOrbit == other.idOnOrbit &&
                idSensor == other.idSensor &&
                obDuration == other.obDuration &&
                obTime == other.obTime &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                origSensorId == other.origSensorId &&
                satNo == other.satNo &&
                sigDataType == other.sigDataType &&
                sourceDl == other.sourceDl &&
                srcIds == other.srcIds &&
                srcTyps == other.srcTyps &&
                tags == other.tags &&
                transactionId == other.transactionId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                assmtTime,
                classificationMarking,
                dataMode,
                source,
                id,
                assessment,
                assmtDetails,
                assmtLevel,
                assmtRotPeriod,
                assmtSubType,
                assmtUrl,
                autoAssmt,
                collectionUrl,
                components,
                createdAt,
                createdBy,
                idOnOrbit,
                idSensor,
                obDuration,
                obTime,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                satNo,
                sigDataType,
                sourceDl,
                srcIds,
                srcTyps,
                tags,
                transactionId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{assmtTime=$assmtTime, classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, assessment=$assessment, assmtDetails=$assmtDetails, assmtLevel=$assmtLevel, assmtRotPeriod=$assmtRotPeriod, assmtSubType=$assmtSubType, assmtUrl=$assmtUrl, autoAssmt=$autoAssmt, collectionUrl=$collectionUrl, components=$components, createdAt=$createdAt, createdBy=$createdBy, idOnOrbit=$idOnOrbit, idSensor=$idSensor, obDuration=$obDuration, obTime=$obTime, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, satNo=$satNo, sigDataType=$sigDataType, sourceDl=$sourceDl, srcIds=$srcIds, srcTyps=$srcTyps, tags=$tags, transactionId=$transactionId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnorbitassessmentCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OnorbitassessmentCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

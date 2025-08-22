// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.navigationalobstruction

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation intended for initial integration only, to take a list of navigational
 * obstruction records as a POST body and ingest into the database. This operation is not intended
 * to be used for automated feeds into UDL. Data providers should contact the UDL team for specific
 * role assignments and for instructions on setting up a permanent feed through an alternate
 * mechanism.
 */
class NavigationalObstructionCreateBulkParams
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
         * [NavigationalObstructionCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NavigationalObstructionCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            navigationalObstructionCreateBulkParams: NavigationalObstructionCreateBulkParams
        ) = apply {
            body = navigationalObstructionCreateBulkParams.body.toMutableList()
            additionalHeaders =
                navigationalObstructionCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                navigationalObstructionCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [NavigationalObstructionCreateBulkParams].
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
        fun build(): NavigationalObstructionCreateBulkParams =
            NavigationalObstructionCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Beta Version Navigational Obstruction: Information describing navigational obstructions, such
     * as applicable boundaries, locations, heights, data ownership, and currency.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("cycleDate") @ExcludeMissing private val cycleDate: JsonField<LocalDate>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("obstacleId") @ExcludeMissing private val obstacleId: JsonField<String>,
        @JsonProperty("obstacleType") @ExcludeMissing private val obstacleType: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("actDelCode") @ExcludeMissing private val actDelCode: JsonField<String>,
        @JsonProperty("airacCycle") @ExcludeMissing private val airacCycle: JsonField<Int>,
        @JsonProperty("baseAiracCycle") @ExcludeMissing private val baseAiracCycle: JsonField<Int>,
        @JsonProperty("baselineCutoffDate")
        @ExcludeMissing
        private val baselineCutoffDate: JsonField<LocalDate>,
        @JsonProperty("boundNELat") @ExcludeMissing private val boundNeLat: JsonField<Double>,
        @JsonProperty("boundNELon") @ExcludeMissing private val boundNeLon: JsonField<Double>,
        @JsonProperty("boundSWLat") @ExcludeMissing private val boundSwLat: JsonField<Double>,
        @JsonProperty("boundSWLon") @ExcludeMissing private val boundSwLon: JsonField<Double>,
        @JsonProperty("countryCode") @ExcludeMissing private val countryCode: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("cutoffDate") @ExcludeMissing private val cutoffDate: JsonField<LocalDate>,
        @JsonProperty("dataSetRemarks")
        @ExcludeMissing
        private val dataSetRemarks: JsonField<String>,
        @JsonProperty("deletingOrg") @ExcludeMissing private val deletingOrg: JsonField<String>,
        @JsonProperty("derivingOrg") @ExcludeMissing private val derivingOrg: JsonField<String>,
        @JsonProperty("directivityCode")
        @ExcludeMissing
        private val directivityCode: JsonField<Int>,
        @JsonProperty("elevation") @ExcludeMissing private val elevation: JsonField<Double>,
        @JsonProperty("elevationAcc") @ExcludeMissing private val elevationAcc: JsonField<Double>,
        @JsonProperty("externalId") @ExcludeMissing private val externalId: JsonField<String>,
        @JsonProperty("facc") @ExcludeMissing private val facc: JsonField<String>,
        @JsonProperty("featureCode") @ExcludeMissing private val featureCode: JsonField<String>,
        @JsonProperty("featureDescription")
        @ExcludeMissing
        private val featureDescription: JsonField<String>,
        @JsonProperty("featureName") @ExcludeMissing private val featureName: JsonField<String>,
        @JsonProperty("featureType") @ExcludeMissing private val featureType: JsonField<String>,
        @JsonProperty("heightAGL") @ExcludeMissing private val heightAgl: JsonField<Double>,
        @JsonProperty("heightAGLAcc") @ExcludeMissing private val heightAglAcc: JsonField<Double>,
        @JsonProperty("heightMSL") @ExcludeMissing private val heightMsl: JsonField<Double>,
        @JsonProperty("heightMSLAcc") @ExcludeMissing private val heightMslAcc: JsonField<Double>,
        @JsonProperty("horizAcc") @ExcludeMissing private val horizAcc: JsonField<Double>,
        @JsonProperty("horizDatumCode")
        @ExcludeMissing
        private val horizDatumCode: JsonField<String>,
        @JsonProperty("initRecordDate")
        @ExcludeMissing
        private val initRecordDate: JsonField<LocalDate>,
        @JsonProperty("keys") @ExcludeMissing private val keys: JsonField<List<String>>,
        @JsonProperty("lightingCode") @ExcludeMissing private val lightingCode: JsonField<String>,
        @JsonProperty("lineNELat") @ExcludeMissing private val lineNeLat: JsonField<Double>,
        @JsonProperty("lineNELon") @ExcludeMissing private val lineNeLon: JsonField<Double>,
        @JsonProperty("linesFilename") @ExcludeMissing private val linesFilename: JsonField<String>,
        @JsonProperty("lineSWLat") @ExcludeMissing private val lineSwLat: JsonField<Double>,
        @JsonProperty("lineSWLon") @ExcludeMissing private val lineSwLon: JsonField<Double>,
        @JsonProperty("minHeightAGL") @ExcludeMissing private val minHeightAgl: JsonField<Double>,
        @JsonProperty("multObs") @ExcludeMissing private val multObs: JsonField<String>,
        @JsonProperty("nextCycleDate")
        @ExcludeMissing
        private val nextCycleDate: JsonField<LocalDate>,
        @JsonProperty("numLines") @ExcludeMissing private val numLines: JsonField<Int>,
        @JsonProperty("numObs") @ExcludeMissing private val numObs: JsonField<Int>,
        @JsonProperty("numPoints") @ExcludeMissing private val numPoints: JsonField<Int>,
        @JsonProperty("obstacleRemarks")
        @ExcludeMissing
        private val obstacleRemarks: JsonField<String>,
        @JsonProperty("origId") @ExcludeMissing private val origId: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("ownerCountryCode")
        @ExcludeMissing
        private val ownerCountryCode: JsonField<String>,
        @JsonProperty("pointLat") @ExcludeMissing private val pointLat: JsonField<Double>,
        @JsonProperty("pointLon") @ExcludeMissing private val pointLon: JsonField<Double>,
        @JsonProperty("pointsFilename")
        @ExcludeMissing
        private val pointsFilename: JsonField<String>,
        @JsonProperty("processCode") @ExcludeMissing private val processCode: JsonField<String>,
        @JsonProperty("producer") @ExcludeMissing private val producer: JsonField<String>,
        @JsonProperty("provinceCode") @ExcludeMissing private val provinceCode: JsonField<String>,
        @JsonProperty("quality") @ExcludeMissing private val quality: JsonField<String>,
        @JsonProperty("rawFileURI") @ExcludeMissing private val rawFileUri: JsonField<String>,
        @JsonProperty("revDate") @ExcludeMissing private val revDate: JsonField<LocalDate>,
        @JsonProperty("segEndPoint") @ExcludeMissing private val segEndPoint: JsonField<Int>,
        @JsonProperty("segNum") @ExcludeMissing private val segNum: JsonField<Int>,
        @JsonProperty("segStartPoint") @ExcludeMissing private val segStartPoint: JsonField<Int>,
        @JsonProperty("sourceDate") @ExcludeMissing private val sourceDate: JsonField<LocalDate>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("surfaceMatCode")
        @ExcludeMissing
        private val surfaceMatCode: JsonField<String>,
        @JsonProperty("transactionCode")
        @ExcludeMissing
        private val transactionCode: JsonField<String>,
        @JsonProperty("validationCode") @ExcludeMissing private val validationCode: JsonField<Int>,
        @JsonProperty("values") @ExcludeMissing private val values: JsonField<List<String>>,
        @JsonProperty("vectorsFilename")
        @ExcludeMissing
        private val vectorsFilename: JsonField<String>,
        @JsonProperty("wac") @ExcludeMissing private val wac: JsonField<String>,
        @JsonProperty("wacINNR") @ExcludeMissing private val wacInnr: JsonField<String>,
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
         * Start date of this obstruction data set's currency, in ISO 8601 date-only format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun cycleDate(): LocalDate = cycleDate.getRequired("cycleDate")

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
         * The ID of this obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obstacleId(): String = obstacleId.getRequired("obstacleId")

        /**
         * Type of obstacle (e.g. P for point, V for vector, L for line).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun obstacleType(): String = obstacleType.getRequired("obstacleType")

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
         * Indicates if this obstacle record is Active (A) or Deleted (D).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actDelCode(): Optional<String> = actDelCode.getOptional("actDelCode")

        /**
         * The Aeronautical Information Regulation and Control (AIRAC) cycle of this obstruction
         * data set. The format is YYNN where YY is the last two digits of the year and NN is the
         * cycle number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun airacCycle(): Optional<Int> = airacCycle.getOptional("airacCycle")

        /**
         * The baseline Aeronautical Information Regulation and Control (AIRAC) cycle for change
         * sets only. The format is YYNN where YY is the last two digits of the year and NN is the
         * cycle number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun baseAiracCycle(): Optional<Int> = baseAiracCycle.getOptional("baseAiracCycle")

        /**
         * Earliest record date possible in this obstruction data set (not the earliest data item),
         * in ISO 8601 date-only format (e.g. YYYY-MM-DD). If null, this data set is assumed to be a
         * full data pull of holdings until the cutoffDate. If this field is populated, this data
         * set only contains updates since the last baseline data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun baselineCutoffDate(): Optional<LocalDate> =
            baselineCutoffDate.getOptional("baselineCutoffDate")

        /**
         * WGS-84 latitude of the northeastern boundary for obstructions contained in this data set,
         * in degrees. -90 to 90 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun boundNeLat(): Optional<Double> = boundNeLat.getOptional("boundNELat")

        /**
         * WGS-84 longitude of the northeastern boundary for obstructions contained in this data
         * set, in degrees. -180 to 180 degrees (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun boundNeLon(): Optional<Double> = boundNeLon.getOptional("boundNELon")

        /**
         * WGS-84 latitude of the southwestern boundary for obstructions contained in this data set,
         * in degrees. -90 to 90 degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun boundSwLat(): Optional<Double> = boundSwLat.getOptional("boundSWLat")

        /**
         * WGS-84 longitude of the southwestern boundary for obstructions contained in this data
         * set, in degrees. -180 to 180 degrees (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun boundSwLon(): Optional<Double> = boundSwLon.getOptional("boundSWLon")

        /**
         * The DoD Standard Country Code designator for the country issuing the diplomatic
         * clearance. This field will be set to "OTHR" if the source value does not match a UDL
         * Country code value (ISO-3166-ALPHA-2).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

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
         * Latest record date possible in this obstruction data set (not the most recent data item),
         * in ISO 8601 date-only format (e.g. YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cutoffDate(): Optional<LocalDate> = cutoffDate.getOptional("cutoffDate")

        /**
         * Remarks concerning this obstruction's data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dataSetRemarks(): Optional<String> = dataSetRemarks.getOptional("dataSetRemarks")

        /**
         * The organization that deleted this obstacle record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deletingOrg(): Optional<String> = deletingOrg.getOptional("deletingOrg")

        /**
         * The organization that entered obstacle data other than the producer.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun derivingOrg(): Optional<String> = derivingOrg.getOptional("derivingOrg")

        /**
         * The side or sides of this obstruction feature which produces the greatest reflectivity
         * potential.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun directivityCode(): Optional<Int> = directivityCode.getOptional("directivityCode")

        /**
         * The elevation at the point obstacle's location in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevation(): Optional<Double> = elevation.getOptional("elevation")

        /**
         * The difference between the assigned elevation of this point and its true elevation, in
         * feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevationAcc(): Optional<Double> = elevationAcc.getOptional("elevationAcc")

        /**
         * Optional obstacle ID from external systems. This field has no meaning within UDL and is
         * provided as a convenience for systems that require tracking of an internal system
         * generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("externalId")

        /**
         * FACC (Feature and Attribute Coding Catalog) is a five-character code for encoding
         * real-world entities and objects. The first letter of the code is an alphabetic value from
         * "A" to "Z" which will map to a feature category. The second character will map to a
         * subcategory. Characters three to five are numeric and range from 000 to 999. This value
         * will provide a unit feature type identification within the categories.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun facc(): Optional<String> = facc.getOptional("facc")

        /**
         * Identifying code for the type of this point obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun featureCode(): Optional<String> = featureCode.getOptional("featureCode")

        /**
         * Description of this obstacle, corresponding to the FACC (Feature and Attribute Coding
         * Catalog) value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun featureDescription(): Optional<String> =
            featureDescription.getOptional("featureDescription")

        /**
         * Type name of point obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun featureName(): Optional<String> = featureName.getOptional("featureName")

        /**
         * Identifying code for the type of this point obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun featureType(): Optional<String> = featureType.getOptional("featureType")

        /**
         * The height Above Ground Level (AGL) of the point obstacle in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun heightAgl(): Optional<Double> = heightAgl.getOptional("heightAGL")

        /**
         * The accuracy of the height Above Ground Level (AGL) value for this point obstacle, in
         * feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun heightAglAcc(): Optional<Double> = heightAglAcc.getOptional("heightAGLAcc")

        /**
         * The height Above Mean Sea Level (AMSL) of the point obstacle in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun heightMsl(): Optional<Double> = heightMsl.getOptional("heightMSL")

        /**
         * The accuracy of the height Above Mean Sea Level (AMSL) value for this point obstacle in
         * feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun heightMslAcc(): Optional<Double> = heightMslAcc.getOptional("heightMSLAcc")

        /**
         * The difference between the recorded horizontal coordinates of this point obstacle and its
         * true position, in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun horizAcc(): Optional<Double> = horizAcc.getOptional("horizAcc")

        /**
         * Code representing the mathematical model of Earth used to calculate coordinates for this
         * obstacle (e.g. WGS-84, U for undetermined, etc.). US Forces use the World Geodetic System
         * 1984 (WGS-84), but also use maps by allied countries with local datums.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun horizDatumCode(): Optional<String> = horizDatumCode.getOptional("horizDatumCode")

        /**
         * Date this obstacle was initially added to the data set, in ISO 8601 date-only format (ex.
         * YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun initRecordDate(): Optional<LocalDate> = initRecordDate.getOptional("initRecordDate")

        /**
         * This field provides an array of keys that can be added to any obstruction feature to
         * provide information that is not already supported. The entries in this array must
         * correspond to the position index in the values array. This array must be the same length
         * as values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun keys(): Optional<List<String>> = keys.getOptional("keys")

        /**
         * Code specifying if this obstacle is lit (e.g. Y = Yes, N = No, U = Unknown).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lightingCode(): Optional<String> = lightingCode.getOptional("lightingCode")

        /**
         * WGS-84 latitude of the northeastern point of the line, in degrees. -90 to 90 degrees
         * (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lineNeLat(): Optional<Double> = lineNeLat.getOptional("lineNELat")

        /**
         * WGS-84 longitude of the northeastern point of the line, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lineNeLon(): Optional<Double> = lineNeLon.getOptional("lineNELon")

        /**
         * The name of the line file associated with this obstruction data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linesFilename(): Optional<String> = linesFilename.getOptional("linesFilename")

        /**
         * WGS-84 latitude of the southwestern point of the line, in degrees. -90 to 90 degrees
         * (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lineSwLat(): Optional<Double> = lineSwLat.getOptional("lineSWLat")

        /**
         * WGS-84 longitude of the southwestern point of the line, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lineSwLon(): Optional<Double> = lineSwLon.getOptional("lineSWLon")

        /**
         * The minimum height Above Ground Level (AGL) of the shortest obstruction contained in this
         * data set, in feet.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun minHeightAgl(): Optional<Double> = minHeightAgl.getOptional("minHeightAGL")

        /**
         * Indicates if the feature has multiple obstructions (e.g. S = Single, M = Multiple, U =
         * Undetermined).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun multObs(): Optional<String> = multObs.getOptional("multObs")

        /**
         * The date after which this obstruction data set’s currency is stale and should be
         * refreshed, in ISO 8601 date-only format (e.g. YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nextCycleDate(): Optional<LocalDate> = nextCycleDate.getOptional("nextCycleDate")

        /**
         * The number of line features associated with this obstruction data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numLines(): Optional<Int> = numLines.getOptional("numLines")

        /**
         * Indicates the number of obstructions associated with a feature.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numObs(): Optional<Int> = numObs.getOptional("numObs")

        /**
         * The number of point features associated with this obstruction data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numPoints(): Optional<Int> = numPoints.getOptional("numPoints")

        /**
         * Remarks regarding this obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun obstacleRemarks(): Optional<String> = obstacleRemarks.getOptional("obstacleRemarks")

        /**
         * The original ID for this obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origId(): Optional<String> = origId.getOptional("origId")

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
         * The DoD Standard Country Code designator for the country or political entity that owns
         * the data set associated with this obstruction. This field will be set to "OTHR" if the
         * source value does not match a UDL Country code value (ISO-3166-ALPHA-2).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ownerCountryCode(): Optional<String> = ownerCountryCode.getOptional("ownerCountryCode")

        /**
         * WGS-84 latitude of this point obstacle, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointLat(): Optional<Double> = pointLat.getOptional("pointLat")

        /**
         * WGS-84 longitude of this point obstacle, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointLon(): Optional<Double> = pointLon.getOptional("pointLon")

        /**
         * The name of the point file associated with this obstruction data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pointsFilename(): Optional<String> = pointsFilename.getOptional("pointsFilename")

        /**
         * Code denoting the action, review, or process that updated this obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun processCode(): Optional<String> = processCode.getOptional("processCode")

        /**
         * Name of the agency that produced this obstruction data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun producer(): Optional<String> = producer.getOptional("producer")

        /**
         * The Federal Information Processing Standards (FIPS) state/province numeric code of this
         * obstacle's location.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun provinceCode(): Optional<String> = provinceCode.getOptional("provinceCode")

        /**
         * When horizontal and/or vertical accuracy requirements cannot be met because of inadequate
         * source material, this code indicates the quality of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun quality(): Optional<String> = quality.getOptional("quality")

        /**
         * Optional URI location in the document repository of the raw file parsed by the system to
         * produce this record. To download the raw file, prepend
         * https://udl-hostname/scs/download?id= to this value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

        /**
         * Date this obstacle data was revised, in ISO 8601 date-only format (ex. YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun revDate(): Optional<LocalDate> = revDate.getOptional("revDate")

        /**
         * ID of the end point of a line segment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun segEndPoint(): Optional<Int> = segEndPoint.getOptional("segEndPoint")

        /**
         * Identifies the sequence number of a line segment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun segNum(): Optional<Int> = segNum.getOptional("segNum")

        /**
         * ID of the starting point of a line segment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun segStartPoint(): Optional<Int> = segStartPoint.getOptional("segStartPoint")

        /**
         * Source date of this obstacle data, in ISO 8601 date-only format (ex. YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourceDate(): Optional<LocalDate> = sourceDate.getOptional("sourceDate")

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
         * The surface material composition code of this point obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun surfaceMatCode(): Optional<String> = surfaceMatCode.getOptional("surfaceMatCode")

        /**
         * The transaction type/code for this obstacle (e.g. "D", "N", "R", "S", "V", "X").
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactionCode(): Optional<String> = transactionCode.getOptional("transactionCode")

        /**
         * Method used to confirm the existence of this obstacle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun validationCode(): Optional<Int> = validationCode.getOptional("validationCode")

        /**
         * This field provides an array of values that can be added to any obstruction feature to
         * provide information that is not already supported. The entries in this array must
         * correspond to the position index in the keys array. This array must be the same length as
         * keys.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun values(): Optional<List<String>> = values.getOptional("values")

        /**
         * The name of the vector file associated with this obstruction data set.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vectorsFilename(): Optional<String> = vectorsFilename.getOptional("vectorsFilename")

        /**
         * The World Aeronautical Chart (WAC) identifier for the area in which this obstacle is
         * located.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun wac(): Optional<String> = wac.getOptional("wac")

        /**
         * This obstacle's World Area Code installation number (WAC-INNR).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun wacInnr(): Optional<String> = wacInnr.getOptional("wacINNR")

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
         * Returns the raw JSON value of [cycleDate].
         *
         * Unlike [cycleDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cycleDate")
        @ExcludeMissing
        fun _cycleDate(): JsonField<LocalDate> = cycleDate

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [obstacleId].
         *
         * Unlike [obstacleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obstacleId")
        @ExcludeMissing
        fun _obstacleId(): JsonField<String> = obstacleId

        /**
         * Returns the raw JSON value of [obstacleType].
         *
         * Unlike [obstacleType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("obstacleType")
        @ExcludeMissing
        fun _obstacleType(): JsonField<String> = obstacleType

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
         * Returns the raw JSON value of [actDelCode].
         *
         * Unlike [actDelCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("actDelCode")
        @ExcludeMissing
        fun _actDelCode(): JsonField<String> = actDelCode

        /**
         * Returns the raw JSON value of [airacCycle].
         *
         * Unlike [airacCycle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("airacCycle") @ExcludeMissing fun _airacCycle(): JsonField<Int> = airacCycle

        /**
         * Returns the raw JSON value of [baseAiracCycle].
         *
         * Unlike [baseAiracCycle], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("baseAiracCycle")
        @ExcludeMissing
        fun _baseAiracCycle(): JsonField<Int> = baseAiracCycle

        /**
         * Returns the raw JSON value of [baselineCutoffDate].
         *
         * Unlike [baselineCutoffDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("baselineCutoffDate")
        @ExcludeMissing
        fun _baselineCutoffDate(): JsonField<LocalDate> = baselineCutoffDate

        /**
         * Returns the raw JSON value of [boundNeLat].
         *
         * Unlike [boundNeLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boundNELat")
        @ExcludeMissing
        fun _boundNeLat(): JsonField<Double> = boundNeLat

        /**
         * Returns the raw JSON value of [boundNeLon].
         *
         * Unlike [boundNeLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boundNELon")
        @ExcludeMissing
        fun _boundNeLon(): JsonField<Double> = boundNeLon

        /**
         * Returns the raw JSON value of [boundSwLat].
         *
         * Unlike [boundSwLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boundSWLat")
        @ExcludeMissing
        fun _boundSwLat(): JsonField<Double> = boundSwLat

        /**
         * Returns the raw JSON value of [boundSwLon].
         *
         * Unlike [boundSwLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("boundSWLon")
        @ExcludeMissing
        fun _boundSwLon(): JsonField<Double> = boundSwLon

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

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
         * Returns the raw JSON value of [cutoffDate].
         *
         * Unlike [cutoffDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cutoffDate")
        @ExcludeMissing
        fun _cutoffDate(): JsonField<LocalDate> = cutoffDate

        /**
         * Returns the raw JSON value of [dataSetRemarks].
         *
         * Unlike [dataSetRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dataSetRemarks")
        @ExcludeMissing
        fun _dataSetRemarks(): JsonField<String> = dataSetRemarks

        /**
         * Returns the raw JSON value of [deletingOrg].
         *
         * Unlike [deletingOrg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deletingOrg")
        @ExcludeMissing
        fun _deletingOrg(): JsonField<String> = deletingOrg

        /**
         * Returns the raw JSON value of [derivingOrg].
         *
         * Unlike [derivingOrg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("derivingOrg")
        @ExcludeMissing
        fun _derivingOrg(): JsonField<String> = derivingOrg

        /**
         * Returns the raw JSON value of [directivityCode].
         *
         * Unlike [directivityCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("directivityCode")
        @ExcludeMissing
        fun _directivityCode(): JsonField<Int> = directivityCode

        /**
         * Returns the raw JSON value of [elevation].
         *
         * Unlike [elevation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elevation") @ExcludeMissing fun _elevation(): JsonField<Double> = elevation

        /**
         * Returns the raw JSON value of [elevationAcc].
         *
         * Unlike [elevationAcc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("elevationAcc")
        @ExcludeMissing
        fun _elevationAcc(): JsonField<Double> = elevationAcc

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("externalId")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [facc].
         *
         * Unlike [facc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("facc") @ExcludeMissing fun _facc(): JsonField<String> = facc

        /**
         * Returns the raw JSON value of [featureCode].
         *
         * Unlike [featureCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureCode")
        @ExcludeMissing
        fun _featureCode(): JsonField<String> = featureCode

        /**
         * Returns the raw JSON value of [featureDescription].
         *
         * Unlike [featureDescription], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("featureDescription")
        @ExcludeMissing
        fun _featureDescription(): JsonField<String> = featureDescription

        /**
         * Returns the raw JSON value of [featureName].
         *
         * Unlike [featureName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureName")
        @ExcludeMissing
        fun _featureName(): JsonField<String> = featureName

        /**
         * Returns the raw JSON value of [featureType].
         *
         * Unlike [featureType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("featureType")
        @ExcludeMissing
        fun _featureType(): JsonField<String> = featureType

        /**
         * Returns the raw JSON value of [heightAgl].
         *
         * Unlike [heightAgl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("heightAGL") @ExcludeMissing fun _heightAgl(): JsonField<Double> = heightAgl

        /**
         * Returns the raw JSON value of [heightAglAcc].
         *
         * Unlike [heightAglAcc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("heightAGLAcc")
        @ExcludeMissing
        fun _heightAglAcc(): JsonField<Double> = heightAglAcc

        /**
         * Returns the raw JSON value of [heightMsl].
         *
         * Unlike [heightMsl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("heightMSL") @ExcludeMissing fun _heightMsl(): JsonField<Double> = heightMsl

        /**
         * Returns the raw JSON value of [heightMslAcc].
         *
         * Unlike [heightMslAcc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("heightMSLAcc")
        @ExcludeMissing
        fun _heightMslAcc(): JsonField<Double> = heightMslAcc

        /**
         * Returns the raw JSON value of [horizAcc].
         *
         * Unlike [horizAcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("horizAcc") @ExcludeMissing fun _horizAcc(): JsonField<Double> = horizAcc

        /**
         * Returns the raw JSON value of [horizDatumCode].
         *
         * Unlike [horizDatumCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("horizDatumCode")
        @ExcludeMissing
        fun _horizDatumCode(): JsonField<String> = horizDatumCode

        /**
         * Returns the raw JSON value of [initRecordDate].
         *
         * Unlike [initRecordDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initRecordDate")
        @ExcludeMissing
        fun _initRecordDate(): JsonField<LocalDate> = initRecordDate

        /**
         * Returns the raw JSON value of [keys].
         *
         * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<String>> = keys

        /**
         * Returns the raw JSON value of [lightingCode].
         *
         * Unlike [lightingCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lightingCode")
        @ExcludeMissing
        fun _lightingCode(): JsonField<String> = lightingCode

        /**
         * Returns the raw JSON value of [lineNeLat].
         *
         * Unlike [lineNeLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lineNELat") @ExcludeMissing fun _lineNeLat(): JsonField<Double> = lineNeLat

        /**
         * Returns the raw JSON value of [lineNeLon].
         *
         * Unlike [lineNeLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lineNELon") @ExcludeMissing fun _lineNeLon(): JsonField<Double> = lineNeLon

        /**
         * Returns the raw JSON value of [linesFilename].
         *
         * Unlike [linesFilename], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("linesFilename")
        @ExcludeMissing
        fun _linesFilename(): JsonField<String> = linesFilename

        /**
         * Returns the raw JSON value of [lineSwLat].
         *
         * Unlike [lineSwLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lineSWLat") @ExcludeMissing fun _lineSwLat(): JsonField<Double> = lineSwLat

        /**
         * Returns the raw JSON value of [lineSwLon].
         *
         * Unlike [lineSwLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lineSWLon") @ExcludeMissing fun _lineSwLon(): JsonField<Double> = lineSwLon

        /**
         * Returns the raw JSON value of [minHeightAgl].
         *
         * Unlike [minHeightAgl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minHeightAGL")
        @ExcludeMissing
        fun _minHeightAgl(): JsonField<Double> = minHeightAgl

        /**
         * Returns the raw JSON value of [multObs].
         *
         * Unlike [multObs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("multObs") @ExcludeMissing fun _multObs(): JsonField<String> = multObs

        /**
         * Returns the raw JSON value of [nextCycleDate].
         *
         * Unlike [nextCycleDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nextCycleDate")
        @ExcludeMissing
        fun _nextCycleDate(): JsonField<LocalDate> = nextCycleDate

        /**
         * Returns the raw JSON value of [numLines].
         *
         * Unlike [numLines], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numLines") @ExcludeMissing fun _numLines(): JsonField<Int> = numLines

        /**
         * Returns the raw JSON value of [numObs].
         *
         * Unlike [numObs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numObs") @ExcludeMissing fun _numObs(): JsonField<Int> = numObs

        /**
         * Returns the raw JSON value of [numPoints].
         *
         * Unlike [numPoints], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numPoints") @ExcludeMissing fun _numPoints(): JsonField<Int> = numPoints

        /**
         * Returns the raw JSON value of [obstacleRemarks].
         *
         * Unlike [obstacleRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("obstacleRemarks")
        @ExcludeMissing
        fun _obstacleRemarks(): JsonField<String> = obstacleRemarks

        /**
         * Returns the raw JSON value of [origId].
         *
         * Unlike [origId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origId") @ExcludeMissing fun _origId(): JsonField<String> = origId

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
         * Returns the raw JSON value of [ownerCountryCode].
         *
         * Unlike [ownerCountryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ownerCountryCode")
        @ExcludeMissing
        fun _ownerCountryCode(): JsonField<String> = ownerCountryCode

        /**
         * Returns the raw JSON value of [pointLat].
         *
         * Unlike [pointLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pointLat") @ExcludeMissing fun _pointLat(): JsonField<Double> = pointLat

        /**
         * Returns the raw JSON value of [pointLon].
         *
         * Unlike [pointLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pointLon") @ExcludeMissing fun _pointLon(): JsonField<Double> = pointLon

        /**
         * Returns the raw JSON value of [pointsFilename].
         *
         * Unlike [pointsFilename], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pointsFilename")
        @ExcludeMissing
        fun _pointsFilename(): JsonField<String> = pointsFilename

        /**
         * Returns the raw JSON value of [processCode].
         *
         * Unlike [processCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("processCode")
        @ExcludeMissing
        fun _processCode(): JsonField<String> = processCode

        /**
         * Returns the raw JSON value of [producer].
         *
         * Unlike [producer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("producer") @ExcludeMissing fun _producer(): JsonField<String> = producer

        /**
         * Returns the raw JSON value of [provinceCode].
         *
         * Unlike [provinceCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provinceCode")
        @ExcludeMissing
        fun _provinceCode(): JsonField<String> = provinceCode

        /**
         * Returns the raw JSON value of [quality].
         *
         * Unlike [quality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quality") @ExcludeMissing fun _quality(): JsonField<String> = quality

        /**
         * Returns the raw JSON value of [rawFileUri].
         *
         * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        fun _rawFileUri(): JsonField<String> = rawFileUri

        /**
         * Returns the raw JSON value of [revDate].
         *
         * Unlike [revDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("revDate") @ExcludeMissing fun _revDate(): JsonField<LocalDate> = revDate

        /**
         * Returns the raw JSON value of [segEndPoint].
         *
         * Unlike [segEndPoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segEndPoint")
        @ExcludeMissing
        fun _segEndPoint(): JsonField<Int> = segEndPoint

        /**
         * Returns the raw JSON value of [segNum].
         *
         * Unlike [segNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("segNum") @ExcludeMissing fun _segNum(): JsonField<Int> = segNum

        /**
         * Returns the raw JSON value of [segStartPoint].
         *
         * Unlike [segStartPoint], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("segStartPoint")
        @ExcludeMissing
        fun _segStartPoint(): JsonField<Int> = segStartPoint

        /**
         * Returns the raw JSON value of [sourceDate].
         *
         * Unlike [sourceDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDate")
        @ExcludeMissing
        fun _sourceDate(): JsonField<LocalDate> = sourceDate

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [surfaceMatCode].
         *
         * Unlike [surfaceMatCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("surfaceMatCode")
        @ExcludeMissing
        fun _surfaceMatCode(): JsonField<String> = surfaceMatCode

        /**
         * Returns the raw JSON value of [transactionCode].
         *
         * Unlike [transactionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactionCode")
        @ExcludeMissing
        fun _transactionCode(): JsonField<String> = transactionCode

        /**
         * Returns the raw JSON value of [validationCode].
         *
         * Unlike [validationCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("validationCode")
        @ExcludeMissing
        fun _validationCode(): JsonField<Int> = validationCode

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

        /**
         * Returns the raw JSON value of [vectorsFilename].
         *
         * Unlike [vectorsFilename], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("vectorsFilename")
        @ExcludeMissing
        fun _vectorsFilename(): JsonField<String> = vectorsFilename

        /**
         * Returns the raw JSON value of [wac].
         *
         * Unlike [wac], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wac") @ExcludeMissing fun _wac(): JsonField<String> = wac

        /**
         * Returns the raw JSON value of [wacInnr].
         *
         * Unlike [wacInnr], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wacINNR") @ExcludeMissing fun _wacInnr(): JsonField<String> = wacInnr

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .cycleDate()
             * .dataMode()
             * .obstacleId()
             * .obstacleType()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var cycleDate: JsonField<LocalDate>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var obstacleId: JsonField<String>? = null
            private var obstacleType: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var actDelCode: JsonField<String> = JsonMissing.of()
            private var airacCycle: JsonField<Int> = JsonMissing.of()
            private var baseAiracCycle: JsonField<Int> = JsonMissing.of()
            private var baselineCutoffDate: JsonField<LocalDate> = JsonMissing.of()
            private var boundNeLat: JsonField<Double> = JsonMissing.of()
            private var boundNeLon: JsonField<Double> = JsonMissing.of()
            private var boundSwLat: JsonField<Double> = JsonMissing.of()
            private var boundSwLon: JsonField<Double> = JsonMissing.of()
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var cutoffDate: JsonField<LocalDate> = JsonMissing.of()
            private var dataSetRemarks: JsonField<String> = JsonMissing.of()
            private var deletingOrg: JsonField<String> = JsonMissing.of()
            private var derivingOrg: JsonField<String> = JsonMissing.of()
            private var directivityCode: JsonField<Int> = JsonMissing.of()
            private var elevation: JsonField<Double> = JsonMissing.of()
            private var elevationAcc: JsonField<Double> = JsonMissing.of()
            private var externalId: JsonField<String> = JsonMissing.of()
            private var facc: JsonField<String> = JsonMissing.of()
            private var featureCode: JsonField<String> = JsonMissing.of()
            private var featureDescription: JsonField<String> = JsonMissing.of()
            private var featureName: JsonField<String> = JsonMissing.of()
            private var featureType: JsonField<String> = JsonMissing.of()
            private var heightAgl: JsonField<Double> = JsonMissing.of()
            private var heightAglAcc: JsonField<Double> = JsonMissing.of()
            private var heightMsl: JsonField<Double> = JsonMissing.of()
            private var heightMslAcc: JsonField<Double> = JsonMissing.of()
            private var horizAcc: JsonField<Double> = JsonMissing.of()
            private var horizDatumCode: JsonField<String> = JsonMissing.of()
            private var initRecordDate: JsonField<LocalDate> = JsonMissing.of()
            private var keys: JsonField<MutableList<String>>? = null
            private var lightingCode: JsonField<String> = JsonMissing.of()
            private var lineNeLat: JsonField<Double> = JsonMissing.of()
            private var lineNeLon: JsonField<Double> = JsonMissing.of()
            private var linesFilename: JsonField<String> = JsonMissing.of()
            private var lineSwLat: JsonField<Double> = JsonMissing.of()
            private var lineSwLon: JsonField<Double> = JsonMissing.of()
            private var minHeightAgl: JsonField<Double> = JsonMissing.of()
            private var multObs: JsonField<String> = JsonMissing.of()
            private var nextCycleDate: JsonField<LocalDate> = JsonMissing.of()
            private var numLines: JsonField<Int> = JsonMissing.of()
            private var numObs: JsonField<Int> = JsonMissing.of()
            private var numPoints: JsonField<Int> = JsonMissing.of()
            private var obstacleRemarks: JsonField<String> = JsonMissing.of()
            private var origId: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var ownerCountryCode: JsonField<String> = JsonMissing.of()
            private var pointLat: JsonField<Double> = JsonMissing.of()
            private var pointLon: JsonField<Double> = JsonMissing.of()
            private var pointsFilename: JsonField<String> = JsonMissing.of()
            private var processCode: JsonField<String> = JsonMissing.of()
            private var producer: JsonField<String> = JsonMissing.of()
            private var provinceCode: JsonField<String> = JsonMissing.of()
            private var quality: JsonField<String> = JsonMissing.of()
            private var rawFileUri: JsonField<String> = JsonMissing.of()
            private var revDate: JsonField<LocalDate> = JsonMissing.of()
            private var segEndPoint: JsonField<Int> = JsonMissing.of()
            private var segNum: JsonField<Int> = JsonMissing.of()
            private var segStartPoint: JsonField<Int> = JsonMissing.of()
            private var sourceDate: JsonField<LocalDate> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var surfaceMatCode: JsonField<String> = JsonMissing.of()
            private var transactionCode: JsonField<String> = JsonMissing.of()
            private var validationCode: JsonField<Int> = JsonMissing.of()
            private var values: JsonField<MutableList<String>>? = null
            private var vectorsFilename: JsonField<String> = JsonMissing.of()
            private var wac: JsonField<String> = JsonMissing.of()
            private var wacInnr: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                cycleDate = body.cycleDate
                dataMode = body.dataMode
                obstacleId = body.obstacleId
                obstacleType = body.obstacleType
                source = body.source
                id = body.id
                actDelCode = body.actDelCode
                airacCycle = body.airacCycle
                baseAiracCycle = body.baseAiracCycle
                baselineCutoffDate = body.baselineCutoffDate
                boundNeLat = body.boundNeLat
                boundNeLon = body.boundNeLon
                boundSwLat = body.boundSwLat
                boundSwLon = body.boundSwLon
                countryCode = body.countryCode
                createdAt = body.createdAt
                createdBy = body.createdBy
                cutoffDate = body.cutoffDate
                dataSetRemarks = body.dataSetRemarks
                deletingOrg = body.deletingOrg
                derivingOrg = body.derivingOrg
                directivityCode = body.directivityCode
                elevation = body.elevation
                elevationAcc = body.elevationAcc
                externalId = body.externalId
                facc = body.facc
                featureCode = body.featureCode
                featureDescription = body.featureDescription
                featureName = body.featureName
                featureType = body.featureType
                heightAgl = body.heightAgl
                heightAglAcc = body.heightAglAcc
                heightMsl = body.heightMsl
                heightMslAcc = body.heightMslAcc
                horizAcc = body.horizAcc
                horizDatumCode = body.horizDatumCode
                initRecordDate = body.initRecordDate
                keys = body.keys.map { it.toMutableList() }
                lightingCode = body.lightingCode
                lineNeLat = body.lineNeLat
                lineNeLon = body.lineNeLon
                linesFilename = body.linesFilename
                lineSwLat = body.lineSwLat
                lineSwLon = body.lineSwLon
                minHeightAgl = body.minHeightAgl
                multObs = body.multObs
                nextCycleDate = body.nextCycleDate
                numLines = body.numLines
                numObs = body.numObs
                numPoints = body.numPoints
                obstacleRemarks = body.obstacleRemarks
                origId = body.origId
                origin = body.origin
                origNetwork = body.origNetwork
                ownerCountryCode = body.ownerCountryCode
                pointLat = body.pointLat
                pointLon = body.pointLon
                pointsFilename = body.pointsFilename
                processCode = body.processCode
                producer = body.producer
                provinceCode = body.provinceCode
                quality = body.quality
                rawFileUri = body.rawFileUri
                revDate = body.revDate
                segEndPoint = body.segEndPoint
                segNum = body.segNum
                segStartPoint = body.segStartPoint
                sourceDate = body.sourceDate
                sourceDl = body.sourceDl
                surfaceMatCode = body.surfaceMatCode
                transactionCode = body.transactionCode
                validationCode = body.validationCode
                values = body.values.map { it.toMutableList() }
                vectorsFilename = body.vectorsFilename
                wac = body.wac
                wacInnr = body.wacInnr
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

            /** Start date of this obstruction data set's currency, in ISO 8601 date-only format. */
            fun cycleDate(cycleDate: LocalDate) = cycleDate(JsonField.of(cycleDate))

            /**
             * Sets [Builder.cycleDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cycleDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cycleDate(cycleDate: JsonField<LocalDate>) = apply { this.cycleDate = cycleDate }

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

            /** The ID of this obstacle. */
            fun obstacleId(obstacleId: String) = obstacleId(JsonField.of(obstacleId))

            /**
             * Sets [Builder.obstacleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obstacleId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obstacleId(obstacleId: JsonField<String>) = apply { this.obstacleId = obstacleId }

            /** Type of obstacle (e.g. P for point, V for vector, L for line). */
            fun obstacleType(obstacleType: String) = obstacleType(JsonField.of(obstacleType))

            /**
             * Sets [Builder.obstacleType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obstacleType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obstacleType(obstacleType: JsonField<String>) = apply {
                this.obstacleType = obstacleType
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

            /** Indicates if this obstacle record is Active (A) or Deleted (D). */
            fun actDelCode(actDelCode: String) = actDelCode(JsonField.of(actDelCode))

            /**
             * Sets [Builder.actDelCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actDelCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actDelCode(actDelCode: JsonField<String>) = apply { this.actDelCode = actDelCode }

            /**
             * The Aeronautical Information Regulation and Control (AIRAC) cycle of this obstruction
             * data set. The format is YYNN where YY is the last two digits of the year and NN is
             * the cycle number.
             */
            fun airacCycle(airacCycle: Int) = airacCycle(JsonField.of(airacCycle))

            /**
             * Sets [Builder.airacCycle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.airacCycle] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun airacCycle(airacCycle: JsonField<Int>) = apply { this.airacCycle = airacCycle }

            /**
             * The baseline Aeronautical Information Regulation and Control (AIRAC) cycle for change
             * sets only. The format is YYNN where YY is the last two digits of the year and NN is
             * the cycle number.
             */
            fun baseAiracCycle(baseAiracCycle: Int) = baseAiracCycle(JsonField.of(baseAiracCycle))

            /**
             * Sets [Builder.baseAiracCycle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseAiracCycle] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseAiracCycle(baseAiracCycle: JsonField<Int>) = apply {
                this.baseAiracCycle = baseAiracCycle
            }

            /**
             * Earliest record date possible in this obstruction data set (not the earliest data
             * item), in ISO 8601 date-only format (e.g. YYYY-MM-DD). If null, this data set is
             * assumed to be a full data pull of holdings until the cutoffDate. If this field is
             * populated, this data set only contains updates since the last baseline data set.
             */
            fun baselineCutoffDate(baselineCutoffDate: LocalDate) =
                baselineCutoffDate(JsonField.of(baselineCutoffDate))

            /**
             * Sets [Builder.baselineCutoffDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baselineCutoffDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun baselineCutoffDate(baselineCutoffDate: JsonField<LocalDate>) = apply {
                this.baselineCutoffDate = baselineCutoffDate
            }

            /**
             * WGS-84 latitude of the northeastern boundary for obstructions contained in this data
             * set, in degrees. -90 to 90 degrees (negative values south of equator).
             */
            fun boundNeLat(boundNeLat: Double) = boundNeLat(JsonField.of(boundNeLat))

            /**
             * Sets [Builder.boundNeLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.boundNeLat] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boundNeLat(boundNeLat: JsonField<Double>) = apply { this.boundNeLat = boundNeLat }

            /**
             * WGS-84 longitude of the northeastern boundary for obstructions contained in this data
             * set, in degrees. -180 to 180 degrees (negative values west of Prime Meridian).
             */
            fun boundNeLon(boundNeLon: Double) = boundNeLon(JsonField.of(boundNeLon))

            /**
             * Sets [Builder.boundNeLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.boundNeLon] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boundNeLon(boundNeLon: JsonField<Double>) = apply { this.boundNeLon = boundNeLon }

            /**
             * WGS-84 latitude of the southwestern boundary for obstructions contained in this data
             * set, in degrees. -90 to 90 degrees (negative values south of equator).
             */
            fun boundSwLat(boundSwLat: Double) = boundSwLat(JsonField.of(boundSwLat))

            /**
             * Sets [Builder.boundSwLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.boundSwLat] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boundSwLat(boundSwLat: JsonField<Double>) = apply { this.boundSwLat = boundSwLat }

            /**
             * WGS-84 longitude of the southwestern boundary for obstructions contained in this data
             * set, in degrees. -180 to 180 degrees (negative values west of Prime Meridian).
             */
            fun boundSwLon(boundSwLon: Double) = boundSwLon(JsonField.of(boundSwLon))

            /**
             * Sets [Builder.boundSwLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.boundSwLon] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun boundSwLon(boundSwLon: JsonField<Double>) = apply { this.boundSwLon = boundSwLon }

            /**
             * The DoD Standard Country Code designator for the country issuing the diplomatic
             * clearance. This field will be set to "OTHR" if the source value does not match a UDL
             * Country code value (ISO-3166-ALPHA-2).
             */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
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
             * Latest record date possible in this obstruction data set (not the most recent data
             * item), in ISO 8601 date-only format (e.g. YYYY-MM-DD).
             */
            fun cutoffDate(cutoffDate: LocalDate) = cutoffDate(JsonField.of(cutoffDate))

            /**
             * Sets [Builder.cutoffDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cutoffDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cutoffDate(cutoffDate: JsonField<LocalDate>) = apply {
                this.cutoffDate = cutoffDate
            }

            /** Remarks concerning this obstruction's data set. */
            fun dataSetRemarks(dataSetRemarks: String) =
                dataSetRemarks(JsonField.of(dataSetRemarks))

            /**
             * Sets [Builder.dataSetRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataSetRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataSetRemarks(dataSetRemarks: JsonField<String>) = apply {
                this.dataSetRemarks = dataSetRemarks
            }

            /** The organization that deleted this obstacle record. */
            fun deletingOrg(deletingOrg: String) = deletingOrg(JsonField.of(deletingOrg))

            /**
             * Sets [Builder.deletingOrg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deletingOrg] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deletingOrg(deletingOrg: JsonField<String>) = apply {
                this.deletingOrg = deletingOrg
            }

            /** The organization that entered obstacle data other than the producer. */
            fun derivingOrg(derivingOrg: String) = derivingOrg(JsonField.of(derivingOrg))

            /**
             * Sets [Builder.derivingOrg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.derivingOrg] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun derivingOrg(derivingOrg: JsonField<String>) = apply {
                this.derivingOrg = derivingOrg
            }

            /**
             * The side or sides of this obstruction feature which produces the greatest
             * reflectivity potential.
             */
            fun directivityCode(directivityCode: Int) =
                directivityCode(JsonField.of(directivityCode))

            /**
             * Sets [Builder.directivityCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.directivityCode] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun directivityCode(directivityCode: JsonField<Int>) = apply {
                this.directivityCode = directivityCode
            }

            /** The elevation at the point obstacle's location in feet. */
            fun elevation(elevation: Double) = elevation(JsonField.of(elevation))

            /**
             * Sets [Builder.elevation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevation] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevation(elevation: JsonField<Double>) = apply { this.elevation = elevation }

            /**
             * The difference between the assigned elevation of this point and its true elevation,
             * in feet.
             */
            fun elevationAcc(elevationAcc: Double) = elevationAcc(JsonField.of(elevationAcc))

            /**
             * Sets [Builder.elevationAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevationAcc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevationAcc(elevationAcc: JsonField<Double>) = apply {
                this.elevationAcc = elevationAcc
            }

            /**
             * Optional obstacle ID from external systems. This field has no meaning within UDL and
             * is provided as a convenience for systems that require tracking of an internal system
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

            /**
             * FACC (Feature and Attribute Coding Catalog) is a five-character code for encoding
             * real-world entities and objects. The first letter of the code is an alphabetic value
             * from "A" to "Z" which will map to a feature category. The second character will map
             * to a subcategory. Characters three to five are numeric and range from 000 to 999.
             * This value will provide a unit feature type identification within the categories.
             */
            fun facc(facc: String) = facc(JsonField.of(facc))

            /**
             * Sets [Builder.facc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.facc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun facc(facc: JsonField<String>) = apply { this.facc = facc }

            /** Identifying code for the type of this point obstacle. */
            fun featureCode(featureCode: String) = featureCode(JsonField.of(featureCode))

            /**
             * Sets [Builder.featureCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureCode(featureCode: JsonField<String>) = apply {
                this.featureCode = featureCode
            }

            /**
             * Description of this obstacle, corresponding to the FACC (Feature and Attribute Coding
             * Catalog) value.
             */
            fun featureDescription(featureDescription: String) =
                featureDescription(JsonField.of(featureDescription))

            /**
             * Sets [Builder.featureDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureDescription(featureDescription: JsonField<String>) = apply {
                this.featureDescription = featureDescription
            }

            /** Type name of point obstacle. */
            fun featureName(featureName: String) = featureName(JsonField.of(featureName))

            /**
             * Sets [Builder.featureName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureName(featureName: JsonField<String>) = apply {
                this.featureName = featureName
            }

            /** Identifying code for the type of this point obstacle. */
            fun featureType(featureType: String) = featureType(JsonField.of(featureType))

            /**
             * Sets [Builder.featureType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.featureType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun featureType(featureType: JsonField<String>) = apply {
                this.featureType = featureType
            }

            /** The height Above Ground Level (AGL) of the point obstacle in feet. */
            fun heightAgl(heightAgl: Double) = heightAgl(JsonField.of(heightAgl))

            /**
             * Sets [Builder.heightAgl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.heightAgl] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun heightAgl(heightAgl: JsonField<Double>) = apply { this.heightAgl = heightAgl }

            /**
             * The accuracy of the height Above Ground Level (AGL) value for this point obstacle, in
             * feet.
             */
            fun heightAglAcc(heightAglAcc: Double) = heightAglAcc(JsonField.of(heightAglAcc))

            /**
             * Sets [Builder.heightAglAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.heightAglAcc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun heightAglAcc(heightAglAcc: JsonField<Double>) = apply {
                this.heightAglAcc = heightAglAcc
            }

            /** The height Above Mean Sea Level (AMSL) of the point obstacle in feet. */
            fun heightMsl(heightMsl: Double) = heightMsl(JsonField.of(heightMsl))

            /**
             * Sets [Builder.heightMsl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.heightMsl] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun heightMsl(heightMsl: JsonField<Double>) = apply { this.heightMsl = heightMsl }

            /**
             * The accuracy of the height Above Mean Sea Level (AMSL) value for this point obstacle
             * in feet.
             */
            fun heightMslAcc(heightMslAcc: Double) = heightMslAcc(JsonField.of(heightMslAcc))

            /**
             * Sets [Builder.heightMslAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.heightMslAcc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun heightMslAcc(heightMslAcc: JsonField<Double>) = apply {
                this.heightMslAcc = heightMslAcc
            }

            /**
             * The difference between the recorded horizontal coordinates of this point obstacle and
             * its true position, in feet.
             */
            fun horizAcc(horizAcc: Double) = horizAcc(JsonField.of(horizAcc))

            /**
             * Sets [Builder.horizAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.horizAcc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun horizAcc(horizAcc: JsonField<Double>) = apply { this.horizAcc = horizAcc }

            /**
             * Code representing the mathematical model of Earth used to calculate coordinates for
             * this obstacle (e.g. WGS-84, U for undetermined, etc.). US Forces use the World
             * Geodetic System 1984 (WGS-84), but also use maps by allied countries with local
             * datums.
             */
            fun horizDatumCode(horizDatumCode: String) =
                horizDatumCode(JsonField.of(horizDatumCode))

            /**
             * Sets [Builder.horizDatumCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.horizDatumCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun horizDatumCode(horizDatumCode: JsonField<String>) = apply {
                this.horizDatumCode = horizDatumCode
            }

            /**
             * Date this obstacle was initially added to the data set, in ISO 8601 date-only format
             * (ex. YYYY-MM-DD).
             */
            fun initRecordDate(initRecordDate: LocalDate) =
                initRecordDate(JsonField.of(initRecordDate))

            /**
             * Sets [Builder.initRecordDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initRecordDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun initRecordDate(initRecordDate: JsonField<LocalDate>) = apply {
                this.initRecordDate = initRecordDate
            }

            /**
             * This field provides an array of keys that can be added to any obstruction feature to
             * provide information that is not already supported. The entries in this array must
             * correspond to the position index in the values array. This array must be the same
             * length as values.
             */
            fun keys(keys: List<String>) = keys(JsonField.of(keys))

            /**
             * Sets [Builder.keys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.keys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun keys(keys: JsonField<List<String>>) = apply {
                this.keys = keys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [keys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addKey(key: String) = apply {
                keys =
                    (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
            }

            /** Code specifying if this obstacle is lit (e.g. Y = Yes, N = No, U = Unknown). */
            fun lightingCode(lightingCode: String) = lightingCode(JsonField.of(lightingCode))

            /**
             * Sets [Builder.lightingCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lightingCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lightingCode(lightingCode: JsonField<String>) = apply {
                this.lightingCode = lightingCode
            }

            /**
             * WGS-84 latitude of the northeastern point of the line, in degrees. -90 to 90 degrees
             * (negative values south of equator).
             */
            fun lineNeLat(lineNeLat: Double) = lineNeLat(JsonField.of(lineNeLat))

            /**
             * Sets [Builder.lineNeLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineNeLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineNeLat(lineNeLat: JsonField<Double>) = apply { this.lineNeLat = lineNeLat }

            /**
             * WGS-84 longitude of the northeastern point of the line, in degrees. -180 to 180
             * degrees (negative values west of Prime Meridian).
             */
            fun lineNeLon(lineNeLon: Double) = lineNeLon(JsonField.of(lineNeLon))

            /**
             * Sets [Builder.lineNeLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineNeLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineNeLon(lineNeLon: JsonField<Double>) = apply { this.lineNeLon = lineNeLon }

            /** The name of the line file associated with this obstruction data set. */
            fun linesFilename(linesFilename: String) = linesFilename(JsonField.of(linesFilename))

            /**
             * Sets [Builder.linesFilename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linesFilename] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linesFilename(linesFilename: JsonField<String>) = apply {
                this.linesFilename = linesFilename
            }

            /**
             * WGS-84 latitude of the southwestern point of the line, in degrees. -90 to 90 degrees
             * (negative values south of equator).
             */
            fun lineSwLat(lineSwLat: Double) = lineSwLat(JsonField.of(lineSwLat))

            /**
             * Sets [Builder.lineSwLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineSwLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineSwLat(lineSwLat: JsonField<Double>) = apply { this.lineSwLat = lineSwLat }

            /**
             * WGS-84 longitude of the southwestern point of the line, in degrees. -180 to 180
             * degrees (negative values west of Prime Meridian).
             */
            fun lineSwLon(lineSwLon: Double) = lineSwLon(JsonField.of(lineSwLon))

            /**
             * Sets [Builder.lineSwLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineSwLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineSwLon(lineSwLon: JsonField<Double>) = apply { this.lineSwLon = lineSwLon }

            /**
             * The minimum height Above Ground Level (AGL) of the shortest obstruction contained in
             * this data set, in feet.
             */
            fun minHeightAgl(minHeightAgl: Double) = minHeightAgl(JsonField.of(minHeightAgl))

            /**
             * Sets [Builder.minHeightAgl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minHeightAgl] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minHeightAgl(minHeightAgl: JsonField<Double>) = apply {
                this.minHeightAgl = minHeightAgl
            }

            /**
             * Indicates if the feature has multiple obstructions (e.g. S = Single, M = Multiple, U
             * = Undetermined).
             */
            fun multObs(multObs: String) = multObs(JsonField.of(multObs))

            /**
             * Sets [Builder.multObs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multObs] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun multObs(multObs: JsonField<String>) = apply { this.multObs = multObs }

            /**
             * The date after which this obstruction data set’s currency is stale and should be
             * refreshed, in ISO 8601 date-only format (e.g. YYYY-MM-DD).
             */
            fun nextCycleDate(nextCycleDate: LocalDate) = nextCycleDate(JsonField.of(nextCycleDate))

            /**
             * Sets [Builder.nextCycleDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextCycleDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nextCycleDate(nextCycleDate: JsonField<LocalDate>) = apply {
                this.nextCycleDate = nextCycleDate
            }

            /** The number of line features associated with this obstruction data set. */
            fun numLines(numLines: Int) = numLines(JsonField.of(numLines))

            /**
             * Sets [Builder.numLines] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numLines] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numLines(numLines: JsonField<Int>) = apply { this.numLines = numLines }

            /** Indicates the number of obstructions associated with a feature. */
            fun numObs(numObs: Int) = numObs(JsonField.of(numObs))

            /**
             * Sets [Builder.numObs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numObs] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun numObs(numObs: JsonField<Int>) = apply { this.numObs = numObs }

            /** The number of point features associated with this obstruction data set. */
            fun numPoints(numPoints: Int) = numPoints(JsonField.of(numPoints))

            /**
             * Sets [Builder.numPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numPoints] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numPoints(numPoints: JsonField<Int>) = apply { this.numPoints = numPoints }

            /** Remarks regarding this obstacle. */
            fun obstacleRemarks(obstacleRemarks: String) =
                obstacleRemarks(JsonField.of(obstacleRemarks))

            /**
             * Sets [Builder.obstacleRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obstacleRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obstacleRemarks(obstacleRemarks: JsonField<String>) = apply {
                this.obstacleRemarks = obstacleRemarks
            }

            /** The original ID for this obstacle. */
            fun origId(origId: String) = origId(JsonField.of(origId))

            /**
             * Sets [Builder.origId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origId(origId: JsonField<String>) = apply { this.origId = origId }

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
             * The DoD Standard Country Code designator for the country or political entity that
             * owns the data set associated with this obstruction. This field will be set to "OTHR"
             * if the source value does not match a UDL Country code value (ISO-3166-ALPHA-2).
             */
            fun ownerCountryCode(ownerCountryCode: String) =
                ownerCountryCode(JsonField.of(ownerCountryCode))

            /**
             * Sets [Builder.ownerCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownerCountryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownerCountryCode(ownerCountryCode: JsonField<String>) = apply {
                this.ownerCountryCode = ownerCountryCode
            }

            /**
             * WGS-84 latitude of this point obstacle, in degrees. -90 to 90 degrees (negative
             * values south of equator).
             */
            fun pointLat(pointLat: Double) = pointLat(JsonField.of(pointLat))

            /**
             * Sets [Builder.pointLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointLat(pointLat: JsonField<Double>) = apply { this.pointLat = pointLat }

            /**
             * WGS-84 longitude of this point obstacle, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             */
            fun pointLon(pointLon: Double) = pointLon(JsonField.of(pointLon))

            /**
             * Sets [Builder.pointLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointLon(pointLon: JsonField<Double>) = apply { this.pointLon = pointLon }

            /** The name of the point file associated with this obstruction data set. */
            fun pointsFilename(pointsFilename: String) =
                pointsFilename(JsonField.of(pointsFilename))

            /**
             * Sets [Builder.pointsFilename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pointsFilename] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pointsFilename(pointsFilename: JsonField<String>) = apply {
                this.pointsFilename = pointsFilename
            }

            /** Code denoting the action, review, or process that updated this obstacle. */
            fun processCode(processCode: String) = processCode(JsonField.of(processCode))

            /**
             * Sets [Builder.processCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.processCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun processCode(processCode: JsonField<String>) = apply {
                this.processCode = processCode
            }

            /** Name of the agency that produced this obstruction data set. */
            fun producer(producer: String) = producer(JsonField.of(producer))

            /**
             * Sets [Builder.producer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.producer] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun producer(producer: JsonField<String>) = apply { this.producer = producer }

            /**
             * The Federal Information Processing Standards (FIPS) state/province numeric code of
             * this obstacle's location.
             */
            fun provinceCode(provinceCode: String) = provinceCode(JsonField.of(provinceCode))

            /**
             * Sets [Builder.provinceCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provinceCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provinceCode(provinceCode: JsonField<String>) = apply {
                this.provinceCode = provinceCode
            }

            /**
             * When horizontal and/or vertical accuracy requirements cannot be met because of
             * inadequate source material, this code indicates the quality of the data.
             */
            fun quality(quality: String) = quality(JsonField.of(quality))

            /**
             * Sets [Builder.quality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quality(quality: JsonField<String>) = apply { this.quality = quality }

            /**
             * Optional URI location in the document repository of the raw file parsed by the system
             * to produce this record. To download the raw file, prepend
             * https://udl-hostname/scs/download?id= to this value.
             */
            fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

            /**
             * Sets [Builder.rawFileUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawFileUri] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawFileUri(rawFileUri: JsonField<String>) = apply { this.rawFileUri = rawFileUri }

            /**
             * Date this obstacle data was revised, in ISO 8601 date-only format (ex. YYYY-MM-DD).
             */
            fun revDate(revDate: LocalDate) = revDate(JsonField.of(revDate))

            /**
             * Sets [Builder.revDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun revDate(revDate: JsonField<LocalDate>) = apply { this.revDate = revDate }

            /** ID of the end point of a line segment. */
            fun segEndPoint(segEndPoint: Int) = segEndPoint(JsonField.of(segEndPoint))

            /**
             * Sets [Builder.segEndPoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segEndPoint] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segEndPoint(segEndPoint: JsonField<Int>) = apply { this.segEndPoint = segEndPoint }

            /** Identifies the sequence number of a line segment. */
            fun segNum(segNum: Int) = segNum(JsonField.of(segNum))

            /**
             * Sets [Builder.segNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segNum] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun segNum(segNum: JsonField<Int>) = apply { this.segNum = segNum }

            /** ID of the starting point of a line segment. */
            fun segStartPoint(segStartPoint: Int) = segStartPoint(JsonField.of(segStartPoint))

            /**
             * Sets [Builder.segStartPoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.segStartPoint] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun segStartPoint(segStartPoint: JsonField<Int>) = apply {
                this.segStartPoint = segStartPoint
            }

            /** Source date of this obstacle data, in ISO 8601 date-only format (ex. YYYY-MM-DD). */
            fun sourceDate(sourceDate: LocalDate) = sourceDate(JsonField.of(sourceDate))

            /**
             * Sets [Builder.sourceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDate(sourceDate: JsonField<LocalDate>) = apply {
                this.sourceDate = sourceDate
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

            /** The surface material composition code of this point obstacle. */
            fun surfaceMatCode(surfaceMatCode: String) =
                surfaceMatCode(JsonField.of(surfaceMatCode))

            /**
             * Sets [Builder.surfaceMatCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.surfaceMatCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun surfaceMatCode(surfaceMatCode: JsonField<String>) = apply {
                this.surfaceMatCode = surfaceMatCode
            }

            /** The transaction type/code for this obstacle (e.g. "D", "N", "R", "S", "V", "X"). */
            fun transactionCode(transactionCode: String) =
                transactionCode(JsonField.of(transactionCode))

            /**
             * Sets [Builder.transactionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionCode(transactionCode: JsonField<String>) = apply {
                this.transactionCode = transactionCode
            }

            /** Method used to confirm the existence of this obstacle. */
            fun validationCode(validationCode: Int) = validationCode(JsonField.of(validationCode))

            /**
             * Sets [Builder.validationCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validationCode] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun validationCode(validationCode: JsonField<Int>) = apply {
                this.validationCode = validationCode
            }

            /**
             * This field provides an array of values that can be added to any obstruction feature
             * to provide information that is not already supported. The entries in this array must
             * correspond to the position index in the keys array. This array must be the same
             * length as keys.
             */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
                    }
            }

            /** The name of the vector file associated with this obstruction data set. */
            fun vectorsFilename(vectorsFilename: String) =
                vectorsFilename(JsonField.of(vectorsFilename))

            /**
             * Sets [Builder.vectorsFilename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vectorsFilename] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vectorsFilename(vectorsFilename: JsonField<String>) = apply {
                this.vectorsFilename = vectorsFilename
            }

            /**
             * The World Aeronautical Chart (WAC) identifier for the area in which this obstacle is
             * located.
             */
            fun wac(wac: String) = wac(JsonField.of(wac))

            /**
             * Sets [Builder.wac] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wac] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun wac(wac: JsonField<String>) = apply { this.wac = wac }

            /** This obstacle's World Area Code installation number (WAC-INNR). */
            fun wacInnr(wacInnr: String) = wacInnr(JsonField.of(wacInnr))

            /**
             * Sets [Builder.wacInnr] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wacInnr] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wacInnr(wacInnr: JsonField<String>) = apply { this.wacInnr = wacInnr }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .cycleDate()
             * .dataMode()
             * .obstacleId()
             * .obstacleType()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("cycleDate", cycleDate),
                    checkRequired("dataMode", dataMode),
                    checkRequired("obstacleId", obstacleId),
                    checkRequired("obstacleType", obstacleType),
                    checkRequired("source", source),
                    id,
                    actDelCode,
                    airacCycle,
                    baseAiracCycle,
                    baselineCutoffDate,
                    boundNeLat,
                    boundNeLon,
                    boundSwLat,
                    boundSwLon,
                    countryCode,
                    createdAt,
                    createdBy,
                    cutoffDate,
                    dataSetRemarks,
                    deletingOrg,
                    derivingOrg,
                    directivityCode,
                    elevation,
                    elevationAcc,
                    externalId,
                    facc,
                    featureCode,
                    featureDescription,
                    featureName,
                    featureType,
                    heightAgl,
                    heightAglAcc,
                    heightMsl,
                    heightMslAcc,
                    horizAcc,
                    horizDatumCode,
                    initRecordDate,
                    (keys ?: JsonMissing.of()).map { it.toImmutable() },
                    lightingCode,
                    lineNeLat,
                    lineNeLon,
                    linesFilename,
                    lineSwLat,
                    lineSwLon,
                    minHeightAgl,
                    multObs,
                    nextCycleDate,
                    numLines,
                    numObs,
                    numPoints,
                    obstacleRemarks,
                    origId,
                    origin,
                    origNetwork,
                    ownerCountryCode,
                    pointLat,
                    pointLon,
                    pointsFilename,
                    processCode,
                    producer,
                    provinceCode,
                    quality,
                    rawFileUri,
                    revDate,
                    segEndPoint,
                    segNum,
                    segStartPoint,
                    sourceDate,
                    sourceDl,
                    surfaceMatCode,
                    transactionCode,
                    validationCode,
                    (values ?: JsonMissing.of()).map { it.toImmutable() },
                    vectorsFilename,
                    wac,
                    wacInnr,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            cycleDate()
            dataMode().validate()
            obstacleId()
            obstacleType()
            source()
            id()
            actDelCode()
            airacCycle()
            baseAiracCycle()
            baselineCutoffDate()
            boundNeLat()
            boundNeLon()
            boundSwLat()
            boundSwLon()
            countryCode()
            createdAt()
            createdBy()
            cutoffDate()
            dataSetRemarks()
            deletingOrg()
            derivingOrg()
            directivityCode()
            elevation()
            elevationAcc()
            externalId()
            facc()
            featureCode()
            featureDescription()
            featureName()
            featureType()
            heightAgl()
            heightAglAcc()
            heightMsl()
            heightMslAcc()
            horizAcc()
            horizDatumCode()
            initRecordDate()
            keys()
            lightingCode()
            lineNeLat()
            lineNeLon()
            linesFilename()
            lineSwLat()
            lineSwLon()
            minHeightAgl()
            multObs()
            nextCycleDate()
            numLines()
            numObs()
            numPoints()
            obstacleRemarks()
            origId()
            origin()
            origNetwork()
            ownerCountryCode()
            pointLat()
            pointLon()
            pointsFilename()
            processCode()
            producer()
            provinceCode()
            quality()
            rawFileUri()
            revDate()
            segEndPoint()
            segNum()
            segStartPoint()
            sourceDate()
            sourceDl()
            surfaceMatCode()
            transactionCode()
            validationCode()
            values()
            vectorsFilename()
            wac()
            wacInnr()
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
                (if (cycleDate.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (obstacleId.asKnown().isPresent) 1 else 0) +
                (if (obstacleType.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (actDelCode.asKnown().isPresent) 1 else 0) +
                (if (airacCycle.asKnown().isPresent) 1 else 0) +
                (if (baseAiracCycle.asKnown().isPresent) 1 else 0) +
                (if (baselineCutoffDate.asKnown().isPresent) 1 else 0) +
                (if (boundNeLat.asKnown().isPresent) 1 else 0) +
                (if (boundNeLon.asKnown().isPresent) 1 else 0) +
                (if (boundSwLat.asKnown().isPresent) 1 else 0) +
                (if (boundSwLon.asKnown().isPresent) 1 else 0) +
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (cutoffDate.asKnown().isPresent) 1 else 0) +
                (if (dataSetRemarks.asKnown().isPresent) 1 else 0) +
                (if (deletingOrg.asKnown().isPresent) 1 else 0) +
                (if (derivingOrg.asKnown().isPresent) 1 else 0) +
                (if (directivityCode.asKnown().isPresent) 1 else 0) +
                (if (elevation.asKnown().isPresent) 1 else 0) +
                (if (elevationAcc.asKnown().isPresent) 1 else 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (if (facc.asKnown().isPresent) 1 else 0) +
                (if (featureCode.asKnown().isPresent) 1 else 0) +
                (if (featureDescription.asKnown().isPresent) 1 else 0) +
                (if (featureName.asKnown().isPresent) 1 else 0) +
                (if (featureType.asKnown().isPresent) 1 else 0) +
                (if (heightAgl.asKnown().isPresent) 1 else 0) +
                (if (heightAglAcc.asKnown().isPresent) 1 else 0) +
                (if (heightMsl.asKnown().isPresent) 1 else 0) +
                (if (heightMslAcc.asKnown().isPresent) 1 else 0) +
                (if (horizAcc.asKnown().isPresent) 1 else 0) +
                (if (horizDatumCode.asKnown().isPresent) 1 else 0) +
                (if (initRecordDate.asKnown().isPresent) 1 else 0) +
                (keys.asKnown().getOrNull()?.size ?: 0) +
                (if (lightingCode.asKnown().isPresent) 1 else 0) +
                (if (lineNeLat.asKnown().isPresent) 1 else 0) +
                (if (lineNeLon.asKnown().isPresent) 1 else 0) +
                (if (linesFilename.asKnown().isPresent) 1 else 0) +
                (if (lineSwLat.asKnown().isPresent) 1 else 0) +
                (if (lineSwLon.asKnown().isPresent) 1 else 0) +
                (if (minHeightAgl.asKnown().isPresent) 1 else 0) +
                (if (multObs.asKnown().isPresent) 1 else 0) +
                (if (nextCycleDate.asKnown().isPresent) 1 else 0) +
                (if (numLines.asKnown().isPresent) 1 else 0) +
                (if (numObs.asKnown().isPresent) 1 else 0) +
                (if (numPoints.asKnown().isPresent) 1 else 0) +
                (if (obstacleRemarks.asKnown().isPresent) 1 else 0) +
                (if (origId.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (ownerCountryCode.asKnown().isPresent) 1 else 0) +
                (if (pointLat.asKnown().isPresent) 1 else 0) +
                (if (pointLon.asKnown().isPresent) 1 else 0) +
                (if (pointsFilename.asKnown().isPresent) 1 else 0) +
                (if (processCode.asKnown().isPresent) 1 else 0) +
                (if (producer.asKnown().isPresent) 1 else 0) +
                (if (provinceCode.asKnown().isPresent) 1 else 0) +
                (if (quality.asKnown().isPresent) 1 else 0) +
                (if (rawFileUri.asKnown().isPresent) 1 else 0) +
                (if (revDate.asKnown().isPresent) 1 else 0) +
                (if (segEndPoint.asKnown().isPresent) 1 else 0) +
                (if (segNum.asKnown().isPresent) 1 else 0) +
                (if (segStartPoint.asKnown().isPresent) 1 else 0) +
                (if (sourceDate.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (surfaceMatCode.asKnown().isPresent) 1 else 0) +
                (if (transactionCode.asKnown().isPresent) 1 else 0) +
                (if (validationCode.asKnown().isPresent) 1 else 0) +
                (values.asKnown().getOrNull()?.size ?: 0) +
                (if (vectorsFilename.asKnown().isPresent) 1 else 0) +
                (if (wac.asKnown().isPresent) 1 else 0) +
                (if (wacInnr.asKnown().isPresent) 1 else 0)

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
                cycleDate == other.cycleDate &&
                dataMode == other.dataMode &&
                obstacleId == other.obstacleId &&
                obstacleType == other.obstacleType &&
                source == other.source &&
                id == other.id &&
                actDelCode == other.actDelCode &&
                airacCycle == other.airacCycle &&
                baseAiracCycle == other.baseAiracCycle &&
                baselineCutoffDate == other.baselineCutoffDate &&
                boundNeLat == other.boundNeLat &&
                boundNeLon == other.boundNeLon &&
                boundSwLat == other.boundSwLat &&
                boundSwLon == other.boundSwLon &&
                countryCode == other.countryCode &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                cutoffDate == other.cutoffDate &&
                dataSetRemarks == other.dataSetRemarks &&
                deletingOrg == other.deletingOrg &&
                derivingOrg == other.derivingOrg &&
                directivityCode == other.directivityCode &&
                elevation == other.elevation &&
                elevationAcc == other.elevationAcc &&
                externalId == other.externalId &&
                facc == other.facc &&
                featureCode == other.featureCode &&
                featureDescription == other.featureDescription &&
                featureName == other.featureName &&
                featureType == other.featureType &&
                heightAgl == other.heightAgl &&
                heightAglAcc == other.heightAglAcc &&
                heightMsl == other.heightMsl &&
                heightMslAcc == other.heightMslAcc &&
                horizAcc == other.horizAcc &&
                horizDatumCode == other.horizDatumCode &&
                initRecordDate == other.initRecordDate &&
                keys == other.keys &&
                lightingCode == other.lightingCode &&
                lineNeLat == other.lineNeLat &&
                lineNeLon == other.lineNeLon &&
                linesFilename == other.linesFilename &&
                lineSwLat == other.lineSwLat &&
                lineSwLon == other.lineSwLon &&
                minHeightAgl == other.minHeightAgl &&
                multObs == other.multObs &&
                nextCycleDate == other.nextCycleDate &&
                numLines == other.numLines &&
                numObs == other.numObs &&
                numPoints == other.numPoints &&
                obstacleRemarks == other.obstacleRemarks &&
                origId == other.origId &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                ownerCountryCode == other.ownerCountryCode &&
                pointLat == other.pointLat &&
                pointLon == other.pointLon &&
                pointsFilename == other.pointsFilename &&
                processCode == other.processCode &&
                producer == other.producer &&
                provinceCode == other.provinceCode &&
                quality == other.quality &&
                rawFileUri == other.rawFileUri &&
                revDate == other.revDate &&
                segEndPoint == other.segEndPoint &&
                segNum == other.segNum &&
                segStartPoint == other.segStartPoint &&
                sourceDate == other.sourceDate &&
                sourceDl == other.sourceDl &&
                surfaceMatCode == other.surfaceMatCode &&
                transactionCode == other.transactionCode &&
                validationCode == other.validationCode &&
                values == other.values &&
                vectorsFilename == other.vectorsFilename &&
                wac == other.wac &&
                wacInnr == other.wacInnr
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                cycleDate,
                dataMode,
                obstacleId,
                obstacleType,
                source,
                id,
                actDelCode,
                airacCycle,
                baseAiracCycle,
                baselineCutoffDate,
                boundNeLat,
                boundNeLon,
                boundSwLat,
                boundSwLon,
                countryCode,
                createdAt,
                createdBy,
                cutoffDate,
                dataSetRemarks,
                deletingOrg,
                derivingOrg,
                directivityCode,
                elevation,
                elevationAcc,
                externalId,
                facc,
                featureCode,
                featureDescription,
                featureName,
                featureType,
                heightAgl,
                heightAglAcc,
                heightMsl,
                heightMslAcc,
                horizAcc,
                horizDatumCode,
                initRecordDate,
                keys,
                lightingCode,
                lineNeLat,
                lineNeLon,
                linesFilename,
                lineSwLat,
                lineSwLon,
                minHeightAgl,
                multObs,
                nextCycleDate,
                numLines,
                numObs,
                numPoints,
                obstacleRemarks,
                origId,
                origin,
                origNetwork,
                ownerCountryCode,
                pointLat,
                pointLon,
                pointsFilename,
                processCode,
                producer,
                provinceCode,
                quality,
                rawFileUri,
                revDate,
                segEndPoint,
                segNum,
                segStartPoint,
                sourceDate,
                sourceDl,
                surfaceMatCode,
                transactionCode,
                validationCode,
                values,
                vectorsFilename,
                wac,
                wacInnr,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, cycleDate=$cycleDate, dataMode=$dataMode, obstacleId=$obstacleId, obstacleType=$obstacleType, source=$source, id=$id, actDelCode=$actDelCode, airacCycle=$airacCycle, baseAiracCycle=$baseAiracCycle, baselineCutoffDate=$baselineCutoffDate, boundNeLat=$boundNeLat, boundNeLon=$boundNeLon, boundSwLat=$boundSwLat, boundSwLon=$boundSwLon, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, cutoffDate=$cutoffDate, dataSetRemarks=$dataSetRemarks, deletingOrg=$deletingOrg, derivingOrg=$derivingOrg, directivityCode=$directivityCode, elevation=$elevation, elevationAcc=$elevationAcc, externalId=$externalId, facc=$facc, featureCode=$featureCode, featureDescription=$featureDescription, featureName=$featureName, featureType=$featureType, heightAgl=$heightAgl, heightAglAcc=$heightAglAcc, heightMsl=$heightMsl, heightMslAcc=$heightMslAcc, horizAcc=$horizAcc, horizDatumCode=$horizDatumCode, initRecordDate=$initRecordDate, keys=$keys, lightingCode=$lightingCode, lineNeLat=$lineNeLat, lineNeLon=$lineNeLon, linesFilename=$linesFilename, lineSwLat=$lineSwLat, lineSwLon=$lineSwLon, minHeightAgl=$minHeightAgl, multObs=$multObs, nextCycleDate=$nextCycleDate, numLines=$numLines, numObs=$numObs, numPoints=$numPoints, obstacleRemarks=$obstacleRemarks, origId=$origId, origin=$origin, origNetwork=$origNetwork, ownerCountryCode=$ownerCountryCode, pointLat=$pointLat, pointLon=$pointLon, pointsFilename=$pointsFilename, processCode=$processCode, producer=$producer, provinceCode=$provinceCode, quality=$quality, rawFileUri=$rawFileUri, revDate=$revDate, segEndPoint=$segEndPoint, segNum=$segNum, segStartPoint=$segStartPoint, sourceDate=$sourceDate, sourceDl=$sourceDl, surfaceMatCode=$surfaceMatCode, transactionCode=$transactionCode, validationCode=$validationCode, values=$values, vectorsFilename=$vectorsFilename, wac=$wac, wacInnr=$wacInnr}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NavigationalObstructionCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "NavigationalObstructionCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

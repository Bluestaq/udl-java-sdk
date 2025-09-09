// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.maneuvers

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
 * Service operation intended for initial integration only, to take a list of maneuvers as a POST
 * body and ingest into the database. This operation is not intended to be used for automated feeds
 * into UDL. Data providers should contact the UDL team for specific role assignments and for
 * instructions on setting up a permanent feed through an alternate mechanism.
 */
class ManeuverCreateBulkParams
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
         * Returns a mutable builder for constructing an instance of [ManeuverCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManeuverCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(maneuverCreateBulkParams: ManeuverCreateBulkParams) = apply {
            body = maneuverCreateBulkParams.body.toMutableList()
            additionalHeaders = maneuverCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = maneuverCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [ManeuverCreateBulkParams].
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
        fun build(): ManeuverCreateBulkParams =
            ManeuverCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Model representation of on-orbit object maneuver information for detected, possible, and
     * confirmed maneuvers.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("eventStartTime")
        @ExcludeMissing
        private val eventStartTime: JsonField<OffsetDateTime>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("algorithm") @ExcludeMissing private val algorithm: JsonField<String>,
        @JsonProperty("characterization")
        @ExcludeMissing
        private val characterization: JsonField<String>,
        @JsonProperty("characterizationUnc")
        @ExcludeMissing
        private val characterizationUnc: JsonField<Double>,
        @JsonProperty("cov") @ExcludeMissing private val cov: JsonField<List<Double>>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("deltaMass") @ExcludeMissing private val deltaMass: JsonField<Double>,
        @JsonProperty("deltaPos") @ExcludeMissing private val deltaPos: JsonField<Double>,
        @JsonProperty("deltaPosU") @ExcludeMissing private val deltaPosU: JsonField<Double>,
        @JsonProperty("deltaPosV") @ExcludeMissing private val deltaPosV: JsonField<Double>,
        @JsonProperty("deltaPosW") @ExcludeMissing private val deltaPosW: JsonField<Double>,
        @JsonProperty("deltaVel") @ExcludeMissing private val deltaVel: JsonField<Double>,
        @JsonProperty("deltaVelU") @ExcludeMissing private val deltaVelU: JsonField<Double>,
        @JsonProperty("deltaVelV") @ExcludeMissing private val deltaVelV: JsonField<Double>,
        @JsonProperty("deltaVelW") @ExcludeMissing private val deltaVelW: JsonField<Double>,
        @JsonProperty("description") @ExcludeMissing private val description: JsonField<String>,
        @JsonProperty("descriptor") @ExcludeMissing private val descriptor: JsonField<String>,
        @JsonProperty("eventEndTime")
        @ExcludeMissing
        private val eventEndTime: JsonField<OffsetDateTime>,
        @JsonProperty("eventId") @ExcludeMissing private val eventId: JsonField<String>,
        @JsonProperty("idOnOrbit") @ExcludeMissing private val idOnOrbit: JsonField<String>,
        @JsonProperty("idSensor") @ExcludeMissing private val idSensor: JsonField<String>,
        @JsonProperty("maneuverUnc") @ExcludeMissing private val maneuverUnc: JsonField<Double>,
        @JsonProperty("mnvrAccels") @ExcludeMissing private val mnvrAccels: JsonField<List<Double>>,
        @JsonProperty("mnvrAccelTimes")
        @ExcludeMissing
        private val mnvrAccelTimes: JsonField<List<Double>>,
        @JsonProperty("mnvrAccelUncs")
        @ExcludeMissing
        private val mnvrAccelUncs: JsonField<List<Double>>,
        @JsonProperty("numAccelPoints") @ExcludeMissing private val numAccelPoints: JsonField<Int>,
        @JsonProperty("numObs") @ExcludeMissing private val numObs: JsonField<Int>,
        @JsonProperty("odFitEndTime")
        @ExcludeMissing
        private val odFitEndTime: JsonField<OffsetDateTime>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origObjectId") @ExcludeMissing private val origObjectId: JsonField<String>,
        @JsonProperty("origSensorId") @ExcludeMissing private val origSensorId: JsonField<String>,
        @JsonProperty("postApogee") @ExcludeMissing private val postApogee: JsonField<Double>,
        @JsonProperty("postArea") @ExcludeMissing private val postArea: JsonField<Double>,
        @JsonProperty("postBallisticCoeff")
        @ExcludeMissing
        private val postBallisticCoeff: JsonField<Double>,
        @JsonProperty("postDriftRate") @ExcludeMissing private val postDriftRate: JsonField<Double>,
        @JsonProperty("postEccentricity")
        @ExcludeMissing
        private val postEccentricity: JsonField<Double>,
        @JsonProperty("postEventElset")
        @ExcludeMissing
        private val postEventElset: JsonField<PostEventElset>,
        @JsonProperty("postEventIdElset")
        @ExcludeMissing
        private val postEventIdElset: JsonField<String>,
        @JsonProperty("postEventIdStateVector")
        @ExcludeMissing
        private val postEventIdStateVector: JsonField<String>,
        @JsonProperty("postEventStateVector")
        @ExcludeMissing
        private val postEventStateVector: JsonField<PostEventStateVector>,
        @JsonProperty("postGeoLongitude")
        @ExcludeMissing
        private val postGeoLongitude: JsonField<Double>,
        @JsonProperty("postInclination")
        @ExcludeMissing
        private val postInclination: JsonField<Double>,
        @JsonProperty("postMass") @ExcludeMissing private val postMass: JsonField<Double>,
        @JsonProperty("postPerigee") @ExcludeMissing private val postPerigee: JsonField<Double>,
        @JsonProperty("postPeriod") @ExcludeMissing private val postPeriod: JsonField<Double>,
        @JsonProperty("postPosX") @ExcludeMissing private val postPosX: JsonField<Double>,
        @JsonProperty("postPosY") @ExcludeMissing private val postPosY: JsonField<Double>,
        @JsonProperty("postPosZ") @ExcludeMissing private val postPosZ: JsonField<Double>,
        @JsonProperty("postRAAN") @ExcludeMissing private val postRaan: JsonField<Double>,
        @JsonProperty("postRadiationPressCoeff")
        @ExcludeMissing
        private val postRadiationPressCoeff: JsonField<Double>,
        @JsonProperty("postSigmaU") @ExcludeMissing private val postSigmaU: JsonField<Double>,
        @JsonProperty("postSigmaV") @ExcludeMissing private val postSigmaV: JsonField<Double>,
        @JsonProperty("postSigmaW") @ExcludeMissing private val postSigmaW: JsonField<Double>,
        @JsonProperty("postSMA") @ExcludeMissing private val postSma: JsonField<Double>,
        @JsonProperty("postVelX") @ExcludeMissing private val postVelX: JsonField<Double>,
        @JsonProperty("postVelY") @ExcludeMissing private val postVelY: JsonField<Double>,
        @JsonProperty("postVelZ") @ExcludeMissing private val postVelZ: JsonField<Double>,
        @JsonProperty("preApogee") @ExcludeMissing private val preApogee: JsonField<Double>,
        @JsonProperty("preBallisticCoeff")
        @ExcludeMissing
        private val preBallisticCoeff: JsonField<Double>,
        @JsonProperty("preDriftRate") @ExcludeMissing private val preDriftRate: JsonField<Double>,
        @JsonProperty("preEccentricity")
        @ExcludeMissing
        private val preEccentricity: JsonField<Double>,
        @JsonProperty("preEventElset")
        @ExcludeMissing
        private val preEventElset: JsonField<PreEventElset>,
        @JsonProperty("preEventIdElset")
        @ExcludeMissing
        private val preEventIdElset: JsonField<String>,
        @JsonProperty("preEventIdStateVector")
        @ExcludeMissing
        private val preEventIdStateVector: JsonField<String>,
        @JsonProperty("preEventStateVector")
        @ExcludeMissing
        private val preEventStateVector: JsonField<PreEventStateVector>,
        @JsonProperty("preGeoLongitude")
        @ExcludeMissing
        private val preGeoLongitude: JsonField<Double>,
        @JsonProperty("preInclination")
        @ExcludeMissing
        private val preInclination: JsonField<Double>,
        @JsonProperty("prePerigee") @ExcludeMissing private val prePerigee: JsonField<Double>,
        @JsonProperty("prePeriod") @ExcludeMissing private val prePeriod: JsonField<Double>,
        @JsonProperty("prePosX") @ExcludeMissing private val prePosX: JsonField<Double>,
        @JsonProperty("prePosY") @ExcludeMissing private val prePosY: JsonField<Double>,
        @JsonProperty("prePosZ") @ExcludeMissing private val prePosZ: JsonField<Double>,
        @JsonProperty("preRAAN") @ExcludeMissing private val preRaan: JsonField<Double>,
        @JsonProperty("preRadiationPressCoeff")
        @ExcludeMissing
        private val preRadiationPressCoeff: JsonField<Double>,
        @JsonProperty("preSigmaU") @ExcludeMissing private val preSigmaU: JsonField<Double>,
        @JsonProperty("preSigmaV") @ExcludeMissing private val preSigmaV: JsonField<Double>,
        @JsonProperty("preSigmaW") @ExcludeMissing private val preSigmaW: JsonField<Double>,
        @JsonProperty("preSMA") @ExcludeMissing private val preSma: JsonField<Double>,
        @JsonProperty("preVelX") @ExcludeMissing private val preVelX: JsonField<Double>,
        @JsonProperty("preVelY") @ExcludeMissing private val preVelY: JsonField<Double>,
        @JsonProperty("preVelZ") @ExcludeMissing private val preVelZ: JsonField<Double>,
        @JsonProperty("reportTime")
        @ExcludeMissing
        private val reportTime: JsonField<OffsetDateTime>,
        @JsonProperty("satNo") @ExcludeMissing private val satNo: JsonField<Int>,
        @JsonProperty("sourcedData")
        @ExcludeMissing
        private val sourcedData: JsonField<List<String>>,
        @JsonProperty("sourcedDataTypes")
        @ExcludeMissing
        private val sourcedDataTypes: JsonField<List<SourcedDataType>>,
        @JsonProperty("stateModel") @ExcludeMissing private val stateModel: JsonField<String>,
        @JsonProperty("stateModelVersion")
        @ExcludeMissing
        private val stateModelVersion: JsonField<Double>,
        @JsonProperty("status") @ExcludeMissing private val status: JsonField<String>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,
        @JsonProperty("totalBurnTime") @ExcludeMissing private val totalBurnTime: JsonField<Double>,
        @JsonProperty("transactionId") @ExcludeMissing private val transactionId: JsonField<String>,
        @JsonProperty("uct") @ExcludeMissing private val uct: JsonField<Boolean>,
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
         * Maneuver event start time in ISO 8601 UTC with microsecond precision. For maneuvers
         * without start and end times, the start time is considered to be the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun eventStartTime(): OffsetDateTime = eventStartTime.getRequired("eventStartTime")

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
         * Optional algorithm used to produce this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun algorithm(): Optional<String> = algorithm.getOptional("algorithm")

        /**
         * Optional purpose of the maneuver if known (e.g. North-South Station Keeping, East-West
         * Station Keeping, Longitude Shift, Unknown).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun characterization(): Optional<String> = characterization.getOptional("characterization")

        /**
         * Uncertainty in the characterization or purpose assessment of this maneuver (0 - 1).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun characterizationUnc(): Optional<Double> =
            characterizationUnc.getOptional("characterizationUnc")

        /**
         * Optional maneuver cross-track/radial/in-track covariance array, in meter and second based
         * units, in the following order: CR_R, CI_R, CI_I, CC_R, CC_I, CC_C, CT_R, CT_I, CT_C,
         * CT_T.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cov(): Optional<List<Double>> = cov.getOptional("cov")

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
         * Difference in mass before and after the maneuver, in kg.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaMass(): Optional<Double> = deltaMass.getOptional("deltaMass")

        /**
         * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors at the
         * maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaPos(): Optional<Double> = deltaPos.getOptional("deltaPos")

        /**
         * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors in the
         * direction of the pre-maneuver 'U' unit vector at the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaPosU(): Optional<Double> = deltaPosU.getOptional("deltaPosU")

        /**
         * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors in the
         * direction of the pre-maneuver 'V' unit vector at the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaPosV(): Optional<Double> = deltaPosV.getOptional("deltaPosV")

        /**
         * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors in the
         * direction of the pre-maneuver 'W' unit vector at the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaPosW(): Optional<Double> = deltaPosW.getOptional("deltaPosW")

        /**
         * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity vectors at
         * the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaVel(): Optional<Double> = deltaVel.getOptional("deltaVel")

        /**
         * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity vectors in
         * the direction of the pre-maneuver 'U' unit vector at the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaVelU(): Optional<Double> = deltaVelU.getOptional("deltaVelU")

        /**
         * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity vectors in
         * the direction of the pre-maneuver 'V' unit vector at the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaVelV(): Optional<Double> = deltaVelV.getOptional("deltaVelV")

        /**
         * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity vectors in
         * the direction of the pre-maneuver 'W' unit vector at the maneuver event time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun deltaVelW(): Optional<Double> = deltaVelW.getOptional("deltaVelW")

        /**
         * Description and notes of the maneuver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional source-provided and searchable metadata or descriptor of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun descriptor(): Optional<String> = descriptor.getOptional("descriptor")

        /**
         * Maneuver event end time in ISO 8601 UTC with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eventEndTime(): Optional<OffsetDateTime> = eventEndTime.getOptional("eventEndTime")

        /**
         * Optional source-provided identifier for this maneuver event. In the case where multiple
         * maneuver records are submitted for the same event, this field can be used to tie them
         * together to the same event.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eventId(): Optional<String> = eventId.getOptional("eventId")

        /**
         * Target maneuvering on-orbit object. For the public catalog, the idOnOrbit is typically
         * the satellite number as a string, but may be a UUID for analyst or other unknown or
         * untracked satellites.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Optional ID of the sensor that detected this maneuver (for example, if detected by
         * passive RF anomalies).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

        /**
         * Uncertainty in the occurrence of this maneuver (0 - 1).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maneuverUnc(): Optional<Double> = maneuverUnc.getOptional("maneuverUnc")

        /**
         * Array of estimated acceleration values, in meters per second squared. Number of elements
         * must match the numAccelPoints.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mnvrAccels(): Optional<List<Double>> = mnvrAccels.getOptional("mnvrAccels")

        /**
         * Array of elapsed times, in seconds from maneuver start time, at which each acceleration
         * point is estimated. Number of elements must match the numAccelPoints.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mnvrAccelTimes(): Optional<List<Double>> = mnvrAccelTimes.getOptional("mnvrAccelTimes")

        /**
         * Array of the 1-sigma uncertainties in estimated accelerations, in meters per second
         * squared. Number of elements must match the numAccelPoints.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun mnvrAccelUncs(): Optional<List<Double>> = mnvrAccelUncs.getOptional("mnvrAccelUncs")

        /**
         * The total number of estimated acceleration points during the maneuver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numAccelPoints(): Optional<Int> = numAccelPoints.getOptional("numAccelPoints")

        /**
         * Number of observations used to generate the maneuver data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numObs(): Optional<Int> = numObs.getOptional("numObs")

        /**
         * Maneuver orbit determination fit data end time in ISO 8601 UTC with microsecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun odFitEndTime(): Optional<OffsetDateTime> = odFitEndTime.getOptional("odFitEndTime")

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
         * Identifier provided by source to indicate the target on-orbit object performing this
         * maneuver. This may be an internal identifier and not necessarily a valid satellite
         * number/ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

        /**
         * Optional identifier provided by source to indicate the sensor identifier used to detect
         * this event. This may be an internal identifier and not necessarily a valid sensor ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

        /**
         * Post-event spacecraft apogee (measured from Earth center), in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postApogee(): Optional<Double> = postApogee.getOptional("postApogee")

        /**
         * Estimated area of the object following the maneuver, in meters squared.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postArea(): Optional<Double> = postArea.getOptional("postArea")

        /**
         * Post-event ballistic coefficient. The units of the ballistic coefficient vary depending
         * on provider. Users should consult the data provider to verify the units of the ballistic
         * coefficient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postBallisticCoeff(): Optional<Double> =
            postBallisticCoeff.getOptional("postBallisticCoeff")

        /**
         * Post-event GEO drift rate of the spacecraft, in degrees per day. Negative values indicate
         * westward drift.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postDriftRate(): Optional<Double> = postDriftRate.getOptional("postDriftRate")

        /**
         * Post-event spacecraft eccentricity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postEccentricity(): Optional<Double> = postEccentricity.getOptional("postEccentricity")

        /**
         * An element set is a collection of Keplerian orbital elements describing an orbit of a
         * particular satellite. The data is used along with an orbit propagator in order to predict
         * the motion of a satellite. The element set, or elset for short, consists of
         * identification data, the classical elements and drag parameters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postEventElset(): Optional<PostEventElset> =
            postEventElset.getOptional("postEventElset")

        /**
         * Optional identifier of the element set for the post-maneuver orbit.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postEventIdElset(): Optional<String> = postEventIdElset.getOptional("postEventIdElset")

        /**
         * Optional identifier of the state vector for the post-maneuver trajectory of the
         * spacecraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postEventIdStateVector(): Optional<String> =
            postEventIdStateVector.getOptional("postEventIdStateVector")

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
        fun postEventStateVector(): Optional<PostEventStateVector> =
            postEventStateVector.getOptional("postEventStateVector")

        /**
         * Post-event spacecraft WGS-84 GEO belt longitude, represented as -180 to 180 degrees
         * (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postGeoLongitude(): Optional<Double> = postGeoLongitude.getOptional("postGeoLongitude")

        /**
         * Post-event spacecraft orbital inclination, in degrees. 0-180.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postInclination(): Optional<Double> = postInclination.getOptional("postInclination")

        /**
         * Estimated mass of the object following the maneuver, in kg.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postMass(): Optional<Double> = postMass.getOptional("postMass")

        /**
         * Post-event spacecraft perigee (measured from Earth center), in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postPerigee(): Optional<Double> = postPerigee.getOptional("postPerigee")

        /**
         * Post-event spacecraft orbital period, in minutes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postPeriod(): Optional<Double> = postPeriod.getOptional("postPeriod")

        /**
         * Post-event X component of position in ECI space, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postPosX(): Optional<Double> = postPosX.getOptional("postPosX")

        /**
         * Post-event Y component of position in ECI space, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postPosY(): Optional<Double> = postPosY.getOptional("postPosY")

        /**
         * Post-event Z component of position in ECI space, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postPosZ(): Optional<Double> = postPosZ.getOptional("postPosZ")

        /**
         * Post-event spacecraft Right Ascension of the Ascending Node (RAAN), in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postRaan(): Optional<Double> = postRaan.getOptional("postRAAN")

        /**
         * Post-event radiation pressure coefficient. The units of the radiation pressure
         * coefficient vary depending on provider. Users should consult the data provider to verify
         * the units of the radiation pressure coefficient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postRadiationPressCoeff(): Optional<Double> =
            postRadiationPressCoeff.getOptional("postRadiationPressCoeff")

        /**
         * Post-event standard deviation, in kilometers, of spacecraft position in the 'U' unit
         * vector direction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postSigmaU(): Optional<Double> = postSigmaU.getOptional("postSigmaU")

        /**
         * Post-event standard deviation, in kilometers, of spacecraft position in the 'V' unit
         * vector direction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postSigmaV(): Optional<Double> = postSigmaV.getOptional("postSigmaV")

        /**
         * Post-event standard deviation, in kilometers, of spacecraft position in the 'W' unit
         * vector direction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postSigmaW(): Optional<Double> = postSigmaW.getOptional("postSigmaW")

        /**
         * Post-event spacecraft Semi-Major Axis (SMA), in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postSma(): Optional<Double> = postSma.getOptional("postSMA")

        /**
         * Post-event X component of velocity in ECI space, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postVelX(): Optional<Double> = postVelX.getOptional("postVelX")

        /**
         * Post-event Y component of velocity in ECI space, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postVelY(): Optional<Double> = postVelY.getOptional("postVelY")

        /**
         * Post-event Z component of velocity in ECI space, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postVelZ(): Optional<Double> = postVelZ.getOptional("postVelZ")

        /**
         * Pre-event spacecraft apogee (measured from Earth center), in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preApogee(): Optional<Double> = preApogee.getOptional("preApogee")

        /**
         * Pre-event ballistic coefficient. The units of the ballistic coefficient vary depending on
         * provider. Users should consult the data provider to verify the units of the ballistic
         * coefficient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preBallisticCoeff(): Optional<Double> =
            preBallisticCoeff.getOptional("preBallisticCoeff")

        /**
         * Pre-event GEO drift rate of the spacecraft, in degrees per day. Negative values indicate
         * westward drift.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preDriftRate(): Optional<Double> = preDriftRate.getOptional("preDriftRate")

        /**
         * Pre-event spacecraft eccentricity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preEccentricity(): Optional<Double> = preEccentricity.getOptional("preEccentricity")

        /**
         * An element set is a collection of Keplerian orbital elements describing an orbit of a
         * particular satellite. The data is used along with an orbit propagator in order to predict
         * the motion of a satellite. The element set, or elset for short, consists of
         * identification data, the classical elements and drag parameters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preEventElset(): Optional<PreEventElset> = preEventElset.getOptional("preEventElset")

        /**
         * Optional identifier of the element set for the pre-maneuver orbit.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preEventIdElset(): Optional<String> = preEventIdElset.getOptional("preEventIdElset")

        /**
         * Optional identifier of the state vector for the pre-maneuver trajectory of the
         * spacecraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preEventIdStateVector(): Optional<String> =
            preEventIdStateVector.getOptional("preEventIdStateVector")

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
        fun preEventStateVector(): Optional<PreEventStateVector> =
            preEventStateVector.getOptional("preEventStateVector")

        /**
         * Pre-event spacecraft WGS-84 GEO belt longitude, represented as -180 to 180 degrees
         * (negative values west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preGeoLongitude(): Optional<Double> = preGeoLongitude.getOptional("preGeoLongitude")

        /**
         * Pre-event spacecraft orbital inclination, in degrees. 0-180.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preInclination(): Optional<Double> = preInclination.getOptional("preInclination")

        /**
         * Pre-event spacecraft perigee (measured from Earth center), in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun prePerigee(): Optional<Double> = prePerigee.getOptional("prePerigee")

        /**
         * Pre-event spacecraft orbital period, in minutes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun prePeriod(): Optional<Double> = prePeriod.getOptional("prePeriod")

        /**
         * Pre-event X component of position in ECI space, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun prePosX(): Optional<Double> = prePosX.getOptional("prePosX")

        /**
         * Pre-event Y component of position in ECI space, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun prePosY(): Optional<Double> = prePosY.getOptional("prePosY")

        /**
         * Pre-event Z component of position in ECI space, in km.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun prePosZ(): Optional<Double> = prePosZ.getOptional("prePosZ")

        /**
         * Pre-event spacecraft Right Ascension of the Ascending Node (RAAN), in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preRaan(): Optional<Double> = preRaan.getOptional("preRAAN")

        /**
         * Pre-event radiation pressure coefficient. The units of the radiation pressure coefficient
         * vary depending on provider. Users should consult the data provider to verify the units of
         * the radiation pressure coefficient.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preRadiationPressCoeff(): Optional<Double> =
            preRadiationPressCoeff.getOptional("preRadiationPressCoeff")

        /**
         * Pre-event standard deviation, in kilometers, of spacecraft position in the 'U' unit
         * vector direction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preSigmaU(): Optional<Double> = preSigmaU.getOptional("preSigmaU")

        /**
         * Pre-event standard deviation, in kilometers, of spacecraft position in the 'V' unit
         * vector direction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preSigmaV(): Optional<Double> = preSigmaV.getOptional("preSigmaV")

        /**
         * Pre-event standard deviation, in kilometers, of spacecraft position in the 'W' unit
         * vector direction.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preSigmaW(): Optional<Double> = preSigmaW.getOptional("preSigmaW")

        /**
         * Pre-event spacecraft orbital Semi-Major Axis (SMA), in kilometers.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preSma(): Optional<Double> = preSma.getOptional("preSMA")

        /**
         * Pre-event X component of velocity in ECI space, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preVelX(): Optional<Double> = preVelX.getOptional("preVelX")

        /**
         * Pre-event Y component of velocity in ECI space, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preVelY(): Optional<Double> = preVelY.getOptional("preVelY")

        /**
         * Pre-event Z component of velocity in ECI space, in km/sec.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preVelZ(): Optional<Double> = preVelZ.getOptional("preVelZ")

        /**
         * The time that the report or alert of this maneuver was generated, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reportTime(): Optional<OffsetDateTime> = reportTime.getOptional("reportTime")

        /**
         * Satellite/Catalog number of the target on-orbit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun satNo(): Optional<Int> = satNo.getOptional("satNo")

        /**
         * Optional array of UDL data (elsets, state vectors, etc) UUIDs used to build this
         * maneuver. See the associated sourcedDataTypes array for the specific types of data for
         * the positionally corresponding UUIDs in this array (the two arrays must match in size).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourcedData(): Optional<List<String>> = sourcedData.getOptional("sourcedData")

        /**
         * Optional array of UDL data types used to build this maneuver (e.g. EO, RADAR, RF, DOA,
         * ELSET, SV). See the associated sourcedData array for the specific UUIDs of data for the
         * positionally corresponding data types in this array (the two arrays must match in size).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sourcedDataTypes(): Optional<List<SourcedDataType>> =
            sourcedDataTypes.getOptional("sourcedDataTypes")

        /**
         * Name of the state model used to generate the maneuver data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stateModel(): Optional<String> = stateModel.getOptional("stateModel")

        /**
         * Version of the state model used to generate the maneuver data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stateModelVersion(): Optional<Double> =
            stateModelVersion.getOptional("stateModelVersion")

        /**
         * Status of this maneuver (CANCELLED, PLANNED, POSSIBLE, REDACTED, VERIFIED).
         *
         * CANCELLED: A previously planned maneuver whose execution was cancelled.
         *
         * PLANNED: A maneuver planned to take place at the eventStartTime.
         *
         * POSSIBLE: A possible maneuver detected by observation of the spacecraft or by evaluation
         * of the spacecraft orbit.
         *
         * REDACTED: A redaction of a reported possible maneuver that has been determined to have
         * not taken place after further observation/evaluation.
         *
         * VERIFIED: A maneuver whose execution has been verified, either by the owner/operator or
         * observation/evaluation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

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
         * The estimated total active burn time of a maneuver, in seconds. This includes the sum of
         * all burns in numAccelPoints. Not to be confused with the total duration of the maneuver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun totalBurnTime(): Optional<Double> = totalBurnTime.getOptional("totalBurnTime")

        /**
         * Optional identifier to track a commercial or marketplace transaction executed to produce
         * this data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transactionId(): Optional<String> = transactionId.getOptional("transactionId")

        /**
         * Boolean indicating this maneuver was unable to be correlated to a known object. This flag
         * should only be set to true by data providers after an attempt to correlate to an on-orbit
         * object was made and failed. If unable to correlate, the 'origObjectId' field may be
         * populated with an internal data provider specific identifier.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
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
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [eventStartTime].
         *
         * Unlike [eventStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eventStartTime")
        @ExcludeMissing
        fun _eventStartTime(): JsonField<OffsetDateTime> = eventStartTime

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
         * Returns the raw JSON value of [algorithm].
         *
         * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("algorithm") @ExcludeMissing fun _algorithm(): JsonField<String> = algorithm

        /**
         * Returns the raw JSON value of [characterization].
         *
         * Unlike [characterization], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("characterization")
        @ExcludeMissing
        fun _characterization(): JsonField<String> = characterization

        /**
         * Returns the raw JSON value of [characterizationUnc].
         *
         * Unlike [characterizationUnc], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("characterizationUnc")
        @ExcludeMissing
        fun _characterizationUnc(): JsonField<Double> = characterizationUnc

        /**
         * Returns the raw JSON value of [cov].
         *
         * Unlike [cov], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cov") @ExcludeMissing fun _cov(): JsonField<List<Double>> = cov

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
         * Returns the raw JSON value of [deltaMass].
         *
         * Unlike [deltaMass], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaMass") @ExcludeMissing fun _deltaMass(): JsonField<Double> = deltaMass

        /**
         * Returns the raw JSON value of [deltaPos].
         *
         * Unlike [deltaPos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaPos") @ExcludeMissing fun _deltaPos(): JsonField<Double> = deltaPos

        /**
         * Returns the raw JSON value of [deltaPosU].
         *
         * Unlike [deltaPosU], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaPosU") @ExcludeMissing fun _deltaPosU(): JsonField<Double> = deltaPosU

        /**
         * Returns the raw JSON value of [deltaPosV].
         *
         * Unlike [deltaPosV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaPosV") @ExcludeMissing fun _deltaPosV(): JsonField<Double> = deltaPosV

        /**
         * Returns the raw JSON value of [deltaPosW].
         *
         * Unlike [deltaPosW], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaPosW") @ExcludeMissing fun _deltaPosW(): JsonField<Double> = deltaPosW

        /**
         * Returns the raw JSON value of [deltaVel].
         *
         * Unlike [deltaVel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaVel") @ExcludeMissing fun _deltaVel(): JsonField<Double> = deltaVel

        /**
         * Returns the raw JSON value of [deltaVelU].
         *
         * Unlike [deltaVelU], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaVelU") @ExcludeMissing fun _deltaVelU(): JsonField<Double> = deltaVelU

        /**
         * Returns the raw JSON value of [deltaVelV].
         *
         * Unlike [deltaVelV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaVelV") @ExcludeMissing fun _deltaVelV(): JsonField<Double> = deltaVelV

        /**
         * Returns the raw JSON value of [deltaVelW].
         *
         * Unlike [deltaVelW], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("deltaVelW") @ExcludeMissing fun _deltaVelW(): JsonField<Double> = deltaVelW

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [descriptor].
         *
         * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Returns the raw JSON value of [eventEndTime].
         *
         * Unlike [eventEndTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eventEndTime")
        @ExcludeMissing
        fun _eventEndTime(): JsonField<OffsetDateTime> = eventEndTime

        /**
         * Returns the raw JSON value of [eventId].
         *
         * Unlike [eventId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eventId") @ExcludeMissing fun _eventId(): JsonField<String> = eventId

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
         * Returns the raw JSON value of [maneuverUnc].
         *
         * Unlike [maneuverUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maneuverUnc")
        @ExcludeMissing
        fun _maneuverUnc(): JsonField<Double> = maneuverUnc

        /**
         * Returns the raw JSON value of [mnvrAccels].
         *
         * Unlike [mnvrAccels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnvrAccels")
        @ExcludeMissing
        fun _mnvrAccels(): JsonField<List<Double>> = mnvrAccels

        /**
         * Returns the raw JSON value of [mnvrAccelTimes].
         *
         * Unlike [mnvrAccelTimes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mnvrAccelTimes")
        @ExcludeMissing
        fun _mnvrAccelTimes(): JsonField<List<Double>> = mnvrAccelTimes

        /**
         * Returns the raw JSON value of [mnvrAccelUncs].
         *
         * Unlike [mnvrAccelUncs], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mnvrAccelUncs")
        @ExcludeMissing
        fun _mnvrAccelUncs(): JsonField<List<Double>> = mnvrAccelUncs

        /**
         * Returns the raw JSON value of [numAccelPoints].
         *
         * Unlike [numAccelPoints], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numAccelPoints")
        @ExcludeMissing
        fun _numAccelPoints(): JsonField<Int> = numAccelPoints

        /**
         * Returns the raw JSON value of [numObs].
         *
         * Unlike [numObs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numObs") @ExcludeMissing fun _numObs(): JsonField<Int> = numObs

        /**
         * Returns the raw JSON value of [odFitEndTime].
         *
         * Unlike [odFitEndTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("odFitEndTime")
        @ExcludeMissing
        fun _odFitEndTime(): JsonField<OffsetDateTime> = odFitEndTime

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
         * Returns the raw JSON value of [postApogee].
         *
         * Unlike [postApogee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postApogee")
        @ExcludeMissing
        fun _postApogee(): JsonField<Double> = postApogee

        /**
         * Returns the raw JSON value of [postArea].
         *
         * Unlike [postArea], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postArea") @ExcludeMissing fun _postArea(): JsonField<Double> = postArea

        /**
         * Returns the raw JSON value of [postBallisticCoeff].
         *
         * Unlike [postBallisticCoeff], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("postBallisticCoeff")
        @ExcludeMissing
        fun _postBallisticCoeff(): JsonField<Double> = postBallisticCoeff

        /**
         * Returns the raw JSON value of [postDriftRate].
         *
         * Unlike [postDriftRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postDriftRate")
        @ExcludeMissing
        fun _postDriftRate(): JsonField<Double> = postDriftRate

        /**
         * Returns the raw JSON value of [postEccentricity].
         *
         * Unlike [postEccentricity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postEccentricity")
        @ExcludeMissing
        fun _postEccentricity(): JsonField<Double> = postEccentricity

        /**
         * Returns the raw JSON value of [postEventElset].
         *
         * Unlike [postEventElset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postEventElset")
        @ExcludeMissing
        fun _postEventElset(): JsonField<PostEventElset> = postEventElset

        /**
         * Returns the raw JSON value of [postEventIdElset].
         *
         * Unlike [postEventIdElset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postEventIdElset")
        @ExcludeMissing
        fun _postEventIdElset(): JsonField<String> = postEventIdElset

        /**
         * Returns the raw JSON value of [postEventIdStateVector].
         *
         * Unlike [postEventIdStateVector], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("postEventIdStateVector")
        @ExcludeMissing
        fun _postEventIdStateVector(): JsonField<String> = postEventIdStateVector

        /**
         * Returns the raw JSON value of [postEventStateVector].
         *
         * Unlike [postEventStateVector], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("postEventStateVector")
        @ExcludeMissing
        fun _postEventStateVector(): JsonField<PostEventStateVector> = postEventStateVector

        /**
         * Returns the raw JSON value of [postGeoLongitude].
         *
         * Unlike [postGeoLongitude], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postGeoLongitude")
        @ExcludeMissing
        fun _postGeoLongitude(): JsonField<Double> = postGeoLongitude

        /**
         * Returns the raw JSON value of [postInclination].
         *
         * Unlike [postInclination], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postInclination")
        @ExcludeMissing
        fun _postInclination(): JsonField<Double> = postInclination

        /**
         * Returns the raw JSON value of [postMass].
         *
         * Unlike [postMass], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postMass") @ExcludeMissing fun _postMass(): JsonField<Double> = postMass

        /**
         * Returns the raw JSON value of [postPerigee].
         *
         * Unlike [postPerigee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postPerigee")
        @ExcludeMissing
        fun _postPerigee(): JsonField<Double> = postPerigee

        /**
         * Returns the raw JSON value of [postPeriod].
         *
         * Unlike [postPeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postPeriod")
        @ExcludeMissing
        fun _postPeriod(): JsonField<Double> = postPeriod

        /**
         * Returns the raw JSON value of [postPosX].
         *
         * Unlike [postPosX], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postPosX") @ExcludeMissing fun _postPosX(): JsonField<Double> = postPosX

        /**
         * Returns the raw JSON value of [postPosY].
         *
         * Unlike [postPosY], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postPosY") @ExcludeMissing fun _postPosY(): JsonField<Double> = postPosY

        /**
         * Returns the raw JSON value of [postPosZ].
         *
         * Unlike [postPosZ], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postPosZ") @ExcludeMissing fun _postPosZ(): JsonField<Double> = postPosZ

        /**
         * Returns the raw JSON value of [postRaan].
         *
         * Unlike [postRaan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postRAAN") @ExcludeMissing fun _postRaan(): JsonField<Double> = postRaan

        /**
         * Returns the raw JSON value of [postRadiationPressCoeff].
         *
         * Unlike [postRadiationPressCoeff], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("postRadiationPressCoeff")
        @ExcludeMissing
        fun _postRadiationPressCoeff(): JsonField<Double> = postRadiationPressCoeff

        /**
         * Returns the raw JSON value of [postSigmaU].
         *
         * Unlike [postSigmaU], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postSigmaU")
        @ExcludeMissing
        fun _postSigmaU(): JsonField<Double> = postSigmaU

        /**
         * Returns the raw JSON value of [postSigmaV].
         *
         * Unlike [postSigmaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postSigmaV")
        @ExcludeMissing
        fun _postSigmaV(): JsonField<Double> = postSigmaV

        /**
         * Returns the raw JSON value of [postSigmaW].
         *
         * Unlike [postSigmaW], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postSigmaW")
        @ExcludeMissing
        fun _postSigmaW(): JsonField<Double> = postSigmaW

        /**
         * Returns the raw JSON value of [postSma].
         *
         * Unlike [postSma], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postSMA") @ExcludeMissing fun _postSma(): JsonField<Double> = postSma

        /**
         * Returns the raw JSON value of [postVelX].
         *
         * Unlike [postVelX], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postVelX") @ExcludeMissing fun _postVelX(): JsonField<Double> = postVelX

        /**
         * Returns the raw JSON value of [postVelY].
         *
         * Unlike [postVelY], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postVelY") @ExcludeMissing fun _postVelY(): JsonField<Double> = postVelY

        /**
         * Returns the raw JSON value of [postVelZ].
         *
         * Unlike [postVelZ], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postVelZ") @ExcludeMissing fun _postVelZ(): JsonField<Double> = postVelZ

        /**
         * Returns the raw JSON value of [preApogee].
         *
         * Unlike [preApogee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preApogee") @ExcludeMissing fun _preApogee(): JsonField<Double> = preApogee

        /**
         * Returns the raw JSON value of [preBallisticCoeff].
         *
         * Unlike [preBallisticCoeff], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preBallisticCoeff")
        @ExcludeMissing
        fun _preBallisticCoeff(): JsonField<Double> = preBallisticCoeff

        /**
         * Returns the raw JSON value of [preDriftRate].
         *
         * Unlike [preDriftRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preDriftRate")
        @ExcludeMissing
        fun _preDriftRate(): JsonField<Double> = preDriftRate

        /**
         * Returns the raw JSON value of [preEccentricity].
         *
         * Unlike [preEccentricity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preEccentricity")
        @ExcludeMissing
        fun _preEccentricity(): JsonField<Double> = preEccentricity

        /**
         * Returns the raw JSON value of [preEventElset].
         *
         * Unlike [preEventElset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preEventElset")
        @ExcludeMissing
        fun _preEventElset(): JsonField<PreEventElset> = preEventElset

        /**
         * Returns the raw JSON value of [preEventIdElset].
         *
         * Unlike [preEventIdElset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preEventIdElset")
        @ExcludeMissing
        fun _preEventIdElset(): JsonField<String> = preEventIdElset

        /**
         * Returns the raw JSON value of [preEventIdStateVector].
         *
         * Unlike [preEventIdStateVector], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preEventIdStateVector")
        @ExcludeMissing
        fun _preEventIdStateVector(): JsonField<String> = preEventIdStateVector

        /**
         * Returns the raw JSON value of [preEventStateVector].
         *
         * Unlike [preEventStateVector], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preEventStateVector")
        @ExcludeMissing
        fun _preEventStateVector(): JsonField<PreEventStateVector> = preEventStateVector

        /**
         * Returns the raw JSON value of [preGeoLongitude].
         *
         * Unlike [preGeoLongitude], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preGeoLongitude")
        @ExcludeMissing
        fun _preGeoLongitude(): JsonField<Double> = preGeoLongitude

        /**
         * Returns the raw JSON value of [preInclination].
         *
         * Unlike [preInclination], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preInclination")
        @ExcludeMissing
        fun _preInclination(): JsonField<Double> = preInclination

        /**
         * Returns the raw JSON value of [prePerigee].
         *
         * Unlike [prePerigee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prePerigee")
        @ExcludeMissing
        fun _prePerigee(): JsonField<Double> = prePerigee

        /**
         * Returns the raw JSON value of [prePeriod].
         *
         * Unlike [prePeriod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prePeriod") @ExcludeMissing fun _prePeriod(): JsonField<Double> = prePeriod

        /**
         * Returns the raw JSON value of [prePosX].
         *
         * Unlike [prePosX], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prePosX") @ExcludeMissing fun _prePosX(): JsonField<Double> = prePosX

        /**
         * Returns the raw JSON value of [prePosY].
         *
         * Unlike [prePosY], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prePosY") @ExcludeMissing fun _prePosY(): JsonField<Double> = prePosY

        /**
         * Returns the raw JSON value of [prePosZ].
         *
         * Unlike [prePosZ], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prePosZ") @ExcludeMissing fun _prePosZ(): JsonField<Double> = prePosZ

        /**
         * Returns the raw JSON value of [preRaan].
         *
         * Unlike [preRaan], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preRAAN") @ExcludeMissing fun _preRaan(): JsonField<Double> = preRaan

        /**
         * Returns the raw JSON value of [preRadiationPressCoeff].
         *
         * Unlike [preRadiationPressCoeff], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("preRadiationPressCoeff")
        @ExcludeMissing
        fun _preRadiationPressCoeff(): JsonField<Double> = preRadiationPressCoeff

        /**
         * Returns the raw JSON value of [preSigmaU].
         *
         * Unlike [preSigmaU], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preSigmaU") @ExcludeMissing fun _preSigmaU(): JsonField<Double> = preSigmaU

        /**
         * Returns the raw JSON value of [preSigmaV].
         *
         * Unlike [preSigmaV], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preSigmaV") @ExcludeMissing fun _preSigmaV(): JsonField<Double> = preSigmaV

        /**
         * Returns the raw JSON value of [preSigmaW].
         *
         * Unlike [preSigmaW], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preSigmaW") @ExcludeMissing fun _preSigmaW(): JsonField<Double> = preSigmaW

        /**
         * Returns the raw JSON value of [preSma].
         *
         * Unlike [preSma], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preSMA") @ExcludeMissing fun _preSma(): JsonField<Double> = preSma

        /**
         * Returns the raw JSON value of [preVelX].
         *
         * Unlike [preVelX], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preVelX") @ExcludeMissing fun _preVelX(): JsonField<Double> = preVelX

        /**
         * Returns the raw JSON value of [preVelY].
         *
         * Unlike [preVelY], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preVelY") @ExcludeMissing fun _preVelY(): JsonField<Double> = preVelY

        /**
         * Returns the raw JSON value of [preVelZ].
         *
         * Unlike [preVelZ], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("preVelZ") @ExcludeMissing fun _preVelZ(): JsonField<Double> = preVelZ

        /**
         * Returns the raw JSON value of [reportTime].
         *
         * Unlike [reportTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reportTime")
        @ExcludeMissing
        fun _reportTime(): JsonField<OffsetDateTime> = reportTime

        /**
         * Returns the raw JSON value of [satNo].
         *
         * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

        /**
         * Returns the raw JSON value of [sourcedData].
         *
         * Unlike [sourcedData], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourcedData")
        @ExcludeMissing
        fun _sourcedData(): JsonField<List<String>> = sourcedData

        /**
         * Returns the raw JSON value of [sourcedDataTypes].
         *
         * Unlike [sourcedDataTypes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sourcedDataTypes")
        @ExcludeMissing
        fun _sourcedDataTypes(): JsonField<List<SourcedDataType>> = sourcedDataTypes

        /**
         * Returns the raw JSON value of [stateModel].
         *
         * Unlike [stateModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stateModel")
        @ExcludeMissing
        fun _stateModel(): JsonField<String> = stateModel

        /**
         * Returns the raw JSON value of [stateModelVersion].
         *
         * Unlike [stateModelVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("stateModelVersion")
        @ExcludeMissing
        fun _stateModelVersion(): JsonField<Double> = stateModelVersion

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [totalBurnTime].
         *
         * Unlike [totalBurnTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("totalBurnTime")
        @ExcludeMissing
        fun _totalBurnTime(): JsonField<Double> = totalBurnTime

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .eventStartTime()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var eventStartTime: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var algorithm: JsonField<String> = JsonMissing.of()
            private var characterization: JsonField<String> = JsonMissing.of()
            private var characterizationUnc: JsonField<Double> = JsonMissing.of()
            private var cov: JsonField<MutableList<Double>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var deltaMass: JsonField<Double> = JsonMissing.of()
            private var deltaPos: JsonField<Double> = JsonMissing.of()
            private var deltaPosU: JsonField<Double> = JsonMissing.of()
            private var deltaPosV: JsonField<Double> = JsonMissing.of()
            private var deltaPosW: JsonField<Double> = JsonMissing.of()
            private var deltaVel: JsonField<Double> = JsonMissing.of()
            private var deltaVelU: JsonField<Double> = JsonMissing.of()
            private var deltaVelV: JsonField<Double> = JsonMissing.of()
            private var deltaVelW: JsonField<Double> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var eventEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var eventId: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idSensor: JsonField<String> = JsonMissing.of()
            private var maneuverUnc: JsonField<Double> = JsonMissing.of()
            private var mnvrAccels: JsonField<MutableList<Double>>? = null
            private var mnvrAccelTimes: JsonField<MutableList<Double>>? = null
            private var mnvrAccelUncs: JsonField<MutableList<Double>>? = null
            private var numAccelPoints: JsonField<Int> = JsonMissing.of()
            private var numObs: JsonField<Int> = JsonMissing.of()
            private var odFitEndTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origObjectId: JsonField<String> = JsonMissing.of()
            private var origSensorId: JsonField<String> = JsonMissing.of()
            private var postApogee: JsonField<Double> = JsonMissing.of()
            private var postArea: JsonField<Double> = JsonMissing.of()
            private var postBallisticCoeff: JsonField<Double> = JsonMissing.of()
            private var postDriftRate: JsonField<Double> = JsonMissing.of()
            private var postEccentricity: JsonField<Double> = JsonMissing.of()
            private var postEventElset: JsonField<PostEventElset> = JsonMissing.of()
            private var postEventIdElset: JsonField<String> = JsonMissing.of()
            private var postEventIdStateVector: JsonField<String> = JsonMissing.of()
            private var postEventStateVector: JsonField<PostEventStateVector> = JsonMissing.of()
            private var postGeoLongitude: JsonField<Double> = JsonMissing.of()
            private var postInclination: JsonField<Double> = JsonMissing.of()
            private var postMass: JsonField<Double> = JsonMissing.of()
            private var postPerigee: JsonField<Double> = JsonMissing.of()
            private var postPeriod: JsonField<Double> = JsonMissing.of()
            private var postPosX: JsonField<Double> = JsonMissing.of()
            private var postPosY: JsonField<Double> = JsonMissing.of()
            private var postPosZ: JsonField<Double> = JsonMissing.of()
            private var postRaan: JsonField<Double> = JsonMissing.of()
            private var postRadiationPressCoeff: JsonField<Double> = JsonMissing.of()
            private var postSigmaU: JsonField<Double> = JsonMissing.of()
            private var postSigmaV: JsonField<Double> = JsonMissing.of()
            private var postSigmaW: JsonField<Double> = JsonMissing.of()
            private var postSma: JsonField<Double> = JsonMissing.of()
            private var postVelX: JsonField<Double> = JsonMissing.of()
            private var postVelY: JsonField<Double> = JsonMissing.of()
            private var postVelZ: JsonField<Double> = JsonMissing.of()
            private var preApogee: JsonField<Double> = JsonMissing.of()
            private var preBallisticCoeff: JsonField<Double> = JsonMissing.of()
            private var preDriftRate: JsonField<Double> = JsonMissing.of()
            private var preEccentricity: JsonField<Double> = JsonMissing.of()
            private var preEventElset: JsonField<PreEventElset> = JsonMissing.of()
            private var preEventIdElset: JsonField<String> = JsonMissing.of()
            private var preEventIdStateVector: JsonField<String> = JsonMissing.of()
            private var preEventStateVector: JsonField<PreEventStateVector> = JsonMissing.of()
            private var preGeoLongitude: JsonField<Double> = JsonMissing.of()
            private var preInclination: JsonField<Double> = JsonMissing.of()
            private var prePerigee: JsonField<Double> = JsonMissing.of()
            private var prePeriod: JsonField<Double> = JsonMissing.of()
            private var prePosX: JsonField<Double> = JsonMissing.of()
            private var prePosY: JsonField<Double> = JsonMissing.of()
            private var prePosZ: JsonField<Double> = JsonMissing.of()
            private var preRaan: JsonField<Double> = JsonMissing.of()
            private var preRadiationPressCoeff: JsonField<Double> = JsonMissing.of()
            private var preSigmaU: JsonField<Double> = JsonMissing.of()
            private var preSigmaV: JsonField<Double> = JsonMissing.of()
            private var preSigmaW: JsonField<Double> = JsonMissing.of()
            private var preSma: JsonField<Double> = JsonMissing.of()
            private var preVelX: JsonField<Double> = JsonMissing.of()
            private var preVelY: JsonField<Double> = JsonMissing.of()
            private var preVelZ: JsonField<Double> = JsonMissing.of()
            private var reportTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var satNo: JsonField<Int> = JsonMissing.of()
            private var sourcedData: JsonField<MutableList<String>>? = null
            private var sourcedDataTypes: JsonField<MutableList<SourcedDataType>>? = null
            private var stateModel: JsonField<String> = JsonMissing.of()
            private var stateModelVersion: JsonField<Double> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var totalBurnTime: JsonField<Double> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var uct: JsonField<Boolean> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                eventStartTime = body.eventStartTime
                source = body.source
                id = body.id
                algorithm = body.algorithm
                characterization = body.characterization
                characterizationUnc = body.characterizationUnc
                cov = body.cov.map { it.toMutableList() }
                createdAt = body.createdAt
                createdBy = body.createdBy
                deltaMass = body.deltaMass
                deltaPos = body.deltaPos
                deltaPosU = body.deltaPosU
                deltaPosV = body.deltaPosV
                deltaPosW = body.deltaPosW
                deltaVel = body.deltaVel
                deltaVelU = body.deltaVelU
                deltaVelV = body.deltaVelV
                deltaVelW = body.deltaVelW
                description = body.description
                descriptor = body.descriptor
                eventEndTime = body.eventEndTime
                eventId = body.eventId
                idOnOrbit = body.idOnOrbit
                idSensor = body.idSensor
                maneuverUnc = body.maneuverUnc
                mnvrAccels = body.mnvrAccels.map { it.toMutableList() }
                mnvrAccelTimes = body.mnvrAccelTimes.map { it.toMutableList() }
                mnvrAccelUncs = body.mnvrAccelUncs.map { it.toMutableList() }
                numAccelPoints = body.numAccelPoints
                numObs = body.numObs
                odFitEndTime = body.odFitEndTime
                origin = body.origin
                origNetwork = body.origNetwork
                origObjectId = body.origObjectId
                origSensorId = body.origSensorId
                postApogee = body.postApogee
                postArea = body.postArea
                postBallisticCoeff = body.postBallisticCoeff
                postDriftRate = body.postDriftRate
                postEccentricity = body.postEccentricity
                postEventElset = body.postEventElset
                postEventIdElset = body.postEventIdElset
                postEventIdStateVector = body.postEventIdStateVector
                postEventStateVector = body.postEventStateVector
                postGeoLongitude = body.postGeoLongitude
                postInclination = body.postInclination
                postMass = body.postMass
                postPerigee = body.postPerigee
                postPeriod = body.postPeriod
                postPosX = body.postPosX
                postPosY = body.postPosY
                postPosZ = body.postPosZ
                postRaan = body.postRaan
                postRadiationPressCoeff = body.postRadiationPressCoeff
                postSigmaU = body.postSigmaU
                postSigmaV = body.postSigmaV
                postSigmaW = body.postSigmaW
                postSma = body.postSma
                postVelX = body.postVelX
                postVelY = body.postVelY
                postVelZ = body.postVelZ
                preApogee = body.preApogee
                preBallisticCoeff = body.preBallisticCoeff
                preDriftRate = body.preDriftRate
                preEccentricity = body.preEccentricity
                preEventElset = body.preEventElset
                preEventIdElset = body.preEventIdElset
                preEventIdStateVector = body.preEventIdStateVector
                preEventStateVector = body.preEventStateVector
                preGeoLongitude = body.preGeoLongitude
                preInclination = body.preInclination
                prePerigee = body.prePerigee
                prePeriod = body.prePeriod
                prePosX = body.prePosX
                prePosY = body.prePosY
                prePosZ = body.prePosZ
                preRaan = body.preRaan
                preRadiationPressCoeff = body.preRadiationPressCoeff
                preSigmaU = body.preSigmaU
                preSigmaV = body.preSigmaV
                preSigmaW = body.preSigmaW
                preSma = body.preSma
                preVelX = body.preVelX
                preVelY = body.preVelY
                preVelZ = body.preVelZ
                reportTime = body.reportTime
                satNo = body.satNo
                sourcedData = body.sourcedData.map { it.toMutableList() }
                sourcedDataTypes = body.sourcedDataTypes.map { it.toMutableList() }
                stateModel = body.stateModel
                stateModelVersion = body.stateModelVersion
                status = body.status
                tags = body.tags.map { it.toMutableList() }
                totalBurnTime = body.totalBurnTime
                transactionId = body.transactionId
                uct = body.uct
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
             * Maneuver event start time in ISO 8601 UTC with microsecond precision. For maneuvers
             * without start and end times, the start time is considered to be the maneuver event
             * time.
             */
            fun eventStartTime(eventStartTime: OffsetDateTime) =
                eventStartTime(JsonField.of(eventStartTime))

            /**
             * Sets [Builder.eventStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eventStartTime(eventStartTime: JsonField<OffsetDateTime>) = apply {
                this.eventStartTime = eventStartTime
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

            /** Optional algorithm used to produce this record. */
            fun algorithm(algorithm: String) = algorithm(JsonField.of(algorithm))

            /**
             * Sets [Builder.algorithm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.algorithm] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun algorithm(algorithm: JsonField<String>) = apply { this.algorithm = algorithm }

            /**
             * Optional purpose of the maneuver if known (e.g. North-South Station Keeping,
             * East-West Station Keeping, Longitude Shift, Unknown).
             */
            fun characterization(characterization: String) =
                characterization(JsonField.of(characterization))

            /**
             * Sets [Builder.characterization] to an arbitrary JSON value.
             *
             * You should usually call [Builder.characterization] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun characterization(characterization: JsonField<String>) = apply {
                this.characterization = characterization
            }

            /**
             * Uncertainty in the characterization or purpose assessment of this maneuver (0 - 1).
             */
            fun characterizationUnc(characterizationUnc: Double) =
                characterizationUnc(JsonField.of(characterizationUnc))

            /**
             * Sets [Builder.characterizationUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.characterizationUnc] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun characterizationUnc(characterizationUnc: JsonField<Double>) = apply {
                this.characterizationUnc = characterizationUnc
            }

            /**
             * Optional maneuver cross-track/radial/in-track covariance array, in meter and second
             * based units, in the following order: CR_R, CI_R, CI_I, CC_R, CC_I, CC_C, CT_R, CT_I,
             * CT_C, CT_T.
             */
            fun cov(cov: List<Double>) = cov(JsonField.of(cov))

            /**
             * Sets [Builder.cov] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cov] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /** Difference in mass before and after the maneuver, in kg. */
            fun deltaMass(deltaMass: Double) = deltaMass(JsonField.of(deltaMass))

            /**
             * Sets [Builder.deltaMass] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaMass] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaMass(deltaMass: JsonField<Double>) = apply { this.deltaMass = deltaMass }

            /**
             * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors at
             * the maneuver event time.
             */
            fun deltaPos(deltaPos: Double) = deltaPos(JsonField.of(deltaPos))

            /**
             * Sets [Builder.deltaPos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaPos] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaPos(deltaPos: JsonField<Double>) = apply { this.deltaPos = deltaPos }

            /**
             * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors in
             * the direction of the pre-maneuver 'U' unit vector at the maneuver event time.
             */
            fun deltaPosU(deltaPosU: Double) = deltaPosU(JsonField.of(deltaPosU))

            /**
             * Sets [Builder.deltaPosU] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaPosU] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaPosU(deltaPosU: JsonField<Double>) = apply { this.deltaPosU = deltaPosU }

            /**
             * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors in
             * the direction of the pre-maneuver 'V' unit vector at the maneuver event time.
             */
            fun deltaPosV(deltaPosV: Double) = deltaPosV(JsonField.of(deltaPosV))

            /**
             * Sets [Builder.deltaPosV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaPosV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaPosV(deltaPosV: JsonField<Double>) = apply { this.deltaPosV = deltaPosV }

            /**
             * Magnitude, in km, of the difference in the pre- and post-maneuver position vectors in
             * the direction of the pre-maneuver 'W' unit vector at the maneuver event time.
             */
            fun deltaPosW(deltaPosW: Double) = deltaPosW(JsonField.of(deltaPosW))

            /**
             * Sets [Builder.deltaPosW] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaPosW] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaPosW(deltaPosW: JsonField<Double>) = apply { this.deltaPosW = deltaPosW }

            /**
             * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity
             * vectors at the maneuver event time.
             */
            fun deltaVel(deltaVel: Double) = deltaVel(JsonField.of(deltaVel))

            /**
             * Sets [Builder.deltaVel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaVel] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaVel(deltaVel: JsonField<Double>) = apply { this.deltaVel = deltaVel }

            /**
             * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity
             * vectors in the direction of the pre-maneuver 'U' unit vector at the maneuver event
             * time.
             */
            fun deltaVelU(deltaVelU: Double) = deltaVelU(JsonField.of(deltaVelU))

            /**
             * Sets [Builder.deltaVelU] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaVelU] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaVelU(deltaVelU: JsonField<Double>) = apply { this.deltaVelU = deltaVelU }

            /**
             * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity
             * vectors in the direction of the pre-maneuver 'V' unit vector at the maneuver event
             * time.
             */
            fun deltaVelV(deltaVelV: Double) = deltaVelV(JsonField.of(deltaVelV))

            /**
             * Sets [Builder.deltaVelV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaVelV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaVelV(deltaVelV: JsonField<Double>) = apply { this.deltaVelV = deltaVelV }

            /**
             * Magnitude, in km/sec, of the difference in the pre- and post-maneuver velocity
             * vectors in the direction of the pre-maneuver 'W' unit vector at the maneuver event
             * time.
             */
            fun deltaVelW(deltaVelW: Double) = deltaVelW(JsonField.of(deltaVelW))

            /**
             * Sets [Builder.deltaVelW] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deltaVelW] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deltaVelW(deltaVelW: JsonField<Double>) = apply { this.deltaVelW = deltaVelW }

            /** Description and notes of the maneuver. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional source-provided and searchable metadata or descriptor of the data. */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /**
             * Sets [Builder.descriptor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.descriptor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /** Maneuver event end time in ISO 8601 UTC with microsecond precision. */
            fun eventEndTime(eventEndTime: OffsetDateTime) =
                eventEndTime(JsonField.of(eventEndTime))

            /**
             * Sets [Builder.eventEndTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventEndTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun eventEndTime(eventEndTime: JsonField<OffsetDateTime>) = apply {
                this.eventEndTime = eventEndTime
            }

            /**
             * Optional source-provided identifier for this maneuver event. In the case where
             * multiple maneuver records are submitted for the same event, this field can be used to
             * tie them together to the same event.
             */
            fun eventId(eventId: String) = eventId(JsonField.of(eventId))

            /**
             * Sets [Builder.eventId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eventId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eventId(eventId: JsonField<String>) = apply { this.eventId = eventId }

            /**
             * Target maneuvering on-orbit object. For the public catalog, the idOnOrbit is
             * typically the satellite number as a string, but may be a UUID for analyst or other
             * unknown or untracked satellites.
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
             * Optional ID of the sensor that detected this maneuver (for example, if detected by
             * passive RF anomalies).
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

            /** Uncertainty in the occurrence of this maneuver (0 - 1). */
            fun maneuverUnc(maneuverUnc: Double) = maneuverUnc(JsonField.of(maneuverUnc))

            /**
             * Sets [Builder.maneuverUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maneuverUnc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maneuverUnc(maneuverUnc: JsonField<Double>) = apply {
                this.maneuverUnc = maneuverUnc
            }

            /**
             * Array of estimated acceleration values, in meters per second squared. Number of
             * elements must match the numAccelPoints.
             */
            fun mnvrAccels(mnvrAccels: List<Double>) = mnvrAccels(JsonField.of(mnvrAccels))

            /**
             * Sets [Builder.mnvrAccels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnvrAccels] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mnvrAccels(mnvrAccels: JsonField<List<Double>>) = apply {
                this.mnvrAccels = mnvrAccels.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [mnvrAccels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMnvrAccel(mnvrAccel: Double) = apply {
                mnvrAccels =
                    (mnvrAccels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mnvrAccels", it).add(mnvrAccel)
                    }
            }

            /**
             * Array of elapsed times, in seconds from maneuver start time, at which each
             * acceleration point is estimated. Number of elements must match the numAccelPoints.
             */
            fun mnvrAccelTimes(mnvrAccelTimes: List<Double>) =
                mnvrAccelTimes(JsonField.of(mnvrAccelTimes))

            /**
             * Sets [Builder.mnvrAccelTimes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnvrAccelTimes] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mnvrAccelTimes(mnvrAccelTimes: JsonField<List<Double>>) = apply {
                this.mnvrAccelTimes = mnvrAccelTimes.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [mnvrAccelTimes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMnvrAccelTime(mnvrAccelTime: Double) = apply {
                mnvrAccelTimes =
                    (mnvrAccelTimes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mnvrAccelTimes", it).add(mnvrAccelTime)
                    }
            }

            /**
             * Array of the 1-sigma uncertainties in estimated accelerations, in meters per second
             * squared. Number of elements must match the numAccelPoints.
             */
            fun mnvrAccelUncs(mnvrAccelUncs: List<Double>) =
                mnvrAccelUncs(JsonField.of(mnvrAccelUncs))

            /**
             * Sets [Builder.mnvrAccelUncs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnvrAccelUncs] with a well-typed `List<Double>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mnvrAccelUncs(mnvrAccelUncs: JsonField<List<Double>>) = apply {
                this.mnvrAccelUncs = mnvrAccelUncs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [mnvrAccelUncs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMnvrAccelUnc(mnvrAccelUnc: Double) = apply {
                mnvrAccelUncs =
                    (mnvrAccelUncs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("mnvrAccelUncs", it).add(mnvrAccelUnc)
                    }
            }

            /** The total number of estimated acceleration points during the maneuver. */
            fun numAccelPoints(numAccelPoints: Int) = numAccelPoints(JsonField.of(numAccelPoints))

            /**
             * Sets [Builder.numAccelPoints] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numAccelPoints] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numAccelPoints(numAccelPoints: JsonField<Int>) = apply {
                this.numAccelPoints = numAccelPoints
            }

            /** Number of observations used to generate the maneuver data. */
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
             * Maneuver orbit determination fit data end time in ISO 8601 UTC with microsecond
             * precision.
             */
            fun odFitEndTime(odFitEndTime: OffsetDateTime) =
                odFitEndTime(JsonField.of(odFitEndTime))

            /**
             * Sets [Builder.odFitEndTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.odFitEndTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun odFitEndTime(odFitEndTime: JsonField<OffsetDateTime>) = apply {
                this.odFitEndTime = odFitEndTime
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
             * Identifier provided by source to indicate the target on-orbit object performing this
             * maneuver. This may be an internal identifier and not necessarily a valid satellite
             * number/ID.
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
             * Optional identifier provided by source to indicate the sensor identifier used to
             * detect this event. This may be an internal identifier and not necessarily a valid
             * sensor ID.
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

            /** Post-event spacecraft apogee (measured from Earth center), in kilometers. */
            fun postApogee(postApogee: Double) = postApogee(JsonField.of(postApogee))

            /**
             * Sets [Builder.postApogee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postApogee] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postApogee(postApogee: JsonField<Double>) = apply { this.postApogee = postApogee }

            /** Estimated area of the object following the maneuver, in meters squared. */
            fun postArea(postArea: Double) = postArea(JsonField.of(postArea))

            /**
             * Sets [Builder.postArea] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postArea] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postArea(postArea: JsonField<Double>) = apply { this.postArea = postArea }

            /**
             * Post-event ballistic coefficient. The units of the ballistic coefficient vary
             * depending on provider. Users should consult the data provider to verify the units of
             * the ballistic coefficient.
             */
            fun postBallisticCoeff(postBallisticCoeff: Double) =
                postBallisticCoeff(JsonField.of(postBallisticCoeff))

            /**
             * Sets [Builder.postBallisticCoeff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postBallisticCoeff] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postBallisticCoeff(postBallisticCoeff: JsonField<Double>) = apply {
                this.postBallisticCoeff = postBallisticCoeff
            }

            /**
             * Post-event GEO drift rate of the spacecraft, in degrees per day. Negative values
             * indicate westward drift.
             */
            fun postDriftRate(postDriftRate: Double) = postDriftRate(JsonField.of(postDriftRate))

            /**
             * Sets [Builder.postDriftRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postDriftRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postDriftRate(postDriftRate: JsonField<Double>) = apply {
                this.postDriftRate = postDriftRate
            }

            /** Post-event spacecraft eccentricity. */
            fun postEccentricity(postEccentricity: Double) =
                postEccentricity(JsonField.of(postEccentricity))

            /**
             * Sets [Builder.postEccentricity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postEccentricity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postEccentricity(postEccentricity: JsonField<Double>) = apply {
                this.postEccentricity = postEccentricity
            }

            /**
             * An element set is a collection of Keplerian orbital elements describing an orbit of a
             * particular satellite. The data is used along with an orbit propagator in order to
             * predict the motion of a satellite. The element set, or elset for short, consists of
             * identification data, the classical elements and drag parameters.
             */
            fun postEventElset(postEventElset: PostEventElset) =
                postEventElset(JsonField.of(postEventElset))

            /**
             * Sets [Builder.postEventElset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postEventElset] with a well-typed [PostEventElset]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postEventElset(postEventElset: JsonField<PostEventElset>) = apply {
                this.postEventElset = postEventElset
            }

            /** Optional identifier of the element set for the post-maneuver orbit. */
            fun postEventIdElset(postEventIdElset: String) =
                postEventIdElset(JsonField.of(postEventIdElset))

            /**
             * Sets [Builder.postEventIdElset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postEventIdElset] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postEventIdElset(postEventIdElset: JsonField<String>) = apply {
                this.postEventIdElset = postEventIdElset
            }

            /**
             * Optional identifier of the state vector for the post-maneuver trajectory of the
             * spacecraft.
             */
            fun postEventIdStateVector(postEventIdStateVector: String) =
                postEventIdStateVector(JsonField.of(postEventIdStateVector))

            /**
             * Sets [Builder.postEventIdStateVector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postEventIdStateVector] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postEventIdStateVector(postEventIdStateVector: JsonField<String>) = apply {
                this.postEventIdStateVector = postEventIdStateVector
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
            fun postEventStateVector(postEventStateVector: PostEventStateVector) =
                postEventStateVector(JsonField.of(postEventStateVector))

            /**
             * Sets [Builder.postEventStateVector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postEventStateVector] with a well-typed
             * [PostEventStateVector] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun postEventStateVector(postEventStateVector: JsonField<PostEventStateVector>) =
                apply {
                    this.postEventStateVector = postEventStateVector
                }

            /**
             * Post-event spacecraft WGS-84 GEO belt longitude, represented as -180 to 180 degrees
             * (negative values west of Prime Meridian).
             */
            fun postGeoLongitude(postGeoLongitude: Double) =
                postGeoLongitude(JsonField.of(postGeoLongitude))

            /**
             * Sets [Builder.postGeoLongitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postGeoLongitude] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postGeoLongitude(postGeoLongitude: JsonField<Double>) = apply {
                this.postGeoLongitude = postGeoLongitude
            }

            /** Post-event spacecraft orbital inclination, in degrees. 0-180. */
            fun postInclination(postInclination: Double) =
                postInclination(JsonField.of(postInclination))

            /**
             * Sets [Builder.postInclination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postInclination] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postInclination(postInclination: JsonField<Double>) = apply {
                this.postInclination = postInclination
            }

            /** Estimated mass of the object following the maneuver, in kg. */
            fun postMass(postMass: Double) = postMass(JsonField.of(postMass))

            /**
             * Sets [Builder.postMass] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postMass] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postMass(postMass: JsonField<Double>) = apply { this.postMass = postMass }

            /** Post-event spacecraft perigee (measured from Earth center), in kilometers. */
            fun postPerigee(postPerigee: Double) = postPerigee(JsonField.of(postPerigee))

            /**
             * Sets [Builder.postPerigee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postPerigee] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postPerigee(postPerigee: JsonField<Double>) = apply {
                this.postPerigee = postPerigee
            }

            /** Post-event spacecraft orbital period, in minutes. */
            fun postPeriod(postPeriod: Double) = postPeriod(JsonField.of(postPeriod))

            /**
             * Sets [Builder.postPeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postPeriod] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postPeriod(postPeriod: JsonField<Double>) = apply { this.postPeriod = postPeriod }

            /** Post-event X component of position in ECI space, in km. */
            fun postPosX(postPosX: Double) = postPosX(JsonField.of(postPosX))

            /**
             * Sets [Builder.postPosX] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postPosX] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postPosX(postPosX: JsonField<Double>) = apply { this.postPosX = postPosX }

            /** Post-event Y component of position in ECI space, in km. */
            fun postPosY(postPosY: Double) = postPosY(JsonField.of(postPosY))

            /**
             * Sets [Builder.postPosY] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postPosY] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postPosY(postPosY: JsonField<Double>) = apply { this.postPosY = postPosY }

            /** Post-event Z component of position in ECI space, in km. */
            fun postPosZ(postPosZ: Double) = postPosZ(JsonField.of(postPosZ))

            /**
             * Sets [Builder.postPosZ] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postPosZ] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postPosZ(postPosZ: JsonField<Double>) = apply { this.postPosZ = postPosZ }

            /** Post-event spacecraft Right Ascension of the Ascending Node (RAAN), in degrees. */
            fun postRaan(postRaan: Double) = postRaan(JsonField.of(postRaan))

            /**
             * Sets [Builder.postRaan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postRaan] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postRaan(postRaan: JsonField<Double>) = apply { this.postRaan = postRaan }

            /**
             * Post-event radiation pressure coefficient. The units of the radiation pressure
             * coefficient vary depending on provider. Users should consult the data provider to
             * verify the units of the radiation pressure coefficient.
             */
            fun postRadiationPressCoeff(postRadiationPressCoeff: Double) =
                postRadiationPressCoeff(JsonField.of(postRadiationPressCoeff))

            /**
             * Sets [Builder.postRadiationPressCoeff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postRadiationPressCoeff] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postRadiationPressCoeff(postRadiationPressCoeff: JsonField<Double>) = apply {
                this.postRadiationPressCoeff = postRadiationPressCoeff
            }

            /**
             * Post-event standard deviation, in kilometers, of spacecraft position in the 'U' unit
             * vector direction.
             */
            fun postSigmaU(postSigmaU: Double) = postSigmaU(JsonField.of(postSigmaU))

            /**
             * Sets [Builder.postSigmaU] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postSigmaU] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postSigmaU(postSigmaU: JsonField<Double>) = apply { this.postSigmaU = postSigmaU }

            /**
             * Post-event standard deviation, in kilometers, of spacecraft position in the 'V' unit
             * vector direction.
             */
            fun postSigmaV(postSigmaV: Double) = postSigmaV(JsonField.of(postSigmaV))

            /**
             * Sets [Builder.postSigmaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postSigmaV] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postSigmaV(postSigmaV: JsonField<Double>) = apply { this.postSigmaV = postSigmaV }

            /**
             * Post-event standard deviation, in kilometers, of spacecraft position in the 'W' unit
             * vector direction.
             */
            fun postSigmaW(postSigmaW: Double) = postSigmaW(JsonField.of(postSigmaW))

            /**
             * Sets [Builder.postSigmaW] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postSigmaW] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postSigmaW(postSigmaW: JsonField<Double>) = apply { this.postSigmaW = postSigmaW }

            /** Post-event spacecraft Semi-Major Axis (SMA), in kilometers. */
            fun postSma(postSma: Double) = postSma(JsonField.of(postSma))

            /**
             * Sets [Builder.postSma] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postSma] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postSma(postSma: JsonField<Double>) = apply { this.postSma = postSma }

            /** Post-event X component of velocity in ECI space, in km/sec. */
            fun postVelX(postVelX: Double) = postVelX(JsonField.of(postVelX))

            /**
             * Sets [Builder.postVelX] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postVelX] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postVelX(postVelX: JsonField<Double>) = apply { this.postVelX = postVelX }

            /** Post-event Y component of velocity in ECI space, in km/sec. */
            fun postVelY(postVelY: Double) = postVelY(JsonField.of(postVelY))

            /**
             * Sets [Builder.postVelY] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postVelY] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postVelY(postVelY: JsonField<Double>) = apply { this.postVelY = postVelY }

            /** Post-event Z component of velocity in ECI space, in km/sec. */
            fun postVelZ(postVelZ: Double) = postVelZ(JsonField.of(postVelZ))

            /**
             * Sets [Builder.postVelZ] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postVelZ] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postVelZ(postVelZ: JsonField<Double>) = apply { this.postVelZ = postVelZ }

            /** Pre-event spacecraft apogee (measured from Earth center), in kilometers. */
            fun preApogee(preApogee: Double) = preApogee(JsonField.of(preApogee))

            /**
             * Sets [Builder.preApogee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preApogee] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preApogee(preApogee: JsonField<Double>) = apply { this.preApogee = preApogee }

            /**
             * Pre-event ballistic coefficient. The units of the ballistic coefficient vary
             * depending on provider. Users should consult the data provider to verify the units of
             * the ballistic coefficient.
             */
            fun preBallisticCoeff(preBallisticCoeff: Double) =
                preBallisticCoeff(JsonField.of(preBallisticCoeff))

            /**
             * Sets [Builder.preBallisticCoeff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preBallisticCoeff] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preBallisticCoeff(preBallisticCoeff: JsonField<Double>) = apply {
                this.preBallisticCoeff = preBallisticCoeff
            }

            /**
             * Pre-event GEO drift rate of the spacecraft, in degrees per day. Negative values
             * indicate westward drift.
             */
            fun preDriftRate(preDriftRate: Double) = preDriftRate(JsonField.of(preDriftRate))

            /**
             * Sets [Builder.preDriftRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preDriftRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preDriftRate(preDriftRate: JsonField<Double>) = apply {
                this.preDriftRate = preDriftRate
            }

            /** Pre-event spacecraft eccentricity. */
            fun preEccentricity(preEccentricity: Double) =
                preEccentricity(JsonField.of(preEccentricity))

            /**
             * Sets [Builder.preEccentricity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preEccentricity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preEccentricity(preEccentricity: JsonField<Double>) = apply {
                this.preEccentricity = preEccentricity
            }

            /**
             * An element set is a collection of Keplerian orbital elements describing an orbit of a
             * particular satellite. The data is used along with an orbit propagator in order to
             * predict the motion of a satellite. The element set, or elset for short, consists of
             * identification data, the classical elements and drag parameters.
             */
            fun preEventElset(preEventElset: PreEventElset) =
                preEventElset(JsonField.of(preEventElset))

            /**
             * Sets [Builder.preEventElset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preEventElset] with a well-typed [PreEventElset]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preEventElset(preEventElset: JsonField<PreEventElset>) = apply {
                this.preEventElset = preEventElset
            }

            /** Optional identifier of the element set for the pre-maneuver orbit. */
            fun preEventIdElset(preEventIdElset: String) =
                preEventIdElset(JsonField.of(preEventIdElset))

            /**
             * Sets [Builder.preEventIdElset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preEventIdElset] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preEventIdElset(preEventIdElset: JsonField<String>) = apply {
                this.preEventIdElset = preEventIdElset
            }

            /**
             * Optional identifier of the state vector for the pre-maneuver trajectory of the
             * spacecraft.
             */
            fun preEventIdStateVector(preEventIdStateVector: String) =
                preEventIdStateVector(JsonField.of(preEventIdStateVector))

            /**
             * Sets [Builder.preEventIdStateVector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preEventIdStateVector] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preEventIdStateVector(preEventIdStateVector: JsonField<String>) = apply {
                this.preEventIdStateVector = preEventIdStateVector
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
            fun preEventStateVector(preEventStateVector: PreEventStateVector) =
                preEventStateVector(JsonField.of(preEventStateVector))

            /**
             * Sets [Builder.preEventStateVector] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preEventStateVector] with a well-typed
             * [PreEventStateVector] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun preEventStateVector(preEventStateVector: JsonField<PreEventStateVector>) = apply {
                this.preEventStateVector = preEventStateVector
            }

            /**
             * Pre-event spacecraft WGS-84 GEO belt longitude, represented as -180 to 180 degrees
             * (negative values west of Prime Meridian).
             */
            fun preGeoLongitude(preGeoLongitude: Double) =
                preGeoLongitude(JsonField.of(preGeoLongitude))

            /**
             * Sets [Builder.preGeoLongitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preGeoLongitude] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preGeoLongitude(preGeoLongitude: JsonField<Double>) = apply {
                this.preGeoLongitude = preGeoLongitude
            }

            /** Pre-event spacecraft orbital inclination, in degrees. 0-180. */
            fun preInclination(preInclination: Double) =
                preInclination(JsonField.of(preInclination))

            /**
             * Sets [Builder.preInclination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preInclination] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preInclination(preInclination: JsonField<Double>) = apply {
                this.preInclination = preInclination
            }

            /** Pre-event spacecraft perigee (measured from Earth center), in kilometers. */
            fun prePerigee(prePerigee: Double) = prePerigee(JsonField.of(prePerigee))

            /**
             * Sets [Builder.prePerigee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prePerigee] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prePerigee(prePerigee: JsonField<Double>) = apply { this.prePerigee = prePerigee }

            /** Pre-event spacecraft orbital period, in minutes. */
            fun prePeriod(prePeriod: Double) = prePeriod(JsonField.of(prePeriod))

            /**
             * Sets [Builder.prePeriod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prePeriod] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prePeriod(prePeriod: JsonField<Double>) = apply { this.prePeriod = prePeriod }

            /** Pre-event X component of position in ECI space, in km. */
            fun prePosX(prePosX: Double) = prePosX(JsonField.of(prePosX))

            /**
             * Sets [Builder.prePosX] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prePosX] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prePosX(prePosX: JsonField<Double>) = apply { this.prePosX = prePosX }

            /** Pre-event Y component of position in ECI space, in km. */
            fun prePosY(prePosY: Double) = prePosY(JsonField.of(prePosY))

            /**
             * Sets [Builder.prePosY] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prePosY] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prePosY(prePosY: JsonField<Double>) = apply { this.prePosY = prePosY }

            /** Pre-event Z component of position in ECI space, in km. */
            fun prePosZ(prePosZ: Double) = prePosZ(JsonField.of(prePosZ))

            /**
             * Sets [Builder.prePosZ] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prePosZ] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prePosZ(prePosZ: JsonField<Double>) = apply { this.prePosZ = prePosZ }

            /** Pre-event spacecraft Right Ascension of the Ascending Node (RAAN), in degrees. */
            fun preRaan(preRaan: Double) = preRaan(JsonField.of(preRaan))

            /**
             * Sets [Builder.preRaan] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preRaan] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preRaan(preRaan: JsonField<Double>) = apply { this.preRaan = preRaan }

            /**
             * Pre-event radiation pressure coefficient. The units of the radiation pressure
             * coefficient vary depending on provider. Users should consult the data provider to
             * verify the units of the radiation pressure coefficient.
             */
            fun preRadiationPressCoeff(preRadiationPressCoeff: Double) =
                preRadiationPressCoeff(JsonField.of(preRadiationPressCoeff))

            /**
             * Sets [Builder.preRadiationPressCoeff] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preRadiationPressCoeff] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preRadiationPressCoeff(preRadiationPressCoeff: JsonField<Double>) = apply {
                this.preRadiationPressCoeff = preRadiationPressCoeff
            }

            /**
             * Pre-event standard deviation, in kilometers, of spacecraft position in the 'U' unit
             * vector direction.
             */
            fun preSigmaU(preSigmaU: Double) = preSigmaU(JsonField.of(preSigmaU))

            /**
             * Sets [Builder.preSigmaU] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preSigmaU] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preSigmaU(preSigmaU: JsonField<Double>) = apply { this.preSigmaU = preSigmaU }

            /**
             * Pre-event standard deviation, in kilometers, of spacecraft position in the 'V' unit
             * vector direction.
             */
            fun preSigmaV(preSigmaV: Double) = preSigmaV(JsonField.of(preSigmaV))

            /**
             * Sets [Builder.preSigmaV] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preSigmaV] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preSigmaV(preSigmaV: JsonField<Double>) = apply { this.preSigmaV = preSigmaV }

            /**
             * Pre-event standard deviation, in kilometers, of spacecraft position in the 'W' unit
             * vector direction.
             */
            fun preSigmaW(preSigmaW: Double) = preSigmaW(JsonField.of(preSigmaW))

            /**
             * Sets [Builder.preSigmaW] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preSigmaW] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preSigmaW(preSigmaW: JsonField<Double>) = apply { this.preSigmaW = preSigmaW }

            /** Pre-event spacecraft orbital Semi-Major Axis (SMA), in kilometers. */
            fun preSma(preSma: Double) = preSma(JsonField.of(preSma))

            /**
             * Sets [Builder.preSma] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preSma] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preSma(preSma: JsonField<Double>) = apply { this.preSma = preSma }

            /** Pre-event X component of velocity in ECI space, in km/sec. */
            fun preVelX(preVelX: Double) = preVelX(JsonField.of(preVelX))

            /**
             * Sets [Builder.preVelX] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preVelX] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preVelX(preVelX: JsonField<Double>) = apply { this.preVelX = preVelX }

            /** Pre-event Y component of velocity in ECI space, in km/sec. */
            fun preVelY(preVelY: Double) = preVelY(JsonField.of(preVelY))

            /**
             * Sets [Builder.preVelY] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preVelY] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preVelY(preVelY: JsonField<Double>) = apply { this.preVelY = preVelY }

            /** Pre-event Z component of velocity in ECI space, in km/sec. */
            fun preVelZ(preVelZ: Double) = preVelZ(JsonField.of(preVelZ))

            /**
             * Sets [Builder.preVelZ] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preVelZ] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preVelZ(preVelZ: JsonField<Double>) = apply { this.preVelZ = preVelZ }

            /**
             * The time that the report or alert of this maneuver was generated, in ISO 8601 UTC
             * format.
             */
            fun reportTime(reportTime: OffsetDateTime) = reportTime(JsonField.of(reportTime))

            /**
             * Sets [Builder.reportTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reportTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reportTime(reportTime: JsonField<OffsetDateTime>) = apply {
                this.reportTime = reportTime
            }

            /** Satellite/Catalog number of the target on-orbit object. */
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
             * Optional array of UDL data (elsets, state vectors, etc) UUIDs used to build this
             * maneuver. See the associated sourcedDataTypes array for the specific types of data
             * for the positionally corresponding UUIDs in this array (the two arrays must match in
             * size).
             */
            fun sourcedData(sourcedData: List<String>) = sourcedData(JsonField.of(sourcedData))

            /**
             * Sets [Builder.sourcedData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourcedData] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Optional array of UDL data types used to build this maneuver (e.g. EO, RADAR, RF,
             * DOA, ELSET, SV). See the associated sourcedData array for the specific UUIDs of data
             * for the positionally corresponding data types in this array (the two arrays must
             * match in size).
             */
            fun sourcedDataTypes(sourcedDataTypes: List<SourcedDataType>) =
                sourcedDataTypes(JsonField.of(sourcedDataTypes))

            /**
             * Sets [Builder.sourcedDataTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourcedDataTypes] with a well-typed
             * `List<SourcedDataType>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
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

            /** Name of the state model used to generate the maneuver data. */
            fun stateModel(stateModel: String) = stateModel(JsonField.of(stateModel))

            /**
             * Sets [Builder.stateModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateModel(stateModel: JsonField<String>) = apply { this.stateModel = stateModel }

            /** Version of the state model used to generate the maneuver data. */
            fun stateModelVersion(stateModelVersion: Double) =
                stateModelVersion(JsonField.of(stateModelVersion))

            /**
             * Sets [Builder.stateModelVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateModelVersion] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateModelVersion(stateModelVersion: JsonField<Double>) = apply {
                this.stateModelVersion = stateModelVersion
            }

            /**
             * Status of this maneuver (CANCELLED, PLANNED, POSSIBLE, REDACTED, VERIFIED).
             *
             * CANCELLED: A previously planned maneuver whose execution was cancelled.
             *
             * PLANNED: A maneuver planned to take place at the eventStartTime.
             *
             * POSSIBLE: A possible maneuver detected by observation of the spacecraft or by
             * evaluation of the spacecraft orbit.
             *
             * REDACTED: A redaction of a reported possible maneuver that has been determined to
             * have not taken place after further observation/evaluation.
             *
             * VERIFIED: A maneuver whose execution has been verified, either by the owner/operator
             * or observation/evaluation.
             */
            fun status(status: String) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<String>) = apply { this.status = status }

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
             * The estimated total active burn time of a maneuver, in seconds. This includes the sum
             * of all burns in numAccelPoints. Not to be confused with the total duration of the
             * maneuver.
             */
            fun totalBurnTime(totalBurnTime: Double) = totalBurnTime(JsonField.of(totalBurnTime))

            /**
             * Sets [Builder.totalBurnTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalBurnTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalBurnTime(totalBurnTime: JsonField<Double>) = apply {
                this.totalBurnTime = totalBurnTime
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

            /**
             * Boolean indicating this maneuver was unable to be correlated to a known object. This
             * flag should only be set to true by data providers after an attempt to correlate to an
             * on-orbit object was made and failed. If unable to correlate, the 'origObjectId' field
             * may be populated with an internal data provider specific identifier.
             */
            fun uct(uct: Boolean) = uct(JsonField.of(uct))

            /**
             * Sets [Builder.uct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uct] with a well-typed [Boolean] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uct(uct: JsonField<Boolean>) = apply { this.uct = uct }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .eventStartTime()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("eventStartTime", eventStartTime),
                    checkRequired("source", source),
                    id,
                    algorithm,
                    characterization,
                    characterizationUnc,
                    (cov ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    createdBy,
                    deltaMass,
                    deltaPos,
                    deltaPosU,
                    deltaPosV,
                    deltaPosW,
                    deltaVel,
                    deltaVelU,
                    deltaVelV,
                    deltaVelW,
                    description,
                    descriptor,
                    eventEndTime,
                    eventId,
                    idOnOrbit,
                    idSensor,
                    maneuverUnc,
                    (mnvrAccels ?: JsonMissing.of()).map { it.toImmutable() },
                    (mnvrAccelTimes ?: JsonMissing.of()).map { it.toImmutable() },
                    (mnvrAccelUncs ?: JsonMissing.of()).map { it.toImmutable() },
                    numAccelPoints,
                    numObs,
                    odFitEndTime,
                    origin,
                    origNetwork,
                    origObjectId,
                    origSensorId,
                    postApogee,
                    postArea,
                    postBallisticCoeff,
                    postDriftRate,
                    postEccentricity,
                    postEventElset,
                    postEventIdElset,
                    postEventIdStateVector,
                    postEventStateVector,
                    postGeoLongitude,
                    postInclination,
                    postMass,
                    postPerigee,
                    postPeriod,
                    postPosX,
                    postPosY,
                    postPosZ,
                    postRaan,
                    postRadiationPressCoeff,
                    postSigmaU,
                    postSigmaV,
                    postSigmaW,
                    postSma,
                    postVelX,
                    postVelY,
                    postVelZ,
                    preApogee,
                    preBallisticCoeff,
                    preDriftRate,
                    preEccentricity,
                    preEventElset,
                    preEventIdElset,
                    preEventIdStateVector,
                    preEventStateVector,
                    preGeoLongitude,
                    preInclination,
                    prePerigee,
                    prePeriod,
                    prePosX,
                    prePosY,
                    prePosZ,
                    preRaan,
                    preRadiationPressCoeff,
                    preSigmaU,
                    preSigmaV,
                    preSigmaW,
                    preSma,
                    preVelX,
                    preVelY,
                    preVelZ,
                    reportTime,
                    satNo,
                    (sourcedData ?: JsonMissing.of()).map { it.toImmutable() },
                    (sourcedDataTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    stateModel,
                    stateModelVersion,
                    status,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    totalBurnTime,
                    transactionId,
                    uct,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            eventStartTime()
            source()
            id()
            algorithm()
            characterization()
            characterizationUnc()
            cov()
            createdAt()
            createdBy()
            deltaMass()
            deltaPos()
            deltaPosU()
            deltaPosV()
            deltaPosW()
            deltaVel()
            deltaVelU()
            deltaVelV()
            deltaVelW()
            description()
            descriptor()
            eventEndTime()
            eventId()
            idOnOrbit()
            idSensor()
            maneuverUnc()
            mnvrAccels()
            mnvrAccelTimes()
            mnvrAccelUncs()
            numAccelPoints()
            numObs()
            odFitEndTime()
            origin()
            origNetwork()
            origObjectId()
            origSensorId()
            postApogee()
            postArea()
            postBallisticCoeff()
            postDriftRate()
            postEccentricity()
            postEventElset().ifPresent { it.validate() }
            postEventIdElset()
            postEventIdStateVector()
            postEventStateVector().ifPresent { it.validate() }
            postGeoLongitude()
            postInclination()
            postMass()
            postPerigee()
            postPeriod()
            postPosX()
            postPosY()
            postPosZ()
            postRaan()
            postRadiationPressCoeff()
            postSigmaU()
            postSigmaV()
            postSigmaW()
            postSma()
            postVelX()
            postVelY()
            postVelZ()
            preApogee()
            preBallisticCoeff()
            preDriftRate()
            preEccentricity()
            preEventElset().ifPresent { it.validate() }
            preEventIdElset()
            preEventIdStateVector()
            preEventStateVector().ifPresent { it.validate() }
            preGeoLongitude()
            preInclination()
            prePerigee()
            prePeriod()
            prePosX()
            prePosY()
            prePosZ()
            preRaan()
            preRadiationPressCoeff()
            preSigmaU()
            preSigmaV()
            preSigmaW()
            preSma()
            preVelX()
            preVelY()
            preVelZ()
            reportTime()
            satNo()
            sourcedData()
            sourcedDataTypes().ifPresent { it.forEach { it.validate() } }
            stateModel()
            stateModelVersion()
            status()
            tags()
            totalBurnTime()
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
                (if (eventStartTime.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (algorithm.asKnown().isPresent) 1 else 0) +
                (if (characterization.asKnown().isPresent) 1 else 0) +
                (if (characterizationUnc.asKnown().isPresent) 1 else 0) +
                (cov.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (deltaMass.asKnown().isPresent) 1 else 0) +
                (if (deltaPos.asKnown().isPresent) 1 else 0) +
                (if (deltaPosU.asKnown().isPresent) 1 else 0) +
                (if (deltaPosV.asKnown().isPresent) 1 else 0) +
                (if (deltaPosW.asKnown().isPresent) 1 else 0) +
                (if (deltaVel.asKnown().isPresent) 1 else 0) +
                (if (deltaVelU.asKnown().isPresent) 1 else 0) +
                (if (deltaVelV.asKnown().isPresent) 1 else 0) +
                (if (deltaVelW.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (descriptor.asKnown().isPresent) 1 else 0) +
                (if (eventEndTime.asKnown().isPresent) 1 else 0) +
                (if (eventId.asKnown().isPresent) 1 else 0) +
                (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
                (if (idSensor.asKnown().isPresent) 1 else 0) +
                (if (maneuverUnc.asKnown().isPresent) 1 else 0) +
                (mnvrAccels.asKnown().getOrNull()?.size ?: 0) +
                (mnvrAccelTimes.asKnown().getOrNull()?.size ?: 0) +
                (mnvrAccelUncs.asKnown().getOrNull()?.size ?: 0) +
                (if (numAccelPoints.asKnown().isPresent) 1 else 0) +
                (if (numObs.asKnown().isPresent) 1 else 0) +
                (if (odFitEndTime.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origObjectId.asKnown().isPresent) 1 else 0) +
                (if (origSensorId.asKnown().isPresent) 1 else 0) +
                (if (postApogee.asKnown().isPresent) 1 else 0) +
                (if (postArea.asKnown().isPresent) 1 else 0) +
                (if (postBallisticCoeff.asKnown().isPresent) 1 else 0) +
                (if (postDriftRate.asKnown().isPresent) 1 else 0) +
                (if (postEccentricity.asKnown().isPresent) 1 else 0) +
                (postEventElset.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postEventIdElset.asKnown().isPresent) 1 else 0) +
                (if (postEventIdStateVector.asKnown().isPresent) 1 else 0) +
                (postEventStateVector.asKnown().getOrNull()?.validity() ?: 0) +
                (if (postGeoLongitude.asKnown().isPresent) 1 else 0) +
                (if (postInclination.asKnown().isPresent) 1 else 0) +
                (if (postMass.asKnown().isPresent) 1 else 0) +
                (if (postPerigee.asKnown().isPresent) 1 else 0) +
                (if (postPeriod.asKnown().isPresent) 1 else 0) +
                (if (postPosX.asKnown().isPresent) 1 else 0) +
                (if (postPosY.asKnown().isPresent) 1 else 0) +
                (if (postPosZ.asKnown().isPresent) 1 else 0) +
                (if (postRaan.asKnown().isPresent) 1 else 0) +
                (if (postRadiationPressCoeff.asKnown().isPresent) 1 else 0) +
                (if (postSigmaU.asKnown().isPresent) 1 else 0) +
                (if (postSigmaV.asKnown().isPresent) 1 else 0) +
                (if (postSigmaW.asKnown().isPresent) 1 else 0) +
                (if (postSma.asKnown().isPresent) 1 else 0) +
                (if (postVelX.asKnown().isPresent) 1 else 0) +
                (if (postVelY.asKnown().isPresent) 1 else 0) +
                (if (postVelZ.asKnown().isPresent) 1 else 0) +
                (if (preApogee.asKnown().isPresent) 1 else 0) +
                (if (preBallisticCoeff.asKnown().isPresent) 1 else 0) +
                (if (preDriftRate.asKnown().isPresent) 1 else 0) +
                (if (preEccentricity.asKnown().isPresent) 1 else 0) +
                (preEventElset.asKnown().getOrNull()?.validity() ?: 0) +
                (if (preEventIdElset.asKnown().isPresent) 1 else 0) +
                (if (preEventIdStateVector.asKnown().isPresent) 1 else 0) +
                (preEventStateVector.asKnown().getOrNull()?.validity() ?: 0) +
                (if (preGeoLongitude.asKnown().isPresent) 1 else 0) +
                (if (preInclination.asKnown().isPresent) 1 else 0) +
                (if (prePerigee.asKnown().isPresent) 1 else 0) +
                (if (prePeriod.asKnown().isPresent) 1 else 0) +
                (if (prePosX.asKnown().isPresent) 1 else 0) +
                (if (prePosY.asKnown().isPresent) 1 else 0) +
                (if (prePosZ.asKnown().isPresent) 1 else 0) +
                (if (preRaan.asKnown().isPresent) 1 else 0) +
                (if (preRadiationPressCoeff.asKnown().isPresent) 1 else 0) +
                (if (preSigmaU.asKnown().isPresent) 1 else 0) +
                (if (preSigmaV.asKnown().isPresent) 1 else 0) +
                (if (preSigmaW.asKnown().isPresent) 1 else 0) +
                (if (preSma.asKnown().isPresent) 1 else 0) +
                (if (preVelX.asKnown().isPresent) 1 else 0) +
                (if (preVelY.asKnown().isPresent) 1 else 0) +
                (if (preVelZ.asKnown().isPresent) 1 else 0) +
                (if (reportTime.asKnown().isPresent) 1 else 0) +
                (if (satNo.asKnown().isPresent) 1 else 0) +
                (sourcedData.asKnown().getOrNull()?.size ?: 0) +
                (sourcedDataTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (stateModel.asKnown().isPresent) 1 else 0) +
                (if (stateModelVersion.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (totalBurnTime.asKnown().isPresent) 1 else 0) +
                (if (transactionId.asKnown().isPresent) 1 else 0) +
                (if (uct.asKnown().isPresent) 1 else 0)

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
        class PostEventElset
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
                 * Returns a mutable builder for constructing an instance of [PostEventElset].
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

            /** A builder for [PostEventElset]. */
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
                internal fun from(postEventElset: PostEventElset) = apply {
                    classificationMarking = postEventElset.classificationMarking
                    dataMode = postEventElset.dataMode
                    epoch = postEventElset.epoch
                    source = postEventElset.source
                    agom = postEventElset.agom
                    algorithm = postEventElset.algorithm
                    apogee = postEventElset.apogee
                    argOfPerigee = postEventElset.argOfPerigee
                    ballisticCoeff = postEventElset.ballisticCoeff
                    bStar = postEventElset.bStar
                    createdAt = postEventElset.createdAt
                    createdBy = postEventElset.createdBy
                    descriptor = postEventElset.descriptor
                    eccentricity = postEventElset.eccentricity
                    ephemType = postEventElset.ephemType
                    idElset = postEventElset.idElset
                    idOnOrbit = postEventElset.idOnOrbit
                    idOrbitDetermination = postEventElset.idOrbitDetermination
                    inclination = postEventElset.inclination
                    line1 = postEventElset.line1
                    line2 = postEventElset.line2
                    meanAnomaly = postEventElset.meanAnomaly
                    meanMotion = postEventElset.meanMotion
                    meanMotionDDot = postEventElset.meanMotionDDot
                    meanMotionDot = postEventElset.meanMotionDot
                    origin = postEventElset.origin
                    origNetwork = postEventElset.origNetwork
                    origObjectId = postEventElset.origObjectId
                    perigee = postEventElset.perigee
                    period = postEventElset.period
                    raan = postEventElset.raan
                    rawFileUri = postEventElset.rawFileUri
                    revNo = postEventElset.revNo
                    satNo = postEventElset.satNo
                    semiMajorAxis = postEventElset.semiMajorAxis
                    sourcedData = postEventElset.sourcedData.map { it.toMutableList() }
                    sourcedDataTypes = postEventElset.sourcedDataTypes.map { it.toMutableList() }
                    sourceDl = postEventElset.sourceDl
                    tags = postEventElset.tags.map { it.toMutableList() }
                    transactionId = postEventElset.transactionId
                    uct = postEventElset.uct
                    additionalProperties = postEventElset.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PostEventElset].
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
                fun build(): PostEventElset =
                    PostEventElset(
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

            fun validate(): PostEventElset = apply {
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

                return other is PostEventElset &&
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
                "PostEventElset{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, agom=$agom, algorithm=$algorithm, apogee=$apogee, argOfPerigee=$argOfPerigee, ballisticCoeff=$ballisticCoeff, bStar=$bStar, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, eccentricity=$eccentricity, ephemType=$ephemType, idElset=$idElset, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, inclination=$inclination, line1=$line1, line2=$line2, meanAnomaly=$meanAnomaly, meanMotion=$meanMotion, meanMotionDDot=$meanMotionDDot, meanMotionDot=$meanMotionDot, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, perigee=$perigee, period=$period, raan=$raan, rawFileUri=$rawFileUri, revNo=$revNo, satNo=$satNo, semiMajorAxis=$semiMajorAxis, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, uct=$uct, additionalProperties=$additionalProperties}"
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
        class PostEventStateVector
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
            private val msgTs: JsonField<OffsetDateTime>,
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
                @JsonProperty("msgTs")
                @ExcludeMissing
                msgTs: JsonField<OffsetDateTime> = JsonMissing.of(),
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
                msgTs,
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
             * Time when message was generated in ISO 8601 UTC format with microsecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun msgTs(): Optional<OffsetDateTime> = msgTs.getOptional("msgTs")

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
             * Returns the raw JSON value of [msgTs].
             *
             * Unlike [msgTs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("msgTs") @ExcludeMissing fun _msgTs(): JsonField<OffsetDateTime> = msgTs

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
                 * Returns a mutable builder for constructing an instance of [PostEventStateVector].
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

            /** A builder for [PostEventStateVector]. */
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
                private var msgTs: JsonField<OffsetDateTime> = JsonMissing.of()
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
                internal fun from(postEventStateVector: PostEventStateVector) = apply {
                    classificationMarking = postEventStateVector.classificationMarking
                    dataMode = postEventStateVector.dataMode
                    epoch = postEventStateVector.epoch
                    source = postEventStateVector.source
                    actualOdSpan = postEventStateVector.actualOdSpan
                    algorithm = postEventStateVector.algorithm
                    alt1ReferenceFrame = postEventStateVector.alt1ReferenceFrame
                    alt2ReferenceFrame = postEventStateVector.alt2ReferenceFrame
                    area = postEventStateVector.area
                    bDot = postEventStateVector.bDot
                    cmOffset = postEventStateVector.cmOffset
                    cov = postEventStateVector.cov.map { it.toMutableList() }
                    covMethod = postEventStateVector.covMethod
                    covReferenceFrame = postEventStateVector.covReferenceFrame
                    createdAt = postEventStateVector.createdAt
                    createdBy = postEventStateVector.createdBy
                    descriptor = postEventStateVector.descriptor
                    dragArea = postEventStateVector.dragArea
                    dragCoeff = postEventStateVector.dragCoeff
                    dragModel = postEventStateVector.dragModel
                    edr = postEventStateVector.edr
                    eqCov = postEventStateVector.eqCov.map { it.toMutableList() }
                    errorControl = postEventStateVector.errorControl
                    fixedStep = postEventStateVector.fixedStep
                    geopotentialModel = postEventStateVector.geopotentialModel
                    iau1980Terms = postEventStateVector.iau1980Terms
                    idOnOrbit = postEventStateVector.idOnOrbit
                    idOrbitDetermination = postEventStateVector.idOrbitDetermination
                    idStateVector = postEventStateVector.idStateVector
                    integratorMode = postEventStateVector.integratorMode
                    inTrackThrust = postEventStateVector.inTrackThrust
                    lastObEnd = postEventStateVector.lastObEnd
                    lastObStart = postEventStateVector.lastObStart
                    leapSecondTime = postEventStateVector.leapSecondTime
                    lunarSolar = postEventStateVector.lunarSolar
                    mass = postEventStateVector.mass
                    msgTs = postEventStateVector.msgTs
                    obsAvailable = postEventStateVector.obsAvailable
                    obsUsed = postEventStateVector.obsUsed
                    origin = postEventStateVector.origin
                    origNetwork = postEventStateVector.origNetwork
                    origObjectId = postEventStateVector.origObjectId
                    partials = postEventStateVector.partials
                    pedigree = postEventStateVector.pedigree
                    polarMotionX = postEventStateVector.polarMotionX
                    polarMotionY = postEventStateVector.polarMotionY
                    posUnc = postEventStateVector.posUnc
                    rawFileUri = postEventStateVector.rawFileUri
                    recOdSpan = postEventStateVector.recOdSpan
                    referenceFrame = postEventStateVector.referenceFrame
                    residualsAcc = postEventStateVector.residualsAcc
                    revNo = postEventStateVector.revNo
                    rms = postEventStateVector.rms
                    satNo = postEventStateVector.satNo
                    sigmaPosUvw = postEventStateVector.sigmaPosUvw.map { it.toMutableList() }
                    sigmaVelUvw = postEventStateVector.sigmaVelUvw.map { it.toMutableList() }
                    solarFluxApAvg = postEventStateVector.solarFluxApAvg
                    solarFluxF10 = postEventStateVector.solarFluxF10
                    solarFluxF10Avg = postEventStateVector.solarFluxF10Avg
                    solarRadPress = postEventStateVector.solarRadPress
                    solarRadPressCoeff = postEventStateVector.solarRadPressCoeff
                    solidEarthTides = postEventStateVector.solidEarthTides
                    sourcedData = postEventStateVector.sourcedData.map { it.toMutableList() }
                    sourcedDataTypes =
                        postEventStateVector.sourcedDataTypes.map { it.toMutableList() }
                    sourceDl = postEventStateVector.sourceDl
                    srpArea = postEventStateVector.srpArea
                    stepMode = postEventStateVector.stepMode
                    stepSize = postEventStateVector.stepSize
                    stepSizeSelection = postEventStateVector.stepSizeSelection
                    tags = postEventStateVector.tags.map { it.toMutableList() }
                    taiUtc = postEventStateVector.taiUtc
                    thrustAccel = postEventStateVector.thrustAccel
                    tracksAvail = postEventStateVector.tracksAvail
                    tracksUsed = postEventStateVector.tracksUsed
                    transactionId = postEventStateVector.transactionId
                    uct = postEventStateVector.uct
                    ut1Rate = postEventStateVector.ut1Rate
                    ut1Utc = postEventStateVector.ut1Utc
                    velUnc = postEventStateVector.velUnc
                    xaccel = postEventStateVector.xaccel
                    xpos = postEventStateVector.xpos
                    xposAlt1 = postEventStateVector.xposAlt1
                    xposAlt2 = postEventStateVector.xposAlt2
                    xvel = postEventStateVector.xvel
                    xvelAlt1 = postEventStateVector.xvelAlt1
                    xvelAlt2 = postEventStateVector.xvelAlt2
                    yaccel = postEventStateVector.yaccel
                    ypos = postEventStateVector.ypos
                    yposAlt1 = postEventStateVector.yposAlt1
                    yposAlt2 = postEventStateVector.yposAlt2
                    yvel = postEventStateVector.yvel
                    yvelAlt1 = postEventStateVector.yvelAlt1
                    yvelAlt2 = postEventStateVector.yvelAlt2
                    zaccel = postEventStateVector.zaccel
                    zpos = postEventStateVector.zpos
                    zposAlt1 = postEventStateVector.zposAlt1
                    zposAlt2 = postEventStateVector.zposAlt2
                    zvel = postEventStateVector.zvel
                    zvelAlt1 = postEventStateVector.zvelAlt1
                    zvelAlt2 = postEventStateVector.zvelAlt2
                    additionalProperties = postEventStateVector.additionalProperties.toMutableMap()
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

                /**
                 * Time when message was generated in ISO 8601 UTC format with microsecond
                 * precision.
                 */
                fun msgTs(msgTs: OffsetDateTime) = msgTs(JsonField.of(msgTs))

                /**
                 * Sets [Builder.msgTs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.msgTs] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun msgTs(msgTs: JsonField<OffsetDateTime>) = apply { this.msgTs = msgTs }

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
                 * Returns an immutable instance of [PostEventStateVector].
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
                fun build(): PostEventStateVector =
                    PostEventStateVector(
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
                        msgTs,
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

            fun validate(): PostEventStateVector = apply {
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
                msgTs()
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
                    (if (msgTs.asKnown().isPresent) 1 else 0) +
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

                return other is PostEventStateVector &&
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
                    msgTs == other.msgTs &&
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
                    msgTs,
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
                "PostEventStateVector{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, actualOdSpan=$actualOdSpan, algorithm=$algorithm, alt1ReferenceFrame=$alt1ReferenceFrame, alt2ReferenceFrame=$alt2ReferenceFrame, area=$area, bDot=$bDot, cmOffset=$cmOffset, cov=$cov, covMethod=$covMethod, covReferenceFrame=$covReferenceFrame, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, dragArea=$dragArea, dragCoeff=$dragCoeff, dragModel=$dragModel, edr=$edr, eqCov=$eqCov, errorControl=$errorControl, fixedStep=$fixedStep, geopotentialModel=$geopotentialModel, iau1980Terms=$iau1980Terms, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, idStateVector=$idStateVector, integratorMode=$integratorMode, inTrackThrust=$inTrackThrust, lastObEnd=$lastObEnd, lastObStart=$lastObStart, leapSecondTime=$leapSecondTime, lunarSolar=$lunarSolar, mass=$mass, msgTs=$msgTs, obsAvailable=$obsAvailable, obsUsed=$obsUsed, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, partials=$partials, pedigree=$pedigree, polarMotionX=$polarMotionX, polarMotionY=$polarMotionY, posUnc=$posUnc, rawFileUri=$rawFileUri, recOdSpan=$recOdSpan, referenceFrame=$referenceFrame, residualsAcc=$residualsAcc, revNo=$revNo, rms=$rms, satNo=$satNo, sigmaPosUvw=$sigmaPosUvw, sigmaVelUvw=$sigmaVelUvw, solarFluxApAvg=$solarFluxApAvg, solarFluxF10=$solarFluxF10, solarFluxF10Avg=$solarFluxF10Avg, solarRadPress=$solarRadPress, solarRadPressCoeff=$solarRadPressCoeff, solidEarthTides=$solidEarthTides, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, srpArea=$srpArea, stepMode=$stepMode, stepSize=$stepSize, stepSizeSelection=$stepSizeSelection, tags=$tags, taiUtc=$taiUtc, thrustAccel=$thrustAccel, tracksAvail=$tracksAvail, tracksUsed=$tracksUsed, transactionId=$transactionId, uct=$uct, ut1Rate=$ut1Rate, ut1Utc=$ut1Utc, velUnc=$velUnc, xaccel=$xaccel, xpos=$xpos, xposAlt1=$xposAlt1, xposAlt2=$xposAlt2, xvel=$xvel, xvelAlt1=$xvelAlt1, xvelAlt2=$xvelAlt2, yaccel=$yaccel, ypos=$ypos, yposAlt1=$yposAlt1, yposAlt2=$yposAlt2, yvel=$yvel, yvelAlt1=$yvelAlt1, yvelAlt2=$yvelAlt2, zaccel=$zaccel, zpos=$zpos, zposAlt1=$zposAlt1, zposAlt2=$zposAlt2, zvel=$zvel, zvelAlt1=$zvelAlt1, zvelAlt2=$zvelAlt2, additionalProperties=$additionalProperties}"
        }

        /**
         * An element set is a collection of Keplerian orbital elements describing an orbit of a
         * particular satellite. The data is used along with an orbit propagator in order to predict
         * the motion of a satellite. The element set, or elset for short, consists of
         * identification data, the classical elements and drag parameters.
         */
        class PreEventElset
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
                 * Returns a mutable builder for constructing an instance of [PreEventElset].
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

            /** A builder for [PreEventElset]. */
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
                internal fun from(preEventElset: PreEventElset) = apply {
                    classificationMarking = preEventElset.classificationMarking
                    dataMode = preEventElset.dataMode
                    epoch = preEventElset.epoch
                    source = preEventElset.source
                    agom = preEventElset.agom
                    algorithm = preEventElset.algorithm
                    apogee = preEventElset.apogee
                    argOfPerigee = preEventElset.argOfPerigee
                    ballisticCoeff = preEventElset.ballisticCoeff
                    bStar = preEventElset.bStar
                    createdAt = preEventElset.createdAt
                    createdBy = preEventElset.createdBy
                    descriptor = preEventElset.descriptor
                    eccentricity = preEventElset.eccentricity
                    ephemType = preEventElset.ephemType
                    idElset = preEventElset.idElset
                    idOnOrbit = preEventElset.idOnOrbit
                    idOrbitDetermination = preEventElset.idOrbitDetermination
                    inclination = preEventElset.inclination
                    line1 = preEventElset.line1
                    line2 = preEventElset.line2
                    meanAnomaly = preEventElset.meanAnomaly
                    meanMotion = preEventElset.meanMotion
                    meanMotionDDot = preEventElset.meanMotionDDot
                    meanMotionDot = preEventElset.meanMotionDot
                    origin = preEventElset.origin
                    origNetwork = preEventElset.origNetwork
                    origObjectId = preEventElset.origObjectId
                    perigee = preEventElset.perigee
                    period = preEventElset.period
                    raan = preEventElset.raan
                    rawFileUri = preEventElset.rawFileUri
                    revNo = preEventElset.revNo
                    satNo = preEventElset.satNo
                    semiMajorAxis = preEventElset.semiMajorAxis
                    sourcedData = preEventElset.sourcedData.map { it.toMutableList() }
                    sourcedDataTypes = preEventElset.sourcedDataTypes.map { it.toMutableList() }
                    sourceDl = preEventElset.sourceDl
                    tags = preEventElset.tags.map { it.toMutableList() }
                    transactionId = preEventElset.transactionId
                    uct = preEventElset.uct
                    additionalProperties = preEventElset.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [PreEventElset].
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
                fun build(): PreEventElset =
                    PreEventElset(
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

            fun validate(): PreEventElset = apply {
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

                return other is PreEventElset &&
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
                "PreEventElset{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, agom=$agom, algorithm=$algorithm, apogee=$apogee, argOfPerigee=$argOfPerigee, ballisticCoeff=$ballisticCoeff, bStar=$bStar, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, eccentricity=$eccentricity, ephemType=$ephemType, idElset=$idElset, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, inclination=$inclination, line1=$line1, line2=$line2, meanAnomaly=$meanAnomaly, meanMotion=$meanMotion, meanMotionDDot=$meanMotionDDot, meanMotionDot=$meanMotionDot, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, perigee=$perigee, period=$period, raan=$raan, rawFileUri=$rawFileUri, revNo=$revNo, satNo=$satNo, semiMajorAxis=$semiMajorAxis, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, tags=$tags, transactionId=$transactionId, uct=$uct, additionalProperties=$additionalProperties}"
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
        class PreEventStateVector
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
            private val msgTs: JsonField<OffsetDateTime>,
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
                @JsonProperty("msgTs")
                @ExcludeMissing
                msgTs: JsonField<OffsetDateTime> = JsonMissing.of(),
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
                msgTs,
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
             * Time when message was generated in ISO 8601 UTC format with microsecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun msgTs(): Optional<OffsetDateTime> = msgTs.getOptional("msgTs")

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
             * Returns the raw JSON value of [msgTs].
             *
             * Unlike [msgTs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("msgTs") @ExcludeMissing fun _msgTs(): JsonField<OffsetDateTime> = msgTs

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
                 * Returns a mutable builder for constructing an instance of [PreEventStateVector].
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

            /** A builder for [PreEventStateVector]. */
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
                private var msgTs: JsonField<OffsetDateTime> = JsonMissing.of()
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
                internal fun from(preEventStateVector: PreEventStateVector) = apply {
                    classificationMarking = preEventStateVector.classificationMarking
                    dataMode = preEventStateVector.dataMode
                    epoch = preEventStateVector.epoch
                    source = preEventStateVector.source
                    actualOdSpan = preEventStateVector.actualOdSpan
                    algorithm = preEventStateVector.algorithm
                    alt1ReferenceFrame = preEventStateVector.alt1ReferenceFrame
                    alt2ReferenceFrame = preEventStateVector.alt2ReferenceFrame
                    area = preEventStateVector.area
                    bDot = preEventStateVector.bDot
                    cmOffset = preEventStateVector.cmOffset
                    cov = preEventStateVector.cov.map { it.toMutableList() }
                    covMethod = preEventStateVector.covMethod
                    covReferenceFrame = preEventStateVector.covReferenceFrame
                    createdAt = preEventStateVector.createdAt
                    createdBy = preEventStateVector.createdBy
                    descriptor = preEventStateVector.descriptor
                    dragArea = preEventStateVector.dragArea
                    dragCoeff = preEventStateVector.dragCoeff
                    dragModel = preEventStateVector.dragModel
                    edr = preEventStateVector.edr
                    eqCov = preEventStateVector.eqCov.map { it.toMutableList() }
                    errorControl = preEventStateVector.errorControl
                    fixedStep = preEventStateVector.fixedStep
                    geopotentialModel = preEventStateVector.geopotentialModel
                    iau1980Terms = preEventStateVector.iau1980Terms
                    idOnOrbit = preEventStateVector.idOnOrbit
                    idOrbitDetermination = preEventStateVector.idOrbitDetermination
                    idStateVector = preEventStateVector.idStateVector
                    integratorMode = preEventStateVector.integratorMode
                    inTrackThrust = preEventStateVector.inTrackThrust
                    lastObEnd = preEventStateVector.lastObEnd
                    lastObStart = preEventStateVector.lastObStart
                    leapSecondTime = preEventStateVector.leapSecondTime
                    lunarSolar = preEventStateVector.lunarSolar
                    mass = preEventStateVector.mass
                    msgTs = preEventStateVector.msgTs
                    obsAvailable = preEventStateVector.obsAvailable
                    obsUsed = preEventStateVector.obsUsed
                    origin = preEventStateVector.origin
                    origNetwork = preEventStateVector.origNetwork
                    origObjectId = preEventStateVector.origObjectId
                    partials = preEventStateVector.partials
                    pedigree = preEventStateVector.pedigree
                    polarMotionX = preEventStateVector.polarMotionX
                    polarMotionY = preEventStateVector.polarMotionY
                    posUnc = preEventStateVector.posUnc
                    rawFileUri = preEventStateVector.rawFileUri
                    recOdSpan = preEventStateVector.recOdSpan
                    referenceFrame = preEventStateVector.referenceFrame
                    residualsAcc = preEventStateVector.residualsAcc
                    revNo = preEventStateVector.revNo
                    rms = preEventStateVector.rms
                    satNo = preEventStateVector.satNo
                    sigmaPosUvw = preEventStateVector.sigmaPosUvw.map { it.toMutableList() }
                    sigmaVelUvw = preEventStateVector.sigmaVelUvw.map { it.toMutableList() }
                    solarFluxApAvg = preEventStateVector.solarFluxApAvg
                    solarFluxF10 = preEventStateVector.solarFluxF10
                    solarFluxF10Avg = preEventStateVector.solarFluxF10Avg
                    solarRadPress = preEventStateVector.solarRadPress
                    solarRadPressCoeff = preEventStateVector.solarRadPressCoeff
                    solidEarthTides = preEventStateVector.solidEarthTides
                    sourcedData = preEventStateVector.sourcedData.map { it.toMutableList() }
                    sourcedDataTypes =
                        preEventStateVector.sourcedDataTypes.map { it.toMutableList() }
                    sourceDl = preEventStateVector.sourceDl
                    srpArea = preEventStateVector.srpArea
                    stepMode = preEventStateVector.stepMode
                    stepSize = preEventStateVector.stepSize
                    stepSizeSelection = preEventStateVector.stepSizeSelection
                    tags = preEventStateVector.tags.map { it.toMutableList() }
                    taiUtc = preEventStateVector.taiUtc
                    thrustAccel = preEventStateVector.thrustAccel
                    tracksAvail = preEventStateVector.tracksAvail
                    tracksUsed = preEventStateVector.tracksUsed
                    transactionId = preEventStateVector.transactionId
                    uct = preEventStateVector.uct
                    ut1Rate = preEventStateVector.ut1Rate
                    ut1Utc = preEventStateVector.ut1Utc
                    velUnc = preEventStateVector.velUnc
                    xaccel = preEventStateVector.xaccel
                    xpos = preEventStateVector.xpos
                    xposAlt1 = preEventStateVector.xposAlt1
                    xposAlt2 = preEventStateVector.xposAlt2
                    xvel = preEventStateVector.xvel
                    xvelAlt1 = preEventStateVector.xvelAlt1
                    xvelAlt2 = preEventStateVector.xvelAlt2
                    yaccel = preEventStateVector.yaccel
                    ypos = preEventStateVector.ypos
                    yposAlt1 = preEventStateVector.yposAlt1
                    yposAlt2 = preEventStateVector.yposAlt2
                    yvel = preEventStateVector.yvel
                    yvelAlt1 = preEventStateVector.yvelAlt1
                    yvelAlt2 = preEventStateVector.yvelAlt2
                    zaccel = preEventStateVector.zaccel
                    zpos = preEventStateVector.zpos
                    zposAlt1 = preEventStateVector.zposAlt1
                    zposAlt2 = preEventStateVector.zposAlt2
                    zvel = preEventStateVector.zvel
                    zvelAlt1 = preEventStateVector.zvelAlt1
                    zvelAlt2 = preEventStateVector.zvelAlt2
                    additionalProperties = preEventStateVector.additionalProperties.toMutableMap()
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

                /**
                 * Time when message was generated in ISO 8601 UTC format with microsecond
                 * precision.
                 */
                fun msgTs(msgTs: OffsetDateTime) = msgTs(JsonField.of(msgTs))

                /**
                 * Sets [Builder.msgTs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.msgTs] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun msgTs(msgTs: JsonField<OffsetDateTime>) = apply { this.msgTs = msgTs }

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
                 * Returns an immutable instance of [PreEventStateVector].
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
                fun build(): PreEventStateVector =
                    PreEventStateVector(
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
                        msgTs,
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

            fun validate(): PreEventStateVector = apply {
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
                msgTs()
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
                    (if (msgTs.asKnown().isPresent) 1 else 0) +
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

                return other is PreEventStateVector &&
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
                    msgTs == other.msgTs &&
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
                    msgTs,
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
                "PreEventStateVector{classificationMarking=$classificationMarking, dataMode=$dataMode, epoch=$epoch, source=$source, actualOdSpan=$actualOdSpan, algorithm=$algorithm, alt1ReferenceFrame=$alt1ReferenceFrame, alt2ReferenceFrame=$alt2ReferenceFrame, area=$area, bDot=$bDot, cmOffset=$cmOffset, cov=$cov, covMethod=$covMethod, covReferenceFrame=$covReferenceFrame, createdAt=$createdAt, createdBy=$createdBy, descriptor=$descriptor, dragArea=$dragArea, dragCoeff=$dragCoeff, dragModel=$dragModel, edr=$edr, eqCov=$eqCov, errorControl=$errorControl, fixedStep=$fixedStep, geopotentialModel=$geopotentialModel, iau1980Terms=$iau1980Terms, idOnOrbit=$idOnOrbit, idOrbitDetermination=$idOrbitDetermination, idStateVector=$idStateVector, integratorMode=$integratorMode, inTrackThrust=$inTrackThrust, lastObEnd=$lastObEnd, lastObStart=$lastObStart, leapSecondTime=$leapSecondTime, lunarSolar=$lunarSolar, mass=$mass, msgTs=$msgTs, obsAvailable=$obsAvailable, obsUsed=$obsUsed, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, partials=$partials, pedigree=$pedigree, polarMotionX=$polarMotionX, polarMotionY=$polarMotionY, posUnc=$posUnc, rawFileUri=$rawFileUri, recOdSpan=$recOdSpan, referenceFrame=$referenceFrame, residualsAcc=$residualsAcc, revNo=$revNo, rms=$rms, satNo=$satNo, sigmaPosUvw=$sigmaPosUvw, sigmaVelUvw=$sigmaVelUvw, solarFluxApAvg=$solarFluxApAvg, solarFluxF10=$solarFluxF10, solarFluxF10Avg=$solarFluxF10Avg, solarRadPress=$solarRadPress, solarRadPressCoeff=$solarRadPressCoeff, solidEarthTides=$solidEarthTides, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, sourceDl=$sourceDl, srpArea=$srpArea, stepMode=$stepMode, stepSize=$stepSize, stepSizeSelection=$stepSizeSelection, tags=$tags, taiUtc=$taiUtc, thrustAccel=$thrustAccel, tracksAvail=$tracksAvail, tracksUsed=$tracksUsed, transactionId=$transactionId, uct=$uct, ut1Rate=$ut1Rate, ut1Utc=$ut1Utc, velUnc=$velUnc, xaccel=$xaccel, xpos=$xpos, xposAlt1=$xposAlt1, xposAlt2=$xposAlt2, xvel=$xvel, xvelAlt1=$xvelAlt1, xvelAlt2=$xvelAlt2, yaccel=$yaccel, ypos=$ypos, yposAlt1=$yposAlt1, yposAlt2=$yposAlt2, yvel=$yvel, yvelAlt1=$yvelAlt1, yvelAlt2=$yvelAlt2, zaccel=$zaccel, zpos=$zpos, zposAlt1=$zposAlt1, zposAlt2=$zposAlt2, zvel=$zvel, zvelAlt1=$zvelAlt1, zvelAlt2=$zvelAlt2, additionalProperties=$additionalProperties}"
        }

        class SourcedDataType
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
             * An enum containing [SourcedDataType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SourcedDataType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                 * An enum member indicating that [SourcedDataType] was instantiated with an unknown
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
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                eventStartTime == other.eventStartTime &&
                source == other.source &&
                id == other.id &&
                algorithm == other.algorithm &&
                characterization == other.characterization &&
                characterizationUnc == other.characterizationUnc &&
                cov == other.cov &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                deltaMass == other.deltaMass &&
                deltaPos == other.deltaPos &&
                deltaPosU == other.deltaPosU &&
                deltaPosV == other.deltaPosV &&
                deltaPosW == other.deltaPosW &&
                deltaVel == other.deltaVel &&
                deltaVelU == other.deltaVelU &&
                deltaVelV == other.deltaVelV &&
                deltaVelW == other.deltaVelW &&
                description == other.description &&
                descriptor == other.descriptor &&
                eventEndTime == other.eventEndTime &&
                eventId == other.eventId &&
                idOnOrbit == other.idOnOrbit &&
                idSensor == other.idSensor &&
                maneuverUnc == other.maneuverUnc &&
                mnvrAccels == other.mnvrAccels &&
                mnvrAccelTimes == other.mnvrAccelTimes &&
                mnvrAccelUncs == other.mnvrAccelUncs &&
                numAccelPoints == other.numAccelPoints &&
                numObs == other.numObs &&
                odFitEndTime == other.odFitEndTime &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origObjectId == other.origObjectId &&
                origSensorId == other.origSensorId &&
                postApogee == other.postApogee &&
                postArea == other.postArea &&
                postBallisticCoeff == other.postBallisticCoeff &&
                postDriftRate == other.postDriftRate &&
                postEccentricity == other.postEccentricity &&
                postEventElset == other.postEventElset &&
                postEventIdElset == other.postEventIdElset &&
                postEventIdStateVector == other.postEventIdStateVector &&
                postEventStateVector == other.postEventStateVector &&
                postGeoLongitude == other.postGeoLongitude &&
                postInclination == other.postInclination &&
                postMass == other.postMass &&
                postPerigee == other.postPerigee &&
                postPeriod == other.postPeriod &&
                postPosX == other.postPosX &&
                postPosY == other.postPosY &&
                postPosZ == other.postPosZ &&
                postRaan == other.postRaan &&
                postRadiationPressCoeff == other.postRadiationPressCoeff &&
                postSigmaU == other.postSigmaU &&
                postSigmaV == other.postSigmaV &&
                postSigmaW == other.postSigmaW &&
                postSma == other.postSma &&
                postVelX == other.postVelX &&
                postVelY == other.postVelY &&
                postVelZ == other.postVelZ &&
                preApogee == other.preApogee &&
                preBallisticCoeff == other.preBallisticCoeff &&
                preDriftRate == other.preDriftRate &&
                preEccentricity == other.preEccentricity &&
                preEventElset == other.preEventElset &&
                preEventIdElset == other.preEventIdElset &&
                preEventIdStateVector == other.preEventIdStateVector &&
                preEventStateVector == other.preEventStateVector &&
                preGeoLongitude == other.preGeoLongitude &&
                preInclination == other.preInclination &&
                prePerigee == other.prePerigee &&
                prePeriod == other.prePeriod &&
                prePosX == other.prePosX &&
                prePosY == other.prePosY &&
                prePosZ == other.prePosZ &&
                preRaan == other.preRaan &&
                preRadiationPressCoeff == other.preRadiationPressCoeff &&
                preSigmaU == other.preSigmaU &&
                preSigmaV == other.preSigmaV &&
                preSigmaW == other.preSigmaW &&
                preSma == other.preSma &&
                preVelX == other.preVelX &&
                preVelY == other.preVelY &&
                preVelZ == other.preVelZ &&
                reportTime == other.reportTime &&
                satNo == other.satNo &&
                sourcedData == other.sourcedData &&
                sourcedDataTypes == other.sourcedDataTypes &&
                stateModel == other.stateModel &&
                stateModelVersion == other.stateModelVersion &&
                status == other.status &&
                tags == other.tags &&
                totalBurnTime == other.totalBurnTime &&
                transactionId == other.transactionId &&
                uct == other.uct
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                eventStartTime,
                source,
                id,
                algorithm,
                characterization,
                characterizationUnc,
                cov,
                createdAt,
                createdBy,
                deltaMass,
                deltaPos,
                deltaPosU,
                deltaPosV,
                deltaPosW,
                deltaVel,
                deltaVelU,
                deltaVelV,
                deltaVelW,
                description,
                descriptor,
                eventEndTime,
                eventId,
                idOnOrbit,
                idSensor,
                maneuverUnc,
                mnvrAccels,
                mnvrAccelTimes,
                mnvrAccelUncs,
                numAccelPoints,
                numObs,
                odFitEndTime,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                postApogee,
                postArea,
                postBallisticCoeff,
                postDriftRate,
                postEccentricity,
                postEventElset,
                postEventIdElset,
                postEventIdStateVector,
                postEventStateVector,
                postGeoLongitude,
                postInclination,
                postMass,
                postPerigee,
                postPeriod,
                postPosX,
                postPosY,
                postPosZ,
                postRaan,
                postRadiationPressCoeff,
                postSigmaU,
                postSigmaV,
                postSigmaW,
                postSma,
                postVelX,
                postVelY,
                postVelZ,
                preApogee,
                preBallisticCoeff,
                preDriftRate,
                preEccentricity,
                preEventElset,
                preEventIdElset,
                preEventIdStateVector,
                preEventStateVector,
                preGeoLongitude,
                preInclination,
                prePerigee,
                prePeriod,
                prePosX,
                prePosY,
                prePosZ,
                preRaan,
                preRadiationPressCoeff,
                preSigmaU,
                preSigmaV,
                preSigmaW,
                preSma,
                preVelX,
                preVelY,
                preVelZ,
                reportTime,
                satNo,
                sourcedData,
                sourcedDataTypes,
                stateModel,
                stateModelVersion,
                status,
                tags,
                totalBurnTime,
                transactionId,
                uct,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, eventStartTime=$eventStartTime, source=$source, id=$id, algorithm=$algorithm, characterization=$characterization, characterizationUnc=$characterizationUnc, cov=$cov, createdAt=$createdAt, createdBy=$createdBy, deltaMass=$deltaMass, deltaPos=$deltaPos, deltaPosU=$deltaPosU, deltaPosV=$deltaPosV, deltaPosW=$deltaPosW, deltaVel=$deltaVel, deltaVelU=$deltaVelU, deltaVelV=$deltaVelV, deltaVelW=$deltaVelW, description=$description, descriptor=$descriptor, eventEndTime=$eventEndTime, eventId=$eventId, idOnOrbit=$idOnOrbit, idSensor=$idSensor, maneuverUnc=$maneuverUnc, mnvrAccels=$mnvrAccels, mnvrAccelTimes=$mnvrAccelTimes, mnvrAccelUncs=$mnvrAccelUncs, numAccelPoints=$numAccelPoints, numObs=$numObs, odFitEndTime=$odFitEndTime, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, postApogee=$postApogee, postArea=$postArea, postBallisticCoeff=$postBallisticCoeff, postDriftRate=$postDriftRate, postEccentricity=$postEccentricity, postEventElset=$postEventElset, postEventIdElset=$postEventIdElset, postEventIdStateVector=$postEventIdStateVector, postEventStateVector=$postEventStateVector, postGeoLongitude=$postGeoLongitude, postInclination=$postInclination, postMass=$postMass, postPerigee=$postPerigee, postPeriod=$postPeriod, postPosX=$postPosX, postPosY=$postPosY, postPosZ=$postPosZ, postRaan=$postRaan, postRadiationPressCoeff=$postRadiationPressCoeff, postSigmaU=$postSigmaU, postSigmaV=$postSigmaV, postSigmaW=$postSigmaW, postSma=$postSma, postVelX=$postVelX, postVelY=$postVelY, postVelZ=$postVelZ, preApogee=$preApogee, preBallisticCoeff=$preBallisticCoeff, preDriftRate=$preDriftRate, preEccentricity=$preEccentricity, preEventElset=$preEventElset, preEventIdElset=$preEventIdElset, preEventIdStateVector=$preEventIdStateVector, preEventStateVector=$preEventStateVector, preGeoLongitude=$preGeoLongitude, preInclination=$preInclination, prePerigee=$prePerigee, prePeriod=$prePeriod, prePosX=$prePosX, prePosY=$prePosY, prePosZ=$prePosZ, preRaan=$preRaan, preRadiationPressCoeff=$preRadiationPressCoeff, preSigmaU=$preSigmaU, preSigmaV=$preSigmaV, preSigmaW=$preSigmaW, preSma=$preSma, preVelX=$preVelX, preVelY=$preVelY, preVelZ=$preVelZ, reportTime=$reportTime, satNo=$satNo, sourcedData=$sourcedData, sourcedDataTypes=$sourcedDataTypes, stateModel=$stateModel, stateModelVersion=$stateModelVersion, status=$status, tags=$tags, totalBurnTime=$totalBurnTime, transactionId=$transactionId, uct=$uct}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManeuverCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ManeuverCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

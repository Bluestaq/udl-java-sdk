// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.track

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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation intended for initial integration only, to take a list of Track records as a
 * POST body and ingest into the database. This operation is not intended to be used for automated
 * feeds into UDL. Data providers should contact the UDL team for specific role assignments and for
 * instructions on setting up a permanent feed through an alternate mechanism.
 */
class TrackCreateBulkParams
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
         * Returns a mutable builder for constructing an instance of [TrackCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrackCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(trackCreateBulkParams: TrackCreateBulkParams) = apply {
            body = trackCreateBulkParams.body.toMutableList()
            additionalHeaders = trackCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = trackCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [TrackCreateBulkParams].
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
        fun build(): TrackCreateBulkParams =
            TrackCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * A track is a position and optionally a heading/velocity of an object such as an aircraft at a
     * particular timestamp. It also includes optional information regarding the identity/type of
     * the target object, if known.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("ts") @ExcludeMissing private val ts: JsonField<OffsetDateTime>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("alt") @ExcludeMissing private val alt: JsonField<Double>,
        @JsonProperty("asset") @ExcludeMissing private val asset: JsonField<String>,
        @JsonProperty("assetNat") @ExcludeMissing private val assetNat: JsonField<String>,
        @JsonProperty("attitude") @ExcludeMissing private val attitude: JsonField<List<Double>>,
        @JsonProperty("attitudeRate")
        @ExcludeMissing
        private val attitudeRate: JsonField<List<Double>>,
        @JsonProperty("callSign") @ExcludeMissing private val callSign: JsonField<String>,
        @JsonProperty("cntct") @ExcludeMissing private val cntct: JsonField<String>,
        @JsonProperty("contextKeys")
        @ExcludeMissing
        private val contextKeys: JsonField<List<String>>,
        @JsonProperty("contextValues")
        @ExcludeMissing
        private val contextValues: JsonField<List<String>>,
        @JsonProperty("course") @ExcludeMissing private val course: JsonField<Double>,
        @JsonProperty("cov") @ExcludeMissing private val cov: JsonField<List<Double>>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("ecefAcc") @ExcludeMissing private val ecefAcc: JsonField<List<Double>>,
        @JsonProperty("ecefPos") @ExcludeMissing private val ecefPos: JsonField<List<Double>>,
        @JsonProperty("ecefVel") @ExcludeMissing private val ecefVel: JsonField<List<Double>>,
        @JsonProperty("eNUAcc") @ExcludeMissing private val eNuAcc: JsonField<List<Double>>,
        @JsonProperty("eNUGroundVel")
        @ExcludeMissing
        private val eNuGroundVel: JsonField<List<Double>>,
        @JsonProperty("eNUPos") @ExcludeMissing private val eNuPos: JsonField<List<Double>>,
        @JsonProperty("eNUVel") @ExcludeMissing private val eNuVel: JsonField<List<Double>>,
        @JsonProperty("env") @ExcludeMissing private val env: JsonField<String>,
        @JsonProperty("envConf") @ExcludeMissing private val envConf: JsonField<Double>,
        @JsonProperty("errEllp") @ExcludeMissing private val errEllp: JsonField<List<Double>>,
        @JsonProperty("hdng") @ExcludeMissing private val hdng: JsonField<Double>,
        @JsonProperty("identAmp") @ExcludeMissing private val identAmp: JsonField<String>,
        @JsonProperty("identCred") @ExcludeMissing private val identCred: JsonField<Int>,
        @JsonProperty("identRel") @ExcludeMissing private val identRel: JsonField<Int>,
        @JsonProperty("jSeries") @ExcludeMissing private val jSeries: JsonField<String>,
        @JsonProperty("lat") @ExcludeMissing private val lat: JsonField<Double>,
        @JsonProperty("lcAcc") @ExcludeMissing private val lcAcc: JsonField<List<Double>>,
        @JsonProperty("lco") @ExcludeMissing private val lco: JsonField<List<Double>>,
        @JsonProperty("lcPos") @ExcludeMissing private val lcPos: JsonField<List<Double>>,
        @JsonProperty("lcs") @ExcludeMissing private val lcs: JsonField<List<Double>>,
        @JsonProperty("lcVel") @ExcludeMissing private val lcVel: JsonField<List<Double>>,
        @JsonProperty("lon") @ExcludeMissing private val lon: JsonField<Double>,
        @JsonProperty("m1") @ExcludeMissing private val m1: JsonField<Int>,
        @JsonProperty("m1v") @ExcludeMissing private val m1v: JsonField<Int>,
        @JsonProperty("m2") @ExcludeMissing private val m2: JsonField<Int>,
        @JsonProperty("m2v") @ExcludeMissing private val m2v: JsonField<Int>,
        @JsonProperty("m3a") @ExcludeMissing private val m3a: JsonField<Int>,
        @JsonProperty("m3av") @ExcludeMissing private val m3av: JsonField<Int>,
        @JsonProperty("modType") @ExcludeMissing private val modType: JsonField<String>,
        @JsonProperty("msgTs") @ExcludeMissing private val msgTs: JsonField<OffsetDateTime>,
        @JsonProperty("msnId") @ExcludeMissing private val msnId: JsonField<String>,
        @JsonProperty("multiSource") @ExcludeMissing private val multiSource: JsonField<Boolean>,
        @JsonProperty("objAct") @ExcludeMissing private val objAct: JsonField<String>,
        @JsonProperty("objDescription")
        @ExcludeMissing
        private val objDescription: JsonField<String>,
        @JsonProperty("objId") @ExcludeMissing private val objId: JsonField<String>,
        @JsonProperty("objIdent") @ExcludeMissing private val objIdent: JsonField<String>,
        @JsonProperty("objNat") @ExcludeMissing private val objNat: JsonField<String>,
        @JsonProperty("objPlat") @ExcludeMissing private val objPlat: JsonField<String>,
        @JsonProperty("objSpec") @ExcludeMissing private val objSpec: JsonField<String>,
        @JsonProperty("objType") @ExcludeMissing private val objType: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("sen") @ExcludeMissing private val sen: JsonField<String>,
        @JsonProperty("senQual") @ExcludeMissing private val senQual: JsonField<String>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("spd") @ExcludeMissing private val spd: JsonField<Double>,
        @JsonProperty("srcIds") @ExcludeMissing private val srcIds: JsonField<List<String>>,
        @JsonProperty("srcTyps") @ExcludeMissing private val srcTyps: JsonField<List<String>>,
        @JsonProperty("strength") @ExcludeMissing private val strength: JsonField<Int>,
        @JsonProperty("tags") @ExcludeMissing private val tags: JsonField<List<String>>,
        @JsonProperty("trkConf") @ExcludeMissing private val trkConf: JsonField<Double>,
        @JsonProperty("trkId") @ExcludeMissing private val trkId: JsonField<String>,
        @JsonProperty("trkItmId") @ExcludeMissing private val trkItmId: JsonField<String>,
        @JsonProperty("trkNum") @ExcludeMissing private val trkNum: JsonField<String>,
        @JsonProperty("trkPtType") @ExcludeMissing private val trkPtType: JsonField<String>,
        @JsonProperty("trkQual") @ExcludeMissing private val trkQual: JsonField<Int>,
        @JsonProperty("trkStat") @ExcludeMissing private val trkStat: JsonField<String>,
        @JsonProperty("vertUnc") @ExcludeMissing private val vertUnc: JsonField<Double>,
        @JsonProperty("wanderAng") @ExcludeMissing private val wanderAng: JsonField<Double>,
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
         * Track timestamp in ISO8601 UTC format with microsecond precision.
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
         * Track point altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a
         * track object height above ellipsoid, and negative values indicate a track object below
         * ellipsoid, applicable to the depth estimate for a subsurface track.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alt(): Optional<Double> = alt.getOptional("alt")

        /**
         * Id/name of the platform providing the track data (i.e., tail number for air platform,
         * tower ID for tower based sensor, site id for fixed radar).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun asset(): Optional<String> = asset.getOptional("asset")

        /**
         * Nationality or organization of the tracking/reporting system or platform (e.g. FR, NATO,
         * US, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assetNat(): Optional<String> = assetNat.getOptional("assetNat")

        /**
         * The attitude (Yaw, Pitch, and Roll), in degrees, of the track object. When provided, the
         * array must always contain 3 values defining the attitude and may specify an optional
         * timestamp indicating when the data was measured, last known to be correct and/or
         * predicted to occur. These values represent the vehicle's rotation about the vertical,
         * lateral, and longitudinal axes, respectively, in a locally level, East, North, Up "right
         * handed" coordinate system centered on the vehicle. Yaw is measured in degrees and ranges
         * from -180 to 180. Pitch is measured in degrees and ranges from -90 to 90. Roll is
         * measured in degrees and ranges from -180 to 180.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attitude(): Optional<List<Double>> = attitude.getOptional("attitude")

        /**
         * The attitude rate (Yaw Rate, Pitch Rate, and Roll Rate), in degrees per second, of the
         * track object. When provided, the array must always contain 3 values defining the attitude
         * rate and may specify an optional timestamp indicating when the data was measured, last
         * known to be correct and/or predicted to occur. These values represent the rate of change
         * of the vehicle's rotation about the vertical, lateral, and longitudinal axes,
         * respectively, in a locally level, East, North, Up "right handed" coordinate system
         * centered on the vehicle.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun attitudeRate(): Optional<List<Double>> = attitudeRate.getOptional("attitudeRate")

        /**
         * The call sign currently assigned to this track object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun callSign(): Optional<String> = callSign.getOptional("callSign")

        /**
         * Contact information for assets reporting PPLI (Precise Participant Location and
         * Identification). PPLI is a Link 16 message that is used by units to transmit complete
         * location, identification, and limited status information.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cntct(): Optional<String> = cntct.getOptional("cntct")

        /**
         * An optional string array containing additional data (keys) representing relevant items
         * for context of fields not specifically defined in this schema. This array is paired with
         * the contextValues string array and must contain the same number of items. Please note
         * these fields are intended for contextual use only and do not pertain to core schema
         * information. To ensure proper integration and avoid misuse, coordination of how these
         * fields are populated and consumed is required during onboarding.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contextKeys(): Optional<List<String>> = contextKeys.getOptional("contextKeys")

        /**
         * An optional string array containing the values associated with the contextKeys array.
         * This array is paired with the contextKeys string array and must contain the same number
         * of items. Please note these fields are intended for contextual use only and do not
         * pertain to core schema information. To ensure proper integration and avoid misuse,
         * coordination of how these fields are populated and consumed is required during
         * onboarding.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun contextValues(): Optional<List<String>> = contextValues.getOptional("contextValues")

        /**
         * The track object course-over-ground, in degrees clockwise from true North at the object
         * location (0-360 degrees).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun course(): Optional<Double> = course.getOptional("course")

        /**
         * Covariance matrix, in meter and second based units, for the defined cartesian system.
         *
         * The array values represent the lower triangular half of the position-velocity covariance
         * matrix. The size of the covariance matrix is dynamic. The values are output as an array
         * of values corresponding to the position-velocity covariance element positions, ordered as
         * follows:
         *
         * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;y&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;y'&nbsp;z'&nbsp;&nbsp;
         *
         * x&nbsp;&nbsp;&nbsp;&nbsp;1
         *
         * y&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;3
         *
         * z&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;6
         *
         * x'&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;10
         *
         * y'&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
         *
         * z'&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp; 21
         *
         * The covariance matrix will be as large as the last element needed, and with unused values
         * zero-filled to maintain proper element positioning in the array. For example, for a 2D
         * (x, y) position-only covariance, the covariance matrix will be 2x2 and the array would
         * contain the 3 elements corresponding to the x, and y position. Another example, now for a
         * 2D (x, y) position-velocity covariance, the covariance matrix will be 5x5 and the array
         * would contain the 15 elements corresponding to the relevant x, y, x', and y' values (with
         * the z-row and z-column being all zeros). The cov array should contain only the lower left
         * triangle values from top left down to bottom right, in order.
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
         * Array of the track object acceleration, [x'', y'', z''], in meters per second squared, in
         * the Earth Centered - Earth Fixed (ECEF) reference frame. When provided, array must always
         * contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ecefAcc(): Optional<List<Double>> = ecefAcc.getOptional("ecefAcc")

        /**
         * Array of the track object position, [x, y, z], in meters, in the Earth Centered - Earth
         * Fixed (ECEF) reference frame. When provided, array must always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ecefPos(): Optional<List<Double>> = ecefPos.getOptional("ecefPos")

        /**
         * Array of the track object velocity, [x', y', z'], in meters per second, in the Earth
         * Centered - Earth Fixed (ECEF) reference frame. When provided, array must always contain 3
         * values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun ecefVel(): Optional<List<Double>> = ecefVel.getOptional("ecefVel")

        /**
         * East, North, Up acceleration components, in meters per second squared. When provided,
         * array must always contain 3 values defining the acceleration.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eNuAcc(): Optional<List<Double>> = eNuAcc.getOptional("eNUAcc")

        /**
         * East, North, Up ground velocity components, in meters per second. When provided, array
         * must always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eNuGroundVel(): Optional<List<Double>> = eNuGroundVel.getOptional("eNUGroundVel")

        /**
         * East, North, Up position components, in meters. When provided, array must always contain
         * 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eNuPos(): Optional<List<Double>> = eNuPos.getOptional("eNUPos")

        /**
         * East, North, Up velocity components, in meters per second. When provided, array must
         * always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eNuVel(): Optional<List<Double>> = eNuVel.getOptional("eNUVel")

        /**
         * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
         *
         * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
         * miles).
         *
         * LAND: On the surface of dry land.
         *
         * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
         *
         * SURFACE: On the surface of a body of water.
         *
         * SUBSURFACE: Below the surface of a body of water.
         *
         * UNKNOWN: Environment is not known.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun env(): Optional<String> = env.getOptional("env")

        /**
         * Track environment confidence estimate (not standardized).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun envConf(): Optional<Double> = envConf.getOptional("envConf")

        /**
         * Uncertainty ellipsoid
         * [semi-major axis (meters), semi-minor axis (meters), orientation (degrees)]. When
         * provided, array must always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun errEllp(): Optional<List<Double>> = errEllp.getOptional("errEllp")

        /**
         * The track object heading, in degrees clockwise from true North at the object location
         * (0-360 degrees).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hdng(): Optional<Double> = hdng.getOptional("hdng")

        /**
         * Additional track object identity/status information, typically used for EXERCISE identity
         * amplification (FAKER, JOKER, KILO, TRAVELLER, ZOMBIE):
         *
         * FAKER: Friendly track, object, or entity acting as an exercise hostile.
         *
         * JOKER: Friendly track, object, or entity acting as an exercise suspect.
         *
         * KILO: Friendly high-value object.
         *
         * TRAVELLER: Suspect land or surface track following a recognized traffic route.
         *
         * ZOMBIE: Suspect track, object, or entity of special interest.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun identAmp(): Optional<String> = identAmp.getOptional("identAmp")

        /**
         * Track object identity credibility.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun identCred(): Optional<Int> = identCred.getOptional("identCred")

        /**
         * Track object identity reliability.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun identRel(): Optional<Int> = identRel.getOptional("identRel")

        /**
         * The J-series message type, if this track is derived from a J-series message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun jSeries(): Optional<String> = jSeries.getOptional("jSeries")

        /**
         * WGS-84 latitude of the track object, in degrees. -90 to 90 degrees (negative values south
         * of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * Estimate of the acceleration, [x'', y'', z''], of the track object in the defined
         * cartesian system, in meters per second squared. When provided, array must always contain
         * 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lcAcc(): Optional<List<Double>> = lcAcc.getOptional("lcAcc")

        /**
         * Origin of a local coordinate system [lat, lon, altitude]. When provided, array must
         * always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lco(): Optional<List<Double>> = lco.getOptional("lco")

        /**
         * Estimate of the position, [x, y, z], of the track object in the defined cartesian system,
         * in meters. When provided, array must always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lcPos(): Optional<List<Double>> = lcPos.getOptional("lcPos")

        /**
         * x, y, and z-axis rotations (degrees) about ECEF that define a local cartesian system.
         * When provided, array must always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lcs(): Optional<List<Double>> = lcs.getOptional("lcs")

        /**
         * Estimate of the velocity, [x', y', z'], of the track object in the defined cartesian
         * system, in meters per second. When provided, array must always contain 3 values.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lcVel(): Optional<List<Double>> = lcVel.getOptional("lcVel")

        /**
         * WGS-84 longitude of the track object, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lon(): Optional<Double> = lon.getOptional("lon")

        /**
         * Mode-1 interrogation response (mission code), indicating mission or aircraft type. Assume
         * leading 0's for any inputs that are less than 2 digits.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun m1(): Optional<Int> = m1.getOptional("m1")

        /**
         * Mode-1 validity status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun m1v(): Optional<Int> = m1v.getOptional("m1v")

        /**
         * Mode-2 interrogation response (military identification code). Assume leading 0's for any
         * inputs that are less than 4 digits.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun m2(): Optional<Int> = m2.getOptional("m2")

        /**
         * Mode-2 validity status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun m2v(): Optional<Int> = m2v.getOptional("m2v")

        /**
         * Mode-3/A interrogation response (aircraft identification), provides a 4-digit octal
         * identification code for the aircraft, assigned by the air traffic controller. Mode-3/A is
         * shared military/civilian use. Assume leading 0's for any inputs that are less than 4
         * digits.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun m3a(): Optional<Int> = m3a.getOptional("m3a")

        /**
         * Mode-3/A validity status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun m3av(): Optional<Int> = m3av.getOptional("m3av")

        /**
         * The type of source information from which the track was derived. Intended as, but not
         * constrained to, NATO STANAG 4676 modality types (AIS, BFT, BIOMETRIC, COMINT, DOPPLER,
         * ELINT, HRR, HUMINT, IMAGE, MASINT, MIXED, OSINT, OTHER):
         *
         * AIS: Derived from an automated identification system source.
         *
         * BFT: Derived from a blue force tracking source.
         *
         * BIOMETRICS: Derived from a biometrics source.
         *
         * COMINT: Derived from a communications intelligence source.
         *
         * DOPPLER: Derived from a radar doppler source.
         *
         * ELINT: Derived from an electronics intelligence source.
         *
         * HRR: Derived from a radar high range resolution source.
         *
         * HUMINT: Derived from a human intelligence source.
         *
         * IMAGE: Derived from a still or motion imagery source.
         *
         * MASINT: Derived from a measurement and signals intelligence source.
         *
         * MIXED: Derived from a combination of two or more sources.
         *
         * OSINT: Derived from an open source intelligence source.
         *
         * OTHER: Derived from other types of unspecified sources.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun modType(): Optional<String> = modType.getOptional("modType")

        /**
         * Timestamp when the message was created, in ISO8601 UTC format with microsecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msgTs(): Optional<OffsetDateTime> = msgTs.getOptional("msgTs")

        /**
         * Mission ID related to the track.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun msnId(): Optional<String> = msnId.getOptional("msnId")

        /**
         * Flag indicating that this track is fused from multiple sensor sources.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun multiSource(): Optional<Boolean> = multiSource.getOptional("multiSource")

        /**
         * The activity in which the track object is engaged. Intended as, but not constrained to,
         * MIL-STD-6016 environment dependent activity designations. The activity can be reported as
         * either a combination of the code and environment (e.g. 65/AIR) or as the descriptive
         * enumeration (e.g. DIVERTING), which are equivalent.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objAct(): Optional<String> = objAct.getOptional("objAct")

        /**
         * This is the free-text, generally human-readable, name of the System or Resource
         * corresponding to this track record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objDescription(): Optional<String> = objDescription.getOptional("objDescription")

        /**
         * The UID or designation of the tracked object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objId(): Optional<String> = objId.getOptional("objId")

        /**
         * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
         * PENDING, SUSPECT, UNKNOWN):
         *
         * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
         * and/or origin.
         *
         * FRIEND: Track object supporting friendly forces and belonging to a declared friendly
         * nation or entity.
         *
         * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
         * contribute to a threat to friendly forces or their mission due to its behavior,
         * characteristics, nationality, or origin.
         *
         * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin
         * indicate that it is neither supporting nor opposing friendly forces or their mission.
         *
         * PENDING: Track object which has not been evaluated.
         *
         * SUSPECT: Track object deemed potentially hostile due to the object characteristics,
         * behavior, nationality, and/or origin.
         *
         * UNKNOWN: Track object which has been evaluated and does not meet criteria for any
         * standard identity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objIdent(): Optional<String> = objIdent.getOptional("objIdent")

        /**
         * Nationality or organization of the track object (e.g. FR, NATO, US, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objNat(): Optional<String> = objNat.getOptional("objNat")

        /**
         * The object platform type. Intended as, but not constrained to, MIL-STD-6016 environment
         * dependent platform type designations. The platform type can be reported as either a
         * combination of the code and environment (e.g. 14/LAND) or as the descriptive
         * representations (e.g. COMBAT VEHICLE), which are equivalent.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objPlat(): Optional<String> = objPlat.getOptional("objPlat")

        /**
         * The object specific type. Intended as, but not constrained to, MIL-STD-6016 environment
         * dependent specific type designations. The specific type can be reported as either a
         * combination of the code and environment (e.g. 155/SURFACE) or as the descriptive
         * representation (e.g. AUDACE DDG), which are equivalent.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objSpec(): Optional<String> = objSpec.getOptional("objSpec")

        /**
         * The generic classification of the track object/group (e.g., HELICOPTER, TRACKED,
         * WATERCRAFT, WHEELED, etc.). Referenced, but not constrained to, NATO STANAG 4676 object
         * type classifications.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objType(): Optional<String> = objType.getOptional("objType")

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
         * Id/name of sensor providing the track data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sen(): Optional<String> = sen.getOptional("sen")

        /**
         * Sensor quality.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun senQual(): Optional<String> = senQual.getOptional("senQual")

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
         * Track object speed, in meters per second.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun spd(): Optional<Double> = spd.getOptional("spd")

        /**
         * Array of UUIDs of the UDL data records that contributed to the generation of this fused
         * track. See the associated 'srcTyps' array for the specific types of data, positionally
         * corresponding to the UUIDs in this array, used in the track fusion. The 'srcTyps' and
         * 'srcIds' arrays must match in size. See the corresponding srcTyps array element for the
         * data type of the UUID and use the appropriate API operation to retrieve that object (e.g.
         * /udl/poi/{uuid}).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

        /**
         * Array of UDL record types (POI, MTI, TRACK, GROUNDIMAGE) that contributed to the
         * generation of this fused track. See the associated 'srcIds' array for the record UUIDs,
         * positionally corresponding to the record types in this array, used in the track fusion.
         * The 'srcTyps' and 'srcIds' arrays must match in size.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

        /**
         * The number of objects or units moving as a group and represented as a single entity in
         * this track message. If null, the track is assumed to represent a single object. Note that
         * if this track derives from a J-series message then special definitions apply for the
         * following values: 13 indicates an estimated 2-7 units, 14 indicates an estimated more
         * than 7 units, and 15 indicates an estimated more than 12 units.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun strength(): Optional<Int> = strength.getOptional("strength")

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
         * Overall track confidence estimate (not standardized, but typically a value between 0 and
         * 1, with 0 indicating lowest confidence).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkConf(): Optional<Double> = trkConf.getOptional("trkConf")

        /**
         * UUID identifying the track, which should remain the same on subsequent tracks of the same
         * object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkId(): Optional<String> = trkId.getOptional("trkId")

        /**
         * UUID of the track item object. Intended for, but not restricted to, STANAG-4676 messages.
         * This ID is used to distinguish an individual track within a message or external system
         * containing multiple tracks on single or multiple targets.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkItmId(): Optional<String> = trkItmId.getOptional("trkItmId")

        /**
         * The track number (TN) of a surveillance entity. Intended as, but not constrained to, the
         * J-series track number encoded as five character alpha-numeric characters. Users should
         * refer to J-series documentation for specific TN definitions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkNum(): Optional<String> = trkNum.getOptional("trkNum")

        /**
         * Means by which the track data was created (e.g., MEASURED, AUTOMATIC PREDICTED, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkPtType(): Optional<String> = trkPtType.getOptional("trkPtType")

        /**
         * Value indicating track quality (not standardized).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkQual(): Optional<Int> = trkQual.getOptional("trkQual")

        /**
         * Status of the track (e.g., INITIATING, MAINTAINING, DROPPING, TERMINATED, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun trkStat(): Optional<String> = trkStat.getOptional("trkStat")

        /**
         * The vertical uncertainty represents the 1-sigma position uncertainty perpendicular to the
         * error Ellipse surface in the up (+) / down (-) direction measured in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun vertUnc(): Optional<Double> = vertUnc.getOptional("vertUnc")

        /**
         * The angle by which the Inertial Navigation System (INS) rotates the geodetic frame about
         * the axis to avoid the introduction of a singularity at the North pole when it is
         * calculating vehicle location.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun wanderAng(): Optional<Double> = wanderAng.getOptional("wanderAng")

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
         * Returns the raw JSON value of [alt].
         *
         * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

        /**
         * Returns the raw JSON value of [asset].
         *
         * Unlike [asset], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset") @ExcludeMissing fun _asset(): JsonField<String> = asset

        /**
         * Returns the raw JSON value of [assetNat].
         *
         * Unlike [assetNat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("assetNat") @ExcludeMissing fun _assetNat(): JsonField<String> = assetNat

        /**
         * Returns the raw JSON value of [attitude].
         *
         * Unlike [attitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attitude")
        @ExcludeMissing
        fun _attitude(): JsonField<List<Double>> = attitude

        /**
         * Returns the raw JSON value of [attitudeRate].
         *
         * Unlike [attitudeRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attitudeRate")
        @ExcludeMissing
        fun _attitudeRate(): JsonField<List<Double>> = attitudeRate

        /**
         * Returns the raw JSON value of [callSign].
         *
         * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

        /**
         * Returns the raw JSON value of [cntct].
         *
         * Unlike [cntct], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cntct") @ExcludeMissing fun _cntct(): JsonField<String> = cntct

        /**
         * Returns the raw JSON value of [contextKeys].
         *
         * Unlike [contextKeys], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contextKeys")
        @ExcludeMissing
        fun _contextKeys(): JsonField<List<String>> = contextKeys

        /**
         * Returns the raw JSON value of [contextValues].
         *
         * Unlike [contextValues], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contextValues")
        @ExcludeMissing
        fun _contextValues(): JsonField<List<String>> = contextValues

        /**
         * Returns the raw JSON value of [course].
         *
         * Unlike [course], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("course") @ExcludeMissing fun _course(): JsonField<Double> = course

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
         * Returns the raw JSON value of [ecefAcc].
         *
         * Unlike [ecefAcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ecefAcc") @ExcludeMissing fun _ecefAcc(): JsonField<List<Double>> = ecefAcc

        /**
         * Returns the raw JSON value of [ecefPos].
         *
         * Unlike [ecefPos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ecefPos") @ExcludeMissing fun _ecefPos(): JsonField<List<Double>> = ecefPos

        /**
         * Returns the raw JSON value of [ecefVel].
         *
         * Unlike [ecefVel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ecefVel") @ExcludeMissing fun _ecefVel(): JsonField<List<Double>> = ecefVel

        /**
         * Returns the raw JSON value of [eNuAcc].
         *
         * Unlike [eNuAcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eNUAcc") @ExcludeMissing fun _eNuAcc(): JsonField<List<Double>> = eNuAcc

        /**
         * Returns the raw JSON value of [eNuGroundVel].
         *
         * Unlike [eNuGroundVel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("eNUGroundVel")
        @ExcludeMissing
        fun _eNuGroundVel(): JsonField<List<Double>> = eNuGroundVel

        /**
         * Returns the raw JSON value of [eNuPos].
         *
         * Unlike [eNuPos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eNUPos") @ExcludeMissing fun _eNuPos(): JsonField<List<Double>> = eNuPos

        /**
         * Returns the raw JSON value of [eNuVel].
         *
         * Unlike [eNuVel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eNUVel") @ExcludeMissing fun _eNuVel(): JsonField<List<Double>> = eNuVel

        /**
         * Returns the raw JSON value of [env].
         *
         * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<String> = env

        /**
         * Returns the raw JSON value of [envConf].
         *
         * Unlike [envConf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("envConf") @ExcludeMissing fun _envConf(): JsonField<Double> = envConf

        /**
         * Returns the raw JSON value of [errEllp].
         *
         * Unlike [errEllp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errEllp") @ExcludeMissing fun _errEllp(): JsonField<List<Double>> = errEllp

        /**
         * Returns the raw JSON value of [hdng].
         *
         * Unlike [hdng], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hdng") @ExcludeMissing fun _hdng(): JsonField<Double> = hdng

        /**
         * Returns the raw JSON value of [identAmp].
         *
         * Unlike [identAmp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identAmp") @ExcludeMissing fun _identAmp(): JsonField<String> = identAmp

        /**
         * Returns the raw JSON value of [identCred].
         *
         * Unlike [identCred], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identCred") @ExcludeMissing fun _identCred(): JsonField<Int> = identCred

        /**
         * Returns the raw JSON value of [identRel].
         *
         * Unlike [identRel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identRel") @ExcludeMissing fun _identRel(): JsonField<Int> = identRel

        /**
         * Returns the raw JSON value of [jSeries].
         *
         * Unlike [jSeries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jSeries") @ExcludeMissing fun _jSeries(): JsonField<String> = jSeries

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [lcAcc].
         *
         * Unlike [lcAcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lcAcc") @ExcludeMissing fun _lcAcc(): JsonField<List<Double>> = lcAcc

        /**
         * Returns the raw JSON value of [lco].
         *
         * Unlike [lco], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lco") @ExcludeMissing fun _lco(): JsonField<List<Double>> = lco

        /**
         * Returns the raw JSON value of [lcPos].
         *
         * Unlike [lcPos], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lcPos") @ExcludeMissing fun _lcPos(): JsonField<List<Double>> = lcPos

        /**
         * Returns the raw JSON value of [lcs].
         *
         * Unlike [lcs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lcs") @ExcludeMissing fun _lcs(): JsonField<List<Double>> = lcs

        /**
         * Returns the raw JSON value of [lcVel].
         *
         * Unlike [lcVel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lcVel") @ExcludeMissing fun _lcVel(): JsonField<List<Double>> = lcVel

        /**
         * Returns the raw JSON value of [lon].
         *
         * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

        /**
         * Returns the raw JSON value of [m1].
         *
         * Unlike [m1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m1") @ExcludeMissing fun _m1(): JsonField<Int> = m1

        /**
         * Returns the raw JSON value of [m1v].
         *
         * Unlike [m1v], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m1v") @ExcludeMissing fun _m1v(): JsonField<Int> = m1v

        /**
         * Returns the raw JSON value of [m2].
         *
         * Unlike [m2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m2") @ExcludeMissing fun _m2(): JsonField<Int> = m2

        /**
         * Returns the raw JSON value of [m2v].
         *
         * Unlike [m2v], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m2v") @ExcludeMissing fun _m2v(): JsonField<Int> = m2v

        /**
         * Returns the raw JSON value of [m3a].
         *
         * Unlike [m3a], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m3a") @ExcludeMissing fun _m3a(): JsonField<Int> = m3a

        /**
         * Returns the raw JSON value of [m3av].
         *
         * Unlike [m3av], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m3av") @ExcludeMissing fun _m3av(): JsonField<Int> = m3av

        /**
         * Returns the raw JSON value of [modType].
         *
         * Unlike [modType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modType") @ExcludeMissing fun _modType(): JsonField<String> = modType

        /**
         * Returns the raw JSON value of [msgTs].
         *
         * Unlike [msgTs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgTs") @ExcludeMissing fun _msgTs(): JsonField<OffsetDateTime> = msgTs

        /**
         * Returns the raw JSON value of [msnId].
         *
         * Unlike [msnId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msnId") @ExcludeMissing fun _msnId(): JsonField<String> = msnId

        /**
         * Returns the raw JSON value of [multiSource].
         *
         * Unlike [multiSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("multiSource")
        @ExcludeMissing
        fun _multiSource(): JsonField<Boolean> = multiSource

        /**
         * Returns the raw JSON value of [objAct].
         *
         * Unlike [objAct], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objAct") @ExcludeMissing fun _objAct(): JsonField<String> = objAct

        /**
         * Returns the raw JSON value of [objDescription].
         *
         * Unlike [objDescription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("objDescription")
        @ExcludeMissing
        fun _objDescription(): JsonField<String> = objDescription

        /**
         * Returns the raw JSON value of [objId].
         *
         * Unlike [objId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objId") @ExcludeMissing fun _objId(): JsonField<String> = objId

        /**
         * Returns the raw JSON value of [objIdent].
         *
         * Unlike [objIdent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objIdent") @ExcludeMissing fun _objIdent(): JsonField<String> = objIdent

        /**
         * Returns the raw JSON value of [objNat].
         *
         * Unlike [objNat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objNat") @ExcludeMissing fun _objNat(): JsonField<String> = objNat

        /**
         * Returns the raw JSON value of [objPlat].
         *
         * Unlike [objPlat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objPlat") @ExcludeMissing fun _objPlat(): JsonField<String> = objPlat

        /**
         * Returns the raw JSON value of [objSpec].
         *
         * Unlike [objSpec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objSpec") @ExcludeMissing fun _objSpec(): JsonField<String> = objSpec

        /**
         * Returns the raw JSON value of [objType].
         *
         * Unlike [objType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("objType") @ExcludeMissing fun _objType(): JsonField<String> = objType

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
         * Returns the raw JSON value of [sen].
         *
         * Unlike [sen], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sen") @ExcludeMissing fun _sen(): JsonField<String> = sen

        /**
         * Returns the raw JSON value of [senQual].
         *
         * Unlike [senQual], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("senQual") @ExcludeMissing fun _senQual(): JsonField<String> = senQual

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [spd].
         *
         * Unlike [spd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("spd") @ExcludeMissing fun _spd(): JsonField<Double> = spd

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
         * Returns the raw JSON value of [strength].
         *
         * Unlike [strength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("strength") @ExcludeMissing fun _strength(): JsonField<Int> = strength

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [trkConf].
         *
         * Unlike [trkConf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkConf") @ExcludeMissing fun _trkConf(): JsonField<Double> = trkConf

        /**
         * Returns the raw JSON value of [trkId].
         *
         * Unlike [trkId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkId") @ExcludeMissing fun _trkId(): JsonField<String> = trkId

        /**
         * Returns the raw JSON value of [trkItmId].
         *
         * Unlike [trkItmId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkItmId") @ExcludeMissing fun _trkItmId(): JsonField<String> = trkItmId

        /**
         * Returns the raw JSON value of [trkNum].
         *
         * Unlike [trkNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkNum") @ExcludeMissing fun _trkNum(): JsonField<String> = trkNum

        /**
         * Returns the raw JSON value of [trkPtType].
         *
         * Unlike [trkPtType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkPtType") @ExcludeMissing fun _trkPtType(): JsonField<String> = trkPtType

        /**
         * Returns the raw JSON value of [trkQual].
         *
         * Unlike [trkQual], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkQual") @ExcludeMissing fun _trkQual(): JsonField<Int> = trkQual

        /**
         * Returns the raw JSON value of [trkStat].
         *
         * Unlike [trkStat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("trkStat") @ExcludeMissing fun _trkStat(): JsonField<String> = trkStat

        /**
         * Returns the raw JSON value of [vertUnc].
         *
         * Unlike [vertUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vertUnc") @ExcludeMissing fun _vertUnc(): JsonField<Double> = vertUnc

        /**
         * Returns the raw JSON value of [wanderAng].
         *
         * Unlike [wanderAng], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wanderAng") @ExcludeMissing fun _wanderAng(): JsonField<Double> = wanderAng

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
            private var alt: JsonField<Double> = JsonMissing.of()
            private var asset: JsonField<String> = JsonMissing.of()
            private var assetNat: JsonField<String> = JsonMissing.of()
            private var attitude: JsonField<MutableList<Double>>? = null
            private var attitudeRate: JsonField<MutableList<Double>>? = null
            private var callSign: JsonField<String> = JsonMissing.of()
            private var cntct: JsonField<String> = JsonMissing.of()
            private var contextKeys: JsonField<MutableList<String>>? = null
            private var contextValues: JsonField<MutableList<String>>? = null
            private var course: JsonField<Double> = JsonMissing.of()
            private var cov: JsonField<MutableList<Double>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var ecefAcc: JsonField<MutableList<Double>>? = null
            private var ecefPos: JsonField<MutableList<Double>>? = null
            private var ecefVel: JsonField<MutableList<Double>>? = null
            private var eNuAcc: JsonField<MutableList<Double>>? = null
            private var eNuGroundVel: JsonField<MutableList<Double>>? = null
            private var eNuPos: JsonField<MutableList<Double>>? = null
            private var eNuVel: JsonField<MutableList<Double>>? = null
            private var env: JsonField<String> = JsonMissing.of()
            private var envConf: JsonField<Double> = JsonMissing.of()
            private var errEllp: JsonField<MutableList<Double>>? = null
            private var hdng: JsonField<Double> = JsonMissing.of()
            private var identAmp: JsonField<String> = JsonMissing.of()
            private var identCred: JsonField<Int> = JsonMissing.of()
            private var identRel: JsonField<Int> = JsonMissing.of()
            private var jSeries: JsonField<String> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var lcAcc: JsonField<MutableList<Double>>? = null
            private var lco: JsonField<MutableList<Double>>? = null
            private var lcPos: JsonField<MutableList<Double>>? = null
            private var lcs: JsonField<MutableList<Double>>? = null
            private var lcVel: JsonField<MutableList<Double>>? = null
            private var lon: JsonField<Double> = JsonMissing.of()
            private var m1: JsonField<Int> = JsonMissing.of()
            private var m1v: JsonField<Int> = JsonMissing.of()
            private var m2: JsonField<Int> = JsonMissing.of()
            private var m2v: JsonField<Int> = JsonMissing.of()
            private var m3a: JsonField<Int> = JsonMissing.of()
            private var m3av: JsonField<Int> = JsonMissing.of()
            private var modType: JsonField<String> = JsonMissing.of()
            private var msgTs: JsonField<OffsetDateTime> = JsonMissing.of()
            private var msnId: JsonField<String> = JsonMissing.of()
            private var multiSource: JsonField<Boolean> = JsonMissing.of()
            private var objAct: JsonField<String> = JsonMissing.of()
            private var objDescription: JsonField<String> = JsonMissing.of()
            private var objId: JsonField<String> = JsonMissing.of()
            private var objIdent: JsonField<String> = JsonMissing.of()
            private var objNat: JsonField<String> = JsonMissing.of()
            private var objPlat: JsonField<String> = JsonMissing.of()
            private var objSpec: JsonField<String> = JsonMissing.of()
            private var objType: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var sen: JsonField<String> = JsonMissing.of()
            private var senQual: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var spd: JsonField<Double> = JsonMissing.of()
            private var srcIds: JsonField<MutableList<String>>? = null
            private var srcTyps: JsonField<MutableList<String>>? = null
            private var strength: JsonField<Int> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var trkConf: JsonField<Double> = JsonMissing.of()
            private var trkId: JsonField<String> = JsonMissing.of()
            private var trkItmId: JsonField<String> = JsonMissing.of()
            private var trkNum: JsonField<String> = JsonMissing.of()
            private var trkPtType: JsonField<String> = JsonMissing.of()
            private var trkQual: JsonField<Int> = JsonMissing.of()
            private var trkStat: JsonField<String> = JsonMissing.of()
            private var vertUnc: JsonField<Double> = JsonMissing.of()
            private var wanderAng: JsonField<Double> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                ts = body.ts
                id = body.id
                alt = body.alt
                asset = body.asset
                assetNat = body.assetNat
                attitude = body.attitude.map { it.toMutableList() }
                attitudeRate = body.attitudeRate.map { it.toMutableList() }
                callSign = body.callSign
                cntct = body.cntct
                contextKeys = body.contextKeys.map { it.toMutableList() }
                contextValues = body.contextValues.map { it.toMutableList() }
                course = body.course
                cov = body.cov.map { it.toMutableList() }
                createdAt = body.createdAt
                createdBy = body.createdBy
                ecefAcc = body.ecefAcc.map { it.toMutableList() }
                ecefPos = body.ecefPos.map { it.toMutableList() }
                ecefVel = body.ecefVel.map { it.toMutableList() }
                eNuAcc = body.eNuAcc.map { it.toMutableList() }
                eNuGroundVel = body.eNuGroundVel.map { it.toMutableList() }
                eNuPos = body.eNuPos.map { it.toMutableList() }
                eNuVel = body.eNuVel.map { it.toMutableList() }
                env = body.env
                envConf = body.envConf
                errEllp = body.errEllp.map { it.toMutableList() }
                hdng = body.hdng
                identAmp = body.identAmp
                identCred = body.identCred
                identRel = body.identRel
                jSeries = body.jSeries
                lat = body.lat
                lcAcc = body.lcAcc.map { it.toMutableList() }
                lco = body.lco.map { it.toMutableList() }
                lcPos = body.lcPos.map { it.toMutableList() }
                lcs = body.lcs.map { it.toMutableList() }
                lcVel = body.lcVel.map { it.toMutableList() }
                lon = body.lon
                m1 = body.m1
                m1v = body.m1v
                m2 = body.m2
                m2v = body.m2v
                m3a = body.m3a
                m3av = body.m3av
                modType = body.modType
                msgTs = body.msgTs
                msnId = body.msnId
                multiSource = body.multiSource
                objAct = body.objAct
                objDescription = body.objDescription
                objId = body.objId
                objIdent = body.objIdent
                objNat = body.objNat
                objPlat = body.objPlat
                objSpec = body.objSpec
                objType = body.objType
                origin = body.origin
                origNetwork = body.origNetwork
                sen = body.sen
                senQual = body.senQual
                sourceDl = body.sourceDl
                spd = body.spd
                srcIds = body.srcIds.map { it.toMutableList() }
                srcTyps = body.srcTyps.map { it.toMutableList() }
                strength = body.strength
                tags = body.tags.map { it.toMutableList() }
                trkConf = body.trkConf
                trkId = body.trkId
                trkItmId = body.trkItmId
                trkNum = body.trkNum
                trkPtType = body.trkPtType
                trkQual = body.trkQual
                trkStat = body.trkStat
                vertUnc = body.vertUnc
                wanderAng = body.wanderAng
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

            /** Track timestamp in ISO8601 UTC format with microsecond precision. */
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
             * Track point altitude relative to WGS-84 ellipsoid, in meters. Positive values
             * indicate a track object height above ellipsoid, and negative values indicate a track
             * object below ellipsoid, applicable to the depth estimate for a subsurface track.
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
             * Id/name of the platform providing the track data (i.e., tail number for air platform,
             * tower ID for tower based sensor, site id for fixed radar).
             */
            fun asset(asset: String) = asset(JsonField.of(asset))

            /**
             * Sets [Builder.asset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asset] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun asset(asset: JsonField<String>) = apply { this.asset = asset }

            /**
             * Nationality or organization of the tracking/reporting system or platform (e.g. FR,
             * NATO, US, etc.).
             */
            fun assetNat(assetNat: String) = assetNat(JsonField.of(assetNat))

            /**
             * Sets [Builder.assetNat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetNat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetNat(assetNat: JsonField<String>) = apply { this.assetNat = assetNat }

            /**
             * The attitude (Yaw, Pitch, and Roll), in degrees, of the track object. When provided,
             * the array must always contain 3 values defining the attitude and may specify an
             * optional timestamp indicating when the data was measured, last known to be correct
             * and/or predicted to occur. These values represent the vehicle's rotation about the
             * vertical, lateral, and longitudinal axes, respectively, in a locally level, East,
             * North, Up "right handed" coordinate system centered on the vehicle. Yaw is measured
             * in degrees and ranges from -180 to 180. Pitch is measured in degrees and ranges from
             * -90 to 90. Roll is measured in degrees and ranges from -180 to 180.
             */
            fun attitude(attitude: List<Double>) = attitude(JsonField.of(attitude))

            /**
             * Sets [Builder.attitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attitude] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attitude(attitude: JsonField<List<Double>>) = apply {
                this.attitude = attitude.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.attitude].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttitude(attitude: Double) = apply {
                this.attitude =
                    (this.attitude ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attitude", it).add(attitude)
                    }
            }

            /**
             * The attitude rate (Yaw Rate, Pitch Rate, and Roll Rate), in degrees per second, of
             * the track object. When provided, the array must always contain 3 values defining the
             * attitude rate and may specify an optional timestamp indicating when the data was
             * measured, last known to be correct and/or predicted to occur. These values represent
             * the rate of change of the vehicle's rotation about the vertical, lateral, and
             * longitudinal axes, respectively, in a locally level, East, North, Up "right handed"
             * coordinate system centered on the vehicle.
             */
            fun attitudeRate(attitudeRate: List<Double>) = attitudeRate(JsonField.of(attitudeRate))

            /**
             * Sets [Builder.attitudeRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attitudeRate] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attitudeRate(attitudeRate: JsonField<List<Double>>) = apply {
                this.attitudeRate = attitudeRate.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.attitudeRate].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttitudeRate(attitudeRate: Double) = apply {
                this.attitudeRate =
                    (this.attitudeRate ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attitudeRate", it).add(attitudeRate)
                    }
            }

            /** The call sign currently assigned to this track object. */
            fun callSign(callSign: String) = callSign(JsonField.of(callSign))

            /**
             * Sets [Builder.callSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callSign] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

            /**
             * Contact information for assets reporting PPLI (Precise Participant Location and
             * Identification). PPLI is a Link 16 message that is used by units to transmit complete
             * location, identification, and limited status information.
             */
            fun cntct(cntct: String) = cntct(JsonField.of(cntct))

            /**
             * Sets [Builder.cntct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cntct] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cntct(cntct: JsonField<String>) = apply { this.cntct = cntct }

            /**
             * An optional string array containing additional data (keys) representing relevant
             * items for context of fields not specifically defined in this schema. This array is
             * paired with the contextValues string array and must contain the same number of items.
             * Please note these fields are intended for contextual use only and do not pertain to
             * core schema information. To ensure proper integration and avoid misuse, coordination
             * of how these fields are populated and consumed is required during onboarding.
             */
            fun contextKeys(contextKeys: List<String>) = contextKeys(JsonField.of(contextKeys))

            /**
             * Sets [Builder.contextKeys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contextKeys(contextKeys: JsonField<List<String>>) = apply {
                this.contextKeys = contextKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [contextKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContextKey(contextKey: String) = apply {
                contextKeys =
                    (contextKeys ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contextKeys", it).add(contextKey)
                    }
            }

            /**
             * An optional string array containing the values associated with the contextKeys array.
             * This array is paired with the contextKeys string array and must contain the same
             * number of items. Please note these fields are intended for contextual use only and do
             * not pertain to core schema information. To ensure proper integration and avoid
             * misuse, coordination of how these fields are populated and consumed is required
             * during onboarding.
             */
            fun contextValues(contextValues: List<String>) =
                contextValues(JsonField.of(contextValues))

            /**
             * Sets [Builder.contextValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contextValues] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun contextValues(contextValues: JsonField<List<String>>) = apply {
                this.contextValues = contextValues.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [contextValues].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContextValue(contextValue: String) = apply {
                contextValues =
                    (contextValues ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contextValues", it).add(contextValue)
                    }
            }

            /**
             * The track object course-over-ground, in degrees clockwise from true North at the
             * object location (0-360 degrees).
             */
            fun course(course: Double) = course(JsonField.of(course))

            /**
             * Sets [Builder.course] to an arbitrary JSON value.
             *
             * You should usually call [Builder.course] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun course(course: JsonField<Double>) = apply { this.course = course }

            /**
             * Covariance matrix, in meter and second based units, for the defined cartesian system.
             *
             * The array values represent the lower triangular half of the position-velocity
             * covariance matrix. The size of the covariance matrix is dynamic. The values are
             * output as an array of values corresponding to the position-velocity covariance
             * element positions, ordered as follows:
             *
             * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x&nbsp;&nbsp;y&nbsp;&nbsp;z&nbsp;&nbsp;&nbsp;x'&nbsp;&nbsp;y'&nbsp;z'&nbsp;&nbsp;
             *
             * x&nbsp;&nbsp;&nbsp;&nbsp;1
             *
             * y&nbsp;&nbsp;&nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;3
             *
             * z&nbsp;&nbsp;&nbsp;&nbsp;4&nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;6
             *
             * x'&nbsp;&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;8&nbsp;&nbsp;&nbsp;9&nbsp;&nbsp;10
             *
             * y'&nbsp;&nbsp;11&nbsp;&nbsp;12&nbsp;&nbsp;13&nbsp;&nbsp;14&nbsp;&nbsp;15
             *
             * z'&nbsp;&nbsp;16&nbsp;&nbsp;17&nbsp;&nbsp;18&nbsp;&nbsp;19&nbsp;&nbsp;20&nbsp;&nbsp;
             * 21
             *
             * The covariance matrix will be as large as the last element needed, and with unused
             * values zero-filled to maintain proper element positioning in the array. For example,
             * for a 2D (x, y) position-only covariance, the covariance matrix will be 2x2 and the
             * array would contain the 3 elements corresponding to the x, and y position. Another
             * example, now for a 2D (x, y) position-velocity covariance, the covariance matrix will
             * be 5x5 and the array would contain the 15 elements corresponding to the relevant x,
             * y, x', and y' values (with the z-row and z-column being all zeros). The cov array
             * should contain only the lower left triangle values from top left down to bottom
             * right, in order.
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

            /**
             * Array of the track object acceleration, [x'', y'', z''], in meters per second
             * squared, in the Earth Centered - Earth Fixed (ECEF) reference frame. When provided,
             * array must always contain 3 values.
             */
            fun ecefAcc(ecefAcc: List<Double>) = ecefAcc(JsonField.of(ecefAcc))

            /**
             * Sets [Builder.ecefAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ecefAcc] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ecefAcc(ecefAcc: JsonField<List<Double>>) = apply {
                this.ecefAcc = ecefAcc.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.ecefAcc].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEcefAcc(ecefAcc: Double) = apply {
                this.ecefAcc =
                    (this.ecefAcc ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ecefAcc", it).add(ecefAcc)
                    }
            }

            /**
             * Array of the track object position, [x, y, z], in meters, in the Earth Centered -
             * Earth Fixed (ECEF) reference frame. When provided, array must always contain 3
             * values.
             */
            fun ecefPos(ecefPos: List<Double>) = ecefPos(JsonField.of(ecefPos))

            /**
             * Sets [Builder.ecefPos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ecefPos] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ecefPos(ecefPos: JsonField<List<Double>>) = apply {
                this.ecefPos = ecefPos.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [ecefPos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEcefPo(ecefPo: Double) = apply {
                ecefPos =
                    (ecefPos ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ecefPos", it).add(ecefPo)
                    }
            }

            /**
             * Array of the track object velocity, [x', y', z'], in meters per second, in the Earth
             * Centered - Earth Fixed (ECEF) reference frame. When provided, array must always
             * contain 3 values.
             */
            fun ecefVel(ecefVel: List<Double>) = ecefVel(JsonField.of(ecefVel))

            /**
             * Sets [Builder.ecefVel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ecefVel] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ecefVel(ecefVel: JsonField<List<Double>>) = apply {
                this.ecefVel = ecefVel.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.ecefVel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEcefVel(ecefVel: Double) = apply {
                this.ecefVel =
                    (this.ecefVel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ecefVel", it).add(ecefVel)
                    }
            }

            /**
             * East, North, Up acceleration components, in meters per second squared. When provided,
             * array must always contain 3 values defining the acceleration.
             */
            fun eNuAcc(eNuAcc: List<Double>) = eNuAcc(JsonField.of(eNuAcc))

            /**
             * Sets [Builder.eNuAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eNuAcc] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eNuAcc(eNuAcc: JsonField<List<Double>>) = apply {
                this.eNuAcc = eNuAcc.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.eNuAcc].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addENuAcc(eNuAcc: Double) = apply {
                this.eNuAcc =
                    (this.eNuAcc ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eNuAcc", it).add(eNuAcc)
                    }
            }

            /**
             * East, North, Up ground velocity components, in meters per second. When provided,
             * array must always contain 3 values.
             */
            fun eNuGroundVel(eNuGroundVel: List<Double>) = eNuGroundVel(JsonField.of(eNuGroundVel))

            /**
             * Sets [Builder.eNuGroundVel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eNuGroundVel] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eNuGroundVel(eNuGroundVel: JsonField<List<Double>>) = apply {
                this.eNuGroundVel = eNuGroundVel.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.eNuGroundVel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addENuGroundVel(eNuGroundVel: Double) = apply {
                this.eNuGroundVel =
                    (this.eNuGroundVel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eNuGroundVel", it).add(eNuGroundVel)
                    }
            }

            /**
             * East, North, Up position components, in meters. When provided, array must always
             * contain 3 values.
             */
            fun eNuPos(eNuPos: List<Double>) = eNuPos(JsonField.of(eNuPos))

            /**
             * Sets [Builder.eNuPos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eNuPos] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eNuPos(eNuPos: JsonField<List<Double>>) = apply {
                this.eNuPos = eNuPos.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [eNuPos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addENuPo(eNuPo: Double) = apply {
                eNuPos =
                    (eNuPos ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eNuPos", it).add(eNuPo)
                    }
            }

            /**
             * East, North, Up velocity components, in meters per second. When provided, array must
             * always contain 3 values.
             */
            fun eNuVel(eNuVel: List<Double>) = eNuVel(JsonField.of(eNuVel))

            /**
             * Sets [Builder.eNuVel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eNuVel] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eNuVel(eNuVel: JsonField<List<Double>>) = apply {
                this.eNuVel = eNuVel.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.eNuVel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addENuVel(eNuVel: Double) = apply {
                this.eNuVel =
                    (this.eNuVel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("eNuVel", it).add(eNuVel)
                    }
            }

            /**
             * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
             *
             * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers
             * (62 miles).
             *
             * LAND: On the surface of dry land.
             *
             * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
             *
             * SURFACE: On the surface of a body of water.
             *
             * SUBSURFACE: Below the surface of a body of water.
             *
             * UNKNOWN: Environment is not known.
             */
            fun env(env: String) = env(JsonField.of(env))

            /**
             * Sets [Builder.env] to an arbitrary JSON value.
             *
             * You should usually call [Builder.env] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun env(env: JsonField<String>) = apply { this.env = env }

            /** Track environment confidence estimate (not standardized). */
            fun envConf(envConf: Double) = envConf(JsonField.of(envConf))

            /**
             * Sets [Builder.envConf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.envConf] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun envConf(envConf: JsonField<Double>) = apply { this.envConf = envConf }

            /**
             * Uncertainty ellipsoid
             * [semi-major axis (meters), semi-minor axis (meters), orientation (degrees)]. When
             * provided, array must always contain 3 values.
             */
            fun errEllp(errEllp: List<Double>) = errEllp(JsonField.of(errEllp))

            /**
             * Sets [Builder.errEllp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errEllp] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errEllp(errEllp: JsonField<List<Double>>) = apply {
                this.errEllp = errEllp.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.errEllp].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addErrEllp(errEllp: Double) = apply {
                this.errEllp =
                    (this.errEllp ?: JsonField.of(mutableListOf())).also {
                        checkKnown("errEllp", it).add(errEllp)
                    }
            }

            /**
             * The track object heading, in degrees clockwise from true North at the object location
             * (0-360 degrees).
             */
            fun hdng(hdng: Double) = hdng(JsonField.of(hdng))

            /**
             * Sets [Builder.hdng] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hdng] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun hdng(hdng: JsonField<Double>) = apply { this.hdng = hdng }

            /**
             * Additional track object identity/status information, typically used for EXERCISE
             * identity amplification (FAKER, JOKER, KILO, TRAVELLER, ZOMBIE):
             *
             * FAKER: Friendly track, object, or entity acting as an exercise hostile.
             *
             * JOKER: Friendly track, object, or entity acting as an exercise suspect.
             *
             * KILO: Friendly high-value object.
             *
             * TRAVELLER: Suspect land or surface track following a recognized traffic route.
             *
             * ZOMBIE: Suspect track, object, or entity of special interest.
             */
            fun identAmp(identAmp: String) = identAmp(JsonField.of(identAmp))

            /**
             * Sets [Builder.identAmp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identAmp] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identAmp(identAmp: JsonField<String>) = apply { this.identAmp = identAmp }

            /** Track object identity credibility. */
            fun identCred(identCred: Int) = identCred(JsonField.of(identCred))

            /**
             * Sets [Builder.identCred] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identCred] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identCred(identCred: JsonField<Int>) = apply { this.identCred = identCred }

            /** Track object identity reliability. */
            fun identRel(identRel: Int) = identRel(JsonField.of(identRel))

            /**
             * Sets [Builder.identRel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identRel] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identRel(identRel: JsonField<Int>) = apply { this.identRel = identRel }

            /** The J-series message type, if this track is derived from a J-series message. */
            fun jSeries(jSeries: String) = jSeries(JsonField.of(jSeries))

            /**
             * Sets [Builder.jSeries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jSeries] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jSeries(jSeries: JsonField<String>) = apply { this.jSeries = jSeries }

            /**
             * WGS-84 latitude of the track object, in degrees. -90 to 90 degrees (negative values
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

            /**
             * Estimate of the acceleration, [x'', y'', z''], of the track object in the defined
             * cartesian system, in meters per second squared. When provided, array must always
             * contain 3 values.
             */
            fun lcAcc(lcAcc: List<Double>) = lcAcc(JsonField.of(lcAcc))

            /**
             * Sets [Builder.lcAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lcAcc] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lcAcc(lcAcc: JsonField<List<Double>>) = apply {
                this.lcAcc = lcAcc.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.lcAcc].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLcAcc(lcAcc: Double) = apply {
                this.lcAcc =
                    (this.lcAcc ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lcAcc", it).add(lcAcc)
                    }
            }

            /**
             * Origin of a local coordinate system [lat, lon, altitude]. When provided, array must
             * always contain 3 values.
             */
            fun lco(lco: List<Double>) = lco(JsonField.of(lco))

            /**
             * Sets [Builder.lco] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lco] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lco(lco: JsonField<List<Double>>) = apply {
                this.lco = lco.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.lco].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLco(lco: Double) = apply {
                this.lco =
                    (this.lco ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lco", it).add(lco)
                    }
            }

            /**
             * Estimate of the position, [x, y, z], of the track object in the defined cartesian
             * system, in meters. When provided, array must always contain 3 values.
             */
            fun lcPos(lcPos: List<Double>) = lcPos(JsonField.of(lcPos))

            /**
             * Sets [Builder.lcPos] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lcPos] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lcPos(lcPos: JsonField<List<Double>>) = apply {
                this.lcPos = lcPos.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [lcPos].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLcPo(lcPo: Double) = apply {
                lcPos =
                    (lcPos ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lcPos", it).add(lcPo)
                    }
            }

            /**
             * x, y, and z-axis rotations (degrees) about ECEF that define a local cartesian system.
             * When provided, array must always contain 3 values.
             */
            fun lcs(lcs: List<Double>) = lcs(JsonField.of(lcs))

            /**
             * Sets [Builder.lcs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lcs] with a well-typed `List<Double>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lcs(lcs: JsonField<List<Double>>) = apply {
                this.lcs = lcs.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [lcs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLc(lc: Double) = apply {
                lcs = (lcs ?: JsonField.of(mutableListOf())).also { checkKnown("lcs", it).add(lc) }
            }

            /**
             * Estimate of the velocity, [x', y', z'], of the track object in the defined cartesian
             * system, in meters per second. When provided, array must always contain 3 values.
             */
            fun lcVel(lcVel: List<Double>) = lcVel(JsonField.of(lcVel))

            /**
             * Sets [Builder.lcVel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lcVel] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lcVel(lcVel: JsonField<List<Double>>) = apply {
                this.lcVel = lcVel.map { it.toMutableList() }
            }

            /**
             * Adds a single [Double] to [Builder.lcVel].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLcVel(lcVel: Double) = apply {
                this.lcVel =
                    (this.lcVel ?: JsonField.of(mutableListOf())).also {
                        checkKnown("lcVel", it).add(lcVel)
                    }
            }

            /**
             * WGS-84 longitude of the track object, in degrees. -180 to 180 degrees (negative
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
             * Mode-1 interrogation response (mission code), indicating mission or aircraft type.
             * Assume leading 0's for any inputs that are less than 2 digits.
             */
            fun m1(m1: Int) = m1(JsonField.of(m1))

            /**
             * Sets [Builder.m1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m1] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun m1(m1: JsonField<Int>) = apply { this.m1 = m1 }

            /** Mode-1 validity status. */
            fun m1v(m1v: Int) = m1v(JsonField.of(m1v))

            /**
             * Sets [Builder.m1v] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m1v] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun m1v(m1v: JsonField<Int>) = apply { this.m1v = m1v }

            /**
             * Mode-2 interrogation response (military identification code). Assume leading 0's for
             * any inputs that are less than 4 digits.
             */
            fun m2(m2: Int) = m2(JsonField.of(m2))

            /**
             * Sets [Builder.m2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m2] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun m2(m2: JsonField<Int>) = apply { this.m2 = m2 }

            /** Mode-2 validity status. */
            fun m2v(m2v: Int) = m2v(JsonField.of(m2v))

            /**
             * Sets [Builder.m2v] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m2v] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun m2v(m2v: JsonField<Int>) = apply { this.m2v = m2v }

            /**
             * Mode-3/A interrogation response (aircraft identification), provides a 4-digit octal
             * identification code for the aircraft, assigned by the air traffic controller.
             * Mode-3/A is shared military/civilian use. Assume leading 0's for any inputs that are
             * less than 4 digits.
             */
            fun m3a(m3a: Int) = m3a(JsonField.of(m3a))

            /**
             * Sets [Builder.m3a] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m3a] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun m3a(m3a: JsonField<Int>) = apply { this.m3a = m3a }

            /** Mode-3/A validity status. */
            fun m3av(m3av: Int) = m3av(JsonField.of(m3av))

            /**
             * Sets [Builder.m3av] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m3av] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun m3av(m3av: JsonField<Int>) = apply { this.m3av = m3av }

            /**
             * The type of source information from which the track was derived. Intended as, but not
             * constrained to, NATO STANAG 4676 modality types (AIS, BFT, BIOMETRIC, COMINT,
             * DOPPLER, ELINT, HRR, HUMINT, IMAGE, MASINT, MIXED, OSINT, OTHER):
             *
             * AIS: Derived from an automated identification system source.
             *
             * BFT: Derived from a blue force tracking source.
             *
             * BIOMETRICS: Derived from a biometrics source.
             *
             * COMINT: Derived from a communications intelligence source.
             *
             * DOPPLER: Derived from a radar doppler source.
             *
             * ELINT: Derived from an electronics intelligence source.
             *
             * HRR: Derived from a radar high range resolution source.
             *
             * HUMINT: Derived from a human intelligence source.
             *
             * IMAGE: Derived from a still or motion imagery source.
             *
             * MASINT: Derived from a measurement and signals intelligence source.
             *
             * MIXED: Derived from a combination of two or more sources.
             *
             * OSINT: Derived from an open source intelligence source.
             *
             * OTHER: Derived from other types of unspecified sources.
             */
            fun modType(modType: String) = modType(JsonField.of(modType))

            /**
             * Sets [Builder.modType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.modType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun modType(modType: JsonField<String>) = apply { this.modType = modType }

            /**
             * Timestamp when the message was created, in ISO8601 UTC format with microsecond
             * precision.
             */
            fun msgTs(msgTs: OffsetDateTime) = msgTs(JsonField.of(msgTs))

            /**
             * Sets [Builder.msgTs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgTs] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgTs(msgTs: JsonField<OffsetDateTime>) = apply { this.msgTs = msgTs }

            /** Mission ID related to the track. */
            fun msnId(msnId: String) = msnId(JsonField.of(msnId))

            /**
             * Sets [Builder.msnId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msnId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msnId(msnId: JsonField<String>) = apply { this.msnId = msnId }

            /** Flag indicating that this track is fused from multiple sensor sources. */
            fun multiSource(multiSource: Boolean) = multiSource(JsonField.of(multiSource))

            /**
             * Sets [Builder.multiSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multiSource] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun multiSource(multiSource: JsonField<Boolean>) = apply {
                this.multiSource = multiSource
            }

            /**
             * The activity in which the track object is engaged. Intended as, but not constrained
             * to, MIL-STD-6016 environment dependent activity designations. The activity can be
             * reported as either a combination of the code and environment (e.g. 65/AIR) or as the
             * descriptive enumeration (e.g. DIVERTING), which are equivalent.
             */
            fun objAct(objAct: String) = objAct(JsonField.of(objAct))

            /**
             * Sets [Builder.objAct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objAct] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objAct(objAct: JsonField<String>) = apply { this.objAct = objAct }

            /**
             * This is the free-text, generally human-readable, name of the System or Resource
             * corresponding to this track record.
             */
            fun objDescription(objDescription: String) =
                objDescription(JsonField.of(objDescription))

            /**
             * Sets [Builder.objDescription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objDescription] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objDescription(objDescription: JsonField<String>) = apply {
                this.objDescription = objDescription
            }

            /** The UID or designation of the tracked object. */
            fun objId(objId: String) = objId(JsonField.of(objId))

            /**
             * Sets [Builder.objId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objId(objId: JsonField<String>) = apply { this.objId = objId }

            /**
             * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
             * PENDING, SUSPECT, UNKNOWN):
             *
             * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics,
             * behavior, and/or origin.
             *
             * FRIEND: Track object supporting friendly forces and belonging to a declared friendly
             * nation or entity.
             *
             * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed
             * to contribute to a threat to friendly forces or their mission due to its behavior,
             * characteristics, nationality, or origin.
             *
             * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin
             * indicate that it is neither supporting nor opposing friendly forces or their mission.
             *
             * PENDING: Track object which has not been evaluated.
             *
             * SUSPECT: Track object deemed potentially hostile due to the object characteristics,
             * behavior, nationality, and/or origin.
             *
             * UNKNOWN: Track object which has been evaluated and does not meet criteria for any
             * standard identity.
             */
            fun objIdent(objIdent: String) = objIdent(JsonField.of(objIdent))

            /**
             * Sets [Builder.objIdent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objIdent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objIdent(objIdent: JsonField<String>) = apply { this.objIdent = objIdent }

            /** Nationality or organization of the track object (e.g. FR, NATO, US, etc.). */
            fun objNat(objNat: String) = objNat(JsonField.of(objNat))

            /**
             * Sets [Builder.objNat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objNat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objNat(objNat: JsonField<String>) = apply { this.objNat = objNat }

            /**
             * The object platform type. Intended as, but not constrained to, MIL-STD-6016
             * environment dependent platform type designations. The platform type can be reported
             * as either a combination of the code and environment (e.g. 14/LAND) or as the
             * descriptive representations (e.g. COMBAT VEHICLE), which are equivalent.
             */
            fun objPlat(objPlat: String) = objPlat(JsonField.of(objPlat))

            /**
             * Sets [Builder.objPlat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objPlat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objPlat(objPlat: JsonField<String>) = apply { this.objPlat = objPlat }

            /**
             * The object specific type. Intended as, but not constrained to, MIL-STD-6016
             * environment dependent specific type designations. The specific type can be reported
             * as either a combination of the code and environment (e.g. 155/SURFACE) or as the
             * descriptive representation (e.g. AUDACE DDG), which are equivalent.
             */
            fun objSpec(objSpec: String) = objSpec(JsonField.of(objSpec))

            /**
             * Sets [Builder.objSpec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objSpec] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objSpec(objSpec: JsonField<String>) = apply { this.objSpec = objSpec }

            /**
             * The generic classification of the track object/group (e.g., HELICOPTER, TRACKED,
             * WATERCRAFT, WHEELED, etc.). Referenced, but not constrained to, NATO STANAG 4676
             * object type classifications.
             */
            fun objType(objType: String) = objType(JsonField.of(objType))

            /**
             * Sets [Builder.objType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objType(objType: JsonField<String>) = apply { this.objType = objType }

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

            /** Id/name of sensor providing the track data. */
            fun sen(sen: String) = sen(JsonField.of(sen))

            /**
             * Sets [Builder.sen] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sen] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sen(sen: JsonField<String>) = apply { this.sen = sen }

            /** Sensor quality. */
            fun senQual(senQual: String) = senQual(JsonField.of(senQual))

            /**
             * Sets [Builder.senQual] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senQual] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senQual(senQual: JsonField<String>) = apply { this.senQual = senQual }

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

            /** Track object speed, in meters per second. */
            fun spd(spd: Double) = spd(JsonField.of(spd))

            /**
             * Sets [Builder.spd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.spd] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun spd(spd: JsonField<Double>) = apply { this.spd = spd }

            /**
             * Array of UUIDs of the UDL data records that contributed to the generation of this
             * fused track. See the associated 'srcTyps' array for the specific types of data,
             * positionally corresponding to the UUIDs in this array, used in the track fusion. The
             * 'srcTyps' and 'srcIds' arrays must match in size. See the corresponding srcTyps array
             * element for the data type of the UUID and use the appropriate API operation to
             * retrieve that object (e.g. /udl/poi/{uuid}).
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
             * Array of UDL record types (POI, MTI, TRACK, GROUNDIMAGE) that contributed to the
             * generation of this fused track. See the associated 'srcIds' array for the record
             * UUIDs, positionally corresponding to the record types in this array, used in the
             * track fusion. The 'srcTyps' and 'srcIds' arrays must match in size.
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
             * The number of objects or units moving as a group and represented as a single entity
             * in this track message. If null, the track is assumed to represent a single object.
             * Note that if this track derives from a J-series message then special definitions
             * apply for the following values: 13 indicates an estimated 2-7 units, 14 indicates an
             * estimated more than 7 units, and 15 indicates an estimated more than 12 units.
             */
            fun strength(strength: Int) = strength(JsonField.of(strength))

            /**
             * Sets [Builder.strength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.strength] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun strength(strength: JsonField<Int>) = apply { this.strength = strength }

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
             * Overall track confidence estimate (not standardized, but typically a value between 0
             * and 1, with 0 indicating lowest confidence).
             */
            fun trkConf(trkConf: Double) = trkConf(JsonField.of(trkConf))

            /**
             * Sets [Builder.trkConf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkConf] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trkConf(trkConf: JsonField<Double>) = apply { this.trkConf = trkConf }

            /**
             * UUID identifying the track, which should remain the same on subsequent tracks of the
             * same object.
             */
            fun trkId(trkId: String) = trkId(JsonField.of(trkId))

            /**
             * Sets [Builder.trkId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trkId(trkId: JsonField<String>) = apply { this.trkId = trkId }

            /**
             * UUID of the track item object. Intended for, but not restricted to, STANAG-4676
             * messages. This ID is used to distinguish an individual track within a message or
             * external system containing multiple tracks on single or multiple targets.
             */
            fun trkItmId(trkItmId: String) = trkItmId(JsonField.of(trkItmId))

            /**
             * Sets [Builder.trkItmId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkItmId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trkItmId(trkItmId: JsonField<String>) = apply { this.trkItmId = trkItmId }

            /**
             * The track number (TN) of a surveillance entity. Intended as, but not constrained to,
             * the J-series track number encoded as five character alpha-numeric characters. Users
             * should refer to J-series documentation for specific TN definitions.
             */
            fun trkNum(trkNum: String) = trkNum(JsonField.of(trkNum))

            /**
             * Sets [Builder.trkNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkNum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trkNum(trkNum: JsonField<String>) = apply { this.trkNum = trkNum }

            /**
             * Means by which the track data was created (e.g., MEASURED, AUTOMATIC PREDICTED,
             * etc.).
             */
            fun trkPtType(trkPtType: String) = trkPtType(JsonField.of(trkPtType))

            /**
             * Sets [Builder.trkPtType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkPtType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trkPtType(trkPtType: JsonField<String>) = apply { this.trkPtType = trkPtType }

            /** Value indicating track quality (not standardized). */
            fun trkQual(trkQual: Int) = trkQual(JsonField.of(trkQual))

            /**
             * Sets [Builder.trkQual] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkQual] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun trkQual(trkQual: JsonField<Int>) = apply { this.trkQual = trkQual }

            /** Status of the track (e.g., INITIATING, MAINTAINING, DROPPING, TERMINATED, etc.). */
            fun trkStat(trkStat: String) = trkStat(JsonField.of(trkStat))

            /**
             * Sets [Builder.trkStat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trkStat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trkStat(trkStat: JsonField<String>) = apply { this.trkStat = trkStat }

            /**
             * The vertical uncertainty represents the 1-sigma position uncertainty perpendicular to
             * the error Ellipse surface in the up (+) / down (-) direction measured in meters.
             */
            fun vertUnc(vertUnc: Double) = vertUnc(JsonField.of(vertUnc))

            /**
             * Sets [Builder.vertUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vertUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vertUnc(vertUnc: JsonField<Double>) = apply { this.vertUnc = vertUnc }

            /**
             * The angle by which the Inertial Navigation System (INS) rotates the geodetic frame
             * about the axis to avoid the introduction of a singularity at the North pole when it
             * is calculating vehicle location.
             */
            fun wanderAng(wanderAng: Double) = wanderAng(JsonField.of(wanderAng))

            /**
             * Sets [Builder.wanderAng] to an arbitrary JSON value.
             *
             * You should usually call [Builder.wanderAng] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun wanderAng(wanderAng: JsonField<Double>) = apply { this.wanderAng = wanderAng }

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
                    alt,
                    asset,
                    assetNat,
                    (attitude ?: JsonMissing.of()).map { it.toImmutable() },
                    (attitudeRate ?: JsonMissing.of()).map { it.toImmutable() },
                    callSign,
                    cntct,
                    (contextKeys ?: JsonMissing.of()).map { it.toImmutable() },
                    (contextValues ?: JsonMissing.of()).map { it.toImmutable() },
                    course,
                    (cov ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    createdBy,
                    (ecefAcc ?: JsonMissing.of()).map { it.toImmutable() },
                    (ecefPos ?: JsonMissing.of()).map { it.toImmutable() },
                    (ecefVel ?: JsonMissing.of()).map { it.toImmutable() },
                    (eNuAcc ?: JsonMissing.of()).map { it.toImmutable() },
                    (eNuGroundVel ?: JsonMissing.of()).map { it.toImmutable() },
                    (eNuPos ?: JsonMissing.of()).map { it.toImmutable() },
                    (eNuVel ?: JsonMissing.of()).map { it.toImmutable() },
                    env,
                    envConf,
                    (errEllp ?: JsonMissing.of()).map { it.toImmutable() },
                    hdng,
                    identAmp,
                    identCred,
                    identRel,
                    jSeries,
                    lat,
                    (lcAcc ?: JsonMissing.of()).map { it.toImmutable() },
                    (lco ?: JsonMissing.of()).map { it.toImmutable() },
                    (lcPos ?: JsonMissing.of()).map { it.toImmutable() },
                    (lcs ?: JsonMissing.of()).map { it.toImmutable() },
                    (lcVel ?: JsonMissing.of()).map { it.toImmutable() },
                    lon,
                    m1,
                    m1v,
                    m2,
                    m2v,
                    m3a,
                    m3av,
                    modType,
                    msgTs,
                    msnId,
                    multiSource,
                    objAct,
                    objDescription,
                    objId,
                    objIdent,
                    objNat,
                    objPlat,
                    objSpec,
                    objType,
                    origin,
                    origNetwork,
                    sen,
                    senQual,
                    sourceDl,
                    spd,
                    (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                    strength,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    trkConf,
                    trkId,
                    trkItmId,
                    trkNum,
                    trkPtType,
                    trkQual,
                    trkStat,
                    vertUnc,
                    wanderAng,
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
            alt()
            asset()
            assetNat()
            attitude()
            attitudeRate()
            callSign()
            cntct()
            contextKeys()
            contextValues()
            course()
            cov()
            createdAt()
            createdBy()
            ecefAcc()
            ecefPos()
            ecefVel()
            eNuAcc()
            eNuGroundVel()
            eNuPos()
            eNuVel()
            env()
            envConf()
            errEllp()
            hdng()
            identAmp()
            identCred()
            identRel()
            jSeries()
            lat()
            lcAcc()
            lco()
            lcPos()
            lcs()
            lcVel()
            lon()
            m1()
            m1v()
            m2()
            m2v()
            m3a()
            m3av()
            modType()
            msgTs()
            msnId()
            multiSource()
            objAct()
            objDescription()
            objId()
            objIdent()
            objNat()
            objPlat()
            objSpec()
            objType()
            origin()
            origNetwork()
            sen()
            senQual()
            sourceDl()
            spd()
            srcIds()
            srcTyps()
            strength()
            tags()
            trkConf()
            trkId()
            trkItmId()
            trkNum()
            trkPtType()
            trkQual()
            trkStat()
            vertUnc()
            wanderAng()
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
                (if (alt.asKnown().isPresent) 1 else 0) +
                (if (asset.asKnown().isPresent) 1 else 0) +
                (if (assetNat.asKnown().isPresent) 1 else 0) +
                (attitude.asKnown().getOrNull()?.size ?: 0) +
                (attitudeRate.asKnown().getOrNull()?.size ?: 0) +
                (if (callSign.asKnown().isPresent) 1 else 0) +
                (if (cntct.asKnown().isPresent) 1 else 0) +
                (contextKeys.asKnown().getOrNull()?.size ?: 0) +
                (contextValues.asKnown().getOrNull()?.size ?: 0) +
                (if (course.asKnown().isPresent) 1 else 0) +
                (cov.asKnown().getOrNull()?.size ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (ecefAcc.asKnown().getOrNull()?.size ?: 0) +
                (ecefPos.asKnown().getOrNull()?.size ?: 0) +
                (ecefVel.asKnown().getOrNull()?.size ?: 0) +
                (eNuAcc.asKnown().getOrNull()?.size ?: 0) +
                (eNuGroundVel.asKnown().getOrNull()?.size ?: 0) +
                (eNuPos.asKnown().getOrNull()?.size ?: 0) +
                (eNuVel.asKnown().getOrNull()?.size ?: 0) +
                (if (env.asKnown().isPresent) 1 else 0) +
                (if (envConf.asKnown().isPresent) 1 else 0) +
                (errEllp.asKnown().getOrNull()?.size ?: 0) +
                (if (hdng.asKnown().isPresent) 1 else 0) +
                (if (identAmp.asKnown().isPresent) 1 else 0) +
                (if (identCred.asKnown().isPresent) 1 else 0) +
                (if (identRel.asKnown().isPresent) 1 else 0) +
                (if (jSeries.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (lcAcc.asKnown().getOrNull()?.size ?: 0) +
                (lco.asKnown().getOrNull()?.size ?: 0) +
                (lcPos.asKnown().getOrNull()?.size ?: 0) +
                (lcs.asKnown().getOrNull()?.size ?: 0) +
                (lcVel.asKnown().getOrNull()?.size ?: 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (m1.asKnown().isPresent) 1 else 0) +
                (if (m1v.asKnown().isPresent) 1 else 0) +
                (if (m2.asKnown().isPresent) 1 else 0) +
                (if (m2v.asKnown().isPresent) 1 else 0) +
                (if (m3a.asKnown().isPresent) 1 else 0) +
                (if (m3av.asKnown().isPresent) 1 else 0) +
                (if (modType.asKnown().isPresent) 1 else 0) +
                (if (msgTs.asKnown().isPresent) 1 else 0) +
                (if (msnId.asKnown().isPresent) 1 else 0) +
                (if (multiSource.asKnown().isPresent) 1 else 0) +
                (if (objAct.asKnown().isPresent) 1 else 0) +
                (if (objDescription.asKnown().isPresent) 1 else 0) +
                (if (objId.asKnown().isPresent) 1 else 0) +
                (if (objIdent.asKnown().isPresent) 1 else 0) +
                (if (objNat.asKnown().isPresent) 1 else 0) +
                (if (objPlat.asKnown().isPresent) 1 else 0) +
                (if (objSpec.asKnown().isPresent) 1 else 0) +
                (if (objType.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (sen.asKnown().isPresent) 1 else 0) +
                (if (senQual.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (spd.asKnown().isPresent) 1 else 0) +
                (srcIds.asKnown().getOrNull()?.size ?: 0) +
                (srcTyps.asKnown().getOrNull()?.size ?: 0) +
                (if (strength.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (trkConf.asKnown().isPresent) 1 else 0) +
                (if (trkId.asKnown().isPresent) 1 else 0) +
                (if (trkItmId.asKnown().isPresent) 1 else 0) +
                (if (trkNum.asKnown().isPresent) 1 else 0) +
                (if (trkPtType.asKnown().isPresent) 1 else 0) +
                (if (trkQual.asKnown().isPresent) 1 else 0) +
                (if (trkStat.asKnown().isPresent) 1 else 0) +
                (if (vertUnc.asKnown().isPresent) 1 else 0) +
                (if (wanderAng.asKnown().isPresent) 1 else 0)

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
                source == other.source &&
                ts == other.ts &&
                id == other.id &&
                alt == other.alt &&
                asset == other.asset &&
                assetNat == other.assetNat &&
                attitude == other.attitude &&
                attitudeRate == other.attitudeRate &&
                callSign == other.callSign &&
                cntct == other.cntct &&
                contextKeys == other.contextKeys &&
                contextValues == other.contextValues &&
                course == other.course &&
                cov == other.cov &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                ecefAcc == other.ecefAcc &&
                ecefPos == other.ecefPos &&
                ecefVel == other.ecefVel &&
                eNuAcc == other.eNuAcc &&
                eNuGroundVel == other.eNuGroundVel &&
                eNuPos == other.eNuPos &&
                eNuVel == other.eNuVel &&
                env == other.env &&
                envConf == other.envConf &&
                errEllp == other.errEllp &&
                hdng == other.hdng &&
                identAmp == other.identAmp &&
                identCred == other.identCred &&
                identRel == other.identRel &&
                jSeries == other.jSeries &&
                lat == other.lat &&
                lcAcc == other.lcAcc &&
                lco == other.lco &&
                lcPos == other.lcPos &&
                lcs == other.lcs &&
                lcVel == other.lcVel &&
                lon == other.lon &&
                m1 == other.m1 &&
                m1v == other.m1v &&
                m2 == other.m2 &&
                m2v == other.m2v &&
                m3a == other.m3a &&
                m3av == other.m3av &&
                modType == other.modType &&
                msgTs == other.msgTs &&
                msnId == other.msnId &&
                multiSource == other.multiSource &&
                objAct == other.objAct &&
                objDescription == other.objDescription &&
                objId == other.objId &&
                objIdent == other.objIdent &&
                objNat == other.objNat &&
                objPlat == other.objPlat &&
                objSpec == other.objSpec &&
                objType == other.objType &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                sen == other.sen &&
                senQual == other.senQual &&
                sourceDl == other.sourceDl &&
                spd == other.spd &&
                srcIds == other.srcIds &&
                srcTyps == other.srcTyps &&
                strength == other.strength &&
                tags == other.tags &&
                trkConf == other.trkConf &&
                trkId == other.trkId &&
                trkItmId == other.trkItmId &&
                trkNum == other.trkNum &&
                trkPtType == other.trkPtType &&
                trkQual == other.trkQual &&
                trkStat == other.trkStat &&
                vertUnc == other.vertUnc &&
                wanderAng == other.wanderAng
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                ts,
                id,
                alt,
                asset,
                assetNat,
                attitude,
                attitudeRate,
                callSign,
                cntct,
                contextKeys,
                contextValues,
                course,
                cov,
                createdAt,
                createdBy,
                ecefAcc,
                ecefPos,
                ecefVel,
                eNuAcc,
                eNuGroundVel,
                eNuPos,
                eNuVel,
                env,
                envConf,
                errEllp,
                hdng,
                identAmp,
                identCred,
                identRel,
                jSeries,
                lat,
                lcAcc,
                lco,
                lcPos,
                lcs,
                lcVel,
                lon,
                m1,
                m1v,
                m2,
                m2v,
                m3a,
                m3av,
                modType,
                msgTs,
                msnId,
                multiSource,
                objAct,
                objDescription,
                objId,
                objIdent,
                objNat,
                objPlat,
                objSpec,
                objType,
                origin,
                origNetwork,
                sen,
                senQual,
                sourceDl,
                spd,
                srcIds,
                srcTyps,
                strength,
                tags,
                trkConf,
                trkId,
                trkItmId,
                trkNum,
                trkPtType,
                trkQual,
                trkStat,
                vertUnc,
                wanderAng,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, ts=$ts, id=$id, alt=$alt, asset=$asset, assetNat=$assetNat, attitude=$attitude, attitudeRate=$attitudeRate, callSign=$callSign, cntct=$cntct, contextKeys=$contextKeys, contextValues=$contextValues, course=$course, cov=$cov, createdAt=$createdAt, createdBy=$createdBy, ecefAcc=$ecefAcc, ecefPos=$ecefPos, ecefVel=$ecefVel, eNuAcc=$eNuAcc, eNuGroundVel=$eNuGroundVel, eNuPos=$eNuPos, eNuVel=$eNuVel, env=$env, envConf=$envConf, errEllp=$errEllp, hdng=$hdng, identAmp=$identAmp, identCred=$identCred, identRel=$identRel, jSeries=$jSeries, lat=$lat, lcAcc=$lcAcc, lco=$lco, lcPos=$lcPos, lcs=$lcs, lcVel=$lcVel, lon=$lon, m1=$m1, m1v=$m1v, m2=$m2, m2v=$m2v, m3a=$m3a, m3av=$m3av, modType=$modType, msgTs=$msgTs, msnId=$msnId, multiSource=$multiSource, objAct=$objAct, objDescription=$objDescription, objId=$objId, objIdent=$objIdent, objNat=$objNat, objPlat=$objPlat, objSpec=$objSpec, objType=$objType, origin=$origin, origNetwork=$origNetwork, sen=$sen, senQual=$senQual, sourceDl=$sourceDl, spd=$spd, srcIds=$srcIds, srcTyps=$srcTyps, strength=$strength, tags=$tags, trkConf=$trkConf, trkId=$trkId, trkItmId=$trkItmId, trkNum=$trkNum, trkPtType=$trkPtType, trkQual=$trkQual, trkStat=$trkStat, vertUnc=$vertUnc, wanderAng=$wanderAng}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TrackCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TrackCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

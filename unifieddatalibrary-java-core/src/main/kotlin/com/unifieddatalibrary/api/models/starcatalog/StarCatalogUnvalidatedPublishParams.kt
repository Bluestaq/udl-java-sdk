// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.starcatalog

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.Params
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
 * Service operation to take multiple StarCatalog records as a POST body and ingest into the
 * database. This operation is intended to be used for automated feeds into UDL. A specific role is
 * required to perform this service operation. Please contact the UDL team for assistance.
 */
class StarCatalogUnvalidatedPublishParams
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
         * [StarCatalogUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StarCatalogUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            starCatalogUnvalidatedPublishParams: StarCatalogUnvalidatedPublishParams
        ) = apply {
            body = starCatalogUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders = starCatalogUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                starCatalogUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [StarCatalogUnvalidatedPublishParams].
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
        fun build(): StarCatalogUnvalidatedPublishParams =
            StarCatalogUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * The star catalog provides the position, proper motion, parallax, and photometric magnitudes
     * at various bandpasses of a star.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("astrometryOrigin")
        @ExcludeMissing
        private val astrometryOrigin: JsonField<AstrometryOrigin>,
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("csId") @ExcludeMissing private val csId: JsonField<Long>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("dec") @ExcludeMissing private val dec: JsonField<Double>,
        @JsonProperty("ra") @ExcludeMissing private val ra: JsonField<Double>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("starEpoch") @ExcludeMissing private val starEpoch: JsonField<Double>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("bpmag") @ExcludeMissing private val bpmag: JsonField<Double>,
        @JsonProperty("bpmagUnc") @ExcludeMissing private val bpmagUnc: JsonField<Double>,
        @JsonProperty("catVersion") @ExcludeMissing private val catVersion: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("decUnc") @ExcludeMissing private val decUnc: JsonField<Double>,
        @JsonProperty("gaiadr3CatId") @ExcludeMissing private val gaiadr3CatId: JsonField<Long>,
        @JsonProperty("gmag") @ExcludeMissing private val gmag: JsonField<Double>,
        @JsonProperty("gmagUnc") @ExcludeMissing private val gmagUnc: JsonField<Double>,
        @JsonProperty("gncCatId") @ExcludeMissing private val gncCatId: JsonField<Int>,
        @JsonProperty("hipCatId") @ExcludeMissing private val hipCatId: JsonField<Int>,
        @JsonProperty("hmag") @ExcludeMissing private val hmag: JsonField<Double>,
        @JsonProperty("hmagUnc") @ExcludeMissing private val hmagUnc: JsonField<Double>,
        @JsonProperty("jmag") @ExcludeMissing private val jmag: JsonField<Double>,
        @JsonProperty("jmagUnc") @ExcludeMissing private val jmagUnc: JsonField<Double>,
        @JsonProperty("kmag") @ExcludeMissing private val kmag: JsonField<Double>,
        @JsonProperty("kmagUnc") @ExcludeMissing private val kmagUnc: JsonField<Double>,
        @JsonProperty("multFlag") @ExcludeMissing private val multFlag: JsonField<Boolean>,
        @JsonProperty("neighborDistance")
        @ExcludeMissing
        private val neighborDistance: JsonField<Double>,
        @JsonProperty("neighborFlag") @ExcludeMissing private val neighborFlag: JsonField<Boolean>,
        @JsonProperty("neighborId") @ExcludeMissing private val neighborId: JsonField<Int>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("parallax") @ExcludeMissing private val parallax: JsonField<Double>,
        @JsonProperty("parallaxUnc") @ExcludeMissing private val parallaxUnc: JsonField<Double>,
        @JsonProperty("pmdec") @ExcludeMissing private val pmdec: JsonField<Double>,
        @JsonProperty("pmdecUnc") @ExcludeMissing private val pmdecUnc: JsonField<Double>,
        @JsonProperty("pmra") @ExcludeMissing private val pmra: JsonField<Double>,
        @JsonProperty("pmraUnc") @ExcludeMissing private val pmraUnc: JsonField<Double>,
        @JsonProperty("pmUncFlag") @ExcludeMissing private val pmUncFlag: JsonField<Boolean>,
        @JsonProperty("posUncFlag") @ExcludeMissing private val posUncFlag: JsonField<Boolean>,
        @JsonProperty("raUnc") @ExcludeMissing private val raUnc: JsonField<Double>,
        @JsonProperty("rpmag") @ExcludeMissing private val rpmag: JsonField<Double>,
        @JsonProperty("rpmagUnc") @ExcludeMissing private val rpmagUnc: JsonField<Double>,
        @JsonProperty("shift") @ExcludeMissing private val shift: JsonField<Double>,
        @JsonProperty("shiftFlag") @ExcludeMissing private val shiftFlag: JsonField<Boolean>,
        @JsonProperty("updatedAt") @ExcludeMissing private val updatedAt: JsonField<OffsetDateTime>,
        @JsonProperty("updatedBy") @ExcludeMissing private val updatedBy: JsonField<String>,
        @JsonProperty("varFlag") @ExcludeMissing private val varFlag: JsonField<Boolean>,
    ) {

        /**
         * Originating astrometric catalog for this object. Enum: [GAIADR3, HIPPARCOS, USNOBSC].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun astrometryOrigin(): AstrometryOrigin = astrometryOrigin.getRequired("astrometryOrigin")

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
         * The ID of this object in the specific catalog associated with this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun csId(): Long = csId.getRequired("csId")

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
         * Barycentric declination of the source in International Celestial Reference System (ICRS)
         * at the reference epoch, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dec(): Double = dec.getRequired("dec")

        /**
         * Barycentric right ascension of the source in the International Celestial Reference System
         * (ICRS) frame at the reference epoch, in degrees.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun ra(): Double = ra.getRequired("ra")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Reference epoch to which the astrometric source parameters are referred, expressed as
         * Julian Year in Barycentric Coordinate Time (TCB).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun starEpoch(): Double = starEpoch.getRequired("starEpoch")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Gaia DR3 optical photometric Bp-band magnitude in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bpmag(): Optional<Double> = bpmag.getOptional("bpmag")

        /**
         * Gaia DR3 optical Bp-band magnitude uncertainty in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun bpmagUnc(): Optional<Double> = bpmagUnc.getOptional("bpmagUnc")

        /**
         * The version of the catalog associated with this object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun catVersion(): Optional<String> = catVersion.getOptional("catVersion")

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
         * Uncertainty of the declination of the source, in milliarcseconds, at the reference epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun decUnc(): Optional<Double> = decUnc.getOptional("decUnc")

        /**
         * The ID of this object in the Gaia DR3 Catalog.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gaiadr3CatId(): Optional<Long> = gaiadr3CatId.getOptional("gaiadr3CatId")

        /**
         * Gaia DR3 optical photometric G-band magnitude in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gmag(): Optional<Double> = gmag.getOptional("gmag")

        /**
         * Gaia DR3 optical photometric G-band magnitude uncertainty in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gmagUnc(): Optional<Double> = gmagUnc.getOptional("gmagUnc")

        /**
         * The ID of this object in the Guidance and Navagation Control (GNC) Catalog.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gncCatId(): Optional<Int> = gncCatId.getOptional("gncCatId")

        /**
         * The ID of this object in the Hipparcos Catalog.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hipCatId(): Optional<Int> = hipCatId.getOptional("hipCatId")

        /**
         * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared photometric
         * H-band magnitude in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hmag(): Optional<Double> = hmag.getOptional("hmag")

        /**
         * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared photometric
         * H-band magnitude uncertainty in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun hmagUnc(): Optional<Double> = hmagUnc.getOptional("hmagUnc")

        /**
         * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared photometric
         * J-band magnitude in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun jmag(): Optional<Double> = jmag.getOptional("jmag")

        /**
         * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared photometric
         * J-band magnitude uncertainty in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun jmagUnc(): Optional<Double> = jmagUnc.getOptional("jmagUnc")

        /**
         * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared photometric
         * K-band magnitude in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun kmag(): Optional<Double> = kmag.getOptional("kmag")

        /**
         * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared photometric
         * K-band magnitude uncertainty in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun kmagUnc(): Optional<Double> = kmagUnc.getOptional("kmagUnc")

        /**
         * Flag indicating that this is a multiple object source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun multFlag(): Optional<Boolean> = multFlag.getOptional("multFlag")

        /**
         * Distance between source and nearest neighbor, in arcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun neighborDistance(): Optional<Double> = neighborDistance.getOptional("neighborDistance")

        /**
         * Flag indicating that the nearest catalog neighbor is closer than 4.6 arcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun neighborFlag(): Optional<Boolean> = neighborFlag.getOptional("neighborFlag")

        /**
         * The catalog ID of the nearest neighbor to this source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun neighborId(): Optional<Int> = neighborId.getOptional("neighborId")

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
         * Absolute stellar parallax of the source, in milliarcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parallax(): Optional<Double> = parallax.getOptional("parallax")

        /**
         * Uncertainty of the stellar parallax, in milliarcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parallaxUnc(): Optional<Double> = parallaxUnc.getOptional("parallaxUnc")

        /**
         * Proper motion in declination of the source, in milliarcseconds/year, at the reference
         * epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pmdec(): Optional<Double> = pmdec.getOptional("pmdec")

        /**
         * Uncertainty of proper motion in declination, in milliarcseconds/year.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pmdecUnc(): Optional<Double> = pmdecUnc.getOptional("pmdecUnc")

        /**
         * Proper motion in right ascension of the source, in milliarcseconds/year, at the reference
         * epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pmra(): Optional<Double> = pmra.getOptional("pmra")

        /**
         * Uncertainty of proper motion in right ascension, in milliarcseconds/year.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pmraUnc(): Optional<Double> = pmraUnc.getOptional("pmraUnc")

        /**
         * Flag indicating that the proper motion uncertainty in either ra or dec is greater than 10
         * milliarcseconds/year.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pmUncFlag(): Optional<Boolean> = pmUncFlag.getOptional("pmUncFlag")

        /**
         * Flag indicating that the position uncertainty in either ra or dec is greater than 100
         * milliarcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun posUncFlag(): Optional<Boolean> = posUncFlag.getOptional("posUncFlag")

        /**
         * Uncertainty of the right ascension of the source, in milliarcseconds, at the reference
         * epoch.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun raUnc(): Optional<Double> = raUnc.getOptional("raUnc")

        /**
         * Gaia DR3 optical Rp-band magnitude in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rpmag(): Optional<Double> = rpmag.getOptional("rpmag")

        /**
         * Gaia DR3 optical photometric Rp-band magnitude uncertainty in the Vega scale.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rpmagUnc(): Optional<Double> = rpmagUnc.getOptional("rpmagUnc")

        /**
         * Photocentric shift caused by neighbors, in arcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun shift(): Optional<Double> = shift.getOptional("shift")

        /**
         * Flag indicating that the photocentric shift is greater than 50 milliarcseconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun shiftFlag(): Optional<Boolean> = shiftFlag.getOptional("shiftFlag")

        /**
         * Time the row was updated in the database.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Flag indicating that the source exhibits variable magnitude.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun varFlag(): Optional<Boolean> = varFlag.getOptional("varFlag")

        /**
         * Returns the raw JSON value of [astrometryOrigin].
         *
         * Unlike [astrometryOrigin], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("astrometryOrigin")
        @ExcludeMissing
        fun _astrometryOrigin(): JsonField<AstrometryOrigin> = astrometryOrigin

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
         * Returns the raw JSON value of [csId].
         *
         * Unlike [csId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("csId") @ExcludeMissing fun _csId(): JsonField<Long> = csId

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [dec].
         *
         * Unlike [dec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dec") @ExcludeMissing fun _dec(): JsonField<Double> = dec

        /**
         * Returns the raw JSON value of [ra].
         *
         * Unlike [ra], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ra") @ExcludeMissing fun _ra(): JsonField<Double> = ra

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [starEpoch].
         *
         * Unlike [starEpoch], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starEpoch") @ExcludeMissing fun _starEpoch(): JsonField<Double> = starEpoch

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [bpmag].
         *
         * Unlike [bpmag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bpmag") @ExcludeMissing fun _bpmag(): JsonField<Double> = bpmag

        /**
         * Returns the raw JSON value of [bpmagUnc].
         *
         * Unlike [bpmagUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bpmagUnc") @ExcludeMissing fun _bpmagUnc(): JsonField<Double> = bpmagUnc

        /**
         * Returns the raw JSON value of [catVersion].
         *
         * Unlike [catVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("catVersion")
        @ExcludeMissing
        fun _catVersion(): JsonField<String> = catVersion

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
         * Returns the raw JSON value of [decUnc].
         *
         * Unlike [decUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("decUnc") @ExcludeMissing fun _decUnc(): JsonField<Double> = decUnc

        /**
         * Returns the raw JSON value of [gaiadr3CatId].
         *
         * Unlike [gaiadr3CatId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("gaiadr3CatId")
        @ExcludeMissing
        fun _gaiadr3CatId(): JsonField<Long> = gaiadr3CatId

        /**
         * Returns the raw JSON value of [gmag].
         *
         * Unlike [gmag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gmag") @ExcludeMissing fun _gmag(): JsonField<Double> = gmag

        /**
         * Returns the raw JSON value of [gmagUnc].
         *
         * Unlike [gmagUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gmagUnc") @ExcludeMissing fun _gmagUnc(): JsonField<Double> = gmagUnc

        /**
         * Returns the raw JSON value of [gncCatId].
         *
         * Unlike [gncCatId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gncCatId") @ExcludeMissing fun _gncCatId(): JsonField<Int> = gncCatId

        /**
         * Returns the raw JSON value of [hipCatId].
         *
         * Unlike [hipCatId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hipCatId") @ExcludeMissing fun _hipCatId(): JsonField<Int> = hipCatId

        /**
         * Returns the raw JSON value of [hmag].
         *
         * Unlike [hmag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hmag") @ExcludeMissing fun _hmag(): JsonField<Double> = hmag

        /**
         * Returns the raw JSON value of [hmagUnc].
         *
         * Unlike [hmagUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hmagUnc") @ExcludeMissing fun _hmagUnc(): JsonField<Double> = hmagUnc

        /**
         * Returns the raw JSON value of [jmag].
         *
         * Unlike [jmag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jmag") @ExcludeMissing fun _jmag(): JsonField<Double> = jmag

        /**
         * Returns the raw JSON value of [jmagUnc].
         *
         * Unlike [jmagUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jmagUnc") @ExcludeMissing fun _jmagUnc(): JsonField<Double> = jmagUnc

        /**
         * Returns the raw JSON value of [kmag].
         *
         * Unlike [kmag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kmag") @ExcludeMissing fun _kmag(): JsonField<Double> = kmag

        /**
         * Returns the raw JSON value of [kmagUnc].
         *
         * Unlike [kmagUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kmagUnc") @ExcludeMissing fun _kmagUnc(): JsonField<Double> = kmagUnc

        /**
         * Returns the raw JSON value of [multFlag].
         *
         * Unlike [multFlag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("multFlag") @ExcludeMissing fun _multFlag(): JsonField<Boolean> = multFlag

        /**
         * Returns the raw JSON value of [neighborDistance].
         *
         * Unlike [neighborDistance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("neighborDistance")
        @ExcludeMissing
        fun _neighborDistance(): JsonField<Double> = neighborDistance

        /**
         * Returns the raw JSON value of [neighborFlag].
         *
         * Unlike [neighborFlag], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("neighborFlag")
        @ExcludeMissing
        fun _neighborFlag(): JsonField<Boolean> = neighborFlag

        /**
         * Returns the raw JSON value of [neighborId].
         *
         * Unlike [neighborId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("neighborId") @ExcludeMissing fun _neighborId(): JsonField<Int> = neighborId

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
         * Returns the raw JSON value of [parallax].
         *
         * Unlike [parallax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parallax") @ExcludeMissing fun _parallax(): JsonField<Double> = parallax

        /**
         * Returns the raw JSON value of [parallaxUnc].
         *
         * Unlike [parallaxUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parallaxUnc")
        @ExcludeMissing
        fun _parallaxUnc(): JsonField<Double> = parallaxUnc

        /**
         * Returns the raw JSON value of [pmdec].
         *
         * Unlike [pmdec], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pmdec") @ExcludeMissing fun _pmdec(): JsonField<Double> = pmdec

        /**
         * Returns the raw JSON value of [pmdecUnc].
         *
         * Unlike [pmdecUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pmdecUnc") @ExcludeMissing fun _pmdecUnc(): JsonField<Double> = pmdecUnc

        /**
         * Returns the raw JSON value of [pmra].
         *
         * Unlike [pmra], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pmra") @ExcludeMissing fun _pmra(): JsonField<Double> = pmra

        /**
         * Returns the raw JSON value of [pmraUnc].
         *
         * Unlike [pmraUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pmraUnc") @ExcludeMissing fun _pmraUnc(): JsonField<Double> = pmraUnc

        /**
         * Returns the raw JSON value of [pmUncFlag].
         *
         * Unlike [pmUncFlag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pmUncFlag") @ExcludeMissing fun _pmUncFlag(): JsonField<Boolean> = pmUncFlag

        /**
         * Returns the raw JSON value of [posUncFlag].
         *
         * Unlike [posUncFlag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("posUncFlag")
        @ExcludeMissing
        fun _posUncFlag(): JsonField<Boolean> = posUncFlag

        /**
         * Returns the raw JSON value of [raUnc].
         *
         * Unlike [raUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("raUnc") @ExcludeMissing fun _raUnc(): JsonField<Double> = raUnc

        /**
         * Returns the raw JSON value of [rpmag].
         *
         * Unlike [rpmag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpmag") @ExcludeMissing fun _rpmag(): JsonField<Double> = rpmag

        /**
         * Returns the raw JSON value of [rpmagUnc].
         *
         * Unlike [rpmagUnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rpmagUnc") @ExcludeMissing fun _rpmagUnc(): JsonField<Double> = rpmagUnc

        /**
         * Returns the raw JSON value of [shift].
         *
         * Unlike [shift], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shift") @ExcludeMissing fun _shift(): JsonField<Double> = shift

        /**
         * Returns the raw JSON value of [shiftFlag].
         *
         * Unlike [shiftFlag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shiftFlag") @ExcludeMissing fun _shiftFlag(): JsonField<Boolean> = shiftFlag

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [updatedBy].
         *
         * Unlike [updatedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedBy") @ExcludeMissing fun _updatedBy(): JsonField<String> = updatedBy

        /**
         * Returns the raw JSON value of [varFlag].
         *
         * Unlike [varFlag], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("varFlag") @ExcludeMissing fun _varFlag(): JsonField<Boolean> = varFlag

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .astrometryOrigin()
             * .classificationMarking()
             * .csId()
             * .dataMode()
             * .dec()
             * .ra()
             * .source()
             * .starEpoch()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var astrometryOrigin: JsonField<AstrometryOrigin>? = null
            private var classificationMarking: JsonField<String>? = null
            private var csId: JsonField<Long>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var dec: JsonField<Double>? = null
            private var ra: JsonField<Double>? = null
            private var source: JsonField<String>? = null
            private var starEpoch: JsonField<Double>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var bpmag: JsonField<Double> = JsonMissing.of()
            private var bpmagUnc: JsonField<Double> = JsonMissing.of()
            private var catVersion: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var decUnc: JsonField<Double> = JsonMissing.of()
            private var gaiadr3CatId: JsonField<Long> = JsonMissing.of()
            private var gmag: JsonField<Double> = JsonMissing.of()
            private var gmagUnc: JsonField<Double> = JsonMissing.of()
            private var gncCatId: JsonField<Int> = JsonMissing.of()
            private var hipCatId: JsonField<Int> = JsonMissing.of()
            private var hmag: JsonField<Double> = JsonMissing.of()
            private var hmagUnc: JsonField<Double> = JsonMissing.of()
            private var jmag: JsonField<Double> = JsonMissing.of()
            private var jmagUnc: JsonField<Double> = JsonMissing.of()
            private var kmag: JsonField<Double> = JsonMissing.of()
            private var kmagUnc: JsonField<Double> = JsonMissing.of()
            private var multFlag: JsonField<Boolean> = JsonMissing.of()
            private var neighborDistance: JsonField<Double> = JsonMissing.of()
            private var neighborFlag: JsonField<Boolean> = JsonMissing.of()
            private var neighborId: JsonField<Int> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var parallax: JsonField<Double> = JsonMissing.of()
            private var parallaxUnc: JsonField<Double> = JsonMissing.of()
            private var pmdec: JsonField<Double> = JsonMissing.of()
            private var pmdecUnc: JsonField<Double> = JsonMissing.of()
            private var pmra: JsonField<Double> = JsonMissing.of()
            private var pmraUnc: JsonField<Double> = JsonMissing.of()
            private var pmUncFlag: JsonField<Boolean> = JsonMissing.of()
            private var posUncFlag: JsonField<Boolean> = JsonMissing.of()
            private var raUnc: JsonField<Double> = JsonMissing.of()
            private var rpmag: JsonField<Double> = JsonMissing.of()
            private var rpmagUnc: JsonField<Double> = JsonMissing.of()
            private var shift: JsonField<Double> = JsonMissing.of()
            private var shiftFlag: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var varFlag: JsonField<Boolean> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                astrometryOrigin = body.astrometryOrigin
                classificationMarking = body.classificationMarking
                csId = body.csId
                dataMode = body.dataMode
                dec = body.dec
                ra = body.ra
                source = body.source
                starEpoch = body.starEpoch
                id = body.id
                bpmag = body.bpmag
                bpmagUnc = body.bpmagUnc
                catVersion = body.catVersion
                createdAt = body.createdAt
                createdBy = body.createdBy
                decUnc = body.decUnc
                gaiadr3CatId = body.gaiadr3CatId
                gmag = body.gmag
                gmagUnc = body.gmagUnc
                gncCatId = body.gncCatId
                hipCatId = body.hipCatId
                hmag = body.hmag
                hmagUnc = body.hmagUnc
                jmag = body.jmag
                jmagUnc = body.jmagUnc
                kmag = body.kmag
                kmagUnc = body.kmagUnc
                multFlag = body.multFlag
                neighborDistance = body.neighborDistance
                neighborFlag = body.neighborFlag
                neighborId = body.neighborId
                origin = body.origin
                origNetwork = body.origNetwork
                parallax = body.parallax
                parallaxUnc = body.parallaxUnc
                pmdec = body.pmdec
                pmdecUnc = body.pmdecUnc
                pmra = body.pmra
                pmraUnc = body.pmraUnc
                pmUncFlag = body.pmUncFlag
                posUncFlag = body.posUncFlag
                raUnc = body.raUnc
                rpmag = body.rpmag
                rpmagUnc = body.rpmagUnc
                shift = body.shift
                shiftFlag = body.shiftFlag
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
                varFlag = body.varFlag
            }

            /**
             * Originating astrometric catalog for this object. Enum: [GAIADR3, HIPPARCOS, USNOBSC].
             */
            fun astrometryOrigin(astrometryOrigin: AstrometryOrigin) =
                astrometryOrigin(JsonField.of(astrometryOrigin))

            /**
             * Sets [Builder.astrometryOrigin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.astrometryOrigin] with a well-typed
             * [AstrometryOrigin] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun astrometryOrigin(astrometryOrigin: JsonField<AstrometryOrigin>) = apply {
                this.astrometryOrigin = astrometryOrigin
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

            /** The ID of this object in the specific catalog associated with this record. */
            fun csId(csId: Long) = csId(JsonField.of(csId))

            /**
             * Sets [Builder.csId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.csId] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun csId(csId: JsonField<Long>) = apply { this.csId = csId }

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
             * Barycentric declination of the source in International Celestial Reference System
             * (ICRS) at the reference epoch, in degrees.
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
             * Barycentric right ascension of the source in the International Celestial Reference
             * System (ICRS) frame at the reference epoch, in degrees.
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
             * Reference epoch to which the astrometric source parameters are referred, expressed as
             * Julian Year in Barycentric Coordinate Time (TCB).
             */
            fun starEpoch(starEpoch: Double) = starEpoch(JsonField.of(starEpoch))

            /**
             * Sets [Builder.starEpoch] to an arbitrary JSON value.
             *
             * You should usually call [Builder.starEpoch] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun starEpoch(starEpoch: JsonField<Double>) = apply { this.starEpoch = starEpoch }

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

            /** Gaia DR3 optical photometric Bp-band magnitude in the Vega scale. */
            fun bpmag(bpmag: Double) = bpmag(JsonField.of(bpmag))

            /**
             * Sets [Builder.bpmag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bpmag] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bpmag(bpmag: JsonField<Double>) = apply { this.bpmag = bpmag }

            /** Gaia DR3 optical Bp-band magnitude uncertainty in the Vega scale. */
            fun bpmagUnc(bpmagUnc: Double) = bpmagUnc(JsonField.of(bpmagUnc))

            /**
             * Sets [Builder.bpmagUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bpmagUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bpmagUnc(bpmagUnc: JsonField<Double>) = apply { this.bpmagUnc = bpmagUnc }

            /** The version of the catalog associated with this object. */
            fun catVersion(catVersion: String) = catVersion(JsonField.of(catVersion))

            /**
             * Sets [Builder.catVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.catVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun catVersion(catVersion: JsonField<String>) = apply { this.catVersion = catVersion }

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
             * Uncertainty of the declination of the source, in milliarcseconds, at the reference
             * epoch.
             */
            fun decUnc(decUnc: Double) = decUnc(JsonField.of(decUnc))

            /**
             * Sets [Builder.decUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.decUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun decUnc(decUnc: JsonField<Double>) = apply { this.decUnc = decUnc }

            /** The ID of this object in the Gaia DR3 Catalog. */
            fun gaiadr3CatId(gaiadr3CatId: Long) = gaiadr3CatId(JsonField.of(gaiadr3CatId))

            /**
             * Sets [Builder.gaiadr3CatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gaiadr3CatId] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gaiadr3CatId(gaiadr3CatId: JsonField<Long>) = apply {
                this.gaiadr3CatId = gaiadr3CatId
            }

            /** Gaia DR3 optical photometric G-band magnitude in the Vega scale. */
            fun gmag(gmag: Double) = gmag(JsonField.of(gmag))

            /**
             * Sets [Builder.gmag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gmag] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun gmag(gmag: JsonField<Double>) = apply { this.gmag = gmag }

            /** Gaia DR3 optical photometric G-band magnitude uncertainty in the Vega scale. */
            fun gmagUnc(gmagUnc: Double) = gmagUnc(JsonField.of(gmagUnc))

            /**
             * Sets [Builder.gmagUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gmagUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gmagUnc(gmagUnc: JsonField<Double>) = apply { this.gmagUnc = gmagUnc }

            /** The ID of this object in the Guidance and Navagation Control (GNC) Catalog. */
            fun gncCatId(gncCatId: Int) = gncCatId(JsonField.of(gncCatId))

            /**
             * Sets [Builder.gncCatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gncCatId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gncCatId(gncCatId: JsonField<Int>) = apply { this.gncCatId = gncCatId }

            /** The ID of this object in the Hipparcos Catalog. */
            fun hipCatId(hipCatId: Int) = hipCatId(JsonField.of(hipCatId))

            /**
             * Sets [Builder.hipCatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hipCatId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hipCatId(hipCatId: JsonField<Int>) = apply { this.hipCatId = hipCatId }

            /**
             * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared
             * photometric H-band magnitude in the Vega scale.
             */
            fun hmag(hmag: Double) = hmag(JsonField.of(hmag))

            /**
             * Sets [Builder.hmag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hmag] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun hmag(hmag: JsonField<Double>) = apply { this.hmag = hmag }

            /**
             * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared
             * photometric H-band magnitude uncertainty in the Vega scale.
             */
            fun hmagUnc(hmagUnc: Double) = hmagUnc(JsonField.of(hmagUnc))

            /**
             * Sets [Builder.hmagUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hmagUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hmagUnc(hmagUnc: JsonField<Double>) = apply { this.hmagUnc = hmagUnc }

            /**
             * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared
             * photometric J-band magnitude in the Vega scale.
             */
            fun jmag(jmag: Double) = jmag(JsonField.of(jmag))

            /**
             * Sets [Builder.jmag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jmag] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun jmag(jmag: JsonField<Double>) = apply { this.jmag = jmag }

            /**
             * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared
             * photometric J-band magnitude uncertainty in the Vega scale.
             */
            fun jmagUnc(jmagUnc: Double) = jmagUnc(JsonField.of(jmagUnc))

            /**
             * Sets [Builder.jmagUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jmagUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jmagUnc(jmagUnc: JsonField<Double>) = apply { this.jmagUnc = jmagUnc }

            /**
             * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared
             * photometric K-band magnitude in the Vega scale.
             */
            fun kmag(kmag: Double) = kmag(JsonField.of(kmag))

            /**
             * Sets [Builder.kmag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kmag] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun kmag(kmag: JsonField<Double>) = apply { this.kmag = kmag }

            /**
             * Two Micron All Sky Survey (2MASS) Point Source Catalog (PSC) near-infrared
             * photometric K-band magnitude uncertainty in the Vega scale.
             */
            fun kmagUnc(kmagUnc: Double) = kmagUnc(JsonField.of(kmagUnc))

            /**
             * Sets [Builder.kmagUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kmagUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun kmagUnc(kmagUnc: JsonField<Double>) = apply { this.kmagUnc = kmagUnc }

            /** Flag indicating that this is a multiple object source. */
            fun multFlag(multFlag: Boolean) = multFlag(JsonField.of(multFlag))

            /**
             * Sets [Builder.multFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multFlag] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun multFlag(multFlag: JsonField<Boolean>) = apply { this.multFlag = multFlag }

            /** Distance between source and nearest neighbor, in arcseconds. */
            fun neighborDistance(neighborDistance: Double) =
                neighborDistance(JsonField.of(neighborDistance))

            /**
             * Sets [Builder.neighborDistance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.neighborDistance] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun neighborDistance(neighborDistance: JsonField<Double>) = apply {
                this.neighborDistance = neighborDistance
            }

            /** Flag indicating that the nearest catalog neighbor is closer than 4.6 arcseconds. */
            fun neighborFlag(neighborFlag: Boolean) = neighborFlag(JsonField.of(neighborFlag))

            /**
             * Sets [Builder.neighborFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.neighborFlag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun neighborFlag(neighborFlag: JsonField<Boolean>) = apply {
                this.neighborFlag = neighborFlag
            }

            /** The catalog ID of the nearest neighbor to this source. */
            fun neighborId(neighborId: Int) = neighborId(JsonField.of(neighborId))

            /**
             * Sets [Builder.neighborId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.neighborId] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun neighborId(neighborId: JsonField<Int>) = apply { this.neighborId = neighborId }

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

            /** Absolute stellar parallax of the source, in milliarcseconds. */
            fun parallax(parallax: Double) = parallax(JsonField.of(parallax))

            /**
             * Sets [Builder.parallax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parallax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parallax(parallax: JsonField<Double>) = apply { this.parallax = parallax }

            /** Uncertainty of the stellar parallax, in milliarcseconds. */
            fun parallaxUnc(parallaxUnc: Double) = parallaxUnc(JsonField.of(parallaxUnc))

            /**
             * Sets [Builder.parallaxUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parallaxUnc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parallaxUnc(parallaxUnc: JsonField<Double>) = apply {
                this.parallaxUnc = parallaxUnc
            }

            /**
             * Proper motion in declination of the source, in milliarcseconds/year, at the reference
             * epoch.
             */
            fun pmdec(pmdec: Double) = pmdec(JsonField.of(pmdec))

            /**
             * Sets [Builder.pmdec] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pmdec] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pmdec(pmdec: JsonField<Double>) = apply { this.pmdec = pmdec }

            /** Uncertainty of proper motion in declination, in milliarcseconds/year. */
            fun pmdecUnc(pmdecUnc: Double) = pmdecUnc(JsonField.of(pmdecUnc))

            /**
             * Sets [Builder.pmdecUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pmdecUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pmdecUnc(pmdecUnc: JsonField<Double>) = apply { this.pmdecUnc = pmdecUnc }

            /**
             * Proper motion in right ascension of the source, in milliarcseconds/year, at the
             * reference epoch.
             */
            fun pmra(pmra: Double) = pmra(JsonField.of(pmra))

            /**
             * Sets [Builder.pmra] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pmra] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun pmra(pmra: JsonField<Double>) = apply { this.pmra = pmra }

            /** Uncertainty of proper motion in right ascension, in milliarcseconds/year. */
            fun pmraUnc(pmraUnc: Double) = pmraUnc(JsonField.of(pmraUnc))

            /**
             * Sets [Builder.pmraUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pmraUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pmraUnc(pmraUnc: JsonField<Double>) = apply { this.pmraUnc = pmraUnc }

            /**
             * Flag indicating that the proper motion uncertainty in either ra or dec is greater
             * than 10 milliarcseconds/year.
             */
            fun pmUncFlag(pmUncFlag: Boolean) = pmUncFlag(JsonField.of(pmUncFlag))

            /**
             * Sets [Builder.pmUncFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pmUncFlag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pmUncFlag(pmUncFlag: JsonField<Boolean>) = apply { this.pmUncFlag = pmUncFlag }

            /**
             * Flag indicating that the position uncertainty in either ra or dec is greater than 100
             * milliarcseconds.
             */
            fun posUncFlag(posUncFlag: Boolean) = posUncFlag(JsonField.of(posUncFlag))

            /**
             * Sets [Builder.posUncFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.posUncFlag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun posUncFlag(posUncFlag: JsonField<Boolean>) = apply { this.posUncFlag = posUncFlag }

            /**
             * Uncertainty of the right ascension of the source, in milliarcseconds, at the
             * reference epoch.
             */
            fun raUnc(raUnc: Double) = raUnc(JsonField.of(raUnc))

            /**
             * Sets [Builder.raUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.raUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun raUnc(raUnc: JsonField<Double>) = apply { this.raUnc = raUnc }

            /** Gaia DR3 optical Rp-band magnitude in the Vega scale. */
            fun rpmag(rpmag: Double) = rpmag(JsonField.of(rpmag))

            /**
             * Sets [Builder.rpmag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmag] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmag(rpmag: JsonField<Double>) = apply { this.rpmag = rpmag }

            /** Gaia DR3 optical photometric Rp-band magnitude uncertainty in the Vega scale. */
            fun rpmagUnc(rpmagUnc: Double) = rpmagUnc(JsonField.of(rpmagUnc))

            /**
             * Sets [Builder.rpmagUnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rpmagUnc] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rpmagUnc(rpmagUnc: JsonField<Double>) = apply { this.rpmagUnc = rpmagUnc }

            /** Photocentric shift caused by neighbors, in arcseconds. */
            fun shift(shift: Double) = shift(JsonField.of(shift))

            /**
             * Sets [Builder.shift] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shift] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shift(shift: JsonField<Double>) = apply { this.shift = shift }

            /** Flag indicating that the photocentric shift is greater than 50 milliarcseconds. */
            fun shiftFlag(shiftFlag: Boolean) = shiftFlag(JsonField.of(shiftFlag))

            /**
             * Sets [Builder.shiftFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shiftFlag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shiftFlag(shiftFlag: JsonField<Boolean>) = apply { this.shiftFlag = shiftFlag }

            /** Time the row was updated in the database. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** Application user who updated the row in the database. */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            /** Flag indicating that the source exhibits variable magnitude. */
            fun varFlag(varFlag: Boolean) = varFlag(JsonField.of(varFlag))

            /**
             * Sets [Builder.varFlag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.varFlag] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun varFlag(varFlag: JsonField<Boolean>) = apply { this.varFlag = varFlag }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .astrometryOrigin()
             * .classificationMarking()
             * .csId()
             * .dataMode()
             * .dec()
             * .ra()
             * .source()
             * .starEpoch()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("astrometryOrigin", astrometryOrigin),
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("csId", csId),
                    checkRequired("dataMode", dataMode),
                    checkRequired("dec", dec),
                    checkRequired("ra", ra),
                    checkRequired("source", source),
                    checkRequired("starEpoch", starEpoch),
                    id,
                    bpmag,
                    bpmagUnc,
                    catVersion,
                    createdAt,
                    createdBy,
                    decUnc,
                    gaiadr3CatId,
                    gmag,
                    gmagUnc,
                    gncCatId,
                    hipCatId,
                    hmag,
                    hmagUnc,
                    jmag,
                    jmagUnc,
                    kmag,
                    kmagUnc,
                    multFlag,
                    neighborDistance,
                    neighborFlag,
                    neighborId,
                    origin,
                    origNetwork,
                    parallax,
                    parallaxUnc,
                    pmdec,
                    pmdecUnc,
                    pmra,
                    pmraUnc,
                    pmUncFlag,
                    posUncFlag,
                    raUnc,
                    rpmag,
                    rpmagUnc,
                    shift,
                    shiftFlag,
                    updatedAt,
                    updatedBy,
                    varFlag,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            astrometryOrigin().validate()
            classificationMarking()
            csId()
            dataMode().validate()
            dec()
            ra()
            source()
            starEpoch()
            id()
            bpmag()
            bpmagUnc()
            catVersion()
            createdAt()
            createdBy()
            decUnc()
            gaiadr3CatId()
            gmag()
            gmagUnc()
            gncCatId()
            hipCatId()
            hmag()
            hmagUnc()
            jmag()
            jmagUnc()
            kmag()
            kmagUnc()
            multFlag()
            neighborDistance()
            neighborFlag()
            neighborId()
            origin()
            origNetwork()
            parallax()
            parallaxUnc()
            pmdec()
            pmdecUnc()
            pmra()
            pmraUnc()
            pmUncFlag()
            posUncFlag()
            raUnc()
            rpmag()
            rpmagUnc()
            shift()
            shiftFlag()
            updatedAt()
            updatedBy()
            varFlag()
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
            (astrometryOrigin.asKnown().getOrNull()?.validity() ?: 0) +
                (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (if (csId.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dec.asKnown().isPresent) 1 else 0) +
                (if (ra.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (starEpoch.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (bpmag.asKnown().isPresent) 1 else 0) +
                (if (bpmagUnc.asKnown().isPresent) 1 else 0) +
                (if (catVersion.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (decUnc.asKnown().isPresent) 1 else 0) +
                (if (gaiadr3CatId.asKnown().isPresent) 1 else 0) +
                (if (gmag.asKnown().isPresent) 1 else 0) +
                (if (gmagUnc.asKnown().isPresent) 1 else 0) +
                (if (gncCatId.asKnown().isPresent) 1 else 0) +
                (if (hipCatId.asKnown().isPresent) 1 else 0) +
                (if (hmag.asKnown().isPresent) 1 else 0) +
                (if (hmagUnc.asKnown().isPresent) 1 else 0) +
                (if (jmag.asKnown().isPresent) 1 else 0) +
                (if (jmagUnc.asKnown().isPresent) 1 else 0) +
                (if (kmag.asKnown().isPresent) 1 else 0) +
                (if (kmagUnc.asKnown().isPresent) 1 else 0) +
                (if (multFlag.asKnown().isPresent) 1 else 0) +
                (if (neighborDistance.asKnown().isPresent) 1 else 0) +
                (if (neighborFlag.asKnown().isPresent) 1 else 0) +
                (if (neighborId.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (parallax.asKnown().isPresent) 1 else 0) +
                (if (parallaxUnc.asKnown().isPresent) 1 else 0) +
                (if (pmdec.asKnown().isPresent) 1 else 0) +
                (if (pmdecUnc.asKnown().isPresent) 1 else 0) +
                (if (pmra.asKnown().isPresent) 1 else 0) +
                (if (pmraUnc.asKnown().isPresent) 1 else 0) +
                (if (pmUncFlag.asKnown().isPresent) 1 else 0) +
                (if (posUncFlag.asKnown().isPresent) 1 else 0) +
                (if (raUnc.asKnown().isPresent) 1 else 0) +
                (if (rpmag.asKnown().isPresent) 1 else 0) +
                (if (rpmagUnc.asKnown().isPresent) 1 else 0) +
                (if (shift.asKnown().isPresent) 1 else 0) +
                (if (shiftFlag.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0) +
                (if (varFlag.asKnown().isPresent) 1 else 0)

        /** Originating astrometric catalog for this object. Enum: [GAIADR3, HIPPARCOS, USNOBSC]. */
        class AstrometryOrigin
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

                @JvmField val GAIADR3 = of("GAIADR3")

                @JvmField val HIPPARCOS = of("HIPPARCOS")

                @JvmField val USNOBSC = of("USNOBSC")

                @JvmStatic fun of(value: String) = AstrometryOrigin(JsonField.of(value))
            }

            /** An enum containing [AstrometryOrigin]'s known values. */
            enum class Known {
                GAIADR3,
                HIPPARCOS,
                USNOBSC,
            }

            /**
             * An enum containing [AstrometryOrigin]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AstrometryOrigin] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GAIADR3,
                HIPPARCOS,
                USNOBSC,
                /**
                 * An enum member indicating that [AstrometryOrigin] was instantiated with an
                 * unknown value.
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
                    GAIADR3 -> Value.GAIADR3
                    HIPPARCOS -> Value.HIPPARCOS
                    USNOBSC -> Value.USNOBSC
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
                    GAIADR3 -> Known.GAIADR3
                    HIPPARCOS -> Known.HIPPARCOS
                    USNOBSC -> Known.USNOBSC
                    else ->
                        throw UnifieddatalibraryInvalidDataException(
                            "Unknown AstrometryOrigin: $value"
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

            fun validate(): AstrometryOrigin = apply {
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

                return /* spotless:off */ other is AstrometryOrigin && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

                return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && astrometryOrigin == other.astrometryOrigin && classificationMarking == other.classificationMarking && csId == other.csId && dataMode == other.dataMode && dec == other.dec && ra == other.ra && source == other.source && starEpoch == other.starEpoch && id == other.id && bpmag == other.bpmag && bpmagUnc == other.bpmagUnc && catVersion == other.catVersion && createdAt == other.createdAt && createdBy == other.createdBy && decUnc == other.decUnc && gaiadr3CatId == other.gaiadr3CatId && gmag == other.gmag && gmagUnc == other.gmagUnc && gncCatId == other.gncCatId && hipCatId == other.hipCatId && hmag == other.hmag && hmagUnc == other.hmagUnc && jmag == other.jmag && jmagUnc == other.jmagUnc && kmag == other.kmag && kmagUnc == other.kmagUnc && multFlag == other.multFlag && neighborDistance == other.neighborDistance && neighborFlag == other.neighborFlag && neighborId == other.neighborId && origin == other.origin && origNetwork == other.origNetwork && parallax == other.parallax && parallaxUnc == other.parallaxUnc && pmdec == other.pmdec && pmdecUnc == other.pmdecUnc && pmra == other.pmra && pmraUnc == other.pmraUnc && pmUncFlag == other.pmUncFlag && posUncFlag == other.posUncFlag && raUnc == other.raUnc && rpmag == other.rpmag && rpmagUnc == other.rpmagUnc && shift == other.shift && shiftFlag == other.shiftFlag && updatedAt == other.updatedAt && updatedBy == other.updatedBy && varFlag == other.varFlag /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(astrometryOrigin, classificationMarking, csId, dataMode, dec, ra, source, starEpoch, id, bpmag, bpmagUnc, catVersion, createdAt, createdBy, decUnc, gaiadr3CatId, gmag, gmagUnc, gncCatId, hipCatId, hmag, hmagUnc, jmag, jmagUnc, kmag, kmagUnc, multFlag, neighborDistance, neighborFlag, neighborId, origin, origNetwork, parallax, parallaxUnc, pmdec, pmdecUnc, pmra, pmraUnc, pmUncFlag, posUncFlag, raUnc, rpmag, rpmagUnc, shift, shiftFlag, updatedAt, updatedBy, varFlag) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{astrometryOrigin=$astrometryOrigin, classificationMarking=$classificationMarking, csId=$csId, dataMode=$dataMode, dec=$dec, ra=$ra, source=$source, starEpoch=$starEpoch, id=$id, bpmag=$bpmag, bpmagUnc=$bpmagUnc, catVersion=$catVersion, createdAt=$createdAt, createdBy=$createdBy, decUnc=$decUnc, gaiadr3CatId=$gaiadr3CatId, gmag=$gmag, gmagUnc=$gmagUnc, gncCatId=$gncCatId, hipCatId=$hipCatId, hmag=$hmag, hmagUnc=$hmagUnc, jmag=$jmag, jmagUnc=$jmagUnc, kmag=$kmag, kmagUnc=$kmagUnc, multFlag=$multFlag, neighborDistance=$neighborDistance, neighborFlag=$neighborFlag, neighborId=$neighborId, origin=$origin, origNetwork=$origNetwork, parallax=$parallax, parallaxUnc=$parallaxUnc, pmdec=$pmdec, pmdecUnc=$pmdecUnc, pmra=$pmra, pmraUnc=$pmraUnc, pmUncFlag=$pmUncFlag, posUncFlag=$posUncFlag, raUnc=$raUnc, rpmag=$rpmag, rpmagUnc=$rpmagUnc, shift=$shift, shiftFlag=$shiftFlag, updatedAt=$updatedAt, updatedBy=$updatedBy, varFlag=$varFlag}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StarCatalogUnvalidatedPublishParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StarCatalogUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

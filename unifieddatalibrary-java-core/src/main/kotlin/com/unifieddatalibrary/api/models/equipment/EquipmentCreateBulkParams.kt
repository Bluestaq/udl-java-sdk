// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.equipment

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
 * Service operation intended for initial integration only, to take a list of Equipment records as a
 * POST body and ingest into the database. This operation is not intended to be used for automated
 * feeds into UDL. Data providers should contact the UDL team for specific role assignments and for
 * instructions on setting up a permanent feed through an alternate mechanism.
 */
class EquipmentCreateBulkParams
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
         * Returns a mutable builder for constructing an instance of [EquipmentCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EquipmentCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(equipmentCreateBulkParams: EquipmentCreateBulkParams) = apply {
            body = equipmentCreateBulkParams.body.toMutableList()
            additionalHeaders = equipmentCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = equipmentCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [EquipmentCreateBulkParams].
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
        fun build(): EquipmentCreateBulkParams =
            EquipmentCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Properties and characteristics of equipment that can be associated with a site or other
     * entity.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val countryCode: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val lat: JsonField<Double>,
        private val lon: JsonField<Double>,
        private val source: JsonField<String>,
        private val id: JsonField<String>,
        private val airDefArea: JsonField<String>,
        private val allegiance: JsonField<String>,
        private val altAllegiance: JsonField<String>,
        private val altCountryCode: JsonField<String>,
        private val altEqpId: JsonField<String>,
        private val classRating: JsonField<String>,
        private val condition: JsonField<String>,
        private val conditionAvail: JsonField<String>,
        private val coord: JsonField<String>,
        private val coordDatum: JsonField<String>,
        private val coordDerivAcc: JsonField<Double>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val elevMsl: JsonField<Double>,
        private val elevMslConfLvl: JsonField<Int>,
        private val elevMslDerivAcc: JsonField<Double>,
        private val eqpCode: JsonField<String>,
        private val eqpIdNum: JsonField<String>,
        private val eval: JsonField<Int>,
        private val fpa: JsonField<String>,
        private val function: JsonField<String>,
        private val functPrimary: JsonField<String>,
        private val geoidalMslSep: JsonField<Double>,
        private val ident: JsonField<String>,
        private val idOperatingUnit: JsonField<String>,
        private val idParentEquipment: JsonField<String>,
        private val idSite: JsonField<String>,
        private val locReason: JsonField<String>,
        private val milGrid: JsonField<String>,
        private val milGridSys: JsonField<String>,
        private val nomen: JsonField<String>,
        private val operAreaPrimary: JsonField<String>,
        private val operStatus: JsonField<String>,
        private val origin: JsonField<String>,
        private val polSubdiv: JsonField<String>,
        private val qtyOh: JsonField<Int>,
        private val recStatus: JsonField<String>,
        private val referenceDoc: JsonField<String>,
        private val resProd: JsonField<String>,
        private val reviewDate: JsonField<LocalDate>,
        private val seqNum: JsonField<Int>,
        private val srcIds: JsonField<List<String>>,
        private val srcTyps: JsonField<List<String>>,
        private val symCode: JsonField<String>,
        private val utm: JsonField<String>,
        private val wac: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking")
            @ExcludeMissing
            classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode")
            @ExcludeMissing
            dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("airDefArea")
            @ExcludeMissing
            airDefArea: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allegiance")
            @ExcludeMissing
            allegiance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altAllegiance")
            @ExcludeMissing
            altAllegiance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altCountryCode")
            @ExcludeMissing
            altCountryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("altEqpId")
            @ExcludeMissing
            altEqpId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("classRating")
            @ExcludeMissing
            classRating: JsonField<String> = JsonMissing.of(),
            @JsonProperty("condition")
            @ExcludeMissing
            condition: JsonField<String> = JsonMissing.of(),
            @JsonProperty("conditionAvail")
            @ExcludeMissing
            conditionAvail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coord") @ExcludeMissing coord: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coordDatum")
            @ExcludeMissing
            coordDatum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("coordDerivAcc")
            @ExcludeMissing
            coordDerivAcc: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("elevMsl") @ExcludeMissing elevMsl: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("elevMslConfLvl")
            @ExcludeMissing
            elevMslConfLvl: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("elevMslDerivAcc")
            @ExcludeMissing
            elevMslDerivAcc: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("eqpCode") @ExcludeMissing eqpCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("eqpIdNum")
            @ExcludeMissing
            eqpIdNum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("eval") @ExcludeMissing eval: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("fpa") @ExcludeMissing fpa: JsonField<String> = JsonMissing.of(),
            @JsonProperty("function")
            @ExcludeMissing
            function: JsonField<String> = JsonMissing.of(),
            @JsonProperty("functPrimary")
            @ExcludeMissing
            functPrimary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("geoidalMslSep")
            @ExcludeMissing
            geoidalMslSep: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ident") @ExcludeMissing ident: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idOperatingUnit")
            @ExcludeMissing
            idOperatingUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idParentEquipment")
            @ExcludeMissing
            idParentEquipment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locReason")
            @ExcludeMissing
            locReason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("milGrid") @ExcludeMissing milGrid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("milGridSys")
            @ExcludeMissing
            milGridSys: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nomen") @ExcludeMissing nomen: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operAreaPrimary")
            @ExcludeMissing
            operAreaPrimary: JsonField<String> = JsonMissing.of(),
            @JsonProperty("operStatus")
            @ExcludeMissing
            operStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("polSubdiv")
            @ExcludeMissing
            polSubdiv: JsonField<String> = JsonMissing.of(),
            @JsonProperty("qtyOH") @ExcludeMissing qtyOh: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("recStatus")
            @ExcludeMissing
            recStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("referenceDoc")
            @ExcludeMissing
            referenceDoc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resProd") @ExcludeMissing resProd: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reviewDate")
            @ExcludeMissing
            reviewDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("seqNum") @ExcludeMissing seqNum: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("srcIds")
            @ExcludeMissing
            srcIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("srcTyps")
            @ExcludeMissing
            srcTyps: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("symCode") @ExcludeMissing symCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("utm") @ExcludeMissing utm: JsonField<String> = JsonMissing.of(),
            @JsonProperty("wac") @ExcludeMissing wac: JsonField<String> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            countryCode,
            dataMode,
            lat,
            lon,
            source,
            id,
            airDefArea,
            allegiance,
            altAllegiance,
            altCountryCode,
            altEqpId,
            classRating,
            condition,
            conditionAvail,
            coord,
            coordDatum,
            coordDerivAcc,
            createdAt,
            createdBy,
            elevMsl,
            elevMslConfLvl,
            elevMslDerivAcc,
            eqpCode,
            eqpIdNum,
            eval,
            fpa,
            function,
            functPrimary,
            geoidalMslSep,
            ident,
            idOperatingUnit,
            idParentEquipment,
            idSite,
            locReason,
            milGrid,
            milGridSys,
            nomen,
            operAreaPrimary,
            operStatus,
            origin,
            polSubdiv,
            qtyOh,
            recStatus,
            referenceDoc,
            resProd,
            reviewDate,
            seqNum,
            srcIds,
            srcTyps,
            symCode,
            utm,
            wac,
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
         * The DoD Standard Country Code designator for the country or political entity to which the
         * equipment geographic coordinates reside. This field will be set to "OTHR" if the source
         * value does not match a UDL Country code value (ISO-3166-ALPHA-2).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun countryCode(): String = countryCode.getRequired("countryCode")

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
         * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south of
         * equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun lat(): Double = lat.getRequired("lat")

        /**
         * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values west of
         * Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun lon(): Double = lon.getRequired("lon")

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
         * Air Defense District (ADD) or Air Defense Area (ADA) in which the geographic coordinates
         * reside.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun airDefArea(): Optional<String> = airDefArea.getOptional("airDefArea")

        /**
         * The DoD Standard Country Code designator for the country or political entity to which the
         * equipment owes its allegiance. This field will be set to "OTHR" if the source value does
         * not match a UDL Country code value (ISO-3166-ALPHA-2).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun allegiance(): Optional<String> = allegiance.getOptional("allegiance")

        /**
         * Specifies an alternate allegiance code if the data provider code is not part of an
         * official Country Code standard such as ISO-3166 or FIPS. This field will be set to the
         * value provided by the source and should be used for all Queries specifying allegiance.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altAllegiance(): Optional<String> = altAllegiance.getOptional("altAllegiance")

        /**
         * Specifies an alternate country code if the data provider code is not part of an official
         * Country Code standard such as ISO-3166 or FIPS. This field will be set to the value
         * provided by the source and should be used for all Queries specifying a Country Code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altCountryCode(): Optional<String> = altCountryCode.getOptional("altCountryCode")

        /**
         * Unique identifier of the Equipment record from the originating system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun altEqpId(): Optional<String> = altEqpId.getOptional("altEqpId")

        /**
         * Indicates the importance of the equipment. Referenced, but not constrained to, the
         * following class ratings type classifications.
         *
         * 0 - Not of significant importance of the system
         *
         * 1 - Primary importance to system
         *
         * 2 - Secondary importance to system
         *
         * 3 - Tertiary importance to system
         *
         * O - Other. Explain in Remarks.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun classRating(): Optional<String> = classRating.getOptional("classRating")

        /**
         * The physical manner of being or state of existence of the entity. A physical condition
         * that must be considered in the determining of a course of action. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun condition(): Optional<String> = condition.getOptional("condition")

        /**
         * Availability of the entity relative to its condition. Indicates the reason the entity is
         * not fully operational. The specific usage and enumerations contained in this field may be
         * found in the documentation provided in the referenceDoc field. If referenceDoc not
         * provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun conditionAvail(): Optional<String> = conditionAvail.getOptional("conditionAvail")

        /**
         * Indicates any of the magnitudes that serve to define the position of a point by reference
         * to a fixed figure, system of lines, etc. specified in degrees, minute, and seconds.
         *
         * Pos. 1-2. Latitude Degrees [00-90]
         *
         * Pos. 3-4. Latitude Minutes [00-59]
         *
         * Pos. 5-6. Latitude Seconds [00-59]
         *
         * Pos. 7-9. Latitude Thousandths Of Seconds [000-999]
         *
         * Pos. 10. Latitude Hemisphere [NS]
         *
         * Pos. 11-13. Longitude Degrees [00-180]
         *
         * Pos. 14-15. Longitude Minutes [00-59]
         *
         * Pos. 16-17. Longitude Seconds [00-59]
         *
         * Pos. 18-20. Longitude Thousandths Of Seconds [000-999]
         *
         * Pos. 21. Longitude Hemisphere [EW]
         *
         * Pos. 1-21. Unknown Latitude and Unknown Longitude [000000000U000000000U]].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun coord(): Optional<String> = coord.getOptional("coord")

        /**
         * A mathematical model of the earth used to calculate coordinates on a map. US Forces use
         * the World Geodetic System 1984 (WGS 84), but also use maps by allied countries with local
         * datums. The datum must be specified to ensure accuracy of coordinates. The specific usage
         * and enumerations contained in this field may be found in the documentation provided in
         * the referenceDoc field. If referenceDoc not provided, users may consult the data
         * provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun coordDatum(): Optional<String> = coordDatum.getOptional("coordDatum")

        /**
         * Indicates the plus or minus error assessed against the method used to derive the
         * coordinate.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun coordDerivAcc(): Optional<Double> = coordDerivAcc.getOptional("coordDerivAcc")

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
         * Ground elevation, in meters, of the geographic coordinates referenced to (above or below)
         * Mean Sea Level (MSL) vertical datum.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevMsl(): Optional<Double> = elevMsl.getOptional("elevMsl")

        /**
         * Indicates the confidence level expressed as a percent that a specific geometric spatial
         * element, ELEVATION_MSL linear accuracy, has been vertically positioned to within a
         * specified vertical accuracy. Confidence level has a range of values from 0 to 100, with
         * 100 being highest level of confidence.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevMslConfLvl(): Optional<Int> = elevMslConfLvl.getOptional("elevMslConfLvl")

        /**
         * Indicates the plus or minus error assessed against the method used to derive the
         * elevation, measured in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun elevMslDerivAcc(): Optional<Double> = elevMslDerivAcc.getOptional("elevMslDerivAcc")

        /**
         * Designated equipment code assigned to the item of equipment or an abbreviation record
         * type unique identifier. Users should consult the data provider for information on the
         * equipment code structure.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eqpCode(): Optional<String> = eqpCode.getOptional("eqpCode")

        /**
         * Uniquely identifies each item or group of equipment associated with a unit, facility or
         * site.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eqpIdNum(): Optional<String> = eqpIdNum.getOptional("eqpIdNum")

        /**
         * Eval represents the Intelligence Confidence Level or the Reliability/degree of confidence
         * that the analyst has assigned to the data within this record. The numerical range is from
         * 1 to 9 with 1 representing the highest confidence level.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun eval(): Optional<Int> = eval.getOptional("eval")

        /**
         * Functional Production Area (FPA) under the Shared Production Program (SPP). Producers are
         * defined per country per FPA. The specific usage and enumerations contained in this field
         * may be found in the documentation provided in the referenceDoc field. If referenceDoc not
         * provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fpa(): Optional<String> = fpa.getOptional("fpa")

        /**
         * Indicates the function or mission of this equipment, which may or may not be engaged in
         * at any particular time. Typically refers to a unit, organization, or
         * installation/facility performing a specific function or mission such as a redistribution
         * center or naval shipyard. The specific usage and enumerations contained in this field may
         * be found in the documentation provided in the referenceDoc field. If referenceDoc not
         * provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun function(): Optional<String> = function.getOptional("function")

        /**
         * Principal operational function being performed. The specific usage and enumerations
         * contained in this field may be found in the documentation provided in the referenceDoc
         * field. If referenceDoc not provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun functPrimary(): Optional<String> = functPrimary.getOptional("functPrimary")

        /**
         * The distance between Mean Sea Level and a referenced ellipsoid, measured in meters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun geoidalMslSep(): Optional<Double> = geoidalMslSep.getOptional("geoidalMslSep")

        /**
         * Estimated identity of the Site (ASSUMED FRIEND, FRIEND, HOSTILE, FAKER, JOKER, NEUTRAL,
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
         * FAKER: Friendly track, object, or entity acting as an exercise hostile.
         *
         * JOKER: Friendly track, object, or entity acting as an exercise suspect.
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
        fun ident(): Optional<String> = ident.getOptional("ident")

        /**
         * Unique identifier of the operating unit associated with the equipment record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idOperatingUnit(): Optional<String> = idOperatingUnit.getOptional("idOperatingUnit")

        /**
         * Unique identifier of the Parent equipment record associated with this equipment record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idParentEquipment(): Optional<String> =
            idParentEquipment.getOptional("idParentEquipment")

        /**
         * Unique identifier of the Site Entity associated with the equipment record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSite(): Optional<String> = idSite.getOptional("idSite")

        /**
         * Indicates the reason that the equipment is at that location. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun locReason(): Optional<String> = locReason.getOptional("locReason")

        /**
         * The Military Grid Reference System is the geocoordinate standard used by NATO militaries
         * for locating points on Earth. The MGRS is derived from the Universal Transverse Mercator
         * (UTM) grid system and the Universal Polar Stereographic (UPS) grid system, but uses a
         * different labeling convention. The MGRS is used as geocode for the entire Earth. Example
         * of an milgrid coordinate, or grid reference, would be 4QFJ12345678, which consists of
         * three parts:
         *
         * 4Q (grid zone designator, GZD)
         *
         * FJ (the 100,000-meter square identifier)
         *
         * 12345678 (numerical location; easting is 1234 and northing is 5678, in this case
         * specifying a location with 10 m resolution).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun milGrid(): Optional<String> = milGrid.getOptional("milGrid")

        /**
         * Indicates the grid system used in the development of the milGrid coordinates. Values are:
         *
         * UPS - Universal Polar System
         *
         * UTM - Universal Transverse Mercator.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun milGridSys(): Optional<String> = milGridSys.getOptional("milGridSys")

        /**
         * Generic type this specific piece of equipment belongs to, and the identifying
         * nomenclature which describes the equipment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun nomen(): Optional<String> = nomen.getOptional("nomen")

        /**
         * Internationally recognized water area in which the vessel is most likely to be deployed
         * or in which it normally operates most frequently.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun operAreaPrimary(): Optional<String> = operAreaPrimary.getOptional("operAreaPrimary")

        /**
         * The Degree to which an entity is ready to perform the overall operational mission(s) for
         * which it was organized and equipped. The specific usage and enumerations contained in
         * this field may be found in the documentation provided in the referenceDoc field. If
         * referenceDoc not provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun operStatus(): Optional<String> = operStatus.getOptional("operStatus")

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
         * Political subdivision in which the geographic coordinates reside. The specific usage and
         * enumerations contained in this field may be found in the documentation provided in the
         * referenceDoc field. If referenceDoc not provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun polSubdiv(): Optional<String> = polSubdiv.getOptional("polSubdiv")

        /**
         * Relative to the parent entity, the total number of military personnel or equipment
         * assessed to be on-hand (OH).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun qtyOh(): Optional<Int> = qtyOh.getOptional("qtyOH")

        /**
         * Validity and currency of the data in the record to be used in conjunction with the other
         * elements in the record as defined by SOPs. Referenced, but not constrained to, the
         * following record status type classifications.
         *
         * A - Active
         *
         * I - Inactive
         *
         * K - Acknowledged
         *
         * L - Local
         *
         * Q - A nominated (NOM) or Data Change Request (DCR) record
         *
         * R - Production reduced by CMD decision
         *
         * W - Working Record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recStatus(): Optional<String> = recStatus.getOptional("recStatus")

        /**
         * The reference documentiation that specifies the usage and enumerations contained in this
         * record. If referenceDoc not provided, users may consult the data provider.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun referenceDoc(): Optional<String> = referenceDoc.getOptional("referenceDoc")

        /**
         * Responsible Producer - Organization that is responsible for the maintenance of the
         * record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun resProd(): Optional<String> = resProd.getOptional("resProd")

        /**
         * Date on which the data in the record was last reviewed by the responsible analyst for
         * accuracy and currency. This date cannot be greater than the current date.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reviewDate(): Optional<LocalDate> = reviewDate.getOptional("reviewDate")

        /**
         * Provider specific sequential number assigned to the equipment.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun seqNum(): Optional<Int> = seqNum.getOptional("seqNum")

        /**
         * Array of UUID(s) of the UDL data record(s) that are related to this equipment record. See
         * the associated 'srcTyps' array for the specific types of data, positionally corresponding
         * to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must match in size. See the
         * corresponding srcTyps array element for the data type of the UUID and use the appropriate
         * API operation to retrieve that object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcIds(): Optional<List<String>> = srcIds.getOptional("srcIds")

        /**
         * Array of UDL record types such as AIRCRAFT, VESSEL, EO, MTI that are related to this
         * equipment record. See the associated 'srcIds' array for the record UUIDs, positionally
         * corresponding to the record types in this array. The 'srcTyps' and 'srcIds' arrays must
         * match in size.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun srcTyps(): Optional<List<String>> = srcTyps.getOptional("srcTyps")

        /**
         * A standard scheme for symbol coding enabling the transfer, display and use of symbols and
         * graphics among information systems, as per MIL-STD 2525B, and supported by the element
         * AFFILIATION.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun symCode(): Optional<String> = symCode.getOptional("symCode")

        /**
         * Universal Transverse Mercator (UTM) grid coordinates.
         *
         * Pos. 1-2, UTM Zone Column [01-60
         *
         * Pos. 3, UTM Zone Row [C-HJ-NP-X]
         *
         * Pos. 4, UTM False Easting [0-9]
         *
         * Pos. 5-9, UTM Meter Easting [0-9][0-9][0-9][0-9][0-9]
         *
         * Pos. 10-11, UTM False Northing [0-9][0-9]
         *
         * Pos. 12-16, UTM Meter Northing [0-9][0-9][0-9][0-9][0-9].
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun utm(): Optional<String> = utm.getOptional("utm")

        /**
         * World Aeronautical Chart identifier for the area in which a designated place is located.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun wac(): Optional<String> = wac.getOptional("wac")

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
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode") @ExcludeMissing fun _dataMode(): JsonField<DataMode> = dataMode

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
         * Returns the raw JSON value of [airDefArea].
         *
         * Unlike [airDefArea], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("airDefArea")
        @ExcludeMissing
        fun _airDefArea(): JsonField<String> = airDefArea

        /**
         * Returns the raw JSON value of [allegiance].
         *
         * Unlike [allegiance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allegiance")
        @ExcludeMissing
        fun _allegiance(): JsonField<String> = allegiance

        /**
         * Returns the raw JSON value of [altAllegiance].
         *
         * Unlike [altAllegiance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("altAllegiance")
        @ExcludeMissing
        fun _altAllegiance(): JsonField<String> = altAllegiance

        /**
         * Returns the raw JSON value of [altCountryCode].
         *
         * Unlike [altCountryCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("altCountryCode")
        @ExcludeMissing
        fun _altCountryCode(): JsonField<String> = altCountryCode

        /**
         * Returns the raw JSON value of [altEqpId].
         *
         * Unlike [altEqpId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("altEqpId") @ExcludeMissing fun _altEqpId(): JsonField<String> = altEqpId

        /**
         * Returns the raw JSON value of [classRating].
         *
         * Unlike [classRating], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("classRating")
        @ExcludeMissing
        fun _classRating(): JsonField<String> = classRating

        /**
         * Returns the raw JSON value of [condition].
         *
         * Unlike [condition], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonField<String> = condition

        /**
         * Returns the raw JSON value of [conditionAvail].
         *
         * Unlike [conditionAvail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("conditionAvail")
        @ExcludeMissing
        fun _conditionAvail(): JsonField<String> = conditionAvail

        /**
         * Returns the raw JSON value of [coord].
         *
         * Unlike [coord], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coord") @ExcludeMissing fun _coord(): JsonField<String> = coord

        /**
         * Returns the raw JSON value of [coordDatum].
         *
         * Unlike [coordDatum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("coordDatum")
        @ExcludeMissing
        fun _coordDatum(): JsonField<String> = coordDatum

        /**
         * Returns the raw JSON value of [coordDerivAcc].
         *
         * Unlike [coordDerivAcc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("coordDerivAcc")
        @ExcludeMissing
        fun _coordDerivAcc(): JsonField<Double> = coordDerivAcc

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
         * Returns the raw JSON value of [elevMsl].
         *
         * Unlike [elevMsl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("elevMsl") @ExcludeMissing fun _elevMsl(): JsonField<Double> = elevMsl

        /**
         * Returns the raw JSON value of [elevMslConfLvl].
         *
         * Unlike [elevMslConfLvl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("elevMslConfLvl")
        @ExcludeMissing
        fun _elevMslConfLvl(): JsonField<Int> = elevMslConfLvl

        /**
         * Returns the raw JSON value of [elevMslDerivAcc].
         *
         * Unlike [elevMslDerivAcc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("elevMslDerivAcc")
        @ExcludeMissing
        fun _elevMslDerivAcc(): JsonField<Double> = elevMslDerivAcc

        /**
         * Returns the raw JSON value of [eqpCode].
         *
         * Unlike [eqpCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eqpCode") @ExcludeMissing fun _eqpCode(): JsonField<String> = eqpCode

        /**
         * Returns the raw JSON value of [eqpIdNum].
         *
         * Unlike [eqpIdNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eqpIdNum") @ExcludeMissing fun _eqpIdNum(): JsonField<String> = eqpIdNum

        /**
         * Returns the raw JSON value of [eval].
         *
         * Unlike [eval], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("eval") @ExcludeMissing fun _eval(): JsonField<Int> = eval

        /**
         * Returns the raw JSON value of [fpa].
         *
         * Unlike [fpa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fpa") @ExcludeMissing fun _fpa(): JsonField<String> = fpa

        /**
         * Returns the raw JSON value of [function].
         *
         * Unlike [function], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("function") @ExcludeMissing fun _function(): JsonField<String> = function

        /**
         * Returns the raw JSON value of [functPrimary].
         *
         * Unlike [functPrimary], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("functPrimary")
        @ExcludeMissing
        fun _functPrimary(): JsonField<String> = functPrimary

        /**
         * Returns the raw JSON value of [geoidalMslSep].
         *
         * Unlike [geoidalMslSep], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("geoidalMslSep")
        @ExcludeMissing
        fun _geoidalMslSep(): JsonField<Double> = geoidalMslSep

        /**
         * Returns the raw JSON value of [ident].
         *
         * Unlike [ident], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ident") @ExcludeMissing fun _ident(): JsonField<String> = ident

        /**
         * Returns the raw JSON value of [idOperatingUnit].
         *
         * Unlike [idOperatingUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idOperatingUnit")
        @ExcludeMissing
        fun _idOperatingUnit(): JsonField<String> = idOperatingUnit

        /**
         * Returns the raw JSON value of [idParentEquipment].
         *
         * Unlike [idParentEquipment], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idParentEquipment")
        @ExcludeMissing
        fun _idParentEquipment(): JsonField<String> = idParentEquipment

        /**
         * Returns the raw JSON value of [idSite].
         *
         * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSite") @ExcludeMissing fun _idSite(): JsonField<String> = idSite

        /**
         * Returns the raw JSON value of [locReason].
         *
         * Unlike [locReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locReason") @ExcludeMissing fun _locReason(): JsonField<String> = locReason

        /**
         * Returns the raw JSON value of [milGrid].
         *
         * Unlike [milGrid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("milGrid") @ExcludeMissing fun _milGrid(): JsonField<String> = milGrid

        /**
         * Returns the raw JSON value of [milGridSys].
         *
         * Unlike [milGridSys], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("milGridSys")
        @ExcludeMissing
        fun _milGridSys(): JsonField<String> = milGridSys

        /**
         * Returns the raw JSON value of [nomen].
         *
         * Unlike [nomen], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nomen") @ExcludeMissing fun _nomen(): JsonField<String> = nomen

        /**
         * Returns the raw JSON value of [operAreaPrimary].
         *
         * Unlike [operAreaPrimary], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("operAreaPrimary")
        @ExcludeMissing
        fun _operAreaPrimary(): JsonField<String> = operAreaPrimary

        /**
         * Returns the raw JSON value of [operStatus].
         *
         * Unlike [operStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operStatus")
        @ExcludeMissing
        fun _operStatus(): JsonField<String> = operStatus

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<String> = origin

        /**
         * Returns the raw JSON value of [polSubdiv].
         *
         * Unlike [polSubdiv], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("polSubdiv") @ExcludeMissing fun _polSubdiv(): JsonField<String> = polSubdiv

        /**
         * Returns the raw JSON value of [qtyOh].
         *
         * Unlike [qtyOh], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("qtyOH") @ExcludeMissing fun _qtyOh(): JsonField<Int> = qtyOh

        /**
         * Returns the raw JSON value of [recStatus].
         *
         * Unlike [recStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recStatus") @ExcludeMissing fun _recStatus(): JsonField<String> = recStatus

        /**
         * Returns the raw JSON value of [referenceDoc].
         *
         * Unlike [referenceDoc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("referenceDoc")
        @ExcludeMissing
        fun _referenceDoc(): JsonField<String> = referenceDoc

        /**
         * Returns the raw JSON value of [resProd].
         *
         * Unlike [resProd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resProd") @ExcludeMissing fun _resProd(): JsonField<String> = resProd

        /**
         * Returns the raw JSON value of [reviewDate].
         *
         * Unlike [reviewDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reviewDate")
        @ExcludeMissing
        fun _reviewDate(): JsonField<LocalDate> = reviewDate

        /**
         * Returns the raw JSON value of [seqNum].
         *
         * Unlike [seqNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("seqNum") @ExcludeMissing fun _seqNum(): JsonField<Int> = seqNum

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
         * Returns the raw JSON value of [symCode].
         *
         * Unlike [symCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("symCode") @ExcludeMissing fun _symCode(): JsonField<String> = symCode

        /**
         * Returns the raw JSON value of [utm].
         *
         * Unlike [utm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("utm") @ExcludeMissing fun _utm(): JsonField<String> = utm

        /**
         * Returns the raw JSON value of [wac].
         *
         * Unlike [wac], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("wac") @ExcludeMissing fun _wac(): JsonField<String> = wac

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
             * .countryCode()
             * .dataMode()
             * .lat()
             * .lon()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var countryCode: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var lat: JsonField<Double>? = null
            private var lon: JsonField<Double>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var airDefArea: JsonField<String> = JsonMissing.of()
            private var allegiance: JsonField<String> = JsonMissing.of()
            private var altAllegiance: JsonField<String> = JsonMissing.of()
            private var altCountryCode: JsonField<String> = JsonMissing.of()
            private var altEqpId: JsonField<String> = JsonMissing.of()
            private var classRating: JsonField<String> = JsonMissing.of()
            private var condition: JsonField<String> = JsonMissing.of()
            private var conditionAvail: JsonField<String> = JsonMissing.of()
            private var coord: JsonField<String> = JsonMissing.of()
            private var coordDatum: JsonField<String> = JsonMissing.of()
            private var coordDerivAcc: JsonField<Double> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var elevMsl: JsonField<Double> = JsonMissing.of()
            private var elevMslConfLvl: JsonField<Int> = JsonMissing.of()
            private var elevMslDerivAcc: JsonField<Double> = JsonMissing.of()
            private var eqpCode: JsonField<String> = JsonMissing.of()
            private var eqpIdNum: JsonField<String> = JsonMissing.of()
            private var eval: JsonField<Int> = JsonMissing.of()
            private var fpa: JsonField<String> = JsonMissing.of()
            private var function: JsonField<String> = JsonMissing.of()
            private var functPrimary: JsonField<String> = JsonMissing.of()
            private var geoidalMslSep: JsonField<Double> = JsonMissing.of()
            private var ident: JsonField<String> = JsonMissing.of()
            private var idOperatingUnit: JsonField<String> = JsonMissing.of()
            private var idParentEquipment: JsonField<String> = JsonMissing.of()
            private var idSite: JsonField<String> = JsonMissing.of()
            private var locReason: JsonField<String> = JsonMissing.of()
            private var milGrid: JsonField<String> = JsonMissing.of()
            private var milGridSys: JsonField<String> = JsonMissing.of()
            private var nomen: JsonField<String> = JsonMissing.of()
            private var operAreaPrimary: JsonField<String> = JsonMissing.of()
            private var operStatus: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var polSubdiv: JsonField<String> = JsonMissing.of()
            private var qtyOh: JsonField<Int> = JsonMissing.of()
            private var recStatus: JsonField<String> = JsonMissing.of()
            private var referenceDoc: JsonField<String> = JsonMissing.of()
            private var resProd: JsonField<String> = JsonMissing.of()
            private var reviewDate: JsonField<LocalDate> = JsonMissing.of()
            private var seqNum: JsonField<Int> = JsonMissing.of()
            private var srcIds: JsonField<MutableList<String>>? = null
            private var srcTyps: JsonField<MutableList<String>>? = null
            private var symCode: JsonField<String> = JsonMissing.of()
            private var utm: JsonField<String> = JsonMissing.of()
            private var wac: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                countryCode = body.countryCode
                dataMode = body.dataMode
                lat = body.lat
                lon = body.lon
                source = body.source
                id = body.id
                airDefArea = body.airDefArea
                allegiance = body.allegiance
                altAllegiance = body.altAllegiance
                altCountryCode = body.altCountryCode
                altEqpId = body.altEqpId
                classRating = body.classRating
                condition = body.condition
                conditionAvail = body.conditionAvail
                coord = body.coord
                coordDatum = body.coordDatum
                coordDerivAcc = body.coordDerivAcc
                createdAt = body.createdAt
                createdBy = body.createdBy
                elevMsl = body.elevMsl
                elevMslConfLvl = body.elevMslConfLvl
                elevMslDerivAcc = body.elevMslDerivAcc
                eqpCode = body.eqpCode
                eqpIdNum = body.eqpIdNum
                eval = body.eval
                fpa = body.fpa
                function = body.function
                functPrimary = body.functPrimary
                geoidalMslSep = body.geoidalMslSep
                ident = body.ident
                idOperatingUnit = body.idOperatingUnit
                idParentEquipment = body.idParentEquipment
                idSite = body.idSite
                locReason = body.locReason
                milGrid = body.milGrid
                milGridSys = body.milGridSys
                nomen = body.nomen
                operAreaPrimary = body.operAreaPrimary
                operStatus = body.operStatus
                origin = body.origin
                polSubdiv = body.polSubdiv
                qtyOh = body.qtyOh
                recStatus = body.recStatus
                referenceDoc = body.referenceDoc
                resProd = body.resProd
                reviewDate = body.reviewDate
                seqNum = body.seqNum
                srcIds = body.srcIds.map { it.toMutableList() }
                srcTyps = body.srcTyps.map { it.toMutableList() }
                symCode = body.symCode
                utm = body.utm
                wac = body.wac
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
             * The DoD Standard Country Code designator for the country or political entity to which
             * the equipment geographic coordinates reside. This field will be set to "OTHR" if the
             * source value does not match a UDL Country code value (ISO-3166-ALPHA-2).
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

            /**
             * WGS84 latitude of the location, in degrees. -90 to 90 degrees (negative values south
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
             * WGS84 longitude of the location, in degrees. -180 to 180 degrees (negative values
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
             * Air Defense District (ADD) or Air Defense Area (ADA) in which the geographic
             * coordinates reside.
             */
            fun airDefArea(airDefArea: String) = airDefArea(JsonField.of(airDefArea))

            /**
             * Sets [Builder.airDefArea] to an arbitrary JSON value.
             *
             * You should usually call [Builder.airDefArea] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun airDefArea(airDefArea: JsonField<String>) = apply { this.airDefArea = airDefArea }

            /**
             * The DoD Standard Country Code designator for the country or political entity to which
             * the equipment owes its allegiance. This field will be set to "OTHR" if the source
             * value does not match a UDL Country code value (ISO-3166-ALPHA-2).
             */
            fun allegiance(allegiance: String) = allegiance(JsonField.of(allegiance))

            /**
             * Sets [Builder.allegiance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allegiance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allegiance(allegiance: JsonField<String>) = apply { this.allegiance = allegiance }

            /**
             * Specifies an alternate allegiance code if the data provider code is not part of an
             * official Country Code standard such as ISO-3166 or FIPS. This field will be set to
             * the value provided by the source and should be used for all Queries specifying
             * allegiance.
             */
            fun altAllegiance(altAllegiance: String) = altAllegiance(JsonField.of(altAllegiance))

            /**
             * Sets [Builder.altAllegiance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altAllegiance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altAllegiance(altAllegiance: JsonField<String>) = apply {
                this.altAllegiance = altAllegiance
            }

            /**
             * Specifies an alternate country code if the data provider code is not part of an
             * official Country Code standard such as ISO-3166 or FIPS. This field will be set to
             * the value provided by the source and should be used for all Queries specifying a
             * Country Code.
             */
            fun altCountryCode(altCountryCode: String) =
                altCountryCode(JsonField.of(altCountryCode))

            /**
             * Sets [Builder.altCountryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altCountryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altCountryCode(altCountryCode: JsonField<String>) = apply {
                this.altCountryCode = altCountryCode
            }

            /** Unique identifier of the Equipment record from the originating system. */
            fun altEqpId(altEqpId: String) = altEqpId(JsonField.of(altEqpId))

            /**
             * Sets [Builder.altEqpId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.altEqpId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun altEqpId(altEqpId: JsonField<String>) = apply { this.altEqpId = altEqpId }

            /**
             * Indicates the importance of the equipment. Referenced, but not constrained to, the
             * following class ratings type classifications.
             *
             * 0 - Not of significant importance of the system
             *
             * 1 - Primary importance to system
             *
             * 2 - Secondary importance to system
             *
             * 3 - Tertiary importance to system
             *
             * O - Other. Explain in Remarks.
             */
            fun classRating(classRating: String) = classRating(JsonField.of(classRating))

            /**
             * Sets [Builder.classRating] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classRating] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classRating(classRating: JsonField<String>) = apply {
                this.classRating = classRating
            }

            /**
             * The physical manner of being or state of existence of the entity. A physical
             * condition that must be considered in the determining of a course of action. The
             * specific usage and enumerations contained in this field may be found in the
             * documentation provided in the referenceDoc field. If referenceDoc not provided, users
             * may consult the data provider.
             */
            fun condition(condition: String) = condition(JsonField.of(condition))

            /**
             * Sets [Builder.condition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.condition] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun condition(condition: JsonField<String>) = apply { this.condition = condition }

            /**
             * Availability of the entity relative to its condition. Indicates the reason the entity
             * is not fully operational. The specific usage and enumerations contained in this field
             * may be found in the documentation provided in the referenceDoc field. If referenceDoc
             * not provided, users may consult the data provider.
             */
            fun conditionAvail(conditionAvail: String) =
                conditionAvail(JsonField.of(conditionAvail))

            /**
             * Sets [Builder.conditionAvail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.conditionAvail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun conditionAvail(conditionAvail: JsonField<String>) = apply {
                this.conditionAvail = conditionAvail
            }

            /**
             * Indicates any of the magnitudes that serve to define the position of a point by
             * reference to a fixed figure, system of lines, etc. specified in degrees, minute, and
             * seconds.
             *
             * Pos. 1-2. Latitude Degrees [00-90]
             *
             * Pos. 3-4. Latitude Minutes [00-59]
             *
             * Pos. 5-6. Latitude Seconds [00-59]
             *
             * Pos. 7-9. Latitude Thousandths Of Seconds [000-999]
             *
             * Pos. 10. Latitude Hemisphere [NS]
             *
             * Pos. 11-13. Longitude Degrees [00-180]
             *
             * Pos. 14-15. Longitude Minutes [00-59]
             *
             * Pos. 16-17. Longitude Seconds [00-59]
             *
             * Pos. 18-20. Longitude Thousandths Of Seconds [000-999]
             *
             * Pos. 21. Longitude Hemisphere [EW]
             *
             * Pos. 1-21. Unknown Latitude and Unknown Longitude [000000000U000000000U]].
             */
            fun coord(coord: String) = coord(JsonField.of(coord))

            /**
             * Sets [Builder.coord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coord] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coord(coord: JsonField<String>) = apply { this.coord = coord }

            /**
             * A mathematical model of the earth used to calculate coordinates on a map. US Forces
             * use the World Geodetic System 1984 (WGS 84), but also use maps by allied countries
             * with local datums. The datum must be specified to ensure accuracy of coordinates. The
             * specific usage and enumerations contained in this field may be found in the
             * documentation provided in the referenceDoc field. If referenceDoc not provided, users
             * may consult the data provider.
             */
            fun coordDatum(coordDatum: String) = coordDatum(JsonField.of(coordDatum))

            /**
             * Sets [Builder.coordDatum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coordDatum] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coordDatum(coordDatum: JsonField<String>) = apply { this.coordDatum = coordDatum }

            /**
             * Indicates the plus or minus error assessed against the method used to derive the
             * coordinate.
             */
            fun coordDerivAcc(coordDerivAcc: Double) = coordDerivAcc(JsonField.of(coordDerivAcc))

            /**
             * Sets [Builder.coordDerivAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coordDerivAcc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun coordDerivAcc(coordDerivAcc: JsonField<Double>) = apply {
                this.coordDerivAcc = coordDerivAcc
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
             * Ground elevation, in meters, of the geographic coordinates referenced to (above or
             * below) Mean Sea Level (MSL) vertical datum.
             */
            fun elevMsl(elevMsl: Double) = elevMsl(JsonField.of(elevMsl))

            /**
             * Sets [Builder.elevMsl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevMsl] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevMsl(elevMsl: JsonField<Double>) = apply { this.elevMsl = elevMsl }

            /**
             * Indicates the confidence level expressed as a percent that a specific geometric
             * spatial element, ELEVATION_MSL linear accuracy, has been vertically positioned to
             * within a specified vertical accuracy. Confidence level has a range of values from 0
             * to 100, with 100 being highest level of confidence.
             */
            fun elevMslConfLvl(elevMslConfLvl: Int) = elevMslConfLvl(JsonField.of(elevMslConfLvl))

            /**
             * Sets [Builder.elevMslConfLvl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevMslConfLvl] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevMslConfLvl(elevMslConfLvl: JsonField<Int>) = apply {
                this.elevMslConfLvl = elevMslConfLvl
            }

            /**
             * Indicates the plus or minus error assessed against the method used to derive the
             * elevation, measured in meters.
             */
            fun elevMslDerivAcc(elevMslDerivAcc: Double) =
                elevMslDerivAcc(JsonField.of(elevMslDerivAcc))

            /**
             * Sets [Builder.elevMslDerivAcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.elevMslDerivAcc] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun elevMslDerivAcc(elevMslDerivAcc: JsonField<Double>) = apply {
                this.elevMslDerivAcc = elevMslDerivAcc
            }

            /**
             * Designated equipment code assigned to the item of equipment or an abbreviation record
             * type unique identifier. Users should consult the data provider for information on the
             * equipment code structure.
             */
            fun eqpCode(eqpCode: String) = eqpCode(JsonField.of(eqpCode))

            /**
             * Sets [Builder.eqpCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eqpCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eqpCode(eqpCode: JsonField<String>) = apply { this.eqpCode = eqpCode }

            /**
             * Uniquely identifies each item or group of equipment associated with a unit, facility
             * or site.
             */
            fun eqpIdNum(eqpIdNum: String) = eqpIdNum(JsonField.of(eqpIdNum))

            /**
             * Sets [Builder.eqpIdNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eqpIdNum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun eqpIdNum(eqpIdNum: JsonField<String>) = apply { this.eqpIdNum = eqpIdNum }

            /**
             * Eval represents the Intelligence Confidence Level or the Reliability/degree of
             * confidence that the analyst has assigned to the data within this record. The
             * numerical range is from 1 to 9 with 1 representing the highest confidence level.
             */
            fun eval(eval: Int) = eval(JsonField.of(eval))

            /**
             * Sets [Builder.eval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.eval] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun eval(eval: JsonField<Int>) = apply { this.eval = eval }

            /**
             * Functional Production Area (FPA) under the Shared Production Program (SPP). Producers
             * are defined per country per FPA. The specific usage and enumerations contained in
             * this field may be found in the documentation provided in the referenceDoc field. If
             * referenceDoc not provided, users may consult the data provider.
             */
            fun fpa(fpa: String) = fpa(JsonField.of(fpa))

            /**
             * Sets [Builder.fpa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fpa] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun fpa(fpa: JsonField<String>) = apply { this.fpa = fpa }

            /**
             * Indicates the function or mission of this equipment, which may or may not be engaged
             * in at any particular time. Typically refers to a unit, organization, or
             * installation/facility performing a specific function or mission such as a
             * redistribution center or naval shipyard. The specific usage and enumerations
             * contained in this field may be found in the documentation provided in the
             * referenceDoc field. If referenceDoc not provided, users may consult the data
             * provider.
             */
            fun function(function: String) = function(JsonField.of(function))

            /**
             * Sets [Builder.function] to an arbitrary JSON value.
             *
             * You should usually call [Builder.function] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun function(function: JsonField<String>) = apply { this.function = function }

            /**
             * Principal operational function being performed. The specific usage and enumerations
             * contained in this field may be found in the documentation provided in the
             * referenceDoc field. If referenceDoc not provided, users may consult the data
             * provider.
             */
            fun functPrimary(functPrimary: String) = functPrimary(JsonField.of(functPrimary))

            /**
             * Sets [Builder.functPrimary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.functPrimary] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun functPrimary(functPrimary: JsonField<String>) = apply {
                this.functPrimary = functPrimary
            }

            /**
             * The distance between Mean Sea Level and a referenced ellipsoid, measured in meters.
             */
            fun geoidalMslSep(geoidalMslSep: Double) = geoidalMslSep(JsonField.of(geoidalMslSep))

            /**
             * Sets [Builder.geoidalMslSep] to an arbitrary JSON value.
             *
             * You should usually call [Builder.geoidalMslSep] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun geoidalMslSep(geoidalMslSep: JsonField<Double>) = apply {
                this.geoidalMslSep = geoidalMslSep
            }

            /**
             * Estimated identity of the Site (ASSUMED FRIEND, FRIEND, HOSTILE, FAKER, JOKER,
             * NEUTRAL, PENDING, SUSPECT, UNKNOWN):
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
             * FAKER: Friendly track, object, or entity acting as an exercise hostile.
             *
             * JOKER: Friendly track, object, or entity acting as an exercise suspect.
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
            fun ident(ident: String) = ident(JsonField.of(ident))

            /**
             * Sets [Builder.ident] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ident] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ident(ident: JsonField<String>) = apply { this.ident = ident }

            /** Unique identifier of the operating unit associated with the equipment record. */
            fun idOperatingUnit(idOperatingUnit: String) =
                idOperatingUnit(JsonField.of(idOperatingUnit))

            /**
             * Sets [Builder.idOperatingUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOperatingUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOperatingUnit(idOperatingUnit: JsonField<String>) = apply {
                this.idOperatingUnit = idOperatingUnit
            }

            /**
             * Unique identifier of the Parent equipment record associated with this equipment
             * record.
             */
            fun idParentEquipment(idParentEquipment: String) =
                idParentEquipment(JsonField.of(idParentEquipment))

            /**
             * Sets [Builder.idParentEquipment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idParentEquipment] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idParentEquipment(idParentEquipment: JsonField<String>) = apply {
                this.idParentEquipment = idParentEquipment
            }

            /** Unique identifier of the Site Entity associated with the equipment record. */
            fun idSite(idSite: String) = idSite(JsonField.of(idSite))

            /**
             * Sets [Builder.idSite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSite] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

            /**
             * Indicates the reason that the equipment is at that location. The specific usage and
             * enumerations contained in this field may be found in the documentation provided in
             * the referenceDoc field. If referenceDoc not provided, users may consult the data
             * provider.
             */
            fun locReason(locReason: String) = locReason(JsonField.of(locReason))

            /**
             * Sets [Builder.locReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locReason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locReason(locReason: JsonField<String>) = apply { this.locReason = locReason }

            /**
             * The Military Grid Reference System is the geocoordinate standard used by NATO
             * militaries for locating points on Earth. The MGRS is derived from the Universal
             * Transverse Mercator (UTM) grid system and the Universal Polar Stereographic (UPS)
             * grid system, but uses a different labeling convention. The MGRS is used as geocode
             * for the entire Earth. Example of an milgrid coordinate, or grid reference, would be
             * 4QFJ12345678, which consists of three parts:
             *
             * 4Q (grid zone designator, GZD)
             *
             * FJ (the 100,000-meter square identifier)
             *
             * 12345678 (numerical location; easting is 1234 and northing is 5678, in this case
             * specifying a location with 10 m resolution).
             */
            fun milGrid(milGrid: String) = milGrid(JsonField.of(milGrid))

            /**
             * Sets [Builder.milGrid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milGrid] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milGrid(milGrid: JsonField<String>) = apply { this.milGrid = milGrid }

            /**
             * Indicates the grid system used in the development of the milGrid coordinates. Values
             * are:
             *
             * UPS - Universal Polar System
             *
             * UTM - Universal Transverse Mercator.
             */
            fun milGridSys(milGridSys: String) = milGridSys(JsonField.of(milGridSys))

            /**
             * Sets [Builder.milGridSys] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milGridSys] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milGridSys(milGridSys: JsonField<String>) = apply { this.milGridSys = milGridSys }

            /**
             * Generic type this specific piece of equipment belongs to, and the identifying
             * nomenclature which describes the equipment.
             */
            fun nomen(nomen: String) = nomen(JsonField.of(nomen))

            /**
             * Sets [Builder.nomen] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nomen] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nomen(nomen: JsonField<String>) = apply { this.nomen = nomen }

            /**
             * Internationally recognized water area in which the vessel is most likely to be
             * deployed or in which it normally operates most frequently.
             */
            fun operAreaPrimary(operAreaPrimary: String) =
                operAreaPrimary(JsonField.of(operAreaPrimary))

            /**
             * Sets [Builder.operAreaPrimary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operAreaPrimary] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operAreaPrimary(operAreaPrimary: JsonField<String>) = apply {
                this.operAreaPrimary = operAreaPrimary
            }

            /**
             * The Degree to which an entity is ready to perform the overall operational mission(s)
             * for which it was organized and equipped. The specific usage and enumerations
             * contained in this field may be found in the documentation provided in the
             * referenceDoc field. If referenceDoc not provided, users may consult the data
             * provider.
             */
            fun operStatus(operStatus: String) = operStatus(JsonField.of(operStatus))

            /**
             * Sets [Builder.operStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operStatus(operStatus: JsonField<String>) = apply { this.operStatus = operStatus }

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
             * Political subdivision in which the geographic coordinates reside. The specific usage
             * and enumerations contained in this field may be found in the documentation provided
             * in the referenceDoc field. If referenceDoc not provided, users may consult the data
             * provider.
             */
            fun polSubdiv(polSubdiv: String) = polSubdiv(JsonField.of(polSubdiv))

            /**
             * Sets [Builder.polSubdiv] to an arbitrary JSON value.
             *
             * You should usually call [Builder.polSubdiv] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun polSubdiv(polSubdiv: JsonField<String>) = apply { this.polSubdiv = polSubdiv }

            /**
             * Relative to the parent entity, the total number of military personnel or equipment
             * assessed to be on-hand (OH).
             */
            fun qtyOh(qtyOh: Int) = qtyOh(JsonField.of(qtyOh))

            /**
             * Sets [Builder.qtyOh] to an arbitrary JSON value.
             *
             * You should usually call [Builder.qtyOh] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun qtyOh(qtyOh: JsonField<Int>) = apply { this.qtyOh = qtyOh }

            /**
             * Validity and currency of the data in the record to be used in conjunction with the
             * other elements in the record as defined by SOPs. Referenced, but not constrained to,
             * the following record status type classifications.
             *
             * A - Active
             *
             * I - Inactive
             *
             * K - Acknowledged
             *
             * L - Local
             *
             * Q - A nominated (NOM) or Data Change Request (DCR) record
             *
             * R - Production reduced by CMD decision
             *
             * W - Working Record.
             */
            fun recStatus(recStatus: String) = recStatus(JsonField.of(recStatus))

            /**
             * Sets [Builder.recStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recStatus] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recStatus(recStatus: JsonField<String>) = apply { this.recStatus = recStatus }

            /**
             * The reference documentiation that specifies the usage and enumerations contained in
             * this record. If referenceDoc not provided, users may consult the data provider.
             */
            fun referenceDoc(referenceDoc: String) = referenceDoc(JsonField.of(referenceDoc))

            /**
             * Sets [Builder.referenceDoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceDoc] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceDoc(referenceDoc: JsonField<String>) = apply {
                this.referenceDoc = referenceDoc
            }

            /**
             * Responsible Producer - Organization that is responsible for the maintenance of the
             * record.
             */
            fun resProd(resProd: String) = resProd(JsonField.of(resProd))

            /**
             * Sets [Builder.resProd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resProd] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resProd(resProd: JsonField<String>) = apply { this.resProd = resProd }

            /**
             * Date on which the data in the record was last reviewed by the responsible analyst for
             * accuracy and currency. This date cannot be greater than the current date.
             */
            fun reviewDate(reviewDate: LocalDate) = reviewDate(JsonField.of(reviewDate))

            /**
             * Sets [Builder.reviewDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reviewDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reviewDate(reviewDate: JsonField<LocalDate>) = apply {
                this.reviewDate = reviewDate
            }

            /** Provider specific sequential number assigned to the equipment. */
            fun seqNum(seqNum: Int) = seqNum(JsonField.of(seqNum))

            /**
             * Sets [Builder.seqNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.seqNum] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun seqNum(seqNum: JsonField<Int>) = apply { this.seqNum = seqNum }

            /**
             * Array of UUID(s) of the UDL data record(s) that are related to this equipment record.
             * See the associated 'srcTyps' array for the specific types of data, positionally
             * corresponding to the UUIDs in this array. The 'srcTyps' and 'srcIds' arrays must
             * match in size. See the corresponding srcTyps array element for the data type of the
             * UUID and use the appropriate API operation to retrieve that object.
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
             * Array of UDL record types such as AIRCRAFT, VESSEL, EO, MTI that are related to this
             * equipment record. See the associated 'srcIds' array for the record UUIDs,
             * positionally corresponding to the record types in this array. The 'srcTyps' and
             * 'srcIds' arrays must match in size.
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
             * A standard scheme for symbol coding enabling the transfer, display and use of symbols
             * and graphics among information systems, as per MIL-STD 2525B, and supported by the
             * element AFFILIATION.
             */
            fun symCode(symCode: String) = symCode(JsonField.of(symCode))

            /**
             * Sets [Builder.symCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.symCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun symCode(symCode: JsonField<String>) = apply { this.symCode = symCode }

            /**
             * Universal Transverse Mercator (UTM) grid coordinates.
             *
             * Pos. 1-2, UTM Zone Column [01-60
             *
             * Pos. 3, UTM Zone Row [C-HJ-NP-X]
             *
             * Pos. 4, UTM False Easting [0-9]
             *
             * Pos. 5-9, UTM Meter Easting [0-9][0-9][0-9][0-9][0-9]
             *
             * Pos. 10-11, UTM False Northing [0-9][0-9]
             *
             * Pos. 12-16, UTM Meter Northing [0-9][0-9][0-9][0-9][0-9].
             */
            fun utm(utm: String) = utm(JsonField.of(utm))

            /**
             * Sets [Builder.utm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.utm] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun utm(utm: JsonField<String>) = apply { this.utm = utm }

            /**
             * World Aeronautical Chart identifier for the area in which a designated place is
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
             * .countryCode()
             * .dataMode()
             * .lat()
             * .lon()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("countryCode", countryCode),
                    checkRequired("dataMode", dataMode),
                    checkRequired("lat", lat),
                    checkRequired("lon", lon),
                    checkRequired("source", source),
                    id,
                    airDefArea,
                    allegiance,
                    altAllegiance,
                    altCountryCode,
                    altEqpId,
                    classRating,
                    condition,
                    conditionAvail,
                    coord,
                    coordDatum,
                    coordDerivAcc,
                    createdAt,
                    createdBy,
                    elevMsl,
                    elevMslConfLvl,
                    elevMslDerivAcc,
                    eqpCode,
                    eqpIdNum,
                    eval,
                    fpa,
                    function,
                    functPrimary,
                    geoidalMslSep,
                    ident,
                    idOperatingUnit,
                    idParentEquipment,
                    idSite,
                    locReason,
                    milGrid,
                    milGridSys,
                    nomen,
                    operAreaPrimary,
                    operStatus,
                    origin,
                    polSubdiv,
                    qtyOh,
                    recStatus,
                    referenceDoc,
                    resProd,
                    reviewDate,
                    seqNum,
                    (srcIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (srcTyps ?: JsonMissing.of()).map { it.toImmutable() },
                    symCode,
                    utm,
                    wac,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            countryCode()
            dataMode().validate()
            lat()
            lon()
            source()
            id()
            airDefArea()
            allegiance()
            altAllegiance()
            altCountryCode()
            altEqpId()
            classRating()
            condition()
            conditionAvail()
            coord()
            coordDatum()
            coordDerivAcc()
            createdAt()
            createdBy()
            elevMsl()
            elevMslConfLvl()
            elevMslDerivAcc()
            eqpCode()
            eqpIdNum()
            eval()
            fpa()
            function()
            functPrimary()
            geoidalMslSep()
            ident()
            idOperatingUnit()
            idParentEquipment()
            idSite()
            locReason()
            milGrid()
            milGridSys()
            nomen()
            operAreaPrimary()
            operStatus()
            origin()
            polSubdiv()
            qtyOh()
            recStatus()
            referenceDoc()
            resProd()
            reviewDate()
            seqNum()
            srcIds()
            srcTyps()
            symCode()
            utm()
            wac()
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
                (if (countryCode.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (lon.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (airDefArea.asKnown().isPresent) 1 else 0) +
                (if (allegiance.asKnown().isPresent) 1 else 0) +
                (if (altAllegiance.asKnown().isPresent) 1 else 0) +
                (if (altCountryCode.asKnown().isPresent) 1 else 0) +
                (if (altEqpId.asKnown().isPresent) 1 else 0) +
                (if (classRating.asKnown().isPresent) 1 else 0) +
                (if (condition.asKnown().isPresent) 1 else 0) +
                (if (conditionAvail.asKnown().isPresent) 1 else 0) +
                (if (coord.asKnown().isPresent) 1 else 0) +
                (if (coordDatum.asKnown().isPresent) 1 else 0) +
                (if (coordDerivAcc.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (elevMsl.asKnown().isPresent) 1 else 0) +
                (if (elevMslConfLvl.asKnown().isPresent) 1 else 0) +
                (if (elevMslDerivAcc.asKnown().isPresent) 1 else 0) +
                (if (eqpCode.asKnown().isPresent) 1 else 0) +
                (if (eqpIdNum.asKnown().isPresent) 1 else 0) +
                (if (eval.asKnown().isPresent) 1 else 0) +
                (if (fpa.asKnown().isPresent) 1 else 0) +
                (if (function.asKnown().isPresent) 1 else 0) +
                (if (functPrimary.asKnown().isPresent) 1 else 0) +
                (if (geoidalMslSep.asKnown().isPresent) 1 else 0) +
                (if (ident.asKnown().isPresent) 1 else 0) +
                (if (idOperatingUnit.asKnown().isPresent) 1 else 0) +
                (if (idParentEquipment.asKnown().isPresent) 1 else 0) +
                (if (idSite.asKnown().isPresent) 1 else 0) +
                (if (locReason.asKnown().isPresent) 1 else 0) +
                (if (milGrid.asKnown().isPresent) 1 else 0) +
                (if (milGridSys.asKnown().isPresent) 1 else 0) +
                (if (nomen.asKnown().isPresent) 1 else 0) +
                (if (operAreaPrimary.asKnown().isPresent) 1 else 0) +
                (if (operStatus.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (polSubdiv.asKnown().isPresent) 1 else 0) +
                (if (qtyOh.asKnown().isPresent) 1 else 0) +
                (if (recStatus.asKnown().isPresent) 1 else 0) +
                (if (referenceDoc.asKnown().isPresent) 1 else 0) +
                (if (resProd.asKnown().isPresent) 1 else 0) +
                (if (reviewDate.asKnown().isPresent) 1 else 0) +
                (if (seqNum.asKnown().isPresent) 1 else 0) +
                (srcIds.asKnown().getOrNull()?.size ?: 0) +
                (srcTyps.asKnown().getOrNull()?.size ?: 0) +
                (if (symCode.asKnown().isPresent) 1 else 0) +
                (if (utm.asKnown().isPresent) 1 else 0) +
                (if (wac.asKnown().isPresent) 1 else 0)

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
                countryCode == other.countryCode &&
                dataMode == other.dataMode &&
                lat == other.lat &&
                lon == other.lon &&
                source == other.source &&
                id == other.id &&
                airDefArea == other.airDefArea &&
                allegiance == other.allegiance &&
                altAllegiance == other.altAllegiance &&
                altCountryCode == other.altCountryCode &&
                altEqpId == other.altEqpId &&
                classRating == other.classRating &&
                condition == other.condition &&
                conditionAvail == other.conditionAvail &&
                coord == other.coord &&
                coordDatum == other.coordDatum &&
                coordDerivAcc == other.coordDerivAcc &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                elevMsl == other.elevMsl &&
                elevMslConfLvl == other.elevMslConfLvl &&
                elevMslDerivAcc == other.elevMslDerivAcc &&
                eqpCode == other.eqpCode &&
                eqpIdNum == other.eqpIdNum &&
                eval == other.eval &&
                fpa == other.fpa &&
                function == other.function &&
                functPrimary == other.functPrimary &&
                geoidalMslSep == other.geoidalMslSep &&
                ident == other.ident &&
                idOperatingUnit == other.idOperatingUnit &&
                idParentEquipment == other.idParentEquipment &&
                idSite == other.idSite &&
                locReason == other.locReason &&
                milGrid == other.milGrid &&
                milGridSys == other.milGridSys &&
                nomen == other.nomen &&
                operAreaPrimary == other.operAreaPrimary &&
                operStatus == other.operStatus &&
                origin == other.origin &&
                polSubdiv == other.polSubdiv &&
                qtyOh == other.qtyOh &&
                recStatus == other.recStatus &&
                referenceDoc == other.referenceDoc &&
                resProd == other.resProd &&
                reviewDate == other.reviewDate &&
                seqNum == other.seqNum &&
                srcIds == other.srcIds &&
                srcTyps == other.srcTyps &&
                symCode == other.symCode &&
                utm == other.utm &&
                wac == other.wac &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                countryCode,
                dataMode,
                lat,
                lon,
                source,
                id,
                airDefArea,
                allegiance,
                altAllegiance,
                altCountryCode,
                altEqpId,
                classRating,
                condition,
                conditionAvail,
                coord,
                coordDatum,
                coordDerivAcc,
                createdAt,
                createdBy,
                elevMsl,
                elevMslConfLvl,
                elevMslDerivAcc,
                eqpCode,
                eqpIdNum,
                eval,
                fpa,
                function,
                functPrimary,
                geoidalMslSep,
                ident,
                idOperatingUnit,
                idParentEquipment,
                idSite,
                locReason,
                milGrid,
                milGridSys,
                nomen,
                operAreaPrimary,
                operStatus,
                origin,
                polSubdiv,
                qtyOh,
                recStatus,
                referenceDoc,
                resProd,
                reviewDate,
                seqNum,
                srcIds,
                srcTyps,
                symCode,
                utm,
                wac,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, countryCode=$countryCode, dataMode=$dataMode, lat=$lat, lon=$lon, source=$source, id=$id, airDefArea=$airDefArea, allegiance=$allegiance, altAllegiance=$altAllegiance, altCountryCode=$altCountryCode, altEqpId=$altEqpId, classRating=$classRating, condition=$condition, conditionAvail=$conditionAvail, coord=$coord, coordDatum=$coordDatum, coordDerivAcc=$coordDerivAcc, createdAt=$createdAt, createdBy=$createdBy, elevMsl=$elevMsl, elevMslConfLvl=$elevMslConfLvl, elevMslDerivAcc=$elevMslDerivAcc, eqpCode=$eqpCode, eqpIdNum=$eqpIdNum, eval=$eval, fpa=$fpa, function=$function, functPrimary=$functPrimary, geoidalMslSep=$geoidalMslSep, ident=$ident, idOperatingUnit=$idOperatingUnit, idParentEquipment=$idParentEquipment, idSite=$idSite, locReason=$locReason, milGrid=$milGrid, milGridSys=$milGridSys, nomen=$nomen, operAreaPrimary=$operAreaPrimary, operStatus=$operStatus, origin=$origin, polSubdiv=$polSubdiv, qtyOh=$qtyOh, recStatus=$recStatus, referenceDoc=$referenceDoc, resProd=$resProd, reviewDate=$reviewDate, seqNum=$seqNum, srcIds=$srcIds, srcTyps=$srcTyps, symCode=$symCode, utm=$utm, wac=$wac, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EquipmentCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EquipmentCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

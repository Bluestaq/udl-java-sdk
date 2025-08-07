// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.onorbit

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Model object representing on-orbit objects or satellites in the system. */
class OnorbitListResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val satNo: JsonField<Int>,
    private val source: JsonField<String>,
    private val altName: JsonField<String>,
    private val category: JsonField<Category>,
    private val commonName: JsonField<String>,
    private val constellation: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val decayDate: JsonField<OffsetDateTime>,
    private val idOnOrbit: JsonField<String>,
    private val intlDes: JsonField<String>,
    private val launchDate: JsonField<LocalDate>,
    private val launchSiteId: JsonField<String>,
    private val lifetimeYears: JsonField<Int>,
    private val missionNumber: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altName") @ExcludeMissing altName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("commonName")
        @ExcludeMissing
        commonName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("constellation")
        @ExcludeMissing
        constellation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decayDate")
        @ExcludeMissing
        decayDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intlDes") @ExcludeMissing intlDes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchDate")
        @ExcludeMissing
        launchDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("launchSiteId")
        @ExcludeMissing
        launchSiteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lifetimeYears")
        @ExcludeMissing
        lifetimeYears: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("missionNumber")
        @ExcludeMissing
        missionNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType")
        @ExcludeMissing
        objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        satNo,
        source,
        altName,
        category,
        commonName,
        constellation,
        countryCode,
        createdAt,
        createdBy,
        decayDate,
        idOnOrbit,
        intlDes,
        launchDate,
        launchSiteId,
        lifetimeYears,
        missionNumber,
        objectType,
        origin,
        origNetwork,
        mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

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
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Satellite/Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun satNo(): Int = satNo.getRequired("satNo")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Alternate name of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altName(): Optional<String> = altName.getOptional("altName")

    /**
     * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State, Launch
     * Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric, Interplanetary,
     * Lagrangian, Docked).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun category(): Optional<Category> = category.getOptional("category")

    /**
     * Common name of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun commonName(): Optional<String> = commonName.getOptional("commonName")

    /**
     * Constellation to which this satellite belongs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun constellation(): Optional<String> = constellation.getOptional("constellation")

    /**
     * The country code. This value is typically the ISO 3166 Alpha-2 two-character country code,
     * however it can also represent various consortiums that do not appear in the ISO document. The
     * code must correspond to an existing country in the UDL’s country API. Call udl/country/{code}
     * to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for
     * the specified country code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Date of decay.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decayDate(): Optional<OffsetDateTime> = decayDate.getOptional("decayDate")

    /**
     * For the public catalog, the idOnOrbit is typically the satellite number as a string, but may
     * be a UUID for analyst or other unknown or untracked satellites, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * International Designator, typically of the format YYYYLLLAAA, where YYYY is the launch year,
     * LLL is the sequential launch number of that year, and AAA is an optional launch piece
     * designator for the launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun intlDes(): Optional<String> = intlDes.getOptional("intlDes")

    /**
     * Date of launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchDate(): Optional<LocalDate> = launchDate.getOptional("launchDate")

    /**
     * Id of the associated launchSite entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchSiteId(): Optional<String> = launchSiteId.getOptional("launchSiteId")

    /**
     * Estimated lifetime of the on-orbit payload, if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lifetimeYears(): Optional<Int> = lifetimeYears.getOptional("lifetimeYears")

    /**
     * Mission number of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

    /**
     * Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objectType(): Optional<ObjectType> = objectType.getOptional("objectType")

    /**
     * Originating system or organization which produced the data, if different from the source. The
     * origin may be different than the source if the source was a mediating system which forwarded
     * the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the
     * system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected
     * type.
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
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [altName].
     *
     * Unlike [altName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altName") @ExcludeMissing fun _altName(): JsonField<String> = altName

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [commonName].
     *
     * Unlike [commonName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commonName") @ExcludeMissing fun _commonName(): JsonField<String> = commonName

    /**
     * Returns the raw JSON value of [constellation].
     *
     * Unlike [constellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("constellation")
    @ExcludeMissing
    fun _constellation(): JsonField<String> = constellation

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

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
     * Returns the raw JSON value of [decayDate].
     *
     * Unlike [decayDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decayDate")
    @ExcludeMissing
    fun _decayDate(): JsonField<OffsetDateTime> = decayDate

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [intlDes].
     *
     * Unlike [intlDes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intlDes") @ExcludeMissing fun _intlDes(): JsonField<String> = intlDes

    /**
     * Returns the raw JSON value of [launchDate].
     *
     * Unlike [launchDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchDate") @ExcludeMissing fun _launchDate(): JsonField<LocalDate> = launchDate

    /**
     * Returns the raw JSON value of [launchSiteId].
     *
     * Unlike [launchSiteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchSiteId")
    @ExcludeMissing
    fun _launchSiteId(): JsonField<String> = launchSiteId

    /**
     * Returns the raw JSON value of [lifetimeYears].
     *
     * Unlike [lifetimeYears], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lifetimeYears")
    @ExcludeMissing
    fun _lifetimeYears(): JsonField<Int> = lifetimeYears

    /**
     * Returns the raw JSON value of [missionNumber].
     *
     * Unlike [missionNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("missionNumber")
    @ExcludeMissing
    fun _missionNumber(): JsonField<String> = missionNumber

    /**
     * Returns the raw JSON value of [objectType].
     *
     * Unlike [objectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objectType")
    @ExcludeMissing
    fun _objectType(): JsonField<ObjectType> = objectType

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
    @JsonProperty("origNetwork") @ExcludeMissing fun _origNetwork(): JsonField<String> = origNetwork

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
         * Returns a mutable builder for constructing an instance of [OnorbitListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .satNo()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnorbitListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var satNo: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var altName: JsonField<String> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var commonName: JsonField<String> = JsonMissing.of()
        private var constellation: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var decayDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var intlDes: JsonField<String> = JsonMissing.of()
        private var launchDate: JsonField<LocalDate> = JsonMissing.of()
        private var launchSiteId: JsonField<String> = JsonMissing.of()
        private var lifetimeYears: JsonField<Int> = JsonMissing.of()
        private var missionNumber: JsonField<String> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onorbitListResponse: OnorbitListResponse) = apply {
            classificationMarking = onorbitListResponse.classificationMarking
            dataMode = onorbitListResponse.dataMode
            satNo = onorbitListResponse.satNo
            source = onorbitListResponse.source
            altName = onorbitListResponse.altName
            category = onorbitListResponse.category
            commonName = onorbitListResponse.commonName
            constellation = onorbitListResponse.constellation
            countryCode = onorbitListResponse.countryCode
            createdAt = onorbitListResponse.createdAt
            createdBy = onorbitListResponse.createdBy
            decayDate = onorbitListResponse.decayDate
            idOnOrbit = onorbitListResponse.idOnOrbit
            intlDes = onorbitListResponse.intlDes
            launchDate = onorbitListResponse.launchDate
            launchSiteId = onorbitListResponse.launchSiteId
            lifetimeYears = onorbitListResponse.lifetimeYears
            missionNumber = onorbitListResponse.missionNumber
            objectType = onorbitListResponse.objectType
            origin = onorbitListResponse.origin
            origNetwork = onorbitListResponse.origNetwork
            additionalProperties = onorbitListResponse.additionalProperties.toMutableMap()
        }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) =
            classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) = apply {
            this.classificationMarking = classificationMarking
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
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

        /** Satellite/Catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Alternate name of the on-orbit object. */
        fun altName(altName: String) = altName(JsonField.of(altName))

        /**
         * Sets [Builder.altName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altName(altName: JsonField<String>) = apply { this.altName = altName }

        /**
         * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State,
         * Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric,
         * Interplanetary, Lagrangian, Docked).
         */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Common name of the on-orbit object. */
        fun commonName(commonName: String) = commonName(JsonField.of(commonName))

        /**
         * Sets [Builder.commonName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commonName(commonName: JsonField<String>) = apply { this.commonName = commonName }

        /** Constellation to which this satellite belongs. */
        fun constellation(constellation: String) = constellation(JsonField.of(constellation))

        /**
         * Sets [Builder.constellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.constellation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun constellation(constellation: JsonField<String>) = apply {
            this.constellation = constellation
        }

        /**
         * The country code. This value is typically the ISO 3166 Alpha-2 two-character country
         * code, however it can also represent various consortiums that do not appear in the ISO
         * document. The code must correspond to an existing country in the UDL’s country API. Call
         * udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code
         * values that exist for the specified country code.
         */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** Date of decay. */
        fun decayDate(decayDate: OffsetDateTime) = decayDate(JsonField.of(decayDate))

        /**
         * Sets [Builder.decayDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decayDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decayDate(decayDate: JsonField<OffsetDateTime>) = apply { this.decayDate = decayDate }

        /**
         * For the public catalog, the idOnOrbit is typically the satellite number as a string, but
         * may be a UUID for analyst or other unknown or untracked satellites, auto-generated by the
         * system.
         */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /**
         * International Designator, typically of the format YYYYLLLAAA, where YYYY is the launch
         * year, LLL is the sequential launch number of that year, and AAA is an optional launch
         * piece designator for the launch.
         */
        fun intlDes(intlDes: String) = intlDes(JsonField.of(intlDes))

        /**
         * Sets [Builder.intlDes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intlDes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun intlDes(intlDes: JsonField<String>) = apply { this.intlDes = intlDes }

        /** Date of launch. */
        fun launchDate(launchDate: LocalDate) = launchDate(JsonField.of(launchDate))

        /**
         * Sets [Builder.launchDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchDate(launchDate: JsonField<LocalDate>) = apply { this.launchDate = launchDate }

        /** Id of the associated launchSite entity. */
        fun launchSiteId(launchSiteId: String) = launchSiteId(JsonField.of(launchSiteId))

        /**
         * Sets [Builder.launchSiteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchSiteId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchSiteId(launchSiteId: JsonField<String>) = apply {
            this.launchSiteId = launchSiteId
        }

        /** Estimated lifetime of the on-orbit payload, if known. */
        fun lifetimeYears(lifetimeYears: Int) = lifetimeYears(JsonField.of(lifetimeYears))

        /**
         * Sets [Builder.lifetimeYears] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifetimeYears] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lifetimeYears(lifetimeYears: JsonField<Int>) = apply {
            this.lifetimeYears = lifetimeYears
        }

        /** Mission number of the on-orbit object. */
        fun missionNumber(missionNumber: String) = missionNumber(JsonField.of(missionNumber))

        /**
         * Sets [Builder.missionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun missionNumber(missionNumber: JsonField<String>) = apply {
            this.missionNumber = missionNumber
        }

        /** Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN. */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [ObjectType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<ObjectType>) = apply { this.objectType = objectType }

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origin(origin: JsonField<String>) = apply { this.origin = origin }

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origNetwork(origNetwork: JsonField<String>) = apply { this.origNetwork = origNetwork }

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
         * Returns an immutable instance of [OnorbitListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .satNo()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnorbitListResponse =
            OnorbitListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("satNo", satNo),
                checkRequired("source", source),
                altName,
                category,
                commonName,
                constellation,
                countryCode,
                createdAt,
                createdBy,
                decayDate,
                idOnOrbit,
                intlDes,
                launchDate,
                launchSiteId,
                lifetimeYears,
                missionNumber,
                objectType,
                origin,
                origNetwork,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OnorbitListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        satNo()
        source()
        altName()
        category().ifPresent { it.validate() }
        commonName()
        constellation()
        countryCode()
        createdAt()
        createdBy()
        decayDate()
        idOnOrbit()
        intlDes()
        launchDate()
        launchSiteId()
        lifetimeYears()
        missionNumber()
        objectType().ifPresent { it.validate() }
        origin()
        origNetwork()
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
    internal fun validity(): Int =
        (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (altName.asKnown().isPresent) 1 else 0) +
            (category.asKnown().getOrNull()?.validity() ?: 0) +
            (if (commonName.asKnown().isPresent) 1 else 0) +
            (if (constellation.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (decayDate.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (intlDes.asKnown().isPresent) 1 else 0) +
            (if (launchDate.asKnown().isPresent) 1 else 0) +
            (if (launchSiteId.asKnown().isPresent) 1 else 0) +
            (if (lifetimeYears.asKnown().isPresent) 1 else 0) +
            (if (missionNumber.asKnown().isPresent) 1 else 0) +
            (objectType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0)

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
    class DataMode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
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

    /**
     * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State, Launch
     * Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric, Interplanetary,
     * Lagrangian, Docked).
     */
    class Category @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val UNKNOWN = of("Unknown")

            @JvmField val ON_ORBIT = of("On-Orbit")

            @JvmField val DECAYED = of("Decayed")

            @JvmField val CATALOGED_WITHOUT_STATE = of("Cataloged Without State")

            @JvmField val LAUNCH_NOMINAL = of("Launch Nominal")

            @JvmField val ANALYST_SATELLITE = of("Analyst Satellite")

            @JvmField val CISLUNAR = of("Cislunar")

            @JvmField val LUNAR = of("Lunar")

            @JvmField val HYPERBOLIC = of("Hyperbolic")

            @JvmField val HELIOCENTRIC = of("Heliocentric")

            @JvmField val INTERPLANETARY = of("Interplanetary")

            @JvmField val LAGRANGIAN = of("Lagrangian")

            @JvmField val DOCKED = of("Docked")

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        /** An enum containing [Category]'s known values. */
        enum class Known {
            UNKNOWN,
            ON_ORBIT,
            DECAYED,
            CATALOGED_WITHOUT_STATE,
            LAUNCH_NOMINAL,
            ANALYST_SATELLITE,
            CISLUNAR,
            LUNAR,
            HYPERBOLIC,
            HELIOCENTRIC,
            INTERPLANETARY,
            LAGRANGIAN,
            DOCKED,
        }

        /**
         * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Category] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNKNOWN,
            ON_ORBIT,
            DECAYED,
            CATALOGED_WITHOUT_STATE,
            LAUNCH_NOMINAL,
            ANALYST_SATELLITE,
            CISLUNAR,
            LUNAR,
            HYPERBOLIC,
            HELIOCENTRIC,
            INTERPLANETARY,
            LAGRANGIAN,
            DOCKED,
            /** An enum member indicating that [Category] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                UNKNOWN -> Value.UNKNOWN
                ON_ORBIT -> Value.ON_ORBIT
                DECAYED -> Value.DECAYED
                CATALOGED_WITHOUT_STATE -> Value.CATALOGED_WITHOUT_STATE
                LAUNCH_NOMINAL -> Value.LAUNCH_NOMINAL
                ANALYST_SATELLITE -> Value.ANALYST_SATELLITE
                CISLUNAR -> Value.CISLUNAR
                LUNAR -> Value.LUNAR
                HYPERBOLIC -> Value.HYPERBOLIC
                HELIOCENTRIC -> Value.HELIOCENTRIC
                INTERPLANETARY -> Value.INTERPLANETARY
                LAGRANGIAN -> Value.LAGRANGIAN
                DOCKED -> Value.DOCKED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                UNKNOWN -> Known.UNKNOWN
                ON_ORBIT -> Known.ON_ORBIT
                DECAYED -> Known.DECAYED
                CATALOGED_WITHOUT_STATE -> Known.CATALOGED_WITHOUT_STATE
                LAUNCH_NOMINAL -> Known.LAUNCH_NOMINAL
                ANALYST_SATELLITE -> Known.ANALYST_SATELLITE
                CISLUNAR -> Known.CISLUNAR
                LUNAR -> Known.LUNAR
                HYPERBOLIC -> Known.HYPERBOLIC
                HELIOCENTRIC -> Known.HELIOCENTRIC
                INTERPLANETARY -> Known.INTERPLANETARY
                LAGRANGIAN -> Known.LAGRANGIAN
                DOCKED -> Known.DOCKED
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Category: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Category = apply {
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

            return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN. */
    class ObjectType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ROCKET_BODY = of("ROCKET BODY")

            @JvmField val DEBRIS = of("DEBRIS")

            @JvmField val PAYLOAD = of("PAYLOAD")

            @JvmField val PLATFORM = of("PLATFORM")

            @JvmField val MANNED = of("MANNED")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ObjectType(JsonField.of(value))
        }

        /** An enum containing [ObjectType]'s known values. */
        enum class Known {
            ROCKET_BODY,
            DEBRIS,
            PAYLOAD,
            PLATFORM,
            MANNED,
            UNKNOWN,
        }

        /**
         * An enum containing [ObjectType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjectType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROCKET_BODY,
            DEBRIS,
            PAYLOAD,
            PLATFORM,
            MANNED,
            UNKNOWN,
            /**
             * An enum member indicating that [ObjectType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ROCKET_BODY -> Value.ROCKET_BODY
                DEBRIS -> Value.DEBRIS
                PAYLOAD -> Value.PAYLOAD
                PLATFORM -> Value.PLATFORM
                MANNED -> Value.MANNED
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ROCKET_BODY -> Known.ROCKET_BODY
                DEBRIS -> Known.DEBRIS
                PAYLOAD -> Known.PAYLOAD
                PLATFORM -> Known.PLATFORM
                MANNED -> Known.MANNED
                UNKNOWN -> Known.UNKNOWN
                else -> throw UnifieddatalibraryInvalidDataException("Unknown ObjectType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not
         *   have the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                UnifieddatalibraryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): ObjectType = apply {
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

            return /* spotless:off */ other is ObjectType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OnorbitListResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && satNo == other.satNo && source == other.source && altName == other.altName && category == other.category && commonName == other.commonName && constellation == other.constellation && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && decayDate == other.decayDate && idOnOrbit == other.idOnOrbit && intlDes == other.intlDes && launchDate == other.launchDate && launchSiteId == other.launchSiteId && lifetimeYears == other.lifetimeYears && missionNumber == other.missionNumber && objectType == other.objectType && origin == other.origin && origNetwork == other.origNetwork && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, satNo, source, altName, category, commonName, constellation, countryCode, createdAt, createdBy, decayDate, idOnOrbit, intlDes, launchDate, launchSiteId, lifetimeYears, missionNumber, objectType, origin, origNetwork, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnorbitListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, satNo=$satNo, source=$source, altName=$altName, category=$category, commonName=$commonName, constellation=$constellation, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, decayDate=$decayDate, idOnOrbit=$idOnOrbit, intlDes=$intlDes, launchDate=$launchDate, launchSiteId=$launchSiteId, lifetimeYears=$lifetimeYears, missionNumber=$missionNumber, objectType=$objectType, origin=$origin, origNetwork=$origNetwork, additionalProperties=$additionalProperties}"
}

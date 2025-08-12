// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.unifieddatalibrary.api.core.Enum
import com.unifieddatalibrary.api.core.ExcludeMissing
import com.unifieddatalibrary.api.core.JsonField
import com.unifieddatalibrary.api.core.JsonMissing
import com.unifieddatalibrary.api.core.JsonValue
import com.unifieddatalibrary.api.core.checkKnown
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.core.toImmutable
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import com.unifieddatalibrary.api.models.LocationFull
import com.unifieddatalibrary.api.models.OnorbitAntennaFull
import com.unifieddatalibrary.api.models.OnorbitBatteryFull
import com.unifieddatalibrary.api.models.OnorbitDetailsFull
import com.unifieddatalibrary.api.models.OnorbitFull
import com.unifieddatalibrary.api.models.OnorbitSolarArrayFull
import com.unifieddatalibrary.api.models.OnorbitThrusterFull
import com.unifieddatalibrary.api.models.OperatingunitFull
import com.unifieddatalibrary.api.models.RfBandFull
import com.unifieddatalibrary.api.models.StatusFull
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Model object representing on-orbit objects or satellites in the system. */
class OnorbitFull private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val satNo: JsonField<Int>,
    private val source: JsonField<String>,
    private val altName: JsonField<String>,
    private val antennas: JsonField<List<OnorbitAntennaFull>>,
    private val batteries: JsonField<List<OnorbitBatteryFull>>,
    private val category: JsonField<Category>,
    private val commonName: JsonField<String>,
    private val constellation: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val decayDate: JsonField<OffsetDateTime>,
    private val entityCollection: JsonField<List<EntityCollection>>,
    private val idOnOrbit: JsonField<String>,
    private val intlDes: JsonField<String>,
    private val launchDate: JsonField<LocalDate>,
    private val launchSiteId: JsonField<String>,
    private val lifetimeYears: JsonField<Int>,
    private val missionNumber: JsonField<String>,
    private val objectType: JsonField<ObjectType>,
    private val onorbitDetails: JsonField<List<OnorbitDetailsFull>>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val solarArrays: JsonField<List<OnorbitSolarArrayFull>>,
    private val thrusters: JsonField<List<OnorbitThrusterFull>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altName") @ExcludeMissing altName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("antennas") @ExcludeMissing antennas: JsonField<List<OnorbitAntennaFull>> = JsonMissing.of(),
        @JsonProperty("batteries") @ExcludeMissing batteries: JsonField<List<OnorbitBatteryFull>> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("commonName") @ExcludeMissing commonName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("constellation") @ExcludeMissing constellation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("countryCode") @ExcludeMissing countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decayDate") @ExcludeMissing decayDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entityCollection") @ExcludeMissing entityCollection: JsonField<List<EntityCollection>> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intlDes") @ExcludeMissing intlDes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchDate") @ExcludeMissing launchDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("launchSiteId") @ExcludeMissing launchSiteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lifetimeYears") @ExcludeMissing lifetimeYears: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("missionNumber") @ExcludeMissing missionNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objectType") @ExcludeMissing objectType: JsonField<ObjectType> = JsonMissing.of(),
        @JsonProperty("onorbitDetails") @ExcludeMissing onorbitDetails: JsonField<List<OnorbitDetailsFull>> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("solarArrays") @ExcludeMissing solarArrays: JsonField<List<OnorbitSolarArrayFull>> = JsonMissing.of(),
        @JsonProperty("thrusters") @ExcludeMissing thrusters: JsonField<List<OnorbitThrusterFull>> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of()
    ) : this(
      classificationMarking,
      dataMode,
      satNo,
      source,
      altName,
      antennas,
      batteries,
      category,
      commonName,
      constellation,
      countryCode,
      createdAt,
      createdBy,
      decayDate,
      entityCollection,
      idOnOrbit,
      intlDes,
      launchDate,
      launchSiteId,
      lifetimeYears,
      missionNumber,
      objectType,
      onorbitDetails,
      origin,
      origNetwork,
      solarArrays,
      thrusters,
      updatedAt,
      updatedBy,
      mutableMapOf(),
    )

    /**
     * Classification marking of the data in IC/CAPCO Portion-marked format.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataMode(): DataMode = dataMode.getRequired("dataMode")

    /**
     * Satellite/Catalog number of the target on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun satNo(): Int = satNo.getRequired("satNo")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Alternate name of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun altName(): Optional<String> = altName.getOptional("altName")

    /**
     * Read-only collection of antennas on this on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun antennas(): Optional<List<OnorbitAntennaFull>> = antennas.getOptional("antennas")

    /**
     * Read-only collection of batteries on this on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun batteries(): Optional<List<OnorbitBatteryFull>> = batteries.getOptional("batteries")

    /**
     * Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State, Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric, Interplanetary, Lagrangian, Docked).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun category(): Optional<Category> = category.getOptional("category")

    /**
     * Common name of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun commonName(): Optional<String> = commonName.getOptional("commonName")

    /**
     * Constellation to which this satellite belongs.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun constellation(): Optional<String> = constellation.getOptional("constellation")

    /**
     * The country code. This value is typically the ISO 3166 Alpha-2 two-character country code, however it can also represent various consortiums that do not appear in the ISO document. The code must correspond to an existing country in the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified country code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

    /**
     * Time the row was created in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Date of decay.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun decayDate(): Optional<OffsetDateTime> = decayDate.getOptional("decayDate")

    /**
     * Read-only entity details (only returned/used on detail queries).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun entityCollection(): Optional<List<EntityCollection>> = entityCollection.getOptional("entityCollection")

    /**
     * For the public catalog, the idOnOrbit is typically the satellite number as a string, but may be a UUID for analyst or other unknown or untracked satellites, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * International Designator, typically of the format YYYYLLLAAA, where YYYY is the launch year, LLL is the sequential launch number of that year, and AAA is an optional launch piece designator for the launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun intlDes(): Optional<String> = intlDes.getOptional("intlDes")

    /**
     * Date of launch.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun launchDate(): Optional<LocalDate> = launchDate.getOptional("launchDate")

    /**
     * Id of the associated launchSite entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun launchSiteId(): Optional<String> = launchSiteId.getOptional("launchSiteId")

    /**
     * Estimated lifetime of the on-orbit payload, if known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun lifetimeYears(): Optional<Int> = lifetimeYears.getOptional("lifetimeYears")

    /**
     * Mission number of the on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun missionNumber(): Optional<String> = missionNumber.getOptional("missionNumber")

    /**
     * Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun objectType(): Optional<ObjectType> = objectType.getOptional("objectType")

    /**
     * Read-only collection of details for this on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun onorbitDetails(): Optional<List<OnorbitDetailsFull>> = onorbitDetails.getOptional("onorbitDetails")

    /**
     * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origin(): Optional<String> = origin.getOptional("origin")

    /**
     * The originating source network on which this record was created, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

    /**
     * Read-only collection of solar arrays on this on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun solarArrays(): Optional<List<OnorbitSolarArrayFull>> = solarArrays.getOptional("solarArrays")

    /**
     * Read-only collection of thrusters (engines) on this on-orbit object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun thrusters(): Optional<List<OnorbitThrusterFull>> = thrusters.getOptional("thrusters")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * Returns the raw JSON value of [classificationMarking].
     *
     * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classificationMarking")
    @ExcludeMissing
    fun _classificationMarking(): JsonField<String> = classificationMarking

    /**
     * Returns the raw JSON value of [dataMode].
     *
     * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataMode")
    @ExcludeMissing
    fun _dataMode(): JsonField<DataMode> = dataMode

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo")
    @ExcludeMissing
    fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [altName].
     *
     * Unlike [altName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altName")
    @ExcludeMissing
    fun _altName(): JsonField<String> = altName

    /**
     * Returns the raw JSON value of [antennas].
     *
     * Unlike [antennas], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("antennas")
    @ExcludeMissing
    fun _antennas(): JsonField<List<OnorbitAntennaFull>> = antennas

    /**
     * Returns the raw JSON value of [batteries].
     *
     * Unlike [batteries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("batteries")
    @ExcludeMissing
    fun _batteries(): JsonField<List<OnorbitBatteryFull>> = batteries

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category")
    @ExcludeMissing
    fun _category(): JsonField<Category> = category

    /**
     * Returns the raw JSON value of [commonName].
     *
     * Unlike [commonName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commonName")
    @ExcludeMissing
    fun _commonName(): JsonField<String> = commonName

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
    @JsonProperty("createdBy")
    @ExcludeMissing
    fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [decayDate].
     *
     * Unlike [decayDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decayDate")
    @ExcludeMissing
    fun _decayDate(): JsonField<OffsetDateTime> = decayDate

    /**
     * Returns the raw JSON value of [entityCollection].
     *
     * Unlike [entityCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityCollection")
    @ExcludeMissing
    fun _entityCollection(): JsonField<List<EntityCollection>> = entityCollection

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit")
    @ExcludeMissing
    fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [intlDes].
     *
     * Unlike [intlDes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intlDes")
    @ExcludeMissing
    fun _intlDes(): JsonField<String> = intlDes

    /**
     * Returns the raw JSON value of [launchDate].
     *
     * Unlike [launchDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchDate")
    @ExcludeMissing
    fun _launchDate(): JsonField<LocalDate> = launchDate

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
     * Returns the raw JSON value of [onorbitDetails].
     *
     * Unlike [onorbitDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onorbitDetails")
    @ExcludeMissing
    fun _onorbitDetails(): JsonField<List<OnorbitDetailsFull>> = onorbitDetails

    /**
     * Returns the raw JSON value of [origin].
     *
     * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origin")
    @ExcludeMissing
    fun _origin(): JsonField<String> = origin

    /**
     * Returns the raw JSON value of [origNetwork].
     *
     * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origNetwork")
    @ExcludeMissing
    fun _origNetwork(): JsonField<String> = origNetwork

    /**
     * Returns the raw JSON value of [solarArrays].
     *
     * Unlike [solarArrays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("solarArrays")
    @ExcludeMissing
    fun _solarArrays(): JsonField<List<OnorbitSolarArrayFull>> = solarArrays

    /**
     * Returns the raw JSON value of [thrusters].
     *
     * Unlike [thrusters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thrusters")
    @ExcludeMissing
    fun _thrusters(): JsonField<List<OnorbitThrusterFull>> = thrusters

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
    @JsonProperty("updatedBy")
    @ExcludeMissing
    fun _updatedBy(): JsonField<String> = updatedBy

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
      additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OnorbitFull].
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .satNo()
         * .source()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [OnorbitFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var satNo: JsonField<Int>? = null
        private var source: JsonField<String>? = null
        private var altName: JsonField<String> = JsonMissing.of()
        private var antennas: JsonField<MutableList<OnorbitAntennaFull>>? = null
        private var batteries: JsonField<MutableList<OnorbitBatteryFull>>? = null
        private var category: JsonField<Category> = JsonMissing.of()
        private var commonName: JsonField<String> = JsonMissing.of()
        private var constellation: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var decayDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entityCollection: JsonField<MutableList<EntityCollection>>? = null
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var intlDes: JsonField<String> = JsonMissing.of()
        private var launchDate: JsonField<LocalDate> = JsonMissing.of()
        private var launchSiteId: JsonField<String> = JsonMissing.of()
        private var lifetimeYears: JsonField<Int> = JsonMissing.of()
        private var missionNumber: JsonField<String> = JsonMissing.of()
        private var objectType: JsonField<ObjectType> = JsonMissing.of()
        private var onorbitDetails: JsonField<MutableList<OnorbitDetailsFull>>? = null
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var solarArrays: JsonField<MutableList<OnorbitSolarArrayFull>>? = null
        private var thrusters: JsonField<MutableList<OnorbitThrusterFull>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onorbitFull: OnorbitFull) =
            apply {
                classificationMarking = onorbitFull.classificationMarking
                dataMode = onorbitFull.dataMode
                satNo = onorbitFull.satNo
                source = onorbitFull.source
                altName = onorbitFull.altName
                antennas = onorbitFull.antennas.map { it.toMutableList() }
                batteries = onorbitFull.batteries.map { it.toMutableList() }
                category = onorbitFull.category
                commonName = onorbitFull.commonName
                constellation = onorbitFull.constellation
                countryCode = onorbitFull.countryCode
                createdAt = onorbitFull.createdAt
                createdBy = onorbitFull.createdBy
                decayDate = onorbitFull.decayDate
                entityCollection = onorbitFull.entityCollection.map { it.toMutableList() }
                idOnOrbit = onorbitFull.idOnOrbit
                intlDes = onorbitFull.intlDes
                launchDate = onorbitFull.launchDate
                launchSiteId = onorbitFull.launchSiteId
                lifetimeYears = onorbitFull.lifetimeYears
                missionNumber = onorbitFull.missionNumber
                objectType = onorbitFull.objectType
                onorbitDetails = onorbitFull.onorbitDetails.map { it.toMutableList() }
                origin = onorbitFull.origin
                origNetwork = onorbitFull.origNetwork
                solarArrays = onorbitFull.solarArrays.map { it.toMutableList() }
                thrusters = onorbitFull.thrusters.map { it.toMutableList() }
                updatedAt = onorbitFull.updatedAt
                updatedBy = onorbitFull.updatedBy
                additionalProperties = onorbitFull.additionalProperties.toMutableMap()
            }

        /** Classification marking of the data in IC/CAPCO Portion-marked format. */
        fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

        /**
         * Sets [Builder.classificationMarking] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classificationMarking(classificationMarking: JsonField<String>) =
            apply {
                this.classificationMarking = classificationMarking
            }

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

        /**
         * Sets [Builder.dataMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dataMode(dataMode: JsonField<DataMode>) =
            apply {
                this.dataMode = dataMode
            }

        /** Satellite/Catalog number of the target on-orbit object. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun satNo(satNo: JsonField<Int>) =
            apply {
                this.satNo = satNo
            }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<String>) =
            apply {
                this.source = source
            }

        /** Alternate name of the on-orbit object. */
        fun altName(altName: String) = altName(JsonField.of(altName))

        /**
         * Sets [Builder.altName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun altName(altName: JsonField<String>) =
            apply {
                this.altName = altName
            }

        /** Read-only collection of antennas on this on-orbit object. */
        fun antennas(antennas: List<OnorbitAntennaFull>) = antennas(JsonField.of(antennas))

        /**
         * Sets [Builder.antennas] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennas] with a well-typed `List<OnorbitAntennaFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun antennas(antennas: JsonField<List<OnorbitAntennaFull>>) =
            apply {
                this.antennas = antennas.map { it.toMutableList() }
            }

        /**
         * Adds a single [OnorbitAntennaFull] to [antennas].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAntenna(antenna: OnorbitAntennaFull) =
            apply {
                antennas = (antennas ?: JsonField.of(mutableListOf())).also {
                    checkKnown("antennas", it).add(antenna)
                }
            }

        /** Read-only collection of batteries on this on-orbit object. */
        fun batteries(batteries: List<OnorbitBatteryFull>) = batteries(JsonField.of(batteries))

        /**
         * Sets [Builder.batteries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.batteries] with a well-typed `List<OnorbitBatteryFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun batteries(batteries: JsonField<List<OnorbitBatteryFull>>) =
            apply {
                this.batteries = batteries.map { it.toMutableList() }
            }

        /**
         * Adds a single [OnorbitBatteryFull] to [batteries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBattery(battery: OnorbitBatteryFull) =
            apply {
                batteries = (batteries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("batteries", it).add(battery)
                }
            }

        /** Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State, Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric, Interplanetary, Lagrangian, Docked). */
        fun category(category: Category) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [Category] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<Category>) =
            apply {
                this.category = category
            }

        /** Common name of the on-orbit object. */
        fun commonName(commonName: String) = commonName(JsonField.of(commonName))

        /**
         * Sets [Builder.commonName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commonName(commonName: JsonField<String>) =
            apply {
                this.commonName = commonName
            }

        /** Constellation to which this satellite belongs. */
        fun constellation(constellation: String) = constellation(JsonField.of(constellation))

        /**
         * Sets [Builder.constellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.constellation] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun constellation(constellation: JsonField<String>) =
            apply {
                this.constellation = constellation
            }

        /** The country code. This value is typically the ISO 3166 Alpha-2 two-character country code, however it can also represent various consortiums that do not appear in the ISO document. The code must correspond to an existing country in the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified country code. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryCode(countryCode: JsonField<String>) =
            apply {
                this.countryCode = countryCode
            }

        /** Time the row was created in the database, auto-populated by the system. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply {
                this.createdAt = createdAt
            }

        /** Application user who created the row in the database, auto-populated by the system. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdBy(createdBy: JsonField<String>) =
            apply {
                this.createdBy = createdBy
            }

        /** Date of decay. */
        fun decayDate(decayDate: OffsetDateTime) = decayDate(JsonField.of(decayDate))

        /**
         * Sets [Builder.decayDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decayDate] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decayDate(decayDate: JsonField<OffsetDateTime>) =
            apply {
                this.decayDate = decayDate
            }

        /** Read-only entity details (only returned/used on detail queries). */
        fun entityCollection(entityCollection: List<EntityCollection>) = entityCollection(JsonField.of(entityCollection))

        /**
         * Sets [Builder.entityCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityCollection] with a well-typed `List<EntityCollection>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityCollection(entityCollection: JsonField<List<EntityCollection>>) =
            apply {
                this.entityCollection = entityCollection.map { it.toMutableList() }
            }

        /**
         * Adds a single [EntityCollection] to [Builder.entityCollection].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntityCollection(entityCollection: EntityCollection) =
            apply {
                this.entityCollection = (this.entityCollection ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entityCollection", it).add(entityCollection)
                }
            }

        /** For the public catalog, the idOnOrbit is typically the satellite number as a string, but may be a UUID for analyst or other unknown or untracked satellites, auto-generated by the system. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) =
            apply {
                this.idOnOrbit = idOnOrbit
            }

        /** International Designator, typically of the format YYYYLLLAAA, where YYYY is the launch year, LLL is the sequential launch number of that year, and AAA is an optional launch piece designator for the launch. */
        fun intlDes(intlDes: String) = intlDes(JsonField.of(intlDes))

        /**
         * Sets [Builder.intlDes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intlDes] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intlDes(intlDes: JsonField<String>) =
            apply {
                this.intlDes = intlDes
            }

        /** Date of launch. */
        fun launchDate(launchDate: LocalDate) = launchDate(JsonField.of(launchDate))

        /**
         * Sets [Builder.launchDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchDate] with a well-typed [LocalDate] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchDate(launchDate: JsonField<LocalDate>) =
            apply {
                this.launchDate = launchDate
            }

        /** Id of the associated launchSite entity. */
        fun launchSiteId(launchSiteId: String) = launchSiteId(JsonField.of(launchSiteId))

        /**
         * Sets [Builder.launchSiteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchSiteId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchSiteId(launchSiteId: JsonField<String>) =
            apply {
                this.launchSiteId = launchSiteId
            }

        /** Estimated lifetime of the on-orbit payload, if known. */
        fun lifetimeYears(lifetimeYears: Int) = lifetimeYears(JsonField.of(lifetimeYears))

        /**
         * Sets [Builder.lifetimeYears] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifetimeYears] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lifetimeYears(lifetimeYears: JsonField<Int>) =
            apply {
                this.lifetimeYears = lifetimeYears
            }

        /** Mission number of the on-orbit object. */
        fun missionNumber(missionNumber: String) = missionNumber(JsonField.of(missionNumber))

        /**
         * Sets [Builder.missionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.missionNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun missionNumber(missionNumber: JsonField<String>) =
            apply {
                this.missionNumber = missionNumber
            }

        /** Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN. */
        fun objectType(objectType: ObjectType) = objectType(JsonField.of(objectType))

        /**
         * Sets [Builder.objectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objectType] with a well-typed [ObjectType] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun objectType(objectType: JsonField<ObjectType>) =
            apply {
                this.objectType = objectType
            }

        /** Read-only collection of details for this on-orbit object. */
        fun onorbitDetails(onorbitDetails: List<OnorbitDetailsFull>) = onorbitDetails(JsonField.of(onorbitDetails))

        /**
         * Sets [Builder.onorbitDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onorbitDetails] with a well-typed `List<OnorbitDetailsFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun onorbitDetails(onorbitDetails: JsonField<List<OnorbitDetailsFull>>) =
            apply {
                this.onorbitDetails = onorbitDetails.map { it.toMutableList() }
            }

        /**
         * Adds a single [OnorbitDetailsFull] to [onorbitDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOnorbitDetail(onorbitDetail: OnorbitDetailsFull) =
            apply {
                onorbitDetails = (onorbitDetails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("onorbitDetails", it).add(onorbitDetail)
                }
            }

        /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
        fun origin(origin: String) = origin(JsonField.of(origin))

        /**
         * Sets [Builder.origin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origin(origin: JsonField<String>) =
            apply {
                this.origin = origin
            }

        /** The originating source network on which this record was created, auto-populated by the system. */
        fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

        /**
         * Sets [Builder.origNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun origNetwork(origNetwork: JsonField<String>) =
            apply {
                this.origNetwork = origNetwork
            }

        /** Read-only collection of solar arrays on this on-orbit object. */
        fun solarArrays(solarArrays: List<OnorbitSolarArrayFull>) = solarArrays(JsonField.of(solarArrays))

        /**
         * Sets [Builder.solarArrays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.solarArrays] with a well-typed `List<OnorbitSolarArrayFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun solarArrays(solarArrays: JsonField<List<OnorbitSolarArrayFull>>) =
            apply {
                this.solarArrays = solarArrays.map { it.toMutableList() }
            }

        /**
         * Adds a single [OnorbitSolarArrayFull] to [solarArrays].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSolarArray(solarArray: OnorbitSolarArrayFull) =
            apply {
                solarArrays = (solarArrays ?: JsonField.of(mutableListOf())).also {
                    checkKnown("solarArrays", it).add(solarArray)
                }
            }

        /** Read-only collection of thrusters (engines) on this on-orbit object. */
        fun thrusters(thrusters: List<OnorbitThrusterFull>) = thrusters(JsonField.of(thrusters))

        /**
         * Sets [Builder.thrusters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thrusters] with a well-typed `List<OnorbitThrusterFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thrusters(thrusters: JsonField<List<OnorbitThrusterFull>>) =
            apply {
                this.thrusters = thrusters.map { it.toMutableList() }
            }

        /**
         * Adds a single [OnorbitThrusterFull] to [thrusters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThruster(thruster: OnorbitThrusterFull) =
            apply {
                thrusters = (thrusters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thrusters", it).add(thruster)
                }
            }

        /** Time the row was last updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
            apply {
                this.updatedAt = updatedAt
            }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedBy(updatedBy: JsonField<String>) =
            apply {
                this.updatedBy = updatedBy
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply {
                additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply {
                this.additionalProperties.putAll(additionalProperties)
            }

        fun removeAdditionalProperty(key: String) =
            apply {
                additionalProperties.remove(key)
            }

        fun removeAllAdditionalProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalProperty)
            }

        /**
         * Returns an immutable instance of [OnorbitFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .satNo()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OnorbitFull =
            OnorbitFull(
              checkRequired(
                "classificationMarking", classificationMarking
              ),
              checkRequired(
                "dataMode", dataMode
              ),
              checkRequired(
                "satNo", satNo
              ),
              checkRequired(
                "source", source
              ),
              altName,
              (antennas ?: JsonMissing.of()).map { it.toImmutable() },
              (batteries ?: JsonMissing.of()).map { it.toImmutable() },
              category,
              commonName,
              constellation,
              countryCode,
              createdAt,
              createdBy,
              decayDate,
              (entityCollection ?: JsonMissing.of()).map { it.toImmutable() },
              idOnOrbit,
              intlDes,
              launchDate,
              launchSiteId,
              lifetimeYears,
              missionNumber,
              objectType,
              (onorbitDetails ?: JsonMissing.of()).map { it.toImmutable() },
              origin,
              origNetwork,
              (solarArrays ?: JsonMissing.of()).map { it.toImmutable() },
              (thrusters ?: JsonMissing.of()).map { it.toImmutable() },
              updatedAt,
              updatedBy,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OnorbitFull =
        apply {
            if (validated) {
              return@apply
            }

            classificationMarking()
            dataMode().validate()
            satNo()
            source()
            altName()
            antennas().ifPresent { it.forEach { it.validate() } }
            batteries().ifPresent { it.forEach { it.validate() } }
            category().ifPresent { it.validate() }
            commonName()
            constellation()
            countryCode()
            createdAt()
            createdBy()
            decayDate()
            entityCollection().ifPresent { it.forEach { it.validate() } }
            idOnOrbit()
            intlDes()
            launchDate()
            launchSiteId()
            lifetimeYears()
            missionNumber()
            objectType().ifPresent { it.validate() }
            onorbitDetails().ifPresent { it.forEach { it.validate() } }
            origin()
            origNetwork()
            solarArrays().ifPresent { it.forEach { it.validate() } }
            thrusters().ifPresent { it.forEach { it.validate() } }
            updatedAt()
            updatedBy()
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
    internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (satNo.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (altName.asKnown().isPresent) 1 else 0) + (antennas.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (batteries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (category.asKnown().getOrNull()?.validity() ?: 0) + (if (commonName.asKnown().isPresent) 1 else 0) + (if (constellation.asKnown().isPresent) 1 else 0) + (if (countryCode.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (decayDate.asKnown().isPresent) 1 else 0) + (entityCollection.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (idOnOrbit.asKnown().isPresent) 1 else 0) + (if (intlDes.asKnown().isPresent) 1 else 0) + (if (launchDate.asKnown().isPresent) 1 else 0) + (if (launchSiteId.asKnown().isPresent) 1 else 0) + (if (lifetimeYears.asKnown().isPresent) 1 else 0) + (if (missionNumber.asKnown().isPresent) 1 else 0) + (objectType.asKnown().getOrNull()?.validity() ?: 0) + (onorbitDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (solarArrays.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (thrusters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0)

    /**
     * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
     *
     * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
     *
     * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
     *
     * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
     *
     * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
     */
    class DataMode @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
         * primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DataMode =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Category of the on-orbit object. (Unknown, On-Orbit, Decayed, Cataloged Without State, Launch Nominal, Analyst Satellite, Cislunar, Lunar, Hyperbolic, Heliocentric, Interplanetary, Lagrangian, Docked). */
    class Category @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
         * primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Category =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Category && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** An entity is a generic representation of any object within a space/SSA system such as sensors, on-orbit objects, RF Emitters, space craft buses, etc. An entity can have an operating unit, a location (if terrestrial), and statuses. */
    class EntityCollection private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val name: JsonField<String>,
        private val source: JsonField<String>,
        private val type: JsonField<Type>,
        private val countryCode: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val idEntity: JsonField<String>,
        private val idLocation: JsonField<String>,
        private val idOnOrbit: JsonField<String>,
        private val idOperatingUnit: JsonField<String>,
        private val location: JsonField<LocationFull>,
        private val operatingUnit: JsonField<OperatingunitFull>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val ownerType: JsonField<OwnerType>,
        private val rfBands: JsonField<List<RfBandFull>>,
        private val statusCollection: JsonField<List<StatusFull>>,
        private val taskable: JsonField<Boolean>,
        private val terrestrialId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val updatedBy: JsonField<String>,
        private val urls: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,

    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("countryCode") @ExcludeMissing countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idEntity") @ExcludeMissing idEntity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idLocation") @ExcludeMissing idLocation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idOperatingUnit") @ExcludeMissing idOperatingUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("location") @ExcludeMissing location: JsonField<LocationFull> = JsonMissing.of(),
            @JsonProperty("operatingUnit") @ExcludeMissing operatingUnit: JsonField<OperatingunitFull> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ownerType") @ExcludeMissing ownerType: JsonField<OwnerType> = JsonMissing.of(),
            @JsonProperty("rfBands") @ExcludeMissing rfBands: JsonField<List<RfBandFull>> = JsonMissing.of(),
            @JsonProperty("statusCollection") @ExcludeMissing statusCollection: JsonField<List<StatusFull>> = JsonMissing.of(),
            @JsonProperty("taskable") @ExcludeMissing taskable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("terrestrialId") @ExcludeMissing terrestrialId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("urls") @ExcludeMissing urls: JsonField<List<String>> = JsonMissing.of()
        ) : this(
          classificationMarking,
          dataMode,
          name,
          source,
          type,
          countryCode,
          createdAt,
          createdBy,
          idEntity,
          idLocation,
          idOnOrbit,
          idOperatingUnit,
          location,
          operatingUnit,
          origin,
          origNetwork,
          ownerType,
          rfBands,
          statusCollection,
          taskable,
          terrestrialId,
          updatedAt,
          updatedBy,
          urls,
          mutableMapOf(),
        )

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun classificationMarking(): String = classificationMarking.getRequired("classificationMarking")

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Unique entity name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * The type of entity represented by this record (AIRCRAFT, BUS, COMM, IR, LASEREMITTER, NAVIGATION, ONORBIT, RFEMITTER, SCIENTIFIC, SENSOR, SITE, VESSEL).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * The country code. This value is typically the ISO 3166 Alpha-2 two-character country code, however it can also represent various consortiums that do not appear in the ISO document. The code must correspond to an existing country in the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified country code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Unique identifier of the record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idEntity(): Optional<String> = idEntity.getOptional("idEntity")

        /**
         * Unique identifier of the entity location, if terrestrial/fixed.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idLocation(): Optional<String> = idLocation.getOptional("idLocation")

        /**
         * Onorbit identifier if this entity is part of an on-orbit object. For the public catalog, the idOnOrbit is typically the satellite number as a string, but may be a UUID for analyst or other unknown or untracked satellites.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

        /**
         * Unique identifier of the associated operating unit object.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun idOperatingUnit(): Optional<String> = idOperatingUnit.getOptional("idOperatingUnit")

        /**
         * Model representation of a location, which is a specific fixed point on the earth and is used to denote the locations of fixed sensors, operating units, etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun location(): Optional<LocationFull> = location.getOptional("location")

        /**
         * Model representation of a unit or organization which operates or controls a space-related Entity such as an on-orbit payload, a sensor, etc. A contact may belong to an organization.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun operatingUnit(): Optional<OperatingunitFull> = operatingUnit.getOptional("operatingUnit")

        /**
         * Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Type of organization which owns this entity (e.g. Commercial, Government, Academic, Consortium, etc).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun ownerType(): Optional<OwnerType> = ownerType.getOptional("ownerType")

        /**
         * Read-only collection of RF bands utilized by this entity for communication and/or operation.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun rfBands(): Optional<List<RfBandFull>> = rfBands.getOptional("rfBands")

        /**
         * Read-only collection of statuses which can be collected by multiple sources.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun statusCollection(): Optional<List<StatusFull>> = statusCollection.getOptional("statusCollection")

        /**
         * Boolean indicating if this entity is taskable.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun taskable(): Optional<Boolean> = taskable.getOptional("taskable")

        /**
         * Terrestrial identifier of this entity, if applicable.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun terrestrialId(): Optional<String> = terrestrialId.getOptional("terrestrialId")

        /**
         * Time the row was last updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * List of URLs to additional details/documents for this entity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun urls(): Optional<List<String>> = urls.getOptional("urls")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        fun _classificationMarking(): JsonField<String> = classificationMarking

        /**
         * Returns the raw JSON value of [dataMode].
         *
         * Unlike [dataMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataMode")
        @ExcludeMissing
        fun _dataMode(): JsonField<DataMode> = dataMode

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name")
        @ExcludeMissing
        fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun _type(): JsonField<Type> = type

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
        @JsonProperty("createdBy")
        @ExcludeMissing
        fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [idEntity].
         *
         * Unlike [idEntity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idEntity")
        @ExcludeMissing
        fun _idEntity(): JsonField<String> = idEntity

        /**
         * Returns the raw JSON value of [idLocation].
         *
         * Unlike [idLocation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idLocation")
        @ExcludeMissing
        fun _idLocation(): JsonField<String> = idLocation

        /**
         * Returns the raw JSON value of [idOnOrbit].
         *
         * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOnOrbit")
        @ExcludeMissing
        fun _idOnOrbit(): JsonField<String> = idOnOrbit

        /**
         * Returns the raw JSON value of [idOperatingUnit].
         *
         * Unlike [idOperatingUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idOperatingUnit")
        @ExcludeMissing
        fun _idOperatingUnit(): JsonField<String> = idOperatingUnit

        /**
         * Returns the raw JSON value of [location].
         *
         * Unlike [location], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("location")
        @ExcludeMissing
        fun _location(): JsonField<LocationFull> = location

        /**
         * Returns the raw JSON value of [operatingUnit].
         *
         * Unlike [operatingUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("operatingUnit")
        @ExcludeMissing
        fun _operatingUnit(): JsonField<OperatingunitFull> = operatingUnit

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin")
        @ExcludeMissing
        fun _origin(): JsonField<String> = origin

        /**
         * Returns the raw JSON value of [origNetwork].
         *
         * Unlike [origNetwork], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [ownerType].
         *
         * Unlike [ownerType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ownerType")
        @ExcludeMissing
        fun _ownerType(): JsonField<OwnerType> = ownerType

        /**
         * Returns the raw JSON value of [rfBands].
         *
         * Unlike [rfBands], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rfBands")
        @ExcludeMissing
        fun _rfBands(): JsonField<List<RfBandFull>> = rfBands

        /**
         * Returns the raw JSON value of [statusCollection].
         *
         * Unlike [statusCollection], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statusCollection")
        @ExcludeMissing
        fun _statusCollection(): JsonField<List<StatusFull>> = statusCollection

        /**
         * Returns the raw JSON value of [taskable].
         *
         * Unlike [taskable], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskable")
        @ExcludeMissing
        fun _taskable(): JsonField<Boolean> = taskable

        /**
         * Returns the raw JSON value of [terrestrialId].
         *
         * Unlike [terrestrialId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("terrestrialId")
        @ExcludeMissing
        fun _terrestrialId(): JsonField<String> = terrestrialId

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
        @JsonProperty("updatedBy")
        @ExcludeMissing
        fun _updatedBy(): JsonField<String> = updatedBy

        /**
         * Returns the raw JSON value of [urls].
         *
         * Unlike [urls], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urls")
        @ExcludeMissing
        fun _urls(): JsonField<List<String>> = urls

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
          additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [EntityCollection].
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .name()
             * .source()
             * .type()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [EntityCollection]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var name: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var countryCode: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var idEntity: JsonField<String> = JsonMissing.of()
            private var idLocation: JsonField<String> = JsonMissing.of()
            private var idOnOrbit: JsonField<String> = JsonMissing.of()
            private var idOperatingUnit: JsonField<String> = JsonMissing.of()
            private var location: JsonField<LocationFull> = JsonMissing.of()
            private var operatingUnit: JsonField<OperatingunitFull> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var ownerType: JsonField<OwnerType> = JsonMissing.of()
            private var rfBands: JsonField<MutableList<RfBandFull>>? = null
            private var statusCollection: JsonField<MutableList<StatusFull>>? = null
            private var taskable: JsonField<Boolean> = JsonMissing.of()
            private var terrestrialId: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()
            private var urls: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entityCollection: EntityCollection) =
                apply {
                    classificationMarking = entityCollection.classificationMarking
                    dataMode = entityCollection.dataMode
                    name = entityCollection.name
                    source = entityCollection.source
                    type = entityCollection.type
                    countryCode = entityCollection.countryCode
                    createdAt = entityCollection.createdAt
                    createdBy = entityCollection.createdBy
                    idEntity = entityCollection.idEntity
                    idLocation = entityCollection.idLocation
                    idOnOrbit = entityCollection.idOnOrbit
                    idOperatingUnit = entityCollection.idOperatingUnit
                    location = entityCollection.location
                    operatingUnit = entityCollection.operatingUnit
                    origin = entityCollection.origin
                    origNetwork = entityCollection.origNetwork
                    ownerType = entityCollection.ownerType
                    rfBands = entityCollection.rfBands.map { it.toMutableList() }
                    statusCollection = entityCollection.statusCollection.map { it.toMutableList() }
                    taskable = entityCollection.taskable
                    terrestrialId = entityCollection.terrestrialId
                    updatedAt = entityCollection.updatedAt
                    updatedBy = entityCollection.updatedBy
                    urls = entityCollection.urls.map { it.toMutableList() }
                    additionalProperties = entityCollection.additionalProperties.toMutableMap()
                }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) = classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) =
                apply {
                    this.classificationMarking = classificationMarking
                }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) =
                apply {
                    this.dataMode = dataMode
                }

            /** Unique entity name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun name(name: JsonField<String>) =
                apply {
                    this.name = name
                }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) =
                apply {
                    this.source = source
                }

            /** The type of entity represented by this record (AIRCRAFT, BUS, COMM, IR, LASEREMITTER, NAVIGATION, ONORBIT, RFEMITTER, SCIENTIFIC, SENSOR, SITE, VESSEL). */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<Type>) =
                apply {
                    this.type = type
                }

            /** The country code. This value is typically the ISO 3166 Alpha-2 two-character country code, however it can also represent various consortiums that do not appear in the ISO document. The code must correspond to an existing country in the UDL’s country API. Call udl/country/{code} to get any associated FIPS code, ISO Alpha-3 code, or alternate code values that exist for the specified country code. */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) =
                apply {
                    this.countryCode = countryCode
                }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) =
                apply {
                    this.createdAt = createdAt
                }

            /** Application user who created the row in the database, auto-populated by the system. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) =
                apply {
                    this.createdBy = createdBy
                }

            /** Unique identifier of the record. */
            fun idEntity(idEntity: String) = idEntity(JsonField.of(idEntity))

            /**
             * Sets [Builder.idEntity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idEntity] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idEntity(idEntity: JsonField<String>) =
                apply {
                    this.idEntity = idEntity
                }

            /** Unique identifier of the entity location, if terrestrial/fixed. */
            fun idLocation(idLocation: String) = idLocation(JsonField.of(idLocation))

            /**
             * Sets [Builder.idLocation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idLocation] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idLocation(idLocation: JsonField<String>) =
                apply {
                    this.idLocation = idLocation
                }

            /** Onorbit identifier if this entity is part of an on-orbit object. For the public catalog, the idOnOrbit is typically the satellite number as a string, but may be a UUID for analyst or other unknown or untracked satellites. */
            fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

            /**
             * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOnOrbit(idOnOrbit: JsonField<String>) =
                apply {
                    this.idOnOrbit = idOnOrbit
                }

            /** Unique identifier of the associated operating unit object. */
            fun idOperatingUnit(idOperatingUnit: String) = idOperatingUnit(JsonField.of(idOperatingUnit))

            /**
             * Sets [Builder.idOperatingUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idOperatingUnit] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idOperatingUnit(idOperatingUnit: JsonField<String>) =
                apply {
                    this.idOperatingUnit = idOperatingUnit
                }

            /** Model representation of a location, which is a specific fixed point on the earth and is used to denote the locations of fixed sensors, operating units, etc. */
            fun location(location: LocationFull) = location(JsonField.of(location))

            /**
             * Sets [Builder.location] to an arbitrary JSON value.
             *
             * You should usually call [Builder.location] with a well-typed [LocationFull] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun location(location: JsonField<LocationFull>) =
                apply {
                    this.location = location
                }

            /** Model representation of a unit or organization which operates or controls a space-related Entity such as an on-orbit payload, a sensor, etc. A contact may belong to an organization. */
            fun operatingUnit(operatingUnit: OperatingunitFull) = operatingUnit(JsonField.of(operatingUnit))

            /**
             * Sets [Builder.operatingUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.operatingUnit] with a well-typed [OperatingunitFull] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun operatingUnit(operatingUnit: JsonField<OperatingunitFull>) =
                apply {
                    this.operatingUnit = operatingUnit
                }

            /** Originating system or organization which produced the data, if different from the source. The origin may be different than the source if the source was a mediating system which forwarded the data on behalf of the origin system. If null, the source may be assumed to be the origin. */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) =
                apply {
                    this.origin = origin
                }

            /** The originating source network on which this record was created, auto-populated by the system. */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) =
                apply {
                    this.origNetwork = origNetwork
                }

            /** Type of organization which owns this entity (e.g. Commercial, Government, Academic, Consortium, etc). */
            fun ownerType(ownerType: OwnerType) = ownerType(JsonField.of(ownerType))

            /**
             * Sets [Builder.ownerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownerType] with a well-typed [OwnerType] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownerType(ownerType: JsonField<OwnerType>) =
                apply {
                    this.ownerType = ownerType
                }

            /** Read-only collection of RF bands utilized by this entity for communication and/or operation. */
            fun rfBands(rfBands: List<RfBandFull>) = rfBands(JsonField.of(rfBands))

            /**
             * Sets [Builder.rfBands] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rfBands] with a well-typed `List<RfBandFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rfBands(rfBands: JsonField<List<RfBandFull>>) =
                apply {
                    this.rfBands = rfBands.map { it.toMutableList() }
                }

            /**
             * Adds a single [RfBandFull] to [rfBands].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRfBand(rfBand: RfBandFull) =
                apply {
                    rfBands = (rfBands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rfBands", it).add(rfBand)
                    }
                }

            /** Read-only collection of statuses which can be collected by multiple sources. */
            fun statusCollection(statusCollection: List<StatusFull>) = statusCollection(JsonField.of(statusCollection))

            /**
             * Sets [Builder.statusCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCollection] with a well-typed `List<StatusFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCollection(statusCollection: JsonField<List<StatusFull>>) =
                apply {
                    this.statusCollection = statusCollection.map { it.toMutableList() }
                }

            /**
             * Adds a single [StatusFull] to [Builder.statusCollection].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatusCollection(statusCollection: StatusFull) =
                apply {
                    this.statusCollection = (this.statusCollection ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statusCollection", it).add(statusCollection)
                    }
                }

            /** Boolean indicating if this entity is taskable. */
            fun taskable(taskable: Boolean) = taskable(JsonField.of(taskable))

            /**
             * Sets [Builder.taskable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskable] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskable(taskable: JsonField<Boolean>) =
                apply {
                    this.taskable = taskable
                }

            /** Terrestrial identifier of this entity, if applicable. */
            fun terrestrialId(terrestrialId: String) = terrestrialId(JsonField.of(terrestrialId))

            /**
             * Sets [Builder.terrestrialId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terrestrialId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terrestrialId(terrestrialId: JsonField<String>) =
                apply {
                    this.terrestrialId = terrestrialId
                }

            /** Time the row was last updated in the database, auto-populated by the system. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) =
                apply {
                    this.updatedAt = updatedAt
                }

            /** Application user who updated the row in the database, auto-populated by the system. */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) =
                apply {
                    this.updatedBy = updatedBy
                }

            /** List of URLs to additional details/documents for this entity. */
            fun urls(urls: List<String>) = urls(JsonField.of(urls))

            /**
             * Sets [Builder.urls] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urls] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urls(urls: JsonField<List<String>>) =
                apply {
                    this.urls = urls.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [urls].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUrl(url: String) =
                apply {
                    urls = (urls ?: JsonField.of(mutableListOf())).also {
                        checkKnown("urls", it).add(url)
                    }
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            /**
             * Returns an immutable instance of [EntityCollection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .name()
             * .source()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EntityCollection =
                EntityCollection(
                  checkRequired(
                    "classificationMarking", classificationMarking
                  ),
                  checkRequired(
                    "dataMode", dataMode
                  ),
                  checkRequired(
                    "name", name
                  ),
                  checkRequired(
                    "source", source
                  ),
                  checkRequired(
                    "type", type
                  ),
                  countryCode,
                  createdAt,
                  createdBy,
                  idEntity,
                  idLocation,
                  idOnOrbit,
                  idOperatingUnit,
                  location,
                  operatingUnit,
                  origin,
                  origNetwork,
                  ownerType,
                  (rfBands ?: JsonMissing.of()).map { it.toImmutable() },
                  (statusCollection ?: JsonMissing.of()).map { it.toImmutable() },
                  taskable,
                  terrestrialId,
                  updatedAt,
                  updatedBy,
                  (urls ?: JsonMissing.of()).map { it.toImmutable() },
                  additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EntityCollection =
            apply {
                if (validated) {
                  return@apply
                }

                classificationMarking()
                dataMode().validate()
                name()
                source()
                type().validate()
                countryCode()
                createdAt()
                createdBy()
                idEntity()
                idLocation()
                idOnOrbit()
                idOperatingUnit()
                location().ifPresent { it.validate() }
                operatingUnit().ifPresent { it.validate() }
                origin()
                origNetwork()
                ownerType().ifPresent { it.validate() }
                rfBands().ifPresent { it.forEach { it.validate() } }
                statusCollection().ifPresent { it.forEach { it.validate() } }
                taskable()
                terrestrialId()
                updatedAt()
                updatedBy()
                urls()
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
        internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (name.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (type.asKnown().getOrNull()?.validity() ?: 0) + (if (countryCode.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (idEntity.asKnown().isPresent) 1 else 0) + (if (idLocation.asKnown().isPresent) 1 else 0) + (if (idOnOrbit.asKnown().isPresent) 1 else 0) + (if (idOperatingUnit.asKnown().isPresent) 1 else 0) + (location.asKnown().getOrNull()?.validity() ?: 0) + (operatingUnit.asKnown().getOrNull()?.validity() ?: 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (ownerType.asKnown().getOrNull()?.validity() ?: 0) + (rfBands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (statusCollection.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (taskable.asKnown().isPresent) 1 else 0) + (if (terrestrialId.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0) + (urls.asKnown().getOrNull()?.size ?: 0)

        /**
         * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
         *
         * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may include both real and simulated data.
         *
         * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events, and analysis.
         *
         * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
         *
         * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and requirements, and for validating technical, functional, and performance characteristics.
         */
        class DataMode @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

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
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
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
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
             * primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): DataMode =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The type of entity represented by this record (AIRCRAFT, BUS, COMM, IR, LASEREMITTER, NAVIGATION, ONORBIT, RFEMITTER, SCIENTIFIC, SENSOR, SITE, VESSEL). */
        class Type @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AIRCRAFT = of("AIRCRAFT")

                @JvmField val BUS = of("BUS")

                @JvmField val COMM = of("COMM")

                @JvmField val IR = of("IR")

                @JvmField val LASEREMITTER = of("LASEREMITTER")

                @JvmField val NAVIGATION = of("NAVIGATION")

                @JvmField val ONORBIT = of("ONORBIT")

                @JvmField val RFEMITTER = of("RFEMITTER")

                @JvmField val SCIENTIFIC = of("SCIENTIFIC")

                @JvmField val SENSOR = of("SENSOR")

                @JvmField val SITE = of("SITE")

                @JvmField val VESSEL = of("VESSEL")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AIRCRAFT,
                BUS,
                COMM,
                IR,
                LASEREMITTER,
                NAVIGATION,
                ONORBIT,
                RFEMITTER,
                SCIENTIFIC,
                SENSOR,
                SITE,
                VESSEL,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AIRCRAFT,
                BUS,
                COMM,
                IR,
                LASEREMITTER,
                NAVIGATION,
                ONORBIT,
                RFEMITTER,
                SCIENTIFIC,
                SENSOR,
                SITE,
                VESSEL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AIRCRAFT -> Value.AIRCRAFT
                    BUS -> Value.BUS
                    COMM -> Value.COMM
                    IR -> Value.IR
                    LASEREMITTER -> Value.LASEREMITTER
                    NAVIGATION -> Value.NAVIGATION
                    ONORBIT -> Value.ONORBIT
                    RFEMITTER -> Value.RFEMITTER
                    SCIENTIFIC -> Value.SCIENTIFIC
                    SENSOR -> Value.SENSOR
                    SITE -> Value.SITE
                    VESSEL -> Value.VESSEL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
             */
            fun known(): Known =
                when (this) {
                    AIRCRAFT -> Known.AIRCRAFT
                    BUS -> Known.BUS
                    COMM -> Known.COMM
                    IR -> Known.IR
                    LASEREMITTER -> Known.LASEREMITTER
                    NAVIGATION -> Known.NAVIGATION
                    ONORBIT -> Known.ONORBIT
                    RFEMITTER -> Known.RFEMITTER
                    SCIENTIFIC -> Known.SCIENTIFIC
                    SENSOR -> Known.SENSOR
                    SITE -> Known.SITE
                    VESSEL -> Known.VESSEL
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
             * primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): Type =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Type of organization which owns this entity (e.g. Commercial, Government, Academic, Consortium, etc). */
        class OwnerType @JsonCreator private constructor(
            private val value: JsonField<String>,

        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't match any known
             * member, and you want to know that value. For example, if the SDK is on an older version than the
             * API, then the API may respond with new members that the SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue
            fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMERCIAL = of("Commercial")

                @JvmField val GOVERNMENT = of("Government")

                @JvmField val ACADEMIC = of("Academic")

                @JvmField val CONSORTIUM = of("Consortium")

                @JvmField val OTHER = of("Other")

                @JvmStatic fun of(value: String) = OwnerType(JsonField.of(value))
            }

            /** An enum containing [OwnerType]'s known values. */
            enum class Known {
                COMMERCIAL,
                GOVERNMENT,
                ACADEMIC,
                CONSORTIUM,
                OTHER,
            }

            /**
             * An enum containing [OwnerType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [OwnerType] can contain an unknown value in a couple of cases:
             *
             * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
             *   an older version than the API, then the API may respond with new members that the SDK is unaware
             *   of.
             *
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMERCIAL,
                GOVERNMENT,
                ACADEMIC,
                CONSORTIUM,
                OTHER,
                /** An enum member indicating that [OwnerType] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
             * class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you want to throw
             * for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMERCIAL -> Value.COMMERCIAL
                    GOVERNMENT -> Value.GOVERNMENT
                    ACADEMIC -> Value.ACADEMIC
                    CONSORTIUM -> Value.CONSORTIUM
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
             * for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
             */
            fun known(): Known =
                when (this) {
                    COMMERCIAL -> Known.COMMERCIAL
                    GOVERNMENT -> Known.GOVERNMENT
                    ACADEMIC -> Known.ACADEMIC
                    CONSORTIUM -> Known.CONSORTIUM
                    OTHER -> Known.OTHER
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown OwnerType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for debugging and generally
             * doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
             * primitive type.
             */
            fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

            private var validated: Boolean = false

            fun validate(): OwnerType =
                apply {
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
             * Returns a score indicating how many valid values are contained in this object recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is OwnerType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is EntityCollection && classificationMarking == other.classificationMarking && dataMode == other.dataMode && name == other.name && source == other.source && type == other.type && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && idEntity == other.idEntity && idLocation == other.idLocation && idOnOrbit == other.idOnOrbit && idOperatingUnit == other.idOperatingUnit && location == other.location && operatingUnit == other.operatingUnit && origin == other.origin && origNetwork == other.origNetwork && ownerType == other.ownerType && rfBands == other.rfBands && statusCollection == other.statusCollection && taskable == other.taskable && terrestrialId == other.terrestrialId && updatedAt == other.updatedAt && updatedBy == other.updatedBy && urls == other.urls && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, name, source, type, countryCode, createdAt, createdBy, idEntity, idLocation, idOnOrbit, idOperatingUnit, location, operatingUnit, origin, origNetwork, ownerType, rfBands, statusCollection, taskable, terrestrialId, updatedAt, updatedBy, urls, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "EntityCollection{classificationMarking=$classificationMarking, dataMode=$dataMode, name=$name, source=$source, type=$type, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, idEntity=$idEntity, idLocation=$idLocation, idOnOrbit=$idOnOrbit, idOperatingUnit=$idOperatingUnit, location=$location, operatingUnit=$operatingUnit, origin=$origin, origNetwork=$origNetwork, ownerType=$ownerType, rfBands=$rfBands, statusCollection=$statusCollection, taskable=$taskable, terrestrialId=$terrestrialId, updatedAt=$updatedAt, updatedBy=$updatedBy, urls=$urls, additionalProperties=$additionalProperties}"
    }

    /** Type of on-orbit object: ROCKET BODY, DEBRIS, PAYLOAD, PLATFORM, MANNED, UNKNOWN. */
    class ObjectType @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't match any known
         * member, and you want to know that value. For example, if the SDK is on an older version than the
         * API, then the API may respond with new members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

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
         *
         * - It was deserialized from data that doesn't match any known member. For example, if the SDK is on
         *   an older version than the API, then the API may respond with new members that the SDK is unaware
         *   of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ROCKET_BODY,
            DEBRIS,
            PAYLOAD,
            PLATFORM,
            MANNED,
            UNKNOWN,
            /** An enum member indicating that [ObjectType] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if the
         * class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want to throw
         * for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't want to throw
         * for the unknown case.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging and generally
         * doesn't throw.
         *
         * @throws UnifieddatalibraryInvalidDataException if this class instance's value does not have the expected
         * primitive type.
         */
        fun asString(): String = _value().asString().orElseThrow { UnifieddatalibraryInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): ObjectType =
            apply {
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
         * Returns a score indicating how many valid values are contained in this object recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

      return /* spotless:off */ other is OnorbitFull && classificationMarking == other.classificationMarking && dataMode == other.dataMode && satNo == other.satNo && source == other.source && altName == other.altName && antennas == other.antennas && batteries == other.batteries && category == other.category && commonName == other.commonName && constellation == other.constellation && countryCode == other.countryCode && createdAt == other.createdAt && createdBy == other.createdBy && decayDate == other.decayDate && entityCollection == other.entityCollection && idOnOrbit == other.idOnOrbit && intlDes == other.intlDes && launchDate == other.launchDate && launchSiteId == other.launchSiteId && lifetimeYears == other.lifetimeYears && missionNumber == other.missionNumber && objectType == other.objectType && onorbitDetails == other.onorbitDetails && origin == other.origin && origNetwork == other.origNetwork && solarArrays == other.solarArrays && thrusters == other.thrusters && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, satNo, source, altName, antennas, batteries, category, commonName, constellation, countryCode, createdAt, createdBy, decayDate, entityCollection, idOnOrbit, intlDes, launchDate, launchSiteId, lifetimeYears, missionNumber, objectType, onorbitDetails, origin, origNetwork, solarArrays, thrusters, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "OnorbitFull{classificationMarking=$classificationMarking, dataMode=$dataMode, satNo=$satNo, source=$source, altName=$altName, antennas=$antennas, batteries=$batteries, category=$category, commonName=$commonName, constellation=$constellation, countryCode=$countryCode, createdAt=$createdAt, createdBy=$createdBy, decayDate=$decayDate, entityCollection=$entityCollection, idOnOrbit=$idOnOrbit, intlDes=$intlDes, launchDate=$launchDate, launchSiteId=$launchSiteId, lifetimeYears=$lifetimeYears, missionNumber=$missionNumber, objectType=$objectType, onorbitDetails=$onorbitDetails, origin=$origin, origNetwork=$origNetwork, solarArrays=$solarArrays, thrusters=$thrusters, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

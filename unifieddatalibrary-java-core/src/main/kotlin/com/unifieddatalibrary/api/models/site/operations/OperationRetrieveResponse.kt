// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.site.operations

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
import com.unifieddatalibrary.api.models.DailyOperationFull
import com.unifieddatalibrary.api.models.MaximumOnGroundFull
import com.unifieddatalibrary.api.models.OperationalDeviationFull
import com.unifieddatalibrary.api.models.OperationalPlanningFull
import com.unifieddatalibrary.api.models.PathwayFull
import com.unifieddatalibrary.api.models.WaiverFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Site operating details concerning the hours of operation, operational limitations, site
 * navigation, and waivers associated with the Site.
 */
class OperationRetrieveResponse
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idSite: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dailyOperations: JsonField<List<DailyOperationFull>>,
    private val dopsLastChangedBy: JsonField<String>,
    private val dopsLastChangedDate: JsonField<OffsetDateTime>,
    private val dopsLastChangedReason: JsonField<String>,
    private val idLaunchSite: JsonField<String>,
    private val maximumOnGrounds: JsonField<List<MaximumOnGroundFull>>,
    private val mogsLastChangedBy: JsonField<String>,
    private val mogsLastChangedDate: JsonField<OffsetDateTime>,
    private val mogsLastChangedReason: JsonField<String>,
    private val operationalDeviations: JsonField<List<OperationalDeviationFull>>,
    private val operationalPlannings: JsonField<List<OperationalPlanningFull>>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val pathways: JsonField<List<PathwayFull>>,
    private val sourceDl: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val waivers: JsonField<List<WaiverFull>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idSite") @ExcludeMissing idSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dailyOperations")
        @ExcludeMissing
        dailyOperations: JsonField<List<DailyOperationFull>> = JsonMissing.of(),
        @JsonProperty("dopsLastChangedBy")
        @ExcludeMissing
        dopsLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dopsLastChangedDate")
        @ExcludeMissing
        dopsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dopsLastChangedReason")
        @ExcludeMissing
        dopsLastChangedReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idLaunchSite")
        @ExcludeMissing
        idLaunchSite: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maximumOnGrounds")
        @ExcludeMissing
        maximumOnGrounds: JsonField<List<MaximumOnGroundFull>> = JsonMissing.of(),
        @JsonProperty("mogsLastChangedBy")
        @ExcludeMissing
        mogsLastChangedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mogsLastChangedDate")
        @ExcludeMissing
        mogsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("mogsLastChangedReason")
        @ExcludeMissing
        mogsLastChangedReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operationalDeviations")
        @ExcludeMissing
        operationalDeviations: JsonField<List<OperationalDeviationFull>> = JsonMissing.of(),
        @JsonProperty("operationalPlannings")
        @ExcludeMissing
        operationalPlannings: JsonField<List<OperationalPlanningFull>> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pathways")
        @ExcludeMissing
        pathways: JsonField<List<PathwayFull>> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("waivers")
        @ExcludeMissing
        waivers: JsonField<List<WaiverFull>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idSite,
        source,
        id,
        createdAt,
        createdBy,
        dailyOperations,
        dopsLastChangedBy,
        dopsLastChangedDate,
        dopsLastChangedReason,
        idLaunchSite,
        maximumOnGrounds,
        mogsLastChangedBy,
        mogsLastChangedDate,
        mogsLastChangedReason,
        operationalDeviations,
        operationalPlannings,
        origin,
        origNetwork,
        pathways,
        sourceDl,
        updatedAt,
        updatedBy,
        waivers,
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
     * The ID of the parent site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idSite(): String = idSite.getRequired("idSite")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

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
     * Collection providing hours of operation and other information specific to a day of the week.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dailyOperations(): Optional<List<DailyOperationFull>> =
        dailyOperations.getOptional("dailyOperations")

    /**
     * The name of the person who made the most recent change to data in the DailyOperations
     * collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dopsLastChangedBy(): Optional<String> = dopsLastChangedBy.getOptional("dopsLastChangedBy")

    /**
     * The datetime of the most recent change made to data in the DailyOperations collection, in ISO
     * 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dopsLastChangedDate(): Optional<OffsetDateTime> =
        dopsLastChangedDate.getOptional("dopsLastChangedDate")

    /**
     * The reason for the most recent change to data in the dailyOperations collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dopsLastChangedReason(): Optional<String> =
        dopsLastChangedReason.getOptional("dopsLastChangedReason")

    /**
     * Id of the associated launchSite entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idLaunchSite(): Optional<String> = idLaunchSite.getOptional("idLaunchSite")

    /**
     * Collection providing maximum on ground (MOG) information for specific aircraft at the site
     * associated with this SiteOperations record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maximumOnGrounds(): Optional<List<MaximumOnGroundFull>> =
        maximumOnGrounds.getOptional("maximumOnGrounds")

    /**
     * The name of the person who made the most recent change to data in the MaximumOnGrounds
     * collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mogsLastChangedBy(): Optional<String> = mogsLastChangedBy.getOptional("mogsLastChangedBy")

    /**
     * The datetime of the most recent change made to data in the MaximumOnGrounds collection, in
     * ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mogsLastChangedDate(): Optional<OffsetDateTime> =
        mogsLastChangedDate.getOptional("mogsLastChangedDate")

    /**
     * The reason for the most recent change to data in the MaximumOnGrounds collection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mogsLastChangedReason(): Optional<String> =
        mogsLastChangedReason.getOptional("mogsLastChangedReason")

    /**
     * Collection providing relevant information in the event of deviations/exceptions to normal
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operationalDeviations(): Optional<List<OperationalDeviationFull>> =
        operationalDeviations.getOptional("operationalDeviations")

    /**
     * Collection of planning information associated with this SiteOperations record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operationalPlannings(): Optional<List<OperationalPlanningFull>> =
        operationalPlannings.getOptional("operationalPlannings")

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
     * Collection detailing operational pathways at the Site associated with this SiteOperations
     * record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pathways(): Optional<List<PathwayFull>> = pathways.getOptional("pathways")

    /**
     * The source data library from which this record was received. This could be a remote or
     * tactical UDL or another data library. If null, the record should be assumed to have
     * originated from the primary Enterprise UDL.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

    /**
     * Time the row was updated in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

    /**
     * Application user who updated the row in the database, auto-populated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

    /**
     * Collection documenting operational waivers that have been issued for the Site associated with
     * this record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun waivers(): Optional<List<WaiverFull>> = waivers.getOptional("waivers")

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
     * Returns the raw JSON value of [idSite].
     *
     * Unlike [idSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSite") @ExcludeMissing fun _idSite(): JsonField<String> = idSite

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
     * Returns the raw JSON value of [dailyOperations].
     *
     * Unlike [dailyOperations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dailyOperations")
    @ExcludeMissing
    fun _dailyOperations(): JsonField<List<DailyOperationFull>> = dailyOperations

    /**
     * Returns the raw JSON value of [dopsLastChangedBy].
     *
     * Unlike [dopsLastChangedBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dopsLastChangedBy")
    @ExcludeMissing
    fun _dopsLastChangedBy(): JsonField<String> = dopsLastChangedBy

    /**
     * Returns the raw JSON value of [dopsLastChangedDate].
     *
     * Unlike [dopsLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dopsLastChangedDate")
    @ExcludeMissing
    fun _dopsLastChangedDate(): JsonField<OffsetDateTime> = dopsLastChangedDate

    /**
     * Returns the raw JSON value of [dopsLastChangedReason].
     *
     * Unlike [dopsLastChangedReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dopsLastChangedReason")
    @ExcludeMissing
    fun _dopsLastChangedReason(): JsonField<String> = dopsLastChangedReason

    /**
     * Returns the raw JSON value of [idLaunchSite].
     *
     * Unlike [idLaunchSite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idLaunchSite")
    @ExcludeMissing
    fun _idLaunchSite(): JsonField<String> = idLaunchSite

    /**
     * Returns the raw JSON value of [maximumOnGrounds].
     *
     * Unlike [maximumOnGrounds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maximumOnGrounds")
    @ExcludeMissing
    fun _maximumOnGrounds(): JsonField<List<MaximumOnGroundFull>> = maximumOnGrounds

    /**
     * Returns the raw JSON value of [mogsLastChangedBy].
     *
     * Unlike [mogsLastChangedBy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mogsLastChangedBy")
    @ExcludeMissing
    fun _mogsLastChangedBy(): JsonField<String> = mogsLastChangedBy

    /**
     * Returns the raw JSON value of [mogsLastChangedDate].
     *
     * Unlike [mogsLastChangedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mogsLastChangedDate")
    @ExcludeMissing
    fun _mogsLastChangedDate(): JsonField<OffsetDateTime> = mogsLastChangedDate

    /**
     * Returns the raw JSON value of [mogsLastChangedReason].
     *
     * Unlike [mogsLastChangedReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("mogsLastChangedReason")
    @ExcludeMissing
    fun _mogsLastChangedReason(): JsonField<String> = mogsLastChangedReason

    /**
     * Returns the raw JSON value of [operationalDeviations].
     *
     * Unlike [operationalDeviations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operationalDeviations")
    @ExcludeMissing
    fun _operationalDeviations(): JsonField<List<OperationalDeviationFull>> = operationalDeviations

    /**
     * Returns the raw JSON value of [operationalPlannings].
     *
     * Unlike [operationalPlannings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operationalPlannings")
    @ExcludeMissing
    fun _operationalPlannings(): JsonField<List<OperationalPlanningFull>> = operationalPlannings

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

    /**
     * Returns the raw JSON value of [pathways].
     *
     * Unlike [pathways], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pathways")
    @ExcludeMissing
    fun _pathways(): JsonField<List<PathwayFull>> = pathways

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

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
     * Returns the raw JSON value of [waivers].
     *
     * Unlike [waivers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("waivers") @ExcludeMissing fun _waivers(): JsonField<List<WaiverFull>> = waivers

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
         * Returns a mutable builder for constructing an instance of [OperationRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSite()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OperationRetrieveResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idSite: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dailyOperations: JsonField<MutableList<DailyOperationFull>>? = null
        private var dopsLastChangedBy: JsonField<String> = JsonMissing.of()
        private var dopsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dopsLastChangedReason: JsonField<String> = JsonMissing.of()
        private var idLaunchSite: JsonField<String> = JsonMissing.of()
        private var maximumOnGrounds: JsonField<MutableList<MaximumOnGroundFull>>? = null
        private var mogsLastChangedBy: JsonField<String> = JsonMissing.of()
        private var mogsLastChangedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var mogsLastChangedReason: JsonField<String> = JsonMissing.of()
        private var operationalDeviations: JsonField<MutableList<OperationalDeviationFull>>? = null
        private var operationalPlannings: JsonField<MutableList<OperationalPlanningFull>>? = null
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var pathways: JsonField<MutableList<PathwayFull>>? = null
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var waivers: JsonField<MutableList<WaiverFull>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(operationRetrieveResponse: OperationRetrieveResponse) = apply {
            classificationMarking = operationRetrieveResponse.classificationMarking
            dataMode = operationRetrieveResponse.dataMode
            idSite = operationRetrieveResponse.idSite
            source = operationRetrieveResponse.source
            id = operationRetrieveResponse.id
            createdAt = operationRetrieveResponse.createdAt
            createdBy = operationRetrieveResponse.createdBy
            dailyOperations = operationRetrieveResponse.dailyOperations.map { it.toMutableList() }
            dopsLastChangedBy = operationRetrieveResponse.dopsLastChangedBy
            dopsLastChangedDate = operationRetrieveResponse.dopsLastChangedDate
            dopsLastChangedReason = operationRetrieveResponse.dopsLastChangedReason
            idLaunchSite = operationRetrieveResponse.idLaunchSite
            maximumOnGrounds = operationRetrieveResponse.maximumOnGrounds.map { it.toMutableList() }
            mogsLastChangedBy = operationRetrieveResponse.mogsLastChangedBy
            mogsLastChangedDate = operationRetrieveResponse.mogsLastChangedDate
            mogsLastChangedReason = operationRetrieveResponse.mogsLastChangedReason
            operationalDeviations =
                operationRetrieveResponse.operationalDeviations.map { it.toMutableList() }
            operationalPlannings =
                operationRetrieveResponse.operationalPlannings.map { it.toMutableList() }
            origin = operationRetrieveResponse.origin
            origNetwork = operationRetrieveResponse.origNetwork
            pathways = operationRetrieveResponse.pathways.map { it.toMutableList() }
            sourceDl = operationRetrieveResponse.sourceDl
            updatedAt = operationRetrieveResponse.updatedAt
            updatedBy = operationRetrieveResponse.updatedBy
            waivers = operationRetrieveResponse.waivers.map { it.toMutableList() }
            additionalProperties = operationRetrieveResponse.additionalProperties.toMutableMap()
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

        /** The ID of the parent site. */
        fun idSite(idSite: String) = idSite(JsonField.of(idSite))

        /**
         * Sets [Builder.idSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSite] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSite(idSite: JsonField<String>) = apply { this.idSite = idSite }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Collection providing hours of operation and other information specific to a day of the
         * week.
         */
        fun dailyOperations(dailyOperations: List<DailyOperationFull>) =
            dailyOperations(JsonField.of(dailyOperations))

        /**
         * Sets [Builder.dailyOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dailyOperations] with a well-typed
         * `List<DailyOperationFull>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun dailyOperations(dailyOperations: JsonField<List<DailyOperationFull>>) = apply {
            this.dailyOperations = dailyOperations.map { it.toMutableList() }
        }

        /**
         * Adds a single [DailyOperationFull] to [dailyOperations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDailyOperation(dailyOperation: DailyOperationFull) = apply {
            dailyOperations =
                (dailyOperations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dailyOperations", it).add(dailyOperation)
                }
        }

        /**
         * The name of the person who made the most recent change to data in the DailyOperations
         * collection.
         */
        fun dopsLastChangedBy(dopsLastChangedBy: String) =
            dopsLastChangedBy(JsonField.of(dopsLastChangedBy))

        /**
         * Sets [Builder.dopsLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dopsLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dopsLastChangedBy(dopsLastChangedBy: JsonField<String>) = apply {
            this.dopsLastChangedBy = dopsLastChangedBy
        }

        /**
         * The datetime of the most recent change made to data in the DailyOperations collection, in
         * ISO 8601 UTC format with millisecond precision.
         */
        fun dopsLastChangedDate(dopsLastChangedDate: OffsetDateTime) =
            dopsLastChangedDate(JsonField.of(dopsLastChangedDate))

        /**
         * Sets [Builder.dopsLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dopsLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dopsLastChangedDate(dopsLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.dopsLastChangedDate = dopsLastChangedDate
        }

        /** The reason for the most recent change to data in the dailyOperations collection. */
        fun dopsLastChangedReason(dopsLastChangedReason: String) =
            dopsLastChangedReason(JsonField.of(dopsLastChangedReason))

        /**
         * Sets [Builder.dopsLastChangedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dopsLastChangedReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dopsLastChangedReason(dopsLastChangedReason: JsonField<String>) = apply {
            this.dopsLastChangedReason = dopsLastChangedReason
        }

        /** Id of the associated launchSite entity. */
        fun idLaunchSite(idLaunchSite: String) = idLaunchSite(JsonField.of(idLaunchSite))

        /**
         * Sets [Builder.idLaunchSite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idLaunchSite] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idLaunchSite(idLaunchSite: JsonField<String>) = apply {
            this.idLaunchSite = idLaunchSite
        }

        /**
         * Collection providing maximum on ground (MOG) information for specific aircraft at the
         * site associated with this SiteOperations record.
         */
        fun maximumOnGrounds(maximumOnGrounds: List<MaximumOnGroundFull>) =
            maximumOnGrounds(JsonField.of(maximumOnGrounds))

        /**
         * Sets [Builder.maximumOnGrounds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maximumOnGrounds] with a well-typed
         * `List<MaximumOnGroundFull>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun maximumOnGrounds(maximumOnGrounds: JsonField<List<MaximumOnGroundFull>>) = apply {
            this.maximumOnGrounds = maximumOnGrounds.map { it.toMutableList() }
        }

        /**
         * Adds a single [MaximumOnGroundFull] to [maximumOnGrounds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMaximumOnGround(maximumOnGround: MaximumOnGroundFull) = apply {
            maximumOnGrounds =
                (maximumOnGrounds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("maximumOnGrounds", it).add(maximumOnGround)
                }
        }

        /**
         * The name of the person who made the most recent change to data in the MaximumOnGrounds
         * collection.
         */
        fun mogsLastChangedBy(mogsLastChangedBy: String) =
            mogsLastChangedBy(JsonField.of(mogsLastChangedBy))

        /**
         * Sets [Builder.mogsLastChangedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mogsLastChangedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mogsLastChangedBy(mogsLastChangedBy: JsonField<String>) = apply {
            this.mogsLastChangedBy = mogsLastChangedBy
        }

        /**
         * The datetime of the most recent change made to data in the MaximumOnGrounds collection,
         * in ISO 8601 UTC format with millisecond precision.
         */
        fun mogsLastChangedDate(mogsLastChangedDate: OffsetDateTime) =
            mogsLastChangedDate(JsonField.of(mogsLastChangedDate))

        /**
         * Sets [Builder.mogsLastChangedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mogsLastChangedDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun mogsLastChangedDate(mogsLastChangedDate: JsonField<OffsetDateTime>) = apply {
            this.mogsLastChangedDate = mogsLastChangedDate
        }

        /** The reason for the most recent change to data in the MaximumOnGrounds collection. */
        fun mogsLastChangedReason(mogsLastChangedReason: String) =
            mogsLastChangedReason(JsonField.of(mogsLastChangedReason))

        /**
         * Sets [Builder.mogsLastChangedReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mogsLastChangedReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mogsLastChangedReason(mogsLastChangedReason: JsonField<String>) = apply {
            this.mogsLastChangedReason = mogsLastChangedReason
        }

        /**
         * Collection providing relevant information in the event of deviations/exceptions to normal
         * operations.
         */
        fun operationalDeviations(operationalDeviations: List<OperationalDeviationFull>) =
            operationalDeviations(JsonField.of(operationalDeviations))

        /**
         * Sets [Builder.operationalDeviations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationalDeviations] with a well-typed
         * `List<OperationalDeviationFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun operationalDeviations(
            operationalDeviations: JsonField<List<OperationalDeviationFull>>
        ) = apply { this.operationalDeviations = operationalDeviations.map { it.toMutableList() } }

        /**
         * Adds a single [OperationalDeviationFull] to [operationalDeviations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperationalDeviation(operationalDeviation: OperationalDeviationFull) = apply {
            operationalDeviations =
                (operationalDeviations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operationalDeviations", it).add(operationalDeviation)
                }
        }

        /** Collection of planning information associated with this SiteOperations record. */
        fun operationalPlannings(operationalPlannings: List<OperationalPlanningFull>) =
            operationalPlannings(JsonField.of(operationalPlannings))

        /**
         * Sets [Builder.operationalPlannings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operationalPlannings] with a well-typed
         * `List<OperationalPlanningFull>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun operationalPlannings(operationalPlannings: JsonField<List<OperationalPlanningFull>>) =
            apply {
                this.operationalPlannings = operationalPlannings.map { it.toMutableList() }
            }

        /**
         * Adds a single [OperationalPlanningFull] to [operationalPlannings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperationalPlanning(operationalPlanning: OperationalPlanningFull) = apply {
            operationalPlannings =
                (operationalPlannings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operationalPlannings", it).add(operationalPlanning)
                }
        }

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

        /**
         * Collection detailing operational pathways at the Site associated with this SiteOperations
         * record.
         */
        fun pathways(pathways: List<PathwayFull>) = pathways(JsonField.of(pathways))

        /**
         * Sets [Builder.pathways] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pathways] with a well-typed `List<PathwayFull>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pathways(pathways: JsonField<List<PathwayFull>>) = apply {
            this.pathways = pathways.map { it.toMutableList() }
        }

        /**
         * Adds a single [PathwayFull] to [pathways].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPathway(pathway: PathwayFull) = apply {
            pathways =
                (pathways ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pathways", it).add(pathway)
                }
        }

        /**
         * The source data library from which this record was received. This could be a remote or
         * tactical UDL or another data library. If null, the record should be assumed to have
         * originated from the primary Enterprise UDL.
         */
        fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

        /**
         * Sets [Builder.sourceDl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sourceDl(sourceDl: JsonField<String>) = apply { this.sourceDl = sourceDl }

        /** Time the row was updated in the database, auto-populated by the system. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Application user who updated the row in the database, auto-populated by the system. */
        fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

        /**
         * Sets [Builder.updatedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

        /**
         * Collection documenting operational waivers that have been issued for the Site associated
         * with this record.
         */
        fun waivers(waivers: List<WaiverFull>) = waivers(JsonField.of(waivers))

        /**
         * Sets [Builder.waivers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.waivers] with a well-typed `List<WaiverFull>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun waivers(waivers: JsonField<List<WaiverFull>>) = apply {
            this.waivers = waivers.map { it.toMutableList() }
        }

        /**
         * Adds a single [WaiverFull] to [waivers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWaiver(waiver: WaiverFull) = apply {
            waivers =
                (waivers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("waivers", it).add(waiver)
                }
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
         * Returns an immutable instance of [OperationRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idSite()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OperationRetrieveResponse =
            OperationRetrieveResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idSite", idSite),
                checkRequired("source", source),
                id,
                createdAt,
                createdBy,
                (dailyOperations ?: JsonMissing.of()).map { it.toImmutable() },
                dopsLastChangedBy,
                dopsLastChangedDate,
                dopsLastChangedReason,
                idLaunchSite,
                (maximumOnGrounds ?: JsonMissing.of()).map { it.toImmutable() },
                mogsLastChangedBy,
                mogsLastChangedDate,
                mogsLastChangedReason,
                (operationalDeviations ?: JsonMissing.of()).map { it.toImmutable() },
                (operationalPlannings ?: JsonMissing.of()).map { it.toImmutable() },
                origin,
                origNetwork,
                (pathways ?: JsonMissing.of()).map { it.toImmutable() },
                sourceDl,
                updatedAt,
                updatedBy,
                (waivers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OperationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idSite()
        source()
        id()
        createdAt()
        createdBy()
        dailyOperations().ifPresent { it.forEach { it.validate() } }
        dopsLastChangedBy()
        dopsLastChangedDate()
        dopsLastChangedReason()
        idLaunchSite()
        maximumOnGrounds().ifPresent { it.forEach { it.validate() } }
        mogsLastChangedBy()
        mogsLastChangedDate()
        mogsLastChangedReason()
        operationalDeviations().ifPresent { it.forEach { it.validate() } }
        operationalPlannings().ifPresent { it.forEach { it.validate() } }
        origin()
        origNetwork()
        pathways().ifPresent { it.forEach { it.validate() } }
        sourceDl()
        updatedAt()
        updatedBy()
        waivers().ifPresent { it.forEach { it.validate() } }
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
            (if (idSite.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (dailyOperations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (dopsLastChangedBy.asKnown().isPresent) 1 else 0) +
            (if (dopsLastChangedDate.asKnown().isPresent) 1 else 0) +
            (if (dopsLastChangedReason.asKnown().isPresent) 1 else 0) +
            (if (idLaunchSite.asKnown().isPresent) 1 else 0) +
            (maximumOnGrounds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (mogsLastChangedBy.asKnown().isPresent) 1 else 0) +
            (if (mogsLastChangedDate.asKnown().isPresent) 1 else 0) +
            (if (mogsLastChangedReason.asKnown().isPresent) 1 else 0) +
            (operationalDeviations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (operationalPlannings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (pathways.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (waivers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

            return other is DataMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OperationRetrieveResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idSite == other.idSite &&
            source == other.source &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dailyOperations == other.dailyOperations &&
            dopsLastChangedBy == other.dopsLastChangedBy &&
            dopsLastChangedDate == other.dopsLastChangedDate &&
            dopsLastChangedReason == other.dopsLastChangedReason &&
            idLaunchSite == other.idLaunchSite &&
            maximumOnGrounds == other.maximumOnGrounds &&
            mogsLastChangedBy == other.mogsLastChangedBy &&
            mogsLastChangedDate == other.mogsLastChangedDate &&
            mogsLastChangedReason == other.mogsLastChangedReason &&
            operationalDeviations == other.operationalDeviations &&
            operationalPlannings == other.operationalPlannings &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            pathways == other.pathways &&
            sourceDl == other.sourceDl &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            waivers == other.waivers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idSite,
            source,
            id,
            createdAt,
            createdBy,
            dailyOperations,
            dopsLastChangedBy,
            dopsLastChangedDate,
            dopsLastChangedReason,
            idLaunchSite,
            maximumOnGrounds,
            mogsLastChangedBy,
            mogsLastChangedDate,
            mogsLastChangedReason,
            operationalDeviations,
            operationalPlannings,
            origin,
            origNetwork,
            pathways,
            sourceDl,
            updatedAt,
            updatedBy,
            waivers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OperationRetrieveResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, idSite=$idSite, source=$source, id=$id, createdAt=$createdAt, createdBy=$createdBy, dailyOperations=$dailyOperations, dopsLastChangedBy=$dopsLastChangedBy, dopsLastChangedDate=$dopsLastChangedDate, dopsLastChangedReason=$dopsLastChangedReason, idLaunchSite=$idLaunchSite, maximumOnGrounds=$maximumOnGrounds, mogsLastChangedBy=$mogsLastChangedBy, mogsLastChangedDate=$mogsLastChangedDate, mogsLastChangedReason=$mogsLastChangedReason, operationalDeviations=$operationalDeviations, operationalPlannings=$operationalPlannings, origin=$origin, origNetwork=$origNetwork, pathways=$pathways, sourceDl=$sourceDl, updatedAt=$updatedAt, updatedBy=$updatedBy, waivers=$waivers, additionalProperties=$additionalProperties}"
}

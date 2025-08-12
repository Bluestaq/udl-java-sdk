// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.logisticssupport

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
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsDiscrepancyInfosFull
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsRemarksFull
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportItemsFull
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsSupportTupleResponse
import com.unifieddatalibrary.api.models.logisticssupport.LogisticsTransportationPlansFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Comprehensive logistical details concerning the planned support of maintenance operations required by an aircraft, including transportation information, supplies coordination, and service personnel. */
class LogisticsSupportTupleResponse private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val rptCreatedTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val aircraftMds: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val currIcao: JsonField<String>,
    private val etic: JsonField<OffsetDateTime>,
    private val etmc: JsonField<OffsetDateTime>,
    private val extSystemId: JsonField<String>,
    private val logisticAction: JsonField<String>,
    private val logisticsDiscrepancyInfos: JsonField<List<LogisticsDiscrepancyInfosFull>>,
    private val logisticsRecordId: JsonField<String>,
    private val logisticsRemarks: JsonField<List<LogisticsRemarksFull>>,
    private val logisticsSupportItems: JsonField<List<LogisticsSupportItemsFull>>,
    private val logisticsTransportationPlans: JsonField<List<LogisticsTransportationPlansFull>>,
    private val maintStatusCode: JsonField<String>,
    private val mcTime: JsonField<OffsetDateTime>,
    private val meTime: JsonField<OffsetDateTime>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val owner: JsonField<String>,
    private val reopenFlag: JsonField<Boolean>,
    private val rptClosedTime: JsonField<OffsetDateTime>,
    private val suppIcao: JsonField<String>,
    private val tailNumber: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,

) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking") @ExcludeMissing classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("rptCreatedTime") @ExcludeMissing rptCreatedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aircraftMDS") @ExcludeMissing aircraftMds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt") @ExcludeMissing createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currICAO") @ExcludeMissing currIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("etic") @ExcludeMissing etic: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("etmc") @ExcludeMissing etmc: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extSystemId") @ExcludeMissing extSystemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logisticAction") @ExcludeMissing logisticAction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logisticsDiscrepancyInfos") @ExcludeMissing logisticsDiscrepancyInfos: JsonField<List<LogisticsDiscrepancyInfosFull>> = JsonMissing.of(),
        @JsonProperty("logisticsRecordId") @ExcludeMissing logisticsRecordId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logisticsRemarks") @ExcludeMissing logisticsRemarks: JsonField<List<LogisticsRemarksFull>> = JsonMissing.of(),
        @JsonProperty("logisticsSupportItems") @ExcludeMissing logisticsSupportItems: JsonField<List<LogisticsSupportItemsFull>> = JsonMissing.of(),
        @JsonProperty("logisticsTransportationPlans") @ExcludeMissing logisticsTransportationPlans: JsonField<List<LogisticsTransportationPlansFull>> = JsonMissing.of(),
        @JsonProperty("maintStatusCode") @ExcludeMissing maintStatusCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcTime") @ExcludeMissing mcTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("meTime") @ExcludeMissing meTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork") @ExcludeMissing origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reopenFlag") @ExcludeMissing reopenFlag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rptClosedTime") @ExcludeMissing rptClosedTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("suppICAO") @ExcludeMissing suppIcao: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tailNumber") @ExcludeMissing tailNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt") @ExcludeMissing updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of()
    ) : this(
      classificationMarking,
      dataMode,
      rptCreatedTime,
      source,
      id,
      aircraftMds,
      createdAt,
      createdBy,
      currIcao,
      etic,
      etmc,
      extSystemId,
      logisticAction,
      logisticsDiscrepancyInfos,
      logisticsRecordId,
      logisticsRemarks,
      logisticsSupportItems,
      logisticsTransportationPlans,
      maintStatusCode,
      mcTime,
      meTime,
      origin,
      origNetwork,
      owner,
      reopenFlag,
      rptClosedTime,
      suppIcao,
      tailNumber,
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
     * The time this report was created, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rptCreatedTime(): OffsetDateTime = rptCreatedTime.getRequired("rptCreatedTime")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130 HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016 environment dependent specific type designations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

    /**
     * Time the row was created in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The current ICAO of the aircraft that is the subject of this LogisticsSupportDetails record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun currIcao(): Optional<String> = currIcao.getOptional("currICAO")

    /**
     * The estimated time mission capable for the aircraft, in ISO 8601 UCT format with millisecond precision. This is the estimated time when the aircraft is mission ready.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun etic(): Optional<OffsetDateTime> = etic.getOptional("etic")

    /**
     * Logistics estimated time mission capable.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun etmc(): Optional<OffsetDateTime> = etmc.getOptional("etmc")

    /**
     * Optional system identifier from external systs. This field has no meaning within UDL and is provided as a convenience for systems that require tracking of an internal system generated ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun extSystemId(): Optional<String> = extSystemId.getOptional("extSystemId")

    /**
     * This field identifies the pacing event for bringing the aircraft to Mission Capable status. It is used in calculating the Estimated Time Mission Capable (ETMC) value. Acceptable values are WA (Will Advise), INW (In Work), P+hhh.h (where P=parts and hhh.h is the number of hours up to 999 plus tenths of hours), EQ+hhh.h (EQ=equipment), MRT+hhh.h (MRT=maintenance recovery team).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticAction(): Optional<String> = logisticAction.getOptional("logisticAction")

    /**
     * Discrepancy information associated with this LogisticsSupport record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticsDiscrepancyInfos(): Optional<List<LogisticsDiscrepancyInfosFull>> = logisticsDiscrepancyInfos.getOptional("logisticsDiscrepancyInfos")

    /**
     * The identifier that represents a Logistics Master Record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticsRecordId(): Optional<String> = logisticsRecordId.getOptional("logisticsRecordId")

    /**
     * Remarks associated with this LogisticsSupport record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticsRemarks(): Optional<List<LogisticsRemarksFull>> = logisticsRemarks.getOptional("logisticsRemarks")

    /**
     * Support items associated with this LogisticsSupport record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticsSupportItems(): Optional<List<LogisticsSupportItemsFull>> = logisticsSupportItems.getOptional("logisticsSupportItems")

    /**
     * Transportation plans associated with this LogisticsSupport record, used to coordinate maintenance efforts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun logisticsTransportationPlans(): Optional<List<LogisticsTransportationPlansFull>> = logisticsTransportationPlans.getOptional("logisticsTransportationPlans")

    /**
     * The maintenance status code of the aircraft which may be based on pilot descriptions or evaluation codes. Contact the source provider for details.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun maintStatusCode(): Optional<String> = maintStatusCode.getOptional("maintStatusCode")

    /**
     * The time indicating when all mission essential problems with a given aircraft have been fixed and is mission capable. This datetime should be in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun mcTime(): Optional<OffsetDateTime> = mcTime.getOptional("mcTime")

    /**
     * The time indicating when a given aircraft breaks for a mission essential reason. This datetime should be in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun meTime(): Optional<OffsetDateTime> = meTime.getOptional("meTime")

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
     * The organization that owns this logistics record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun owner(): Optional<String> = owner.getOptional("owner")

    /**
     * This is used to indicate whether a closed master record has been reopened.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun reopenFlag(): Optional<Boolean> = reopenFlag.getOptional("reopenFlag")

    /**
     * The time this report was closed, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun rptClosedTime(): Optional<OffsetDateTime> = rptClosedTime.getOptional("rptClosedTime")

    /**
     * The supplying ICAO of the aircraft that is the subject of this LogisticsSupportDetails record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun suppIcao(): Optional<String> = suppIcao.getOptional("suppICAO")

    /**
     * The tail number of the aircraft that is the subject of this LogisticsSupportDetails record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
     */
    fun tailNumber(): Optional<String> = tailNumber.getOptional("tailNumber")

    /**
     * Time the row was updated in the database, auto-populated by the system.
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
     * Returns the raw JSON value of [rptCreatedTime].
     *
     * Unlike [rptCreatedTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rptCreatedTime")
    @ExcludeMissing
    fun _rptCreatedTime(): JsonField<OffsetDateTime> = rptCreatedTime

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [aircraftMds].
     *
     * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aircraftMDS")
    @ExcludeMissing
    fun _aircraftMds(): JsonField<String> = aircraftMds

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
     * Returns the raw JSON value of [currIcao].
     *
     * Unlike [currIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currICAO")
    @ExcludeMissing
    fun _currIcao(): JsonField<String> = currIcao

    /**
     * Returns the raw JSON value of [etic].
     *
     * Unlike [etic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etic")
    @ExcludeMissing
    fun _etic(): JsonField<OffsetDateTime> = etic

    /**
     * Returns the raw JSON value of [etmc].
     *
     * Unlike [etmc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etmc")
    @ExcludeMissing
    fun _etmc(): JsonField<OffsetDateTime> = etmc

    /**
     * Returns the raw JSON value of [extSystemId].
     *
     * Unlike [extSystemId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extSystemId")
    @ExcludeMissing
    fun _extSystemId(): JsonField<String> = extSystemId

    /**
     * Returns the raw JSON value of [logisticAction].
     *
     * Unlike [logisticAction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticAction")
    @ExcludeMissing
    fun _logisticAction(): JsonField<String> = logisticAction

    /**
     * Returns the raw JSON value of [logisticsDiscrepancyInfos].
     *
     * Unlike [logisticsDiscrepancyInfos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsDiscrepancyInfos")
    @ExcludeMissing
    fun _logisticsDiscrepancyInfos(): JsonField<List<LogisticsDiscrepancyInfosFull>> = logisticsDiscrepancyInfos

    /**
     * Returns the raw JSON value of [logisticsRecordId].
     *
     * Unlike [logisticsRecordId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsRecordId")
    @ExcludeMissing
    fun _logisticsRecordId(): JsonField<String> = logisticsRecordId

    /**
     * Returns the raw JSON value of [logisticsRemarks].
     *
     * Unlike [logisticsRemarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsRemarks")
    @ExcludeMissing
    fun _logisticsRemarks(): JsonField<List<LogisticsRemarksFull>> = logisticsRemarks

    /**
     * Returns the raw JSON value of [logisticsSupportItems].
     *
     * Unlike [logisticsSupportItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsSupportItems")
    @ExcludeMissing
    fun _logisticsSupportItems(): JsonField<List<LogisticsSupportItemsFull>> = logisticsSupportItems

    /**
     * Returns the raw JSON value of [logisticsTransportationPlans].
     *
     * Unlike [logisticsTransportationPlans], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logisticsTransportationPlans")
    @ExcludeMissing
    fun _logisticsTransportationPlans(): JsonField<List<LogisticsTransportationPlansFull>> = logisticsTransportationPlans

    /**
     * Returns the raw JSON value of [maintStatusCode].
     *
     * Unlike [maintStatusCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maintStatusCode")
    @ExcludeMissing
    fun _maintStatusCode(): JsonField<String> = maintStatusCode

    /**
     * Returns the raw JSON value of [mcTime].
     *
     * Unlike [mcTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcTime")
    @ExcludeMissing
    fun _mcTime(): JsonField<OffsetDateTime> = mcTime

    /**
     * Returns the raw JSON value of [meTime].
     *
     * Unlike [meTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meTime")
    @ExcludeMissing
    fun _meTime(): JsonField<OffsetDateTime> = meTime

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
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner")
    @ExcludeMissing
    fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [reopenFlag].
     *
     * Unlike [reopenFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reopenFlag")
    @ExcludeMissing
    fun _reopenFlag(): JsonField<Boolean> = reopenFlag

    /**
     * Returns the raw JSON value of [rptClosedTime].
     *
     * Unlike [rptClosedTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rptClosedTime")
    @ExcludeMissing
    fun _rptClosedTime(): JsonField<OffsetDateTime> = rptClosedTime

    /**
     * Returns the raw JSON value of [suppIcao].
     *
     * Unlike [suppIcao], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suppICAO")
    @ExcludeMissing
    fun _suppIcao(): JsonField<String> = suppIcao

    /**
     * Returns the raw JSON value of [tailNumber].
     *
     * Unlike [tailNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tailNumber")
    @ExcludeMissing
    fun _tailNumber(): JsonField<String> = tailNumber

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
         * Returns a mutable builder for constructing an instance of [LogisticsSupportTupleResponse].
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .rptCreatedTime()
         * .source()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [LogisticsSupportTupleResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var rptCreatedTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var aircraftMds: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currIcao: JsonField<String> = JsonMissing.of()
        private var etic: JsonField<OffsetDateTime> = JsonMissing.of()
        private var etmc: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extSystemId: JsonField<String> = JsonMissing.of()
        private var logisticAction: JsonField<String> = JsonMissing.of()
        private var logisticsDiscrepancyInfos: JsonField<MutableList<LogisticsDiscrepancyInfosFull>>? = null
        private var logisticsRecordId: JsonField<String> = JsonMissing.of()
        private var logisticsRemarks: JsonField<MutableList<LogisticsRemarksFull>>? = null
        private var logisticsSupportItems: JsonField<MutableList<LogisticsSupportItemsFull>>? = null
        private var logisticsTransportationPlans: JsonField<MutableList<LogisticsTransportationPlansFull>>? = null
        private var maintStatusCode: JsonField<String> = JsonMissing.of()
        private var mcTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var meTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var reopenFlag: JsonField<Boolean> = JsonMissing.of()
        private var rptClosedTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var suppIcao: JsonField<String> = JsonMissing.of()
        private var tailNumber: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(logisticsSupportTupleResponse: LogisticsSupportTupleResponse) =
            apply {
                classificationMarking = logisticsSupportTupleResponse.classificationMarking
                dataMode = logisticsSupportTupleResponse.dataMode
                rptCreatedTime = logisticsSupportTupleResponse.rptCreatedTime
                source = logisticsSupportTupleResponse.source
                id = logisticsSupportTupleResponse.id
                aircraftMds = logisticsSupportTupleResponse.aircraftMds
                createdAt = logisticsSupportTupleResponse.createdAt
                createdBy = logisticsSupportTupleResponse.createdBy
                currIcao = logisticsSupportTupleResponse.currIcao
                etic = logisticsSupportTupleResponse.etic
                etmc = logisticsSupportTupleResponse.etmc
                extSystemId = logisticsSupportTupleResponse.extSystemId
                logisticAction = logisticsSupportTupleResponse.logisticAction
                logisticsDiscrepancyInfos = logisticsSupportTupleResponse.logisticsDiscrepancyInfos.map { it.toMutableList() }
                logisticsRecordId = logisticsSupportTupleResponse.logisticsRecordId
                logisticsRemarks = logisticsSupportTupleResponse.logisticsRemarks.map { it.toMutableList() }
                logisticsSupportItems = logisticsSupportTupleResponse.logisticsSupportItems.map { it.toMutableList() }
                logisticsTransportationPlans = logisticsSupportTupleResponse.logisticsTransportationPlans.map { it.toMutableList() }
                maintStatusCode = logisticsSupportTupleResponse.maintStatusCode
                mcTime = logisticsSupportTupleResponse.mcTime
                meTime = logisticsSupportTupleResponse.meTime
                origin = logisticsSupportTupleResponse.origin
                origNetwork = logisticsSupportTupleResponse.origNetwork
                owner = logisticsSupportTupleResponse.owner
                reopenFlag = logisticsSupportTupleResponse.reopenFlag
                rptClosedTime = logisticsSupportTupleResponse.rptClosedTime
                suppIcao = logisticsSupportTupleResponse.suppIcao
                tailNumber = logisticsSupportTupleResponse.tailNumber
                updatedAt = logisticsSupportTupleResponse.updatedAt
                updatedBy = logisticsSupportTupleResponse.updatedBy
                additionalProperties = logisticsSupportTupleResponse.additionalProperties.toMutableMap()
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

        /** The time this report was created, in ISO 8601 UTC format with millisecond precision. */
        fun rptCreatedTime(rptCreatedTime: OffsetDateTime) = rptCreatedTime(JsonField.of(rptCreatedTime))

        /**
         * Sets [Builder.rptCreatedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rptCreatedTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rptCreatedTime(rptCreatedTime: JsonField<OffsetDateTime>) =
            apply {
                this.rptCreatedTime = rptCreatedTime
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

        /** Unique identifier of the record, auto-generated by the system if not provided on create operations. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        /** The aircraft Model Design Series (MDS) designation (e.g. E-2C HAWKEYE, F-15 EAGLE, KC-130 HERCULES, etc.) of this aircraft. Intended as, but not constrained to, MIL-STD-6016 environment dependent specific type designations. */
        fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

        /**
         * Sets [Builder.aircraftMds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aircraftMds] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aircraftMds(aircraftMds: JsonField<String>) =
            apply {
                this.aircraftMds = aircraftMds
            }

        /** Time the row was created in the database. */
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

        /** Application user who created the row in the database. */
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

        /** The current ICAO of the aircraft that is the subject of this LogisticsSupportDetails record. */
        fun currIcao(currIcao: String) = currIcao(JsonField.of(currIcao))

        /**
         * Sets [Builder.currIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currIcao] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currIcao(currIcao: JsonField<String>) =
            apply {
                this.currIcao = currIcao
            }

        /** The estimated time mission capable for the aircraft, in ISO 8601 UCT format with millisecond precision. This is the estimated time when the aircraft is mission ready. */
        fun etic(etic: OffsetDateTime) = etic(JsonField.of(etic))

        /**
         * Sets [Builder.etic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etic] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun etic(etic: JsonField<OffsetDateTime>) =
            apply {
                this.etic = etic
            }

        /** Logistics estimated time mission capable. */
        fun etmc(etmc: OffsetDateTime) = etmc(JsonField.of(etmc))

        /**
         * Sets [Builder.etmc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etmc] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun etmc(etmc: JsonField<OffsetDateTime>) =
            apply {
                this.etmc = etmc
            }

        /** Optional system identifier from external systs. This field has no meaning within UDL and is provided as a convenience for systems that require tracking of an internal system generated ID. */
        fun extSystemId(extSystemId: String) = extSystemId(JsonField.of(extSystemId))

        /**
         * Sets [Builder.extSystemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extSystemId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun extSystemId(extSystemId: JsonField<String>) =
            apply {
                this.extSystemId = extSystemId
            }

        /** This field identifies the pacing event for bringing the aircraft to Mission Capable status. It is used in calculating the Estimated Time Mission Capable (ETMC) value. Acceptable values are WA (Will Advise), INW (In Work), P+hhh.h (where P=parts and hhh.h is the number of hours up to 999 plus tenths of hours), EQ+hhh.h (EQ=equipment), MRT+hhh.h (MRT=maintenance recovery team). */
        fun logisticAction(logisticAction: String) = logisticAction(JsonField.of(logisticAction))

        /**
         * Sets [Builder.logisticAction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticAction] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticAction(logisticAction: JsonField<String>) =
            apply {
                this.logisticAction = logisticAction
            }

        /** Discrepancy information associated with this LogisticsSupport record. */
        fun logisticsDiscrepancyInfos(logisticsDiscrepancyInfos: List<LogisticsDiscrepancyInfosFull>) = logisticsDiscrepancyInfos(JsonField.of(logisticsDiscrepancyInfos))

        /**
         * Sets [Builder.logisticsDiscrepancyInfos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsDiscrepancyInfos] with a well-typed `List<LogisticsDiscrepancyInfosFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticsDiscrepancyInfos(logisticsDiscrepancyInfos: JsonField<List<LogisticsDiscrepancyInfosFull>>) =
            apply {
                this.logisticsDiscrepancyInfos = logisticsDiscrepancyInfos.map { it.toMutableList() }
            }

        /**
         * Adds a single [LogisticsDiscrepancyInfosFull] to [logisticsDiscrepancyInfos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsDiscrepancyInfo(logisticsDiscrepancyInfo: LogisticsDiscrepancyInfosFull) =
            apply {
                logisticsDiscrepancyInfos = (logisticsDiscrepancyInfos ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsDiscrepancyInfos", it).add(logisticsDiscrepancyInfo)
                }
            }

        /** The identifier that represents a Logistics Master Record. */
        fun logisticsRecordId(logisticsRecordId: String) = logisticsRecordId(JsonField.of(logisticsRecordId))

        /**
         * Sets [Builder.logisticsRecordId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsRecordId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticsRecordId(logisticsRecordId: JsonField<String>) =
            apply {
                this.logisticsRecordId = logisticsRecordId
            }

        /** Remarks associated with this LogisticsSupport record. */
        fun logisticsRemarks(logisticsRemarks: List<LogisticsRemarksFull>) = logisticsRemarks(JsonField.of(logisticsRemarks))

        /**
         * Sets [Builder.logisticsRemarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsRemarks] with a well-typed `List<LogisticsRemarksFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticsRemarks(logisticsRemarks: JsonField<List<LogisticsRemarksFull>>) =
            apply {
                this.logisticsRemarks = logisticsRemarks.map { it.toMutableList() }
            }

        /**
         * Adds a single [LogisticsRemarksFull] to [logisticsRemarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsRemark(logisticsRemark: LogisticsRemarksFull) =
            apply {
                logisticsRemarks = (logisticsRemarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsRemarks", it).add(logisticsRemark)
                }
            }

        /** Support items associated with this LogisticsSupport record. */
        fun logisticsSupportItems(logisticsSupportItems: List<LogisticsSupportItemsFull>) = logisticsSupportItems(JsonField.of(logisticsSupportItems))

        /**
         * Sets [Builder.logisticsSupportItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsSupportItems] with a well-typed `List<LogisticsSupportItemsFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticsSupportItems(logisticsSupportItems: JsonField<List<LogisticsSupportItemsFull>>) =
            apply {
                this.logisticsSupportItems = logisticsSupportItems.map { it.toMutableList() }
            }

        /**
         * Adds a single [LogisticsSupportItemsFull] to [logisticsSupportItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsSupportItem(logisticsSupportItem: LogisticsSupportItemsFull) =
            apply {
                logisticsSupportItems = (logisticsSupportItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsSupportItems", it).add(logisticsSupportItem)
                }
            }

        /** Transportation plans associated with this LogisticsSupport record, used to coordinate maintenance efforts. */
        fun logisticsTransportationPlans(logisticsTransportationPlans: List<LogisticsTransportationPlansFull>) = logisticsTransportationPlans(JsonField.of(logisticsTransportationPlans))

        /**
         * Sets [Builder.logisticsTransportationPlans] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logisticsTransportationPlans] with a well-typed `List<LogisticsTransportationPlansFull>` value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun logisticsTransportationPlans(logisticsTransportationPlans: JsonField<List<LogisticsTransportationPlansFull>>) =
            apply {
                this.logisticsTransportationPlans = logisticsTransportationPlans.map { it.toMutableList() }
            }

        /**
         * Adds a single [LogisticsTransportationPlansFull] to [logisticsTransportationPlans].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLogisticsTransportationPlan(logisticsTransportationPlan: LogisticsTransportationPlansFull) =
            apply {
                logisticsTransportationPlans = (logisticsTransportationPlans ?: JsonField.of(mutableListOf())).also {
                    checkKnown("logisticsTransportationPlans", it).add(logisticsTransportationPlan)
                }
            }

        /** The maintenance status code of the aircraft which may be based on pilot descriptions or evaluation codes. Contact the source provider for details. */
        fun maintStatusCode(maintStatusCode: String) = maintStatusCode(JsonField.of(maintStatusCode))

        /**
         * Sets [Builder.maintStatusCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintStatusCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maintStatusCode(maintStatusCode: JsonField<String>) =
            apply {
                this.maintStatusCode = maintStatusCode
            }

        /** The time indicating when all mission essential problems with a given aircraft have been fixed and is mission capable. This datetime should be in ISO 8601 UTC format with millisecond precision. */
        fun mcTime(mcTime: OffsetDateTime) = mcTime(JsonField.of(mcTime))

        /**
         * Sets [Builder.mcTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mcTime(mcTime: JsonField<OffsetDateTime>) =
            apply {
                this.mcTime = mcTime
            }

        /** The time indicating when a given aircraft breaks for a mission essential reason. This datetime should be in ISO 8601 UTC format with millisecond precision. */
        fun meTime(meTime: OffsetDateTime) = meTime(JsonField.of(meTime))

        /**
         * Sets [Builder.meTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meTime(meTime: JsonField<OffsetDateTime>) =
            apply {
                this.meTime = meTime
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

        /** The organization that owns this logistics record. */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun owner(owner: JsonField<String>) =
            apply {
                this.owner = owner
            }

        /** This is used to indicate whether a closed master record has been reopened. */
        fun reopenFlag(reopenFlag: Boolean) = reopenFlag(JsonField.of(reopenFlag))

        /**
         * Sets [Builder.reopenFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reopenFlag] with a well-typed [Boolean] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reopenFlag(reopenFlag: JsonField<Boolean>) =
            apply {
                this.reopenFlag = reopenFlag
            }

        /** The time this report was closed, in ISO 8601 UTC format with millisecond precision. */
        fun rptClosedTime(rptClosedTime: OffsetDateTime) = rptClosedTime(JsonField.of(rptClosedTime))

        /**
         * Sets [Builder.rptClosedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rptClosedTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rptClosedTime(rptClosedTime: JsonField<OffsetDateTime>) =
            apply {
                this.rptClosedTime = rptClosedTime
            }

        /** The supplying ICAO of the aircraft that is the subject of this LogisticsSupportDetails record. */
        fun suppIcao(suppIcao: String) = suppIcao(JsonField.of(suppIcao))

        /**
         * Sets [Builder.suppIcao] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suppIcao] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun suppIcao(suppIcao: JsonField<String>) =
            apply {
                this.suppIcao = suppIcao
            }

        /** The tail number of the aircraft that is the subject of this LogisticsSupportDetails record. */
        fun tailNumber(tailNumber: String) = tailNumber(JsonField.of(tailNumber))

        /**
         * Sets [Builder.tailNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tailNumber] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tailNumber(tailNumber: JsonField<String>) =
            apply {
                this.tailNumber = tailNumber
            }

        /** Time the row was updated in the database, auto-populated by the system. */
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
         * Returns an immutable instance of [LogisticsSupportTupleResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .rptCreatedTime()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LogisticsSupportTupleResponse =
            LogisticsSupportTupleResponse(
              checkRequired(
                "classificationMarking", classificationMarking
              ),
              checkRequired(
                "dataMode", dataMode
              ),
              checkRequired(
                "rptCreatedTime", rptCreatedTime
              ),
              checkRequired(
                "source", source
              ),
              id,
              aircraftMds,
              createdAt,
              createdBy,
              currIcao,
              etic,
              etmc,
              extSystemId,
              logisticAction,
              (logisticsDiscrepancyInfos ?: JsonMissing.of()).map { it.toImmutable() },
              logisticsRecordId,
              (logisticsRemarks ?: JsonMissing.of()).map { it.toImmutable() },
              (logisticsSupportItems ?: JsonMissing.of()).map { it.toImmutable() },
              (logisticsTransportationPlans ?: JsonMissing.of()).map { it.toImmutable() },
              maintStatusCode,
              mcTime,
              meTime,
              origin,
              origNetwork,
              owner,
              reopenFlag,
              rptClosedTime,
              suppIcao,
              tailNumber,
              updatedAt,
              updatedBy,
              additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LogisticsSupportTupleResponse =
        apply {
            if (validated) {
              return@apply
            }

            classificationMarking()
            dataMode().validate()
            rptCreatedTime()
            source()
            id()
            aircraftMds()
            createdAt()
            createdBy()
            currIcao()
            etic()
            etmc()
            extSystemId()
            logisticAction()
            logisticsDiscrepancyInfos().ifPresent { it.forEach { it.validate() } }
            logisticsRecordId()
            logisticsRemarks().ifPresent { it.forEach { it.validate() } }
            logisticsSupportItems().ifPresent { it.forEach { it.validate() } }
            logisticsTransportationPlans().ifPresent { it.forEach { it.validate() } }
            maintStatusCode()
            mcTime()
            meTime()
            origin()
            origNetwork()
            owner()
            reopenFlag()
            rptClosedTime()
            suppIcao()
            tailNumber()
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
    internal fun validity(): Int = (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (rptCreatedTime.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (aircraftMds.asKnown().isPresent) 1 else 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (currIcao.asKnown().isPresent) 1 else 0) + (if (etic.asKnown().isPresent) 1 else 0) + (if (etmc.asKnown().isPresent) 1 else 0) + (if (extSystemId.asKnown().isPresent) 1 else 0) + (if (logisticAction.asKnown().isPresent) 1 else 0) + (logisticsDiscrepancyInfos.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (logisticsRecordId.asKnown().isPresent) 1 else 0) + (logisticsRemarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (logisticsSupportItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (logisticsTransportationPlans.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (maintStatusCode.asKnown().isPresent) 1 else 0) + (if (mcTime.asKnown().isPresent) 1 else 0) + (if (meTime.asKnown().isPresent) 1 else 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (owner.asKnown().isPresent) 1 else 0) + (if (reopenFlag.asKnown().isPresent) 1 else 0) + (if (rptClosedTime.asKnown().isPresent) 1 else 0) + (if (suppIcao.asKnown().isPresent) 1 else 0) + (if (tailNumber.asKnown().isPresent) 1 else 0) + (if (updatedAt.asKnown().isPresent) 1 else 0) + (if (updatedBy.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is LogisticsSupportTupleResponse && classificationMarking == other.classificationMarking && dataMode == other.dataMode && rptCreatedTime == other.rptCreatedTime && source == other.source && id == other.id && aircraftMds == other.aircraftMds && createdAt == other.createdAt && createdBy == other.createdBy && currIcao == other.currIcao && etic == other.etic && etmc == other.etmc && extSystemId == other.extSystemId && logisticAction == other.logisticAction && logisticsDiscrepancyInfos == other.logisticsDiscrepancyInfos && logisticsRecordId == other.logisticsRecordId && logisticsRemarks == other.logisticsRemarks && logisticsSupportItems == other.logisticsSupportItems && logisticsTransportationPlans == other.logisticsTransportationPlans && maintStatusCode == other.maintStatusCode && mcTime == other.mcTime && meTime == other.meTime && origin == other.origin && origNetwork == other.origNetwork && owner == other.owner && reopenFlag == other.reopenFlag && rptClosedTime == other.rptClosedTime && suppIcao == other.suppIcao && tailNumber == other.tailNumber && updatedAt == other.updatedAt && updatedBy == other.updatedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, rptCreatedTime, source, id, aircraftMds, createdAt, createdBy, currIcao, etic, etmc, extSystemId, logisticAction, logisticsDiscrepancyInfos, logisticsRecordId, logisticsRemarks, logisticsSupportItems, logisticsTransportationPlans, maintStatusCode, mcTime, meTime, origin, origNetwork, owner, reopenFlag, rptClosedTime, suppIcao, tailNumber, updatedAt, updatedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "LogisticsSupportTupleResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, rptCreatedTime=$rptCreatedTime, source=$source, id=$id, aircraftMds=$aircraftMds, createdAt=$createdAt, createdBy=$createdBy, currIcao=$currIcao, etic=$etic, etmc=$etmc, extSystemId=$extSystemId, logisticAction=$logisticAction, logisticsDiscrepancyInfos=$logisticsDiscrepancyInfos, logisticsRecordId=$logisticsRecordId, logisticsRemarks=$logisticsRemarks, logisticsSupportItems=$logisticsSupportItems, logisticsTransportationPlans=$logisticsTransportationPlans, maintStatusCode=$maintStatusCode, mcTime=$mcTime, meTime=$meTime, origin=$origin, origNetwork=$origNetwork, owner=$owner, reopenFlag=$reopenFlag, rptClosedTime=$rptClosedTime, suppIcao=$suppIcao, tailNumber=$tailNumber, updatedAt=$updatedAt, updatedBy=$updatedBy, additionalProperties=$additionalProperties}"
}

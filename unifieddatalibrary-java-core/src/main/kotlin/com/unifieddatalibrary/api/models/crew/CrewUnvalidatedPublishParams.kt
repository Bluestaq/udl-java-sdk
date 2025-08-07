// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.crew

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
 * Service operation to take multiple Crew objects as a POST body and ingest into the database. This
 * operation is intended to be used for automated feeds into UDL. A specific role is required to
 * perform this service operation. Please contact the UDL team for assistance.
 */
class CrewUnvalidatedPublishParams
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
         * Returns a mutable builder for constructing an instance of [CrewUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CrewUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(crewUnvalidatedPublishParams: CrewUnvalidatedPublishParams) = apply {
            body = crewUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders = crewUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams = crewUnvalidatedPublishParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [CrewUnvalidatedPublishParams].
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
        fun build(): CrewUnvalidatedPublishParams =
            CrewUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Crew Services. */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("origCrewId") @ExcludeMissing private val origCrewId: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("adjReturnTime")
        @ExcludeMissing
        private val adjReturnTime: JsonField<OffsetDateTime>,
        @JsonProperty("adjReturnTimeApprover")
        @ExcludeMissing
        private val adjReturnTimeApprover: JsonField<String>,
        @JsonProperty("aircraftMDS") @ExcludeMissing private val aircraftMds: JsonField<String>,
        @JsonProperty("alertedTime")
        @ExcludeMissing
        private val alertedTime: JsonField<OffsetDateTime>,
        @JsonProperty("alertType") @ExcludeMissing private val alertType: JsonField<String>,
        @JsonProperty("armsCrewUnit") @ExcludeMissing private val armsCrewUnit: JsonField<String>,
        @JsonProperty("assignedQualCode")
        @ExcludeMissing
        private val assignedQualCode: JsonField<List<String>>,
        @JsonProperty("commanderId") @ExcludeMissing private val commanderId: JsonField<String>,
        @JsonProperty("commanderLast4SSN")
        @ExcludeMissing
        private val commanderLast4Ssn: JsonField<String>,
        @JsonProperty("commanderName") @ExcludeMissing private val commanderName: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("crewHome") @ExcludeMissing private val crewHome: JsonField<Boolean>,
        @JsonProperty("crewMembers")
        @ExcludeMissing
        private val crewMembers: JsonField<List<CrewMember>>,
        @JsonProperty("crewName") @ExcludeMissing private val crewName: JsonField<String>,
        @JsonProperty("crewRMS") @ExcludeMissing private val crewRms: JsonField<String>,
        @JsonProperty("crewRole") @ExcludeMissing private val crewRole: JsonField<String>,
        @JsonProperty("crewSource") @ExcludeMissing private val crewSource: JsonField<String>,
        @JsonProperty("crewSquadron") @ExcludeMissing private val crewSquadron: JsonField<String>,
        @JsonProperty("crewType") @ExcludeMissing private val crewType: JsonField<String>,
        @JsonProperty("crewUnit") @ExcludeMissing private val crewUnit: JsonField<String>,
        @JsonProperty("crewWing") @ExcludeMissing private val crewWing: JsonField<String>,
        @JsonProperty("currentICAO") @ExcludeMissing private val currentIcao: JsonField<String>,
        @JsonProperty("fdpEligType") @ExcludeMissing private val fdpEligType: JsonField<String>,
        @JsonProperty("fdpType") @ExcludeMissing private val fdpType: JsonField<String>,
        @JsonProperty("femaleEnlistedQty")
        @ExcludeMissing
        private val femaleEnlistedQty: JsonField<Int>,
        @JsonProperty("femaleOfficerQty")
        @ExcludeMissing
        private val femaleOfficerQty: JsonField<Int>,
        @JsonProperty("fltAuthNum") @ExcludeMissing private val fltAuthNum: JsonField<String>,
        @JsonProperty("idSiteCurrent") @ExcludeMissing private val idSiteCurrent: JsonField<String>,
        @JsonProperty("idSortie") @ExcludeMissing private val idSortie: JsonField<String>,
        @JsonProperty("initStartTime")
        @ExcludeMissing
        private val initStartTime: JsonField<OffsetDateTime>,
        @JsonProperty("lastAlertTime")
        @ExcludeMissing
        private val lastAlertTime: JsonField<OffsetDateTime>,
        @JsonProperty("legalAlertTime")
        @ExcludeMissing
        private val legalAlertTime: JsonField<OffsetDateTime>,
        @JsonProperty("legalBravoTime")
        @ExcludeMissing
        private val legalBravoTime: JsonField<OffsetDateTime>,
        @JsonProperty("linkedTask") @ExcludeMissing private val linkedTask: JsonField<Boolean>,
        @JsonProperty("maleEnlistedQty")
        @ExcludeMissing
        private val maleEnlistedQty: JsonField<Int>,
        @JsonProperty("maleOfficerQty") @ExcludeMissing private val maleOfficerQty: JsonField<Int>,
        @JsonProperty("missionAlias") @ExcludeMissing private val missionAlias: JsonField<String>,
        @JsonProperty("missionId") @ExcludeMissing private val missionId: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("personnelType") @ExcludeMissing private val personnelType: JsonField<String>,
        @JsonProperty("pickupTime")
        @ExcludeMissing
        private val pickupTime: JsonField<OffsetDateTime>,
        @JsonProperty("postRestApplied")
        @ExcludeMissing
        private val postRestApplied: JsonField<Boolean>,
        @JsonProperty("postRestEnd")
        @ExcludeMissing
        private val postRestEnd: JsonField<OffsetDateTime>,
        @JsonProperty("postRestOffset")
        @ExcludeMissing
        private val postRestOffset: JsonField<String>,
        @JsonProperty("preRestApplied")
        @ExcludeMissing
        private val preRestApplied: JsonField<Boolean>,
        @JsonProperty("preRestStart")
        @ExcludeMissing
        private val preRestStart: JsonField<OffsetDateTime>,
        @JsonProperty("reqQualCode")
        @ExcludeMissing
        private val reqQualCode: JsonField<List<String>>,
        @JsonProperty("returnTime")
        @ExcludeMissing
        private val returnTime: JsonField<OffsetDateTime>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("stage1Qual") @ExcludeMissing private val stage1Qual: JsonField<String>,
        @JsonProperty("stage2Qual") @ExcludeMissing private val stage2Qual: JsonField<String>,
        @JsonProperty("stage3Qual") @ExcludeMissing private val stage3Qual: JsonField<String>,
        @JsonProperty("stageName") @ExcludeMissing private val stageName: JsonField<String>,
        @JsonProperty("stageTime") @ExcludeMissing private val stageTime: JsonField<OffsetDateTime>,
        @JsonProperty("status") @ExcludeMissing private val status: JsonField<String>,
        @JsonProperty("transportReq") @ExcludeMissing private val transportReq: JsonField<Boolean>,
        @JsonProperty("tripKit") @ExcludeMissing private val tripKit: JsonField<String>,
        @JsonProperty("updatedAt") @ExcludeMissing private val updatedAt: JsonField<OffsetDateTime>,
        @JsonProperty("updatedBy") @ExcludeMissing private val updatedBy: JsonField<String>,
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
         * Unique identifier of the formed crew provided by the originating source. Provided for
         * systems that require tracking of an internal system generated ID.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun origCrewId(): String = origCrewId.getRequired("origCrewId")

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
         * Adjusted return time, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun adjReturnTime(): Optional<OffsetDateTime> = adjReturnTime.getOptional("adjReturnTime")

        /**
         * Last name of the adjusted return time approver.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun adjReturnTimeApprover(): Optional<String> =
            adjReturnTimeApprover.getOptional("adjReturnTimeApprover")

        /**
         * The aircraft Model Design Series designation assigned for this crew.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

        /**
         * Time the crew was alerted, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alertedTime(): Optional<OffsetDateTime> = alertedTime.getOptional("alertedTime")

        /**
         * Type of alert for the crew (e.g., ALPHA for maximum readiness, BRAVO for standby, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alertType(): Optional<String> = alertType.getOptional("alertType")

        /**
         * The crew's Aviation Resource Management System (ARMS) unit. If multiple units exist, use
         * the Aircraft Commander's Unit.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun armsCrewUnit(): Optional<String> = armsCrewUnit.getOptional("armsCrewUnit")

        /**
         * Array of qualification codes assigned to this crew (e.g., AL for Aircraft Leader, CS for
         * Combat Systems Operator, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun assignedQualCode(): Optional<List<String>> =
            assignedQualCode.getOptional("assignedQualCode")

        /**
         * Unique identifier of the crew commander assigned by the originating source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commanderId(): Optional<String> = commanderId.getOptional("commanderId")

        /**
         * Last four digits of the crew commander's social security number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commanderLast4Ssn(): Optional<String> =
            commanderLast4Ssn.getOptional("commanderLast4SSN")

        /**
         * The name of the crew commander.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commanderName(): Optional<String> = commanderName.getOptional("commanderName")

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
         * Flag indicating whether this crew task takes the crew home and out of the stage.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewHome(): Optional<Boolean> = crewHome.getOptional("crewHome")

        /**
         * CrewMembers Collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewMembers(): Optional<List<CrewMember>> = crewMembers.getOptional("crewMembers")

        /**
         * Name of the formed crew.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewName(): Optional<String> = crewName.getOptional("crewName")

        /**
         * The resource management system managing and reporting data on this crew.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewRms(): Optional<String> = crewRms.getOptional("crewRMS")

        /**
         * The crew's role on the mission (e.g., DEADHEAD, MEDICAL, PRIMARY).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewRole(): Optional<String> = crewRole.getOptional("crewRole")

        /**
         * The military component that comprises the crew (e.g., ACTIVE, RESERVE, GUARD, MIXED,
         * UNKNOWN, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewSource(): Optional<String> = crewSource.getOptional("crewSource")

        /**
         * The squadron the crew serves.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewSquadron(): Optional<String> = crewSquadron.getOptional("crewSquadron")

        /**
         * The type of crew required to meet mission objectives (e.g., AIRDROP, AIRLAND, AIR
         * REFUELING, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewType(): Optional<String> = crewType.getOptional("crewType")

        /**
         * The crew's squadron as identified in its resource management system. If the crew is
         * composed of members from multiple units, then the Crew Commander's unit should be
         * indicated as the crew unit.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewUnit(): Optional<String> = crewUnit.getOptional("crewUnit")

        /**
         * The wing the crew serves.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun crewWing(): Optional<String> = crewWing.getOptional("crewWing")

        /**
         * The International Civil Aviation Organization (ICAO) code of the airfield at which the
         * crew is currently located.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentIcao(): Optional<String> = currentIcao.getOptional("currentICAO")

        /**
         * Crew Flight Duty Period (FDP) eligibility type.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fdpEligType(): Optional<String> = fdpEligType.getOptional("fdpEligType")

        /**
         * Flight Duty Period (FDP) type.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fdpType(): Optional<String> = fdpType.getOptional("fdpType")

        /**
         * The number of female enlisted crew members.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun femaleEnlistedQty(): Optional<Int> = femaleEnlistedQty.getOptional("femaleEnlistedQty")

        /**
         * The number of female officer crew members.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun femaleOfficerQty(): Optional<Int> = femaleOfficerQty.getOptional("femaleOfficerQty")

        /**
         * Authorization number used on the flight order.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fltAuthNum(): Optional<String> = fltAuthNum.getOptional("fltAuthNum")

        /**
         * Unique identifier of the Site at which the crew is currently located. This ID can be used
         * to obtain additional information on a Site using the 'get by ID' operation (e.g.
         * /udl/site/{id}). For example, the Site object with idSite = abc would be queried as
         * /udl/site/abc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSiteCurrent(): Optional<String> = idSiteCurrent.getOptional("idSiteCurrent")

        /**
         * Unique identifier of the Aircraft Sortie associated with this crew record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idSortie(): Optional<String> = idSortie.getOptional("idSortie")

        /**
         * Initial start time of the crew's linked task that was delinked due to mission closure, in
         * ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun initStartTime(): Optional<OffsetDateTime> = initStartTime.getOptional("initStartTime")

        /**
         * The last time the crew can be alerted, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lastAlertTime(): Optional<OffsetDateTime> = lastAlertTime.getOptional("lastAlertTime")

        /**
         * Time the crew is legal for alert, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legalAlertTime(): Optional<OffsetDateTime> =
            legalAlertTime.getOptional("legalAlertTime")

        /**
         * Time the crew is legally authorized or scheduled to remain on standby for duty, in ISO
         * 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legalBravoTime(): Optional<OffsetDateTime> =
            legalBravoTime.getOptional("legalBravoTime")

        /**
         * Flag indicating whether this crew is part of a linked flying task.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linkedTask(): Optional<Boolean> = linkedTask.getOptional("linkedTask")

        /**
         * The number of male enlisted crew members.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maleEnlistedQty(): Optional<Int> = maleEnlistedQty.getOptional("maleEnlistedQty")

        /**
         * The number of male officer crew members.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun maleOfficerQty(): Optional<Int> = maleOfficerQty.getOptional("maleOfficerQty")

        /**
         * User-defined alias designation for the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionAlias(): Optional<String> = missionAlias.getOptional("missionAlias")

        /**
         * The mission ID the crew is supporting according to the source system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionId(): Optional<String> = missionId.getOptional("missionId")

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
         * The type of personnel that comprises the crew (e.g., AIRCREW, MEDCREW, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun personnelType(): Optional<String> = personnelType.getOptional("personnelType")

        /**
         * Time the crew will be picked up from lodging, in ISO 8601 UTC format with millisecond
         * precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pickupTime(): Optional<OffsetDateTime> = pickupTime.getOptional("pickupTime")

        /**
         * Flag indicating whether post-mission crew rest is applied to the last sortie of a crew's
         * task.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postRestApplied(): Optional<Boolean> = postRestApplied.getOptional("postRestApplied")

        /**
         * End time of the crew rest period after the mission, in ISO 8601 UTC format with
         * millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postRestEnd(): Optional<OffsetDateTime> = postRestEnd.getOptional("postRestEnd")

        /**
         * The scheduled delay or adjustment in the start time of a crew's rest period after a
         * mission, expressed as +/-HH:MM.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun postRestOffset(): Optional<String> = postRestOffset.getOptional("postRestOffset")

        /**
         * Flag indicating whether pre-mission crew rest is applied to the first sortie of a crew's
         * task.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preRestApplied(): Optional<Boolean> = preRestApplied.getOptional("preRestApplied")

        /**
         * Start time of the crew rest period before the mission, in ISO 8601 UTC format with
         * millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun preRestStart(): Optional<OffsetDateTime> = preRestStart.getOptional("preRestStart")

        /**
         * Array of qualification codes required for this crew (e.g., AL for Aircraft Leader, CS for
         * Combat Systems Operator, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reqQualCode(): Optional<List<String>> = reqQualCode.getOptional("reqQualCode")

        /**
         * Scheduled return time, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun returnTime(): Optional<OffsetDateTime> = returnTime.getOptional("returnTime")

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
         * The stage 1 qualifications the crew must have for a mission, such as having basic
         * knowledge of crew operations and aircraft systems.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stage1Qual(): Optional<String> = stage1Qual.getOptional("stage1Qual")

        /**
         * The stage 2 qualifications the crew must have for a mission, such as completion of
         * advanced mission-specific training.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stage2Qual(): Optional<String> = stage2Qual.getOptional("stage2Qual")

        /**
         * The stage 3 qualifications the crew must have for a mission, such as full mission-ready
         * certification and the capability of leading complex operations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stage3Qual(): Optional<String> = stage3Qual.getOptional("stage3Qual")

        /**
         * Stage name for the crew. A stage is a pool of crews supporting a given operation plan.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stageName(): Optional<String> = stageName.getOptional("stageName")

        /**
         * Time the crew entered the stage, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun stageTime(): Optional<OffsetDateTime> = stageTime.getOptional("stageTime")

        /**
         * Crew status (e.g. NEEDCREW, ASSIGNED, APPROVED, NOTIFIED, PARTIAL, UNKNOWN, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun status(): Optional<String> = status.getOptional("status")

        /**
         * Flag indicating that one or more crew members requires transportation to the departure
         * location.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transportReq(): Optional<Boolean> = transportReq.getOptional("transportReq")

        /**
         * Identifies the trip kit needed by the crew. A trip kit contains charts, regulations,
         * maps, etc. carried by the crew during missions.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tripKit(): Optional<String> = tripKit.getOptional("tripKit")

        /**
         * Time the row was updated in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

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
         * Returns the raw JSON value of [origCrewId].
         *
         * Unlike [origCrewId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origCrewId")
        @ExcludeMissing
        fun _origCrewId(): JsonField<String> = origCrewId

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
         * Returns the raw JSON value of [adjReturnTime].
         *
         * Unlike [adjReturnTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjReturnTime")
        @ExcludeMissing
        fun _adjReturnTime(): JsonField<OffsetDateTime> = adjReturnTime

        /**
         * Returns the raw JSON value of [adjReturnTimeApprover].
         *
         * Unlike [adjReturnTimeApprover], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("adjReturnTimeApprover")
        @ExcludeMissing
        fun _adjReturnTimeApprover(): JsonField<String> = adjReturnTimeApprover

        /**
         * Returns the raw JSON value of [aircraftMds].
         *
         * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        fun _aircraftMds(): JsonField<String> = aircraftMds

        /**
         * Returns the raw JSON value of [alertedTime].
         *
         * Unlike [alertedTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alertedTime")
        @ExcludeMissing
        fun _alertedTime(): JsonField<OffsetDateTime> = alertedTime

        /**
         * Returns the raw JSON value of [alertType].
         *
         * Unlike [alertType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alertType") @ExcludeMissing fun _alertType(): JsonField<String> = alertType

        /**
         * Returns the raw JSON value of [armsCrewUnit].
         *
         * Unlike [armsCrewUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("armsCrewUnit")
        @ExcludeMissing
        fun _armsCrewUnit(): JsonField<String> = armsCrewUnit

        /**
         * Returns the raw JSON value of [assignedQualCode].
         *
         * Unlike [assignedQualCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("assignedQualCode")
        @ExcludeMissing
        fun _assignedQualCode(): JsonField<List<String>> = assignedQualCode

        /**
         * Returns the raw JSON value of [commanderId].
         *
         * Unlike [commanderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commanderId")
        @ExcludeMissing
        fun _commanderId(): JsonField<String> = commanderId

        /**
         * Returns the raw JSON value of [commanderLast4Ssn].
         *
         * Unlike [commanderLast4Ssn], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commanderLast4SSN")
        @ExcludeMissing
        fun _commanderLast4Ssn(): JsonField<String> = commanderLast4Ssn

        /**
         * Returns the raw JSON value of [commanderName].
         *
         * Unlike [commanderName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commanderName")
        @ExcludeMissing
        fun _commanderName(): JsonField<String> = commanderName

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
         * Returns the raw JSON value of [crewHome].
         *
         * Unlike [crewHome], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewHome") @ExcludeMissing fun _crewHome(): JsonField<Boolean> = crewHome

        /**
         * Returns the raw JSON value of [crewMembers].
         *
         * Unlike [crewMembers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewMembers")
        @ExcludeMissing
        fun _crewMembers(): JsonField<List<CrewMember>> = crewMembers

        /**
         * Returns the raw JSON value of [crewName].
         *
         * Unlike [crewName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewName") @ExcludeMissing fun _crewName(): JsonField<String> = crewName

        /**
         * Returns the raw JSON value of [crewRms].
         *
         * Unlike [crewRms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewRMS") @ExcludeMissing fun _crewRms(): JsonField<String> = crewRms

        /**
         * Returns the raw JSON value of [crewRole].
         *
         * Unlike [crewRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewRole") @ExcludeMissing fun _crewRole(): JsonField<String> = crewRole

        /**
         * Returns the raw JSON value of [crewSource].
         *
         * Unlike [crewSource], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewSource")
        @ExcludeMissing
        fun _crewSource(): JsonField<String> = crewSource

        /**
         * Returns the raw JSON value of [crewSquadron].
         *
         * Unlike [crewSquadron], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("crewSquadron")
        @ExcludeMissing
        fun _crewSquadron(): JsonField<String> = crewSquadron

        /**
         * Returns the raw JSON value of [crewType].
         *
         * Unlike [crewType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewType") @ExcludeMissing fun _crewType(): JsonField<String> = crewType

        /**
         * Returns the raw JSON value of [crewUnit].
         *
         * Unlike [crewUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewUnit") @ExcludeMissing fun _crewUnit(): JsonField<String> = crewUnit

        /**
         * Returns the raw JSON value of [crewWing].
         *
         * Unlike [crewWing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("crewWing") @ExcludeMissing fun _crewWing(): JsonField<String> = crewWing

        /**
         * Returns the raw JSON value of [currentIcao].
         *
         * Unlike [currentIcao], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currentICAO")
        @ExcludeMissing
        fun _currentIcao(): JsonField<String> = currentIcao

        /**
         * Returns the raw JSON value of [fdpEligType].
         *
         * Unlike [fdpEligType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fdpEligType")
        @ExcludeMissing
        fun _fdpEligType(): JsonField<String> = fdpEligType

        /**
         * Returns the raw JSON value of [fdpType].
         *
         * Unlike [fdpType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fdpType") @ExcludeMissing fun _fdpType(): JsonField<String> = fdpType

        /**
         * Returns the raw JSON value of [femaleEnlistedQty].
         *
         * Unlike [femaleEnlistedQty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("femaleEnlistedQty")
        @ExcludeMissing
        fun _femaleEnlistedQty(): JsonField<Int> = femaleEnlistedQty

        /**
         * Returns the raw JSON value of [femaleOfficerQty].
         *
         * Unlike [femaleOfficerQty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("femaleOfficerQty")
        @ExcludeMissing
        fun _femaleOfficerQty(): JsonField<Int> = femaleOfficerQty

        /**
         * Returns the raw JSON value of [fltAuthNum].
         *
         * Unlike [fltAuthNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fltAuthNum")
        @ExcludeMissing
        fun _fltAuthNum(): JsonField<String> = fltAuthNum

        /**
         * Returns the raw JSON value of [idSiteCurrent].
         *
         * Unlike [idSiteCurrent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idSiteCurrent")
        @ExcludeMissing
        fun _idSiteCurrent(): JsonField<String> = idSiteCurrent

        /**
         * Returns the raw JSON value of [idSortie].
         *
         * Unlike [idSortie], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idSortie") @ExcludeMissing fun _idSortie(): JsonField<String> = idSortie

        /**
         * Returns the raw JSON value of [initStartTime].
         *
         * Unlike [initStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("initStartTime")
        @ExcludeMissing
        fun _initStartTime(): JsonField<OffsetDateTime> = initStartTime

        /**
         * Returns the raw JSON value of [lastAlertTime].
         *
         * Unlike [lastAlertTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastAlertTime")
        @ExcludeMissing
        fun _lastAlertTime(): JsonField<OffsetDateTime> = lastAlertTime

        /**
         * Returns the raw JSON value of [legalAlertTime].
         *
         * Unlike [legalAlertTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legalAlertTime")
        @ExcludeMissing
        fun _legalAlertTime(): JsonField<OffsetDateTime> = legalAlertTime

        /**
         * Returns the raw JSON value of [legalBravoTime].
         *
         * Unlike [legalBravoTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("legalBravoTime")
        @ExcludeMissing
        fun _legalBravoTime(): JsonField<OffsetDateTime> = legalBravoTime

        /**
         * Returns the raw JSON value of [linkedTask].
         *
         * Unlike [linkedTask], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkedTask")
        @ExcludeMissing
        fun _linkedTask(): JsonField<Boolean> = linkedTask

        /**
         * Returns the raw JSON value of [maleEnlistedQty].
         *
         * Unlike [maleEnlistedQty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maleEnlistedQty")
        @ExcludeMissing
        fun _maleEnlistedQty(): JsonField<Int> = maleEnlistedQty

        /**
         * Returns the raw JSON value of [maleOfficerQty].
         *
         * Unlike [maleOfficerQty], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maleOfficerQty")
        @ExcludeMissing
        fun _maleOfficerQty(): JsonField<Int> = maleOfficerQty

        /**
         * Returns the raw JSON value of [missionAlias].
         *
         * Unlike [missionAlias], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionAlias")
        @ExcludeMissing
        fun _missionAlias(): JsonField<String> = missionAlias

        /**
         * Returns the raw JSON value of [missionId].
         *
         * Unlike [missionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionId") @ExcludeMissing fun _missionId(): JsonField<String> = missionId

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
         * Returns the raw JSON value of [personnelType].
         *
         * Unlike [personnelType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personnelType")
        @ExcludeMissing
        fun _personnelType(): JsonField<String> = personnelType

        /**
         * Returns the raw JSON value of [pickupTime].
         *
         * Unlike [pickupTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickupTime")
        @ExcludeMissing
        fun _pickupTime(): JsonField<OffsetDateTime> = pickupTime

        /**
         * Returns the raw JSON value of [postRestApplied].
         *
         * Unlike [postRestApplied], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postRestApplied")
        @ExcludeMissing
        fun _postRestApplied(): JsonField<Boolean> = postRestApplied

        /**
         * Returns the raw JSON value of [postRestEnd].
         *
         * Unlike [postRestEnd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postRestEnd")
        @ExcludeMissing
        fun _postRestEnd(): JsonField<OffsetDateTime> = postRestEnd

        /**
         * Returns the raw JSON value of [postRestOffset].
         *
         * Unlike [postRestOffset], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postRestOffset")
        @ExcludeMissing
        fun _postRestOffset(): JsonField<String> = postRestOffset

        /**
         * Returns the raw JSON value of [preRestApplied].
         *
         * Unlike [preRestApplied], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preRestApplied")
        @ExcludeMissing
        fun _preRestApplied(): JsonField<Boolean> = preRestApplied

        /**
         * Returns the raw JSON value of [preRestStart].
         *
         * Unlike [preRestStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preRestStart")
        @ExcludeMissing
        fun _preRestStart(): JsonField<OffsetDateTime> = preRestStart

        /**
         * Returns the raw JSON value of [reqQualCode].
         *
         * Unlike [reqQualCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reqQualCode")
        @ExcludeMissing
        fun _reqQualCode(): JsonField<List<String>> = reqQualCode

        /**
         * Returns the raw JSON value of [returnTime].
         *
         * Unlike [returnTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("returnTime")
        @ExcludeMissing
        fun _returnTime(): JsonField<OffsetDateTime> = returnTime

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [stage1Qual].
         *
         * Unlike [stage1Qual], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stage1Qual")
        @ExcludeMissing
        fun _stage1Qual(): JsonField<String> = stage1Qual

        /**
         * Returns the raw JSON value of [stage2Qual].
         *
         * Unlike [stage2Qual], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stage2Qual")
        @ExcludeMissing
        fun _stage2Qual(): JsonField<String> = stage2Qual

        /**
         * Returns the raw JSON value of [stage3Qual].
         *
         * Unlike [stage3Qual], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stage3Qual")
        @ExcludeMissing
        fun _stage3Qual(): JsonField<String> = stage3Qual

        /**
         * Returns the raw JSON value of [stageName].
         *
         * Unlike [stageName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stageName") @ExcludeMissing fun _stageName(): JsonField<String> = stageName

        /**
         * Returns the raw JSON value of [stageTime].
         *
         * Unlike [stageTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stageTime")
        @ExcludeMissing
        fun _stageTime(): JsonField<OffsetDateTime> = stageTime

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

        /**
         * Returns the raw JSON value of [transportReq].
         *
         * Unlike [transportReq], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transportReq")
        @ExcludeMissing
        fun _transportReq(): JsonField<Boolean> = transportReq

        /**
         * Returns the raw JSON value of [tripKit].
         *
         * Unlike [tripKit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tripKit") @ExcludeMissing fun _tripKit(): JsonField<String> = tripKit

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .origCrewId()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var origCrewId: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var adjReturnTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var adjReturnTimeApprover: JsonField<String> = JsonMissing.of()
            private var aircraftMds: JsonField<String> = JsonMissing.of()
            private var alertedTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var alertType: JsonField<String> = JsonMissing.of()
            private var armsCrewUnit: JsonField<String> = JsonMissing.of()
            private var assignedQualCode: JsonField<MutableList<String>>? = null
            private var commanderId: JsonField<String> = JsonMissing.of()
            private var commanderLast4Ssn: JsonField<String> = JsonMissing.of()
            private var commanderName: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var crewHome: JsonField<Boolean> = JsonMissing.of()
            private var crewMembers: JsonField<MutableList<CrewMember>>? = null
            private var crewName: JsonField<String> = JsonMissing.of()
            private var crewRms: JsonField<String> = JsonMissing.of()
            private var crewRole: JsonField<String> = JsonMissing.of()
            private var crewSource: JsonField<String> = JsonMissing.of()
            private var crewSquadron: JsonField<String> = JsonMissing.of()
            private var crewType: JsonField<String> = JsonMissing.of()
            private var crewUnit: JsonField<String> = JsonMissing.of()
            private var crewWing: JsonField<String> = JsonMissing.of()
            private var currentIcao: JsonField<String> = JsonMissing.of()
            private var fdpEligType: JsonField<String> = JsonMissing.of()
            private var fdpType: JsonField<String> = JsonMissing.of()
            private var femaleEnlistedQty: JsonField<Int> = JsonMissing.of()
            private var femaleOfficerQty: JsonField<Int> = JsonMissing.of()
            private var fltAuthNum: JsonField<String> = JsonMissing.of()
            private var idSiteCurrent: JsonField<String> = JsonMissing.of()
            private var idSortie: JsonField<String> = JsonMissing.of()
            private var initStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastAlertTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var legalAlertTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var legalBravoTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var linkedTask: JsonField<Boolean> = JsonMissing.of()
            private var maleEnlistedQty: JsonField<Int> = JsonMissing.of()
            private var maleOfficerQty: JsonField<Int> = JsonMissing.of()
            private var missionAlias: JsonField<String> = JsonMissing.of()
            private var missionId: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var personnelType: JsonField<String> = JsonMissing.of()
            private var pickupTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var postRestApplied: JsonField<Boolean> = JsonMissing.of()
            private var postRestEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var postRestOffset: JsonField<String> = JsonMissing.of()
            private var preRestApplied: JsonField<Boolean> = JsonMissing.of()
            private var preRestStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var reqQualCode: JsonField<MutableList<String>>? = null
            private var returnTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var stage1Qual: JsonField<String> = JsonMissing.of()
            private var stage2Qual: JsonField<String> = JsonMissing.of()
            private var stage3Qual: JsonField<String> = JsonMissing.of()
            private var stageName: JsonField<String> = JsonMissing.of()
            private var stageTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<String> = JsonMissing.of()
            private var transportReq: JsonField<Boolean> = JsonMissing.of()
            private var tripKit: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                origCrewId = body.origCrewId
                source = body.source
                id = body.id
                adjReturnTime = body.adjReturnTime
                adjReturnTimeApprover = body.adjReturnTimeApprover
                aircraftMds = body.aircraftMds
                alertedTime = body.alertedTime
                alertType = body.alertType
                armsCrewUnit = body.armsCrewUnit
                assignedQualCode = body.assignedQualCode.map { it.toMutableList() }
                commanderId = body.commanderId
                commanderLast4Ssn = body.commanderLast4Ssn
                commanderName = body.commanderName
                createdAt = body.createdAt
                createdBy = body.createdBy
                crewHome = body.crewHome
                crewMembers = body.crewMembers.map { it.toMutableList() }
                crewName = body.crewName
                crewRms = body.crewRms
                crewRole = body.crewRole
                crewSource = body.crewSource
                crewSquadron = body.crewSquadron
                crewType = body.crewType
                crewUnit = body.crewUnit
                crewWing = body.crewWing
                currentIcao = body.currentIcao
                fdpEligType = body.fdpEligType
                fdpType = body.fdpType
                femaleEnlistedQty = body.femaleEnlistedQty
                femaleOfficerQty = body.femaleOfficerQty
                fltAuthNum = body.fltAuthNum
                idSiteCurrent = body.idSiteCurrent
                idSortie = body.idSortie
                initStartTime = body.initStartTime
                lastAlertTime = body.lastAlertTime
                legalAlertTime = body.legalAlertTime
                legalBravoTime = body.legalBravoTime
                linkedTask = body.linkedTask
                maleEnlistedQty = body.maleEnlistedQty
                maleOfficerQty = body.maleOfficerQty
                missionAlias = body.missionAlias
                missionId = body.missionId
                origin = body.origin
                origNetwork = body.origNetwork
                personnelType = body.personnelType
                pickupTime = body.pickupTime
                postRestApplied = body.postRestApplied
                postRestEnd = body.postRestEnd
                postRestOffset = body.postRestOffset
                preRestApplied = body.preRestApplied
                preRestStart = body.preRestStart
                reqQualCode = body.reqQualCode.map { it.toMutableList() }
                returnTime = body.returnTime
                sourceDl = body.sourceDl
                stage1Qual = body.stage1Qual
                stage2Qual = body.stage2Qual
                stage3Qual = body.stage3Qual
                stageName = body.stageName
                stageTime = body.stageTime
                status = body.status
                transportReq = body.transportReq
                tripKit = body.tripKit
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
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
             * Unique identifier of the formed crew provided by the originating source. Provided for
             * systems that require tracking of an internal system generated ID.
             */
            fun origCrewId(origCrewId: String) = origCrewId(JsonField.of(origCrewId))

            /**
             * Sets [Builder.origCrewId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origCrewId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origCrewId(origCrewId: JsonField<String>) = apply { this.origCrewId = origCrewId }

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

            /** Adjusted return time, in ISO 8601 UTC format with millisecond precision. */
            fun adjReturnTime(adjReturnTime: OffsetDateTime) =
                adjReturnTime(JsonField.of(adjReturnTime))

            /**
             * Sets [Builder.adjReturnTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjReturnTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun adjReturnTime(adjReturnTime: JsonField<OffsetDateTime>) = apply {
                this.adjReturnTime = adjReturnTime
            }

            /** Last name of the adjusted return time approver. */
            fun adjReturnTimeApprover(adjReturnTimeApprover: String) =
                adjReturnTimeApprover(JsonField.of(adjReturnTimeApprover))

            /**
             * Sets [Builder.adjReturnTimeApprover] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjReturnTimeApprover] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun adjReturnTimeApprover(adjReturnTimeApprover: JsonField<String>) = apply {
                this.adjReturnTimeApprover = adjReturnTimeApprover
            }

            /** The aircraft Model Design Series designation assigned for this crew. */
            fun aircraftMds(aircraftMds: String) = aircraftMds(JsonField.of(aircraftMds))

            /**
             * Sets [Builder.aircraftMds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftMds] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftMds(aircraftMds: JsonField<String>) = apply {
                this.aircraftMds = aircraftMds
            }

            /** Time the crew was alerted, in ISO 8601 UTC format with millisecond precision. */
            fun alertedTime(alertedTime: OffsetDateTime) = alertedTime(JsonField.of(alertedTime))

            /**
             * Sets [Builder.alertedTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertedTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun alertedTime(alertedTime: JsonField<OffsetDateTime>) = apply {
                this.alertedTime = alertedTime
            }

            /**
             * Type of alert for the crew (e.g., ALPHA for maximum readiness, BRAVO for standby,
             * etc.).
             */
            fun alertType(alertType: String) = alertType(JsonField.of(alertType))

            /**
             * Sets [Builder.alertType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alertType(alertType: JsonField<String>) = apply { this.alertType = alertType }

            /**
             * The crew's Aviation Resource Management System (ARMS) unit. If multiple units exist,
             * use the Aircraft Commander's Unit.
             */
            fun armsCrewUnit(armsCrewUnit: String) = armsCrewUnit(JsonField.of(armsCrewUnit))

            /**
             * Sets [Builder.armsCrewUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.armsCrewUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun armsCrewUnit(armsCrewUnit: JsonField<String>) = apply {
                this.armsCrewUnit = armsCrewUnit
            }

            /**
             * Array of qualification codes assigned to this crew (e.g., AL for Aircraft Leader, CS
             * for Combat Systems Operator, etc.).
             */
            fun assignedQualCode(assignedQualCode: List<String>) =
                assignedQualCode(JsonField.of(assignedQualCode))

            /**
             * Sets [Builder.assignedQualCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assignedQualCode] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun assignedQualCode(assignedQualCode: JsonField<List<String>>) = apply {
                this.assignedQualCode = assignedQualCode.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.assignedQualCode].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAssignedQualCode(assignedQualCode: String) = apply {
                this.assignedQualCode =
                    (this.assignedQualCode ?: JsonField.of(mutableListOf())).also {
                        checkKnown("assignedQualCode", it).add(assignedQualCode)
                    }
            }

            /** Unique identifier of the crew commander assigned by the originating source. */
            fun commanderId(commanderId: String) = commanderId(JsonField.of(commanderId))

            /**
             * Sets [Builder.commanderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commanderId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commanderId(commanderId: JsonField<String>) = apply {
                this.commanderId = commanderId
            }

            /** Last four digits of the crew commander's social security number. */
            fun commanderLast4Ssn(commanderLast4Ssn: String) =
                commanderLast4Ssn(JsonField.of(commanderLast4Ssn))

            /**
             * Sets [Builder.commanderLast4Ssn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commanderLast4Ssn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commanderLast4Ssn(commanderLast4Ssn: JsonField<String>) = apply {
                this.commanderLast4Ssn = commanderLast4Ssn
            }

            /** The name of the crew commander. */
            fun commanderName(commanderName: String) = commanderName(JsonField.of(commanderName))

            /**
             * Sets [Builder.commanderName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commanderName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commanderName(commanderName: JsonField<String>) = apply {
                this.commanderName = commanderName
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

            /** Flag indicating whether this crew task takes the crew home and out of the stage. */
            fun crewHome(crewHome: Boolean) = crewHome(JsonField.of(crewHome))

            /**
             * Sets [Builder.crewHome] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewHome] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewHome(crewHome: JsonField<Boolean>) = apply { this.crewHome = crewHome }

            /** CrewMembers Collection. */
            fun crewMembers(crewMembers: List<CrewMember>) = crewMembers(JsonField.of(crewMembers))

            /**
             * Sets [Builder.crewMembers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewMembers] with a well-typed `List<CrewMember>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun crewMembers(crewMembers: JsonField<List<CrewMember>>) = apply {
                this.crewMembers = crewMembers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CrewMember] to [crewMembers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCrewMember(crewMember: CrewMember) = apply {
                crewMembers =
                    (crewMembers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("crewMembers", it).add(crewMember)
                    }
            }

            /** Name of the formed crew. */
            fun crewName(crewName: String) = crewName(JsonField.of(crewName))

            /**
             * Sets [Builder.crewName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewName(crewName: JsonField<String>) = apply { this.crewName = crewName }

            /** The resource management system managing and reporting data on this crew. */
            fun crewRms(crewRms: String) = crewRms(JsonField.of(crewRms))

            /**
             * Sets [Builder.crewRms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewRms] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewRms(crewRms: JsonField<String>) = apply { this.crewRms = crewRms }

            /** The crew's role on the mission (e.g., DEADHEAD, MEDICAL, PRIMARY). */
            fun crewRole(crewRole: String) = crewRole(JsonField.of(crewRole))

            /**
             * Sets [Builder.crewRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewRole] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewRole(crewRole: JsonField<String>) = apply { this.crewRole = crewRole }

            /**
             * The military component that comprises the crew (e.g., ACTIVE, RESERVE, GUARD, MIXED,
             * UNKNOWN, etc.).
             */
            fun crewSource(crewSource: String) = crewSource(JsonField.of(crewSource))

            /**
             * Sets [Builder.crewSource] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewSource] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewSource(crewSource: JsonField<String>) = apply { this.crewSource = crewSource }

            /** The squadron the crew serves. */
            fun crewSquadron(crewSquadron: String) = crewSquadron(JsonField.of(crewSquadron))

            /**
             * Sets [Builder.crewSquadron] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewSquadron] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewSquadron(crewSquadron: JsonField<String>) = apply {
                this.crewSquadron = crewSquadron
            }

            /**
             * The type of crew required to meet mission objectives (e.g., AIRDROP, AIRLAND, AIR
             * REFUELING, etc.).
             */
            fun crewType(crewType: String) = crewType(JsonField.of(crewType))

            /**
             * Sets [Builder.crewType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewType(crewType: JsonField<String>) = apply { this.crewType = crewType }

            /**
             * The crew's squadron as identified in its resource management system. If the crew is
             * composed of members from multiple units, then the Crew Commander's unit should be
             * indicated as the crew unit.
             */
            fun crewUnit(crewUnit: String) = crewUnit(JsonField.of(crewUnit))

            /**
             * Sets [Builder.crewUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewUnit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewUnit(crewUnit: JsonField<String>) = apply { this.crewUnit = crewUnit }

            /** The wing the crew serves. */
            fun crewWing(crewWing: String) = crewWing(JsonField.of(crewWing))

            /**
             * Sets [Builder.crewWing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.crewWing] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun crewWing(crewWing: JsonField<String>) = apply { this.crewWing = crewWing }

            /**
             * The International Civil Aviation Organization (ICAO) code of the airfield at which
             * the crew is currently located.
             */
            fun currentIcao(currentIcao: String) = currentIcao(JsonField.of(currentIcao))

            /**
             * Sets [Builder.currentIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentIcao] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentIcao(currentIcao: JsonField<String>) = apply {
                this.currentIcao = currentIcao
            }

            /** Crew Flight Duty Period (FDP) eligibility type. */
            fun fdpEligType(fdpEligType: String) = fdpEligType(JsonField.of(fdpEligType))

            /**
             * Sets [Builder.fdpEligType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fdpEligType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fdpEligType(fdpEligType: JsonField<String>) = apply {
                this.fdpEligType = fdpEligType
            }

            /** Flight Duty Period (FDP) type. */
            fun fdpType(fdpType: String) = fdpType(JsonField.of(fdpType))

            /**
             * Sets [Builder.fdpType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fdpType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fdpType(fdpType: JsonField<String>) = apply { this.fdpType = fdpType }

            /** The number of female enlisted crew members. */
            fun femaleEnlistedQty(femaleEnlistedQty: Int) =
                femaleEnlistedQty(JsonField.of(femaleEnlistedQty))

            /**
             * Sets [Builder.femaleEnlistedQty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.femaleEnlistedQty] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun femaleEnlistedQty(femaleEnlistedQty: JsonField<Int>) = apply {
                this.femaleEnlistedQty = femaleEnlistedQty
            }

            /** The number of female officer crew members. */
            fun femaleOfficerQty(femaleOfficerQty: Int) =
                femaleOfficerQty(JsonField.of(femaleOfficerQty))

            /**
             * Sets [Builder.femaleOfficerQty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.femaleOfficerQty] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun femaleOfficerQty(femaleOfficerQty: JsonField<Int>) = apply {
                this.femaleOfficerQty = femaleOfficerQty
            }

            /** Authorization number used on the flight order. */
            fun fltAuthNum(fltAuthNum: String) = fltAuthNum(JsonField.of(fltAuthNum))

            /**
             * Sets [Builder.fltAuthNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fltAuthNum] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fltAuthNum(fltAuthNum: JsonField<String>) = apply { this.fltAuthNum = fltAuthNum }

            /**
             * Unique identifier of the Site at which the crew is currently located. This ID can be
             * used to obtain additional information on a Site using the 'get by ID' operation (e.g.
             * /udl/site/{id}). For example, the Site object with idSite = abc would be queried as
             * /udl/site/abc.
             */
            fun idSiteCurrent(idSiteCurrent: String) = idSiteCurrent(JsonField.of(idSiteCurrent))

            /**
             * Sets [Builder.idSiteCurrent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSiteCurrent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSiteCurrent(idSiteCurrent: JsonField<String>) = apply {
                this.idSiteCurrent = idSiteCurrent
            }

            /** Unique identifier of the Aircraft Sortie associated with this crew record. */
            fun idSortie(idSortie: String) = idSortie(JsonField.of(idSortie))

            /**
             * Sets [Builder.idSortie] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idSortie] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idSortie(idSortie: JsonField<String>) = apply { this.idSortie = idSortie }

            /**
             * Initial start time of the crew's linked task that was delinked due to mission
             * closure, in ISO 8601 UTC format with millisecond precision.
             */
            fun initStartTime(initStartTime: OffsetDateTime) =
                initStartTime(JsonField.of(initStartTime))

            /**
             * Sets [Builder.initStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.initStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun initStartTime(initStartTime: JsonField<OffsetDateTime>) = apply {
                this.initStartTime = initStartTime
            }

            /**
             * The last time the crew can be alerted, in ISO 8601 UTC format with millisecond
             * precision.
             */
            fun lastAlertTime(lastAlertTime: OffsetDateTime) =
                lastAlertTime(JsonField.of(lastAlertTime))

            /**
             * Sets [Builder.lastAlertTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastAlertTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastAlertTime(lastAlertTime: JsonField<OffsetDateTime>) = apply {
                this.lastAlertTime = lastAlertTime
            }

            /**
             * Time the crew is legal for alert, in ISO 8601 UTC format with millisecond precision.
             */
            fun legalAlertTime(legalAlertTime: OffsetDateTime) =
                legalAlertTime(JsonField.of(legalAlertTime))

            /**
             * Sets [Builder.legalAlertTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalAlertTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalAlertTime(legalAlertTime: JsonField<OffsetDateTime>) = apply {
                this.legalAlertTime = legalAlertTime
            }

            /**
             * Time the crew is legally authorized or scheduled to remain on standby for duty, in
             * ISO 8601 UTC format with millisecond precision.
             */
            fun legalBravoTime(legalBravoTime: OffsetDateTime) =
                legalBravoTime(JsonField.of(legalBravoTime))

            /**
             * Sets [Builder.legalBravoTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalBravoTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun legalBravoTime(legalBravoTime: JsonField<OffsetDateTime>) = apply {
                this.legalBravoTime = legalBravoTime
            }

            /** Flag indicating whether this crew is part of a linked flying task. */
            fun linkedTask(linkedTask: Boolean) = linkedTask(JsonField.of(linkedTask))

            /**
             * Sets [Builder.linkedTask] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkedTask] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkedTask(linkedTask: JsonField<Boolean>) = apply { this.linkedTask = linkedTask }

            /** The number of male enlisted crew members. */
            fun maleEnlistedQty(maleEnlistedQty: Int) =
                maleEnlistedQty(JsonField.of(maleEnlistedQty))

            /**
             * Sets [Builder.maleEnlistedQty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maleEnlistedQty] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maleEnlistedQty(maleEnlistedQty: JsonField<Int>) = apply {
                this.maleEnlistedQty = maleEnlistedQty
            }

            /** The number of male officer crew members. */
            fun maleOfficerQty(maleOfficerQty: Int) = maleOfficerQty(JsonField.of(maleOfficerQty))

            /**
             * Sets [Builder.maleOfficerQty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maleOfficerQty] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maleOfficerQty(maleOfficerQty: JsonField<Int>) = apply {
                this.maleOfficerQty = maleOfficerQty
            }

            /** User-defined alias designation for the mission. */
            fun missionAlias(missionAlias: String) = missionAlias(JsonField.of(missionAlias))

            /**
             * Sets [Builder.missionAlias] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionAlias] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionAlias(missionAlias: JsonField<String>) = apply {
                this.missionAlias = missionAlias
            }

            /** The mission ID the crew is supporting according to the source system. */
            fun missionId(missionId: String) = missionId(JsonField.of(missionId))

            /**
             * Sets [Builder.missionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionId(missionId: JsonField<String>) = apply { this.missionId = missionId }

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

            /** The type of personnel that comprises the crew (e.g., AIRCREW, MEDCREW, etc.). */
            fun personnelType(personnelType: String) = personnelType(JsonField.of(personnelType))

            /**
             * Sets [Builder.personnelType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personnelType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personnelType(personnelType: JsonField<String>) = apply {
                this.personnelType = personnelType
            }

            /**
             * Time the crew will be picked up from lodging, in ISO 8601 UTC format with millisecond
             * precision.
             */
            fun pickupTime(pickupTime: OffsetDateTime) = pickupTime(JsonField.of(pickupTime))

            /**
             * Sets [Builder.pickupTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickupTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickupTime(pickupTime: JsonField<OffsetDateTime>) = apply {
                this.pickupTime = pickupTime
            }

            /**
             * Flag indicating whether post-mission crew rest is applied to the last sortie of a
             * crew's task.
             */
            fun postRestApplied(postRestApplied: Boolean) =
                postRestApplied(JsonField.of(postRestApplied))

            /**
             * Sets [Builder.postRestApplied] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postRestApplied] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postRestApplied(postRestApplied: JsonField<Boolean>) = apply {
                this.postRestApplied = postRestApplied
            }

            /**
             * End time of the crew rest period after the mission, in ISO 8601 UTC format with
             * millisecond precision.
             */
            fun postRestEnd(postRestEnd: OffsetDateTime) = postRestEnd(JsonField.of(postRestEnd))

            /**
             * Sets [Builder.postRestEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postRestEnd] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postRestEnd(postRestEnd: JsonField<OffsetDateTime>) = apply {
                this.postRestEnd = postRestEnd
            }

            /**
             * The scheduled delay or adjustment in the start time of a crew's rest period after a
             * mission, expressed as +/-HH:MM.
             */
            fun postRestOffset(postRestOffset: String) =
                postRestOffset(JsonField.of(postRestOffset))

            /**
             * Sets [Builder.postRestOffset] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postRestOffset] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postRestOffset(postRestOffset: JsonField<String>) = apply {
                this.postRestOffset = postRestOffset
            }

            /**
             * Flag indicating whether pre-mission crew rest is applied to the first sortie of a
             * crew's task.
             */
            fun preRestApplied(preRestApplied: Boolean) =
                preRestApplied(JsonField.of(preRestApplied))

            /**
             * Sets [Builder.preRestApplied] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preRestApplied] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun preRestApplied(preRestApplied: JsonField<Boolean>) = apply {
                this.preRestApplied = preRestApplied
            }

            /**
             * Start time of the crew rest period before the mission, in ISO 8601 UTC format with
             * millisecond precision.
             */
            fun preRestStart(preRestStart: OffsetDateTime) =
                preRestStart(JsonField.of(preRestStart))

            /**
             * Sets [Builder.preRestStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preRestStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun preRestStart(preRestStart: JsonField<OffsetDateTime>) = apply {
                this.preRestStart = preRestStart
            }

            /**
             * Array of qualification codes required for this crew (e.g., AL for Aircraft Leader, CS
             * for Combat Systems Operator, etc.).
             */
            fun reqQualCode(reqQualCode: List<String>) = reqQualCode(JsonField.of(reqQualCode))

            /**
             * Sets [Builder.reqQualCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reqQualCode] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reqQualCode(reqQualCode: JsonField<List<String>>) = apply {
                this.reqQualCode = reqQualCode.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.reqQualCode].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addReqQualCode(reqQualCode: String) = apply {
                this.reqQualCode =
                    (this.reqQualCode ?: JsonField.of(mutableListOf())).also {
                        checkKnown("reqQualCode", it).add(reqQualCode)
                    }
            }

            /** Scheduled return time, in ISO 8601 UTC format with millisecond precision. */
            fun returnTime(returnTime: OffsetDateTime) = returnTime(JsonField.of(returnTime))

            /**
             * Sets [Builder.returnTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun returnTime(returnTime: JsonField<OffsetDateTime>) = apply {
                this.returnTime = returnTime
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
             * The stage 1 qualifications the crew must have for a mission, such as having basic
             * knowledge of crew operations and aircraft systems.
             */
            fun stage1Qual(stage1Qual: String) = stage1Qual(JsonField.of(stage1Qual))

            /**
             * Sets [Builder.stage1Qual] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stage1Qual] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stage1Qual(stage1Qual: JsonField<String>) = apply { this.stage1Qual = stage1Qual }

            /**
             * The stage 2 qualifications the crew must have for a mission, such as completion of
             * advanced mission-specific training.
             */
            fun stage2Qual(stage2Qual: String) = stage2Qual(JsonField.of(stage2Qual))

            /**
             * Sets [Builder.stage2Qual] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stage2Qual] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stage2Qual(stage2Qual: JsonField<String>) = apply { this.stage2Qual = stage2Qual }

            /**
             * The stage 3 qualifications the crew must have for a mission, such as full
             * mission-ready certification and the capability of leading complex operations.
             */
            fun stage3Qual(stage3Qual: String) = stage3Qual(JsonField.of(stage3Qual))

            /**
             * Sets [Builder.stage3Qual] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stage3Qual] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stage3Qual(stage3Qual: JsonField<String>) = apply { this.stage3Qual = stage3Qual }

            /**
             * Stage name for the crew. A stage is a pool of crews supporting a given operation
             * plan.
             */
            fun stageName(stageName: String) = stageName(JsonField.of(stageName))

            /**
             * Sets [Builder.stageName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stageName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stageName(stageName: JsonField<String>) = apply { this.stageName = stageName }

            /**
             * Time the crew entered the stage, in ISO 8601 UTC format with millisecond precision.
             */
            fun stageTime(stageTime: OffsetDateTime) = stageTime(JsonField.of(stageTime))

            /**
             * Sets [Builder.stageTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stageTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stageTime(stageTime: JsonField<OffsetDateTime>) = apply {
                this.stageTime = stageTime
            }

            /**
             * Crew status (e.g. NEEDCREW, ASSIGNED, APPROVED, NOTIFIED, PARTIAL, UNKNOWN, etc.).
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
             * Flag indicating that one or more crew members requires transportation to the
             * departure location.
             */
            fun transportReq(transportReq: Boolean) = transportReq(JsonField.of(transportReq))

            /**
             * Sets [Builder.transportReq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transportReq] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transportReq(transportReq: JsonField<Boolean>) = apply {
                this.transportReq = transportReq
            }

            /**
             * Identifies the trip kit needed by the crew. A trip kit contains charts, regulations,
             * maps, etc. carried by the crew during missions.
             */
            fun tripKit(tripKit: String) = tripKit(JsonField.of(tripKit))

            /**
             * Sets [Builder.tripKit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tripKit] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tripKit(tripKit: JsonField<String>) = apply { this.tripKit = tripKit }

            /** Time the row was updated in the database, auto-populated by the system. */
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

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .origCrewId()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("origCrewId", origCrewId),
                    checkRequired("source", source),
                    id,
                    adjReturnTime,
                    adjReturnTimeApprover,
                    aircraftMds,
                    alertedTime,
                    alertType,
                    armsCrewUnit,
                    (assignedQualCode ?: JsonMissing.of()).map { it.toImmutable() },
                    commanderId,
                    commanderLast4Ssn,
                    commanderName,
                    createdAt,
                    createdBy,
                    crewHome,
                    (crewMembers ?: JsonMissing.of()).map { it.toImmutable() },
                    crewName,
                    crewRms,
                    crewRole,
                    crewSource,
                    crewSquadron,
                    crewType,
                    crewUnit,
                    crewWing,
                    currentIcao,
                    fdpEligType,
                    fdpType,
                    femaleEnlistedQty,
                    femaleOfficerQty,
                    fltAuthNum,
                    idSiteCurrent,
                    idSortie,
                    initStartTime,
                    lastAlertTime,
                    legalAlertTime,
                    legalBravoTime,
                    linkedTask,
                    maleEnlistedQty,
                    maleOfficerQty,
                    missionAlias,
                    missionId,
                    origin,
                    origNetwork,
                    personnelType,
                    pickupTime,
                    postRestApplied,
                    postRestEnd,
                    postRestOffset,
                    preRestApplied,
                    preRestStart,
                    (reqQualCode ?: JsonMissing.of()).map { it.toImmutable() },
                    returnTime,
                    sourceDl,
                    stage1Qual,
                    stage2Qual,
                    stage3Qual,
                    stageName,
                    stageTime,
                    status,
                    transportReq,
                    tripKit,
                    updatedAt,
                    updatedBy,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            origCrewId()
            source()
            id()
            adjReturnTime()
            adjReturnTimeApprover()
            aircraftMds()
            alertedTime()
            alertType()
            armsCrewUnit()
            assignedQualCode()
            commanderId()
            commanderLast4Ssn()
            commanderName()
            createdAt()
            createdBy()
            crewHome()
            crewMembers().ifPresent { it.forEach { it.validate() } }
            crewName()
            crewRms()
            crewRole()
            crewSource()
            crewSquadron()
            crewType()
            crewUnit()
            crewWing()
            currentIcao()
            fdpEligType()
            fdpType()
            femaleEnlistedQty()
            femaleOfficerQty()
            fltAuthNum()
            idSiteCurrent()
            idSortie()
            initStartTime()
            lastAlertTime()
            legalAlertTime()
            legalBravoTime()
            linkedTask()
            maleEnlistedQty()
            maleOfficerQty()
            missionAlias()
            missionId()
            origin()
            origNetwork()
            personnelType()
            pickupTime()
            postRestApplied()
            postRestEnd()
            postRestOffset()
            preRestApplied()
            preRestStart()
            reqQualCode()
            returnTime()
            sourceDl()
            stage1Qual()
            stage2Qual()
            stage3Qual()
            stageName()
            stageTime()
            status()
            transportReq()
            tripKit()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (origCrewId.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (adjReturnTime.asKnown().isPresent) 1 else 0) +
                (if (adjReturnTimeApprover.asKnown().isPresent) 1 else 0) +
                (if (aircraftMds.asKnown().isPresent) 1 else 0) +
                (if (alertedTime.asKnown().isPresent) 1 else 0) +
                (if (alertType.asKnown().isPresent) 1 else 0) +
                (if (armsCrewUnit.asKnown().isPresent) 1 else 0) +
                (assignedQualCode.asKnown().getOrNull()?.size ?: 0) +
                (if (commanderId.asKnown().isPresent) 1 else 0) +
                (if (commanderLast4Ssn.asKnown().isPresent) 1 else 0) +
                (if (commanderName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (crewHome.asKnown().isPresent) 1 else 0) +
                (crewMembers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (crewName.asKnown().isPresent) 1 else 0) +
                (if (crewRms.asKnown().isPresent) 1 else 0) +
                (if (crewRole.asKnown().isPresent) 1 else 0) +
                (if (crewSource.asKnown().isPresent) 1 else 0) +
                (if (crewSquadron.asKnown().isPresent) 1 else 0) +
                (if (crewType.asKnown().isPresent) 1 else 0) +
                (if (crewUnit.asKnown().isPresent) 1 else 0) +
                (if (crewWing.asKnown().isPresent) 1 else 0) +
                (if (currentIcao.asKnown().isPresent) 1 else 0) +
                (if (fdpEligType.asKnown().isPresent) 1 else 0) +
                (if (fdpType.asKnown().isPresent) 1 else 0) +
                (if (femaleEnlistedQty.asKnown().isPresent) 1 else 0) +
                (if (femaleOfficerQty.asKnown().isPresent) 1 else 0) +
                (if (fltAuthNum.asKnown().isPresent) 1 else 0) +
                (if (idSiteCurrent.asKnown().isPresent) 1 else 0) +
                (if (idSortie.asKnown().isPresent) 1 else 0) +
                (if (initStartTime.asKnown().isPresent) 1 else 0) +
                (if (lastAlertTime.asKnown().isPresent) 1 else 0) +
                (if (legalAlertTime.asKnown().isPresent) 1 else 0) +
                (if (legalBravoTime.asKnown().isPresent) 1 else 0) +
                (if (linkedTask.asKnown().isPresent) 1 else 0) +
                (if (maleEnlistedQty.asKnown().isPresent) 1 else 0) +
                (if (maleOfficerQty.asKnown().isPresent) 1 else 0) +
                (if (missionAlias.asKnown().isPresent) 1 else 0) +
                (if (missionId.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (personnelType.asKnown().isPresent) 1 else 0) +
                (if (pickupTime.asKnown().isPresent) 1 else 0) +
                (if (postRestApplied.asKnown().isPresent) 1 else 0) +
                (if (postRestEnd.asKnown().isPresent) 1 else 0) +
                (if (postRestOffset.asKnown().isPresent) 1 else 0) +
                (if (preRestApplied.asKnown().isPresent) 1 else 0) +
                (if (preRestStart.asKnown().isPresent) 1 else 0) +
                (reqQualCode.asKnown().getOrNull()?.size ?: 0) +
                (if (returnTime.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (stage1Qual.asKnown().isPresent) 1 else 0) +
                (if (stage2Qual.asKnown().isPresent) 1 else 0) +
                (if (stage3Qual.asKnown().isPresent) 1 else 0) +
                (if (stageName.asKnown().isPresent) 1 else 0) +
                (if (stageTime.asKnown().isPresent) 1 else 0) +
                (if (status.asKnown().isPresent) 1 else 0) +
                (if (transportReq.asKnown().isPresent) 1 else 0) +
                (if (tripKit.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

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

        /** Schema for Crew Member data. */
        class CrewMember
        private constructor(
            private val alerted: JsonField<Boolean>,
            private val allSortie: JsonField<Boolean>,
            private val approved: JsonField<Boolean>,
            private val attached: JsonField<Boolean>,
            private val branch: JsonField<String>,
            private val civilian: JsonField<Boolean>,
            private val commander: JsonField<Boolean>,
            private val crewPosition: JsonField<String>,
            private val dodId: JsonField<String>,
            private val dutyPosition: JsonField<String>,
            private val dutyStatus: JsonField<String>,
            private val emailed: JsonField<Boolean>,
            private val extraTime: JsonField<Boolean>,
            private val firstName: JsonField<String>,
            private val fltCurrencyExp: JsonField<OffsetDateTime>,
            private val fltCurrencyExpId: JsonField<String>,
            private val fltRecDate: JsonField<OffsetDateTime>,
            private val fltRecDue: JsonField<OffsetDateTime>,
            private val flySquadron: JsonField<String>,
            private val funded: JsonField<Boolean>,
            private val gender: JsonField<String>,
            private val gndCurrencyExp: JsonField<OffsetDateTime>,
            private val gndCurrencyExpId: JsonField<String>,
            private val grounded: JsonField<Boolean>,
            private val guestStart: JsonField<OffsetDateTime>,
            private val guestStop: JsonField<OffsetDateTime>,
            private val last4Ssn: JsonField<String>,
            private val lastFltDate: JsonField<OffsetDateTime>,
            private val lastName: JsonField<String>,
            private val loanedTo: JsonField<String>,
            private val lodging: JsonField<String>,
            private val memberActualAlertTime: JsonField<OffsetDateTime>,
            private val memberAdjReturnTime: JsonField<OffsetDateTime>,
            private val memberAdjReturnTimeApprover: JsonField<String>,
            private val memberId: JsonField<String>,
            private val memberInitStartTime: JsonField<OffsetDateTime>,
            private val memberLastAlertTime: JsonField<OffsetDateTime>,
            private val memberLegalAlertTime: JsonField<OffsetDateTime>,
            private val memberPickupTime: JsonField<OffsetDateTime>,
            private val memberPostRestOffset: JsonField<String>,
            private val memberPostRestTime: JsonField<OffsetDateTime>,
            private val memberPreRestTime: JsonField<OffsetDateTime>,
            private val memberRemarks: JsonField<String>,
            private val memberReturnTime: JsonField<OffsetDateTime>,
            private val memberSchedAlertTime: JsonField<OffsetDateTime>,
            private val memberSource: JsonField<String>,
            private val memberStageName: JsonField<String>,
            private val memberTransportReq: JsonField<Boolean>,
            private val memberType: JsonField<String>,
            private val middleInitial: JsonField<String>,
            private val notified: JsonField<Boolean>,
            private val phoneNumber: JsonField<String>,
            private val physAvCode: JsonField<String>,
            private val physAvStatus: JsonField<String>,
            private val physDue: JsonField<OffsetDateTime>,
            private val rank: JsonField<String>,
            private val remarkCode: JsonField<String>,
            private val rmsMds: JsonField<String>,
            private val showTime: JsonField<OffsetDateTime>,
            private val squadron: JsonField<String>,
            private val trainingDate: JsonField<OffsetDateTime>,
            private val username: JsonField<String>,
            private val wing: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("alerted")
                @ExcludeMissing
                alerted: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("allSortie")
                @ExcludeMissing
                allSortie: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("approved")
                @ExcludeMissing
                approved: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("attached")
                @ExcludeMissing
                attached: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("branch")
                @ExcludeMissing
                branch: JsonField<String> = JsonMissing.of(),
                @JsonProperty("civilian")
                @ExcludeMissing
                civilian: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("commander")
                @ExcludeMissing
                commander: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("crewPosition")
                @ExcludeMissing
                crewPosition: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dodID") @ExcludeMissing dodId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dutyPosition")
                @ExcludeMissing
                dutyPosition: JsonField<String> = JsonMissing.of(),
                @JsonProperty("dutyStatus")
                @ExcludeMissing
                dutyStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("emailed")
                @ExcludeMissing
                emailed: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("extraTime")
                @ExcludeMissing
                extraTime: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("firstName")
                @ExcludeMissing
                firstName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fltCurrencyExp")
                @ExcludeMissing
                fltCurrencyExp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fltCurrencyExpId")
                @ExcludeMissing
                fltCurrencyExpId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fltRecDate")
                @ExcludeMissing
                fltRecDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fltRecDue")
                @ExcludeMissing
                fltRecDue: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("flySquadron")
                @ExcludeMissing
                flySquadron: JsonField<String> = JsonMissing.of(),
                @JsonProperty("funded")
                @ExcludeMissing
                funded: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("gender")
                @ExcludeMissing
                gender: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gndCurrencyExp")
                @ExcludeMissing
                gndCurrencyExp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("gndCurrencyExpId")
                @ExcludeMissing
                gndCurrencyExpId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("grounded")
                @ExcludeMissing
                grounded: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("guestStart")
                @ExcludeMissing
                guestStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("guestStop")
                @ExcludeMissing
                guestStop: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("last4SSN")
                @ExcludeMissing
                last4Ssn: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lastFltDate")
                @ExcludeMissing
                lastFltDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("lastName")
                @ExcludeMissing
                lastName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("loanedTo")
                @ExcludeMissing
                loanedTo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("lodging")
                @ExcludeMissing
                lodging: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberActualAlertTime")
                @ExcludeMissing
                memberActualAlertTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberAdjReturnTime")
                @ExcludeMissing
                memberAdjReturnTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberAdjReturnTimeApprover")
                @ExcludeMissing
                memberAdjReturnTimeApprover: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberId")
                @ExcludeMissing
                memberId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberInitStartTime")
                @ExcludeMissing
                memberInitStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberLastAlertTime")
                @ExcludeMissing
                memberLastAlertTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberLegalAlertTime")
                @ExcludeMissing
                memberLegalAlertTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberPickupTime")
                @ExcludeMissing
                memberPickupTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberPostRestOffset")
                @ExcludeMissing
                memberPostRestOffset: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberPostRestTime")
                @ExcludeMissing
                memberPostRestTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberPreRestTime")
                @ExcludeMissing
                memberPreRestTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberRemarks")
                @ExcludeMissing
                memberRemarks: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberReturnTime")
                @ExcludeMissing
                memberReturnTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberSchedAlertTime")
                @ExcludeMissing
                memberSchedAlertTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("memberSource")
                @ExcludeMissing
                memberSource: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberStageName")
                @ExcludeMissing
                memberStageName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("memberTransportReq")
                @ExcludeMissing
                memberTransportReq: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("memberType")
                @ExcludeMissing
                memberType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("middleInitial")
                @ExcludeMissing
                middleInitial: JsonField<String> = JsonMissing.of(),
                @JsonProperty("notified")
                @ExcludeMissing
                notified: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("physAvCode")
                @ExcludeMissing
                physAvCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("physAvStatus")
                @ExcludeMissing
                physAvStatus: JsonField<String> = JsonMissing.of(),
                @JsonProperty("physDue")
                @ExcludeMissing
                physDue: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("rank") @ExcludeMissing rank: JsonField<String> = JsonMissing.of(),
                @JsonProperty("remarkCode")
                @ExcludeMissing
                remarkCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rmsMDS")
                @ExcludeMissing
                rmsMds: JsonField<String> = JsonMissing.of(),
                @JsonProperty("showTime")
                @ExcludeMissing
                showTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("squadron")
                @ExcludeMissing
                squadron: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trainingDate")
                @ExcludeMissing
                trainingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("username")
                @ExcludeMissing
                username: JsonField<String> = JsonMissing.of(),
                @JsonProperty("wing") @ExcludeMissing wing: JsonField<String> = JsonMissing.of(),
            ) : this(
                alerted,
                allSortie,
                approved,
                attached,
                branch,
                civilian,
                commander,
                crewPosition,
                dodId,
                dutyPosition,
                dutyStatus,
                emailed,
                extraTime,
                firstName,
                fltCurrencyExp,
                fltCurrencyExpId,
                fltRecDate,
                fltRecDue,
                flySquadron,
                funded,
                gender,
                gndCurrencyExp,
                gndCurrencyExpId,
                grounded,
                guestStart,
                guestStop,
                last4Ssn,
                lastFltDate,
                lastName,
                loanedTo,
                lodging,
                memberActualAlertTime,
                memberAdjReturnTime,
                memberAdjReturnTimeApprover,
                memberId,
                memberInitStartTime,
                memberLastAlertTime,
                memberLegalAlertTime,
                memberPickupTime,
                memberPostRestOffset,
                memberPostRestTime,
                memberPreRestTime,
                memberRemarks,
                memberReturnTime,
                memberSchedAlertTime,
                memberSource,
                memberStageName,
                memberTransportReq,
                memberType,
                middleInitial,
                notified,
                phoneNumber,
                physAvCode,
                physAvStatus,
                physDue,
                rank,
                remarkCode,
                rmsMds,
                showTime,
                squadron,
                trainingDate,
                username,
                wing,
                mutableMapOf(),
            )

            /**
             * Flag indicating whether this crew member has been alerted of the associated task.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun alerted(): Optional<Boolean> = alerted.getOptional("alerted")

            /**
             * Flag indicating this crew member is assigned to all sorties of the crew itinerary.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun allSortie(): Optional<Boolean> = allSortie.getOptional("allSortie")

            /**
             * Flag indicating whether this crew member has been approved for the associated task.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun approved(): Optional<Boolean> = approved.getOptional("approved")

            /**
             * Flag indicating whether this crew member is attached to his/her squadron. Crew
             * members that are not attached are considered assigned.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun attached(): Optional<Boolean> = attached.getOptional("attached")

            /**
             * The military branch assignment of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun branch(): Optional<String> = branch.getOptional("branch")

            /**
             * Flag indicating this crew member is a civilian or non-military person.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun civilian(): Optional<Boolean> = civilian.getOptional("civilian")

            /**
             * Flag indicating this person is the aircraft commander.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun commander(): Optional<Boolean> = commander.getOptional("commander")

            /**
             * The crew position of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun crewPosition(): Optional<String> = crewPosition.getOptional("crewPosition")

            /**
             * The crew member's 10-digit DoD ID number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dodId(): Optional<String> = dodId.getOptional("dodID")

            /**
             * The duty position of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dutyPosition(): Optional<String> = dutyPosition.getOptional("dutyPosition")

            /**
             * The current duty status code of this crew member (e.g., AGR for Active Guard and
             * Reserve, IDT for Inactive Duty Training, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun dutyStatus(): Optional<String> = dutyStatus.getOptional("dutyStatus")

            /**
             * Flag indicating whether this crew member has been notified of an event by email.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun emailed(): Optional<Boolean> = emailed.getOptional("emailed")

            /**
             * Flag indicating whether this crew member requires an additional amount of time to
             * report for duty.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun extraTime(): Optional<Boolean> = extraTime.getOptional("extraTime")

            /**
             * The first name of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun firstName(): Optional<String> = firstName.getOptional("firstName")

            /**
             * The earliest flying currency expiration date for this crew member, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fltCurrencyExp(): Optional<OffsetDateTime> =
                fltCurrencyExp.getOptional("fltCurrencyExp")

            /**
             * The training task identifier associated with the flying currency expiration date for
             * this crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fltCurrencyExpId(): Optional<String> =
                fltCurrencyExpId.getOptional("fltCurrencyExpId")

            /**
             * The date this crew member's records review was completed, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fltRecDate(): Optional<OffsetDateTime> = fltRecDate.getOptional("fltRecDate")

            /**
             * The date this crew member's records review is due, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun fltRecDue(): Optional<OffsetDateTime> = fltRecDue.getOptional("fltRecDue")

            /**
             * The flying squadron assignment of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun flySquadron(): Optional<String> = flySquadron.getOptional("flySquadron")

            /**
             * Flag indicating whether this crew member is funded.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun funded(): Optional<Boolean> = funded.getOptional("funded")

            /**
             * Gender of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun gender(): Optional<String> = gender.getOptional("gender")

            /**
             * The earliest ground currency expiration date for this crew member, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun gndCurrencyExp(): Optional<OffsetDateTime> =
                gndCurrencyExp.getOptional("gndCurrencyExp")

            /**
             * The training task identifier associated with the ground currency expiration date for
             * this crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun gndCurrencyExpId(): Optional<String> =
                gndCurrencyExpId.getOptional("gndCurrencyExpId")

            /**
             * Flag indicating whether this crew member is grounded (i.e., his/her duties do not
             * include flying).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun grounded(): Optional<Boolean> = grounded.getOptional("grounded")

            /**
             * Date when this crew member starts acting as guest help for the squadron, in ISO 8601
             * UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun guestStart(): Optional<OffsetDateTime> = guestStart.getOptional("guestStart")

            /**
             * Date when this crew member stops acting as guest help for the squadron, in ISO 8601
             * UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun guestStop(): Optional<OffsetDateTime> = guestStop.getOptional("guestStop")

            /**
             * Last four digits of the crew member's social security number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun last4Ssn(): Optional<String> = last4Ssn.getOptional("last4SSN")

            /**
             * Date of the last flight for this crew member, in ISO 8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lastFltDate(): Optional<OffsetDateTime> = lastFltDate.getOptional("lastFltDate")

            /**
             * The last name of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lastName(): Optional<String> = lastName.getOptional("lastName")

            /**
             * The squadron the crew member has been temporarily loaned to.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun loanedTo(): Optional<String> = loanedTo.getOptional("loanedTo")

            /**
             * Crew member lodging location.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun lodging(): Optional<String> = lodging.getOptional("lodging")

            /**
             * Time this crew member was actually alerted for the mission, in ISO 8601 UTC format
             * with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberActualAlertTime(): Optional<OffsetDateTime> =
                memberActualAlertTime.getOptional("memberActualAlertTime")

            /**
             * Adjusted return time for the crew member, in ISO 8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberAdjReturnTime(): Optional<OffsetDateTime> =
                memberAdjReturnTime.getOptional("memberAdjReturnTime")

            /**
             * Last name of the crew member's adjusted return time approver.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberAdjReturnTimeApprover(): Optional<String> =
                memberAdjReturnTimeApprover.getOptional("memberAdjReturnTimeApprover")

            /**
             * Unique identifier of the crew member assigned by the originating source.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberId(): Optional<String> = memberId.getOptional("memberId")

            /**
             * Initial start time of the crew member's linked task that was delinked due to mission
             * closure, in ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberInitStartTime(): Optional<OffsetDateTime> =
                memberInitStartTime.getOptional("memberInitStartTime")

            /**
             * The latest possible time the crew member can legally be alerted for a task, in ISO
             * 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberLastAlertTime(): Optional<OffsetDateTime> =
                memberLastAlertTime.getOptional("memberLastAlertTime")

            /**
             * Time this crew member becomes eligible to be alerted for the mission, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberLegalAlertTime(): Optional<OffsetDateTime> =
                memberLegalAlertTime.getOptional("memberLegalAlertTime")

            /**
             * Time this crew member will be picked up from lodging, in ISO 8601 UTC format with
             * millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberPickupTime(): Optional<OffsetDateTime> =
                memberPickupTime.getOptional("memberPickupTime")

            /**
             * The scheduled delay or adjustment in the start time of a crew member's rest period
             * after a mission, expressed as +/-HH:MM.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberPostRestOffset(): Optional<String> =
                memberPostRestOffset.getOptional("memberPostRestOffset")

            /**
             * End time of this crew member's rest period after the mission, in ISO 8601 UTC format
             * with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberPostRestTime(): Optional<OffsetDateTime> =
                memberPostRestTime.getOptional("memberPostRestTime")

            /**
             * Start time of this crew member's rest period before the mission, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberPreRestTime(): Optional<OffsetDateTime> =
                memberPreRestTime.getOptional("memberPreRestTime")

            /**
             * Remarks concerning the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberRemarks(): Optional<String> = memberRemarks.getOptional("memberRemarks")

            /**
             * Scheduled return time for this crew member, in ISO 8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberReturnTime(): Optional<OffsetDateTime> =
                memberReturnTime.getOptional("memberReturnTime")

            /**
             * Time this crew member is scheduled to be alerted for the mission, in ISO 8601 UTC
             * format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberSchedAlertTime(): Optional<OffsetDateTime> =
                memberSchedAlertTime.getOptional("memberSchedAlertTime")

            /**
             * The military component for the crew member (e.g., ACTIVE, RESERVE, GUARD, UNKNOWN,
             * etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberSource(): Optional<String> = memberSource.getOptional("memberSource")

            /**
             * Stage name for the crew member. A stage is a pool of crews supporting a given
             * operation plan.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberStageName(): Optional<String> = memberStageName.getOptional("memberStageName")

            /**
             * Flag indicating whether this crew member needs transportation to the departure
             * location.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberTransportReq(): Optional<Boolean> =
                memberTransportReq.getOptional("memberTransportReq")

            /**
             * Amplifying details about the crew member type (e.g. RAVEN, FCC, COMCAM, AIRCREW, MEP,
             * OTHER, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun memberType(): Optional<String> = memberType.getOptional("memberType")

            /**
             * The middle initial of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun middleInitial(): Optional<String> = middleInitial.getOptional("middleInitial")

            /**
             * Flag indicating whether this crew member has been notified of an event.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun notified(): Optional<Boolean> = notified.getOptional("notified")

            /**
             * Crew member lodging phone number.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phoneNumber")

            /**
             * Code indicating a crew member's current physical fitness status and whether they are
             * medically cleared to fly (e.g., D for Duties Not Including Flying, E for Physical
             * Overdue, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun physAvCode(): Optional<String> = physAvCode.getOptional("physAvCode")

            /**
             * Code indicating a crew member's physical availabiility status (e.g., DISQUALIFIED,
             * OVERDUE, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun physAvStatus(): Optional<String> = physAvStatus.getOptional("physAvStatus")

            /**
             * Due date for the crew member's physical, in ISO 8601 UTC format with millisecond
             * precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun physDue(): Optional<OffsetDateTime> = physDue.getOptional("physDue")

            /**
             * The rank of the crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rank(): Optional<String> = rank.getOptional("rank")

            /**
             * Remark code used to designate attributes of this crew member. For more information,
             * contact the provider source.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun remarkCode(): Optional<String> = remarkCode.getOptional("remarkCode")

            /**
             * The primary aircraft type for the crew member according to the personnel resource
             * management system indicated in the crewRMS field.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun rmsMds(): Optional<String> = rmsMds.getOptional("rmsMDS")

            /**
             * Time this crew member is required to report for duty before this flight/mission, in
             * ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun showTime(): Optional<OffsetDateTime> = showTime.getOptional("showTime")

            /**
             * The squadron the crew member serves.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun squadron(): Optional<String> = squadron.getOptional("squadron")

            /**
             * The date this crew member accomplished physiological or altitude chamber training, in
             * ISO 8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun trainingDate(): Optional<OffsetDateTime> = trainingDate.getOptional("trainingDate")

            /**
             * The Mattermost username of this crew member.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun username(): Optional<String> = username.getOptional("username")

            /**
             * The wing the crew member serves.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun wing(): Optional<String> = wing.getOptional("wing")

            /**
             * Returns the raw JSON value of [alerted].
             *
             * Unlike [alerted], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alerted") @ExcludeMissing fun _alerted(): JsonField<Boolean> = alerted

            /**
             * Returns the raw JSON value of [allSortie].
             *
             * Unlike [allSortie], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("allSortie")
            @ExcludeMissing
            fun _allSortie(): JsonField<Boolean> = allSortie

            /**
             * Returns the raw JSON value of [approved].
             *
             * Unlike [approved], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("approved") @ExcludeMissing fun _approved(): JsonField<Boolean> = approved

            /**
             * Returns the raw JSON value of [attached].
             *
             * Unlike [attached], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attached") @ExcludeMissing fun _attached(): JsonField<Boolean> = attached

            /**
             * Returns the raw JSON value of [branch].
             *
             * Unlike [branch], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("branch") @ExcludeMissing fun _branch(): JsonField<String> = branch

            /**
             * Returns the raw JSON value of [civilian].
             *
             * Unlike [civilian], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("civilian") @ExcludeMissing fun _civilian(): JsonField<Boolean> = civilian

            /**
             * Returns the raw JSON value of [commander].
             *
             * Unlike [commander], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("commander")
            @ExcludeMissing
            fun _commander(): JsonField<Boolean> = commander

            /**
             * Returns the raw JSON value of [crewPosition].
             *
             * Unlike [crewPosition], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("crewPosition")
            @ExcludeMissing
            fun _crewPosition(): JsonField<String> = crewPosition

            /**
             * Returns the raw JSON value of [dodId].
             *
             * Unlike [dodId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("dodID") @ExcludeMissing fun _dodId(): JsonField<String> = dodId

            /**
             * Returns the raw JSON value of [dutyPosition].
             *
             * Unlike [dutyPosition], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dutyPosition")
            @ExcludeMissing
            fun _dutyPosition(): JsonField<String> = dutyPosition

            /**
             * Returns the raw JSON value of [dutyStatus].
             *
             * Unlike [dutyStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dutyStatus")
            @ExcludeMissing
            fun _dutyStatus(): JsonField<String> = dutyStatus

            /**
             * Returns the raw JSON value of [emailed].
             *
             * Unlike [emailed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("emailed") @ExcludeMissing fun _emailed(): JsonField<Boolean> = emailed

            /**
             * Returns the raw JSON value of [extraTime].
             *
             * Unlike [extraTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("extraTime")
            @ExcludeMissing
            fun _extraTime(): JsonField<Boolean> = extraTime

            /**
             * Returns the raw JSON value of [firstName].
             *
             * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("firstName")
            @ExcludeMissing
            fun _firstName(): JsonField<String> = firstName

            /**
             * Returns the raw JSON value of [fltCurrencyExp].
             *
             * Unlike [fltCurrencyExp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fltCurrencyExp")
            @ExcludeMissing
            fun _fltCurrencyExp(): JsonField<OffsetDateTime> = fltCurrencyExp

            /**
             * Returns the raw JSON value of [fltCurrencyExpId].
             *
             * Unlike [fltCurrencyExpId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("fltCurrencyExpId")
            @ExcludeMissing
            fun _fltCurrencyExpId(): JsonField<String> = fltCurrencyExpId

            /**
             * Returns the raw JSON value of [fltRecDate].
             *
             * Unlike [fltRecDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fltRecDate")
            @ExcludeMissing
            fun _fltRecDate(): JsonField<OffsetDateTime> = fltRecDate

            /**
             * Returns the raw JSON value of [fltRecDue].
             *
             * Unlike [fltRecDue], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fltRecDue")
            @ExcludeMissing
            fun _fltRecDue(): JsonField<OffsetDateTime> = fltRecDue

            /**
             * Returns the raw JSON value of [flySquadron].
             *
             * Unlike [flySquadron], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("flySquadron")
            @ExcludeMissing
            fun _flySquadron(): JsonField<String> = flySquadron

            /**
             * Returns the raw JSON value of [funded].
             *
             * Unlike [funded], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("funded") @ExcludeMissing fun _funded(): JsonField<Boolean> = funded

            /**
             * Returns the raw JSON value of [gender].
             *
             * Unlike [gender], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("gender") @ExcludeMissing fun _gender(): JsonField<String> = gender

            /**
             * Returns the raw JSON value of [gndCurrencyExp].
             *
             * Unlike [gndCurrencyExp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("gndCurrencyExp")
            @ExcludeMissing
            fun _gndCurrencyExp(): JsonField<OffsetDateTime> = gndCurrencyExp

            /**
             * Returns the raw JSON value of [gndCurrencyExpId].
             *
             * Unlike [gndCurrencyExpId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("gndCurrencyExpId")
            @ExcludeMissing
            fun _gndCurrencyExpId(): JsonField<String> = gndCurrencyExpId

            /**
             * Returns the raw JSON value of [grounded].
             *
             * Unlike [grounded], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grounded") @ExcludeMissing fun _grounded(): JsonField<Boolean> = grounded

            /**
             * Returns the raw JSON value of [guestStart].
             *
             * Unlike [guestStart], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("guestStart")
            @ExcludeMissing
            fun _guestStart(): JsonField<OffsetDateTime> = guestStart

            /**
             * Returns the raw JSON value of [guestStop].
             *
             * Unlike [guestStop], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("guestStop")
            @ExcludeMissing
            fun _guestStop(): JsonField<OffsetDateTime> = guestStop

            /**
             * Returns the raw JSON value of [last4Ssn].
             *
             * Unlike [last4Ssn], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("last4SSN") @ExcludeMissing fun _last4Ssn(): JsonField<String> = last4Ssn

            /**
             * Returns the raw JSON value of [lastFltDate].
             *
             * Unlike [lastFltDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lastFltDate")
            @ExcludeMissing
            fun _lastFltDate(): JsonField<OffsetDateTime> = lastFltDate

            /**
             * Returns the raw JSON value of [lastName].
             *
             * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

            /**
             * Returns the raw JSON value of [loanedTo].
             *
             * Unlike [loanedTo], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("loanedTo") @ExcludeMissing fun _loanedTo(): JsonField<String> = loanedTo

            /**
             * Returns the raw JSON value of [lodging].
             *
             * Unlike [lodging], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("lodging") @ExcludeMissing fun _lodging(): JsonField<String> = lodging

            /**
             * Returns the raw JSON value of [memberActualAlertTime].
             *
             * Unlike [memberActualAlertTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberActualAlertTime")
            @ExcludeMissing
            fun _memberActualAlertTime(): JsonField<OffsetDateTime> = memberActualAlertTime

            /**
             * Returns the raw JSON value of [memberAdjReturnTime].
             *
             * Unlike [memberAdjReturnTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberAdjReturnTime")
            @ExcludeMissing
            fun _memberAdjReturnTime(): JsonField<OffsetDateTime> = memberAdjReturnTime

            /**
             * Returns the raw JSON value of [memberAdjReturnTimeApprover].
             *
             * Unlike [memberAdjReturnTimeApprover], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("memberAdjReturnTimeApprover")
            @ExcludeMissing
            fun _memberAdjReturnTimeApprover(): JsonField<String> = memberAdjReturnTimeApprover

            /**
             * Returns the raw JSON value of [memberId].
             *
             * Unlike [memberId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("memberId") @ExcludeMissing fun _memberId(): JsonField<String> = memberId

            /**
             * Returns the raw JSON value of [memberInitStartTime].
             *
             * Unlike [memberInitStartTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberInitStartTime")
            @ExcludeMissing
            fun _memberInitStartTime(): JsonField<OffsetDateTime> = memberInitStartTime

            /**
             * Returns the raw JSON value of [memberLastAlertTime].
             *
             * Unlike [memberLastAlertTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberLastAlertTime")
            @ExcludeMissing
            fun _memberLastAlertTime(): JsonField<OffsetDateTime> = memberLastAlertTime

            /**
             * Returns the raw JSON value of [memberLegalAlertTime].
             *
             * Unlike [memberLegalAlertTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberLegalAlertTime")
            @ExcludeMissing
            fun _memberLegalAlertTime(): JsonField<OffsetDateTime> = memberLegalAlertTime

            /**
             * Returns the raw JSON value of [memberPickupTime].
             *
             * Unlike [memberPickupTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberPickupTime")
            @ExcludeMissing
            fun _memberPickupTime(): JsonField<OffsetDateTime> = memberPickupTime

            /**
             * Returns the raw JSON value of [memberPostRestOffset].
             *
             * Unlike [memberPostRestOffset], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberPostRestOffset")
            @ExcludeMissing
            fun _memberPostRestOffset(): JsonField<String> = memberPostRestOffset

            /**
             * Returns the raw JSON value of [memberPostRestTime].
             *
             * Unlike [memberPostRestTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberPostRestTime")
            @ExcludeMissing
            fun _memberPostRestTime(): JsonField<OffsetDateTime> = memberPostRestTime

            /**
             * Returns the raw JSON value of [memberPreRestTime].
             *
             * Unlike [memberPreRestTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberPreRestTime")
            @ExcludeMissing
            fun _memberPreRestTime(): JsonField<OffsetDateTime> = memberPreRestTime

            /**
             * Returns the raw JSON value of [memberRemarks].
             *
             * Unlike [memberRemarks], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("memberRemarks")
            @ExcludeMissing
            fun _memberRemarks(): JsonField<String> = memberRemarks

            /**
             * Returns the raw JSON value of [memberReturnTime].
             *
             * Unlike [memberReturnTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberReturnTime")
            @ExcludeMissing
            fun _memberReturnTime(): JsonField<OffsetDateTime> = memberReturnTime

            /**
             * Returns the raw JSON value of [memberSchedAlertTime].
             *
             * Unlike [memberSchedAlertTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberSchedAlertTime")
            @ExcludeMissing
            fun _memberSchedAlertTime(): JsonField<OffsetDateTime> = memberSchedAlertTime

            /**
             * Returns the raw JSON value of [memberSource].
             *
             * Unlike [memberSource], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("memberSource")
            @ExcludeMissing
            fun _memberSource(): JsonField<String> = memberSource

            /**
             * Returns the raw JSON value of [memberStageName].
             *
             * Unlike [memberStageName], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberStageName")
            @ExcludeMissing
            fun _memberStageName(): JsonField<String> = memberStageName

            /**
             * Returns the raw JSON value of [memberTransportReq].
             *
             * Unlike [memberTransportReq], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("memberTransportReq")
            @ExcludeMissing
            fun _memberTransportReq(): JsonField<Boolean> = memberTransportReq

            /**
             * Returns the raw JSON value of [memberType].
             *
             * Unlike [memberType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("memberType")
            @ExcludeMissing
            fun _memberType(): JsonField<String> = memberType

            /**
             * Returns the raw JSON value of [middleInitial].
             *
             * Unlike [middleInitial], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("middleInitial")
            @ExcludeMissing
            fun _middleInitial(): JsonField<String> = middleInitial

            /**
             * Returns the raw JSON value of [notified].
             *
             * Unlike [notified], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("notified") @ExcludeMissing fun _notified(): JsonField<Boolean> = notified

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

            /**
             * Returns the raw JSON value of [physAvCode].
             *
             * Unlike [physAvCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("physAvCode")
            @ExcludeMissing
            fun _physAvCode(): JsonField<String> = physAvCode

            /**
             * Returns the raw JSON value of [physAvStatus].
             *
             * Unlike [physAvStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("physAvStatus")
            @ExcludeMissing
            fun _physAvStatus(): JsonField<String> = physAvStatus

            /**
             * Returns the raw JSON value of [physDue].
             *
             * Unlike [physDue], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("physDue")
            @ExcludeMissing
            fun _physDue(): JsonField<OffsetDateTime> = physDue

            /**
             * Returns the raw JSON value of [rank].
             *
             * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<String> = rank

            /**
             * Returns the raw JSON value of [remarkCode].
             *
             * Unlike [remarkCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("remarkCode")
            @ExcludeMissing
            fun _remarkCode(): JsonField<String> = remarkCode

            /**
             * Returns the raw JSON value of [rmsMds].
             *
             * Unlike [rmsMds], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rmsMDS") @ExcludeMissing fun _rmsMds(): JsonField<String> = rmsMds

            /**
             * Returns the raw JSON value of [showTime].
             *
             * Unlike [showTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("showTime")
            @ExcludeMissing
            fun _showTime(): JsonField<OffsetDateTime> = showTime

            /**
             * Returns the raw JSON value of [squadron].
             *
             * Unlike [squadron], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("squadron") @ExcludeMissing fun _squadron(): JsonField<String> = squadron

            /**
             * Returns the raw JSON value of [trainingDate].
             *
             * Unlike [trainingDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trainingDate")
            @ExcludeMissing
            fun _trainingDate(): JsonField<OffsetDateTime> = trainingDate

            /**
             * Returns the raw JSON value of [username].
             *
             * Unlike [username], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

            /**
             * Returns the raw JSON value of [wing].
             *
             * Unlike [wing], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("wing") @ExcludeMissing fun _wing(): JsonField<String> = wing

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

                /** Returns a mutable builder for constructing an instance of [CrewMember]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CrewMember]. */
            class Builder internal constructor() {

                private var alerted: JsonField<Boolean> = JsonMissing.of()
                private var allSortie: JsonField<Boolean> = JsonMissing.of()
                private var approved: JsonField<Boolean> = JsonMissing.of()
                private var attached: JsonField<Boolean> = JsonMissing.of()
                private var branch: JsonField<String> = JsonMissing.of()
                private var civilian: JsonField<Boolean> = JsonMissing.of()
                private var commander: JsonField<Boolean> = JsonMissing.of()
                private var crewPosition: JsonField<String> = JsonMissing.of()
                private var dodId: JsonField<String> = JsonMissing.of()
                private var dutyPosition: JsonField<String> = JsonMissing.of()
                private var dutyStatus: JsonField<String> = JsonMissing.of()
                private var emailed: JsonField<Boolean> = JsonMissing.of()
                private var extraTime: JsonField<Boolean> = JsonMissing.of()
                private var firstName: JsonField<String> = JsonMissing.of()
                private var fltCurrencyExp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fltCurrencyExpId: JsonField<String> = JsonMissing.of()
                private var fltRecDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fltRecDue: JsonField<OffsetDateTime> = JsonMissing.of()
                private var flySquadron: JsonField<String> = JsonMissing.of()
                private var funded: JsonField<Boolean> = JsonMissing.of()
                private var gender: JsonField<String> = JsonMissing.of()
                private var gndCurrencyExp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var gndCurrencyExpId: JsonField<String> = JsonMissing.of()
                private var grounded: JsonField<Boolean> = JsonMissing.of()
                private var guestStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var guestStop: JsonField<OffsetDateTime> = JsonMissing.of()
                private var last4Ssn: JsonField<String> = JsonMissing.of()
                private var lastFltDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var lastName: JsonField<String> = JsonMissing.of()
                private var loanedTo: JsonField<String> = JsonMissing.of()
                private var lodging: JsonField<String> = JsonMissing.of()
                private var memberActualAlertTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberAdjReturnTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberAdjReturnTimeApprover: JsonField<String> = JsonMissing.of()
                private var memberId: JsonField<String> = JsonMissing.of()
                private var memberInitStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberLastAlertTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberLegalAlertTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberPickupTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberPostRestOffset: JsonField<String> = JsonMissing.of()
                private var memberPostRestTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberPreRestTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberRemarks: JsonField<String> = JsonMissing.of()
                private var memberReturnTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberSchedAlertTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var memberSource: JsonField<String> = JsonMissing.of()
                private var memberStageName: JsonField<String> = JsonMissing.of()
                private var memberTransportReq: JsonField<Boolean> = JsonMissing.of()
                private var memberType: JsonField<String> = JsonMissing.of()
                private var middleInitial: JsonField<String> = JsonMissing.of()
                private var notified: JsonField<Boolean> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var physAvCode: JsonField<String> = JsonMissing.of()
                private var physAvStatus: JsonField<String> = JsonMissing.of()
                private var physDue: JsonField<OffsetDateTime> = JsonMissing.of()
                private var rank: JsonField<String> = JsonMissing.of()
                private var remarkCode: JsonField<String> = JsonMissing.of()
                private var rmsMds: JsonField<String> = JsonMissing.of()
                private var showTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var squadron: JsonField<String> = JsonMissing.of()
                private var trainingDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var username: JsonField<String> = JsonMissing.of()
                private var wing: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(crewMember: CrewMember) = apply {
                    alerted = crewMember.alerted
                    allSortie = crewMember.allSortie
                    approved = crewMember.approved
                    attached = crewMember.attached
                    branch = crewMember.branch
                    civilian = crewMember.civilian
                    commander = crewMember.commander
                    crewPosition = crewMember.crewPosition
                    dodId = crewMember.dodId
                    dutyPosition = crewMember.dutyPosition
                    dutyStatus = crewMember.dutyStatus
                    emailed = crewMember.emailed
                    extraTime = crewMember.extraTime
                    firstName = crewMember.firstName
                    fltCurrencyExp = crewMember.fltCurrencyExp
                    fltCurrencyExpId = crewMember.fltCurrencyExpId
                    fltRecDate = crewMember.fltRecDate
                    fltRecDue = crewMember.fltRecDue
                    flySquadron = crewMember.flySquadron
                    funded = crewMember.funded
                    gender = crewMember.gender
                    gndCurrencyExp = crewMember.gndCurrencyExp
                    gndCurrencyExpId = crewMember.gndCurrencyExpId
                    grounded = crewMember.grounded
                    guestStart = crewMember.guestStart
                    guestStop = crewMember.guestStop
                    last4Ssn = crewMember.last4Ssn
                    lastFltDate = crewMember.lastFltDate
                    lastName = crewMember.lastName
                    loanedTo = crewMember.loanedTo
                    lodging = crewMember.lodging
                    memberActualAlertTime = crewMember.memberActualAlertTime
                    memberAdjReturnTime = crewMember.memberAdjReturnTime
                    memberAdjReturnTimeApprover = crewMember.memberAdjReturnTimeApprover
                    memberId = crewMember.memberId
                    memberInitStartTime = crewMember.memberInitStartTime
                    memberLastAlertTime = crewMember.memberLastAlertTime
                    memberLegalAlertTime = crewMember.memberLegalAlertTime
                    memberPickupTime = crewMember.memberPickupTime
                    memberPostRestOffset = crewMember.memberPostRestOffset
                    memberPostRestTime = crewMember.memberPostRestTime
                    memberPreRestTime = crewMember.memberPreRestTime
                    memberRemarks = crewMember.memberRemarks
                    memberReturnTime = crewMember.memberReturnTime
                    memberSchedAlertTime = crewMember.memberSchedAlertTime
                    memberSource = crewMember.memberSource
                    memberStageName = crewMember.memberStageName
                    memberTransportReq = crewMember.memberTransportReq
                    memberType = crewMember.memberType
                    middleInitial = crewMember.middleInitial
                    notified = crewMember.notified
                    phoneNumber = crewMember.phoneNumber
                    physAvCode = crewMember.physAvCode
                    physAvStatus = crewMember.physAvStatus
                    physDue = crewMember.physDue
                    rank = crewMember.rank
                    remarkCode = crewMember.remarkCode
                    rmsMds = crewMember.rmsMds
                    showTime = crewMember.showTime
                    squadron = crewMember.squadron
                    trainingDate = crewMember.trainingDate
                    username = crewMember.username
                    wing = crewMember.wing
                    additionalProperties = crewMember.additionalProperties.toMutableMap()
                }

                /**
                 * Flag indicating whether this crew member has been alerted of the associated task.
                 */
                fun alerted(alerted: Boolean) = alerted(JsonField.of(alerted))

                /**
                 * Sets [Builder.alerted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alerted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun alerted(alerted: JsonField<Boolean>) = apply { this.alerted = alerted }

                /**
                 * Flag indicating this crew member is assigned to all sorties of the crew
                 * itinerary.
                 */
                fun allSortie(allSortie: Boolean) = allSortie(JsonField.of(allSortie))

                /**
                 * Sets [Builder.allSortie] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.allSortie] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun allSortie(allSortie: JsonField<Boolean>) = apply { this.allSortie = allSortie }

                /**
                 * Flag indicating whether this crew member has been approved for the associated
                 * task.
                 */
                fun approved(approved: Boolean) = approved(JsonField.of(approved))

                /**
                 * Sets [Builder.approved] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.approved] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun approved(approved: JsonField<Boolean>) = apply { this.approved = approved }

                /**
                 * Flag indicating whether this crew member is attached to his/her squadron. Crew
                 * members that are not attached are considered assigned.
                 */
                fun attached(attached: Boolean) = attached(JsonField.of(attached))

                /**
                 * Sets [Builder.attached] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attached] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attached(attached: JsonField<Boolean>) = apply { this.attached = attached }

                /** The military branch assignment of the crew member. */
                fun branch(branch: String) = branch(JsonField.of(branch))

                /**
                 * Sets [Builder.branch] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.branch] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun branch(branch: JsonField<String>) = apply { this.branch = branch }

                /** Flag indicating this crew member is a civilian or non-military person. */
                fun civilian(civilian: Boolean) = civilian(JsonField.of(civilian))

                /**
                 * Sets [Builder.civilian] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.civilian] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun civilian(civilian: JsonField<Boolean>) = apply { this.civilian = civilian }

                /** Flag indicating this person is the aircraft commander. */
                fun commander(commander: Boolean) = commander(JsonField.of(commander))

                /**
                 * Sets [Builder.commander] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commander] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun commander(commander: JsonField<Boolean>) = apply { this.commander = commander }

                /** The crew position of the crew member. */
                fun crewPosition(crewPosition: String) = crewPosition(JsonField.of(crewPosition))

                /**
                 * Sets [Builder.crewPosition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.crewPosition] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun crewPosition(crewPosition: JsonField<String>) = apply {
                    this.crewPosition = crewPosition
                }

                /** The crew member's 10-digit DoD ID number. */
                fun dodId(dodId: String) = dodId(JsonField.of(dodId))

                /**
                 * Sets [Builder.dodId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dodId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun dodId(dodId: JsonField<String>) = apply { this.dodId = dodId }

                /** The duty position of the crew member. */
                fun dutyPosition(dutyPosition: String) = dutyPosition(JsonField.of(dutyPosition))

                /**
                 * Sets [Builder.dutyPosition] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dutyPosition] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dutyPosition(dutyPosition: JsonField<String>) = apply {
                    this.dutyPosition = dutyPosition
                }

                /**
                 * The current duty status code of this crew member (e.g., AGR for Active Guard and
                 * Reserve, IDT for Inactive Duty Training, etc.).
                 */
                fun dutyStatus(dutyStatus: String) = dutyStatus(JsonField.of(dutyStatus))

                /**
                 * Sets [Builder.dutyStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.dutyStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun dutyStatus(dutyStatus: JsonField<String>) = apply {
                    this.dutyStatus = dutyStatus
                }

                /**
                 * Flag indicating whether this crew member has been notified of an event by email.
                 */
                fun emailed(emailed: Boolean) = emailed(JsonField.of(emailed))

                /**
                 * Sets [Builder.emailed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.emailed] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun emailed(emailed: JsonField<Boolean>) = apply { this.emailed = emailed }

                /**
                 * Flag indicating whether this crew member requires an additional amount of time to
                 * report for duty.
                 */
                fun extraTime(extraTime: Boolean) = extraTime(JsonField.of(extraTime))

                /**
                 * Sets [Builder.extraTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extraTime] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun extraTime(extraTime: JsonField<Boolean>) = apply { this.extraTime = extraTime }

                /** The first name of the crew member. */
                fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                /**
                 * Sets [Builder.firstName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.firstName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

                /**
                 * The earliest flying currency expiration date for this crew member, in ISO 8601
                 * UTC format with millisecond precision.
                 */
                fun fltCurrencyExp(fltCurrencyExp: OffsetDateTime) =
                    fltCurrencyExp(JsonField.of(fltCurrencyExp))

                /**
                 * Sets [Builder.fltCurrencyExp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltCurrencyExp] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun fltCurrencyExp(fltCurrencyExp: JsonField<OffsetDateTime>) = apply {
                    this.fltCurrencyExp = fltCurrencyExp
                }

                /**
                 * The training task identifier associated with the flying currency expiration date
                 * for this crew member.
                 */
                fun fltCurrencyExpId(fltCurrencyExpId: String) =
                    fltCurrencyExpId(JsonField.of(fltCurrencyExpId))

                /**
                 * Sets [Builder.fltCurrencyExpId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltCurrencyExpId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fltCurrencyExpId(fltCurrencyExpId: JsonField<String>) = apply {
                    this.fltCurrencyExpId = fltCurrencyExpId
                }

                /**
                 * The date this crew member's records review was completed, in ISO 8601 UTC format
                 * with millisecond precision.
                 */
                fun fltRecDate(fltRecDate: OffsetDateTime) = fltRecDate(JsonField.of(fltRecDate))

                /**
                 * Sets [Builder.fltRecDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltRecDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fltRecDate(fltRecDate: JsonField<OffsetDateTime>) = apply {
                    this.fltRecDate = fltRecDate
                }

                /**
                 * The date this crew member's records review is due, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun fltRecDue(fltRecDue: OffsetDateTime) = fltRecDue(JsonField.of(fltRecDue))

                /**
                 * Sets [Builder.fltRecDue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltRecDue] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun fltRecDue(fltRecDue: JsonField<OffsetDateTime>) = apply {
                    this.fltRecDue = fltRecDue
                }

                /** The flying squadron assignment of the crew member. */
                fun flySquadron(flySquadron: String) = flySquadron(JsonField.of(flySquadron))

                /**
                 * Sets [Builder.flySquadron] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.flySquadron] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun flySquadron(flySquadron: JsonField<String>) = apply {
                    this.flySquadron = flySquadron
                }

                /** Flag indicating whether this crew member is funded. */
                fun funded(funded: Boolean) = funded(JsonField.of(funded))

                /**
                 * Sets [Builder.funded] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.funded] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun funded(funded: JsonField<Boolean>) = apply { this.funded = funded }

                /** Gender of the crew member. */
                fun gender(gender: String) = gender(JsonField.of(gender))

                /**
                 * Sets [Builder.gender] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gender] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gender(gender: JsonField<String>) = apply { this.gender = gender }

                /**
                 * The earliest ground currency expiration date for this crew member, in ISO 8601
                 * UTC format with millisecond precision.
                 */
                fun gndCurrencyExp(gndCurrencyExp: OffsetDateTime) =
                    gndCurrencyExp(JsonField.of(gndCurrencyExp))

                /**
                 * Sets [Builder.gndCurrencyExp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gndCurrencyExp] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun gndCurrencyExp(gndCurrencyExp: JsonField<OffsetDateTime>) = apply {
                    this.gndCurrencyExp = gndCurrencyExp
                }

                /**
                 * The training task identifier associated with the ground currency expiration date
                 * for this crew member.
                 */
                fun gndCurrencyExpId(gndCurrencyExpId: String) =
                    gndCurrencyExpId(JsonField.of(gndCurrencyExpId))

                /**
                 * Sets [Builder.gndCurrencyExpId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gndCurrencyExpId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun gndCurrencyExpId(gndCurrencyExpId: JsonField<String>) = apply {
                    this.gndCurrencyExpId = gndCurrencyExpId
                }

                /**
                 * Flag indicating whether this crew member is grounded (i.e., his/her duties do not
                 * include flying).
                 */
                fun grounded(grounded: Boolean) = grounded(JsonField.of(grounded))

                /**
                 * Sets [Builder.grounded] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.grounded] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun grounded(grounded: JsonField<Boolean>) = apply { this.grounded = grounded }

                /**
                 * Date when this crew member starts acting as guest help for the squadron, in ISO
                 * 8601 UTC format with millisecond precision.
                 */
                fun guestStart(guestStart: OffsetDateTime) = guestStart(JsonField.of(guestStart))

                /**
                 * Sets [Builder.guestStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guestStart] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun guestStart(guestStart: JsonField<OffsetDateTime>) = apply {
                    this.guestStart = guestStart
                }

                /**
                 * Date when this crew member stops acting as guest help for the squadron, in ISO
                 * 8601 UTC format with millisecond precision.
                 */
                fun guestStop(guestStop: OffsetDateTime) = guestStop(JsonField.of(guestStop))

                /**
                 * Sets [Builder.guestStop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.guestStop] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun guestStop(guestStop: JsonField<OffsetDateTime>) = apply {
                    this.guestStop = guestStop
                }

                /** Last four digits of the crew member's social security number. */
                fun last4Ssn(last4Ssn: String) = last4Ssn(JsonField.of(last4Ssn))

                /**
                 * Sets [Builder.last4Ssn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.last4Ssn] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun last4Ssn(last4Ssn: JsonField<String>) = apply { this.last4Ssn = last4Ssn }

                /**
                 * Date of the last flight for this crew member, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun lastFltDate(lastFltDate: OffsetDateTime) =
                    lastFltDate(JsonField.of(lastFltDate))

                /**
                 * Sets [Builder.lastFltDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastFltDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun lastFltDate(lastFltDate: JsonField<OffsetDateTime>) = apply {
                    this.lastFltDate = lastFltDate
                }

                /** The last name of the crew member. */
                fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                /**
                 * Sets [Builder.lastName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lastName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                /** The squadron the crew member has been temporarily loaned to. */
                fun loanedTo(loanedTo: String) = loanedTo(JsonField.of(loanedTo))

                /**
                 * Sets [Builder.loanedTo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.loanedTo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun loanedTo(loanedTo: JsonField<String>) = apply { this.loanedTo = loanedTo }

                /** Crew member lodging location. */
                fun lodging(lodging: String) = lodging(JsonField.of(lodging))

                /**
                 * Sets [Builder.lodging] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lodging] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lodging(lodging: JsonField<String>) = apply { this.lodging = lodging }

                /**
                 * Time this crew member was actually alerted for the mission, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun memberActualAlertTime(memberActualAlertTime: OffsetDateTime) =
                    memberActualAlertTime(JsonField.of(memberActualAlertTime))

                /**
                 * Sets [Builder.memberActualAlertTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberActualAlertTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberActualAlertTime(memberActualAlertTime: JsonField<OffsetDateTime>) =
                    apply {
                        this.memberActualAlertTime = memberActualAlertTime
                    }

                /**
                 * Adjusted return time for the crew member, in ISO 8601 UTC format with millisecond
                 * precision.
                 */
                fun memberAdjReturnTime(memberAdjReturnTime: OffsetDateTime) =
                    memberAdjReturnTime(JsonField.of(memberAdjReturnTime))

                /**
                 * Sets [Builder.memberAdjReturnTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberAdjReturnTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberAdjReturnTime(memberAdjReturnTime: JsonField<OffsetDateTime>) = apply {
                    this.memberAdjReturnTime = memberAdjReturnTime
                }

                /** Last name of the crew member's adjusted return time approver. */
                fun memberAdjReturnTimeApprover(memberAdjReturnTimeApprover: String) =
                    memberAdjReturnTimeApprover(JsonField.of(memberAdjReturnTimeApprover))

                /**
                 * Sets [Builder.memberAdjReturnTimeApprover] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberAdjReturnTimeApprover] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun memberAdjReturnTimeApprover(memberAdjReturnTimeApprover: JsonField<String>) =
                    apply {
                        this.memberAdjReturnTimeApprover = memberAdjReturnTimeApprover
                    }

                /** Unique identifier of the crew member assigned by the originating source. */
                fun memberId(memberId: String) = memberId(JsonField.of(memberId))

                /**
                 * Sets [Builder.memberId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberId(memberId: JsonField<String>) = apply { this.memberId = memberId }

                /**
                 * Initial start time of the crew member's linked task that was delinked due to
                 * mission closure, in ISO 8601 UTC format with millisecond precision.
                 */
                fun memberInitStartTime(memberInitStartTime: OffsetDateTime) =
                    memberInitStartTime(JsonField.of(memberInitStartTime))

                /**
                 * Sets [Builder.memberInitStartTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberInitStartTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberInitStartTime(memberInitStartTime: JsonField<OffsetDateTime>) = apply {
                    this.memberInitStartTime = memberInitStartTime
                }

                /**
                 * The latest possible time the crew member can legally be alerted for a task, in
                 * ISO 8601 UTC format with millisecond precision.
                 */
                fun memberLastAlertTime(memberLastAlertTime: OffsetDateTime) =
                    memberLastAlertTime(JsonField.of(memberLastAlertTime))

                /**
                 * Sets [Builder.memberLastAlertTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberLastAlertTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberLastAlertTime(memberLastAlertTime: JsonField<OffsetDateTime>) = apply {
                    this.memberLastAlertTime = memberLastAlertTime
                }

                /**
                 * Time this crew member becomes eligible to be alerted for the mission, in ISO 8601
                 * UTC format with millisecond precision.
                 */
                fun memberLegalAlertTime(memberLegalAlertTime: OffsetDateTime) =
                    memberLegalAlertTime(JsonField.of(memberLegalAlertTime))

                /**
                 * Sets [Builder.memberLegalAlertTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberLegalAlertTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberLegalAlertTime(memberLegalAlertTime: JsonField<OffsetDateTime>) = apply {
                    this.memberLegalAlertTime = memberLegalAlertTime
                }

                /**
                 * Time this crew member will be picked up from lodging, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun memberPickupTime(memberPickupTime: OffsetDateTime) =
                    memberPickupTime(JsonField.of(memberPickupTime))

                /**
                 * Sets [Builder.memberPickupTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberPickupTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberPickupTime(memberPickupTime: JsonField<OffsetDateTime>) = apply {
                    this.memberPickupTime = memberPickupTime
                }

                /**
                 * The scheduled delay or adjustment in the start time of a crew member's rest
                 * period after a mission, expressed as +/-HH:MM.
                 */
                fun memberPostRestOffset(memberPostRestOffset: String) =
                    memberPostRestOffset(JsonField.of(memberPostRestOffset))

                /**
                 * Sets [Builder.memberPostRestOffset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberPostRestOffset] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun memberPostRestOffset(memberPostRestOffset: JsonField<String>) = apply {
                    this.memberPostRestOffset = memberPostRestOffset
                }

                /**
                 * End time of this crew member's rest period after the mission, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun memberPostRestTime(memberPostRestTime: OffsetDateTime) =
                    memberPostRestTime(JsonField.of(memberPostRestTime))

                /**
                 * Sets [Builder.memberPostRestTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberPostRestTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberPostRestTime(memberPostRestTime: JsonField<OffsetDateTime>) = apply {
                    this.memberPostRestTime = memberPostRestTime
                }

                /**
                 * Start time of this crew member's rest period before the mission, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun memberPreRestTime(memberPreRestTime: OffsetDateTime) =
                    memberPreRestTime(JsonField.of(memberPreRestTime))

                /**
                 * Sets [Builder.memberPreRestTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberPreRestTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberPreRestTime(memberPreRestTime: JsonField<OffsetDateTime>) = apply {
                    this.memberPreRestTime = memberPreRestTime
                }

                /** Remarks concerning the crew member. */
                fun memberRemarks(memberRemarks: String) =
                    memberRemarks(JsonField.of(memberRemarks))

                /**
                 * Sets [Builder.memberRemarks] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberRemarks] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberRemarks(memberRemarks: JsonField<String>) = apply {
                    this.memberRemarks = memberRemarks
                }

                /**
                 * Scheduled return time for this crew member, in ISO 8601 UTC format with
                 * millisecond precision.
                 */
                fun memberReturnTime(memberReturnTime: OffsetDateTime) =
                    memberReturnTime(JsonField.of(memberReturnTime))

                /**
                 * Sets [Builder.memberReturnTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberReturnTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberReturnTime(memberReturnTime: JsonField<OffsetDateTime>) = apply {
                    this.memberReturnTime = memberReturnTime
                }

                /**
                 * Time this crew member is scheduled to be alerted for the mission, in ISO 8601 UTC
                 * format with millisecond precision.
                 */
                fun memberSchedAlertTime(memberSchedAlertTime: OffsetDateTime) =
                    memberSchedAlertTime(JsonField.of(memberSchedAlertTime))

                /**
                 * Sets [Builder.memberSchedAlertTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberSchedAlertTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun memberSchedAlertTime(memberSchedAlertTime: JsonField<OffsetDateTime>) = apply {
                    this.memberSchedAlertTime = memberSchedAlertTime
                }

                /**
                 * The military component for the crew member (e.g., ACTIVE, RESERVE, GUARD,
                 * UNKNOWN, etc.).
                 */
                fun memberSource(memberSource: String) = memberSource(JsonField.of(memberSource))

                /**
                 * Sets [Builder.memberSource] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberSource] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberSource(memberSource: JsonField<String>) = apply {
                    this.memberSource = memberSource
                }

                /**
                 * Stage name for the crew member. A stage is a pool of crews supporting a given
                 * operation plan.
                 */
                fun memberStageName(memberStageName: String) =
                    memberStageName(JsonField.of(memberStageName))

                /**
                 * Sets [Builder.memberStageName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberStageName] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun memberStageName(memberStageName: JsonField<String>) = apply {
                    this.memberStageName = memberStageName
                }

                /**
                 * Flag indicating whether this crew member needs transportation to the departure
                 * location.
                 */
                fun memberTransportReq(memberTransportReq: Boolean) =
                    memberTransportReq(JsonField.of(memberTransportReq))

                /**
                 * Sets [Builder.memberTransportReq] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberTransportReq] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun memberTransportReq(memberTransportReq: JsonField<Boolean>) = apply {
                    this.memberTransportReq = memberTransportReq
                }

                /**
                 * Amplifying details about the crew member type (e.g. RAVEN, FCC, COMCAM, AIRCREW,
                 * MEP, OTHER, etc.).
                 */
                fun memberType(memberType: String) = memberType(JsonField.of(memberType))

                /**
                 * Sets [Builder.memberType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.memberType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun memberType(memberType: JsonField<String>) = apply {
                    this.memberType = memberType
                }

                /** The middle initial of the crew member. */
                fun middleInitial(middleInitial: String) =
                    middleInitial(JsonField.of(middleInitial))

                /**
                 * Sets [Builder.middleInitial] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.middleInitial] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun middleInitial(middleInitial: JsonField<String>) = apply {
                    this.middleInitial = middleInitial
                }

                /** Flag indicating whether this crew member has been notified of an event. */
                fun notified(notified: Boolean) = notified(JsonField.of(notified))

                /**
                 * Sets [Builder.notified] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notified] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun notified(notified: JsonField<Boolean>) = apply { this.notified = notified }

                /** Crew member lodging phone number. */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
                }

                /**
                 * Code indicating a crew member's current physical fitness status and whether they
                 * are medically cleared to fly (e.g., D for Duties Not Including Flying, E for
                 * Physical Overdue, etc.).
                 */
                fun physAvCode(physAvCode: String) = physAvCode(JsonField.of(physAvCode))

                /**
                 * Sets [Builder.physAvCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.physAvCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun physAvCode(physAvCode: JsonField<String>) = apply {
                    this.physAvCode = physAvCode
                }

                /**
                 * Code indicating a crew member's physical availabiility status (e.g.,
                 * DISQUALIFIED, OVERDUE, etc.).
                 */
                fun physAvStatus(physAvStatus: String) = physAvStatus(JsonField.of(physAvStatus))

                /**
                 * Sets [Builder.physAvStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.physAvStatus] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun physAvStatus(physAvStatus: JsonField<String>) = apply {
                    this.physAvStatus = physAvStatus
                }

                /**
                 * Due date for the crew member's physical, in ISO 8601 UTC format with millisecond
                 * precision.
                 */
                fun physDue(physDue: OffsetDateTime) = physDue(JsonField.of(physDue))

                /**
                 * Sets [Builder.physDue] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.physDue] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun physDue(physDue: JsonField<OffsetDateTime>) = apply { this.physDue = physDue }

                /** The rank of the crew member. */
                fun rank(rank: String) = rank(JsonField.of(rank))

                /**
                 * Sets [Builder.rank] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rank] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rank(rank: JsonField<String>) = apply { this.rank = rank }

                /**
                 * Remark code used to designate attributes of this crew member. For more
                 * information, contact the provider source.
                 */
                fun remarkCode(remarkCode: String) = remarkCode(JsonField.of(remarkCode))

                /**
                 * Sets [Builder.remarkCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.remarkCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun remarkCode(remarkCode: JsonField<String>) = apply {
                    this.remarkCode = remarkCode
                }

                /**
                 * The primary aircraft type for the crew member according to the personnel resource
                 * management system indicated in the crewRMS field.
                 */
                fun rmsMds(rmsMds: String) = rmsMds(JsonField.of(rmsMds))

                /**
                 * Sets [Builder.rmsMds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rmsMds] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rmsMds(rmsMds: JsonField<String>) = apply { this.rmsMds = rmsMds }

                /**
                 * Time this crew member is required to report for duty before this flight/mission,
                 * in ISO 8601 UTC format with millisecond precision.
                 */
                fun showTime(showTime: OffsetDateTime) = showTime(JsonField.of(showTime))

                /**
                 * Sets [Builder.showTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.showTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun showTime(showTime: JsonField<OffsetDateTime>) = apply {
                    this.showTime = showTime
                }

                /** The squadron the crew member serves. */
                fun squadron(squadron: String) = squadron(JsonField.of(squadron))

                /**
                 * Sets [Builder.squadron] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.squadron] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun squadron(squadron: JsonField<String>) = apply { this.squadron = squadron }

                /**
                 * The date this crew member accomplished physiological or altitude chamber
                 * training, in ISO 8601 UTC format with millisecond precision.
                 */
                fun trainingDate(trainingDate: OffsetDateTime) =
                    trainingDate(JsonField.of(trainingDate))

                /**
                 * Sets [Builder.trainingDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trainingDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun trainingDate(trainingDate: JsonField<OffsetDateTime>) = apply {
                    this.trainingDate = trainingDate
                }

                /** The Mattermost username of this crew member. */
                fun username(username: String) = username(JsonField.of(username))

                /**
                 * Sets [Builder.username] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.username] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun username(username: JsonField<String>) = apply { this.username = username }

                /** The wing the crew member serves. */
                fun wing(wing: String) = wing(JsonField.of(wing))

                /**
                 * Sets [Builder.wing] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.wing] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun wing(wing: JsonField<String>) = apply { this.wing = wing }

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
                 * Returns an immutable instance of [CrewMember].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CrewMember =
                    CrewMember(
                        alerted,
                        allSortie,
                        approved,
                        attached,
                        branch,
                        civilian,
                        commander,
                        crewPosition,
                        dodId,
                        dutyPosition,
                        dutyStatus,
                        emailed,
                        extraTime,
                        firstName,
                        fltCurrencyExp,
                        fltCurrencyExpId,
                        fltRecDate,
                        fltRecDue,
                        flySquadron,
                        funded,
                        gender,
                        gndCurrencyExp,
                        gndCurrencyExpId,
                        grounded,
                        guestStart,
                        guestStop,
                        last4Ssn,
                        lastFltDate,
                        lastName,
                        loanedTo,
                        lodging,
                        memberActualAlertTime,
                        memberAdjReturnTime,
                        memberAdjReturnTimeApprover,
                        memberId,
                        memberInitStartTime,
                        memberLastAlertTime,
                        memberLegalAlertTime,
                        memberPickupTime,
                        memberPostRestOffset,
                        memberPostRestTime,
                        memberPreRestTime,
                        memberRemarks,
                        memberReturnTime,
                        memberSchedAlertTime,
                        memberSource,
                        memberStageName,
                        memberTransportReq,
                        memberType,
                        middleInitial,
                        notified,
                        phoneNumber,
                        physAvCode,
                        physAvStatus,
                        physDue,
                        rank,
                        remarkCode,
                        rmsMds,
                        showTime,
                        squadron,
                        trainingDate,
                        username,
                        wing,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CrewMember = apply {
                if (validated) {
                    return@apply
                }

                alerted()
                allSortie()
                approved()
                attached()
                branch()
                civilian()
                commander()
                crewPosition()
                dodId()
                dutyPosition()
                dutyStatus()
                emailed()
                extraTime()
                firstName()
                fltCurrencyExp()
                fltCurrencyExpId()
                fltRecDate()
                fltRecDue()
                flySquadron()
                funded()
                gender()
                gndCurrencyExp()
                gndCurrencyExpId()
                grounded()
                guestStart()
                guestStop()
                last4Ssn()
                lastFltDate()
                lastName()
                loanedTo()
                lodging()
                memberActualAlertTime()
                memberAdjReturnTime()
                memberAdjReturnTimeApprover()
                memberId()
                memberInitStartTime()
                memberLastAlertTime()
                memberLegalAlertTime()
                memberPickupTime()
                memberPostRestOffset()
                memberPostRestTime()
                memberPreRestTime()
                memberRemarks()
                memberReturnTime()
                memberSchedAlertTime()
                memberSource()
                memberStageName()
                memberTransportReq()
                memberType()
                middleInitial()
                notified()
                phoneNumber()
                physAvCode()
                physAvStatus()
                physDue()
                rank()
                remarkCode()
                rmsMds()
                showTime()
                squadron()
                trainingDate()
                username()
                wing()
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
                (if (alerted.asKnown().isPresent) 1 else 0) +
                    (if (allSortie.asKnown().isPresent) 1 else 0) +
                    (if (approved.asKnown().isPresent) 1 else 0) +
                    (if (attached.asKnown().isPresent) 1 else 0) +
                    (if (branch.asKnown().isPresent) 1 else 0) +
                    (if (civilian.asKnown().isPresent) 1 else 0) +
                    (if (commander.asKnown().isPresent) 1 else 0) +
                    (if (crewPosition.asKnown().isPresent) 1 else 0) +
                    (if (dodId.asKnown().isPresent) 1 else 0) +
                    (if (dutyPosition.asKnown().isPresent) 1 else 0) +
                    (if (dutyStatus.asKnown().isPresent) 1 else 0) +
                    (if (emailed.asKnown().isPresent) 1 else 0) +
                    (if (extraTime.asKnown().isPresent) 1 else 0) +
                    (if (firstName.asKnown().isPresent) 1 else 0) +
                    (if (fltCurrencyExp.asKnown().isPresent) 1 else 0) +
                    (if (fltCurrencyExpId.asKnown().isPresent) 1 else 0) +
                    (if (fltRecDate.asKnown().isPresent) 1 else 0) +
                    (if (fltRecDue.asKnown().isPresent) 1 else 0) +
                    (if (flySquadron.asKnown().isPresent) 1 else 0) +
                    (if (funded.asKnown().isPresent) 1 else 0) +
                    (if (gender.asKnown().isPresent) 1 else 0) +
                    (if (gndCurrencyExp.asKnown().isPresent) 1 else 0) +
                    (if (gndCurrencyExpId.asKnown().isPresent) 1 else 0) +
                    (if (grounded.asKnown().isPresent) 1 else 0) +
                    (if (guestStart.asKnown().isPresent) 1 else 0) +
                    (if (guestStop.asKnown().isPresent) 1 else 0) +
                    (if (last4Ssn.asKnown().isPresent) 1 else 0) +
                    (if (lastFltDate.asKnown().isPresent) 1 else 0) +
                    (if (lastName.asKnown().isPresent) 1 else 0) +
                    (if (loanedTo.asKnown().isPresent) 1 else 0) +
                    (if (lodging.asKnown().isPresent) 1 else 0) +
                    (if (memberActualAlertTime.asKnown().isPresent) 1 else 0) +
                    (if (memberAdjReturnTime.asKnown().isPresent) 1 else 0) +
                    (if (memberAdjReturnTimeApprover.asKnown().isPresent) 1 else 0) +
                    (if (memberId.asKnown().isPresent) 1 else 0) +
                    (if (memberInitStartTime.asKnown().isPresent) 1 else 0) +
                    (if (memberLastAlertTime.asKnown().isPresent) 1 else 0) +
                    (if (memberLegalAlertTime.asKnown().isPresent) 1 else 0) +
                    (if (memberPickupTime.asKnown().isPresent) 1 else 0) +
                    (if (memberPostRestOffset.asKnown().isPresent) 1 else 0) +
                    (if (memberPostRestTime.asKnown().isPresent) 1 else 0) +
                    (if (memberPreRestTime.asKnown().isPresent) 1 else 0) +
                    (if (memberRemarks.asKnown().isPresent) 1 else 0) +
                    (if (memberReturnTime.asKnown().isPresent) 1 else 0) +
                    (if (memberSchedAlertTime.asKnown().isPresent) 1 else 0) +
                    (if (memberSource.asKnown().isPresent) 1 else 0) +
                    (if (memberStageName.asKnown().isPresent) 1 else 0) +
                    (if (memberTransportReq.asKnown().isPresent) 1 else 0) +
                    (if (memberType.asKnown().isPresent) 1 else 0) +
                    (if (middleInitial.asKnown().isPresent) 1 else 0) +
                    (if (notified.asKnown().isPresent) 1 else 0) +
                    (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                    (if (physAvCode.asKnown().isPresent) 1 else 0) +
                    (if (physAvStatus.asKnown().isPresent) 1 else 0) +
                    (if (physDue.asKnown().isPresent) 1 else 0) +
                    (if (rank.asKnown().isPresent) 1 else 0) +
                    (if (remarkCode.asKnown().isPresent) 1 else 0) +
                    (if (rmsMds.asKnown().isPresent) 1 else 0) +
                    (if (showTime.asKnown().isPresent) 1 else 0) +
                    (if (squadron.asKnown().isPresent) 1 else 0) +
                    (if (trainingDate.asKnown().isPresent) 1 else 0) +
                    (if (username.asKnown().isPresent) 1 else 0) +
                    (if (wing.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CrewMember && alerted == other.alerted && allSortie == other.allSortie && approved == other.approved && attached == other.attached && branch == other.branch && civilian == other.civilian && commander == other.commander && crewPosition == other.crewPosition && dodId == other.dodId && dutyPosition == other.dutyPosition && dutyStatus == other.dutyStatus && emailed == other.emailed && extraTime == other.extraTime && firstName == other.firstName && fltCurrencyExp == other.fltCurrencyExp && fltCurrencyExpId == other.fltCurrencyExpId && fltRecDate == other.fltRecDate && fltRecDue == other.fltRecDue && flySquadron == other.flySquadron && funded == other.funded && gender == other.gender && gndCurrencyExp == other.gndCurrencyExp && gndCurrencyExpId == other.gndCurrencyExpId && grounded == other.grounded && guestStart == other.guestStart && guestStop == other.guestStop && last4Ssn == other.last4Ssn && lastFltDate == other.lastFltDate && lastName == other.lastName && loanedTo == other.loanedTo && lodging == other.lodging && memberActualAlertTime == other.memberActualAlertTime && memberAdjReturnTime == other.memberAdjReturnTime && memberAdjReturnTimeApprover == other.memberAdjReturnTimeApprover && memberId == other.memberId && memberInitStartTime == other.memberInitStartTime && memberLastAlertTime == other.memberLastAlertTime && memberLegalAlertTime == other.memberLegalAlertTime && memberPickupTime == other.memberPickupTime && memberPostRestOffset == other.memberPostRestOffset && memberPostRestTime == other.memberPostRestTime && memberPreRestTime == other.memberPreRestTime && memberRemarks == other.memberRemarks && memberReturnTime == other.memberReturnTime && memberSchedAlertTime == other.memberSchedAlertTime && memberSource == other.memberSource && memberStageName == other.memberStageName && memberTransportReq == other.memberTransportReq && memberType == other.memberType && middleInitial == other.middleInitial && notified == other.notified && phoneNumber == other.phoneNumber && physAvCode == other.physAvCode && physAvStatus == other.physAvStatus && physDue == other.physDue && rank == other.rank && remarkCode == other.remarkCode && rmsMds == other.rmsMds && showTime == other.showTime && squadron == other.squadron && trainingDate == other.trainingDate && username == other.username && wing == other.wing && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(alerted, allSortie, approved, attached, branch, civilian, commander, crewPosition, dodId, dutyPosition, dutyStatus, emailed, extraTime, firstName, fltCurrencyExp, fltCurrencyExpId, fltRecDate, fltRecDue, flySquadron, funded, gender, gndCurrencyExp, gndCurrencyExpId, grounded, guestStart, guestStop, last4Ssn, lastFltDate, lastName, loanedTo, lodging, memberActualAlertTime, memberAdjReturnTime, memberAdjReturnTimeApprover, memberId, memberInitStartTime, memberLastAlertTime, memberLegalAlertTime, memberPickupTime, memberPostRestOffset, memberPostRestTime, memberPreRestTime, memberRemarks, memberReturnTime, memberSchedAlertTime, memberSource, memberStageName, memberTransportReq, memberType, middleInitial, notified, phoneNumber, physAvCode, physAvStatus, physDue, rank, remarkCode, rmsMds, showTime, squadron, trainingDate, username, wing, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CrewMember{alerted=$alerted, allSortie=$allSortie, approved=$approved, attached=$attached, branch=$branch, civilian=$civilian, commander=$commander, crewPosition=$crewPosition, dodId=$dodId, dutyPosition=$dutyPosition, dutyStatus=$dutyStatus, emailed=$emailed, extraTime=$extraTime, firstName=$firstName, fltCurrencyExp=$fltCurrencyExp, fltCurrencyExpId=$fltCurrencyExpId, fltRecDate=$fltRecDate, fltRecDue=$fltRecDue, flySquadron=$flySquadron, funded=$funded, gender=$gender, gndCurrencyExp=$gndCurrencyExp, gndCurrencyExpId=$gndCurrencyExpId, grounded=$grounded, guestStart=$guestStart, guestStop=$guestStop, last4Ssn=$last4Ssn, lastFltDate=$lastFltDate, lastName=$lastName, loanedTo=$loanedTo, lodging=$lodging, memberActualAlertTime=$memberActualAlertTime, memberAdjReturnTime=$memberAdjReturnTime, memberAdjReturnTimeApprover=$memberAdjReturnTimeApprover, memberId=$memberId, memberInitStartTime=$memberInitStartTime, memberLastAlertTime=$memberLastAlertTime, memberLegalAlertTime=$memberLegalAlertTime, memberPickupTime=$memberPickupTime, memberPostRestOffset=$memberPostRestOffset, memberPostRestTime=$memberPostRestTime, memberPreRestTime=$memberPreRestTime, memberRemarks=$memberRemarks, memberReturnTime=$memberReturnTime, memberSchedAlertTime=$memberSchedAlertTime, memberSource=$memberSource, memberStageName=$memberStageName, memberTransportReq=$memberTransportReq, memberType=$memberType, middleInitial=$middleInitial, notified=$notified, phoneNumber=$phoneNumber, physAvCode=$physAvCode, physAvStatus=$physAvStatus, physDue=$physDue, rank=$rank, remarkCode=$remarkCode, rmsMds=$rmsMds, showTime=$showTime, squadron=$squadron, trainingDate=$trainingDate, username=$username, wing=$wing, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && classificationMarking == other.classificationMarking && dataMode == other.dataMode && origCrewId == other.origCrewId && source == other.source && id == other.id && adjReturnTime == other.adjReturnTime && adjReturnTimeApprover == other.adjReturnTimeApprover && aircraftMds == other.aircraftMds && alertedTime == other.alertedTime && alertType == other.alertType && armsCrewUnit == other.armsCrewUnit && assignedQualCode == other.assignedQualCode && commanderId == other.commanderId && commanderLast4Ssn == other.commanderLast4Ssn && commanderName == other.commanderName && createdAt == other.createdAt && createdBy == other.createdBy && crewHome == other.crewHome && crewMembers == other.crewMembers && crewName == other.crewName && crewRms == other.crewRms && crewRole == other.crewRole && crewSource == other.crewSource && crewSquadron == other.crewSquadron && crewType == other.crewType && crewUnit == other.crewUnit && crewWing == other.crewWing && currentIcao == other.currentIcao && fdpEligType == other.fdpEligType && fdpType == other.fdpType && femaleEnlistedQty == other.femaleEnlistedQty && femaleOfficerQty == other.femaleOfficerQty && fltAuthNum == other.fltAuthNum && idSiteCurrent == other.idSiteCurrent && idSortie == other.idSortie && initStartTime == other.initStartTime && lastAlertTime == other.lastAlertTime && legalAlertTime == other.legalAlertTime && legalBravoTime == other.legalBravoTime && linkedTask == other.linkedTask && maleEnlistedQty == other.maleEnlistedQty && maleOfficerQty == other.maleOfficerQty && missionAlias == other.missionAlias && missionId == other.missionId && origin == other.origin && origNetwork == other.origNetwork && personnelType == other.personnelType && pickupTime == other.pickupTime && postRestApplied == other.postRestApplied && postRestEnd == other.postRestEnd && postRestOffset == other.postRestOffset && preRestApplied == other.preRestApplied && preRestStart == other.preRestStart && reqQualCode == other.reqQualCode && returnTime == other.returnTime && sourceDl == other.sourceDl && stage1Qual == other.stage1Qual && stage2Qual == other.stage2Qual && stage3Qual == other.stage3Qual && stageName == other.stageName && stageTime == other.stageTime && status == other.status && transportReq == other.transportReq && tripKit == other.tripKit && updatedAt == other.updatedAt && updatedBy == other.updatedBy /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, origCrewId, source, id, adjReturnTime, adjReturnTimeApprover, aircraftMds, alertedTime, alertType, armsCrewUnit, assignedQualCode, commanderId, commanderLast4Ssn, commanderName, createdAt, createdBy, crewHome, crewMembers, crewName, crewRms, crewRole, crewSource, crewSquadron, crewType, crewUnit, crewWing, currentIcao, fdpEligType, fdpType, femaleEnlistedQty, femaleOfficerQty, fltAuthNum, idSiteCurrent, idSortie, initStartTime, lastAlertTime, legalAlertTime, legalBravoTime, linkedTask, maleEnlistedQty, maleOfficerQty, missionAlias, missionId, origin, origNetwork, personnelType, pickupTime, postRestApplied, postRestEnd, postRestOffset, preRestApplied, preRestStart, reqQualCode, returnTime, sourceDl, stage1Qual, stage2Qual, stage3Qual, stageName, stageTime, status, transportReq, tripKit, updatedAt, updatedBy) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, origCrewId=$origCrewId, source=$source, id=$id, adjReturnTime=$adjReturnTime, adjReturnTimeApprover=$adjReturnTimeApprover, aircraftMds=$aircraftMds, alertedTime=$alertedTime, alertType=$alertType, armsCrewUnit=$armsCrewUnit, assignedQualCode=$assignedQualCode, commanderId=$commanderId, commanderLast4Ssn=$commanderLast4Ssn, commanderName=$commanderName, createdAt=$createdAt, createdBy=$createdBy, crewHome=$crewHome, crewMembers=$crewMembers, crewName=$crewName, crewRms=$crewRms, crewRole=$crewRole, crewSource=$crewSource, crewSquadron=$crewSquadron, crewType=$crewType, crewUnit=$crewUnit, crewWing=$crewWing, currentIcao=$currentIcao, fdpEligType=$fdpEligType, fdpType=$fdpType, femaleEnlistedQty=$femaleEnlistedQty, femaleOfficerQty=$femaleOfficerQty, fltAuthNum=$fltAuthNum, idSiteCurrent=$idSiteCurrent, idSortie=$idSortie, initStartTime=$initStartTime, lastAlertTime=$lastAlertTime, legalAlertTime=$legalAlertTime, legalBravoTime=$legalBravoTime, linkedTask=$linkedTask, maleEnlistedQty=$maleEnlistedQty, maleOfficerQty=$maleOfficerQty, missionAlias=$missionAlias, missionId=$missionId, origin=$origin, origNetwork=$origNetwork, personnelType=$personnelType, pickupTime=$pickupTime, postRestApplied=$postRestApplied, postRestEnd=$postRestEnd, postRestOffset=$postRestOffset, preRestApplied=$preRestApplied, preRestStart=$preRestStart, reqQualCode=$reqQualCode, returnTime=$returnTime, sourceDl=$sourceDl, stage1Qual=$stage1Qual, stage2Qual=$stage2Qual, stage3Qual=$stage3Qual, stageName=$stageName, stageTime=$stageTime, status=$status, transportReq=$transportReq, tripKit=$tripKit, updatedAt=$updatedAt, updatedBy=$updatedBy}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CrewUnvalidatedPublishParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CrewUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

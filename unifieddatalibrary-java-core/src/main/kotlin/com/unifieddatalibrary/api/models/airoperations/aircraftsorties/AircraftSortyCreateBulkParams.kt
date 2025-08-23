// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.aircraftsorties

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation intended for initial integration only, to take a list of AircraftSorties as a
 * POST body and ingest into the database. This operation is not intended to be used for automated
 * feeds into UDL. Data providers should contact the UDL team for specific role assignments and for
 * instructions on setting up a permanent feed through an alternate mechanism.
 */
class AircraftSortyCreateBulkParams
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
         * [AircraftSortyCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AircraftSortyCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(aircraftSortyCreateBulkParams: AircraftSortyCreateBulkParams) = apply {
            body = aircraftSortyCreateBulkParams.body.toMutableList()
            additionalHeaders = aircraftSortyCreateBulkParams.additionalHeaders.toBuilder()
            additionalQueryParams = aircraftSortyCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [AircraftSortyCreateBulkParams].
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
        fun build(): AircraftSortyCreateBulkParams =
            AircraftSortyCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Information related to the planning, load, status, and deployment or dispatch of one aircraft
     * to carry out a mission.
     */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("plannedDepTime")
        @ExcludeMissing
        private val plannedDepTime: JsonField<OffsetDateTime>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("actualArrTime")
        @ExcludeMissing
        private val actualArrTime: JsonField<OffsetDateTime>,
        @JsonProperty("actualBlockInTime")
        @ExcludeMissing
        private val actualBlockInTime: JsonField<OffsetDateTime>,
        @JsonProperty("actualBlockOutTime")
        @ExcludeMissing
        private val actualBlockOutTime: JsonField<OffsetDateTime>,
        @JsonProperty("actualDepTime")
        @ExcludeMissing
        private val actualDepTime: JsonField<OffsetDateTime>,
        @JsonProperty("aircraftADSB") @ExcludeMissing private val aircraftAdsb: JsonField<String>,
        @JsonProperty("aircraftAltId") @ExcludeMissing private val aircraftAltId: JsonField<String>,
        @JsonProperty("aircraftEvent") @ExcludeMissing private val aircraftEvent: JsonField<String>,
        @JsonProperty("aircraftMDS") @ExcludeMissing private val aircraftMds: JsonField<String>,
        @JsonProperty("aircraftRemarks")
        @ExcludeMissing
        private val aircraftRemarks: JsonField<String>,
        @JsonProperty("alertStatus") @ExcludeMissing private val alertStatus: JsonField<Int>,
        @JsonProperty("alertStatusCode")
        @ExcludeMissing
        private val alertStatusCode: JsonField<String>,
        @JsonProperty("amcMsnNum") @ExcludeMissing private val amcMsnNum: JsonField<String>,
        @JsonProperty("amcMsnType") @ExcludeMissing private val amcMsnType: JsonField<String>,
        @JsonProperty("arrFAA") @ExcludeMissing private val arrFaa: JsonField<String>,
        @JsonProperty("arrIATA") @ExcludeMissing private val arrIata: JsonField<String>,
        @JsonProperty("arrICAO") @ExcludeMissing private val arrIcao: JsonField<String>,
        @JsonProperty("arrItinerary") @ExcludeMissing private val arrItinerary: JsonField<Int>,
        @JsonProperty("arrPurposeCode")
        @ExcludeMissing
        private val arrPurposeCode: JsonField<String>,
        @JsonProperty("callSign") @ExcludeMissing private val callSign: JsonField<String>,
        @JsonProperty("cargoConfig") @ExcludeMissing private val cargoConfig: JsonField<String>,
        @JsonProperty("commanderName") @ExcludeMissing private val commanderName: JsonField<String>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("currentState") @ExcludeMissing private val currentState: JsonField<String>,
        @JsonProperty("delayCode") @ExcludeMissing private val delayCode: JsonField<String>,
        @JsonProperty("depFAA") @ExcludeMissing private val depFaa: JsonField<String>,
        @JsonProperty("depIATA") @ExcludeMissing private val depIata: JsonField<String>,
        @JsonProperty("depICAO") @ExcludeMissing private val depIcao: JsonField<String>,
        @JsonProperty("depItinerary") @ExcludeMissing private val depItinerary: JsonField<Int>,
        @JsonProperty("depPurposeCode")
        @ExcludeMissing
        private val depPurposeCode: JsonField<String>,
        @JsonProperty("dhd") @ExcludeMissing private val dhd: JsonField<OffsetDateTime>,
        @JsonProperty("dhdReason") @ExcludeMissing private val dhdReason: JsonField<String>,
        @JsonProperty("estArrTime")
        @ExcludeMissing
        private val estArrTime: JsonField<OffsetDateTime>,
        @JsonProperty("estBlockInTime")
        @ExcludeMissing
        private val estBlockInTime: JsonField<OffsetDateTime>,
        @JsonProperty("estBlockOutTime")
        @ExcludeMissing
        private val estBlockOutTime: JsonField<OffsetDateTime>,
        @JsonProperty("estDepTime")
        @ExcludeMissing
        private val estDepTime: JsonField<OffsetDateTime>,
        @JsonProperty("filename") @ExcludeMissing private val filename: JsonField<String>,
        @JsonProperty("filesize") @ExcludeMissing private val filesize: JsonField<Int>,
        @JsonProperty("flightTime") @ExcludeMissing private val flightTime: JsonField<Double>,
        @JsonProperty("fmDeskNum") @ExcludeMissing private val fmDeskNum: JsonField<String>,
        @JsonProperty("fmName") @ExcludeMissing private val fmName: JsonField<String>,
        @JsonProperty("fuelReq") @ExcludeMissing private val fuelReq: JsonField<Double>,
        @JsonProperty("gndTime") @ExcludeMissing private val gndTime: JsonField<Double>,
        @JsonProperty("idAircraft") @ExcludeMissing private val idAircraft: JsonField<String>,
        @JsonProperty("idMission") @ExcludeMissing private val idMission: JsonField<String>,
        @JsonProperty("jcsPriority") @ExcludeMissing private val jcsPriority: JsonField<String>,
        @JsonProperty("legNum") @ExcludeMissing private val legNum: JsonField<Int>,
        @JsonProperty("lineNumber") @ExcludeMissing private val lineNumber: JsonField<Int>,
        @JsonProperty("missionId") @ExcludeMissing private val missionId: JsonField<String>,
        @JsonProperty("missionUpdate")
        @ExcludeMissing
        private val missionUpdate: JsonField<OffsetDateTime>,
        @JsonProperty("objectiveRemarks")
        @ExcludeMissing
        private val objectiveRemarks: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("origSortieId") @ExcludeMissing private val origSortieId: JsonField<String>,
        @JsonProperty("oxyOnCrew") @ExcludeMissing private val oxyOnCrew: JsonField<Double>,
        @JsonProperty("oxyOnPax") @ExcludeMissing private val oxyOnPax: JsonField<Double>,
        @JsonProperty("oxyReqCrew") @ExcludeMissing private val oxyReqCrew: JsonField<Double>,
        @JsonProperty("oxyReqPax") @ExcludeMissing private val oxyReqPax: JsonField<Double>,
        @JsonProperty("paperStatus")
        @ExcludeMissing
        private val paperStatus: JsonField<PaperStatus>,
        @JsonProperty("papersVersion") @ExcludeMissing private val papersVersion: JsonField<String>,
        @JsonProperty("parkingLoc") @ExcludeMissing private val parkingLoc: JsonField<String>,
        @JsonProperty("passengers") @ExcludeMissing private val passengers: JsonField<Int>,
        @JsonProperty("plannedArrTime")
        @ExcludeMissing
        private val plannedArrTime: JsonField<OffsetDateTime>,
        @JsonProperty("pprStatus") @ExcludeMissing private val pprStatus: JsonField<PprStatus>,
        @JsonProperty("primarySCL") @ExcludeMissing private val primaryScl: JsonField<String>,
        @JsonProperty("rawFileURI") @ExcludeMissing private val rawFileUri: JsonField<String>,
        @JsonProperty("reqConfig") @ExcludeMissing private val reqConfig: JsonField<String>,
        @JsonProperty("resultRemarks") @ExcludeMissing private val resultRemarks: JsonField<String>,
        @JsonProperty("rvnReq") @ExcludeMissing private val rvnReq: JsonField<RvnReq>,
        @JsonProperty("scheduleRemarks")
        @ExcludeMissing
        private val scheduleRemarks: JsonField<String>,
        @JsonProperty("secondarySCL") @ExcludeMissing private val secondaryScl: JsonField<String>,
        @JsonProperty("soe") @ExcludeMissing private val soe: JsonField<String>,
        @JsonProperty("sortieDate") @ExcludeMissing private val sortieDate: JsonField<LocalDate>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,
        @JsonProperty("tailNumber") @ExcludeMissing private val tailNumber: JsonField<String>,
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
         * The scheduled time that the Aircraft sortie is planned to depart, in ISO 8601 UTC format
         * with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun plannedDepTime(): OffsetDateTime = plannedDepTime.getRequired("plannedDepTime")

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
         * The actual arrival time, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actualArrTime(): Optional<OffsetDateTime> = actualArrTime.getOptional("actualArrTime")

        /**
         * The actual time the Aircraft comes to a complete stop in its parking position, in ISO
         * 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actualBlockInTime(): Optional<OffsetDateTime> =
            actualBlockInTime.getOptional("actualBlockInTime")

        /**
         * The actual time the Aircraft begins to taxi from its parking position, in ISO 8601 UTC
         * format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actualBlockOutTime(): Optional<OffsetDateTime> =
            actualBlockOutTime.getOptional("actualBlockOutTime")

        /**
         * The actual departure time, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun actualDepTime(): Optional<OffsetDateTime> = actualDepTime.getOptional("actualDepTime")

        /**
         * The Automatic Dependent Surveillance-Broadcast (ADS-B) device identifier.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftAdsb(): Optional<String> = aircraftAdsb.getOptional("aircraftADSB")

        /**
         * Alternate Aircraft Identifier provided by source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftAltId(): Optional<String> = aircraftAltId.getOptional("aircraftAltId")

        /**
         * Aircraft event text.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftEvent(): Optional<String> = aircraftEvent.getOptional("aircraftEvent")

        /**
         * The aircraft Model Design Series designation assigned to this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftMds(): Optional<String> = aircraftMds.getOptional("aircraftMDS")

        /**
         * Remarks concerning the aircraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun aircraftRemarks(): Optional<String> = aircraftRemarks.getOptional("aircraftRemarks")

        /**
         * The amount of time allowed between launch order and takeoff, in seconds.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alertStatus(): Optional<Int> = alertStatus.getOptional("alertStatus")

        /**
         * The Alert Status code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun alertStatusCode(): Optional<String> = alertStatusCode.getOptional("alertStatusCode")

        /**
         * The Air Mobility Command (AMC) mission number of the sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amcMsnNum(): Optional<String> = amcMsnNum.getOptional("amcMsnNum")

        /**
         * The type of mission (e.g. SAAM, CHNL, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun amcMsnType(): Optional<String> = amcMsnType.getOptional("amcMsnType")

        /**
         * The arrival Federal Aviation Administration (FAA) code of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arrFaa(): Optional<String> = arrFaa.getOptional("arrFAA")

        /**
         * The arrival International Aviation Transport Association (IATA) code of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arrIata(): Optional<String> = arrIata.getOptional("arrIATA")

        /**
         * The arrival International Civil Aviation Organization (ICAO) of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arrIcao(): Optional<String> = arrIcao.getOptional("arrICAO")

        /**
         * The itinerary identifier of the arrival location.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arrItinerary(): Optional<Int> = arrItinerary.getOptional("arrItinerary")

        /**
         * Purpose code at the arrival location of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun arrPurposeCode(): Optional<String> = arrPurposeCode.getOptional("arrPurposeCode")

        /**
         * The call sign assigned to the aircraft on this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun callSign(): Optional<String> = callSign.getOptional("callSign")

        /**
         * Description of the cargo configuration (e.g. C-1, C-2, C-3, DV-1, DV-2, AE-1, etc.)
         * currently on board the aircraft. Configuration meanings are determined by the data
         * source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cargoConfig(): Optional<String> = cargoConfig.getOptional("cargoConfig")

        /**
         * The last name of the aircraft commander.
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
         * The current state of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun currentState(): Optional<String> = currentState.getOptional("currentState")

        /**
         * The primary delay code.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun delayCode(): Optional<String> = delayCode.getOptional("delayCode")

        /**
         * The departure Federal Aviation Administration (FAA) code of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun depFaa(): Optional<String> = depFaa.getOptional("depFAA")

        /**
         * The departure International Aviation Transport Association (IATA) code of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun depIata(): Optional<String> = depIata.getOptional("depIATA")

        /**
         * The departure International Civil Aviation Organization (ICAO) of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun depIcao(): Optional<String> = depIcao.getOptional("depICAO")

        /**
         * The itinerary identifier of the departure location.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun depItinerary(): Optional<Int> = depItinerary.getOptional("depItinerary")

        /**
         * Purpose code at the departure location of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun depPurposeCode(): Optional<String> = depPurposeCode.getOptional("depPurposeCode")

        /**
         * Due home date by which the aircraft must return to its home station, in ISO 8601 UTC
         * format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dhd(): Optional<OffsetDateTime> = dhd.getOptional("dhd")

        /**
         * Reason the aircraft must return to home station by its due home date.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dhdReason(): Optional<String> = dhdReason.getOptional("dhdReason")

        /**
         * The current estimated time that the Aircraft is planned to arrive, in ISO 8601 UTC format
         * with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estArrTime(): Optional<OffsetDateTime> = estArrTime.getOptional("estArrTime")

        /**
         * The estimated time the Aircraft will come to a complete stop in its parking position, in
         * ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estBlockInTime(): Optional<OffsetDateTime> =
            estBlockInTime.getOptional("estBlockInTime")

        /**
         * The estimated time the Aircraft will begin to taxi from its parking position, in ISO 8601
         * UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estBlockOutTime(): Optional<OffsetDateTime> =
            estBlockOutTime.getOptional("estBlockOutTime")

        /**
         * The current estimated time that the Aircraft is planned to depart, in ISO 8601 UTC format
         * with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun estDepTime(): Optional<OffsetDateTime> = estDepTime.getOptional("estDepTime")

        /**
         * Name of the uploaded PDF.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun filename(): Optional<String> = filename.getOptional("filename")

        /**
         * Size of the supporting PDF, in bytes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun filesize(): Optional<Int> = filesize.getOptional("filesize")

        /**
         * The planned flight time for this sortie, in minutes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun flightTime(): Optional<Double> = flightTime.getOptional("flightTime")

        /**
         * Desk phone number of the flight manager assigned to the sortie. Null when no flight
         * manager is assigned.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fmDeskNum(): Optional<String> = fmDeskNum.getOptional("fmDeskNum")

        /**
         * Last name of the flight manager assigned to the sortie. Null when no flight manager is
         * assigned.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fmName(): Optional<String> = fmName.getOptional("fmName")

        /**
         * Mass of fuel required for this leg of the sortie, in kilograms.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun fuelReq(): Optional<Double> = fuelReq.getOptional("fuelReq")

        /**
         * Scheduled ground time, in minutes.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun gndTime(): Optional<Double> = gndTime.getOptional("gndTime")

        /**
         * Unique identifier of the aircraft.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idAircraft(): Optional<String> = idAircraft.getOptional("idAircraft")

        /**
         * The unique identifier of the mission to which this sortie is assigned.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idMission(): Optional<String> = idMission.getOptional("idMission")

        /**
         * Joint Chiefs of Staff priority of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun jcsPriority(): Optional<String> = jcsPriority.getOptional("jcsPriority")

        /**
         * The leg number of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun legNum(): Optional<Int> = legNum.getOptional("legNum")

        /**
         * The external system line number of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun lineNumber(): Optional<Int> = lineNumber.getOptional("lineNumber")

        /**
         * The mission ID according to the source system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionId(): Optional<String> = missionId.getOptional("missionId")

        /**
         * Time the associated mission data was last updated in relation to the aircraft assignment,
         * in ISO 8601 UTC format with millisecond precision. If this time is coming from an
         * external system, it may not sync with the latest mission time associated to this record.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionUpdate(): Optional<OffsetDateTime> = missionUpdate.getOptional("missionUpdate")

        /**
         * Remarks concerning the sortie objective.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectiveRemarks(): Optional<String> = objectiveRemarks.getOptional("objectiveRemarks")

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
         * The sortie identifier provided by the originating source.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origSortieId(): Optional<String> = origSortieId.getOptional("origSortieId")

        /**
         * Liquid oxygen onboard the aircraft for the crew compartment, in liters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun oxyOnCrew(): Optional<Double> = oxyOnCrew.getOptional("oxyOnCrew")

        /**
         * Liquid oxygen onboard the aircraft for the troop compartment, in liters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun oxyOnPax(): Optional<Double> = oxyOnPax.getOptional("oxyOnPax")

        /**
         * Liquid oxygen required on the aircraft for the crew compartment, in liters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun oxyReqCrew(): Optional<Double> = oxyReqCrew.getOptional("oxyReqCrew")

        /**
         * Liquid oxygen required on the aircraft for the troop compartment, in liters.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun oxyReqPax(): Optional<Double> = oxyReqPax.getOptional("oxyReqPax")

        /**
         * The status of the supporting document.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun paperStatus(): Optional<PaperStatus> = paperStatus.getOptional("paperStatus")

        /**
         * The version number of the crew paper.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun papersVersion(): Optional<String> = papersVersion.getOptional("papersVersion")

        /**
         * The POI parking location.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun parkingLoc(): Optional<String> = parkingLoc.getOptional("parkingLoc")

        /**
         * The number of passengers tasked for this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun passengers(): Optional<Int> = passengers.getOptional("passengers")

        /**
         * The scheduled time that the Aircraft sortie is planned to arrive, in ISO 8601 UTC format
         * with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun plannedArrTime(): Optional<OffsetDateTime> =
            plannedArrTime.getOptional("plannedArrTime")

        /**
         * The prior permission required (PPR) status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pprStatus(): Optional<PprStatus> = pprStatus.getOptional("pprStatus")

        /**
         * The planned primary Standard Conventional Load of the aircraft for this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun primaryScl(): Optional<String> = primaryScl.getOptional("primarySCL")

        /**
         * When crew papers are associated to this sortie, the system updates this value. This field
         * is the URI location in the document repository of that raw file. To download the raw
         * file, prepend https://udl-hostname/scs/download?id= to this field's value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

        /**
         * Aircraft configuration required for the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun reqConfig(): Optional<String> = reqConfig.getOptional("reqConfig")

        /**
         * Remarks concerning the results of this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun resultRemarks(): Optional<String> = resultRemarks.getOptional("resultRemarks")

        /**
         * Type of Ravens required for this sortie (N - None, R - Raven (Security Team) required,
         * C6 - Consider ravens (Ground time over 6 hours), R6 - Ravens required (Ground time over 6
         * hours)).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rvnReq(): Optional<RvnReq> = rvnReq.getOptional("rvnReq")

        /**
         * Remarks concerning the schedule.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun scheduleRemarks(): Optional<String> = scheduleRemarks.getOptional("scheduleRemarks")

        /**
         * The planned secondary Standard Conventional Load of the aircraft for this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun secondaryScl(): Optional<String> = secondaryScl.getOptional("secondarySCL")

        /**
         * Indicates the group responsible for recording the completion time of the next event in
         * the sequence of events assigned to this sortie (e.g. OPS - Operations, MX - Maintenance,
         * TR - Transportation, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun soe(): Optional<String> = soe.getOptional("soe")

        /**
         * The scheduled UTC date for this sortie, in ISO 8601 date-only format (ex. YYYY-MM-DD).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun sortieDate(): Optional<LocalDate> = sortieDate.getOptional("sortieDate")

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
         * The tail number of the aircraft assigned to this sortie.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun tailNumber(): Optional<String> = tailNumber.getOptional("tailNumber")

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
         * Returns the raw JSON value of [plannedDepTime].
         *
         * Unlike [plannedDepTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plannedDepTime")
        @ExcludeMissing
        fun _plannedDepTime(): JsonField<OffsetDateTime> = plannedDepTime

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
         * Returns the raw JSON value of [actualArrTime].
         *
         * Unlike [actualArrTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actualArrTime")
        @ExcludeMissing
        fun _actualArrTime(): JsonField<OffsetDateTime> = actualArrTime

        /**
         * Returns the raw JSON value of [actualBlockInTime].
         *
         * Unlike [actualBlockInTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actualBlockInTime")
        @ExcludeMissing
        fun _actualBlockInTime(): JsonField<OffsetDateTime> = actualBlockInTime

        /**
         * Returns the raw JSON value of [actualBlockOutTime].
         *
         * Unlike [actualBlockOutTime], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("actualBlockOutTime")
        @ExcludeMissing
        fun _actualBlockOutTime(): JsonField<OffsetDateTime> = actualBlockOutTime

        /**
         * Returns the raw JSON value of [actualDepTime].
         *
         * Unlike [actualDepTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("actualDepTime")
        @ExcludeMissing
        fun _actualDepTime(): JsonField<OffsetDateTime> = actualDepTime

        /**
         * Returns the raw JSON value of [aircraftAdsb].
         *
         * Unlike [aircraftAdsb], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aircraftADSB")
        @ExcludeMissing
        fun _aircraftAdsb(): JsonField<String> = aircraftAdsb

        /**
         * Returns the raw JSON value of [aircraftAltId].
         *
         * Unlike [aircraftAltId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aircraftAltId")
        @ExcludeMissing
        fun _aircraftAltId(): JsonField<String> = aircraftAltId

        /**
         * Returns the raw JSON value of [aircraftEvent].
         *
         * Unlike [aircraftEvent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aircraftEvent")
        @ExcludeMissing
        fun _aircraftEvent(): JsonField<String> = aircraftEvent

        /**
         * Returns the raw JSON value of [aircraftMds].
         *
         * Unlike [aircraftMds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aircraftMDS")
        @ExcludeMissing
        fun _aircraftMds(): JsonField<String> = aircraftMds

        /**
         * Returns the raw JSON value of [aircraftRemarks].
         *
         * Unlike [aircraftRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aircraftRemarks")
        @ExcludeMissing
        fun _aircraftRemarks(): JsonField<String> = aircraftRemarks

        /**
         * Returns the raw JSON value of [alertStatus].
         *
         * Unlike [alertStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("alertStatus")
        @ExcludeMissing
        fun _alertStatus(): JsonField<Int> = alertStatus

        /**
         * Returns the raw JSON value of [alertStatusCode].
         *
         * Unlike [alertStatusCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("alertStatusCode")
        @ExcludeMissing
        fun _alertStatusCode(): JsonField<String> = alertStatusCode

        /**
         * Returns the raw JSON value of [amcMsnNum].
         *
         * Unlike [amcMsnNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amcMsnNum") @ExcludeMissing fun _amcMsnNum(): JsonField<String> = amcMsnNum

        /**
         * Returns the raw JSON value of [amcMsnType].
         *
         * Unlike [amcMsnType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amcMsnType")
        @ExcludeMissing
        fun _amcMsnType(): JsonField<String> = amcMsnType

        /**
         * Returns the raw JSON value of [arrFaa].
         *
         * Unlike [arrFaa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arrFAA") @ExcludeMissing fun _arrFaa(): JsonField<String> = arrFaa

        /**
         * Returns the raw JSON value of [arrIata].
         *
         * Unlike [arrIata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arrIATA") @ExcludeMissing fun _arrIata(): JsonField<String> = arrIata

        /**
         * Returns the raw JSON value of [arrIcao].
         *
         * Unlike [arrIcao], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("arrICAO") @ExcludeMissing fun _arrIcao(): JsonField<String> = arrIcao

        /**
         * Returns the raw JSON value of [arrItinerary].
         *
         * Unlike [arrItinerary], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("arrItinerary")
        @ExcludeMissing
        fun _arrItinerary(): JsonField<Int> = arrItinerary

        /**
         * Returns the raw JSON value of [arrPurposeCode].
         *
         * Unlike [arrPurposeCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("arrPurposeCode")
        @ExcludeMissing
        fun _arrPurposeCode(): JsonField<String> = arrPurposeCode

        /**
         * Returns the raw JSON value of [callSign].
         *
         * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

        /**
         * Returns the raw JSON value of [cargoConfig].
         *
         * Unlike [cargoConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cargoConfig")
        @ExcludeMissing
        fun _cargoConfig(): JsonField<String> = cargoConfig

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
         * Returns the raw JSON value of [currentState].
         *
         * Unlike [currentState], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currentState")
        @ExcludeMissing
        fun _currentState(): JsonField<String> = currentState

        /**
         * Returns the raw JSON value of [delayCode].
         *
         * Unlike [delayCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delayCode") @ExcludeMissing fun _delayCode(): JsonField<String> = delayCode

        /**
         * Returns the raw JSON value of [depFaa].
         *
         * Unlike [depFaa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("depFAA") @ExcludeMissing fun _depFaa(): JsonField<String> = depFaa

        /**
         * Returns the raw JSON value of [depIata].
         *
         * Unlike [depIata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("depIATA") @ExcludeMissing fun _depIata(): JsonField<String> = depIata

        /**
         * Returns the raw JSON value of [depIcao].
         *
         * Unlike [depIcao], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("depICAO") @ExcludeMissing fun _depIcao(): JsonField<String> = depIcao

        /**
         * Returns the raw JSON value of [depItinerary].
         *
         * Unlike [depItinerary], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("depItinerary")
        @ExcludeMissing
        fun _depItinerary(): JsonField<Int> = depItinerary

        /**
         * Returns the raw JSON value of [depPurposeCode].
         *
         * Unlike [depPurposeCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("depPurposeCode")
        @ExcludeMissing
        fun _depPurposeCode(): JsonField<String> = depPurposeCode

        /**
         * Returns the raw JSON value of [dhd].
         *
         * Unlike [dhd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dhd") @ExcludeMissing fun _dhd(): JsonField<OffsetDateTime> = dhd

        /**
         * Returns the raw JSON value of [dhdReason].
         *
         * Unlike [dhdReason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dhdReason") @ExcludeMissing fun _dhdReason(): JsonField<String> = dhdReason

        /**
         * Returns the raw JSON value of [estArrTime].
         *
         * Unlike [estArrTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("estArrTime")
        @ExcludeMissing
        fun _estArrTime(): JsonField<OffsetDateTime> = estArrTime

        /**
         * Returns the raw JSON value of [estBlockInTime].
         *
         * Unlike [estBlockInTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("estBlockInTime")
        @ExcludeMissing
        fun _estBlockInTime(): JsonField<OffsetDateTime> = estBlockInTime

        /**
         * Returns the raw JSON value of [estBlockOutTime].
         *
         * Unlike [estBlockOutTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("estBlockOutTime")
        @ExcludeMissing
        fun _estBlockOutTime(): JsonField<OffsetDateTime> = estBlockOutTime

        /**
         * Returns the raw JSON value of [estDepTime].
         *
         * Unlike [estDepTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("estDepTime")
        @ExcludeMissing
        fun _estDepTime(): JsonField<OffsetDateTime> = estDepTime

        /**
         * Returns the raw JSON value of [filename].
         *
         * Unlike [filename], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filename") @ExcludeMissing fun _filename(): JsonField<String> = filename

        /**
         * Returns the raw JSON value of [filesize].
         *
         * Unlike [filesize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filesize") @ExcludeMissing fun _filesize(): JsonField<Int> = filesize

        /**
         * Returns the raw JSON value of [flightTime].
         *
         * Unlike [flightTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("flightTime")
        @ExcludeMissing
        fun _flightTime(): JsonField<Double> = flightTime

        /**
         * Returns the raw JSON value of [fmDeskNum].
         *
         * Unlike [fmDeskNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fmDeskNum") @ExcludeMissing fun _fmDeskNum(): JsonField<String> = fmDeskNum

        /**
         * Returns the raw JSON value of [fmName].
         *
         * Unlike [fmName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fmName") @ExcludeMissing fun _fmName(): JsonField<String> = fmName

        /**
         * Returns the raw JSON value of [fuelReq].
         *
         * Unlike [fuelReq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fuelReq") @ExcludeMissing fun _fuelReq(): JsonField<Double> = fuelReq

        /**
         * Returns the raw JSON value of [gndTime].
         *
         * Unlike [gndTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gndTime") @ExcludeMissing fun _gndTime(): JsonField<Double> = gndTime

        /**
         * Returns the raw JSON value of [idAircraft].
         *
         * Unlike [idAircraft], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idAircraft")
        @ExcludeMissing
        fun _idAircraft(): JsonField<String> = idAircraft

        /**
         * Returns the raw JSON value of [idMission].
         *
         * Unlike [idMission], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idMission") @ExcludeMissing fun _idMission(): JsonField<String> = idMission

        /**
         * Returns the raw JSON value of [jcsPriority].
         *
         * Unlike [jcsPriority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jcsPriority")
        @ExcludeMissing
        fun _jcsPriority(): JsonField<String> = jcsPriority

        /**
         * Returns the raw JSON value of [legNum].
         *
         * Unlike [legNum], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legNum") @ExcludeMissing fun _legNum(): JsonField<Int> = legNum

        /**
         * Returns the raw JSON value of [lineNumber].
         *
         * Unlike [lineNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lineNumber") @ExcludeMissing fun _lineNumber(): JsonField<Int> = lineNumber

        /**
         * Returns the raw JSON value of [missionId].
         *
         * Unlike [missionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionId") @ExcludeMissing fun _missionId(): JsonField<String> = missionId

        /**
         * Returns the raw JSON value of [missionUpdate].
         *
         * Unlike [missionUpdate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionUpdate")
        @ExcludeMissing
        fun _missionUpdate(): JsonField<OffsetDateTime> = missionUpdate

        /**
         * Returns the raw JSON value of [objectiveRemarks].
         *
         * Unlike [objectiveRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("objectiveRemarks")
        @ExcludeMissing
        fun _objectiveRemarks(): JsonField<String> = objectiveRemarks

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
         * Returns the raw JSON value of [origSortieId].
         *
         * Unlike [origSortieId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("origSortieId")
        @ExcludeMissing
        fun _origSortieId(): JsonField<String> = origSortieId

        /**
         * Returns the raw JSON value of [oxyOnCrew].
         *
         * Unlike [oxyOnCrew], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oxyOnCrew") @ExcludeMissing fun _oxyOnCrew(): JsonField<Double> = oxyOnCrew

        /**
         * Returns the raw JSON value of [oxyOnPax].
         *
         * Unlike [oxyOnPax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oxyOnPax") @ExcludeMissing fun _oxyOnPax(): JsonField<Double> = oxyOnPax

        /**
         * Returns the raw JSON value of [oxyReqCrew].
         *
         * Unlike [oxyReqCrew], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oxyReqCrew")
        @ExcludeMissing
        fun _oxyReqCrew(): JsonField<Double> = oxyReqCrew

        /**
         * Returns the raw JSON value of [oxyReqPax].
         *
         * Unlike [oxyReqPax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("oxyReqPax") @ExcludeMissing fun _oxyReqPax(): JsonField<Double> = oxyReqPax

        /**
         * Returns the raw JSON value of [paperStatus].
         *
         * Unlike [paperStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paperStatus")
        @ExcludeMissing
        fun _paperStatus(): JsonField<PaperStatus> = paperStatus

        /**
         * Returns the raw JSON value of [papersVersion].
         *
         * Unlike [papersVersion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("papersVersion")
        @ExcludeMissing
        fun _papersVersion(): JsonField<String> = papersVersion

        /**
         * Returns the raw JSON value of [parkingLoc].
         *
         * Unlike [parkingLoc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("parkingLoc")
        @ExcludeMissing
        fun _parkingLoc(): JsonField<String> = parkingLoc

        /**
         * Returns the raw JSON value of [passengers].
         *
         * Unlike [passengers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("passengers") @ExcludeMissing fun _passengers(): JsonField<Int> = passengers

        /**
         * Returns the raw JSON value of [plannedArrTime].
         *
         * Unlike [plannedArrTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("plannedArrTime")
        @ExcludeMissing
        fun _plannedArrTime(): JsonField<OffsetDateTime> = plannedArrTime

        /**
         * Returns the raw JSON value of [pprStatus].
         *
         * Unlike [pprStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pprStatus")
        @ExcludeMissing
        fun _pprStatus(): JsonField<PprStatus> = pprStatus

        /**
         * Returns the raw JSON value of [primaryScl].
         *
         * Unlike [primaryScl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("primarySCL")
        @ExcludeMissing
        fun _primaryScl(): JsonField<String> = primaryScl

        /**
         * Returns the raw JSON value of [rawFileUri].
         *
         * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        fun _rawFileUri(): JsonField<String> = rawFileUri

        /**
         * Returns the raw JSON value of [reqConfig].
         *
         * Unlike [reqConfig], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reqConfig") @ExcludeMissing fun _reqConfig(): JsonField<String> = reqConfig

        /**
         * Returns the raw JSON value of [resultRemarks].
         *
         * Unlike [resultRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("resultRemarks")
        @ExcludeMissing
        fun _resultRemarks(): JsonField<String> = resultRemarks

        /**
         * Returns the raw JSON value of [rvnReq].
         *
         * Unlike [rvnReq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rvnReq") @ExcludeMissing fun _rvnReq(): JsonField<RvnReq> = rvnReq

        /**
         * Returns the raw JSON value of [scheduleRemarks].
         *
         * Unlike [scheduleRemarks], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduleRemarks")
        @ExcludeMissing
        fun _scheduleRemarks(): JsonField<String> = scheduleRemarks

        /**
         * Returns the raw JSON value of [secondaryScl].
         *
         * Unlike [secondaryScl], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("secondarySCL")
        @ExcludeMissing
        fun _secondaryScl(): JsonField<String> = secondaryScl

        /**
         * Returns the raw JSON value of [soe].
         *
         * Unlike [soe], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("soe") @ExcludeMissing fun _soe(): JsonField<String> = soe

        /**
         * Returns the raw JSON value of [sortieDate].
         *
         * Unlike [sortieDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sortieDate")
        @ExcludeMissing
        fun _sortieDate(): JsonField<LocalDate> = sortieDate

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

        /**
         * Returns the raw JSON value of [tailNumber].
         *
         * Unlike [tailNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tailNumber")
        @ExcludeMissing
        fun _tailNumber(): JsonField<String> = tailNumber

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .plannedDepTime()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var plannedDepTime: JsonField<OffsetDateTime>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var actualArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var actualBlockInTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var actualBlockOutTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var actualDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var aircraftAdsb: JsonField<String> = JsonMissing.of()
            private var aircraftAltId: JsonField<String> = JsonMissing.of()
            private var aircraftEvent: JsonField<String> = JsonMissing.of()
            private var aircraftMds: JsonField<String> = JsonMissing.of()
            private var aircraftRemarks: JsonField<String> = JsonMissing.of()
            private var alertStatus: JsonField<Int> = JsonMissing.of()
            private var alertStatusCode: JsonField<String> = JsonMissing.of()
            private var amcMsnNum: JsonField<String> = JsonMissing.of()
            private var amcMsnType: JsonField<String> = JsonMissing.of()
            private var arrFaa: JsonField<String> = JsonMissing.of()
            private var arrIata: JsonField<String> = JsonMissing.of()
            private var arrIcao: JsonField<String> = JsonMissing.of()
            private var arrItinerary: JsonField<Int> = JsonMissing.of()
            private var arrPurposeCode: JsonField<String> = JsonMissing.of()
            private var callSign: JsonField<String> = JsonMissing.of()
            private var cargoConfig: JsonField<String> = JsonMissing.of()
            private var commanderName: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var currentState: JsonField<String> = JsonMissing.of()
            private var delayCode: JsonField<String> = JsonMissing.of()
            private var depFaa: JsonField<String> = JsonMissing.of()
            private var depIata: JsonField<String> = JsonMissing.of()
            private var depIcao: JsonField<String> = JsonMissing.of()
            private var depItinerary: JsonField<Int> = JsonMissing.of()
            private var depPurposeCode: JsonField<String> = JsonMissing.of()
            private var dhd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dhdReason: JsonField<String> = JsonMissing.of()
            private var estArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var estBlockInTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var estBlockOutTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var estDepTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var filename: JsonField<String> = JsonMissing.of()
            private var filesize: JsonField<Int> = JsonMissing.of()
            private var flightTime: JsonField<Double> = JsonMissing.of()
            private var fmDeskNum: JsonField<String> = JsonMissing.of()
            private var fmName: JsonField<String> = JsonMissing.of()
            private var fuelReq: JsonField<Double> = JsonMissing.of()
            private var gndTime: JsonField<Double> = JsonMissing.of()
            private var idAircraft: JsonField<String> = JsonMissing.of()
            private var idMission: JsonField<String> = JsonMissing.of()
            private var jcsPriority: JsonField<String> = JsonMissing.of()
            private var legNum: JsonField<Int> = JsonMissing.of()
            private var lineNumber: JsonField<Int> = JsonMissing.of()
            private var missionId: JsonField<String> = JsonMissing.of()
            private var missionUpdate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var objectiveRemarks: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var origSortieId: JsonField<String> = JsonMissing.of()
            private var oxyOnCrew: JsonField<Double> = JsonMissing.of()
            private var oxyOnPax: JsonField<Double> = JsonMissing.of()
            private var oxyReqCrew: JsonField<Double> = JsonMissing.of()
            private var oxyReqPax: JsonField<Double> = JsonMissing.of()
            private var paperStatus: JsonField<PaperStatus> = JsonMissing.of()
            private var papersVersion: JsonField<String> = JsonMissing.of()
            private var parkingLoc: JsonField<String> = JsonMissing.of()
            private var passengers: JsonField<Int> = JsonMissing.of()
            private var plannedArrTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pprStatus: JsonField<PprStatus> = JsonMissing.of()
            private var primaryScl: JsonField<String> = JsonMissing.of()
            private var rawFileUri: JsonField<String> = JsonMissing.of()
            private var reqConfig: JsonField<String> = JsonMissing.of()
            private var resultRemarks: JsonField<String> = JsonMissing.of()
            private var rvnReq: JsonField<RvnReq> = JsonMissing.of()
            private var scheduleRemarks: JsonField<String> = JsonMissing.of()
            private var secondaryScl: JsonField<String> = JsonMissing.of()
            private var soe: JsonField<String> = JsonMissing.of()
            private var sortieDate: JsonField<LocalDate> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()
            private var tailNumber: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                plannedDepTime = body.plannedDepTime
                source = body.source
                id = body.id
                actualArrTime = body.actualArrTime
                actualBlockInTime = body.actualBlockInTime
                actualBlockOutTime = body.actualBlockOutTime
                actualDepTime = body.actualDepTime
                aircraftAdsb = body.aircraftAdsb
                aircraftAltId = body.aircraftAltId
                aircraftEvent = body.aircraftEvent
                aircraftMds = body.aircraftMds
                aircraftRemarks = body.aircraftRemarks
                alertStatus = body.alertStatus
                alertStatusCode = body.alertStatusCode
                amcMsnNum = body.amcMsnNum
                amcMsnType = body.amcMsnType
                arrFaa = body.arrFaa
                arrIata = body.arrIata
                arrIcao = body.arrIcao
                arrItinerary = body.arrItinerary
                arrPurposeCode = body.arrPurposeCode
                callSign = body.callSign
                cargoConfig = body.cargoConfig
                commanderName = body.commanderName
                createdAt = body.createdAt
                createdBy = body.createdBy
                currentState = body.currentState
                delayCode = body.delayCode
                depFaa = body.depFaa
                depIata = body.depIata
                depIcao = body.depIcao
                depItinerary = body.depItinerary
                depPurposeCode = body.depPurposeCode
                dhd = body.dhd
                dhdReason = body.dhdReason
                estArrTime = body.estArrTime
                estBlockInTime = body.estBlockInTime
                estBlockOutTime = body.estBlockOutTime
                estDepTime = body.estDepTime
                filename = body.filename
                filesize = body.filesize
                flightTime = body.flightTime
                fmDeskNum = body.fmDeskNum
                fmName = body.fmName
                fuelReq = body.fuelReq
                gndTime = body.gndTime
                idAircraft = body.idAircraft
                idMission = body.idMission
                jcsPriority = body.jcsPriority
                legNum = body.legNum
                lineNumber = body.lineNumber
                missionId = body.missionId
                missionUpdate = body.missionUpdate
                objectiveRemarks = body.objectiveRemarks
                origin = body.origin
                origNetwork = body.origNetwork
                origSortieId = body.origSortieId
                oxyOnCrew = body.oxyOnCrew
                oxyOnPax = body.oxyOnPax
                oxyReqCrew = body.oxyReqCrew
                oxyReqPax = body.oxyReqPax
                paperStatus = body.paperStatus
                papersVersion = body.papersVersion
                parkingLoc = body.parkingLoc
                passengers = body.passengers
                plannedArrTime = body.plannedArrTime
                pprStatus = body.pprStatus
                primaryScl = body.primaryScl
                rawFileUri = body.rawFileUri
                reqConfig = body.reqConfig
                resultRemarks = body.resultRemarks
                rvnReq = body.rvnReq
                scheduleRemarks = body.scheduleRemarks
                secondaryScl = body.secondaryScl
                soe = body.soe
                sortieDate = body.sortieDate
                sourceDl = body.sourceDl
                tailNumber = body.tailNumber
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
             * The scheduled time that the Aircraft sortie is planned to depart, in ISO 8601 UTC
             * format with millisecond precision.
             */
            fun plannedDepTime(plannedDepTime: OffsetDateTime) =
                plannedDepTime(JsonField.of(plannedDepTime))

            /**
             * Sets [Builder.plannedDepTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plannedDepTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plannedDepTime(plannedDepTime: JsonField<OffsetDateTime>) = apply {
                this.plannedDepTime = plannedDepTime
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

            /** The actual arrival time, in ISO 8601 UTC format with millisecond precision. */
            fun actualArrTime(actualArrTime: OffsetDateTime) =
                actualArrTime(JsonField.of(actualArrTime))

            /**
             * Sets [Builder.actualArrTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualArrTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun actualArrTime(actualArrTime: JsonField<OffsetDateTime>) = apply {
                this.actualArrTime = actualArrTime
            }

            /**
             * The actual time the Aircraft comes to a complete stop in its parking position, in ISO
             * 8601 UTC format with millisecond precision.
             */
            fun actualBlockInTime(actualBlockInTime: OffsetDateTime) =
                actualBlockInTime(JsonField.of(actualBlockInTime))

            /**
             * Sets [Builder.actualBlockInTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualBlockInTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun actualBlockInTime(actualBlockInTime: JsonField<OffsetDateTime>) = apply {
                this.actualBlockInTime = actualBlockInTime
            }

            /**
             * The actual time the Aircraft begins to taxi from its parking position, in ISO 8601
             * UTC format with millisecond precision.
             */
            fun actualBlockOutTime(actualBlockOutTime: OffsetDateTime) =
                actualBlockOutTime(JsonField.of(actualBlockOutTime))

            /**
             * Sets [Builder.actualBlockOutTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualBlockOutTime] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun actualBlockOutTime(actualBlockOutTime: JsonField<OffsetDateTime>) = apply {
                this.actualBlockOutTime = actualBlockOutTime
            }

            /** The actual departure time, in ISO 8601 UTC format. */
            fun actualDepTime(actualDepTime: OffsetDateTime) =
                actualDepTime(JsonField.of(actualDepTime))

            /**
             * Sets [Builder.actualDepTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actualDepTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun actualDepTime(actualDepTime: JsonField<OffsetDateTime>) = apply {
                this.actualDepTime = actualDepTime
            }

            /** The Automatic Dependent Surveillance-Broadcast (ADS-B) device identifier. */
            fun aircraftAdsb(aircraftAdsb: String) = aircraftAdsb(JsonField.of(aircraftAdsb))

            /**
             * Sets [Builder.aircraftAdsb] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftAdsb] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftAdsb(aircraftAdsb: JsonField<String>) = apply {
                this.aircraftAdsb = aircraftAdsb
            }

            /** Alternate Aircraft Identifier provided by source. */
            fun aircraftAltId(aircraftAltId: String) = aircraftAltId(JsonField.of(aircraftAltId))

            /**
             * Sets [Builder.aircraftAltId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftAltId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftAltId(aircraftAltId: JsonField<String>) = apply {
                this.aircraftAltId = aircraftAltId
            }

            /** Aircraft event text. */
            fun aircraftEvent(aircraftEvent: String) = aircraftEvent(JsonField.of(aircraftEvent))

            /**
             * Sets [Builder.aircraftEvent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftEvent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftEvent(aircraftEvent: JsonField<String>) = apply {
                this.aircraftEvent = aircraftEvent
            }

            /** The aircraft Model Design Series designation assigned to this sortie. */
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

            /** Remarks concerning the aircraft. */
            fun aircraftRemarks(aircraftRemarks: String) =
                aircraftRemarks(JsonField.of(aircraftRemarks))

            /**
             * Sets [Builder.aircraftRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aircraftRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun aircraftRemarks(aircraftRemarks: JsonField<String>) = apply {
                this.aircraftRemarks = aircraftRemarks
            }

            /** The amount of time allowed between launch order and takeoff, in seconds. */
            fun alertStatus(alertStatus: Int) = alertStatus(JsonField.of(alertStatus))

            /**
             * Sets [Builder.alertStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertStatus] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alertStatus(alertStatus: JsonField<Int>) = apply { this.alertStatus = alertStatus }

            /** The Alert Status code. */
            fun alertStatusCode(alertStatusCode: String) =
                alertStatusCode(JsonField.of(alertStatusCode))

            /**
             * Sets [Builder.alertStatusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertStatusCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alertStatusCode(alertStatusCode: JsonField<String>) = apply {
                this.alertStatusCode = alertStatusCode
            }

            /** The Air Mobility Command (AMC) mission number of the sortie. */
            fun amcMsnNum(amcMsnNum: String) = amcMsnNum(JsonField.of(amcMsnNum))

            /**
             * Sets [Builder.amcMsnNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amcMsnNum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amcMsnNum(amcMsnNum: JsonField<String>) = apply { this.amcMsnNum = amcMsnNum }

            /** The type of mission (e.g. SAAM, CHNL, etc.). */
            fun amcMsnType(amcMsnType: String) = amcMsnType(JsonField.of(amcMsnType))

            /**
             * Sets [Builder.amcMsnType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amcMsnType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amcMsnType(amcMsnType: JsonField<String>) = apply { this.amcMsnType = amcMsnType }

            /** The arrival Federal Aviation Administration (FAA) code of this sortie. */
            fun arrFaa(arrFaa: String) = arrFaa(JsonField.of(arrFaa))

            /**
             * Sets [Builder.arrFaa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrFaa] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrFaa(arrFaa: JsonField<String>) = apply { this.arrFaa = arrFaa }

            /**
             * The arrival International Aviation Transport Association (IATA) code of this sortie.
             */
            fun arrIata(arrIata: String) = arrIata(JsonField.of(arrIata))

            /**
             * Sets [Builder.arrIata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrIata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrIata(arrIata: JsonField<String>) = apply { this.arrIata = arrIata }

            /** The arrival International Civil Aviation Organization (ICAO) of this sortie. */
            fun arrIcao(arrIcao: String) = arrIcao(JsonField.of(arrIcao))

            /**
             * Sets [Builder.arrIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrIcao] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrIcao(arrIcao: JsonField<String>) = apply { this.arrIcao = arrIcao }

            /** The itinerary identifier of the arrival location. */
            fun arrItinerary(arrItinerary: Int) = arrItinerary(JsonField.of(arrItinerary))

            /**
             * Sets [Builder.arrItinerary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrItinerary] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrItinerary(arrItinerary: JsonField<Int>) = apply {
                this.arrItinerary = arrItinerary
            }

            /** Purpose code at the arrival location of this sortie. */
            fun arrPurposeCode(arrPurposeCode: String) =
                arrPurposeCode(JsonField.of(arrPurposeCode))

            /**
             * Sets [Builder.arrPurposeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.arrPurposeCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun arrPurposeCode(arrPurposeCode: JsonField<String>) = apply {
                this.arrPurposeCode = arrPurposeCode
            }

            /** The call sign assigned to the aircraft on this sortie. */
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
             * Description of the cargo configuration (e.g. C-1, C-2, C-3, DV-1, DV-2, AE-1, etc.)
             * currently on board the aircraft. Configuration meanings are determined by the data
             * source.
             */
            fun cargoConfig(cargoConfig: String) = cargoConfig(JsonField.of(cargoConfig))

            /**
             * Sets [Builder.cargoConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cargoConfig] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cargoConfig(cargoConfig: JsonField<String>) = apply {
                this.cargoConfig = cargoConfig
            }

            /** The last name of the aircraft commander. */
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

            /** The current state of this sortie. */
            fun currentState(currentState: String) = currentState(JsonField.of(currentState))

            /**
             * Sets [Builder.currentState] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currentState] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currentState(currentState: JsonField<String>) = apply {
                this.currentState = currentState
            }

            /** The primary delay code. */
            fun delayCode(delayCode: String) = delayCode(JsonField.of(delayCode))

            /**
             * Sets [Builder.delayCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delayCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delayCode(delayCode: JsonField<String>) = apply { this.delayCode = delayCode }

            /** The departure Federal Aviation Administration (FAA) code of this sortie. */
            fun depFaa(depFaa: String) = depFaa(JsonField.of(depFaa))

            /**
             * Sets [Builder.depFaa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depFaa] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depFaa(depFaa: JsonField<String>) = apply { this.depFaa = depFaa }

            /**
             * The departure International Aviation Transport Association (IATA) code of this
             * sortie.
             */
            fun depIata(depIata: String) = depIata(JsonField.of(depIata))

            /**
             * Sets [Builder.depIata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depIata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depIata(depIata: JsonField<String>) = apply { this.depIata = depIata }

            /** The departure International Civil Aviation Organization (ICAO) of this sortie. */
            fun depIcao(depIcao: String) = depIcao(JsonField.of(depIcao))

            /**
             * Sets [Builder.depIcao] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depIcao] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depIcao(depIcao: JsonField<String>) = apply { this.depIcao = depIcao }

            /** The itinerary identifier of the departure location. */
            fun depItinerary(depItinerary: Int) = depItinerary(JsonField.of(depItinerary))

            /**
             * Sets [Builder.depItinerary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depItinerary] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depItinerary(depItinerary: JsonField<Int>) = apply {
                this.depItinerary = depItinerary
            }

            /** Purpose code at the departure location of this sortie. */
            fun depPurposeCode(depPurposeCode: String) =
                depPurposeCode(JsonField.of(depPurposeCode))

            /**
             * Sets [Builder.depPurposeCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.depPurposeCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun depPurposeCode(depPurposeCode: JsonField<String>) = apply {
                this.depPurposeCode = depPurposeCode
            }

            /**
             * Due home date by which the aircraft must return to its home station, in ISO 8601 UTC
             * format with millisecond precision.
             */
            fun dhd(dhd: OffsetDateTime) = dhd(JsonField.of(dhd))

            /**
             * Sets [Builder.dhd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dhd] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dhd(dhd: JsonField<OffsetDateTime>) = apply { this.dhd = dhd }

            /** Reason the aircraft must return to home station by its due home date. */
            fun dhdReason(dhdReason: String) = dhdReason(JsonField.of(dhdReason))

            /**
             * Sets [Builder.dhdReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dhdReason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dhdReason(dhdReason: JsonField<String>) = apply { this.dhdReason = dhdReason }

            /**
             * The current estimated time that the Aircraft is planned to arrive, in ISO 8601 UTC
             * format with millisecond precision.
             */
            fun estArrTime(estArrTime: OffsetDateTime) = estArrTime(JsonField.of(estArrTime))

            /**
             * Sets [Builder.estArrTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estArrTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun estArrTime(estArrTime: JsonField<OffsetDateTime>) = apply {
                this.estArrTime = estArrTime
            }

            /**
             * The estimated time the Aircraft will come to a complete stop in its parking position,
             * in ISO 8601 UTC format with millisecond precision.
             */
            fun estBlockInTime(estBlockInTime: OffsetDateTime) =
                estBlockInTime(JsonField.of(estBlockInTime))

            /**
             * Sets [Builder.estBlockInTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estBlockInTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun estBlockInTime(estBlockInTime: JsonField<OffsetDateTime>) = apply {
                this.estBlockInTime = estBlockInTime
            }

            /**
             * The estimated time the Aircraft will begin to taxi from its parking position, in ISO
             * 8601 UTC format with millisecond precision.
             */
            fun estBlockOutTime(estBlockOutTime: OffsetDateTime) =
                estBlockOutTime(JsonField.of(estBlockOutTime))

            /**
             * Sets [Builder.estBlockOutTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estBlockOutTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun estBlockOutTime(estBlockOutTime: JsonField<OffsetDateTime>) = apply {
                this.estBlockOutTime = estBlockOutTime
            }

            /**
             * The current estimated time that the Aircraft is planned to depart, in ISO 8601 UTC
             * format with millisecond precision.
             */
            fun estDepTime(estDepTime: OffsetDateTime) = estDepTime(JsonField.of(estDepTime))

            /**
             * Sets [Builder.estDepTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.estDepTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun estDepTime(estDepTime: JsonField<OffsetDateTime>) = apply {
                this.estDepTime = estDepTime
            }

            /** Name of the uploaded PDF. */
            fun filename(filename: String) = filename(JsonField.of(filename))

            /**
             * Sets [Builder.filename] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filename] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filename(filename: JsonField<String>) = apply { this.filename = filename }

            /** Size of the supporting PDF, in bytes. */
            fun filesize(filesize: Int) = filesize(JsonField.of(filesize))

            /**
             * Sets [Builder.filesize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filesize] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filesize(filesize: JsonField<Int>) = apply { this.filesize = filesize }

            /** The planned flight time for this sortie, in minutes. */
            fun flightTime(flightTime: Double) = flightTime(JsonField.of(flightTime))

            /**
             * Sets [Builder.flightTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.flightTime] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun flightTime(flightTime: JsonField<Double>) = apply { this.flightTime = flightTime }

            /**
             * Desk phone number of the flight manager assigned to the sortie. Null when no flight
             * manager is assigned.
             */
            fun fmDeskNum(fmDeskNum: String) = fmDeskNum(JsonField.of(fmDeskNum))

            /**
             * Sets [Builder.fmDeskNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fmDeskNum] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fmDeskNum(fmDeskNum: JsonField<String>) = apply { this.fmDeskNum = fmDeskNum }

            /**
             * Last name of the flight manager assigned to the sortie. Null when no flight manager
             * is assigned.
             */
            fun fmName(fmName: String) = fmName(JsonField.of(fmName))

            /**
             * Sets [Builder.fmName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fmName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fmName(fmName: JsonField<String>) = apply { this.fmName = fmName }

            /** Mass of fuel required for this leg of the sortie, in kilograms. */
            fun fuelReq(fuelReq: Double) = fuelReq(JsonField.of(fuelReq))

            /**
             * Sets [Builder.fuelReq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fuelReq] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fuelReq(fuelReq: JsonField<Double>) = apply { this.fuelReq = fuelReq }

            /** Scheduled ground time, in minutes. */
            fun gndTime(gndTime: Double) = gndTime(JsonField.of(gndTime))

            /**
             * Sets [Builder.gndTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gndTime] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gndTime(gndTime: JsonField<Double>) = apply { this.gndTime = gndTime }

            /** Unique identifier of the aircraft. */
            fun idAircraft(idAircraft: String) = idAircraft(JsonField.of(idAircraft))

            /**
             * Sets [Builder.idAircraft] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idAircraft] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idAircraft(idAircraft: JsonField<String>) = apply { this.idAircraft = idAircraft }

            /** The unique identifier of the mission to which this sortie is assigned. */
            fun idMission(idMission: String) = idMission(JsonField.of(idMission))

            /**
             * Sets [Builder.idMission] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idMission] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idMission(idMission: JsonField<String>) = apply { this.idMission = idMission }

            /** Joint Chiefs of Staff priority of this sortie. */
            fun jcsPriority(jcsPriority: String) = jcsPriority(JsonField.of(jcsPriority))

            /**
             * Sets [Builder.jcsPriority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jcsPriority] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jcsPriority(jcsPriority: JsonField<String>) = apply {
                this.jcsPriority = jcsPriority
            }

            /** The leg number of this sortie. */
            fun legNum(legNum: Int) = legNum(JsonField.of(legNum))

            /**
             * Sets [Builder.legNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legNum] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun legNum(legNum: JsonField<Int>) = apply { this.legNum = legNum }

            /** The external system line number of this sortie. */
            fun lineNumber(lineNumber: Int) = lineNumber(JsonField.of(lineNumber))

            /**
             * Sets [Builder.lineNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lineNumber] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lineNumber(lineNumber: JsonField<Int>) = apply { this.lineNumber = lineNumber }

            /** The mission ID according to the source system. */
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
             * Time the associated mission data was last updated in relation to the aircraft
             * assignment, in ISO 8601 UTC format with millisecond precision. If this time is coming
             * from an external system, it may not sync with the latest mission time associated to
             * this record.
             */
            fun missionUpdate(missionUpdate: OffsetDateTime) =
                missionUpdate(JsonField.of(missionUpdate))

            /**
             * Sets [Builder.missionUpdate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionUpdate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missionUpdate(missionUpdate: JsonField<OffsetDateTime>) = apply {
                this.missionUpdate = missionUpdate
            }

            /** Remarks concerning the sortie objective. */
            fun objectiveRemarks(objectiveRemarks: String) =
                objectiveRemarks(JsonField.of(objectiveRemarks))

            /**
             * Sets [Builder.objectiveRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectiveRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun objectiveRemarks(objectiveRemarks: JsonField<String>) = apply {
                this.objectiveRemarks = objectiveRemarks
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

            /** The sortie identifier provided by the originating source. */
            fun origSortieId(origSortieId: String) = origSortieId(JsonField.of(origSortieId))

            /**
             * Sets [Builder.origSortieId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origSortieId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origSortieId(origSortieId: JsonField<String>) = apply {
                this.origSortieId = origSortieId
            }

            /** Liquid oxygen onboard the aircraft for the crew compartment, in liters. */
            fun oxyOnCrew(oxyOnCrew: Double) = oxyOnCrew(JsonField.of(oxyOnCrew))

            /**
             * Sets [Builder.oxyOnCrew] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oxyOnCrew] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oxyOnCrew(oxyOnCrew: JsonField<Double>) = apply { this.oxyOnCrew = oxyOnCrew }

            /** Liquid oxygen onboard the aircraft for the troop compartment, in liters. */
            fun oxyOnPax(oxyOnPax: Double) = oxyOnPax(JsonField.of(oxyOnPax))

            /**
             * Sets [Builder.oxyOnPax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oxyOnPax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oxyOnPax(oxyOnPax: JsonField<Double>) = apply { this.oxyOnPax = oxyOnPax }

            /** Liquid oxygen required on the aircraft for the crew compartment, in liters. */
            fun oxyReqCrew(oxyReqCrew: Double) = oxyReqCrew(JsonField.of(oxyReqCrew))

            /**
             * Sets [Builder.oxyReqCrew] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oxyReqCrew] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oxyReqCrew(oxyReqCrew: JsonField<Double>) = apply { this.oxyReqCrew = oxyReqCrew }

            /** Liquid oxygen required on the aircraft for the troop compartment, in liters. */
            fun oxyReqPax(oxyReqPax: Double) = oxyReqPax(JsonField.of(oxyReqPax))

            /**
             * Sets [Builder.oxyReqPax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oxyReqPax] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun oxyReqPax(oxyReqPax: JsonField<Double>) = apply { this.oxyReqPax = oxyReqPax }

            /** The status of the supporting document. */
            fun paperStatus(paperStatus: PaperStatus) = paperStatus(JsonField.of(paperStatus))

            /**
             * Sets [Builder.paperStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paperStatus] with a well-typed [PaperStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paperStatus(paperStatus: JsonField<PaperStatus>) = apply {
                this.paperStatus = paperStatus
            }

            /** The version number of the crew paper. */
            fun papersVersion(papersVersion: String) = papersVersion(JsonField.of(papersVersion))

            /**
             * Sets [Builder.papersVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.papersVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun papersVersion(papersVersion: JsonField<String>) = apply {
                this.papersVersion = papersVersion
            }

            /** The POI parking location. */
            fun parkingLoc(parkingLoc: String) = parkingLoc(JsonField.of(parkingLoc))

            /**
             * Sets [Builder.parkingLoc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.parkingLoc] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun parkingLoc(parkingLoc: JsonField<String>) = apply { this.parkingLoc = parkingLoc }

            /** The number of passengers tasked for this sortie. */
            fun passengers(passengers: Int) = passengers(JsonField.of(passengers))

            /**
             * Sets [Builder.passengers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.passengers] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun passengers(passengers: JsonField<Int>) = apply { this.passengers = passengers }

            /**
             * The scheduled time that the Aircraft sortie is planned to arrive, in ISO 8601 UTC
             * format with millisecond precision.
             */
            fun plannedArrTime(plannedArrTime: OffsetDateTime) =
                plannedArrTime(JsonField.of(plannedArrTime))

            /**
             * Sets [Builder.plannedArrTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plannedArrTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plannedArrTime(plannedArrTime: JsonField<OffsetDateTime>) = apply {
                this.plannedArrTime = plannedArrTime
            }

            /** The prior permission required (PPR) status. */
            fun pprStatus(pprStatus: PprStatus) = pprStatus(JsonField.of(pprStatus))

            /**
             * Sets [Builder.pprStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pprStatus] with a well-typed [PprStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pprStatus(pprStatus: JsonField<PprStatus>) = apply { this.pprStatus = pprStatus }

            /** The planned primary Standard Conventional Load of the aircraft for this sortie. */
            fun primaryScl(primaryScl: String) = primaryScl(JsonField.of(primaryScl))

            /**
             * Sets [Builder.primaryScl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.primaryScl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun primaryScl(primaryScl: JsonField<String>) = apply { this.primaryScl = primaryScl }

            /**
             * When crew papers are associated to this sortie, the system updates this value. This
             * field is the URI location in the document repository of that raw file. To download
             * the raw file, prepend https://udl-hostname/scs/download?id= to this field's value.
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

            /** Aircraft configuration required for the mission. */
            fun reqConfig(reqConfig: String) = reqConfig(JsonField.of(reqConfig))

            /**
             * Sets [Builder.reqConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reqConfig] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reqConfig(reqConfig: JsonField<String>) = apply { this.reqConfig = reqConfig }

            /** Remarks concerning the results of this sortie. */
            fun resultRemarks(resultRemarks: String) = resultRemarks(JsonField.of(resultRemarks))

            /**
             * Sets [Builder.resultRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resultRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resultRemarks(resultRemarks: JsonField<String>) = apply {
                this.resultRemarks = resultRemarks
            }

            /**
             * Type of Ravens required for this sortie (N - None, R - Raven (Security Team)
             * required, C6 - Consider ravens (Ground time over 6 hours), R6 - Ravens required
             * (Ground time over 6 hours)).
             */
            fun rvnReq(rvnReq: RvnReq) = rvnReq(JsonField.of(rvnReq))

            /**
             * Sets [Builder.rvnReq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rvnReq] with a well-typed [RvnReq] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rvnReq(rvnReq: JsonField<RvnReq>) = apply { this.rvnReq = rvnReq }

            /** Remarks concerning the schedule. */
            fun scheduleRemarks(scheduleRemarks: String) =
                scheduleRemarks(JsonField.of(scheduleRemarks))

            /**
             * Sets [Builder.scheduleRemarks] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduleRemarks] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scheduleRemarks(scheduleRemarks: JsonField<String>) = apply {
                this.scheduleRemarks = scheduleRemarks
            }

            /** The planned secondary Standard Conventional Load of the aircraft for this sortie. */
            fun secondaryScl(secondaryScl: String) = secondaryScl(JsonField.of(secondaryScl))

            /**
             * Sets [Builder.secondaryScl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.secondaryScl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun secondaryScl(secondaryScl: JsonField<String>) = apply {
                this.secondaryScl = secondaryScl
            }

            /**
             * Indicates the group responsible for recording the completion time of the next event
             * in the sequence of events assigned to this sortie (e.g. OPS - Operations, MX -
             * Maintenance, TR - Transportation, etc.).
             */
            fun soe(soe: String) = soe(JsonField.of(soe))

            /**
             * Sets [Builder.soe] to an arbitrary JSON value.
             *
             * You should usually call [Builder.soe] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun soe(soe: JsonField<String>) = apply { this.soe = soe }

            /**
             * The scheduled UTC date for this sortie, in ISO 8601 date-only format (ex.
             * YYYY-MM-DD).
             */
            fun sortieDate(sortieDate: LocalDate) = sortieDate(JsonField.of(sortieDate))

            /**
             * Sets [Builder.sortieDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortieDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortieDate(sortieDate: JsonField<LocalDate>) = apply {
                this.sortieDate = sortieDate
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

            /** The tail number of the aircraft assigned to this sortie. */
            fun tailNumber(tailNumber: String) = tailNumber(JsonField.of(tailNumber))

            /**
             * Sets [Builder.tailNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tailNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tailNumber(tailNumber: JsonField<String>) = apply { this.tailNumber = tailNumber }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .plannedDepTime()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("plannedDepTime", plannedDepTime),
                    checkRequired("source", source),
                    id,
                    actualArrTime,
                    actualBlockInTime,
                    actualBlockOutTime,
                    actualDepTime,
                    aircraftAdsb,
                    aircraftAltId,
                    aircraftEvent,
                    aircraftMds,
                    aircraftRemarks,
                    alertStatus,
                    alertStatusCode,
                    amcMsnNum,
                    amcMsnType,
                    arrFaa,
                    arrIata,
                    arrIcao,
                    arrItinerary,
                    arrPurposeCode,
                    callSign,
                    cargoConfig,
                    commanderName,
                    createdAt,
                    createdBy,
                    currentState,
                    delayCode,
                    depFaa,
                    depIata,
                    depIcao,
                    depItinerary,
                    depPurposeCode,
                    dhd,
                    dhdReason,
                    estArrTime,
                    estBlockInTime,
                    estBlockOutTime,
                    estDepTime,
                    filename,
                    filesize,
                    flightTime,
                    fmDeskNum,
                    fmName,
                    fuelReq,
                    gndTime,
                    idAircraft,
                    idMission,
                    jcsPriority,
                    legNum,
                    lineNumber,
                    missionId,
                    missionUpdate,
                    objectiveRemarks,
                    origin,
                    origNetwork,
                    origSortieId,
                    oxyOnCrew,
                    oxyOnPax,
                    oxyReqCrew,
                    oxyReqPax,
                    paperStatus,
                    papersVersion,
                    parkingLoc,
                    passengers,
                    plannedArrTime,
                    pprStatus,
                    primaryScl,
                    rawFileUri,
                    reqConfig,
                    resultRemarks,
                    rvnReq,
                    scheduleRemarks,
                    secondaryScl,
                    soe,
                    sortieDate,
                    sourceDl,
                    tailNumber,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            plannedDepTime()
            source()
            id()
            actualArrTime()
            actualBlockInTime()
            actualBlockOutTime()
            actualDepTime()
            aircraftAdsb()
            aircraftAltId()
            aircraftEvent()
            aircraftMds()
            aircraftRemarks()
            alertStatus()
            alertStatusCode()
            amcMsnNum()
            amcMsnType()
            arrFaa()
            arrIata()
            arrIcao()
            arrItinerary()
            arrPurposeCode()
            callSign()
            cargoConfig()
            commanderName()
            createdAt()
            createdBy()
            currentState()
            delayCode()
            depFaa()
            depIata()
            depIcao()
            depItinerary()
            depPurposeCode()
            dhd()
            dhdReason()
            estArrTime()
            estBlockInTime()
            estBlockOutTime()
            estDepTime()
            filename()
            filesize()
            flightTime()
            fmDeskNum()
            fmName()
            fuelReq()
            gndTime()
            idAircraft()
            idMission()
            jcsPriority()
            legNum()
            lineNumber()
            missionId()
            missionUpdate()
            objectiveRemarks()
            origin()
            origNetwork()
            origSortieId()
            oxyOnCrew()
            oxyOnPax()
            oxyReqCrew()
            oxyReqPax()
            paperStatus().ifPresent { it.validate() }
            papersVersion()
            parkingLoc()
            passengers()
            plannedArrTime()
            pprStatus().ifPresent { it.validate() }
            primaryScl()
            rawFileUri()
            reqConfig()
            resultRemarks()
            rvnReq().ifPresent { it.validate() }
            scheduleRemarks()
            secondaryScl()
            soe()
            sortieDate()
            sourceDl()
            tailNumber()
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
                (if (plannedDepTime.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (actualArrTime.asKnown().isPresent) 1 else 0) +
                (if (actualBlockInTime.asKnown().isPresent) 1 else 0) +
                (if (actualBlockOutTime.asKnown().isPresent) 1 else 0) +
                (if (actualDepTime.asKnown().isPresent) 1 else 0) +
                (if (aircraftAdsb.asKnown().isPresent) 1 else 0) +
                (if (aircraftAltId.asKnown().isPresent) 1 else 0) +
                (if (aircraftEvent.asKnown().isPresent) 1 else 0) +
                (if (aircraftMds.asKnown().isPresent) 1 else 0) +
                (if (aircraftRemarks.asKnown().isPresent) 1 else 0) +
                (if (alertStatus.asKnown().isPresent) 1 else 0) +
                (if (alertStatusCode.asKnown().isPresent) 1 else 0) +
                (if (amcMsnNum.asKnown().isPresent) 1 else 0) +
                (if (amcMsnType.asKnown().isPresent) 1 else 0) +
                (if (arrFaa.asKnown().isPresent) 1 else 0) +
                (if (arrIata.asKnown().isPresent) 1 else 0) +
                (if (arrIcao.asKnown().isPresent) 1 else 0) +
                (if (arrItinerary.asKnown().isPresent) 1 else 0) +
                (if (arrPurposeCode.asKnown().isPresent) 1 else 0) +
                (if (callSign.asKnown().isPresent) 1 else 0) +
                (if (cargoConfig.asKnown().isPresent) 1 else 0) +
                (if (commanderName.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (currentState.asKnown().isPresent) 1 else 0) +
                (if (delayCode.asKnown().isPresent) 1 else 0) +
                (if (depFaa.asKnown().isPresent) 1 else 0) +
                (if (depIata.asKnown().isPresent) 1 else 0) +
                (if (depIcao.asKnown().isPresent) 1 else 0) +
                (if (depItinerary.asKnown().isPresent) 1 else 0) +
                (if (depPurposeCode.asKnown().isPresent) 1 else 0) +
                (if (dhd.asKnown().isPresent) 1 else 0) +
                (if (dhdReason.asKnown().isPresent) 1 else 0) +
                (if (estArrTime.asKnown().isPresent) 1 else 0) +
                (if (estBlockInTime.asKnown().isPresent) 1 else 0) +
                (if (estBlockOutTime.asKnown().isPresent) 1 else 0) +
                (if (estDepTime.asKnown().isPresent) 1 else 0) +
                (if (filename.asKnown().isPresent) 1 else 0) +
                (if (filesize.asKnown().isPresent) 1 else 0) +
                (if (flightTime.asKnown().isPresent) 1 else 0) +
                (if (fmDeskNum.asKnown().isPresent) 1 else 0) +
                (if (fmName.asKnown().isPresent) 1 else 0) +
                (if (fuelReq.asKnown().isPresent) 1 else 0) +
                (if (gndTime.asKnown().isPresent) 1 else 0) +
                (if (idAircraft.asKnown().isPresent) 1 else 0) +
                (if (idMission.asKnown().isPresent) 1 else 0) +
                (if (jcsPriority.asKnown().isPresent) 1 else 0) +
                (if (legNum.asKnown().isPresent) 1 else 0) +
                (if (lineNumber.asKnown().isPresent) 1 else 0) +
                (if (missionId.asKnown().isPresent) 1 else 0) +
                (if (missionUpdate.asKnown().isPresent) 1 else 0) +
                (if (objectiveRemarks.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (origSortieId.asKnown().isPresent) 1 else 0) +
                (if (oxyOnCrew.asKnown().isPresent) 1 else 0) +
                (if (oxyOnPax.asKnown().isPresent) 1 else 0) +
                (if (oxyReqCrew.asKnown().isPresent) 1 else 0) +
                (if (oxyReqPax.asKnown().isPresent) 1 else 0) +
                (paperStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (papersVersion.asKnown().isPresent) 1 else 0) +
                (if (parkingLoc.asKnown().isPresent) 1 else 0) +
                (if (passengers.asKnown().isPresent) 1 else 0) +
                (if (plannedArrTime.asKnown().isPresent) 1 else 0) +
                (pprStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (primaryScl.asKnown().isPresent) 1 else 0) +
                (if (rawFileUri.asKnown().isPresent) 1 else 0) +
                (if (reqConfig.asKnown().isPresent) 1 else 0) +
                (if (resultRemarks.asKnown().isPresent) 1 else 0) +
                (rvnReq.asKnown().getOrNull()?.validity() ?: 0) +
                (if (scheduleRemarks.asKnown().isPresent) 1 else 0) +
                (if (secondaryScl.asKnown().isPresent) 1 else 0) +
                (if (soe.asKnown().isPresent) 1 else 0) +
                (if (sortieDate.asKnown().isPresent) 1 else 0) +
                (if (sourceDl.asKnown().isPresent) 1 else 0) +
                (if (tailNumber.asKnown().isPresent) 1 else 0)

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

        /** The status of the supporting document. */
        class PaperStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val PUBLISHED = of("PUBLISHED")

                @JvmField val DELETED = of("DELETED")

                @JvmField val UPDATED = of("UPDATED")

                @JvmField val READ = of("READ")

                @JvmStatic fun of(value: String) = PaperStatus(JsonField.of(value))
            }

            /** An enum containing [PaperStatus]'s known values. */
            enum class Known {
                PUBLISHED,
                DELETED,
                UPDATED,
                READ,
            }

            /**
             * An enum containing [PaperStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaperStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PUBLISHED,
                DELETED,
                UPDATED,
                READ,
                /**
                 * An enum member indicating that [PaperStatus] was instantiated with an unknown
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
                    PUBLISHED -> Value.PUBLISHED
                    DELETED -> Value.DELETED
                    UPDATED -> Value.UPDATED
                    READ -> Value.READ
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
                    PUBLISHED -> Known.PUBLISHED
                    DELETED -> Known.DELETED
                    UPDATED -> Known.UPDATED
                    READ -> Known.READ
                    else ->
                        throw UnifieddatalibraryInvalidDataException("Unknown PaperStatus: $value")
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

            fun validate(): PaperStatus = apply {
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

                return other is PaperStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The prior permission required (PPR) status. */
        class PprStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val NOT_REQUIRED = of("NOT REQUIRED")

                @JvmField val REQUIRED_NOT_REQUESTED = of("REQUIRED NOT REQUESTED")

                @JvmField val GRANTED = of("GRANTED")

                @JvmField val PENDING = of("PENDING")

                @JvmStatic fun of(value: String) = PprStatus(JsonField.of(value))
            }

            /** An enum containing [PprStatus]'s known values. */
            enum class Known {
                NOT_REQUIRED,
                REQUIRED_NOT_REQUESTED,
                GRANTED,
                PENDING,
            }

            /**
             * An enum containing [PprStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PprStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NOT_REQUIRED,
                REQUIRED_NOT_REQUESTED,
                GRANTED,
                PENDING,
                /**
                 * An enum member indicating that [PprStatus] was instantiated with an unknown
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
                    NOT_REQUIRED -> Value.NOT_REQUIRED
                    REQUIRED_NOT_REQUESTED -> Value.REQUIRED_NOT_REQUESTED
                    GRANTED -> Value.GRANTED
                    PENDING -> Value.PENDING
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
                    NOT_REQUIRED -> Known.NOT_REQUIRED
                    REQUIRED_NOT_REQUESTED -> Known.REQUIRED_NOT_REQUESTED
                    GRANTED -> Known.GRANTED
                    PENDING -> Known.PENDING
                    else ->
                        throw UnifieddatalibraryInvalidDataException("Unknown PprStatus: $value")
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

            fun validate(): PprStatus = apply {
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

                return other is PprStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Type of Ravens required for this sortie (N - None, R - Raven (Security Team) required,
         * C6 - Consider ravens (Ground time over 6 hours), R6 - Ravens required (Ground time over 6
         * hours)).
         */
        class RvnReq @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val N = of("N")

                @JvmField val R = of("R")

                @JvmField val C6 = of("C6")

                @JvmField val R6 = of("R6")

                @JvmStatic fun of(value: String) = RvnReq(JsonField.of(value))
            }

            /** An enum containing [RvnReq]'s known values. */
            enum class Known {
                N,
                R,
                C6,
                R6,
            }

            /**
             * An enum containing [RvnReq]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RvnReq] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                N,
                R,
                C6,
                R6,
                /**
                 * An enum member indicating that [RvnReq] was instantiated with an unknown value.
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
                    N -> Value.N
                    R -> Value.R
                    C6 -> Value.C6
                    R6 -> Value.R6
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
                    N -> Known.N
                    R -> Known.R
                    C6 -> Known.C6
                    R6 -> Known.R6
                    else -> throw UnifieddatalibraryInvalidDataException("Unknown RvnReq: $value")
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

            fun validate(): RvnReq = apply {
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

                return other is RvnReq && value == other.value
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
                plannedDepTime == other.plannedDepTime &&
                source == other.source &&
                id == other.id &&
                actualArrTime == other.actualArrTime &&
                actualBlockInTime == other.actualBlockInTime &&
                actualBlockOutTime == other.actualBlockOutTime &&
                actualDepTime == other.actualDepTime &&
                aircraftAdsb == other.aircraftAdsb &&
                aircraftAltId == other.aircraftAltId &&
                aircraftEvent == other.aircraftEvent &&
                aircraftMds == other.aircraftMds &&
                aircraftRemarks == other.aircraftRemarks &&
                alertStatus == other.alertStatus &&
                alertStatusCode == other.alertStatusCode &&
                amcMsnNum == other.amcMsnNum &&
                amcMsnType == other.amcMsnType &&
                arrFaa == other.arrFaa &&
                arrIata == other.arrIata &&
                arrIcao == other.arrIcao &&
                arrItinerary == other.arrItinerary &&
                arrPurposeCode == other.arrPurposeCode &&
                callSign == other.callSign &&
                cargoConfig == other.cargoConfig &&
                commanderName == other.commanderName &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                currentState == other.currentState &&
                delayCode == other.delayCode &&
                depFaa == other.depFaa &&
                depIata == other.depIata &&
                depIcao == other.depIcao &&
                depItinerary == other.depItinerary &&
                depPurposeCode == other.depPurposeCode &&
                dhd == other.dhd &&
                dhdReason == other.dhdReason &&
                estArrTime == other.estArrTime &&
                estBlockInTime == other.estBlockInTime &&
                estBlockOutTime == other.estBlockOutTime &&
                estDepTime == other.estDepTime &&
                filename == other.filename &&
                filesize == other.filesize &&
                flightTime == other.flightTime &&
                fmDeskNum == other.fmDeskNum &&
                fmName == other.fmName &&
                fuelReq == other.fuelReq &&
                gndTime == other.gndTime &&
                idAircraft == other.idAircraft &&
                idMission == other.idMission &&
                jcsPriority == other.jcsPriority &&
                legNum == other.legNum &&
                lineNumber == other.lineNumber &&
                missionId == other.missionId &&
                missionUpdate == other.missionUpdate &&
                objectiveRemarks == other.objectiveRemarks &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                origSortieId == other.origSortieId &&
                oxyOnCrew == other.oxyOnCrew &&
                oxyOnPax == other.oxyOnPax &&
                oxyReqCrew == other.oxyReqCrew &&
                oxyReqPax == other.oxyReqPax &&
                paperStatus == other.paperStatus &&
                papersVersion == other.papersVersion &&
                parkingLoc == other.parkingLoc &&
                passengers == other.passengers &&
                plannedArrTime == other.plannedArrTime &&
                pprStatus == other.pprStatus &&
                primaryScl == other.primaryScl &&
                rawFileUri == other.rawFileUri &&
                reqConfig == other.reqConfig &&
                resultRemarks == other.resultRemarks &&
                rvnReq == other.rvnReq &&
                scheduleRemarks == other.scheduleRemarks &&
                secondaryScl == other.secondaryScl &&
                soe == other.soe &&
                sortieDate == other.sortieDate &&
                sourceDl == other.sourceDl &&
                tailNumber == other.tailNumber
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                plannedDepTime,
                source,
                id,
                actualArrTime,
                actualBlockInTime,
                actualBlockOutTime,
                actualDepTime,
                aircraftAdsb,
                aircraftAltId,
                aircraftEvent,
                aircraftMds,
                aircraftRemarks,
                alertStatus,
                alertStatusCode,
                amcMsnNum,
                amcMsnType,
                arrFaa,
                arrIata,
                arrIcao,
                arrItinerary,
                arrPurposeCode,
                callSign,
                cargoConfig,
                commanderName,
                createdAt,
                createdBy,
                currentState,
                delayCode,
                depFaa,
                depIata,
                depIcao,
                depItinerary,
                depPurposeCode,
                dhd,
                dhdReason,
                estArrTime,
                estBlockInTime,
                estBlockOutTime,
                estDepTime,
                filename,
                filesize,
                flightTime,
                fmDeskNum,
                fmName,
                fuelReq,
                gndTime,
                idAircraft,
                idMission,
                jcsPriority,
                legNum,
                lineNumber,
                missionId,
                missionUpdate,
                objectiveRemarks,
                origin,
                origNetwork,
                origSortieId,
                oxyOnCrew,
                oxyOnPax,
                oxyReqCrew,
                oxyReqPax,
                paperStatus,
                papersVersion,
                parkingLoc,
                passengers,
                plannedArrTime,
                pprStatus,
                primaryScl,
                rawFileUri,
                reqConfig,
                resultRemarks,
                rvnReq,
                scheduleRemarks,
                secondaryScl,
                soe,
                sortieDate,
                sourceDl,
                tailNumber,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, plannedDepTime=$plannedDepTime, source=$source, id=$id, actualArrTime=$actualArrTime, actualBlockInTime=$actualBlockInTime, actualBlockOutTime=$actualBlockOutTime, actualDepTime=$actualDepTime, aircraftAdsb=$aircraftAdsb, aircraftAltId=$aircraftAltId, aircraftEvent=$aircraftEvent, aircraftMds=$aircraftMds, aircraftRemarks=$aircraftRemarks, alertStatus=$alertStatus, alertStatusCode=$alertStatusCode, amcMsnNum=$amcMsnNum, amcMsnType=$amcMsnType, arrFaa=$arrFaa, arrIata=$arrIata, arrIcao=$arrIcao, arrItinerary=$arrItinerary, arrPurposeCode=$arrPurposeCode, callSign=$callSign, cargoConfig=$cargoConfig, commanderName=$commanderName, createdAt=$createdAt, createdBy=$createdBy, currentState=$currentState, delayCode=$delayCode, depFaa=$depFaa, depIata=$depIata, depIcao=$depIcao, depItinerary=$depItinerary, depPurposeCode=$depPurposeCode, dhd=$dhd, dhdReason=$dhdReason, estArrTime=$estArrTime, estBlockInTime=$estBlockInTime, estBlockOutTime=$estBlockOutTime, estDepTime=$estDepTime, filename=$filename, filesize=$filesize, flightTime=$flightTime, fmDeskNum=$fmDeskNum, fmName=$fmName, fuelReq=$fuelReq, gndTime=$gndTime, idAircraft=$idAircraft, idMission=$idMission, jcsPriority=$jcsPriority, legNum=$legNum, lineNumber=$lineNumber, missionId=$missionId, missionUpdate=$missionUpdate, objectiveRemarks=$objectiveRemarks, origin=$origin, origNetwork=$origNetwork, origSortieId=$origSortieId, oxyOnCrew=$oxyOnCrew, oxyOnPax=$oxyOnPax, oxyReqCrew=$oxyReqCrew, oxyReqPax=$oxyReqPax, paperStatus=$paperStatus, papersVersion=$papersVersion, parkingLoc=$parkingLoc, passengers=$passengers, plannedArrTime=$plannedArrTime, pprStatus=$pprStatus, primaryScl=$primaryScl, rawFileUri=$rawFileUri, reqConfig=$reqConfig, resultRemarks=$resultRemarks, rvnReq=$rvnReq, scheduleRemarks=$scheduleRemarks, secondaryScl=$secondaryScl, soe=$soe, sortieDate=$sortieDate, sourceDl=$sourceDl, tailNumber=$tailNumber}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AircraftSortyCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AircraftSortyCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

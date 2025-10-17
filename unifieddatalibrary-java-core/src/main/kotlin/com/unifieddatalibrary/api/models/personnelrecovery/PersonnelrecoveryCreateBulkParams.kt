// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.personnelrecovery

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
 * Service operation intended for initial integration only, to take a list of Personnel Recovery
 * records as a POST body and ingest into the database. Requires specific roles, please contact the
 * UDL team to gain access. This operation is not intended to be used for automated feeds into
 * UDL...data providers should contact the UDL team for instructions on setting up a permanent feed
 * through an alternate mechanism.
 */
class PersonnelrecoveryCreateBulkParams
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
         * [PersonnelrecoveryCreateBulkParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PersonnelrecoveryCreateBulkParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(personnelrecoveryCreateBulkParams: PersonnelrecoveryCreateBulkParams) =
            apply {
                body = personnelrecoveryCreateBulkParams.body.toMutableList()
                additionalHeaders = personnelrecoveryCreateBulkParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    personnelrecoveryCreateBulkParams.additionalQueryParams.toBuilder()
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
         * Returns an immutable instance of [PersonnelrecoveryCreateBulkParams].
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
        fun build(): PersonnelrecoveryCreateBulkParams =
            PersonnelrecoveryCreateBulkParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Provides information concerning search and rescue operations and other situations involving
     * personnel recovery.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val classificationMarking: JsonField<String>,
        private val dataMode: JsonField<DataMode>,
        private val msgTime: JsonField<OffsetDateTime>,
        private val pickupLat: JsonField<Double>,
        private val pickupLon: JsonField<Double>,
        private val source: JsonField<String>,
        private val type: JsonField<String>,
        private val id: JsonField<String>,
        private val authMethod: JsonField<String>,
        private val authStatus: JsonField<String>,
        private val beaconInd: JsonField<Boolean>,
        private val callSign: JsonField<String>,
        private val commEq1: JsonField<String>,
        private val commEq2: JsonField<String>,
        private val commEq3: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val createdBy: JsonField<String>,
        private val executionInfo: JsonField<ExecutionInfo>,
        private val identity: JsonField<String>,
        private val idWeatherReport: JsonField<String>,
        private val milClass: JsonField<String>,
        private val natAlliance: JsonField<Int>,
        private val natAlliance1: JsonField<Int>,
        private val numAmbulatory: JsonField<Int>,
        private val numAmbulatoryInjured: JsonField<Int>,
        private val numNonAmbulatory: JsonField<Int>,
        private val numPersons: JsonField<Int>,
        private val objectiveAreaInfo: JsonField<ObjectiveAreaInfo>,
        private val origin: JsonField<String>,
        private val origNetwork: JsonField<String>,
        private val pickupAlt: JsonField<Double>,
        private val recovId: JsonField<String>,
        private val rxFreq: JsonField<Double>,
        private val survivorMessages: JsonField<String>,
        private val survivorRadio: JsonField<String>,
        private val termInd: JsonField<Boolean>,
        private val textMsg: JsonField<String>,
        private val txFreq: JsonField<Double>,
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
            @JsonProperty("msgTime")
            @ExcludeMissing
            msgTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pickupLat")
            @ExcludeMissing
            pickupLat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pickupLon")
            @ExcludeMissing
            pickupLon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authMethod")
            @ExcludeMissing
            authMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authStatus")
            @ExcludeMissing
            authStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beaconInd")
            @ExcludeMissing
            beaconInd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("callSign")
            @ExcludeMissing
            callSign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commEq1") @ExcludeMissing commEq1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commEq2") @ExcludeMissing commEq2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commEq3") @ExcludeMissing commEq3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("executionInfo")
            @ExcludeMissing
            executionInfo: JsonField<ExecutionInfo> = JsonMissing.of(),
            @JsonProperty("identity")
            @ExcludeMissing
            identity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idWeatherReport")
            @ExcludeMissing
            idWeatherReport: JsonField<String> = JsonMissing.of(),
            @JsonProperty("milClass")
            @ExcludeMissing
            milClass: JsonField<String> = JsonMissing.of(),
            @JsonProperty("natAlliance")
            @ExcludeMissing
            natAlliance: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("natAlliance1")
            @ExcludeMissing
            natAlliance1: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("numAmbulatory")
            @ExcludeMissing
            numAmbulatory: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("numAmbulatoryInjured")
            @ExcludeMissing
            numAmbulatoryInjured: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("numNonAmbulatory")
            @ExcludeMissing
            numNonAmbulatory: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("numPersons")
            @ExcludeMissing
            numPersons: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("objectiveAreaInfo")
            @ExcludeMissing
            objectiveAreaInfo: JsonField<ObjectiveAreaInfo> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origNetwork")
            @ExcludeMissing
            origNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pickupAlt")
            @ExcludeMissing
            pickupAlt: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("recovId") @ExcludeMissing recovId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rxFreq") @ExcludeMissing rxFreq: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("survivorMessages")
            @ExcludeMissing
            survivorMessages: JsonField<String> = JsonMissing.of(),
            @JsonProperty("survivorRadio")
            @ExcludeMissing
            survivorRadio: JsonField<String> = JsonMissing.of(),
            @JsonProperty("termInd") @ExcludeMissing termInd: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("textMsg") @ExcludeMissing textMsg: JsonField<String> = JsonMissing.of(),
            @JsonProperty("txFreq") @ExcludeMissing txFreq: JsonField<Double> = JsonMissing.of(),
        ) : this(
            classificationMarking,
            dataMode,
            msgTime,
            pickupLat,
            pickupLon,
            source,
            type,
            id,
            authMethod,
            authStatus,
            beaconInd,
            callSign,
            commEq1,
            commEq2,
            commEq3,
            createdAt,
            createdBy,
            executionInfo,
            identity,
            idWeatherReport,
            milClass,
            natAlliance,
            natAlliance1,
            numAmbulatory,
            numAmbulatoryInjured,
            numNonAmbulatory,
            numPersons,
            objectiveAreaInfo,
            origin,
            origNetwork,
            pickupAlt,
            recovId,
            rxFreq,
            survivorMessages,
            survivorRadio,
            termInd,
            textMsg,
            txFreq,
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
         * Time stamp of the original personnel recovery message, in ISO 8601 UTC format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun msgTime(): OffsetDateTime = msgTime.getRequired("msgTime")

        /**
         * WGS-84 latitude of the pickup location, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun pickupLat(): Double = pickupLat.getRequired("pickupLat")

        /**
         * WGS-84 longitude of the pickup location, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun pickupLon(): Double = pickupLon.getRequired("pickupLon")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Specifies the type of incident resulting in a recovery or evacuation mission. Intended
         * as, but not constrained to, MIL-STD-6016 J6.1 Emergency Type (e.g. NO STATEMENT, DOWN
         * AIRCRAFT, MAN IN WATER, DITCHING, BAILOUT, DISTRESSED VEHICLE, GROUND INCIDENT, MEDICAL,
         * ISOLATED PERSONS, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Mechanism used to verify the survivors identity.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun authMethod(): Optional<String> = authMethod.getOptional("authMethod")

        /**
         * The confirmation status of the isolated personnel identity. Intended as, but not
         * constrained to, MIL-STD-6016 J6.1 Authentication Status, Isolated Personnel (NO
         * STATEMENT, AUTHENTICATED, NOT AUTHENTICATED, AUTHENTICATED UNDER DURESS, NOT APPLICABLE):
         *
         * AUTHENTICATED: Confirmed Friend
         *
         * NOT AUTHENTICATED: Unconfirmed status
         *
         * AUTHENTICATED UNDER DURESS: Authentication comprised by hostiles.
         *
         * NOT APPLICABLE: Authentication not required.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun authStatus(): Optional<String> = authStatus.getOptional("authStatus")

        /**
         * Flag indicating whether a radio identifier is reported.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun beaconInd(): Optional<Boolean> = beaconInd.getOptional("beaconInd")

        /**
         * The call sign of the personnel to be recovered.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun callSign(): Optional<String> = callSign.getOptional("callSign")

        /**
         * Survivor communications equipment. Intended as, but not constrained to, MIL-STD-6016 J6.1
         * Communications Equipment, Isolated Personnel (NO STATEMENT, SURVIVAL RADIO, RADIO BEACON,
         * EPLRS, SIGNAL MIRROR, SMOKE FLARE, IR SIGNALLING DEVICE, SIGNALLING PANEL, FRIENDLY FORCE
         * TRACKER, GPS BEACON, LL PHONE, TACTICAL RADIO LOS, TACTICAL RADIO BLOS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commEq1(): Optional<String> = commEq1.getOptional("commEq1")

        /**
         * Survivor communications equipment. Intended as, but not constrained to, MIL-STD-6016 J6.1
         * Communications Equipment, Isolated Personnel (NO STATEMENT, SURVIVAL RADIO, RADIO BEACON,
         * EPLRS, SIGNAL MIRROR, SMOKE FLARE, IR SIGNALLING DEVICE, SIGNALLING PANEL, FRIENDLY FORCE
         * TRACKER, GPS BEACON, LL PHONE, TACTICAL RADIO LOS, TACTICAL RADIO BLOS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commEq2(): Optional<String> = commEq2.getOptional("commEq2")

        /**
         * Survivor communications equipment. Intended as, but not constrained to, MIL-STD-6016 J6.1
         * Communications Equipment, Isolated Personnel (NO STATEMENT, SURVIVAL RADIO, RADIO BEACON,
         * EPLRS, SIGNAL MIRROR, SMOKE FLARE, IR SIGNALLING DEVICE, SIGNALLING PANEL, FRIENDLY FORCE
         * TRACKER, GPS BEACON, LL PHONE, TACTICAL RADIO LOS, TACTICAL RADIO BLOS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commEq3(): Optional<String> = commEq3.getOptional("commEq3")

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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun executionInfo(): Optional<ExecutionInfo> = executionInfo.getOptional("executionInfo")

        /**
         * The survivor service identity (UNKNOWN MILITARY, UNKNOWN CIVILIAN, FRIEND MILITARY,
         * FRIEND CIVIILIAN, NEUTRAL MILITARY, NEUTRAL CIVILIAN, HOSTILE MILITARY, HOSTILE
         * CIVILIAN).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun identity(): Optional<String> = identity.getOptional("identity")

        /**
         * Unique identifier of a weather report associated with this recovery.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idWeatherReport(): Optional<String> = idWeatherReport.getOptional("idWeatherReport")

        /**
         * The military classification of the personnel to be recovered. Intended as, but not
         * constrained to, MIL-STD-6016 J6.1 Isolated Personnel Classification (NO STATEMENT,
         * MILITARY, GOVERNMENT CIVILIAN, GOVERNMENT CONTRACTOR, CIVILIAN, MULTIPLE
         * CLASSIFICATIONS).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun milClass(): Optional<String> = milClass.getOptional("milClass")

        /**
         * The country of origin or political entity of an isolated person subject to rescue or
         * evacuation. If natAlliance is set to 126, then natAlliance1 must be non 0. If natAlliance
         * is any number other than 126, then natAlliance1 will be set to 0 regardless. Defined in
         * MIL-STD-6016 J6.1 Nationality/Alliance isolated person(s).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun natAlliance(): Optional<Int> = natAlliance.getOptional("natAlliance")

        /**
         * Extended country of origin or political entity of an isolated person subject to rescue or
         * evacuation. Specify an entry here only if natAlliance is 126. Defined in MIL-STD-6016
         * J6.1 Nationality/Alliance isolated person(s), 1.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun natAlliance1(): Optional<Int> = natAlliance1.getOptional("natAlliance1")

        /**
         * Number of ambulatory personnel requiring recovery.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numAmbulatory(): Optional<Int> = numAmbulatory.getOptional("numAmbulatory")

        /**
         * Number of injured, but ambulatory, personnel requiring recovery.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numAmbulatoryInjured(): Optional<Int> =
            numAmbulatoryInjured.getOptional("numAmbulatoryInjured")

        /**
         * Number of littered personnel requiring recovery.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numNonAmbulatory(): Optional<Int> = numNonAmbulatory.getOptional("numNonAmbulatory")

        /**
         * The count of persons requiring recovery.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun numPersons(): Optional<Int> = numPersons.getOptional("numPersons")

        /**
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun objectiveAreaInfo(): Optional<ObjectiveAreaInfo> =
            objectiveAreaInfo.getOptional("objectiveAreaInfo")

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
         * Altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a point height
         * above ellipsoid, and negative values indicate a point eight below ellipsoid.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun pickupAlt(): Optional<Double> = pickupAlt.getOptional("pickupAlt")

        /**
         * UUID identifying the Personnel Recovery mission, which should remain the same on
         * subsequent posts related to the same recovery mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recovId(): Optional<String> = recovId.getOptional("recovId")

        /**
         * Receive voice frequency in 5Hz increments. This field will auto populate with the txFreq
         * value if the post element is null.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rxFreq(): Optional<Double> = rxFreq.getOptional("rxFreq")

        /**
         * Preloaded message conveying the situation confronting the isolated person(s). Intended
         * as, but not constrained to, MIL-STD-6016 J6.1 Survivor Radio Messages (e.g. INJURED CANT
         * MOVE NO KNOWN HOSTILES, INJURED CANT MOVE HOSTILES NEARBY, UNINJURED CANT MOVE HOSTILES
         * NEARBY, UNINJURED NO KNOWN HOSTILES, INJURED LIMITED MOBILITY).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun survivorMessages(): Optional<String> = survivorMessages.getOptional("survivorMessages")

        /**
         * Survivor radio equipment. Intended as, but not constrained to, MIL-STD-6016 J6.1 Survivor
         * Radio Type (NO STATEMENT, PRQ7SEL, PRC90, PRC112, PRC112B B1, PRC112C, PRC112D, PRC148
         * MBITR, PRC148 JEM, PRC149, PRC152, ACRPLB, OTHER).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun survivorRadio(): Optional<String> = survivorRadio.getOptional("survivorRadio")

        /**
         * Flag indicating the cancellation of this recovery.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun termInd(): Optional<Boolean> = termInd.getOptional("termInd")

        /**
         * Additional specific messages received from survivor.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun textMsg(): Optional<String> = textMsg.getOptional("textMsg")

        /**
         * Transmit voice frequency in 5Hz increments.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun txFreq(): Optional<Double> = txFreq.getOptional("txFreq")

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
         * Returns the raw JSON value of [msgTime].
         *
         * Unlike [msgTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgTime") @ExcludeMissing fun _msgTime(): JsonField<OffsetDateTime> = msgTime

        /**
         * Returns the raw JSON value of [pickupLat].
         *
         * Unlike [pickupLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickupLat") @ExcludeMissing fun _pickupLat(): JsonField<Double> = pickupLat

        /**
         * Returns the raw JSON value of [pickupLon].
         *
         * Unlike [pickupLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickupLon") @ExcludeMissing fun _pickupLon(): JsonField<Double> = pickupLon

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [authMethod].
         *
         * Unlike [authMethod], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("authMethod")
        @ExcludeMissing
        fun _authMethod(): JsonField<String> = authMethod

        /**
         * Returns the raw JSON value of [authStatus].
         *
         * Unlike [authStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("authStatus")
        @ExcludeMissing
        fun _authStatus(): JsonField<String> = authStatus

        /**
         * Returns the raw JSON value of [beaconInd].
         *
         * Unlike [beaconInd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beaconInd") @ExcludeMissing fun _beaconInd(): JsonField<Boolean> = beaconInd

        /**
         * Returns the raw JSON value of [callSign].
         *
         * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

        /**
         * Returns the raw JSON value of [commEq1].
         *
         * Unlike [commEq1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commEq1") @ExcludeMissing fun _commEq1(): JsonField<String> = commEq1

        /**
         * Returns the raw JSON value of [commEq2].
         *
         * Unlike [commEq2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commEq2") @ExcludeMissing fun _commEq2(): JsonField<String> = commEq2

        /**
         * Returns the raw JSON value of [commEq3].
         *
         * Unlike [commEq3], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commEq3") @ExcludeMissing fun _commEq3(): JsonField<String> = commEq3

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
         * Returns the raw JSON value of [executionInfo].
         *
         * Unlike [executionInfo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("executionInfo")
        @ExcludeMissing
        fun _executionInfo(): JsonField<ExecutionInfo> = executionInfo

        /**
         * Returns the raw JSON value of [identity].
         *
         * Unlike [identity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identity") @ExcludeMissing fun _identity(): JsonField<String> = identity

        /**
         * Returns the raw JSON value of [idWeatherReport].
         *
         * Unlike [idWeatherReport], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idWeatherReport")
        @ExcludeMissing
        fun _idWeatherReport(): JsonField<String> = idWeatherReport

        /**
         * Returns the raw JSON value of [milClass].
         *
         * Unlike [milClass], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("milClass") @ExcludeMissing fun _milClass(): JsonField<String> = milClass

        /**
         * Returns the raw JSON value of [natAlliance].
         *
         * Unlike [natAlliance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("natAlliance")
        @ExcludeMissing
        fun _natAlliance(): JsonField<Int> = natAlliance

        /**
         * Returns the raw JSON value of [natAlliance1].
         *
         * Unlike [natAlliance1], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("natAlliance1")
        @ExcludeMissing
        fun _natAlliance1(): JsonField<Int> = natAlliance1

        /**
         * Returns the raw JSON value of [numAmbulatory].
         *
         * Unlike [numAmbulatory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numAmbulatory")
        @ExcludeMissing
        fun _numAmbulatory(): JsonField<Int> = numAmbulatory

        /**
         * Returns the raw JSON value of [numAmbulatoryInjured].
         *
         * Unlike [numAmbulatoryInjured], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("numAmbulatoryInjured")
        @ExcludeMissing
        fun _numAmbulatoryInjured(): JsonField<Int> = numAmbulatoryInjured

        /**
         * Returns the raw JSON value of [numNonAmbulatory].
         *
         * Unlike [numNonAmbulatory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("numNonAmbulatory")
        @ExcludeMissing
        fun _numNonAmbulatory(): JsonField<Int> = numNonAmbulatory

        /**
         * Returns the raw JSON value of [numPersons].
         *
         * Unlike [numPersons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("numPersons") @ExcludeMissing fun _numPersons(): JsonField<Int> = numPersons

        /**
         * Returns the raw JSON value of [objectiveAreaInfo].
         *
         * Unlike [objectiveAreaInfo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("objectiveAreaInfo")
        @ExcludeMissing
        fun _objectiveAreaInfo(): JsonField<ObjectiveAreaInfo> = objectiveAreaInfo

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
         * Returns the raw JSON value of [pickupAlt].
         *
         * Unlike [pickupAlt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pickupAlt") @ExcludeMissing fun _pickupAlt(): JsonField<Double> = pickupAlt

        /**
         * Returns the raw JSON value of [recovId].
         *
         * Unlike [recovId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recovId") @ExcludeMissing fun _recovId(): JsonField<String> = recovId

        /**
         * Returns the raw JSON value of [rxFreq].
         *
         * Unlike [rxFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rxFreq") @ExcludeMissing fun _rxFreq(): JsonField<Double> = rxFreq

        /**
         * Returns the raw JSON value of [survivorMessages].
         *
         * Unlike [survivorMessages], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("survivorMessages")
        @ExcludeMissing
        fun _survivorMessages(): JsonField<String> = survivorMessages

        /**
         * Returns the raw JSON value of [survivorRadio].
         *
         * Unlike [survivorRadio], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("survivorRadio")
        @ExcludeMissing
        fun _survivorRadio(): JsonField<String> = survivorRadio

        /**
         * Returns the raw JSON value of [termInd].
         *
         * Unlike [termInd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("termInd") @ExcludeMissing fun _termInd(): JsonField<Boolean> = termInd

        /**
         * Returns the raw JSON value of [textMsg].
         *
         * Unlike [textMsg], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("textMsg") @ExcludeMissing fun _textMsg(): JsonField<String> = textMsg

        /**
         * Returns the raw JSON value of [txFreq].
         *
         * Unlike [txFreq], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("txFreq") @ExcludeMissing fun _txFreq(): JsonField<Double> = txFreq

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
             * .dataMode()
             * .msgTime()
             * .pickupLat()
             * .pickupLon()
             * .source()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var msgTime: JsonField<OffsetDateTime>? = null
            private var pickupLat: JsonField<Double>? = null
            private var pickupLon: JsonField<Double>? = null
            private var source: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var authMethod: JsonField<String> = JsonMissing.of()
            private var authStatus: JsonField<String> = JsonMissing.of()
            private var beaconInd: JsonField<Boolean> = JsonMissing.of()
            private var callSign: JsonField<String> = JsonMissing.of()
            private var commEq1: JsonField<String> = JsonMissing.of()
            private var commEq2: JsonField<String> = JsonMissing.of()
            private var commEq3: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var executionInfo: JsonField<ExecutionInfo> = JsonMissing.of()
            private var identity: JsonField<String> = JsonMissing.of()
            private var idWeatherReport: JsonField<String> = JsonMissing.of()
            private var milClass: JsonField<String> = JsonMissing.of()
            private var natAlliance: JsonField<Int> = JsonMissing.of()
            private var natAlliance1: JsonField<Int> = JsonMissing.of()
            private var numAmbulatory: JsonField<Int> = JsonMissing.of()
            private var numAmbulatoryInjured: JsonField<Int> = JsonMissing.of()
            private var numNonAmbulatory: JsonField<Int> = JsonMissing.of()
            private var numPersons: JsonField<Int> = JsonMissing.of()
            private var objectiveAreaInfo: JsonField<ObjectiveAreaInfo> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var pickupAlt: JsonField<Double> = JsonMissing.of()
            private var recovId: JsonField<String> = JsonMissing.of()
            private var rxFreq: JsonField<Double> = JsonMissing.of()
            private var survivorMessages: JsonField<String> = JsonMissing.of()
            private var survivorRadio: JsonField<String> = JsonMissing.of()
            private var termInd: JsonField<Boolean> = JsonMissing.of()
            private var textMsg: JsonField<String> = JsonMissing.of()
            private var txFreq: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                msgTime = body.msgTime
                pickupLat = body.pickupLat
                pickupLon = body.pickupLon
                source = body.source
                type = body.type
                id = body.id
                authMethod = body.authMethod
                authStatus = body.authStatus
                beaconInd = body.beaconInd
                callSign = body.callSign
                commEq1 = body.commEq1
                commEq2 = body.commEq2
                commEq3 = body.commEq3
                createdAt = body.createdAt
                createdBy = body.createdBy
                executionInfo = body.executionInfo
                identity = body.identity
                idWeatherReport = body.idWeatherReport
                milClass = body.milClass
                natAlliance = body.natAlliance
                natAlliance1 = body.natAlliance1
                numAmbulatory = body.numAmbulatory
                numAmbulatoryInjured = body.numAmbulatoryInjured
                numNonAmbulatory = body.numNonAmbulatory
                numPersons = body.numPersons
                objectiveAreaInfo = body.objectiveAreaInfo
                origin = body.origin
                origNetwork = body.origNetwork
                pickupAlt = body.pickupAlt
                recovId = body.recovId
                rxFreq = body.rxFreq
                survivorMessages = body.survivorMessages
                survivorRadio = body.survivorRadio
                termInd = body.termInd
                textMsg = body.textMsg
                txFreq = body.txFreq
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

            /** Time stamp of the original personnel recovery message, in ISO 8601 UTC format. */
            fun msgTime(msgTime: OffsetDateTime) = msgTime(JsonField.of(msgTime))

            /**
             * Sets [Builder.msgTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgTime(msgTime: JsonField<OffsetDateTime>) = apply { this.msgTime = msgTime }

            /**
             * WGS-84 latitude of the pickup location, in degrees. -90 to 90 degrees (negative
             * values south of equator).
             */
            fun pickupLat(pickupLat: Double) = pickupLat(JsonField.of(pickupLat))

            /**
             * Sets [Builder.pickupLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickupLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickupLat(pickupLat: JsonField<Double>) = apply { this.pickupLat = pickupLat }

            /**
             * WGS-84 longitude of the pickup location, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             */
            fun pickupLon(pickupLon: Double) = pickupLon(JsonField.of(pickupLon))

            /**
             * Sets [Builder.pickupLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickupLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickupLon(pickupLon: JsonField<Double>) = apply { this.pickupLon = pickupLon }

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
             * Specifies the type of incident resulting in a recovery or evacuation mission.
             * Intended as, but not constrained to, MIL-STD-6016 J6.1 Emergency Type (e.g. NO
             * STATEMENT, DOWN AIRCRAFT, MAN IN WATER, DITCHING, BAILOUT, DISTRESSED VEHICLE, GROUND
             * INCIDENT, MEDICAL, ISOLATED PERSONS, etc.).
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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

            /** Mechanism used to verify the survivors identity. */
            fun authMethod(authMethod: String) = authMethod(JsonField.of(authMethod))

            /**
             * Sets [Builder.authMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authMethod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authMethod(authMethod: JsonField<String>) = apply { this.authMethod = authMethod }

            /**
             * The confirmation status of the isolated personnel identity. Intended as, but not
             * constrained to, MIL-STD-6016 J6.1 Authentication Status, Isolated Personnel (NO
             * STATEMENT, AUTHENTICATED, NOT AUTHENTICATED, AUTHENTICATED UNDER DURESS, NOT
             * APPLICABLE):
             *
             * AUTHENTICATED: Confirmed Friend
             *
             * NOT AUTHENTICATED: Unconfirmed status
             *
             * AUTHENTICATED UNDER DURESS: Authentication comprised by hostiles.
             *
             * NOT APPLICABLE: Authentication not required.
             */
            fun authStatus(authStatus: String) = authStatus(JsonField.of(authStatus))

            /**
             * Sets [Builder.authStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun authStatus(authStatus: JsonField<String>) = apply { this.authStatus = authStatus }

            /** Flag indicating whether a radio identifier is reported. */
            fun beaconInd(beaconInd: Boolean) = beaconInd(JsonField.of(beaconInd))

            /**
             * Sets [Builder.beaconInd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beaconInd] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beaconInd(beaconInd: JsonField<Boolean>) = apply { this.beaconInd = beaconInd }

            /** The call sign of the personnel to be recovered. */
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
             * Survivor communications equipment. Intended as, but not constrained to, MIL-STD-6016
             * J6.1 Communications Equipment, Isolated Personnel (NO STATEMENT, SURVIVAL RADIO,
             * RADIO BEACON, EPLRS, SIGNAL MIRROR, SMOKE FLARE, IR SIGNALLING DEVICE, SIGNALLING
             * PANEL, FRIENDLY FORCE TRACKER, GPS BEACON, LL PHONE, TACTICAL RADIO LOS, TACTICAL
             * RADIO BLOS).
             */
            fun commEq1(commEq1: String) = commEq1(JsonField.of(commEq1))

            /**
             * Sets [Builder.commEq1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commEq1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commEq1(commEq1: JsonField<String>) = apply { this.commEq1 = commEq1 }

            /**
             * Survivor communications equipment. Intended as, but not constrained to, MIL-STD-6016
             * J6.1 Communications Equipment, Isolated Personnel (NO STATEMENT, SURVIVAL RADIO,
             * RADIO BEACON, EPLRS, SIGNAL MIRROR, SMOKE FLARE, IR SIGNALLING DEVICE, SIGNALLING
             * PANEL, FRIENDLY FORCE TRACKER, GPS BEACON, LL PHONE, TACTICAL RADIO LOS, TACTICAL
             * RADIO BLOS).
             */
            fun commEq2(commEq2: String) = commEq2(JsonField.of(commEq2))

            /**
             * Sets [Builder.commEq2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commEq2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commEq2(commEq2: JsonField<String>) = apply { this.commEq2 = commEq2 }

            /**
             * Survivor communications equipment. Intended as, but not constrained to, MIL-STD-6016
             * J6.1 Communications Equipment, Isolated Personnel (NO STATEMENT, SURVIVAL RADIO,
             * RADIO BEACON, EPLRS, SIGNAL MIRROR, SMOKE FLARE, IR SIGNALLING DEVICE, SIGNALLING
             * PANEL, FRIENDLY FORCE TRACKER, GPS BEACON, LL PHONE, TACTICAL RADIO LOS, TACTICAL
             * RADIO BLOS).
             */
            fun commEq3(commEq3: String) = commEq3(JsonField.of(commEq3))

            /**
             * Sets [Builder.commEq3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commEq3] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commEq3(commEq3: JsonField<String>) = apply { this.commEq3 = commEq3 }

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

            fun executionInfo(executionInfo: ExecutionInfo) =
                executionInfo(JsonField.of(executionInfo))

            /**
             * Sets [Builder.executionInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.executionInfo] with a well-typed [ExecutionInfo]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun executionInfo(executionInfo: JsonField<ExecutionInfo>) = apply {
                this.executionInfo = executionInfo
            }

            /**
             * The survivor service identity (UNKNOWN MILITARY, UNKNOWN CIVILIAN, FRIEND MILITARY,
             * FRIEND CIVIILIAN, NEUTRAL MILITARY, NEUTRAL CIVILIAN, HOSTILE MILITARY, HOSTILE
             * CIVILIAN).
             */
            fun identity(identity: String) = identity(JsonField.of(identity))

            /**
             * Sets [Builder.identity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identity(identity: JsonField<String>) = apply { this.identity = identity }

            /** Unique identifier of a weather report associated with this recovery. */
            fun idWeatherReport(idWeatherReport: String) =
                idWeatherReport(JsonField.of(idWeatherReport))

            /**
             * Sets [Builder.idWeatherReport] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idWeatherReport] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idWeatherReport(idWeatherReport: JsonField<String>) = apply {
                this.idWeatherReport = idWeatherReport
            }

            /**
             * The military classification of the personnel to be recovered. Intended as, but not
             * constrained to, MIL-STD-6016 J6.1 Isolated Personnel Classification (NO STATEMENT,
             * MILITARY, GOVERNMENT CIVILIAN, GOVERNMENT CONTRACTOR, CIVILIAN, MULTIPLE
             * CLASSIFICATIONS).
             */
            fun milClass(milClass: String) = milClass(JsonField.of(milClass))

            /**
             * Sets [Builder.milClass] to an arbitrary JSON value.
             *
             * You should usually call [Builder.milClass] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun milClass(milClass: JsonField<String>) = apply { this.milClass = milClass }

            /**
             * The country of origin or political entity of an isolated person subject to rescue or
             * evacuation. If natAlliance is set to 126, then natAlliance1 must be non 0. If
             * natAlliance is any number other than 126, then natAlliance1 will be set to 0
             * regardless. Defined in MIL-STD-6016 J6.1 Nationality/Alliance isolated person(s).
             */
            fun natAlliance(natAlliance: Int) = natAlliance(JsonField.of(natAlliance))

            /**
             * Sets [Builder.natAlliance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.natAlliance] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun natAlliance(natAlliance: JsonField<Int>) = apply { this.natAlliance = natAlliance }

            /**
             * Extended country of origin or political entity of an isolated person subject to
             * rescue or evacuation. Specify an entry here only if natAlliance is 126. Defined in
             * MIL-STD-6016 J6.1 Nationality/Alliance isolated person(s), 1.
             */
            fun natAlliance1(natAlliance1: Int) = natAlliance1(JsonField.of(natAlliance1))

            /**
             * Sets [Builder.natAlliance1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.natAlliance1] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun natAlliance1(natAlliance1: JsonField<Int>) = apply {
                this.natAlliance1 = natAlliance1
            }

            /** Number of ambulatory personnel requiring recovery. */
            fun numAmbulatory(numAmbulatory: Int) = numAmbulatory(JsonField.of(numAmbulatory))

            /**
             * Sets [Builder.numAmbulatory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numAmbulatory] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numAmbulatory(numAmbulatory: JsonField<Int>) = apply {
                this.numAmbulatory = numAmbulatory
            }

            /** Number of injured, but ambulatory, personnel requiring recovery. */
            fun numAmbulatoryInjured(numAmbulatoryInjured: Int) =
                numAmbulatoryInjured(JsonField.of(numAmbulatoryInjured))

            /**
             * Sets [Builder.numAmbulatoryInjured] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numAmbulatoryInjured] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numAmbulatoryInjured(numAmbulatoryInjured: JsonField<Int>) = apply {
                this.numAmbulatoryInjured = numAmbulatoryInjured
            }

            /** Number of littered personnel requiring recovery. */
            fun numNonAmbulatory(numNonAmbulatory: Int) =
                numNonAmbulatory(JsonField.of(numNonAmbulatory))

            /**
             * Sets [Builder.numNonAmbulatory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numNonAmbulatory] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numNonAmbulatory(numNonAmbulatory: JsonField<Int>) = apply {
                this.numNonAmbulatory = numNonAmbulatory
            }

            /** The count of persons requiring recovery. */
            fun numPersons(numPersons: Int) = numPersons(JsonField.of(numPersons))

            /**
             * Sets [Builder.numPersons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numPersons] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numPersons(numPersons: JsonField<Int>) = apply { this.numPersons = numPersons }

            fun objectiveAreaInfo(objectiveAreaInfo: ObjectiveAreaInfo) =
                objectiveAreaInfo(JsonField.of(objectiveAreaInfo))

            /**
             * Sets [Builder.objectiveAreaInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.objectiveAreaInfo] with a well-typed
             * [ObjectiveAreaInfo] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun objectiveAreaInfo(objectiveAreaInfo: JsonField<ObjectiveAreaInfo>) = apply {
                this.objectiveAreaInfo = objectiveAreaInfo
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
             * Altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a point
             * height above ellipsoid, and negative values indicate a point eight below ellipsoid.
             */
            fun pickupAlt(pickupAlt: Double) = pickupAlt(JsonField.of(pickupAlt))

            /**
             * Sets [Builder.pickupAlt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pickupAlt] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pickupAlt(pickupAlt: JsonField<Double>) = apply { this.pickupAlt = pickupAlt }

            /**
             * UUID identifying the Personnel Recovery mission, which should remain the same on
             * subsequent posts related to the same recovery mission.
             */
            fun recovId(recovId: String) = recovId(JsonField.of(recovId))

            /**
             * Sets [Builder.recovId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recovId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recovId(recovId: JsonField<String>) = apply { this.recovId = recovId }

            /**
             * Receive voice frequency in 5Hz increments. This field will auto populate with the
             * txFreq value if the post element is null.
             */
            fun rxFreq(rxFreq: Double) = rxFreq(JsonField.of(rxFreq))

            /**
             * Sets [Builder.rxFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rxFreq] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rxFreq(rxFreq: JsonField<Double>) = apply { this.rxFreq = rxFreq }

            /**
             * Preloaded message conveying the situation confronting the isolated person(s).
             * Intended as, but not constrained to, MIL-STD-6016 J6.1 Survivor Radio Messages (e.g.
             * INJURED CANT MOVE NO KNOWN HOSTILES, INJURED CANT MOVE HOSTILES NEARBY, UNINJURED
             * CANT MOVE HOSTILES NEARBY, UNINJURED NO KNOWN HOSTILES, INJURED LIMITED MOBILITY).
             */
            fun survivorMessages(survivorMessages: String) =
                survivorMessages(JsonField.of(survivorMessages))

            /**
             * Sets [Builder.survivorMessages] to an arbitrary JSON value.
             *
             * You should usually call [Builder.survivorMessages] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun survivorMessages(survivorMessages: JsonField<String>) = apply {
                this.survivorMessages = survivorMessages
            }

            /**
             * Survivor radio equipment. Intended as, but not constrained to, MIL-STD-6016 J6.1
             * Survivor Radio Type (NO STATEMENT, PRQ7SEL, PRC90, PRC112, PRC112B B1, PRC112C,
             * PRC112D, PRC148 MBITR, PRC148 JEM, PRC149, PRC152, ACRPLB, OTHER).
             */
            fun survivorRadio(survivorRadio: String) = survivorRadio(JsonField.of(survivorRadio))

            /**
             * Sets [Builder.survivorRadio] to an arbitrary JSON value.
             *
             * You should usually call [Builder.survivorRadio] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun survivorRadio(survivorRadio: JsonField<String>) = apply {
                this.survivorRadio = survivorRadio
            }

            /** Flag indicating the cancellation of this recovery. */
            fun termInd(termInd: Boolean) = termInd(JsonField.of(termInd))

            /**
             * Sets [Builder.termInd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.termInd] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun termInd(termInd: JsonField<Boolean>) = apply { this.termInd = termInd }

            /** Additional specific messages received from survivor. */
            fun textMsg(textMsg: String) = textMsg(JsonField.of(textMsg))

            /**
             * Sets [Builder.textMsg] to an arbitrary JSON value.
             *
             * You should usually call [Builder.textMsg] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun textMsg(textMsg: JsonField<String>) = apply { this.textMsg = textMsg }

            /** Transmit voice frequency in 5Hz increments. */
            fun txFreq(txFreq: Double) = txFreq(JsonField.of(txFreq))

            /**
             * Sets [Builder.txFreq] to an arbitrary JSON value.
             *
             * You should usually call [Builder.txFreq] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun txFreq(txFreq: JsonField<Double>) = apply { this.txFreq = txFreq }

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
             * .dataMode()
             * .msgTime()
             * .pickupLat()
             * .pickupLon()
             * .source()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("msgTime", msgTime),
                    checkRequired("pickupLat", pickupLat),
                    checkRequired("pickupLon", pickupLon),
                    checkRequired("source", source),
                    checkRequired("type", type),
                    id,
                    authMethod,
                    authStatus,
                    beaconInd,
                    callSign,
                    commEq1,
                    commEq2,
                    commEq3,
                    createdAt,
                    createdBy,
                    executionInfo,
                    identity,
                    idWeatherReport,
                    milClass,
                    natAlliance,
                    natAlliance1,
                    numAmbulatory,
                    numAmbulatoryInjured,
                    numNonAmbulatory,
                    numPersons,
                    objectiveAreaInfo,
                    origin,
                    origNetwork,
                    pickupAlt,
                    recovId,
                    rxFreq,
                    survivorMessages,
                    survivorRadio,
                    termInd,
                    textMsg,
                    txFreq,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            msgTime()
            pickupLat()
            pickupLon()
            source()
            type()
            id()
            authMethod()
            authStatus()
            beaconInd()
            callSign()
            commEq1()
            commEq2()
            commEq3()
            createdAt()
            createdBy()
            executionInfo().ifPresent { it.validate() }
            identity()
            idWeatherReport()
            milClass()
            natAlliance()
            natAlliance1()
            numAmbulatory()
            numAmbulatoryInjured()
            numNonAmbulatory()
            numPersons()
            objectiveAreaInfo().ifPresent { it.validate() }
            origin()
            origNetwork()
            pickupAlt()
            recovId()
            rxFreq()
            survivorMessages()
            survivorRadio()
            termInd()
            textMsg()
            txFreq()
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
                (if (msgTime.asKnown().isPresent) 1 else 0) +
                (if (pickupLat.asKnown().isPresent) 1 else 0) +
                (if (pickupLon.asKnown().isPresent) 1 else 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (authMethod.asKnown().isPresent) 1 else 0) +
                (if (authStatus.asKnown().isPresent) 1 else 0) +
                (if (beaconInd.asKnown().isPresent) 1 else 0) +
                (if (callSign.asKnown().isPresent) 1 else 0) +
                (if (commEq1.asKnown().isPresent) 1 else 0) +
                (if (commEq2.asKnown().isPresent) 1 else 0) +
                (if (commEq3.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (executionInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (identity.asKnown().isPresent) 1 else 0) +
                (if (idWeatherReport.asKnown().isPresent) 1 else 0) +
                (if (milClass.asKnown().isPresent) 1 else 0) +
                (if (natAlliance.asKnown().isPresent) 1 else 0) +
                (if (natAlliance1.asKnown().isPresent) 1 else 0) +
                (if (numAmbulatory.asKnown().isPresent) 1 else 0) +
                (if (numAmbulatoryInjured.asKnown().isPresent) 1 else 0) +
                (if (numNonAmbulatory.asKnown().isPresent) 1 else 0) +
                (if (numPersons.asKnown().isPresent) 1 else 0) +
                (objectiveAreaInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (if (pickupAlt.asKnown().isPresent) 1 else 0) +
                (if (recovId.asKnown().isPresent) 1 else 0) +
                (if (rxFreq.asKnown().isPresent) 1 else 0) +
                (if (survivorMessages.asKnown().isPresent) 1 else 0) +
                (if (survivorRadio.asKnown().isPresent) 1 else 0) +
                (if (termInd.asKnown().isPresent) 1 else 0) +
                (if (textMsg.asKnown().isPresent) 1 else 0) +
                (if (txFreq.asKnown().isPresent) 1 else 0)

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

        class ExecutionInfo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val egress: JsonField<Double>,
            private val egressPoint: JsonField<List<Double>>,
            private val escortVehicle: JsonField<EscortVehicle>,
            private val ingress: JsonField<Double>,
            private val initialPoint: JsonField<List<Double>>,
            private val objStrategy: JsonField<String>,
            private val recoveryVehicle: JsonField<RecoveryVehicle>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("egress")
                @ExcludeMissing
                egress: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("egressPoint")
                @ExcludeMissing
                egressPoint: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("escortVehicle")
                @ExcludeMissing
                escortVehicle: JsonField<EscortVehicle> = JsonMissing.of(),
                @JsonProperty("ingress")
                @ExcludeMissing
                ingress: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("initialPoint")
                @ExcludeMissing
                initialPoint: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("objStrategy")
                @ExcludeMissing
                objStrategy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recoveryVehicle")
                @ExcludeMissing
                recoveryVehicle: JsonField<RecoveryVehicle> = JsonMissing.of(),
            ) : this(
                egress,
                egressPoint,
                escortVehicle,
                ingress,
                initialPoint,
                objStrategy,
                recoveryVehicle,
                mutableMapOf(),
            )

            /**
             * The heading, in degrees, of leaving the recovery zone.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun egress(): Optional<Double> = egress.getOptional("egress")

            /**
             * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
             * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees,
             * and altitude, in meters, of the egress location. This array must contain a minimum of
             * 2 elements (latitude and longitude), and may contain an optional 3rd element
             * (altitude).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun egressPoint(): Optional<List<Double>> = egressPoint.getOptional("egressPoint")

            /**
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun escortVehicle(): Optional<EscortVehicle> =
                escortVehicle.getOptional("escortVehicle")

            /**
             * The heading, in degrees clockwise from North, of entering the recovery zone.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun ingress(): Optional<Double> = ingress.getOptional("ingress")

            /**
             * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
             * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees,
             * and altitude, in meters, of the initial location. This array must contain a minimum
             * of 2 elements (latitude and longitude), and may contain an optional 3rd element
             * (altitude).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun initialPoint(): Optional<List<Double>> = initialPoint.getOptional("initialPoint")

            /**
             * Description of the objective strategy plan.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun objStrategy(): Optional<String> = objStrategy.getOptional("objStrategy")

            /**
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun recoveryVehicle(): Optional<RecoveryVehicle> =
                recoveryVehicle.getOptional("recoveryVehicle")

            /**
             * Returns the raw JSON value of [egress].
             *
             * Unlike [egress], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("egress") @ExcludeMissing fun _egress(): JsonField<Double> = egress

            /**
             * Returns the raw JSON value of [egressPoint].
             *
             * Unlike [egressPoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("egressPoint")
            @ExcludeMissing
            fun _egressPoint(): JsonField<List<Double>> = egressPoint

            /**
             * Returns the raw JSON value of [escortVehicle].
             *
             * Unlike [escortVehicle], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("escortVehicle")
            @ExcludeMissing
            fun _escortVehicle(): JsonField<EscortVehicle> = escortVehicle

            /**
             * Returns the raw JSON value of [ingress].
             *
             * Unlike [ingress], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("ingress") @ExcludeMissing fun _ingress(): JsonField<Double> = ingress

            /**
             * Returns the raw JSON value of [initialPoint].
             *
             * Unlike [initialPoint], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("initialPoint")
            @ExcludeMissing
            fun _initialPoint(): JsonField<List<Double>> = initialPoint

            /**
             * Returns the raw JSON value of [objStrategy].
             *
             * Unlike [objStrategy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("objStrategy")
            @ExcludeMissing
            fun _objStrategy(): JsonField<String> = objStrategy

            /**
             * Returns the raw JSON value of [recoveryVehicle].
             *
             * Unlike [recoveryVehicle], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recoveryVehicle")
            @ExcludeMissing
            fun _recoveryVehicle(): JsonField<RecoveryVehicle> = recoveryVehicle

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

                /** Returns a mutable builder for constructing an instance of [ExecutionInfo]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ExecutionInfo]. */
            class Builder internal constructor() {

                private var egress: JsonField<Double> = JsonMissing.of()
                private var egressPoint: JsonField<MutableList<Double>>? = null
                private var escortVehicle: JsonField<EscortVehicle> = JsonMissing.of()
                private var ingress: JsonField<Double> = JsonMissing.of()
                private var initialPoint: JsonField<MutableList<Double>>? = null
                private var objStrategy: JsonField<String> = JsonMissing.of()
                private var recoveryVehicle: JsonField<RecoveryVehicle> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(executionInfo: ExecutionInfo) = apply {
                    egress = executionInfo.egress
                    egressPoint = executionInfo.egressPoint.map { it.toMutableList() }
                    escortVehicle = executionInfo.escortVehicle
                    ingress = executionInfo.ingress
                    initialPoint = executionInfo.initialPoint.map { it.toMutableList() }
                    objStrategy = executionInfo.objStrategy
                    recoveryVehicle = executionInfo.recoveryVehicle
                    additionalProperties = executionInfo.additionalProperties.toMutableMap()
                }

                /** The heading, in degrees, of leaving the recovery zone. */
                fun egress(egress: Double) = egress(JsonField.of(egress))

                /**
                 * Sets [Builder.egress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.egress] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun egress(egress: JsonField<Double>) = apply { this.egress = egress }

                /**
                 * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
                 * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in
                 * degrees, and altitude, in meters, of the egress location. This array must contain
                 * a minimum of 2 elements (latitude and longitude), and may contain an optional 3rd
                 * element (altitude).
                 */
                fun egressPoint(egressPoint: List<Double>) = egressPoint(JsonField.of(egressPoint))

                /**
                 * Sets [Builder.egressPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.egressPoint] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun egressPoint(egressPoint: JsonField<List<Double>>) = apply {
                    this.egressPoint = egressPoint.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.egressPoint].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEgressPoint(egressPoint: Double) = apply {
                    this.egressPoint =
                        (this.egressPoint ?: JsonField.of(mutableListOf())).also {
                            checkKnown("egressPoint", it).add(egressPoint)
                        }
                }

                fun escortVehicle(escortVehicle: EscortVehicle) =
                    escortVehicle(JsonField.of(escortVehicle))

                /**
                 * Sets [Builder.escortVehicle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.escortVehicle] with a well-typed [EscortVehicle]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun escortVehicle(escortVehicle: JsonField<EscortVehicle>) = apply {
                    this.escortVehicle = escortVehicle
                }

                /** The heading, in degrees clockwise from North, of entering the recovery zone. */
                fun ingress(ingress: Double) = ingress(JsonField.of(ingress))

                /**
                 * Sets [Builder.ingress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ingress] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ingress(ingress: JsonField<Double>) = apply { this.ingress = ingress }

                /**
                 * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
                 * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in
                 * degrees, and altitude, in meters, of the initial location. This array must
                 * contain a minimum of 2 elements (latitude and longitude), and may contain an
                 * optional 3rd element (altitude).
                 */
                fun initialPoint(initialPoint: List<Double>) =
                    initialPoint(JsonField.of(initialPoint))

                /**
                 * Sets [Builder.initialPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.initialPoint] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun initialPoint(initialPoint: JsonField<List<Double>>) = apply {
                    this.initialPoint = initialPoint.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.initialPoint].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addInitialPoint(initialPoint: Double) = apply {
                    this.initialPoint =
                        (this.initialPoint ?: JsonField.of(mutableListOf())).also {
                            checkKnown("initialPoint", it).add(initialPoint)
                        }
                }

                /** Description of the objective strategy plan. */
                fun objStrategy(objStrategy: String) = objStrategy(JsonField.of(objStrategy))

                /**
                 * Sets [Builder.objStrategy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.objStrategy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun objStrategy(objStrategy: JsonField<String>) = apply {
                    this.objStrategy = objStrategy
                }

                fun recoveryVehicle(recoveryVehicle: RecoveryVehicle) =
                    recoveryVehicle(JsonField.of(recoveryVehicle))

                /**
                 * Sets [Builder.recoveryVehicle] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recoveryVehicle] with a well-typed
                 * [RecoveryVehicle] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recoveryVehicle(recoveryVehicle: JsonField<RecoveryVehicle>) = apply {
                    this.recoveryVehicle = recoveryVehicle
                }

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
                 * Returns an immutable instance of [ExecutionInfo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ExecutionInfo =
                    ExecutionInfo(
                        egress,
                        (egressPoint ?: JsonMissing.of()).map { it.toImmutable() },
                        escortVehicle,
                        ingress,
                        (initialPoint ?: JsonMissing.of()).map { it.toImmutable() },
                        objStrategy,
                        recoveryVehicle,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ExecutionInfo = apply {
                if (validated) {
                    return@apply
                }

                egress()
                egressPoint()
                escortVehicle().ifPresent { it.validate() }
                ingress()
                initialPoint()
                objStrategy()
                recoveryVehicle().ifPresent { it.validate() }
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
                (if (egress.asKnown().isPresent) 1 else 0) +
                    (egressPoint.asKnown().getOrNull()?.size ?: 0) +
                    (escortVehicle.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (ingress.asKnown().isPresent) 1 else 0) +
                    (initialPoint.asKnown().getOrNull()?.size ?: 0) +
                    (if (objStrategy.asKnown().isPresent) 1 else 0) +
                    (recoveryVehicle.asKnown().getOrNull()?.validity() ?: 0)

            class EscortVehicle
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val callSign: JsonField<String>,
                private val primaryFreq: JsonField<Double>,
                private val strength: JsonField<Int>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("callSign")
                    @ExcludeMissing
                    callSign: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("primaryFreq")
                    @ExcludeMissing
                    primaryFreq: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("strength")
                    @ExcludeMissing
                    strength: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(callSign, primaryFreq, strength, type, mutableMapOf())

                /**
                 * The call sign of the recovery vehicle.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun callSign(): Optional<String> = callSign.getOptional("callSign")

                /**
                 * Primary contact frequency of the recovery vehicle.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun primaryFreq(): Optional<Double> = primaryFreq.getOptional("primaryFreq")

                /**
                 * The number of objects or units moving as a group and represented as a single
                 * entity in this recovery vehicle message. If null, the strength is assumed to
                 * represent a single object. Note that if this recovery derives from a J-series
                 * message then special definitions apply for the following values: 13 indicates an
                 * estimated 2-7 units, 14 indicates an estimated more than 7 units, and 15
                 * indicates an estimated more than 12 units.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun strength(): Optional<Int> = strength.getOptional("strength")

                /**
                 * The particular type of recovery vehicle to be used.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [callSign].
                 *
                 * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("callSign")
                @ExcludeMissing
                fun _callSign(): JsonField<String> = callSign

                /**
                 * Returns the raw JSON value of [primaryFreq].
                 *
                 * Unlike [primaryFreq], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("primaryFreq")
                @ExcludeMissing
                fun _primaryFreq(): JsonField<Double> = primaryFreq

                /**
                 * Returns the raw JSON value of [strength].
                 *
                 * Unlike [strength], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("strength") @ExcludeMissing fun _strength(): JsonField<Int> = strength

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                     * Returns a mutable builder for constructing an instance of [EscortVehicle].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [EscortVehicle]. */
                class Builder internal constructor() {

                    private var callSign: JsonField<String> = JsonMissing.of()
                    private var primaryFreq: JsonField<Double> = JsonMissing.of()
                    private var strength: JsonField<Int> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(escortVehicle: EscortVehicle) = apply {
                        callSign = escortVehicle.callSign
                        primaryFreq = escortVehicle.primaryFreq
                        strength = escortVehicle.strength
                        type = escortVehicle.type
                        additionalProperties = escortVehicle.additionalProperties.toMutableMap()
                    }

                    /** The call sign of the recovery vehicle. */
                    fun callSign(callSign: String) = callSign(JsonField.of(callSign))

                    /**
                     * Sets [Builder.callSign] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callSign] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

                    /** Primary contact frequency of the recovery vehicle. */
                    fun primaryFreq(primaryFreq: Double) = primaryFreq(JsonField.of(primaryFreq))

                    /**
                     * Sets [Builder.primaryFreq] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primaryFreq] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun primaryFreq(primaryFreq: JsonField<Double>) = apply {
                        this.primaryFreq = primaryFreq
                    }

                    /**
                     * The number of objects or units moving as a group and represented as a single
                     * entity in this recovery vehicle message. If null, the strength is assumed to
                     * represent a single object. Note that if this recovery derives from a J-series
                     * message then special definitions apply for the following values: 13 indicates
                     * an estimated 2-7 units, 14 indicates an estimated more than 7 units, and 15
                     * indicates an estimated more than 12 units.
                     */
                    fun strength(strength: Int) = strength(JsonField.of(strength))

                    /**
                     * Sets [Builder.strength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strength] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun strength(strength: JsonField<Int>) = apply { this.strength = strength }

                    /** The particular type of recovery vehicle to be used. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [EscortVehicle].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): EscortVehicle =
                        EscortVehicle(
                            callSign,
                            primaryFreq,
                            strength,
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): EscortVehicle = apply {
                    if (validated) {
                        return@apply
                    }

                    callSign()
                    primaryFreq()
                    strength()
                    type()
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
                    (if (callSign.asKnown().isPresent) 1 else 0) +
                        (if (primaryFreq.asKnown().isPresent) 1 else 0) +
                        (if (strength.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EscortVehicle &&
                        callSign == other.callSign &&
                        primaryFreq == other.primaryFreq &&
                        strength == other.strength &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(callSign, primaryFreq, strength, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EscortVehicle{callSign=$callSign, primaryFreq=$primaryFreq, strength=$strength, type=$type, additionalProperties=$additionalProperties}"
            }

            class RecoveryVehicle
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val callSign: JsonField<String>,
                private val primaryFreq: JsonField<Double>,
                private val strength: JsonField<Int>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("callSign")
                    @ExcludeMissing
                    callSign: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("primaryFreq")
                    @ExcludeMissing
                    primaryFreq: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("strength")
                    @ExcludeMissing
                    strength: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(callSign, primaryFreq, strength, type, mutableMapOf())

                /**
                 * The call sign of the recovery vehicle.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun callSign(): Optional<String> = callSign.getOptional("callSign")

                /**
                 * Primary contact frequency of the recovery vehicle.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun primaryFreq(): Optional<Double> = primaryFreq.getOptional("primaryFreq")

                /**
                 * The number of objects or units moving as a group and represented as a single
                 * entity in this recovery vehicle message. If null, the strength is assumed to
                 * represent a single object. Note that if this recovery derives from a J-series
                 * message then special definitions apply for the following values: 13 indicates an
                 * estimated 2-7 units, 14 indicates an estimated more than 7 units, and 15
                 * indicates an estimated more than 12 units.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun strength(): Optional<Int> = strength.getOptional("strength")

                /**
                 * The particular type of recovery vehicle to be used.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [callSign].
                 *
                 * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("callSign")
                @ExcludeMissing
                fun _callSign(): JsonField<String> = callSign

                /**
                 * Returns the raw JSON value of [primaryFreq].
                 *
                 * Unlike [primaryFreq], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("primaryFreq")
                @ExcludeMissing
                fun _primaryFreq(): JsonField<Double> = primaryFreq

                /**
                 * Returns the raw JSON value of [strength].
                 *
                 * Unlike [strength], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("strength") @ExcludeMissing fun _strength(): JsonField<Int> = strength

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                     * Returns a mutable builder for constructing an instance of [RecoveryVehicle].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecoveryVehicle]. */
                class Builder internal constructor() {

                    private var callSign: JsonField<String> = JsonMissing.of()
                    private var primaryFreq: JsonField<Double> = JsonMissing.of()
                    private var strength: JsonField<Int> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recoveryVehicle: RecoveryVehicle) = apply {
                        callSign = recoveryVehicle.callSign
                        primaryFreq = recoveryVehicle.primaryFreq
                        strength = recoveryVehicle.strength
                        type = recoveryVehicle.type
                        additionalProperties = recoveryVehicle.additionalProperties.toMutableMap()
                    }

                    /** The call sign of the recovery vehicle. */
                    fun callSign(callSign: String) = callSign(JsonField.of(callSign))

                    /**
                     * Sets [Builder.callSign] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callSign] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

                    /** Primary contact frequency of the recovery vehicle. */
                    fun primaryFreq(primaryFreq: Double) = primaryFreq(JsonField.of(primaryFreq))

                    /**
                     * Sets [Builder.primaryFreq] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.primaryFreq] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun primaryFreq(primaryFreq: JsonField<Double>) = apply {
                        this.primaryFreq = primaryFreq
                    }

                    /**
                     * The number of objects or units moving as a group and represented as a single
                     * entity in this recovery vehicle message. If null, the strength is assumed to
                     * represent a single object. Note that if this recovery derives from a J-series
                     * message then special definitions apply for the following values: 13 indicates
                     * an estimated 2-7 units, 14 indicates an estimated more than 7 units, and 15
                     * indicates an estimated more than 12 units.
                     */
                    fun strength(strength: Int) = strength(JsonField.of(strength))

                    /**
                     * Sets [Builder.strength] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.strength] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun strength(strength: JsonField<Int>) = apply { this.strength = strength }

                    /** The particular type of recovery vehicle to be used. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [RecoveryVehicle].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): RecoveryVehicle =
                        RecoveryVehicle(
                            callSign,
                            primaryFreq,
                            strength,
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): RecoveryVehicle = apply {
                    if (validated) {
                        return@apply
                    }

                    callSign()
                    primaryFreq()
                    strength()
                    type()
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
                    (if (callSign.asKnown().isPresent) 1 else 0) +
                        (if (primaryFreq.asKnown().isPresent) 1 else 0) +
                        (if (strength.asKnown().isPresent) 1 else 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecoveryVehicle &&
                        callSign == other.callSign &&
                        primaryFreq == other.primaryFreq &&
                        strength == other.strength &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(callSign, primaryFreq, strength, type, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecoveryVehicle{callSign=$callSign, primaryFreq=$primaryFreq, strength=$strength, type=$type, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExecutionInfo &&
                    egress == other.egress &&
                    egressPoint == other.egressPoint &&
                    escortVehicle == other.escortVehicle &&
                    ingress == other.ingress &&
                    initialPoint == other.initialPoint &&
                    objStrategy == other.objStrategy &&
                    recoveryVehicle == other.recoveryVehicle &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    egress,
                    egressPoint,
                    escortVehicle,
                    ingress,
                    initialPoint,
                    objStrategy,
                    recoveryVehicle,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExecutionInfo{egress=$egress, egressPoint=$egressPoint, escortVehicle=$escortVehicle, ingress=$ingress, initialPoint=$initialPoint, objStrategy=$objStrategy, recoveryVehicle=$recoveryVehicle, additionalProperties=$additionalProperties}"
        }

        class ObjectiveAreaInfo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val enemyData: JsonField<List<EnemyData>>,
            private val oscCallSign: JsonField<String>,
            private val oscFreq: JsonField<Double>,
            private val pzDesc: JsonField<String>,
            private val pzLocation: JsonField<List<Double>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("enemyData")
                @ExcludeMissing
                enemyData: JsonField<List<EnemyData>> = JsonMissing.of(),
                @JsonProperty("oscCallSign")
                @ExcludeMissing
                oscCallSign: JsonField<String> = JsonMissing.of(),
                @JsonProperty("oscFreq")
                @ExcludeMissing
                oscFreq: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("pzDesc")
                @ExcludeMissing
                pzDesc: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pzLocation")
                @ExcludeMissing
                pzLocation: JsonField<List<Double>> = JsonMissing.of(),
            ) : this(enemyData, oscCallSign, oscFreq, pzDesc, pzLocation, mutableMapOf())

            /**
             * Information detailing knowledge of enemies in the area.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun enemyData(): Optional<List<EnemyData>> = enemyData.getOptional("enemyData")

            /**
             * The call sign of the on-scene commander.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun oscCallSign(): Optional<String> = oscCallSign.getOptional("oscCallSign")

            /**
             * The radio frequency of the on-scene commander.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun oscFreq(): Optional<Double> = oscFreq.getOptional("oscFreq")

            /**
             * Description of the pickup zone location.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pzDesc(): Optional<String> = pzDesc.getOptional("pzDesc")

            /**
             * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
             * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in degrees,
             * and altitude, in meters, of the pz location. This array must contain a minimum of 2
             * elements (latitude and longitude), and may contain an optional 3rd element
             * (altitude).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun pzLocation(): Optional<List<Double>> = pzLocation.getOptional("pzLocation")

            /**
             * Returns the raw JSON value of [enemyData].
             *
             * Unlike [enemyData], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("enemyData")
            @ExcludeMissing
            fun _enemyData(): JsonField<List<EnemyData>> = enemyData

            /**
             * Returns the raw JSON value of [oscCallSign].
             *
             * Unlike [oscCallSign], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("oscCallSign")
            @ExcludeMissing
            fun _oscCallSign(): JsonField<String> = oscCallSign

            /**
             * Returns the raw JSON value of [oscFreq].
             *
             * Unlike [oscFreq], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("oscFreq") @ExcludeMissing fun _oscFreq(): JsonField<Double> = oscFreq

            /**
             * Returns the raw JSON value of [pzDesc].
             *
             * Unlike [pzDesc], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pzDesc") @ExcludeMissing fun _pzDesc(): JsonField<String> = pzDesc

            /**
             * Returns the raw JSON value of [pzLocation].
             *
             * Unlike [pzLocation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pzLocation")
            @ExcludeMissing
            fun _pzLocation(): JsonField<List<Double>> = pzLocation

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
                 * Returns a mutable builder for constructing an instance of [ObjectiveAreaInfo].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ObjectiveAreaInfo]. */
            class Builder internal constructor() {

                private var enemyData: JsonField<MutableList<EnemyData>>? = null
                private var oscCallSign: JsonField<String> = JsonMissing.of()
                private var oscFreq: JsonField<Double> = JsonMissing.of()
                private var pzDesc: JsonField<String> = JsonMissing.of()
                private var pzLocation: JsonField<MutableList<Double>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(objectiveAreaInfo: ObjectiveAreaInfo) = apply {
                    enemyData = objectiveAreaInfo.enemyData.map { it.toMutableList() }
                    oscCallSign = objectiveAreaInfo.oscCallSign
                    oscFreq = objectiveAreaInfo.oscFreq
                    pzDesc = objectiveAreaInfo.pzDesc
                    pzLocation = objectiveAreaInfo.pzLocation.map { it.toMutableList() }
                    additionalProperties = objectiveAreaInfo.additionalProperties.toMutableMap()
                }

                /** Information detailing knowledge of enemies in the area. */
                fun enemyData(enemyData: List<EnemyData>) = enemyData(JsonField.of(enemyData))

                /**
                 * Sets [Builder.enemyData] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enemyData] with a well-typed `List<EnemyData>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun enemyData(enemyData: JsonField<List<EnemyData>>) = apply {
                    this.enemyData = enemyData.map { it.toMutableList() }
                }

                /**
                 * Adds a single [EnemyData] to [Builder.enemyData].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addEnemyData(enemyData: EnemyData) = apply {
                    this.enemyData =
                        (this.enemyData ?: JsonField.of(mutableListOf())).also {
                            checkKnown("enemyData", it).add(enemyData)
                        }
                }

                /** The call sign of the on-scene commander. */
                fun oscCallSign(oscCallSign: String) = oscCallSign(JsonField.of(oscCallSign))

                /**
                 * Sets [Builder.oscCallSign] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oscCallSign] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun oscCallSign(oscCallSign: JsonField<String>) = apply {
                    this.oscCallSign = oscCallSign
                }

                /** The radio frequency of the on-scene commander. */
                fun oscFreq(oscFreq: Double) = oscFreq(JsonField.of(oscFreq))

                /**
                 * Sets [Builder.oscFreq] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oscFreq] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun oscFreq(oscFreq: JsonField<Double>) = apply { this.oscFreq = oscFreq }

                /** Description of the pickup zone location. */
                fun pzDesc(pzDesc: String) = pzDesc(JsonField.of(pzDesc))

                /**
                 * Sets [Builder.pzDesc] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pzDesc] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pzDesc(pzDesc: JsonField<String>) = apply { this.pzDesc = pzDesc }

                /**
                 * Array of the WGS-84 latitude (-90 to 90, negative values south of the equator) in
                 * degrees, longitude (-180 to 180, negative values west of Prime Meridian) in
                 * degrees, and altitude, in meters, of the pz location. This array must contain a
                 * minimum of 2 elements (latitude and longitude), and may contain an optional 3rd
                 * element (altitude).
                 */
                fun pzLocation(pzLocation: List<Double>) = pzLocation(JsonField.of(pzLocation))

                /**
                 * Sets [Builder.pzLocation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pzLocation] with a well-typed `List<Double>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pzLocation(pzLocation: JsonField<List<Double>>) = apply {
                    this.pzLocation = pzLocation.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Double] to [Builder.pzLocation].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPzLocation(pzLocation: Double) = apply {
                    this.pzLocation =
                        (this.pzLocation ?: JsonField.of(mutableListOf())).also {
                            checkKnown("pzLocation", it).add(pzLocation)
                        }
                }

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
                 * Returns an immutable instance of [ObjectiveAreaInfo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ObjectiveAreaInfo =
                    ObjectiveAreaInfo(
                        (enemyData ?: JsonMissing.of()).map { it.toImmutable() },
                        oscCallSign,
                        oscFreq,
                        pzDesc,
                        (pzLocation ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ObjectiveAreaInfo = apply {
                if (validated) {
                    return@apply
                }

                enemyData().ifPresent { it.forEach { it.validate() } }
                oscCallSign()
                oscFreq()
                pzDesc()
                pzLocation()
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
                (enemyData.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (oscCallSign.asKnown().isPresent) 1 else 0) +
                    (if (oscFreq.asKnown().isPresent) 1 else 0) +
                    (if (pzDesc.asKnown().isPresent) 1 else 0) +
                    (pzLocation.asKnown().getOrNull()?.size ?: 0)

            class EnemyData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val dirToEnemy: JsonField<String>,
                private val friendliesRemarks: JsonField<String>,
                private val hlzRemarks: JsonField<String>,
                private val hostileFireType: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("dirToEnemy")
                    @ExcludeMissing
                    dirToEnemy: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("friendliesRemarks")
                    @ExcludeMissing
                    friendliesRemarks: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("hlzRemarks")
                    @ExcludeMissing
                    hlzRemarks: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("hostileFireType")
                    @ExcludeMissing
                    hostileFireType: JsonField<String> = JsonMissing.of(),
                ) : this(dirToEnemy, friendliesRemarks, hlzRemarks, hostileFireType, mutableMapOf())

                /**
                 * Directions to known enemies in the operation area (NORTH, NORTHEAST, EAST,
                 * SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST, SURROUNDED).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun dirToEnemy(): Optional<String> = dirToEnemy.getOptional("dirToEnemy")

                /**
                 * Comments provided by friendlies about the evac zone.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun friendliesRemarks(): Optional<String> =
                    friendliesRemarks.getOptional("friendliesRemarks")

                /**
                 * Hot Landing Zone remarks.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun hlzRemarks(): Optional<String> = hlzRemarks.getOptional("hlzRemarks")

                /**
                 * The type of hostile fire received (SMALL ARMS, MORTAR, ARTILLERY, ROCKETS).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun hostileFireType(): Optional<String> =
                    hostileFireType.getOptional("hostileFireType")

                /**
                 * Returns the raw JSON value of [dirToEnemy].
                 *
                 * Unlike [dirToEnemy], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dirToEnemy")
                @ExcludeMissing
                fun _dirToEnemy(): JsonField<String> = dirToEnemy

                /**
                 * Returns the raw JSON value of [friendliesRemarks].
                 *
                 * Unlike [friendliesRemarks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("friendliesRemarks")
                @ExcludeMissing
                fun _friendliesRemarks(): JsonField<String> = friendliesRemarks

                /**
                 * Returns the raw JSON value of [hlzRemarks].
                 *
                 * Unlike [hlzRemarks], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("hlzRemarks")
                @ExcludeMissing
                fun _hlzRemarks(): JsonField<String> = hlzRemarks

                /**
                 * Returns the raw JSON value of [hostileFireType].
                 *
                 * Unlike [hostileFireType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("hostileFireType")
                @ExcludeMissing
                fun _hostileFireType(): JsonField<String> = hostileFireType

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

                    /** Returns a mutable builder for constructing an instance of [EnemyData]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [EnemyData]. */
                class Builder internal constructor() {

                    private var dirToEnemy: JsonField<String> = JsonMissing.of()
                    private var friendliesRemarks: JsonField<String> = JsonMissing.of()
                    private var hlzRemarks: JsonField<String> = JsonMissing.of()
                    private var hostileFireType: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(enemyData: EnemyData) = apply {
                        dirToEnemy = enemyData.dirToEnemy
                        friendliesRemarks = enemyData.friendliesRemarks
                        hlzRemarks = enemyData.hlzRemarks
                        hostileFireType = enemyData.hostileFireType
                        additionalProperties = enemyData.additionalProperties.toMutableMap()
                    }

                    /**
                     * Directions to known enemies in the operation area (NORTH, NORTHEAST, EAST,
                     * SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST, SURROUNDED).
                     */
                    fun dirToEnemy(dirToEnemy: String) = dirToEnemy(JsonField.of(dirToEnemy))

                    /**
                     * Sets [Builder.dirToEnemy] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dirToEnemy] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun dirToEnemy(dirToEnemy: JsonField<String>) = apply {
                        this.dirToEnemy = dirToEnemy
                    }

                    /** Comments provided by friendlies about the evac zone. */
                    fun friendliesRemarks(friendliesRemarks: String) =
                        friendliesRemarks(JsonField.of(friendliesRemarks))

                    /**
                     * Sets [Builder.friendliesRemarks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.friendliesRemarks] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun friendliesRemarks(friendliesRemarks: JsonField<String>) = apply {
                        this.friendliesRemarks = friendliesRemarks
                    }

                    /** Hot Landing Zone remarks. */
                    fun hlzRemarks(hlzRemarks: String) = hlzRemarks(JsonField.of(hlzRemarks))

                    /**
                     * Sets [Builder.hlzRemarks] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hlzRemarks] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun hlzRemarks(hlzRemarks: JsonField<String>) = apply {
                        this.hlzRemarks = hlzRemarks
                    }

                    /**
                     * The type of hostile fire received (SMALL ARMS, MORTAR, ARTILLERY, ROCKETS).
                     */
                    fun hostileFireType(hostileFireType: String) =
                        hostileFireType(JsonField.of(hostileFireType))

                    /**
                     * Sets [Builder.hostileFireType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hostileFireType] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun hostileFireType(hostileFireType: JsonField<String>) = apply {
                        this.hostileFireType = hostileFireType
                    }

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
                     * Returns an immutable instance of [EnemyData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): EnemyData =
                        EnemyData(
                            dirToEnemy,
                            friendliesRemarks,
                            hlzRemarks,
                            hostileFireType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): EnemyData = apply {
                    if (validated) {
                        return@apply
                    }

                    dirToEnemy()
                    friendliesRemarks()
                    hlzRemarks()
                    hostileFireType()
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
                    (if (dirToEnemy.asKnown().isPresent) 1 else 0) +
                        (if (friendliesRemarks.asKnown().isPresent) 1 else 0) +
                        (if (hlzRemarks.asKnown().isPresent) 1 else 0) +
                        (if (hostileFireType.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EnemyData &&
                        dirToEnemy == other.dirToEnemy &&
                        friendliesRemarks == other.friendliesRemarks &&
                        hlzRemarks == other.hlzRemarks &&
                        hostileFireType == other.hostileFireType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        dirToEnemy,
                        friendliesRemarks,
                        hlzRemarks,
                        hostileFireType,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EnemyData{dirToEnemy=$dirToEnemy, friendliesRemarks=$friendliesRemarks, hlzRemarks=$hlzRemarks, hostileFireType=$hostileFireType, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ObjectiveAreaInfo &&
                    enemyData == other.enemyData &&
                    oscCallSign == other.oscCallSign &&
                    oscFreq == other.oscFreq &&
                    pzDesc == other.pzDesc &&
                    pzLocation == other.pzLocation &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    enemyData,
                    oscCallSign,
                    oscFreq,
                    pzDesc,
                    pzLocation,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ObjectiveAreaInfo{enemyData=$enemyData, oscCallSign=$oscCallSign, oscFreq=$oscFreq, pzDesc=$pzDesc, pzLocation=$pzLocation, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                msgTime == other.msgTime &&
                pickupLat == other.pickupLat &&
                pickupLon == other.pickupLon &&
                source == other.source &&
                type == other.type &&
                id == other.id &&
                authMethod == other.authMethod &&
                authStatus == other.authStatus &&
                beaconInd == other.beaconInd &&
                callSign == other.callSign &&
                commEq1 == other.commEq1 &&
                commEq2 == other.commEq2 &&
                commEq3 == other.commEq3 &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                executionInfo == other.executionInfo &&
                identity == other.identity &&
                idWeatherReport == other.idWeatherReport &&
                milClass == other.milClass &&
                natAlliance == other.natAlliance &&
                natAlliance1 == other.natAlliance1 &&
                numAmbulatory == other.numAmbulatory &&
                numAmbulatoryInjured == other.numAmbulatoryInjured &&
                numNonAmbulatory == other.numNonAmbulatory &&
                numPersons == other.numPersons &&
                objectiveAreaInfo == other.objectiveAreaInfo &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                pickupAlt == other.pickupAlt &&
                recovId == other.recovId &&
                rxFreq == other.rxFreq &&
                survivorMessages == other.survivorMessages &&
                survivorRadio == other.survivorRadio &&
                termInd == other.termInd &&
                textMsg == other.textMsg &&
                txFreq == other.txFreq &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                msgTime,
                pickupLat,
                pickupLon,
                source,
                type,
                id,
                authMethod,
                authStatus,
                beaconInd,
                callSign,
                commEq1,
                commEq2,
                commEq3,
                createdAt,
                createdBy,
                executionInfo,
                identity,
                idWeatherReport,
                milClass,
                natAlliance,
                natAlliance1,
                numAmbulatory,
                numAmbulatoryInjured,
                numNonAmbulatory,
                numPersons,
                objectiveAreaInfo,
                origin,
                origNetwork,
                pickupAlt,
                recovId,
                rxFreq,
                survivorMessages,
                survivorRadio,
                termInd,
                textMsg,
                txFreq,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, msgTime=$msgTime, pickupLat=$pickupLat, pickupLon=$pickupLon, source=$source, type=$type, id=$id, authMethod=$authMethod, authStatus=$authStatus, beaconInd=$beaconInd, callSign=$callSign, commEq1=$commEq1, commEq2=$commEq2, commEq3=$commEq3, createdAt=$createdAt, createdBy=$createdBy, executionInfo=$executionInfo, identity=$identity, idWeatherReport=$idWeatherReport, milClass=$milClass, natAlliance=$natAlliance, natAlliance1=$natAlliance1, numAmbulatory=$numAmbulatory, numAmbulatoryInjured=$numAmbulatoryInjured, numNonAmbulatory=$numNonAmbulatory, numPersons=$numPersons, objectiveAreaInfo=$objectiveAreaInfo, origin=$origin, origNetwork=$origNetwork, pickupAlt=$pickupAlt, recovId=$recovId, rxFreq=$rxFreq, survivorMessages=$survivorMessages, survivorRadio=$survivorRadio, termInd=$termInd, textMsg=$textMsg, txFreq=$txFreq, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PersonnelrecoveryCreateBulkParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PersonnelrecoveryCreateBulkParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

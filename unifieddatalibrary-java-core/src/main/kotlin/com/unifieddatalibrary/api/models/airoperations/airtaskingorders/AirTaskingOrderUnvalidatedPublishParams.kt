// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airoperations.airtaskingorders

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
import com.unifieddatalibrary.api.models.airoperations.airtaskingorders.AirTaskingOrderUnvalidatedPublishParams
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Service operation to take multiple airtaskingorder records as a POST body and ingest into the database. This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance. */
class AirTaskingOrderUnvalidatedPublishParams private constructor(
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
         * Returns a mutable builder for constructing an instance of [AirTaskingOrderUnvalidatedPublishParams].
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [AirTaskingOrderUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(airTaskingOrderUnvalidatedPublishParams: AirTaskingOrderUnvalidatedPublishParams) =
            apply {
                body = airTaskingOrderUnvalidatedPublishParams.body.toMutableList()
                additionalHeaders = airTaskingOrderUnvalidatedPublishParams.additionalHeaders.toBuilder()
                additionalQueryParams = airTaskingOrderUnvalidatedPublishParams.additionalQueryParams.toBuilder()
            }

        fun body(body: List<Body>) =
            apply {
                this.body = body.toMutableList()
            }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) =
            apply {
                this.body = (this.body ?: mutableListOf()).apply { add(body) }
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        /**
         * Returns an immutable instance of [AirTaskingOrderUnvalidatedPublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirTaskingOrderUnvalidatedPublishParams =
            AirTaskingOrderUnvalidatedPublishParams(
              checkRequired(
                "body", body
              ).toImmutable(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Beta Version Air Tasking Order: The ATO is used to task air missions, assign cross force tasking as well as intraservice tasking. */
    class Body @JsonCreator private constructor(
        @JsonProperty("beginTs") @ExcludeMissing private val beginTs: JsonField<OffsetDateTime>,
        @JsonProperty("classificationMarking") @ExcludeMissing private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("opExerName") @ExcludeMissing private val opExerName: JsonField<String>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("ackReqInd") @ExcludeMissing private val ackReqInd: JsonField<String>,
        @JsonProperty("ackUnitInstructions") @ExcludeMissing private val ackUnitInstructions: JsonField<String>,
        @JsonProperty("acMsnTasking") @ExcludeMissing private val acMsnTasking: JsonField<List<AcMsnTasking>>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("endTs") @ExcludeMissing private val endTs: JsonField<OffsetDateTime>,
        @JsonProperty("genText") @ExcludeMissing private val genText: JsonField<List<GenText>>,
        @JsonProperty("msgMonth") @ExcludeMissing private val msgMonth: JsonField<String>,
        @JsonProperty("msgOriginator") @ExcludeMissing private val msgOriginator: JsonField<String>,
        @JsonProperty("msgQualifier") @ExcludeMissing private val msgQualifier: JsonField<String>,
        @JsonProperty("msgSN") @ExcludeMissing private val msgSn: JsonField<String>,
        @JsonProperty("navalFltOps") @ExcludeMissing private val navalFltOps: JsonField<List<NavalFltOp>>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("rawFileURI") @ExcludeMissing private val rawFileUri: JsonField<String>,
        @JsonProperty("sourceDL") @ExcludeMissing private val sourceDl: JsonField<String>,

    ) {

        /**
         * The effective begin time for this ATO in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beginTs(): OffsetDateTime = beginTs.getRequired("beginTs")

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
         * Specifies the unique operation or exercise name, nickname, or codeword assigned to a joint exercise or operation plan.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun opExerName(): String = opExerName.getRequired("opExerName")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * The indicator specifying an affirmative or a negatice condition for this message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun ackReqInd(): Optional<String> = ackReqInd.getOptional("ackReqInd")

        /**
         * Specifies textual data amplifying the data contained in the acknowledgement requirement indicator (ackRedInd) field or the unit required to acknowledge.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun ackUnitInstructions(): Optional<String> = ackUnitInstructions.getOptional("ackUnitInstructions")

        /**
         * A collection that specifies the tasked country, tasked service, unit and mission level tasking for this ATO.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun acMsnTasking(): Optional<List<AcMsnTasking>> = acMsnTasking.getOptional("acMsnTasking")

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
         * The effective end time for this ATO in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun endTs(): Optional<OffsetDateTime> = endTs.getOptional("endTs")

        /**
         * A collection that details special instructions, important information, guidance, and amplifying information regarding this ATO.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun genText(): Optional<List<GenText>> = genText.getOptional("genText")

        /**
         * The month in which the message originated.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun msgMonth(): Optional<String> = msgMonth.getOptional("msgMonth")

        /**
         * The identifier of the originator of the message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun msgOriginator(): Optional<String> = msgOriginator.getOptional("msgOriginator")

        /**
         * The qualifier which caveats the message status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun msgQualifier(): Optional<String> = msgQualifier.getOptional("msgQualifier")

        /**
         * The unique message identifier sequentially assigned by the originator.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun msgSn(): Optional<String> = msgSn.getOptional("msgSN")

        /**
         * A collection that specifies the naval flight operations for this ATO.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun navalFltOps(): Optional<List<NavalFltOp>> = navalFltOps.getOptional("navalFltOps")

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
         * Optional URI location in the document repository of the raw file parsed by the system to produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id= to this value.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun rawFileUri(): Optional<String> = rawFileUri.getOptional("rawFileURI")

        /**
         * The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
         */
        fun sourceDl(): Optional<String> = sourceDl.getOptional("sourceDL")

        /**
         * Returns the raw JSON value of [beginTs].
         *
         * Unlike [beginTs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beginTs")
        @ExcludeMissing
        fun _beginTs(): JsonField<OffsetDateTime> = beginTs

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
         * Returns the raw JSON value of [opExerName].
         *
         * Unlike [opExerName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("opExerName")
        @ExcludeMissing
        fun _opExerName(): JsonField<String> = opExerName

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
         * Returns the raw JSON value of [ackReqInd].
         *
         * Unlike [ackReqInd], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ackReqInd")
        @ExcludeMissing
        fun _ackReqInd(): JsonField<String> = ackReqInd

        /**
         * Returns the raw JSON value of [ackUnitInstructions].
         *
         * Unlike [ackUnitInstructions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ackUnitInstructions")
        @ExcludeMissing
        fun _ackUnitInstructions(): JsonField<String> = ackUnitInstructions

        /**
         * Returns the raw JSON value of [acMsnTasking].
         *
         * Unlike [acMsnTasking], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("acMsnTasking")
        @ExcludeMissing
        fun _acMsnTasking(): JsonField<List<AcMsnTasking>> = acMsnTasking

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
         * Returns the raw JSON value of [endTs].
         *
         * Unlike [endTs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endTs")
        @ExcludeMissing
        fun _endTs(): JsonField<OffsetDateTime> = endTs

        /**
         * Returns the raw JSON value of [genText].
         *
         * Unlike [genText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("genText")
        @ExcludeMissing
        fun _genText(): JsonField<List<GenText>> = genText

        /**
         * Returns the raw JSON value of [msgMonth].
         *
         * Unlike [msgMonth], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgMonth")
        @ExcludeMissing
        fun _msgMonth(): JsonField<String> = msgMonth

        /**
         * Returns the raw JSON value of [msgOriginator].
         *
         * Unlike [msgOriginator], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgOriginator")
        @ExcludeMissing
        fun _msgOriginator(): JsonField<String> = msgOriginator

        /**
         * Returns the raw JSON value of [msgQualifier].
         *
         * Unlike [msgQualifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgQualifier")
        @ExcludeMissing
        fun _msgQualifier(): JsonField<String> = msgQualifier

        /**
         * Returns the raw JSON value of [msgSn].
         *
         * Unlike [msgSn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("msgSN")
        @ExcludeMissing
        fun _msgSn(): JsonField<String> = msgSn

        /**
         * Returns the raw JSON value of [navalFltOps].
         *
         * Unlike [navalFltOps], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("navalFltOps")
        @ExcludeMissing
        fun _navalFltOps(): JsonField<List<NavalFltOp>> = navalFltOps

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
         * Returns the raw JSON value of [rawFileUri].
         *
         * Unlike [rawFileUri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rawFileURI")
        @ExcludeMissing
        fun _rawFileUri(): JsonField<String> = rawFileUri

        /**
         * Returns the raw JSON value of [sourceDl].
         *
         * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceDL")
        @ExcludeMissing
        fun _sourceDl(): JsonField<String> = sourceDl

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```java
             * .beginTs()
             * .classificationMarking()
             * .dataMode()
             * .opExerName()
             * .source()
             * ```
             */
            @JvmStatic
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var beginTs: JsonField<OffsetDateTime>? = null
            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var opExerName: JsonField<String>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var ackReqInd: JsonField<String> = JsonMissing.of()
            private var ackUnitInstructions: JsonField<String> = JsonMissing.of()
            private var acMsnTasking: JsonField<MutableList<AcMsnTasking>>? = null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var endTs: JsonField<OffsetDateTime> = JsonMissing.of()
            private var genText: JsonField<MutableList<GenText>>? = null
            private var msgMonth: JsonField<String> = JsonMissing.of()
            private var msgOriginator: JsonField<String> = JsonMissing.of()
            private var msgQualifier: JsonField<String> = JsonMissing.of()
            private var msgSn: JsonField<String> = JsonMissing.of()
            private var navalFltOps: JsonField<MutableList<NavalFltOp>>? = null
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var rawFileUri: JsonField<String> = JsonMissing.of()
            private var sourceDl: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) =
                apply {
                    beginTs = body.beginTs
                    classificationMarking = body.classificationMarking
                    dataMode = body.dataMode
                    opExerName = body.opExerName
                    source = body.source
                    id = body.id
                    ackReqInd = body.ackReqInd
                    ackUnitInstructions = body.ackUnitInstructions
                    acMsnTasking = body.acMsnTasking.map { it.toMutableList() }
                    createdAt = body.createdAt
                    createdBy = body.createdBy
                    endTs = body.endTs
                    genText = body.genText.map { it.toMutableList() }
                    msgMonth = body.msgMonth
                    msgOriginator = body.msgOriginator
                    msgQualifier = body.msgQualifier
                    msgSn = body.msgSn
                    navalFltOps = body.navalFltOps.map { it.toMutableList() }
                    origin = body.origin
                    origNetwork = body.origNetwork
                    rawFileUri = body.rawFileUri
                    sourceDl = body.sourceDl
                }

            /** The effective begin time for this ATO in ISO 8601 UTC format with millisecond precision. */
            fun beginTs(beginTs: OffsetDateTime) = beginTs(JsonField.of(beginTs))

            /**
             * Sets [Builder.beginTs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beginTs] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beginTs(beginTs: JsonField<OffsetDateTime>) =
                apply {
                    this.beginTs = beginTs
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

            /** Specifies the unique operation or exercise name, nickname, or codeword assigned to a joint exercise or operation plan. */
            fun opExerName(opExerName: String) = opExerName(JsonField.of(opExerName))

            /**
             * Sets [Builder.opExerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.opExerName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun opExerName(opExerName: JsonField<String>) =
                apply {
                    this.opExerName = opExerName
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

            /** Unique identifier of the record, auto-generated by the system. */
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

            /** The indicator specifying an affirmative or a negatice condition for this message. */
            fun ackReqInd(ackReqInd: String) = ackReqInd(JsonField.of(ackReqInd))

            /**
             * Sets [Builder.ackReqInd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ackReqInd] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ackReqInd(ackReqInd: JsonField<String>) =
                apply {
                    this.ackReqInd = ackReqInd
                }

            /** Specifies textual data amplifying the data contained in the acknowledgement requirement indicator (ackRedInd) field or the unit required to acknowledge. */
            fun ackUnitInstructions(ackUnitInstructions: String) = ackUnitInstructions(JsonField.of(ackUnitInstructions))

            /**
             * Sets [Builder.ackUnitInstructions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ackUnitInstructions] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ackUnitInstructions(ackUnitInstructions: JsonField<String>) =
                apply {
                    this.ackUnitInstructions = ackUnitInstructions
                }

            /** A collection that specifies the tasked country, tasked service, unit and mission level tasking for this ATO. */
            fun acMsnTasking(acMsnTasking: List<AcMsnTasking>) = acMsnTasking(JsonField.of(acMsnTasking))

            /**
             * Sets [Builder.acMsnTasking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acMsnTasking] with a well-typed `List<AcMsnTasking>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acMsnTasking(acMsnTasking: JsonField<List<AcMsnTasking>>) =
                apply {
                    this.acMsnTasking = acMsnTasking.map { it.toMutableList() }
                }

            /**
             * Adds a single [AcMsnTasking] to [Builder.acMsnTasking].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcMsnTasking(acMsnTasking: AcMsnTasking) =
                apply {
                    this.acMsnTasking = (this.acMsnTasking ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acMsnTasking", it).add(acMsnTasking)
                    }
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

            /** The effective end time for this ATO in ISO 8601 UTC format with millisecond precision. */
            fun endTs(endTs: OffsetDateTime) = endTs(JsonField.of(endTs))

            /**
             * Sets [Builder.endTs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endTs] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endTs(endTs: JsonField<OffsetDateTime>) =
                apply {
                    this.endTs = endTs
                }

            /** A collection that details special instructions, important information, guidance, and amplifying information regarding this ATO. */
            fun genText(genText: List<GenText>) = genText(JsonField.of(genText))

            /**
             * Sets [Builder.genText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.genText] with a well-typed `List<GenText>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun genText(genText: JsonField<List<GenText>>) =
                apply {
                    this.genText = genText.map { it.toMutableList() }
                }

            /**
             * Adds a single [GenText] to [Builder.genText].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addGenText(genText: GenText) =
                apply {
                    this.genText = (this.genText ?: JsonField.of(mutableListOf())).also {
                        checkKnown("genText", it).add(genText)
                    }
                }

            /** The month in which the message originated. */
            fun msgMonth(msgMonth: String) = msgMonth(JsonField.of(msgMonth))

            /**
             * Sets [Builder.msgMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgMonth] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgMonth(msgMonth: JsonField<String>) =
                apply {
                    this.msgMonth = msgMonth
                }

            /** The identifier of the originator of the message. */
            fun msgOriginator(msgOriginator: String) = msgOriginator(JsonField.of(msgOriginator))

            /**
             * Sets [Builder.msgOriginator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgOriginator] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgOriginator(msgOriginator: JsonField<String>) =
                apply {
                    this.msgOriginator = msgOriginator
                }

            /** The qualifier which caveats the message status. */
            fun msgQualifier(msgQualifier: String) = msgQualifier(JsonField.of(msgQualifier))

            /**
             * Sets [Builder.msgQualifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgQualifier] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgQualifier(msgQualifier: JsonField<String>) =
                apply {
                    this.msgQualifier = msgQualifier
                }

            /** The unique message identifier sequentially assigned by the originator. */
            fun msgSn(msgSn: String) = msgSn(JsonField.of(msgSn))

            /**
             * Sets [Builder.msgSn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.msgSn] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun msgSn(msgSn: JsonField<String>) =
                apply {
                    this.msgSn = msgSn
                }

            /** A collection that specifies the naval flight operations for this ATO. */
            fun navalFltOps(navalFltOps: List<NavalFltOp>) = navalFltOps(JsonField.of(navalFltOps))

            /**
             * Sets [Builder.navalFltOps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.navalFltOps] with a well-typed `List<NavalFltOp>` value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun navalFltOps(navalFltOps: JsonField<List<NavalFltOp>>) =
                apply {
                    this.navalFltOps = navalFltOps.map { it.toMutableList() }
                }

            /**
             * Adds a single [NavalFltOp] to [navalFltOps].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNavalFltOp(navalFltOp: NavalFltOp) =
                apply {
                    navalFltOps = (navalFltOps ?: JsonField.of(mutableListOf())).also {
                        checkKnown("navalFltOps", it).add(navalFltOp)
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

            /** Optional URI location in the document repository of the raw file parsed by the system to produce this record. To download the raw file, prepend https://udl-hostname/scs/download?id= to this value. */
            fun rawFileUri(rawFileUri: String) = rawFileUri(JsonField.of(rawFileUri))

            /**
             * Sets [Builder.rawFileUri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rawFileUri] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rawFileUri(rawFileUri: JsonField<String>) =
                apply {
                    this.rawFileUri = rawFileUri
                }

            /** The source data library from which this record was received. This could be a remote or tactical UDL or another data library. If null, the record should be assumed to have originated from the primary Enterprise UDL. */
            fun sourceDl(sourceDl: String) = sourceDl(JsonField.of(sourceDl))

            /**
             * Sets [Builder.sourceDl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDl] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDl(sourceDl: JsonField<String>) =
                apply {
                    this.sourceDl = sourceDl
                }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             *
             * ```java
             * .beginTs()
             * .classificationMarking()
             * .dataMode()
             * .opExerName()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                  checkRequired(
                    "beginTs", beginTs
                  ),
                  checkRequired(
                    "classificationMarking", classificationMarking
                  ),
                  checkRequired(
                    "dataMode", dataMode
                  ),
                  checkRequired(
                    "opExerName", opExerName
                  ),
                  checkRequired(
                    "source", source
                  ),
                  id,
                  ackReqInd,
                  ackUnitInstructions,
                  (acMsnTasking ?: JsonMissing.of()).map { it.toImmutable() },
                  createdAt,
                  createdBy,
                  endTs,
                  (genText ?: JsonMissing.of()).map { it.toImmutable() },
                  msgMonth,
                  msgOriginator,
                  msgQualifier,
                  msgSn,
                  (navalFltOps ?: JsonMissing.of()).map { it.toImmutable() },
                  origin,
                  origNetwork,
                  rawFileUri,
                  sourceDl,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                beginTs()
                classificationMarking()
                dataMode().validate()
                opExerName()
                source()
                id()
                ackReqInd()
                ackUnitInstructions()
                acMsnTasking().ifPresent { it.forEach { it.validate() } }
                createdAt()
                createdBy()
                endTs()
                genText().ifPresent { it.forEach { it.validate() } }
                msgMonth()
                msgOriginator()
                msgQualifier()
                msgSn()
                navalFltOps().ifPresent { it.forEach { it.validate() } }
                origin()
                origNetwork()
                rawFileUri()
                sourceDl()
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
        internal fun validity(): Int = (if (beginTs.asKnown().isPresent) 1 else 0) + (if (classificationMarking.asKnown().isPresent) 1 else 0) + (dataMode.asKnown().getOrNull()?.validity() ?: 0) + (if (opExerName.asKnown().isPresent) 1 else 0) + (if (source.asKnown().isPresent) 1 else 0) + (if (id.asKnown().isPresent) 1 else 0) + (if (ackReqInd.asKnown().isPresent) 1 else 0) + (if (ackUnitInstructions.asKnown().isPresent) 1 else 0) + (acMsnTasking.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (createdAt.asKnown().isPresent) 1 else 0) + (if (createdBy.asKnown().isPresent) 1 else 0) + (if (endTs.asKnown().isPresent) 1 else 0) + (genText.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (msgMonth.asKnown().isPresent) 1 else 0) + (if (msgOriginator.asKnown().isPresent) 1 else 0) + (if (msgQualifier.asKnown().isPresent) 1 else 0) + (if (msgSn.asKnown().isPresent) 1 else 0) + (navalFltOps.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (origin.asKnown().isPresent) 1 else 0) + (if (origNetwork.asKnown().isPresent) 1 else 0) + (if (rawFileUri.asKnown().isPresent) 1 else 0) + (if (sourceDl.asKnown().isPresent) 1 else 0)

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

        /** Collection that specifies the tasked country, tasked service, unit and mission level tasking for this ATO. */
        class AcMsnTasking private constructor(
            private val countryCode: JsonField<String>,
            private val taskedService: JsonField<String>,
            private val unitDesignator: JsonField<String>,
            private val acMsnLocSeg: JsonField<List<AcMsnLocSeg>>,
            private val alertStatus: JsonField<Int>,
            private val amcMsnNum: JsonField<String>,
            private val depLocLat: JsonField<Double>,
            private val depLocLon: JsonField<Double>,
            private val depLocName: JsonField<String>,
            private val depLocUtm: JsonField<String>,
            private val depTime: JsonField<OffsetDateTime>,
            private val indAcTasking: JsonField<List<IndAcTasking>>,
            private val msnCommander: JsonField<String>,
            private val msnNum: JsonField<String>,
            private val pkgId: JsonField<String>,
            private val priMsnType: JsonField<String>,
            private val rcvyLocLat: JsonField<List<Double>>,
            private val rcvyLocLon: JsonField<List<Double>>,
            private val rcvyLocName: JsonField<List<String>>,
            private val rcvyLocUtm: JsonField<List<String>>,
            private val rcvyTime: JsonField<List<OffsetDateTime>>,
            private val resMsnInd: JsonField<String>,
            private val secMsnType: JsonField<String>,
            private val unitLocName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,

        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("countryCode") @ExcludeMissing countryCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskedService") @ExcludeMissing taskedService: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unitDesignator") @ExcludeMissing unitDesignator: JsonField<String> = JsonMissing.of(),
                @JsonProperty("acMsnLocSeg") @ExcludeMissing acMsnLocSeg: JsonField<List<AcMsnLocSeg>> = JsonMissing.of(),
                @JsonProperty("alertStatus") @ExcludeMissing alertStatus: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("amcMsnNum") @ExcludeMissing amcMsnNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("depLocLat") @ExcludeMissing depLocLat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("depLocLon") @ExcludeMissing depLocLon: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("depLocName") @ExcludeMissing depLocName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("depLocUTM") @ExcludeMissing depLocUtm: JsonField<String> = JsonMissing.of(),
                @JsonProperty("depTime") @ExcludeMissing depTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("indACTasking") @ExcludeMissing indAcTasking: JsonField<List<IndAcTasking>> = JsonMissing.of(),
                @JsonProperty("msnCommander") @ExcludeMissing msnCommander: JsonField<String> = JsonMissing.of(),
                @JsonProperty("msnNum") @ExcludeMissing msnNum: JsonField<String> = JsonMissing.of(),
                @JsonProperty("pkgId") @ExcludeMissing pkgId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priMsnType") @ExcludeMissing priMsnType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("rcvyLocLat") @ExcludeMissing rcvyLocLat: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rcvyLocLon") @ExcludeMissing rcvyLocLon: JsonField<List<Double>> = JsonMissing.of(),
                @JsonProperty("rcvyLocName") @ExcludeMissing rcvyLocName: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("rcvyLocUTM") @ExcludeMissing rcvyLocUtm: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("rcvyTime") @ExcludeMissing rcvyTime: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
                @JsonProperty("resMsnInd") @ExcludeMissing resMsnInd: JsonField<String> = JsonMissing.of(),
                @JsonProperty("secMsnType") @ExcludeMissing secMsnType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unitLocName") @ExcludeMissing unitLocName: JsonField<String> = JsonMissing.of()
            ) : this(
              countryCode,
              taskedService,
              unitDesignator,
              acMsnLocSeg,
              alertStatus,
              amcMsnNum,
              depLocLat,
              depLocLon,
              depLocName,
              depLocUtm,
              depTime,
              indAcTasking,
              msnCommander,
              msnNum,
              pkgId,
              priMsnType,
              rcvyLocLat,
              rcvyLocLon,
              rcvyLocName,
              rcvyLocUtm,
              rcvyTime,
              resMsnInd,
              secMsnType,
              unitLocName,
              mutableMapOf(),
            )

            /**
             * The country code responsible for conducting this aircraft mission tasking for the exercise or operation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun countryCode(): String = countryCode.getRequired("countryCode")

            /**
             * The service tasked with conducting this aircraft mission tasking for the exercise or operation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun taskedService(): String = taskedService.getRequired("taskedService")

            /**
             * The designator of the unit that is tasked to perform this aircraft mission tasking.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun unitDesignator(): String = unitDesignator.getRequired("unitDesignator")

            /**
             * A collection of aircraft mission location information for this aircraft mission tasking.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun acMsnLocSeg(): Optional<List<AcMsnLocSeg>> = acMsnLocSeg.getOptional("acMsnLocSeg")

            /**
             * The readiness status expressed in time (minutes) for an aircraft to be airborne after the launch order is received or the time required for a missile unit to assume battle stations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun alertStatus(): Optional<Int> = alertStatus.getOptional("alertStatus")

            /**
             * The AMC number assigned to identify one aircraft from another.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun amcMsnNum(): Optional<String> = amcMsnNum.getOptional("amcMsnNum")

            /**
             * WGS-84 latitude of the departure location, in degrees. -90 to 90 degrees (negative values south of equator) for this tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun depLocLat(): Optional<Double> = depLocLat.getOptional("depLocLat")

            /**
             * WGS-84 longitude of the departure location, in degrees. -180 to 180 degrees (negative values west of Prime Meridian) for this tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun depLocLon(): Optional<Double> = depLocLon.getOptional("depLocLon")

            /**
             * The location or name specified for the departure of the tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun depLocName(): Optional<String> = depLocName.getOptional("depLocName")

            /**
             * The departure location specified in UTM (100 meter) coordinates for the tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun depLocUtm(): Optional<String> = depLocUtm.getOptional("depLocUTM")

            /**
             * The time of departure for the tasked air mission in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun depTime(): Optional<OffsetDateTime> = depTime.getOptional("depTime")

            /**
             * A collection of the individual aircraft assigned to this aircraft mission tasking.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun indAcTasking(): Optional<List<IndAcTasking>> = indAcTasking.getOptional("indACTasking")

            /**
             * The commander responsible for the planning and execution of the forces necessary to achieve desired objectives.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun msnCommander(): Optional<String> = msnCommander.getOptional("msnCommander")

            /**
             * The mission number assigned to this mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun msnNum(): Optional<String> = msnNum.getOptional("msnNum")

            /**
             * The identifier for the composite set of missions for this operation/exercise.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun pkgId(): Optional<String> = pkgId.getOptional("pkgId")

            /**
             * The code for the preferred type or designator for a tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun priMsnType(): Optional<String> = priMsnType.getOptional("priMsnType")

            /**
             * An array of WGS-84 latitude of the recovery locations, in degrees. -90 to 90 degrees (negative values south of equator) for this tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun rcvyLocLat(): Optional<List<Double>> = rcvyLocLat.getOptional("rcvyLocLat")

            /**
             * An array of WGS-84 longitude of the recovery locations, in degrees. -180 to 180 degrees (negative values west of Prime Meridian) for this tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun rcvyLocLon(): Optional<List<Double>> = rcvyLocLon.getOptional("rcvyLocLon")

            /**
             * An array of locations specified for the recovery of the tasked air mission represented by varying formats.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun rcvyLocName(): Optional<List<String>> = rcvyLocName.getOptional("rcvyLocName")

            /**
             * An array of recovery locations specified in UTM (100 meter) coordinates for the tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun rcvyLocUtm(): Optional<List<String>> = rcvyLocUtm.getOptional("rcvyLocUTM")

            /**
             * An array of recovery times for the tasked air mission in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun rcvyTime(): Optional<List<OffsetDateTime>> = rcvyTime.getOptional("rcvyTime")

            /**
             * An indicator of whether a mission is or will be a residual mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun resMsnInd(): Optional<String> = resMsnInd.getOptional("resMsnInd")

            /**
             * The code for the alternative type of a tasked air mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun secMsnType(): Optional<String> = secMsnType.getOptional("secMsnType")

            /**
             * The tasked units location expressed as an ICAO or a place name.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun unitLocName(): Optional<String> = unitLocName.getOptional("unitLocName")

            /**
             * Returns the raw JSON value of [countryCode].
             *
             * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("countryCode")
            @ExcludeMissing
            fun _countryCode(): JsonField<String> = countryCode

            /**
             * Returns the raw JSON value of [taskedService].
             *
             * Unlike [taskedService], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("taskedService")
            @ExcludeMissing
            fun _taskedService(): JsonField<String> = taskedService

            /**
             * Returns the raw JSON value of [unitDesignator].
             *
             * Unlike [unitDesignator], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unitDesignator")
            @ExcludeMissing
            fun _unitDesignator(): JsonField<String> = unitDesignator

            /**
             * Returns the raw JSON value of [acMsnLocSeg].
             *
             * Unlike [acMsnLocSeg], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("acMsnLocSeg")
            @ExcludeMissing
            fun _acMsnLocSeg(): JsonField<List<AcMsnLocSeg>> = acMsnLocSeg

            /**
             * Returns the raw JSON value of [alertStatus].
             *
             * Unlike [alertStatus], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("alertStatus")
            @ExcludeMissing
            fun _alertStatus(): JsonField<Int> = alertStatus

            /**
             * Returns the raw JSON value of [amcMsnNum].
             *
             * Unlike [amcMsnNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amcMsnNum")
            @ExcludeMissing
            fun _amcMsnNum(): JsonField<String> = amcMsnNum

            /**
             * Returns the raw JSON value of [depLocLat].
             *
             * Unlike [depLocLat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("depLocLat")
            @ExcludeMissing
            fun _depLocLat(): JsonField<Double> = depLocLat

            /**
             * Returns the raw JSON value of [depLocLon].
             *
             * Unlike [depLocLon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("depLocLon")
            @ExcludeMissing
            fun _depLocLon(): JsonField<Double> = depLocLon

            /**
             * Returns the raw JSON value of [depLocName].
             *
             * Unlike [depLocName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("depLocName")
            @ExcludeMissing
            fun _depLocName(): JsonField<String> = depLocName

            /**
             * Returns the raw JSON value of [depLocUtm].
             *
             * Unlike [depLocUtm], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("depLocUTM")
            @ExcludeMissing
            fun _depLocUtm(): JsonField<String> = depLocUtm

            /**
             * Returns the raw JSON value of [depTime].
             *
             * Unlike [depTime], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("depTime")
            @ExcludeMissing
            fun _depTime(): JsonField<OffsetDateTime> = depTime

            /**
             * Returns the raw JSON value of [indAcTasking].
             *
             * Unlike [indAcTasking], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("indACTasking")
            @ExcludeMissing
            fun _indAcTasking(): JsonField<List<IndAcTasking>> = indAcTasking

            /**
             * Returns the raw JSON value of [msnCommander].
             *
             * Unlike [msnCommander], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("msnCommander")
            @ExcludeMissing
            fun _msnCommander(): JsonField<String> = msnCommander

            /**
             * Returns the raw JSON value of [msnNum].
             *
             * Unlike [msnNum], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("msnNum")
            @ExcludeMissing
            fun _msnNum(): JsonField<String> = msnNum

            /**
             * Returns the raw JSON value of [pkgId].
             *
             * Unlike [pkgId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pkgId")
            @ExcludeMissing
            fun _pkgId(): JsonField<String> = pkgId

            /**
             * Returns the raw JSON value of [priMsnType].
             *
             * Unlike [priMsnType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("priMsnType")
            @ExcludeMissing
            fun _priMsnType(): JsonField<String> = priMsnType

            /**
             * Returns the raw JSON value of [rcvyLocLat].
             *
             * Unlike [rcvyLocLat], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rcvyLocLat")
            @ExcludeMissing
            fun _rcvyLocLat(): JsonField<List<Double>> = rcvyLocLat

            /**
             * Returns the raw JSON value of [rcvyLocLon].
             *
             * Unlike [rcvyLocLon], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rcvyLocLon")
            @ExcludeMissing
            fun _rcvyLocLon(): JsonField<List<Double>> = rcvyLocLon

            /**
             * Returns the raw JSON value of [rcvyLocName].
             *
             * Unlike [rcvyLocName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rcvyLocName")
            @ExcludeMissing
            fun _rcvyLocName(): JsonField<List<String>> = rcvyLocName

            /**
             * Returns the raw JSON value of [rcvyLocUtm].
             *
             * Unlike [rcvyLocUtm], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rcvyLocUTM")
            @ExcludeMissing
            fun _rcvyLocUtm(): JsonField<List<String>> = rcvyLocUtm

            /**
             * Returns the raw JSON value of [rcvyTime].
             *
             * Unlike [rcvyTime], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rcvyTime")
            @ExcludeMissing
            fun _rcvyTime(): JsonField<List<OffsetDateTime>> = rcvyTime

            /**
             * Returns the raw JSON value of [resMsnInd].
             *
             * Unlike [resMsnInd], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("resMsnInd")
            @ExcludeMissing
            fun _resMsnInd(): JsonField<String> = resMsnInd

            /**
             * Returns the raw JSON value of [secMsnType].
             *
             * Unlike [secMsnType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("secMsnType")
            @ExcludeMissing
            fun _secMsnType(): JsonField<String> = secMsnType

            /**
             * Returns the raw JSON value of [unitLocName].
             *
             * Unlike [unitLocName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("unitLocName")
            @ExcludeMissing
            fun _unitLocName(): JsonField<String> = unitLocName

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
                 * Returns a mutable builder for constructing an instance of [AcMsnTasking].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .countryCode()
                 * .taskedService()
                 * .unitDesignator()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [AcMsnTasking]. */
            class Builder internal constructor() {

                private var countryCode: JsonField<String>? = null
                private var taskedService: JsonField<String>? = null
                private var unitDesignator: JsonField<String>? = null
                private var acMsnLocSeg: JsonField<MutableList<AcMsnLocSeg>>? = null
                private var alertStatus: JsonField<Int> = JsonMissing.of()
                private var amcMsnNum: JsonField<String> = JsonMissing.of()
                private var depLocLat: JsonField<Double> = JsonMissing.of()
                private var depLocLon: JsonField<Double> = JsonMissing.of()
                private var depLocName: JsonField<String> = JsonMissing.of()
                private var depLocUtm: JsonField<String> = JsonMissing.of()
                private var depTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var indAcTasking: JsonField<MutableList<IndAcTasking>>? = null
                private var msnCommander: JsonField<String> = JsonMissing.of()
                private var msnNum: JsonField<String> = JsonMissing.of()
                private var pkgId: JsonField<String> = JsonMissing.of()
                private var priMsnType: JsonField<String> = JsonMissing.of()
                private var rcvyLocLat: JsonField<MutableList<Double>>? = null
                private var rcvyLocLon: JsonField<MutableList<Double>>? = null
                private var rcvyLocName: JsonField<MutableList<String>>? = null
                private var rcvyLocUtm: JsonField<MutableList<String>>? = null
                private var rcvyTime: JsonField<MutableList<OffsetDateTime>>? = null
                private var resMsnInd: JsonField<String> = JsonMissing.of()
                private var secMsnType: JsonField<String> = JsonMissing.of()
                private var unitLocName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(acMsnTasking: AcMsnTasking) =
                    apply {
                        countryCode = acMsnTasking.countryCode
                        taskedService = acMsnTasking.taskedService
                        unitDesignator = acMsnTasking.unitDesignator
                        acMsnLocSeg = acMsnTasking.acMsnLocSeg.map { it.toMutableList() }
                        alertStatus = acMsnTasking.alertStatus
                        amcMsnNum = acMsnTasking.amcMsnNum
                        depLocLat = acMsnTasking.depLocLat
                        depLocLon = acMsnTasking.depLocLon
                        depLocName = acMsnTasking.depLocName
                        depLocUtm = acMsnTasking.depLocUtm
                        depTime = acMsnTasking.depTime
                        indAcTasking = acMsnTasking.indAcTasking.map { it.toMutableList() }
                        msnCommander = acMsnTasking.msnCommander
                        msnNum = acMsnTasking.msnNum
                        pkgId = acMsnTasking.pkgId
                        priMsnType = acMsnTasking.priMsnType
                        rcvyLocLat = acMsnTasking.rcvyLocLat.map { it.toMutableList() }
                        rcvyLocLon = acMsnTasking.rcvyLocLon.map { it.toMutableList() }
                        rcvyLocName = acMsnTasking.rcvyLocName.map { it.toMutableList() }
                        rcvyLocUtm = acMsnTasking.rcvyLocUtm.map { it.toMutableList() }
                        rcvyTime = acMsnTasking.rcvyTime.map { it.toMutableList() }
                        resMsnInd = acMsnTasking.resMsnInd
                        secMsnType = acMsnTasking.secMsnType
                        unitLocName = acMsnTasking.unitLocName
                        additionalProperties = acMsnTasking.additionalProperties.toMutableMap()
                    }

                /** The country code responsible for conducting this aircraft mission tasking for the exercise or operation. */
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

                /** The service tasked with conducting this aircraft mission tasking for the exercise or operation. */
                fun taskedService(taskedService: String) = taskedService(JsonField.of(taskedService))

                /**
                 * Sets [Builder.taskedService] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskedService] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taskedService(taskedService: JsonField<String>) =
                    apply {
                        this.taskedService = taskedService
                    }

                /** The designator of the unit that is tasked to perform this aircraft mission tasking. */
                fun unitDesignator(unitDesignator: String) = unitDesignator(JsonField.of(unitDesignator))

                /**
                 * Sets [Builder.unitDesignator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitDesignator] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unitDesignator(unitDesignator: JsonField<String>) =
                    apply {
                        this.unitDesignator = unitDesignator
                    }

                /** A collection of aircraft mission location information for this aircraft mission tasking. */
                fun acMsnLocSeg(acMsnLocSeg: List<AcMsnLocSeg>) = acMsnLocSeg(JsonField.of(acMsnLocSeg))

                /**
                 * Sets [Builder.acMsnLocSeg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acMsnLocSeg] with a well-typed `List<AcMsnLocSeg>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun acMsnLocSeg(acMsnLocSeg: JsonField<List<AcMsnLocSeg>>) =
                    apply {
                        this.acMsnLocSeg = acMsnLocSeg.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [AcMsnLocSeg] to [Builder.acMsnLocSeg].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAcMsnLocSeg(acMsnLocSeg: AcMsnLocSeg) =
                    apply {
                        this.acMsnLocSeg = (this.acMsnLocSeg ?: JsonField.of(mutableListOf())).also {
                            checkKnown("acMsnLocSeg", it).add(acMsnLocSeg)
                        }
                    }

                /** The readiness status expressed in time (minutes) for an aircraft to be airborne after the launch order is received or the time required for a missile unit to assume battle stations. */
                fun alertStatus(alertStatus: Int) = alertStatus(JsonField.of(alertStatus))

                /**
                 * Sets [Builder.alertStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.alertStatus] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun alertStatus(alertStatus: JsonField<Int>) =
                    apply {
                        this.alertStatus = alertStatus
                    }

                /** The AMC number assigned to identify one aircraft from another. */
                fun amcMsnNum(amcMsnNum: String) = amcMsnNum(JsonField.of(amcMsnNum))

                /**
                 * Sets [Builder.amcMsnNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amcMsnNum] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amcMsnNum(amcMsnNum: JsonField<String>) =
                    apply {
                        this.amcMsnNum = amcMsnNum
                    }

                /** WGS-84 latitude of the departure location, in degrees. -90 to 90 degrees (negative values south of equator) for this tasked air mission. */
                fun depLocLat(depLocLat: Double) = depLocLat(JsonField.of(depLocLat))

                /**
                 * Sets [Builder.depLocLat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.depLocLat] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun depLocLat(depLocLat: JsonField<Double>) =
                    apply {
                        this.depLocLat = depLocLat
                    }

                /** WGS-84 longitude of the departure location, in degrees. -180 to 180 degrees (negative values west of Prime Meridian) for this tasked air mission. */
                fun depLocLon(depLocLon: Double) = depLocLon(JsonField.of(depLocLon))

                /**
                 * Sets [Builder.depLocLon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.depLocLon] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun depLocLon(depLocLon: JsonField<Double>) =
                    apply {
                        this.depLocLon = depLocLon
                    }

                /** The location or name specified for the departure of the tasked air mission. */
                fun depLocName(depLocName: String) = depLocName(JsonField.of(depLocName))

                /**
                 * Sets [Builder.depLocName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.depLocName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun depLocName(depLocName: JsonField<String>) =
                    apply {
                        this.depLocName = depLocName
                    }

                /** The departure location specified in UTM (100 meter) coordinates for the tasked air mission. */
                fun depLocUtm(depLocUtm: String) = depLocUtm(JsonField.of(depLocUtm))

                /**
                 * Sets [Builder.depLocUtm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.depLocUtm] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun depLocUtm(depLocUtm: JsonField<String>) =
                    apply {
                        this.depLocUtm = depLocUtm
                    }

                /** The time of departure for the tasked air mission in ISO8601 UTC format with millisecond precision. */
                fun depTime(depTime: OffsetDateTime) = depTime(JsonField.of(depTime))

                /**
                 * Sets [Builder.depTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.depTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun depTime(depTime: JsonField<OffsetDateTime>) =
                    apply {
                        this.depTime = depTime
                    }

                /** A collection of the individual aircraft assigned to this aircraft mission tasking. */
                fun indAcTasking(indAcTasking: List<IndAcTasking>) = indAcTasking(JsonField.of(indAcTasking))

                /**
                 * Sets [Builder.indAcTasking] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.indAcTasking] with a well-typed `List<IndAcTasking>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun indAcTasking(indAcTasking: JsonField<List<IndAcTasking>>) =
                    apply {
                        this.indAcTasking = indAcTasking.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [IndAcTasking] to [Builder.indAcTasking].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addIndAcTasking(indAcTasking: IndAcTasking) =
                    apply {
                        this.indAcTasking = (this.indAcTasking ?: JsonField.of(mutableListOf())).also {
                            checkKnown("indAcTasking", it).add(indAcTasking)
                        }
                    }

                /** The commander responsible for the planning and execution of the forces necessary to achieve desired objectives. */
                fun msnCommander(msnCommander: String) = msnCommander(JsonField.of(msnCommander))

                /**
                 * Sets [Builder.msnCommander] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.msnCommander] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun msnCommander(msnCommander: JsonField<String>) =
                    apply {
                        this.msnCommander = msnCommander
                    }

                /** The mission number assigned to this mission. */
                fun msnNum(msnNum: String) = msnNum(JsonField.of(msnNum))

                /**
                 * Sets [Builder.msnNum] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.msnNum] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun msnNum(msnNum: JsonField<String>) =
                    apply {
                        this.msnNum = msnNum
                    }

                /** The identifier for the composite set of missions for this operation/exercise. */
                fun pkgId(pkgId: String) = pkgId(JsonField.of(pkgId))

                /**
                 * Sets [Builder.pkgId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pkgId] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun pkgId(pkgId: JsonField<String>) =
                    apply {
                        this.pkgId = pkgId
                    }

                /** The code for the preferred type or designator for a tasked air mission. */
                fun priMsnType(priMsnType: String) = priMsnType(JsonField.of(priMsnType))

                /**
                 * Sets [Builder.priMsnType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priMsnType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun priMsnType(priMsnType: JsonField<String>) =
                    apply {
                        this.priMsnType = priMsnType
                    }

                /** An array of WGS-84 latitude of the recovery locations, in degrees. -90 to 90 degrees (negative values south of equator) for this tasked air mission. */
                fun rcvyLocLat(rcvyLocLat: List<Double>) = rcvyLocLat(JsonField.of(rcvyLocLat))

                /**
                 * Sets [Builder.rcvyLocLat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcvyLocLat] with a well-typed `List<Double>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rcvyLocLat(rcvyLocLat: JsonField<List<Double>>) =
                    apply {
                        this.rcvyLocLat = rcvyLocLat.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [Double] to [Builder.rcvyLocLat].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcvyLocLat(rcvyLocLat: Double) =
                    apply {
                        this.rcvyLocLat = (this.rcvyLocLat ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcvyLocLat", it).add(rcvyLocLat)
                        }
                    }

                /** An array of WGS-84 longitude of the recovery locations, in degrees. -180 to 180 degrees (negative values west of Prime Meridian) for this tasked air mission. */
                fun rcvyLocLon(rcvyLocLon: List<Double>) = rcvyLocLon(JsonField.of(rcvyLocLon))

                /**
                 * Sets [Builder.rcvyLocLon] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcvyLocLon] with a well-typed `List<Double>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rcvyLocLon(rcvyLocLon: JsonField<List<Double>>) =
                    apply {
                        this.rcvyLocLon = rcvyLocLon.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [Double] to [Builder.rcvyLocLon].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcvyLocLon(rcvyLocLon: Double) =
                    apply {
                        this.rcvyLocLon = (this.rcvyLocLon ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcvyLocLon", it).add(rcvyLocLon)
                        }
                    }

                /** An array of locations specified for the recovery of the tasked air mission represented by varying formats. */
                fun rcvyLocName(rcvyLocName: List<String>) = rcvyLocName(JsonField.of(rcvyLocName))

                /**
                 * Sets [Builder.rcvyLocName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcvyLocName] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rcvyLocName(rcvyLocName: JsonField<List<String>>) =
                    apply {
                        this.rcvyLocName = rcvyLocName.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [Builder.rcvyLocName].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcvyLocName(rcvyLocName: String) =
                    apply {
                        this.rcvyLocName = (this.rcvyLocName ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcvyLocName", it).add(rcvyLocName)
                        }
                    }

                /** An array of recovery locations specified in UTM (100 meter) coordinates for the tasked air mission. */
                fun rcvyLocUtm(rcvyLocUtm: List<String>) = rcvyLocUtm(JsonField.of(rcvyLocUtm))

                /**
                 * Sets [Builder.rcvyLocUtm] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcvyLocUtm] with a well-typed `List<String>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rcvyLocUtm(rcvyLocUtm: JsonField<List<String>>) =
                    apply {
                        this.rcvyLocUtm = rcvyLocUtm.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [String] to [Builder.rcvyLocUtm].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcvyLocUtm(rcvyLocUtm: String) =
                    apply {
                        this.rcvyLocUtm = (this.rcvyLocUtm ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcvyLocUtm", it).add(rcvyLocUtm)
                        }
                    }

                /** An array of recovery times for the tasked air mission in ISO8601 UTC format with millisecond precision. */
                fun rcvyTime(rcvyTime: List<OffsetDateTime>) = rcvyTime(JsonField.of(rcvyTime))

                /**
                 * Sets [Builder.rcvyTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rcvyTime] with a well-typed `List<OffsetDateTime>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun rcvyTime(rcvyTime: JsonField<List<OffsetDateTime>>) =
                    apply {
                        this.rcvyTime = rcvyTime.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [OffsetDateTime] to [Builder.rcvyTime].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRcvyTime(rcvyTime: OffsetDateTime) =
                    apply {
                        this.rcvyTime = (this.rcvyTime ?: JsonField.of(mutableListOf())).also {
                            checkKnown("rcvyTime", it).add(rcvyTime)
                        }
                    }

                /** An indicator of whether a mission is or will be a residual mission. */
                fun resMsnInd(resMsnInd: String) = resMsnInd(JsonField.of(resMsnInd))

                /**
                 * Sets [Builder.resMsnInd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resMsnInd] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun resMsnInd(resMsnInd: JsonField<String>) =
                    apply {
                        this.resMsnInd = resMsnInd
                    }

                /** The code for the alternative type of a tasked air mission. */
                fun secMsnType(secMsnType: String) = secMsnType(JsonField.of(secMsnType))

                /**
                 * Sets [Builder.secMsnType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secMsnType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun secMsnType(secMsnType: JsonField<String>) =
                    apply {
                        this.secMsnType = secMsnType
                    }

                /** The tasked units location expressed as an ICAO or a place name. */
                fun unitLocName(unitLocName: String) = unitLocName(JsonField.of(unitLocName))

                /**
                 * Sets [Builder.unitLocName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unitLocName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun unitLocName(unitLocName: JsonField<String>) =
                    apply {
                        this.unitLocName = unitLocName
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
                 * Returns an immutable instance of [AcMsnTasking].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .countryCode()
                 * .taskedService()
                 * .unitDesignator()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AcMsnTasking =
                    AcMsnTasking(
                      checkRequired(
                        "countryCode", countryCode
                      ),
                      checkRequired(
                        "taskedService", taskedService
                      ),
                      checkRequired(
                        "unitDesignator", unitDesignator
                      ),
                      (acMsnLocSeg ?: JsonMissing.of()).map { it.toImmutable() },
                      alertStatus,
                      amcMsnNum,
                      depLocLat,
                      depLocLon,
                      depLocName,
                      depLocUtm,
                      depTime,
                      (indAcTasking ?: JsonMissing.of()).map { it.toImmutable() },
                      msnCommander,
                      msnNum,
                      pkgId,
                      priMsnType,
                      (rcvyLocLat ?: JsonMissing.of()).map { it.toImmutable() },
                      (rcvyLocLon ?: JsonMissing.of()).map { it.toImmutable() },
                      (rcvyLocName ?: JsonMissing.of()).map { it.toImmutable() },
                      (rcvyLocUtm ?: JsonMissing.of()).map { it.toImmutable() },
                      (rcvyTime ?: JsonMissing.of()).map { it.toImmutable() },
                      resMsnInd,
                      secMsnType,
                      unitLocName,
                      additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AcMsnTasking =
                apply {
                    if (validated) {
                      return@apply
                    }

                    countryCode()
                    taskedService()
                    unitDesignator()
                    acMsnLocSeg().ifPresent { it.forEach { it.validate() } }
                    alertStatus()
                    amcMsnNum()
                    depLocLat()
                    depLocLon()
                    depLocName()
                    depLocUtm()
                    depTime()
                    indAcTasking().ifPresent { it.forEach { it.validate() } }
                    msnCommander()
                    msnNum()
                    pkgId()
                    priMsnType()
                    rcvyLocLat()
                    rcvyLocLon()
                    rcvyLocName()
                    rcvyLocUtm()
                    rcvyTime()
                    resMsnInd()
                    secMsnType()
                    unitLocName()
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
            internal fun validity(): Int = (if (countryCode.asKnown().isPresent) 1 else 0) + (if (taskedService.asKnown().isPresent) 1 else 0) + (if (unitDesignator.asKnown().isPresent) 1 else 0) + (acMsnLocSeg.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (alertStatus.asKnown().isPresent) 1 else 0) + (if (amcMsnNum.asKnown().isPresent) 1 else 0) + (if (depLocLat.asKnown().isPresent) 1 else 0) + (if (depLocLon.asKnown().isPresent) 1 else 0) + (if (depLocName.asKnown().isPresent) 1 else 0) + (if (depLocUtm.asKnown().isPresent) 1 else 0) + (if (depTime.asKnown().isPresent) 1 else 0) + (indAcTasking.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) + (if (msnCommander.asKnown().isPresent) 1 else 0) + (if (msnNum.asKnown().isPresent) 1 else 0) + (if (pkgId.asKnown().isPresent) 1 else 0) + (if (priMsnType.asKnown().isPresent) 1 else 0) + (rcvyLocLat.asKnown().getOrNull()?.size ?: 0) + (rcvyLocLon.asKnown().getOrNull()?.size ?: 0) + (rcvyLocName.asKnown().getOrNull()?.size ?: 0) + (rcvyLocUtm.asKnown().getOrNull()?.size ?: 0) + (rcvyTime.asKnown().getOrNull()?.size ?: 0) + (if (resMsnInd.asKnown().isPresent) 1 else 0) + (if (secMsnType.asKnown().isPresent) 1 else 0) + (if (unitLocName.asKnown().isPresent) 1 else 0)

            /** Collection of aircraft mission location information for this aircraft mission tasking. */
            class AcMsnLocSeg private constructor(
                private val startTime: JsonField<OffsetDateTime>,
                private val airMsnPri: JsonField<String>,
                private val alt: JsonField<Int>,
                private val areaGeoRad: JsonField<Int>,
                private val endTime: JsonField<OffsetDateTime>,
                private val msnLocName: JsonField<String>,
                private val msnLocPtBarT: JsonField<String>,
                private val msnLocPtLat: JsonField<Double>,
                private val msnLocPtLon: JsonField<Double>,
                private val msnLocPtName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,

            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("startTime") @ExcludeMissing startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("airMsnPri") @ExcludeMissing airMsnPri: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("alt") @ExcludeMissing alt: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("areaGeoRad") @ExcludeMissing areaGeoRad: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("endTime") @ExcludeMissing endTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("msnLocName") @ExcludeMissing msnLocName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("msnLocPtBarT") @ExcludeMissing msnLocPtBarT: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("msnLocPtLat") @ExcludeMissing msnLocPtLat: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("msnLocPtLon") @ExcludeMissing msnLocPtLon: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("msnLocPtName") @ExcludeMissing msnLocPtName: JsonField<String> = JsonMissing.of()
                ) : this(
                  startTime,
                  airMsnPri,
                  alt,
                  areaGeoRad,
                  endTime,
                  msnLocName,
                  msnLocPtBarT,
                  msnLocPtLat,
                  msnLocPtLon,
                  msnLocPtName,
                  mutableMapOf(),
                )

                /**
                 * The start time of this mission in ISO 8601 UTC format with millisecond precision.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
                 */
                fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

                /**
                 * The code for the priority assigned to this mission.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun airMsnPri(): Optional<String> = airMsnPri.getOptional("airMsnPri")

                /**
                 * The altitude for this mission represented as hundreds of feet above MSL.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun alt(): Optional<Int> = alt.getOptional("alt")

                /**
                 * The radius of the circle around the location being reported in feet.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun areaGeoRad(): Optional<Int> = areaGeoRad.getOptional("areaGeoRad")

                /**
                 * The end time of this mission in ISO 8601 UTC format with millisecond precision.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun endTime(): Optional<OffsetDateTime> = endTime.getOptional("endTime")

                /**
                 * The name that identifies the location at which this mission is to be performed. This can be the name of a general target area, orbit, cap point, station, etc.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun msnLocName(): Optional<String> = msnLocName.getOptional("msnLocName")

                /**
                 * The alpha-numeric specified location for this mission specified as a bearing angle in degrees relative to true north and a range in nautical miles (NM).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun msnLocPtBarT(): Optional<String> = msnLocPtBarT.getOptional("msnLocPtBarT")

                /**
                 * WGS-84 latitude of the mission location, in degrees. -90 to 90 degrees (negative values south of equator) for this tasked air mission.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun msnLocPtLat(): Optional<Double> = msnLocPtLat.getOptional("msnLocPtLat")

                /**
                 * WGS-84 longitude of the mission location, in degrees. -180 to 180 degrees (negative values west of Prime Meridian) for this tasked air mission.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun msnLocPtLon(): Optional<Double> = msnLocPtLon.getOptional("msnLocPtLon")

                /**
                 * The location name for this mission.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun msnLocPtName(): Optional<String> = msnLocPtName.getOptional("msnLocPtName")

                /**
                 * Returns the raw JSON value of [startTime].
                 *
                 * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("startTime")
                @ExcludeMissing
                fun _startTime(): JsonField<OffsetDateTime> = startTime

                /**
                 * Returns the raw JSON value of [airMsnPri].
                 *
                 * Unlike [airMsnPri], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("airMsnPri")
                @ExcludeMissing
                fun _airMsnPri(): JsonField<String> = airMsnPri

                /**
                 * Returns the raw JSON value of [alt].
                 *
                 * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("alt")
                @ExcludeMissing
                fun _alt(): JsonField<Int> = alt

                /**
                 * Returns the raw JSON value of [areaGeoRad].
                 *
                 * Unlike [areaGeoRad], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("areaGeoRad")
                @ExcludeMissing
                fun _areaGeoRad(): JsonField<Int> = areaGeoRad

                /**
                 * Returns the raw JSON value of [endTime].
                 *
                 * Unlike [endTime], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("endTime")
                @ExcludeMissing
                fun _endTime(): JsonField<OffsetDateTime> = endTime

                /**
                 * Returns the raw JSON value of [msnLocName].
                 *
                 * Unlike [msnLocName], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("msnLocName")
                @ExcludeMissing
                fun _msnLocName(): JsonField<String> = msnLocName

                /**
                 * Returns the raw JSON value of [msnLocPtBarT].
                 *
                 * Unlike [msnLocPtBarT], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("msnLocPtBarT")
                @ExcludeMissing
                fun _msnLocPtBarT(): JsonField<String> = msnLocPtBarT

                /**
                 * Returns the raw JSON value of [msnLocPtLat].
                 *
                 * Unlike [msnLocPtLat], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("msnLocPtLat")
                @ExcludeMissing
                fun _msnLocPtLat(): JsonField<Double> = msnLocPtLat

                /**
                 * Returns the raw JSON value of [msnLocPtLon].
                 *
                 * Unlike [msnLocPtLon], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("msnLocPtLon")
                @ExcludeMissing
                fun _msnLocPtLon(): JsonField<Double> = msnLocPtLon

                /**
                 * Returns the raw JSON value of [msnLocPtName].
                 *
                 * Unlike [msnLocPtName], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("msnLocPtName")
                @ExcludeMissing
                fun _msnLocPtName(): JsonField<String> = msnLocPtName

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
                     * Returns a mutable builder for constructing an instance of [AcMsnLocSeg].
                     *
                     * The following fields are required:
                     *
                     * ```java
                     * .startTime()
                     * ```
                     */
                    @JvmStatic
                    fun builder() = Builder()
                }

                /** A builder for [AcMsnLocSeg]. */
                class Builder internal constructor() {

                    private var startTime: JsonField<OffsetDateTime>? = null
                    private var airMsnPri: JsonField<String> = JsonMissing.of()
                    private var alt: JsonField<Int> = JsonMissing.of()
                    private var areaGeoRad: JsonField<Int> = JsonMissing.of()
                    private var endTime: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var msnLocName: JsonField<String> = JsonMissing.of()
                    private var msnLocPtBarT: JsonField<String> = JsonMissing.of()
                    private var msnLocPtLat: JsonField<Double> = JsonMissing.of()
                    private var msnLocPtLon: JsonField<Double> = JsonMissing.of()
                    private var msnLocPtName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(acMsnLocSeg: AcMsnLocSeg) =
                        apply {
                            startTime = acMsnLocSeg.startTime
                            airMsnPri = acMsnLocSeg.airMsnPri
                            alt = acMsnLocSeg.alt
                            areaGeoRad = acMsnLocSeg.areaGeoRad
                            endTime = acMsnLocSeg.endTime
                            msnLocName = acMsnLocSeg.msnLocName
                            msnLocPtBarT = acMsnLocSeg.msnLocPtBarT
                            msnLocPtLat = acMsnLocSeg.msnLocPtLat
                            msnLocPtLon = acMsnLocSeg.msnLocPtLon
                            msnLocPtName = acMsnLocSeg.msnLocPtName
                            additionalProperties = acMsnLocSeg.additionalProperties.toMutableMap()
                        }

                    /** The start time of this mission in ISO 8601 UTC format with millisecond precision. */
                    fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

                    /**
                     * Sets [Builder.startTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun startTime(startTime: JsonField<OffsetDateTime>) =
                        apply {
                            this.startTime = startTime
                        }

                    /** The code for the priority assigned to this mission. */
                    fun airMsnPri(airMsnPri: String) = airMsnPri(JsonField.of(airMsnPri))

                    /**
                     * Sets [Builder.airMsnPri] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.airMsnPri] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun airMsnPri(airMsnPri: JsonField<String>) =
                        apply {
                            this.airMsnPri = airMsnPri
                        }

                    /** The altitude for this mission represented as hundreds of feet above MSL. */
                    fun alt(alt: Int) = alt(JsonField.of(alt))

                    /**
                     * Sets [Builder.alt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.alt] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun alt(alt: JsonField<Int>) =
                        apply {
                            this.alt = alt
                        }

                    /** The radius of the circle around the location being reported in feet. */
                    fun areaGeoRad(areaGeoRad: Int) = areaGeoRad(JsonField.of(areaGeoRad))

                    /**
                     * Sets [Builder.areaGeoRad] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.areaGeoRad] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun areaGeoRad(areaGeoRad: JsonField<Int>) =
                        apply {
                            this.areaGeoRad = areaGeoRad
                        }

                    /** The end time of this mission in ISO 8601 UTC format with millisecond precision. */
                    fun endTime(endTime: OffsetDateTime) = endTime(JsonField.of(endTime))

                    /**
                     * Sets [Builder.endTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endTime] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun endTime(endTime: JsonField<OffsetDateTime>) =
                        apply {
                            this.endTime = endTime
                        }

                    /** The name that identifies the location at which this mission is to be performed. This can be the name of a general target area, orbit, cap point, station, etc. */
                    fun msnLocName(msnLocName: String) = msnLocName(JsonField.of(msnLocName))

                    /**
                     * Sets [Builder.msnLocName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.msnLocName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun msnLocName(msnLocName: JsonField<String>) =
                        apply {
                            this.msnLocName = msnLocName
                        }

                    /** The alpha-numeric specified location for this mission specified as a bearing angle in degrees relative to true north and a range in nautical miles (NM). */
                    fun msnLocPtBarT(msnLocPtBarT: String) = msnLocPtBarT(JsonField.of(msnLocPtBarT))

                    /**
                     * Sets [Builder.msnLocPtBarT] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.msnLocPtBarT] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun msnLocPtBarT(msnLocPtBarT: JsonField<String>) =
                        apply {
                            this.msnLocPtBarT = msnLocPtBarT
                        }

                    /** WGS-84 latitude of the mission location, in degrees. -90 to 90 degrees (negative values south of equator) for this tasked air mission. */
                    fun msnLocPtLat(msnLocPtLat: Double) = msnLocPtLat(JsonField.of(msnLocPtLat))

                    /**
                     * Sets [Builder.msnLocPtLat] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.msnLocPtLat] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun msnLocPtLat(msnLocPtLat: JsonField<Double>) =
                        apply {
                            this.msnLocPtLat = msnLocPtLat
                        }

                    /** WGS-84 longitude of the mission location, in degrees. -180 to 180 degrees (negative values west of Prime Meridian) for this tasked air mission. */
                    fun msnLocPtLon(msnLocPtLon: Double) = msnLocPtLon(JsonField.of(msnLocPtLon))

                    /**
                     * Sets [Builder.msnLocPtLon] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.msnLocPtLon] with a well-typed [Double] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun msnLocPtLon(msnLocPtLon: JsonField<Double>) =
                        apply {
                            this.msnLocPtLon = msnLocPtLon
                        }

                    /** The location name for this mission. */
                    fun msnLocPtName(msnLocPtName: String) = msnLocPtName(JsonField.of(msnLocPtName))

                    /**
                     * Sets [Builder.msnLocPtName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.msnLocPtName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun msnLocPtName(msnLocPtName: JsonField<String>) =
                        apply {
                            this.msnLocPtName = msnLocPtName
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
                     * Returns an immutable instance of [AcMsnLocSeg].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     *
                     * ```java
                     * .startTime()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): AcMsnLocSeg =
                        AcMsnLocSeg(
                          checkRequired(
                            "startTime", startTime
                          ),
                          airMsnPri,
                          alt,
                          areaGeoRad,
                          endTime,
                          msnLocName,
                          msnLocPtBarT,
                          msnLocPtLat,
                          msnLocPtLon,
                          msnLocPtName,
                          additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AcMsnLocSeg =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        startTime()
                        airMsnPri()
                        alt()
                        areaGeoRad()
                        endTime()
                        msnLocName()
                        msnLocPtBarT()
                        msnLocPtLat()
                        msnLocPtLon()
                        msnLocPtName()
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
                internal fun validity(): Int = (if (startTime.asKnown().isPresent) 1 else 0) + (if (airMsnPri.asKnown().isPresent) 1 else 0) + (if (alt.asKnown().isPresent) 1 else 0) + (if (areaGeoRad.asKnown().isPresent) 1 else 0) + (if (endTime.asKnown().isPresent) 1 else 0) + (if (msnLocName.asKnown().isPresent) 1 else 0) + (if (msnLocPtBarT.asKnown().isPresent) 1 else 0) + (if (msnLocPtLat.asKnown().isPresent) 1 else 0) + (if (msnLocPtLon.asKnown().isPresent) 1 else 0) + (if (msnLocPtName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return /* spotless:off */ other is AcMsnLocSeg && startTime == other.startTime && airMsnPri == other.airMsnPri && alt == other.alt && areaGeoRad == other.areaGeoRad && endTime == other.endTime && msnLocName == other.msnLocName && msnLocPtBarT == other.msnLocPtBarT && msnLocPtLat == other.msnLocPtLat && msnLocPtLon == other.msnLocPtLon && msnLocPtName == other.msnLocPtName && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(startTime, airMsnPri, alt, areaGeoRad, endTime, msnLocName, msnLocPtBarT, msnLocPtLat, msnLocPtLon, msnLocPtName, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "AcMsnLocSeg{startTime=$startTime, airMsnPri=$airMsnPri, alt=$alt, areaGeoRad=$areaGeoRad, endTime=$endTime, msnLocName=$msnLocName, msnLocPtBarT=$msnLocPtBarT, msnLocPtLat=$msnLocPtLat, msnLocPtLon=$msnLocPtLon, msnLocPtName=$msnLocPtName, additionalProperties=$additionalProperties}"
            }

            /** Collection that specifies the naval flight operations for this ATO. */
            class IndAcTasking private constructor(
                private val acftType: JsonField<String>,
                private val callSign: JsonField<String>,
                private val iffSifMode1Code: JsonField<String>,
                private val iffSifMode2Code: JsonField<String>,
                private val iffSifMode3Code: JsonField<String>,
                private val juAddress: JsonField<List<Int>>,
                private val link16CallSign: JsonField<String>,
                private val numAcft: JsonField<Int>,
                private val priConfigCode: JsonField<String>,
                private val secConfigCode: JsonField<String>,
                private val tacanChan: JsonField<Int>,
                private val additionalProperties: MutableMap<String, JsonValue>,

            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("acftType") @ExcludeMissing acftType: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("callSign") @ExcludeMissing callSign: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("iffSifMode1Code") @ExcludeMissing iffSifMode1Code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("iffSifMode2Code") @ExcludeMissing iffSifMode2Code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("iffSifMode3Code") @ExcludeMissing iffSifMode3Code: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("juAddress") @ExcludeMissing juAddress: JsonField<List<Int>> = JsonMissing.of(),
                    @JsonProperty("link16CallSign") @ExcludeMissing link16CallSign: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("numAcft") @ExcludeMissing numAcft: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("priConfigCode") @ExcludeMissing priConfigCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("secConfigCode") @ExcludeMissing secConfigCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("tacanChan") @ExcludeMissing tacanChan: JsonField<Int> = JsonMissing.of()
                ) : this(
                  acftType,
                  callSign,
                  iffSifMode1Code,
                  iffSifMode2Code,
                  iffSifMode3Code,
                  juAddress,
                  link16CallSign,
                  numAcft,
                  priConfigCode,
                  secConfigCode,
                  tacanChan,
                  mutableMapOf(),
                )

                /**
                 * The type and model number for the aircraft. The field may specify a value of an aircraft not yet assigned an aircraft code contained in the aircraft codes list.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
                 */
                fun acftType(): String = acftType.getRequired("acftType")

                /**
                 * The call sign assigned to this mission aircraft.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun callSign(): Optional<String> = callSign.getOptional("callSign")

                /**
                 * The mode 1 and code of the Identification Friend or FOE (IFF) or Selective Identification Feature (SIF).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun iffSifMode1Code(): Optional<String> = iffSifMode1Code.getOptional("iffSifMode1Code")

                /**
                 * The mode 2 and code of the Identification Friend or FOE (IFF) or Selective Identification Feature (SIF).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun iffSifMode2Code(): Optional<String> = iffSifMode2Code.getOptional("iffSifMode2Code")

                /**
                 * The mode 3 and code of the Identification Friend or FOE (IFF) or Selective Identification Feature (SIF).
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun iffSifMode3Code(): Optional<String> = iffSifMode3Code.getOptional("iffSifMode3Code")

                /**
                 * An optional array of link 16 octal track numbers assigned as the primary JTIDS Unit (JU) address for the mission aircraft.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun juAddress(): Optional<List<Int>> = juAddress.getOptional("juAddress")

                /**
                 * The Link 16 abbreviated call sign assigned to the ACA. This is normally the first and last letter and the last two numbers of the call sign.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun link16CallSign(): Optional<String> = link16CallSign.getOptional("link16CallSign")

                /**
                 * The number of aircraft participating in this mission.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun numAcft(): Optional<Int> = numAcft.getOptional("numAcft")

                /**
                 * The code that indicates the ordinance mix carried on this mission aircraft.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun priConfigCode(): Optional<String> = priConfigCode.getOptional("priConfigCode")

                /**
                 * The code for the secondary ordinance mix carried on this mission aircraft.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun secConfigCode(): Optional<String> = secConfigCode.getOptional("secConfigCode")

                /**
                 * The TACAN channel assigned to this mission aircraft.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun tacanChan(): Optional<Int> = tacanChan.getOptional("tacanChan")

                /**
                 * Returns the raw JSON value of [acftType].
                 *
                 * Unlike [acftType], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("acftType")
                @ExcludeMissing
                fun _acftType(): JsonField<String> = acftType

                /**
                 * Returns the raw JSON value of [callSign].
                 *
                 * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("callSign")
                @ExcludeMissing
                fun _callSign(): JsonField<String> = callSign

                /**
                 * Returns the raw JSON value of [iffSifMode1Code].
                 *
                 * Unlike [iffSifMode1Code], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("iffSifMode1Code")
                @ExcludeMissing
                fun _iffSifMode1Code(): JsonField<String> = iffSifMode1Code

                /**
                 * Returns the raw JSON value of [iffSifMode2Code].
                 *
                 * Unlike [iffSifMode2Code], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("iffSifMode2Code")
                @ExcludeMissing
                fun _iffSifMode2Code(): JsonField<String> = iffSifMode2Code

                /**
                 * Returns the raw JSON value of [iffSifMode3Code].
                 *
                 * Unlike [iffSifMode3Code], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("iffSifMode3Code")
                @ExcludeMissing
                fun _iffSifMode3Code(): JsonField<String> = iffSifMode3Code

                /**
                 * Returns the raw JSON value of [juAddress].
                 *
                 * Unlike [juAddress], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("juAddress")
                @ExcludeMissing
                fun _juAddress(): JsonField<List<Int>> = juAddress

                /**
                 * Returns the raw JSON value of [link16CallSign].
                 *
                 * Unlike [link16CallSign], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("link16CallSign")
                @ExcludeMissing
                fun _link16CallSign(): JsonField<String> = link16CallSign

                /**
                 * Returns the raw JSON value of [numAcft].
                 *
                 * Unlike [numAcft], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("numAcft")
                @ExcludeMissing
                fun _numAcft(): JsonField<Int> = numAcft

                /**
                 * Returns the raw JSON value of [priConfigCode].
                 *
                 * Unlike [priConfigCode], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("priConfigCode")
                @ExcludeMissing
                fun _priConfigCode(): JsonField<String> = priConfigCode

                /**
                 * Returns the raw JSON value of [secConfigCode].
                 *
                 * Unlike [secConfigCode], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("secConfigCode")
                @ExcludeMissing
                fun _secConfigCode(): JsonField<String> = secConfigCode

                /**
                 * Returns the raw JSON value of [tacanChan].
                 *
                 * Unlike [tacanChan], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("tacanChan")
                @ExcludeMissing
                fun _tacanChan(): JsonField<Int> = tacanChan

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
                     * Returns a mutable builder for constructing an instance of [IndAcTasking].
                     *
                     * The following fields are required:
                     *
                     * ```java
                     * .acftType()
                     * ```
                     */
                    @JvmStatic
                    fun builder() = Builder()
                }

                /** A builder for [IndAcTasking]. */
                class Builder internal constructor() {

                    private var acftType: JsonField<String>? = null
                    private var callSign: JsonField<String> = JsonMissing.of()
                    private var iffSifMode1Code: JsonField<String> = JsonMissing.of()
                    private var iffSifMode2Code: JsonField<String> = JsonMissing.of()
                    private var iffSifMode3Code: JsonField<String> = JsonMissing.of()
                    private var juAddress: JsonField<MutableList<Int>>? = null
                    private var link16CallSign: JsonField<String> = JsonMissing.of()
                    private var numAcft: JsonField<Int> = JsonMissing.of()
                    private var priConfigCode: JsonField<String> = JsonMissing.of()
                    private var secConfigCode: JsonField<String> = JsonMissing.of()
                    private var tacanChan: JsonField<Int> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(indAcTasking: IndAcTasking) =
                        apply {
                            acftType = indAcTasking.acftType
                            callSign = indAcTasking.callSign
                            iffSifMode1Code = indAcTasking.iffSifMode1Code
                            iffSifMode2Code = indAcTasking.iffSifMode2Code
                            iffSifMode3Code = indAcTasking.iffSifMode3Code
                            juAddress = indAcTasking.juAddress.map { it.toMutableList() }
                            link16CallSign = indAcTasking.link16CallSign
                            numAcft = indAcTasking.numAcft
                            priConfigCode = indAcTasking.priConfigCode
                            secConfigCode = indAcTasking.secConfigCode
                            tacanChan = indAcTasking.tacanChan
                            additionalProperties = indAcTasking.additionalProperties.toMutableMap()
                        }

                    /** The type and model number for the aircraft. The field may specify a value of an aircraft not yet assigned an aircraft code contained in the aircraft codes list. */
                    fun acftType(acftType: String) = acftType(JsonField.of(acftType))

                    /**
                     * Sets [Builder.acftType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.acftType] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun acftType(acftType: JsonField<String>) =
                        apply {
                            this.acftType = acftType
                        }

                    /** The call sign assigned to this mission aircraft. */
                    fun callSign(callSign: String) = callSign(JsonField.of(callSign))

                    /**
                     * Sets [Builder.callSign] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.callSign] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun callSign(callSign: JsonField<String>) =
                        apply {
                            this.callSign = callSign
                        }

                    /** The mode 1 and code of the Identification Friend or FOE (IFF) or Selective Identification Feature (SIF). */
                    fun iffSifMode1Code(iffSifMode1Code: String) = iffSifMode1Code(JsonField.of(iffSifMode1Code))

                    /**
                     * Sets [Builder.iffSifMode1Code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.iffSifMode1Code] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun iffSifMode1Code(iffSifMode1Code: JsonField<String>) =
                        apply {
                            this.iffSifMode1Code = iffSifMode1Code
                        }

                    /** The mode 2 and code of the Identification Friend or FOE (IFF) or Selective Identification Feature (SIF). */
                    fun iffSifMode2Code(iffSifMode2Code: String) = iffSifMode2Code(JsonField.of(iffSifMode2Code))

                    /**
                     * Sets [Builder.iffSifMode2Code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.iffSifMode2Code] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun iffSifMode2Code(iffSifMode2Code: JsonField<String>) =
                        apply {
                            this.iffSifMode2Code = iffSifMode2Code
                        }

                    /** The mode 3 and code of the Identification Friend or FOE (IFF) or Selective Identification Feature (SIF). */
                    fun iffSifMode3Code(iffSifMode3Code: String) = iffSifMode3Code(JsonField.of(iffSifMode3Code))

                    /**
                     * Sets [Builder.iffSifMode3Code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.iffSifMode3Code] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun iffSifMode3Code(iffSifMode3Code: JsonField<String>) =
                        apply {
                            this.iffSifMode3Code = iffSifMode3Code
                        }

                    /** An optional array of link 16 octal track numbers assigned as the primary JTIDS Unit (JU) address for the mission aircraft. */
                    fun juAddress(juAddress: List<Int>) = juAddress(JsonField.of(juAddress))

                    /**
                     * Sets [Builder.juAddress] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.juAddress] with a well-typed `List<Int>` value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun juAddress(juAddress: JsonField<List<Int>>) =
                        apply {
                            this.juAddress = juAddress.map { it.toMutableList() }
                        }

                    /**
                     * Adds a single [Int] to [Builder.juAddress].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addJuAddress(juAddress: Int) =
                        apply {
                            this.juAddress = (this.juAddress ?: JsonField.of(mutableListOf())).also {
                                checkKnown("juAddress", it).add(juAddress)
                            }
                        }

                    /** The Link 16 abbreviated call sign assigned to the ACA. This is normally the first and last letter and the last two numbers of the call sign. */
                    fun link16CallSign(link16CallSign: String) = link16CallSign(JsonField.of(link16CallSign))

                    /**
                     * Sets [Builder.link16CallSign] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.link16CallSign] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun link16CallSign(link16CallSign: JsonField<String>) =
                        apply {
                            this.link16CallSign = link16CallSign
                        }

                    /** The number of aircraft participating in this mission. */
                    fun numAcft(numAcft: Int) = numAcft(JsonField.of(numAcft))

                    /**
                     * Sets [Builder.numAcft] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.numAcft] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun numAcft(numAcft: JsonField<Int>) =
                        apply {
                            this.numAcft = numAcft
                        }

                    /** The code that indicates the ordinance mix carried on this mission aircraft. */
                    fun priConfigCode(priConfigCode: String) = priConfigCode(JsonField.of(priConfigCode))

                    /**
                     * Sets [Builder.priConfigCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priConfigCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun priConfigCode(priConfigCode: JsonField<String>) =
                        apply {
                            this.priConfigCode = priConfigCode
                        }

                    /** The code for the secondary ordinance mix carried on this mission aircraft. */
                    fun secConfigCode(secConfigCode: String) = secConfigCode(JsonField.of(secConfigCode))

                    /**
                     * Sets [Builder.secConfigCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secConfigCode] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun secConfigCode(secConfigCode: JsonField<String>) =
                        apply {
                            this.secConfigCode = secConfigCode
                        }

                    /** The TACAN channel assigned to this mission aircraft. */
                    fun tacanChan(tacanChan: Int) = tacanChan(JsonField.of(tacanChan))

                    /**
                     * Sets [Builder.tacanChan] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.tacanChan] with a well-typed [Int] value instead. This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun tacanChan(tacanChan: JsonField<Int>) =
                        apply {
                            this.tacanChan = tacanChan
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
                     * Returns an immutable instance of [IndAcTasking].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     *
                     * ```java
                     * .acftType()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): IndAcTasking =
                        IndAcTasking(
                          checkRequired(
                            "acftType", acftType
                          ),
                          callSign,
                          iffSifMode1Code,
                          iffSifMode2Code,
                          iffSifMode3Code,
                          (juAddress ?: JsonMissing.of()).map { it.toImmutable() },
                          link16CallSign,
                          numAcft,
                          priConfigCode,
                          secConfigCode,
                          tacanChan,
                          additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): IndAcTasking =
                    apply {
                        if (validated) {
                          return@apply
                        }

                        acftType()
                        callSign()
                        iffSifMode1Code()
                        iffSifMode2Code()
                        iffSifMode3Code()
                        juAddress()
                        link16CallSign()
                        numAcft()
                        priConfigCode()
                        secConfigCode()
                        tacanChan()
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
                internal fun validity(): Int = (if (acftType.asKnown().isPresent) 1 else 0) + (if (callSign.asKnown().isPresent) 1 else 0) + (if (iffSifMode1Code.asKnown().isPresent) 1 else 0) + (if (iffSifMode2Code.asKnown().isPresent) 1 else 0) + (if (iffSifMode3Code.asKnown().isPresent) 1 else 0) + (juAddress.asKnown().getOrNull()?.size ?: 0) + (if (link16CallSign.asKnown().isPresent) 1 else 0) + (if (numAcft.asKnown().isPresent) 1 else 0) + (if (priConfigCode.asKnown().isPresent) 1 else 0) + (if (secConfigCode.asKnown().isPresent) 1 else 0) + (if (tacanChan.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                  if (this === other) {
                      return true
                  }

                  return /* spotless:off */ other is IndAcTasking && acftType == other.acftType && callSign == other.callSign && iffSifMode1Code == other.iffSifMode1Code && iffSifMode2Code == other.iffSifMode2Code && iffSifMode3Code == other.iffSifMode3Code && juAddress == other.juAddress && link16CallSign == other.link16CallSign && numAcft == other.numAcft && priConfigCode == other.priConfigCode && secConfigCode == other.secConfigCode && tacanChan == other.tacanChan && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(acftType, callSign, iffSifMode1Code, iffSifMode2Code, iffSifMode3Code, juAddress, link16CallSign, numAcft, priConfigCode, secConfigCode, tacanChan, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "IndAcTasking{acftType=$acftType, callSign=$callSign, iffSifMode1Code=$iffSifMode1Code, iffSifMode2Code=$iffSifMode2Code, iffSifMode3Code=$iffSifMode3Code, juAddress=$juAddress, link16CallSign=$link16CallSign, numAcft=$numAcft, priConfigCode=$priConfigCode, secConfigCode=$secConfigCode, tacanChan=$tacanChan, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is AcMsnTasking && countryCode == other.countryCode && taskedService == other.taskedService && unitDesignator == other.unitDesignator && acMsnLocSeg == other.acMsnLocSeg && alertStatus == other.alertStatus && amcMsnNum == other.amcMsnNum && depLocLat == other.depLocLat && depLocLon == other.depLocLon && depLocName == other.depLocName && depLocUtm == other.depLocUtm && depTime == other.depTime && indAcTasking == other.indAcTasking && msnCommander == other.msnCommander && msnNum == other.msnNum && pkgId == other.pkgId && priMsnType == other.priMsnType && rcvyLocLat == other.rcvyLocLat && rcvyLocLon == other.rcvyLocLon && rcvyLocName == other.rcvyLocName && rcvyLocUtm == other.rcvyLocUtm && rcvyTime == other.rcvyTime && resMsnInd == other.resMsnInd && secMsnType == other.secMsnType && unitLocName == other.unitLocName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(countryCode, taskedService, unitDesignator, acMsnLocSeg, alertStatus, amcMsnNum, depLocLat, depLocLon, depLocName, depLocUtm, depTime, indAcTasking, msnCommander, msnNum, pkgId, priMsnType, rcvyLocLat, rcvyLocLon, rcvyLocName, rcvyLocUtm, rcvyTime, resMsnInd, secMsnType, unitLocName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "AcMsnTasking{countryCode=$countryCode, taskedService=$taskedService, unitDesignator=$unitDesignator, acMsnLocSeg=$acMsnLocSeg, alertStatus=$alertStatus, amcMsnNum=$amcMsnNum, depLocLat=$depLocLat, depLocLon=$depLocLon, depLocName=$depLocName, depLocUtm=$depLocUtm, depTime=$depTime, indAcTasking=$indAcTasking, msnCommander=$msnCommander, msnNum=$msnNum, pkgId=$pkgId, priMsnType=$priMsnType, rcvyLocLat=$rcvyLocLat, rcvyLocLon=$rcvyLocLon, rcvyLocName=$rcvyLocName, rcvyLocUtm=$rcvyLocUtm, rcvyTime=$rcvyTime, resMsnInd=$resMsnInd, secMsnType=$secMsnType, unitLocName=$unitLocName, additionalProperties=$additionalProperties}"
        }

        /** Collection that details special instructions, important information, guidance, and amplifying information regarding this ATO. */
        class GenText private constructor(
            private val text: JsonField<String>,
            private val textInd: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,

        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
                @JsonProperty("textInd") @ExcludeMissing textInd: JsonField<String> = JsonMissing.of()
            ) : this(
              text,
              textInd,
              mutableMapOf(),
            )

            /**
             * The free text that describes the information specific to the text indicator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun text(): Optional<String> = text.getOptional("text")

            /**
             * The indicator for the general text block. Examples include "OPENING REMARKS" and "GENERAL SPINS INFORMATION".
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun textInd(): Optional<String> = textInd.getOptional("textInd")

            /**
             * Returns the raw JSON value of [text].
             *
             * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("text")
            @ExcludeMissing
            fun _text(): JsonField<String> = text

            /**
             * Returns the raw JSON value of [textInd].
             *
             * Unlike [textInd], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("textInd")
            @ExcludeMissing
            fun _textInd(): JsonField<String> = textInd

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
              additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [GenText]. */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [GenText]. */
            class Builder internal constructor() {

                private var text: JsonField<String> = JsonMissing.of()
                private var textInd: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(genText: GenText) =
                    apply {
                        text = genText.text
                        textInd = genText.textInd
                        additionalProperties = genText.additionalProperties.toMutableMap()
                    }

                /** The free text that describes the information specific to the text indicator. */
                fun text(text: String) = text(JsonField.of(text))

                /**
                 * Sets [Builder.text] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.text] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun text(text: JsonField<String>) =
                    apply {
                        this.text = text
                    }

                /** The indicator for the general text block. Examples include "OPENING REMARKS" and "GENERAL SPINS INFORMATION". */
                fun textInd(textInd: String) = textInd(JsonField.of(textInd))

                /**
                 * Sets [Builder.textInd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.textInd] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun textInd(textInd: JsonField<String>) =
                    apply {
                        this.textInd = textInd
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
                 * Returns an immutable instance of [GenText].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GenText =
                    GenText(
                      text,
                      textInd,
                      additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): GenText =
                apply {
                    if (validated) {
                      return@apply
                    }

                    text()
                    textInd()
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
            internal fun validity(): Int = (if (text.asKnown().isPresent) 1 else 0) + (if (textInd.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is GenText && text == other.text && textInd == other.textInd && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(text, textInd, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "GenText{text=$text, textInd=$textInd, additionalProperties=$additionalProperties}"
        }

        /** Collection that specifies the naval flight operations for this ATO. */
        class NavalFltOp private constructor(
            private val shipName: JsonField<String>,
            private val fltOpStart: JsonField<OffsetDateTime>,
            private val fltOpStop: JsonField<OffsetDateTime>,
            private val schdLaunchRcvyTime: JsonField<List<OffsetDateTime>>,
            private val additionalProperties: MutableMap<String, JsonValue>,

        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("shipName") @ExcludeMissing shipName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fltOpStart") @ExcludeMissing fltOpStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fltOpStop") @ExcludeMissing fltOpStop: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("schdLaunchRcvyTime") @ExcludeMissing schdLaunchRcvyTime: JsonField<List<OffsetDateTime>> = JsonMissing.of()
            ) : this(
              shipName,
              fltOpStart,
              fltOpStop,
              schdLaunchRcvyTime,
              mutableMapOf(),
            )

            /**
             * The name of a ship or maritime vessel. Specify UNKNOWN if name is not known.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
             */
            fun shipName(): String = shipName.getRequired("shipName")

            /**
             * The time when flight operations begin in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun fltOpStart(): Optional<OffsetDateTime> = fltOpStart.getOptional("fltOpStart")

            /**
             * The time when flight operations end in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun fltOpStop(): Optional<OffsetDateTime> = fltOpStop.getOptional("fltOpStop")

            /**
             * An array of times at which an aircraft will be launched and/or recovered in ISO8601 UTC format with millisecond precision.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g. if the server responded with an unexpected value).
             */
            fun schdLaunchRcvyTime(): Optional<List<OffsetDateTime>> = schdLaunchRcvyTime.getOptional("schdLaunchRcvyTime")

            /**
             * Returns the raw JSON value of [shipName].
             *
             * Unlike [shipName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("shipName")
            @ExcludeMissing
            fun _shipName(): JsonField<String> = shipName

            /**
             * Returns the raw JSON value of [fltOpStart].
             *
             * Unlike [fltOpStart], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fltOpStart")
            @ExcludeMissing
            fun _fltOpStart(): JsonField<OffsetDateTime> = fltOpStart

            /**
             * Returns the raw JSON value of [fltOpStop].
             *
             * Unlike [fltOpStop], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("fltOpStop")
            @ExcludeMissing
            fun _fltOpStop(): JsonField<OffsetDateTime> = fltOpStop

            /**
             * Returns the raw JSON value of [schdLaunchRcvyTime].
             *
             * Unlike [schdLaunchRcvyTime], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("schdLaunchRcvyTime")
            @ExcludeMissing
            fun _schdLaunchRcvyTime(): JsonField<List<OffsetDateTime>> = schdLaunchRcvyTime

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
                 * Returns a mutable builder for constructing an instance of [NavalFltOp].
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .shipName()
                 * ```
                 */
                @JvmStatic
                fun builder() = Builder()
            }

            /** A builder for [NavalFltOp]. */
            class Builder internal constructor() {

                private var shipName: JsonField<String>? = null
                private var fltOpStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fltOpStop: JsonField<OffsetDateTime> = JsonMissing.of()
                private var schdLaunchRcvyTime: JsonField<MutableList<OffsetDateTime>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(navalFltOp: NavalFltOp) =
                    apply {
                        shipName = navalFltOp.shipName
                        fltOpStart = navalFltOp.fltOpStart
                        fltOpStop = navalFltOp.fltOpStop
                        schdLaunchRcvyTime = navalFltOp.schdLaunchRcvyTime.map { it.toMutableList() }
                        additionalProperties = navalFltOp.additionalProperties.toMutableMap()
                    }

                /** The name of a ship or maritime vessel. Specify UNKNOWN if name is not known. */
                fun shipName(shipName: String) = shipName(JsonField.of(shipName))

                /**
                 * Sets [Builder.shipName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shipName] with a well-typed [String] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun shipName(shipName: JsonField<String>) =
                    apply {
                        this.shipName = shipName
                    }

                /** The time when flight operations begin in ISO8601 UTC format with millisecond precision. */
                fun fltOpStart(fltOpStart: OffsetDateTime) = fltOpStart(JsonField.of(fltOpStart))

                /**
                 * Sets [Builder.fltOpStart] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltOpStart] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fltOpStart(fltOpStart: JsonField<OffsetDateTime>) =
                    apply {
                        this.fltOpStart = fltOpStart
                    }

                /** The time when flight operations end in ISO8601 UTC format with millisecond precision. */
                fun fltOpStop(fltOpStop: OffsetDateTime) = fltOpStop(JsonField.of(fltOpStop))

                /**
                 * Sets [Builder.fltOpStop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fltOpStop] with a well-typed [OffsetDateTime] value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun fltOpStop(fltOpStop: JsonField<OffsetDateTime>) =
                    apply {
                        this.fltOpStop = fltOpStop
                    }

                /** An array of times at which an aircraft will be launched and/or recovered in ISO8601 UTC format with millisecond precision. */
                fun schdLaunchRcvyTime(schdLaunchRcvyTime: List<OffsetDateTime>) = schdLaunchRcvyTime(JsonField.of(schdLaunchRcvyTime))

                /**
                 * Sets [Builder.schdLaunchRcvyTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.schdLaunchRcvyTime] with a well-typed `List<OffsetDateTime>` value instead. This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun schdLaunchRcvyTime(schdLaunchRcvyTime: JsonField<List<OffsetDateTime>>) =
                    apply {
                        this.schdLaunchRcvyTime = schdLaunchRcvyTime.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [OffsetDateTime] to [Builder.schdLaunchRcvyTime].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addSchdLaunchRcvyTime(schdLaunchRcvyTime: OffsetDateTime) =
                    apply {
                        this.schdLaunchRcvyTime = (this.schdLaunchRcvyTime ?: JsonField.of(mutableListOf())).also {
                            checkKnown("schdLaunchRcvyTime", it).add(schdLaunchRcvyTime)
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
                 * Returns an immutable instance of [NavalFltOp].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 *
                 * ```java
                 * .shipName()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NavalFltOp =
                    NavalFltOp(
                      checkRequired(
                        "shipName", shipName
                      ),
                      fltOpStart,
                      fltOpStop,
                      (schdLaunchRcvyTime ?: JsonMissing.of()).map { it.toImmutable() },
                      additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NavalFltOp =
                apply {
                    if (validated) {
                      return@apply
                    }

                    shipName()
                    fltOpStart()
                    fltOpStop()
                    schdLaunchRcvyTime()
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
            internal fun validity(): Int = (if (shipName.asKnown().isPresent) 1 else 0) + (if (fltOpStart.asKnown().isPresent) 1 else 0) + (if (fltOpStop.asKnown().isPresent) 1 else 0) + (schdLaunchRcvyTime.asKnown().getOrNull()?.size ?: 0)

            override fun equals(other: Any?): Boolean {
              if (this === other) {
                  return true
              }

              return /* spotless:off */ other is NavalFltOp && shipName == other.shipName && fltOpStart == other.fltOpStart && fltOpStop == other.fltOpStop && schdLaunchRcvyTime == other.schdLaunchRcvyTime && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(shipName, fltOpStart, fltOpStop, schdLaunchRcvyTime, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "NavalFltOp{shipName=$shipName, fltOpStart=$fltOpStart, fltOpStop=$fltOpStop, schdLaunchRcvyTime=$schdLaunchRcvyTime, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && beginTs == other.beginTs && classificationMarking == other.classificationMarking && dataMode == other.dataMode && opExerName == other.opExerName && source == other.source && id == other.id && ackReqInd == other.ackReqInd && ackUnitInstructions == other.ackUnitInstructions && acMsnTasking == other.acMsnTasking && createdAt == other.createdAt && createdBy == other.createdBy && endTs == other.endTs && genText == other.genText && msgMonth == other.msgMonth && msgOriginator == other.msgOriginator && msgQualifier == other.msgQualifier && msgSn == other.msgSn && navalFltOps == other.navalFltOps && origin == other.origin && origNetwork == other.origNetwork && rawFileUri == other.rawFileUri && sourceDl == other.sourceDl /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(beginTs, classificationMarking, dataMode, opExerName, source, id, ackReqInd, ackUnitInstructions, acMsnTasking, createdAt, createdBy, endTs, genText, msgMonth, msgOriginator, msgQualifier, msgSn, navalFltOps, origin, origNetwork, rawFileUri, sourceDl) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{beginTs=$beginTs, classificationMarking=$classificationMarking, dataMode=$dataMode, opExerName=$opExerName, source=$source, id=$id, ackReqInd=$ackReqInd, ackUnitInstructions=$ackUnitInstructions, acMsnTasking=$acMsnTasking, createdAt=$createdAt, createdBy=$createdBy, endTs=$endTs, genText=$genText, msgMonth=$msgMonth, msgOriginator=$msgOriginator, msgQualifier=$msgQualifier, msgSn=$msgSn, navalFltOps=$navalFltOps, origin=$origin, origNetwork=$origNetwork, rawFileUri=$rawFileUri, sourceDl=$sourceDl}"
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is AirTaskingOrderUnvalidatedPublishParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "AirTaskingOrderUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

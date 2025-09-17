// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.airspacecontrolorders

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Beta Version Airspace Control Order: Contains airspace coordination information and instructions
 * that have been issued by an airspace control authority.
 */
class AirspacecontrolorderAbridged
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val opExName: JsonField<String>,
    private val originator: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val acoComments: JsonField<String>,
    private val acoSerialNum: JsonField<String>,
    private val airspaceControlMeansStatus: JsonField<List<AirspaceControlMeansStatus>>,
    private val airspaceControlOrderReferences: JsonField<List<AirspaceControlOrderReference>>,
    private val areaOfValidity: JsonField<String>,
    private val classReasons: JsonField<List<String>>,
    private val classSource: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val declassExemptionCodes: JsonField<List<String>>,
    private val downgradeInsDates: JsonField<List<String>>,
    private val geoDatum: JsonField<String>,
    private val month: JsonField<String>,
    private val opExInfo: JsonField<String>,
    private val opExInfoAlt: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val planOrigNum: JsonField<String>,
    private val qualifier: JsonField<String>,
    private val qualSn: JsonField<Int>,
    private val serialNum: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val stopQualifier: JsonField<String>,
    private val stopTime: JsonField<OffsetDateTime>,
    private val undLnkTrks: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("opExName") @ExcludeMissing opExName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator")
        @ExcludeMissing
        originator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startTime")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acoComments")
        @ExcludeMissing
        acoComments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acoSerialNum")
        @ExcludeMissing
        acoSerialNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("airspaceControlMeansStatus")
        @ExcludeMissing
        airspaceControlMeansStatus: JsonField<List<AirspaceControlMeansStatus>> = JsonMissing.of(),
        @JsonProperty("airspaceControlOrderReferences")
        @ExcludeMissing
        airspaceControlOrderReferences: JsonField<List<AirspaceControlOrderReference>> =
            JsonMissing.of(),
        @JsonProperty("areaOfValidity")
        @ExcludeMissing
        areaOfValidity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("classReasons")
        @ExcludeMissing
        classReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("classSource")
        @ExcludeMissing
        classSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("declassExemptionCodes")
        @ExcludeMissing
        declassExemptionCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("downgradeInsDates")
        @ExcludeMissing
        downgradeInsDates: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("geoDatum") @ExcludeMissing geoDatum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("month") @ExcludeMissing month: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opExInfo") @ExcludeMissing opExInfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opExInfoAlt")
        @ExcludeMissing
        opExInfoAlt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planOrigNum")
        @ExcludeMissing
        planOrigNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("qualifier") @ExcludeMissing qualifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("qualSN") @ExcludeMissing qualSn: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("serialNum") @ExcludeMissing serialNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stopQualifier")
        @ExcludeMissing
        stopQualifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stopTime")
        @ExcludeMissing
        stopTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("undLnkTrks")
        @ExcludeMissing
        undLnkTrks: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        opExName,
        originator,
        source,
        startTime,
        id,
        acoComments,
        acoSerialNum,
        airspaceControlMeansStatus,
        airspaceControlOrderReferences,
        areaOfValidity,
        classReasons,
        classSource,
        createdAt,
        createdBy,
        declassExemptionCodes,
        downgradeInsDates,
        geoDatum,
        month,
        opExInfo,
        opExInfoAlt,
        origin,
        origNetwork,
        planOrigNum,
        qualifier,
        qualSn,
        serialNum,
        sourceDl,
        stopQualifier,
        stopTime,
        undLnkTrks,
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
     * Specifies the unique operation or exercise name, nickname, or codeword assigned to a joint
     * exercise or operation plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun opExName(): String = opExName.getRequired("opExName")

    /**
     * The identifier of the originator of this message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originator(): String = originator.getRequired("originator")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The start of the effective time period of this airspace control order, in ISO 8601 UTC format
     * with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Free text information expressed in natural language.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun acoComments(): Optional<String> = acoComments.getOptional("acoComments")

    /**
     * The serial number of this airspace control order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun acoSerialNum(): Optional<String> = acoSerialNum.getOptional("acoSerialNum")

    /**
     * Mandatory nested segment to report multiple airspace control means statuses within an ACOID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun airspaceControlMeansStatus(): Optional<List<AirspaceControlMeansStatus>> =
        airspaceControlMeansStatus.getOptional("airspaceControlMeansStatus")

    /**
     * The airspaceControlReferences set provides both USMTF and non-USMTF references for this
     * airspace control order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun airspaceControlOrderReferences(): Optional<List<AirspaceControlOrderReference>> =
        airspaceControlOrderReferences.getOptional("airspaceControlOrderReferences")

    /**
     * Name of the area of the command for which the ACO is valid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun areaOfValidity(): Optional<String> = areaOfValidity.getOptional("areaOfValidity")

    /**
     * Mandatory if classSource uses the "IORIG" designator. Must be a REASON FOR CLASSIFICATION
     * code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classReasons(): Optional<List<String>> = classReasons.getOptional("classReasons")

    /**
     * Markings defining the source material or the original classification authority for the ACO
     * message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classSource(): Optional<String> = classSource.getOptional("classSource")

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
     * Coded entries that provide justification for exemption from automatic downgrading or
     * declassification of the airspace control order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun declassExemptionCodes(): Optional<List<String>> =
        declassExemptionCodes.getOptional("declassExemptionCodes")

    /**
     * Markings providing the literal guidance or date for downgrading or declassifying the airspace
     * control order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun downgradeInsDates(): Optional<List<String>> =
        downgradeInsDates.getOptional("downgradeInsDates")

    /**
     * Specifies the geodetic datum by which the spatial coordinates of the controlled airspace are
     * calculated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoDatum(): Optional<String> = geoDatum.getOptional("geoDatum")

    /**
     * The month in which the message originated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun month(): Optional<String> = month.getOptional("month")

    /**
     * Supplementary name that can be used to further identify exercise nicknames, or to provide the
     * primary nickname of the option or the alternative of an operational plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opExInfo(): Optional<String> = opExInfo.getOptional("opExInfo")

    /**
     * The secondary supplementary nickname of the option or the alternative of the operational plan
     * or order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opExInfoAlt(): Optional<String> = opExInfoAlt.getOptional("opExInfoAlt")

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
     * The official identifier of the military establishment responsible for the operation plan and
     * the identification number assigned to this plan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun planOrigNum(): Optional<String> = planOrigNum.getOptional("planOrigNum")

    /**
     * The qualifier which caveats the message status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun qualifier(): Optional<String> = qualifier.getOptional("qualifier")

    /**
     * The serial number associated with the message qualifier.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun qualSn(): Optional<Int> = qualSn.getOptional("qualSN")

    /**
     * The unique message identifier sequentially assigned by the originator.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun serialNum(): Optional<String> = serialNum.getOptional("serialNum")

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
     * A qualifier for the end of the effective time period of this airspace control order, such as
     * AFTER, ASOF, NLT, etc. Used with field stopTime to indicate a relative time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stopQualifier(): Optional<String> = stopQualifier.getOptional("stopQualifier")

    /**
     * The end of the effective time period of this airspace control order, in ISO 8601 UTC format
     * with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stopTime(): Optional<OffsetDateTime> = stopTime.getOptional("stopTime")

    /**
     * Array of unique link 16 identifiers that will be assigned to a future airspace control means.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun undLnkTrks(): Optional<List<String>> = undLnkTrks.getOptional("undLnkTrks")

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
     * Returns the raw JSON value of [opExName].
     *
     * Unlike [opExName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opExName") @ExcludeMissing fun _opExName(): JsonField<String> = opExName

    /**
     * Returns the raw JSON value of [originator].
     *
     * Unlike [originator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("originator") @ExcludeMissing fun _originator(): JsonField<String> = originator

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startTime")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [acoComments].
     *
     * Unlike [acoComments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acoComments") @ExcludeMissing fun _acoComments(): JsonField<String> = acoComments

    /**
     * Returns the raw JSON value of [acoSerialNum].
     *
     * Unlike [acoSerialNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acoSerialNum")
    @ExcludeMissing
    fun _acoSerialNum(): JsonField<String> = acoSerialNum

    /**
     * Returns the raw JSON value of [airspaceControlMeansStatus].
     *
     * Unlike [airspaceControlMeansStatus], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("airspaceControlMeansStatus")
    @ExcludeMissing
    fun _airspaceControlMeansStatus(): JsonField<List<AirspaceControlMeansStatus>> =
        airspaceControlMeansStatus

    /**
     * Returns the raw JSON value of [airspaceControlOrderReferences].
     *
     * Unlike [airspaceControlOrderReferences], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("airspaceControlOrderReferences")
    @ExcludeMissing
    fun _airspaceControlOrderReferences(): JsonField<List<AirspaceControlOrderReference>> =
        airspaceControlOrderReferences

    /**
     * Returns the raw JSON value of [areaOfValidity].
     *
     * Unlike [areaOfValidity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("areaOfValidity")
    @ExcludeMissing
    fun _areaOfValidity(): JsonField<String> = areaOfValidity

    /**
     * Returns the raw JSON value of [classReasons].
     *
     * Unlike [classReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classReasons")
    @ExcludeMissing
    fun _classReasons(): JsonField<List<String>> = classReasons

    /**
     * Returns the raw JSON value of [classSource].
     *
     * Unlike [classSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("classSource") @ExcludeMissing fun _classSource(): JsonField<String> = classSource

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
     * Returns the raw JSON value of [declassExemptionCodes].
     *
     * Unlike [declassExemptionCodes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("declassExemptionCodes")
    @ExcludeMissing
    fun _declassExemptionCodes(): JsonField<List<String>> = declassExemptionCodes

    /**
     * Returns the raw JSON value of [downgradeInsDates].
     *
     * Unlike [downgradeInsDates], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("downgradeInsDates")
    @ExcludeMissing
    fun _downgradeInsDates(): JsonField<List<String>> = downgradeInsDates

    /**
     * Returns the raw JSON value of [geoDatum].
     *
     * Unlike [geoDatum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoDatum") @ExcludeMissing fun _geoDatum(): JsonField<String> = geoDatum

    /**
     * Returns the raw JSON value of [month].
     *
     * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<String> = month

    /**
     * Returns the raw JSON value of [opExInfo].
     *
     * Unlike [opExInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opExInfo") @ExcludeMissing fun _opExInfo(): JsonField<String> = opExInfo

    /**
     * Returns the raw JSON value of [opExInfoAlt].
     *
     * Unlike [opExInfoAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("opExInfoAlt") @ExcludeMissing fun _opExInfoAlt(): JsonField<String> = opExInfoAlt

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
     * Returns the raw JSON value of [planOrigNum].
     *
     * Unlike [planOrigNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("planOrigNum") @ExcludeMissing fun _planOrigNum(): JsonField<String> = planOrigNum

    /**
     * Returns the raw JSON value of [qualifier].
     *
     * Unlike [qualifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qualifier") @ExcludeMissing fun _qualifier(): JsonField<String> = qualifier

    /**
     * Returns the raw JSON value of [qualSn].
     *
     * Unlike [qualSn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("qualSN") @ExcludeMissing fun _qualSn(): JsonField<Int> = qualSn

    /**
     * Returns the raw JSON value of [serialNum].
     *
     * Unlike [serialNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serialNum") @ExcludeMissing fun _serialNum(): JsonField<String> = serialNum

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [stopQualifier].
     *
     * Unlike [stopQualifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopQualifier")
    @ExcludeMissing
    fun _stopQualifier(): JsonField<String> = stopQualifier

    /**
     * Returns the raw JSON value of [stopTime].
     *
     * Unlike [stopTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopTime") @ExcludeMissing fun _stopTime(): JsonField<OffsetDateTime> = stopTime

    /**
     * Returns the raw JSON value of [undLnkTrks].
     *
     * Unlike [undLnkTrks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("undLnkTrks")
    @ExcludeMissing
    fun _undLnkTrks(): JsonField<List<String>> = undLnkTrks

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
         * Returns a mutable builder for constructing an instance of [AirspacecontrolorderAbridged].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .opExName()
         * .originator()
         * .source()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirspacecontrolorderAbridged]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var opExName: JsonField<String>? = null
        private var originator: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var acoComments: JsonField<String> = JsonMissing.of()
        private var acoSerialNum: JsonField<String> = JsonMissing.of()
        private var airspaceControlMeansStatus:
            JsonField<MutableList<AirspaceControlMeansStatus>>? =
            null
        private var airspaceControlOrderReferences:
            JsonField<MutableList<AirspaceControlOrderReference>>? =
            null
        private var areaOfValidity: JsonField<String> = JsonMissing.of()
        private var classReasons: JsonField<MutableList<String>>? = null
        private var classSource: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var declassExemptionCodes: JsonField<MutableList<String>>? = null
        private var downgradeInsDates: JsonField<MutableList<String>>? = null
        private var geoDatum: JsonField<String> = JsonMissing.of()
        private var month: JsonField<String> = JsonMissing.of()
        private var opExInfo: JsonField<String> = JsonMissing.of()
        private var opExInfoAlt: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var planOrigNum: JsonField<String> = JsonMissing.of()
        private var qualifier: JsonField<String> = JsonMissing.of()
        private var qualSn: JsonField<Int> = JsonMissing.of()
        private var serialNum: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var stopQualifier: JsonField<String> = JsonMissing.of()
        private var stopTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var undLnkTrks: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airspacecontrolorderAbridged: AirspacecontrolorderAbridged) = apply {
            classificationMarking = airspacecontrolorderAbridged.classificationMarking
            dataMode = airspacecontrolorderAbridged.dataMode
            opExName = airspacecontrolorderAbridged.opExName
            originator = airspacecontrolorderAbridged.originator
            source = airspacecontrolorderAbridged.source
            startTime = airspacecontrolorderAbridged.startTime
            id = airspacecontrolorderAbridged.id
            acoComments = airspacecontrolorderAbridged.acoComments
            acoSerialNum = airspacecontrolorderAbridged.acoSerialNum
            airspaceControlMeansStatus =
                airspacecontrolorderAbridged.airspaceControlMeansStatus.map { it.toMutableList() }
            airspaceControlOrderReferences =
                airspacecontrolorderAbridged.airspaceControlOrderReferences.map {
                    it.toMutableList()
                }
            areaOfValidity = airspacecontrolorderAbridged.areaOfValidity
            classReasons = airspacecontrolorderAbridged.classReasons.map { it.toMutableList() }
            classSource = airspacecontrolorderAbridged.classSource
            createdAt = airspacecontrolorderAbridged.createdAt
            createdBy = airspacecontrolorderAbridged.createdBy
            declassExemptionCodes =
                airspacecontrolorderAbridged.declassExemptionCodes.map { it.toMutableList() }
            downgradeInsDates =
                airspacecontrolorderAbridged.downgradeInsDates.map { it.toMutableList() }
            geoDatum = airspacecontrolorderAbridged.geoDatum
            month = airspacecontrolorderAbridged.month
            opExInfo = airspacecontrolorderAbridged.opExInfo
            opExInfoAlt = airspacecontrolorderAbridged.opExInfoAlt
            origin = airspacecontrolorderAbridged.origin
            origNetwork = airspacecontrolorderAbridged.origNetwork
            planOrigNum = airspacecontrolorderAbridged.planOrigNum
            qualifier = airspacecontrolorderAbridged.qualifier
            qualSn = airspacecontrolorderAbridged.qualSn
            serialNum = airspacecontrolorderAbridged.serialNum
            sourceDl = airspacecontrolorderAbridged.sourceDl
            stopQualifier = airspacecontrolorderAbridged.stopQualifier
            stopTime = airspacecontrolorderAbridged.stopTime
            undLnkTrks = airspacecontrolorderAbridged.undLnkTrks.map { it.toMutableList() }
            additionalProperties = airspacecontrolorderAbridged.additionalProperties.toMutableMap()
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

        /**
         * Specifies the unique operation or exercise name, nickname, or codeword assigned to a
         * joint exercise or operation plan.
         */
        fun opExName(opExName: String) = opExName(JsonField.of(opExName))

        /**
         * Sets [Builder.opExName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opExName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opExName(opExName: JsonField<String>) = apply { this.opExName = opExName }

        /** The identifier of the originator of this message. */
        fun originator(originator: String) = originator(JsonField.of(originator))

        /**
         * Sets [Builder.originator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun originator(originator: JsonField<String>) = apply { this.originator = originator }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /**
         * The start of the effective time period of this airspace control order, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Free text information expressed in natural language. */
        fun acoComments(acoComments: String) = acoComments(JsonField.of(acoComments))

        /**
         * Sets [Builder.acoComments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acoComments] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acoComments(acoComments: JsonField<String>) = apply { this.acoComments = acoComments }

        /** The serial number of this airspace control order. */
        fun acoSerialNum(acoSerialNum: String) = acoSerialNum(JsonField.of(acoSerialNum))

        /**
         * Sets [Builder.acoSerialNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acoSerialNum] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acoSerialNum(acoSerialNum: JsonField<String>) = apply {
            this.acoSerialNum = acoSerialNum
        }

        /**
         * Mandatory nested segment to report multiple airspace control means statuses within an
         * ACOID.
         */
        fun airspaceControlMeansStatus(
            airspaceControlMeansStatus: List<AirspaceControlMeansStatus>
        ) = airspaceControlMeansStatus(JsonField.of(airspaceControlMeansStatus))

        /**
         * Sets [Builder.airspaceControlMeansStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airspaceControlMeansStatus] with a well-typed
         * `List<AirspaceControlMeansStatus>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun airspaceControlMeansStatus(
            airspaceControlMeansStatus: JsonField<List<AirspaceControlMeansStatus>>
        ) = apply {
            this.airspaceControlMeansStatus = airspaceControlMeansStatus.map { it.toMutableList() }
        }

        /**
         * Adds a single [AirspaceControlMeansStatus] to [Builder.airspaceControlMeansStatus].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAirspaceControlMeansStatus(airspaceControlMeansStatus: AirspaceControlMeansStatus) =
            apply {
                this.airspaceControlMeansStatus =
                    (this.airspaceControlMeansStatus ?: JsonField.of(mutableListOf())).also {
                        checkKnown("airspaceControlMeansStatus", it).add(airspaceControlMeansStatus)
                    }
            }

        /**
         * The airspaceControlReferences set provides both USMTF and non-USMTF references for this
         * airspace control order.
         */
        fun airspaceControlOrderReferences(
            airspaceControlOrderReferences: List<AirspaceControlOrderReference>
        ) = airspaceControlOrderReferences(JsonField.of(airspaceControlOrderReferences))

        /**
         * Sets [Builder.airspaceControlOrderReferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airspaceControlOrderReferences] with a well-typed
         * `List<AirspaceControlOrderReference>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun airspaceControlOrderReferences(
            airspaceControlOrderReferences: JsonField<List<AirspaceControlOrderReference>>
        ) = apply {
            this.airspaceControlOrderReferences =
                airspaceControlOrderReferences.map { it.toMutableList() }
        }

        /**
         * Adds a single [AirspaceControlOrderReference] to [airspaceControlOrderReferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAirspaceControlOrderReference(
            airspaceControlOrderReference: AirspaceControlOrderReference
        ) = apply {
            airspaceControlOrderReferences =
                (airspaceControlOrderReferences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("airspaceControlOrderReferences", it)
                        .add(airspaceControlOrderReference)
                }
        }

        /** Name of the area of the command for which the ACO is valid. */
        fun areaOfValidity(areaOfValidity: String) = areaOfValidity(JsonField.of(areaOfValidity))

        /**
         * Sets [Builder.areaOfValidity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.areaOfValidity] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun areaOfValidity(areaOfValidity: JsonField<String>) = apply {
            this.areaOfValidity = areaOfValidity
        }

        /**
         * Mandatory if classSource uses the "IORIG" designator. Must be a REASON FOR CLASSIFICATION
         * code.
         */
        fun classReasons(classReasons: List<String>) = classReasons(JsonField.of(classReasons))

        /**
         * Sets [Builder.classReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classReasons] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun classReasons(classReasons: JsonField<List<String>>) = apply {
            this.classReasons = classReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [classReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addClassReason(classReason: String) = apply {
            classReasons =
                (classReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("classReasons", it).add(classReason)
                }
        }

        /**
         * Markings defining the source material or the original classification authority for the
         * ACO message.
         */
        fun classSource(classSource: String) = classSource(JsonField.of(classSource))

        /**
         * Sets [Builder.classSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.classSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun classSource(classSource: JsonField<String>) = apply { this.classSource = classSource }

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
         * Coded entries that provide justification for exemption from automatic downgrading or
         * declassification of the airspace control order.
         */
        fun declassExemptionCodes(declassExemptionCodes: List<String>) =
            declassExemptionCodes(JsonField.of(declassExemptionCodes))

        /**
         * Sets [Builder.declassExemptionCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.declassExemptionCodes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun declassExemptionCodes(declassExemptionCodes: JsonField<List<String>>) = apply {
            this.declassExemptionCodes = declassExemptionCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [declassExemptionCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeclassExemptionCode(declassExemptionCode: String) = apply {
            declassExemptionCodes =
                (declassExemptionCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("declassExemptionCodes", it).add(declassExemptionCode)
                }
        }

        /**
         * Markings providing the literal guidance or date for downgrading or declassifying the
         * airspace control order.
         */
        fun downgradeInsDates(downgradeInsDates: List<String>) =
            downgradeInsDates(JsonField.of(downgradeInsDates))

        /**
         * Sets [Builder.downgradeInsDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downgradeInsDates] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun downgradeInsDates(downgradeInsDates: JsonField<List<String>>) = apply {
            this.downgradeInsDates = downgradeInsDates.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [downgradeInsDates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDowngradeInsDate(downgradeInsDate: String) = apply {
            downgradeInsDates =
                (downgradeInsDates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("downgradeInsDates", it).add(downgradeInsDate)
                }
        }

        /**
         * Specifies the geodetic datum by which the spatial coordinates of the controlled airspace
         * are calculated.
         */
        fun geoDatum(geoDatum: String) = geoDatum(JsonField.of(geoDatum))

        /**
         * Sets [Builder.geoDatum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoDatum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geoDatum(geoDatum: JsonField<String>) = apply { this.geoDatum = geoDatum }

        /** The month in which the message originated. */
        fun month(month: String) = month(JsonField.of(month))

        /**
         * Sets [Builder.month] to an arbitrary JSON value.
         *
         * You should usually call [Builder.month] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun month(month: JsonField<String>) = apply { this.month = month }

        /**
         * Supplementary name that can be used to further identify exercise nicknames, or to provide
         * the primary nickname of the option or the alternative of an operational plan.
         */
        fun opExInfo(opExInfo: String) = opExInfo(JsonField.of(opExInfo))

        /**
         * Sets [Builder.opExInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opExInfo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun opExInfo(opExInfo: JsonField<String>) = apply { this.opExInfo = opExInfo }

        /**
         * The secondary supplementary nickname of the option or the alternative of the operational
         * plan or order.
         */
        fun opExInfoAlt(opExInfoAlt: String) = opExInfoAlt(JsonField.of(opExInfoAlt))

        /**
         * Sets [Builder.opExInfoAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.opExInfoAlt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun opExInfoAlt(opExInfoAlt: JsonField<String>) = apply { this.opExInfoAlt = opExInfoAlt }

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
         * The official identifier of the military establishment responsible for the operation plan
         * and the identification number assigned to this plan.
         */
        fun planOrigNum(planOrigNum: String) = planOrigNum(JsonField.of(planOrigNum))

        /**
         * Sets [Builder.planOrigNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planOrigNum] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun planOrigNum(planOrigNum: JsonField<String>) = apply { this.planOrigNum = planOrigNum }

        /** The qualifier which caveats the message status. */
        fun qualifier(qualifier: String) = qualifier(JsonField.of(qualifier))

        /**
         * Sets [Builder.qualifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qualifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun qualifier(qualifier: JsonField<String>) = apply { this.qualifier = qualifier }

        /** The serial number associated with the message qualifier. */
        fun qualSn(qualSn: Int) = qualSn(JsonField.of(qualSn))

        /**
         * Sets [Builder.qualSn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.qualSn] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun qualSn(qualSn: JsonField<Int>) = apply { this.qualSn = qualSn }

        /** The unique message identifier sequentially assigned by the originator. */
        fun serialNum(serialNum: String) = serialNum(JsonField.of(serialNum))

        /**
         * Sets [Builder.serialNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serialNum] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serialNum(serialNum: JsonField<String>) = apply { this.serialNum = serialNum }

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

        /**
         * A qualifier for the end of the effective time period of this airspace control order, such
         * as AFTER, ASOF, NLT, etc. Used with field stopTime to indicate a relative time.
         */
        fun stopQualifier(stopQualifier: String) = stopQualifier(JsonField.of(stopQualifier))

        /**
         * Sets [Builder.stopQualifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopQualifier] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stopQualifier(stopQualifier: JsonField<String>) = apply {
            this.stopQualifier = stopQualifier
        }

        /**
         * The end of the effective time period of this airspace control order, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun stopTime(stopTime: OffsetDateTime) = stopTime(JsonField.of(stopTime))

        /**
         * Sets [Builder.stopTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stopTime(stopTime: JsonField<OffsetDateTime>) = apply { this.stopTime = stopTime }

        /**
         * Array of unique link 16 identifiers that will be assigned to a future airspace control
         * means.
         */
        fun undLnkTrks(undLnkTrks: List<String>) = undLnkTrks(JsonField.of(undLnkTrks))

        /**
         * Sets [Builder.undLnkTrks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.undLnkTrks] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun undLnkTrks(undLnkTrks: JsonField<List<String>>) = apply {
            this.undLnkTrks = undLnkTrks.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [undLnkTrks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUndLnkTrk(undLnkTrk: String) = apply {
            undLnkTrks =
                (undLnkTrks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("undLnkTrks", it).add(undLnkTrk)
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
         * Returns an immutable instance of [AirspacecontrolorderAbridged].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .opExName()
         * .originator()
         * .source()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirspacecontrolorderAbridged =
            AirspacecontrolorderAbridged(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("opExName", opExName),
                checkRequired("originator", originator),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                acoComments,
                acoSerialNum,
                (airspaceControlMeansStatus ?: JsonMissing.of()).map { it.toImmutable() },
                (airspaceControlOrderReferences ?: JsonMissing.of()).map { it.toImmutable() },
                areaOfValidity,
                (classReasons ?: JsonMissing.of()).map { it.toImmutable() },
                classSource,
                createdAt,
                createdBy,
                (declassExemptionCodes ?: JsonMissing.of()).map { it.toImmutable() },
                (downgradeInsDates ?: JsonMissing.of()).map { it.toImmutable() },
                geoDatum,
                month,
                opExInfo,
                opExInfoAlt,
                origin,
                origNetwork,
                planOrigNum,
                qualifier,
                qualSn,
                serialNum,
                sourceDl,
                stopQualifier,
                stopTime,
                (undLnkTrks ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirspacecontrolorderAbridged = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        opExName()
        originator()
        source()
        startTime()
        id()
        acoComments()
        acoSerialNum()
        airspaceControlMeansStatus().ifPresent { it.forEach { it.validate() } }
        airspaceControlOrderReferences().ifPresent { it.forEach { it.validate() } }
        areaOfValidity()
        classReasons()
        classSource()
        createdAt()
        createdBy()
        declassExemptionCodes()
        downgradeInsDates()
        geoDatum()
        month()
        opExInfo()
        opExInfoAlt()
        origin()
        origNetwork()
        planOrigNum()
        qualifier()
        qualSn()
        serialNum()
        sourceDl()
        stopQualifier()
        stopTime()
        undLnkTrks()
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
            (if (opExName.asKnown().isPresent) 1 else 0) +
            (if (originator.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (acoComments.asKnown().isPresent) 1 else 0) +
            (if (acoSerialNum.asKnown().isPresent) 1 else 0) +
            (airspaceControlMeansStatus.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (airspaceControlOrderReferences.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (if (areaOfValidity.asKnown().isPresent) 1 else 0) +
            (classReasons.asKnown().getOrNull()?.size ?: 0) +
            (if (classSource.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (declassExemptionCodes.asKnown().getOrNull()?.size ?: 0) +
            (downgradeInsDates.asKnown().getOrNull()?.size ?: 0) +
            (if (geoDatum.asKnown().isPresent) 1 else 0) +
            (if (month.asKnown().isPresent) 1 else 0) +
            (if (opExInfo.asKnown().isPresent) 1 else 0) +
            (if (opExInfoAlt.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (planOrigNum.asKnown().isPresent) 1 else 0) +
            (if (qualifier.asKnown().isPresent) 1 else 0) +
            (if (qualSn.asKnown().isPresent) 1 else 0) +
            (if (serialNum.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (stopQualifier.asKnown().isPresent) 1 else 0) +
            (if (stopTime.asKnown().isPresent) 1 else 0) +
            (undLnkTrks.asKnown().getOrNull()?.size ?: 0)

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

    /**
     * Mandatory nested segment to report multiple airspace control means statuses within an ACOID.
     */
    class AirspaceControlMeansStatus
    private constructor(
        private val airspaceControlMeans: JsonField<List<AirspaceControlMean>>,
        private val cmStat: JsonField<String>,
        private val cmStatId: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("airspaceControlMeans")
            @ExcludeMissing
            airspaceControlMeans: JsonField<List<AirspaceControlMean>> = JsonMissing.of(),
            @JsonProperty("cmStat") @ExcludeMissing cmStat: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cmStatId")
            @ExcludeMissing
            cmStatId: JsonField<List<String>> = JsonMissing.of(),
        ) : this(airspaceControlMeans, cmStat, cmStatId, mutableMapOf())

        /**
         * A conditional nested segment to report multiple airspace control means within a
         * particular airspace control means status.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun airspaceControlMeans(): Optional<List<AirspaceControlMean>> =
            airspaceControlMeans.getOptional("airspaceControlMeans")

        /**
         * Status of Airspace Control Means. Must be ADD, CHANGE, or DELETE.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cmStat(): Optional<String> = cmStat.getOptional("cmStat")

        /**
         * Airspace control means name or designator. Mandatory if acmStat equals "DELETE,"
         * otherwise this field is prohibited.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun cmStatId(): Optional<List<String>> = cmStatId.getOptional("cmStatId")

        /**
         * Returns the raw JSON value of [airspaceControlMeans].
         *
         * Unlike [airspaceControlMeans], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("airspaceControlMeans")
        @ExcludeMissing
        fun _airspaceControlMeans(): JsonField<List<AirspaceControlMean>> = airspaceControlMeans

        /**
         * Returns the raw JSON value of [cmStat].
         *
         * Unlike [cmStat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cmStat") @ExcludeMissing fun _cmStat(): JsonField<String> = cmStat

        /**
         * Returns the raw JSON value of [cmStatId].
         *
         * Unlike [cmStatId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cmStatId")
        @ExcludeMissing
        fun _cmStatId(): JsonField<List<String>> = cmStatId

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
             * Returns a mutable builder for constructing an instance of
             * [AirspaceControlMeansStatus].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AirspaceControlMeansStatus]. */
        class Builder internal constructor() {

            private var airspaceControlMeans: JsonField<MutableList<AirspaceControlMean>>? = null
            private var cmStat: JsonField<String> = JsonMissing.of()
            private var cmStatId: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(airspaceControlMeansStatus: AirspaceControlMeansStatus) = apply {
                airspaceControlMeans =
                    airspaceControlMeansStatus.airspaceControlMeans.map { it.toMutableList() }
                cmStat = airspaceControlMeansStatus.cmStat
                cmStatId = airspaceControlMeansStatus.cmStatId.map { it.toMutableList() }
                additionalProperties =
                    airspaceControlMeansStatus.additionalProperties.toMutableMap()
            }

            /**
             * A conditional nested segment to report multiple airspace control means within a
             * particular airspace control means status.
             */
            fun airspaceControlMeans(airspaceControlMeans: List<AirspaceControlMean>) =
                airspaceControlMeans(JsonField.of(airspaceControlMeans))

            /**
             * Sets [Builder.airspaceControlMeans] to an arbitrary JSON value.
             *
             * You should usually call [Builder.airspaceControlMeans] with a well-typed
             * `List<AirspaceControlMean>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun airspaceControlMeans(airspaceControlMeans: JsonField<List<AirspaceControlMean>>) =
                apply {
                    this.airspaceControlMeans = airspaceControlMeans.map { it.toMutableList() }
                }

            /**
             * Adds a single [AirspaceControlMean] to [airspaceControlMeans].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAirspaceControlMean(airspaceControlMean: AirspaceControlMean) = apply {
                airspaceControlMeans =
                    (airspaceControlMeans ?: JsonField.of(mutableListOf())).also {
                        checkKnown("airspaceControlMeans", it).add(airspaceControlMean)
                    }
            }

            /** Status of Airspace Control Means. Must be ADD, CHANGE, or DELETE. */
            fun cmStat(cmStat: String) = cmStat(JsonField.of(cmStat))

            /**
             * Sets [Builder.cmStat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cmStat] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cmStat(cmStat: JsonField<String>) = apply { this.cmStat = cmStat }

            /**
             * Airspace control means name or designator. Mandatory if acmStat equals "DELETE,"
             * otherwise this field is prohibited.
             */
            fun cmStatId(cmStatId: List<String>) = cmStatId(JsonField.of(cmStatId))

            /**
             * Sets [Builder.cmStatId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cmStatId] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cmStatId(cmStatId: JsonField<List<String>>) = apply {
                this.cmStatId = cmStatId.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.cmStatId].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCmStatId(cmStatId: String) = apply {
                this.cmStatId =
                    (this.cmStatId ?: JsonField.of(mutableListOf())).also {
                        checkKnown("cmStatId", it).add(cmStatId)
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
             * Returns an immutable instance of [AirspaceControlMeansStatus].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AirspaceControlMeansStatus =
                AirspaceControlMeansStatus(
                    (airspaceControlMeans ?: JsonMissing.of()).map { it.toImmutable() },
                    cmStat,
                    (cmStatId ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AirspaceControlMeansStatus = apply {
            if (validated) {
                return@apply
            }

            airspaceControlMeans().ifPresent { it.forEach { it.validate() } }
            cmStat()
            cmStatId()
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
            (airspaceControlMeans.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (cmStat.asKnown().isPresent) 1 else 0) +
                (cmStatId.asKnown().getOrNull()?.size ?: 0)

        /**
         * A conditional nested segment to report multiple airspace control means within a
         * particular airspace control means status.
         */
        class AirspaceControlMean
        private constructor(
            private val airspaceControlPoint: JsonField<List<AirspaceControlPoint>>,
            private val airspaceTimePeriod: JsonField<List<AirspaceTimePeriod>>,
            private val bearing0: JsonField<Double>,
            private val bearing1: JsonField<Double>,
            private val cmId: JsonField<String>,
            private val cmShape: JsonField<CmShape>,
            private val cmType: JsonField<String>,
            private val cntrlAuth: JsonField<String>,
            private val cntrlAuthFreqs: JsonField<List<String>>,
            private val coord0: JsonField<String>,
            private val coord1: JsonField<String>,
            private val corrWayPoints: JsonField<List<String>>,
            private val effVDim: JsonField<String>,
            private val freeText: JsonField<String>,
            private val genTextInd: JsonField<String>,
            private val geoDatumAlt: JsonField<String>,
            private val link16Id: JsonField<String>,
            private val orbitAlignment: JsonField<String>,
            private val polyCoord: JsonField<List<String>>,
            private val radMag0: JsonField<Double>,
            private val radMag1: JsonField<Double>,
            private val radMagUnit: JsonField<String>,
            private val trackLeg: JsonField<Int>,
            private val transAltitude: JsonField<String>,
            private val usage: JsonField<String>,
            private val width: JsonField<Double>,
            private val widthLeft: JsonField<Double>,
            private val widthRight: JsonField<Double>,
            private val widthUnit: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("airspaceControlPoint")
                @ExcludeMissing
                airspaceControlPoint: JsonField<List<AirspaceControlPoint>> = JsonMissing.of(),
                @JsonProperty("airspaceTimePeriod")
                @ExcludeMissing
                airspaceTimePeriod: JsonField<List<AirspaceTimePeriod>> = JsonMissing.of(),
                @JsonProperty("bearing0")
                @ExcludeMissing
                bearing0: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("bearing1")
                @ExcludeMissing
                bearing1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("cmId") @ExcludeMissing cmId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cmShape")
                @ExcludeMissing
                cmShape: JsonField<CmShape> = JsonMissing.of(),
                @JsonProperty("cmType")
                @ExcludeMissing
                cmType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cntrlAuth")
                @ExcludeMissing
                cntrlAuth: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cntrlAuthFreqs")
                @ExcludeMissing
                cntrlAuthFreqs: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("coord0")
                @ExcludeMissing
                coord0: JsonField<String> = JsonMissing.of(),
                @JsonProperty("coord1")
                @ExcludeMissing
                coord1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("corrWayPoints")
                @ExcludeMissing
                corrWayPoints: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("effVDim")
                @ExcludeMissing
                effVDim: JsonField<String> = JsonMissing.of(),
                @JsonProperty("freeText")
                @ExcludeMissing
                freeText: JsonField<String> = JsonMissing.of(),
                @JsonProperty("genTextInd")
                @ExcludeMissing
                genTextInd: JsonField<String> = JsonMissing.of(),
                @JsonProperty("geoDatumAlt")
                @ExcludeMissing
                geoDatumAlt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("link16Id")
                @ExcludeMissing
                link16Id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("orbitAlignment")
                @ExcludeMissing
                orbitAlignment: JsonField<String> = JsonMissing.of(),
                @JsonProperty("polyCoord")
                @ExcludeMissing
                polyCoord: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("radMag0")
                @ExcludeMissing
                radMag0: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("radMag1")
                @ExcludeMissing
                radMag1: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("radMagUnit")
                @ExcludeMissing
                radMagUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trackLeg")
                @ExcludeMissing
                trackLeg: JsonField<Int> = JsonMissing.of(),
                @JsonProperty("transAltitude")
                @ExcludeMissing
                transAltitude: JsonField<String> = JsonMissing.of(),
                @JsonProperty("usage") @ExcludeMissing usage: JsonField<String> = JsonMissing.of(),
                @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("widthLeft")
                @ExcludeMissing
                widthLeft: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("widthRight")
                @ExcludeMissing
                widthRight: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("widthUnit")
                @ExcludeMissing
                widthUnit: JsonField<String> = JsonMissing.of(),
            ) : this(
                airspaceControlPoint,
                airspaceTimePeriod,
                bearing0,
                bearing1,
                cmId,
                cmShape,
                cmType,
                cntrlAuth,
                cntrlAuthFreqs,
                coord0,
                coord1,
                corrWayPoints,
                effVDim,
                freeText,
                genTextInd,
                geoDatumAlt,
                link16Id,
                orbitAlignment,
                polyCoord,
                radMag0,
                radMag1,
                radMagUnit,
                trackLeg,
                transAltitude,
                usage,
                width,
                widthLeft,
                widthRight,
                widthUnit,
                mutableMapOf(),
            )

            /**
             * The controlPoint set describes any reference/controlling/rendezvous point for a given
             * airspace control means.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun airspaceControlPoint(): Optional<List<AirspaceControlPoint>> =
                airspaceControlPoint.getOptional("airspaceControlPoint")

            /**
             * The timePeriods set describes the effective datetime for a given airspace control
             * means.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun airspaceTimePeriod(): Optional<List<AirspaceTimePeriod>> =
                airspaceTimePeriod.getOptional("airspaceTimePeriod")

            /**
             * A bearing measured from true North, in angular degrees. If cmShape is set to
             * "POLYARC" or "RADARC", this field is required and is mapped to the "beginning" radial
             * bearing parameter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bearing0(): Optional<Double> = bearing0.getOptional("bearing0")

            /**
             * A bearing measured from true North, in angular degrees. If cmShape is set to
             * "POLYARC" or "RADARC", this field is required and is mapped to the "ending" radial
             * bearing parameter.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun bearing1(): Optional<Double> = bearing1.getOptional("bearing1")

            /**
             * Airspace control means name or designator.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cmId(): Optional<String> = cmId.getOptional("cmId")

            /**
             * Designates the geometric type that defines the airspace shape. One of CIRCLE,
             * CORRIDOR, LINE, ORBIT, etc.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cmShape(): Optional<CmShape> = cmShape.getOptional("cmShape")

            /**
             * The code for the type of airspace control means.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cmType(): Optional<String> = cmType.getOptional("cmType")

            /**
             * The commander responsible within a specified geographical area for the airspace
             * control operation assigned to him.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cntrlAuth(): Optional<String> = cntrlAuth.getOptional("cntrlAuth")

            /**
             * The frequency for the airspace control authority. Can specify HZ, KHZ, MHZ, GHZ or a
             * DESIG frequency designator code.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cntrlAuthFreqs(): Optional<List<String>> =
                cntrlAuthFreqs.getOptional("cntrlAuthFreqs")

            /**
             * A geospatial point coordinate specified in DMS (Degrees, Minutes, Seconds) format.
             * The fields coord0 and coord1 should be used in the specification of any airspace
             * control shape that requires exactly one (1) or two (2) reference points for
             * construction. For shapes requiring one reference point, for instance, when cmShape is
             * set to "APOINT", this field is required and singularly defines the shape. Similarly,
             * this field is required to define the center point of a "CIRCLE" shape, or the "origin
             * of bearing" for arcs.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun coord0(): Optional<String> = coord0.getOptional("coord0")

            /**
             * A geospatial point coordinate specified in DMS (Degrees, Minutes, Seconds) format.
             * The fields coord0 and coord1 should be used in the specification of any airspace
             * control shape that requires exactly one (1) or two (2) reference points for
             * construction. For shapes requiring one reference point, for instance, when cmShape is
             * set to "APOINT", this field is required and singularly defines the shape. Similarly,
             * this field is required to define the center point of a "CIRCLE" shape, or the "origin
             * of bearing" for arcs.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun coord1(): Optional<String> = coord1.getOptional("coord1")

            /**
             * An array of at least two alphanumeric symbols used to serially identify the corridor
             * waypoints. If cmShape is set to "CORRIDOR", one of either corrWayPoints or polyCoord
             * is required to specify the centerline of the corridor path.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun corrWayPoints(): Optional<List<String>> = corrWayPoints.getOptional("corrWayPoints")

            /**
             * Description of the airspace vertical dimension.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun effVDim(): Optional<String> = effVDim.getOptional("effVDim")

            /**
             * General informat detailing the transit instruction for the airspace control means.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun freeText(): Optional<String> = freeText.getOptional("freeText")

            /**
             * Used to provide transit instructions for the airspace control means.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun genTextInd(): Optional<String> = genTextInd.getOptional("genTextInd")

            /**
             * Specifies the geodetic datum by which the spatial coordinates of the controlled
             * airspace are calculated, if different from the top level ACO datum.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun geoDatumAlt(): Optional<String> = geoDatumAlt.getOptional("geoDatumAlt")

            /**
             * Unique Link 16 identifier assigned to the airspace control means.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun link16Id(): Optional<String> = link16Id.getOptional("link16Id")

            /**
             * Orbit alignment look-up code. Can be C=Center, L=Left, R=Right.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun orbitAlignment(): Optional<String> = orbitAlignment.getOptional("orbitAlignment")

            /**
             * A set of geospatial coordinates specified in DMS (Degrees, Minutes, Seconds) format
             * which determine the vertices of a one or two dimensional geospatial shape. When
             * cmShape is set to "POLYARC" or "POLYGON", this field is required as applied in the
             * construction of the area boundary. If cmShape is set to "CORRIDOR" or "GEOLINE", this
             * field is required and can be interpreted as an ordered set of points along a path in
             * space.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun polyCoord(): Optional<List<String>> = polyCoord.getOptional("polyCoord")

            /**
             * A distance that represents a radial magnitude. If cmShape is set to "CIRCLE" or
             * "POLYARC", one of either fields radMag0 or radMag1 is required. If cmShape is set to
             * "RADARC", this field is required and maps to the "inner" radial magnitude arc limit.
             * If provided, the field radMagUnit is required.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun radMag0(): Optional<Double> = radMag0.getOptional("radMag0")

            /**
             * A distance that represents a radial magnitude. If cmShape is set to "CIRCLE" or
             * "POLYARC", one of either fields radMag0 or radMag1 is required. If cmShape is set to
             * "RADARC", this field is required and maps to the "outer" radial magnitude arc limit.
             * If provided, the field radMagUnit is required.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun radMag1(): Optional<Double> = radMag1.getOptional("radMag1")

            /**
             * Specifies the unit of length in which radial magnitudes are given. Use M for meters,
             * KM for kilometers, or NM for nautical miles.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun radMagUnit(): Optional<String> = radMagUnit.getOptional("radMagUnit")

            /**
             * Index of a segment in an airtrack, which is defined by an ordered set of points.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun trackLeg(): Optional<Int> = trackLeg.getOptional("trackLeg")

            /**
             * The altitude at or below which the vertical position of an aircraft is controlled by
             * reference to true altitude.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun transAltitude(): Optional<String> = transAltitude.getOptional("transAltitude")

            /**
             * Designates the means by which a defined airspace control means is to be used.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun usage(): Optional<String> = usage.getOptional("usage")

            /**
             * Used to describe the "side to side" distance of a target, object or area. If cmShape
             * is set to "CORRIDOR" or "AORBIT", this field is required and is mapped to the width
             * parameter. If provided, the field widthUnit is required.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun width(): Optional<Double> = width.getOptional("width")

            /**
             * Given an ordered pair of spatial coordinates (p0, p1), defines a distance extending
             * into the LEFT half-plane relative to the direction of the vector that maps p0 to p1.
             * If cmShape is set to "1TRACK", this field is required to define the width of the
             * airspace track as measured from the left of the track segment line. If provided, the
             * field widthUnit is required.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun widthLeft(): Optional<Double> = widthLeft.getOptional("widthLeft")

            /**
             * Given an ordered pair of spatial coordinates (p0, p1), defines a distance extending
             * into the RIGHT half-plane relative to the direction of the vector that maps p0 to p1.
             * If cmShape is set to "1TRACK", this field is required to define the width of the
             * airspace track as measured from the right of the track segment line. If provided, the
             * field widthUnit is required.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun widthRight(): Optional<Double> = widthRight.getOptional("widthRight")

            /**
             * Specifies the unit of length for which widths are given. Use M for meters, KM for
             * kilometers, or NM for nautical miles.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun widthUnit(): Optional<String> = widthUnit.getOptional("widthUnit")

            /**
             * Returns the raw JSON value of [airspaceControlPoint].
             *
             * Unlike [airspaceControlPoint], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("airspaceControlPoint")
            @ExcludeMissing
            fun _airspaceControlPoint(): JsonField<List<AirspaceControlPoint>> =
                airspaceControlPoint

            /**
             * Returns the raw JSON value of [airspaceTimePeriod].
             *
             * Unlike [airspaceTimePeriod], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("airspaceTimePeriod")
            @ExcludeMissing
            fun _airspaceTimePeriod(): JsonField<List<AirspaceTimePeriod>> = airspaceTimePeriod

            /**
             * Returns the raw JSON value of [bearing0].
             *
             * Unlike [bearing0], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bearing0") @ExcludeMissing fun _bearing0(): JsonField<Double> = bearing0

            /**
             * Returns the raw JSON value of [bearing1].
             *
             * Unlike [bearing1], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bearing1") @ExcludeMissing fun _bearing1(): JsonField<Double> = bearing1

            /**
             * Returns the raw JSON value of [cmId].
             *
             * Unlike [cmId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cmId") @ExcludeMissing fun _cmId(): JsonField<String> = cmId

            /**
             * Returns the raw JSON value of [cmShape].
             *
             * Unlike [cmShape], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cmShape") @ExcludeMissing fun _cmShape(): JsonField<CmShape> = cmShape

            /**
             * Returns the raw JSON value of [cmType].
             *
             * Unlike [cmType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("cmType") @ExcludeMissing fun _cmType(): JsonField<String> = cmType

            /**
             * Returns the raw JSON value of [cntrlAuth].
             *
             * Unlike [cntrlAuth], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cntrlAuth")
            @ExcludeMissing
            fun _cntrlAuth(): JsonField<String> = cntrlAuth

            /**
             * Returns the raw JSON value of [cntrlAuthFreqs].
             *
             * Unlike [cntrlAuthFreqs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("cntrlAuthFreqs")
            @ExcludeMissing
            fun _cntrlAuthFreqs(): JsonField<List<String>> = cntrlAuthFreqs

            /**
             * Returns the raw JSON value of [coord0].
             *
             * Unlike [coord0], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("coord0") @ExcludeMissing fun _coord0(): JsonField<String> = coord0

            /**
             * Returns the raw JSON value of [coord1].
             *
             * Unlike [coord1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("coord1") @ExcludeMissing fun _coord1(): JsonField<String> = coord1

            /**
             * Returns the raw JSON value of [corrWayPoints].
             *
             * Unlike [corrWayPoints], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("corrWayPoints")
            @ExcludeMissing
            fun _corrWayPoints(): JsonField<List<String>> = corrWayPoints

            /**
             * Returns the raw JSON value of [effVDim].
             *
             * Unlike [effVDim], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("effVDim") @ExcludeMissing fun _effVDim(): JsonField<String> = effVDim

            /**
             * Returns the raw JSON value of [freeText].
             *
             * Unlike [freeText], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("freeText") @ExcludeMissing fun _freeText(): JsonField<String> = freeText

            /**
             * Returns the raw JSON value of [genTextInd].
             *
             * Unlike [genTextInd], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("genTextInd")
            @ExcludeMissing
            fun _genTextInd(): JsonField<String> = genTextInd

            /**
             * Returns the raw JSON value of [geoDatumAlt].
             *
             * Unlike [geoDatumAlt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("geoDatumAlt")
            @ExcludeMissing
            fun _geoDatumAlt(): JsonField<String> = geoDatumAlt

            /**
             * Returns the raw JSON value of [link16Id].
             *
             * Unlike [link16Id], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("link16Id") @ExcludeMissing fun _link16Id(): JsonField<String> = link16Id

            /**
             * Returns the raw JSON value of [orbitAlignment].
             *
             * Unlike [orbitAlignment], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("orbitAlignment")
            @ExcludeMissing
            fun _orbitAlignment(): JsonField<String> = orbitAlignment

            /**
             * Returns the raw JSON value of [polyCoord].
             *
             * Unlike [polyCoord], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("polyCoord")
            @ExcludeMissing
            fun _polyCoord(): JsonField<List<String>> = polyCoord

            /**
             * Returns the raw JSON value of [radMag0].
             *
             * Unlike [radMag0], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("radMag0") @ExcludeMissing fun _radMag0(): JsonField<Double> = radMag0

            /**
             * Returns the raw JSON value of [radMag1].
             *
             * Unlike [radMag1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("radMag1") @ExcludeMissing fun _radMag1(): JsonField<Double> = radMag1

            /**
             * Returns the raw JSON value of [radMagUnit].
             *
             * Unlike [radMagUnit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("radMagUnit")
            @ExcludeMissing
            fun _radMagUnit(): JsonField<String> = radMagUnit

            /**
             * Returns the raw JSON value of [trackLeg].
             *
             * Unlike [trackLeg], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trackLeg") @ExcludeMissing fun _trackLeg(): JsonField<Int> = trackLeg

            /**
             * Returns the raw JSON value of [transAltitude].
             *
             * Unlike [transAltitude], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transAltitude")
            @ExcludeMissing
            fun _transAltitude(): JsonField<String> = transAltitude

            /**
             * Returns the raw JSON value of [usage].
             *
             * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<String> = usage

            /**
             * Returns the raw JSON value of [width].
             *
             * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

            /**
             * Returns the raw JSON value of [widthLeft].
             *
             * Unlike [widthLeft], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("widthLeft")
            @ExcludeMissing
            fun _widthLeft(): JsonField<Double> = widthLeft

            /**
             * Returns the raw JSON value of [widthRight].
             *
             * Unlike [widthRight], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("widthRight")
            @ExcludeMissing
            fun _widthRight(): JsonField<Double> = widthRight

            /**
             * Returns the raw JSON value of [widthUnit].
             *
             * Unlike [widthUnit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("widthUnit")
            @ExcludeMissing
            fun _widthUnit(): JsonField<String> = widthUnit

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
                 * Returns a mutable builder for constructing an instance of [AirspaceControlMean].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AirspaceControlMean]. */
            class Builder internal constructor() {

                private var airspaceControlPoint: JsonField<MutableList<AirspaceControlPoint>>? =
                    null
                private var airspaceTimePeriod: JsonField<MutableList<AirspaceTimePeriod>>? = null
                private var bearing0: JsonField<Double> = JsonMissing.of()
                private var bearing1: JsonField<Double> = JsonMissing.of()
                private var cmId: JsonField<String> = JsonMissing.of()
                private var cmShape: JsonField<CmShape> = JsonMissing.of()
                private var cmType: JsonField<String> = JsonMissing.of()
                private var cntrlAuth: JsonField<String> = JsonMissing.of()
                private var cntrlAuthFreqs: JsonField<MutableList<String>>? = null
                private var coord0: JsonField<String> = JsonMissing.of()
                private var coord1: JsonField<String> = JsonMissing.of()
                private var corrWayPoints: JsonField<MutableList<String>>? = null
                private var effVDim: JsonField<String> = JsonMissing.of()
                private var freeText: JsonField<String> = JsonMissing.of()
                private var genTextInd: JsonField<String> = JsonMissing.of()
                private var geoDatumAlt: JsonField<String> = JsonMissing.of()
                private var link16Id: JsonField<String> = JsonMissing.of()
                private var orbitAlignment: JsonField<String> = JsonMissing.of()
                private var polyCoord: JsonField<MutableList<String>>? = null
                private var radMag0: JsonField<Double> = JsonMissing.of()
                private var radMag1: JsonField<Double> = JsonMissing.of()
                private var radMagUnit: JsonField<String> = JsonMissing.of()
                private var trackLeg: JsonField<Int> = JsonMissing.of()
                private var transAltitude: JsonField<String> = JsonMissing.of()
                private var usage: JsonField<String> = JsonMissing.of()
                private var width: JsonField<Double> = JsonMissing.of()
                private var widthLeft: JsonField<Double> = JsonMissing.of()
                private var widthRight: JsonField<Double> = JsonMissing.of()
                private var widthUnit: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(airspaceControlMean: AirspaceControlMean) = apply {
                    airspaceControlPoint =
                        airspaceControlMean.airspaceControlPoint.map { it.toMutableList() }
                    airspaceTimePeriod =
                        airspaceControlMean.airspaceTimePeriod.map { it.toMutableList() }
                    bearing0 = airspaceControlMean.bearing0
                    bearing1 = airspaceControlMean.bearing1
                    cmId = airspaceControlMean.cmId
                    cmShape = airspaceControlMean.cmShape
                    cmType = airspaceControlMean.cmType
                    cntrlAuth = airspaceControlMean.cntrlAuth
                    cntrlAuthFreqs = airspaceControlMean.cntrlAuthFreqs.map { it.toMutableList() }
                    coord0 = airspaceControlMean.coord0
                    coord1 = airspaceControlMean.coord1
                    corrWayPoints = airspaceControlMean.corrWayPoints.map { it.toMutableList() }
                    effVDim = airspaceControlMean.effVDim
                    freeText = airspaceControlMean.freeText
                    genTextInd = airspaceControlMean.genTextInd
                    geoDatumAlt = airspaceControlMean.geoDatumAlt
                    link16Id = airspaceControlMean.link16Id
                    orbitAlignment = airspaceControlMean.orbitAlignment
                    polyCoord = airspaceControlMean.polyCoord.map { it.toMutableList() }
                    radMag0 = airspaceControlMean.radMag0
                    radMag1 = airspaceControlMean.radMag1
                    radMagUnit = airspaceControlMean.radMagUnit
                    trackLeg = airspaceControlMean.trackLeg
                    transAltitude = airspaceControlMean.transAltitude
                    usage = airspaceControlMean.usage
                    width = airspaceControlMean.width
                    widthLeft = airspaceControlMean.widthLeft
                    widthRight = airspaceControlMean.widthRight
                    widthUnit = airspaceControlMean.widthUnit
                    additionalProperties = airspaceControlMean.additionalProperties.toMutableMap()
                }

                /**
                 * The controlPoint set describes any reference/controlling/rendezvous point for a
                 * given airspace control means.
                 */
                fun airspaceControlPoint(airspaceControlPoint: List<AirspaceControlPoint>) =
                    airspaceControlPoint(JsonField.of(airspaceControlPoint))

                /**
                 * Sets [Builder.airspaceControlPoint] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.airspaceControlPoint] with a well-typed
                 * `List<AirspaceControlPoint>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun airspaceControlPoint(
                    airspaceControlPoint: JsonField<List<AirspaceControlPoint>>
                ) = apply {
                    this.airspaceControlPoint = airspaceControlPoint.map { it.toMutableList() }
                }

                /**
                 * Adds a single [AirspaceControlPoint] to [Builder.airspaceControlPoint].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAirspaceControlPoint(airspaceControlPoint: AirspaceControlPoint) = apply {
                    this.airspaceControlPoint =
                        (this.airspaceControlPoint ?: JsonField.of(mutableListOf())).also {
                            checkKnown("airspaceControlPoint", it).add(airspaceControlPoint)
                        }
                }

                /**
                 * The timePeriods set describes the effective datetime for a given airspace control
                 * means.
                 */
                fun airspaceTimePeriod(airspaceTimePeriod: List<AirspaceTimePeriod>) =
                    airspaceTimePeriod(JsonField.of(airspaceTimePeriod))

                /**
                 * Sets [Builder.airspaceTimePeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.airspaceTimePeriod] with a well-typed
                 * `List<AirspaceTimePeriod>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun airspaceTimePeriod(airspaceTimePeriod: JsonField<List<AirspaceTimePeriod>>) =
                    apply {
                        this.airspaceTimePeriod = airspaceTimePeriod.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [AirspaceTimePeriod] to [Builder.airspaceTimePeriod].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addAirspaceTimePeriod(airspaceTimePeriod: AirspaceTimePeriod) = apply {
                    this.airspaceTimePeriod =
                        (this.airspaceTimePeriod ?: JsonField.of(mutableListOf())).also {
                            checkKnown("airspaceTimePeriod", it).add(airspaceTimePeriod)
                        }
                }

                /**
                 * A bearing measured from true North, in angular degrees. If cmShape is set to
                 * "POLYARC" or "RADARC", this field is required and is mapped to the "beginning"
                 * radial bearing parameter.
                 */
                fun bearing0(bearing0: Double) = bearing0(JsonField.of(bearing0))

                /**
                 * Sets [Builder.bearing0] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bearing0] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bearing0(bearing0: JsonField<Double>) = apply { this.bearing0 = bearing0 }

                /**
                 * A bearing measured from true North, in angular degrees. If cmShape is set to
                 * "POLYARC" or "RADARC", this field is required and is mapped to the "ending"
                 * radial bearing parameter.
                 */
                fun bearing1(bearing1: Double) = bearing1(JsonField.of(bearing1))

                /**
                 * Sets [Builder.bearing1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bearing1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bearing1(bearing1: JsonField<Double>) = apply { this.bearing1 = bearing1 }

                /** Airspace control means name or designator. */
                fun cmId(cmId: String) = cmId(JsonField.of(cmId))

                /**
                 * Sets [Builder.cmId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cmId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun cmId(cmId: JsonField<String>) = apply { this.cmId = cmId }

                /**
                 * Designates the geometric type that defines the airspace shape. One of CIRCLE,
                 * CORRIDOR, LINE, ORBIT, etc.
                 */
                fun cmShape(cmShape: CmShape) = cmShape(JsonField.of(cmShape))

                /**
                 * Sets [Builder.cmShape] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cmShape] with a well-typed [CmShape] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cmShape(cmShape: JsonField<CmShape>) = apply { this.cmShape = cmShape }

                /** The code for the type of airspace control means. */
                fun cmType(cmType: String) = cmType(JsonField.of(cmType))

                /**
                 * Sets [Builder.cmType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cmType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cmType(cmType: JsonField<String>) = apply { this.cmType = cmType }

                /**
                 * The commander responsible within a specified geographical area for the airspace
                 * control operation assigned to him.
                 */
                fun cntrlAuth(cntrlAuth: String) = cntrlAuth(JsonField.of(cntrlAuth))

                /**
                 * Sets [Builder.cntrlAuth] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cntrlAuth] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cntrlAuth(cntrlAuth: JsonField<String>) = apply { this.cntrlAuth = cntrlAuth }

                /**
                 * The frequency for the airspace control authority. Can specify HZ, KHZ, MHZ, GHZ
                 * or a DESIG frequency designator code.
                 */
                fun cntrlAuthFreqs(cntrlAuthFreqs: List<String>) =
                    cntrlAuthFreqs(JsonField.of(cntrlAuthFreqs))

                /**
                 * Sets [Builder.cntrlAuthFreqs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cntrlAuthFreqs] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun cntrlAuthFreqs(cntrlAuthFreqs: JsonField<List<String>>) = apply {
                    this.cntrlAuthFreqs = cntrlAuthFreqs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [cntrlAuthFreqs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCntrlAuthFreq(cntrlAuthFreq: String) = apply {
                    cntrlAuthFreqs =
                        (cntrlAuthFreqs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("cntrlAuthFreqs", it).add(cntrlAuthFreq)
                        }
                }

                /**
                 * A geospatial point coordinate specified in DMS (Degrees, Minutes, Seconds)
                 * format. The fields coord0 and coord1 should be used in the specification of any
                 * airspace control shape that requires exactly one (1) or two (2) reference points
                 * for construction. For shapes requiring one reference point, for instance, when
                 * cmShape is set to "APOINT", this field is required and singularly defines the
                 * shape. Similarly, this field is required to define the center point of a "CIRCLE"
                 * shape, or the "origin of bearing" for arcs.
                 */
                fun coord0(coord0: String) = coord0(JsonField.of(coord0))

                /**
                 * Sets [Builder.coord0] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coord0] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun coord0(coord0: JsonField<String>) = apply { this.coord0 = coord0 }

                /**
                 * A geospatial point coordinate specified in DMS (Degrees, Minutes, Seconds)
                 * format. The fields coord0 and coord1 should be used in the specification of any
                 * airspace control shape that requires exactly one (1) or two (2) reference points
                 * for construction. For shapes requiring one reference point, for instance, when
                 * cmShape is set to "APOINT", this field is required and singularly defines the
                 * shape. Similarly, this field is required to define the center point of a "CIRCLE"
                 * shape, or the "origin of bearing" for arcs.
                 */
                fun coord1(coord1: String) = coord1(JsonField.of(coord1))

                /**
                 * Sets [Builder.coord1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.coord1] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun coord1(coord1: JsonField<String>) = apply { this.coord1 = coord1 }

                /**
                 * An array of at least two alphanumeric symbols used to serially identify the
                 * corridor waypoints. If cmShape is set to "CORRIDOR", one of either corrWayPoints
                 * or polyCoord is required to specify the centerline of the corridor path.
                 */
                fun corrWayPoints(corrWayPoints: List<String>) =
                    corrWayPoints(JsonField.of(corrWayPoints))

                /**
                 * Sets [Builder.corrWayPoints] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.corrWayPoints] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun corrWayPoints(corrWayPoints: JsonField<List<String>>) = apply {
                    this.corrWayPoints = corrWayPoints.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [corrWayPoints].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCorrWayPoint(corrWayPoint: String) = apply {
                    corrWayPoints =
                        (corrWayPoints ?: JsonField.of(mutableListOf())).also {
                            checkKnown("corrWayPoints", it).add(corrWayPoint)
                        }
                }

                /** Description of the airspace vertical dimension. */
                fun effVDim(effVDim: String) = effVDim(JsonField.of(effVDim))

                /**
                 * Sets [Builder.effVDim] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effVDim] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun effVDim(effVDim: JsonField<String>) = apply { this.effVDim = effVDim }

                /**
                 * General informat detailing the transit instruction for the airspace control
                 * means.
                 */
                fun freeText(freeText: String) = freeText(JsonField.of(freeText))

                /**
                 * Sets [Builder.freeText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.freeText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun freeText(freeText: JsonField<String>) = apply { this.freeText = freeText }

                /** Used to provide transit instructions for the airspace control means. */
                fun genTextInd(genTextInd: String) = genTextInd(JsonField.of(genTextInd))

                /**
                 * Sets [Builder.genTextInd] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.genTextInd] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun genTextInd(genTextInd: JsonField<String>) = apply {
                    this.genTextInd = genTextInd
                }

                /**
                 * Specifies the geodetic datum by which the spatial coordinates of the controlled
                 * airspace are calculated, if different from the top level ACO datum.
                 */
                fun geoDatumAlt(geoDatumAlt: String) = geoDatumAlt(JsonField.of(geoDatumAlt))

                /**
                 * Sets [Builder.geoDatumAlt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.geoDatumAlt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun geoDatumAlt(geoDatumAlt: JsonField<String>) = apply {
                    this.geoDatumAlt = geoDatumAlt
                }

                /** Unique Link 16 identifier assigned to the airspace control means. */
                fun link16Id(link16Id: String) = link16Id(JsonField.of(link16Id))

                /**
                 * Sets [Builder.link16Id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.link16Id] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun link16Id(link16Id: JsonField<String>) = apply { this.link16Id = link16Id }

                /** Orbit alignment look-up code. Can be C=Center, L=Left, R=Right. */
                fun orbitAlignment(orbitAlignment: String) =
                    orbitAlignment(JsonField.of(orbitAlignment))

                /**
                 * Sets [Builder.orbitAlignment] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orbitAlignment] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orbitAlignment(orbitAlignment: JsonField<String>) = apply {
                    this.orbitAlignment = orbitAlignment
                }

                /**
                 * A set of geospatial coordinates specified in DMS (Degrees, Minutes, Seconds)
                 * format which determine the vertices of a one or two dimensional geospatial shape.
                 * When cmShape is set to "POLYARC" or "POLYGON", this field is required as applied
                 * in the construction of the area boundary. If cmShape is set to "CORRIDOR" or
                 * "GEOLINE", this field is required and can be interpreted as an ordered set of
                 * points along a path in space.
                 */
                fun polyCoord(polyCoord: List<String>) = polyCoord(JsonField.of(polyCoord))

                /**
                 * Sets [Builder.polyCoord] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.polyCoord] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun polyCoord(polyCoord: JsonField<List<String>>) = apply {
                    this.polyCoord = polyCoord.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.polyCoord].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPolyCoord(polyCoord: String) = apply {
                    this.polyCoord =
                        (this.polyCoord ?: JsonField.of(mutableListOf())).also {
                            checkKnown("polyCoord", it).add(polyCoord)
                        }
                }

                /**
                 * A distance that represents a radial magnitude. If cmShape is set to "CIRCLE" or
                 * "POLYARC", one of either fields radMag0 or radMag1 is required. If cmShape is set
                 * to "RADARC", this field is required and maps to the "inner" radial magnitude arc
                 * limit. If provided, the field radMagUnit is required.
                 */
                fun radMag0(radMag0: Double) = radMag0(JsonField.of(radMag0))

                /**
                 * Sets [Builder.radMag0] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.radMag0] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun radMag0(radMag0: JsonField<Double>) = apply { this.radMag0 = radMag0 }

                /**
                 * A distance that represents a radial magnitude. If cmShape is set to "CIRCLE" or
                 * "POLYARC", one of either fields radMag0 or radMag1 is required. If cmShape is set
                 * to "RADARC", this field is required and maps to the "outer" radial magnitude arc
                 * limit. If provided, the field radMagUnit is required.
                 */
                fun radMag1(radMag1: Double) = radMag1(JsonField.of(radMag1))

                /**
                 * Sets [Builder.radMag1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.radMag1] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun radMag1(radMag1: JsonField<Double>) = apply { this.radMag1 = radMag1 }

                /**
                 * Specifies the unit of length in which radial magnitudes are given. Use M for
                 * meters, KM for kilometers, or NM for nautical miles.
                 */
                fun radMagUnit(radMagUnit: String) = radMagUnit(JsonField.of(radMagUnit))

                /**
                 * Sets [Builder.radMagUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.radMagUnit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun radMagUnit(radMagUnit: JsonField<String>) = apply {
                    this.radMagUnit = radMagUnit
                }

                /**
                 * Index of a segment in an airtrack, which is defined by an ordered set of points.
                 */
                fun trackLeg(trackLeg: Int) = trackLeg(JsonField.of(trackLeg))

                /**
                 * Sets [Builder.trackLeg] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trackLeg] with a well-typed [Int] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun trackLeg(trackLeg: JsonField<Int>) = apply { this.trackLeg = trackLeg }

                /**
                 * The altitude at or below which the vertical position of an aircraft is controlled
                 * by reference to true altitude.
                 */
                fun transAltitude(transAltitude: String) =
                    transAltitude(JsonField.of(transAltitude))

                /**
                 * Sets [Builder.transAltitude] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transAltitude] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transAltitude(transAltitude: JsonField<String>) = apply {
                    this.transAltitude = transAltitude
                }

                /** Designates the means by which a defined airspace control means is to be used. */
                fun usage(usage: String) = usage(JsonField.of(usage))

                /**
                 * Sets [Builder.usage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usage] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun usage(usage: JsonField<String>) = apply { this.usage = usage }

                /**
                 * Used to describe the "side to side" distance of a target, object or area. If
                 * cmShape is set to "CORRIDOR" or "AORBIT", this field is required and is mapped to
                 * the width parameter. If provided, the field widthUnit is required.
                 */
                fun width(width: Double) = width(JsonField.of(width))

                /**
                 * Sets [Builder.width] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.width] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun width(width: JsonField<Double>) = apply { this.width = width }

                /**
                 * Given an ordered pair of spatial coordinates (p0, p1), defines a distance
                 * extending into the LEFT half-plane relative to the direction of the vector that
                 * maps p0 to p1. If cmShape is set to "1TRACK", this field is required to define
                 * the width of the airspace track as measured from the left of the track segment
                 * line. If provided, the field widthUnit is required.
                 */
                fun widthLeft(widthLeft: Double) = widthLeft(JsonField.of(widthLeft))

                /**
                 * Sets [Builder.widthLeft] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.widthLeft] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun widthLeft(widthLeft: JsonField<Double>) = apply { this.widthLeft = widthLeft }

                /**
                 * Given an ordered pair of spatial coordinates (p0, p1), defines a distance
                 * extending into the RIGHT half-plane relative to the direction of the vector that
                 * maps p0 to p1. If cmShape is set to "1TRACK", this field is required to define
                 * the width of the airspace track as measured from the right of the track segment
                 * line. If provided, the field widthUnit is required.
                 */
                fun widthRight(widthRight: Double) = widthRight(JsonField.of(widthRight))

                /**
                 * Sets [Builder.widthRight] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.widthRight] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun widthRight(widthRight: JsonField<Double>) = apply {
                    this.widthRight = widthRight
                }

                /**
                 * Specifies the unit of length for which widths are given. Use M for meters, KM for
                 * kilometers, or NM for nautical miles.
                 */
                fun widthUnit(widthUnit: String) = widthUnit(JsonField.of(widthUnit))

                /**
                 * Sets [Builder.widthUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.widthUnit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun widthUnit(widthUnit: JsonField<String>) = apply { this.widthUnit = widthUnit }

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
                 * Returns an immutable instance of [AirspaceControlMean].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AirspaceControlMean =
                    AirspaceControlMean(
                        (airspaceControlPoint ?: JsonMissing.of()).map { it.toImmutable() },
                        (airspaceTimePeriod ?: JsonMissing.of()).map { it.toImmutable() },
                        bearing0,
                        bearing1,
                        cmId,
                        cmShape,
                        cmType,
                        cntrlAuth,
                        (cntrlAuthFreqs ?: JsonMissing.of()).map { it.toImmutable() },
                        coord0,
                        coord1,
                        (corrWayPoints ?: JsonMissing.of()).map { it.toImmutable() },
                        effVDim,
                        freeText,
                        genTextInd,
                        geoDatumAlt,
                        link16Id,
                        orbitAlignment,
                        (polyCoord ?: JsonMissing.of()).map { it.toImmutable() },
                        radMag0,
                        radMag1,
                        radMagUnit,
                        trackLeg,
                        transAltitude,
                        usage,
                        width,
                        widthLeft,
                        widthRight,
                        widthUnit,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AirspaceControlMean = apply {
                if (validated) {
                    return@apply
                }

                airspaceControlPoint().ifPresent { it.forEach { it.validate() } }
                airspaceTimePeriod().ifPresent { it.forEach { it.validate() } }
                bearing0()
                bearing1()
                cmId()
                cmShape().ifPresent { it.validate() }
                cmType()
                cntrlAuth()
                cntrlAuthFreqs()
                coord0()
                coord1()
                corrWayPoints()
                effVDim()
                freeText()
                genTextInd()
                geoDatumAlt()
                link16Id()
                orbitAlignment()
                polyCoord()
                radMag0()
                radMag1()
                radMagUnit()
                trackLeg()
                transAltitude()
                usage()
                width()
                widthLeft()
                widthRight()
                widthUnit()
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
                (airspaceControlPoint.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (airspaceTimePeriod.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                        ?: 0) +
                    (if (bearing0.asKnown().isPresent) 1 else 0) +
                    (if (bearing1.asKnown().isPresent) 1 else 0) +
                    (if (cmId.asKnown().isPresent) 1 else 0) +
                    (cmShape.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (cmType.asKnown().isPresent) 1 else 0) +
                    (if (cntrlAuth.asKnown().isPresent) 1 else 0) +
                    (cntrlAuthFreqs.asKnown().getOrNull()?.size ?: 0) +
                    (if (coord0.asKnown().isPresent) 1 else 0) +
                    (if (coord1.asKnown().isPresent) 1 else 0) +
                    (corrWayPoints.asKnown().getOrNull()?.size ?: 0) +
                    (if (effVDim.asKnown().isPresent) 1 else 0) +
                    (if (freeText.asKnown().isPresent) 1 else 0) +
                    (if (genTextInd.asKnown().isPresent) 1 else 0) +
                    (if (geoDatumAlt.asKnown().isPresent) 1 else 0) +
                    (if (link16Id.asKnown().isPresent) 1 else 0) +
                    (if (orbitAlignment.asKnown().isPresent) 1 else 0) +
                    (polyCoord.asKnown().getOrNull()?.size ?: 0) +
                    (if (radMag0.asKnown().isPresent) 1 else 0) +
                    (if (radMag1.asKnown().isPresent) 1 else 0) +
                    (if (radMagUnit.asKnown().isPresent) 1 else 0) +
                    (if (trackLeg.asKnown().isPresent) 1 else 0) +
                    (if (transAltitude.asKnown().isPresent) 1 else 0) +
                    (if (usage.asKnown().isPresent) 1 else 0) +
                    (if (width.asKnown().isPresent) 1 else 0) +
                    (if (widthLeft.asKnown().isPresent) 1 else 0) +
                    (if (widthRight.asKnown().isPresent) 1 else 0) +
                    (if (widthUnit.asKnown().isPresent) 1 else 0)

            /**
             * The controlPoint set describes any reference/controlling/rendezvous point for a given
             * airspace control means.
             */
            class AirspaceControlPoint
            private constructor(
                private val ctrlPtAltitude: JsonField<String>,
                private val ctrlPtLocation: JsonField<String>,
                private val ctrlPtName: JsonField<String>,
                private val ctrlPtType: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("ctrlPtAltitude")
                    @ExcludeMissing
                    ctrlPtAltitude: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ctrlPtLocation")
                    @ExcludeMissing
                    ctrlPtLocation: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ctrlPtName")
                    @ExcludeMissing
                    ctrlPtName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ctrlPtType")
                    @ExcludeMissing
                    ctrlPtType: JsonField<String> = JsonMissing.of(),
                ) : this(ctrlPtAltitude, ctrlPtLocation, ctrlPtName, ctrlPtType, mutableMapOf())

                /**
                 * The altitude of the control point.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun ctrlPtAltitude(): Optional<String> =
                    ctrlPtAltitude.getOptional("ctrlPtAltitude")

                /**
                 * A geospatial point coordinate specified in DMS (Degrees, Minutes, Seconds) format
                 * that represents the location of the control point.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun ctrlPtLocation(): Optional<String> =
                    ctrlPtLocation.getOptional("ctrlPtLocation")

                /**
                 * The name applied to the control point, used as a reference.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun ctrlPtName(): Optional<String> = ctrlPtName.getOptional("ctrlPtName")

                /**
                 * One of possible control point type codes, such as CP, ER, OT, etc.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun ctrlPtType(): Optional<String> = ctrlPtType.getOptional("ctrlPtType")

                /**
                 * Returns the raw JSON value of [ctrlPtAltitude].
                 *
                 * Unlike [ctrlPtAltitude], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ctrlPtAltitude")
                @ExcludeMissing
                fun _ctrlPtAltitude(): JsonField<String> = ctrlPtAltitude

                /**
                 * Returns the raw JSON value of [ctrlPtLocation].
                 *
                 * Unlike [ctrlPtLocation], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ctrlPtLocation")
                @ExcludeMissing
                fun _ctrlPtLocation(): JsonField<String> = ctrlPtLocation

                /**
                 * Returns the raw JSON value of [ctrlPtName].
                 *
                 * Unlike [ctrlPtName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ctrlPtName")
                @ExcludeMissing
                fun _ctrlPtName(): JsonField<String> = ctrlPtName

                /**
                 * Returns the raw JSON value of [ctrlPtType].
                 *
                 * Unlike [ctrlPtType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ctrlPtType")
                @ExcludeMissing
                fun _ctrlPtType(): JsonField<String> = ctrlPtType

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
                     * Returns a mutable builder for constructing an instance of
                     * [AirspaceControlPoint].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AirspaceControlPoint]. */
                class Builder internal constructor() {

                    private var ctrlPtAltitude: JsonField<String> = JsonMissing.of()
                    private var ctrlPtLocation: JsonField<String> = JsonMissing.of()
                    private var ctrlPtName: JsonField<String> = JsonMissing.of()
                    private var ctrlPtType: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(airspaceControlPoint: AirspaceControlPoint) = apply {
                        ctrlPtAltitude = airspaceControlPoint.ctrlPtAltitude
                        ctrlPtLocation = airspaceControlPoint.ctrlPtLocation
                        ctrlPtName = airspaceControlPoint.ctrlPtName
                        ctrlPtType = airspaceControlPoint.ctrlPtType
                        additionalProperties =
                            airspaceControlPoint.additionalProperties.toMutableMap()
                    }

                    /** The altitude of the control point. */
                    fun ctrlPtAltitude(ctrlPtAltitude: String) =
                        ctrlPtAltitude(JsonField.of(ctrlPtAltitude))

                    /**
                     * Sets [Builder.ctrlPtAltitude] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ctrlPtAltitude] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun ctrlPtAltitude(ctrlPtAltitude: JsonField<String>) = apply {
                        this.ctrlPtAltitude = ctrlPtAltitude
                    }

                    /**
                     * A geospatial point coordinate specified in DMS (Degrees, Minutes, Seconds)
                     * format that represents the location of the control point.
                     */
                    fun ctrlPtLocation(ctrlPtLocation: String) =
                        ctrlPtLocation(JsonField.of(ctrlPtLocation))

                    /**
                     * Sets [Builder.ctrlPtLocation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ctrlPtLocation] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun ctrlPtLocation(ctrlPtLocation: JsonField<String>) = apply {
                        this.ctrlPtLocation = ctrlPtLocation
                    }

                    /** The name applied to the control point, used as a reference. */
                    fun ctrlPtName(ctrlPtName: String) = ctrlPtName(JsonField.of(ctrlPtName))

                    /**
                     * Sets [Builder.ctrlPtName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ctrlPtName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ctrlPtName(ctrlPtName: JsonField<String>) = apply {
                        this.ctrlPtName = ctrlPtName
                    }

                    /** One of possible control point type codes, such as CP, ER, OT, etc. */
                    fun ctrlPtType(ctrlPtType: String) = ctrlPtType(JsonField.of(ctrlPtType))

                    /**
                     * Sets [Builder.ctrlPtType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ctrlPtType] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ctrlPtType(ctrlPtType: JsonField<String>) = apply {
                        this.ctrlPtType = ctrlPtType
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
                     * Returns an immutable instance of [AirspaceControlPoint].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AirspaceControlPoint =
                        AirspaceControlPoint(
                            ctrlPtAltitude,
                            ctrlPtLocation,
                            ctrlPtName,
                            ctrlPtType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AirspaceControlPoint = apply {
                    if (validated) {
                        return@apply
                    }

                    ctrlPtAltitude()
                    ctrlPtLocation()
                    ctrlPtName()
                    ctrlPtType()
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
                    (if (ctrlPtAltitude.asKnown().isPresent) 1 else 0) +
                        (if (ctrlPtLocation.asKnown().isPresent) 1 else 0) +
                        (if (ctrlPtName.asKnown().isPresent) 1 else 0) +
                        (if (ctrlPtType.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AirspaceControlPoint &&
                        ctrlPtAltitude == other.ctrlPtAltitude &&
                        ctrlPtLocation == other.ctrlPtLocation &&
                        ctrlPtName == other.ctrlPtName &&
                        ctrlPtType == other.ctrlPtType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        ctrlPtAltitude,
                        ctrlPtLocation,
                        ctrlPtName,
                        ctrlPtType,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AirspaceControlPoint{ctrlPtAltitude=$ctrlPtAltitude, ctrlPtLocation=$ctrlPtLocation, ctrlPtName=$ctrlPtName, ctrlPtType=$ctrlPtType, additionalProperties=$additionalProperties}"
            }

            /**
             * The timePeriods set describes the effective datetime for a given airspace control
             * means.
             */
            class AirspaceTimePeriod
            private constructor(
                private val intDur: JsonField<List<String>>,
                private val intFreq: JsonField<List<String>>,
                private val timeEnd: JsonField<String>,
                private val timeMode: JsonField<String>,
                private val timeStart: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("intDur")
                    @ExcludeMissing
                    intDur: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("intFreq")
                    @ExcludeMissing
                    intFreq: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("timeEnd")
                    @ExcludeMissing
                    timeEnd: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timeMode")
                    @ExcludeMissing
                    timeMode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timeStart")
                    @ExcludeMissing
                    timeStart: JsonField<String> = JsonMissing.of(),
                ) : this(intDur, intFreq, timeEnd, timeMode, timeStart, mutableMapOf())

                /**
                 * Mandatory if timeMode is INTERVAL. Can be a numerical multiplier on an interval
                 * frequency code, a stop time qualifier code such as AFTER, NET, UFN, etc, or a
                 * datetime like string.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun intDur(): Optional<List<String>> = intDur.getOptional("intDur")

                /**
                 * Mandatory if timeMode is INTERVAL. Can be one of the interval frequency codes,
                 * such as BIWEEKLY, DAILY, YEARLY, etc.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun intFreq(): Optional<List<String>> = intFreq.getOptional("intFreq")

                /**
                 * The end time designating that the airspace control order is no longer active. Can
                 * contain datetime information or a stop time qualifier code, such as AFTER, NET,
                 * UFN, etc.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun timeEnd(): Optional<String> = timeEnd.getOptional("timeEnd")

                /**
                 * The airspace time code associated with the ACO. Can be DISCRETE, a fixed time
                 * block, or INTERVAL, a repeating time block.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun timeMode(): Optional<String> = timeMode.getOptional("timeMode")

                /**
                 * The start time designating that the airspace control order is active.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun timeStart(): Optional<String> = timeStart.getOptional("timeStart")

                /**
                 * Returns the raw JSON value of [intDur].
                 *
                 * Unlike [intDur], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("intDur")
                @ExcludeMissing
                fun _intDur(): JsonField<List<String>> = intDur

                /**
                 * Returns the raw JSON value of [intFreq].
                 *
                 * Unlike [intFreq], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("intFreq")
                @ExcludeMissing
                fun _intFreq(): JsonField<List<String>> = intFreq

                /**
                 * Returns the raw JSON value of [timeEnd].
                 *
                 * Unlike [timeEnd], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timeEnd") @ExcludeMissing fun _timeEnd(): JsonField<String> = timeEnd

                /**
                 * Returns the raw JSON value of [timeMode].
                 *
                 * Unlike [timeMode], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timeMode")
                @ExcludeMissing
                fun _timeMode(): JsonField<String> = timeMode

                /**
                 * Returns the raw JSON value of [timeStart].
                 *
                 * Unlike [timeStart], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timeStart")
                @ExcludeMissing
                fun _timeStart(): JsonField<String> = timeStart

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
                     * Returns a mutable builder for constructing an instance of
                     * [AirspaceTimePeriod].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AirspaceTimePeriod]. */
                class Builder internal constructor() {

                    private var intDur: JsonField<MutableList<String>>? = null
                    private var intFreq: JsonField<MutableList<String>>? = null
                    private var timeEnd: JsonField<String> = JsonMissing.of()
                    private var timeMode: JsonField<String> = JsonMissing.of()
                    private var timeStart: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(airspaceTimePeriod: AirspaceTimePeriod) = apply {
                        intDur = airspaceTimePeriod.intDur.map { it.toMutableList() }
                        intFreq = airspaceTimePeriod.intFreq.map { it.toMutableList() }
                        timeEnd = airspaceTimePeriod.timeEnd
                        timeMode = airspaceTimePeriod.timeMode
                        timeStart = airspaceTimePeriod.timeStart
                        additionalProperties =
                            airspaceTimePeriod.additionalProperties.toMutableMap()
                    }

                    /**
                     * Mandatory if timeMode is INTERVAL. Can be a numerical multiplier on an
                     * interval frequency code, a stop time qualifier code such as AFTER, NET, UFN,
                     * etc, or a datetime like string.
                     */
                    fun intDur(intDur: List<String>) = intDur(JsonField.of(intDur))

                    /**
                     * Sets [Builder.intDur] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.intDur] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun intDur(intDur: JsonField<List<String>>) = apply {
                        this.intDur = intDur.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.intDur].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addIntDur(intDur: String) = apply {
                        this.intDur =
                            (this.intDur ?: JsonField.of(mutableListOf())).also {
                                checkKnown("intDur", it).add(intDur)
                            }
                    }

                    /**
                     * Mandatory if timeMode is INTERVAL. Can be one of the interval frequency
                     * codes, such as BIWEEKLY, DAILY, YEARLY, etc.
                     */
                    fun intFreq(intFreq: List<String>) = intFreq(JsonField.of(intFreq))

                    /**
                     * Sets [Builder.intFreq] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.intFreq] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun intFreq(intFreq: JsonField<List<String>>) = apply {
                        this.intFreq = intFreq.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.intFreq].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addIntFreq(intFreq: String) = apply {
                        this.intFreq =
                            (this.intFreq ?: JsonField.of(mutableListOf())).also {
                                checkKnown("intFreq", it).add(intFreq)
                            }
                    }

                    /**
                     * The end time designating that the airspace control order is no longer active.
                     * Can contain datetime information or a stop time qualifier code, such as
                     * AFTER, NET, UFN, etc.
                     */
                    fun timeEnd(timeEnd: String) = timeEnd(JsonField.of(timeEnd))

                    /**
                     * Sets [Builder.timeEnd] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeEnd] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeEnd(timeEnd: JsonField<String>) = apply { this.timeEnd = timeEnd }

                    /**
                     * The airspace time code associated with the ACO. Can be DISCRETE, a fixed time
                     * block, or INTERVAL, a repeating time block.
                     */
                    fun timeMode(timeMode: String) = timeMode(JsonField.of(timeMode))

                    /**
                     * Sets [Builder.timeMode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeMode] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeMode(timeMode: JsonField<String>) = apply { this.timeMode = timeMode }

                    /** The start time designating that the airspace control order is active. */
                    fun timeStart(timeStart: String) = timeStart(JsonField.of(timeStart))

                    /**
                     * Sets [Builder.timeStart] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeStart] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun timeStart(timeStart: JsonField<String>) = apply {
                        this.timeStart = timeStart
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
                     * Returns an immutable instance of [AirspaceTimePeriod].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): AirspaceTimePeriod =
                        AirspaceTimePeriod(
                            (intDur ?: JsonMissing.of()).map { it.toImmutable() },
                            (intFreq ?: JsonMissing.of()).map { it.toImmutable() },
                            timeEnd,
                            timeMode,
                            timeStart,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): AirspaceTimePeriod = apply {
                    if (validated) {
                        return@apply
                    }

                    intDur()
                    intFreq()
                    timeEnd()
                    timeMode()
                    timeStart()
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
                    (intDur.asKnown().getOrNull()?.size ?: 0) +
                        (intFreq.asKnown().getOrNull()?.size ?: 0) +
                        (if (timeEnd.asKnown().isPresent) 1 else 0) +
                        (if (timeMode.asKnown().isPresent) 1 else 0) +
                        (if (timeStart.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AirspaceTimePeriod &&
                        intDur == other.intDur &&
                        intFreq == other.intFreq &&
                        timeEnd == other.timeEnd &&
                        timeMode == other.timeMode &&
                        timeStart == other.timeStart &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        intDur,
                        intFreq,
                        timeEnd,
                        timeMode,
                        timeStart,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AirspaceTimePeriod{intDur=$intDur, intFreq=$intFreq, timeEnd=$timeEnd, timeMode=$timeMode, timeStart=$timeStart, additionalProperties=$additionalProperties}"
            }

            /**
             * Designates the geometric type that defines the airspace shape. One of CIRCLE,
             * CORRIDOR, LINE, ORBIT, etc.
             */
            class CmShape @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val POLYARC = of("POLYARC")

                    @JvmField val _1_TRACK = of("1TRACK")

                    @JvmField val POLYGON = of("POLYGON")

                    @JvmField val CIRCLE = of("CIRCLE")

                    @JvmField val CORRIDOR = of("CORRIDOR")

                    @JvmField val APOINT = of("APOINT")

                    @JvmField val AORBIT = of("AORBIT")

                    @JvmField val GEOLINE = of("GEOLINE")

                    @JvmStatic fun of(value: String) = CmShape(JsonField.of(value))
                }

                /** An enum containing [CmShape]'s known values. */
                enum class Known {
                    POLYARC,
                    _1_TRACK,
                    POLYGON,
                    CIRCLE,
                    CORRIDOR,
                    APOINT,
                    AORBIT,
                    GEOLINE,
                }

                /**
                 * An enum containing [CmShape]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [CmShape] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    POLYARC,
                    _1_TRACK,
                    POLYGON,
                    CIRCLE,
                    CORRIDOR,
                    APOINT,
                    AORBIT,
                    GEOLINE,
                    /**
                     * An enum member indicating that [CmShape] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        POLYARC -> Value.POLYARC
                        _1_TRACK -> Value._1_TRACK
                        POLYGON -> Value.POLYGON
                        CIRCLE -> Value.CIRCLE
                        CORRIDOR -> Value.CORRIDOR
                        APOINT -> Value.APOINT
                        AORBIT -> Value.AORBIT
                        GEOLINE -> Value.GEOLINE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value is
                 *   a not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        POLYARC -> Known.POLYARC
                        _1_TRACK -> Known._1_TRACK
                        POLYGON -> Known.POLYGON
                        CIRCLE -> Known.CIRCLE
                        CORRIDOR -> Known.CORRIDOR
                        APOINT -> Known.APOINT
                        AORBIT -> Known.AORBIT
                        GEOLINE -> Known.GEOLINE
                        else ->
                            throw UnifieddatalibraryInvalidDataException("Unknown CmShape: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if this class instance's value
                 *   does not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        UnifieddatalibraryInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): CmShape = apply {
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

                    return other is CmShape && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AirspaceControlMean &&
                    airspaceControlPoint == other.airspaceControlPoint &&
                    airspaceTimePeriod == other.airspaceTimePeriod &&
                    bearing0 == other.bearing0 &&
                    bearing1 == other.bearing1 &&
                    cmId == other.cmId &&
                    cmShape == other.cmShape &&
                    cmType == other.cmType &&
                    cntrlAuth == other.cntrlAuth &&
                    cntrlAuthFreqs == other.cntrlAuthFreqs &&
                    coord0 == other.coord0 &&
                    coord1 == other.coord1 &&
                    corrWayPoints == other.corrWayPoints &&
                    effVDim == other.effVDim &&
                    freeText == other.freeText &&
                    genTextInd == other.genTextInd &&
                    geoDatumAlt == other.geoDatumAlt &&
                    link16Id == other.link16Id &&
                    orbitAlignment == other.orbitAlignment &&
                    polyCoord == other.polyCoord &&
                    radMag0 == other.radMag0 &&
                    radMag1 == other.radMag1 &&
                    radMagUnit == other.radMagUnit &&
                    trackLeg == other.trackLeg &&
                    transAltitude == other.transAltitude &&
                    usage == other.usage &&
                    width == other.width &&
                    widthLeft == other.widthLeft &&
                    widthRight == other.widthRight &&
                    widthUnit == other.widthUnit &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    airspaceControlPoint,
                    airspaceTimePeriod,
                    bearing0,
                    bearing1,
                    cmId,
                    cmShape,
                    cmType,
                    cntrlAuth,
                    cntrlAuthFreqs,
                    coord0,
                    coord1,
                    corrWayPoints,
                    effVDim,
                    freeText,
                    genTextInd,
                    geoDatumAlt,
                    link16Id,
                    orbitAlignment,
                    polyCoord,
                    radMag0,
                    radMag1,
                    radMagUnit,
                    trackLeg,
                    transAltitude,
                    usage,
                    width,
                    widthLeft,
                    widthRight,
                    widthUnit,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AirspaceControlMean{airspaceControlPoint=$airspaceControlPoint, airspaceTimePeriod=$airspaceTimePeriod, bearing0=$bearing0, bearing1=$bearing1, cmId=$cmId, cmShape=$cmShape, cmType=$cmType, cntrlAuth=$cntrlAuth, cntrlAuthFreqs=$cntrlAuthFreqs, coord0=$coord0, coord1=$coord1, corrWayPoints=$corrWayPoints, effVDim=$effVDim, freeText=$freeText, genTextInd=$genTextInd, geoDatumAlt=$geoDatumAlt, link16Id=$link16Id, orbitAlignment=$orbitAlignment, polyCoord=$polyCoord, radMag0=$radMag0, radMag1=$radMag1, radMagUnit=$radMagUnit, trackLeg=$trackLeg, transAltitude=$transAltitude, usage=$usage, width=$width, widthLeft=$widthLeft, widthRight=$widthRight, widthUnit=$widthUnit, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AirspaceControlMeansStatus &&
                airspaceControlMeans == other.airspaceControlMeans &&
                cmStat == other.cmStat &&
                cmStatId == other.cmStatId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(airspaceControlMeans, cmStat, cmStatId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AirspaceControlMeansStatus{airspaceControlMeans=$airspaceControlMeans, cmStat=$cmStat, cmStatId=$cmStatId, additionalProperties=$additionalProperties}"
    }

    /**
     * The airspaceControlReferences set provides both USMTF and non-USMTF references for this
     * airspace control order.
     */
    class AirspaceControlOrderReference
    private constructor(
        private val refOriginator: JsonField<String>,
        private val refSerialNum: JsonField<String>,
        private val refSiCs: JsonField<List<String>>,
        private val refSId: JsonField<String>,
        private val refSpecialNotation: JsonField<String>,
        private val refTs: JsonField<OffsetDateTime>,
        private val refType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("refOriginator")
            @ExcludeMissing
            refOriginator: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refSerialNum")
            @ExcludeMissing
            refSerialNum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refSICs")
            @ExcludeMissing
            refSiCs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("refSId") @ExcludeMissing refSId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refSpecialNotation")
            @ExcludeMissing
            refSpecialNotation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refTs")
            @ExcludeMissing
            refTs: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("refType") @ExcludeMissing refType: JsonField<String> = JsonMissing.of(),
        ) : this(
            refOriginator,
            refSerialNum,
            refSiCs,
            refSId,
            refSpecialNotation,
            refTs,
            refType,
            mutableMapOf(),
        )

        /**
         * The originator of this reference.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refOriginator(): Optional<String> = refOriginator.getOptional("refOriginator")

        /**
         * The reference serial number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refSerialNum(): Optional<String> = refSerialNum.getOptional("refSerialNum")

        /**
         * Array of NATO Subject Indicator Codes (SIC) or filing numbers of the document being
         * referenced.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refSiCs(): Optional<List<String>> = refSiCs.getOptional("refSICs")

        /**
         * Specifies an alphabetic serial number identifying a reference pertaining to this message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refSId(): Optional<String> = refSId.getOptional("refSId")

        /**
         * Indicates any special actions, restrictions, guidance, or information relating to this
         * reference.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refSpecialNotation(): Optional<String> =
            refSpecialNotation.getOptional("refSpecialNotation")

        /**
         * Timestamp of the referenced message, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refTs(): Optional<OffsetDateTime> = refTs.getOptional("refTs")

        /**
         * Specifies the type for this reference.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refType(): Optional<String> = refType.getOptional("refType")

        /**
         * Returns the raw JSON value of [refOriginator].
         *
         * Unlike [refOriginator], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refOriginator")
        @ExcludeMissing
        fun _refOriginator(): JsonField<String> = refOriginator

        /**
         * Returns the raw JSON value of [refSerialNum].
         *
         * Unlike [refSerialNum], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refSerialNum")
        @ExcludeMissing
        fun _refSerialNum(): JsonField<String> = refSerialNum

        /**
         * Returns the raw JSON value of [refSiCs].
         *
         * Unlike [refSiCs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refSICs") @ExcludeMissing fun _refSiCs(): JsonField<List<String>> = refSiCs

        /**
         * Returns the raw JSON value of [refSId].
         *
         * Unlike [refSId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refSId") @ExcludeMissing fun _refSId(): JsonField<String> = refSId

        /**
         * Returns the raw JSON value of [refSpecialNotation].
         *
         * Unlike [refSpecialNotation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("refSpecialNotation")
        @ExcludeMissing
        fun _refSpecialNotation(): JsonField<String> = refSpecialNotation

        /**
         * Returns the raw JSON value of [refTs].
         *
         * Unlike [refTs], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refTs") @ExcludeMissing fun _refTs(): JsonField<OffsetDateTime> = refTs

        /**
         * Returns the raw JSON value of [refType].
         *
         * Unlike [refType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refType") @ExcludeMissing fun _refType(): JsonField<String> = refType

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
             * Returns a mutable builder for constructing an instance of
             * [AirspaceControlOrderReference].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AirspaceControlOrderReference]. */
        class Builder internal constructor() {

            private var refOriginator: JsonField<String> = JsonMissing.of()
            private var refSerialNum: JsonField<String> = JsonMissing.of()
            private var refSiCs: JsonField<MutableList<String>>? = null
            private var refSId: JsonField<String> = JsonMissing.of()
            private var refSpecialNotation: JsonField<String> = JsonMissing.of()
            private var refTs: JsonField<OffsetDateTime> = JsonMissing.of()
            private var refType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(airspaceControlOrderReference: AirspaceControlOrderReference) =
                apply {
                    refOriginator = airspaceControlOrderReference.refOriginator
                    refSerialNum = airspaceControlOrderReference.refSerialNum
                    refSiCs = airspaceControlOrderReference.refSiCs.map { it.toMutableList() }
                    refSId = airspaceControlOrderReference.refSId
                    refSpecialNotation = airspaceControlOrderReference.refSpecialNotation
                    refTs = airspaceControlOrderReference.refTs
                    refType = airspaceControlOrderReference.refType
                    additionalProperties =
                        airspaceControlOrderReference.additionalProperties.toMutableMap()
                }

            /** The originator of this reference. */
            fun refOriginator(refOriginator: String) = refOriginator(JsonField.of(refOriginator))

            /**
             * Sets [Builder.refOriginator] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refOriginator] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refOriginator(refOriginator: JsonField<String>) = apply {
                this.refOriginator = refOriginator
            }

            /** The reference serial number. */
            fun refSerialNum(refSerialNum: String) = refSerialNum(JsonField.of(refSerialNum))

            /**
             * Sets [Builder.refSerialNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refSerialNum] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refSerialNum(refSerialNum: JsonField<String>) = apply {
                this.refSerialNum = refSerialNum
            }

            /**
             * Array of NATO Subject Indicator Codes (SIC) or filing numbers of the document being
             * referenced.
             */
            fun refSiCs(refSiCs: List<String>) = refSiCs(JsonField.of(refSiCs))

            /**
             * Sets [Builder.refSiCs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refSiCs] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refSiCs(refSiCs: JsonField<List<String>>) = apply {
                this.refSiCs = refSiCs.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [refSiCs].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRefSiC(refSiC: String) = apply {
                refSiCs =
                    (refSiCs ?: JsonField.of(mutableListOf())).also {
                        checkKnown("refSiCs", it).add(refSiC)
                    }
            }

            /**
             * Specifies an alphabetic serial number identifying a reference pertaining to this
             * message.
             */
            fun refSId(refSId: String) = refSId(JsonField.of(refSId))

            /**
             * Sets [Builder.refSId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refSId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refSId(refSId: JsonField<String>) = apply { this.refSId = refSId }

            /**
             * Indicates any special actions, restrictions, guidance, or information relating to
             * this reference.
             */
            fun refSpecialNotation(refSpecialNotation: String) =
                refSpecialNotation(JsonField.of(refSpecialNotation))

            /**
             * Sets [Builder.refSpecialNotation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refSpecialNotation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refSpecialNotation(refSpecialNotation: JsonField<String>) = apply {
                this.refSpecialNotation = refSpecialNotation
            }

            /**
             * Timestamp of the referenced message, in ISO 8601 UTC format with millisecond
             * precision.
             */
            fun refTs(refTs: OffsetDateTime) = refTs(JsonField.of(refTs))

            /**
             * Sets [Builder.refTs] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refTs] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refTs(refTs: JsonField<OffsetDateTime>) = apply { this.refTs = refTs }

            /** Specifies the type for this reference. */
            fun refType(refType: String) = refType(JsonField.of(refType))

            /**
             * Sets [Builder.refType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refType(refType: JsonField<String>) = apply { this.refType = refType }

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
             * Returns an immutable instance of [AirspaceControlOrderReference].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AirspaceControlOrderReference =
                AirspaceControlOrderReference(
                    refOriginator,
                    refSerialNum,
                    (refSiCs ?: JsonMissing.of()).map { it.toImmutable() },
                    refSId,
                    refSpecialNotation,
                    refTs,
                    refType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AirspaceControlOrderReference = apply {
            if (validated) {
                return@apply
            }

            refOriginator()
            refSerialNum()
            refSiCs()
            refSId()
            refSpecialNotation()
            refTs()
            refType()
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
            (if (refOriginator.asKnown().isPresent) 1 else 0) +
                (if (refSerialNum.asKnown().isPresent) 1 else 0) +
                (refSiCs.asKnown().getOrNull()?.size ?: 0) +
                (if (refSId.asKnown().isPresent) 1 else 0) +
                (if (refSpecialNotation.asKnown().isPresent) 1 else 0) +
                (if (refTs.asKnown().isPresent) 1 else 0) +
                (if (refType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AirspaceControlOrderReference &&
                refOriginator == other.refOriginator &&
                refSerialNum == other.refSerialNum &&
                refSiCs == other.refSiCs &&
                refSId == other.refSId &&
                refSpecialNotation == other.refSpecialNotation &&
                refTs == other.refTs &&
                refType == other.refType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                refOriginator,
                refSerialNum,
                refSiCs,
                refSId,
                refSpecialNotation,
                refTs,
                refType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AirspaceControlOrderReference{refOriginator=$refOriginator, refSerialNum=$refSerialNum, refSiCs=$refSiCs, refSId=$refSId, refSpecialNotation=$refSpecialNotation, refTs=$refTs, refType=$refType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AirspacecontrolorderAbridged &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            opExName == other.opExName &&
            originator == other.originator &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            acoComments == other.acoComments &&
            acoSerialNum == other.acoSerialNum &&
            airspaceControlMeansStatus == other.airspaceControlMeansStatus &&
            airspaceControlOrderReferences == other.airspaceControlOrderReferences &&
            areaOfValidity == other.areaOfValidity &&
            classReasons == other.classReasons &&
            classSource == other.classSource &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            declassExemptionCodes == other.declassExemptionCodes &&
            downgradeInsDates == other.downgradeInsDates &&
            geoDatum == other.geoDatum &&
            month == other.month &&
            opExInfo == other.opExInfo &&
            opExInfoAlt == other.opExInfoAlt &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            planOrigNum == other.planOrigNum &&
            qualifier == other.qualifier &&
            qualSn == other.qualSn &&
            serialNum == other.serialNum &&
            sourceDl == other.sourceDl &&
            stopQualifier == other.stopQualifier &&
            stopTime == other.stopTime &&
            undLnkTrks == other.undLnkTrks &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            opExName,
            originator,
            source,
            startTime,
            id,
            acoComments,
            acoSerialNum,
            airspaceControlMeansStatus,
            airspaceControlOrderReferences,
            areaOfValidity,
            classReasons,
            classSource,
            createdAt,
            createdBy,
            declassExemptionCodes,
            downgradeInsDates,
            geoDatum,
            month,
            opExInfo,
            opExInfoAlt,
            origin,
            origNetwork,
            planOrigNum,
            qualifier,
            qualSn,
            serialNum,
            sourceDl,
            stopQualifier,
            stopTime,
            undLnkTrks,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirspacecontrolorderAbridged{classificationMarking=$classificationMarking, dataMode=$dataMode, opExName=$opExName, originator=$originator, source=$source, startTime=$startTime, id=$id, acoComments=$acoComments, acoSerialNum=$acoSerialNum, airspaceControlMeansStatus=$airspaceControlMeansStatus, airspaceControlOrderReferences=$airspaceControlOrderReferences, areaOfValidity=$areaOfValidity, classReasons=$classReasons, classSource=$classSource, createdAt=$createdAt, createdBy=$createdBy, declassExemptionCodes=$declassExemptionCodes, downgradeInsDates=$downgradeInsDates, geoDatum=$geoDatum, month=$month, opExInfo=$opExInfo, opExInfoAlt=$opExInfoAlt, origin=$origin, origNetwork=$origNetwork, planOrigNum=$planOrigNum, qualifier=$qualifier, qualSn=$qualSn, serialNum=$serialNum, sourceDl=$sourceDl, stopQualifier=$stopQualifier, stopTime=$stopTime, undLnkTrks=$undLnkTrks, additionalProperties=$additionalProperties}"
}

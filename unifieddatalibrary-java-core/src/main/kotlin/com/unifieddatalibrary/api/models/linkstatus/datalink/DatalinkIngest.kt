// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.linkstatus.datalink

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

/** Beta Version DataLink: Detailed instructions regarding the operations of data links. */
class DatalinkIngest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val opExName: JsonField<String>,
    private val originator: JsonField<String>,
    private val source: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val ackInstUnits: JsonField<List<String>>,
    private val ackReq: JsonField<Boolean>,
    private val altDiff: JsonField<Int>,
    private val canxId: JsonField<String>,
    private val canxOriginator: JsonField<String>,
    private val canxSerialNum: JsonField<String>,
    private val canxSiCs: JsonField<List<String>>,
    private val canxSpecialNotation: JsonField<String>,
    private val canxTs: JsonField<OffsetDateTime>,
    private val classReasons: JsonField<List<String>>,
    private val classSource: JsonField<String>,
    private val consecDecorr: JsonField<Int>,
    private val courseDiff: JsonField<Int>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val decExemptCodes: JsonField<List<String>>,
    private val decInstDates: JsonField<List<String>>,
    private val decorrWinMult: JsonField<Double>,
    private val geoDatum: JsonField<String>,
    private val jreCallSign: JsonField<String>,
    private val jreDetails: JsonField<String>,
    private val jrePriAdd: JsonField<Int>,
    private val jreSecAdd: JsonField<Int>,
    private val jreUnitDes: JsonField<String>,
    private val maxGeoPosQual: JsonField<Int>,
    private val maxTrackQual: JsonField<Int>,
    private val mgmtCode: JsonField<String>,
    private val mgmtCodeMeaning: JsonField<String>,
    private val minGeoPosQual: JsonField<Int>,
    private val minTrackQual: JsonField<Int>,
    private val month: JsonField<String>,
    private val multiDuty: JsonField<List<MultiDuty>>,
    private val nonLinkUnitDes: JsonField<List<String>>,
    private val opExInfo: JsonField<String>,
    private val opExInfoAlt: JsonField<String>,
    private val ops: JsonField<List<Op>>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val planOrigNum: JsonField<String>,
    private val pocCallSign: JsonField<String>,
    private val pocLat: JsonField<Double>,
    private val pocLocName: JsonField<String>,
    private val pocLon: JsonField<Double>,
    private val pocName: JsonField<String>,
    private val pocNums: JsonField<List<String>>,
    private val pocRank: JsonField<String>,
    private val qualifier: JsonField<String>,
    private val qualSn: JsonField<Int>,
    private val references: JsonField<List<Reference>>,
    private val refPoints: JsonField<List<RefPoint>>,
    private val remarks: JsonField<List<Remark>>,
    private val resTrackQual: JsonField<Int>,
    private val serialNum: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val specTracks: JsonField<List<SpecTrack>>,
    private val speedDiff: JsonField<Int>,
    private val stopTime: JsonField<OffsetDateTime>,
    private val stopTimeMod: JsonField<String>,
    private val sysDefaultCode: JsonField<String>,
    private val trackNumBlockLLs: JsonField<List<Int>>,
    private val trackNumBlocks: JsonField<List<String>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val voiceCoord: JsonField<List<VoiceCoord>>,
    private val winSizeMin: JsonField<Double>,
    private val winSizeMult: JsonField<Double>,
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
        @JsonProperty("ackInstUnits")
        @ExcludeMissing
        ackInstUnits: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ackReq") @ExcludeMissing ackReq: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("altDiff") @ExcludeMissing altDiff: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("canxId") @ExcludeMissing canxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("canxOriginator")
        @ExcludeMissing
        canxOriginator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("canxSerialNum")
        @ExcludeMissing
        canxSerialNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("canxSICs")
        @ExcludeMissing
        canxSiCs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("canxSpecialNotation")
        @ExcludeMissing
        canxSpecialNotation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("canxTs")
        @ExcludeMissing
        canxTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("classReasons")
        @ExcludeMissing
        classReasons: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("classSource")
        @ExcludeMissing
        classSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("consecDecorr")
        @ExcludeMissing
        consecDecorr: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("courseDiff") @ExcludeMissing courseDiff: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("decExemptCodes")
        @ExcludeMissing
        decExemptCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("decInstDates")
        @ExcludeMissing
        decInstDates: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("decorrWinMult")
        @ExcludeMissing
        decorrWinMult: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("geoDatum") @ExcludeMissing geoDatum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jreCallSign")
        @ExcludeMissing
        jreCallSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jreDetails")
        @ExcludeMissing
        jreDetails: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jrePriAdd") @ExcludeMissing jrePriAdd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("jreSecAdd") @ExcludeMissing jreSecAdd: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("jreUnitDes")
        @ExcludeMissing
        jreUnitDes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxGeoPosQual")
        @ExcludeMissing
        maxGeoPosQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("maxTrackQual")
        @ExcludeMissing
        maxTrackQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("mgmtCode") @ExcludeMissing mgmtCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mgmtCodeMeaning")
        @ExcludeMissing
        mgmtCodeMeaning: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minGeoPosQual")
        @ExcludeMissing
        minGeoPosQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("minTrackQual")
        @ExcludeMissing
        minTrackQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("month") @ExcludeMissing month: JsonField<String> = JsonMissing.of(),
        @JsonProperty("multiDuty")
        @ExcludeMissing
        multiDuty: JsonField<List<MultiDuty>> = JsonMissing.of(),
        @JsonProperty("nonLinkUnitDes")
        @ExcludeMissing
        nonLinkUnitDes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("opExInfo") @ExcludeMissing opExInfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("opExInfoAlt")
        @ExcludeMissing
        opExInfoAlt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ops") @ExcludeMissing ops: JsonField<List<Op>> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("planOrigNum")
        @ExcludeMissing
        planOrigNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocCallSign")
        @ExcludeMissing
        pocCallSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocLat") @ExcludeMissing pocLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pocLocName")
        @ExcludeMissing
        pocLocName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocLon") @ExcludeMissing pocLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pocName") @ExcludeMissing pocName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pocNums")
        @ExcludeMissing
        pocNums: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("pocRank") @ExcludeMissing pocRank: JsonField<String> = JsonMissing.of(),
        @JsonProperty("qualifier") @ExcludeMissing qualifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("qualSN") @ExcludeMissing qualSn: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("references")
        @ExcludeMissing
        references: JsonField<List<Reference>> = JsonMissing.of(),
        @JsonProperty("refPoints")
        @ExcludeMissing
        refPoints: JsonField<List<RefPoint>> = JsonMissing.of(),
        @JsonProperty("remarks")
        @ExcludeMissing
        remarks: JsonField<List<Remark>> = JsonMissing.of(),
        @JsonProperty("resTrackQual")
        @ExcludeMissing
        resTrackQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("serialNum") @ExcludeMissing serialNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("specTracks")
        @ExcludeMissing
        specTracks: JsonField<List<SpecTrack>> = JsonMissing.of(),
        @JsonProperty("speedDiff") @ExcludeMissing speedDiff: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("stopTime")
        @ExcludeMissing
        stopTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("stopTimeMod")
        @ExcludeMissing
        stopTimeMod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sysDefaultCode")
        @ExcludeMissing
        sysDefaultCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trackNumBlockLLs")
        @ExcludeMissing
        trackNumBlockLLs: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("trackNumBlocks")
        @ExcludeMissing
        trackNumBlocks: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voiceCoord")
        @ExcludeMissing
        voiceCoord: JsonField<List<VoiceCoord>> = JsonMissing.of(),
        @JsonProperty("winSizeMin")
        @ExcludeMissing
        winSizeMin: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("winSizeMult")
        @ExcludeMissing
        winSizeMult: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        opExName,
        originator,
        source,
        startTime,
        id,
        ackInstUnits,
        ackReq,
        altDiff,
        canxId,
        canxOriginator,
        canxSerialNum,
        canxSiCs,
        canxSpecialNotation,
        canxTs,
        classReasons,
        classSource,
        consecDecorr,
        courseDiff,
        createdAt,
        createdBy,
        decExemptCodes,
        decInstDates,
        decorrWinMult,
        geoDatum,
        jreCallSign,
        jreDetails,
        jrePriAdd,
        jreSecAdd,
        jreUnitDes,
        maxGeoPosQual,
        maxTrackQual,
        mgmtCode,
        mgmtCodeMeaning,
        minGeoPosQual,
        minTrackQual,
        month,
        multiDuty,
        nonLinkUnitDes,
        opExInfo,
        opExInfoAlt,
        ops,
        origin,
        origNetwork,
        planOrigNum,
        pocCallSign,
        pocLat,
        pocLocName,
        pocLon,
        pocName,
        pocNums,
        pocRank,
        qualifier,
        qualSn,
        references,
        refPoints,
        remarks,
        resTrackQual,
        serialNum,
        sourceDl,
        specTracks,
        speedDiff,
        stopTime,
        stopTimeMod,
        sysDefaultCode,
        trackNumBlockLLs,
        trackNumBlocks,
        updatedAt,
        updatedBy,
        voiceCoord,
        winSizeMin,
        winSizeMult,
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
     * The start of the effective time period of this data link message, in ISO 8601 UTC format with
     * millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startTime(): OffsetDateTime = startTime.getRequired("startTime")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Array of instructions for acknowledging and the force or units required to acknowledge the
     * data link message being sent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ackInstUnits(): Optional<List<String>> = ackInstUnits.getOptional("ackInstUnits")

    /**
     * Flag Indicating if formal acknowledgement is required for the particular data link message
     * being sent.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ackReq(): Optional<Boolean> = ackReq.getOptional("ackReq")

    /**
     * Maximum altitude difference between two air tracks, in thousands of feet. Required if
     * sysDefaultCode field is "MAN". Allowable entires are 5 to 50 in increments of 5000 feet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altDiff(): Optional<Int> = altDiff.getOptional("altDiff")

    /**
     * The identifier for this data link message cancellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun canxId(): Optional<String> = canxId.getOptional("canxId")

    /**
     * The originator of this data link message cancellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun canxOriginator(): Optional<String> = canxOriginator.getOptional("canxOriginator")

    /**
     * Serial number assigned to this data link message cancellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun canxSerialNum(): Optional<String> = canxSerialNum.getOptional("canxSerialNum")

    /**
     * Array of NATO Subject Indicator Codes (SIC) or filing numbers of this data link message or
     * document being cancelled.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun canxSiCs(): Optional<List<String>> = canxSiCs.getOptional("canxSICs")

    /**
     * Indicates any special actions, restrictions, guidance, or information relating to this data
     * link message cancellation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun canxSpecialNotation(): Optional<String> =
        canxSpecialNotation.getOptional("canxSpecialNotation")

    /**
     * Timestamp of the data link message cancellation, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun canxTs(): Optional<OffsetDateTime> = canxTs.getOptional("canxTs")

    /**
     * Array of codes that indicate the reasons material is classified.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classReasons(): Optional<List<String>> = classReasons.getOptional("classReasons")

    /**
     * Markings that define the source material or the original classification authority for this
     * data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun classSource(): Optional<String> = classSource.getOptional("classSource")

    /**
     * Number of consecutive remote track reports that must meet the decorrelation criteria before
     * the decorrelation is executed. Required if sysDefaultCode field is "MAN". Allowable entries
     * are integers from 1 to 5.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun consecDecorr(): Optional<Int> = consecDecorr.getOptional("consecDecorr")

    /**
     * Maximum difference between the reported course of the remote track and the calculated course
     * of the local track. Required if sysDefaultCode field is "MAN". Allowable entries are 15 to 90
     * in increments of 15 degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun courseDiff(): Optional<Int> = courseDiff.getOptional("courseDiff")

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
     * Array of codes that provide justification for exemption from automatic downgrading or
     * declassification.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decExemptCodes(): Optional<List<String>> = decExemptCodes.getOptional("decExemptCodes")

    /**
     * Array of markings that provide the literal guidance or dates for the downgrading or
     * declassification of this data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decInstDates(): Optional<List<String>> = decInstDates.getOptional("decInstDates")

    /**
     * Distance between the common and remote track is to exceed the applicable correlation window
     * for the two tracks in order to be decorrelated. Required if sysDefaultCode field is "MAN".
     * Allowable entries are 1.0 to 2.0 in increments of 0.1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun decorrWinMult(): Optional<Double> = decorrWinMult.getOptional("decorrWinMult")

    /**
     * The code for the point of reference from which the coordinates and networks are computed.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun geoDatum(): Optional<String> = geoDatum.getOptional("geoDatum")

    /**
     * Call sign which identifies one or more communications facilities, commands, authorities, or
     * activities for Joint Range Extension (JRE) units.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jreCallSign(): Optional<String> = jreCallSign.getOptional("jreCallSign")

    /**
     * Joint Range Extension (JRE) unit details.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jreDetails(): Optional<String> = jreDetails.getOptional("jreDetails")

    /**
     * Link-16 octal track number assigned as the primary JTIDS unit address.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jrePriAdd(): Optional<Int> = jrePriAdd.getOptional("jrePriAdd")

    /**
     * Link-16 octal track number assigned as the secondary JTIDS unit address.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jreSecAdd(): Optional<Int> = jreSecAdd.getOptional("jreSecAdd")

    /**
     * Designator of the unit for Joint Range Extension (JRE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun jreUnitDes(): Optional<String> = jreUnitDes.getOptional("jreUnitDes")

    /**
     * Number used for maximum geodetic position quality. Required if sysDefaultCode field is "MAN".
     * Allowable entires are integers from 1 to 15.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxGeoPosQual(): Optional<Int> = maxGeoPosQual.getOptional("maxGeoPosQual")

    /**
     * Track quality to prevent correlation windows from being unrealistically small. Required if
     * sysDefaultCode field is "MAN". Allowable entries are integers from 8 to 15.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxTrackQual(): Optional<Int> = maxTrackQual.getOptional("maxTrackQual")

    /**
     * Data link management code word.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mgmtCode(): Optional<String> = mgmtCode.getOptional("mgmtCode")

    /**
     * Data link management code word meaning.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mgmtCodeMeaning(): Optional<String> = mgmtCodeMeaning.getOptional("mgmtCodeMeaning")

    /**
     * Number used for minimum geodetic position quality. Required if sysDefaultCode field is "MAN".
     * Allowable entries are integers from 1 to 5.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minGeoPosQual(): Optional<Int> = minGeoPosQual.getOptional("minGeoPosQual")

    /**
     * Track quality to prevent correlation windows from being unrealistically large. Required if
     * sysDefaultCode field is "MAN". Allowable entries are integers from 3 to 7.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun minTrackQual(): Optional<Int> = minTrackQual.getOptional("minTrackQual")

    /**
     * The month in which this message originated.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun month(): Optional<String> = month.getOptional("month")

    /**
     * Collection of contact and identification information for designated multilink coordinator
     * duty assignments. There can be 0 to many DataLinkMultiDuty collections within the datalink
     * service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun multiDuty(): Optional<List<MultiDuty>> = multiDuty.getOptional("multiDuty")

    /**
     * Array of non-link specific data unit designators.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun nonLinkUnitDes(): Optional<List<String>> = nonLinkUnitDes.getOptional("nonLinkUnitDes")

    /**
     * Provides an additional caveat further identifying the exercise or modifies the exercise
     * nickname.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opExInfo(): Optional<String> = opExInfo.getOptional("opExInfo")

    /**
     * The secondary nickname of the option or the alternative of the operational plan or order.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun opExInfoAlt(): Optional<String> = opExInfoAlt.getOptional("opExInfoAlt")

    /**
     * Collection of information describing the establishment and detailed operation of tactical
     * data links. There can be 0 to many DataLinkOps collections within the datalink service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ops(): Optional<List<Op>> = ops.getOptional("ops")

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
     * The unit identifier or call sign of the point of contact for this data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocCallSign(): Optional<String> = pocCallSign.getOptional("pocCallSign")

    /**
     * WGS84 latitude of the point of contact for this data link message, in degrees. -90 to 90
     * degrees (negative values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocLat(): Optional<Double> = pocLat.getOptional("pocLat")

    /**
     * The location name of the point of contact for this data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocLocName(): Optional<String> = pocLocName.getOptional("pocLocName")

    /**
     * WGS84 longitude of the point of contact for this data link message, in degrees. -180 to 180
     * degrees (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocLon(): Optional<Double> = pocLon.getOptional("pocLon")

    /**
     * The name of the point of contact for this data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocName(): Optional<String> = pocName.getOptional("pocName")

    /**
     * Array of telephone numbers, radio frequency values, or email addresses of the point of
     * contact for this data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocNums(): Optional<List<String>> = pocNums.getOptional("pocNums")

    /**
     * The rank or position of the point of contact for this data link message in a military or
     * civilian organization.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pocRank(): Optional<String> = pocRank.getOptional("pocRank")

    /**
     * The qualifier which caveats the message status such as AMP (Amplification), CHG (Change),
     * etc.
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
     * Collection of reference information. There can be 0 to many DataLinkReferences collections
     * within the datalink service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun references(): Optional<List<Reference>> = references.getOptional("references")

    /**
     * Collection that identifies points of reference used in the establishment of the data links.
     * There can be 1 to many DataLinkRefPoints collections within the datalink service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun refPoints(): Optional<List<RefPoint>> = refPoints.getOptional("refPoints")

    /**
     * Collection of remarks associated with this data link message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun remarks(): Optional<List<Remark>> = remarks.getOptional("remarks")

    /**
     * Track quality to enter if too many duals involving low track quality tracks are occurring.
     * Required if sysDefaultCode field is "MAN". Allowable entries are integers from 2 to 6.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun resTrackQual(): Optional<Int> = resTrackQual.getOptional("resTrackQual")

    /**
     * The unique message identifier assigned by the originator.
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
     * Collection of special track numbers used on the data links. There can be 0 to many
     * DataLinkSpecTracks collections within the datalink service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun specTracks(): Optional<List<SpecTrack>> = specTracks.getOptional("specTracks")

    /**
     * Maximum percentage the faster track speed may differ from the slower track speed. Required if
     * sysDefaultCode field is "MAN". Allowable entries are 10 to 100 in increments of 10.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun speedDiff(): Optional<Int> = speedDiff.getOptional("speedDiff")

    /**
     * The end of the effective time period of this data link message, in ISO 8601 UTC format with
     * millisecond precision. This may be a relative stop time if used with stopTimeMod.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stopTime(): Optional<OffsetDateTime> = stopTime.getOptional("stopTime")

    /**
     * A qualifier for the end of the effective time period of this data link message, such as
     * AFTER, ASOF, NLT, etc. Used with field stopTime to indicate a relative time.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun stopTimeMod(): Optional<String> = stopTimeMod.getOptional("stopTimeMod")

    /**
     * Indicates the data terminal settings the system defaults to, either automatic
     * correlation/decorrelation (AUTO) or manual (MAN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sysDefaultCode(): Optional<String> = sysDefaultCode.getOptional("sysDefaultCode")

    /**
     * Array of Link-16 octal track numbers used as the lower limit of a track block.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackNumBlockLLs(): Optional<List<Int>> = trackNumBlockLLs.getOptional("trackNumBlockLLs")

    /**
     * Array of defined ranges of Link-11/11B track numbers assigned to a participating unit or
     * reporting unit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trackNumBlocks(): Optional<List<String>> = trackNumBlocks.getOptional("trackNumBlocks")

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
     * Collection of information regarding the function, frequency, and priority of interface
     * control and coordination nets for this data link message. There can be 1 to many
     * DataLinkVoiceCoord collections within the datalink service.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun voiceCoord(): Optional<List<VoiceCoord>> = voiceCoord.getOptional("voiceCoord")

    /**
     * Number added to the basic window calculated from track qualities to ensure that windows still
     * allow valid correlations. Required if sysDefaultCode field is "MAN". Allowable entries are
     * 0.0 to 2.0 in increments of 0.25.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun winSizeMin(): Optional<Double> = winSizeMin.getOptional("winSizeMin")

    /**
     * The correlation window size multiplier to stretch or reduce the window size. Required if
     * sysDefaultCode field is "MAN". Allowable entries are 0.5 to 3.0 in increments of 0.1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun winSizeMult(): Optional<Double> = winSizeMult.getOptional("winSizeMult")

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
     * Returns the raw JSON value of [ackInstUnits].
     *
     * Unlike [ackInstUnits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ackInstUnits")
    @ExcludeMissing
    fun _ackInstUnits(): JsonField<List<String>> = ackInstUnits

    /**
     * Returns the raw JSON value of [ackReq].
     *
     * Unlike [ackReq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ackReq") @ExcludeMissing fun _ackReq(): JsonField<Boolean> = ackReq

    /**
     * Returns the raw JSON value of [altDiff].
     *
     * Unlike [altDiff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altDiff") @ExcludeMissing fun _altDiff(): JsonField<Int> = altDiff

    /**
     * Returns the raw JSON value of [canxId].
     *
     * Unlike [canxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canxId") @ExcludeMissing fun _canxId(): JsonField<String> = canxId

    /**
     * Returns the raw JSON value of [canxOriginator].
     *
     * Unlike [canxOriginator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canxOriginator")
    @ExcludeMissing
    fun _canxOriginator(): JsonField<String> = canxOriginator

    /**
     * Returns the raw JSON value of [canxSerialNum].
     *
     * Unlike [canxSerialNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canxSerialNum")
    @ExcludeMissing
    fun _canxSerialNum(): JsonField<String> = canxSerialNum

    /**
     * Returns the raw JSON value of [canxSiCs].
     *
     * Unlike [canxSiCs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canxSICs") @ExcludeMissing fun _canxSiCs(): JsonField<List<String>> = canxSiCs

    /**
     * Returns the raw JSON value of [canxSpecialNotation].
     *
     * Unlike [canxSpecialNotation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("canxSpecialNotation")
    @ExcludeMissing
    fun _canxSpecialNotation(): JsonField<String> = canxSpecialNotation

    /**
     * Returns the raw JSON value of [canxTs].
     *
     * Unlike [canxTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canxTs") @ExcludeMissing fun _canxTs(): JsonField<OffsetDateTime> = canxTs

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
     * Returns the raw JSON value of [consecDecorr].
     *
     * Unlike [consecDecorr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("consecDecorr") @ExcludeMissing fun _consecDecorr(): JsonField<Int> = consecDecorr

    /**
     * Returns the raw JSON value of [courseDiff].
     *
     * Unlike [courseDiff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("courseDiff") @ExcludeMissing fun _courseDiff(): JsonField<Int> = courseDiff

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
     * Returns the raw JSON value of [decExemptCodes].
     *
     * Unlike [decExemptCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decExemptCodes")
    @ExcludeMissing
    fun _decExemptCodes(): JsonField<List<String>> = decExemptCodes

    /**
     * Returns the raw JSON value of [decInstDates].
     *
     * Unlike [decInstDates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decInstDates")
    @ExcludeMissing
    fun _decInstDates(): JsonField<List<String>> = decInstDates

    /**
     * Returns the raw JSON value of [decorrWinMult].
     *
     * Unlike [decorrWinMult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decorrWinMult")
    @ExcludeMissing
    fun _decorrWinMult(): JsonField<Double> = decorrWinMult

    /**
     * Returns the raw JSON value of [geoDatum].
     *
     * Unlike [geoDatum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("geoDatum") @ExcludeMissing fun _geoDatum(): JsonField<String> = geoDatum

    /**
     * Returns the raw JSON value of [jreCallSign].
     *
     * Unlike [jreCallSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jreCallSign") @ExcludeMissing fun _jreCallSign(): JsonField<String> = jreCallSign

    /**
     * Returns the raw JSON value of [jreDetails].
     *
     * Unlike [jreDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jreDetails") @ExcludeMissing fun _jreDetails(): JsonField<String> = jreDetails

    /**
     * Returns the raw JSON value of [jrePriAdd].
     *
     * Unlike [jrePriAdd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jrePriAdd") @ExcludeMissing fun _jrePriAdd(): JsonField<Int> = jrePriAdd

    /**
     * Returns the raw JSON value of [jreSecAdd].
     *
     * Unlike [jreSecAdd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jreSecAdd") @ExcludeMissing fun _jreSecAdd(): JsonField<Int> = jreSecAdd

    /**
     * Returns the raw JSON value of [jreUnitDes].
     *
     * Unlike [jreUnitDes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jreUnitDes") @ExcludeMissing fun _jreUnitDes(): JsonField<String> = jreUnitDes

    /**
     * Returns the raw JSON value of [maxGeoPosQual].
     *
     * Unlike [maxGeoPosQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxGeoPosQual")
    @ExcludeMissing
    fun _maxGeoPosQual(): JsonField<Int> = maxGeoPosQual

    /**
     * Returns the raw JSON value of [maxTrackQual].
     *
     * Unlike [maxTrackQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxTrackQual") @ExcludeMissing fun _maxTrackQual(): JsonField<Int> = maxTrackQual

    /**
     * Returns the raw JSON value of [mgmtCode].
     *
     * Unlike [mgmtCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mgmtCode") @ExcludeMissing fun _mgmtCode(): JsonField<String> = mgmtCode

    /**
     * Returns the raw JSON value of [mgmtCodeMeaning].
     *
     * Unlike [mgmtCodeMeaning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mgmtCodeMeaning")
    @ExcludeMissing
    fun _mgmtCodeMeaning(): JsonField<String> = mgmtCodeMeaning

    /**
     * Returns the raw JSON value of [minGeoPosQual].
     *
     * Unlike [minGeoPosQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minGeoPosQual")
    @ExcludeMissing
    fun _minGeoPosQual(): JsonField<Int> = minGeoPosQual

    /**
     * Returns the raw JSON value of [minTrackQual].
     *
     * Unlike [minTrackQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("minTrackQual") @ExcludeMissing fun _minTrackQual(): JsonField<Int> = minTrackQual

    /**
     * Returns the raw JSON value of [month].
     *
     * Unlike [month], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("month") @ExcludeMissing fun _month(): JsonField<String> = month

    /**
     * Returns the raw JSON value of [multiDuty].
     *
     * Unlike [multiDuty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiDuty")
    @ExcludeMissing
    fun _multiDuty(): JsonField<List<MultiDuty>> = multiDuty

    /**
     * Returns the raw JSON value of [nonLinkUnitDes].
     *
     * Unlike [nonLinkUnitDes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nonLinkUnitDes")
    @ExcludeMissing
    fun _nonLinkUnitDes(): JsonField<List<String>> = nonLinkUnitDes

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
     * Returns the raw JSON value of [ops].
     *
     * Unlike [ops], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ops") @ExcludeMissing fun _ops(): JsonField<List<Op>> = ops

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
     * Returns the raw JSON value of [pocCallSign].
     *
     * Unlike [pocCallSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocCallSign") @ExcludeMissing fun _pocCallSign(): JsonField<String> = pocCallSign

    /**
     * Returns the raw JSON value of [pocLat].
     *
     * Unlike [pocLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocLat") @ExcludeMissing fun _pocLat(): JsonField<Double> = pocLat

    /**
     * Returns the raw JSON value of [pocLocName].
     *
     * Unlike [pocLocName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocLocName") @ExcludeMissing fun _pocLocName(): JsonField<String> = pocLocName

    /**
     * Returns the raw JSON value of [pocLon].
     *
     * Unlike [pocLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocLon") @ExcludeMissing fun _pocLon(): JsonField<Double> = pocLon

    /**
     * Returns the raw JSON value of [pocName].
     *
     * Unlike [pocName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocName") @ExcludeMissing fun _pocName(): JsonField<String> = pocName

    /**
     * Returns the raw JSON value of [pocNums].
     *
     * Unlike [pocNums], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocNums") @ExcludeMissing fun _pocNums(): JsonField<List<String>> = pocNums

    /**
     * Returns the raw JSON value of [pocRank].
     *
     * Unlike [pocRank], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pocRank") @ExcludeMissing fun _pocRank(): JsonField<String> = pocRank

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
     * Returns the raw JSON value of [references].
     *
     * Unlike [references], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("references")
    @ExcludeMissing
    fun _references(): JsonField<List<Reference>> = references

    /**
     * Returns the raw JSON value of [refPoints].
     *
     * Unlike [refPoints], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refPoints")
    @ExcludeMissing
    fun _refPoints(): JsonField<List<RefPoint>> = refPoints

    /**
     * Returns the raw JSON value of [remarks].
     *
     * Unlike [remarks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remarks") @ExcludeMissing fun _remarks(): JsonField<List<Remark>> = remarks

    /**
     * Returns the raw JSON value of [resTrackQual].
     *
     * Unlike [resTrackQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("resTrackQual") @ExcludeMissing fun _resTrackQual(): JsonField<Int> = resTrackQual

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
     * Returns the raw JSON value of [specTracks].
     *
     * Unlike [specTracks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("specTracks")
    @ExcludeMissing
    fun _specTracks(): JsonField<List<SpecTrack>> = specTracks

    /**
     * Returns the raw JSON value of [speedDiff].
     *
     * Unlike [speedDiff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speedDiff") @ExcludeMissing fun _speedDiff(): JsonField<Int> = speedDiff

    /**
     * Returns the raw JSON value of [stopTime].
     *
     * Unlike [stopTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopTime") @ExcludeMissing fun _stopTime(): JsonField<OffsetDateTime> = stopTime

    /**
     * Returns the raw JSON value of [stopTimeMod].
     *
     * Unlike [stopTimeMod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stopTimeMod") @ExcludeMissing fun _stopTimeMod(): JsonField<String> = stopTimeMod

    /**
     * Returns the raw JSON value of [sysDefaultCode].
     *
     * Unlike [sysDefaultCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sysDefaultCode")
    @ExcludeMissing
    fun _sysDefaultCode(): JsonField<String> = sysDefaultCode

    /**
     * Returns the raw JSON value of [trackNumBlockLLs].
     *
     * Unlike [trackNumBlockLLs], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("trackNumBlockLLs")
    @ExcludeMissing
    fun _trackNumBlockLLs(): JsonField<List<Int>> = trackNumBlockLLs

    /**
     * Returns the raw JSON value of [trackNumBlocks].
     *
     * Unlike [trackNumBlocks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trackNumBlocks")
    @ExcludeMissing
    fun _trackNumBlocks(): JsonField<List<String>> = trackNumBlocks

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
     * Returns the raw JSON value of [voiceCoord].
     *
     * Unlike [voiceCoord], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voiceCoord")
    @ExcludeMissing
    fun _voiceCoord(): JsonField<List<VoiceCoord>> = voiceCoord

    /**
     * Returns the raw JSON value of [winSizeMin].
     *
     * Unlike [winSizeMin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("winSizeMin") @ExcludeMissing fun _winSizeMin(): JsonField<Double> = winSizeMin

    /**
     * Returns the raw JSON value of [winSizeMult].
     *
     * Unlike [winSizeMult], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("winSizeMult") @ExcludeMissing fun _winSizeMult(): JsonField<Double> = winSizeMult

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
         * Returns a mutable builder for constructing an instance of [DatalinkIngest].
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

    /** A builder for [DatalinkIngest]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var opExName: JsonField<String>? = null
        private var originator: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var startTime: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var ackInstUnits: JsonField<MutableList<String>>? = null
        private var ackReq: JsonField<Boolean> = JsonMissing.of()
        private var altDiff: JsonField<Int> = JsonMissing.of()
        private var canxId: JsonField<String> = JsonMissing.of()
        private var canxOriginator: JsonField<String> = JsonMissing.of()
        private var canxSerialNum: JsonField<String> = JsonMissing.of()
        private var canxSiCs: JsonField<MutableList<String>>? = null
        private var canxSpecialNotation: JsonField<String> = JsonMissing.of()
        private var canxTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var classReasons: JsonField<MutableList<String>>? = null
        private var classSource: JsonField<String> = JsonMissing.of()
        private var consecDecorr: JsonField<Int> = JsonMissing.of()
        private var courseDiff: JsonField<Int> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var decExemptCodes: JsonField<MutableList<String>>? = null
        private var decInstDates: JsonField<MutableList<String>>? = null
        private var decorrWinMult: JsonField<Double> = JsonMissing.of()
        private var geoDatum: JsonField<String> = JsonMissing.of()
        private var jreCallSign: JsonField<String> = JsonMissing.of()
        private var jreDetails: JsonField<String> = JsonMissing.of()
        private var jrePriAdd: JsonField<Int> = JsonMissing.of()
        private var jreSecAdd: JsonField<Int> = JsonMissing.of()
        private var jreUnitDes: JsonField<String> = JsonMissing.of()
        private var maxGeoPosQual: JsonField<Int> = JsonMissing.of()
        private var maxTrackQual: JsonField<Int> = JsonMissing.of()
        private var mgmtCode: JsonField<String> = JsonMissing.of()
        private var mgmtCodeMeaning: JsonField<String> = JsonMissing.of()
        private var minGeoPosQual: JsonField<Int> = JsonMissing.of()
        private var minTrackQual: JsonField<Int> = JsonMissing.of()
        private var month: JsonField<String> = JsonMissing.of()
        private var multiDuty: JsonField<MutableList<MultiDuty>>? = null
        private var nonLinkUnitDes: JsonField<MutableList<String>>? = null
        private var opExInfo: JsonField<String> = JsonMissing.of()
        private var opExInfoAlt: JsonField<String> = JsonMissing.of()
        private var ops: JsonField<MutableList<Op>>? = null
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var planOrigNum: JsonField<String> = JsonMissing.of()
        private var pocCallSign: JsonField<String> = JsonMissing.of()
        private var pocLat: JsonField<Double> = JsonMissing.of()
        private var pocLocName: JsonField<String> = JsonMissing.of()
        private var pocLon: JsonField<Double> = JsonMissing.of()
        private var pocName: JsonField<String> = JsonMissing.of()
        private var pocNums: JsonField<MutableList<String>>? = null
        private var pocRank: JsonField<String> = JsonMissing.of()
        private var qualifier: JsonField<String> = JsonMissing.of()
        private var qualSn: JsonField<Int> = JsonMissing.of()
        private var references: JsonField<MutableList<Reference>>? = null
        private var refPoints: JsonField<MutableList<RefPoint>>? = null
        private var remarks: JsonField<MutableList<Remark>>? = null
        private var resTrackQual: JsonField<Int> = JsonMissing.of()
        private var serialNum: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var specTracks: JsonField<MutableList<SpecTrack>>? = null
        private var speedDiff: JsonField<Int> = JsonMissing.of()
        private var stopTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var stopTimeMod: JsonField<String> = JsonMissing.of()
        private var sysDefaultCode: JsonField<String> = JsonMissing.of()
        private var trackNumBlockLLs: JsonField<MutableList<Int>>? = null
        private var trackNumBlocks: JsonField<MutableList<String>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var voiceCoord: JsonField<MutableList<VoiceCoord>>? = null
        private var winSizeMin: JsonField<Double> = JsonMissing.of()
        private var winSizeMult: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datalinkIngest: DatalinkIngest) = apply {
            classificationMarking = datalinkIngest.classificationMarking
            dataMode = datalinkIngest.dataMode
            opExName = datalinkIngest.opExName
            originator = datalinkIngest.originator
            source = datalinkIngest.source
            startTime = datalinkIngest.startTime
            id = datalinkIngest.id
            ackInstUnits = datalinkIngest.ackInstUnits.map { it.toMutableList() }
            ackReq = datalinkIngest.ackReq
            altDiff = datalinkIngest.altDiff
            canxId = datalinkIngest.canxId
            canxOriginator = datalinkIngest.canxOriginator
            canxSerialNum = datalinkIngest.canxSerialNum
            canxSiCs = datalinkIngest.canxSiCs.map { it.toMutableList() }
            canxSpecialNotation = datalinkIngest.canxSpecialNotation
            canxTs = datalinkIngest.canxTs
            classReasons = datalinkIngest.classReasons.map { it.toMutableList() }
            classSource = datalinkIngest.classSource
            consecDecorr = datalinkIngest.consecDecorr
            courseDiff = datalinkIngest.courseDiff
            createdAt = datalinkIngest.createdAt
            createdBy = datalinkIngest.createdBy
            decExemptCodes = datalinkIngest.decExemptCodes.map { it.toMutableList() }
            decInstDates = datalinkIngest.decInstDates.map { it.toMutableList() }
            decorrWinMult = datalinkIngest.decorrWinMult
            geoDatum = datalinkIngest.geoDatum
            jreCallSign = datalinkIngest.jreCallSign
            jreDetails = datalinkIngest.jreDetails
            jrePriAdd = datalinkIngest.jrePriAdd
            jreSecAdd = datalinkIngest.jreSecAdd
            jreUnitDes = datalinkIngest.jreUnitDes
            maxGeoPosQual = datalinkIngest.maxGeoPosQual
            maxTrackQual = datalinkIngest.maxTrackQual
            mgmtCode = datalinkIngest.mgmtCode
            mgmtCodeMeaning = datalinkIngest.mgmtCodeMeaning
            minGeoPosQual = datalinkIngest.minGeoPosQual
            minTrackQual = datalinkIngest.minTrackQual
            month = datalinkIngest.month
            multiDuty = datalinkIngest.multiDuty.map { it.toMutableList() }
            nonLinkUnitDes = datalinkIngest.nonLinkUnitDes.map { it.toMutableList() }
            opExInfo = datalinkIngest.opExInfo
            opExInfoAlt = datalinkIngest.opExInfoAlt
            ops = datalinkIngest.ops.map { it.toMutableList() }
            origin = datalinkIngest.origin
            origNetwork = datalinkIngest.origNetwork
            planOrigNum = datalinkIngest.planOrigNum
            pocCallSign = datalinkIngest.pocCallSign
            pocLat = datalinkIngest.pocLat
            pocLocName = datalinkIngest.pocLocName
            pocLon = datalinkIngest.pocLon
            pocName = datalinkIngest.pocName
            pocNums = datalinkIngest.pocNums.map { it.toMutableList() }
            pocRank = datalinkIngest.pocRank
            qualifier = datalinkIngest.qualifier
            qualSn = datalinkIngest.qualSn
            references = datalinkIngest.references.map { it.toMutableList() }
            refPoints = datalinkIngest.refPoints.map { it.toMutableList() }
            remarks = datalinkIngest.remarks.map { it.toMutableList() }
            resTrackQual = datalinkIngest.resTrackQual
            serialNum = datalinkIngest.serialNum
            sourceDl = datalinkIngest.sourceDl
            specTracks = datalinkIngest.specTracks.map { it.toMutableList() }
            speedDiff = datalinkIngest.speedDiff
            stopTime = datalinkIngest.stopTime
            stopTimeMod = datalinkIngest.stopTimeMod
            sysDefaultCode = datalinkIngest.sysDefaultCode
            trackNumBlockLLs = datalinkIngest.trackNumBlockLLs.map { it.toMutableList() }
            trackNumBlocks = datalinkIngest.trackNumBlocks.map { it.toMutableList() }
            updatedAt = datalinkIngest.updatedAt
            updatedBy = datalinkIngest.updatedBy
            voiceCoord = datalinkIngest.voiceCoord.map { it.toMutableList() }
            winSizeMin = datalinkIngest.winSizeMin
            winSizeMult = datalinkIngest.winSizeMult
            additionalProperties = datalinkIngest.additionalProperties.toMutableMap()
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
         * The start of the effective time period of this data link message, in ISO 8601 UTC format
         * with millisecond precision.
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

        /**
         * Unique identifier of the record, auto-generated by the system if not provided on create
         * operations.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Array of instructions for acknowledging and the force or units required to acknowledge
         * the data link message being sent.
         */
        fun ackInstUnits(ackInstUnits: List<String>) = ackInstUnits(JsonField.of(ackInstUnits))

        /**
         * Sets [Builder.ackInstUnits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ackInstUnits] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ackInstUnits(ackInstUnits: JsonField<List<String>>) = apply {
            this.ackInstUnits = ackInstUnits.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [ackInstUnits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAckInstUnit(ackInstUnit: String) = apply {
            ackInstUnits =
                (ackInstUnits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ackInstUnits", it).add(ackInstUnit)
                }
        }

        /**
         * Flag Indicating if formal acknowledgement is required for the particular data link
         * message being sent.
         */
        fun ackReq(ackReq: Boolean) = ackReq(JsonField.of(ackReq))

        /**
         * Sets [Builder.ackReq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ackReq] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ackReq(ackReq: JsonField<Boolean>) = apply { this.ackReq = ackReq }

        /**
         * Maximum altitude difference between two air tracks, in thousands of feet. Required if
         * sysDefaultCode field is "MAN". Allowable entires are 5 to 50 in increments of 5000 feet.
         */
        fun altDiff(altDiff: Int) = altDiff(JsonField.of(altDiff))

        /**
         * Sets [Builder.altDiff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altDiff] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun altDiff(altDiff: JsonField<Int>) = apply { this.altDiff = altDiff }

        /** The identifier for this data link message cancellation. */
        fun canxId(canxId: String) = canxId(JsonField.of(canxId))

        /**
         * Sets [Builder.canxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun canxId(canxId: JsonField<String>) = apply { this.canxId = canxId }

        /** The originator of this data link message cancellation. */
        fun canxOriginator(canxOriginator: String) = canxOriginator(JsonField.of(canxOriginator))

        /**
         * Sets [Builder.canxOriginator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canxOriginator] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canxOriginator(canxOriginator: JsonField<String>) = apply {
            this.canxOriginator = canxOriginator
        }

        /** Serial number assigned to this data link message cancellation. */
        fun canxSerialNum(canxSerialNum: String) = canxSerialNum(JsonField.of(canxSerialNum))

        /**
         * Sets [Builder.canxSerialNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canxSerialNum] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canxSerialNum(canxSerialNum: JsonField<String>) = apply {
            this.canxSerialNum = canxSerialNum
        }

        /**
         * Array of NATO Subject Indicator Codes (SIC) or filing numbers of this data link message
         * or document being cancelled.
         */
        fun canxSiCs(canxSiCs: List<String>) = canxSiCs(JsonField.of(canxSiCs))

        /**
         * Sets [Builder.canxSiCs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canxSiCs] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canxSiCs(canxSiCs: JsonField<List<String>>) = apply {
            this.canxSiCs = canxSiCs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [canxSiCs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCanxSiC(canxSiC: String) = apply {
            canxSiCs =
                (canxSiCs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("canxSiCs", it).add(canxSiC)
                }
        }

        /**
         * Indicates any special actions, restrictions, guidance, or information relating to this
         * data link message cancellation.
         */
        fun canxSpecialNotation(canxSpecialNotation: String) =
            canxSpecialNotation(JsonField.of(canxSpecialNotation))

        /**
         * Sets [Builder.canxSpecialNotation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canxSpecialNotation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canxSpecialNotation(canxSpecialNotation: JsonField<String>) = apply {
            this.canxSpecialNotation = canxSpecialNotation
        }

        /**
         * Timestamp of the data link message cancellation, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun canxTs(canxTs: OffsetDateTime) = canxTs(JsonField.of(canxTs))

        /**
         * Sets [Builder.canxTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canxTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canxTs(canxTs: JsonField<OffsetDateTime>) = apply { this.canxTs = canxTs }

        /** Array of codes that indicate the reasons material is classified. */
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
         * Markings that define the source material or the original classification authority for
         * this data link message.
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

        /**
         * Number of consecutive remote track reports that must meet the decorrelation criteria
         * before the decorrelation is executed. Required if sysDefaultCode field is "MAN".
         * Allowable entries are integers from 1 to 5.
         */
        fun consecDecorr(consecDecorr: Int) = consecDecorr(JsonField.of(consecDecorr))

        /**
         * Sets [Builder.consecDecorr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.consecDecorr] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun consecDecorr(consecDecorr: JsonField<Int>) = apply { this.consecDecorr = consecDecorr }

        /**
         * Maximum difference between the reported course of the remote track and the calculated
         * course of the local track. Required if sysDefaultCode field is "MAN". Allowable entries
         * are 15 to 90 in increments of 15 degrees.
         */
        fun courseDiff(courseDiff: Int) = courseDiff(JsonField.of(courseDiff))

        /**
         * Sets [Builder.courseDiff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.courseDiff] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun courseDiff(courseDiff: JsonField<Int>) = apply { this.courseDiff = courseDiff }

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
         * Array of codes that provide justification for exemption from automatic downgrading or
         * declassification.
         */
        fun decExemptCodes(decExemptCodes: List<String>) =
            decExemptCodes(JsonField.of(decExemptCodes))

        /**
         * Sets [Builder.decExemptCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decExemptCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decExemptCodes(decExemptCodes: JsonField<List<String>>) = apply {
            this.decExemptCodes = decExemptCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [decExemptCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDecExemptCode(decExemptCode: String) = apply {
            decExemptCodes =
                (decExemptCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("decExemptCodes", it).add(decExemptCode)
                }
        }

        /**
         * Array of markings that provide the literal guidance or dates for the downgrading or
         * declassification of this data link message.
         */
        fun decInstDates(decInstDates: List<String>) = decInstDates(JsonField.of(decInstDates))

        /**
         * Sets [Builder.decInstDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decInstDates] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decInstDates(decInstDates: JsonField<List<String>>) = apply {
            this.decInstDates = decInstDates.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [decInstDates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDecInstDate(decInstDate: String) = apply {
            decInstDates =
                (decInstDates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("decInstDates", it).add(decInstDate)
                }
        }

        /**
         * Distance between the common and remote track is to exceed the applicable correlation
         * window for the two tracks in order to be decorrelated. Required if sysDefaultCode field
         * is "MAN". Allowable entries are 1.0 to 2.0 in increments of 0.1.
         */
        fun decorrWinMult(decorrWinMult: Double) = decorrWinMult(JsonField.of(decorrWinMult))

        /**
         * Sets [Builder.decorrWinMult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decorrWinMult] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun decorrWinMult(decorrWinMult: JsonField<Double>) = apply {
            this.decorrWinMult = decorrWinMult
        }

        /**
         * The code for the point of reference from which the coordinates and networks are computed.
         */
        fun geoDatum(geoDatum: String) = geoDatum(JsonField.of(geoDatum))

        /**
         * Sets [Builder.geoDatum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.geoDatum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun geoDatum(geoDatum: JsonField<String>) = apply { this.geoDatum = geoDatum }

        /**
         * Call sign which identifies one or more communications facilities, commands, authorities,
         * or activities for Joint Range Extension (JRE) units.
         */
        fun jreCallSign(jreCallSign: String) = jreCallSign(JsonField.of(jreCallSign))

        /**
         * Sets [Builder.jreCallSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jreCallSign] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jreCallSign(jreCallSign: JsonField<String>) = apply { this.jreCallSign = jreCallSign }

        /** Joint Range Extension (JRE) unit details. */
        fun jreDetails(jreDetails: String) = jreDetails(JsonField.of(jreDetails))

        /**
         * Sets [Builder.jreDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jreDetails] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jreDetails(jreDetails: JsonField<String>) = apply { this.jreDetails = jreDetails }

        /** Link-16 octal track number assigned as the primary JTIDS unit address. */
        fun jrePriAdd(jrePriAdd: Int) = jrePriAdd(JsonField.of(jrePriAdd))

        /**
         * Sets [Builder.jrePriAdd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jrePriAdd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jrePriAdd(jrePriAdd: JsonField<Int>) = apply { this.jrePriAdd = jrePriAdd }

        /** Link-16 octal track number assigned as the secondary JTIDS unit address. */
        fun jreSecAdd(jreSecAdd: Int) = jreSecAdd(JsonField.of(jreSecAdd))

        /**
         * Sets [Builder.jreSecAdd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jreSecAdd] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jreSecAdd(jreSecAdd: JsonField<Int>) = apply { this.jreSecAdd = jreSecAdd }

        /** Designator of the unit for Joint Range Extension (JRE). */
        fun jreUnitDes(jreUnitDes: String) = jreUnitDes(JsonField.of(jreUnitDes))

        /**
         * Sets [Builder.jreUnitDes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jreUnitDes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun jreUnitDes(jreUnitDes: JsonField<String>) = apply { this.jreUnitDes = jreUnitDes }

        /**
         * Number used for maximum geodetic position quality. Required if sysDefaultCode field is
         * "MAN". Allowable entires are integers from 1 to 15.
         */
        fun maxGeoPosQual(maxGeoPosQual: Int) = maxGeoPosQual(JsonField.of(maxGeoPosQual))

        /**
         * Sets [Builder.maxGeoPosQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxGeoPosQual] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxGeoPosQual(maxGeoPosQual: JsonField<Int>) = apply {
            this.maxGeoPosQual = maxGeoPosQual
        }

        /**
         * Track quality to prevent correlation windows from being unrealistically small. Required
         * if sysDefaultCode field is "MAN". Allowable entries are integers from 8 to 15.
         */
        fun maxTrackQual(maxTrackQual: Int) = maxTrackQual(JsonField.of(maxTrackQual))

        /**
         * Sets [Builder.maxTrackQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTrackQual] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxTrackQual(maxTrackQual: JsonField<Int>) = apply { this.maxTrackQual = maxTrackQual }

        /** Data link management code word. */
        fun mgmtCode(mgmtCode: String) = mgmtCode(JsonField.of(mgmtCode))

        /**
         * Sets [Builder.mgmtCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mgmtCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mgmtCode(mgmtCode: JsonField<String>) = apply { this.mgmtCode = mgmtCode }

        /** Data link management code word meaning. */
        fun mgmtCodeMeaning(mgmtCodeMeaning: String) =
            mgmtCodeMeaning(JsonField.of(mgmtCodeMeaning))

        /**
         * Sets [Builder.mgmtCodeMeaning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mgmtCodeMeaning] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mgmtCodeMeaning(mgmtCodeMeaning: JsonField<String>) = apply {
            this.mgmtCodeMeaning = mgmtCodeMeaning
        }

        /**
         * Number used for minimum geodetic position quality. Required if sysDefaultCode field is
         * "MAN". Allowable entries are integers from 1 to 5.
         */
        fun minGeoPosQual(minGeoPosQual: Int) = minGeoPosQual(JsonField.of(minGeoPosQual))

        /**
         * Sets [Builder.minGeoPosQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minGeoPosQual] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minGeoPosQual(minGeoPosQual: JsonField<Int>) = apply {
            this.minGeoPosQual = minGeoPosQual
        }

        /**
         * Track quality to prevent correlation windows from being unrealistically large. Required
         * if sysDefaultCode field is "MAN". Allowable entries are integers from 3 to 7.
         */
        fun minTrackQual(minTrackQual: Int) = minTrackQual(JsonField.of(minTrackQual))

        /**
         * Sets [Builder.minTrackQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minTrackQual] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minTrackQual(minTrackQual: JsonField<Int>) = apply { this.minTrackQual = minTrackQual }

        /** The month in which this message originated. */
        fun month(month: String) = month(JsonField.of(month))

        /**
         * Sets [Builder.month] to an arbitrary JSON value.
         *
         * You should usually call [Builder.month] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun month(month: JsonField<String>) = apply { this.month = month }

        /**
         * Collection of contact and identification information for designated multilink coordinator
         * duty assignments. There can be 0 to many DataLinkMultiDuty collections within the
         * datalink service.
         */
        fun multiDuty(multiDuty: List<MultiDuty>) = multiDuty(JsonField.of(multiDuty))

        /**
         * Sets [Builder.multiDuty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiDuty] with a well-typed `List<MultiDuty>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun multiDuty(multiDuty: JsonField<List<MultiDuty>>) = apply {
            this.multiDuty = multiDuty.map { it.toMutableList() }
        }

        /**
         * Adds a single [MultiDuty] to [Builder.multiDuty].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMultiDuty(multiDuty: MultiDuty) = apply {
            this.multiDuty =
                (this.multiDuty ?: JsonField.of(mutableListOf())).also {
                    checkKnown("multiDuty", it).add(multiDuty)
                }
        }

        /** Array of non-link specific data unit designators. */
        fun nonLinkUnitDes(nonLinkUnitDes: List<String>) =
            nonLinkUnitDes(JsonField.of(nonLinkUnitDes))

        /**
         * Sets [Builder.nonLinkUnitDes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonLinkUnitDes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun nonLinkUnitDes(nonLinkUnitDes: JsonField<List<String>>) = apply {
            this.nonLinkUnitDes = nonLinkUnitDes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [nonLinkUnitDes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNonLinkUnitDe(nonLinkUnitDe: String) = apply {
            nonLinkUnitDes =
                (nonLinkUnitDes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("nonLinkUnitDes", it).add(nonLinkUnitDe)
                }
        }

        /**
         * Provides an additional caveat further identifying the exercise or modifies the exercise
         * nickname.
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
         * The secondary nickname of the option or the alternative of the operational plan or order.
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
         * Collection of information describing the establishment and detailed operation of tactical
         * data links. There can be 0 to many DataLinkOps collections within the datalink service.
         */
        fun ops(ops: List<Op>) = ops(JsonField.of(ops))

        /**
         * Sets [Builder.ops] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ops] with a well-typed `List<Op>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ops(ops: JsonField<List<Op>>) = apply { this.ops = ops.map { it.toMutableList() } }

        /**
         * Adds a single [Op] to [ops].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOp(op: Op) = apply {
            ops = (ops ?: JsonField.of(mutableListOf())).also { checkKnown("ops", it).add(op) }
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

        /** The unit identifier or call sign of the point of contact for this data link message. */
        fun pocCallSign(pocCallSign: String) = pocCallSign(JsonField.of(pocCallSign))

        /**
         * Sets [Builder.pocCallSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocCallSign] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pocCallSign(pocCallSign: JsonField<String>) = apply { this.pocCallSign = pocCallSign }

        /**
         * WGS84 latitude of the point of contact for this data link message, in degrees. -90 to 90
         * degrees (negative values south of equator).
         */
        fun pocLat(pocLat: Double) = pocLat(JsonField.of(pocLat))

        /**
         * Sets [Builder.pocLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocLat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pocLat(pocLat: JsonField<Double>) = apply { this.pocLat = pocLat }

        /** The location name of the point of contact for this data link message. */
        fun pocLocName(pocLocName: String) = pocLocName(JsonField.of(pocLocName))

        /**
         * Sets [Builder.pocLocName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocLocName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pocLocName(pocLocName: JsonField<String>) = apply { this.pocLocName = pocLocName }

        /**
         * WGS84 longitude of the point of contact for this data link message, in degrees. -180 to
         * 180 degrees (negative values west of Prime Meridian).
         */
        fun pocLon(pocLon: Double) = pocLon(JsonField.of(pocLon))

        /**
         * Sets [Builder.pocLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocLon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pocLon(pocLon: JsonField<Double>) = apply { this.pocLon = pocLon }

        /** The name of the point of contact for this data link message. */
        fun pocName(pocName: String) = pocName(JsonField.of(pocName))

        /**
         * Sets [Builder.pocName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pocName(pocName: JsonField<String>) = apply { this.pocName = pocName }

        /**
         * Array of telephone numbers, radio frequency values, or email addresses of the point of
         * contact for this data link message.
         */
        fun pocNums(pocNums: List<String>) = pocNums(JsonField.of(pocNums))

        /**
         * Sets [Builder.pocNums] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocNums] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun pocNums(pocNums: JsonField<List<String>>) = apply {
            this.pocNums = pocNums.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [pocNums].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPocNum(pocNum: String) = apply {
            pocNums =
                (pocNums ?: JsonField.of(mutableListOf())).also {
                    checkKnown("pocNums", it).add(pocNum)
                }
        }

        /**
         * The rank or position of the point of contact for this data link message in a military or
         * civilian organization.
         */
        fun pocRank(pocRank: String) = pocRank(JsonField.of(pocRank))

        /**
         * Sets [Builder.pocRank] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pocRank] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pocRank(pocRank: JsonField<String>) = apply { this.pocRank = pocRank }

        /**
         * The qualifier which caveats the message status such as AMP (Amplification), CHG (Change),
         * etc.
         */
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

        /**
         * Collection of reference information. There can be 0 to many DataLinkReferences
         * collections within the datalink service.
         */
        fun references(references: List<Reference>) = references(JsonField.of(references))

        /**
         * Sets [Builder.references] to an arbitrary JSON value.
         *
         * You should usually call [Builder.references] with a well-typed `List<Reference>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun references(references: JsonField<List<Reference>>) = apply {
            this.references = references.map { it.toMutableList() }
        }

        /**
         * Adds a single [Reference] to [references].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReference(reference: Reference) = apply {
            references =
                (references ?: JsonField.of(mutableListOf())).also {
                    checkKnown("references", it).add(reference)
                }
        }

        /**
         * Collection that identifies points of reference used in the establishment of the data
         * links. There can be 1 to many DataLinkRefPoints collections within the datalink service.
         */
        fun refPoints(refPoints: List<RefPoint>) = refPoints(JsonField.of(refPoints))

        /**
         * Sets [Builder.refPoints] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refPoints] with a well-typed `List<RefPoint>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun refPoints(refPoints: JsonField<List<RefPoint>>) = apply {
            this.refPoints = refPoints.map { it.toMutableList() }
        }

        /**
         * Adds a single [RefPoint] to [refPoints].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefPoint(refPoint: RefPoint) = apply {
            refPoints =
                (refPoints ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refPoints", it).add(refPoint)
                }
        }

        /** Collection of remarks associated with this data link message. */
        fun remarks(remarks: List<Remark>) = remarks(JsonField.of(remarks))

        /**
         * Sets [Builder.remarks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remarks] with a well-typed `List<Remark>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun remarks(remarks: JsonField<List<Remark>>) = apply {
            this.remarks = remarks.map { it.toMutableList() }
        }

        /**
         * Adds a single [Remark] to [remarks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemark(remark: Remark) = apply {
            remarks =
                (remarks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("remarks", it).add(remark)
                }
        }

        /**
         * Track quality to enter if too many duals involving low track quality tracks are
         * occurring. Required if sysDefaultCode field is "MAN". Allowable entries are integers from
         * 2 to 6.
         */
        fun resTrackQual(resTrackQual: Int) = resTrackQual(JsonField.of(resTrackQual))

        /**
         * Sets [Builder.resTrackQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resTrackQual] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun resTrackQual(resTrackQual: JsonField<Int>) = apply { this.resTrackQual = resTrackQual }

        /** The unique message identifier assigned by the originator. */
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
         * Collection of special track numbers used on the data links. There can be 0 to many
         * DataLinkSpecTracks collections within the datalink service.
         */
        fun specTracks(specTracks: List<SpecTrack>) = specTracks(JsonField.of(specTracks))

        /**
         * Sets [Builder.specTracks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.specTracks] with a well-typed `List<SpecTrack>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun specTracks(specTracks: JsonField<List<SpecTrack>>) = apply {
            this.specTracks = specTracks.map { it.toMutableList() }
        }

        /**
         * Adds a single [SpecTrack] to [specTracks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSpecTrack(specTrack: SpecTrack) = apply {
            specTracks =
                (specTracks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("specTracks", it).add(specTrack)
                }
        }

        /**
         * Maximum percentage the faster track speed may differ from the slower track speed.
         * Required if sysDefaultCode field is "MAN". Allowable entries are 10 to 100 in increments
         * of 10.
         */
        fun speedDiff(speedDiff: Int) = speedDiff(JsonField.of(speedDiff))

        /**
         * Sets [Builder.speedDiff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speedDiff] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun speedDiff(speedDiff: JsonField<Int>) = apply { this.speedDiff = speedDiff }

        /**
         * The end of the effective time period of this data link message, in ISO 8601 UTC format
         * with millisecond precision. This may be a relative stop time if used with stopTimeMod.
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
         * A qualifier for the end of the effective time period of this data link message, such as
         * AFTER, ASOF, NLT, etc. Used with field stopTime to indicate a relative time.
         */
        fun stopTimeMod(stopTimeMod: String) = stopTimeMod(JsonField.of(stopTimeMod))

        /**
         * Sets [Builder.stopTimeMod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopTimeMod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stopTimeMod(stopTimeMod: JsonField<String>) = apply { this.stopTimeMod = stopTimeMod }

        /**
         * Indicates the data terminal settings the system defaults to, either automatic
         * correlation/decorrelation (AUTO) or manual (MAN).
         */
        fun sysDefaultCode(sysDefaultCode: String) = sysDefaultCode(JsonField.of(sysDefaultCode))

        /**
         * Sets [Builder.sysDefaultCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sysDefaultCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sysDefaultCode(sysDefaultCode: JsonField<String>) = apply {
            this.sysDefaultCode = sysDefaultCode
        }

        /** Array of Link-16 octal track numbers used as the lower limit of a track block. */
        fun trackNumBlockLLs(trackNumBlockLLs: List<Int>) =
            trackNumBlockLLs(JsonField.of(trackNumBlockLLs))

        /**
         * Sets [Builder.trackNumBlockLLs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackNumBlockLLs] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trackNumBlockLLs(trackNumBlockLLs: JsonField<List<Int>>) = apply {
            this.trackNumBlockLLs = trackNumBlockLLs.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [trackNumBlockLLs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrackNumBlockLl(trackNumBlockLL: Int) = apply {
            trackNumBlockLLs =
                (trackNumBlockLLs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("trackNumBlockLLs", it).add(trackNumBlockLL)
                }
        }

        /**
         * Array of defined ranges of Link-11/11B track numbers assigned to a participating unit or
         * reporting unit.
         */
        fun trackNumBlocks(trackNumBlocks: List<String>) =
            trackNumBlocks(JsonField.of(trackNumBlocks))

        /**
         * Sets [Builder.trackNumBlocks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trackNumBlocks] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trackNumBlocks(trackNumBlocks: JsonField<List<String>>) = apply {
            this.trackNumBlocks = trackNumBlocks.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [trackNumBlocks].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTrackNumBlock(trackNumBlock: String) = apply {
            trackNumBlocks =
                (trackNumBlocks ?: JsonField.of(mutableListOf())).also {
                    checkKnown("trackNumBlocks", it).add(trackNumBlock)
                }
        }

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
         * Collection of information regarding the function, frequency, and priority of interface
         * control and coordination nets for this data link message. There can be 1 to many
         * DataLinkVoiceCoord collections within the datalink service.
         */
        fun voiceCoord(voiceCoord: List<VoiceCoord>) = voiceCoord(JsonField.of(voiceCoord))

        /**
         * Sets [Builder.voiceCoord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voiceCoord] with a well-typed `List<VoiceCoord>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voiceCoord(voiceCoord: JsonField<List<VoiceCoord>>) = apply {
            this.voiceCoord = voiceCoord.map { it.toMutableList() }
        }

        /**
         * Adds a single [VoiceCoord] to [Builder.voiceCoord].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVoiceCoord(voiceCoord: VoiceCoord) = apply {
            this.voiceCoord =
                (this.voiceCoord ?: JsonField.of(mutableListOf())).also {
                    checkKnown("voiceCoord", it).add(voiceCoord)
                }
        }

        /**
         * Number added to the basic window calculated from track qualities to ensure that windows
         * still allow valid correlations. Required if sysDefaultCode field is "MAN". Allowable
         * entries are 0.0 to 2.0 in increments of 0.25.
         */
        fun winSizeMin(winSizeMin: Double) = winSizeMin(JsonField.of(winSizeMin))

        /**
         * Sets [Builder.winSizeMin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.winSizeMin] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun winSizeMin(winSizeMin: JsonField<Double>) = apply { this.winSizeMin = winSizeMin }

        /**
         * The correlation window size multiplier to stretch or reduce the window size. Required if
         * sysDefaultCode field is "MAN". Allowable entries are 0.5 to 3.0 in increments of 0.1.
         */
        fun winSizeMult(winSizeMult: Double) = winSizeMult(JsonField.of(winSizeMult))

        /**
         * Sets [Builder.winSizeMult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.winSizeMult] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun winSizeMult(winSizeMult: JsonField<Double>) = apply { this.winSizeMult = winSizeMult }

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
         * Returns an immutable instance of [DatalinkIngest].
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
        fun build(): DatalinkIngest =
            DatalinkIngest(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("opExName", opExName),
                checkRequired("originator", originator),
                checkRequired("source", source),
                checkRequired("startTime", startTime),
                id,
                (ackInstUnits ?: JsonMissing.of()).map { it.toImmutable() },
                ackReq,
                altDiff,
                canxId,
                canxOriginator,
                canxSerialNum,
                (canxSiCs ?: JsonMissing.of()).map { it.toImmutable() },
                canxSpecialNotation,
                canxTs,
                (classReasons ?: JsonMissing.of()).map { it.toImmutable() },
                classSource,
                consecDecorr,
                courseDiff,
                createdAt,
                createdBy,
                (decExemptCodes ?: JsonMissing.of()).map { it.toImmutable() },
                (decInstDates ?: JsonMissing.of()).map { it.toImmutable() },
                decorrWinMult,
                geoDatum,
                jreCallSign,
                jreDetails,
                jrePriAdd,
                jreSecAdd,
                jreUnitDes,
                maxGeoPosQual,
                maxTrackQual,
                mgmtCode,
                mgmtCodeMeaning,
                minGeoPosQual,
                minTrackQual,
                month,
                (multiDuty ?: JsonMissing.of()).map { it.toImmutable() },
                (nonLinkUnitDes ?: JsonMissing.of()).map { it.toImmutable() },
                opExInfo,
                opExInfoAlt,
                (ops ?: JsonMissing.of()).map { it.toImmutable() },
                origin,
                origNetwork,
                planOrigNum,
                pocCallSign,
                pocLat,
                pocLocName,
                pocLon,
                pocName,
                (pocNums ?: JsonMissing.of()).map { it.toImmutable() },
                pocRank,
                qualifier,
                qualSn,
                (references ?: JsonMissing.of()).map { it.toImmutable() },
                (refPoints ?: JsonMissing.of()).map { it.toImmutable() },
                (remarks ?: JsonMissing.of()).map { it.toImmutable() },
                resTrackQual,
                serialNum,
                sourceDl,
                (specTracks ?: JsonMissing.of()).map { it.toImmutable() },
                speedDiff,
                stopTime,
                stopTimeMod,
                sysDefaultCode,
                (trackNumBlockLLs ?: JsonMissing.of()).map { it.toImmutable() },
                (trackNumBlocks ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                updatedBy,
                (voiceCoord ?: JsonMissing.of()).map { it.toImmutable() },
                winSizeMin,
                winSizeMult,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatalinkIngest = apply {
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
        ackInstUnits()
        ackReq()
        altDiff()
        canxId()
        canxOriginator()
        canxSerialNum()
        canxSiCs()
        canxSpecialNotation()
        canxTs()
        classReasons()
        classSource()
        consecDecorr()
        courseDiff()
        createdAt()
        createdBy()
        decExemptCodes()
        decInstDates()
        decorrWinMult()
        geoDatum()
        jreCallSign()
        jreDetails()
        jrePriAdd()
        jreSecAdd()
        jreUnitDes()
        maxGeoPosQual()
        maxTrackQual()
        mgmtCode()
        mgmtCodeMeaning()
        minGeoPosQual()
        minTrackQual()
        month()
        multiDuty().ifPresent { it.forEach { it.validate() } }
        nonLinkUnitDes()
        opExInfo()
        opExInfoAlt()
        ops().ifPresent { it.forEach { it.validate() } }
        origin()
        origNetwork()
        planOrigNum()
        pocCallSign()
        pocLat()
        pocLocName()
        pocLon()
        pocName()
        pocNums()
        pocRank()
        qualifier()
        qualSn()
        references().ifPresent { it.forEach { it.validate() } }
        refPoints().ifPresent { it.forEach { it.validate() } }
        remarks().ifPresent { it.forEach { it.validate() } }
        resTrackQual()
        serialNum()
        sourceDl()
        specTracks().ifPresent { it.forEach { it.validate() } }
        speedDiff()
        stopTime()
        stopTimeMod()
        sysDefaultCode()
        trackNumBlockLLs()
        trackNumBlocks()
        updatedAt()
        updatedBy()
        voiceCoord().ifPresent { it.forEach { it.validate() } }
        winSizeMin()
        winSizeMult()
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
            (ackInstUnits.asKnown().getOrNull()?.size ?: 0) +
            (if (ackReq.asKnown().isPresent) 1 else 0) +
            (if (altDiff.asKnown().isPresent) 1 else 0) +
            (if (canxId.asKnown().isPresent) 1 else 0) +
            (if (canxOriginator.asKnown().isPresent) 1 else 0) +
            (if (canxSerialNum.asKnown().isPresent) 1 else 0) +
            (canxSiCs.asKnown().getOrNull()?.size ?: 0) +
            (if (canxSpecialNotation.asKnown().isPresent) 1 else 0) +
            (if (canxTs.asKnown().isPresent) 1 else 0) +
            (classReasons.asKnown().getOrNull()?.size ?: 0) +
            (if (classSource.asKnown().isPresent) 1 else 0) +
            (if (consecDecorr.asKnown().isPresent) 1 else 0) +
            (if (courseDiff.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (decExemptCodes.asKnown().getOrNull()?.size ?: 0) +
            (decInstDates.asKnown().getOrNull()?.size ?: 0) +
            (if (decorrWinMult.asKnown().isPresent) 1 else 0) +
            (if (geoDatum.asKnown().isPresent) 1 else 0) +
            (if (jreCallSign.asKnown().isPresent) 1 else 0) +
            (if (jreDetails.asKnown().isPresent) 1 else 0) +
            (if (jrePriAdd.asKnown().isPresent) 1 else 0) +
            (if (jreSecAdd.asKnown().isPresent) 1 else 0) +
            (if (jreUnitDes.asKnown().isPresent) 1 else 0) +
            (if (maxGeoPosQual.asKnown().isPresent) 1 else 0) +
            (if (maxTrackQual.asKnown().isPresent) 1 else 0) +
            (if (mgmtCode.asKnown().isPresent) 1 else 0) +
            (if (mgmtCodeMeaning.asKnown().isPresent) 1 else 0) +
            (if (minGeoPosQual.asKnown().isPresent) 1 else 0) +
            (if (minTrackQual.asKnown().isPresent) 1 else 0) +
            (if (month.asKnown().isPresent) 1 else 0) +
            (multiDuty.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (nonLinkUnitDes.asKnown().getOrNull()?.size ?: 0) +
            (if (opExInfo.asKnown().isPresent) 1 else 0) +
            (if (opExInfoAlt.asKnown().isPresent) 1 else 0) +
            (ops.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (planOrigNum.asKnown().isPresent) 1 else 0) +
            (if (pocCallSign.asKnown().isPresent) 1 else 0) +
            (if (pocLat.asKnown().isPresent) 1 else 0) +
            (if (pocLocName.asKnown().isPresent) 1 else 0) +
            (if (pocLon.asKnown().isPresent) 1 else 0) +
            (if (pocName.asKnown().isPresent) 1 else 0) +
            (pocNums.asKnown().getOrNull()?.size ?: 0) +
            (if (pocRank.asKnown().isPresent) 1 else 0) +
            (if (qualifier.asKnown().isPresent) 1 else 0) +
            (if (qualSn.asKnown().isPresent) 1 else 0) +
            (references.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (refPoints.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (remarks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (resTrackQual.asKnown().isPresent) 1 else 0) +
            (if (serialNum.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (specTracks.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (speedDiff.asKnown().isPresent) 1 else 0) +
            (if (stopTime.asKnown().isPresent) 1 else 0) +
            (if (stopTimeMod.asKnown().isPresent) 1 else 0) +
            (if (sysDefaultCode.asKnown().isPresent) 1 else 0) +
            (trackNumBlockLLs.asKnown().getOrNull()?.size ?: 0) +
            (trackNumBlocks.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (voiceCoord.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (winSizeMin.asKnown().isPresent) 1 else 0) +
            (if (winSizeMult.asKnown().isPresent) 1 else 0)

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
     * Collection of contact and identification information for designated multilink coordinator
     * duty assignments. There can be 0 to many DataLinkMultiDuty collections within the datalink
     * service.
     */
    class MultiDuty
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val duty: JsonField<String>,
        private val dutyTeleFreqNums: JsonField<List<String>>,
        private val multiDutyVoiceCoord: JsonField<List<MultiDutyVoiceCoord>>,
        private val name: JsonField<String>,
        private val rank: JsonField<String>,
        private val unitDes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("duty") @ExcludeMissing duty: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dutyTeleFreqNums")
            @ExcludeMissing
            dutyTeleFreqNums: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("multiDutyVoiceCoord")
            @ExcludeMissing
            multiDutyVoiceCoord: JsonField<List<MultiDutyVoiceCoord>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rank") @ExcludeMissing rank: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unitDes") @ExcludeMissing unitDes: JsonField<String> = JsonMissing.of(),
        ) : this(duty, dutyTeleFreqNums, multiDutyVoiceCoord, name, rank, unitDes, mutableMapOf())

        /**
         * Specific duties assigned for multilink coordination (e.g. ICO, RICO, SICO).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun duty(): Optional<String> = duty.getOptional("duty")

        /**
         * Array of telephone numbers or the frequency values for radio transmission of the person
         * to be contacted for multilink coordination.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun dutyTeleFreqNums(): Optional<List<String>> =
            dutyTeleFreqNums.getOptional("dutyTeleFreqNums")

        /**
         * Collection of information regarding the function, frequency, and priority of interface
         * control and coordination nets for multilink coordination. There can be 0 to many
         * DataLinkMultiVoiceCoord collections within a DataLinkMultiDuty collection.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun multiDutyVoiceCoord(): Optional<List<MultiDutyVoiceCoord>> =
            multiDutyVoiceCoord.getOptional("multiDutyVoiceCoord")

        /**
         * The name of the person to be contacted for multilink coordination.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The rank or position of the person to be contacted for multilink coordination.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun rank(): Optional<String> = rank.getOptional("rank")

        /**
         * Designated force of unit specified by ship name, unit call sign, or unit designator.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun unitDes(): Optional<String> = unitDes.getOptional("unitDes")

        /**
         * Returns the raw JSON value of [duty].
         *
         * Unlike [duty], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("duty") @ExcludeMissing fun _duty(): JsonField<String> = duty

        /**
         * Returns the raw JSON value of [dutyTeleFreqNums].
         *
         * Unlike [dutyTeleFreqNums], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dutyTeleFreqNums")
        @ExcludeMissing
        fun _dutyTeleFreqNums(): JsonField<List<String>> = dutyTeleFreqNums

        /**
         * Returns the raw JSON value of [multiDutyVoiceCoord].
         *
         * Unlike [multiDutyVoiceCoord], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("multiDutyVoiceCoord")
        @ExcludeMissing
        fun _multiDutyVoiceCoord(): JsonField<List<MultiDutyVoiceCoord>> = multiDutyVoiceCoord

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [rank].
         *
         * Unlike [rank], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rank") @ExcludeMissing fun _rank(): JsonField<String> = rank

        /**
         * Returns the raw JSON value of [unitDes].
         *
         * Unlike [unitDes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unitDes") @ExcludeMissing fun _unitDes(): JsonField<String> = unitDes

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

            /** Returns a mutable builder for constructing an instance of [MultiDuty]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MultiDuty]. */
        class Builder internal constructor() {

            private var duty: JsonField<String> = JsonMissing.of()
            private var dutyTeleFreqNums: JsonField<MutableList<String>>? = null
            private var multiDutyVoiceCoord: JsonField<MutableList<MultiDutyVoiceCoord>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var rank: JsonField<String> = JsonMissing.of()
            private var unitDes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(multiDuty: MultiDuty) = apply {
                duty = multiDuty.duty
                dutyTeleFreqNums = multiDuty.dutyTeleFreqNums.map { it.toMutableList() }
                multiDutyVoiceCoord = multiDuty.multiDutyVoiceCoord.map { it.toMutableList() }
                name = multiDuty.name
                rank = multiDuty.rank
                unitDes = multiDuty.unitDes
                additionalProperties = multiDuty.additionalProperties.toMutableMap()
            }

            /** Specific duties assigned for multilink coordination (e.g. ICO, RICO, SICO). */
            fun duty(duty: String) = duty(JsonField.of(duty))

            /**
             * Sets [Builder.duty] to an arbitrary JSON value.
             *
             * You should usually call [Builder.duty] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun duty(duty: JsonField<String>) = apply { this.duty = duty }

            /**
             * Array of telephone numbers or the frequency values for radio transmission of the
             * person to be contacted for multilink coordination.
             */
            fun dutyTeleFreqNums(dutyTeleFreqNums: List<String>) =
                dutyTeleFreqNums(JsonField.of(dutyTeleFreqNums))

            /**
             * Sets [Builder.dutyTeleFreqNums] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dutyTeleFreqNums] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dutyTeleFreqNums(dutyTeleFreqNums: JsonField<List<String>>) = apply {
                this.dutyTeleFreqNums = dutyTeleFreqNums.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [dutyTeleFreqNums].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDutyTeleFreqNum(dutyTeleFreqNum: String) = apply {
                dutyTeleFreqNums =
                    (dutyTeleFreqNums ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dutyTeleFreqNums", it).add(dutyTeleFreqNum)
                    }
            }

            /**
             * Collection of information regarding the function, frequency, and priority of
             * interface control and coordination nets for multilink coordination. There can be 0 to
             * many DataLinkMultiVoiceCoord collections within a DataLinkMultiDuty collection.
             */
            fun multiDutyVoiceCoord(multiDutyVoiceCoord: List<MultiDutyVoiceCoord>) =
                multiDutyVoiceCoord(JsonField.of(multiDutyVoiceCoord))

            /**
             * Sets [Builder.multiDutyVoiceCoord] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multiDutyVoiceCoord] with a well-typed
             * `List<MultiDutyVoiceCoord>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun multiDutyVoiceCoord(multiDutyVoiceCoord: JsonField<List<MultiDutyVoiceCoord>>) =
                apply {
                    this.multiDutyVoiceCoord = multiDutyVoiceCoord.map { it.toMutableList() }
                }

            /**
             * Adds a single [MultiDutyVoiceCoord] to [Builder.multiDutyVoiceCoord].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMultiDutyVoiceCoord(multiDutyVoiceCoord: MultiDutyVoiceCoord) = apply {
                this.multiDutyVoiceCoord =
                    (this.multiDutyVoiceCoord ?: JsonField.of(mutableListOf())).also {
                        checkKnown("multiDutyVoiceCoord", it).add(multiDutyVoiceCoord)
                    }
            }

            /** The name of the person to be contacted for multilink coordination. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The rank or position of the person to be contacted for multilink coordination. */
            fun rank(rank: String) = rank(JsonField.of(rank))

            /**
             * Sets [Builder.rank] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rank] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun rank(rank: JsonField<String>) = apply { this.rank = rank }

            /**
             * Designated force of unit specified by ship name, unit call sign, or unit designator.
             */
            fun unitDes(unitDes: String) = unitDes(JsonField.of(unitDes))

            /**
             * Sets [Builder.unitDes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitDes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitDes(unitDes: JsonField<String>) = apply { this.unitDes = unitDes }

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
             * Returns an immutable instance of [MultiDuty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MultiDuty =
                MultiDuty(
                    duty,
                    (dutyTeleFreqNums ?: JsonMissing.of()).map { it.toImmutable() },
                    (multiDutyVoiceCoord ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    rank,
                    unitDes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MultiDuty = apply {
            if (validated) {
                return@apply
            }

            duty()
            dutyTeleFreqNums()
            multiDutyVoiceCoord().ifPresent { it.forEach { it.validate() } }
            name()
            rank()
            unitDes()
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
            (if (duty.asKnown().isPresent) 1 else 0) +
                (dutyTeleFreqNums.asKnown().getOrNull()?.size ?: 0) +
                (multiDutyVoiceCoord.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (rank.asKnown().isPresent) 1 else 0) +
                (if (unitDes.asKnown().isPresent) 1 else 0)

        /**
         * Collection of information regarding the function, frequency, and priority of interface
         * control and coordination nets for multilink coordination. There can be 0 to many
         * DataLinkMultiVoiceCoord collections within a DataLinkMultiDuty collection.
         */
        class MultiDutyVoiceCoord
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val multiCommPri: JsonField<String>,
            private val multiFreqDes: JsonField<String>,
            private val multiTeleFreqNums: JsonField<List<String>>,
            private val multiVoiceNetDes: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("multiCommPri")
                @ExcludeMissing
                multiCommPri: JsonField<String> = JsonMissing.of(),
                @JsonProperty("multiFreqDes")
                @ExcludeMissing
                multiFreqDes: JsonField<String> = JsonMissing.of(),
                @JsonProperty("multiTeleFreqNums")
                @ExcludeMissing
                multiTeleFreqNums: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("multiVoiceNetDes")
                @ExcludeMissing
                multiVoiceNetDes: JsonField<String> = JsonMissing.of(),
            ) : this(
                multiCommPri,
                multiFreqDes,
                multiTeleFreqNums,
                multiVoiceNetDes,
                mutableMapOf(),
            )

            /**
             * Priority of a communication circuit, channel or frequency for multilink coordination
             * (e.g. P - Primary, M - Monitor).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun multiCommPri(): Optional<String> = multiCommPri.getOptional("multiCommPri")

            /**
             * Designator used in nonsecure communications to refer to a radio frequency for
             * multilink coordination.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun multiFreqDes(): Optional<String> = multiFreqDes.getOptional("multiFreqDes")

            /**
             * Array of telephone numbers or contact frequencies used for interface control for
             * multilink coordination.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun multiTeleFreqNums(): Optional<List<String>> =
                multiTeleFreqNums.getOptional("multiTeleFreqNums")

            /**
             * Designator assigned to a voice interface control and coordination net for multilink
             * coordination (e.g. ADCCN, DCN, VPN, etc.).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun multiVoiceNetDes(): Optional<String> =
                multiVoiceNetDes.getOptional("multiVoiceNetDes")

            /**
             * Returns the raw JSON value of [multiCommPri].
             *
             * Unlike [multiCommPri], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multiCommPri")
            @ExcludeMissing
            fun _multiCommPri(): JsonField<String> = multiCommPri

            /**
             * Returns the raw JSON value of [multiFreqDes].
             *
             * Unlike [multiFreqDes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multiFreqDes")
            @ExcludeMissing
            fun _multiFreqDes(): JsonField<String> = multiFreqDes

            /**
             * Returns the raw JSON value of [multiTeleFreqNums].
             *
             * Unlike [multiTeleFreqNums], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("multiTeleFreqNums")
            @ExcludeMissing
            fun _multiTeleFreqNums(): JsonField<List<String>> = multiTeleFreqNums

            /**
             * Returns the raw JSON value of [multiVoiceNetDes].
             *
             * Unlike [multiVoiceNetDes], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("multiVoiceNetDes")
            @ExcludeMissing
            fun _multiVoiceNetDes(): JsonField<String> = multiVoiceNetDes

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
                 * Returns a mutable builder for constructing an instance of [MultiDutyVoiceCoord].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [MultiDutyVoiceCoord]. */
            class Builder internal constructor() {

                private var multiCommPri: JsonField<String> = JsonMissing.of()
                private var multiFreqDes: JsonField<String> = JsonMissing.of()
                private var multiTeleFreqNums: JsonField<MutableList<String>>? = null
                private var multiVoiceNetDes: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(multiDutyVoiceCoord: MultiDutyVoiceCoord) = apply {
                    multiCommPri = multiDutyVoiceCoord.multiCommPri
                    multiFreqDes = multiDutyVoiceCoord.multiFreqDes
                    multiTeleFreqNums =
                        multiDutyVoiceCoord.multiTeleFreqNums.map { it.toMutableList() }
                    multiVoiceNetDes = multiDutyVoiceCoord.multiVoiceNetDes
                    additionalProperties = multiDutyVoiceCoord.additionalProperties.toMutableMap()
                }

                /**
                 * Priority of a communication circuit, channel or frequency for multilink
                 * coordination (e.g. P - Primary, M - Monitor).
                 */
                fun multiCommPri(multiCommPri: String) = multiCommPri(JsonField.of(multiCommPri))

                /**
                 * Sets [Builder.multiCommPri] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiCommPri] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun multiCommPri(multiCommPri: JsonField<String>) = apply {
                    this.multiCommPri = multiCommPri
                }

                /**
                 * Designator used in nonsecure communications to refer to a radio frequency for
                 * multilink coordination.
                 */
                fun multiFreqDes(multiFreqDes: String) = multiFreqDes(JsonField.of(multiFreqDes))

                /**
                 * Sets [Builder.multiFreqDes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiFreqDes] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun multiFreqDes(multiFreqDes: JsonField<String>) = apply {
                    this.multiFreqDes = multiFreqDes
                }

                /**
                 * Array of telephone numbers or contact frequencies used for interface control for
                 * multilink coordination.
                 */
                fun multiTeleFreqNums(multiTeleFreqNums: List<String>) =
                    multiTeleFreqNums(JsonField.of(multiTeleFreqNums))

                /**
                 * Sets [Builder.multiTeleFreqNums] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiTeleFreqNums] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun multiTeleFreqNums(multiTeleFreqNums: JsonField<List<String>>) = apply {
                    this.multiTeleFreqNums = multiTeleFreqNums.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [multiTeleFreqNums].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addMultiTeleFreqNum(multiTeleFreqNum: String) = apply {
                    multiTeleFreqNums =
                        (multiTeleFreqNums ?: JsonField.of(mutableListOf())).also {
                            checkKnown("multiTeleFreqNums", it).add(multiTeleFreqNum)
                        }
                }

                /**
                 * Designator assigned to a voice interface control and coordination net for
                 * multilink coordination (e.g. ADCCN, DCN, VPN, etc.).
                 */
                fun multiVoiceNetDes(multiVoiceNetDes: String) =
                    multiVoiceNetDes(JsonField.of(multiVoiceNetDes))

                /**
                 * Sets [Builder.multiVoiceNetDes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiVoiceNetDes] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun multiVoiceNetDes(multiVoiceNetDes: JsonField<String>) = apply {
                    this.multiVoiceNetDes = multiVoiceNetDes
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
                 * Returns an immutable instance of [MultiDutyVoiceCoord].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): MultiDutyVoiceCoord =
                    MultiDutyVoiceCoord(
                        multiCommPri,
                        multiFreqDes,
                        (multiTeleFreqNums ?: JsonMissing.of()).map { it.toImmutable() },
                        multiVoiceNetDes,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MultiDutyVoiceCoord = apply {
                if (validated) {
                    return@apply
                }

                multiCommPri()
                multiFreqDes()
                multiTeleFreqNums()
                multiVoiceNetDes()
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
                (if (multiCommPri.asKnown().isPresent) 1 else 0) +
                    (if (multiFreqDes.asKnown().isPresent) 1 else 0) +
                    (multiTeleFreqNums.asKnown().getOrNull()?.size ?: 0) +
                    (if (multiVoiceNetDes.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MultiDutyVoiceCoord &&
                    multiCommPri == other.multiCommPri &&
                    multiFreqDes == other.multiFreqDes &&
                    multiTeleFreqNums == other.multiTeleFreqNums &&
                    multiVoiceNetDes == other.multiVoiceNetDes &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    multiCommPri,
                    multiFreqDes,
                    multiTeleFreqNums,
                    multiVoiceNetDes,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MultiDutyVoiceCoord{multiCommPri=$multiCommPri, multiFreqDes=$multiFreqDes, multiTeleFreqNums=$multiTeleFreqNums, multiVoiceNetDes=$multiVoiceNetDes, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MultiDuty &&
                duty == other.duty &&
                dutyTeleFreqNums == other.dutyTeleFreqNums &&
                multiDutyVoiceCoord == other.multiDutyVoiceCoord &&
                name == other.name &&
                rank == other.rank &&
                unitDes == other.unitDes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                duty,
                dutyTeleFreqNums,
                multiDutyVoiceCoord,
                name,
                rank,
                unitDes,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MultiDuty{duty=$duty, dutyTeleFreqNums=$dutyTeleFreqNums, multiDutyVoiceCoord=$multiDutyVoiceCoord, name=$name, rank=$rank, unitDes=$unitDes, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection of information describing the establishment and detailed operation of tactical
     * data links. There can be 0 to many DataLinkOps collections within the datalink service.
     */
    class Op
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val linkDetails: JsonField<String>,
        private val linkName: JsonField<String>,
        private val linkStartTime: JsonField<OffsetDateTime>,
        private val linkStopTime: JsonField<OffsetDateTime>,
        private val linkStopTimeMod: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("linkDetails")
            @ExcludeMissing
            linkDetails: JsonField<String> = JsonMissing.of(),
            @JsonProperty("linkName")
            @ExcludeMissing
            linkName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("linkStartTime")
            @ExcludeMissing
            linkStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("linkStopTime")
            @ExcludeMissing
            linkStopTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("linkStopTimeMod")
            @ExcludeMissing
            linkStopTimeMod: JsonField<String> = JsonMissing.of(),
        ) : this(
            linkDetails,
            linkName,
            linkStartTime,
            linkStopTime,
            linkStopTimeMod,
            mutableMapOf(),
        )

        /**
         * Detailed characteristics of the data link.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linkDetails(): Optional<String> = linkDetails.getOptional("linkDetails")

        /**
         * Name of the data link.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linkName(): Optional<String> = linkName.getOptional("linkName")

        /**
         * The start of the effective time period of the data link, in ISO 8601 UTC format with
         * millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linkStartTime(): Optional<OffsetDateTime> = linkStartTime.getOptional("linkStartTime")

        /**
         * The end of the effective time period of the data link, in ISO 8601 UTC format with
         * millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linkStopTime(): Optional<OffsetDateTime> = linkStopTime.getOptional("linkStopTime")

        /**
         * A qualifier for the end of the effective time period of this data link, such as AFTER,
         * ASOF, NLT, etc. Used with field linkStopTimeMod to indicate a relative time.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun linkStopTimeMod(): Optional<String> = linkStopTimeMod.getOptional("linkStopTimeMod")

        /**
         * Returns the raw JSON value of [linkDetails].
         *
         * Unlike [linkDetails], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkDetails")
        @ExcludeMissing
        fun _linkDetails(): JsonField<String> = linkDetails

        /**
         * Returns the raw JSON value of [linkName].
         *
         * Unlike [linkName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("linkName") @ExcludeMissing fun _linkName(): JsonField<String> = linkName

        /**
         * Returns the raw JSON value of [linkStartTime].
         *
         * Unlike [linkStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("linkStartTime")
        @ExcludeMissing
        fun _linkStartTime(): JsonField<OffsetDateTime> = linkStartTime

        /**
         * Returns the raw JSON value of [linkStopTime].
         *
         * Unlike [linkStopTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("linkStopTime")
        @ExcludeMissing
        fun _linkStopTime(): JsonField<OffsetDateTime> = linkStopTime

        /**
         * Returns the raw JSON value of [linkStopTimeMod].
         *
         * Unlike [linkStopTimeMod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("linkStopTimeMod")
        @ExcludeMissing
        fun _linkStopTimeMod(): JsonField<String> = linkStopTimeMod

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

            /** Returns a mutable builder for constructing an instance of [Op]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Op]. */
        class Builder internal constructor() {

            private var linkDetails: JsonField<String> = JsonMissing.of()
            private var linkName: JsonField<String> = JsonMissing.of()
            private var linkStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var linkStopTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var linkStopTimeMod: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(op: Op) = apply {
                linkDetails = op.linkDetails
                linkName = op.linkName
                linkStartTime = op.linkStartTime
                linkStopTime = op.linkStopTime
                linkStopTimeMod = op.linkStopTimeMod
                additionalProperties = op.additionalProperties.toMutableMap()
            }

            /** Detailed characteristics of the data link. */
            fun linkDetails(linkDetails: String) = linkDetails(JsonField.of(linkDetails))

            /**
             * Sets [Builder.linkDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkDetails] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkDetails(linkDetails: JsonField<String>) = apply {
                this.linkDetails = linkDetails
            }

            /** Name of the data link. */
            fun linkName(linkName: String) = linkName(JsonField.of(linkName))

            /**
             * Sets [Builder.linkName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkName(linkName: JsonField<String>) = apply { this.linkName = linkName }

            /**
             * The start of the effective time period of the data link, in ISO 8601 UTC format with
             * millisecond precision.
             */
            fun linkStartTime(linkStartTime: OffsetDateTime) =
                linkStartTime(JsonField.of(linkStartTime))

            /**
             * Sets [Builder.linkStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun linkStartTime(linkStartTime: JsonField<OffsetDateTime>) = apply {
                this.linkStartTime = linkStartTime
            }

            /**
             * The end of the effective time period of the data link, in ISO 8601 UTC format with
             * millisecond precision.
             */
            fun linkStopTime(linkStopTime: OffsetDateTime) =
                linkStopTime(JsonField.of(linkStopTime))

            /**
             * Sets [Builder.linkStopTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkStopTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun linkStopTime(linkStopTime: JsonField<OffsetDateTime>) = apply {
                this.linkStopTime = linkStopTime
            }

            /**
             * A qualifier for the end of the effective time period of this data link, such as
             * AFTER, ASOF, NLT, etc. Used with field linkStopTimeMod to indicate a relative time.
             */
            fun linkStopTimeMod(linkStopTimeMod: String) =
                linkStopTimeMod(JsonField.of(linkStopTimeMod))

            /**
             * Sets [Builder.linkStopTimeMod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.linkStopTimeMod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun linkStopTimeMod(linkStopTimeMod: JsonField<String>) = apply {
                this.linkStopTimeMod = linkStopTimeMod
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
             * Returns an immutable instance of [Op].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Op =
                Op(
                    linkDetails,
                    linkName,
                    linkStartTime,
                    linkStopTime,
                    linkStopTimeMod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Op = apply {
            if (validated) {
                return@apply
            }

            linkDetails()
            linkName()
            linkStartTime()
            linkStopTime()
            linkStopTimeMod()
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
            (if (linkDetails.asKnown().isPresent) 1 else 0) +
                (if (linkName.asKnown().isPresent) 1 else 0) +
                (if (linkStartTime.asKnown().isPresent) 1 else 0) +
                (if (linkStopTime.asKnown().isPresent) 1 else 0) +
                (if (linkStopTimeMod.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Op &&
                linkDetails == other.linkDetails &&
                linkName == other.linkName &&
                linkStartTime == other.linkStartTime &&
                linkStopTime == other.linkStopTime &&
                linkStopTimeMod == other.linkStopTimeMod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                linkDetails,
                linkName,
                linkStartTime,
                linkStopTime,
                linkStopTimeMod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Op{linkDetails=$linkDetails, linkName=$linkName, linkStartTime=$linkStartTime, linkStopTime=$linkStopTime, linkStopTimeMod=$linkStopTimeMod, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection of reference information. There can be 0 to many DataLinkReferences collections
     * within the datalink service.
     */
    class Reference
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val refOriginator: JsonField<String>,
        private val refSerialId: JsonField<String>,
        private val refSerialNum: JsonField<String>,
        private val refSiCs: JsonField<List<String>>,
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
            @JsonProperty("refSerialId")
            @ExcludeMissing
            refSerialId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refSerialNum")
            @ExcludeMissing
            refSerialNum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refSICs")
            @ExcludeMissing
            refSiCs: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("refSpecialNotation")
            @ExcludeMissing
            refSpecialNotation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refTs")
            @ExcludeMissing
            refTs: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("refType") @ExcludeMissing refType: JsonField<String> = JsonMissing.of(),
        ) : this(
            refOriginator,
            refSerialId,
            refSerialNum,
            refSiCs,
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
         * Specifies an alphabetic serial identifier a reference pertaining to the data link
         * message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refSerialId(): Optional<String> = refSerialId.getOptional("refSerialId")

        /**
         * Serial number assigned to this reference.
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
         * Specifies the type of document referenced.
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
         * Returns the raw JSON value of [refSerialId].
         *
         * Unlike [refSerialId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refSerialId")
        @ExcludeMissing
        fun _refSerialId(): JsonField<String> = refSerialId

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

            /** Returns a mutable builder for constructing an instance of [Reference]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reference]. */
        class Builder internal constructor() {

            private var refOriginator: JsonField<String> = JsonMissing.of()
            private var refSerialId: JsonField<String> = JsonMissing.of()
            private var refSerialNum: JsonField<String> = JsonMissing.of()
            private var refSiCs: JsonField<MutableList<String>>? = null
            private var refSpecialNotation: JsonField<String> = JsonMissing.of()
            private var refTs: JsonField<OffsetDateTime> = JsonMissing.of()
            private var refType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reference: Reference) = apply {
                refOriginator = reference.refOriginator
                refSerialId = reference.refSerialId
                refSerialNum = reference.refSerialNum
                refSiCs = reference.refSiCs.map { it.toMutableList() }
                refSpecialNotation = reference.refSpecialNotation
                refTs = reference.refTs
                refType = reference.refType
                additionalProperties = reference.additionalProperties.toMutableMap()
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

            /**
             * Specifies an alphabetic serial identifier a reference pertaining to the data link
             * message.
             */
            fun refSerialId(refSerialId: String) = refSerialId(JsonField.of(refSerialId))

            /**
             * Sets [Builder.refSerialId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refSerialId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refSerialId(refSerialId: JsonField<String>) = apply {
                this.refSerialId = refSerialId
            }

            /** Serial number assigned to this reference. */
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

            /** Specifies the type of document referenced. */
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
             * Returns an immutable instance of [Reference].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Reference =
                Reference(
                    refOriginator,
                    refSerialId,
                    refSerialNum,
                    (refSiCs ?: JsonMissing.of()).map { it.toImmutable() },
                    refSpecialNotation,
                    refTs,
                    refType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Reference = apply {
            if (validated) {
                return@apply
            }

            refOriginator()
            refSerialId()
            refSerialNum()
            refSiCs()
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
                (if (refSerialId.asKnown().isPresent) 1 else 0) +
                (if (refSerialNum.asKnown().isPresent) 1 else 0) +
                (refSiCs.asKnown().getOrNull()?.size ?: 0) +
                (if (refSpecialNotation.asKnown().isPresent) 1 else 0) +
                (if (refTs.asKnown().isPresent) 1 else 0) +
                (if (refType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reference &&
                refOriginator == other.refOriginator &&
                refSerialId == other.refSerialId &&
                refSerialNum == other.refSerialNum &&
                refSiCs == other.refSiCs &&
                refSpecialNotation == other.refSpecialNotation &&
                refTs == other.refTs &&
                refType == other.refType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                refOriginator,
                refSerialId,
                refSerialNum,
                refSiCs,
                refSpecialNotation,
                refTs,
                refType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reference{refOriginator=$refOriginator, refSerialId=$refSerialId, refSerialNum=$refSerialNum, refSiCs=$refSiCs, refSpecialNotation=$refSpecialNotation, refTs=$refTs, refType=$refType, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection that identifies points of reference used in the establishment of the data links.
     * There can be 1 to many DataLinkRefPoints collections within the datalink service.
     */
    class RefPoint
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val effEventTime: JsonField<OffsetDateTime>,
        private val refDes: JsonField<String>,
        private val refLat: JsonField<Double>,
        private val refLocName: JsonField<String>,
        private val refLon: JsonField<Double>,
        private val refPointType: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effEventTime")
            @ExcludeMissing
            effEventTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("refDes") @ExcludeMissing refDes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refLat") @ExcludeMissing refLat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("refLocName")
            @ExcludeMissing
            refLocName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refLon") @ExcludeMissing refLon: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("refPointType")
            @ExcludeMissing
            refPointType: JsonField<String> = JsonMissing.of(),
        ) : this(effEventTime, refDes, refLat, refLocName, refLon, refPointType, mutableMapOf())

        /**
         * Indicates when a particular event or nickname becomes effective or the old event or
         * nickname is deleted, in ISO 8601 UTC format with millisecond precision.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun effEventTime(): Optional<OffsetDateTime> = effEventTime.getOptional("effEventTime")

        /**
         * Identifier to designate a reference point.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refDes(): Optional<String> = refDes.getOptional("refDes")

        /**
         * WGS84 latitude of the reference point for this data link message, in degrees. -90 to 90
         * degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refLat(): Optional<Double> = refLat.getOptional("refLat")

        /**
         * The location name of the point of reference for this data link message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refLocName(): Optional<String> = refLocName.getOptional("refLocName")

        /**
         * WGS84 longitude of the reference point for this data link message, in degrees. -90 to 90
         * degrees (negative values south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refLon(): Optional<Double> = refLon.getOptional("refLon")

        /**
         * Type of data link reference point or grid origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun refPointType(): Optional<String> = refPointType.getOptional("refPointType")

        /**
         * Returns the raw JSON value of [effEventTime].
         *
         * Unlike [effEventTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effEventTime")
        @ExcludeMissing
        fun _effEventTime(): JsonField<OffsetDateTime> = effEventTime

        /**
         * Returns the raw JSON value of [refDes].
         *
         * Unlike [refDes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refDes") @ExcludeMissing fun _refDes(): JsonField<String> = refDes

        /**
         * Returns the raw JSON value of [refLat].
         *
         * Unlike [refLat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refLat") @ExcludeMissing fun _refLat(): JsonField<Double> = refLat

        /**
         * Returns the raw JSON value of [refLocName].
         *
         * Unlike [refLocName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refLocName")
        @ExcludeMissing
        fun _refLocName(): JsonField<String> = refLocName

        /**
         * Returns the raw JSON value of [refLon].
         *
         * Unlike [refLon], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("refLon") @ExcludeMissing fun _refLon(): JsonField<Double> = refLon

        /**
         * Returns the raw JSON value of [refPointType].
         *
         * Unlike [refPointType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("refPointType")
        @ExcludeMissing
        fun _refPointType(): JsonField<String> = refPointType

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

            /** Returns a mutable builder for constructing an instance of [RefPoint]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RefPoint]. */
        class Builder internal constructor() {

            private var effEventTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var refDes: JsonField<String> = JsonMissing.of()
            private var refLat: JsonField<Double> = JsonMissing.of()
            private var refLocName: JsonField<String> = JsonMissing.of()
            private var refLon: JsonField<Double> = JsonMissing.of()
            private var refPointType: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(refPoint: RefPoint) = apply {
                effEventTime = refPoint.effEventTime
                refDes = refPoint.refDes
                refLat = refPoint.refLat
                refLocName = refPoint.refLocName
                refLon = refPoint.refLon
                refPointType = refPoint.refPointType
                additionalProperties = refPoint.additionalProperties.toMutableMap()
            }

            /**
             * Indicates when a particular event or nickname becomes effective or the old event or
             * nickname is deleted, in ISO 8601 UTC format with millisecond precision.
             */
            fun effEventTime(effEventTime: OffsetDateTime) =
                effEventTime(JsonField.of(effEventTime))

            /**
             * Sets [Builder.effEventTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effEventTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effEventTime(effEventTime: JsonField<OffsetDateTime>) = apply {
                this.effEventTime = effEventTime
            }

            /** Identifier to designate a reference point. */
            fun refDes(refDes: String) = refDes(JsonField.of(refDes))

            /**
             * Sets [Builder.refDes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refDes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refDes(refDes: JsonField<String>) = apply { this.refDes = refDes }

            /**
             * WGS84 latitude of the reference point for this data link message, in degrees. -90 to
             * 90 degrees (negative values south of equator).
             */
            fun refLat(refLat: Double) = refLat(JsonField.of(refLat))

            /**
             * Sets [Builder.refLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refLat] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refLat(refLat: JsonField<Double>) = apply { this.refLat = refLat }

            /** The location name of the point of reference for this data link message. */
            fun refLocName(refLocName: String) = refLocName(JsonField.of(refLocName))

            /**
             * Sets [Builder.refLocName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refLocName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refLocName(refLocName: JsonField<String>) = apply { this.refLocName = refLocName }

            /**
             * WGS84 longitude of the reference point for this data link message, in degrees. -90 to
             * 90 degrees (negative values south of equator).
             */
            fun refLon(refLon: Double) = refLon(JsonField.of(refLon))

            /**
             * Sets [Builder.refLon] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refLon] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refLon(refLon: JsonField<Double>) = apply { this.refLon = refLon }

            /** Type of data link reference point or grid origin. */
            fun refPointType(refPointType: String) = refPointType(JsonField.of(refPointType))

            /**
             * Sets [Builder.refPointType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refPointType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun refPointType(refPointType: JsonField<String>) = apply {
                this.refPointType = refPointType
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
             * Returns an immutable instance of [RefPoint].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RefPoint =
                RefPoint(
                    effEventTime,
                    refDes,
                    refLat,
                    refLocName,
                    refLon,
                    refPointType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RefPoint = apply {
            if (validated) {
                return@apply
            }

            effEventTime()
            refDes()
            refLat()
            refLocName()
            refLon()
            refPointType()
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
            (if (effEventTime.asKnown().isPresent) 1 else 0) +
                (if (refDes.asKnown().isPresent) 1 else 0) +
                (if (refLat.asKnown().isPresent) 1 else 0) +
                (if (refLocName.asKnown().isPresent) 1 else 0) +
                (if (refLon.asKnown().isPresent) 1 else 0) +
                (if (refPointType.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RefPoint &&
                effEventTime == other.effEventTime &&
                refDes == other.refDes &&
                refLat == other.refLat &&
                refLocName == other.refLocName &&
                refLon == other.refLon &&
                refPointType == other.refPointType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                effEventTime,
                refDes,
                refLat,
                refLocName,
                refLon,
                refPointType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RefPoint{effEventTime=$effEventTime, refDes=$refDes, refLat=$refLat, refLocName=$refLocName, refLon=$refLon, refPointType=$refPointType, additionalProperties=$additionalProperties}"
    }

    /** Collection of remarks associated with this data link message. */
    class Remark
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val text: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("text") @ExcludeMissing text: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(text, type, mutableMapOf())

        /**
         * Text of the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun text(): Optional<String> = text.getOptional("text")

        /**
         * Indicates the subject matter of the remark.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [text].
         *
         * Unlike [text], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("text") @ExcludeMissing fun _text(): JsonField<String> = text

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Remark]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Remark]. */
        class Builder internal constructor() {

            private var text: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(remark: Remark) = apply {
                text = remark.text
                type = remark.type
                additionalProperties = remark.additionalProperties.toMutableMap()
            }

            /** Text of the remark. */
            fun text(text: String) = text(JsonField.of(text))

            /**
             * Sets [Builder.text] to an arbitrary JSON value.
             *
             * You should usually call [Builder.text] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun text(text: JsonField<String>) = apply { this.text = text }

            /** Indicates the subject matter of the remark. */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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
             * Returns an immutable instance of [Remark].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Remark = Remark(text, type, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Remark = apply {
            if (validated) {
                return@apply
            }

            text()
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
            (if (text.asKnown().isPresent) 1 else 0) + (if (type.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Remark &&
                text == other.text &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(text, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Remark{text=$text, type=$type, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection of special track numbers used on the data links. There can be 0 to many
     * DataLinkSpecTracks collections within the datalink service.
     */
    class SpecTrack
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val specTrackNum: JsonField<String>,
        private val specTrackNumDesc: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("specTrackNum")
            @ExcludeMissing
            specTrackNum: JsonField<String> = JsonMissing.of(),
            @JsonProperty("specTrackNumDesc")
            @ExcludeMissing
            specTrackNumDesc: JsonField<String> = JsonMissing.of(),
        ) : this(specTrackNum, specTrackNumDesc, mutableMapOf())

        /**
         * The special track number used on the data link entered as an octal reference number. Used
         * to identify a particular type of platform (e.g. MPA, KRESTA) or platform name (e.g.
         * TROMP, MOUNT WHITNEY) which is not included in assigned track blocks.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun specTrackNum(): Optional<String> = specTrackNum.getOptional("specTrackNum")

        /**
         * Description of the special track number.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun specTrackNumDesc(): Optional<String> = specTrackNumDesc.getOptional("specTrackNumDesc")

        /**
         * Returns the raw JSON value of [specTrackNum].
         *
         * Unlike [specTrackNum], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("specTrackNum")
        @ExcludeMissing
        fun _specTrackNum(): JsonField<String> = specTrackNum

        /**
         * Returns the raw JSON value of [specTrackNumDesc].
         *
         * Unlike [specTrackNumDesc], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("specTrackNumDesc")
        @ExcludeMissing
        fun _specTrackNumDesc(): JsonField<String> = specTrackNumDesc

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

            /** Returns a mutable builder for constructing an instance of [SpecTrack]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SpecTrack]. */
        class Builder internal constructor() {

            private var specTrackNum: JsonField<String> = JsonMissing.of()
            private var specTrackNumDesc: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(specTrack: SpecTrack) = apply {
                specTrackNum = specTrack.specTrackNum
                specTrackNumDesc = specTrack.specTrackNumDesc
                additionalProperties = specTrack.additionalProperties.toMutableMap()
            }

            /**
             * The special track number used on the data link entered as an octal reference number.
             * Used to identify a particular type of platform (e.g. MPA, KRESTA) or platform name
             * (e.g. TROMP, MOUNT WHITNEY) which is not included in assigned track blocks.
             */
            fun specTrackNum(specTrackNum: String) = specTrackNum(JsonField.of(specTrackNum))

            /**
             * Sets [Builder.specTrackNum] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specTrackNum] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun specTrackNum(specTrackNum: JsonField<String>) = apply {
                this.specTrackNum = specTrackNum
            }

            /** Description of the special track number. */
            fun specTrackNumDesc(specTrackNumDesc: String) =
                specTrackNumDesc(JsonField.of(specTrackNumDesc))

            /**
             * Sets [Builder.specTrackNumDesc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specTrackNumDesc] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun specTrackNumDesc(specTrackNumDesc: JsonField<String>) = apply {
                this.specTrackNumDesc = specTrackNumDesc
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
             * Returns an immutable instance of [SpecTrack].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SpecTrack =
                SpecTrack(specTrackNum, specTrackNumDesc, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SpecTrack = apply {
            if (validated) {
                return@apply
            }

            specTrackNum()
            specTrackNumDesc()
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
            (if (specTrackNum.asKnown().isPresent) 1 else 0) +
                (if (specTrackNumDesc.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SpecTrack &&
                specTrackNum == other.specTrackNum &&
                specTrackNumDesc == other.specTrackNumDesc &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(specTrackNum, specTrackNumDesc, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SpecTrack{specTrackNum=$specTrackNum, specTrackNumDesc=$specTrackNumDesc, additionalProperties=$additionalProperties}"
    }

    /**
     * Collection of information regarding the function, frequency, and priority of interface
     * control and coordination nets for this data link message. There can be 1 to many
     * DataLinkVoiceCoord collections within the datalink service.
     */
    class VoiceCoord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val commPri: JsonField<String>,
        private val freqDes: JsonField<String>,
        private val teleFreqNums: JsonField<List<String>>,
        private val voiceNetDes: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("commPri") @ExcludeMissing commPri: JsonField<String> = JsonMissing.of(),
            @JsonProperty("freqDes") @ExcludeMissing freqDes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("teleFreqNums")
            @ExcludeMissing
            teleFreqNums: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("voiceNetDes")
            @ExcludeMissing
            voiceNetDes: JsonField<String> = JsonMissing.of(),
        ) : this(commPri, freqDes, teleFreqNums, voiceNetDes, mutableMapOf())

        /**
         * Priority of a communication circuit, channel or frequency for this data link message such
         * as P (Primary), M (Monitor), etc.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun commPri(): Optional<String> = commPri.getOptional("commPri")

        /**
         * Designator used in nonsecure communications to refer to a radio frequency for this data
         * link message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun freqDes(): Optional<String> = freqDes.getOptional("freqDes")

        /**
         * Array of telephone numbers or contact frequencies used for interface control for this
         * data link message.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun teleFreqNums(): Optional<List<String>> = teleFreqNums.getOptional("teleFreqNums")

        /**
         * Designator assigned to a voice interface control and coordination net for this data link
         * message (e.g. ADCCN, DCN, VPN, etc.).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun voiceNetDes(): Optional<String> = voiceNetDes.getOptional("voiceNetDes")

        /**
         * Returns the raw JSON value of [commPri].
         *
         * Unlike [commPri], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commPri") @ExcludeMissing fun _commPri(): JsonField<String> = commPri

        /**
         * Returns the raw JSON value of [freqDes].
         *
         * Unlike [freqDes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("freqDes") @ExcludeMissing fun _freqDes(): JsonField<String> = freqDes

        /**
         * Returns the raw JSON value of [teleFreqNums].
         *
         * Unlike [teleFreqNums], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("teleFreqNums")
        @ExcludeMissing
        fun _teleFreqNums(): JsonField<List<String>> = teleFreqNums

        /**
         * Returns the raw JSON value of [voiceNetDes].
         *
         * Unlike [voiceNetDes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voiceNetDes")
        @ExcludeMissing
        fun _voiceNetDes(): JsonField<String> = voiceNetDes

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

            /** Returns a mutable builder for constructing an instance of [VoiceCoord]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VoiceCoord]. */
        class Builder internal constructor() {

            private var commPri: JsonField<String> = JsonMissing.of()
            private var freqDes: JsonField<String> = JsonMissing.of()
            private var teleFreqNums: JsonField<MutableList<String>>? = null
            private var voiceNetDes: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(voiceCoord: VoiceCoord) = apply {
                commPri = voiceCoord.commPri
                freqDes = voiceCoord.freqDes
                teleFreqNums = voiceCoord.teleFreqNums.map { it.toMutableList() }
                voiceNetDes = voiceCoord.voiceNetDes
                additionalProperties = voiceCoord.additionalProperties.toMutableMap()
            }

            /**
             * Priority of a communication circuit, channel or frequency for this data link message
             * such as P (Primary), M (Monitor), etc.
             */
            fun commPri(commPri: String) = commPri(JsonField.of(commPri))

            /**
             * Sets [Builder.commPri] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commPri] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commPri(commPri: JsonField<String>) = apply { this.commPri = commPri }

            /**
             * Designator used in nonsecure communications to refer to a radio frequency for this
             * data link message.
             */
            fun freqDes(freqDes: String) = freqDes(JsonField.of(freqDes))

            /**
             * Sets [Builder.freqDes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freqDes] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freqDes(freqDes: JsonField<String>) = apply { this.freqDes = freqDes }

            /**
             * Array of telephone numbers or contact frequencies used for interface control for this
             * data link message.
             */
            fun teleFreqNums(teleFreqNums: List<String>) = teleFreqNums(JsonField.of(teleFreqNums))

            /**
             * Sets [Builder.teleFreqNums] to an arbitrary JSON value.
             *
             * You should usually call [Builder.teleFreqNums] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun teleFreqNums(teleFreqNums: JsonField<List<String>>) = apply {
                this.teleFreqNums = teleFreqNums.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [teleFreqNums].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTeleFreqNum(teleFreqNum: String) = apply {
                teleFreqNums =
                    (teleFreqNums ?: JsonField.of(mutableListOf())).also {
                        checkKnown("teleFreqNums", it).add(teleFreqNum)
                    }
            }

            /**
             * Designator assigned to a voice interface control and coordination net for this data
             * link message (e.g. ADCCN, DCN, VPN, etc.).
             */
            fun voiceNetDes(voiceNetDes: String) = voiceNetDes(JsonField.of(voiceNetDes))

            /**
             * Sets [Builder.voiceNetDes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voiceNetDes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voiceNetDes(voiceNetDes: JsonField<String>) = apply {
                this.voiceNetDes = voiceNetDes
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
             * Returns an immutable instance of [VoiceCoord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): VoiceCoord =
                VoiceCoord(
                    commPri,
                    freqDes,
                    (teleFreqNums ?: JsonMissing.of()).map { it.toImmutable() },
                    voiceNetDes,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): VoiceCoord = apply {
            if (validated) {
                return@apply
            }

            commPri()
            freqDes()
            teleFreqNums()
            voiceNetDes()
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
            (if (commPri.asKnown().isPresent) 1 else 0) +
                (if (freqDes.asKnown().isPresent) 1 else 0) +
                (teleFreqNums.asKnown().getOrNull()?.size ?: 0) +
                (if (voiceNetDes.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VoiceCoord &&
                commPri == other.commPri &&
                freqDes == other.freqDes &&
                teleFreqNums == other.teleFreqNums &&
                voiceNetDes == other.voiceNetDes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(commPri, freqDes, teleFreqNums, voiceNetDes, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VoiceCoord{commPri=$commPri, freqDes=$freqDes, teleFreqNums=$teleFreqNums, voiceNetDes=$voiceNetDes, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatalinkIngest &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            opExName == other.opExName &&
            originator == other.originator &&
            source == other.source &&
            startTime == other.startTime &&
            id == other.id &&
            ackInstUnits == other.ackInstUnits &&
            ackReq == other.ackReq &&
            altDiff == other.altDiff &&
            canxId == other.canxId &&
            canxOriginator == other.canxOriginator &&
            canxSerialNum == other.canxSerialNum &&
            canxSiCs == other.canxSiCs &&
            canxSpecialNotation == other.canxSpecialNotation &&
            canxTs == other.canxTs &&
            classReasons == other.classReasons &&
            classSource == other.classSource &&
            consecDecorr == other.consecDecorr &&
            courseDiff == other.courseDiff &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            decExemptCodes == other.decExemptCodes &&
            decInstDates == other.decInstDates &&
            decorrWinMult == other.decorrWinMult &&
            geoDatum == other.geoDatum &&
            jreCallSign == other.jreCallSign &&
            jreDetails == other.jreDetails &&
            jrePriAdd == other.jrePriAdd &&
            jreSecAdd == other.jreSecAdd &&
            jreUnitDes == other.jreUnitDes &&
            maxGeoPosQual == other.maxGeoPosQual &&
            maxTrackQual == other.maxTrackQual &&
            mgmtCode == other.mgmtCode &&
            mgmtCodeMeaning == other.mgmtCodeMeaning &&
            minGeoPosQual == other.minGeoPosQual &&
            minTrackQual == other.minTrackQual &&
            month == other.month &&
            multiDuty == other.multiDuty &&
            nonLinkUnitDes == other.nonLinkUnitDes &&
            opExInfo == other.opExInfo &&
            opExInfoAlt == other.opExInfoAlt &&
            ops == other.ops &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            planOrigNum == other.planOrigNum &&
            pocCallSign == other.pocCallSign &&
            pocLat == other.pocLat &&
            pocLocName == other.pocLocName &&
            pocLon == other.pocLon &&
            pocName == other.pocName &&
            pocNums == other.pocNums &&
            pocRank == other.pocRank &&
            qualifier == other.qualifier &&
            qualSn == other.qualSn &&
            references == other.references &&
            refPoints == other.refPoints &&
            remarks == other.remarks &&
            resTrackQual == other.resTrackQual &&
            serialNum == other.serialNum &&
            sourceDl == other.sourceDl &&
            specTracks == other.specTracks &&
            speedDiff == other.speedDiff &&
            stopTime == other.stopTime &&
            stopTimeMod == other.stopTimeMod &&
            sysDefaultCode == other.sysDefaultCode &&
            trackNumBlockLLs == other.trackNumBlockLLs &&
            trackNumBlocks == other.trackNumBlocks &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            voiceCoord == other.voiceCoord &&
            winSizeMin == other.winSizeMin &&
            winSizeMult == other.winSizeMult &&
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
            ackInstUnits,
            ackReq,
            altDiff,
            canxId,
            canxOriginator,
            canxSerialNum,
            canxSiCs,
            canxSpecialNotation,
            canxTs,
            classReasons,
            classSource,
            consecDecorr,
            courseDiff,
            createdAt,
            createdBy,
            decExemptCodes,
            decInstDates,
            decorrWinMult,
            geoDatum,
            jreCallSign,
            jreDetails,
            jrePriAdd,
            jreSecAdd,
            jreUnitDes,
            maxGeoPosQual,
            maxTrackQual,
            mgmtCode,
            mgmtCodeMeaning,
            minGeoPosQual,
            minTrackQual,
            month,
            multiDuty,
            nonLinkUnitDes,
            opExInfo,
            opExInfoAlt,
            ops,
            origin,
            origNetwork,
            planOrigNum,
            pocCallSign,
            pocLat,
            pocLocName,
            pocLon,
            pocName,
            pocNums,
            pocRank,
            qualifier,
            qualSn,
            references,
            refPoints,
            remarks,
            resTrackQual,
            serialNum,
            sourceDl,
            specTracks,
            speedDiff,
            stopTime,
            stopTimeMod,
            sysDefaultCode,
            trackNumBlockLLs,
            trackNumBlocks,
            updatedAt,
            updatedBy,
            voiceCoord,
            winSizeMin,
            winSizeMult,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatalinkIngest{classificationMarking=$classificationMarking, dataMode=$dataMode, opExName=$opExName, originator=$originator, source=$source, startTime=$startTime, id=$id, ackInstUnits=$ackInstUnits, ackReq=$ackReq, altDiff=$altDiff, canxId=$canxId, canxOriginator=$canxOriginator, canxSerialNum=$canxSerialNum, canxSiCs=$canxSiCs, canxSpecialNotation=$canxSpecialNotation, canxTs=$canxTs, classReasons=$classReasons, classSource=$classSource, consecDecorr=$consecDecorr, courseDiff=$courseDiff, createdAt=$createdAt, createdBy=$createdBy, decExemptCodes=$decExemptCodes, decInstDates=$decInstDates, decorrWinMult=$decorrWinMult, geoDatum=$geoDatum, jreCallSign=$jreCallSign, jreDetails=$jreDetails, jrePriAdd=$jrePriAdd, jreSecAdd=$jreSecAdd, jreUnitDes=$jreUnitDes, maxGeoPosQual=$maxGeoPosQual, maxTrackQual=$maxTrackQual, mgmtCode=$mgmtCode, mgmtCodeMeaning=$mgmtCodeMeaning, minGeoPosQual=$minGeoPosQual, minTrackQual=$minTrackQual, month=$month, multiDuty=$multiDuty, nonLinkUnitDes=$nonLinkUnitDes, opExInfo=$opExInfo, opExInfoAlt=$opExInfoAlt, ops=$ops, origin=$origin, origNetwork=$origNetwork, planOrigNum=$planOrigNum, pocCallSign=$pocCallSign, pocLat=$pocLat, pocLocName=$pocLocName, pocLon=$pocLon, pocName=$pocName, pocNums=$pocNums, pocRank=$pocRank, qualifier=$qualifier, qualSn=$qualSn, references=$references, refPoints=$refPoints, remarks=$remarks, resTrackQual=$resTrackQual, serialNum=$serialNum, sourceDl=$sourceDl, specTracks=$specTracks, speedDiff=$speedDiff, stopTime=$stopTime, stopTimeMod=$stopTimeMod, sysDefaultCode=$sysDefaultCode, trackNumBlockLLs=$trackNumBlockLLs, trackNumBlocks=$trackNumBlocks, updatedAt=$updatedAt, updatedBy=$updatedBy, voiceCoord=$voiceCoord, winSizeMin=$winSizeMin, winSizeMult=$winSizeMult, additionalProperties=$additionalProperties}"
}

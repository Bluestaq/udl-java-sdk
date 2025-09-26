// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.monoradar

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
 * A monoradar record contains the raw, and in some cases, processed target reports from primary and
 * secondary air surveillance radars. All target positions for monoradar reports are recorded as
 * range and azimuth from geographical North relative to the detecting radar site. In the case of
 * secondary surveillance radars, interrogation response codes are provided as well as quality and
 * validation characteristics, when available in the particular record type used to generate the
 * record.
 */
class MonoradarListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val msgfmt: JsonField<String>,
    private val msgts: JsonField<OffsetDateTime>,
    private val msgtyp: JsonField<String>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val acp: JsonField<Int>,
    private val addr: JsonField<String>,
    private val af: JsonField<Boolean>,
    private val aims: JsonField<Boolean>,
    private val alt3d: JsonField<Double>,
    private val artsqual: JsonField<String>,
    private val az: JsonField<Double>,
    private val azdelt: JsonField<Double>,
    private val bcnhits: JsonField<Int>,
    private val cartpos: JsonField<List<Double>>,
    private val cdm: JsonField<String>,
    private val code7500: JsonField<Boolean>,
    private val code7600: JsonField<Boolean>,
    private val code7700: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val faa: JsonField<Boolean>,
    private val grndspd: JsonField<Double>,
    private val hdng: JsonField<Double>,
    private val idSensor: JsonField<String>,
    private val m1: JsonField<String>,
    private val m1g: JsonField<Boolean>,
    private val m1v: JsonField<String>,
    private val m2: JsonField<String>,
    private val m2g: JsonField<Boolean>,
    private val m2v: JsonField<String>,
    private val m2xv: JsonField<String>,
    private val m3a: JsonField<String>,
    private val m3ag: JsonField<Boolean>,
    private val m3av: JsonField<String>,
    private val m3axv: JsonField<String>,
    private val m4: JsonField<String>,
    private val m4d1d2: JsonField<String>,
    private val m4v: JsonField<String>,
    private val mah: JsonField<String>,
    private val mc: JsonField<Double>,
    private val mcg: JsonField<Boolean>,
    private val mcv: JsonField<String>,
    private val milemrgcy: JsonField<Boolean>,
    private val mrgrpt: JsonField<Boolean>,
    private val mscommb: JsonField<String>,
    private val mti: JsonField<Boolean>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val psrrl: JsonField<Double>,
    private val rad: JsonField<String>,
    private val rng: JsonField<Double>,
    private val rngdelt: JsonField<Double>,
    private val sac: JsonField<Int>,
    private val senalt: JsonField<Double>,
    private val senlat: JsonField<Double>,
    private val senlon: JsonField<Double>,
    private val sic: JsonField<Int>,
    private val spi: JsonField<Boolean>,
    private val ssrl: JsonField<Double>,
    private val tags: JsonField<List<String>>,
    private val tgtconf: JsonField<String>,
    private val tgtcorr: JsonField<String>,
    private val tgtid: JsonField<String>,
    private val tis: JsonField<Double>,
    private val trkelig: JsonField<String>,
    private val trknum: JsonField<Int>,
    private val tti: JsonField<String>,
    private val wectc: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("msgfmt") @ExcludeMissing msgfmt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("msgts") @ExcludeMissing msgts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("msgtyp") @ExcludeMissing msgtyp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acp") @ExcludeMissing acp: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("addr") @ExcludeMissing addr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("af") @ExcludeMissing af: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("aims") @ExcludeMissing aims: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("alt3d") @ExcludeMissing alt3d: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("artsqual") @ExcludeMissing artsqual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("az") @ExcludeMissing az: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azdelt") @ExcludeMissing azdelt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bcnhits") @ExcludeMissing bcnhits: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cartpos")
        @ExcludeMissing
        cartpos: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("cdm") @ExcludeMissing cdm: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code7500") @ExcludeMissing code7500: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("code7600") @ExcludeMissing code7600: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("code7700") @ExcludeMissing code7700: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("faa") @ExcludeMissing faa: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("grndspd") @ExcludeMissing grndspd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hdng") @ExcludeMissing hdng: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m1") @ExcludeMissing m1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m1g") @ExcludeMissing m1g: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("m1v") @ExcludeMissing m1v: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m2") @ExcludeMissing m2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m2g") @ExcludeMissing m2g: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("m2v") @ExcludeMissing m2v: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m2xv") @ExcludeMissing m2xv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3a") @ExcludeMissing m3a: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3ag") @ExcludeMissing m3ag: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("m3av") @ExcludeMissing m3av: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3axv") @ExcludeMissing m3axv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m4") @ExcludeMissing m4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m4d1d2") @ExcludeMissing m4d1d2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m4v") @ExcludeMissing m4v: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mah") @ExcludeMissing mah: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mc") @ExcludeMissing mc: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("mcg") @ExcludeMissing mcg: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mcv") @ExcludeMissing mcv: JsonField<String> = JsonMissing.of(),
        @JsonProperty("milemrgcy") @ExcludeMissing milemrgcy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mrgrpt") @ExcludeMissing mrgrpt: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mscommb") @ExcludeMissing mscommb: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mti") @ExcludeMissing mti: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("psrrl") @ExcludeMissing psrrl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rad") @ExcludeMissing rad: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rng") @ExcludeMissing rng: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rngdelt") @ExcludeMissing rngdelt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sac") @ExcludeMissing sac: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senalt") @ExcludeMissing senalt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlat") @ExcludeMissing senlat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("senlon") @ExcludeMissing senlon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("sic") @ExcludeMissing sic: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("spi") @ExcludeMissing spi: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ssrl") @ExcludeMissing ssrl: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tgtconf") @ExcludeMissing tgtconf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tgtcorr") @ExcludeMissing tgtcorr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tgtid") @ExcludeMissing tgtid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tis") @ExcludeMissing tis: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trkelig") @ExcludeMissing trkelig: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trknum") @ExcludeMissing trknum: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("tti") @ExcludeMissing tti: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wectc") @ExcludeMissing wectc: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        msgfmt,
        msgts,
        msgtyp,
        source,
        ts,
        id,
        acp,
        addr,
        af,
        aims,
        alt3d,
        artsqual,
        az,
        azdelt,
        bcnhits,
        cartpos,
        cdm,
        code7500,
        code7600,
        code7700,
        createdAt,
        createdBy,
        faa,
        grndspd,
        hdng,
        idSensor,
        m1,
        m1g,
        m1v,
        m2,
        m2g,
        m2v,
        m2xv,
        m3a,
        m3ag,
        m3av,
        m3axv,
        m4,
        m4d1d2,
        m4v,
        mah,
        mc,
        mcg,
        mcv,
        milemrgcy,
        mrgrpt,
        mscommb,
        mti,
        origin,
        origNetwork,
        origSensorId,
        psrrl,
        rad,
        rng,
        rngdelt,
        sac,
        senalt,
        senlat,
        senlon,
        sic,
        spi,
        ssrl,
        tags,
        tgtconf,
        tgtcorr,
        tgtid,
        tis,
        trkelig,
        trknum,
        tti,
        wectc,
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
     * Message format received (i.e. 'ASR9', 'CAT48', 'TPS70', etc..).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msgfmt(): String = msgfmt.getRequired("msgfmt")

    /**
     * Message time, in ISO 8601 UTC format with microsecond precision. This is the time that the
     * data message was released from the site.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msgts(): OffsetDateTime = msgts.getRequired("msgts")

    /**
     * Message report type received (i.e. 'SRCH', 'BCN', 'REINF', 'BRTQC', 'PSR', etc..).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msgtyp(): String = msgtyp.getRequired("msgtyp")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Target detection time, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ts(): OffsetDateTime = ts.getRequired("ts")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Azimuth Change Pulse count at target detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun acp(): Optional<Int> = acp.getOptional("acp")

    /**
     * Aircraft address (24-bits Mode S address) assigned uniquely to each aircraft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun addr(): Optional<String> = addr.getOptional("addr")

    /**
     * Flag indicating military message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun af(): Optional<Boolean> = af.getOptional("af")

    /**
     * Flag indicating whether AIMS present.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aims(): Optional<Boolean> = aims.getOptional("aims")

    /**
     * Measured height of the target, in km. (for 3D radars).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt3d(): Optional<Double> = alt3d.getOptional("alt3d")

    /**
     * ARTS quality.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun artsqual(): Optional<String> = artsqual.getOptional("artsqual")

    /**
     * Target azimuth, measured from the observing site, in degrees from true North. If Azimuth
     * Change Pulse (acp) count is provided, az represents the computed angle.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun az(): Optional<Double> = az.getOptional("az")

    /**
     * Target azimuth delta between PSR and SSR (reference PSR-SSR), in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azdelt(): Optional<Double> = azdelt.getOptional("azdelt")

    /**
     * Number of beacon hits received on the target.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bcnhits(): Optional<Int> = bcnhits.getOptional("bcnhits")

    /**
     * Array of local 2d-cartesian [x, y] coordinates of target, in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cartpos(): Optional<List<Double>> = cartpos.getOptional("cartpos")

    /**
     * Climbing/Descending mode indicator.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cdm(): Optional<String> = cdm.getOptional("cdm")

    /**
     * 7500 squawk present (hijack).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun code7500(): Optional<Boolean> = code7500.getOptional("code7500")

    /**
     * 7600 squawk present (loss of comm).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun code7600(): Optional<Boolean> = code7600.getOptional("code7600")

    /**
     * 7700 squawk present (general emergency).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun code7700(): Optional<Boolean> = code7700.getOptional("code7700")

    /**
     * Time the row was created in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

    /**
     * Application user who created the row in the database.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * Flag indicating FAA/Civ message.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun faa(): Optional<Boolean> = faa.getOptional("faa")

    /**
     * Target ground speed, in meters/second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun grndspd(): Optional<Double> = grndspd.getOptional("grndspd")

    /**
     * Target heading, in degrees from true North at the target position.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hdng(): Optional<Double> = hdng.getOptional("hdng")

    /**
     * ID of the radar site or station providing the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * Mode-1 interrogation response (mission code).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m1(): Optional<String> = m1.getOptional("m1")

    /**
     * Indicator that the mode-1 response was garbled.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m1g(): Optional<Boolean> = m1g.getOptional("m1g")

    /**
     * Status of the mode-1 validity bit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m1v(): Optional<String> = m1v.getOptional("m1v")

    /**
     * Mode-2 interrogation response (military identification code).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m2(): Optional<String> = m2.getOptional("m2")

    /**
     * Indicator that the mode-2 response was garbled.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m2g(): Optional<Boolean> = m2g.getOptional("m2g")

    /**
     * Status of the mode-2 validity bit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m2v(): Optional<String> = m2v.getOptional("m2v")

    /**
     * Status of the mode-2 X-Pulse response validation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m2xv(): Optional<String> = m2xv.getOptional("m2xv")

    /**
     * Mode-3/A interrogation response (aircraft identification).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m3a(): Optional<String> = m3a.getOptional("m3a")

    /**
     * Indicator that the mode-3/A response was garbled.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m3ag(): Optional<Boolean> = m3ag.getOptional("m3ag")

    /**
     * Status of the mode-3/A validity bit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m3av(): Optional<String> = m3av.getOptional("m3av")

    /**
     * Status of the mode-3 X-Pulse response validation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m3axv(): Optional<String> = m3axv.getOptional("m3axv")

    /**
     * Mode-4 interrogation response (Identification Friend/Foe).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m4(): Optional<String> = m4.getOptional("m4")

    /**
     * Mode-4 D1 & D2 response status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m4d1d2(): Optional<String> = m4d1d2.getOptional("m4d1d2")

    /**
     * Status of the mode-4 validity bit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun m4v(): Optional<String> = m4v.getOptional("m4v")

    /**
     * Indication of Horizontal Maneuver detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mah(): Optional<String> = mah.getOptional("mah")

    /**
     * Mode-C altitude (uncorrected pressure altitude), in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mc(): Optional<Double> = mc.getOptional("mc")

    /**
     * Indicator that the mode-C response was garbled.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mcg(): Optional<Boolean> = mcg.getOptional("mcg")

    /**
     * Status of the mode-C validity bit.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mcv(): Optional<String> = mcv.getOptional("mcv")

    /**
     * Flag indicating military emergency.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun milemrgcy(): Optional<Boolean> = milemrgcy.getOptional("milemrgcy")

    /**
     * Flag indicating report separated from different responses at same range. Azimuth may have
     * larger than normal error when present.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mrgrpt(): Optional<Boolean> = mrgrpt.getOptional("mrgrpt")

    /**
     * Mode-S Comm B message data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mscommb(): Optional<String> = mscommb.getOptional("mscommb")

    /**
     * Flag indicating that target was detected using data from an MTI receiver.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mti(): Optional<Boolean> = mti.getOptional("mti")

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
     * Optional identifier provided by observation source to indicate the sensor identifier which
     * produced this observation.This may be an internal identifier and not necessarily a valid
     * sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Runlength of the primary surveillance radar track, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun psrrl(): Optional<Double> = psrrl.getOptional("psrrl")

    /**
     * Type of sensor(s) maintaining track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rad(): Optional<String> = rad.getOptional("rad")

    /**
     * Measured slant range to target from the observing site, in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rng(): Optional<Double> = rng.getOptional("rng")

    /**
     * Target range delta between PSR and SSR (reference PSR-SSR), in km.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rngdelt(): Optional<Double> = rngdelt.getOptional("rngdelt")

    /**
     * System Area Code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sac(): Optional<Int> = sac.getOptional("sac")

    /**
     * Sensor altitude, in kilometers, at time of observation (ts).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senalt(): Optional<Double> = senalt.getOptional("senalt")

    /**
     * Sensor WGS84 latitude, in degrees, at time of observation (ts). -90 to 90 degrees (negative
     * values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlat(): Optional<Double> = senlat.getOptional("senlat")

    /**
     * Sensor WGS84 longitude, in degrees, at time of observation (ts). -180 to 180 degrees
     * (negative values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senlon(): Optional<Double> = senlon.getOptional("senlon")

    /**
     * System Identification Code.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sic(): Optional<Int> = sic.getOptional("sic")

    /**
     * Flag indicating whether Special Position Indicator (SPI) present in interrogation response.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spi(): Optional<Boolean> = spi.getOptional("spi")

    /**
     * Runlength of the secondary surveillance radar track, in degrees.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ssrl(): Optional<Double> = ssrl.getOptional("ssrl")

    /**
     * Optional array of provider/source specific tags for this data, where each element is no
     * longer than 32 characters, used for implementing data owner conditional access controls to
     * restrict access to the data. Should be left null by data providers unless conditional access
     * controls are coordinated with the UDL team.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Target confidence.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tgtconf(): Optional<String> = tgtconf.getOptional("tgtconf")

    /**
     * Target correlation flag.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tgtcorr(): Optional<String> = tgtcorr.getOptional("tgtcorr")

    /**
     * Aircraft identification from an aircraft equipped with a Mode S transponder.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tgtid(): Optional<String> = tgtid.getOptional("tgtid")

    /**
     * Data time-in-storage, in seconds. This is the amount of time elapsed between target detection
     * and message transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tis(): Optional<Double> = tis.getOptional("tis")

    /**
     * Track eligibility flag.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkelig(): Optional<String> = trkelig.getOptional("trkelig")

    /**
     * Value representing a unique reference to a track record within a particular track file.
     * Included when the radar station outputs tracks.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trknum(): Optional<Int> = trknum.getOptional("trknum")

    /**
     * Test target indicator.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tti(): Optional<String> = tti.getOptional("tti")

    /**
     * Warning/Error Conditions and Target Classification.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wectc(): Optional<List<String>> = wectc.getOptional("wectc")

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
     * Returns the raw JSON value of [msgfmt].
     *
     * Unlike [msgfmt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgfmt") @ExcludeMissing fun _msgfmt(): JsonField<String> = msgfmt

    /**
     * Returns the raw JSON value of [msgts].
     *
     * Unlike [msgts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgts") @ExcludeMissing fun _msgts(): JsonField<OffsetDateTime> = msgts

    /**
     * Returns the raw JSON value of [msgtyp].
     *
     * Unlike [msgtyp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgtyp") @ExcludeMissing fun _msgtyp(): JsonField<String> = msgtyp

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [ts].
     *
     * Unlike [ts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ts") @ExcludeMissing fun _ts(): JsonField<OffsetDateTime> = ts

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [acp].
     *
     * Unlike [acp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acp") @ExcludeMissing fun _acp(): JsonField<Int> = acp

    /**
     * Returns the raw JSON value of [addr].
     *
     * Unlike [addr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addr") @ExcludeMissing fun _addr(): JsonField<String> = addr

    /**
     * Returns the raw JSON value of [af].
     *
     * Unlike [af], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("af") @ExcludeMissing fun _af(): JsonField<Boolean> = af

    /**
     * Returns the raw JSON value of [aims].
     *
     * Unlike [aims], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aims") @ExcludeMissing fun _aims(): JsonField<Boolean> = aims

    /**
     * Returns the raw JSON value of [alt3d].
     *
     * Unlike [alt3d], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt3d") @ExcludeMissing fun _alt3d(): JsonField<Double> = alt3d

    /**
     * Returns the raw JSON value of [artsqual].
     *
     * Unlike [artsqual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("artsqual") @ExcludeMissing fun _artsqual(): JsonField<String> = artsqual

    /**
     * Returns the raw JSON value of [az].
     *
     * Unlike [az], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("az") @ExcludeMissing fun _az(): JsonField<Double> = az

    /**
     * Returns the raw JSON value of [azdelt].
     *
     * Unlike [azdelt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azdelt") @ExcludeMissing fun _azdelt(): JsonField<Double> = azdelt

    /**
     * Returns the raw JSON value of [bcnhits].
     *
     * Unlike [bcnhits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bcnhits") @ExcludeMissing fun _bcnhits(): JsonField<Int> = bcnhits

    /**
     * Returns the raw JSON value of [cartpos].
     *
     * Unlike [cartpos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cartpos") @ExcludeMissing fun _cartpos(): JsonField<List<Double>> = cartpos

    /**
     * Returns the raw JSON value of [cdm].
     *
     * Unlike [cdm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cdm") @ExcludeMissing fun _cdm(): JsonField<String> = cdm

    /**
     * Returns the raw JSON value of [code7500].
     *
     * Unlike [code7500], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code7500") @ExcludeMissing fun _code7500(): JsonField<Boolean> = code7500

    /**
     * Returns the raw JSON value of [code7600].
     *
     * Unlike [code7600], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code7600") @ExcludeMissing fun _code7600(): JsonField<Boolean> = code7600

    /**
     * Returns the raw JSON value of [code7700].
     *
     * Unlike [code7700], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code7700") @ExcludeMissing fun _code7700(): JsonField<Boolean> = code7700

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
     * Returns the raw JSON value of [faa].
     *
     * Unlike [faa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("faa") @ExcludeMissing fun _faa(): JsonField<Boolean> = faa

    /**
     * Returns the raw JSON value of [grndspd].
     *
     * Unlike [grndspd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("grndspd") @ExcludeMissing fun _grndspd(): JsonField<Double> = grndspd

    /**
     * Returns the raw JSON value of [hdng].
     *
     * Unlike [hdng], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hdng") @ExcludeMissing fun _hdng(): JsonField<Double> = hdng

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [m1].
     *
     * Unlike [m1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m1") @ExcludeMissing fun _m1(): JsonField<String> = m1

    /**
     * Returns the raw JSON value of [m1g].
     *
     * Unlike [m1g], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m1g") @ExcludeMissing fun _m1g(): JsonField<Boolean> = m1g

    /**
     * Returns the raw JSON value of [m1v].
     *
     * Unlike [m1v], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m1v") @ExcludeMissing fun _m1v(): JsonField<String> = m1v

    /**
     * Returns the raw JSON value of [m2].
     *
     * Unlike [m2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m2") @ExcludeMissing fun _m2(): JsonField<String> = m2

    /**
     * Returns the raw JSON value of [m2g].
     *
     * Unlike [m2g], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m2g") @ExcludeMissing fun _m2g(): JsonField<Boolean> = m2g

    /**
     * Returns the raw JSON value of [m2v].
     *
     * Unlike [m2v], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m2v") @ExcludeMissing fun _m2v(): JsonField<String> = m2v

    /**
     * Returns the raw JSON value of [m2xv].
     *
     * Unlike [m2xv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m2xv") @ExcludeMissing fun _m2xv(): JsonField<String> = m2xv

    /**
     * Returns the raw JSON value of [m3a].
     *
     * Unlike [m3a], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m3a") @ExcludeMissing fun _m3a(): JsonField<String> = m3a

    /**
     * Returns the raw JSON value of [m3ag].
     *
     * Unlike [m3ag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m3ag") @ExcludeMissing fun _m3ag(): JsonField<Boolean> = m3ag

    /**
     * Returns the raw JSON value of [m3av].
     *
     * Unlike [m3av], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m3av") @ExcludeMissing fun _m3av(): JsonField<String> = m3av

    /**
     * Returns the raw JSON value of [m3axv].
     *
     * Unlike [m3axv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m3axv") @ExcludeMissing fun _m3axv(): JsonField<String> = m3axv

    /**
     * Returns the raw JSON value of [m4].
     *
     * Unlike [m4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m4") @ExcludeMissing fun _m4(): JsonField<String> = m4

    /**
     * Returns the raw JSON value of [m4d1d2].
     *
     * Unlike [m4d1d2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m4d1d2") @ExcludeMissing fun _m4d1d2(): JsonField<String> = m4d1d2

    /**
     * Returns the raw JSON value of [m4v].
     *
     * Unlike [m4v], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m4v") @ExcludeMissing fun _m4v(): JsonField<String> = m4v

    /**
     * Returns the raw JSON value of [mah].
     *
     * Unlike [mah], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mah") @ExcludeMissing fun _mah(): JsonField<String> = mah

    /**
     * Returns the raw JSON value of [mc].
     *
     * Unlike [mc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mc") @ExcludeMissing fun _mc(): JsonField<Double> = mc

    /**
     * Returns the raw JSON value of [mcg].
     *
     * Unlike [mcg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcg") @ExcludeMissing fun _mcg(): JsonField<Boolean> = mcg

    /**
     * Returns the raw JSON value of [mcv].
     *
     * Unlike [mcv], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcv") @ExcludeMissing fun _mcv(): JsonField<String> = mcv

    /**
     * Returns the raw JSON value of [milemrgcy].
     *
     * Unlike [milemrgcy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("milemrgcy") @ExcludeMissing fun _milemrgcy(): JsonField<Boolean> = milemrgcy

    /**
     * Returns the raw JSON value of [mrgrpt].
     *
     * Unlike [mrgrpt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mrgrpt") @ExcludeMissing fun _mrgrpt(): JsonField<Boolean> = mrgrpt

    /**
     * Returns the raw JSON value of [mscommb].
     *
     * Unlike [mscommb], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mscommb") @ExcludeMissing fun _mscommb(): JsonField<String> = mscommb

    /**
     * Returns the raw JSON value of [mti].
     *
     * Unlike [mti], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mti") @ExcludeMissing fun _mti(): JsonField<Boolean> = mti

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
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [psrrl].
     *
     * Unlike [psrrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("psrrl") @ExcludeMissing fun _psrrl(): JsonField<Double> = psrrl

    /**
     * Returns the raw JSON value of [rad].
     *
     * Unlike [rad], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rad") @ExcludeMissing fun _rad(): JsonField<String> = rad

    /**
     * Returns the raw JSON value of [rng].
     *
     * Unlike [rng], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rng") @ExcludeMissing fun _rng(): JsonField<Double> = rng

    /**
     * Returns the raw JSON value of [rngdelt].
     *
     * Unlike [rngdelt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rngdelt") @ExcludeMissing fun _rngdelt(): JsonField<Double> = rngdelt

    /**
     * Returns the raw JSON value of [sac].
     *
     * Unlike [sac], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sac") @ExcludeMissing fun _sac(): JsonField<Int> = sac

    /**
     * Returns the raw JSON value of [senalt].
     *
     * Unlike [senalt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senalt") @ExcludeMissing fun _senalt(): JsonField<Double> = senalt

    /**
     * Returns the raw JSON value of [senlat].
     *
     * Unlike [senlat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlat") @ExcludeMissing fun _senlat(): JsonField<Double> = senlat

    /**
     * Returns the raw JSON value of [senlon].
     *
     * Unlike [senlon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senlon") @ExcludeMissing fun _senlon(): JsonField<Double> = senlon

    /**
     * Returns the raw JSON value of [sic].
     *
     * Unlike [sic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sic") @ExcludeMissing fun _sic(): JsonField<Int> = sic

    /**
     * Returns the raw JSON value of [spi].
     *
     * Unlike [spi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spi") @ExcludeMissing fun _spi(): JsonField<Boolean> = spi

    /**
     * Returns the raw JSON value of [ssrl].
     *
     * Unlike [ssrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ssrl") @ExcludeMissing fun _ssrl(): JsonField<Double> = ssrl

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [tgtconf].
     *
     * Unlike [tgtconf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tgtconf") @ExcludeMissing fun _tgtconf(): JsonField<String> = tgtconf

    /**
     * Returns the raw JSON value of [tgtcorr].
     *
     * Unlike [tgtcorr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tgtcorr") @ExcludeMissing fun _tgtcorr(): JsonField<String> = tgtcorr

    /**
     * Returns the raw JSON value of [tgtid].
     *
     * Unlike [tgtid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tgtid") @ExcludeMissing fun _tgtid(): JsonField<String> = tgtid

    /**
     * Returns the raw JSON value of [tis].
     *
     * Unlike [tis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tis") @ExcludeMissing fun _tis(): JsonField<Double> = tis

    /**
     * Returns the raw JSON value of [trkelig].
     *
     * Unlike [trkelig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkelig") @ExcludeMissing fun _trkelig(): JsonField<String> = trkelig

    /**
     * Returns the raw JSON value of [trknum].
     *
     * Unlike [trknum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trknum") @ExcludeMissing fun _trknum(): JsonField<Int> = trknum

    /**
     * Returns the raw JSON value of [tti].
     *
     * Unlike [tti], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tti") @ExcludeMissing fun _tti(): JsonField<String> = tti

    /**
     * Returns the raw JSON value of [wectc].
     *
     * Unlike [wectc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wectc") @ExcludeMissing fun _wectc(): JsonField<List<String>> = wectc

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
         * Returns a mutable builder for constructing an instance of [MonoradarListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .msgfmt()
         * .msgts()
         * .msgtyp()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MonoradarListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var msgfmt: JsonField<String>? = null
        private var msgts: JsonField<OffsetDateTime>? = null
        private var msgtyp: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var acp: JsonField<Int> = JsonMissing.of()
        private var addr: JsonField<String> = JsonMissing.of()
        private var af: JsonField<Boolean> = JsonMissing.of()
        private var aims: JsonField<Boolean> = JsonMissing.of()
        private var alt3d: JsonField<Double> = JsonMissing.of()
        private var artsqual: JsonField<String> = JsonMissing.of()
        private var az: JsonField<Double> = JsonMissing.of()
        private var azdelt: JsonField<Double> = JsonMissing.of()
        private var bcnhits: JsonField<Int> = JsonMissing.of()
        private var cartpos: JsonField<MutableList<Double>>? = null
        private var cdm: JsonField<String> = JsonMissing.of()
        private var code7500: JsonField<Boolean> = JsonMissing.of()
        private var code7600: JsonField<Boolean> = JsonMissing.of()
        private var code7700: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var faa: JsonField<Boolean> = JsonMissing.of()
        private var grndspd: JsonField<Double> = JsonMissing.of()
        private var hdng: JsonField<Double> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var m1: JsonField<String> = JsonMissing.of()
        private var m1g: JsonField<Boolean> = JsonMissing.of()
        private var m1v: JsonField<String> = JsonMissing.of()
        private var m2: JsonField<String> = JsonMissing.of()
        private var m2g: JsonField<Boolean> = JsonMissing.of()
        private var m2v: JsonField<String> = JsonMissing.of()
        private var m2xv: JsonField<String> = JsonMissing.of()
        private var m3a: JsonField<String> = JsonMissing.of()
        private var m3ag: JsonField<Boolean> = JsonMissing.of()
        private var m3av: JsonField<String> = JsonMissing.of()
        private var m3axv: JsonField<String> = JsonMissing.of()
        private var m4: JsonField<String> = JsonMissing.of()
        private var m4d1d2: JsonField<String> = JsonMissing.of()
        private var m4v: JsonField<String> = JsonMissing.of()
        private var mah: JsonField<String> = JsonMissing.of()
        private var mc: JsonField<Double> = JsonMissing.of()
        private var mcg: JsonField<Boolean> = JsonMissing.of()
        private var mcv: JsonField<String> = JsonMissing.of()
        private var milemrgcy: JsonField<Boolean> = JsonMissing.of()
        private var mrgrpt: JsonField<Boolean> = JsonMissing.of()
        private var mscommb: JsonField<String> = JsonMissing.of()
        private var mti: JsonField<Boolean> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var psrrl: JsonField<Double> = JsonMissing.of()
        private var rad: JsonField<String> = JsonMissing.of()
        private var rng: JsonField<Double> = JsonMissing.of()
        private var rngdelt: JsonField<Double> = JsonMissing.of()
        private var sac: JsonField<Int> = JsonMissing.of()
        private var senalt: JsonField<Double> = JsonMissing.of()
        private var senlat: JsonField<Double> = JsonMissing.of()
        private var senlon: JsonField<Double> = JsonMissing.of()
        private var sic: JsonField<Int> = JsonMissing.of()
        private var spi: JsonField<Boolean> = JsonMissing.of()
        private var ssrl: JsonField<Double> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var tgtconf: JsonField<String> = JsonMissing.of()
        private var tgtcorr: JsonField<String> = JsonMissing.of()
        private var tgtid: JsonField<String> = JsonMissing.of()
        private var tis: JsonField<Double> = JsonMissing.of()
        private var trkelig: JsonField<String> = JsonMissing.of()
        private var trknum: JsonField<Int> = JsonMissing.of()
        private var tti: JsonField<String> = JsonMissing.of()
        private var wectc: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(monoradarListResponse: MonoradarListResponse) = apply {
            classificationMarking = monoradarListResponse.classificationMarking
            dataMode = monoradarListResponse.dataMode
            msgfmt = monoradarListResponse.msgfmt
            msgts = monoradarListResponse.msgts
            msgtyp = monoradarListResponse.msgtyp
            source = monoradarListResponse.source
            ts = monoradarListResponse.ts
            id = monoradarListResponse.id
            acp = monoradarListResponse.acp
            addr = monoradarListResponse.addr
            af = monoradarListResponse.af
            aims = monoradarListResponse.aims
            alt3d = monoradarListResponse.alt3d
            artsqual = monoradarListResponse.artsqual
            az = monoradarListResponse.az
            azdelt = monoradarListResponse.azdelt
            bcnhits = monoradarListResponse.bcnhits
            cartpos = monoradarListResponse.cartpos.map { it.toMutableList() }
            cdm = monoradarListResponse.cdm
            code7500 = monoradarListResponse.code7500
            code7600 = monoradarListResponse.code7600
            code7700 = monoradarListResponse.code7700
            createdAt = monoradarListResponse.createdAt
            createdBy = monoradarListResponse.createdBy
            faa = monoradarListResponse.faa
            grndspd = monoradarListResponse.grndspd
            hdng = monoradarListResponse.hdng
            idSensor = monoradarListResponse.idSensor
            m1 = monoradarListResponse.m1
            m1g = monoradarListResponse.m1g
            m1v = monoradarListResponse.m1v
            m2 = monoradarListResponse.m2
            m2g = monoradarListResponse.m2g
            m2v = monoradarListResponse.m2v
            m2xv = monoradarListResponse.m2xv
            m3a = monoradarListResponse.m3a
            m3ag = monoradarListResponse.m3ag
            m3av = monoradarListResponse.m3av
            m3axv = monoradarListResponse.m3axv
            m4 = monoradarListResponse.m4
            m4d1d2 = monoradarListResponse.m4d1d2
            m4v = monoradarListResponse.m4v
            mah = monoradarListResponse.mah
            mc = monoradarListResponse.mc
            mcg = monoradarListResponse.mcg
            mcv = monoradarListResponse.mcv
            milemrgcy = monoradarListResponse.milemrgcy
            mrgrpt = monoradarListResponse.mrgrpt
            mscommb = monoradarListResponse.mscommb
            mti = monoradarListResponse.mti
            origin = monoradarListResponse.origin
            origNetwork = monoradarListResponse.origNetwork
            origSensorId = monoradarListResponse.origSensorId
            psrrl = monoradarListResponse.psrrl
            rad = monoradarListResponse.rad
            rng = monoradarListResponse.rng
            rngdelt = monoradarListResponse.rngdelt
            sac = monoradarListResponse.sac
            senalt = monoradarListResponse.senalt
            senlat = monoradarListResponse.senlat
            senlon = monoradarListResponse.senlon
            sic = monoradarListResponse.sic
            spi = monoradarListResponse.spi
            ssrl = monoradarListResponse.ssrl
            tags = monoradarListResponse.tags.map { it.toMutableList() }
            tgtconf = monoradarListResponse.tgtconf
            tgtcorr = monoradarListResponse.tgtcorr
            tgtid = monoradarListResponse.tgtid
            tis = monoradarListResponse.tis
            trkelig = monoradarListResponse.trkelig
            trknum = monoradarListResponse.trknum
            tti = monoradarListResponse.tti
            wectc = monoradarListResponse.wectc.map { it.toMutableList() }
            additionalProperties = monoradarListResponse.additionalProperties.toMutableMap()
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

        /** Message format received (i.e. 'ASR9', 'CAT48', 'TPS70', etc..). */
        fun msgfmt(msgfmt: String) = msgfmt(JsonField.of(msgfmt))

        /**
         * Sets [Builder.msgfmt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgfmt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msgfmt(msgfmt: JsonField<String>) = apply { this.msgfmt = msgfmt }

        /**
         * Message time, in ISO 8601 UTC format with microsecond precision. This is the time that
         * the data message was released from the site.
         */
        fun msgts(msgts: OffsetDateTime) = msgts(JsonField.of(msgts))

        /**
         * Sets [Builder.msgts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun msgts(msgts: JsonField<OffsetDateTime>) = apply { this.msgts = msgts }

        /** Message report type received (i.e. 'SRCH', 'BCN', 'REINF', 'BRTQC', 'PSR', etc..). */
        fun msgtyp(msgtyp: String) = msgtyp(JsonField.of(msgtyp))

        /**
         * Sets [Builder.msgtyp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgtyp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msgtyp(msgtyp: JsonField<String>) = apply { this.msgtyp = msgtyp }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Target detection time, in ISO 8601 UTC format with microsecond precision. */
        fun ts(ts: OffsetDateTime) = ts(JsonField.of(ts))

        /**
         * Sets [Builder.ts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ts] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ts(ts: JsonField<OffsetDateTime>) = apply { this.ts = ts }

        /** Unique identifier of the record, auto-generated by the system. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Azimuth Change Pulse count at target detection. */
        fun acp(acp: Int) = acp(JsonField.of(acp))

        /**
         * Sets [Builder.acp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acp] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun acp(acp: JsonField<Int>) = apply { this.acp = acp }

        /** Aircraft address (24-bits Mode S address) assigned uniquely to each aircraft. */
        fun addr(addr: String) = addr(JsonField.of(addr))

        /**
         * Sets [Builder.addr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addr(addr: JsonField<String>) = apply { this.addr = addr }

        /** Flag indicating military message. */
        fun af(af: Boolean) = af(JsonField.of(af))

        /**
         * Sets [Builder.af] to an arbitrary JSON value.
         *
         * You should usually call [Builder.af] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun af(af: JsonField<Boolean>) = apply { this.af = af }

        /** Flag indicating whether AIMS present. */
        fun aims(aims: Boolean) = aims(JsonField.of(aims))

        /**
         * Sets [Builder.aims] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aims] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aims(aims: JsonField<Boolean>) = apply { this.aims = aims }

        /** Measured height of the target, in km. (for 3D radars). */
        fun alt3d(alt3d: Double) = alt3d(JsonField.of(alt3d))

        /**
         * Sets [Builder.alt3d] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt3d] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt3d(alt3d: JsonField<Double>) = apply { this.alt3d = alt3d }

        /** ARTS quality. */
        fun artsqual(artsqual: String) = artsqual(JsonField.of(artsqual))

        /**
         * Sets [Builder.artsqual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.artsqual] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun artsqual(artsqual: JsonField<String>) = apply { this.artsqual = artsqual }

        /**
         * Target azimuth, measured from the observing site, in degrees from true North. If Azimuth
         * Change Pulse (acp) count is provided, az represents the computed angle.
         */
        fun az(az: Double) = az(JsonField.of(az))

        /**
         * Sets [Builder.az] to an arbitrary JSON value.
         *
         * You should usually call [Builder.az] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun az(az: JsonField<Double>) = apply { this.az = az }

        /** Target azimuth delta between PSR and SSR (reference PSR-SSR), in degrees. */
        fun azdelt(azdelt: Double) = azdelt(JsonField.of(azdelt))

        /**
         * Sets [Builder.azdelt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azdelt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun azdelt(azdelt: JsonField<Double>) = apply { this.azdelt = azdelt }

        /** Number of beacon hits received on the target. */
        fun bcnhits(bcnhits: Int) = bcnhits(JsonField.of(bcnhits))

        /**
         * Sets [Builder.bcnhits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bcnhits] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bcnhits(bcnhits: JsonField<Int>) = apply { this.bcnhits = bcnhits }

        /** Array of local 2d-cartesian [x, y] coordinates of target, in km. */
        fun cartpos(cartpos: List<Double>) = cartpos(JsonField.of(cartpos))

        /**
         * Sets [Builder.cartpos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cartpos] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cartpos(cartpos: JsonField<List<Double>>) = apply {
            this.cartpos = cartpos.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [cartpos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCartpo(cartpo: Double) = apply {
            cartpos =
                (cartpos ?: JsonField.of(mutableListOf())).also {
                    checkKnown("cartpos", it).add(cartpo)
                }
        }

        /** Climbing/Descending mode indicator. */
        fun cdm(cdm: String) = cdm(JsonField.of(cdm))

        /**
         * Sets [Builder.cdm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cdm] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cdm(cdm: JsonField<String>) = apply { this.cdm = cdm }

        /** 7500 squawk present (hijack). */
        fun code7500(code7500: Boolean) = code7500(JsonField.of(code7500))

        /**
         * Sets [Builder.code7500] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code7500] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun code7500(code7500: JsonField<Boolean>) = apply { this.code7500 = code7500 }

        /** 7600 squawk present (loss of comm). */
        fun code7600(code7600: Boolean) = code7600(JsonField.of(code7600))

        /**
         * Sets [Builder.code7600] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code7600] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun code7600(code7600: JsonField<Boolean>) = apply { this.code7600 = code7600 }

        /** 7700 squawk present (general emergency). */
        fun code7700(code7700: Boolean) = code7700(JsonField.of(code7700))

        /**
         * Sets [Builder.code7700] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code7700] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun code7700(code7700: JsonField<Boolean>) = apply { this.code7700 = code7700 }

        /** Time the row was created in the database. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Application user who created the row in the database. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** Flag indicating FAA/Civ message. */
        fun faa(faa: Boolean) = faa(JsonField.of(faa))

        /**
         * Sets [Builder.faa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.faa] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun faa(faa: JsonField<Boolean>) = apply { this.faa = faa }

        /** Target ground speed, in meters/second. */
        fun grndspd(grndspd: Double) = grndspd(JsonField.of(grndspd))

        /**
         * Sets [Builder.grndspd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grndspd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun grndspd(grndspd: JsonField<Double>) = apply { this.grndspd = grndspd }

        /** Target heading, in degrees from true North at the target position. */
        fun hdng(hdng: Double) = hdng(JsonField.of(hdng))

        /**
         * Sets [Builder.hdng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hdng] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hdng(hdng: JsonField<Double>) = apply { this.hdng = hdng }

        /** ID of the radar site or station providing the data. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** Mode-1 interrogation response (mission code). */
        fun m1(m1: String) = m1(JsonField.of(m1))

        /**
         * Sets [Builder.m1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m1(m1: JsonField<String>) = apply { this.m1 = m1 }

        /** Indicator that the mode-1 response was garbled. */
        fun m1g(m1g: Boolean) = m1g(JsonField.of(m1g))

        /**
         * Sets [Builder.m1g] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m1g] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m1g(m1g: JsonField<Boolean>) = apply { this.m1g = m1g }

        /** Status of the mode-1 validity bit. */
        fun m1v(m1v: String) = m1v(JsonField.of(m1v))

        /**
         * Sets [Builder.m1v] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m1v] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m1v(m1v: JsonField<String>) = apply { this.m1v = m1v }

        /** Mode-2 interrogation response (military identification code). */
        fun m2(m2: String) = m2(JsonField.of(m2))

        /**
         * Sets [Builder.m2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m2(m2: JsonField<String>) = apply { this.m2 = m2 }

        /** Indicator that the mode-2 response was garbled. */
        fun m2g(m2g: Boolean) = m2g(JsonField.of(m2g))

        /**
         * Sets [Builder.m2g] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m2g] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m2g(m2g: JsonField<Boolean>) = apply { this.m2g = m2g }

        /** Status of the mode-2 validity bit. */
        fun m2v(m2v: String) = m2v(JsonField.of(m2v))

        /**
         * Sets [Builder.m2v] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m2v] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m2v(m2v: JsonField<String>) = apply { this.m2v = m2v }

        /** Status of the mode-2 X-Pulse response validation. */
        fun m2xv(m2xv: String) = m2xv(JsonField.of(m2xv))

        /**
         * Sets [Builder.m2xv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m2xv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m2xv(m2xv: JsonField<String>) = apply { this.m2xv = m2xv }

        /** Mode-3/A interrogation response (aircraft identification). */
        fun m3a(m3a: String) = m3a(JsonField.of(m3a))

        /**
         * Sets [Builder.m3a] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3a] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m3a(m3a: JsonField<String>) = apply { this.m3a = m3a }

        /** Indicator that the mode-3/A response was garbled. */
        fun m3ag(m3ag: Boolean) = m3ag(JsonField.of(m3ag))

        /**
         * Sets [Builder.m3ag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3ag] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m3ag(m3ag: JsonField<Boolean>) = apply { this.m3ag = m3ag }

        /** Status of the mode-3/A validity bit. */
        fun m3av(m3av: String) = m3av(JsonField.of(m3av))

        /**
         * Sets [Builder.m3av] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3av] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m3av(m3av: JsonField<String>) = apply { this.m3av = m3av }

        /** Status of the mode-3 X-Pulse response validation. */
        fun m3axv(m3axv: String) = m3axv(JsonField.of(m3axv))

        /**
         * Sets [Builder.m3axv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3axv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m3axv(m3axv: JsonField<String>) = apply { this.m3axv = m3axv }

        /** Mode-4 interrogation response (Identification Friend/Foe). */
        fun m4(m4: String) = m4(JsonField.of(m4))

        /**
         * Sets [Builder.m4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m4(m4: JsonField<String>) = apply { this.m4 = m4 }

        /** Mode-4 D1 & D2 response status. */
        fun m4d1d2(m4d1d2: String) = m4d1d2(JsonField.of(m4d1d2))

        /**
         * Sets [Builder.m4d1d2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m4d1d2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m4d1d2(m4d1d2: JsonField<String>) = apply { this.m4d1d2 = m4d1d2 }

        /** Status of the mode-4 validity bit. */
        fun m4v(m4v: String) = m4v(JsonField.of(m4v))

        /**
         * Sets [Builder.m4v] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m4v] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m4v(m4v: JsonField<String>) = apply { this.m4v = m4v }

        /** Indication of Horizontal Maneuver detection. */
        fun mah(mah: String) = mah(JsonField.of(mah))

        /**
         * Sets [Builder.mah] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mah] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mah(mah: JsonField<String>) = apply { this.mah = mah }

        /** Mode-C altitude (uncorrected pressure altitude), in km. */
        fun mc(mc: Double) = mc(JsonField.of(mc))

        /**
         * Sets [Builder.mc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mc] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mc(mc: JsonField<Double>) = apply { this.mc = mc }

        /** Indicator that the mode-C response was garbled. */
        fun mcg(mcg: Boolean) = mcg(JsonField.of(mcg))

        /**
         * Sets [Builder.mcg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcg] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcg(mcg: JsonField<Boolean>) = apply { this.mcg = mcg }

        /** Status of the mode-C validity bit. */
        fun mcv(mcv: String) = mcv(JsonField.of(mcv))

        /**
         * Sets [Builder.mcv] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcv] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcv(mcv: JsonField<String>) = apply { this.mcv = mcv }

        /** Flag indicating military emergency. */
        fun milemrgcy(milemrgcy: Boolean) = milemrgcy(JsonField.of(milemrgcy))

        /**
         * Sets [Builder.milemrgcy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.milemrgcy] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun milemrgcy(milemrgcy: JsonField<Boolean>) = apply { this.milemrgcy = milemrgcy }

        /**
         * Flag indicating report separated from different responses at same range. Azimuth may have
         * larger than normal error when present.
         */
        fun mrgrpt(mrgrpt: Boolean) = mrgrpt(JsonField.of(mrgrpt))

        /**
         * Sets [Builder.mrgrpt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mrgrpt] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mrgrpt(mrgrpt: JsonField<Boolean>) = apply { this.mrgrpt = mrgrpt }

        /** Mode-S Comm B message data. */
        fun mscommb(mscommb: String) = mscommb(JsonField.of(mscommb))

        /**
         * Sets [Builder.mscommb] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mscommb] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mscommb(mscommb: JsonField<String>) = apply { this.mscommb = mscommb }

        /** Flag indicating that target was detected using data from an MTI receiver. */
        fun mti(mti: Boolean) = mti(JsonField.of(mti))

        /**
         * Sets [Builder.mti] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mti] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mti(mti: JsonField<Boolean>) = apply { this.mti = mti }

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
         * Optional identifier provided by observation source to indicate the sensor identifier
         * which produced this observation.This may be an internal identifier and not necessarily a
         * valid sensor ID.
         */
        fun origSensorId(origSensorId: String) = origSensorId(JsonField.of(origSensorId))

        /**
         * Sets [Builder.origSensorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origSensorId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origSensorId(origSensorId: JsonField<String>) = apply {
            this.origSensorId = origSensorId
        }

        /** Runlength of the primary surveillance radar track, in degrees. */
        fun psrrl(psrrl: Double) = psrrl(JsonField.of(psrrl))

        /**
         * Sets [Builder.psrrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.psrrl] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun psrrl(psrrl: JsonField<Double>) = apply { this.psrrl = psrrl }

        /** Type of sensor(s) maintaining track. */
        fun rad(rad: String) = rad(JsonField.of(rad))

        /**
         * Sets [Builder.rad] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rad] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rad(rad: JsonField<String>) = apply { this.rad = rad }

        /** Measured slant range to target from the observing site, in km. */
        fun rng(rng: Double) = rng(JsonField.of(rng))

        /**
         * Sets [Builder.rng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rng] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rng(rng: JsonField<Double>) = apply { this.rng = rng }

        /** Target range delta between PSR and SSR (reference PSR-SSR), in km. */
        fun rngdelt(rngdelt: Double) = rngdelt(JsonField.of(rngdelt))

        /**
         * Sets [Builder.rngdelt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rngdelt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rngdelt(rngdelt: JsonField<Double>) = apply { this.rngdelt = rngdelt }

        /** System Area Code. */
        fun sac(sac: Int) = sac(JsonField.of(sac))

        /**
         * Sets [Builder.sac] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sac] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sac(sac: JsonField<Int>) = apply { this.sac = sac }

        /** Sensor altitude, in kilometers, at time of observation (ts). */
        fun senalt(senalt: Double) = senalt(JsonField.of(senalt))

        /**
         * Sets [Builder.senalt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senalt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senalt(senalt: JsonField<Double>) = apply { this.senalt = senalt }

        /**
         * Sensor WGS84 latitude, in degrees, at time of observation (ts). -90 to 90 degrees
         * (negative values south of equator).
         */
        fun senlat(senlat: Double) = senlat(JsonField.of(senlat))

        /**
         * Sets [Builder.senlat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senlat(senlat: JsonField<Double>) = apply { this.senlat = senlat }

        /**
         * Sensor WGS84 longitude, in degrees, at time of observation (ts). -180 to 180 degrees
         * (negative values west of Prime Meridian).
         */
        fun senlon(senlon: Double) = senlon(JsonField.of(senlon))

        /**
         * Sets [Builder.senlon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senlon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senlon(senlon: JsonField<Double>) = apply { this.senlon = senlon }

        /** System Identification Code. */
        fun sic(sic: Int) = sic(JsonField.of(sic))

        /**
         * Sets [Builder.sic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sic] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sic(sic: JsonField<Int>) = apply { this.sic = sic }

        /**
         * Flag indicating whether Special Position Indicator (SPI) present in interrogation
         * response.
         */
        fun spi(spi: Boolean) = spi(JsonField.of(spi))

        /**
         * Sets [Builder.spi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spi] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spi(spi: JsonField<Boolean>) = apply { this.spi = spi }

        /** Runlength of the secondary surveillance radar track, in degrees. */
        fun ssrl(ssrl: Double) = ssrl(JsonField.of(ssrl))

        /**
         * Sets [Builder.ssrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssrl] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ssrl(ssrl: JsonField<Double>) = apply { this.ssrl = ssrl }

        /**
         * Optional array of provider/source specific tags for this data, where each element is no
         * longer than 32 characters, used for implementing data owner conditional access controls
         * to restrict access to the data. Should be left null by data providers unless conditional
         * access controls are coordinated with the UDL team.
         */
        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        /** Target confidence. */
        fun tgtconf(tgtconf: String) = tgtconf(JsonField.of(tgtconf))

        /**
         * Sets [Builder.tgtconf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tgtconf] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tgtconf(tgtconf: JsonField<String>) = apply { this.tgtconf = tgtconf }

        /** Target correlation flag. */
        fun tgtcorr(tgtcorr: String) = tgtcorr(JsonField.of(tgtcorr))

        /**
         * Sets [Builder.tgtcorr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tgtcorr] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tgtcorr(tgtcorr: JsonField<String>) = apply { this.tgtcorr = tgtcorr }

        /** Aircraft identification from an aircraft equipped with a Mode S transponder. */
        fun tgtid(tgtid: String) = tgtid(JsonField.of(tgtid))

        /**
         * Sets [Builder.tgtid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tgtid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tgtid(tgtid: JsonField<String>) = apply { this.tgtid = tgtid }

        /**
         * Data time-in-storage, in seconds. This is the amount of time elapsed between target
         * detection and message transmission.
         */
        fun tis(tis: Double) = tis(JsonField.of(tis))

        /**
         * Sets [Builder.tis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tis] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tis(tis: JsonField<Double>) = apply { this.tis = tis }

        /** Track eligibility flag. */
        fun trkelig(trkelig: String) = trkelig(JsonField.of(trkelig))

        /**
         * Sets [Builder.trkelig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkelig] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkelig(trkelig: JsonField<String>) = apply { this.trkelig = trkelig }

        /**
         * Value representing a unique reference to a track record within a particular track file.
         * Included when the radar station outputs tracks.
         */
        fun trknum(trknum: Int) = trknum(JsonField.of(trknum))

        /**
         * Sets [Builder.trknum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trknum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trknum(trknum: JsonField<Int>) = apply { this.trknum = trknum }

        /** Test target indicator. */
        fun tti(tti: String) = tti(JsonField.of(tti))

        /**
         * Sets [Builder.tti] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tti] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tti(tti: JsonField<String>) = apply { this.tti = tti }

        /** Warning/Error Conditions and Target Classification. */
        fun wectc(wectc: List<String>) = wectc(JsonField.of(wectc))

        /**
         * Sets [Builder.wectc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wectc] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wectc(wectc: JsonField<List<String>>) = apply {
            this.wectc = wectc.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.wectc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWectc(wectc: String) = apply {
            this.wectc =
                (this.wectc ?: JsonField.of(mutableListOf())).also {
                    checkKnown("wectc", it).add(wectc)
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
         * Returns an immutable instance of [MonoradarListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .msgfmt()
         * .msgts()
         * .msgtyp()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MonoradarListResponse =
            MonoradarListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("msgfmt", msgfmt),
                checkRequired("msgts", msgts),
                checkRequired("msgtyp", msgtyp),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                acp,
                addr,
                af,
                aims,
                alt3d,
                artsqual,
                az,
                azdelt,
                bcnhits,
                (cartpos ?: JsonMissing.of()).map { it.toImmutable() },
                cdm,
                code7500,
                code7600,
                code7700,
                createdAt,
                createdBy,
                faa,
                grndspd,
                hdng,
                idSensor,
                m1,
                m1g,
                m1v,
                m2,
                m2g,
                m2v,
                m2xv,
                m3a,
                m3ag,
                m3av,
                m3axv,
                m4,
                m4d1d2,
                m4v,
                mah,
                mc,
                mcg,
                mcv,
                milemrgcy,
                mrgrpt,
                mscommb,
                mti,
                origin,
                origNetwork,
                origSensorId,
                psrrl,
                rad,
                rng,
                rngdelt,
                sac,
                senalt,
                senlat,
                senlon,
                sic,
                spi,
                ssrl,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                tgtconf,
                tgtcorr,
                tgtid,
                tis,
                trkelig,
                trknum,
                tti,
                (wectc ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MonoradarListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        msgfmt()
        msgts()
        msgtyp()
        source()
        ts()
        id()
        acp()
        addr()
        af()
        aims()
        alt3d()
        artsqual()
        az()
        azdelt()
        bcnhits()
        cartpos()
        cdm()
        code7500()
        code7600()
        code7700()
        createdAt()
        createdBy()
        faa()
        grndspd()
        hdng()
        idSensor()
        m1()
        m1g()
        m1v()
        m2()
        m2g()
        m2v()
        m2xv()
        m3a()
        m3ag()
        m3av()
        m3axv()
        m4()
        m4d1d2()
        m4v()
        mah()
        mc()
        mcg()
        mcv()
        milemrgcy()
        mrgrpt()
        mscommb()
        mti()
        origin()
        origNetwork()
        origSensorId()
        psrrl()
        rad()
        rng()
        rngdelt()
        sac()
        senalt()
        senlat()
        senlon()
        sic()
        spi()
        ssrl()
        tags()
        tgtconf()
        tgtcorr()
        tgtid()
        tis()
        trkelig()
        trknum()
        tti()
        wectc()
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
            (if (msgfmt.asKnown().isPresent) 1 else 0) +
            (if (msgts.asKnown().isPresent) 1 else 0) +
            (if (msgtyp.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (acp.asKnown().isPresent) 1 else 0) +
            (if (addr.asKnown().isPresent) 1 else 0) +
            (if (af.asKnown().isPresent) 1 else 0) +
            (if (aims.asKnown().isPresent) 1 else 0) +
            (if (alt3d.asKnown().isPresent) 1 else 0) +
            (if (artsqual.asKnown().isPresent) 1 else 0) +
            (if (az.asKnown().isPresent) 1 else 0) +
            (if (azdelt.asKnown().isPresent) 1 else 0) +
            (if (bcnhits.asKnown().isPresent) 1 else 0) +
            (cartpos.asKnown().getOrNull()?.size ?: 0) +
            (if (cdm.asKnown().isPresent) 1 else 0) +
            (if (code7500.asKnown().isPresent) 1 else 0) +
            (if (code7600.asKnown().isPresent) 1 else 0) +
            (if (code7700.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (faa.asKnown().isPresent) 1 else 0) +
            (if (grndspd.asKnown().isPresent) 1 else 0) +
            (if (hdng.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (m1.asKnown().isPresent) 1 else 0) +
            (if (m1g.asKnown().isPresent) 1 else 0) +
            (if (m1v.asKnown().isPresent) 1 else 0) +
            (if (m2.asKnown().isPresent) 1 else 0) +
            (if (m2g.asKnown().isPresent) 1 else 0) +
            (if (m2v.asKnown().isPresent) 1 else 0) +
            (if (m2xv.asKnown().isPresent) 1 else 0) +
            (if (m3a.asKnown().isPresent) 1 else 0) +
            (if (m3ag.asKnown().isPresent) 1 else 0) +
            (if (m3av.asKnown().isPresent) 1 else 0) +
            (if (m3axv.asKnown().isPresent) 1 else 0) +
            (if (m4.asKnown().isPresent) 1 else 0) +
            (if (m4d1d2.asKnown().isPresent) 1 else 0) +
            (if (m4v.asKnown().isPresent) 1 else 0) +
            (if (mah.asKnown().isPresent) 1 else 0) +
            (if (mc.asKnown().isPresent) 1 else 0) +
            (if (mcg.asKnown().isPresent) 1 else 0) +
            (if (mcv.asKnown().isPresent) 1 else 0) +
            (if (milemrgcy.asKnown().isPresent) 1 else 0) +
            (if (mrgrpt.asKnown().isPresent) 1 else 0) +
            (if (mscommb.asKnown().isPresent) 1 else 0) +
            (if (mti.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (psrrl.asKnown().isPresent) 1 else 0) +
            (if (rad.asKnown().isPresent) 1 else 0) +
            (if (rng.asKnown().isPresent) 1 else 0) +
            (if (rngdelt.asKnown().isPresent) 1 else 0) +
            (if (sac.asKnown().isPresent) 1 else 0) +
            (if (senalt.asKnown().isPresent) 1 else 0) +
            (if (senlat.asKnown().isPresent) 1 else 0) +
            (if (senlon.asKnown().isPresent) 1 else 0) +
            (if (sic.asKnown().isPresent) 1 else 0) +
            (if (spi.asKnown().isPresent) 1 else 0) +
            (if (ssrl.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (tgtconf.asKnown().isPresent) 1 else 0) +
            (if (tgtcorr.asKnown().isPresent) 1 else 0) +
            (if (tgtid.asKnown().isPresent) 1 else 0) +
            (if (tis.asKnown().isPresent) 1 else 0) +
            (if (trkelig.asKnown().isPresent) 1 else 0) +
            (if (trknum.asKnown().isPresent) 1 else 0) +
            (if (tti.asKnown().isPresent) 1 else 0) +
            (wectc.asKnown().getOrNull()?.size ?: 0)

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

        return other is MonoradarListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            msgfmt == other.msgfmt &&
            msgts == other.msgts &&
            msgtyp == other.msgtyp &&
            source == other.source &&
            ts == other.ts &&
            id == other.id &&
            acp == other.acp &&
            addr == other.addr &&
            af == other.af &&
            aims == other.aims &&
            alt3d == other.alt3d &&
            artsqual == other.artsqual &&
            az == other.az &&
            azdelt == other.azdelt &&
            bcnhits == other.bcnhits &&
            cartpos == other.cartpos &&
            cdm == other.cdm &&
            code7500 == other.code7500 &&
            code7600 == other.code7600 &&
            code7700 == other.code7700 &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            faa == other.faa &&
            grndspd == other.grndspd &&
            hdng == other.hdng &&
            idSensor == other.idSensor &&
            m1 == other.m1 &&
            m1g == other.m1g &&
            m1v == other.m1v &&
            m2 == other.m2 &&
            m2g == other.m2g &&
            m2v == other.m2v &&
            m2xv == other.m2xv &&
            m3a == other.m3a &&
            m3ag == other.m3ag &&
            m3av == other.m3av &&
            m3axv == other.m3axv &&
            m4 == other.m4 &&
            m4d1d2 == other.m4d1d2 &&
            m4v == other.m4v &&
            mah == other.mah &&
            mc == other.mc &&
            mcg == other.mcg &&
            mcv == other.mcv &&
            milemrgcy == other.milemrgcy &&
            mrgrpt == other.mrgrpt &&
            mscommb == other.mscommb &&
            mti == other.mti &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origSensorId == other.origSensorId &&
            psrrl == other.psrrl &&
            rad == other.rad &&
            rng == other.rng &&
            rngdelt == other.rngdelt &&
            sac == other.sac &&
            senalt == other.senalt &&
            senlat == other.senlat &&
            senlon == other.senlon &&
            sic == other.sic &&
            spi == other.spi &&
            ssrl == other.ssrl &&
            tags == other.tags &&
            tgtconf == other.tgtconf &&
            tgtcorr == other.tgtcorr &&
            tgtid == other.tgtid &&
            tis == other.tis &&
            trkelig == other.trkelig &&
            trknum == other.trknum &&
            tti == other.tti &&
            wectc == other.wectc &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            msgfmt,
            msgts,
            msgtyp,
            source,
            ts,
            id,
            acp,
            addr,
            af,
            aims,
            alt3d,
            artsqual,
            az,
            azdelt,
            bcnhits,
            cartpos,
            cdm,
            code7500,
            code7600,
            code7700,
            createdAt,
            createdBy,
            faa,
            grndspd,
            hdng,
            idSensor,
            m1,
            m1g,
            m1v,
            m2,
            m2g,
            m2v,
            m2xv,
            m3a,
            m3ag,
            m3av,
            m3axv,
            m4,
            m4d1d2,
            m4v,
            mah,
            mc,
            mcg,
            mcv,
            milemrgcy,
            mrgrpt,
            mscommb,
            mti,
            origin,
            origNetwork,
            origSensorId,
            psrrl,
            rad,
            rng,
            rngdelt,
            sac,
            senalt,
            senlat,
            senlon,
            sic,
            spi,
            ssrl,
            tags,
            tgtconf,
            tgtcorr,
            tgtid,
            tis,
            trkelig,
            trknum,
            tti,
            wectc,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MonoradarListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, msgfmt=$msgfmt, msgts=$msgts, msgtyp=$msgtyp, source=$source, ts=$ts, id=$id, acp=$acp, addr=$addr, af=$af, aims=$aims, alt3d=$alt3d, artsqual=$artsqual, az=$az, azdelt=$azdelt, bcnhits=$bcnhits, cartpos=$cartpos, cdm=$cdm, code7500=$code7500, code7600=$code7600, code7700=$code7700, createdAt=$createdAt, createdBy=$createdBy, faa=$faa, grndspd=$grndspd, hdng=$hdng, idSensor=$idSensor, m1=$m1, m1g=$m1g, m1v=$m1v, m2=$m2, m2g=$m2g, m2v=$m2v, m2xv=$m2xv, m3a=$m3a, m3ag=$m3ag, m3av=$m3av, m3axv=$m3axv, m4=$m4, m4d1d2=$m4d1d2, m4v=$m4v, mah=$mah, mc=$mc, mcg=$mcg, mcv=$mcv, milemrgcy=$milemrgcy, mrgrpt=$mrgrpt, mscommb=$mscommb, mti=$mti, origin=$origin, origNetwork=$origNetwork, origSensorId=$origSensorId, psrrl=$psrrl, rad=$rad, rng=$rng, rngdelt=$rngdelt, sac=$sac, senalt=$senalt, senlat=$senlat, senlon=$senlon, sic=$sic, spi=$spi, ssrl=$ssrl, tags=$tags, tgtconf=$tgtconf, tgtcorr=$tgtcorr, tgtid=$tgtid, tis=$tis, trkelig=$trkelig, trknum=$trknum, tti=$tti, wectc=$wectc, additionalProperties=$additionalProperties}"
}

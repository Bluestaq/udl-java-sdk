// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.hazard.history

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
 * Hazard contains information concerning the exposure of a geographic area to a Chemical,
 * Biological, Radiological, or Nuclear (CBRN) contaminant. The Hazard schema includes the detection
 * time and type of contamination as well as optional information regarding specific material
 * properties, the extent of contamination, and identification of affected regions.
 */
class HistoryQueryResponse
private constructor(
    private val alarms: JsonField<List<String>>,
    private val alarmValues: JsonField<List<Double>>,
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val detectTime: JsonField<OffsetDateTime>,
    private val detectType: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val a: JsonField<Int>,
    private val activity: JsonField<Double>,
    private val bottleId: JsonField<String>,
    private val casRn: JsonField<String>,
    private val channel: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val ctrnTime: JsonField<Double>,
    private val density: JsonField<Double>,
    private val dep: JsonField<Double>,
    private val depCtrn: JsonField<Double>,
    private val dose: JsonField<Double>,
    private val doseRate: JsonField<Double>,
    private val duration: JsonField<Int>,
    private val gBar: JsonField<Double>,
    private val harmful: JsonField<Boolean>,
    private val hBar: JsonField<Double>,
    private val idPoi: JsonField<String>,
    private val idTrack: JsonField<String>,
    private val massFrac: JsonField<Double>,
    private val matCat: JsonField<Int>,
    private val matClass: JsonField<String>,
    private val matName: JsonField<String>,
    private val matType: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val ppm: JsonField<Int>,
    private val radCtrn: JsonField<Double>,
    private val readings: JsonField<List<String>>,
    private val readingUnits: JsonField<List<String>>,
    private val readingValues: JsonField<List<Double>>,
    private val z: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("alarms") @ExcludeMissing alarms: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("alarmValues")
        @ExcludeMissing
        alarmValues: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("detectTime")
        @ExcludeMissing
        detectTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detectType")
        @ExcludeMissing
        detectType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("a") @ExcludeMissing a: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("activity") @ExcludeMissing activity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("bottleId") @ExcludeMissing bottleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("casRN") @ExcludeMissing casRn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("channel") @ExcludeMissing channel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ctrnTime") @ExcludeMissing ctrnTime: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("density") @ExcludeMissing density: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dep") @ExcludeMissing dep: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("depCtrn") @ExcludeMissing depCtrn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dose") @ExcludeMissing dose: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("doseRate") @ExcludeMissing doseRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("duration") @ExcludeMissing duration: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("gBar") @ExcludeMissing gBar: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("harmful") @ExcludeMissing harmful: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hBar") @ExcludeMissing hBar: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idPOI") @ExcludeMissing idPoi: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idTrack") @ExcludeMissing idTrack: JsonField<String> = JsonMissing.of(),
        @JsonProperty("massFrac") @ExcludeMissing massFrac: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("matCat") @ExcludeMissing matCat: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("matClass") @ExcludeMissing matClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("matName") @ExcludeMissing matName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("matType") @ExcludeMissing matType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ppm") @ExcludeMissing ppm: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("radCtrn") @ExcludeMissing radCtrn: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("readings")
        @ExcludeMissing
        readings: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("readingUnits")
        @ExcludeMissing
        readingUnits: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("readingValues")
        @ExcludeMissing
        readingValues: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("z") @ExcludeMissing z: JsonField<Int> = JsonMissing.of(),
    ) : this(
        alarms,
        alarmValues,
        classificationMarking,
        dataMode,
        detectTime,
        detectType,
        source,
        id,
        a,
        activity,
        bottleId,
        casRn,
        channel,
        createdAt,
        createdBy,
        ctrnTime,
        density,
        dep,
        depCtrn,
        dose,
        doseRate,
        duration,
        gBar,
        harmful,
        hBar,
        idPoi,
        idTrack,
        massFrac,
        matCat,
        matClass,
        matName,
        matType,
        origin,
        origNetwork,
        ppm,
        radCtrn,
        readings,
        readingUnits,
        readingValues,
        z,
        mutableMapOf(),
    )

    /**
     * Array of the specific alarms associated with this detection. The alarms and alarmValues
     * arrays must contain the same number of elements.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alarms(): List<String> = alarms.getRequired("alarms")

    /**
     * Array of the values that correspond to each of the alarms contained in alarms. The alarms and
     * alarmValues arrays must contain the same number of elements.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun alarmValues(): List<Double> = alarmValues.getRequired("alarmValues")

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
     * The detect time, in ISO 8601 UTC format, with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun detectTime(): OffsetDateTime = detectTime.getRequired("detectTime")

    /**
     * The type of hazard (Chemical, Biological, Radiological, Nuclear) detect associated with this
     * record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun detectType(): String = detectType.getRequired("detectType")

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
     * The (rounded) Mass Number of the material associated with this detection. The rounded value
     * is the mass number of the most abundant isotope of the element.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun a(): Optional<Int> = a.getOptional("a")

    /**
     * The radioactivity measurement of the material associated with this detection, in becquerels
     * (Bq). One becquerel (Bq) is equal to one nuclear decay per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun activity(): Optional<Double> = activity.getOptional("activity")

    /**
     * The specific bottle ID associated with this detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun bottleId(): Optional<String> = bottleId.getOptional("bottleId")

    /**
     * The CAS Registry Number, also referred to as CAS Number or CAS RN, associated with the this
     * detection. The CAS Number is a unique numerical identifier assigned by the Chemical Abstracts
     * Service (CAS), to every chemical substance described in the open scientific literature. It
     * includes organic and inorganic compounds, minerals, isotopes, alloys, mixtures, and
     * nonstructurable materials (UVCBs, substances of unknown or variable composition, complex
     * reaction products, or biological origin). For further information, reference
     * https://www.cas.org/cas-data/cas-registry.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun casRn(): Optional<String> = casRn.getOptional("casRN")

    /**
     * The applicable channel involved in this biological material detection (e.g. Digestive, Eyes,
     * Respiratory, Skin, etc.) .
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun channel(): Optional<String> = channel.getOptional("channel")

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
     * The concentration time, in (kg/sec)/m^3, associated with this material detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ctrnTime(): Optional<Double> = ctrnTime.getOptional("ctrnTime")

    /**
     * Measure of density of the material associated with this detection, in kg/m^3.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun density(): Optional<Double> = density.getOptional("density")

    /**
     * The deposition measurement of the contaminant to surface area, in kg/m^2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dep(): Optional<Double> = dep.getOptional("dep")

    /**
     * The deposition concentration of the contaminant to surface area, in becquerels/m^2.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depCtrn(): Optional<Double> = depCtrn.getOptional("depCtrn")

    /**
     * The dose associated with this detection, in gray. Dose is the measure of the energy deposited
     * in matter by ionizing radiation per unit mass. One gray is defined as one Joule of energy
     * absorbed per kilogram of matter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dose(): Optional<Double> = dose.getOptional("dose")

    /**
     * The dose rate associated with this detection, in gray/sec. One gray is defined as one Joule
     * of energy absorbed per kilogram of matter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun doseRate(): Optional<Double> = doseRate.getOptional("doseRate")

    /**
     * The known or projected hazard duration, in seconds, associated with this material detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun duration(): Optional<Int> = duration.getOptional("duration")

    /**
     * Chemical Agent Monitor (CAM) G-type agent measurement, in number of display bars. In G-mode,
     * CAMs monitor for G-series nerve agents.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gBar(): Optional<Double> = gBar.getOptional("gBar")

    /**
     * Flag indicating whether this detection is harmful to humans.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun harmful(): Optional<Boolean> = harmful.getOptional("harmful")

    /**
     * Chemical Agent Monitor (CAM) H-type agent measurement, in number of display bars. In H-mode,
     * CAMs monitor for blister agents.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hBar(): Optional<Double> = hBar.getOptional("hBar")

    /**
     * ID of the Point of Interest (POI) record related to this hazard record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idPoi(): Optional<String> = idPoi.getOptional("idPOI")

    /**
     * ID of the Track record related to this hazard record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idTrack(): Optional<String> = idTrack.getOptional("idTrack")

    /**
     * Ratio of the chemical substance mass to the total mass of the mixture.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun massFrac(): Optional<Double> = massFrac.getOptional("massFrac")

    /**
     * The Radiological Category (1 - 5) which applies to the material associated with this
     * detection, according to the following definitions:
     *
     * Category 1: If not safely or securely managed, would be likely to cause permanent injury to a
     * person who handled them or was otherwise in contact with them for more than a few minutes. It
     * would probably be fatal to be close to this amount of unshielded material for a period of a
     * few minutes to an hour.
     *
     * Category 2: If not safely or securely managed, could cause permanent injury to a person who
     * handled them or was otherwise in contact with them for a short time (minutes to hours). It
     * could possibly be fatal to be close to this amount of unshielded radioactive material for a
     * period of hours to days.
     *
     * Category 3: If not safely or securely managed, could cause permanent injury to a person who
     * handled them or was otherwise in contact with them for hours. It could possibly - although it
     * is unlikely to be - fatal to be close to this amount of unshielded radioactive material for a
     * period of days to weeks.
     *
     * Category 4: If not safely managed or securely protected, could possibly cause temporary
     * injury to someone who handled them or was otherwise in contact with or close to them for a
     * period of many weeks, though this is unlikely. It is very unlikely anyone would be
     * permanently injured by this amount of radioactive material.
     *
     * Category 5: Cannot cause permanent injury. This category applies to x-ray fluorescence
     * devices and electron capture devices.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun matCat(): Optional<Int> = matCat.getOptional("matCat")

    /**
     * The specific Material Class for the material associated with this detect. The material class
     * is generally associated with chemical and biological detections.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun matClass(): Optional<String> = matClass.getOptional("matClass")

    /**
     * The material common name associated with this detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun matName(): Optional<String> = matName.getOptional("matName")

    /**
     * The specific material type (MT) or MT Code involved in this detection, when applicable. The
     * material type is generally associated with radiological and/or nuclear detections. For
     * further information, reference Nuclear Materials Management and Safeguards System (NMMSS)
     * Users Guide Rev. 2.1.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun matType(): Optional<String> = matType.getOptional("matType")

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
     * Measure of the concentration of the material associated with this detection, in parts per
     * million (units of contaminant mass per million parts of total mass).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ppm(): Optional<Int> = ppm.getOptional("ppm")

    /**
     * Measure of radioactive concentration of the material associated with this detection, in
     * becquerels/m^3. One becquerel (Bq) is equal to one nuclear decay per second.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun radCtrn(): Optional<Double> = radCtrn.getOptional("radCtrn")

    /**
     * Array of the specific readings associated with this detection. The readings, readingUnits,
     * and readingValues arrays must contain the same number of elements.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readings(): Optional<List<String>> = readings.getOptional("readings")

    /**
     * Array of the units that correspond to each of the readingValues. The readings, readingUnits,
     * and readingValues arrays must contain the same number of elements.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readingUnits(): Optional<List<String>> = readingUnits.getOptional("readingUnits")

    /**
     * Array of the values that correspond to each of the readings contained in readings. The
     * readings, readingUnits, and readingValues arrays must contain the same number of elements.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun readingValues(): Optional<List<Double>> = readingValues.getOptional("readingValues")

    /**
     * The Atomic Number of the material associated with this detection.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun z(): Optional<Int> = z.getOptional("z")

    /**
     * Returns the raw JSON value of [alarms].
     *
     * Unlike [alarms], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alarms") @ExcludeMissing fun _alarms(): JsonField<List<String>> = alarms

    /**
     * Returns the raw JSON value of [alarmValues].
     *
     * Unlike [alarmValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alarmValues")
    @ExcludeMissing
    fun _alarmValues(): JsonField<List<Double>> = alarmValues

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
     * Returns the raw JSON value of [detectTime].
     *
     * Unlike [detectTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectTime")
    @ExcludeMissing
    fun _detectTime(): JsonField<OffsetDateTime> = detectTime

    /**
     * Returns the raw JSON value of [detectType].
     *
     * Unlike [detectType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("detectType") @ExcludeMissing fun _detectType(): JsonField<String> = detectType

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
     * Returns the raw JSON value of [a].
     *
     * Unlike [a], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("a") @ExcludeMissing fun _a(): JsonField<Int> = a

    /**
     * Returns the raw JSON value of [activity].
     *
     * Unlike [activity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("activity") @ExcludeMissing fun _activity(): JsonField<Double> = activity

    /**
     * Returns the raw JSON value of [bottleId].
     *
     * Unlike [bottleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bottleId") @ExcludeMissing fun _bottleId(): JsonField<String> = bottleId

    /**
     * Returns the raw JSON value of [casRn].
     *
     * Unlike [casRn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("casRN") @ExcludeMissing fun _casRn(): JsonField<String> = casRn

    /**
     * Returns the raw JSON value of [channel].
     *
     * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("channel") @ExcludeMissing fun _channel(): JsonField<String> = channel

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
     * Returns the raw JSON value of [ctrnTime].
     *
     * Unlike [ctrnTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ctrnTime") @ExcludeMissing fun _ctrnTime(): JsonField<Double> = ctrnTime

    /**
     * Returns the raw JSON value of [density].
     *
     * Unlike [density], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("density") @ExcludeMissing fun _density(): JsonField<Double> = density

    /**
     * Returns the raw JSON value of [dep].
     *
     * Unlike [dep], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dep") @ExcludeMissing fun _dep(): JsonField<Double> = dep

    /**
     * Returns the raw JSON value of [depCtrn].
     *
     * Unlike [depCtrn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depCtrn") @ExcludeMissing fun _depCtrn(): JsonField<Double> = depCtrn

    /**
     * Returns the raw JSON value of [dose].
     *
     * Unlike [dose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dose") @ExcludeMissing fun _dose(): JsonField<Double> = dose

    /**
     * Returns the raw JSON value of [doseRate].
     *
     * Unlike [doseRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doseRate") @ExcludeMissing fun _doseRate(): JsonField<Double> = doseRate

    /**
     * Returns the raw JSON value of [duration].
     *
     * Unlike [duration], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Int> = duration

    /**
     * Returns the raw JSON value of [gBar].
     *
     * Unlike [gBar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gBar") @ExcludeMissing fun _gBar(): JsonField<Double> = gBar

    /**
     * Returns the raw JSON value of [harmful].
     *
     * Unlike [harmful], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("harmful") @ExcludeMissing fun _harmful(): JsonField<Boolean> = harmful

    /**
     * Returns the raw JSON value of [hBar].
     *
     * Unlike [hBar], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hBar") @ExcludeMissing fun _hBar(): JsonField<Double> = hBar

    /**
     * Returns the raw JSON value of [idPoi].
     *
     * Unlike [idPoi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idPOI") @ExcludeMissing fun _idPoi(): JsonField<String> = idPoi

    /**
     * Returns the raw JSON value of [idTrack].
     *
     * Unlike [idTrack], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idTrack") @ExcludeMissing fun _idTrack(): JsonField<String> = idTrack

    /**
     * Returns the raw JSON value of [massFrac].
     *
     * Unlike [massFrac], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("massFrac") @ExcludeMissing fun _massFrac(): JsonField<Double> = massFrac

    /**
     * Returns the raw JSON value of [matCat].
     *
     * Unlike [matCat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matCat") @ExcludeMissing fun _matCat(): JsonField<Int> = matCat

    /**
     * Returns the raw JSON value of [matClass].
     *
     * Unlike [matClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matClass") @ExcludeMissing fun _matClass(): JsonField<String> = matClass

    /**
     * Returns the raw JSON value of [matName].
     *
     * Unlike [matName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matName") @ExcludeMissing fun _matName(): JsonField<String> = matName

    /**
     * Returns the raw JSON value of [matType].
     *
     * Unlike [matType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("matType") @ExcludeMissing fun _matType(): JsonField<String> = matType

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
     * Returns the raw JSON value of [ppm].
     *
     * Unlike [ppm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ppm") @ExcludeMissing fun _ppm(): JsonField<Int> = ppm

    /**
     * Returns the raw JSON value of [radCtrn].
     *
     * Unlike [radCtrn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("radCtrn") @ExcludeMissing fun _radCtrn(): JsonField<Double> = radCtrn

    /**
     * Returns the raw JSON value of [readings].
     *
     * Unlike [readings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readings") @ExcludeMissing fun _readings(): JsonField<List<String>> = readings

    /**
     * Returns the raw JSON value of [readingUnits].
     *
     * Unlike [readingUnits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readingUnits")
    @ExcludeMissing
    fun _readingUnits(): JsonField<List<String>> = readingUnits

    /**
     * Returns the raw JSON value of [readingValues].
     *
     * Unlike [readingValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("readingValues")
    @ExcludeMissing
    fun _readingValues(): JsonField<List<Double>> = readingValues

    /**
     * Returns the raw JSON value of [z].
     *
     * Unlike [z], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("z") @ExcludeMissing fun _z(): JsonField<Int> = z

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
         * Returns a mutable builder for constructing an instance of [HistoryQueryResponse].
         *
         * The following fields are required:
         * ```java
         * .alarms()
         * .alarmValues()
         * .classificationMarking()
         * .dataMode()
         * .detectTime()
         * .detectType()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HistoryQueryResponse]. */
    class Builder internal constructor() {

        private var alarms: JsonField<MutableList<String>>? = null
        private var alarmValues: JsonField<MutableList<Double>>? = null
        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var detectTime: JsonField<OffsetDateTime>? = null
        private var detectType: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var a: JsonField<Int> = JsonMissing.of()
        private var activity: JsonField<Double> = JsonMissing.of()
        private var bottleId: JsonField<String> = JsonMissing.of()
        private var casRn: JsonField<String> = JsonMissing.of()
        private var channel: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var ctrnTime: JsonField<Double> = JsonMissing.of()
        private var density: JsonField<Double> = JsonMissing.of()
        private var dep: JsonField<Double> = JsonMissing.of()
        private var depCtrn: JsonField<Double> = JsonMissing.of()
        private var dose: JsonField<Double> = JsonMissing.of()
        private var doseRate: JsonField<Double> = JsonMissing.of()
        private var duration: JsonField<Int> = JsonMissing.of()
        private var gBar: JsonField<Double> = JsonMissing.of()
        private var harmful: JsonField<Boolean> = JsonMissing.of()
        private var hBar: JsonField<Double> = JsonMissing.of()
        private var idPoi: JsonField<String> = JsonMissing.of()
        private var idTrack: JsonField<String> = JsonMissing.of()
        private var massFrac: JsonField<Double> = JsonMissing.of()
        private var matCat: JsonField<Int> = JsonMissing.of()
        private var matClass: JsonField<String> = JsonMissing.of()
        private var matName: JsonField<String> = JsonMissing.of()
        private var matType: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var ppm: JsonField<Int> = JsonMissing.of()
        private var radCtrn: JsonField<Double> = JsonMissing.of()
        private var readings: JsonField<MutableList<String>>? = null
        private var readingUnits: JsonField<MutableList<String>>? = null
        private var readingValues: JsonField<MutableList<Double>>? = null
        private var z: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(historyQueryResponse: HistoryQueryResponse) = apply {
            alarms = historyQueryResponse.alarms.map { it.toMutableList() }
            alarmValues = historyQueryResponse.alarmValues.map { it.toMutableList() }
            classificationMarking = historyQueryResponse.classificationMarking
            dataMode = historyQueryResponse.dataMode
            detectTime = historyQueryResponse.detectTime
            detectType = historyQueryResponse.detectType
            source = historyQueryResponse.source
            id = historyQueryResponse.id
            a = historyQueryResponse.a
            activity = historyQueryResponse.activity
            bottleId = historyQueryResponse.bottleId
            casRn = historyQueryResponse.casRn
            channel = historyQueryResponse.channel
            createdAt = historyQueryResponse.createdAt
            createdBy = historyQueryResponse.createdBy
            ctrnTime = historyQueryResponse.ctrnTime
            density = historyQueryResponse.density
            dep = historyQueryResponse.dep
            depCtrn = historyQueryResponse.depCtrn
            dose = historyQueryResponse.dose
            doseRate = historyQueryResponse.doseRate
            duration = historyQueryResponse.duration
            gBar = historyQueryResponse.gBar
            harmful = historyQueryResponse.harmful
            hBar = historyQueryResponse.hBar
            idPoi = historyQueryResponse.idPoi
            idTrack = historyQueryResponse.idTrack
            massFrac = historyQueryResponse.massFrac
            matCat = historyQueryResponse.matCat
            matClass = historyQueryResponse.matClass
            matName = historyQueryResponse.matName
            matType = historyQueryResponse.matType
            origin = historyQueryResponse.origin
            origNetwork = historyQueryResponse.origNetwork
            ppm = historyQueryResponse.ppm
            radCtrn = historyQueryResponse.radCtrn
            readings = historyQueryResponse.readings.map { it.toMutableList() }
            readingUnits = historyQueryResponse.readingUnits.map { it.toMutableList() }
            readingValues = historyQueryResponse.readingValues.map { it.toMutableList() }
            z = historyQueryResponse.z
            additionalProperties = historyQueryResponse.additionalProperties.toMutableMap()
        }

        /**
         * Array of the specific alarms associated with this detection. The alarms and alarmValues
         * arrays must contain the same number of elements.
         */
        fun alarms(alarms: List<String>) = alarms(JsonField.of(alarms))

        /**
         * Sets [Builder.alarms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alarms] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alarms(alarms: JsonField<List<String>>) = apply {
            this.alarms = alarms.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [alarms].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlarm(alarm: String) = apply {
            alarms =
                (alarms ?: JsonField.of(mutableListOf())).also {
                    checkKnown("alarms", it).add(alarm)
                }
        }

        /**
         * Array of the values that correspond to each of the alarms contained in alarms. The alarms
         * and alarmValues arrays must contain the same number of elements.
         */
        fun alarmValues(alarmValues: List<Double>) = alarmValues(JsonField.of(alarmValues))

        /**
         * Sets [Builder.alarmValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alarmValues] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun alarmValues(alarmValues: JsonField<List<Double>>) = apply {
            this.alarmValues = alarmValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [alarmValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAlarmValue(alarmValue: Double) = apply {
            alarmValues =
                (alarmValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("alarmValues", it).add(alarmValue)
                }
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

        /** The detect time, in ISO 8601 UTC format, with millisecond precision. */
        fun detectTime(detectTime: OffsetDateTime) = detectTime(JsonField.of(detectTime))

        /**
         * Sets [Builder.detectTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun detectTime(detectTime: JsonField<OffsetDateTime>) = apply {
            this.detectTime = detectTime
        }

        /**
         * The type of hazard (Chemical, Biological, Radiological, Nuclear) detect associated with
         * this record.
         */
        fun detectType(detectType: String) = detectType(JsonField.of(detectType))

        /**
         * Sets [Builder.detectType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.detectType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun detectType(detectType: JsonField<String>) = apply { this.detectType = detectType }

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

        /**
         * The (rounded) Mass Number of the material associated with this detection. The rounded
         * value is the mass number of the most abundant isotope of the element.
         */
        fun a(a: Int) = a(JsonField.of(a))

        /**
         * Sets [Builder.a] to an arbitrary JSON value.
         *
         * You should usually call [Builder.a] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun a(a: JsonField<Int>) = apply { this.a = a }

        /**
         * The radioactivity measurement of the material associated with this detection, in
         * becquerels (Bq). One becquerel (Bq) is equal to one nuclear decay per second.
         */
        fun activity(activity: Double) = activity(JsonField.of(activity))

        /**
         * Sets [Builder.activity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activity] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun activity(activity: JsonField<Double>) = apply { this.activity = activity }

        /** The specific bottle ID associated with this detection. */
        fun bottleId(bottleId: String) = bottleId(JsonField.of(bottleId))

        /**
         * Sets [Builder.bottleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bottleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bottleId(bottleId: JsonField<String>) = apply { this.bottleId = bottleId }

        /**
         * The CAS Registry Number, also referred to as CAS Number or CAS RN, associated with the
         * this detection. The CAS Number is a unique numerical identifier assigned by the Chemical
         * Abstracts Service (CAS), to every chemical substance described in the open scientific
         * literature. It includes organic and inorganic compounds, minerals, isotopes, alloys,
         * mixtures, and nonstructurable materials (UVCBs, substances of unknown or variable
         * composition, complex reaction products, or biological origin). For further information,
         * reference https://www.cas.org/cas-data/cas-registry.
         */
        fun casRn(casRn: String) = casRn(JsonField.of(casRn))

        /**
         * Sets [Builder.casRn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.casRn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun casRn(casRn: JsonField<String>) = apply { this.casRn = casRn }

        /**
         * The applicable channel involved in this biological material detection (e.g. Digestive,
         * Eyes, Respiratory, Skin, etc.) .
         */
        fun channel(channel: String) = channel(JsonField.of(channel))

        /**
         * Sets [Builder.channel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.channel] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun channel(channel: JsonField<String>) = apply { this.channel = channel }

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

        /** The concentration time, in (kg/sec)/m^3, associated with this material detection. */
        fun ctrnTime(ctrnTime: Double) = ctrnTime(JsonField.of(ctrnTime))

        /**
         * Sets [Builder.ctrnTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ctrnTime] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ctrnTime(ctrnTime: JsonField<Double>) = apply { this.ctrnTime = ctrnTime }

        /** Measure of density of the material associated with this detection, in kg/m^3. */
        fun density(density: Double) = density(JsonField.of(density))

        /**
         * Sets [Builder.density] to an arbitrary JSON value.
         *
         * You should usually call [Builder.density] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun density(density: JsonField<Double>) = apply { this.density = density }

        /** The deposition measurement of the contaminant to surface area, in kg/m^2. */
        fun dep(dep: Double) = dep(JsonField.of(dep))

        /**
         * Sets [Builder.dep] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dep] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dep(dep: JsonField<Double>) = apply { this.dep = dep }

        /** The deposition concentration of the contaminant to surface area, in becquerels/m^2. */
        fun depCtrn(depCtrn: Double) = depCtrn(JsonField.of(depCtrn))

        /**
         * Sets [Builder.depCtrn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depCtrn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun depCtrn(depCtrn: JsonField<Double>) = apply { this.depCtrn = depCtrn }

        /**
         * The dose associated with this detection, in gray. Dose is the measure of the energy
         * deposited in matter by ionizing radiation per unit mass. One gray is defined as one Joule
         * of energy absorbed per kilogram of matter.
         */
        fun dose(dose: Double) = dose(JsonField.of(dose))

        /**
         * Sets [Builder.dose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dose] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dose(dose: JsonField<Double>) = apply { this.dose = dose }

        /**
         * The dose rate associated with this detection, in gray/sec. One gray is defined as one
         * Joule of energy absorbed per kilogram of matter.
         */
        fun doseRate(doseRate: Double) = doseRate(JsonField.of(doseRate))

        /**
         * Sets [Builder.doseRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doseRate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun doseRate(doseRate: JsonField<Double>) = apply { this.doseRate = doseRate }

        /**
         * The known or projected hazard duration, in seconds, associated with this material
         * detection.
         */
        fun duration(duration: Int) = duration(JsonField.of(duration))

        /**
         * Sets [Builder.duration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.duration] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun duration(duration: JsonField<Int>) = apply { this.duration = duration }

        /**
         * Chemical Agent Monitor (CAM) G-type agent measurement, in number of display bars. In
         * G-mode, CAMs monitor for G-series nerve agents.
         */
        fun gBar(gBar: Double) = gBar(JsonField.of(gBar))

        /**
         * Sets [Builder.gBar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gBar] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gBar(gBar: JsonField<Double>) = apply { this.gBar = gBar }

        /** Flag indicating whether this detection is harmful to humans. */
        fun harmful(harmful: Boolean) = harmful(JsonField.of(harmful))

        /**
         * Sets [Builder.harmful] to an arbitrary JSON value.
         *
         * You should usually call [Builder.harmful] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun harmful(harmful: JsonField<Boolean>) = apply { this.harmful = harmful }

        /**
         * Chemical Agent Monitor (CAM) H-type agent measurement, in number of display bars. In
         * H-mode, CAMs monitor for blister agents.
         */
        fun hBar(hBar: Double) = hBar(JsonField.of(hBar))

        /**
         * Sets [Builder.hBar] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hBar] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hBar(hBar: JsonField<Double>) = apply { this.hBar = hBar }

        /** ID of the Point of Interest (POI) record related to this hazard record. */
        fun idPoi(idPoi: String) = idPoi(JsonField.of(idPoi))

        /**
         * Sets [Builder.idPoi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idPoi] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idPoi(idPoi: JsonField<String>) = apply { this.idPoi = idPoi }

        /** ID of the Track record related to this hazard record. */
        fun idTrack(idTrack: String) = idTrack(JsonField.of(idTrack))

        /**
         * Sets [Builder.idTrack] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idTrack] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idTrack(idTrack: JsonField<String>) = apply { this.idTrack = idTrack }

        /** Ratio of the chemical substance mass to the total mass of the mixture. */
        fun massFrac(massFrac: Double) = massFrac(JsonField.of(massFrac))

        /**
         * Sets [Builder.massFrac] to an arbitrary JSON value.
         *
         * You should usually call [Builder.massFrac] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun massFrac(massFrac: JsonField<Double>) = apply { this.massFrac = massFrac }

        /**
         * The Radiological Category (1 - 5) which applies to the material associated with this
         * detection, according to the following definitions:
         *
         * Category 1: If not safely or securely managed, would be likely to cause permanent injury
         * to a person who handled them or was otherwise in contact with them for more than a few
         * minutes. It would probably be fatal to be close to this amount of unshielded material for
         * a period of a few minutes to an hour.
         *
         * Category 2: If not safely or securely managed, could cause permanent injury to a person
         * who handled them or was otherwise in contact with them for a short time (minutes to
         * hours). It could possibly be fatal to be close to this amount of unshielded radioactive
         * material for a period of hours to days.
         *
         * Category 3: If not safely or securely managed, could cause permanent injury to a person
         * who handled them or was otherwise in contact with them for hours. It could possibly -
         * although it is unlikely to be - fatal to be close to this amount of unshielded
         * radioactive material for a period of days to weeks.
         *
         * Category 4: If not safely managed or securely protected, could possibly cause temporary
         * injury to someone who handled them or was otherwise in contact with or close to them for
         * a period of many weeks, though this is unlikely. It is very unlikely anyone would be
         * permanently injured by this amount of radioactive material.
         *
         * Category 5: Cannot cause permanent injury. This category applies to x-ray fluorescence
         * devices and electron capture devices.
         */
        fun matCat(matCat: Int) = matCat(JsonField.of(matCat))

        /**
         * Sets [Builder.matCat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matCat] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matCat(matCat: JsonField<Int>) = apply { this.matCat = matCat }

        /**
         * The specific Material Class for the material associated with this detect. The material
         * class is generally associated with chemical and biological detections.
         */
        fun matClass(matClass: String) = matClass(JsonField.of(matClass))

        /**
         * Sets [Builder.matClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matClass] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matClass(matClass: JsonField<String>) = apply { this.matClass = matClass }

        /** The material common name associated with this detection. */
        fun matName(matName: String) = matName(JsonField.of(matName))

        /**
         * Sets [Builder.matName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matName(matName: JsonField<String>) = apply { this.matName = matName }

        /**
         * The specific material type (MT) or MT Code involved in this detection, when applicable.
         * The material type is generally associated with radiological and/or nuclear detections.
         * For further information, reference Nuclear Materials Management and Safeguards System
         * (NMMSS) Users Guide Rev. 2.1.
         */
        fun matType(matType: String) = matType(JsonField.of(matType))

        /**
         * Sets [Builder.matType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.matType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun matType(matType: JsonField<String>) = apply { this.matType = matType }

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
         * Measure of the concentration of the material associated with this detection, in parts per
         * million (units of contaminant mass per million parts of total mass).
         */
        fun ppm(ppm: Int) = ppm(JsonField.of(ppm))

        /**
         * Sets [Builder.ppm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ppm] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ppm(ppm: JsonField<Int>) = apply { this.ppm = ppm }

        /**
         * Measure of radioactive concentration of the material associated with this detection, in
         * becquerels/m^3. One becquerel (Bq) is equal to one nuclear decay per second.
         */
        fun radCtrn(radCtrn: Double) = radCtrn(JsonField.of(radCtrn))

        /**
         * Sets [Builder.radCtrn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.radCtrn] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun radCtrn(radCtrn: JsonField<Double>) = apply { this.radCtrn = radCtrn }

        /**
         * Array of the specific readings associated with this detection. The readings,
         * readingUnits, and readingValues arrays must contain the same number of elements.
         */
        fun readings(readings: List<String>) = readings(JsonField.of(readings))

        /**
         * Sets [Builder.readings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readings(readings: JsonField<List<String>>) = apply {
            this.readings = readings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [readings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReading(reading: String) = apply {
            readings =
                (readings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("readings", it).add(reading)
                }
        }

        /**
         * Array of the units that correspond to each of the readingValues. The readings,
         * readingUnits, and readingValues arrays must contain the same number of elements.
         */
        fun readingUnits(readingUnits: List<String>) = readingUnits(JsonField.of(readingUnits))

        /**
         * Sets [Builder.readingUnits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readingUnits] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readingUnits(readingUnits: JsonField<List<String>>) = apply {
            this.readingUnits = readingUnits.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [readingUnits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReadingUnit(readingUnit: String) = apply {
            readingUnits =
                (readingUnits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("readingUnits", it).add(readingUnit)
                }
        }

        /**
         * Array of the values that correspond to each of the readings contained in readings. The
         * readings, readingUnits, and readingValues arrays must contain the same number of
         * elements.
         */
        fun readingValues(readingValues: List<Double>) = readingValues(JsonField.of(readingValues))

        /**
         * Sets [Builder.readingValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readingValues] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun readingValues(readingValues: JsonField<List<Double>>) = apply {
            this.readingValues = readingValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [readingValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReadingValue(readingValue: Double) = apply {
            readingValues =
                (readingValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("readingValues", it).add(readingValue)
                }
        }

        /** The Atomic Number of the material associated with this detection. */
        fun z(z: Int) = z(JsonField.of(z))

        /**
         * Sets [Builder.z] to an arbitrary JSON value.
         *
         * You should usually call [Builder.z] with a well-typed [Int] value instead. This method is
         * primarily for setting the field to an undocumented or not yet supported value.
         */
        fun z(z: JsonField<Int>) = apply { this.z = z }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [HistoryQueryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .alarms()
         * .alarmValues()
         * .classificationMarking()
         * .dataMode()
         * .detectTime()
         * .detectType()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): HistoryQueryResponse =
            HistoryQueryResponse(
                checkRequired("alarms", alarms).map { it.toImmutable() },
                checkRequired("alarmValues", alarmValues).map { it.toImmutable() },
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("detectTime", detectTime),
                checkRequired("detectType", detectType),
                checkRequired("source", source),
                id,
                a,
                activity,
                bottleId,
                casRn,
                channel,
                createdAt,
                createdBy,
                ctrnTime,
                density,
                dep,
                depCtrn,
                dose,
                doseRate,
                duration,
                gBar,
                harmful,
                hBar,
                idPoi,
                idTrack,
                massFrac,
                matCat,
                matClass,
                matName,
                matType,
                origin,
                origNetwork,
                ppm,
                radCtrn,
                (readings ?: JsonMissing.of()).map { it.toImmutable() },
                (readingUnits ?: JsonMissing.of()).map { it.toImmutable() },
                (readingValues ?: JsonMissing.of()).map { it.toImmutable() },
                z,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): HistoryQueryResponse = apply {
        if (validated) {
            return@apply
        }

        alarms()
        alarmValues()
        classificationMarking()
        dataMode().validate()
        detectTime()
        detectType()
        source()
        id()
        a()
        activity()
        bottleId()
        casRn()
        channel()
        createdAt()
        createdBy()
        ctrnTime()
        density()
        dep()
        depCtrn()
        dose()
        doseRate()
        duration()
        gBar()
        harmful()
        hBar()
        idPoi()
        idTrack()
        massFrac()
        matCat()
        matClass()
        matName()
        matType()
        origin()
        origNetwork()
        ppm()
        radCtrn()
        readings()
        readingUnits()
        readingValues()
        z()
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
        (alarms.asKnown().getOrNull()?.size ?: 0) +
            (alarmValues.asKnown().getOrNull()?.size ?: 0) +
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
            (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (detectTime.asKnown().isPresent) 1 else 0) +
            (if (detectType.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (a.asKnown().isPresent) 1 else 0) +
            (if (activity.asKnown().isPresent) 1 else 0) +
            (if (bottleId.asKnown().isPresent) 1 else 0) +
            (if (casRn.asKnown().isPresent) 1 else 0) +
            (if (channel.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (ctrnTime.asKnown().isPresent) 1 else 0) +
            (if (density.asKnown().isPresent) 1 else 0) +
            (if (dep.asKnown().isPresent) 1 else 0) +
            (if (depCtrn.asKnown().isPresent) 1 else 0) +
            (if (dose.asKnown().isPresent) 1 else 0) +
            (if (doseRate.asKnown().isPresent) 1 else 0) +
            (if (duration.asKnown().isPresent) 1 else 0) +
            (if (gBar.asKnown().isPresent) 1 else 0) +
            (if (harmful.asKnown().isPresent) 1 else 0) +
            (if (hBar.asKnown().isPresent) 1 else 0) +
            (if (idPoi.asKnown().isPresent) 1 else 0) +
            (if (idTrack.asKnown().isPresent) 1 else 0) +
            (if (massFrac.asKnown().isPresent) 1 else 0) +
            (if (matCat.asKnown().isPresent) 1 else 0) +
            (if (matClass.asKnown().isPresent) 1 else 0) +
            (if (matName.asKnown().isPresent) 1 else 0) +
            (if (matType.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (ppm.asKnown().isPresent) 1 else 0) +
            (if (radCtrn.asKnown().isPresent) 1 else 0) +
            (readings.asKnown().getOrNull()?.size ?: 0) +
            (readingUnits.asKnown().getOrNull()?.size ?: 0) +
            (readingValues.asKnown().getOrNull()?.size ?: 0) +
            (if (z.asKnown().isPresent) 1 else 0)

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

        return other is HistoryQueryResponse &&
            alarms == other.alarms &&
            alarmValues == other.alarmValues &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            detectTime == other.detectTime &&
            detectType == other.detectType &&
            source == other.source &&
            id == other.id &&
            a == other.a &&
            activity == other.activity &&
            bottleId == other.bottleId &&
            casRn == other.casRn &&
            channel == other.channel &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            ctrnTime == other.ctrnTime &&
            density == other.density &&
            dep == other.dep &&
            depCtrn == other.depCtrn &&
            dose == other.dose &&
            doseRate == other.doseRate &&
            duration == other.duration &&
            gBar == other.gBar &&
            harmful == other.harmful &&
            hBar == other.hBar &&
            idPoi == other.idPoi &&
            idTrack == other.idTrack &&
            massFrac == other.massFrac &&
            matCat == other.matCat &&
            matClass == other.matClass &&
            matName == other.matName &&
            matType == other.matType &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            ppm == other.ppm &&
            radCtrn == other.radCtrn &&
            readings == other.readings &&
            readingUnits == other.readingUnits &&
            readingValues == other.readingValues &&
            z == other.z &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            alarms,
            alarmValues,
            classificationMarking,
            dataMode,
            detectTime,
            detectType,
            source,
            id,
            a,
            activity,
            bottleId,
            casRn,
            channel,
            createdAt,
            createdBy,
            ctrnTime,
            density,
            dep,
            depCtrn,
            dose,
            doseRate,
            duration,
            gBar,
            harmful,
            hBar,
            idPoi,
            idTrack,
            massFrac,
            matCat,
            matClass,
            matName,
            matType,
            origin,
            origNetwork,
            ppm,
            radCtrn,
            readings,
            readingUnits,
            readingValues,
            z,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "HistoryQueryResponse{alarms=$alarms, alarmValues=$alarmValues, classificationMarking=$classificationMarking, dataMode=$dataMode, detectTime=$detectTime, detectType=$detectType, source=$source, id=$id, a=$a, activity=$activity, bottleId=$bottleId, casRn=$casRn, channel=$channel, createdAt=$createdAt, createdBy=$createdBy, ctrnTime=$ctrnTime, density=$density, dep=$dep, depCtrn=$depCtrn, dose=$dose, doseRate=$doseRate, duration=$duration, gBar=$gBar, harmful=$harmful, hBar=$hBar, idPoi=$idPoi, idTrack=$idTrack, massFrac=$massFrac, matCat=$matCat, matClass=$matClass, matName=$matName, matType=$matType, origin=$origin, origNetwork=$origNetwork, ppm=$ppm, radCtrn=$radCtrn, readings=$readings, readingUnits=$readingUnits, readingValues=$readingValues, z=$z, additionalProperties=$additionalProperties}"
}

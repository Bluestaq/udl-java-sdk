// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models

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

/** The airfield status contains dynamic data of an airfield's capabilities. */
class AirfieldstatusFull
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idAirfield: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val altAirfieldId: JsonField<String>,
    private val approvedBy: JsonField<String>,
    private val approvedDate: JsonField<OffsetDateTime>,
    private val arffCat: JsonField<String>,
    private val cargoMog: JsonField<Int>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val fleetServiceMog: JsonField<Int>,
    private val fuelMog: JsonField<Int>,
    private val fuelQtys: JsonField<List<Double>>,
    private val fuelTypes: JsonField<List<String>>,
    private val gseTime: JsonField<Int>,
    private val medCap: JsonField<String>,
    private val message: JsonField<String>,
    private val mheQtys: JsonField<List<Int>>,
    private val mheTypes: JsonField<List<String>>,
    private val mxMog: JsonField<Int>,
    private val narrowParkingMog: JsonField<Int>,
    private val narrowWorkingMog: JsonField<Int>,
    private val numCog: JsonField<Int>,
    private val operatingMog: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val passengerServiceMog: JsonField<Int>,
    private val priFreq: JsonField<Double>,
    private val priRwyNum: JsonField<String>,
    private val reviewedBy: JsonField<String>,
    private val reviewedDate: JsonField<OffsetDateTime>,
    private val rwyCondReading: JsonField<Int>,
    private val rwyFrictionFactor: JsonField<Int>,
    private val rwyMarkings: JsonField<List<String>>,
    private val slotTypesReq: JsonField<List<String>>,
    private val sourceDl: JsonField<String>,
    private val surveyDate: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val wideParkingMog: JsonField<Int>,
    private val wideWorkingMog: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idAirfield")
        @ExcludeMissing
        idAirfield: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("altAirfieldId")
        @ExcludeMissing
        altAirfieldId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approvedBy")
        @ExcludeMissing
        approvedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approvedDate")
        @ExcludeMissing
        approvedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("arffCat") @ExcludeMissing arffCat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cargoMOG") @ExcludeMissing cargoMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fleetServiceMOG")
        @ExcludeMissing
        fleetServiceMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fuelMOG") @ExcludeMissing fuelMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("fuelQtys")
        @ExcludeMissing
        fuelQtys: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("fuelTypes")
        @ExcludeMissing
        fuelTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("gseTime") @ExcludeMissing gseTime: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medCap") @ExcludeMissing medCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mheQtys") @ExcludeMissing mheQtys: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("mheTypes")
        @ExcludeMissing
        mheTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("mxMOG") @ExcludeMissing mxMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("narrowParkingMOG")
        @ExcludeMissing
        narrowParkingMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("narrowWorkingMOG")
        @ExcludeMissing
        narrowWorkingMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numCOG") @ExcludeMissing numCog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("operatingMOG")
        @ExcludeMissing
        operatingMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("passengerServiceMOG")
        @ExcludeMissing
        passengerServiceMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("priFreq") @ExcludeMissing priFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("priRwyNum") @ExcludeMissing priRwyNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewedBy")
        @ExcludeMissing
        reviewedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviewedDate")
        @ExcludeMissing
        reviewedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("rwyCondReading")
        @ExcludeMissing
        rwyCondReading: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rwyFrictionFactor")
        @ExcludeMissing
        rwyFrictionFactor: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("rwyMarkings")
        @ExcludeMissing
        rwyMarkings: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("slotTypesReq")
        @ExcludeMissing
        slotTypesReq: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("surveyDate")
        @ExcludeMissing
        surveyDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("wideParkingMOG")
        @ExcludeMissing
        wideParkingMog: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("wideWorkingMOG")
        @ExcludeMissing
        wideWorkingMog: JsonField<Int> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idAirfield,
        source,
        id,
        altAirfieldId,
        approvedBy,
        approvedDate,
        arffCat,
        cargoMog,
        createdAt,
        createdBy,
        fleetServiceMog,
        fuelMog,
        fuelQtys,
        fuelTypes,
        gseTime,
        medCap,
        message,
        mheQtys,
        mheTypes,
        mxMog,
        narrowParkingMog,
        narrowWorkingMog,
        numCog,
        operatingMog,
        origin,
        origNetwork,
        passengerServiceMog,
        priFreq,
        priRwyNum,
        reviewedBy,
        reviewedDate,
        rwyCondReading,
        rwyFrictionFactor,
        rwyMarkings,
        slotTypesReq,
        sourceDl,
        surveyDate,
        updatedAt,
        updatedBy,
        wideParkingMog,
        wideWorkingMog,
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
     * Unique identifier of the Airfield for which this status is referencing.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idAirfield(): String = idAirfield.getRequired("idAirfield")

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
     * Alternate airfield identifier provided by the source.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altAirfieldId(): Optional<String> = altAirfieldId.getOptional("altAirfieldId")

    /**
     * The name of the person who approved the airfield survey review.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun approvedBy(): Optional<String> = approvedBy.getOptional("approvedBy")

    /**
     * The date that survey review changes were approved for this airfield, in ISO 8601 UTC format
     * with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun approvedDate(): Optional<OffsetDateTime> = approvedDate.getOptional("approvedDate")

    /**
     * The category of aircraft rescue and fire fighting (ARFF) services that are currently
     * available at the airfield. Entries should include the code (FAA or ICAO) and the category.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arffCat(): Optional<String> = arffCat.getOptional("arffCat")

    /**
     * Maximum on ground (MOG) number of high-reach/wide-body cargo aircraft that can be serviced
     * simultaneously based on spacing and manpower at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cargoMog(): Optional<Int> = cargoMog.getOptional("cargoMOG")

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
     * Maximum on ground (MOG) number of fleet aircraft that can be serviced simultaneously based on
     * spacing and manpower at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fleetServiceMog(): Optional<Int> = fleetServiceMog.getOptional("fleetServiceMOG")

    /**
     * Maximum on ground (MOG) number of aircraft that can be simultaneously refueled based on
     * spacing and manpower at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fuelMog(): Optional<Int> = fuelMog.getOptional("fuelMOG")

    /**
     * Array of quantities for each fuel type at the airfield, in kilograms. The values in this
     * array must correspond to the position index in fuelTypes. This array must be the same length
     * as fuelTypes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fuelQtys(): Optional<List<Double>> = fuelQtys.getOptional("fuelQtys")

    /**
     * Array of fuel types available at the airfield. This array must be the same length as
     * fuelQtys.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fuelTypes(): Optional<List<String>> = fuelTypes.getOptional("fuelTypes")

    /**
     * The expected time to receive ground support equipment (e.g. power units, air units, cables,
     * hoses, etc.), in minutes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun gseTime(): Optional<Int> = gseTime.getOptional("gseTime")

    /**
     * The level of medical support and capabilities available at the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medCap(): Optional<String> = medCap.getOptional("medCap")

    /**
     * Description of the current status of the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun message(): Optional<String> = message.getOptional("message")

    /**
     * Array of quantities for each material handling equipment types at the airfield. The values in
     * this array must correspond to the position index in mheTypes. This array must be the same
     * length as mheTypes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mheQtys(): Optional<List<Int>> = mheQtys.getOptional("mheQtys")

    /**
     * Array of material handling equipment types at the airfield. This array must be the same
     * length as mheQtys.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mheTypes(): Optional<List<String>> = mheTypes.getOptional("mheTypes")

    /**
     * Maximum on ground (MOG) number of aircraft that can be simultaneously ground handled for
     * standard maintenance based on spacing and manpower at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mxMog(): Optional<Int> = mxMog.getOptional("mxMOG")

    /**
     * Maximum on ground (MOG) number of parking narrow-body aircraft based on spacing and manpower
     * at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun narrowParkingMog(): Optional<Int> = narrowParkingMog.getOptional("narrowParkingMOG")

    /**
     * Maximum on ground (MOG) number of working narrow-body aircraft based on spacing and manpower
     * at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun narrowWorkingMog(): Optional<Int> = narrowWorkingMog.getOptional("narrowWorkingMOG")

    /**
     * The number of aircraft that are currently on ground (COG) at the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numCog(): Optional<Int> = numCog.getOptional("numCOG")

    /**
     * Maximum on ground (MOG) number of aircraft due to items not directly related to the airfield
     * infrastructure or aircraft servicing capability based on spacing and manpower at the time of
     * status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun operatingMog(): Optional<Int> = operatingMog.getOptional("operatingMOG")

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
     * Maximum on ground (MOG) number of high-reach/wide-body passenger aircraft that can be
     * serviced simultaneously based on spacing and manpower at the time of status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun passengerServiceMog(): Optional<Int> =
        passengerServiceMog.getOptional("passengerServiceMOG")

    /**
     * The primary frequency which the airfield is currently operating, in megahertz.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priFreq(): Optional<Double> = priFreq.getOptional("priFreq")

    /**
     * The number or ID of primary runway at the airfield.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun priRwyNum(): Optional<String> = priRwyNum.getOptional("priRwyNum")

    /**
     * The name of the person who reviewed the airfield survey.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reviewedBy(): Optional<String> = reviewedBy.getOptional("reviewedBy")

    /**
     * The date the airfield survey was reviewed, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reviewedDate(): Optional<OffsetDateTime> = reviewedDate.getOptional("reviewedDate")

    /**
     * The primary runway condition reading value used for determining runway braking action, from 0
     * to 26. A value of 0 indicates braking action is poor or non-existent, where a value of 26
     * indicates braking action is good.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rwyCondReading(): Optional<Int> = rwyCondReading.getOptional("rwyCondReading")

    /**
     * The primary runway friction factor which is dependent on the surface friction between the
     * tires of the aircraft and the runway surface, from 0 to 100. A lower number indicates less
     * friction and less braking response.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rwyFrictionFactor(): Optional<Int> = rwyFrictionFactor.getOptional("rwyFrictionFactor")

    /**
     * Array of markings currently on the primary runway.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rwyMarkings(): Optional<List<String>> = rwyMarkings.getOptional("rwyMarkings")

    /**
     * Array of slot types that an airfield requires a particular aircraft provide in order to
     * consume a slot at this location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun slotTypesReq(): Optional<List<String>> = slotTypesReq.getOptional("slotTypesReq")

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
     * The date the airfield survey was performed, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surveyDate(): Optional<OffsetDateTime> = surveyDate.getOptional("surveyDate")

    /**
     * Time the row was last updated in the database, auto-populated by the system.
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
     * Maximum on ground (MOG) number of parking wide-body aircraft based on spacing and manpower at
     * the time of status. Additional information about this field as it pertains to specific
     * aircraft type may be available in an associated SiteOperations record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wideParkingMog(): Optional<Int> = wideParkingMog.getOptional("wideParkingMOG")

    /**
     * Maximum on ground (MOG) number of working wide-body aircraft based on spacing and manpower at
     * the time of status. Additional information about this field as it pertains to specific
     * aircraft type may be available in an associated SiteOperations record.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun wideWorkingMog(): Optional<Int> = wideWorkingMog.getOptional("wideWorkingMOG")

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
     * Returns the raw JSON value of [idAirfield].
     *
     * Unlike [idAirfield], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAirfield") @ExcludeMissing fun _idAirfield(): JsonField<String> = idAirfield

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
     * Returns the raw JSON value of [altAirfieldId].
     *
     * Unlike [altAirfieldId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altAirfieldId")
    @ExcludeMissing
    fun _altAirfieldId(): JsonField<String> = altAirfieldId

    /**
     * Returns the raw JSON value of [approvedBy].
     *
     * Unlike [approvedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approvedBy") @ExcludeMissing fun _approvedBy(): JsonField<String> = approvedBy

    /**
     * Returns the raw JSON value of [approvedDate].
     *
     * Unlike [approvedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approvedDate")
    @ExcludeMissing
    fun _approvedDate(): JsonField<OffsetDateTime> = approvedDate

    /**
     * Returns the raw JSON value of [arffCat].
     *
     * Unlike [arffCat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arffCat") @ExcludeMissing fun _arffCat(): JsonField<String> = arffCat

    /**
     * Returns the raw JSON value of [cargoMog].
     *
     * Unlike [cargoMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cargoMOG") @ExcludeMissing fun _cargoMog(): JsonField<Int> = cargoMog

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
     * Returns the raw JSON value of [fleetServiceMog].
     *
     * Unlike [fleetServiceMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fleetServiceMOG")
    @ExcludeMissing
    fun _fleetServiceMog(): JsonField<Int> = fleetServiceMog

    /**
     * Returns the raw JSON value of [fuelMog].
     *
     * Unlike [fuelMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fuelMOG") @ExcludeMissing fun _fuelMog(): JsonField<Int> = fuelMog

    /**
     * Returns the raw JSON value of [fuelQtys].
     *
     * Unlike [fuelQtys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fuelQtys") @ExcludeMissing fun _fuelQtys(): JsonField<List<Double>> = fuelQtys

    /**
     * Returns the raw JSON value of [fuelTypes].
     *
     * Unlike [fuelTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fuelTypes") @ExcludeMissing fun _fuelTypes(): JsonField<List<String>> = fuelTypes

    /**
     * Returns the raw JSON value of [gseTime].
     *
     * Unlike [gseTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gseTime") @ExcludeMissing fun _gseTime(): JsonField<Int> = gseTime

    /**
     * Returns the raw JSON value of [medCap].
     *
     * Unlike [medCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medCap") @ExcludeMissing fun _medCap(): JsonField<String> = medCap

    /**
     * Returns the raw JSON value of [message].
     *
     * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

    /**
     * Returns the raw JSON value of [mheQtys].
     *
     * Unlike [mheQtys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mheQtys") @ExcludeMissing fun _mheQtys(): JsonField<List<Int>> = mheQtys

    /**
     * Returns the raw JSON value of [mheTypes].
     *
     * Unlike [mheTypes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mheTypes") @ExcludeMissing fun _mheTypes(): JsonField<List<String>> = mheTypes

    /**
     * Returns the raw JSON value of [mxMog].
     *
     * Unlike [mxMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mxMOG") @ExcludeMissing fun _mxMog(): JsonField<Int> = mxMog

    /**
     * Returns the raw JSON value of [narrowParkingMog].
     *
     * Unlike [narrowParkingMog], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("narrowParkingMOG")
    @ExcludeMissing
    fun _narrowParkingMog(): JsonField<Int> = narrowParkingMog

    /**
     * Returns the raw JSON value of [narrowWorkingMog].
     *
     * Unlike [narrowWorkingMog], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("narrowWorkingMOG")
    @ExcludeMissing
    fun _narrowWorkingMog(): JsonField<Int> = narrowWorkingMog

    /**
     * Returns the raw JSON value of [numCog].
     *
     * Unlike [numCog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numCOG") @ExcludeMissing fun _numCog(): JsonField<Int> = numCog

    /**
     * Returns the raw JSON value of [operatingMog].
     *
     * Unlike [operatingMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operatingMOG") @ExcludeMissing fun _operatingMog(): JsonField<Int> = operatingMog

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
     * Returns the raw JSON value of [passengerServiceMog].
     *
     * Unlike [passengerServiceMog], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("passengerServiceMOG")
    @ExcludeMissing
    fun _passengerServiceMog(): JsonField<Int> = passengerServiceMog

    /**
     * Returns the raw JSON value of [priFreq].
     *
     * Unlike [priFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priFreq") @ExcludeMissing fun _priFreq(): JsonField<Double> = priFreq

    /**
     * Returns the raw JSON value of [priRwyNum].
     *
     * Unlike [priRwyNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priRwyNum") @ExcludeMissing fun _priRwyNum(): JsonField<String> = priRwyNum

    /**
     * Returns the raw JSON value of [reviewedBy].
     *
     * Unlike [reviewedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewedBy") @ExcludeMissing fun _reviewedBy(): JsonField<String> = reviewedBy

    /**
     * Returns the raw JSON value of [reviewedDate].
     *
     * Unlike [reviewedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviewedDate")
    @ExcludeMissing
    fun _reviewedDate(): JsonField<OffsetDateTime> = reviewedDate

    /**
     * Returns the raw JSON value of [rwyCondReading].
     *
     * Unlike [rwyCondReading], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rwyCondReading")
    @ExcludeMissing
    fun _rwyCondReading(): JsonField<Int> = rwyCondReading

    /**
     * Returns the raw JSON value of [rwyFrictionFactor].
     *
     * Unlike [rwyFrictionFactor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rwyFrictionFactor")
    @ExcludeMissing
    fun _rwyFrictionFactor(): JsonField<Int> = rwyFrictionFactor

    /**
     * Returns the raw JSON value of [rwyMarkings].
     *
     * Unlike [rwyMarkings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rwyMarkings")
    @ExcludeMissing
    fun _rwyMarkings(): JsonField<List<String>> = rwyMarkings

    /**
     * Returns the raw JSON value of [slotTypesReq].
     *
     * Unlike [slotTypesReq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slotTypesReq")
    @ExcludeMissing
    fun _slotTypesReq(): JsonField<List<String>> = slotTypesReq

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [surveyDate].
     *
     * Unlike [surveyDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surveyDate")
    @ExcludeMissing
    fun _surveyDate(): JsonField<OffsetDateTime> = surveyDate

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
     * Returns the raw JSON value of [wideParkingMog].
     *
     * Unlike [wideParkingMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wideParkingMOG")
    @ExcludeMissing
    fun _wideParkingMog(): JsonField<Int> = wideParkingMog

    /**
     * Returns the raw JSON value of [wideWorkingMog].
     *
     * Unlike [wideWorkingMog], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wideWorkingMOG")
    @ExcludeMissing
    fun _wideWorkingMog(): JsonField<Int> = wideWorkingMog

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
         * Returns a mutable builder for constructing an instance of [AirfieldstatusFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idAirfield()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AirfieldstatusFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idAirfield: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var altAirfieldId: JsonField<String> = JsonMissing.of()
        private var approvedBy: JsonField<String> = JsonMissing.of()
        private var approvedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var arffCat: JsonField<String> = JsonMissing.of()
        private var cargoMog: JsonField<Int> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var fleetServiceMog: JsonField<Int> = JsonMissing.of()
        private var fuelMog: JsonField<Int> = JsonMissing.of()
        private var fuelQtys: JsonField<MutableList<Double>>? = null
        private var fuelTypes: JsonField<MutableList<String>>? = null
        private var gseTime: JsonField<Int> = JsonMissing.of()
        private var medCap: JsonField<String> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var mheQtys: JsonField<MutableList<Int>>? = null
        private var mheTypes: JsonField<MutableList<String>>? = null
        private var mxMog: JsonField<Int> = JsonMissing.of()
        private var narrowParkingMog: JsonField<Int> = JsonMissing.of()
        private var narrowWorkingMog: JsonField<Int> = JsonMissing.of()
        private var numCog: JsonField<Int> = JsonMissing.of()
        private var operatingMog: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var passengerServiceMog: JsonField<Int> = JsonMissing.of()
        private var priFreq: JsonField<Double> = JsonMissing.of()
        private var priRwyNum: JsonField<String> = JsonMissing.of()
        private var reviewedBy: JsonField<String> = JsonMissing.of()
        private var reviewedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var rwyCondReading: JsonField<Int> = JsonMissing.of()
        private var rwyFrictionFactor: JsonField<Int> = JsonMissing.of()
        private var rwyMarkings: JsonField<MutableList<String>>? = null
        private var slotTypesReq: JsonField<MutableList<String>>? = null
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var surveyDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var wideParkingMog: JsonField<Int> = JsonMissing.of()
        private var wideWorkingMog: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(airfieldstatusFull: AirfieldstatusFull) = apply {
            classificationMarking = airfieldstatusFull.classificationMarking
            dataMode = airfieldstatusFull.dataMode
            idAirfield = airfieldstatusFull.idAirfield
            source = airfieldstatusFull.source
            id = airfieldstatusFull.id
            altAirfieldId = airfieldstatusFull.altAirfieldId
            approvedBy = airfieldstatusFull.approvedBy
            approvedDate = airfieldstatusFull.approvedDate
            arffCat = airfieldstatusFull.arffCat
            cargoMog = airfieldstatusFull.cargoMog
            createdAt = airfieldstatusFull.createdAt
            createdBy = airfieldstatusFull.createdBy
            fleetServiceMog = airfieldstatusFull.fleetServiceMog
            fuelMog = airfieldstatusFull.fuelMog
            fuelQtys = airfieldstatusFull.fuelQtys.map { it.toMutableList() }
            fuelTypes = airfieldstatusFull.fuelTypes.map { it.toMutableList() }
            gseTime = airfieldstatusFull.gseTime
            medCap = airfieldstatusFull.medCap
            message = airfieldstatusFull.message
            mheQtys = airfieldstatusFull.mheQtys.map { it.toMutableList() }
            mheTypes = airfieldstatusFull.mheTypes.map { it.toMutableList() }
            mxMog = airfieldstatusFull.mxMog
            narrowParkingMog = airfieldstatusFull.narrowParkingMog
            narrowWorkingMog = airfieldstatusFull.narrowWorkingMog
            numCog = airfieldstatusFull.numCog
            operatingMog = airfieldstatusFull.operatingMog
            origin = airfieldstatusFull.origin
            origNetwork = airfieldstatusFull.origNetwork
            passengerServiceMog = airfieldstatusFull.passengerServiceMog
            priFreq = airfieldstatusFull.priFreq
            priRwyNum = airfieldstatusFull.priRwyNum
            reviewedBy = airfieldstatusFull.reviewedBy
            reviewedDate = airfieldstatusFull.reviewedDate
            rwyCondReading = airfieldstatusFull.rwyCondReading
            rwyFrictionFactor = airfieldstatusFull.rwyFrictionFactor
            rwyMarkings = airfieldstatusFull.rwyMarkings.map { it.toMutableList() }
            slotTypesReq = airfieldstatusFull.slotTypesReq.map { it.toMutableList() }
            sourceDl = airfieldstatusFull.sourceDl
            surveyDate = airfieldstatusFull.surveyDate
            updatedAt = airfieldstatusFull.updatedAt
            updatedBy = airfieldstatusFull.updatedBy
            wideParkingMog = airfieldstatusFull.wideParkingMog
            wideWorkingMog = airfieldstatusFull.wideWorkingMog
            additionalProperties = airfieldstatusFull.additionalProperties.toMutableMap()
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

        /** Unique identifier of the Airfield for which this status is referencing. */
        fun idAirfield(idAirfield: String) = idAirfield(JsonField.of(idAirfield))

        /**
         * Sets [Builder.idAirfield] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAirfield] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idAirfield(idAirfield: JsonField<String>) = apply { this.idAirfield = idAirfield }

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

        /** Alternate airfield identifier provided by the source. */
        fun altAirfieldId(altAirfieldId: String) = altAirfieldId(JsonField.of(altAirfieldId))

        /**
         * Sets [Builder.altAirfieldId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altAirfieldId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altAirfieldId(altAirfieldId: JsonField<String>) = apply {
            this.altAirfieldId = altAirfieldId
        }

        /** The name of the person who approved the airfield survey review. */
        fun approvedBy(approvedBy: String) = approvedBy(JsonField.of(approvedBy))

        /**
         * Sets [Builder.approvedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approvedBy(approvedBy: JsonField<String>) = apply { this.approvedBy = approvedBy }

        /**
         * The date that survey review changes were approved for this airfield, in ISO 8601 UTC
         * format with millisecond precision.
         */
        fun approvedDate(approvedDate: OffsetDateTime) = approvedDate(JsonField.of(approvedDate))

        /**
         * Sets [Builder.approvedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedDate(approvedDate: JsonField<OffsetDateTime>) = apply {
            this.approvedDate = approvedDate
        }

        /**
         * The category of aircraft rescue and fire fighting (ARFF) services that are currently
         * available at the airfield. Entries should include the code (FAA or ICAO) and the
         * category.
         */
        fun arffCat(arffCat: String) = arffCat(JsonField.of(arffCat))

        /**
         * Sets [Builder.arffCat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arffCat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun arffCat(arffCat: JsonField<String>) = apply { this.arffCat = arffCat }

        /**
         * Maximum on ground (MOG) number of high-reach/wide-body cargo aircraft that can be
         * serviced simultaneously based on spacing and manpower at the time of status.
         */
        fun cargoMog(cargoMog: Int) = cargoMog(JsonField.of(cargoMog))

        /**
         * Sets [Builder.cargoMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cargoMog] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cargoMog(cargoMog: JsonField<Int>) = apply { this.cargoMog = cargoMog }

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
         * Maximum on ground (MOG) number of fleet aircraft that can be serviced simultaneously
         * based on spacing and manpower at the time of status.
         */
        fun fleetServiceMog(fleetServiceMog: Int) = fleetServiceMog(JsonField.of(fleetServiceMog))

        /**
         * Sets [Builder.fleetServiceMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fleetServiceMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fleetServiceMog(fleetServiceMog: JsonField<Int>) = apply {
            this.fleetServiceMog = fleetServiceMog
        }

        /**
         * Maximum on ground (MOG) number of aircraft that can be simultaneously refueled based on
         * spacing and manpower at the time of status.
         */
        fun fuelMog(fuelMog: Int) = fuelMog(JsonField.of(fuelMog))

        /**
         * Sets [Builder.fuelMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fuelMog] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fuelMog(fuelMog: JsonField<Int>) = apply { this.fuelMog = fuelMog }

        /**
         * Array of quantities for each fuel type at the airfield, in kilograms. The values in this
         * array must correspond to the position index in fuelTypes. This array must be the same
         * length as fuelTypes.
         */
        fun fuelQtys(fuelQtys: List<Double>) = fuelQtys(JsonField.of(fuelQtys))

        /**
         * Sets [Builder.fuelQtys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fuelQtys] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fuelQtys(fuelQtys: JsonField<List<Double>>) = apply {
            this.fuelQtys = fuelQtys.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [fuelQtys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFuelQty(fuelQty: Double) = apply {
            fuelQtys =
                (fuelQtys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fuelQtys", it).add(fuelQty)
                }
        }

        /**
         * Array of fuel types available at the airfield. This array must be the same length as
         * fuelQtys.
         */
        fun fuelTypes(fuelTypes: List<String>) = fuelTypes(JsonField.of(fuelTypes))

        /**
         * Sets [Builder.fuelTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fuelTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fuelTypes(fuelTypes: JsonField<List<String>>) = apply {
            this.fuelTypes = fuelTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [fuelTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFuelType(fuelType: String) = apply {
            fuelTypes =
                (fuelTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fuelTypes", it).add(fuelType)
                }
        }

        /**
         * The expected time to receive ground support equipment (e.g. power units, air units,
         * cables, hoses, etc.), in minutes.
         */
        fun gseTime(gseTime: Int) = gseTime(JsonField.of(gseTime))

        /**
         * Sets [Builder.gseTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gseTime] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun gseTime(gseTime: JsonField<Int>) = apply { this.gseTime = gseTime }

        /** The level of medical support and capabilities available at the airfield. */
        fun medCap(medCap: String) = medCap(JsonField.of(medCap))

        /**
         * Sets [Builder.medCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medCap] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medCap(medCap: JsonField<String>) = apply { this.medCap = medCap }

        /** Description of the current status of the airfield. */
        fun message(message: String) = message(JsonField.of(message))

        /**
         * Sets [Builder.message] to an arbitrary JSON value.
         *
         * You should usually call [Builder.message] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun message(message: JsonField<String>) = apply { this.message = message }

        /**
         * Array of quantities for each material handling equipment types at the airfield. The
         * values in this array must correspond to the position index in mheTypes. This array must
         * be the same length as mheTypes.
         */
        fun mheQtys(mheQtys: List<Int>) = mheQtys(JsonField.of(mheQtys))

        /**
         * Sets [Builder.mheQtys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mheQtys] with a well-typed `List<Int>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mheQtys(mheQtys: JsonField<List<Int>>) = apply {
            this.mheQtys = mheQtys.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [mheQtys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMheQty(mheQty: Int) = apply {
            mheQtys =
                (mheQtys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mheQtys", it).add(mheQty)
                }
        }

        /**
         * Array of material handling equipment types at the airfield. This array must be the same
         * length as mheQtys.
         */
        fun mheTypes(mheTypes: List<String>) = mheTypes(JsonField.of(mheTypes))

        /**
         * Sets [Builder.mheTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mheTypes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun mheTypes(mheTypes: JsonField<List<String>>) = apply {
            this.mheTypes = mheTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [mheTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMheType(mheType: String) = apply {
            mheTypes =
                (mheTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("mheTypes", it).add(mheType)
                }
        }

        /**
         * Maximum on ground (MOG) number of aircraft that can be simultaneously ground handled for
         * standard maintenance based on spacing and manpower at the time of status.
         */
        fun mxMog(mxMog: Int) = mxMog(JsonField.of(mxMog))

        /**
         * Sets [Builder.mxMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mxMog] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mxMog(mxMog: JsonField<Int>) = apply { this.mxMog = mxMog }

        /**
         * Maximum on ground (MOG) number of parking narrow-body aircraft based on spacing and
         * manpower at the time of status.
         */
        fun narrowParkingMog(narrowParkingMog: Int) =
            narrowParkingMog(JsonField.of(narrowParkingMog))

        /**
         * Sets [Builder.narrowParkingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.narrowParkingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun narrowParkingMog(narrowParkingMog: JsonField<Int>) = apply {
            this.narrowParkingMog = narrowParkingMog
        }

        /**
         * Maximum on ground (MOG) number of working narrow-body aircraft based on spacing and
         * manpower at the time of status.
         */
        fun narrowWorkingMog(narrowWorkingMog: Int) =
            narrowWorkingMog(JsonField.of(narrowWorkingMog))

        /**
         * Sets [Builder.narrowWorkingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.narrowWorkingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun narrowWorkingMog(narrowWorkingMog: JsonField<Int>) = apply {
            this.narrowWorkingMog = narrowWorkingMog
        }

        /** The number of aircraft that are currently on ground (COG) at the airfield. */
        fun numCog(numCog: Int) = numCog(JsonField.of(numCog))

        /**
         * Sets [Builder.numCog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numCog] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numCog(numCog: JsonField<Int>) = apply { this.numCog = numCog }

        /**
         * Maximum on ground (MOG) number of aircraft due to items not directly related to the
         * airfield infrastructure or aircraft servicing capability based on spacing and manpower at
         * the time of status.
         */
        fun operatingMog(operatingMog: Int) = operatingMog(JsonField.of(operatingMog))

        /**
         * Sets [Builder.operatingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operatingMog(operatingMog: JsonField<Int>) = apply { this.operatingMog = operatingMog }

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
         * Maximum on ground (MOG) number of high-reach/wide-body passenger aircraft that can be
         * serviced simultaneously based on spacing and manpower at the time of status.
         */
        fun passengerServiceMog(passengerServiceMog: Int) =
            passengerServiceMog(JsonField.of(passengerServiceMog))

        /**
         * Sets [Builder.passengerServiceMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.passengerServiceMog] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun passengerServiceMog(passengerServiceMog: JsonField<Int>) = apply {
            this.passengerServiceMog = passengerServiceMog
        }

        /** The primary frequency which the airfield is currently operating, in megahertz. */
        fun priFreq(priFreq: Double) = priFreq(JsonField.of(priFreq))

        /**
         * Sets [Builder.priFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priFreq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun priFreq(priFreq: JsonField<Double>) = apply { this.priFreq = priFreq }

        /** The number or ID of primary runway at the airfield. */
        fun priRwyNum(priRwyNum: String) = priRwyNum(JsonField.of(priRwyNum))

        /**
         * Sets [Builder.priRwyNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priRwyNum] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priRwyNum(priRwyNum: JsonField<String>) = apply { this.priRwyNum = priRwyNum }

        /** The name of the person who reviewed the airfield survey. */
        fun reviewedBy(reviewedBy: String) = reviewedBy(JsonField.of(reviewedBy))

        /**
         * Sets [Builder.reviewedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewedBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reviewedBy(reviewedBy: JsonField<String>) = apply { this.reviewedBy = reviewedBy }

        /**
         * The date the airfield survey was reviewed, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun reviewedDate(reviewedDate: OffsetDateTime) = reviewedDate(JsonField.of(reviewedDate))

        /**
         * Sets [Builder.reviewedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviewedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reviewedDate(reviewedDate: JsonField<OffsetDateTime>) = apply {
            this.reviewedDate = reviewedDate
        }

        /**
         * The primary runway condition reading value used for determining runway braking action,
         * from 0 to 26. A value of 0 indicates braking action is poor or non-existent, where a
         * value of 26 indicates braking action is good.
         */
        fun rwyCondReading(rwyCondReading: Int) = rwyCondReading(JsonField.of(rwyCondReading))

        /**
         * Sets [Builder.rwyCondReading] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rwyCondReading] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rwyCondReading(rwyCondReading: JsonField<Int>) = apply {
            this.rwyCondReading = rwyCondReading
        }

        /**
         * The primary runway friction factor which is dependent on the surface friction between the
         * tires of the aircraft and the runway surface, from 0 to 100. A lower number indicates
         * less friction and less braking response.
         */
        fun rwyFrictionFactor(rwyFrictionFactor: Int) =
            rwyFrictionFactor(JsonField.of(rwyFrictionFactor))

        /**
         * Sets [Builder.rwyFrictionFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rwyFrictionFactor] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rwyFrictionFactor(rwyFrictionFactor: JsonField<Int>) = apply {
            this.rwyFrictionFactor = rwyFrictionFactor
        }

        /** Array of markings currently on the primary runway. */
        fun rwyMarkings(rwyMarkings: List<String>) = rwyMarkings(JsonField.of(rwyMarkings))

        /**
         * Sets [Builder.rwyMarkings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rwyMarkings] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rwyMarkings(rwyMarkings: JsonField<List<String>>) = apply {
            this.rwyMarkings = rwyMarkings.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [rwyMarkings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRwyMarking(rwyMarking: String) = apply {
            rwyMarkings =
                (rwyMarkings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rwyMarkings", it).add(rwyMarking)
                }
        }

        /**
         * Array of slot types that an airfield requires a particular aircraft provide in order to
         * consume a slot at this location.
         */
        fun slotTypesReq(slotTypesReq: List<String>) = slotTypesReq(JsonField.of(slotTypesReq))

        /**
         * Sets [Builder.slotTypesReq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slotTypesReq] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun slotTypesReq(slotTypesReq: JsonField<List<String>>) = apply {
            this.slotTypesReq = slotTypesReq.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.slotTypesReq].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSlotTypesReq(slotTypesReq: String) = apply {
            this.slotTypesReq =
                (this.slotTypesReq ?: JsonField.of(mutableListOf())).also {
                    checkKnown("slotTypesReq", it).add(slotTypesReq)
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

        /**
         * The date the airfield survey was performed, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun surveyDate(surveyDate: OffsetDateTime) = surveyDate(JsonField.of(surveyDate))

        /**
         * Sets [Builder.surveyDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surveyDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun surveyDate(surveyDate: JsonField<OffsetDateTime>) = apply {
            this.surveyDate = surveyDate
        }

        /** Time the row was last updated in the database, auto-populated by the system. */
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
         * Maximum on ground (MOG) number of parking wide-body aircraft based on spacing and
         * manpower at the time of status. Additional information about this field as it pertains to
         * specific aircraft type may be available in an associated SiteOperations record.
         */
        fun wideParkingMog(wideParkingMog: Int) = wideParkingMog(JsonField.of(wideParkingMog))

        /**
         * Sets [Builder.wideParkingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wideParkingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wideParkingMog(wideParkingMog: JsonField<Int>) = apply {
            this.wideParkingMog = wideParkingMog
        }

        /**
         * Maximum on ground (MOG) number of working wide-body aircraft based on spacing and
         * manpower at the time of status. Additional information about this field as it pertains to
         * specific aircraft type may be available in an associated SiteOperations record.
         */
        fun wideWorkingMog(wideWorkingMog: Int) = wideWorkingMog(JsonField.of(wideWorkingMog))

        /**
         * Sets [Builder.wideWorkingMog] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wideWorkingMog] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun wideWorkingMog(wideWorkingMog: JsonField<Int>) = apply {
            this.wideWorkingMog = wideWorkingMog
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
         * Returns an immutable instance of [AirfieldstatusFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idAirfield()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AirfieldstatusFull =
            AirfieldstatusFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idAirfield", idAirfield),
                checkRequired("source", source),
                id,
                altAirfieldId,
                approvedBy,
                approvedDate,
                arffCat,
                cargoMog,
                createdAt,
                createdBy,
                fleetServiceMog,
                fuelMog,
                (fuelQtys ?: JsonMissing.of()).map { it.toImmutable() },
                (fuelTypes ?: JsonMissing.of()).map { it.toImmutable() },
                gseTime,
                medCap,
                message,
                (mheQtys ?: JsonMissing.of()).map { it.toImmutable() },
                (mheTypes ?: JsonMissing.of()).map { it.toImmutable() },
                mxMog,
                narrowParkingMog,
                narrowWorkingMog,
                numCog,
                operatingMog,
                origin,
                origNetwork,
                passengerServiceMog,
                priFreq,
                priRwyNum,
                reviewedBy,
                reviewedDate,
                rwyCondReading,
                rwyFrictionFactor,
                (rwyMarkings ?: JsonMissing.of()).map { it.toImmutable() },
                (slotTypesReq ?: JsonMissing.of()).map { it.toImmutable() },
                sourceDl,
                surveyDate,
                updatedAt,
                updatedBy,
                wideParkingMog,
                wideWorkingMog,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AirfieldstatusFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idAirfield()
        source()
        id()
        altAirfieldId()
        approvedBy()
        approvedDate()
        arffCat()
        cargoMog()
        createdAt()
        createdBy()
        fleetServiceMog()
        fuelMog()
        fuelQtys()
        fuelTypes()
        gseTime()
        medCap()
        message()
        mheQtys()
        mheTypes()
        mxMog()
        narrowParkingMog()
        narrowWorkingMog()
        numCog()
        operatingMog()
        origin()
        origNetwork()
        passengerServiceMog()
        priFreq()
        priRwyNum()
        reviewedBy()
        reviewedDate()
        rwyCondReading()
        rwyFrictionFactor()
        rwyMarkings()
        slotTypesReq()
        sourceDl()
        surveyDate()
        updatedAt()
        updatedBy()
        wideParkingMog()
        wideWorkingMog()
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
            (if (idAirfield.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (altAirfieldId.asKnown().isPresent) 1 else 0) +
            (if (approvedBy.asKnown().isPresent) 1 else 0) +
            (if (approvedDate.asKnown().isPresent) 1 else 0) +
            (if (arffCat.asKnown().isPresent) 1 else 0) +
            (if (cargoMog.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (fleetServiceMog.asKnown().isPresent) 1 else 0) +
            (if (fuelMog.asKnown().isPresent) 1 else 0) +
            (fuelQtys.asKnown().getOrNull()?.size ?: 0) +
            (fuelTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (gseTime.asKnown().isPresent) 1 else 0) +
            (if (medCap.asKnown().isPresent) 1 else 0) +
            (if (message.asKnown().isPresent) 1 else 0) +
            (mheQtys.asKnown().getOrNull()?.size ?: 0) +
            (mheTypes.asKnown().getOrNull()?.size ?: 0) +
            (if (mxMog.asKnown().isPresent) 1 else 0) +
            (if (narrowParkingMog.asKnown().isPresent) 1 else 0) +
            (if (narrowWorkingMog.asKnown().isPresent) 1 else 0) +
            (if (numCog.asKnown().isPresent) 1 else 0) +
            (if (operatingMog.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (passengerServiceMog.asKnown().isPresent) 1 else 0) +
            (if (priFreq.asKnown().isPresent) 1 else 0) +
            (if (priRwyNum.asKnown().isPresent) 1 else 0) +
            (if (reviewedBy.asKnown().isPresent) 1 else 0) +
            (if (reviewedDate.asKnown().isPresent) 1 else 0) +
            (if (rwyCondReading.asKnown().isPresent) 1 else 0) +
            (if (rwyFrictionFactor.asKnown().isPresent) 1 else 0) +
            (rwyMarkings.asKnown().getOrNull()?.size ?: 0) +
            (slotTypesReq.asKnown().getOrNull()?.size ?: 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (surveyDate.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (wideParkingMog.asKnown().isPresent) 1 else 0) +
            (if (wideWorkingMog.asKnown().isPresent) 1 else 0)

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

        return other is AirfieldstatusFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idAirfield == other.idAirfield &&
            source == other.source &&
            id == other.id &&
            altAirfieldId == other.altAirfieldId &&
            approvedBy == other.approvedBy &&
            approvedDate == other.approvedDate &&
            arffCat == other.arffCat &&
            cargoMog == other.cargoMog &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            fleetServiceMog == other.fleetServiceMog &&
            fuelMog == other.fuelMog &&
            fuelQtys == other.fuelQtys &&
            fuelTypes == other.fuelTypes &&
            gseTime == other.gseTime &&
            medCap == other.medCap &&
            message == other.message &&
            mheQtys == other.mheQtys &&
            mheTypes == other.mheTypes &&
            mxMog == other.mxMog &&
            narrowParkingMog == other.narrowParkingMog &&
            narrowWorkingMog == other.narrowWorkingMog &&
            numCog == other.numCog &&
            operatingMog == other.operatingMog &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            passengerServiceMog == other.passengerServiceMog &&
            priFreq == other.priFreq &&
            priRwyNum == other.priRwyNum &&
            reviewedBy == other.reviewedBy &&
            reviewedDate == other.reviewedDate &&
            rwyCondReading == other.rwyCondReading &&
            rwyFrictionFactor == other.rwyFrictionFactor &&
            rwyMarkings == other.rwyMarkings &&
            slotTypesReq == other.slotTypesReq &&
            sourceDl == other.sourceDl &&
            surveyDate == other.surveyDate &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            wideParkingMog == other.wideParkingMog &&
            wideWorkingMog == other.wideWorkingMog &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idAirfield,
            source,
            id,
            altAirfieldId,
            approvedBy,
            approvedDate,
            arffCat,
            cargoMog,
            createdAt,
            createdBy,
            fleetServiceMog,
            fuelMog,
            fuelQtys,
            fuelTypes,
            gseTime,
            medCap,
            message,
            mheQtys,
            mheTypes,
            mxMog,
            narrowParkingMog,
            narrowWorkingMog,
            numCog,
            operatingMog,
            origin,
            origNetwork,
            passengerServiceMog,
            priFreq,
            priRwyNum,
            reviewedBy,
            reviewedDate,
            rwyCondReading,
            rwyFrictionFactor,
            rwyMarkings,
            slotTypesReq,
            sourceDl,
            surveyDate,
            updatedAt,
            updatedBy,
            wideParkingMog,
            wideWorkingMog,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AirfieldstatusFull{classificationMarking=$classificationMarking, dataMode=$dataMode, idAirfield=$idAirfield, source=$source, id=$id, altAirfieldId=$altAirfieldId, approvedBy=$approvedBy, approvedDate=$approvedDate, arffCat=$arffCat, cargoMog=$cargoMog, createdAt=$createdAt, createdBy=$createdBy, fleetServiceMog=$fleetServiceMog, fuelMog=$fuelMog, fuelQtys=$fuelQtys, fuelTypes=$fuelTypes, gseTime=$gseTime, medCap=$medCap, message=$message, mheQtys=$mheQtys, mheTypes=$mheTypes, mxMog=$mxMog, narrowParkingMog=$narrowParkingMog, narrowWorkingMog=$narrowWorkingMog, numCog=$numCog, operatingMog=$operatingMog, origin=$origin, origNetwork=$origNetwork, passengerServiceMog=$passengerServiceMog, priFreq=$priFreq, priRwyNum=$priRwyNum, reviewedBy=$reviewedBy, reviewedDate=$reviewedDate, rwyCondReading=$rwyCondReading, rwyFrictionFactor=$rwyFrictionFactor, rwyMarkings=$rwyMarkings, slotTypesReq=$slotTypesReq, sourceDl=$sourceDl, surveyDate=$surveyDate, updatedAt=$updatedAt, updatedBy=$updatedBy, wideParkingMog=$wideParkingMog, wideWorkingMog=$wideWorkingMog, additionalProperties=$additionalProperties}"
}

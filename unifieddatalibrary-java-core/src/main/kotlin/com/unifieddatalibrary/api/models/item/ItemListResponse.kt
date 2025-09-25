// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.item

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ItemListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val scanCode: JsonField<String>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val accSysKeys: JsonField<List<String>>,
    private val accSysNotes: JsonField<String>,
    private val accSystem: JsonField<String>,
    private val accSysValues: JsonField<List<String>>,
    private val airdrop: JsonField<Boolean>,
    private val altDataFormat: JsonField<String>,
    private val cargoType: JsonField<String>,
    private val centerlineOffset: JsonField<Double>,
    private val cg: JsonField<Double>,
    private val commodityCode: JsonField<String>,
    private val commoditySys: JsonField<String>,
    private val container: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val departure: JsonField<String>,
    private val destination: JsonField<String>,
    private val dvCode: JsonField<String>,
    private val fs: JsonField<Double>,
    private val hazCodes: JsonField<List<Double>>,
    private val height: JsonField<Double>,
    private val idAirLoadPlan: JsonField<String>,
    private val itemContains: JsonField<List<String>>,
    private val keys: JsonField<List<String>>,
    private val lastArrDate: JsonField<LocalDate>,
    private val length: JsonField<Double>,
    private val moment: JsonField<Double>,
    private val name: JsonField<String>,
    private val netExpWt: JsonField<Double>,
    private val notes: JsonField<String>,
    private val numPalletPos: JsonField<Int>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val productCode: JsonField<String>,
    private val productSys: JsonField<String>,
    private val receivingBranch: JsonField<String>,
    private val receivingUnit: JsonField<String>,
    private val scGenTool: JsonField<String>,
    private val sourceDl: JsonField<String>,
    private val tcn: JsonField<String>,
    private val uln: JsonField<String>,
    private val values: JsonField<List<String>>,
    private val volume: JsonField<Double>,
    private val weight: JsonField<Double>,
    private val weightTs: JsonField<OffsetDateTime>,
    private val width: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("scanCode") @ExcludeMissing scanCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accSysKeys")
        @ExcludeMissing
        accSysKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("accSysNotes")
        @ExcludeMissing
        accSysNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accSystem") @ExcludeMissing accSystem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accSysValues")
        @ExcludeMissing
        accSysValues: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("airdrop") @ExcludeMissing airdrop: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("altDataFormat")
        @ExcludeMissing
        altDataFormat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cargoType") @ExcludeMissing cargoType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("centerlineOffset")
        @ExcludeMissing
        centerlineOffset: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cg") @ExcludeMissing cg: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("commodityCode")
        @ExcludeMissing
        commodityCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commoditySys")
        @ExcludeMissing
        commoditySys: JsonField<String> = JsonMissing.of(),
        @JsonProperty("container") @ExcludeMissing container: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("departure") @ExcludeMissing departure: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dvCode") @ExcludeMissing dvCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fs") @ExcludeMissing fs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hazCodes")
        @ExcludeMissing
        hazCodes: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("idAirLoadPlan")
        @ExcludeMissing
        idAirLoadPlan: JsonField<String> = JsonMissing.of(),
        @JsonProperty("itemContains")
        @ExcludeMissing
        itemContains: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("keys") @ExcludeMissing keys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("lastArrDate")
        @ExcludeMissing
        lastArrDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("moment") @ExcludeMissing moment: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netExpWt") @ExcludeMissing netExpWt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("notes") @ExcludeMissing notes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numPalletPos")
        @ExcludeMissing
        numPalletPos: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productCode")
        @ExcludeMissing
        productCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productSys")
        @ExcludeMissing
        productSys: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receivingBranch")
        @ExcludeMissing
        receivingBranch: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receivingUnit")
        @ExcludeMissing
        receivingUnit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scGenTool") @ExcludeMissing scGenTool: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceDL") @ExcludeMissing sourceDl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tcn") @ExcludeMissing tcn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uln") @ExcludeMissing uln: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("volume") @ExcludeMissing volume: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("weight") @ExcludeMissing weight: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("weightTS")
        @ExcludeMissing
        weightTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        scanCode,
        source,
        type,
        id,
        accSysKeys,
        accSysNotes,
        accSystem,
        accSysValues,
        airdrop,
        altDataFormat,
        cargoType,
        centerlineOffset,
        cg,
        commodityCode,
        commoditySys,
        container,
        createdAt,
        createdBy,
        departure,
        destination,
        dvCode,
        fs,
        hazCodes,
        height,
        idAirLoadPlan,
        itemContains,
        keys,
        lastArrDate,
        length,
        moment,
        name,
        netExpWt,
        notes,
        numPalletPos,
        origin,
        origNetwork,
        productCode,
        productSys,
        receivingBranch,
        receivingUnit,
        scGenTool,
        sourceDl,
        tcn,
        uln,
        values,
        volume,
        weight,
        weightTs,
        width,
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
     * The tracking identifier of an item or person. May be similar in representation of a barcode
     * or UPC. If no scanCode or tracking number equivalent is available, 'NONE' should be used.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun scanCode(): String = scanCode.getRequired("scanCode")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The item type of this record (e.g. EQUIPMENT, CARGO, PASSENGER).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system if not provided on create
     * operations.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Array of keys that may be associated to the accepting system data. The entries in this array
     * must correspond to the position index in accSysValues array. This array must be the same
     * length as accSysValues.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accSysKeys(): Optional<List<String>> = accSysKeys.getOptional("accSysKeys")

    /**
     * Additional data required to find this item in the accepting system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accSysNotes(): Optional<String> = accSysNotes.getOptional("accSysNotes")

    /**
     * Name of the system that accepted this item from a customer. Where a user or application could
     * go look for additional information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accSystem(): Optional<String> = accSystem.getOptional("accSystem")

    /**
     * Array of values for the keys that may be associated to the accepting system data. The entries
     * in this array must correspond to the position index in accSysKeys array. This array must be
     * the same length as accSysKeys.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun accSysValues(): Optional<List<String>> = accSysValues.getOptional("accSysValues")

    /**
     * Flag indicating this item is planned to be airdropped. Applicable for cargo and passenger
     * item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun airdrop(): Optional<Boolean> = airdrop.getOptional("airdrop")

    /**
     * Name of the additional data format so downstream consuming applications can know how to parse
     * it. Typically includes the source system name and the format name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun altDataFormat(): Optional<String> = altDataFormat.getOptional("altDataFormat")

    /**
     * The type of cargo (e.g. PALLET, ROLLING STOCK, LOOSE, OTHER). Applicable for cargo item types
     * only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cargoType(): Optional<String> = cargoType.getOptional("cargoType")

    /**
     * How far left or right of centerline is the item in meters. Applicable for cargo and passenger
     * item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun centerlineOffset(): Optional<Double> = centerlineOffset.getOptional("centerlineOffset")

    /**
     * Center of gravity position of the item, measured from the item's front datum, in centimeters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cg(): Optional<Double> = cg.getOptional("cg")

    /**
     * The classification code of the commodity or group of commodities.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun commodityCode(): Optional<String> = commodityCode.getOptional("commodityCode")

    /**
     * The classification system denoting the commodity code, commodityCode (e.g. AIR, WATER, NMFC,
     * UFC, STCC, DODUNQ, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun commoditySys(): Optional<String> = commoditySys.getOptional("commoditySys")

    /**
     * Flag indicating this item acts as a container and contains additional items.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun container(): Optional<Boolean> = container.getOptional("container")

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
     * The departure code or location where this item has left or is leaving.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun departure(): Optional<String> = departure.getOptional("departure")

    /**
     * The destination of the item, typically an ICAO or port code. Applicable for cargo and
     * passenger item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun destination(): Optional<String> = destination.getOptional("destination")

    /**
     * United States Distinguished Visitor Code, only applicable to people.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dvCode(): Optional<String> = dvCode.getOptional("dvCode")

    /**
     * The fuselage station of the item measured from the reference datum, in centimeters.
     * Applicable for cargo and passenger item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun fs(): Optional<Double> = fs.getOptional("fs")

    /**
     * Array of UN hazard classes or division codes that apply to this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hazCodes(): Optional<List<Double>> = hazCodes.getOptional("hazCodes")

    /**
     * Height of the cargo in meters. Applicable for cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun height(): Optional<Double> = height.getOptional("height")

    /**
     * The UDL ID of the air load plan this item is associated with.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idAirLoadPlan(): Optional<String> = idAirLoadPlan.getOptional("idAirLoadPlan")

    /**
     * Array of tracking identifiers that are contained within this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun itemContains(): Optional<List<String>> = itemContains.getOptional("itemContains")

    /**
     * Array of keys that may be associated to this item. The entries in this array must correspond
     * to the position index in the values array. This array must be the same length as values..
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun keys(): Optional<List<String>> = keys.getOptional("keys")

    /**
     * The latest acceptable arrival date of the item at the destination, in ISO 8601 date-only
     * format (e.g. YYYY-MM-DD).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lastArrDate(): Optional<LocalDate> = lastArrDate.getOptional("lastArrDate")

    /**
     * Length of the cargo in meters. Applicable for cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * Moment of the item in Newton-meters. Applicable for equipment and cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun moment(): Optional<Double> = moment.getOptional("moment")

    /**
     * Name of the item. Applicable for equipment and cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Net explosive weight of the item, in kilograms.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun netExpWt(): Optional<Double> = netExpWt.getOptional("netExpWt")

    /**
     * Optional notes or comments about this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun notes(): Optional<String> = notes.getOptional("notes")

    /**
     * Number of pallet positions or equivalent on the aircraft, ship, or conveyance equipment that
     * this item occupies.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numPalletPos(): Optional<Int> = numPalletPos.getOptional("numPalletPos")

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
     * The code denoting the type of material item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun productCode(): Optional<String> = productCode.getOptional("productCode")

    /**
     * The assigning system that denotes the type of material item, productCode (e.g. NSN-national
     * stock number, NDC-national drug code, MPN-manufacturer part number, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun productSys(): Optional<String> = productSys.getOptional("productSys")

    /**
     * The military branch receiving this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receivingBranch(): Optional<String> = receivingBranch.getOptional("receivingBranch")

    /**
     * The name of the unit receiving this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun receivingUnit(): Optional<String> = receivingUnit.getOptional("receivingUnit")

    /**
     * The algorithm name or standard that generated the scanCode (e.g. UPC-A, EAN-13, GTIN, SSCC,
     * bID, JAN, etc.).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scGenTool(): Optional<String> = scGenTool.getOptional("scGenTool")

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
     * Transportation Control Number of the cargo. Applicable for cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tcn(): Optional<String> = tcn.getOptional("tcn")

    /**
     * The unit line number of this item.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun uln(): Optional<String> = uln.getOptional("uln")

    /**
     * Array of values for the keys that may be associated to this tracked item. The entries in this
     * array must correspond to the position index in the keys array. This array must be the same
     * length as keys.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun values(): Optional<List<String>> = values.getOptional("values")

    /**
     * The volume of the item, in cubic meters. Applicable for cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun volume(): Optional<Double> = volume.getOptional("volume")

    /**
     * Weight of the item in kilograms (if item is a passenger, include on-person bags).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weight(): Optional<Double> = weight.getOptional("weight")

    /**
     * Timestamp when the weight was taken, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun weightTs(): Optional<OffsetDateTime> = weightTs.getOptional("weightTS")

    /**
     * Width of the cargo in meters. Applicable for cargo item types only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun width(): Optional<Double> = width.getOptional("width")

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
     * Returns the raw JSON value of [scanCode].
     *
     * Unlike [scanCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanCode") @ExcludeMissing fun _scanCode(): JsonField<String> = scanCode

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
     * Returns the raw JSON value of [accSysKeys].
     *
     * Unlike [accSysKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accSysKeys")
    @ExcludeMissing
    fun _accSysKeys(): JsonField<List<String>> = accSysKeys

    /**
     * Returns the raw JSON value of [accSysNotes].
     *
     * Unlike [accSysNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accSysNotes") @ExcludeMissing fun _accSysNotes(): JsonField<String> = accSysNotes

    /**
     * Returns the raw JSON value of [accSystem].
     *
     * Unlike [accSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accSystem") @ExcludeMissing fun _accSystem(): JsonField<String> = accSystem

    /**
     * Returns the raw JSON value of [accSysValues].
     *
     * Unlike [accSysValues], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accSysValues")
    @ExcludeMissing
    fun _accSysValues(): JsonField<List<String>> = accSysValues

    /**
     * Returns the raw JSON value of [airdrop].
     *
     * Unlike [airdrop], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("airdrop") @ExcludeMissing fun _airdrop(): JsonField<Boolean> = airdrop

    /**
     * Returns the raw JSON value of [altDataFormat].
     *
     * Unlike [altDataFormat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("altDataFormat")
    @ExcludeMissing
    fun _altDataFormat(): JsonField<String> = altDataFormat

    /**
     * Returns the raw JSON value of [cargoType].
     *
     * Unlike [cargoType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cargoType") @ExcludeMissing fun _cargoType(): JsonField<String> = cargoType

    /**
     * Returns the raw JSON value of [centerlineOffset].
     *
     * Unlike [centerlineOffset], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("centerlineOffset")
    @ExcludeMissing
    fun _centerlineOffset(): JsonField<Double> = centerlineOffset

    /**
     * Returns the raw JSON value of [cg].
     *
     * Unlike [cg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cg") @ExcludeMissing fun _cg(): JsonField<Double> = cg

    /**
     * Returns the raw JSON value of [commodityCode].
     *
     * Unlike [commodityCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commodityCode")
    @ExcludeMissing
    fun _commodityCode(): JsonField<String> = commodityCode

    /**
     * Returns the raw JSON value of [commoditySys].
     *
     * Unlike [commoditySys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("commoditySys")
    @ExcludeMissing
    fun _commoditySys(): JsonField<String> = commoditySys

    /**
     * Returns the raw JSON value of [container].
     *
     * Unlike [container], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("container") @ExcludeMissing fun _container(): JsonField<Boolean> = container

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
     * Returns the raw JSON value of [departure].
     *
     * Unlike [departure], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("departure") @ExcludeMissing fun _departure(): JsonField<String> = departure

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [dvCode].
     *
     * Unlike [dvCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dvCode") @ExcludeMissing fun _dvCode(): JsonField<String> = dvCode

    /**
     * Returns the raw JSON value of [fs].
     *
     * Unlike [fs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fs") @ExcludeMissing fun _fs(): JsonField<Double> = fs

    /**
     * Returns the raw JSON value of [hazCodes].
     *
     * Unlike [hazCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hazCodes") @ExcludeMissing fun _hazCodes(): JsonField<List<Double>> = hazCodes

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Double> = height

    /**
     * Returns the raw JSON value of [idAirLoadPlan].
     *
     * Unlike [idAirLoadPlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idAirLoadPlan")
    @ExcludeMissing
    fun _idAirLoadPlan(): JsonField<String> = idAirLoadPlan

    /**
     * Returns the raw JSON value of [itemContains].
     *
     * Unlike [itemContains], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("itemContains")
    @ExcludeMissing
    fun _itemContains(): JsonField<List<String>> = itemContains

    /**
     * Returns the raw JSON value of [keys].
     *
     * Unlike [keys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("keys") @ExcludeMissing fun _keys(): JsonField<List<String>> = keys

    /**
     * Returns the raw JSON value of [lastArrDate].
     *
     * Unlike [lastArrDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastArrDate")
    @ExcludeMissing
    fun _lastArrDate(): JsonField<LocalDate> = lastArrDate

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [moment].
     *
     * Unlike [moment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("moment") @ExcludeMissing fun _moment(): JsonField<Double> = moment

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [netExpWt].
     *
     * Unlike [netExpWt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("netExpWt") @ExcludeMissing fun _netExpWt(): JsonField<Double> = netExpWt

    /**
     * Returns the raw JSON value of [notes].
     *
     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

    /**
     * Returns the raw JSON value of [numPalletPos].
     *
     * Unlike [numPalletPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numPalletPos") @ExcludeMissing fun _numPalletPos(): JsonField<Int> = numPalletPos

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
     * Returns the raw JSON value of [productCode].
     *
     * Unlike [productCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productCode") @ExcludeMissing fun _productCode(): JsonField<String> = productCode

    /**
     * Returns the raw JSON value of [productSys].
     *
     * Unlike [productSys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productSys") @ExcludeMissing fun _productSys(): JsonField<String> = productSys

    /**
     * Returns the raw JSON value of [receivingBranch].
     *
     * Unlike [receivingBranch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivingBranch")
    @ExcludeMissing
    fun _receivingBranch(): JsonField<String> = receivingBranch

    /**
     * Returns the raw JSON value of [receivingUnit].
     *
     * Unlike [receivingUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("receivingUnit")
    @ExcludeMissing
    fun _receivingUnit(): JsonField<String> = receivingUnit

    /**
     * Returns the raw JSON value of [scGenTool].
     *
     * Unlike [scGenTool], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scGenTool") @ExcludeMissing fun _scGenTool(): JsonField<String> = scGenTool

    /**
     * Returns the raw JSON value of [sourceDl].
     *
     * Unlike [sourceDl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceDL") @ExcludeMissing fun _sourceDl(): JsonField<String> = sourceDl

    /**
     * Returns the raw JSON value of [tcn].
     *
     * Unlike [tcn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcn") @ExcludeMissing fun _tcn(): JsonField<String> = tcn

    /**
     * Returns the raw JSON value of [uln].
     *
     * Unlike [uln], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uln") @ExcludeMissing fun _uln(): JsonField<String> = uln

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

    /**
     * Returns the raw JSON value of [volume].
     *
     * Unlike [volume], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("volume") @ExcludeMissing fun _volume(): JsonField<Double> = volume

    /**
     * Returns the raw JSON value of [weight].
     *
     * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Double> = weight

    /**
     * Returns the raw JSON value of [weightTs].
     *
     * Unlike [weightTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("weightTS") @ExcludeMissing fun _weightTs(): JsonField<OffsetDateTime> = weightTs

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Double> = width

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
         * Returns a mutable builder for constructing an instance of [ItemListResponse].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .scanCode()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemListResponse]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var scanCode: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var accSysKeys: JsonField<MutableList<String>>? = null
        private var accSysNotes: JsonField<String> = JsonMissing.of()
        private var accSystem: JsonField<String> = JsonMissing.of()
        private var accSysValues: JsonField<MutableList<String>>? = null
        private var airdrop: JsonField<Boolean> = JsonMissing.of()
        private var altDataFormat: JsonField<String> = JsonMissing.of()
        private var cargoType: JsonField<String> = JsonMissing.of()
        private var centerlineOffset: JsonField<Double> = JsonMissing.of()
        private var cg: JsonField<Double> = JsonMissing.of()
        private var commodityCode: JsonField<String> = JsonMissing.of()
        private var commoditySys: JsonField<String> = JsonMissing.of()
        private var container: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var departure: JsonField<String> = JsonMissing.of()
        private var destination: JsonField<String> = JsonMissing.of()
        private var dvCode: JsonField<String> = JsonMissing.of()
        private var fs: JsonField<Double> = JsonMissing.of()
        private var hazCodes: JsonField<MutableList<Double>>? = null
        private var height: JsonField<Double> = JsonMissing.of()
        private var idAirLoadPlan: JsonField<String> = JsonMissing.of()
        private var itemContains: JsonField<MutableList<String>>? = null
        private var keys: JsonField<MutableList<String>>? = null
        private var lastArrDate: JsonField<LocalDate> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var moment: JsonField<Double> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var netExpWt: JsonField<Double> = JsonMissing.of()
        private var notes: JsonField<String> = JsonMissing.of()
        private var numPalletPos: JsonField<Int> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var productCode: JsonField<String> = JsonMissing.of()
        private var productSys: JsonField<String> = JsonMissing.of()
        private var receivingBranch: JsonField<String> = JsonMissing.of()
        private var receivingUnit: JsonField<String> = JsonMissing.of()
        private var scGenTool: JsonField<String> = JsonMissing.of()
        private var sourceDl: JsonField<String> = JsonMissing.of()
        private var tcn: JsonField<String> = JsonMissing.of()
        private var uln: JsonField<String> = JsonMissing.of()
        private var values: JsonField<MutableList<String>>? = null
        private var volume: JsonField<Double> = JsonMissing.of()
        private var weight: JsonField<Double> = JsonMissing.of()
        private var weightTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var width: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemListResponse: ItemListResponse) = apply {
            classificationMarking = itemListResponse.classificationMarking
            dataMode = itemListResponse.dataMode
            scanCode = itemListResponse.scanCode
            source = itemListResponse.source
            type = itemListResponse.type
            id = itemListResponse.id
            accSysKeys = itemListResponse.accSysKeys.map { it.toMutableList() }
            accSysNotes = itemListResponse.accSysNotes
            accSystem = itemListResponse.accSystem
            accSysValues = itemListResponse.accSysValues.map { it.toMutableList() }
            airdrop = itemListResponse.airdrop
            altDataFormat = itemListResponse.altDataFormat
            cargoType = itemListResponse.cargoType
            centerlineOffset = itemListResponse.centerlineOffset
            cg = itemListResponse.cg
            commodityCode = itemListResponse.commodityCode
            commoditySys = itemListResponse.commoditySys
            container = itemListResponse.container
            createdAt = itemListResponse.createdAt
            createdBy = itemListResponse.createdBy
            departure = itemListResponse.departure
            destination = itemListResponse.destination
            dvCode = itemListResponse.dvCode
            fs = itemListResponse.fs
            hazCodes = itemListResponse.hazCodes.map { it.toMutableList() }
            height = itemListResponse.height
            idAirLoadPlan = itemListResponse.idAirLoadPlan
            itemContains = itemListResponse.itemContains.map { it.toMutableList() }
            keys = itemListResponse.keys.map { it.toMutableList() }
            lastArrDate = itemListResponse.lastArrDate
            length = itemListResponse.length
            moment = itemListResponse.moment
            name = itemListResponse.name
            netExpWt = itemListResponse.netExpWt
            notes = itemListResponse.notes
            numPalletPos = itemListResponse.numPalletPos
            origin = itemListResponse.origin
            origNetwork = itemListResponse.origNetwork
            productCode = itemListResponse.productCode
            productSys = itemListResponse.productSys
            receivingBranch = itemListResponse.receivingBranch
            receivingUnit = itemListResponse.receivingUnit
            scGenTool = itemListResponse.scGenTool
            sourceDl = itemListResponse.sourceDl
            tcn = itemListResponse.tcn
            uln = itemListResponse.uln
            values = itemListResponse.values.map { it.toMutableList() }
            volume = itemListResponse.volume
            weight = itemListResponse.weight
            weightTs = itemListResponse.weightTs
            width = itemListResponse.width
            additionalProperties = itemListResponse.additionalProperties.toMutableMap()
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
         * The tracking identifier of an item or person. May be similar in representation of a
         * barcode or UPC. If no scanCode or tracking number equivalent is available, 'NONE' should
         * be used.
         */
        fun scanCode(scanCode: String) = scanCode(JsonField.of(scanCode))

        /**
         * Sets [Builder.scanCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanCode(scanCode: JsonField<String>) = apply { this.scanCode = scanCode }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The item type of this record (e.g. EQUIPMENT, CARGO, PASSENGER). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Array of keys that may be associated to the accepting system data. The entries in this
         * array must correspond to the position index in accSysValues array. This array must be the
         * same length as accSysValues.
         */
        fun accSysKeys(accSysKeys: List<String>) = accSysKeys(JsonField.of(accSysKeys))

        /**
         * Sets [Builder.accSysKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accSysKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accSysKeys(accSysKeys: JsonField<List<String>>) = apply {
            this.accSysKeys = accSysKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [accSysKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccSysKey(accSysKey: String) = apply {
            accSysKeys =
                (accSysKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accSysKeys", it).add(accSysKey)
                }
        }

        /** Additional data required to find this item in the accepting system. */
        fun accSysNotes(accSysNotes: String) = accSysNotes(JsonField.of(accSysNotes))

        /**
         * Sets [Builder.accSysNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accSysNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accSysNotes(accSysNotes: JsonField<String>) = apply { this.accSysNotes = accSysNotes }

        /**
         * Name of the system that accepted this item from a customer. Where a user or application
         * could go look for additional information.
         */
        fun accSystem(accSystem: String) = accSystem(JsonField.of(accSystem))

        /**
         * Sets [Builder.accSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accSystem] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accSystem(accSystem: JsonField<String>) = apply { this.accSystem = accSystem }

        /**
         * Array of values for the keys that may be associated to the accepting system data. The
         * entries in this array must correspond to the position index in accSysKeys array. This
         * array must be the same length as accSysKeys.
         */
        fun accSysValues(accSysValues: List<String>) = accSysValues(JsonField.of(accSysValues))

        /**
         * Sets [Builder.accSysValues] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accSysValues] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accSysValues(accSysValues: JsonField<List<String>>) = apply {
            this.accSysValues = accSysValues.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [accSysValues].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccSysValue(accSysValue: String) = apply {
            accSysValues =
                (accSysValues ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accSysValues", it).add(accSysValue)
                }
        }

        /**
         * Flag indicating this item is planned to be airdropped. Applicable for cargo and passenger
         * item types only.
         */
        fun airdrop(airdrop: Boolean) = airdrop(JsonField.of(airdrop))

        /**
         * Sets [Builder.airdrop] to an arbitrary JSON value.
         *
         * You should usually call [Builder.airdrop] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun airdrop(airdrop: JsonField<Boolean>) = apply { this.airdrop = airdrop }

        /**
         * Name of the additional data format so downstream consuming applications can know how to
         * parse it. Typically includes the source system name and the format name.
         */
        fun altDataFormat(altDataFormat: String) = altDataFormat(JsonField.of(altDataFormat))

        /**
         * Sets [Builder.altDataFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.altDataFormat] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun altDataFormat(altDataFormat: JsonField<String>) = apply {
            this.altDataFormat = altDataFormat
        }

        /**
         * The type of cargo (e.g. PALLET, ROLLING STOCK, LOOSE, OTHER). Applicable for cargo item
         * types only.
         */
        fun cargoType(cargoType: String) = cargoType(JsonField.of(cargoType))

        /**
         * Sets [Builder.cargoType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cargoType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cargoType(cargoType: JsonField<String>) = apply { this.cargoType = cargoType }

        /**
         * How far left or right of centerline is the item in meters. Applicable for cargo and
         * passenger item types only.
         */
        fun centerlineOffset(centerlineOffset: Double) =
            centerlineOffset(JsonField.of(centerlineOffset))

        /**
         * Sets [Builder.centerlineOffset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.centerlineOffset] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun centerlineOffset(centerlineOffset: JsonField<Double>) = apply {
            this.centerlineOffset = centerlineOffset
        }

        /**
         * Center of gravity position of the item, measured from the item's front datum, in
         * centimeters.
         */
        fun cg(cg: Double) = cg(JsonField.of(cg))

        /**
         * Sets [Builder.cg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cg] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cg(cg: JsonField<Double>) = apply { this.cg = cg }

        /** The classification code of the commodity or group of commodities. */
        fun commodityCode(commodityCode: String) = commodityCode(JsonField.of(commodityCode))

        /**
         * Sets [Builder.commodityCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commodityCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commodityCode(commodityCode: JsonField<String>) = apply {
            this.commodityCode = commodityCode
        }

        /**
         * The classification system denoting the commodity code, commodityCode (e.g. AIR, WATER,
         * NMFC, UFC, STCC, DODUNQ, etc.).
         */
        fun commoditySys(commoditySys: String) = commoditySys(JsonField.of(commoditySys))

        /**
         * Sets [Builder.commoditySys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commoditySys] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commoditySys(commoditySys: JsonField<String>) = apply {
            this.commoditySys = commoditySys
        }

        /** Flag indicating this item acts as a container and contains additional items. */
        fun container(container: Boolean) = container(JsonField.of(container))

        /**
         * Sets [Builder.container] to an arbitrary JSON value.
         *
         * You should usually call [Builder.container] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun container(container: JsonField<Boolean>) = apply { this.container = container }

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

        /** The departure code or location where this item has left or is leaving. */
        fun departure(departure: String) = departure(JsonField.of(departure))

        /**
         * Sets [Builder.departure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.departure] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun departure(departure: JsonField<String>) = apply { this.departure = departure }

        /**
         * The destination of the item, typically an ICAO or port code. Applicable for cargo and
         * passenger item types only.
         */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** United States Distinguished Visitor Code, only applicable to people. */
        fun dvCode(dvCode: String) = dvCode(JsonField.of(dvCode))

        /**
         * Sets [Builder.dvCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dvCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dvCode(dvCode: JsonField<String>) = apply { this.dvCode = dvCode }

        /**
         * The fuselage station of the item measured from the reference datum, in centimeters.
         * Applicable for cargo and passenger item types only.
         */
        fun fs(fs: Double) = fs(JsonField.of(fs))

        /**
         * Sets [Builder.fs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fs] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fs(fs: JsonField<Double>) = apply { this.fs = fs }

        /** Array of UN hazard classes or division codes that apply to this item. */
        fun hazCodes(hazCodes: List<Double>) = hazCodes(JsonField.of(hazCodes))

        /**
         * Sets [Builder.hazCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hazCodes] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hazCodes(hazCodes: JsonField<List<Double>>) = apply {
            this.hazCodes = hazCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [hazCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addHazCode(hazCode: Double) = apply {
            hazCodes =
                (hazCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("hazCodes", it).add(hazCode)
                }
        }

        /** Height of the cargo in meters. Applicable for cargo item types only. */
        fun height(height: Double) = height(JsonField.of(height))

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Double>) = apply { this.height = height }

        /** The UDL ID of the air load plan this item is associated with. */
        fun idAirLoadPlan(idAirLoadPlan: String) = idAirLoadPlan(JsonField.of(idAirLoadPlan))

        /**
         * Sets [Builder.idAirLoadPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idAirLoadPlan] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idAirLoadPlan(idAirLoadPlan: JsonField<String>) = apply {
            this.idAirLoadPlan = idAirLoadPlan
        }

        /** Array of tracking identifiers that are contained within this item. */
        fun itemContains(itemContains: List<String>) = itemContains(JsonField.of(itemContains))

        /**
         * Sets [Builder.itemContains] to an arbitrary JSON value.
         *
         * You should usually call [Builder.itemContains] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun itemContains(itemContains: JsonField<List<String>>) = apply {
            this.itemContains = itemContains.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [itemContains].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addItemContain(itemContain: String) = apply {
            itemContains =
                (itemContains ?: JsonField.of(mutableListOf())).also {
                    checkKnown("itemContains", it).add(itemContain)
                }
        }

        /**
         * Array of keys that may be associated to this item. The entries in this array must
         * correspond to the position index in the values array. This array must be the same length
         * as values..
         */
        fun keys(keys: List<String>) = keys(JsonField.of(keys))

        /**
         * Sets [Builder.keys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.keys] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun keys(keys: JsonField<List<String>>) = apply {
            this.keys = keys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [keys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKey(key: String) = apply {
            keys = (keys ?: JsonField.of(mutableListOf())).also { checkKnown("keys", it).add(key) }
        }

        /**
         * The latest acceptable arrival date of the item at the destination, in ISO 8601 date-only
         * format (e.g. YYYY-MM-DD).
         */
        fun lastArrDate(lastArrDate: LocalDate) = lastArrDate(JsonField.of(lastArrDate))

        /**
         * Sets [Builder.lastArrDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastArrDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastArrDate(lastArrDate: JsonField<LocalDate>) = apply {
            this.lastArrDate = lastArrDate
        }

        /** Length of the cargo in meters. Applicable for cargo item types only. */
        fun length(length: Double) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Double>) = apply { this.length = length }

        /**
         * Moment of the item in Newton-meters. Applicable for equipment and cargo item types only.
         */
        fun moment(moment: Double) = moment(JsonField.of(moment))

        /**
         * Sets [Builder.moment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.moment] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun moment(moment: JsonField<Double>) = apply { this.moment = moment }

        /** Name of the item. Applicable for equipment and cargo item types only. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Net explosive weight of the item, in kilograms. */
        fun netExpWt(netExpWt: Double) = netExpWt(JsonField.of(netExpWt))

        /**
         * Sets [Builder.netExpWt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netExpWt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netExpWt(netExpWt: JsonField<Double>) = apply { this.netExpWt = netExpWt }

        /** Optional notes or comments about this item. */
        fun notes(notes: String) = notes(JsonField.of(notes))

        /**
         * Sets [Builder.notes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

        /**
         * Number of pallet positions or equivalent on the aircraft, ship, or conveyance equipment
         * that this item occupies.
         */
        fun numPalletPos(numPalletPos: Int) = numPalletPos(JsonField.of(numPalletPos))

        /**
         * Sets [Builder.numPalletPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numPalletPos] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numPalletPos(numPalletPos: JsonField<Int>) = apply { this.numPalletPos = numPalletPos }

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

        /** The code denoting the type of material item. */
        fun productCode(productCode: String) = productCode(JsonField.of(productCode))

        /**
         * Sets [Builder.productCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productCode(productCode: JsonField<String>) = apply { this.productCode = productCode }

        /**
         * The assigning system that denotes the type of material item, productCode (e.g.
         * NSN-national stock number, NDC-national drug code, MPN-manufacturer part number, etc.).
         */
        fun productSys(productSys: String) = productSys(JsonField.of(productSys))

        /**
         * Sets [Builder.productSys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productSys] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productSys(productSys: JsonField<String>) = apply { this.productSys = productSys }

        /** The military branch receiving this item. */
        fun receivingBranch(receivingBranch: String) =
            receivingBranch(JsonField.of(receivingBranch))

        /**
         * Sets [Builder.receivingBranch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingBranch] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingBranch(receivingBranch: JsonField<String>) = apply {
            this.receivingBranch = receivingBranch
        }

        /** The name of the unit receiving this item. */
        fun receivingUnit(receivingUnit: String) = receivingUnit(JsonField.of(receivingUnit))

        /**
         * Sets [Builder.receivingUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingUnit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun receivingUnit(receivingUnit: JsonField<String>) = apply {
            this.receivingUnit = receivingUnit
        }

        /**
         * The algorithm name or standard that generated the scanCode (e.g. UPC-A, EAN-13, GTIN,
         * SSCC, bID, JAN, etc.).
         */
        fun scGenTool(scGenTool: String) = scGenTool(JsonField.of(scGenTool))

        /**
         * Sets [Builder.scGenTool] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scGenTool] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scGenTool(scGenTool: JsonField<String>) = apply { this.scGenTool = scGenTool }

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

        /** Transportation Control Number of the cargo. Applicable for cargo item types only. */
        fun tcn(tcn: String) = tcn(JsonField.of(tcn))

        /**
         * Sets [Builder.tcn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tcn(tcn: JsonField<String>) = apply { this.tcn = tcn }

        /** The unit line number of this item. */
        fun uln(uln: String) = uln(JsonField.of(uln))

        /**
         * Sets [Builder.uln] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uln] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uln(uln: JsonField<String>) = apply { this.uln = uln }

        /**
         * Array of values for the keys that may be associated to this tracked item. The entries in
         * this array must correspond to the position index in the keys array. This array must be
         * the same length as keys.
         */
        fun values(values: List<String>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<String>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: String) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
        }

        /** The volume of the item, in cubic meters. Applicable for cargo item types only. */
        fun volume(volume: Double) = volume(JsonField.of(volume))

        /**
         * Sets [Builder.volume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.volume] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun volume(volume: JsonField<Double>) = apply { this.volume = volume }

        /** Weight of the item in kilograms (if item is a passenger, include on-person bags). */
        fun weight(weight: Double) = weight(JsonField.of(weight))

        /**
         * Sets [Builder.weight] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weight] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun weight(weight: JsonField<Double>) = apply { this.weight = weight }

        /**
         * Timestamp when the weight was taken, in ISO 8601 UTC format with millisecond precision.
         */
        fun weightTs(weightTs: OffsetDateTime) = weightTs(JsonField.of(weightTs))

        /**
         * Sets [Builder.weightTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weightTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weightTs(weightTs: JsonField<OffsetDateTime>) = apply { this.weightTs = weightTs }

        /** Width of the cargo in meters. Applicable for cargo item types only. */
        fun width(width: Double) = width(JsonField.of(width))

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Double>) = apply { this.width = width }

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
         * Returns an immutable instance of [ItemListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .scanCode()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ItemListResponse =
            ItemListResponse(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("scanCode", scanCode),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                (accSysKeys ?: JsonMissing.of()).map { it.toImmutable() },
                accSysNotes,
                accSystem,
                (accSysValues ?: JsonMissing.of()).map { it.toImmutable() },
                airdrop,
                altDataFormat,
                cargoType,
                centerlineOffset,
                cg,
                commodityCode,
                commoditySys,
                container,
                createdAt,
                createdBy,
                departure,
                destination,
                dvCode,
                fs,
                (hazCodes ?: JsonMissing.of()).map { it.toImmutable() },
                height,
                idAirLoadPlan,
                (itemContains ?: JsonMissing.of()).map { it.toImmutable() },
                (keys ?: JsonMissing.of()).map { it.toImmutable() },
                lastArrDate,
                length,
                moment,
                name,
                netExpWt,
                notes,
                numPalletPos,
                origin,
                origNetwork,
                productCode,
                productSys,
                receivingBranch,
                receivingUnit,
                scGenTool,
                sourceDl,
                tcn,
                uln,
                (values ?: JsonMissing.of()).map { it.toImmutable() },
                volume,
                weight,
                weightTs,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ItemListResponse = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        scanCode()
        source()
        type()
        id()
        accSysKeys()
        accSysNotes()
        accSystem()
        accSysValues()
        airdrop()
        altDataFormat()
        cargoType()
        centerlineOffset()
        cg()
        commodityCode()
        commoditySys()
        container()
        createdAt()
        createdBy()
        departure()
        destination()
        dvCode()
        fs()
        hazCodes()
        height()
        idAirLoadPlan()
        itemContains()
        keys()
        lastArrDate()
        length()
        moment()
        name()
        netExpWt()
        notes()
        numPalletPos()
        origin()
        origNetwork()
        productCode()
        productSys()
        receivingBranch()
        receivingUnit()
        scGenTool()
        sourceDl()
        tcn()
        uln()
        values()
        volume()
        weight()
        weightTs()
        width()
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
            (if (scanCode.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (accSysKeys.asKnown().getOrNull()?.size ?: 0) +
            (if (accSysNotes.asKnown().isPresent) 1 else 0) +
            (if (accSystem.asKnown().isPresent) 1 else 0) +
            (accSysValues.asKnown().getOrNull()?.size ?: 0) +
            (if (airdrop.asKnown().isPresent) 1 else 0) +
            (if (altDataFormat.asKnown().isPresent) 1 else 0) +
            (if (cargoType.asKnown().isPresent) 1 else 0) +
            (if (centerlineOffset.asKnown().isPresent) 1 else 0) +
            (if (cg.asKnown().isPresent) 1 else 0) +
            (if (commodityCode.asKnown().isPresent) 1 else 0) +
            (if (commoditySys.asKnown().isPresent) 1 else 0) +
            (if (container.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (departure.asKnown().isPresent) 1 else 0) +
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (dvCode.asKnown().isPresent) 1 else 0) +
            (if (fs.asKnown().isPresent) 1 else 0) +
            (hazCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (idAirLoadPlan.asKnown().isPresent) 1 else 0) +
            (itemContains.asKnown().getOrNull()?.size ?: 0) +
            (keys.asKnown().getOrNull()?.size ?: 0) +
            (if (lastArrDate.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (moment.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (netExpWt.asKnown().isPresent) 1 else 0) +
            (if (notes.asKnown().isPresent) 1 else 0) +
            (if (numPalletPos.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (productCode.asKnown().isPresent) 1 else 0) +
            (if (productSys.asKnown().isPresent) 1 else 0) +
            (if (receivingBranch.asKnown().isPresent) 1 else 0) +
            (if (receivingUnit.asKnown().isPresent) 1 else 0) +
            (if (scGenTool.asKnown().isPresent) 1 else 0) +
            (if (sourceDl.asKnown().isPresent) 1 else 0) +
            (if (tcn.asKnown().isPresent) 1 else 0) +
            (if (uln.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.size ?: 0) +
            (if (volume.asKnown().isPresent) 1 else 0) +
            (if (weight.asKnown().isPresent) 1 else 0) +
            (if (weightTs.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0)

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

        return other is ItemListResponse &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            scanCode == other.scanCode &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            accSysKeys == other.accSysKeys &&
            accSysNotes == other.accSysNotes &&
            accSystem == other.accSystem &&
            accSysValues == other.accSysValues &&
            airdrop == other.airdrop &&
            altDataFormat == other.altDataFormat &&
            cargoType == other.cargoType &&
            centerlineOffset == other.centerlineOffset &&
            cg == other.cg &&
            commodityCode == other.commodityCode &&
            commoditySys == other.commoditySys &&
            container == other.container &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            departure == other.departure &&
            destination == other.destination &&
            dvCode == other.dvCode &&
            fs == other.fs &&
            hazCodes == other.hazCodes &&
            height == other.height &&
            idAirLoadPlan == other.idAirLoadPlan &&
            itemContains == other.itemContains &&
            keys == other.keys &&
            lastArrDate == other.lastArrDate &&
            length == other.length &&
            moment == other.moment &&
            name == other.name &&
            netExpWt == other.netExpWt &&
            notes == other.notes &&
            numPalletPos == other.numPalletPos &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            productCode == other.productCode &&
            productSys == other.productSys &&
            receivingBranch == other.receivingBranch &&
            receivingUnit == other.receivingUnit &&
            scGenTool == other.scGenTool &&
            sourceDl == other.sourceDl &&
            tcn == other.tcn &&
            uln == other.uln &&
            values == other.values &&
            volume == other.volume &&
            weight == other.weight &&
            weightTs == other.weightTs &&
            width == other.width &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            scanCode,
            source,
            type,
            id,
            accSysKeys,
            accSysNotes,
            accSystem,
            accSysValues,
            airdrop,
            altDataFormat,
            cargoType,
            centerlineOffset,
            cg,
            commodityCode,
            commoditySys,
            container,
            createdAt,
            createdBy,
            departure,
            destination,
            dvCode,
            fs,
            hazCodes,
            height,
            idAirLoadPlan,
            itemContains,
            keys,
            lastArrDate,
            length,
            moment,
            name,
            netExpWt,
            notes,
            numPalletPos,
            origin,
            origNetwork,
            productCode,
            productSys,
            receivingBranch,
            receivingUnit,
            scGenTool,
            sourceDl,
            tcn,
            uln,
            values,
            volume,
            weight,
            weightTs,
            width,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemListResponse{classificationMarking=$classificationMarking, dataMode=$dataMode, scanCode=$scanCode, source=$source, type=$type, id=$id, accSysKeys=$accSysKeys, accSysNotes=$accSysNotes, accSystem=$accSystem, accSysValues=$accSysValues, airdrop=$airdrop, altDataFormat=$altDataFormat, cargoType=$cargoType, centerlineOffset=$centerlineOffset, cg=$cg, commodityCode=$commodityCode, commoditySys=$commoditySys, container=$container, createdAt=$createdAt, createdBy=$createdBy, departure=$departure, destination=$destination, dvCode=$dvCode, fs=$fs, hazCodes=$hazCodes, height=$height, idAirLoadPlan=$idAirLoadPlan, itemContains=$itemContains, keys=$keys, lastArrDate=$lastArrDate, length=$length, moment=$moment, name=$name, netExpWt=$netExpWt, notes=$notes, numPalletPos=$numPalletPos, origin=$origin, origNetwork=$origNetwork, productCode=$productCode, productSys=$productSys, receivingBranch=$receivingBranch, receivingUnit=$receivingUnit, scGenTool=$scGenTool, sourceDl=$sourceDl, tcn=$tcn, uln=$uln, values=$values, volume=$volume, weight=$weight, weightTs=$weightTs, width=$width, additionalProperties=$additionalProperties}"
}

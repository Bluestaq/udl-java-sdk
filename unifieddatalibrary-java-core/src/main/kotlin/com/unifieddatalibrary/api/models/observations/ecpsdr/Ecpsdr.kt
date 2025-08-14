// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.observations.ecpsdr

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
import com.unifieddatalibrary.api.models.OnorbitFull
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Supports Sensor Data Records (SDR) from space-borne Energetic Charged Particle (ECP) Sensors. SDR
 * contains sensor status telemetry and raw dosimeter measurements of the space environment.
 */
class Ecpsdr
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val msgTime: JsonField<OffsetDateTime>,
    private val source: JsonField<String>,
    private val type: JsonField<String>,
    private val id: JsonField<String>,
    private val asl5VCurrMon: JsonField<Int>,
    private val cdsPlateVMon: JsonField<Int>,
    private val cdsRefVMon: JsonField<Int>,
    private val cdsThreshold: JsonField<Int>,
    private val cdsThrottle: JsonField<Int>,
    private val checksum: JsonField<Int>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val dosBias: JsonField<Int>,
    private val dsl5VCurrMon: JsonField<Int>,
    private val esdTrigCountH: JsonField<Int>,
    private val esdTrigCountL: JsonField<Int>,
    private val hiLetL: JsonField<Int>,
    private val hiLetM: JsonField<Int>,
    private val idOnOrbit: JsonField<String>,
    private val idSensor: JsonField<String>,
    private val lowLetL: JsonField<Int>,
    private val lowLetM: JsonField<Int>,
    private val medLet1L: JsonField<Int>,
    private val medLet1M: JsonField<Int>,
    private val medLet2L: JsonField<Int>,
    private val medLet2M: JsonField<Int>,
    private val medLet3L: JsonField<Int>,
    private val medLet3M: JsonField<Int>,
    private val medLet4L: JsonField<Int>,
    private val medLet4M: JsonField<Int>,
    private val mpTemp: JsonField<Int>,
    private val obTime: JsonField<OffsetDateTime>,
    private val onOrbit: JsonField<OnorbitFull>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origObjectId: JsonField<String>,
    private val origSensorId: JsonField<String>,
    private val pd1SigLev: JsonField<Int>,
    private val pd2SigLev: JsonField<Int>,
    private val psTempMon: JsonField<Int>,
    private val retransmit: JsonField<Boolean>,
    private val satNo: JsonField<Int>,
    private val senMode: JsonField<String>,
    private val surfDosChargeH: JsonField<Int>,
    private val surfDosChargeL: JsonField<Int>,
    private val surfDosH: JsonField<Int>,
    private val surfDosL: JsonField<Int>,
    private val surfDosM: JsonField<Int>,
    private val surfDosStat: JsonField<Int>,
    private val transientData: JsonField<List<Int>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val vRef: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("msgTime")
        @ExcludeMissing
        msgTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("asl5VCurrMon")
        @ExcludeMissing
        asl5VCurrMon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cdsPlateVMon")
        @ExcludeMissing
        cdsPlateVMon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cdsRefVMon") @ExcludeMissing cdsRefVMon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cdsThreshold")
        @ExcludeMissing
        cdsThreshold: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cdsThrottle") @ExcludeMissing cdsThrottle: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("checksum") @ExcludeMissing checksum: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dosBias") @ExcludeMissing dosBias: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("dsl5VCurrMon")
        @ExcludeMissing
        dsl5VCurrMon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("esdTrigCountH")
        @ExcludeMissing
        esdTrigCountH: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("esdTrigCountL")
        @ExcludeMissing
        esdTrigCountL: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hiLetL") @ExcludeMissing hiLetL: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("hiLetM") @ExcludeMissing hiLetM: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("idOnOrbit") @ExcludeMissing idOnOrbit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idSensor") @ExcludeMissing idSensor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lowLetL") @ExcludeMissing lowLetL: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("lowLetM") @ExcludeMissing lowLetM: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet1L") @ExcludeMissing medLet1L: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet1M") @ExcludeMissing medLet1M: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet2L") @ExcludeMissing medLet2L: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet2M") @ExcludeMissing medLet2M: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet3L") @ExcludeMissing medLet3L: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet3M") @ExcludeMissing medLet3M: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet4L") @ExcludeMissing medLet4L: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("medLet4M") @ExcludeMissing medLet4M: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("mpTemp") @ExcludeMissing mpTemp: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("obTime")
        @ExcludeMissing
        obTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("onOrbit") @ExcludeMissing onOrbit: JsonField<OnorbitFull> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origObjectId")
        @ExcludeMissing
        origObjectId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origSensorId")
        @ExcludeMissing
        origSensorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pd1SigLev") @ExcludeMissing pd1SigLev: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("pd2SigLev") @ExcludeMissing pd2SigLev: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("psTempMon") @ExcludeMissing psTempMon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("retransmit")
        @ExcludeMissing
        retransmit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("satNo") @ExcludeMissing satNo: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("senMode") @ExcludeMissing senMode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("surfDosChargeH")
        @ExcludeMissing
        surfDosChargeH: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("surfDosChargeL")
        @ExcludeMissing
        surfDosChargeL: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("surfDosH") @ExcludeMissing surfDosH: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("surfDosL") @ExcludeMissing surfDosL: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("surfDosM") @ExcludeMissing surfDosM: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("surfDosStat") @ExcludeMissing surfDosStat: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("transientData")
        @ExcludeMissing
        transientData: JsonField<List<Int>> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vRef") @ExcludeMissing vRef: JsonField<Int> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        msgTime,
        source,
        type,
        id,
        asl5VCurrMon,
        cdsPlateVMon,
        cdsRefVMon,
        cdsThreshold,
        cdsThrottle,
        checksum,
        createdAt,
        createdBy,
        dosBias,
        dsl5VCurrMon,
        esdTrigCountH,
        esdTrigCountL,
        hiLetL,
        hiLetM,
        idOnOrbit,
        idSensor,
        lowLetL,
        lowLetM,
        medLet1L,
        medLet1M,
        medLet2L,
        medLet2M,
        medLet3L,
        medLet3M,
        medLet4L,
        medLet4M,
        mpTemp,
        obTime,
        onOrbit,
        origin,
        origNetwork,
        origObjectId,
        origSensorId,
        pd1SigLev,
        pd2SigLev,
        psTempMon,
        retransmit,
        satNo,
        senMode,
        surfDosChargeH,
        surfDosChargeL,
        surfDosH,
        surfDosL,
        surfDosM,
        surfDosStat,
        transientData,
        updatedAt,
        updatedBy,
        vRef,
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
     * Time stamp of time packet receipt on ground, in ISO 8601 UTC format with millisecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun msgTime(): OffsetDateTime = msgTime.getRequired("msgTime")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * The type of data associated with this record (STANDARD, TRANSIENT).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * Unique identifier of the record, auto-generated by the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Internal 5V current monitor for analog supply line. This is sensor status telemetry. See vRef
     * for conversion factor to Volts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun asl5VCurrMon(): Optional<Int> = asl5VCurrMon.getOptional("asl5VCurrMon")

    /**
     * CDS Charge Plate voltage monitor. See vRef for conversion factor to Volts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cdsPlateVMon(): Optional<Int> = cdsPlateVMon.getOptional("cdsPlateVMon")

    /**
     * CDS reference voltage monitor. See vRef for conversion factor to Volts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cdsRefVMon(): Optional<Int> = cdsRefVMon.getOptional("cdsRefVMon")

    /**
     * CDS Threshold setting for ESD detection threshold. The CDS Threshold is the adjustable
     * sensitivity of recording/digitizing an ESD as a transient packet.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cdsThreshold(): Optional<Int> = cdsThreshold.getOptional("cdsThreshold")

    /**
     * CDS throttle number of seconds between CDS transient capture readouts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cdsThrottle(): Optional<Int> = cdsThrottle.getOptional("cdsThrottle")

    /**
     * Two byte CRC-16-CCITT checksum (ordered as first byte, second byte).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun checksum(): Optional<Int> = checksum.getOptional("checksum")

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
     * Unitless dosimeter detector bias for MedLET and HiLET. MedLET (Linear Energy Transfer) and
     * HiLET subsensors detect particles above LET thresholds, 300keV and 1MeV, respectively.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dosBias(): Optional<Int> = dosBias.getOptional("dosBias")

    /**
     * Internal 5V current monitor for digital supply line. This is sensor status telemetry. See
     * vRef for conversion factor to Volts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dsl5VCurrMon(): Optional<Int> = dsl5VCurrMon.getOptional("dsl5VCurrMon")

    /**
     * Number of ESD triggers, high byte of 2-byte counter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun esdTrigCountH(): Optional<Int> = esdTrigCountH.getOptional("esdTrigCountH")

    /**
     * Number of ESD triggers, low byte of 2-byte counter.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun esdTrigCountL(): Optional<Int> = esdTrigCountL.getOptional("esdTrigCountL")

    /**
     * HiLET dosimeter low range output. Low byte of scaler (HiLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hiLetL(): Optional<Int> = hiLetL.getOptional("hiLetL")

    /**
     * Unitless HiLET dosimeter medium range output. Medium byte of (HiLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hiLetM(): Optional<Int> = hiLetM.getOptional("hiLetM")

    /**
     * Unique identifier of the on-orbit satellite hosting the sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idOnOrbit(): Optional<String> = idOnOrbit.getOptional("idOnOrbit")

    /**
     * Unique identifier of the reporting sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idSensor(): Optional<String> = idSensor.getOptional("idSensor")

    /**
     * LowLET dosimeter low range output. Low byte of (LowLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lowLetL(): Optional<Int> = lowLetL.getOptional("lowLetL")

    /**
     * LowLET dosimeter medium range output. Medium byte of (LowLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lowLetM(): Optional<Int> = lowLetM.getOptional("lowLetM")

    /**
     * MedLET1 dosimeter low range output. Low byte of the 1st (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet1L(): Optional<Int> = medLet1L.getOptional("medLet1L")

    /**
     * MedLET1 dosimeter medium range output. Medium byte of the 1st (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet1M(): Optional<Int> = medLet1M.getOptional("medLet1M")

    /**
     * MedLET2 dosimeter low range output. Low byte of the 2nd (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet2L(): Optional<Int> = medLet2L.getOptional("medLet2L")

    /**
     * MedLET2 dosimeter medium range output. Medium byte of the 2nd (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet2M(): Optional<Int> = medLet2M.getOptional("medLet2M")

    /**
     * MedLET3 dosimeter low range output. Low byte of the 3rd (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet3L(): Optional<Int> = medLet3L.getOptional("medLet3L")

    /**
     * MedLET3 dosimeter medium range output. Medium byte of the 3rd (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet3M(): Optional<Int> = medLet3M.getOptional("medLet3M")

    /**
     * MedLET4 dosimeter low range output. Low byte of the 4th (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet4L(): Optional<Int> = medLet4L.getOptional("medLet4L")

    /**
     * MedLET4 dosimeter medium range output. Medium byte of the 4th (MedLET) dosimeter output.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun medLet4M(): Optional<Int> = medLet4M.getOptional("medLet4M")

    /**
     * Unitless sensor mounting plate temperature.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mpTemp(): Optional<Int> = mpTemp.getOptional("mpTemp")

    /**
     * Time of the observation, in ISO 8601 UTC format with millisecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun obTime(): Optional<OffsetDateTime> = obTime.getOptional("obTime")

    /**
     * Model object representing on-orbit objects or satellites in the system.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun onOrbit(): Optional<OnorbitFull> = onOrbit.getOptional("onOrbit")

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
     * Optional identifier provided by the record source to indicate the satellite hosting the
     * sensor. This may be an internal identifier and not necessarily map to a valid satellite
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origObjectId(): Optional<String> = origObjectId.getOptional("origObjectId")

    /**
     * Optional identifier provided by the record source to indicate the sensor identifier which
     * produced this data. This may be an internal identifier and not necessarily a valid sensor ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origSensorId(): Optional<String> = origSensorId.getOptional("origSensorId")

    /**
     * Photodiode 1 signal level.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pd1SigLev(): Optional<Int> = pd1SigLev.getOptional("pd1SigLev")

    /**
     * Photodiode 2 signal level.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pd2SigLev(): Optional<Int> = pd2SigLev.getOptional("pd2SigLev")

    /**
     * Power supply temperature monitor. This is sensor status telemetry.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun psTempMon(): Optional<Int> = psTempMon.getOptional("psTempMon")

    /**
     * Flag indicating whether this record is an original or re-transmitted dataset (TRUE indicates
     * a retransmit from the host).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun retransmit(): Optional<Boolean> = retransmit.getOptional("retransmit")

    /**
     * Satellite/catalog number of the on-orbit satellite hosting the sensor.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun satNo(): Optional<Int> = satNo.getOptional("satNo")

    /**
     * The sensor mode associated with this measurements (NORMAL, TEST).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun senMode(): Optional<String> = senMode.getOptional("senMode")

    /**
     * Surface dosimeter charge rate high output (converts to pico-amps/bit). High byte of 2 bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfDosChargeH(): Optional<Int> = surfDosChargeH.getOptional("surfDosChargeH")

    /**
     * Surface dosimeter charge rate low output (converts to pico-amps/bit). Low byte of 2 bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfDosChargeL(): Optional<Int> = surfDosChargeL.getOptional("surfDosChargeL")

    /**
     * Surface dosimeter high range output (converts to pico-coulombs/bit). High byte of 3 bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfDosH(): Optional<Int> = surfDosH.getOptional("surfDosH")

    /**
     * Surface dosimeter low range output (converts to pico-coulombs/bit). Low byte of 3 bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfDosL(): Optional<Int> = surfDosL.getOptional("surfDosL")

    /**
     * Surface dosimeter medium range output (converts to pico-coulombs/bit). Middle byte of 3
     * bytes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfDosM(): Optional<Int> = surfDosM.getOptional("surfDosM")

    /**
     * Surface dosimeter status byte.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun surfDosStat(): Optional<Int> = surfDosStat.getOptional("surfDosStat")

    /**
     * Array of 144 digitized samples of ESD waveform for transient packets.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun transientData(): Optional<List<Int>> = transientData.getOptional("transientData")

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
     * Reference voltage (volts/bit). Conversion factor used to convert analog V monitor data from
     * bytes to volts.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vRef(): Optional<Int> = vRef.getOptional("vRef")

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
     * Returns the raw JSON value of [msgTime].
     *
     * Unlike [msgTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgTime") @ExcludeMissing fun _msgTime(): JsonField<OffsetDateTime> = msgTime

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
     * Returns the raw JSON value of [asl5VCurrMon].
     *
     * Unlike [asl5VCurrMon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asl5VCurrMon") @ExcludeMissing fun _asl5VCurrMon(): JsonField<Int> = asl5VCurrMon

    /**
     * Returns the raw JSON value of [cdsPlateVMon].
     *
     * Unlike [cdsPlateVMon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cdsPlateVMon") @ExcludeMissing fun _cdsPlateVMon(): JsonField<Int> = cdsPlateVMon

    /**
     * Returns the raw JSON value of [cdsRefVMon].
     *
     * Unlike [cdsRefVMon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cdsRefVMon") @ExcludeMissing fun _cdsRefVMon(): JsonField<Int> = cdsRefVMon

    /**
     * Returns the raw JSON value of [cdsThreshold].
     *
     * Unlike [cdsThreshold], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cdsThreshold") @ExcludeMissing fun _cdsThreshold(): JsonField<Int> = cdsThreshold

    /**
     * Returns the raw JSON value of [cdsThrottle].
     *
     * Unlike [cdsThrottle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cdsThrottle") @ExcludeMissing fun _cdsThrottle(): JsonField<Int> = cdsThrottle

    /**
     * Returns the raw JSON value of [checksum].
     *
     * Unlike [checksum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checksum") @ExcludeMissing fun _checksum(): JsonField<Int> = checksum

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
     * Returns the raw JSON value of [dosBias].
     *
     * Unlike [dosBias], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dosBias") @ExcludeMissing fun _dosBias(): JsonField<Int> = dosBias

    /**
     * Returns the raw JSON value of [dsl5VCurrMon].
     *
     * Unlike [dsl5VCurrMon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dsl5VCurrMon") @ExcludeMissing fun _dsl5VCurrMon(): JsonField<Int> = dsl5VCurrMon

    /**
     * Returns the raw JSON value of [esdTrigCountH].
     *
     * Unlike [esdTrigCountH], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("esdTrigCountH")
    @ExcludeMissing
    fun _esdTrigCountH(): JsonField<Int> = esdTrigCountH

    /**
     * Returns the raw JSON value of [esdTrigCountL].
     *
     * Unlike [esdTrigCountL], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("esdTrigCountL")
    @ExcludeMissing
    fun _esdTrigCountL(): JsonField<Int> = esdTrigCountL

    /**
     * Returns the raw JSON value of [hiLetL].
     *
     * Unlike [hiLetL], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hiLetL") @ExcludeMissing fun _hiLetL(): JsonField<Int> = hiLetL

    /**
     * Returns the raw JSON value of [hiLetM].
     *
     * Unlike [hiLetM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hiLetM") @ExcludeMissing fun _hiLetM(): JsonField<Int> = hiLetM

    /**
     * Returns the raw JSON value of [idOnOrbit].
     *
     * Unlike [idOnOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idOnOrbit") @ExcludeMissing fun _idOnOrbit(): JsonField<String> = idOnOrbit

    /**
     * Returns the raw JSON value of [idSensor].
     *
     * Unlike [idSensor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idSensor") @ExcludeMissing fun _idSensor(): JsonField<String> = idSensor

    /**
     * Returns the raw JSON value of [lowLetL].
     *
     * Unlike [lowLetL], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowLetL") @ExcludeMissing fun _lowLetL(): JsonField<Int> = lowLetL

    /**
     * Returns the raw JSON value of [lowLetM].
     *
     * Unlike [lowLetM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowLetM") @ExcludeMissing fun _lowLetM(): JsonField<Int> = lowLetM

    /**
     * Returns the raw JSON value of [medLet1L].
     *
     * Unlike [medLet1L], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet1L") @ExcludeMissing fun _medLet1L(): JsonField<Int> = medLet1L

    /**
     * Returns the raw JSON value of [medLet1M].
     *
     * Unlike [medLet1M], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet1M") @ExcludeMissing fun _medLet1M(): JsonField<Int> = medLet1M

    /**
     * Returns the raw JSON value of [medLet2L].
     *
     * Unlike [medLet2L], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet2L") @ExcludeMissing fun _medLet2L(): JsonField<Int> = medLet2L

    /**
     * Returns the raw JSON value of [medLet2M].
     *
     * Unlike [medLet2M], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet2M") @ExcludeMissing fun _medLet2M(): JsonField<Int> = medLet2M

    /**
     * Returns the raw JSON value of [medLet3L].
     *
     * Unlike [medLet3L], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet3L") @ExcludeMissing fun _medLet3L(): JsonField<Int> = medLet3L

    /**
     * Returns the raw JSON value of [medLet3M].
     *
     * Unlike [medLet3M], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet3M") @ExcludeMissing fun _medLet3M(): JsonField<Int> = medLet3M

    /**
     * Returns the raw JSON value of [medLet4L].
     *
     * Unlike [medLet4L], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet4L") @ExcludeMissing fun _medLet4L(): JsonField<Int> = medLet4L

    /**
     * Returns the raw JSON value of [medLet4M].
     *
     * Unlike [medLet4M], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("medLet4M") @ExcludeMissing fun _medLet4M(): JsonField<Int> = medLet4M

    /**
     * Returns the raw JSON value of [mpTemp].
     *
     * Unlike [mpTemp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mpTemp") @ExcludeMissing fun _mpTemp(): JsonField<Int> = mpTemp

    /**
     * Returns the raw JSON value of [obTime].
     *
     * Unlike [obTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obTime") @ExcludeMissing fun _obTime(): JsonField<OffsetDateTime> = obTime

    /**
     * Returns the raw JSON value of [onOrbit].
     *
     * Unlike [onOrbit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("onOrbit") @ExcludeMissing fun _onOrbit(): JsonField<OnorbitFull> = onOrbit

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
     * Returns the raw JSON value of [origObjectId].
     *
     * Unlike [origObjectId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origObjectId")
    @ExcludeMissing
    fun _origObjectId(): JsonField<String> = origObjectId

    /**
     * Returns the raw JSON value of [origSensorId].
     *
     * Unlike [origSensorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origSensorId")
    @ExcludeMissing
    fun _origSensorId(): JsonField<String> = origSensorId

    /**
     * Returns the raw JSON value of [pd1SigLev].
     *
     * Unlike [pd1SigLev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pd1SigLev") @ExcludeMissing fun _pd1SigLev(): JsonField<Int> = pd1SigLev

    /**
     * Returns the raw JSON value of [pd2SigLev].
     *
     * Unlike [pd2SigLev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pd2SigLev") @ExcludeMissing fun _pd2SigLev(): JsonField<Int> = pd2SigLev

    /**
     * Returns the raw JSON value of [psTempMon].
     *
     * Unlike [psTempMon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("psTempMon") @ExcludeMissing fun _psTempMon(): JsonField<Int> = psTempMon

    /**
     * Returns the raw JSON value of [retransmit].
     *
     * Unlike [retransmit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("retransmit") @ExcludeMissing fun _retransmit(): JsonField<Boolean> = retransmit

    /**
     * Returns the raw JSON value of [satNo].
     *
     * Unlike [satNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("satNo") @ExcludeMissing fun _satNo(): JsonField<Int> = satNo

    /**
     * Returns the raw JSON value of [senMode].
     *
     * Unlike [senMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("senMode") @ExcludeMissing fun _senMode(): JsonField<String> = senMode

    /**
     * Returns the raw JSON value of [surfDosChargeH].
     *
     * Unlike [surfDosChargeH], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surfDosChargeH")
    @ExcludeMissing
    fun _surfDosChargeH(): JsonField<Int> = surfDosChargeH

    /**
     * Returns the raw JSON value of [surfDosChargeL].
     *
     * Unlike [surfDosChargeL], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surfDosChargeL")
    @ExcludeMissing
    fun _surfDosChargeL(): JsonField<Int> = surfDosChargeL

    /**
     * Returns the raw JSON value of [surfDosH].
     *
     * Unlike [surfDosH], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surfDosH") @ExcludeMissing fun _surfDosH(): JsonField<Int> = surfDosH

    /**
     * Returns the raw JSON value of [surfDosL].
     *
     * Unlike [surfDosL], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surfDosL") @ExcludeMissing fun _surfDosL(): JsonField<Int> = surfDosL

    /**
     * Returns the raw JSON value of [surfDosM].
     *
     * Unlike [surfDosM], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surfDosM") @ExcludeMissing fun _surfDosM(): JsonField<Int> = surfDosM

    /**
     * Returns the raw JSON value of [surfDosStat].
     *
     * Unlike [surfDosStat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("surfDosStat") @ExcludeMissing fun _surfDosStat(): JsonField<Int> = surfDosStat

    /**
     * Returns the raw JSON value of [transientData].
     *
     * Unlike [transientData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transientData")
    @ExcludeMissing
    fun _transientData(): JsonField<List<Int>> = transientData

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
     * Returns the raw JSON value of [vRef].
     *
     * Unlike [vRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vRef") @ExcludeMissing fun _vRef(): JsonField<Int> = vRef

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
         * Returns a mutable builder for constructing an instance of [Ecpsdr].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .msgTime()
         * .source()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Ecpsdr]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var msgTime: JsonField<OffsetDateTime>? = null
        private var source: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var asl5VCurrMon: JsonField<Int> = JsonMissing.of()
        private var cdsPlateVMon: JsonField<Int> = JsonMissing.of()
        private var cdsRefVMon: JsonField<Int> = JsonMissing.of()
        private var cdsThreshold: JsonField<Int> = JsonMissing.of()
        private var cdsThrottle: JsonField<Int> = JsonMissing.of()
        private var checksum: JsonField<Int> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dosBias: JsonField<Int> = JsonMissing.of()
        private var dsl5VCurrMon: JsonField<Int> = JsonMissing.of()
        private var esdTrigCountH: JsonField<Int> = JsonMissing.of()
        private var esdTrigCountL: JsonField<Int> = JsonMissing.of()
        private var hiLetL: JsonField<Int> = JsonMissing.of()
        private var hiLetM: JsonField<Int> = JsonMissing.of()
        private var idOnOrbit: JsonField<String> = JsonMissing.of()
        private var idSensor: JsonField<String> = JsonMissing.of()
        private var lowLetL: JsonField<Int> = JsonMissing.of()
        private var lowLetM: JsonField<Int> = JsonMissing.of()
        private var medLet1L: JsonField<Int> = JsonMissing.of()
        private var medLet1M: JsonField<Int> = JsonMissing.of()
        private var medLet2L: JsonField<Int> = JsonMissing.of()
        private var medLet2M: JsonField<Int> = JsonMissing.of()
        private var medLet3L: JsonField<Int> = JsonMissing.of()
        private var medLet3M: JsonField<Int> = JsonMissing.of()
        private var medLet4L: JsonField<Int> = JsonMissing.of()
        private var medLet4M: JsonField<Int> = JsonMissing.of()
        private var mpTemp: JsonField<Int> = JsonMissing.of()
        private var obTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var onOrbit: JsonField<OnorbitFull> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origObjectId: JsonField<String> = JsonMissing.of()
        private var origSensorId: JsonField<String> = JsonMissing.of()
        private var pd1SigLev: JsonField<Int> = JsonMissing.of()
        private var pd2SigLev: JsonField<Int> = JsonMissing.of()
        private var psTempMon: JsonField<Int> = JsonMissing.of()
        private var retransmit: JsonField<Boolean> = JsonMissing.of()
        private var satNo: JsonField<Int> = JsonMissing.of()
        private var senMode: JsonField<String> = JsonMissing.of()
        private var surfDosChargeH: JsonField<Int> = JsonMissing.of()
        private var surfDosChargeL: JsonField<Int> = JsonMissing.of()
        private var surfDosH: JsonField<Int> = JsonMissing.of()
        private var surfDosL: JsonField<Int> = JsonMissing.of()
        private var surfDosM: JsonField<Int> = JsonMissing.of()
        private var surfDosStat: JsonField<Int> = JsonMissing.of()
        private var transientData: JsonField<MutableList<Int>>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vRef: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ecpsdr: Ecpsdr) = apply {
            classificationMarking = ecpsdr.classificationMarking
            dataMode = ecpsdr.dataMode
            msgTime = ecpsdr.msgTime
            source = ecpsdr.source
            type = ecpsdr.type
            id = ecpsdr.id
            asl5VCurrMon = ecpsdr.asl5VCurrMon
            cdsPlateVMon = ecpsdr.cdsPlateVMon
            cdsRefVMon = ecpsdr.cdsRefVMon
            cdsThreshold = ecpsdr.cdsThreshold
            cdsThrottle = ecpsdr.cdsThrottle
            checksum = ecpsdr.checksum
            createdAt = ecpsdr.createdAt
            createdBy = ecpsdr.createdBy
            dosBias = ecpsdr.dosBias
            dsl5VCurrMon = ecpsdr.dsl5VCurrMon
            esdTrigCountH = ecpsdr.esdTrigCountH
            esdTrigCountL = ecpsdr.esdTrigCountL
            hiLetL = ecpsdr.hiLetL
            hiLetM = ecpsdr.hiLetM
            idOnOrbit = ecpsdr.idOnOrbit
            idSensor = ecpsdr.idSensor
            lowLetL = ecpsdr.lowLetL
            lowLetM = ecpsdr.lowLetM
            medLet1L = ecpsdr.medLet1L
            medLet1M = ecpsdr.medLet1M
            medLet2L = ecpsdr.medLet2L
            medLet2M = ecpsdr.medLet2M
            medLet3L = ecpsdr.medLet3L
            medLet3M = ecpsdr.medLet3M
            medLet4L = ecpsdr.medLet4L
            medLet4M = ecpsdr.medLet4M
            mpTemp = ecpsdr.mpTemp
            obTime = ecpsdr.obTime
            onOrbit = ecpsdr.onOrbit
            origin = ecpsdr.origin
            origNetwork = ecpsdr.origNetwork
            origObjectId = ecpsdr.origObjectId
            origSensorId = ecpsdr.origSensorId
            pd1SigLev = ecpsdr.pd1SigLev
            pd2SigLev = ecpsdr.pd2SigLev
            psTempMon = ecpsdr.psTempMon
            retransmit = ecpsdr.retransmit
            satNo = ecpsdr.satNo
            senMode = ecpsdr.senMode
            surfDosChargeH = ecpsdr.surfDosChargeH
            surfDosChargeL = ecpsdr.surfDosChargeL
            surfDosH = ecpsdr.surfDosH
            surfDosL = ecpsdr.surfDosL
            surfDosM = ecpsdr.surfDosM
            surfDosStat = ecpsdr.surfDosStat
            transientData = ecpsdr.transientData.map { it.toMutableList() }
            updatedAt = ecpsdr.updatedAt
            updatedBy = ecpsdr.updatedBy
            vRef = ecpsdr.vRef
            additionalProperties = ecpsdr.additionalProperties.toMutableMap()
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
         * Time stamp of time packet receipt on ground, in ISO 8601 UTC format with millisecond
         * precision.
         */
        fun msgTime(msgTime: OffsetDateTime) = msgTime(JsonField.of(msgTime))

        /**
         * Sets [Builder.msgTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun msgTime(msgTime: JsonField<OffsetDateTime>) = apply { this.msgTime = msgTime }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** The type of data associated with this record (STANDARD, TRANSIENT). */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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
         * Internal 5V current monitor for analog supply line. This is sensor status telemetry. See
         * vRef for conversion factor to Volts.
         */
        fun asl5VCurrMon(asl5VCurrMon: Int) = asl5VCurrMon(JsonField.of(asl5VCurrMon))

        /**
         * Sets [Builder.asl5VCurrMon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asl5VCurrMon] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asl5VCurrMon(asl5VCurrMon: JsonField<Int>) = apply { this.asl5VCurrMon = asl5VCurrMon }

        /** CDS Charge Plate voltage monitor. See vRef for conversion factor to Volts. */
        fun cdsPlateVMon(cdsPlateVMon: Int) = cdsPlateVMon(JsonField.of(cdsPlateVMon))

        /**
         * Sets [Builder.cdsPlateVMon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cdsPlateVMon] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cdsPlateVMon(cdsPlateVMon: JsonField<Int>) = apply { this.cdsPlateVMon = cdsPlateVMon }

        /** CDS reference voltage monitor. See vRef for conversion factor to Volts. */
        fun cdsRefVMon(cdsRefVMon: Int) = cdsRefVMon(JsonField.of(cdsRefVMon))

        /**
         * Sets [Builder.cdsRefVMon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cdsRefVMon] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cdsRefVMon(cdsRefVMon: JsonField<Int>) = apply { this.cdsRefVMon = cdsRefVMon }

        /**
         * CDS Threshold setting for ESD detection threshold. The CDS Threshold is the adjustable
         * sensitivity of recording/digitizing an ESD as a transient packet.
         */
        fun cdsThreshold(cdsThreshold: Int) = cdsThreshold(JsonField.of(cdsThreshold))

        /**
         * Sets [Builder.cdsThreshold] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cdsThreshold] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cdsThreshold(cdsThreshold: JsonField<Int>) = apply { this.cdsThreshold = cdsThreshold }

        /** CDS throttle number of seconds between CDS transient capture readouts. */
        fun cdsThrottle(cdsThrottle: Int) = cdsThrottle(JsonField.of(cdsThrottle))

        /**
         * Sets [Builder.cdsThrottle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cdsThrottle] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cdsThrottle(cdsThrottle: JsonField<Int>) = apply { this.cdsThrottle = cdsThrottle }

        /** Two byte CRC-16-CCITT checksum (ordered as first byte, second byte). */
        fun checksum(checksum: Int) = checksum(JsonField.of(checksum))

        /**
         * Sets [Builder.checksum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checksum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun checksum(checksum: JsonField<Int>) = apply { this.checksum = checksum }

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
         * Unitless dosimeter detector bias for MedLET and HiLET. MedLET (Linear Energy Transfer)
         * and HiLET subsensors detect particles above LET thresholds, 300keV and 1MeV,
         * respectively.
         */
        fun dosBias(dosBias: Int) = dosBias(JsonField.of(dosBias))

        /**
         * Sets [Builder.dosBias] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dosBias] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dosBias(dosBias: JsonField<Int>) = apply { this.dosBias = dosBias }

        /**
         * Internal 5V current monitor for digital supply line. This is sensor status telemetry. See
         * vRef for conversion factor to Volts.
         */
        fun dsl5VCurrMon(dsl5VCurrMon: Int) = dsl5VCurrMon(JsonField.of(dsl5VCurrMon))

        /**
         * Sets [Builder.dsl5VCurrMon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dsl5VCurrMon] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dsl5VCurrMon(dsl5VCurrMon: JsonField<Int>) = apply { this.dsl5VCurrMon = dsl5VCurrMon }

        /** Number of ESD triggers, high byte of 2-byte counter. */
        fun esdTrigCountH(esdTrigCountH: Int) = esdTrigCountH(JsonField.of(esdTrigCountH))

        /**
         * Sets [Builder.esdTrigCountH] to an arbitrary JSON value.
         *
         * You should usually call [Builder.esdTrigCountH] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun esdTrigCountH(esdTrigCountH: JsonField<Int>) = apply {
            this.esdTrigCountH = esdTrigCountH
        }

        /** Number of ESD triggers, low byte of 2-byte counter. */
        fun esdTrigCountL(esdTrigCountL: Int) = esdTrigCountL(JsonField.of(esdTrigCountL))

        /**
         * Sets [Builder.esdTrigCountL] to an arbitrary JSON value.
         *
         * You should usually call [Builder.esdTrigCountL] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun esdTrigCountL(esdTrigCountL: JsonField<Int>) = apply {
            this.esdTrigCountL = esdTrigCountL
        }

        /** HiLET dosimeter low range output. Low byte of scaler (HiLET) dosimeter output. */
        fun hiLetL(hiLetL: Int) = hiLetL(JsonField.of(hiLetL))

        /**
         * Sets [Builder.hiLetL] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hiLetL] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hiLetL(hiLetL: JsonField<Int>) = apply { this.hiLetL = hiLetL }

        /**
         * Unitless HiLET dosimeter medium range output. Medium byte of (HiLET) dosimeter output.
         */
        fun hiLetM(hiLetM: Int) = hiLetM(JsonField.of(hiLetM))

        /**
         * Sets [Builder.hiLetM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hiLetM] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hiLetM(hiLetM: JsonField<Int>) = apply { this.hiLetM = hiLetM }

        /** Unique identifier of the on-orbit satellite hosting the sensor. */
        fun idOnOrbit(idOnOrbit: String) = idOnOrbit(JsonField.of(idOnOrbit))

        /**
         * Sets [Builder.idOnOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idOnOrbit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idOnOrbit(idOnOrbit: JsonField<String>) = apply { this.idOnOrbit = idOnOrbit }

        /** Unique identifier of the reporting sensor. */
        fun idSensor(idSensor: String) = idSensor(JsonField.of(idSensor))

        /**
         * Sets [Builder.idSensor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idSensor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idSensor(idSensor: JsonField<String>) = apply { this.idSensor = idSensor }

        /** LowLET dosimeter low range output. Low byte of (LowLET) dosimeter output. */
        fun lowLetL(lowLetL: Int) = lowLetL(JsonField.of(lowLetL))

        /**
         * Sets [Builder.lowLetL] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowLetL] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lowLetL(lowLetL: JsonField<Int>) = apply { this.lowLetL = lowLetL }

        /** LowLET dosimeter medium range output. Medium byte of (LowLET) dosimeter output. */
        fun lowLetM(lowLetM: Int) = lowLetM(JsonField.of(lowLetM))

        /**
         * Sets [Builder.lowLetM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowLetM] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lowLetM(lowLetM: JsonField<Int>) = apply { this.lowLetM = lowLetM }

        /** MedLET1 dosimeter low range output. Low byte of the 1st (MedLET) dosimeter output. */
        fun medLet1L(medLet1L: Int) = medLet1L(JsonField.of(medLet1L))

        /**
         * Sets [Builder.medLet1L] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet1L] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet1L(medLet1L: JsonField<Int>) = apply { this.medLet1L = medLet1L }

        /**
         * MedLET1 dosimeter medium range output. Medium byte of the 1st (MedLET) dosimeter output.
         */
        fun medLet1M(medLet1M: Int) = medLet1M(JsonField.of(medLet1M))

        /**
         * Sets [Builder.medLet1M] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet1M] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet1M(medLet1M: JsonField<Int>) = apply { this.medLet1M = medLet1M }

        /** MedLET2 dosimeter low range output. Low byte of the 2nd (MedLET) dosimeter output. */
        fun medLet2L(medLet2L: Int) = medLet2L(JsonField.of(medLet2L))

        /**
         * Sets [Builder.medLet2L] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet2L] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet2L(medLet2L: JsonField<Int>) = apply { this.medLet2L = medLet2L }

        /**
         * MedLET2 dosimeter medium range output. Medium byte of the 2nd (MedLET) dosimeter output.
         */
        fun medLet2M(medLet2M: Int) = medLet2M(JsonField.of(medLet2M))

        /**
         * Sets [Builder.medLet2M] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet2M] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet2M(medLet2M: JsonField<Int>) = apply { this.medLet2M = medLet2M }

        /** MedLET3 dosimeter low range output. Low byte of the 3rd (MedLET) dosimeter output. */
        fun medLet3L(medLet3L: Int) = medLet3L(JsonField.of(medLet3L))

        /**
         * Sets [Builder.medLet3L] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet3L] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet3L(medLet3L: JsonField<Int>) = apply { this.medLet3L = medLet3L }

        /**
         * MedLET3 dosimeter medium range output. Medium byte of the 3rd (MedLET) dosimeter output.
         */
        fun medLet3M(medLet3M: Int) = medLet3M(JsonField.of(medLet3M))

        /**
         * Sets [Builder.medLet3M] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet3M] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet3M(medLet3M: JsonField<Int>) = apply { this.medLet3M = medLet3M }

        /** MedLET4 dosimeter low range output. Low byte of the 4th (MedLET) dosimeter output. */
        fun medLet4L(medLet4L: Int) = medLet4L(JsonField.of(medLet4L))

        /**
         * Sets [Builder.medLet4L] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet4L] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet4L(medLet4L: JsonField<Int>) = apply { this.medLet4L = medLet4L }

        /**
         * MedLET4 dosimeter medium range output. Medium byte of the 4th (MedLET) dosimeter output.
         */
        fun medLet4M(medLet4M: Int) = medLet4M(JsonField.of(medLet4M))

        /**
         * Sets [Builder.medLet4M] to an arbitrary JSON value.
         *
         * You should usually call [Builder.medLet4M] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun medLet4M(medLet4M: JsonField<Int>) = apply { this.medLet4M = medLet4M }

        /** Unitless sensor mounting plate temperature. */
        fun mpTemp(mpTemp: Int) = mpTemp(JsonField.of(mpTemp))

        /**
         * Sets [Builder.mpTemp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mpTemp] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mpTemp(mpTemp: JsonField<Int>) = apply { this.mpTemp = mpTemp }

        /** Time of the observation, in ISO 8601 UTC format with millisecond precision. */
        fun obTime(obTime: OffsetDateTime) = obTime(JsonField.of(obTime))

        /**
         * Sets [Builder.obTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun obTime(obTime: JsonField<OffsetDateTime>) = apply { this.obTime = obTime }

        /** Model object representing on-orbit objects or satellites in the system. */
        fun onOrbit(onOrbit: OnorbitFull) = onOrbit(JsonField.of(onOrbit))

        /**
         * Sets [Builder.onOrbit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onOrbit] with a well-typed [OnorbitFull] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onOrbit(onOrbit: JsonField<OnorbitFull>) = apply { this.onOrbit = onOrbit }

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
         * Optional identifier provided by the record source to indicate the satellite hosting the
         * sensor. This may be an internal identifier and not necessarily map to a valid satellite
         * number.
         */
        fun origObjectId(origObjectId: String) = origObjectId(JsonField.of(origObjectId))

        /**
         * Sets [Builder.origObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origObjectId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun origObjectId(origObjectId: JsonField<String>) = apply {
            this.origObjectId = origObjectId
        }

        /**
         * Optional identifier provided by the record source to indicate the sensor identifier which
         * produced this data. This may be an internal identifier and not necessarily a valid sensor
         * ID.
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

        /** Photodiode 1 signal level. */
        fun pd1SigLev(pd1SigLev: Int) = pd1SigLev(JsonField.of(pd1SigLev))

        /**
         * Sets [Builder.pd1SigLev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pd1SigLev] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pd1SigLev(pd1SigLev: JsonField<Int>) = apply { this.pd1SigLev = pd1SigLev }

        /** Photodiode 2 signal level. */
        fun pd2SigLev(pd2SigLev: Int) = pd2SigLev(JsonField.of(pd2SigLev))

        /**
         * Sets [Builder.pd2SigLev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pd2SigLev] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pd2SigLev(pd2SigLev: JsonField<Int>) = apply { this.pd2SigLev = pd2SigLev }

        /** Power supply temperature monitor. This is sensor status telemetry. */
        fun psTempMon(psTempMon: Int) = psTempMon(JsonField.of(psTempMon))

        /**
         * Sets [Builder.psTempMon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.psTempMon] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun psTempMon(psTempMon: JsonField<Int>) = apply { this.psTempMon = psTempMon }

        /**
         * Flag indicating whether this record is an original or re-transmitted dataset (TRUE
         * indicates a retransmit from the host).
         */
        fun retransmit(retransmit: Boolean) = retransmit(JsonField.of(retransmit))

        /**
         * Sets [Builder.retransmit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retransmit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun retransmit(retransmit: JsonField<Boolean>) = apply { this.retransmit = retransmit }

        /** Satellite/catalog number of the on-orbit satellite hosting the sensor. */
        fun satNo(satNo: Int) = satNo(JsonField.of(satNo))

        /**
         * Sets [Builder.satNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.satNo] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun satNo(satNo: JsonField<Int>) = apply { this.satNo = satNo }

        /** The sensor mode associated with this measurements (NORMAL, TEST). */
        fun senMode(senMode: String) = senMode(JsonField.of(senMode))

        /**
         * Sets [Builder.senMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senMode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun senMode(senMode: JsonField<String>) = apply { this.senMode = senMode }

        /**
         * Surface dosimeter charge rate high output (converts to pico-amps/bit). High byte of 2
         * bytes.
         */
        fun surfDosChargeH(surfDosChargeH: Int) = surfDosChargeH(JsonField.of(surfDosChargeH))

        /**
         * Sets [Builder.surfDosChargeH] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfDosChargeH] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun surfDosChargeH(surfDosChargeH: JsonField<Int>) = apply {
            this.surfDosChargeH = surfDosChargeH
        }

        /**
         * Surface dosimeter charge rate low output (converts to pico-amps/bit). Low byte of 2
         * bytes.
         */
        fun surfDosChargeL(surfDosChargeL: Int) = surfDosChargeL(JsonField.of(surfDosChargeL))

        /**
         * Sets [Builder.surfDosChargeL] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfDosChargeL] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun surfDosChargeL(surfDosChargeL: JsonField<Int>) = apply {
            this.surfDosChargeL = surfDosChargeL
        }

        /**
         * Surface dosimeter high range output (converts to pico-coulombs/bit). High byte of 3
         * bytes.
         */
        fun surfDosH(surfDosH: Int) = surfDosH(JsonField.of(surfDosH))

        /**
         * Sets [Builder.surfDosH] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfDosH] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun surfDosH(surfDosH: JsonField<Int>) = apply { this.surfDosH = surfDosH }

        /**
         * Surface dosimeter low range output (converts to pico-coulombs/bit). Low byte of 3 bytes.
         */
        fun surfDosL(surfDosL: Int) = surfDosL(JsonField.of(surfDosL))

        /**
         * Sets [Builder.surfDosL] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfDosL] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun surfDosL(surfDosL: JsonField<Int>) = apply { this.surfDosL = surfDosL }

        /**
         * Surface dosimeter medium range output (converts to pico-coulombs/bit). Middle byte of 3
         * bytes.
         */
        fun surfDosM(surfDosM: Int) = surfDosM(JsonField.of(surfDosM))

        /**
         * Sets [Builder.surfDosM] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfDosM] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun surfDosM(surfDosM: JsonField<Int>) = apply { this.surfDosM = surfDosM }

        /** Surface dosimeter status byte. */
        fun surfDosStat(surfDosStat: Int) = surfDosStat(JsonField.of(surfDosStat))

        /**
         * Sets [Builder.surfDosStat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.surfDosStat] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun surfDosStat(surfDosStat: JsonField<Int>) = apply { this.surfDosStat = surfDosStat }

        /** Array of 144 digitized samples of ESD waveform for transient packets. */
        fun transientData(transientData: List<Int>) = transientData(JsonField.of(transientData))

        /**
         * Sets [Builder.transientData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transientData] with a well-typed `List<Int>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transientData(transientData: JsonField<List<Int>>) = apply {
            this.transientData = transientData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Int] to [Builder.transientData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransientData(transientData: Int) = apply {
            this.transientData =
                (this.transientData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transientData", it).add(transientData)
                }
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
         * Reference voltage (volts/bit). Conversion factor used to convert analog V monitor data
         * from bytes to volts.
         */
        fun vRef(vRef: Int) = vRef(JsonField.of(vRef))

        /**
         * Sets [Builder.vRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vRef] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vRef(vRef: JsonField<Int>) = apply { this.vRef = vRef }

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
         * Returns an immutable instance of [Ecpsdr].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .msgTime()
         * .source()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Ecpsdr =
            Ecpsdr(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("msgTime", msgTime),
                checkRequired("source", source),
                checkRequired("type", type),
                id,
                asl5VCurrMon,
                cdsPlateVMon,
                cdsRefVMon,
                cdsThreshold,
                cdsThrottle,
                checksum,
                createdAt,
                createdBy,
                dosBias,
                dsl5VCurrMon,
                esdTrigCountH,
                esdTrigCountL,
                hiLetL,
                hiLetM,
                idOnOrbit,
                idSensor,
                lowLetL,
                lowLetM,
                medLet1L,
                medLet1M,
                medLet2L,
                medLet2M,
                medLet3L,
                medLet3M,
                medLet4L,
                medLet4M,
                mpTemp,
                obTime,
                onOrbit,
                origin,
                origNetwork,
                origObjectId,
                origSensorId,
                pd1SigLev,
                pd2SigLev,
                psTempMon,
                retransmit,
                satNo,
                senMode,
                surfDosChargeH,
                surfDosChargeL,
                surfDosH,
                surfDosL,
                surfDosM,
                surfDosStat,
                (transientData ?: JsonMissing.of()).map { it.toImmutable() },
                updatedAt,
                updatedBy,
                vRef,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Ecpsdr = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        msgTime()
        source()
        type()
        id()
        asl5VCurrMon()
        cdsPlateVMon()
        cdsRefVMon()
        cdsThreshold()
        cdsThrottle()
        checksum()
        createdAt()
        createdBy()
        dosBias()
        dsl5VCurrMon()
        esdTrigCountH()
        esdTrigCountL()
        hiLetL()
        hiLetM()
        idOnOrbit()
        idSensor()
        lowLetL()
        lowLetM()
        medLet1L()
        medLet1M()
        medLet2L()
        medLet2M()
        medLet3L()
        medLet3M()
        medLet4L()
        medLet4M()
        mpTemp()
        obTime()
        onOrbit().ifPresent { it.validate() }
        origin()
        origNetwork()
        origObjectId()
        origSensorId()
        pd1SigLev()
        pd2SigLev()
        psTempMon()
        retransmit()
        satNo()
        senMode()
        surfDosChargeH()
        surfDosChargeL()
        surfDosH()
        surfDosL()
        surfDosM()
        surfDosStat()
        transientData()
        updatedAt()
        updatedBy()
        vRef()
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
            (if (msgTime.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (asl5VCurrMon.asKnown().isPresent) 1 else 0) +
            (if (cdsPlateVMon.asKnown().isPresent) 1 else 0) +
            (if (cdsRefVMon.asKnown().isPresent) 1 else 0) +
            (if (cdsThreshold.asKnown().isPresent) 1 else 0) +
            (if (cdsThrottle.asKnown().isPresent) 1 else 0) +
            (if (checksum.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dosBias.asKnown().isPresent) 1 else 0) +
            (if (dsl5VCurrMon.asKnown().isPresent) 1 else 0) +
            (if (esdTrigCountH.asKnown().isPresent) 1 else 0) +
            (if (esdTrigCountL.asKnown().isPresent) 1 else 0) +
            (if (hiLetL.asKnown().isPresent) 1 else 0) +
            (if (hiLetM.asKnown().isPresent) 1 else 0) +
            (if (idOnOrbit.asKnown().isPresent) 1 else 0) +
            (if (idSensor.asKnown().isPresent) 1 else 0) +
            (if (lowLetL.asKnown().isPresent) 1 else 0) +
            (if (lowLetM.asKnown().isPresent) 1 else 0) +
            (if (medLet1L.asKnown().isPresent) 1 else 0) +
            (if (medLet1M.asKnown().isPresent) 1 else 0) +
            (if (medLet2L.asKnown().isPresent) 1 else 0) +
            (if (medLet2M.asKnown().isPresent) 1 else 0) +
            (if (medLet3L.asKnown().isPresent) 1 else 0) +
            (if (medLet3M.asKnown().isPresent) 1 else 0) +
            (if (medLet4L.asKnown().isPresent) 1 else 0) +
            (if (medLet4M.asKnown().isPresent) 1 else 0) +
            (if (mpTemp.asKnown().isPresent) 1 else 0) +
            (if (obTime.asKnown().isPresent) 1 else 0) +
            (onOrbit.asKnown().getOrNull()?.validity() ?: 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origObjectId.asKnown().isPresent) 1 else 0) +
            (if (origSensorId.asKnown().isPresent) 1 else 0) +
            (if (pd1SigLev.asKnown().isPresent) 1 else 0) +
            (if (pd2SigLev.asKnown().isPresent) 1 else 0) +
            (if (psTempMon.asKnown().isPresent) 1 else 0) +
            (if (retransmit.asKnown().isPresent) 1 else 0) +
            (if (satNo.asKnown().isPresent) 1 else 0) +
            (if (senMode.asKnown().isPresent) 1 else 0) +
            (if (surfDosChargeH.asKnown().isPresent) 1 else 0) +
            (if (surfDosChargeL.asKnown().isPresent) 1 else 0) +
            (if (surfDosH.asKnown().isPresent) 1 else 0) +
            (if (surfDosL.asKnown().isPresent) 1 else 0) +
            (if (surfDosM.asKnown().isPresent) 1 else 0) +
            (if (surfDosStat.asKnown().isPresent) 1 else 0) +
            (transientData.asKnown().getOrNull()?.size ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vRef.asKnown().isPresent) 1 else 0)

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

        return other is Ecpsdr &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            msgTime == other.msgTime &&
            source == other.source &&
            type == other.type &&
            id == other.id &&
            asl5VCurrMon == other.asl5VCurrMon &&
            cdsPlateVMon == other.cdsPlateVMon &&
            cdsRefVMon == other.cdsRefVMon &&
            cdsThreshold == other.cdsThreshold &&
            cdsThrottle == other.cdsThrottle &&
            checksum == other.checksum &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            dosBias == other.dosBias &&
            dsl5VCurrMon == other.dsl5VCurrMon &&
            esdTrigCountH == other.esdTrigCountH &&
            esdTrigCountL == other.esdTrigCountL &&
            hiLetL == other.hiLetL &&
            hiLetM == other.hiLetM &&
            idOnOrbit == other.idOnOrbit &&
            idSensor == other.idSensor &&
            lowLetL == other.lowLetL &&
            lowLetM == other.lowLetM &&
            medLet1L == other.medLet1L &&
            medLet1M == other.medLet1M &&
            medLet2L == other.medLet2L &&
            medLet2M == other.medLet2M &&
            medLet3L == other.medLet3L &&
            medLet3M == other.medLet3M &&
            medLet4L == other.medLet4L &&
            medLet4M == other.medLet4M &&
            mpTemp == other.mpTemp &&
            obTime == other.obTime &&
            onOrbit == other.onOrbit &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            origObjectId == other.origObjectId &&
            origSensorId == other.origSensorId &&
            pd1SigLev == other.pd1SigLev &&
            pd2SigLev == other.pd2SigLev &&
            psTempMon == other.psTempMon &&
            retransmit == other.retransmit &&
            satNo == other.satNo &&
            senMode == other.senMode &&
            surfDosChargeH == other.surfDosChargeH &&
            surfDosChargeL == other.surfDosChargeL &&
            surfDosH == other.surfDosH &&
            surfDosL == other.surfDosL &&
            surfDosM == other.surfDosM &&
            surfDosStat == other.surfDosStat &&
            transientData == other.transientData &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            vRef == other.vRef &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            msgTime,
            source,
            type,
            id,
            asl5VCurrMon,
            cdsPlateVMon,
            cdsRefVMon,
            cdsThreshold,
            cdsThrottle,
            checksum,
            createdAt,
            createdBy,
            dosBias,
            dsl5VCurrMon,
            esdTrigCountH,
            esdTrigCountL,
            hiLetL,
            hiLetM,
            idOnOrbit,
            idSensor,
            lowLetL,
            lowLetM,
            medLet1L,
            medLet1M,
            medLet2L,
            medLet2M,
            medLet3L,
            medLet3M,
            medLet4L,
            medLet4M,
            mpTemp,
            obTime,
            onOrbit,
            origin,
            origNetwork,
            origObjectId,
            origSensorId,
            pd1SigLev,
            pd2SigLev,
            psTempMon,
            retransmit,
            satNo,
            senMode,
            surfDosChargeH,
            surfDosChargeL,
            surfDosH,
            surfDosL,
            surfDosM,
            surfDosStat,
            transientData,
            updatedAt,
            updatedBy,
            vRef,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Ecpsdr{classificationMarking=$classificationMarking, dataMode=$dataMode, msgTime=$msgTime, source=$source, type=$type, id=$id, asl5VCurrMon=$asl5VCurrMon, cdsPlateVMon=$cdsPlateVMon, cdsRefVMon=$cdsRefVMon, cdsThreshold=$cdsThreshold, cdsThrottle=$cdsThrottle, checksum=$checksum, createdAt=$createdAt, createdBy=$createdBy, dosBias=$dosBias, dsl5VCurrMon=$dsl5VCurrMon, esdTrigCountH=$esdTrigCountH, esdTrigCountL=$esdTrigCountL, hiLetL=$hiLetL, hiLetM=$hiLetM, idOnOrbit=$idOnOrbit, idSensor=$idSensor, lowLetL=$lowLetL, lowLetM=$lowLetM, medLet1L=$medLet1L, medLet1M=$medLet1M, medLet2L=$medLet2L, medLet2M=$medLet2M, medLet3L=$medLet3L, medLet3M=$medLet3M, medLet4L=$medLet4L, medLet4M=$medLet4M, mpTemp=$mpTemp, obTime=$obTime, onOrbit=$onOrbit, origin=$origin, origNetwork=$origNetwork, origObjectId=$origObjectId, origSensorId=$origSensorId, pd1SigLev=$pd1SigLev, pd2SigLev=$pd2SigLev, psTempMon=$psTempMon, retransmit=$retransmit, satNo=$satNo, senMode=$senMode, surfDosChargeH=$surfDosChargeH, surfDosChargeL=$surfDosChargeL, surfDosH=$surfDosH, surfDosL=$surfDosL, surfDosM=$surfDosM, surfDosStat=$surfDosStat, transientData=$transientData, updatedAt=$updatedAt, updatedBy=$updatedBy, vRef=$vRef, additionalProperties=$additionalProperties}"
}

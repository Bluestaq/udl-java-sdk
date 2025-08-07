// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.trackdetails.history

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
 * These services provide operations for querying of all available track details and amplifying
 * track data. A track is a position and optionally a heading/velocity of an object such as an
 * aircraft, marine vessel, etc at a particular timestamp. It also includes optional information
 * regarding the identity/type of the target object and other amplifying object data, if known.
 */
class TrackDetailsFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val lat: JsonField<Double>,
    private val lon: JsonField<Double>,
    private val source: JsonField<String>,
    private val ts: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val acftSubType: JsonField<String>,
    private val addInfo: JsonField<String>,
    private val alert: JsonField<String>,
    private val alt: JsonField<Double>,
    private val angElev: JsonField<Double>,
    private val antennaRefDimensions: JsonField<List<Double>>,
    private val aouRptData: JsonField<List<Double>>,
    private val aouRptType: JsonField<String>,
    private val appGrp: JsonField<String>,
    private val arrCargo: JsonField<String>,
    private val arrFlag: JsonField<String>,
    private val arrPort: JsonField<String>,
    private val arrTime: JsonField<OffsetDateTime>,
    private val aton: JsonField<String>,
    private val avgSpd: JsonField<Double>,
    private val azCorrArcWidth: JsonField<Double>,
    private val azCorrCenterLine: JsonField<Double>,
    private val beNumber: JsonField<String>,
    private val boosting: JsonField<Boolean>,
    private val burnoutAlt: JsonField<Double>,
    private val callSign: JsonField<String>,
    private val cargoType: JsonField<String>,
    private val cI: JsonField<String>,
    private val containment: JsonField<Double>,
    private val coopLocInd: JsonField<String>,
    private val course: JsonField<Double>,
    private val cpa: JsonField<Double>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val depCargo: JsonField<String>,
    private val depFlag: JsonField<String>,
    private val depPort: JsonField<String>,
    private val desCargo: JsonField<String>,
    private val desFlag: JsonField<String>,
    private val destination: JsonField<String>,
    private val disId: JsonField<String>,
    private val draught: JsonField<Double>,
    private val dropPtInd: JsonField<Boolean>,
    private val dummy: JsonField<Boolean>,
    private val ecefPos: JsonField<List<Double>>,
    private val ecefVel: JsonField<List<Double>>,
    private val elnot1: JsonField<String>,
    private val elnot2: JsonField<String>,
    private val emgInd: JsonField<Boolean>,
    private val emitterName: JsonField<String>,
    private val env: JsonField<Env>,
    private val errAreaOrient: JsonField<Double>,
    private val errGeoAreaSwitch: JsonField<String>,
    private val errSemiIntAxis: JsonField<Double>,
    private val errSemiMajElev: JsonField<Double>,
    private val eta: JsonField<OffsetDateTime>,
    private val etd: JsonField<OffsetDateTime>,
    private val evalRating: JsonField<String>,
    private val feint: JsonField<Boolean>,
    private val freq: JsonField<Double>,
    private val ftn: JsonField<String>,
    private val ftnCmd: JsonField<String>,
    private val ftnMsgTs: JsonField<OffsetDateTime>,
    private val harmonics: JsonField<String>,
    private val hdng: JsonField<Double>,
    private val hq: JsonField<Boolean>,
    private val hullNum: JsonField<String>,
    private val hullProf: JsonField<String>,
    private val identAmp: JsonField<String>,
    private val iff: JsonField<String>,
    private val imon: JsonField<Int>,
    private val impactAouData: JsonField<List<Double>>,
    private val impactAouType: JsonField<String>,
    private val impactLat: JsonField<Double>,
    private val impactLon: JsonField<Double>,
    private val impactTime: JsonField<OffsetDateTime>,
    private val infoSource: JsonField<String>,
    private val installation: JsonField<Boolean>,
    private val launchAouData: JsonField<List<Double>>,
    private val launchAouType: JsonField<String>,
    private val launchLat: JsonField<Double>,
    private val launchLon: JsonField<Double>,
    private val launchTime: JsonField<OffsetDateTime>,
    private val length: JsonField<Double>,
    private val lostTrkInd: JsonField<Boolean>,
    private val maneuverInd: JsonField<String>,
    private val maxFreq: JsonField<Double>,
    private val midbCat: JsonField<String>,
    private val mil2525Bstr: JsonField<String>,
    private val mmsi: JsonField<Int>,
    private val msgType: JsonField<String>,
    private val mslStatus: JsonField<String>,
    private val muidSrc: JsonField<String>,
    private val muidSrcTrk: JsonField<String>,
    private val name: JsonField<String>,
    private val navStatus: JsonField<String>,
    private val ntds: JsonField<String>,
    private val numBlades: JsonField<Int>,
    private val numShafts: JsonField<Int>,
    private val objAct: JsonField<String>,
    private val objIdent: JsonField<ObjIdent>,
    private val objNat: JsonField<String>,
    private val objPlat: JsonField<String>,
    private val objType: JsonField<String>,
    private val offPosInd: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val origXref: JsonField<String>,
    private val oSuffix: JsonField<String>,
    private val pif: JsonField<String>,
    private val pin: JsonField<String>,
    private val polarSingLocLat: JsonField<Double>,
    private val polarSingLocLon: JsonField<Double>,
    private val posDeviceType: JsonField<String>,
    private val prf: JsonField<Double>,
    private val pri: JsonField<Double>,
    private val propRpm: JsonField<Double>,
    private val propType: JsonField<String>,
    private val pw: JsonField<Double>,
    private val reduced: JsonField<Boolean>,
    private val reinforced: JsonField<Boolean>,
    private val rptArchived: JsonField<Boolean>,
    private val rptChxref: JsonField<String>,
    private val rtn: JsonField<List<String>>,
    private val rtnCmd: JsonField<String>,
    private val rtnMsgTs: JsonField<List<OffsetDateTime>>,
    private val rtnTrkState: JsonField<String>,
    private val scanRate: JsonField<Double>,
    private val scanType: JsonField<String>,
    private val scn: JsonField<Int>,
    private val sconum: JsonField<String>,
    private val selfReport: JsonField<Boolean>,
    private val sen: JsonField<String>,
    private val shipClass: JsonField<String>,
    private val shortName: JsonField<String>,
    private val sourceUid: JsonField<String>,
    private val spaceAmp: JsonField<String>,
    private val spaceAmpConf: JsonField<Int>,
    private val spaceSpecType: JsonField<String>,
    private val spd: JsonField<Double>,
    private val staffCmts: JsonField<String>,
    private val sternType: JsonField<String>,
    private val taskForce: JsonField<Boolean>,
    private val tcpa: JsonField<OffsetDateTime>,
    private val tesEventId: JsonField<String>,
    private val tol: JsonField<Double>,
    private val tpk: JsonField<Double>,
    private val trkConf: JsonField<Double>,
    private val trkId: JsonField<String>,
    private val trkNum: JsonField<String>,
    private val trkQual: JsonField<Int>,
    private val trkScope: JsonField<String>,
    private val trnspdrId: JsonField<String>,
    private val trnspdrType: JsonField<String>,
    private val vslWt: JsonField<Double>,
    private val width: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lon") @ExcludeMissing lon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ts") @ExcludeMissing ts: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acftSubType")
        @ExcludeMissing
        acftSubType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addInfo") @ExcludeMissing addInfo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alert") @ExcludeMissing alert: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alt") @ExcludeMissing alt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("angElev") @ExcludeMissing angElev: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("antennaRefDimensions")
        @ExcludeMissing
        antennaRefDimensions: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("aouRptData")
        @ExcludeMissing
        aouRptData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("aouRptType")
        @ExcludeMissing
        aouRptType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("appGrp") @ExcludeMissing appGrp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrCargo") @ExcludeMissing arrCargo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrFlag") @ExcludeMissing arrFlag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrPort") @ExcludeMissing arrPort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("arrTime")
        @ExcludeMissing
        arrTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("aton") @ExcludeMissing aton: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avgSpd") @ExcludeMissing avgSpd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azCorrArcWidth")
        @ExcludeMissing
        azCorrArcWidth: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("azCorrCenterLine")
        @ExcludeMissing
        azCorrCenterLine: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("beNumber") @ExcludeMissing beNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("boosting") @ExcludeMissing boosting: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("burnoutAlt")
        @ExcludeMissing
        burnoutAlt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("callSign") @ExcludeMissing callSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cargoType") @ExcludeMissing cargoType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cI") @ExcludeMissing cI: JsonField<String> = JsonMissing.of(),
        @JsonProperty("containment")
        @ExcludeMissing
        containment: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("coopLocInd")
        @ExcludeMissing
        coopLocInd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("course") @ExcludeMissing course: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("cpa") @ExcludeMissing cpa: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depCargo") @ExcludeMissing depCargo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depFlag") @ExcludeMissing depFlag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depPort") @ExcludeMissing depPort: JsonField<String> = JsonMissing.of(),
        @JsonProperty("desCargo") @ExcludeMissing desCargo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("desFlag") @ExcludeMissing desFlag: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disId") @ExcludeMissing disId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("draught") @ExcludeMissing draught: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("dropPtInd") @ExcludeMissing dropPtInd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("dummy") @ExcludeMissing dummy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ecefPos")
        @ExcludeMissing
        ecefPos: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("ecefVel")
        @ExcludeMissing
        ecefVel: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("elnot1") @ExcludeMissing elnot1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("elnot2") @ExcludeMissing elnot2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("emgInd") @ExcludeMissing emgInd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("emitterName")
        @ExcludeMissing
        emitterName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("env") @ExcludeMissing env: JsonField<Env> = JsonMissing.of(),
        @JsonProperty("errAreaOrient")
        @ExcludeMissing
        errAreaOrient: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("errGeoAreaSwitch")
        @ExcludeMissing
        errGeoAreaSwitch: JsonField<String> = JsonMissing.of(),
        @JsonProperty("errSemiIntAxis")
        @ExcludeMissing
        errSemiIntAxis: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("errSemiMajElev")
        @ExcludeMissing
        errSemiMajElev: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("eta") @ExcludeMissing eta: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("etd") @ExcludeMissing etd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("evalRating")
        @ExcludeMissing
        evalRating: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feint") @ExcludeMissing feint: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("freq") @ExcludeMissing freq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("ftn") @ExcludeMissing ftn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ftnCmd") @ExcludeMissing ftnCmd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ftnMsgTs")
        @ExcludeMissing
        ftnMsgTs: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("harmonics") @ExcludeMissing harmonics: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hdng") @ExcludeMissing hdng: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("hq") @ExcludeMissing hq: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("hullNum") @ExcludeMissing hullNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hullProf") @ExcludeMissing hullProf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("identAmp") @ExcludeMissing identAmp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iff") @ExcludeMissing iff: JsonField<String> = JsonMissing.of(),
        @JsonProperty("imon") @ExcludeMissing imon: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("impactAouData")
        @ExcludeMissing
        impactAouData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("impactAouType")
        @ExcludeMissing
        impactAouType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("impactLat") @ExcludeMissing impactLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("impactLon") @ExcludeMissing impactLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("impactTime")
        @ExcludeMissing
        impactTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("infoSource")
        @ExcludeMissing
        infoSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("installation")
        @ExcludeMissing
        installation: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("launchAouData")
        @ExcludeMissing
        launchAouData: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("launchAouType")
        @ExcludeMissing
        launchAouType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("launchLat") @ExcludeMissing launchLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchLon") @ExcludeMissing launchLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("launchTime")
        @ExcludeMissing
        launchTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("length") @ExcludeMissing length: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lostTrkInd")
        @ExcludeMissing
        lostTrkInd: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("maneuverInd")
        @ExcludeMissing
        maneuverInd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxFreq") @ExcludeMissing maxFreq: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("midbCat") @ExcludeMissing midbCat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mil2525Bstr")
        @ExcludeMissing
        mil2525Bstr: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mmsi") @ExcludeMissing mmsi: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("msgType") @ExcludeMissing msgType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mslStatus") @ExcludeMissing mslStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("muidSrc") @ExcludeMissing muidSrc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("muidSrcTrk")
        @ExcludeMissing
        muidSrcTrk: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("navStatus") @ExcludeMissing navStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ntds") @ExcludeMissing ntds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numBlades") @ExcludeMissing numBlades: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numShafts") @ExcludeMissing numShafts: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("objAct") @ExcludeMissing objAct: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objIdent") @ExcludeMissing objIdent: JsonField<ObjIdent> = JsonMissing.of(),
        @JsonProperty("objNat") @ExcludeMissing objNat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objPlat") @ExcludeMissing objPlat: JsonField<String> = JsonMissing.of(),
        @JsonProperty("objType") @ExcludeMissing objType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("offPosInd") @ExcludeMissing offPosInd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origXref") @ExcludeMissing origXref: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oSuffix") @ExcludeMissing oSuffix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pif") @ExcludeMissing pif: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pin") @ExcludeMissing pin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("polarSingLocLat")
        @ExcludeMissing
        polarSingLocLat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("polarSingLocLon")
        @ExcludeMissing
        polarSingLocLon: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("posDeviceType")
        @ExcludeMissing
        posDeviceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prf") @ExcludeMissing prf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("pri") @ExcludeMissing pri: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("propRPM") @ExcludeMissing propRpm: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("propType") @ExcludeMissing propType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pw") @ExcludeMissing pw: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reduced") @ExcludeMissing reduced: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reinforced")
        @ExcludeMissing
        reinforced: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rptArchived")
        @ExcludeMissing
        rptArchived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("rptChxref") @ExcludeMissing rptChxref: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rtn") @ExcludeMissing rtn: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("rtnCmd") @ExcludeMissing rtnCmd: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rtnMsgTs")
        @ExcludeMissing
        rtnMsgTs: JsonField<List<OffsetDateTime>> = JsonMissing.of(),
        @JsonProperty("rtnTrkState")
        @ExcludeMissing
        rtnTrkState: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scanRate") @ExcludeMissing scanRate: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("scanType") @ExcludeMissing scanType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("scn") @ExcludeMissing scn: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("sconum") @ExcludeMissing sconum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selfReport")
        @ExcludeMissing
        selfReport: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sen") @ExcludeMissing sen: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shipClass") @ExcludeMissing shipClass: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shortName") @ExcludeMissing shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceUid") @ExcludeMissing sourceUid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spaceAmp") @ExcludeMissing spaceAmp: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spaceAmpConf")
        @ExcludeMissing
        spaceAmpConf: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("spaceSpecType")
        @ExcludeMissing
        spaceSpecType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spd") @ExcludeMissing spd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("staffCmts") @ExcludeMissing staffCmts: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sternType") @ExcludeMissing sternType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taskForce") @ExcludeMissing taskForce: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tcpa") @ExcludeMissing tcpa: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tesEventId")
        @ExcludeMissing
        tesEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tol") @ExcludeMissing tol: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("tpk") @ExcludeMissing tpk: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trkConf") @ExcludeMissing trkConf: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trkId") @ExcludeMissing trkId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trkNum") @ExcludeMissing trkNum: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trkQual") @ExcludeMissing trkQual: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("trkScope") @ExcludeMissing trkScope: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trnspdrId") @ExcludeMissing trnspdrId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("trnspdrType")
        @ExcludeMissing
        trnspdrType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vslWt") @ExcludeMissing vslWt: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Double> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        lat,
        lon,
        source,
        ts,
        id,
        acftSubType,
        addInfo,
        alert,
        alt,
        angElev,
        antennaRefDimensions,
        aouRptData,
        aouRptType,
        appGrp,
        arrCargo,
        arrFlag,
        arrPort,
        arrTime,
        aton,
        avgSpd,
        azCorrArcWidth,
        azCorrCenterLine,
        beNumber,
        boosting,
        burnoutAlt,
        callSign,
        cargoType,
        cI,
        containment,
        coopLocInd,
        course,
        cpa,
        createdAt,
        createdBy,
        depCargo,
        depFlag,
        depPort,
        desCargo,
        desFlag,
        destination,
        disId,
        draught,
        dropPtInd,
        dummy,
        ecefPos,
        ecefVel,
        elnot1,
        elnot2,
        emgInd,
        emitterName,
        env,
        errAreaOrient,
        errGeoAreaSwitch,
        errSemiIntAxis,
        errSemiMajElev,
        eta,
        etd,
        evalRating,
        feint,
        freq,
        ftn,
        ftnCmd,
        ftnMsgTs,
        harmonics,
        hdng,
        hq,
        hullNum,
        hullProf,
        identAmp,
        iff,
        imon,
        impactAouData,
        impactAouType,
        impactLat,
        impactLon,
        impactTime,
        infoSource,
        installation,
        launchAouData,
        launchAouType,
        launchLat,
        launchLon,
        launchTime,
        length,
        lostTrkInd,
        maneuverInd,
        maxFreq,
        midbCat,
        mil2525Bstr,
        mmsi,
        msgType,
        mslStatus,
        muidSrc,
        muidSrcTrk,
        name,
        navStatus,
        ntds,
        numBlades,
        numShafts,
        objAct,
        objIdent,
        objNat,
        objPlat,
        objType,
        offPosInd,
        origin,
        origNetwork,
        origXref,
        oSuffix,
        pif,
        pin,
        polarSingLocLat,
        polarSingLocLon,
        posDeviceType,
        prf,
        pri,
        propRpm,
        propType,
        pw,
        reduced,
        reinforced,
        rptArchived,
        rptChxref,
        rtn,
        rtnCmd,
        rtnMsgTs,
        rtnTrkState,
        scanRate,
        scanType,
        scn,
        sconum,
        selfReport,
        sen,
        shipClass,
        shortName,
        sourceUid,
        spaceAmp,
        spaceAmpConf,
        spaceSpecType,
        spd,
        staffCmts,
        sternType,
        taskForce,
        tcpa,
        tesEventId,
        tol,
        tpk,
        trkConf,
        trkId,
        trkNum,
        trkQual,
        trkScope,
        trnspdrId,
        trnspdrType,
        vslWt,
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
     * WGS-84 latitude of the track object, in degrees. -90 to 90 degrees (negative values south of
     * equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lat(): Double = lat.getRequired("lat")

    /**
     * WGS-84 longitude of the track object, in degrees. -180 to 180 degrees (negative values west
     * of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lon(): Double = lon.getRequired("lon")

    /**
     * Source of the data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): String = source.getRequired("source")

    /**
     * Track timestamp in ISO8601 UTC format with microsecond precision.
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
     * Subtype is a finer grain categorization of missile types. Examples include but are not
     * limited to SRBM, MRBM, IRBM, LRBM, ICBM, SLBM:
     *
     * SRBM - Short-Range Ballistic Missile
     *
     * MRBM - Medium-Range Ballistic Missile
     *
     * IRBM - Intermediate-Range Ballistic Missile
     *
     * LRBM - Long-Range Ballistic Missile
     *
     * ICBM - Intercontinental Ballistic Missile
     *
     * SLBM - Submarine-Launched Ballistic Missile.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun acftSubType(): Optional<String> = acftSubType.getOptional("acftSubType")

    /**
     * A text amplifier for units, equipment and installations; content is implementation specific.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun addInfo(): Optional<String> = addInfo.getOptional("addInfo")

    /**
     * A track may be designated as an alert track with the following designations:
     *
     * HIT - High Interest Track
     *
     * TGT - Target
     *
     * SUS - Suspect Carrier
     *
     * NSP - Cleared Suspect
     *
     * If alert is null, the track is assumed to be of non-alert status.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alert(): Optional<String> = alert.getOptional("alert")

    /**
     * Track point altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a
     * track object height above ellipsoid, and negative values indicate a track object below
     * ellipsoid, applicable to the depth estimate for a subsurface track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun alt(): Optional<Double> = alt.getOptional("alt")

    /**
     * The angle formed between the line of sight of the observer and the horizon, in degrees. The
     * angular range is -90 to 90, with negative values representing angle of depression.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun angElev(): Optional<Double> = angElev.getOptional("angElev")

    /**
     * The reference dimensions of the vessel, reported as [A, B, C, D], in meters. Where the array
     * values represent the distance fore (A), aft (B), to port (C), and to starboard (D) of the
     * navigation antenna. Array with values A = C = 0 and B, D > 0 indicate the length (B) and
     * width (D) of the vessel without antenna position reference.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun antennaRefDimensions(): Optional<List<Double>> =
        antennaRefDimensions.getOptional("antennaRefDimensions")

    /**
     * Three element array representing an Area of Uncertainty (AoU). The array element definitions
     * and units are type specific depending on the aouRptType specified in this record:
     *
     * ELLIPSE:
     *
     * brg - orientation in degrees of the ellipse
     *
     * a1 - semi-major axis in meters
     *
     * a2 - semi-minor axis in meters
     *
     * BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * brg - orientation in degrees of the bearing box
     *
     * a1 - length of bearing box in meters
     *
     * a2 - half-width of bearing box in meters
     *
     * OTHER (All other type values):
     *
     * brg - line of bearing in degrees true
     *
     * a1 - bearing error in degrees
     *
     * a2 - estimated range in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aouRptData(): Optional<List<Double>> = aouRptData.getOptional("aouRptData")

    /**
     * The track Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type
     * defines the elements of the aouRptData array and is required if aouRptData is not null. See
     * the aouRptData field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aouRptType(): Optional<String> = aouRptType.getOptional("aouRptType")

    /**
     * Appearance group code.
     *
     * GP1 - Superstructure exceeds 1/3 of ship length.
     *
     * GP2 - Superstructure less than 1/3 of ship length.
     *
     * GP3 - Stack aft.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun appGrp(): Optional<String> = appGrp.getOptional("appGrp")

    /**
     * The reported arrival cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS
     * cargo definitions. Users should refer to USCG Navigation Center documentation for specific
     * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrCargo(): Optional<String> = arrCargo.getOptional("arrCargo")

    /**
     * The flag of the arrival port.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrFlag(): Optional<String> = arrFlag.getOptional("arrFlag")

    /**
     * The Arrival Port of the vessel according to the AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrPort(): Optional<String> = arrPort.getOptional("arrPort")

    /**
     * The Arrival Time of the vessel at the destination, in ISO 8601 UTC format with microsecond
     * precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun arrTime(): Optional<OffsetDateTime> = arrTime.getOptional("arrTime")

    /**
     * Type of Aid to Navigation. Intended as, but not constrained to, the USCG NAVCEN aids to
     * navigation. Users should refer to USCG Navigation Center documentation for specific device
     * type information. USCG NAVCEN documentation may be found at https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun aton(): Optional<String> = aton.getOptional("aton")

    /**
     * The average speed, in kilometers/hour, calculated for the subject during the latest
     * voyage/excursion.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun avgSpd(): Optional<Double> = avgSpd.getOptional("avgSpd")

    /**
     * Azimuth corridor arc distance measured in meters from reference point of azimuth corridor to
     * far edge of bounded azimuth corridor wedge, measured along azimuth corridor center line.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azCorrArcWidth(): Optional<Double> = azCorrArcWidth.getOptional("azCorrArcWidth")

    /**
     * The azimuth corridor centerline angle measured in degrees clockwise from true north, of the
     * center line of an azimuth corridor. The center line extends from the referenced corridor
     * origin location.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun azCorrCenterLine(): Optional<Double> = azCorrCenterLine.getOptional("azCorrCenterLine")

    /**
     * The Basic Encyclopedia (BE) number associated with this installation or area.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beNumber(): Optional<String> = beNumber.getOptional("beNumber")

    /**
     * Flag indicating that the missile is currently in a state of boosting, if reporting a missile
     * track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun boosting(): Optional<Boolean> = boosting.getOptional("boosting")

    /**
     * Track point burnout altitude relative to WGS-84 ellipsoid, in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun burnoutAlt(): Optional<Double> = burnoutAlt.getOptional("burnoutAlt")

    /**
     * The call sign currently assigned to this track object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun callSign(): Optional<String> = callSign.getOptional("callSign")

    /**
     * The reported cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS cargo
     * definitions. Users should refer to USCG Navigation Center documentation for specific
     * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cargoType(): Optional<String> = cargoType.getOptional("cargoType")

    /**
     * Correlation Index; reference code for the site that originally reported the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cI(): Optional<String> = cI.getOptional("cI")

    /**
     * The Area Of Uncertainty (AOU) percentage (0 - 100) containment value. The percentage of time
     * (90%) that the estimated area of uncertainty will cover the true position of the track
     * object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun containment(): Optional<Double> = containment.getOptional("containment")

    /**
     * The Cooperative Location Indicator specifies whether the reported entity location was derived
     * using reported locations from sensors on more than one platform.
     *
     * 0 - COOPERATIVE_LOCATOR_NONE
     *
     * 1 - SINGLE_PLATFORM
     *
     * 2 - FRAGMENT
     *
     * 3 - COOPERATIVE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun coopLocInd(): Optional<String> = coopLocInd.getOptional("coopLocInd")

    /**
     * The track object course-over-ground, in degrees clockwise from true North at the object
     * location (0-360 degrees).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun course(): Optional<Double> = course.getOptional("course")

    /**
     * The distance, in meters, of the closest point of approach between this track to the master
     * reference track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cpa(): Optional<Double> = cpa.getOptional("cpa")

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
     * The reported departure cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS
     * cargo definitions. Users should refer to USCG Navigation Center documentation for specific
     * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depCargo(): Optional<String> = depCargo.getOptional("depCargo")

    /**
     * The flag of the departure port.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depFlag(): Optional<String> = depFlag.getOptional("depFlag")

    /**
     * The Departure Port of the vessel according to the AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun depPort(): Optional<String> = depPort.getOptional("depPort")

    /**
     * The reported destination cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS
     * cargo definitions. Users should refer to USCG Navigation Center documentation for specific
     * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun desCargo(): Optional<String> = desCargo.getOptional("desCargo")

    /**
     * The flag of the destination port.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun desFlag(): Optional<String> = desFlag.getOptional("desFlag")

    /**
     * The destination of the vessel according to the AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun destination(): Optional<String> = destination.getOptional("destination")

    /**
     * The Intel Discrete Identifier (IDI) code assigned to this track. The IDI is a four-digit code
     * representing hostile or unknown tracks.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun disId(): Optional<String> = disId.getOptional("disId")

    /**
     * The maximum static draught, in meters, of the vessel according to the AIS transmission.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun draught(): Optional<Double> = draught.getOptional("draught")

    /**
     * The drop-point indicator setting.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dropPtInd(): Optional<Boolean> = dropPtInd.getOptional("dropPtInd")

    /**
     * Flag indicating that this track represents a dummy object or group. Identifies offensive or
     * defensive units, equipment, and/or installations intended to draw the enemy's attention away
     * from the area of the main attack. Based on MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun dummy(): Optional<Boolean> = dummy.getOptional("dummy")

    /**
     * Track object location in ECEF [x, y, z], meters. When provided, array must always contain 3
     * values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ecefPos(): Optional<List<Double>> = ecefPos.getOptional("ecefPos")

    /**
     * Track object velocity in ECEF [x', y', z'], meters/sec. When provided, array must always
     * contain 3 values.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ecefVel(): Optional<List<Double>> = ecefVel.getOptional("ecefVel")

    /**
     * Primary ELINT Notification (ELNOT), a five character identifier assigned to each
     * non-communication emission for collection and reporting purposes. This five-digit field
     * begins with an alpha character, followed by three numbers, ending with another alpha
     * character.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elnot1(): Optional<String> = elnot1.getOptional("elnot1")

    /**
     * Secondary ELINT Notification (ELNOT), a five character identifier assigned to each
     * non-communication emission for collection and reporting purposes. This five-digit field
     * begins with an alpha character, followed by three numbers, ending with another alpha
     * character.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun elnot2(): Optional<String> = elnot2.getOptional("elnot2")

    /**
     * Flag indicating that the track object has an emergency.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun emgInd(): Optional<Boolean> = emgInd.getOptional("emgInd")

    /**
     * Radar name of the sensor tracking this object (e.g., RAY1500, SPN-43, HEADNET).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun emitterName(): Optional<String> = emitterName.getOptional("emitterName")

    /**
     * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
     *
     * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
     * miles).
     *
     * LAND: On the surface of dry land.
     *
     * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
     *
     * SURFACE: On the surface of a body of water.
     *
     * SUBSURFACE: Below the surface of a body of water.
     *
     * UNKNOWN: Environment is not known.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun env(): Optional<Env> = env.getOptional("env")

    /**
     * The error in the Area Orientation. Area Orientation is the angle or roll in degrees, between
     * area semi-minor axis and plane defined by local vertical and area semi-major axis. When
     * reported without major and minor axis, it is angle between an axis perpendicular to a 2D true
     * north axis and plane defined by local vertical and a 2D true north axis.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errAreaOrient(): Optional<Double> = errAreaOrient.getOptional("errAreaOrient")

    /**
     * Geometric area switch identifies the 3D shape of the error volume by providing the 2D shape
     * for the 3D plane. The 3D plane is the plane orthogonal to the area semi-major axis and area
     * semi-minor axis. Depending on whether the 2D plane is reported as an error ellipse 2D or as
     * an error rectangle 2D, this switch reports a complete error volume that is cubical, 3D
     * rectangular, cylindrical, 3D ellipsoidal, or spherical.
     *
     * 0 - SWITCH_TYPE_UNKNOWN
     *
     * 1 - SQUARE_RECTANGLE
     *
     * 2 - CIRCLE_ELLIPSE.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errGeoAreaSwitch(): Optional<String> = errGeoAreaSwitch.getOptional("errGeoAreaSwitch")

    /**
     * The error in the semi-intermediate axis. The semi-intermediate axis is intermediate in length
     * between semi-major and semi-minor axes. This field is doubled and centered on intersection of
     * area semi-major axis and area semi-minor axis at 90 degrees to the plane defined by those
     * axes. For these shapes, the volume is defined as having a 50-percent probability of
     * containing the true location of the referenced entity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errSemiIntAxis(): Optional<Double> = errSemiIntAxis.getOptional("errSemiIntAxis")

    /**
     * The error in the Semi-major elevation axis. Semi-major elevation axis is the elevation of the
     * cubical, 3D rectangular, cylindrical, 3D ellipsoidal, or spherical semi-major axis, in
     * degrees, measured from local horizontal.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun errSemiMajElev(): Optional<Double> = errSemiMajElev.getOptional("errSemiMajElev")

    /**
     * The Estimated Time of Arrival of the vessel at the destination port, in ISO 8601 UTC format
     * with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun eta(): Optional<OffsetDateTime> = eta.getOptional("eta")

    /**
     * The Estimated Time of Departure of the vessel from the departure port (depPort), according to
     * Marine Traffic calculations, in ISO 8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun etd(): Optional<OffsetDateTime> = etd.getOptional("etd")

    /**
     * A text amplifier code for units, equipment, and installations that consists of a one-letter
     * reliability rating and a one-number credibility rating based on the following definitions of
     * each:
     *
     * Reliability Ratings:
     *
     * A-completely reliable
     *
     * B-usually reliable
     *
     * C-fairly reliable
     *
     * D-not usually reliable
     *
     * E-unreliable
     *
     * F-reliability cannot be judged
     *
     * Credibility Ratings:
     *
     * 1-confirmed by other sources
     *
     * 2-probably true
     *
     * 3-possibly true
     *
     * 4-doubtfully true
     *
     * 5-improbable
     *
     * 6-truth cannot be judged.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun evalRating(): Optional<String> = evalRating.getOptional("evalRating")

    /**
     * Flag indicating that this track represents a feint object or group. Identifies offensive or
     * defensive units, equipment, and/or installations intended to draw the enemy's attention away
     * from the area of the main attack. Based on MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun feint(): Optional<Boolean> = feint.getOptional("feint")

    /**
     * Frequency, in hertz, for the signature report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun freq(): Optional<Double> = freq.getOptional("freq")

    /**
     * An ftn used to associate information and directives with the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ftn(): Optional<String> = ftn.getOptional("ftn")

    /**
     * The name of the Command reporting the Force Over-The-Horizon Track Coordinator (FOTC) track
     * number.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ftnCmd(): Optional<String> = ftnCmd.getOptional("ftnCmd")

    /**
     * The message timestamp that the ftn track position was recorded, in ISO 8601 UTC format with
     * microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ftnMsgTs(): Optional<OffsetDateTime> = ftnMsgTs.getOptional("ftnMsgTs")

    /**
     * List of harmonics of the signature report in descending order of predominance using 1-2 digit
     * combinations separated by commas, e.g., 8,12,4. (1-22NS).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun harmonics(): Optional<String> = harmonics.getOptional("harmonics")

    /**
     * Track object heading, in degrees clockwise from true north.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hdng(): Optional<Double> = hdng.getOptional("hdng")

    /**
     * Flag indicating that this track represents a headquarters object. Based on MIL-STD-2525
     * symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hq(): Optional<Boolean> = hq.getOptional("hq")

    /**
     * The vessel hull number designation of this maritime vessel. The hull number is a 1-6
     * character alphanumeric entry assigned to a ship and painted on the hull.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hullNum(): Optional<String> = hullNum.getOptional("hullNum")

    /**
     * Hull profile code. Based on GCCS-J hull profiles.
     *
     * FLUSH No breaks in Hull Profile.
     *
     * RAISED 1 Hull Profile shows distinct raised area at bow. Remainder of deck is flush.
     *
     * RAISED 2 Hull Profile shows distinct raised area amidships. Bow and stern are flush.
     *
     * RAISED 3 Hull Profile shows distinct raised area at stern. Remainder of deck is flush.
     *
     * RAISED 1-2-3 Distinct raised areas at bow, midships, and stern with breaks between each
     * raise.
     *
     * RAISED 1-2 Raised area at bow and midships with break between.
     *
     * RAISED 1-3 Raised area at bow and stern with break between.
     *
     * RAISED 12 Continuous raised area encompassing both bow and midships.
     *
     * RAISED 23 Continuous raised area encompassing midships and stern.
     *
     * RAISED 12-3 Raised areas at bow, midships and stern. Bow and midship raises are continuous.
     * Break between midship and stern raises.
     *
     * RAISED 1-23 Raised areas at bow, midships, and stern. Midship and stern raises are continuous
     * with break between bow and midship raises.
     *
     * RAISED 1-L2-3 Raised areas at bow, midships, and stern with break between each raise.
     * Midships raise is longer than that associated with raised 1-2-3.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun hullProf(): Optional<String> = hullProf.getOptional("hullProf")

    /**
     * Additional track object identity/status information, typically used for EXERCISE identity
     * amplification (FAKER, JOKER, KILO, TRAVELLER, ZOMBIE):
     *
     * FAKER: Friendly track, object, or entity acting as an exercise hostile.
     *
     * JOKER: Friendly track, object, or entity acting as an exercise suspect.
     *
     * KILO: Friendly high-value object.
     *
     * TRAVELLER: Suspect land or surface track following a recognized traffic route.
     *
     * ZOMBIE: Suspect track, object, or entity of special interest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun identAmp(): Optional<String> = identAmp.getOptional("identAmp")

    /**
     * A text amplifier displaying IFF/SIF/AIS Identification modes and codes.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun iff(): Optional<String> = iff.getOptional("iff")

    /**
     * The International Maritime Organization Number of the vessel. IMON is a seven-digit number
     * that uniquely identifies the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun imon(): Optional<Int> = imon.getOptional("imon")

    /**
     * Three element array representing the impact point Area of Uncertainty (AoU). The array
     * element definitions and units are type specific depending on the impactAouType specified in
     * this record:
     *
     * ELLIPSE:
     *
     * brg - orientation in degrees of the ellipse
     *
     * a1 - semi-major axis in meters
     *
     * a2 - semi-minor axis in meters
     *
     * BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * brg - orientation in degrees of the bearing box
     *
     * a1 - length of bearing box in meters
     *
     * a2 - half-width of bearing box in meters
     *
     * OTHER (All other type values):
     *
     * brg - line of bearing in degrees true
     *
     * a1 - bearing error in degrees
     *
     * a2 - estimated range in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactAouData(): Optional<List<Double>> = impactAouData.getOptional("impactAouData")

    /**
     * The impact point Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This
     * type defines the elements of the impactAouData array and is required if impactAouData is not
     * null. See the impactAouData field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactAouType(): Optional<String> = impactAouType.getOptional("impactAouType")

    /**
     * WGS-84 latitude of the missile impact point, in degrees. -90 to 90 degrees (negative values
     * south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactLat(): Optional<Double> = impactLat.getOptional("impactLat")

    /**
     * WGS-84 longitude of the missile impact point, in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactLon(): Optional<Double> = impactLon.getOptional("impactLon")

    /**
     * Missile impact timestamp in ISO8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun impactTime(): Optional<OffsetDateTime> = impactTime.getOptional("impactTime")

    /**
     * Source code for source of information used to detect track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun infoSource(): Optional<String> = infoSource.getOptional("infoSource")

    /**
     * Flag indicating that this track represents an installation. Based on MIL-STD-2525 symbology
     * definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun installation(): Optional<Boolean> = installation.getOptional("installation")

    /**
     * Three element array representing the launch location Area of Uncertainty (AoU). The array
     * element definitions and units are type specific depending on the launchAouType specified in
     * this record:
     *
     * ELLIPSE:
     *
     * brg - orientation in degrees of the ellipse
     *
     * a1 - semi-major axis in meters
     *
     * a2 - semi-minor axis in meters
     *
     * BEARING (BEARING BOX or MTST BEARING BOX):
     *
     * brg - orientation in degrees of the bearing box
     *
     * a1 - length of bearing box in meters
     *
     * a2 - half-width of bearing box in meters
     *
     * OTHER (All other type values):
     *
     * brg - line of bearing in degrees true
     *
     * a1 - bearing error in degrees
     *
     * a2 - estimated range in meters.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAouData(): Optional<List<Double>> = launchAouData.getOptional("launchAouData")

    /**
     * The launch location Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This
     * type defines the elements of the launchAouData array and is required if launchAouData is not
     * null. See the launchAouData field definition for specific information.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchAouType(): Optional<String> = launchAouType.getOptional("launchAouType")

    /**
     * WGS-84 latitude of the missile launch point, in degrees. -90 to 90 degrees (negative values
     * south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchLat(): Optional<Double> = launchLat.getOptional("launchLat")

    /**
     * WGS-84 longitude of the missile launch point, in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchLon(): Optional<Double> = launchLon.getOptional("launchLon")

    /**
     * Missile launch timestamp in ISO8601 UTC format with microsecond precision.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun launchTime(): Optional<OffsetDateTime> = launchTime.getOptional("launchTime")

    /**
     * The overall length of the vessel, in meters. A value of 511 indicates a vessel length of 511
     * meters or greater.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun length(): Optional<Double> = length.getOptional("length")

    /**
     * Flag indicating whether the missile is considered lost, if reporting a missile track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun lostTrkInd(): Optional<Boolean> = lostTrkInd.getOptional("lostTrkInd")

    /**
     * The manuevering indicator specifying the missile boost phase.
     *
     * 0 - POST_BOOST_NONE
     *
     * 1 - POST_BOOST_MANUEVER
     *
     * 2 - POST_BOOST_COMPLETE_MANUEVER.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maneuverInd(): Optional<String> = maneuverInd.getOptional("maneuverInd")

    /**
     * Maximum frequency, in hertz, reported for this acoustic track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun maxFreq(): Optional<Double> = maxFreq.getOptional("maxFreq")

    /**
     * The category code that represents the associated facility purpose within the target system.
     * This value is the category code in the MIDB (Modernized Intelligence Database).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun midbCat(): Optional<String> = midbCat.getOptional("midbCat")

    /**
     * The MIL-STD-2525B symbology code that applies to the subject of this track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mil2525Bstr(): Optional<String> = mil2525Bstr.getOptional("mil2525Bstr")

    /**
     * The Maritime Mobile Service Identity of the vessel. MMSI is a nine-digit number that
     * identifies the transmitter station of the vessel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mmsi(): Optional<Int> = mmsi.getOptional("mmsi")

    /**
     * Optional message type designation.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun msgType(): Optional<String> = msgType.getOptional("msgType")

    /**
     * The status of the missile track in this record, if reporting a missile track (e.g. AT LAUNCH,
     * AT OBSERVATION, FLYING, IMPACTED, LOST, STALE, DEBRIS).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun mslStatus(): Optional<String> = mslStatus.getOptional("mslStatus")

    /**
     * Source of the Missile-Unique Identifier (MUID), if reporting a missile track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun muidSrc(): Optional<String> = muidSrc.getOptional("muidSrc")

    /**
     * Track ID for the source of the Missile-Unique Identifier (MUID), if reporting a missile
     * track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun muidSrcTrk(): Optional<String> = muidSrcTrk.getOptional("muidSrcTrk")

    /**
     * Track name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The AIS Navigational Status of the vessel (e.g. Underway Using Engine, Moored, Aground,
     * etc.). Intended as, but not constrained to, the USCG NAVCEN navigation status definitions.
     * Users should refer to USCG Navigation Center documentation for specific definitions
     * associated with navigation status. USCG NAVCEN documentation may be found at
     * https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun navStatus(): Optional<String> = navStatus.getOptional("navStatus")

    /**
     * The Naval Tactical Data System (NTDS) track number assigned to this track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun ntds(): Optional<String> = ntds.getOptional("ntds")

    /**
     * The number of blades per shaft of the track object. Applicable for maritime vessels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numBlades(): Optional<Int> = numBlades.getOptional("numBlades")

    /**
     * The number of shafts on the track object. Applicable for maritime vessels.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun numShafts(): Optional<Int> = numShafts.getOptional("numShafts")

    /**
     * The activity in which the track object is engaged. Intended as, but not constrained to,
     * MIL-STD-6016 environment dependent activity designations. The activity can be reported as
     * either a combination of the code and environment (e.g. 65/AIR) or as the descriptive
     * enumeration (e.g. DIVERTING), which are equivalent. For cases in which no MIl-STD-6016
     * designation exists, a general description can be used (e.g. ANTISPACE WARFARE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objAct(): Optional<String> = objAct.getOptional("objAct")

    /**
     * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
     * PENDING, SUSPECT, UNKNOWN):
     *
     * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
     * and/or origin.
     *
     * FRIEND: Track object supporting friendly forces and belonging to a declared friendly nation
     * or entity.
     *
     * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
     * contribute to a threat to friendly forces or their mission due to its behavior,
     * characteristics, nationality, or origin.
     *
     * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin indicate
     * that it is neither supporting nor opposing friendly forces or their mission.
     *
     * PENDING: Track object which has not been evaluated.
     *
     * SUSPECT: Track object deemed potentially hostile due to the object characteristics, behavior,
     * nationality, and/or origin.
     *
     * UNKNOWN: Track object which has been evaluated and does not meet criteria for any standard
     * identity.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objIdent(): Optional<ObjIdent> = objIdent.getOptional("objIdent")

    /**
     * Nationality of the tracked object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objNat(): Optional<String> = objNat.getOptional("objNat")

    /**
     * The object platform type is intended as, but not constrained to, MIL-STD-6016 environment
     * dependent platform type designations. The platform type can be reported as either a
     * combination of the code and environment (e.g. 14/LAND) or as the descriptive representations
     * (e.g. COMBAT VEHICLE), which are equivalent. For cases in which no MIl-STD-6016 designation
     * exists, a general description can be used (e.g. SATELLITE).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objPlat(): Optional<String> = objPlat.getOptional("objPlat")

    /**
     * The generic classification of the track object/group (e.g., BALLISTIC, HELICOPTER, TRACKED,
     * WATERCRAFT, WHEELED, etc.). Referenced, but not constrained to, NATO STANAG 4676 object type
     * classifications.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun objType(): Optional<String> = objType.getOptional("objType")

    /**
     * Indicator position (OFF, ON, UNK) for optional floating navigational aids only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun offPosInd(): Optional<String> = offPosInd.getOptional("offPosInd")

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
     * Original source cross-reference code for the Command that originated the report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun origXref(): Optional<String> = origXref.getOptional("origXref")

    /**
     * The O-suffix associated with this facility. The O-suffix is a five-character alpha/numeric
     * system used to identify a facility, or demographic area, within an installation. The
     * Installation Basic Encyclopedia (beNumber), in conjunction with the O-suffix, uniquely
     * identifies the facility within the Modernized Integrated Database (MIDB). The Installation
     * beNumber and oSuffix are also used in conjunction with the midbCat code to classify the
     * function or purpose of the facility.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun oSuffix(): Optional<String> = oSuffix.getOptional("oSuffix")

    /**
     * The Pseudo Identification Feature (PIF) number is a four digit code that provides an exact ID
     * for the ship or aircraft. Friendly military only.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pif(): Optional<String> = pif.getOptional("pif")

    /**
     * This value represents the site number of a specific electronic site or its associated
     * equipment.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pin(): Optional<String> = pin.getOptional("pin")

    /**
     * WGS-84 azimuth corridor reference point latitude, in degrees. -90 to 90 degrees (negative
     * values south of equator).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarSingLocLat(): Optional<Double> = polarSingLocLat.getOptional("polarSingLocLat")

    /**
     * WGS-84 azimuth corridor reference point longitude, in degrees. -180 to 180 degrees (negative
     * values west of Prime Meridian).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun polarSingLocLon(): Optional<Double> = polarSingLocLon.getOptional("polarSingLocLon")

    /**
     * The type of electronic position fixing device (e.g. GPS, GLONASS, etc.). Intended as, but not
     * constrained to, the USCG NAVCEN electronic position fixing device definitions. Users should
     * refer to USCG Navigation Center documentation for specific device type information. USCG
     * NAVCEN documentation may be found at https://www.navcen.uscg.gov.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun posDeviceType(): Optional<String> = posDeviceType.getOptional("posDeviceType")

    /**
     * Pulse repetition frequency of the emitter, measured in pulses per second. PRF is the number
     * of pulses transmitted per second. This is the reciprocal of the pri value.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun prf(): Optional<Double> = prf.getOptional("prf")

    /**
     * Pulse repetition interval of the emitter, measured in microseconds. The interval between the
     * start of one pulse and the start of another.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pri(): Optional<Double> = pri.getOptional("pri")

    /**
     * The number of propeller revolutions per minute for a submarine or ship.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun propRpm(): Optional<Double> = propRpm.getOptional("propRPM")

    /**
     * The type of propulsion employed by the track object (Diesel, Nuclear).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun propType(): Optional<String> = propType.getOptional("propType")

    /**
     * Pulse width of the emitter, measured in microseconds. This is the duration of the pulse.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pw(): Optional<Double> = pw.getOptional("pw")

    /**
     * Flag indicating for the track represents a reduced force object or group. Based on
     * MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reduced(): Optional<Boolean> = reduced.getOptional("reduced")

    /**
     * Flag indicating that this track represents a reinforced object or group. Based on
     * MIL-STD-2525 symbology definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun reinforced(): Optional<Boolean> = reinforced.getOptional("reinforced")

    /**
     * Flag indicating whether this track is archived.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rptArchived(): Optional<Boolean> = rptArchived.getOptional("rptArchived")

    /**
     * Source cross-reference code for the Command that originated the track report.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rptChxref(): Optional<String> = rptChxref.getOptional("rptChxref")

    /**
     * A Reference Track Number used to associate information and directives with the track.
     * Referenced, but not constrained to, MIL-STD-6016F Reference Track Number. The 'rtnMsgTs' and
     * 'rtn' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rtn(): Optional<List<String>> = rtn.getOptional("rtn")

    /**
     * The name of the Command reporting the Received Track Number (RTN).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rtnCmd(): Optional<String> = rtnCmd.getOptional("rtnCmd")

    /**
     * The message timestamp that the reference track position was recorded, in ISO 8601 UTC format
     * with microsecond precision. The 'rtnMsgTs' and 'rtn' arrays must match in size.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rtnMsgTs(): Optional<List<OffsetDateTime>> = rtnMsgTs.getOptional("rtnMsgTs")

    /**
     * Value representing the state of the Received Track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun rtnTrkState(): Optional<String> = rtnTrkState.getOptional("rtnTrkState")

    /**
     * Scan rate of the emitter, measured in seconds per rotation (SPR).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scanRate(): Optional<Double> = scanRate.getOptional("scanRate")

    /**
     * Type of radar scan.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scanType(): Optional<String> = scanType.getOptional("scanType")

    /**
     * The Sequential Contact Number (SCN) for this track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun scn(): Optional<Int> = scn.getOptional("scn")

    /**
     * The Ship Control Number (SCONUM) is a naval vessel identification number (alphanumeric code)
     * assigned by the Office of Naval Intelligence. SCONUM is sometimes referred to as NOIC ID.
     * SCONUMs are typically of the form A#####, where A is an alpha character and # is numerical.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sconum(): Optional<String> = sconum.getOptional("sconum")

    /**
     * Flag indicating that this track is self reported.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun selfReport(): Optional<Boolean> = selfReport.getOptional("selfReport")

    /**
     * Id/name of sensor providing the track data.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sen(): Optional<String> = sen.getOptional("sen")

    /**
     * The common name for a group of ships with similar design, usually named for the first vessel
     * of the class.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shipClass(): Optional<String> = shipClass.getOptional("shipClass")

    /**
     * Abbreviated track name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun shortName(): Optional<String> = shortName.getOptional("shortName")

    /**
     * The unique identifier of the source node.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sourceUid(): Optional<String> = sourceUid.getOptional("sourceUid")

    /**
     * Space amplification indicates additional information on the space environment object being
     * reported (e.g. DEBRIS, FUEL-AIR EXPLOSIVE, NUCLEAR WARHEAD).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spaceAmp(): Optional<String> = spaceAmp.getOptional("spaceAmp")

    /**
     * Confidence level of the amplifying characteristics. Values range from 0 to 6, with 0
     * indicating the lowest confidence and 6 indicating the highest.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spaceAmpConf(): Optional<Int> = spaceAmpConf.getOptional("spaceAmpConf")

    /**
     * Specific type of point or track with an environment of space.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spaceSpecType(): Optional<String> = spaceSpecType.getOptional("spaceSpecType")

    /**
     * Track object speed, in meters/sec.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun spd(): Optional<Double> = spd.getOptional("spd")

    /**
     * A text amplifier for units, equipment and installations; content is implementation specific.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun staffCmts(): Optional<String> = staffCmts.getOptional("staffCmts")

    /**
     * The stern type code (Counter, Cruiser) associated with the track object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sternType(): Optional<String> = sternType.getOptional("sternType")

    /**
     * Flag indicating that this track represents a task force. Based on MIL-STD-2525 symbology
     * definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun taskForce(): Optional<Boolean> = taskForce.getOptional("taskForce")

    /**
     * The time, in ISO 8601 UTC format with millisecond precision, of the closest point of approach
     * between this track and the master reference track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tcpa(): Optional<OffsetDateTime> = tcpa.getOptional("tcpa")

    /**
     * Threat Event System Track ID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tesEventId(): Optional<String> = tesEventId.getOptional("tesEventId")

    /**
     * Motion model Time On Leg in hours.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tol(): Optional<Double> = tol.getOptional("tol")

    /**
     * The number of turns of the vessel propellers per knot of forward motion.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun tpk(): Optional<Double> = tpk.getOptional("tpk")

    /**
     * Overall track confidence estimate (not standardized, but typically a value between 0 and 1,
     * with 0 indicating lowest confidence).
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkConf(): Optional<Double> = trkConf.getOptional("trkConf")

    /**
     * UUID identifying the track, which should remain the same on subsequent tracks of the same
     * object.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkId(): Optional<String> = trkId.getOptional("trkId")

    /**
     * The track number (TN) of a surveillance entity. Intended as, but not constrained to, the
     * J-series track number encoded as five character alpha-numeric characters. Users should refer
     * to J-series documentation for specific TN definitions.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkNum(): Optional<String> = trkNum.getOptional("trkNum")

    /**
     * Track Quality is reported as an integer from 0-15. Track Quality specifies the reliability of
     * the positional information of a reported track; Higher values indicate higher track quality,
     * i.e., lower errors in reported position.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkQual(): Optional<Int> = trkQual.getOptional("trkQual")

    /**
     * Value Indicating the scope of this track: 1 - TERMINAL (Terminal) - available only on the
     * workstation where they were created. 2 - LOCAL (Local) - available only on workstations in
     * the local area network 3 - OTH (Over the Horizon) - available to everyone.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trkScope(): Optional<String> = trkScope.getOptional("trkScope")

    /**
     * Transponder ID for the track. This does not correspond to the UDL transponder schema.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trnspdrId(): Optional<String> = trnspdrId.getOptional("trnspdrId")

    /**
     * Transponder type for the track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun trnspdrType(): Optional<String> = trnspdrType.getOptional("trnspdrType")

    /**
     * The weight, in tons, of the vessel associated with this track.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vslWt(): Optional<Double> = vslWt.getOptional("vslWt")

    /**
     * The breadth of the vessel, in meters. A value of 63 indicates a vessel breadth of 63 meters
     * or greater.
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
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [lon].
     *
     * Unlike [lon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lon") @ExcludeMissing fun _lon(): JsonField<Double> = lon

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
     * Returns the raw JSON value of [acftSubType].
     *
     * Unlike [acftSubType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acftSubType") @ExcludeMissing fun _acftSubType(): JsonField<String> = acftSubType

    /**
     * Returns the raw JSON value of [addInfo].
     *
     * Unlike [addInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addInfo") @ExcludeMissing fun _addInfo(): JsonField<String> = addInfo

    /**
     * Returns the raw JSON value of [alert].
     *
     * Unlike [alert], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert") @ExcludeMissing fun _alert(): JsonField<String> = alert

    /**
     * Returns the raw JSON value of [alt].
     *
     * Unlike [alt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alt") @ExcludeMissing fun _alt(): JsonField<Double> = alt

    /**
     * Returns the raw JSON value of [angElev].
     *
     * Unlike [angElev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("angElev") @ExcludeMissing fun _angElev(): JsonField<Double> = angElev

    /**
     * Returns the raw JSON value of [antennaRefDimensions].
     *
     * Unlike [antennaRefDimensions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("antennaRefDimensions")
    @ExcludeMissing
    fun _antennaRefDimensions(): JsonField<List<Double>> = antennaRefDimensions

    /**
     * Returns the raw JSON value of [aouRptData].
     *
     * Unlike [aouRptData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aouRptData")
    @ExcludeMissing
    fun _aouRptData(): JsonField<List<Double>> = aouRptData

    /**
     * Returns the raw JSON value of [aouRptType].
     *
     * Unlike [aouRptType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aouRptType") @ExcludeMissing fun _aouRptType(): JsonField<String> = aouRptType

    /**
     * Returns the raw JSON value of [appGrp].
     *
     * Unlike [appGrp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appGrp") @ExcludeMissing fun _appGrp(): JsonField<String> = appGrp

    /**
     * Returns the raw JSON value of [arrCargo].
     *
     * Unlike [arrCargo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrCargo") @ExcludeMissing fun _arrCargo(): JsonField<String> = arrCargo

    /**
     * Returns the raw JSON value of [arrFlag].
     *
     * Unlike [arrFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrFlag") @ExcludeMissing fun _arrFlag(): JsonField<String> = arrFlag

    /**
     * Returns the raw JSON value of [arrPort].
     *
     * Unlike [arrPort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrPort") @ExcludeMissing fun _arrPort(): JsonField<String> = arrPort

    /**
     * Returns the raw JSON value of [arrTime].
     *
     * Unlike [arrTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("arrTime") @ExcludeMissing fun _arrTime(): JsonField<OffsetDateTime> = arrTime

    /**
     * Returns the raw JSON value of [aton].
     *
     * Unlike [aton], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aton") @ExcludeMissing fun _aton(): JsonField<String> = aton

    /**
     * Returns the raw JSON value of [avgSpd].
     *
     * Unlike [avgSpd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avgSpd") @ExcludeMissing fun _avgSpd(): JsonField<Double> = avgSpd

    /**
     * Returns the raw JSON value of [azCorrArcWidth].
     *
     * Unlike [azCorrArcWidth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("azCorrArcWidth")
    @ExcludeMissing
    fun _azCorrArcWidth(): JsonField<Double> = azCorrArcWidth

    /**
     * Returns the raw JSON value of [azCorrCenterLine].
     *
     * Unlike [azCorrCenterLine], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("azCorrCenterLine")
    @ExcludeMissing
    fun _azCorrCenterLine(): JsonField<Double> = azCorrCenterLine

    /**
     * Returns the raw JSON value of [beNumber].
     *
     * Unlike [beNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beNumber") @ExcludeMissing fun _beNumber(): JsonField<String> = beNumber

    /**
     * Returns the raw JSON value of [boosting].
     *
     * Unlike [boosting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boosting") @ExcludeMissing fun _boosting(): JsonField<Boolean> = boosting

    /**
     * Returns the raw JSON value of [burnoutAlt].
     *
     * Unlike [burnoutAlt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("burnoutAlt") @ExcludeMissing fun _burnoutAlt(): JsonField<Double> = burnoutAlt

    /**
     * Returns the raw JSON value of [callSign].
     *
     * Unlike [callSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callSign") @ExcludeMissing fun _callSign(): JsonField<String> = callSign

    /**
     * Returns the raw JSON value of [cargoType].
     *
     * Unlike [cargoType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cargoType") @ExcludeMissing fun _cargoType(): JsonField<String> = cargoType

    /**
     * Returns the raw JSON value of [cI].
     *
     * Unlike [cI], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cI") @ExcludeMissing fun _cI(): JsonField<String> = cI

    /**
     * Returns the raw JSON value of [containment].
     *
     * Unlike [containment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("containment") @ExcludeMissing fun _containment(): JsonField<Double> = containment

    /**
     * Returns the raw JSON value of [coopLocInd].
     *
     * Unlike [coopLocInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("coopLocInd") @ExcludeMissing fun _coopLocInd(): JsonField<String> = coopLocInd

    /**
     * Returns the raw JSON value of [course].
     *
     * Unlike [course], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("course") @ExcludeMissing fun _course(): JsonField<Double> = course

    /**
     * Returns the raw JSON value of [cpa].
     *
     * Unlike [cpa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cpa") @ExcludeMissing fun _cpa(): JsonField<Double> = cpa

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
     * Returns the raw JSON value of [depCargo].
     *
     * Unlike [depCargo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depCargo") @ExcludeMissing fun _depCargo(): JsonField<String> = depCargo

    /**
     * Returns the raw JSON value of [depFlag].
     *
     * Unlike [depFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depFlag") @ExcludeMissing fun _depFlag(): JsonField<String> = depFlag

    /**
     * Returns the raw JSON value of [depPort].
     *
     * Unlike [depPort], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("depPort") @ExcludeMissing fun _depPort(): JsonField<String> = depPort

    /**
     * Returns the raw JSON value of [desCargo].
     *
     * Unlike [desCargo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("desCargo") @ExcludeMissing fun _desCargo(): JsonField<String> = desCargo

    /**
     * Returns the raw JSON value of [desFlag].
     *
     * Unlike [desFlag], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("desFlag") @ExcludeMissing fun _desFlag(): JsonField<String> = desFlag

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [disId].
     *
     * Unlike [disId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disId") @ExcludeMissing fun _disId(): JsonField<String> = disId

    /**
     * Returns the raw JSON value of [draught].
     *
     * Unlike [draught], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("draught") @ExcludeMissing fun _draught(): JsonField<Double> = draught

    /**
     * Returns the raw JSON value of [dropPtInd].
     *
     * Unlike [dropPtInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dropPtInd") @ExcludeMissing fun _dropPtInd(): JsonField<Boolean> = dropPtInd

    /**
     * Returns the raw JSON value of [dummy].
     *
     * Unlike [dummy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dummy") @ExcludeMissing fun _dummy(): JsonField<Boolean> = dummy

    /**
     * Returns the raw JSON value of [ecefPos].
     *
     * Unlike [ecefPos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ecefPos") @ExcludeMissing fun _ecefPos(): JsonField<List<Double>> = ecefPos

    /**
     * Returns the raw JSON value of [ecefVel].
     *
     * Unlike [ecefVel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ecefVel") @ExcludeMissing fun _ecefVel(): JsonField<List<Double>> = ecefVel

    /**
     * Returns the raw JSON value of [elnot1].
     *
     * Unlike [elnot1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elnot1") @ExcludeMissing fun _elnot1(): JsonField<String> = elnot1

    /**
     * Returns the raw JSON value of [elnot2].
     *
     * Unlike [elnot2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("elnot2") @ExcludeMissing fun _elnot2(): JsonField<String> = elnot2

    /**
     * Returns the raw JSON value of [emgInd].
     *
     * Unlike [emgInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emgInd") @ExcludeMissing fun _emgInd(): JsonField<Boolean> = emgInd

    /**
     * Returns the raw JSON value of [emitterName].
     *
     * Unlike [emitterName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("emitterName") @ExcludeMissing fun _emitterName(): JsonField<String> = emitterName

    /**
     * Returns the raw JSON value of [env].
     *
     * Unlike [env], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("env") @ExcludeMissing fun _env(): JsonField<Env> = env

    /**
     * Returns the raw JSON value of [errAreaOrient].
     *
     * Unlike [errAreaOrient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errAreaOrient")
    @ExcludeMissing
    fun _errAreaOrient(): JsonField<Double> = errAreaOrient

    /**
     * Returns the raw JSON value of [errGeoAreaSwitch].
     *
     * Unlike [errGeoAreaSwitch], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("errGeoAreaSwitch")
    @ExcludeMissing
    fun _errGeoAreaSwitch(): JsonField<String> = errGeoAreaSwitch

    /**
     * Returns the raw JSON value of [errSemiIntAxis].
     *
     * Unlike [errSemiIntAxis], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errSemiIntAxis")
    @ExcludeMissing
    fun _errSemiIntAxis(): JsonField<Double> = errSemiIntAxis

    /**
     * Returns the raw JSON value of [errSemiMajElev].
     *
     * Unlike [errSemiMajElev], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errSemiMajElev")
    @ExcludeMissing
    fun _errSemiMajElev(): JsonField<Double> = errSemiMajElev

    /**
     * Returns the raw JSON value of [eta].
     *
     * Unlike [eta], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eta") @ExcludeMissing fun _eta(): JsonField<OffsetDateTime> = eta

    /**
     * Returns the raw JSON value of [etd].
     *
     * Unlike [etd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("etd") @ExcludeMissing fun _etd(): JsonField<OffsetDateTime> = etd

    /**
     * Returns the raw JSON value of [evalRating].
     *
     * Unlike [evalRating], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("evalRating") @ExcludeMissing fun _evalRating(): JsonField<String> = evalRating

    /**
     * Returns the raw JSON value of [feint].
     *
     * Unlike [feint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feint") @ExcludeMissing fun _feint(): JsonField<Boolean> = feint

    /**
     * Returns the raw JSON value of [freq].
     *
     * Unlike [freq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("freq") @ExcludeMissing fun _freq(): JsonField<Double> = freq

    /**
     * Returns the raw JSON value of [ftn].
     *
     * Unlike [ftn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ftn") @ExcludeMissing fun _ftn(): JsonField<String> = ftn

    /**
     * Returns the raw JSON value of [ftnCmd].
     *
     * Unlike [ftnCmd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ftnCmd") @ExcludeMissing fun _ftnCmd(): JsonField<String> = ftnCmd

    /**
     * Returns the raw JSON value of [ftnMsgTs].
     *
     * Unlike [ftnMsgTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ftnMsgTs") @ExcludeMissing fun _ftnMsgTs(): JsonField<OffsetDateTime> = ftnMsgTs

    /**
     * Returns the raw JSON value of [harmonics].
     *
     * Unlike [harmonics], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("harmonics") @ExcludeMissing fun _harmonics(): JsonField<String> = harmonics

    /**
     * Returns the raw JSON value of [hdng].
     *
     * Unlike [hdng], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hdng") @ExcludeMissing fun _hdng(): JsonField<Double> = hdng

    /**
     * Returns the raw JSON value of [hq].
     *
     * Unlike [hq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hq") @ExcludeMissing fun _hq(): JsonField<Boolean> = hq

    /**
     * Returns the raw JSON value of [hullNum].
     *
     * Unlike [hullNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hullNum") @ExcludeMissing fun _hullNum(): JsonField<String> = hullNum

    /**
     * Returns the raw JSON value of [hullProf].
     *
     * Unlike [hullProf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hullProf") @ExcludeMissing fun _hullProf(): JsonField<String> = hullProf

    /**
     * Returns the raw JSON value of [identAmp].
     *
     * Unlike [identAmp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("identAmp") @ExcludeMissing fun _identAmp(): JsonField<String> = identAmp

    /**
     * Returns the raw JSON value of [iff].
     *
     * Unlike [iff], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iff") @ExcludeMissing fun _iff(): JsonField<String> = iff

    /**
     * Returns the raw JSON value of [imon].
     *
     * Unlike [imon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("imon") @ExcludeMissing fun _imon(): JsonField<Int> = imon

    /**
     * Returns the raw JSON value of [impactAouData].
     *
     * Unlike [impactAouData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactAouData")
    @ExcludeMissing
    fun _impactAouData(): JsonField<List<Double>> = impactAouData

    /**
     * Returns the raw JSON value of [impactAouType].
     *
     * Unlike [impactAouType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactAouType")
    @ExcludeMissing
    fun _impactAouType(): JsonField<String> = impactAouType

    /**
     * Returns the raw JSON value of [impactLat].
     *
     * Unlike [impactLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactLat") @ExcludeMissing fun _impactLat(): JsonField<Double> = impactLat

    /**
     * Returns the raw JSON value of [impactLon].
     *
     * Unlike [impactLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactLon") @ExcludeMissing fun _impactLon(): JsonField<Double> = impactLon

    /**
     * Returns the raw JSON value of [impactTime].
     *
     * Unlike [impactTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impactTime")
    @ExcludeMissing
    fun _impactTime(): JsonField<OffsetDateTime> = impactTime

    /**
     * Returns the raw JSON value of [infoSource].
     *
     * Unlike [infoSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("infoSource") @ExcludeMissing fun _infoSource(): JsonField<String> = infoSource

    /**
     * Returns the raw JSON value of [installation].
     *
     * Unlike [installation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("installation")
    @ExcludeMissing
    fun _installation(): JsonField<Boolean> = installation

    /**
     * Returns the raw JSON value of [launchAouData].
     *
     * Unlike [launchAouData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAouData")
    @ExcludeMissing
    fun _launchAouData(): JsonField<List<Double>> = launchAouData

    /**
     * Returns the raw JSON value of [launchAouType].
     *
     * Unlike [launchAouType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchAouType")
    @ExcludeMissing
    fun _launchAouType(): JsonField<String> = launchAouType

    /**
     * Returns the raw JSON value of [launchLat].
     *
     * Unlike [launchLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchLat") @ExcludeMissing fun _launchLat(): JsonField<Double> = launchLat

    /**
     * Returns the raw JSON value of [launchLon].
     *
     * Unlike [launchLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchLon") @ExcludeMissing fun _launchLon(): JsonField<Double> = launchLon

    /**
     * Returns the raw JSON value of [launchTime].
     *
     * Unlike [launchTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("launchTime")
    @ExcludeMissing
    fun _launchTime(): JsonField<OffsetDateTime> = launchTime

    /**
     * Returns the raw JSON value of [length].
     *
     * Unlike [length], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("length") @ExcludeMissing fun _length(): JsonField<Double> = length

    /**
     * Returns the raw JSON value of [lostTrkInd].
     *
     * Unlike [lostTrkInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lostTrkInd") @ExcludeMissing fun _lostTrkInd(): JsonField<Boolean> = lostTrkInd

    /**
     * Returns the raw JSON value of [maneuverInd].
     *
     * Unlike [maneuverInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maneuverInd") @ExcludeMissing fun _maneuverInd(): JsonField<String> = maneuverInd

    /**
     * Returns the raw JSON value of [maxFreq].
     *
     * Unlike [maxFreq], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxFreq") @ExcludeMissing fun _maxFreq(): JsonField<Double> = maxFreq

    /**
     * Returns the raw JSON value of [midbCat].
     *
     * Unlike [midbCat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("midbCat") @ExcludeMissing fun _midbCat(): JsonField<String> = midbCat

    /**
     * Returns the raw JSON value of [mil2525Bstr].
     *
     * Unlike [mil2525Bstr], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mil2525Bstr") @ExcludeMissing fun _mil2525Bstr(): JsonField<String> = mil2525Bstr

    /**
     * Returns the raw JSON value of [mmsi].
     *
     * Unlike [mmsi], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mmsi") @ExcludeMissing fun _mmsi(): JsonField<Int> = mmsi

    /**
     * Returns the raw JSON value of [msgType].
     *
     * Unlike [msgType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("msgType") @ExcludeMissing fun _msgType(): JsonField<String> = msgType

    /**
     * Returns the raw JSON value of [mslStatus].
     *
     * Unlike [mslStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mslStatus") @ExcludeMissing fun _mslStatus(): JsonField<String> = mslStatus

    /**
     * Returns the raw JSON value of [muidSrc].
     *
     * Unlike [muidSrc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("muidSrc") @ExcludeMissing fun _muidSrc(): JsonField<String> = muidSrc

    /**
     * Returns the raw JSON value of [muidSrcTrk].
     *
     * Unlike [muidSrcTrk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("muidSrcTrk") @ExcludeMissing fun _muidSrcTrk(): JsonField<String> = muidSrcTrk

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [navStatus].
     *
     * Unlike [navStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("navStatus") @ExcludeMissing fun _navStatus(): JsonField<String> = navStatus

    /**
     * Returns the raw JSON value of [ntds].
     *
     * Unlike [ntds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ntds") @ExcludeMissing fun _ntds(): JsonField<String> = ntds

    /**
     * Returns the raw JSON value of [numBlades].
     *
     * Unlike [numBlades], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numBlades") @ExcludeMissing fun _numBlades(): JsonField<Int> = numBlades

    /**
     * Returns the raw JSON value of [numShafts].
     *
     * Unlike [numShafts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numShafts") @ExcludeMissing fun _numShafts(): JsonField<Int> = numShafts

    /**
     * Returns the raw JSON value of [objAct].
     *
     * Unlike [objAct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objAct") @ExcludeMissing fun _objAct(): JsonField<String> = objAct

    /**
     * Returns the raw JSON value of [objIdent].
     *
     * Unlike [objIdent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objIdent") @ExcludeMissing fun _objIdent(): JsonField<ObjIdent> = objIdent

    /**
     * Returns the raw JSON value of [objNat].
     *
     * Unlike [objNat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objNat") @ExcludeMissing fun _objNat(): JsonField<String> = objNat

    /**
     * Returns the raw JSON value of [objPlat].
     *
     * Unlike [objPlat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objPlat") @ExcludeMissing fun _objPlat(): JsonField<String> = objPlat

    /**
     * Returns the raw JSON value of [objType].
     *
     * Unlike [objType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("objType") @ExcludeMissing fun _objType(): JsonField<String> = objType

    /**
     * Returns the raw JSON value of [offPosInd].
     *
     * Unlike [offPosInd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("offPosInd") @ExcludeMissing fun _offPosInd(): JsonField<String> = offPosInd

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
     * Returns the raw JSON value of [origXref].
     *
     * Unlike [origXref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("origXref") @ExcludeMissing fun _origXref(): JsonField<String> = origXref

    /**
     * Returns the raw JSON value of [oSuffix].
     *
     * Unlike [oSuffix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oSuffix") @ExcludeMissing fun _oSuffix(): JsonField<String> = oSuffix

    /**
     * Returns the raw JSON value of [pif].
     *
     * Unlike [pif], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pif") @ExcludeMissing fun _pif(): JsonField<String> = pif

    /**
     * Returns the raw JSON value of [pin].
     *
     * Unlike [pin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pin") @ExcludeMissing fun _pin(): JsonField<String> = pin

    /**
     * Returns the raw JSON value of [polarSingLocLat].
     *
     * Unlike [polarSingLocLat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarSingLocLat")
    @ExcludeMissing
    fun _polarSingLocLat(): JsonField<Double> = polarSingLocLat

    /**
     * Returns the raw JSON value of [polarSingLocLon].
     *
     * Unlike [polarSingLocLon], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("polarSingLocLon")
    @ExcludeMissing
    fun _polarSingLocLon(): JsonField<Double> = polarSingLocLon

    /**
     * Returns the raw JSON value of [posDeviceType].
     *
     * Unlike [posDeviceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("posDeviceType")
    @ExcludeMissing
    fun _posDeviceType(): JsonField<String> = posDeviceType

    /**
     * Returns the raw JSON value of [prf].
     *
     * Unlike [prf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prf") @ExcludeMissing fun _prf(): JsonField<Double> = prf

    /**
     * Returns the raw JSON value of [pri].
     *
     * Unlike [pri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pri") @ExcludeMissing fun _pri(): JsonField<Double> = pri

    /**
     * Returns the raw JSON value of [propRpm].
     *
     * Unlike [propRpm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propRPM") @ExcludeMissing fun _propRpm(): JsonField<Double> = propRpm

    /**
     * Returns the raw JSON value of [propType].
     *
     * Unlike [propType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("propType") @ExcludeMissing fun _propType(): JsonField<String> = propType

    /**
     * Returns the raw JSON value of [pw].
     *
     * Unlike [pw], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pw") @ExcludeMissing fun _pw(): JsonField<Double> = pw

    /**
     * Returns the raw JSON value of [reduced].
     *
     * Unlike [reduced], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reduced") @ExcludeMissing fun _reduced(): JsonField<Boolean> = reduced

    /**
     * Returns the raw JSON value of [reinforced].
     *
     * Unlike [reinforced], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reinforced") @ExcludeMissing fun _reinforced(): JsonField<Boolean> = reinforced

    /**
     * Returns the raw JSON value of [rptArchived].
     *
     * Unlike [rptArchived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rptArchived")
    @ExcludeMissing
    fun _rptArchived(): JsonField<Boolean> = rptArchived

    /**
     * Returns the raw JSON value of [rptChxref].
     *
     * Unlike [rptChxref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rptChxref") @ExcludeMissing fun _rptChxref(): JsonField<String> = rptChxref

    /**
     * Returns the raw JSON value of [rtn].
     *
     * Unlike [rtn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rtn") @ExcludeMissing fun _rtn(): JsonField<List<String>> = rtn

    /**
     * Returns the raw JSON value of [rtnCmd].
     *
     * Unlike [rtnCmd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rtnCmd") @ExcludeMissing fun _rtnCmd(): JsonField<String> = rtnCmd

    /**
     * Returns the raw JSON value of [rtnMsgTs].
     *
     * Unlike [rtnMsgTs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rtnMsgTs")
    @ExcludeMissing
    fun _rtnMsgTs(): JsonField<List<OffsetDateTime>> = rtnMsgTs

    /**
     * Returns the raw JSON value of [rtnTrkState].
     *
     * Unlike [rtnTrkState], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rtnTrkState") @ExcludeMissing fun _rtnTrkState(): JsonField<String> = rtnTrkState

    /**
     * Returns the raw JSON value of [scanRate].
     *
     * Unlike [scanRate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanRate") @ExcludeMissing fun _scanRate(): JsonField<Double> = scanRate

    /**
     * Returns the raw JSON value of [scanType].
     *
     * Unlike [scanType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scanType") @ExcludeMissing fun _scanType(): JsonField<String> = scanType

    /**
     * Returns the raw JSON value of [scn].
     *
     * Unlike [scn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scn") @ExcludeMissing fun _scn(): JsonField<Int> = scn

    /**
     * Returns the raw JSON value of [sconum].
     *
     * Unlike [sconum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sconum") @ExcludeMissing fun _sconum(): JsonField<String> = sconum

    /**
     * Returns the raw JSON value of [selfReport].
     *
     * Unlike [selfReport], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("selfReport") @ExcludeMissing fun _selfReport(): JsonField<Boolean> = selfReport

    /**
     * Returns the raw JSON value of [sen].
     *
     * Unlike [sen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sen") @ExcludeMissing fun _sen(): JsonField<String> = sen

    /**
     * Returns the raw JSON value of [shipClass].
     *
     * Unlike [shipClass], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipClass") @ExcludeMissing fun _shipClass(): JsonField<String> = shipClass

    /**
     * Returns the raw JSON value of [shortName].
     *
     * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

    /**
     * Returns the raw JSON value of [sourceUid].
     *
     * Unlike [sourceUid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceUid") @ExcludeMissing fun _sourceUid(): JsonField<String> = sourceUid

    /**
     * Returns the raw JSON value of [spaceAmp].
     *
     * Unlike [spaceAmp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spaceAmp") @ExcludeMissing fun _spaceAmp(): JsonField<String> = spaceAmp

    /**
     * Returns the raw JSON value of [spaceAmpConf].
     *
     * Unlike [spaceAmpConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spaceAmpConf") @ExcludeMissing fun _spaceAmpConf(): JsonField<Int> = spaceAmpConf

    /**
     * Returns the raw JSON value of [spaceSpecType].
     *
     * Unlike [spaceSpecType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spaceSpecType")
    @ExcludeMissing
    fun _spaceSpecType(): JsonField<String> = spaceSpecType

    /**
     * Returns the raw JSON value of [spd].
     *
     * Unlike [spd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spd") @ExcludeMissing fun _spd(): JsonField<Double> = spd

    /**
     * Returns the raw JSON value of [staffCmts].
     *
     * Unlike [staffCmts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("staffCmts") @ExcludeMissing fun _staffCmts(): JsonField<String> = staffCmts

    /**
     * Returns the raw JSON value of [sternType].
     *
     * Unlike [sternType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sternType") @ExcludeMissing fun _sternType(): JsonField<String> = sternType

    /**
     * Returns the raw JSON value of [taskForce].
     *
     * Unlike [taskForce], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taskForce") @ExcludeMissing fun _taskForce(): JsonField<Boolean> = taskForce

    /**
     * Returns the raw JSON value of [tcpa].
     *
     * Unlike [tcpa], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tcpa") @ExcludeMissing fun _tcpa(): JsonField<OffsetDateTime> = tcpa

    /**
     * Returns the raw JSON value of [tesEventId].
     *
     * Unlike [tesEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tesEventId") @ExcludeMissing fun _tesEventId(): JsonField<String> = tesEventId

    /**
     * Returns the raw JSON value of [tol].
     *
     * Unlike [tol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tol") @ExcludeMissing fun _tol(): JsonField<Double> = tol

    /**
     * Returns the raw JSON value of [tpk].
     *
     * Unlike [tpk], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tpk") @ExcludeMissing fun _tpk(): JsonField<Double> = tpk

    /**
     * Returns the raw JSON value of [trkConf].
     *
     * Unlike [trkConf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkConf") @ExcludeMissing fun _trkConf(): JsonField<Double> = trkConf

    /**
     * Returns the raw JSON value of [trkId].
     *
     * Unlike [trkId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkId") @ExcludeMissing fun _trkId(): JsonField<String> = trkId

    /**
     * Returns the raw JSON value of [trkNum].
     *
     * Unlike [trkNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkNum") @ExcludeMissing fun _trkNum(): JsonField<String> = trkNum

    /**
     * Returns the raw JSON value of [trkQual].
     *
     * Unlike [trkQual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkQual") @ExcludeMissing fun _trkQual(): JsonField<Int> = trkQual

    /**
     * Returns the raw JSON value of [trkScope].
     *
     * Unlike [trkScope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trkScope") @ExcludeMissing fun _trkScope(): JsonField<String> = trkScope

    /**
     * Returns the raw JSON value of [trnspdrId].
     *
     * Unlike [trnspdrId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trnspdrId") @ExcludeMissing fun _trnspdrId(): JsonField<String> = trnspdrId

    /**
     * Returns the raw JSON value of [trnspdrType].
     *
     * Unlike [trnspdrType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trnspdrType") @ExcludeMissing fun _trnspdrType(): JsonField<String> = trnspdrType

    /**
     * Returns the raw JSON value of [vslWt].
     *
     * Unlike [vslWt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vslWt") @ExcludeMissing fun _vslWt(): JsonField<Double> = vslWt

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
         * Returns a mutable builder for constructing an instance of [TrackDetailsFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .lat()
         * .lon()
         * .source()
         * .ts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TrackDetailsFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var lat: JsonField<Double>? = null
        private var lon: JsonField<Double>? = null
        private var source: JsonField<String>? = null
        private var ts: JsonField<OffsetDateTime>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var acftSubType: JsonField<String> = JsonMissing.of()
        private var addInfo: JsonField<String> = JsonMissing.of()
        private var alert: JsonField<String> = JsonMissing.of()
        private var alt: JsonField<Double> = JsonMissing.of()
        private var angElev: JsonField<Double> = JsonMissing.of()
        private var antennaRefDimensions: JsonField<MutableList<Double>>? = null
        private var aouRptData: JsonField<MutableList<Double>>? = null
        private var aouRptType: JsonField<String> = JsonMissing.of()
        private var appGrp: JsonField<String> = JsonMissing.of()
        private var arrCargo: JsonField<String> = JsonMissing.of()
        private var arrFlag: JsonField<String> = JsonMissing.of()
        private var arrPort: JsonField<String> = JsonMissing.of()
        private var arrTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var aton: JsonField<String> = JsonMissing.of()
        private var avgSpd: JsonField<Double> = JsonMissing.of()
        private var azCorrArcWidth: JsonField<Double> = JsonMissing.of()
        private var azCorrCenterLine: JsonField<Double> = JsonMissing.of()
        private var beNumber: JsonField<String> = JsonMissing.of()
        private var boosting: JsonField<Boolean> = JsonMissing.of()
        private var burnoutAlt: JsonField<Double> = JsonMissing.of()
        private var callSign: JsonField<String> = JsonMissing.of()
        private var cargoType: JsonField<String> = JsonMissing.of()
        private var cI: JsonField<String> = JsonMissing.of()
        private var containment: JsonField<Double> = JsonMissing.of()
        private var coopLocInd: JsonField<String> = JsonMissing.of()
        private var course: JsonField<Double> = JsonMissing.of()
        private var cpa: JsonField<Double> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var depCargo: JsonField<String> = JsonMissing.of()
        private var depFlag: JsonField<String> = JsonMissing.of()
        private var depPort: JsonField<String> = JsonMissing.of()
        private var desCargo: JsonField<String> = JsonMissing.of()
        private var desFlag: JsonField<String> = JsonMissing.of()
        private var destination: JsonField<String> = JsonMissing.of()
        private var disId: JsonField<String> = JsonMissing.of()
        private var draught: JsonField<Double> = JsonMissing.of()
        private var dropPtInd: JsonField<Boolean> = JsonMissing.of()
        private var dummy: JsonField<Boolean> = JsonMissing.of()
        private var ecefPos: JsonField<MutableList<Double>>? = null
        private var ecefVel: JsonField<MutableList<Double>>? = null
        private var elnot1: JsonField<String> = JsonMissing.of()
        private var elnot2: JsonField<String> = JsonMissing.of()
        private var emgInd: JsonField<Boolean> = JsonMissing.of()
        private var emitterName: JsonField<String> = JsonMissing.of()
        private var env: JsonField<Env> = JsonMissing.of()
        private var errAreaOrient: JsonField<Double> = JsonMissing.of()
        private var errGeoAreaSwitch: JsonField<String> = JsonMissing.of()
        private var errSemiIntAxis: JsonField<Double> = JsonMissing.of()
        private var errSemiMajElev: JsonField<Double> = JsonMissing.of()
        private var eta: JsonField<OffsetDateTime> = JsonMissing.of()
        private var etd: JsonField<OffsetDateTime> = JsonMissing.of()
        private var evalRating: JsonField<String> = JsonMissing.of()
        private var feint: JsonField<Boolean> = JsonMissing.of()
        private var freq: JsonField<Double> = JsonMissing.of()
        private var ftn: JsonField<String> = JsonMissing.of()
        private var ftnCmd: JsonField<String> = JsonMissing.of()
        private var ftnMsgTs: JsonField<OffsetDateTime> = JsonMissing.of()
        private var harmonics: JsonField<String> = JsonMissing.of()
        private var hdng: JsonField<Double> = JsonMissing.of()
        private var hq: JsonField<Boolean> = JsonMissing.of()
        private var hullNum: JsonField<String> = JsonMissing.of()
        private var hullProf: JsonField<String> = JsonMissing.of()
        private var identAmp: JsonField<String> = JsonMissing.of()
        private var iff: JsonField<String> = JsonMissing.of()
        private var imon: JsonField<Int> = JsonMissing.of()
        private var impactAouData: JsonField<MutableList<Double>>? = null
        private var impactAouType: JsonField<String> = JsonMissing.of()
        private var impactLat: JsonField<Double> = JsonMissing.of()
        private var impactLon: JsonField<Double> = JsonMissing.of()
        private var impactTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var infoSource: JsonField<String> = JsonMissing.of()
        private var installation: JsonField<Boolean> = JsonMissing.of()
        private var launchAouData: JsonField<MutableList<Double>>? = null
        private var launchAouType: JsonField<String> = JsonMissing.of()
        private var launchLat: JsonField<Double> = JsonMissing.of()
        private var launchLon: JsonField<Double> = JsonMissing.of()
        private var launchTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var length: JsonField<Double> = JsonMissing.of()
        private var lostTrkInd: JsonField<Boolean> = JsonMissing.of()
        private var maneuverInd: JsonField<String> = JsonMissing.of()
        private var maxFreq: JsonField<Double> = JsonMissing.of()
        private var midbCat: JsonField<String> = JsonMissing.of()
        private var mil2525Bstr: JsonField<String> = JsonMissing.of()
        private var mmsi: JsonField<Int> = JsonMissing.of()
        private var msgType: JsonField<String> = JsonMissing.of()
        private var mslStatus: JsonField<String> = JsonMissing.of()
        private var muidSrc: JsonField<String> = JsonMissing.of()
        private var muidSrcTrk: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var navStatus: JsonField<String> = JsonMissing.of()
        private var ntds: JsonField<String> = JsonMissing.of()
        private var numBlades: JsonField<Int> = JsonMissing.of()
        private var numShafts: JsonField<Int> = JsonMissing.of()
        private var objAct: JsonField<String> = JsonMissing.of()
        private var objIdent: JsonField<ObjIdent> = JsonMissing.of()
        private var objNat: JsonField<String> = JsonMissing.of()
        private var objPlat: JsonField<String> = JsonMissing.of()
        private var objType: JsonField<String> = JsonMissing.of()
        private var offPosInd: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var origXref: JsonField<String> = JsonMissing.of()
        private var oSuffix: JsonField<String> = JsonMissing.of()
        private var pif: JsonField<String> = JsonMissing.of()
        private var pin: JsonField<String> = JsonMissing.of()
        private var polarSingLocLat: JsonField<Double> = JsonMissing.of()
        private var polarSingLocLon: JsonField<Double> = JsonMissing.of()
        private var posDeviceType: JsonField<String> = JsonMissing.of()
        private var prf: JsonField<Double> = JsonMissing.of()
        private var pri: JsonField<Double> = JsonMissing.of()
        private var propRpm: JsonField<Double> = JsonMissing.of()
        private var propType: JsonField<String> = JsonMissing.of()
        private var pw: JsonField<Double> = JsonMissing.of()
        private var reduced: JsonField<Boolean> = JsonMissing.of()
        private var reinforced: JsonField<Boolean> = JsonMissing.of()
        private var rptArchived: JsonField<Boolean> = JsonMissing.of()
        private var rptChxref: JsonField<String> = JsonMissing.of()
        private var rtn: JsonField<MutableList<String>>? = null
        private var rtnCmd: JsonField<String> = JsonMissing.of()
        private var rtnMsgTs: JsonField<MutableList<OffsetDateTime>>? = null
        private var rtnTrkState: JsonField<String> = JsonMissing.of()
        private var scanRate: JsonField<Double> = JsonMissing.of()
        private var scanType: JsonField<String> = JsonMissing.of()
        private var scn: JsonField<Int> = JsonMissing.of()
        private var sconum: JsonField<String> = JsonMissing.of()
        private var selfReport: JsonField<Boolean> = JsonMissing.of()
        private var sen: JsonField<String> = JsonMissing.of()
        private var shipClass: JsonField<String> = JsonMissing.of()
        private var shortName: JsonField<String> = JsonMissing.of()
        private var sourceUid: JsonField<String> = JsonMissing.of()
        private var spaceAmp: JsonField<String> = JsonMissing.of()
        private var spaceAmpConf: JsonField<Int> = JsonMissing.of()
        private var spaceSpecType: JsonField<String> = JsonMissing.of()
        private var spd: JsonField<Double> = JsonMissing.of()
        private var staffCmts: JsonField<String> = JsonMissing.of()
        private var sternType: JsonField<String> = JsonMissing.of()
        private var taskForce: JsonField<Boolean> = JsonMissing.of()
        private var tcpa: JsonField<OffsetDateTime> = JsonMissing.of()
        private var tesEventId: JsonField<String> = JsonMissing.of()
        private var tol: JsonField<Double> = JsonMissing.of()
        private var tpk: JsonField<Double> = JsonMissing.of()
        private var trkConf: JsonField<Double> = JsonMissing.of()
        private var trkId: JsonField<String> = JsonMissing.of()
        private var trkNum: JsonField<String> = JsonMissing.of()
        private var trkQual: JsonField<Int> = JsonMissing.of()
        private var trkScope: JsonField<String> = JsonMissing.of()
        private var trnspdrId: JsonField<String> = JsonMissing.of()
        private var trnspdrType: JsonField<String> = JsonMissing.of()
        private var vslWt: JsonField<Double> = JsonMissing.of()
        private var width: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(trackDetailsFull: TrackDetailsFull) = apply {
            classificationMarking = trackDetailsFull.classificationMarking
            dataMode = trackDetailsFull.dataMode
            lat = trackDetailsFull.lat
            lon = trackDetailsFull.lon
            source = trackDetailsFull.source
            ts = trackDetailsFull.ts
            id = trackDetailsFull.id
            acftSubType = trackDetailsFull.acftSubType
            addInfo = trackDetailsFull.addInfo
            alert = trackDetailsFull.alert
            alt = trackDetailsFull.alt
            angElev = trackDetailsFull.angElev
            antennaRefDimensions = trackDetailsFull.antennaRefDimensions.map { it.toMutableList() }
            aouRptData = trackDetailsFull.aouRptData.map { it.toMutableList() }
            aouRptType = trackDetailsFull.aouRptType
            appGrp = trackDetailsFull.appGrp
            arrCargo = trackDetailsFull.arrCargo
            arrFlag = trackDetailsFull.arrFlag
            arrPort = trackDetailsFull.arrPort
            arrTime = trackDetailsFull.arrTime
            aton = trackDetailsFull.aton
            avgSpd = trackDetailsFull.avgSpd
            azCorrArcWidth = trackDetailsFull.azCorrArcWidth
            azCorrCenterLine = trackDetailsFull.azCorrCenterLine
            beNumber = trackDetailsFull.beNumber
            boosting = trackDetailsFull.boosting
            burnoutAlt = trackDetailsFull.burnoutAlt
            callSign = trackDetailsFull.callSign
            cargoType = trackDetailsFull.cargoType
            cI = trackDetailsFull.cI
            containment = trackDetailsFull.containment
            coopLocInd = trackDetailsFull.coopLocInd
            course = trackDetailsFull.course
            cpa = trackDetailsFull.cpa
            createdAt = trackDetailsFull.createdAt
            createdBy = trackDetailsFull.createdBy
            depCargo = trackDetailsFull.depCargo
            depFlag = trackDetailsFull.depFlag
            depPort = trackDetailsFull.depPort
            desCargo = trackDetailsFull.desCargo
            desFlag = trackDetailsFull.desFlag
            destination = trackDetailsFull.destination
            disId = trackDetailsFull.disId
            draught = trackDetailsFull.draught
            dropPtInd = trackDetailsFull.dropPtInd
            dummy = trackDetailsFull.dummy
            ecefPos = trackDetailsFull.ecefPos.map { it.toMutableList() }
            ecefVel = trackDetailsFull.ecefVel.map { it.toMutableList() }
            elnot1 = trackDetailsFull.elnot1
            elnot2 = trackDetailsFull.elnot2
            emgInd = trackDetailsFull.emgInd
            emitterName = trackDetailsFull.emitterName
            env = trackDetailsFull.env
            errAreaOrient = trackDetailsFull.errAreaOrient
            errGeoAreaSwitch = trackDetailsFull.errGeoAreaSwitch
            errSemiIntAxis = trackDetailsFull.errSemiIntAxis
            errSemiMajElev = trackDetailsFull.errSemiMajElev
            eta = trackDetailsFull.eta
            etd = trackDetailsFull.etd
            evalRating = trackDetailsFull.evalRating
            feint = trackDetailsFull.feint
            freq = trackDetailsFull.freq
            ftn = trackDetailsFull.ftn
            ftnCmd = trackDetailsFull.ftnCmd
            ftnMsgTs = trackDetailsFull.ftnMsgTs
            harmonics = trackDetailsFull.harmonics
            hdng = trackDetailsFull.hdng
            hq = trackDetailsFull.hq
            hullNum = trackDetailsFull.hullNum
            hullProf = trackDetailsFull.hullProf
            identAmp = trackDetailsFull.identAmp
            iff = trackDetailsFull.iff
            imon = trackDetailsFull.imon
            impactAouData = trackDetailsFull.impactAouData.map { it.toMutableList() }
            impactAouType = trackDetailsFull.impactAouType
            impactLat = trackDetailsFull.impactLat
            impactLon = trackDetailsFull.impactLon
            impactTime = trackDetailsFull.impactTime
            infoSource = trackDetailsFull.infoSource
            installation = trackDetailsFull.installation
            launchAouData = trackDetailsFull.launchAouData.map { it.toMutableList() }
            launchAouType = trackDetailsFull.launchAouType
            launchLat = trackDetailsFull.launchLat
            launchLon = trackDetailsFull.launchLon
            launchTime = trackDetailsFull.launchTime
            length = trackDetailsFull.length
            lostTrkInd = trackDetailsFull.lostTrkInd
            maneuverInd = trackDetailsFull.maneuverInd
            maxFreq = trackDetailsFull.maxFreq
            midbCat = trackDetailsFull.midbCat
            mil2525Bstr = trackDetailsFull.mil2525Bstr
            mmsi = trackDetailsFull.mmsi
            msgType = trackDetailsFull.msgType
            mslStatus = trackDetailsFull.mslStatus
            muidSrc = trackDetailsFull.muidSrc
            muidSrcTrk = trackDetailsFull.muidSrcTrk
            name = trackDetailsFull.name
            navStatus = trackDetailsFull.navStatus
            ntds = trackDetailsFull.ntds
            numBlades = trackDetailsFull.numBlades
            numShafts = trackDetailsFull.numShafts
            objAct = trackDetailsFull.objAct
            objIdent = trackDetailsFull.objIdent
            objNat = trackDetailsFull.objNat
            objPlat = trackDetailsFull.objPlat
            objType = trackDetailsFull.objType
            offPosInd = trackDetailsFull.offPosInd
            origin = trackDetailsFull.origin
            origNetwork = trackDetailsFull.origNetwork
            origXref = trackDetailsFull.origXref
            oSuffix = trackDetailsFull.oSuffix
            pif = trackDetailsFull.pif
            pin = trackDetailsFull.pin
            polarSingLocLat = trackDetailsFull.polarSingLocLat
            polarSingLocLon = trackDetailsFull.polarSingLocLon
            posDeviceType = trackDetailsFull.posDeviceType
            prf = trackDetailsFull.prf
            pri = trackDetailsFull.pri
            propRpm = trackDetailsFull.propRpm
            propType = trackDetailsFull.propType
            pw = trackDetailsFull.pw
            reduced = trackDetailsFull.reduced
            reinforced = trackDetailsFull.reinforced
            rptArchived = trackDetailsFull.rptArchived
            rptChxref = trackDetailsFull.rptChxref
            rtn = trackDetailsFull.rtn.map { it.toMutableList() }
            rtnCmd = trackDetailsFull.rtnCmd
            rtnMsgTs = trackDetailsFull.rtnMsgTs.map { it.toMutableList() }
            rtnTrkState = trackDetailsFull.rtnTrkState
            scanRate = trackDetailsFull.scanRate
            scanType = trackDetailsFull.scanType
            scn = trackDetailsFull.scn
            sconum = trackDetailsFull.sconum
            selfReport = trackDetailsFull.selfReport
            sen = trackDetailsFull.sen
            shipClass = trackDetailsFull.shipClass
            shortName = trackDetailsFull.shortName
            sourceUid = trackDetailsFull.sourceUid
            spaceAmp = trackDetailsFull.spaceAmp
            spaceAmpConf = trackDetailsFull.spaceAmpConf
            spaceSpecType = trackDetailsFull.spaceSpecType
            spd = trackDetailsFull.spd
            staffCmts = trackDetailsFull.staffCmts
            sternType = trackDetailsFull.sternType
            taskForce = trackDetailsFull.taskForce
            tcpa = trackDetailsFull.tcpa
            tesEventId = trackDetailsFull.tesEventId
            tol = trackDetailsFull.tol
            tpk = trackDetailsFull.tpk
            trkConf = trackDetailsFull.trkConf
            trkId = trackDetailsFull.trkId
            trkNum = trackDetailsFull.trkNum
            trkQual = trackDetailsFull.trkQual
            trkScope = trackDetailsFull.trkScope
            trnspdrId = trackDetailsFull.trnspdrId
            trnspdrType = trackDetailsFull.trnspdrType
            vslWt = trackDetailsFull.vslWt
            width = trackDetailsFull.width
            additionalProperties = trackDetailsFull.additionalProperties.toMutableMap()
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
         * WGS-84 latitude of the track object, in degrees. -90 to 90 degrees (negative values south
         * of equator).
         */
        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        /**
         * WGS-84 longitude of the track object, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         */
        fun lon(lon: Double) = lon(JsonField.of(lon))

        /**
         * Sets [Builder.lon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lon] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lon(lon: JsonField<Double>) = apply { this.lon = lon }

        /** Source of the data. */
        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        /** Track timestamp in ISO8601 UTC format with microsecond precision. */
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

        /**
         * Subtype is a finer grain categorization of missile types. Examples include but are not
         * limited to SRBM, MRBM, IRBM, LRBM, ICBM, SLBM:
         *
         * SRBM - Short-Range Ballistic Missile
         *
         * MRBM - Medium-Range Ballistic Missile
         *
         * IRBM - Intermediate-Range Ballistic Missile
         *
         * LRBM - Long-Range Ballistic Missile
         *
         * ICBM - Intercontinental Ballistic Missile
         *
         * SLBM - Submarine-Launched Ballistic Missile.
         */
        fun acftSubType(acftSubType: String) = acftSubType(JsonField.of(acftSubType))

        /**
         * Sets [Builder.acftSubType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acftSubType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acftSubType(acftSubType: JsonField<String>) = apply { this.acftSubType = acftSubType }

        /**
         * A text amplifier for units, equipment and installations; content is implementation
         * specific.
         */
        fun addInfo(addInfo: String) = addInfo(JsonField.of(addInfo))

        /**
         * Sets [Builder.addInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addInfo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun addInfo(addInfo: JsonField<String>) = apply { this.addInfo = addInfo }

        /**
         * A track may be designated as an alert track with the following designations:
         *
         * HIT - High Interest Track
         *
         * TGT - Target
         *
         * SUS - Suspect Carrier
         *
         * NSP - Cleared Suspect
         *
         * If alert is null, the track is assumed to be of non-alert status.
         */
        fun alert(alert: String) = alert(JsonField.of(alert))

        /**
         * Sets [Builder.alert] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alert] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alert(alert: JsonField<String>) = apply { this.alert = alert }

        /**
         * Track point altitude relative to WGS-84 ellipsoid, in meters. Positive values indicate a
         * track object height above ellipsoid, and negative values indicate a track object below
         * ellipsoid, applicable to the depth estimate for a subsurface track.
         */
        fun alt(alt: Double) = alt(JsonField.of(alt))

        /**
         * Sets [Builder.alt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun alt(alt: JsonField<Double>) = apply { this.alt = alt }

        /**
         * The angle formed between the line of sight of the observer and the horizon, in degrees.
         * The angular range is -90 to 90, with negative values representing angle of depression.
         */
        fun angElev(angElev: Double) = angElev(JsonField.of(angElev))

        /**
         * Sets [Builder.angElev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.angElev] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun angElev(angElev: JsonField<Double>) = apply { this.angElev = angElev }

        /**
         * The reference dimensions of the vessel, reported as [A, B, C, D], in meters. Where the
         * array values represent the distance fore (A), aft (B), to port (C), and to starboard (D)
         * of the navigation antenna. Array with values A = C = 0 and B, D > 0 indicate the length
         * (B) and width (D) of the vessel without antenna position reference.
         */
        fun antennaRefDimensions(antennaRefDimensions: List<Double>) =
            antennaRefDimensions(JsonField.of(antennaRefDimensions))

        /**
         * Sets [Builder.antennaRefDimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.antennaRefDimensions] with a well-typed `List<Double>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun antennaRefDimensions(antennaRefDimensions: JsonField<List<Double>>) = apply {
            this.antennaRefDimensions = antennaRefDimensions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [antennaRefDimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAntennaRefDimension(antennaRefDimension: Double) = apply {
            antennaRefDimensions =
                (antennaRefDimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("antennaRefDimensions", it).add(antennaRefDimension)
                }
        }

        /**
         * Three element array representing an Area of Uncertainty (AoU). The array element
         * definitions and units are type specific depending on the aouRptType specified in this
         * record:
         *
         * ELLIPSE:
         *
         * brg - orientation in degrees of the ellipse
         *
         * a1 - semi-major axis in meters
         *
         * a2 - semi-minor axis in meters
         *
         * BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * brg - orientation in degrees of the bearing box
         *
         * a1 - length of bearing box in meters
         *
         * a2 - half-width of bearing box in meters
         *
         * OTHER (All other type values):
         *
         * brg - line of bearing in degrees true
         *
         * a1 - bearing error in degrees
         *
         * a2 - estimated range in meters.
         */
        fun aouRptData(aouRptData: List<Double>) = aouRptData(JsonField.of(aouRptData))

        /**
         * Sets [Builder.aouRptData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aouRptData] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun aouRptData(aouRptData: JsonField<List<Double>>) = apply {
            this.aouRptData = aouRptData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.aouRptData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAouRptData(aouRptData: Double) = apply {
            this.aouRptData =
                (this.aouRptData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aouRptData", it).add(aouRptData)
                }
        }

        /**
         * The track Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition. This type
         * defines the elements of the aouRptData array and is required if aouRptData is not null.
         * See the aouRptData field definition for specific information.
         */
        fun aouRptType(aouRptType: String) = aouRptType(JsonField.of(aouRptType))

        /**
         * Sets [Builder.aouRptType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aouRptType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun aouRptType(aouRptType: JsonField<String>) = apply { this.aouRptType = aouRptType }

        /**
         * Appearance group code.
         *
         * GP1 - Superstructure exceeds 1/3 of ship length.
         *
         * GP2 - Superstructure less than 1/3 of ship length.
         *
         * GP3 - Stack aft.
         */
        fun appGrp(appGrp: String) = appGrp(JsonField.of(appGrp))

        /**
         * Sets [Builder.appGrp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appGrp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun appGrp(appGrp: JsonField<String>) = apply { this.appGrp = appGrp }

        /**
         * The reported arrival cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS
         * cargo definitions. Users should refer to USCG Navigation Center documentation for
         * specific definitions associated with ship and cargo types. USCG NAVCEN documentation may
         * be found at https://www.navcen.uscg.gov.
         */
        fun arrCargo(arrCargo: String) = arrCargo(JsonField.of(arrCargo))

        /**
         * Sets [Builder.arrCargo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrCargo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun arrCargo(arrCargo: JsonField<String>) = apply { this.arrCargo = arrCargo }

        /** The flag of the arrival port. */
        fun arrFlag(arrFlag: String) = arrFlag(JsonField.of(arrFlag))

        /**
         * Sets [Builder.arrFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrFlag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun arrFlag(arrFlag: JsonField<String>) = apply { this.arrFlag = arrFlag }

        /** The Arrival Port of the vessel according to the AIS transmission. */
        fun arrPort(arrPort: String) = arrPort(JsonField.of(arrPort))

        /**
         * Sets [Builder.arrPort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrPort] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun arrPort(arrPort: JsonField<String>) = apply { this.arrPort = arrPort }

        /**
         * The Arrival Time of the vessel at the destination, in ISO 8601 UTC format with
         * microsecond precision.
         */
        fun arrTime(arrTime: OffsetDateTime) = arrTime(JsonField.of(arrTime))

        /**
         * Sets [Builder.arrTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.arrTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun arrTime(arrTime: JsonField<OffsetDateTime>) = apply { this.arrTime = arrTime }

        /**
         * Type of Aid to Navigation. Intended as, but not constrained to, the USCG NAVCEN aids to
         * navigation. Users should refer to USCG Navigation Center documentation for specific
         * device type information. USCG NAVCEN documentation may be found at
         * https://www.navcen.uscg.gov.
         */
        fun aton(aton: String) = aton(JsonField.of(aton))

        /**
         * Sets [Builder.aton] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aton] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun aton(aton: JsonField<String>) = apply { this.aton = aton }

        /**
         * The average speed, in kilometers/hour, calculated for the subject during the latest
         * voyage/excursion.
         */
        fun avgSpd(avgSpd: Double) = avgSpd(JsonField.of(avgSpd))

        /**
         * Sets [Builder.avgSpd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avgSpd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avgSpd(avgSpd: JsonField<Double>) = apply { this.avgSpd = avgSpd }

        /**
         * Azimuth corridor arc distance measured in meters from reference point of azimuth corridor
         * to far edge of bounded azimuth corridor wedge, measured along azimuth corridor center
         * line.
         */
        fun azCorrArcWidth(azCorrArcWidth: Double) = azCorrArcWidth(JsonField.of(azCorrArcWidth))

        /**
         * Sets [Builder.azCorrArcWidth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azCorrArcWidth] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun azCorrArcWidth(azCorrArcWidth: JsonField<Double>) = apply {
            this.azCorrArcWidth = azCorrArcWidth
        }

        /**
         * The azimuth corridor centerline angle measured in degrees clockwise from true north, of
         * the center line of an azimuth corridor. The center line extends from the referenced
         * corridor origin location.
         */
        fun azCorrCenterLine(azCorrCenterLine: Double) =
            azCorrCenterLine(JsonField.of(azCorrCenterLine))

        /**
         * Sets [Builder.azCorrCenterLine] to an arbitrary JSON value.
         *
         * You should usually call [Builder.azCorrCenterLine] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun azCorrCenterLine(azCorrCenterLine: JsonField<Double>) = apply {
            this.azCorrCenterLine = azCorrCenterLine
        }

        /** The Basic Encyclopedia (BE) number associated with this installation or area. */
        fun beNumber(beNumber: String) = beNumber(JsonField.of(beNumber))

        /**
         * Sets [Builder.beNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beNumber] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beNumber(beNumber: JsonField<String>) = apply { this.beNumber = beNumber }

        /**
         * Flag indicating that the missile is currently in a state of boosting, if reporting a
         * missile track.
         */
        fun boosting(boosting: Boolean) = boosting(JsonField.of(boosting))

        /**
         * Sets [Builder.boosting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boosting] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun boosting(boosting: JsonField<Boolean>) = apply { this.boosting = boosting }

        /** Track point burnout altitude relative to WGS-84 ellipsoid, in meters. */
        fun burnoutAlt(burnoutAlt: Double) = burnoutAlt(JsonField.of(burnoutAlt))

        /**
         * Sets [Builder.burnoutAlt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.burnoutAlt] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun burnoutAlt(burnoutAlt: JsonField<Double>) = apply { this.burnoutAlt = burnoutAlt }

        /** The call sign currently assigned to this track object. */
        fun callSign(callSign: String) = callSign(JsonField.of(callSign))

        /**
         * Sets [Builder.callSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callSign] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun callSign(callSign: JsonField<String>) = apply { this.callSign = callSign }

        /**
         * The reported cargo type. Intended as, but not constrained to, the USCG NAVCEN AIS cargo
         * definitions. Users should refer to USCG Navigation Center documentation for specific
         * definitions associated with ship and cargo types. USCG NAVCEN documentation may be found
         * at https://www.navcen.uscg.gov.
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

        /** Correlation Index; reference code for the site that originally reported the track. */
        fun cI(cI: String) = cI(JsonField.of(cI))

        /**
         * Sets [Builder.cI] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cI] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cI(cI: JsonField<String>) = apply { this.cI = cI }

        /**
         * The Area Of Uncertainty (AOU) percentage (0 - 100) containment value. The percentage of
         * time (90%) that the estimated area of uncertainty will cover the true position of the
         * track object.
         */
        fun containment(containment: Double) = containment(JsonField.of(containment))

        /**
         * Sets [Builder.containment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.containment] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun containment(containment: JsonField<Double>) = apply { this.containment = containment }

        /**
         * The Cooperative Location Indicator specifies whether the reported entity location was
         * derived using reported locations from sensors on more than one platform.
         *
         * 0 - COOPERATIVE_LOCATOR_NONE
         *
         * 1 - SINGLE_PLATFORM
         *
         * 2 - FRAGMENT
         *
         * 3 - COOPERATIVE.
         */
        fun coopLocInd(coopLocInd: String) = coopLocInd(JsonField.of(coopLocInd))

        /**
         * Sets [Builder.coopLocInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coopLocInd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun coopLocInd(coopLocInd: JsonField<String>) = apply { this.coopLocInd = coopLocInd }

        /**
         * The track object course-over-ground, in degrees clockwise from true North at the object
         * location (0-360 degrees).
         */
        fun course(course: Double) = course(JsonField.of(course))

        /**
         * Sets [Builder.course] to an arbitrary JSON value.
         *
         * You should usually call [Builder.course] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun course(course: JsonField<Double>) = apply { this.course = course }

        /**
         * The distance, in meters, of the closest point of approach between this track to the
         * master reference track.
         */
        fun cpa(cpa: Double) = cpa(JsonField.of(cpa))

        /**
         * Sets [Builder.cpa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cpa] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cpa(cpa: JsonField<Double>) = apply { this.cpa = cpa }

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

        /**
         * The reported departure cargo type. Intended as, but not constrained to, the USCG NAVCEN
         * AIS cargo definitions. Users should refer to USCG Navigation Center documentation for
         * specific definitions associated with ship and cargo types. USCG NAVCEN documentation may
         * be found at https://www.navcen.uscg.gov.
         */
        fun depCargo(depCargo: String) = depCargo(JsonField.of(depCargo))

        /**
         * Sets [Builder.depCargo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depCargo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun depCargo(depCargo: JsonField<String>) = apply { this.depCargo = depCargo }

        /** The flag of the departure port. */
        fun depFlag(depFlag: String) = depFlag(JsonField.of(depFlag))

        /**
         * Sets [Builder.depFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depFlag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun depFlag(depFlag: JsonField<String>) = apply { this.depFlag = depFlag }

        /** The Departure Port of the vessel according to the AIS transmission. */
        fun depPort(depPort: String) = depPort(JsonField.of(depPort))

        /**
         * Sets [Builder.depPort] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depPort] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun depPort(depPort: JsonField<String>) = apply { this.depPort = depPort }

        /**
         * The reported destination cargo type. Intended as, but not constrained to, the USCG NAVCEN
         * AIS cargo definitions. Users should refer to USCG Navigation Center documentation for
         * specific definitions associated with ship and cargo types. USCG NAVCEN documentation may
         * be found at https://www.navcen.uscg.gov.
         */
        fun desCargo(desCargo: String) = desCargo(JsonField.of(desCargo))

        /**
         * Sets [Builder.desCargo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.desCargo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun desCargo(desCargo: JsonField<String>) = apply { this.desCargo = desCargo }

        /** The flag of the destination port. */
        fun desFlag(desFlag: String) = desFlag(JsonField.of(desFlag))

        /**
         * Sets [Builder.desFlag] to an arbitrary JSON value.
         *
         * You should usually call [Builder.desFlag] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun desFlag(desFlag: JsonField<String>) = apply { this.desFlag = desFlag }

        /** The destination of the vessel according to the AIS transmission. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /**
         * The Intel Discrete Identifier (IDI) code assigned to this track. The IDI is a four-digit
         * code representing hostile or unknown tracks.
         */
        fun disId(disId: String) = disId(JsonField.of(disId))

        /**
         * Sets [Builder.disId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun disId(disId: JsonField<String>) = apply { this.disId = disId }

        /**
         * The maximum static draught, in meters, of the vessel according to the AIS transmission.
         */
        fun draught(draught: Double) = draught(JsonField.of(draught))

        /**
         * Sets [Builder.draught] to an arbitrary JSON value.
         *
         * You should usually call [Builder.draught] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun draught(draught: JsonField<Double>) = apply { this.draught = draught }

        /** The drop-point indicator setting. */
        fun dropPtInd(dropPtInd: Boolean) = dropPtInd(JsonField.of(dropPtInd))

        /**
         * Sets [Builder.dropPtInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dropPtInd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dropPtInd(dropPtInd: JsonField<Boolean>) = apply { this.dropPtInd = dropPtInd }

        /**
         * Flag indicating that this track represents a dummy object or group. Identifies offensive
         * or defensive units, equipment, and/or installations intended to draw the enemy's
         * attention away from the area of the main attack. Based on MIL-STD-2525 symbology
         * definitions.
         */
        fun dummy(dummy: Boolean) = dummy(JsonField.of(dummy))

        /**
         * Sets [Builder.dummy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dummy] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dummy(dummy: JsonField<Boolean>) = apply { this.dummy = dummy }

        /**
         * Track object location in ECEF [x, y, z], meters. When provided, array must always contain
         * 3 values.
         */
        fun ecefPos(ecefPos: List<Double>) = ecefPos(JsonField.of(ecefPos))

        /**
         * Sets [Builder.ecefPos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ecefPos] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ecefPos(ecefPos: JsonField<List<Double>>) = apply {
            this.ecefPos = ecefPos.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [ecefPos].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEcefPo(ecefPo: Double) = apply {
            ecefPos =
                (ecefPos ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ecefPos", it).add(ecefPo)
                }
        }

        /**
         * Track object velocity in ECEF [x', y', z'], meters/sec. When provided, array must always
         * contain 3 values.
         */
        fun ecefVel(ecefVel: List<Double>) = ecefVel(JsonField.of(ecefVel))

        /**
         * Sets [Builder.ecefVel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ecefVel] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ecefVel(ecefVel: JsonField<List<Double>>) = apply {
            this.ecefVel = ecefVel.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.ecefVel].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEcefVel(ecefVel: Double) = apply {
            this.ecefVel =
                (this.ecefVel ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ecefVel", it).add(ecefVel)
                }
        }

        /**
         * Primary ELINT Notification (ELNOT), a five character identifier assigned to each
         * non-communication emission for collection and reporting purposes. This five-digit field
         * begins with an alpha character, followed by three numbers, ending with another alpha
         * character.
         */
        fun elnot1(elnot1: String) = elnot1(JsonField.of(elnot1))

        /**
         * Sets [Builder.elnot1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elnot1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elnot1(elnot1: JsonField<String>) = apply { this.elnot1 = elnot1 }

        /**
         * Secondary ELINT Notification (ELNOT), a five character identifier assigned to each
         * non-communication emission for collection and reporting purposes. This five-digit field
         * begins with an alpha character, followed by three numbers, ending with another alpha
         * character.
         */
        fun elnot2(elnot2: String) = elnot2(JsonField.of(elnot2))

        /**
         * Sets [Builder.elnot2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.elnot2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun elnot2(elnot2: JsonField<String>) = apply { this.elnot2 = elnot2 }

        /** Flag indicating that the track object has an emergency. */
        fun emgInd(emgInd: Boolean) = emgInd(JsonField.of(emgInd))

        /**
         * Sets [Builder.emgInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emgInd] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emgInd(emgInd: JsonField<Boolean>) = apply { this.emgInd = emgInd }

        /** Radar name of the sensor tracking this object (e.g., RAY1500, SPN-43, HEADNET). */
        fun emitterName(emitterName: String) = emitterName(JsonField.of(emitterName))

        /**
         * Sets [Builder.emitterName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emitterName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emitterName(emitterName: JsonField<String>) = apply { this.emitterName = emitterName }

        /**
         * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
         *
         * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
         * miles).
         *
         * LAND: On the surface of dry land.
         *
         * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
         *
         * SURFACE: On the surface of a body of water.
         *
         * SUBSURFACE: Below the surface of a body of water.
         *
         * UNKNOWN: Environment is not known.
         */
        fun env(env: Env) = env(JsonField.of(env))

        /**
         * Sets [Builder.env] to an arbitrary JSON value.
         *
         * You should usually call [Builder.env] with a well-typed [Env] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun env(env: JsonField<Env>) = apply { this.env = env }

        /**
         * The error in the Area Orientation. Area Orientation is the angle or roll in degrees,
         * between area semi-minor axis and plane defined by local vertical and area semi-major
         * axis. When reported without major and minor axis, it is angle between an axis
         * perpendicular to a 2D true north axis and plane defined by local vertical and a 2D true
         * north axis.
         */
        fun errAreaOrient(errAreaOrient: Double) = errAreaOrient(JsonField.of(errAreaOrient))

        /**
         * Sets [Builder.errAreaOrient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errAreaOrient] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errAreaOrient(errAreaOrient: JsonField<Double>) = apply {
            this.errAreaOrient = errAreaOrient
        }

        /**
         * Geometric area switch identifies the 3D shape of the error volume by providing the 2D
         * shape for the 3D plane. The 3D plane is the plane orthogonal to the area semi-major axis
         * and area semi-minor axis. Depending on whether the 2D plane is reported as an error
         * ellipse 2D or as an error rectangle 2D, this switch reports a complete error volume that
         * is cubical, 3D rectangular, cylindrical, 3D ellipsoidal, or spherical.
         *
         * 0 - SWITCH_TYPE_UNKNOWN
         *
         * 1 - SQUARE_RECTANGLE
         *
         * 2 - CIRCLE_ELLIPSE.
         */
        fun errGeoAreaSwitch(errGeoAreaSwitch: String) =
            errGeoAreaSwitch(JsonField.of(errGeoAreaSwitch))

        /**
         * Sets [Builder.errGeoAreaSwitch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errGeoAreaSwitch] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errGeoAreaSwitch(errGeoAreaSwitch: JsonField<String>) = apply {
            this.errGeoAreaSwitch = errGeoAreaSwitch
        }

        /**
         * The error in the semi-intermediate axis. The semi-intermediate axis is intermediate in
         * length between semi-major and semi-minor axes. This field is doubled and centered on
         * intersection of area semi-major axis and area semi-minor axis at 90 degrees to the plane
         * defined by those axes. For these shapes, the volume is defined as having a 50-percent
         * probability of containing the true location of the referenced entity.
         */
        fun errSemiIntAxis(errSemiIntAxis: Double) = errSemiIntAxis(JsonField.of(errSemiIntAxis))

        /**
         * Sets [Builder.errSemiIntAxis] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errSemiIntAxis] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errSemiIntAxis(errSemiIntAxis: JsonField<Double>) = apply {
            this.errSemiIntAxis = errSemiIntAxis
        }

        /**
         * The error in the Semi-major elevation axis. Semi-major elevation axis is the elevation of
         * the cubical, 3D rectangular, cylindrical, 3D ellipsoidal, or spherical semi-major axis,
         * in degrees, measured from local horizontal.
         */
        fun errSemiMajElev(errSemiMajElev: Double) = errSemiMajElev(JsonField.of(errSemiMajElev))

        /**
         * Sets [Builder.errSemiMajElev] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errSemiMajElev] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun errSemiMajElev(errSemiMajElev: JsonField<Double>) = apply {
            this.errSemiMajElev = errSemiMajElev
        }

        /**
         * The Estimated Time of Arrival of the vessel at the destination port, in ISO 8601 UTC
         * format with microsecond precision.
         */
        fun eta(eta: OffsetDateTime) = eta(JsonField.of(eta))

        /**
         * Sets [Builder.eta] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eta] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eta(eta: JsonField<OffsetDateTime>) = apply { this.eta = eta }

        /**
         * The Estimated Time of Departure of the vessel from the departure port (depPort),
         * according to Marine Traffic calculations, in ISO 8601 UTC format with microsecond
         * precision.
         */
        fun etd(etd: OffsetDateTime) = etd(JsonField.of(etd))

        /**
         * Sets [Builder.etd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.etd] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun etd(etd: JsonField<OffsetDateTime>) = apply { this.etd = etd }

        /**
         * A text amplifier code for units, equipment, and installations that consists of a
         * one-letter reliability rating and a one-number credibility rating based on the following
         * definitions of each:
         *
         * Reliability Ratings:
         *
         * A-completely reliable
         *
         * B-usually reliable
         *
         * C-fairly reliable
         *
         * D-not usually reliable
         *
         * E-unreliable
         *
         * F-reliability cannot be judged
         *
         * Credibility Ratings:
         *
         * 1-confirmed by other sources
         *
         * 2-probably true
         *
         * 3-possibly true
         *
         * 4-doubtfully true
         *
         * 5-improbable
         *
         * 6-truth cannot be judged.
         */
        fun evalRating(evalRating: String) = evalRating(JsonField.of(evalRating))

        /**
         * Sets [Builder.evalRating] to an arbitrary JSON value.
         *
         * You should usually call [Builder.evalRating] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun evalRating(evalRating: JsonField<String>) = apply { this.evalRating = evalRating }

        /**
         * Flag indicating that this track represents a feint object or group. Identifies offensive
         * or defensive units, equipment, and/or installations intended to draw the enemy's
         * attention away from the area of the main attack. Based on MIL-STD-2525 symbology
         * definitions.
         */
        fun feint(feint: Boolean) = feint(JsonField.of(feint))

        /**
         * Sets [Builder.feint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feint] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun feint(feint: JsonField<Boolean>) = apply { this.feint = feint }

        /** Frequency, in hertz, for the signature report. */
        fun freq(freq: Double) = freq(JsonField.of(freq))

        /**
         * Sets [Builder.freq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.freq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun freq(freq: JsonField<Double>) = apply { this.freq = freq }

        /** An ftn used to associate information and directives with the track. */
        fun ftn(ftn: String) = ftn(JsonField.of(ftn))

        /**
         * Sets [Builder.ftn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ftn] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ftn(ftn: JsonField<String>) = apply { this.ftn = ftn }

        /**
         * The name of the Command reporting the Force Over-The-Horizon Track Coordinator (FOTC)
         * track number.
         */
        fun ftnCmd(ftnCmd: String) = ftnCmd(JsonField.of(ftnCmd))

        /**
         * Sets [Builder.ftnCmd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ftnCmd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ftnCmd(ftnCmd: JsonField<String>) = apply { this.ftnCmd = ftnCmd }

        /**
         * The message timestamp that the ftn track position was recorded, in ISO 8601 UTC format
         * with microsecond precision.
         */
        fun ftnMsgTs(ftnMsgTs: OffsetDateTime) = ftnMsgTs(JsonField.of(ftnMsgTs))

        /**
         * Sets [Builder.ftnMsgTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ftnMsgTs] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ftnMsgTs(ftnMsgTs: JsonField<OffsetDateTime>) = apply { this.ftnMsgTs = ftnMsgTs }

        /**
         * List of harmonics of the signature report in descending order of predominance using 1-2
         * digit combinations separated by commas, e.g., 8,12,4. (1-22NS).
         */
        fun harmonics(harmonics: String) = harmonics(JsonField.of(harmonics))

        /**
         * Sets [Builder.harmonics] to an arbitrary JSON value.
         *
         * You should usually call [Builder.harmonics] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun harmonics(harmonics: JsonField<String>) = apply { this.harmonics = harmonics }

        /** Track object heading, in degrees clockwise from true north. */
        fun hdng(hdng: Double) = hdng(JsonField.of(hdng))

        /**
         * Sets [Builder.hdng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hdng] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hdng(hdng: JsonField<Double>) = apply { this.hdng = hdng }

        /**
         * Flag indicating that this track represents a headquarters object. Based on MIL-STD-2525
         * symbology definitions.
         */
        fun hq(hq: Boolean) = hq(JsonField.of(hq))

        /**
         * Sets [Builder.hq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hq] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hq(hq: JsonField<Boolean>) = apply { this.hq = hq }

        /**
         * The vessel hull number designation of this maritime vessel. The hull number is a 1-6
         * character alphanumeric entry assigned to a ship and painted on the hull.
         */
        fun hullNum(hullNum: String) = hullNum(JsonField.of(hullNum))

        /**
         * Sets [Builder.hullNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hullNum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hullNum(hullNum: JsonField<String>) = apply { this.hullNum = hullNum }

        /**
         * Hull profile code. Based on GCCS-J hull profiles.
         *
         * FLUSH No breaks in Hull Profile.
         *
         * RAISED 1 Hull Profile shows distinct raised area at bow. Remainder of deck is flush.
         *
         * RAISED 2 Hull Profile shows distinct raised area amidships. Bow and stern are flush.
         *
         * RAISED 3 Hull Profile shows distinct raised area at stern. Remainder of deck is flush.
         *
         * RAISED 1-2-3 Distinct raised areas at bow, midships, and stern with breaks between each
         * raise.
         *
         * RAISED 1-2 Raised area at bow and midships with break between.
         *
         * RAISED 1-3 Raised area at bow and stern with break between.
         *
         * RAISED 12 Continuous raised area encompassing both bow and midships.
         *
         * RAISED 23 Continuous raised area encompassing midships and stern.
         *
         * RAISED 12-3 Raised areas at bow, midships and stern. Bow and midship raises are
         * continuous. Break between midship and stern raises.
         *
         * RAISED 1-23 Raised areas at bow, midships, and stern. Midship and stern raises are
         * continuous with break between bow and midship raises.
         *
         * RAISED 1-L2-3 Raised areas at bow, midships, and stern with break between each raise.
         * Midships raise is longer than that associated with raised 1-2-3.
         */
        fun hullProf(hullProf: String) = hullProf(JsonField.of(hullProf))

        /**
         * Sets [Builder.hullProf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hullProf] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hullProf(hullProf: JsonField<String>) = apply { this.hullProf = hullProf }

        /**
         * Additional track object identity/status information, typically used for EXERCISE identity
         * amplification (FAKER, JOKER, KILO, TRAVELLER, ZOMBIE):
         *
         * FAKER: Friendly track, object, or entity acting as an exercise hostile.
         *
         * JOKER: Friendly track, object, or entity acting as an exercise suspect.
         *
         * KILO: Friendly high-value object.
         *
         * TRAVELLER: Suspect land or surface track following a recognized traffic route.
         *
         * ZOMBIE: Suspect track, object, or entity of special interest.
         */
        fun identAmp(identAmp: String) = identAmp(JsonField.of(identAmp))

        /**
         * Sets [Builder.identAmp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.identAmp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun identAmp(identAmp: JsonField<String>) = apply { this.identAmp = identAmp }

        /** A text amplifier displaying IFF/SIF/AIS Identification modes and codes. */
        fun iff(iff: String) = iff(JsonField.of(iff))

        /**
         * Sets [Builder.iff] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iff] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun iff(iff: JsonField<String>) = apply { this.iff = iff }

        /**
         * The International Maritime Organization Number of the vessel. IMON is a seven-digit
         * number that uniquely identifies the vessel.
         */
        fun imon(imon: Int) = imon(JsonField.of(imon))

        /**
         * Sets [Builder.imon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imon] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imon(imon: JsonField<Int>) = apply { this.imon = imon }

        /**
         * Three element array representing the impact point Area of Uncertainty (AoU). The array
         * element definitions and units are type specific depending on the impactAouType specified
         * in this record:
         *
         * ELLIPSE:
         *
         * brg - orientation in degrees of the ellipse
         *
         * a1 - semi-major axis in meters
         *
         * a2 - semi-minor axis in meters
         *
         * BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * brg - orientation in degrees of the bearing box
         *
         * a1 - length of bearing box in meters
         *
         * a2 - half-width of bearing box in meters
         *
         * OTHER (All other type values):
         *
         * brg - line of bearing in degrees true
         *
         * a1 - bearing error in degrees
         *
         * a2 - estimated range in meters.
         */
        fun impactAouData(impactAouData: List<Double>) = impactAouData(JsonField.of(impactAouData))

        /**
         * Sets [Builder.impactAouData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactAouData] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun impactAouData(impactAouData: JsonField<List<Double>>) = apply {
            this.impactAouData = impactAouData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.impactAouData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addImpactAouData(impactAouData: Double) = apply {
            this.impactAouData =
                (this.impactAouData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("impactAouData", it).add(impactAouData)
                }
        }

        /**
         * The impact point Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition.
         * This type defines the elements of the impactAouData array and is required if
         * impactAouData is not null. See the impactAouData field definition for specific
         * information.
         */
        fun impactAouType(impactAouType: String) = impactAouType(JsonField.of(impactAouType))

        /**
         * Sets [Builder.impactAouType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactAouType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactAouType(impactAouType: JsonField<String>) = apply {
            this.impactAouType = impactAouType
        }

        /**
         * WGS-84 latitude of the missile impact point, in degrees. -90 to 90 degrees (negative
         * values south of equator).
         */
        fun impactLat(impactLat: Double) = impactLat(JsonField.of(impactLat))

        /**
         * Sets [Builder.impactLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactLat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactLat(impactLat: JsonField<Double>) = apply { this.impactLat = impactLat }

        /**
         * WGS-84 longitude of the missile impact point, in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun impactLon(impactLon: Double) = impactLon(JsonField.of(impactLon))

        /**
         * Sets [Builder.impactLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactLon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun impactLon(impactLon: JsonField<Double>) = apply { this.impactLon = impactLon }

        /** Missile impact timestamp in ISO8601 UTC format with microsecond precision. */
        fun impactTime(impactTime: OffsetDateTime) = impactTime(JsonField.of(impactTime))

        /**
         * Sets [Builder.impactTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impactTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun impactTime(impactTime: JsonField<OffsetDateTime>) = apply {
            this.impactTime = impactTime
        }

        /** Source code for source of information used to detect track. */
        fun infoSource(infoSource: String) = infoSource(JsonField.of(infoSource))

        /**
         * Sets [Builder.infoSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.infoSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun infoSource(infoSource: JsonField<String>) = apply { this.infoSource = infoSource }

        /**
         * Flag indicating that this track represents an installation. Based on MIL-STD-2525
         * symbology definitions.
         */
        fun installation(installation: Boolean) = installation(JsonField.of(installation))

        /**
         * Sets [Builder.installation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.installation] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun installation(installation: JsonField<Boolean>) = apply {
            this.installation = installation
        }

        /**
         * Three element array representing the launch location Area of Uncertainty (AoU). The array
         * element definitions and units are type specific depending on the launchAouType specified
         * in this record:
         *
         * ELLIPSE:
         *
         * brg - orientation in degrees of the ellipse
         *
         * a1 - semi-major axis in meters
         *
         * a2 - semi-minor axis in meters
         *
         * BEARING (BEARING BOX or MTST BEARING BOX):
         *
         * brg - orientation in degrees of the bearing box
         *
         * a1 - length of bearing box in meters
         *
         * a2 - half-width of bearing box in meters
         *
         * OTHER (All other type values):
         *
         * brg - line of bearing in degrees true
         *
         * a1 - bearing error in degrees
         *
         * a2 - estimated range in meters.
         */
        fun launchAouData(launchAouData: List<Double>) = launchAouData(JsonField.of(launchAouData))

        /**
         * Sets [Builder.launchAouData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAouData] with a well-typed `List<Double>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchAouData(launchAouData: JsonField<List<Double>>) = apply {
            this.launchAouData = launchAouData.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [Builder.launchAouData].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLaunchAouData(launchAouData: Double) = apply {
            this.launchAouData =
                (this.launchAouData ?: JsonField.of(mutableListOf())).also {
                    checkKnown("launchAouData", it).add(launchAouData)
                }
        }

        /**
         * The launch location Area of Uncertainty (AoU) type (BEARING, ELLIPSE, OTHER) definition.
         * This type defines the elements of the launchAouData array and is required if
         * launchAouData is not null. See the launchAouData field definition for specific
         * information.
         */
        fun launchAouType(launchAouType: String) = launchAouType(JsonField.of(launchAouType))

        /**
         * Sets [Builder.launchAouType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchAouType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchAouType(launchAouType: JsonField<String>) = apply {
            this.launchAouType = launchAouType
        }

        /**
         * WGS-84 latitude of the missile launch point, in degrees. -90 to 90 degrees (negative
         * values south of equator).
         */
        fun launchLat(launchLat: Double) = launchLat(JsonField.of(launchLat))

        /**
         * Sets [Builder.launchLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchLat] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchLat(launchLat: JsonField<Double>) = apply { this.launchLat = launchLat }

        /**
         * WGS-84 longitude of the missile launch point, in degrees. -180 to 180 degrees (negative
         * values west of Prime Meridian).
         */
        fun launchLon(launchLon: Double) = launchLon(JsonField.of(launchLon))

        /**
         * Sets [Builder.launchLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchLon] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun launchLon(launchLon: JsonField<Double>) = apply { this.launchLon = launchLon }

        /** Missile launch timestamp in ISO8601 UTC format with microsecond precision. */
        fun launchTime(launchTime: OffsetDateTime) = launchTime(JsonField.of(launchTime))

        /**
         * Sets [Builder.launchTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.launchTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun launchTime(launchTime: JsonField<OffsetDateTime>) = apply {
            this.launchTime = launchTime
        }

        /**
         * The overall length of the vessel, in meters. A value of 511 indicates a vessel length of
         * 511 meters or greater.
         */
        fun length(length: Double) = length(JsonField.of(length))

        /**
         * Sets [Builder.length] to an arbitrary JSON value.
         *
         * You should usually call [Builder.length] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun length(length: JsonField<Double>) = apply { this.length = length }

        /** Flag indicating whether the missile is considered lost, if reporting a missile track. */
        fun lostTrkInd(lostTrkInd: Boolean) = lostTrkInd(JsonField.of(lostTrkInd))

        /**
         * Sets [Builder.lostTrkInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lostTrkInd] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lostTrkInd(lostTrkInd: JsonField<Boolean>) = apply { this.lostTrkInd = lostTrkInd }

        /**
         * The manuevering indicator specifying the missile boost phase.
         *
         * 0 - POST_BOOST_NONE
         *
         * 1 - POST_BOOST_MANUEVER
         *
         * 2 - POST_BOOST_COMPLETE_MANUEVER.
         */
        fun maneuverInd(maneuverInd: String) = maneuverInd(JsonField.of(maneuverInd))

        /**
         * Sets [Builder.maneuverInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maneuverInd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maneuverInd(maneuverInd: JsonField<String>) = apply { this.maneuverInd = maneuverInd }

        /** Maximum frequency, in hertz, reported for this acoustic track. */
        fun maxFreq(maxFreq: Double) = maxFreq(JsonField.of(maxFreq))

        /**
         * Sets [Builder.maxFreq] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFreq] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun maxFreq(maxFreq: JsonField<Double>) = apply { this.maxFreq = maxFreq }

        /**
         * The category code that represents the associated facility purpose within the target
         * system. This value is the category code in the MIDB (Modernized Intelligence Database).
         */
        fun midbCat(midbCat: String) = midbCat(JsonField.of(midbCat))

        /**
         * Sets [Builder.midbCat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.midbCat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun midbCat(midbCat: JsonField<String>) = apply { this.midbCat = midbCat }

        /** The MIL-STD-2525B symbology code that applies to the subject of this track. */
        fun mil2525Bstr(mil2525Bstr: String) = mil2525Bstr(JsonField.of(mil2525Bstr))

        /**
         * Sets [Builder.mil2525Bstr] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mil2525Bstr] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mil2525Bstr(mil2525Bstr: JsonField<String>) = apply { this.mil2525Bstr = mil2525Bstr }

        /**
         * The Maritime Mobile Service Identity of the vessel. MMSI is a nine-digit number that
         * identifies the transmitter station of the vessel.
         */
        fun mmsi(mmsi: Int) = mmsi(JsonField.of(mmsi))

        /**
         * Sets [Builder.mmsi] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mmsi] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mmsi(mmsi: JsonField<Int>) = apply { this.mmsi = mmsi }

        /** Optional message type designation. */
        fun msgType(msgType: String) = msgType(JsonField.of(msgType))

        /**
         * Sets [Builder.msgType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.msgType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun msgType(msgType: JsonField<String>) = apply { this.msgType = msgType }

        /**
         * The status of the missile track in this record, if reporting a missile track (e.g. AT
         * LAUNCH, AT OBSERVATION, FLYING, IMPACTED, LOST, STALE, DEBRIS).
         */
        fun mslStatus(mslStatus: String) = mslStatus(JsonField.of(mslStatus))

        /**
         * Sets [Builder.mslStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mslStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun mslStatus(mslStatus: JsonField<String>) = apply { this.mslStatus = mslStatus }

        /** Source of the Missile-Unique Identifier (MUID), if reporting a missile track. */
        fun muidSrc(muidSrc: String) = muidSrc(JsonField.of(muidSrc))

        /**
         * Sets [Builder.muidSrc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muidSrc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun muidSrc(muidSrc: JsonField<String>) = apply { this.muidSrc = muidSrc }

        /**
         * Track ID for the source of the Missile-Unique Identifier (MUID), if reporting a missile
         * track.
         */
        fun muidSrcTrk(muidSrcTrk: String) = muidSrcTrk(JsonField.of(muidSrcTrk))

        /**
         * Sets [Builder.muidSrcTrk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.muidSrcTrk] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun muidSrcTrk(muidSrcTrk: JsonField<String>) = apply { this.muidSrcTrk = muidSrcTrk }

        /** Track name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The AIS Navigational Status of the vessel (e.g. Underway Using Engine, Moored, Aground,
         * etc.). Intended as, but not constrained to, the USCG NAVCEN navigation status
         * definitions. Users should refer to USCG Navigation Center documentation for specific
         * definitions associated with navigation status. USCG NAVCEN documentation may be found at
         * https://www.navcen.uscg.gov.
         */
        fun navStatus(navStatus: String) = navStatus(JsonField.of(navStatus))

        /**
         * Sets [Builder.navStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.navStatus] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun navStatus(navStatus: JsonField<String>) = apply { this.navStatus = navStatus }

        /** The Naval Tactical Data System (NTDS) track number assigned to this track. */
        fun ntds(ntds: String) = ntds(JsonField.of(ntds))

        /**
         * Sets [Builder.ntds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ntds] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ntds(ntds: JsonField<String>) = apply { this.ntds = ntds }

        /** The number of blades per shaft of the track object. Applicable for maritime vessels. */
        fun numBlades(numBlades: Int) = numBlades(JsonField.of(numBlades))

        /**
         * Sets [Builder.numBlades] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numBlades] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numBlades(numBlades: JsonField<Int>) = apply { this.numBlades = numBlades }

        /** The number of shafts on the track object. Applicable for maritime vessels. */
        fun numShafts(numShafts: Int) = numShafts(JsonField.of(numShafts))

        /**
         * Sets [Builder.numShafts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numShafts] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numShafts(numShafts: JsonField<Int>) = apply { this.numShafts = numShafts }

        /**
         * The activity in which the track object is engaged. Intended as, but not constrained to,
         * MIL-STD-6016 environment dependent activity designations. The activity can be reported as
         * either a combination of the code and environment (e.g. 65/AIR) or as the descriptive
         * enumeration (e.g. DIVERTING), which are equivalent. For cases in which no MIl-STD-6016
         * designation exists, a general description can be used (e.g. ANTISPACE WARFARE).
         */
        fun objAct(objAct: String) = objAct(JsonField.of(objAct))

        /**
         * Sets [Builder.objAct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objAct] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objAct(objAct: JsonField<String>) = apply { this.objAct = objAct }

        /**
         * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
         * PENDING, SUSPECT, UNKNOWN):
         *
         * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
         * and/or origin.
         *
         * FRIEND: Track object supporting friendly forces and belonging to a declared friendly
         * nation or entity.
         *
         * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
         * contribute to a threat to friendly forces or their mission due to its behavior,
         * characteristics, nationality, or origin.
         *
         * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin
         * indicate that it is neither supporting nor opposing friendly forces or their mission.
         *
         * PENDING: Track object which has not been evaluated.
         *
         * SUSPECT: Track object deemed potentially hostile due to the object characteristics,
         * behavior, nationality, and/or origin.
         *
         * UNKNOWN: Track object which has been evaluated and does not meet criteria for any
         * standard identity.
         */
        fun objIdent(objIdent: ObjIdent) = objIdent(JsonField.of(objIdent))

        /**
         * Sets [Builder.objIdent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objIdent] with a well-typed [ObjIdent] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun objIdent(objIdent: JsonField<ObjIdent>) = apply { this.objIdent = objIdent }

        /** Nationality of the tracked object. */
        fun objNat(objNat: String) = objNat(JsonField.of(objNat))

        /**
         * Sets [Builder.objNat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objNat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objNat(objNat: JsonField<String>) = apply { this.objNat = objNat }

        /**
         * The object platform type is intended as, but not constrained to, MIL-STD-6016 environment
         * dependent platform type designations. The platform type can be reported as either a
         * combination of the code and environment (e.g. 14/LAND) or as the descriptive
         * representations (e.g. COMBAT VEHICLE), which are equivalent. For cases in which no
         * MIl-STD-6016 designation exists, a general description can be used (e.g. SATELLITE).
         */
        fun objPlat(objPlat: String) = objPlat(JsonField.of(objPlat))

        /**
         * Sets [Builder.objPlat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objPlat] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objPlat(objPlat: JsonField<String>) = apply { this.objPlat = objPlat }

        /**
         * The generic classification of the track object/group (e.g., BALLISTIC, HELICOPTER,
         * TRACKED, WATERCRAFT, WHEELED, etc.). Referenced, but not constrained to, NATO STANAG 4676
         * object type classifications.
         */
        fun objType(objType: String) = objType(JsonField.of(objType))

        /**
         * Sets [Builder.objType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.objType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun objType(objType: JsonField<String>) = apply { this.objType = objType }

        /** Indicator position (OFF, ON, UNK) for optional floating navigational aids only. */
        fun offPosInd(offPosInd: String) = offPosInd(JsonField.of(offPosInd))

        /**
         * Sets [Builder.offPosInd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offPosInd] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun offPosInd(offPosInd: JsonField<String>) = apply { this.offPosInd = offPosInd }

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

        /** Original source cross-reference code for the Command that originated the report. */
        fun origXref(origXref: String) = origXref(JsonField.of(origXref))

        /**
         * Sets [Builder.origXref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.origXref] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun origXref(origXref: JsonField<String>) = apply { this.origXref = origXref }

        /**
         * The O-suffix associated with this facility. The O-suffix is a five-character
         * alpha/numeric system used to identify a facility, or demographic area, within an
         * installation. The Installation Basic Encyclopedia (beNumber), in conjunction with the
         * O-suffix, uniquely identifies the facility within the Modernized Integrated Database
         * (MIDB). The Installation beNumber and oSuffix are also used in conjunction with the
         * midbCat code to classify the function or purpose of the facility.
         */
        fun oSuffix(oSuffix: String) = oSuffix(JsonField.of(oSuffix))

        /**
         * Sets [Builder.oSuffix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oSuffix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun oSuffix(oSuffix: JsonField<String>) = apply { this.oSuffix = oSuffix }

        /**
         * The Pseudo Identification Feature (PIF) number is a four digit code that provides an
         * exact ID for the ship or aircraft. Friendly military only.
         */
        fun pif(pif: String) = pif(JsonField.of(pif))

        /**
         * Sets [Builder.pif] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pif] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pif(pif: JsonField<String>) = apply { this.pif = pif }

        /**
         * This value represents the site number of a specific electronic site or its associated
         * equipment.
         */
        fun pin(pin: String) = pin(JsonField.of(pin))

        /**
         * Sets [Builder.pin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pin] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pin(pin: JsonField<String>) = apply { this.pin = pin }

        /**
         * WGS-84 azimuth corridor reference point latitude, in degrees. -90 to 90 degrees (negative
         * values south of equator).
         */
        fun polarSingLocLat(polarSingLocLat: Double) =
            polarSingLocLat(JsonField.of(polarSingLocLat))

        /**
         * Sets [Builder.polarSingLocLat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarSingLocLat] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarSingLocLat(polarSingLocLat: JsonField<Double>) = apply {
            this.polarSingLocLat = polarSingLocLat
        }

        /**
         * WGS-84 azimuth corridor reference point longitude, in degrees. -180 to 180 degrees
         * (negative values west of Prime Meridian).
         */
        fun polarSingLocLon(polarSingLocLon: Double) =
            polarSingLocLon(JsonField.of(polarSingLocLon))

        /**
         * Sets [Builder.polarSingLocLon] to an arbitrary JSON value.
         *
         * You should usually call [Builder.polarSingLocLon] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun polarSingLocLon(polarSingLocLon: JsonField<Double>) = apply {
            this.polarSingLocLon = polarSingLocLon
        }

        /**
         * The type of electronic position fixing device (e.g. GPS, GLONASS, etc.). Intended as, but
         * not constrained to, the USCG NAVCEN electronic position fixing device definitions. Users
         * should refer to USCG Navigation Center documentation for specific device type
         * information. USCG NAVCEN documentation may be found at https://www.navcen.uscg.gov.
         */
        fun posDeviceType(posDeviceType: String) = posDeviceType(JsonField.of(posDeviceType))

        /**
         * Sets [Builder.posDeviceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.posDeviceType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun posDeviceType(posDeviceType: JsonField<String>) = apply {
            this.posDeviceType = posDeviceType
        }

        /**
         * Pulse repetition frequency of the emitter, measured in pulses per second. PRF is the
         * number of pulses transmitted per second. This is the reciprocal of the pri value.
         */
        fun prf(prf: Double) = prf(JsonField.of(prf))

        /**
         * Sets [Builder.prf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prf(prf: JsonField<Double>) = apply { this.prf = prf }

        /**
         * Pulse repetition interval of the emitter, measured in microseconds. The interval between
         * the start of one pulse and the start of another.
         */
        fun pri(pri: Double) = pri(JsonField.of(pri))

        /**
         * Sets [Builder.pri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pri] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pri(pri: JsonField<Double>) = apply { this.pri = pri }

        /** The number of propeller revolutions per minute for a submarine or ship. */
        fun propRpm(propRpm: Double) = propRpm(JsonField.of(propRpm))

        /**
         * Sets [Builder.propRpm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propRpm] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun propRpm(propRpm: JsonField<Double>) = apply { this.propRpm = propRpm }

        /** The type of propulsion employed by the track object (Diesel, Nuclear). */
        fun propType(propType: String) = propType(JsonField.of(propType))

        /**
         * Sets [Builder.propType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun propType(propType: JsonField<String>) = apply { this.propType = propType }

        /**
         * Pulse width of the emitter, measured in microseconds. This is the duration of the pulse.
         */
        fun pw(pw: Double) = pw(JsonField.of(pw))

        /**
         * Sets [Builder.pw] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pw] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pw(pw: JsonField<Double>) = apply { this.pw = pw }

        /**
         * Flag indicating for the track represents a reduced force object or group. Based on
         * MIL-STD-2525 symbology definitions.
         */
        fun reduced(reduced: Boolean) = reduced(JsonField.of(reduced))

        /**
         * Sets [Builder.reduced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reduced] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reduced(reduced: JsonField<Boolean>) = apply { this.reduced = reduced }

        /**
         * Flag indicating that this track represents a reinforced object or group. Based on
         * MIL-STD-2525 symbology definitions.
         */
        fun reinforced(reinforced: Boolean) = reinforced(JsonField.of(reinforced))

        /**
         * Sets [Builder.reinforced] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reinforced] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reinforced(reinforced: JsonField<Boolean>) = apply { this.reinforced = reinforced }

        /** Flag indicating whether this track is archived. */
        fun rptArchived(rptArchived: Boolean) = rptArchived(JsonField.of(rptArchived))

        /**
         * Sets [Builder.rptArchived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rptArchived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rptArchived(rptArchived: JsonField<Boolean>) = apply { this.rptArchived = rptArchived }

        /** Source cross-reference code for the Command that originated the track report. */
        fun rptChxref(rptChxref: String) = rptChxref(JsonField.of(rptChxref))

        /**
         * Sets [Builder.rptChxref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rptChxref] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rptChxref(rptChxref: JsonField<String>) = apply { this.rptChxref = rptChxref }

        /**
         * A Reference Track Number used to associate information and directives with the track.
         * Referenced, but not constrained to, MIL-STD-6016F Reference Track Number. The 'rtnMsgTs'
         * and 'rtn' arrays must match in size.
         */
        fun rtn(rtn: List<String>) = rtn(JsonField.of(rtn))

        /**
         * Sets [Builder.rtn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtn] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rtn(rtn: JsonField<List<String>>) = apply { this.rtn = rtn.map { it.toMutableList() } }

        /**
         * Adds a single [String] to [Builder.rtn].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRtn(rtn: String) = apply {
            this.rtn =
                (this.rtn ?: JsonField.of(mutableListOf())).also { checkKnown("rtn", it).add(rtn) }
        }

        /** The name of the Command reporting the Received Track Number (RTN). */
        fun rtnCmd(rtnCmd: String) = rtnCmd(JsonField.of(rtnCmd))

        /**
         * Sets [Builder.rtnCmd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtnCmd] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rtnCmd(rtnCmd: JsonField<String>) = apply { this.rtnCmd = rtnCmd }

        /**
         * The message timestamp that the reference track position was recorded, in ISO 8601 UTC
         * format with microsecond precision. The 'rtnMsgTs' and 'rtn' arrays must match in size.
         */
        fun rtnMsgTs(rtnMsgTs: List<OffsetDateTime>) = rtnMsgTs(JsonField.of(rtnMsgTs))

        /**
         * Sets [Builder.rtnMsgTs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtnMsgTs] with a well-typed `List<OffsetDateTime>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rtnMsgTs(rtnMsgTs: JsonField<List<OffsetDateTime>>) = apply {
            this.rtnMsgTs = rtnMsgTs.map { it.toMutableList() }
        }

        /**
         * Adds a single [OffsetDateTime] to [rtnMsgTs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRtnMsgT(rtnMsgT: OffsetDateTime) = apply {
            rtnMsgTs =
                (rtnMsgTs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("rtnMsgTs", it).add(rtnMsgT)
                }
        }

        /** Value representing the state of the Received Track. */
        fun rtnTrkState(rtnTrkState: String) = rtnTrkState(JsonField.of(rtnTrkState))

        /**
         * Sets [Builder.rtnTrkState] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rtnTrkState] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rtnTrkState(rtnTrkState: JsonField<String>) = apply { this.rtnTrkState = rtnTrkState }

        /** Scan rate of the emitter, measured in seconds per rotation (SPR). */
        fun scanRate(scanRate: Double) = scanRate(JsonField.of(scanRate))

        /**
         * Sets [Builder.scanRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanRate] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanRate(scanRate: JsonField<Double>) = apply { this.scanRate = scanRate }

        /** Type of radar scan. */
        fun scanType(scanType: String) = scanType(JsonField.of(scanType))

        /**
         * Sets [Builder.scanType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scanType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scanType(scanType: JsonField<String>) = apply { this.scanType = scanType }

        /** The Sequential Contact Number (SCN) for this track. */
        fun scn(scn: Int) = scn(JsonField.of(scn))

        /**
         * Sets [Builder.scn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scn] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun scn(scn: JsonField<Int>) = apply { this.scn = scn }

        /**
         * The Ship Control Number (SCONUM) is a naval vessel identification number (alphanumeric
         * code) assigned by the Office of Naval Intelligence. SCONUM is sometimes referred to as
         * NOIC ID. SCONUMs are typically of the form A#####, where A is an alpha character and # is
         * numerical.
         */
        fun sconum(sconum: String) = sconum(JsonField.of(sconum))

        /**
         * Sets [Builder.sconum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sconum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sconum(sconum: JsonField<String>) = apply { this.sconum = sconum }

        /** Flag indicating that this track is self reported. */
        fun selfReport(selfReport: Boolean) = selfReport(JsonField.of(selfReport))

        /**
         * Sets [Builder.selfReport] to an arbitrary JSON value.
         *
         * You should usually call [Builder.selfReport] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun selfReport(selfReport: JsonField<Boolean>) = apply { this.selfReport = selfReport }

        /** Id/name of sensor providing the track data. */
        fun sen(sen: String) = sen(JsonField.of(sen))

        /**
         * Sets [Builder.sen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sen] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sen(sen: JsonField<String>) = apply { this.sen = sen }

        /**
         * The common name for a group of ships with similar design, usually named for the first
         * vessel of the class.
         */
        fun shipClass(shipClass: String) = shipClass(JsonField.of(shipClass))

        /**
         * Sets [Builder.shipClass] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shipClass] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shipClass(shipClass: JsonField<String>) = apply { this.shipClass = shipClass }

        /** Abbreviated track name. */
        fun shortName(shortName: String) = shortName(JsonField.of(shortName))

        /**
         * Sets [Builder.shortName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

        /** The unique identifier of the source node. */
        fun sourceUid(sourceUid: String) = sourceUid(JsonField.of(sourceUid))

        /**
         * Sets [Builder.sourceUid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceUid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceUid(sourceUid: JsonField<String>) = apply { this.sourceUid = sourceUid }

        /**
         * Space amplification indicates additional information on the space environment object
         * being reported (e.g. DEBRIS, FUEL-AIR EXPLOSIVE, NUCLEAR WARHEAD).
         */
        fun spaceAmp(spaceAmp: String) = spaceAmp(JsonField.of(spaceAmp))

        /**
         * Sets [Builder.spaceAmp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceAmp] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spaceAmp(spaceAmp: JsonField<String>) = apply { this.spaceAmp = spaceAmp }

        /**
         * Confidence level of the amplifying characteristics. Values range from 0 to 6, with 0
         * indicating the lowest confidence and 6 indicating the highest.
         */
        fun spaceAmpConf(spaceAmpConf: Int) = spaceAmpConf(JsonField.of(spaceAmpConf))

        /**
         * Sets [Builder.spaceAmpConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceAmpConf] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spaceAmpConf(spaceAmpConf: JsonField<Int>) = apply { this.spaceAmpConf = spaceAmpConf }

        /** Specific type of point or track with an environment of space. */
        fun spaceSpecType(spaceSpecType: String) = spaceSpecType(JsonField.of(spaceSpecType))

        /**
         * Sets [Builder.spaceSpecType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spaceSpecType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun spaceSpecType(spaceSpecType: JsonField<String>) = apply {
            this.spaceSpecType = spaceSpecType
        }

        /** Track object speed, in meters/sec. */
        fun spd(spd: Double) = spd(JsonField.of(spd))

        /**
         * Sets [Builder.spd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spd(spd: JsonField<Double>) = apply { this.spd = spd }

        /**
         * A text amplifier for units, equipment and installations; content is implementation
         * specific.
         */
        fun staffCmts(staffCmts: String) = staffCmts(JsonField.of(staffCmts))

        /**
         * Sets [Builder.staffCmts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.staffCmts] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun staffCmts(staffCmts: JsonField<String>) = apply { this.staffCmts = staffCmts }

        /** The stern type code (Counter, Cruiser) associated with the track object. */
        fun sternType(sternType: String) = sternType(JsonField.of(sternType))

        /**
         * Sets [Builder.sternType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sternType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sternType(sternType: JsonField<String>) = apply { this.sternType = sternType }

        /**
         * Flag indicating that this track represents a task force. Based on MIL-STD-2525 symbology
         * definitions.
         */
        fun taskForce(taskForce: Boolean) = taskForce(JsonField.of(taskForce))

        /**
         * Sets [Builder.taskForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taskForce] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taskForce(taskForce: JsonField<Boolean>) = apply { this.taskForce = taskForce }

        /**
         * The time, in ISO 8601 UTC format with millisecond precision, of the closest point of
         * approach between this track and the master reference track.
         */
        fun tcpa(tcpa: OffsetDateTime) = tcpa(JsonField.of(tcpa))

        /**
         * Sets [Builder.tcpa] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tcpa] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tcpa(tcpa: JsonField<OffsetDateTime>) = apply { this.tcpa = tcpa }

        /** Threat Event System Track ID. */
        fun tesEventId(tesEventId: String) = tesEventId(JsonField.of(tesEventId))

        /**
         * Sets [Builder.tesEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tesEventId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tesEventId(tesEventId: JsonField<String>) = apply { this.tesEventId = tesEventId }

        /** Motion model Time On Leg in hours. */
        fun tol(tol: Double) = tol(JsonField.of(tol))

        /**
         * Sets [Builder.tol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tol] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tol(tol: JsonField<Double>) = apply { this.tol = tol }

        /** The number of turns of the vessel propellers per knot of forward motion. */
        fun tpk(tpk: Double) = tpk(JsonField.of(tpk))

        /**
         * Sets [Builder.tpk] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tpk] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tpk(tpk: JsonField<Double>) = apply { this.tpk = tpk }

        /**
         * Overall track confidence estimate (not standardized, but typically a value between 0 and
         * 1, with 0 indicating lowest confidence).
         */
        fun trkConf(trkConf: Double) = trkConf(JsonField.of(trkConf))

        /**
         * Sets [Builder.trkConf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkConf] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkConf(trkConf: JsonField<Double>) = apply { this.trkConf = trkConf }

        /**
         * UUID identifying the track, which should remain the same on subsequent tracks of the same
         * object.
         */
        fun trkId(trkId: String) = trkId(JsonField.of(trkId))

        /**
         * Sets [Builder.trkId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkId(trkId: JsonField<String>) = apply { this.trkId = trkId }

        /**
         * The track number (TN) of a surveillance entity. Intended as, but not constrained to, the
         * J-series track number encoded as five character alpha-numeric characters. Users should
         * refer to J-series documentation for specific TN definitions.
         */
        fun trkNum(trkNum: String) = trkNum(JsonField.of(trkNum))

        /**
         * Sets [Builder.trkNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkNum] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkNum(trkNum: JsonField<String>) = apply { this.trkNum = trkNum }

        /**
         * Track Quality is reported as an integer from 0-15. Track Quality specifies the
         * reliability of the positional information of a reported track; Higher values indicate
         * higher track quality, i.e., lower errors in reported position.
         */
        fun trkQual(trkQual: Int) = trkQual(JsonField.of(trkQual))

        /**
         * Sets [Builder.trkQual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkQual] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkQual(trkQual: JsonField<Int>) = apply { this.trkQual = trkQual }

        /**
         * Value Indicating the scope of this track: 1 - TERMINAL (Terminal) - available only on the
         * workstation where they were created. 2 - LOCAL (Local) - available only on workstations
         * in the local area network 3 - OTH (Over the Horizon) - available to everyone.
         */
        fun trkScope(trkScope: String) = trkScope(JsonField.of(trkScope))

        /**
         * Sets [Builder.trkScope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trkScope] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun trkScope(trkScope: JsonField<String>) = apply { this.trkScope = trkScope }

        /** Transponder ID for the track. This does not correspond to the UDL transponder schema. */
        fun trnspdrId(trnspdrId: String) = trnspdrId(JsonField.of(trnspdrId))

        /**
         * Sets [Builder.trnspdrId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trnspdrId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trnspdrId(trnspdrId: JsonField<String>) = apply { this.trnspdrId = trnspdrId }

        /** Transponder type for the track. */
        fun trnspdrType(trnspdrType: String) = trnspdrType(JsonField.of(trnspdrType))

        /**
         * Sets [Builder.trnspdrType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trnspdrType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trnspdrType(trnspdrType: JsonField<String>) = apply { this.trnspdrType = trnspdrType }

        /** The weight, in tons, of the vessel associated with this track. */
        fun vslWt(vslWt: Double) = vslWt(JsonField.of(vslWt))

        /**
         * Sets [Builder.vslWt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vslWt] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vslWt(vslWt: JsonField<Double>) = apply { this.vslWt = vslWt }

        /**
         * The breadth of the vessel, in meters. A value of 63 indicates a vessel breadth of 63
         * meters or greater.
         */
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
         * Returns an immutable instance of [TrackDetailsFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .lat()
         * .lon()
         * .source()
         * .ts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TrackDetailsFull =
            TrackDetailsFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("lat", lat),
                checkRequired("lon", lon),
                checkRequired("source", source),
                checkRequired("ts", ts),
                id,
                acftSubType,
                addInfo,
                alert,
                alt,
                angElev,
                (antennaRefDimensions ?: JsonMissing.of()).map { it.toImmutable() },
                (aouRptData ?: JsonMissing.of()).map { it.toImmutable() },
                aouRptType,
                appGrp,
                arrCargo,
                arrFlag,
                arrPort,
                arrTime,
                aton,
                avgSpd,
                azCorrArcWidth,
                azCorrCenterLine,
                beNumber,
                boosting,
                burnoutAlt,
                callSign,
                cargoType,
                cI,
                containment,
                coopLocInd,
                course,
                cpa,
                createdAt,
                createdBy,
                depCargo,
                depFlag,
                depPort,
                desCargo,
                desFlag,
                destination,
                disId,
                draught,
                dropPtInd,
                dummy,
                (ecefPos ?: JsonMissing.of()).map { it.toImmutable() },
                (ecefVel ?: JsonMissing.of()).map { it.toImmutable() },
                elnot1,
                elnot2,
                emgInd,
                emitterName,
                env,
                errAreaOrient,
                errGeoAreaSwitch,
                errSemiIntAxis,
                errSemiMajElev,
                eta,
                etd,
                evalRating,
                feint,
                freq,
                ftn,
                ftnCmd,
                ftnMsgTs,
                harmonics,
                hdng,
                hq,
                hullNum,
                hullProf,
                identAmp,
                iff,
                imon,
                (impactAouData ?: JsonMissing.of()).map { it.toImmutable() },
                impactAouType,
                impactLat,
                impactLon,
                impactTime,
                infoSource,
                installation,
                (launchAouData ?: JsonMissing.of()).map { it.toImmutable() },
                launchAouType,
                launchLat,
                launchLon,
                launchTime,
                length,
                lostTrkInd,
                maneuverInd,
                maxFreq,
                midbCat,
                mil2525Bstr,
                mmsi,
                msgType,
                mslStatus,
                muidSrc,
                muidSrcTrk,
                name,
                navStatus,
                ntds,
                numBlades,
                numShafts,
                objAct,
                objIdent,
                objNat,
                objPlat,
                objType,
                offPosInd,
                origin,
                origNetwork,
                origXref,
                oSuffix,
                pif,
                pin,
                polarSingLocLat,
                polarSingLocLon,
                posDeviceType,
                prf,
                pri,
                propRpm,
                propType,
                pw,
                reduced,
                reinforced,
                rptArchived,
                rptChxref,
                (rtn ?: JsonMissing.of()).map { it.toImmutable() },
                rtnCmd,
                (rtnMsgTs ?: JsonMissing.of()).map { it.toImmutable() },
                rtnTrkState,
                scanRate,
                scanType,
                scn,
                sconum,
                selfReport,
                sen,
                shipClass,
                shortName,
                sourceUid,
                spaceAmp,
                spaceAmpConf,
                spaceSpecType,
                spd,
                staffCmts,
                sternType,
                taskForce,
                tcpa,
                tesEventId,
                tol,
                tpk,
                trkConf,
                trkId,
                trkNum,
                trkQual,
                trkScope,
                trnspdrId,
                trnspdrType,
                vslWt,
                width,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TrackDetailsFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        lat()
        lon()
        source()
        ts()
        id()
        acftSubType()
        addInfo()
        alert()
        alt()
        angElev()
        antennaRefDimensions()
        aouRptData()
        aouRptType()
        appGrp()
        arrCargo()
        arrFlag()
        arrPort()
        arrTime()
        aton()
        avgSpd()
        azCorrArcWidth()
        azCorrCenterLine()
        beNumber()
        boosting()
        burnoutAlt()
        callSign()
        cargoType()
        cI()
        containment()
        coopLocInd()
        course()
        cpa()
        createdAt()
        createdBy()
        depCargo()
        depFlag()
        depPort()
        desCargo()
        desFlag()
        destination()
        disId()
        draught()
        dropPtInd()
        dummy()
        ecefPos()
        ecefVel()
        elnot1()
        elnot2()
        emgInd()
        emitterName()
        env().ifPresent { it.validate() }
        errAreaOrient()
        errGeoAreaSwitch()
        errSemiIntAxis()
        errSemiMajElev()
        eta()
        etd()
        evalRating()
        feint()
        freq()
        ftn()
        ftnCmd()
        ftnMsgTs()
        harmonics()
        hdng()
        hq()
        hullNum()
        hullProf()
        identAmp()
        iff()
        imon()
        impactAouData()
        impactAouType()
        impactLat()
        impactLon()
        impactTime()
        infoSource()
        installation()
        launchAouData()
        launchAouType()
        launchLat()
        launchLon()
        launchTime()
        length()
        lostTrkInd()
        maneuverInd()
        maxFreq()
        midbCat()
        mil2525Bstr()
        mmsi()
        msgType()
        mslStatus()
        muidSrc()
        muidSrcTrk()
        name()
        navStatus()
        ntds()
        numBlades()
        numShafts()
        objAct()
        objIdent().ifPresent { it.validate() }
        objNat()
        objPlat()
        objType()
        offPosInd()
        origin()
        origNetwork()
        origXref()
        oSuffix()
        pif()
        pin()
        polarSingLocLat()
        polarSingLocLon()
        posDeviceType()
        prf()
        pri()
        propRpm()
        propType()
        pw()
        reduced()
        reinforced()
        rptArchived()
        rptChxref()
        rtn()
        rtnCmd()
        rtnMsgTs()
        rtnTrkState()
        scanRate()
        scanType()
        scn()
        sconum()
        selfReport()
        sen()
        shipClass()
        shortName()
        sourceUid()
        spaceAmp()
        spaceAmpConf()
        spaceSpecType()
        spd()
        staffCmts()
        sternType()
        taskForce()
        tcpa()
        tesEventId()
        tol()
        tpk()
        trkConf()
        trkId()
        trkNum()
        trkQual()
        trkScope()
        trnspdrId()
        trnspdrType()
        vslWt()
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
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lon.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (ts.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (acftSubType.asKnown().isPresent) 1 else 0) +
            (if (addInfo.asKnown().isPresent) 1 else 0) +
            (if (alert.asKnown().isPresent) 1 else 0) +
            (if (alt.asKnown().isPresent) 1 else 0) +
            (if (angElev.asKnown().isPresent) 1 else 0) +
            (antennaRefDimensions.asKnown().getOrNull()?.size ?: 0) +
            (aouRptData.asKnown().getOrNull()?.size ?: 0) +
            (if (aouRptType.asKnown().isPresent) 1 else 0) +
            (if (appGrp.asKnown().isPresent) 1 else 0) +
            (if (arrCargo.asKnown().isPresent) 1 else 0) +
            (if (arrFlag.asKnown().isPresent) 1 else 0) +
            (if (arrPort.asKnown().isPresent) 1 else 0) +
            (if (arrTime.asKnown().isPresent) 1 else 0) +
            (if (aton.asKnown().isPresent) 1 else 0) +
            (if (avgSpd.asKnown().isPresent) 1 else 0) +
            (if (azCorrArcWidth.asKnown().isPresent) 1 else 0) +
            (if (azCorrCenterLine.asKnown().isPresent) 1 else 0) +
            (if (beNumber.asKnown().isPresent) 1 else 0) +
            (if (boosting.asKnown().isPresent) 1 else 0) +
            (if (burnoutAlt.asKnown().isPresent) 1 else 0) +
            (if (callSign.asKnown().isPresent) 1 else 0) +
            (if (cargoType.asKnown().isPresent) 1 else 0) +
            (if (cI.asKnown().isPresent) 1 else 0) +
            (if (containment.asKnown().isPresent) 1 else 0) +
            (if (coopLocInd.asKnown().isPresent) 1 else 0) +
            (if (course.asKnown().isPresent) 1 else 0) +
            (if (cpa.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (depCargo.asKnown().isPresent) 1 else 0) +
            (if (depFlag.asKnown().isPresent) 1 else 0) +
            (if (depPort.asKnown().isPresent) 1 else 0) +
            (if (desCargo.asKnown().isPresent) 1 else 0) +
            (if (desFlag.asKnown().isPresent) 1 else 0) +
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (disId.asKnown().isPresent) 1 else 0) +
            (if (draught.asKnown().isPresent) 1 else 0) +
            (if (dropPtInd.asKnown().isPresent) 1 else 0) +
            (if (dummy.asKnown().isPresent) 1 else 0) +
            (ecefPos.asKnown().getOrNull()?.size ?: 0) +
            (ecefVel.asKnown().getOrNull()?.size ?: 0) +
            (if (elnot1.asKnown().isPresent) 1 else 0) +
            (if (elnot2.asKnown().isPresent) 1 else 0) +
            (if (emgInd.asKnown().isPresent) 1 else 0) +
            (if (emitterName.asKnown().isPresent) 1 else 0) +
            (env.asKnown().getOrNull()?.validity() ?: 0) +
            (if (errAreaOrient.asKnown().isPresent) 1 else 0) +
            (if (errGeoAreaSwitch.asKnown().isPresent) 1 else 0) +
            (if (errSemiIntAxis.asKnown().isPresent) 1 else 0) +
            (if (errSemiMajElev.asKnown().isPresent) 1 else 0) +
            (if (eta.asKnown().isPresent) 1 else 0) +
            (if (etd.asKnown().isPresent) 1 else 0) +
            (if (evalRating.asKnown().isPresent) 1 else 0) +
            (if (feint.asKnown().isPresent) 1 else 0) +
            (if (freq.asKnown().isPresent) 1 else 0) +
            (if (ftn.asKnown().isPresent) 1 else 0) +
            (if (ftnCmd.asKnown().isPresent) 1 else 0) +
            (if (ftnMsgTs.asKnown().isPresent) 1 else 0) +
            (if (harmonics.asKnown().isPresent) 1 else 0) +
            (if (hdng.asKnown().isPresent) 1 else 0) +
            (if (hq.asKnown().isPresent) 1 else 0) +
            (if (hullNum.asKnown().isPresent) 1 else 0) +
            (if (hullProf.asKnown().isPresent) 1 else 0) +
            (if (identAmp.asKnown().isPresent) 1 else 0) +
            (if (iff.asKnown().isPresent) 1 else 0) +
            (if (imon.asKnown().isPresent) 1 else 0) +
            (impactAouData.asKnown().getOrNull()?.size ?: 0) +
            (if (impactAouType.asKnown().isPresent) 1 else 0) +
            (if (impactLat.asKnown().isPresent) 1 else 0) +
            (if (impactLon.asKnown().isPresent) 1 else 0) +
            (if (impactTime.asKnown().isPresent) 1 else 0) +
            (if (infoSource.asKnown().isPresent) 1 else 0) +
            (if (installation.asKnown().isPresent) 1 else 0) +
            (launchAouData.asKnown().getOrNull()?.size ?: 0) +
            (if (launchAouType.asKnown().isPresent) 1 else 0) +
            (if (launchLat.asKnown().isPresent) 1 else 0) +
            (if (launchLon.asKnown().isPresent) 1 else 0) +
            (if (launchTime.asKnown().isPresent) 1 else 0) +
            (if (length.asKnown().isPresent) 1 else 0) +
            (if (lostTrkInd.asKnown().isPresent) 1 else 0) +
            (if (maneuverInd.asKnown().isPresent) 1 else 0) +
            (if (maxFreq.asKnown().isPresent) 1 else 0) +
            (if (midbCat.asKnown().isPresent) 1 else 0) +
            (if (mil2525Bstr.asKnown().isPresent) 1 else 0) +
            (if (mmsi.asKnown().isPresent) 1 else 0) +
            (if (msgType.asKnown().isPresent) 1 else 0) +
            (if (mslStatus.asKnown().isPresent) 1 else 0) +
            (if (muidSrc.asKnown().isPresent) 1 else 0) +
            (if (muidSrcTrk.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (navStatus.asKnown().isPresent) 1 else 0) +
            (if (ntds.asKnown().isPresent) 1 else 0) +
            (if (numBlades.asKnown().isPresent) 1 else 0) +
            (if (numShafts.asKnown().isPresent) 1 else 0) +
            (if (objAct.asKnown().isPresent) 1 else 0) +
            (objIdent.asKnown().getOrNull()?.validity() ?: 0) +
            (if (objNat.asKnown().isPresent) 1 else 0) +
            (if (objPlat.asKnown().isPresent) 1 else 0) +
            (if (objType.asKnown().isPresent) 1 else 0) +
            (if (offPosInd.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (origXref.asKnown().isPresent) 1 else 0) +
            (if (oSuffix.asKnown().isPresent) 1 else 0) +
            (if (pif.asKnown().isPresent) 1 else 0) +
            (if (pin.asKnown().isPresent) 1 else 0) +
            (if (polarSingLocLat.asKnown().isPresent) 1 else 0) +
            (if (polarSingLocLon.asKnown().isPresent) 1 else 0) +
            (if (posDeviceType.asKnown().isPresent) 1 else 0) +
            (if (prf.asKnown().isPresent) 1 else 0) +
            (if (pri.asKnown().isPresent) 1 else 0) +
            (if (propRpm.asKnown().isPresent) 1 else 0) +
            (if (propType.asKnown().isPresent) 1 else 0) +
            (if (pw.asKnown().isPresent) 1 else 0) +
            (if (reduced.asKnown().isPresent) 1 else 0) +
            (if (reinforced.asKnown().isPresent) 1 else 0) +
            (if (rptArchived.asKnown().isPresent) 1 else 0) +
            (if (rptChxref.asKnown().isPresent) 1 else 0) +
            (rtn.asKnown().getOrNull()?.size ?: 0) +
            (if (rtnCmd.asKnown().isPresent) 1 else 0) +
            (rtnMsgTs.asKnown().getOrNull()?.size ?: 0) +
            (if (rtnTrkState.asKnown().isPresent) 1 else 0) +
            (if (scanRate.asKnown().isPresent) 1 else 0) +
            (if (scanType.asKnown().isPresent) 1 else 0) +
            (if (scn.asKnown().isPresent) 1 else 0) +
            (if (sconum.asKnown().isPresent) 1 else 0) +
            (if (selfReport.asKnown().isPresent) 1 else 0) +
            (if (sen.asKnown().isPresent) 1 else 0) +
            (if (shipClass.asKnown().isPresent) 1 else 0) +
            (if (shortName.asKnown().isPresent) 1 else 0) +
            (if (sourceUid.asKnown().isPresent) 1 else 0) +
            (if (spaceAmp.asKnown().isPresent) 1 else 0) +
            (if (spaceAmpConf.asKnown().isPresent) 1 else 0) +
            (if (spaceSpecType.asKnown().isPresent) 1 else 0) +
            (if (spd.asKnown().isPresent) 1 else 0) +
            (if (staffCmts.asKnown().isPresent) 1 else 0) +
            (if (sternType.asKnown().isPresent) 1 else 0) +
            (if (taskForce.asKnown().isPresent) 1 else 0) +
            (if (tcpa.asKnown().isPresent) 1 else 0) +
            (if (tesEventId.asKnown().isPresent) 1 else 0) +
            (if (tol.asKnown().isPresent) 1 else 0) +
            (if (tpk.asKnown().isPresent) 1 else 0) +
            (if (trkConf.asKnown().isPresent) 1 else 0) +
            (if (trkId.asKnown().isPresent) 1 else 0) +
            (if (trkNum.asKnown().isPresent) 1 else 0) +
            (if (trkQual.asKnown().isPresent) 1 else 0) +
            (if (trkScope.asKnown().isPresent) 1 else 0) +
            (if (trnspdrId.asKnown().isPresent) 1 else 0) +
            (if (trnspdrType.asKnown().isPresent) 1 else 0) +
            (if (vslWt.asKnown().isPresent) 1 else 0) +
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

            return /* spotless:off */ other is DataMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The track environment type (AIR, LAND, SPACE, SUBSURFACE, SURFACE, UNKNOWN):
     *
     * AIR: Between sea level and the Kármán line, which has an altitude of 100 kilometers (62
     * miles).
     *
     * LAND: On the surface of dry land.
     *
     * SPACE: Above the Kármán line, which has an altitude of 100 kilometers (62 miles).
     *
     * SURFACE: On the surface of a body of water.
     *
     * SUBSURFACE: Below the surface of a body of water.
     *
     * UNKNOWN: Environment is not known.
     */
    class Env @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AIR = of("AIR")

            @JvmField val LAND = of("LAND")

            @JvmField val SPACE = of("SPACE")

            @JvmField val SURFACE = of("SURFACE")

            @JvmField val SUBSURFACE = of("SUBSURFACE")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = Env(JsonField.of(value))
        }

        /** An enum containing [Env]'s known values. */
        enum class Known {
            AIR,
            LAND,
            SPACE,
            SURFACE,
            SUBSURFACE,
            UNKNOWN,
        }

        /**
         * An enum containing [Env]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Env] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AIR,
            LAND,
            SPACE,
            SURFACE,
            SUBSURFACE,
            UNKNOWN,
            /** An enum member indicating that [Env] was instantiated with an unknown value. */
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
                AIR -> Value.AIR
                LAND -> Value.LAND
                SPACE -> Value.SPACE
                SURFACE -> Value.SURFACE
                SUBSURFACE -> Value.SUBSURFACE
                UNKNOWN -> Value.UNKNOWN
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
                AIR -> Known.AIR
                LAND -> Known.LAND
                SPACE -> Known.SPACE
                SURFACE -> Known.SURFACE
                SUBSURFACE -> Known.SUBSURFACE
                UNKNOWN -> Known.UNKNOWN
                else -> throw UnifieddatalibraryInvalidDataException("Unknown Env: $value")
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

        fun validate(): Env = apply {
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

            return /* spotless:off */ other is Env && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The estimated identity of the track object (ASSUMED FRIEND, FRIEND, HOSTILE, NEUTRAL,
     * PENDING, SUSPECT, UNKNOWN):
     *
     * ASSUMED FRIEND: Track assumed to be a friend due to the object characteristics, behavior,
     * and/or origin.
     *
     * FRIEND: Track object supporting friendly forces and belonging to a declared friendly nation
     * or entity.
     *
     * HOSTILE: Track object belonging to an opposing nation, party, group, or entity deemed to
     * contribute to a threat to friendly forces or their mission due to its behavior,
     * characteristics, nationality, or origin.
     *
     * NEUTRAL: Track object whose characteristics, behavior, nationality, and/or origin indicate
     * that it is neither supporting nor opposing friendly forces or their mission.
     *
     * PENDING: Track object which has not been evaluated.
     *
     * SUSPECT: Track object deemed potentially hostile due to the object characteristics, behavior,
     * nationality, and/or origin.
     *
     * UNKNOWN: Track object which has been evaluated and does not meet criteria for any standard
     * identity.
     */
    class ObjIdent @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ASSUMED_FRIEND = of("ASSUMED FRIEND")

            @JvmField val FRIEND = of("FRIEND")

            @JvmField val HOSTILE = of("HOSTILE")

            @JvmField val NEUTRAL = of("NEUTRAL")

            @JvmField val PENDING = of("PENDING")

            @JvmField val SUSPECT = of("SUSPECT")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = ObjIdent(JsonField.of(value))
        }

        /** An enum containing [ObjIdent]'s known values. */
        enum class Known {
            ASSUMED_FRIEND,
            FRIEND,
            HOSTILE,
            NEUTRAL,
            PENDING,
            SUSPECT,
            UNKNOWN,
        }

        /**
         * An enum containing [ObjIdent]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ObjIdent] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASSUMED_FRIEND,
            FRIEND,
            HOSTILE,
            NEUTRAL,
            PENDING,
            SUSPECT,
            UNKNOWN,
            /** An enum member indicating that [ObjIdent] was instantiated with an unknown value. */
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
                ASSUMED_FRIEND -> Value.ASSUMED_FRIEND
                FRIEND -> Value.FRIEND
                HOSTILE -> Value.HOSTILE
                NEUTRAL -> Value.NEUTRAL
                PENDING -> Value.PENDING
                SUSPECT -> Value.SUSPECT
                UNKNOWN -> Value.UNKNOWN
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
                ASSUMED_FRIEND -> Known.ASSUMED_FRIEND
                FRIEND -> Known.FRIEND
                HOSTILE -> Known.HOSTILE
                NEUTRAL -> Known.NEUTRAL
                PENDING -> Known.PENDING
                SUSPECT -> Known.SUSPECT
                UNKNOWN -> Known.UNKNOWN
                else -> throw UnifieddatalibraryInvalidDataException("Unknown ObjIdent: $value")
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

        fun validate(): ObjIdent = apply {
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

            return /* spotless:off */ other is ObjIdent && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TrackDetailsFull && classificationMarking == other.classificationMarking && dataMode == other.dataMode && lat == other.lat && lon == other.lon && source == other.source && ts == other.ts && id == other.id && acftSubType == other.acftSubType && addInfo == other.addInfo && alert == other.alert && alt == other.alt && angElev == other.angElev && antennaRefDimensions == other.antennaRefDimensions && aouRptData == other.aouRptData && aouRptType == other.aouRptType && appGrp == other.appGrp && arrCargo == other.arrCargo && arrFlag == other.arrFlag && arrPort == other.arrPort && arrTime == other.arrTime && aton == other.aton && avgSpd == other.avgSpd && azCorrArcWidth == other.azCorrArcWidth && azCorrCenterLine == other.azCorrCenterLine && beNumber == other.beNumber && boosting == other.boosting && burnoutAlt == other.burnoutAlt && callSign == other.callSign && cargoType == other.cargoType && cI == other.cI && containment == other.containment && coopLocInd == other.coopLocInd && course == other.course && cpa == other.cpa && createdAt == other.createdAt && createdBy == other.createdBy && depCargo == other.depCargo && depFlag == other.depFlag && depPort == other.depPort && desCargo == other.desCargo && desFlag == other.desFlag && destination == other.destination && disId == other.disId && draught == other.draught && dropPtInd == other.dropPtInd && dummy == other.dummy && ecefPos == other.ecefPos && ecefVel == other.ecefVel && elnot1 == other.elnot1 && elnot2 == other.elnot2 && emgInd == other.emgInd && emitterName == other.emitterName && env == other.env && errAreaOrient == other.errAreaOrient && errGeoAreaSwitch == other.errGeoAreaSwitch && errSemiIntAxis == other.errSemiIntAxis && errSemiMajElev == other.errSemiMajElev && eta == other.eta && etd == other.etd && evalRating == other.evalRating && feint == other.feint && freq == other.freq && ftn == other.ftn && ftnCmd == other.ftnCmd && ftnMsgTs == other.ftnMsgTs && harmonics == other.harmonics && hdng == other.hdng && hq == other.hq && hullNum == other.hullNum && hullProf == other.hullProf && identAmp == other.identAmp && iff == other.iff && imon == other.imon && impactAouData == other.impactAouData && impactAouType == other.impactAouType && impactLat == other.impactLat && impactLon == other.impactLon && impactTime == other.impactTime && infoSource == other.infoSource && installation == other.installation && launchAouData == other.launchAouData && launchAouType == other.launchAouType && launchLat == other.launchLat && launchLon == other.launchLon && launchTime == other.launchTime && length == other.length && lostTrkInd == other.lostTrkInd && maneuverInd == other.maneuverInd && maxFreq == other.maxFreq && midbCat == other.midbCat && mil2525Bstr == other.mil2525Bstr && mmsi == other.mmsi && msgType == other.msgType && mslStatus == other.mslStatus && muidSrc == other.muidSrc && muidSrcTrk == other.muidSrcTrk && name == other.name && navStatus == other.navStatus && ntds == other.ntds && numBlades == other.numBlades && numShafts == other.numShafts && objAct == other.objAct && objIdent == other.objIdent && objNat == other.objNat && objPlat == other.objPlat && objType == other.objType && offPosInd == other.offPosInd && origin == other.origin && origNetwork == other.origNetwork && origXref == other.origXref && oSuffix == other.oSuffix && pif == other.pif && pin == other.pin && polarSingLocLat == other.polarSingLocLat && polarSingLocLon == other.polarSingLocLon && posDeviceType == other.posDeviceType && prf == other.prf && pri == other.pri && propRpm == other.propRpm && propType == other.propType && pw == other.pw && reduced == other.reduced && reinforced == other.reinforced && rptArchived == other.rptArchived && rptChxref == other.rptChxref && rtn == other.rtn && rtnCmd == other.rtnCmd && rtnMsgTs == other.rtnMsgTs && rtnTrkState == other.rtnTrkState && scanRate == other.scanRate && scanType == other.scanType && scn == other.scn && sconum == other.sconum && selfReport == other.selfReport && sen == other.sen && shipClass == other.shipClass && shortName == other.shortName && sourceUid == other.sourceUid && spaceAmp == other.spaceAmp && spaceAmpConf == other.spaceAmpConf && spaceSpecType == other.spaceSpecType && spd == other.spd && staffCmts == other.staffCmts && sternType == other.sternType && taskForce == other.taskForce && tcpa == other.tcpa && tesEventId == other.tesEventId && tol == other.tol && tpk == other.tpk && trkConf == other.trkConf && trkId == other.trkId && trkNum == other.trkNum && trkQual == other.trkQual && trkScope == other.trkScope && trnspdrId == other.trnspdrId && trnspdrType == other.trnspdrType && vslWt == other.vslWt && width == other.width && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(classificationMarking, dataMode, lat, lon, source, ts, id, acftSubType, addInfo, alert, alt, angElev, antennaRefDimensions, aouRptData, aouRptType, appGrp, arrCargo, arrFlag, arrPort, arrTime, aton, avgSpd, azCorrArcWidth, azCorrCenterLine, beNumber, boosting, burnoutAlt, callSign, cargoType, cI, containment, coopLocInd, course, cpa, createdAt, createdBy, depCargo, depFlag, depPort, desCargo, desFlag, destination, disId, draught, dropPtInd, dummy, ecefPos, ecefVel, elnot1, elnot2, emgInd, emitterName, env, errAreaOrient, errGeoAreaSwitch, errSemiIntAxis, errSemiMajElev, eta, etd, evalRating, feint, freq, ftn, ftnCmd, ftnMsgTs, harmonics, hdng, hq, hullNum, hullProf, identAmp, iff, imon, impactAouData, impactAouType, impactLat, impactLon, impactTime, infoSource, installation, launchAouData, launchAouType, launchLat, launchLon, launchTime, length, lostTrkInd, maneuverInd, maxFreq, midbCat, mil2525Bstr, mmsi, msgType, mslStatus, muidSrc, muidSrcTrk, name, navStatus, ntds, numBlades, numShafts, objAct, objIdent, objNat, objPlat, objType, offPosInd, origin, origNetwork, origXref, oSuffix, pif, pin, polarSingLocLat, polarSingLocLon, posDeviceType, prf, pri, propRpm, propType, pw, reduced, reinforced, rptArchived, rptChxref, rtn, rtnCmd, rtnMsgTs, rtnTrkState, scanRate, scanType, scn, sconum, selfReport, sen, shipClass, shortName, sourceUid, spaceAmp, spaceAmpConf, spaceSpecType, spd, staffCmts, sternType, taskForce, tcpa, tesEventId, tol, tpk, trkConf, trkId, trkNum, trkQual, trkScope, trnspdrId, trnspdrType, vslWt, width, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TrackDetailsFull{classificationMarking=$classificationMarking, dataMode=$dataMode, lat=$lat, lon=$lon, source=$source, ts=$ts, id=$id, acftSubType=$acftSubType, addInfo=$addInfo, alert=$alert, alt=$alt, angElev=$angElev, antennaRefDimensions=$antennaRefDimensions, aouRptData=$aouRptData, aouRptType=$aouRptType, appGrp=$appGrp, arrCargo=$arrCargo, arrFlag=$arrFlag, arrPort=$arrPort, arrTime=$arrTime, aton=$aton, avgSpd=$avgSpd, azCorrArcWidth=$azCorrArcWidth, azCorrCenterLine=$azCorrCenterLine, beNumber=$beNumber, boosting=$boosting, burnoutAlt=$burnoutAlt, callSign=$callSign, cargoType=$cargoType, cI=$cI, containment=$containment, coopLocInd=$coopLocInd, course=$course, cpa=$cpa, createdAt=$createdAt, createdBy=$createdBy, depCargo=$depCargo, depFlag=$depFlag, depPort=$depPort, desCargo=$desCargo, desFlag=$desFlag, destination=$destination, disId=$disId, draught=$draught, dropPtInd=$dropPtInd, dummy=$dummy, ecefPos=$ecefPos, ecefVel=$ecefVel, elnot1=$elnot1, elnot2=$elnot2, emgInd=$emgInd, emitterName=$emitterName, env=$env, errAreaOrient=$errAreaOrient, errGeoAreaSwitch=$errGeoAreaSwitch, errSemiIntAxis=$errSemiIntAxis, errSemiMajElev=$errSemiMajElev, eta=$eta, etd=$etd, evalRating=$evalRating, feint=$feint, freq=$freq, ftn=$ftn, ftnCmd=$ftnCmd, ftnMsgTs=$ftnMsgTs, harmonics=$harmonics, hdng=$hdng, hq=$hq, hullNum=$hullNum, hullProf=$hullProf, identAmp=$identAmp, iff=$iff, imon=$imon, impactAouData=$impactAouData, impactAouType=$impactAouType, impactLat=$impactLat, impactLon=$impactLon, impactTime=$impactTime, infoSource=$infoSource, installation=$installation, launchAouData=$launchAouData, launchAouType=$launchAouType, launchLat=$launchLat, launchLon=$launchLon, launchTime=$launchTime, length=$length, lostTrkInd=$lostTrkInd, maneuverInd=$maneuverInd, maxFreq=$maxFreq, midbCat=$midbCat, mil2525Bstr=$mil2525Bstr, mmsi=$mmsi, msgType=$msgType, mslStatus=$mslStatus, muidSrc=$muidSrc, muidSrcTrk=$muidSrcTrk, name=$name, navStatus=$navStatus, ntds=$ntds, numBlades=$numBlades, numShafts=$numShafts, objAct=$objAct, objIdent=$objIdent, objNat=$objNat, objPlat=$objPlat, objType=$objType, offPosInd=$offPosInd, origin=$origin, origNetwork=$origNetwork, origXref=$origXref, oSuffix=$oSuffix, pif=$pif, pin=$pin, polarSingLocLat=$polarSingLocLat, polarSingLocLon=$polarSingLocLon, posDeviceType=$posDeviceType, prf=$prf, pri=$pri, propRpm=$propRpm, propType=$propType, pw=$pw, reduced=$reduced, reinforced=$reinforced, rptArchived=$rptArchived, rptChxref=$rptChxref, rtn=$rtn, rtnCmd=$rtnCmd, rtnMsgTs=$rtnMsgTs, rtnTrkState=$rtnTrkState, scanRate=$scanRate, scanType=$scanType, scn=$scn, sconum=$sconum, selfReport=$selfReport, sen=$sen, shipClass=$shipClass, shortName=$shortName, sourceUid=$sourceUid, spaceAmp=$spaceAmp, spaceAmpConf=$spaceAmpConf, spaceSpecType=$spaceSpecType, spd=$spd, staffCmts=$staffCmts, sternType=$sternType, taskForce=$taskForce, tcpa=$tcpa, tesEventId=$tesEventId, tol=$tol, tpk=$tpk, trkConf=$trkConf, trkId=$trkId, trkNum=$trkNum, trkQual=$trkQual, trkScope=$trkScope, trnspdrId=$trnspdrId, trnspdrType=$trnspdrType, vslWt=$vslWt, width=$width, additionalProperties=$additionalProperties}"
}

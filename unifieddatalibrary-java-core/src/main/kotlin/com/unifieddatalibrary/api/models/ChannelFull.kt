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
import com.unifieddatalibrary.api.core.checkRequired
import com.unifieddatalibrary.api.errors.UnifieddatalibraryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Channel information on a particular transponder. */
class ChannelFull
private constructor(
    private val classificationMarking: JsonField<String>,
    private val dataMode: JsonField<DataMode>,
    private val idTransponder: JsonField<String>,
    private val name: JsonField<String>,
    private val source: JsonField<String>,
    private val id: JsonField<String>,
    private val apid: JsonField<String>,
    private val beamName: JsonField<String>,
    private val compression: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val encryption: JsonField<String>,
    private val idBeam: JsonField<String>,
    private val idRfBand: JsonField<String>,
    private val origin: JsonField<String>,
    private val origNetwork: JsonField<String>,
    private val owner: JsonField<String>,
    private val pkg: JsonField<String>,
    private val res: JsonField<String>,
    private val sid: JsonField<String>,
    private val type: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val updatedBy: JsonField<String>,
    private val vpid: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        classificationMarking: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataMode") @ExcludeMissing dataMode: JsonField<DataMode> = JsonMissing.of(),
        @JsonProperty("idTransponder")
        @ExcludeMissing
        idTransponder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("apid") @ExcludeMissing apid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beamName") @ExcludeMissing beamName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("compression")
        @ExcludeMissing
        compression: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("encryption")
        @ExcludeMissing
        encryption: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idBeam") @ExcludeMissing idBeam: JsonField<String> = JsonMissing.of(),
        @JsonProperty("idRFBand") @ExcludeMissing idRfBand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin") @ExcludeMissing origin: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origNetwork")
        @ExcludeMissing
        origNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pkg") @ExcludeMissing pkg: JsonField<String> = JsonMissing.of(),
        @JsonProperty("res") @ExcludeMissing res: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sid") @ExcludeMissing sid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updatedBy") @ExcludeMissing updatedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vpid") @ExcludeMissing vpid: JsonField<String> = JsonMissing.of(),
    ) : this(
        classificationMarking,
        dataMode,
        idTransponder,
        name,
        source,
        id,
        apid,
        beamName,
        compression,
        createdAt,
        createdBy,
        encryption,
        idBeam,
        idRfBand,
        origin,
        origNetwork,
        owner,
        pkg,
        res,
        sid,
        type,
        updatedAt,
        updatedBy,
        vpid,
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
     * ID of the parent transponder object for this Channel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun idTransponder(): String = idTransponder.getRequired("idTransponder")

    /**
     * Channel name.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

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
     * Channel aPid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun apid(): Optional<String> = apid.getOptional("apid")

    /**
     * The antenna beam ID of the particular beam for this channel. beamName is not unique across
     * payloads.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun beamName(): Optional<String> = beamName.getOptional("beamName")

    /**
     * Channel compression.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun compression(): Optional<String> = compression.getOptional("compression")

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
     * Channel encryption.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun encryption(): Optional<String> = encryption.getOptional("encryption")

    /**
     * Identifier of the particular beam for this channel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idBeam(): Optional<String> = idBeam.getOptional("idBeam")

    /**
     * ID of the RF Band object for this channel.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun idRfBand(): Optional<String> = idRfBand.getOptional("idRFBand")

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
     * Owner.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun owner(): Optional<String> = owner.getOptional("owner")

    /**
     * Pkg.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun pkg(): Optional<String> = pkg.getOptional("pkg")

    /**
     * Res.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun res(): Optional<String> = res.getOptional("res")

    /**
     * SID.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun sid(): Optional<String> = sid.getOptional("sid")

    /**
     * Channel type.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun type(): Optional<String> = type.getOptional("type")

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
     * Channel vPid.
     *
     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun vpid(): Optional<String> = vpid.getOptional("vpid")

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
     * Returns the raw JSON value of [idTransponder].
     *
     * Unlike [idTransponder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idTransponder")
    @ExcludeMissing
    fun _idTransponder(): JsonField<String> = idTransponder

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
     * Returns the raw JSON value of [apid].
     *
     * Unlike [apid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("apid") @ExcludeMissing fun _apid(): JsonField<String> = apid

    /**
     * Returns the raw JSON value of [beamName].
     *
     * Unlike [beamName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beamName") @ExcludeMissing fun _beamName(): JsonField<String> = beamName

    /**
     * Returns the raw JSON value of [compression].
     *
     * Unlike [compression], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("compression") @ExcludeMissing fun _compression(): JsonField<String> = compression

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
     * Returns the raw JSON value of [encryption].
     *
     * Unlike [encryption], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encryption") @ExcludeMissing fun _encryption(): JsonField<String> = encryption

    /**
     * Returns the raw JSON value of [idBeam].
     *
     * Unlike [idBeam], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idBeam") @ExcludeMissing fun _idBeam(): JsonField<String> = idBeam

    /**
     * Returns the raw JSON value of [idRfBand].
     *
     * Unlike [idRfBand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idRFBand") @ExcludeMissing fun _idRfBand(): JsonField<String> = idRfBand

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
     * Returns the raw JSON value of [owner].
     *
     * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

    /**
     * Returns the raw JSON value of [pkg].
     *
     * Unlike [pkg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pkg") @ExcludeMissing fun _pkg(): JsonField<String> = pkg

    /**
     * Returns the raw JSON value of [res].
     *
     * Unlike [res], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("res") @ExcludeMissing fun _res(): JsonField<String> = res

    /**
     * Returns the raw JSON value of [sid].
     *
     * Unlike [sid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sid") @ExcludeMissing fun _sid(): JsonField<String> = sid

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
     * Returns the raw JSON value of [vpid].
     *
     * Unlike [vpid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vpid") @ExcludeMissing fun _vpid(): JsonField<String> = vpid

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
         * Returns a mutable builder for constructing an instance of [ChannelFull].
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idTransponder()
         * .name()
         * .source()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChannelFull]. */
    class Builder internal constructor() {

        private var classificationMarking: JsonField<String>? = null
        private var dataMode: JsonField<DataMode>? = null
        private var idTransponder: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var source: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var apid: JsonField<String> = JsonMissing.of()
        private var beamName: JsonField<String> = JsonMissing.of()
        private var compression: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var encryption: JsonField<String> = JsonMissing.of()
        private var idBeam: JsonField<String> = JsonMissing.of()
        private var idRfBand: JsonField<String> = JsonMissing.of()
        private var origin: JsonField<String> = JsonMissing.of()
        private var origNetwork: JsonField<String> = JsonMissing.of()
        private var owner: JsonField<String> = JsonMissing.of()
        private var pkg: JsonField<String> = JsonMissing.of()
        private var res: JsonField<String> = JsonMissing.of()
        private var sid: JsonField<String> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedBy: JsonField<String> = JsonMissing.of()
        private var vpid: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(channelFull: ChannelFull) = apply {
            classificationMarking = channelFull.classificationMarking
            dataMode = channelFull.dataMode
            idTransponder = channelFull.idTransponder
            name = channelFull.name
            source = channelFull.source
            id = channelFull.id
            apid = channelFull.apid
            beamName = channelFull.beamName
            compression = channelFull.compression
            createdAt = channelFull.createdAt
            createdBy = channelFull.createdBy
            encryption = channelFull.encryption
            idBeam = channelFull.idBeam
            idRfBand = channelFull.idRfBand
            origin = channelFull.origin
            origNetwork = channelFull.origNetwork
            owner = channelFull.owner
            pkg = channelFull.pkg
            res = channelFull.res
            sid = channelFull.sid
            type = channelFull.type
            updatedAt = channelFull.updatedAt
            updatedBy = channelFull.updatedBy
            vpid = channelFull.vpid
            additionalProperties = channelFull.additionalProperties.toMutableMap()
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

        /** ID of the parent transponder object for this Channel. */
        fun idTransponder(idTransponder: String) = idTransponder(JsonField.of(idTransponder))

        /**
         * Sets [Builder.idTransponder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idTransponder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun idTransponder(idTransponder: JsonField<String>) = apply {
            this.idTransponder = idTransponder
        }

        /** Channel name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /** Channel aPid. */
        fun apid(apid: String) = apid(JsonField.of(apid))

        /**
         * Sets [Builder.apid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun apid(apid: JsonField<String>) = apply { this.apid = apid }

        /**
         * The antenna beam ID of the particular beam for this channel. beamName is not unique
         * across payloads.
         */
        fun beamName(beamName: String) = beamName(JsonField.of(beamName))

        /**
         * Sets [Builder.beamName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beamName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun beamName(beamName: JsonField<String>) = apply { this.beamName = beamName }

        /** Channel compression. */
        fun compression(compression: String) = compression(JsonField.of(compression))

        /**
         * Sets [Builder.compression] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compression] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun compression(compression: JsonField<String>) = apply { this.compression = compression }

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

        /** Channel encryption. */
        fun encryption(encryption: String) = encryption(JsonField.of(encryption))

        /**
         * Sets [Builder.encryption] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryption] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun encryption(encryption: JsonField<String>) = apply { this.encryption = encryption }

        /** Identifier of the particular beam for this channel. */
        fun idBeam(idBeam: String) = idBeam(JsonField.of(idBeam))

        /**
         * Sets [Builder.idBeam] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idBeam] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idBeam(idBeam: JsonField<String>) = apply { this.idBeam = idBeam }

        /** ID of the RF Band object for this channel. */
        fun idRfBand(idRfBand: String) = idRfBand(JsonField.of(idRfBand))

        /**
         * Sets [Builder.idRfBand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idRfBand] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun idRfBand(idRfBand: JsonField<String>) = apply { this.idRfBand = idRfBand }

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

        /** Owner. */
        fun owner(owner: String) = owner(JsonField.of(owner))

        /**
         * Sets [Builder.owner] to an arbitrary JSON value.
         *
         * You should usually call [Builder.owner] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun owner(owner: JsonField<String>) = apply { this.owner = owner }

        /** Pkg. */
        fun pkg(pkg: String) = pkg(JsonField.of(pkg))

        /**
         * Sets [Builder.pkg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pkg] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pkg(pkg: JsonField<String>) = apply { this.pkg = pkg }

        /** Res. */
        fun res(res: String) = res(JsonField.of(res))

        /**
         * Sets [Builder.res] to an arbitrary JSON value.
         *
         * You should usually call [Builder.res] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun res(res: JsonField<String>) = apply { this.res = res }

        /** SID. */
        fun sid(sid: String) = sid(JsonField.of(sid))

        /**
         * Sets [Builder.sid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sid(sid: JsonField<String>) = apply { this.sid = sid }

        /** Channel type. */
        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

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

        /** Channel vPid. */
        fun vpid(vpid: String) = vpid(JsonField.of(vpid))

        /**
         * Sets [Builder.vpid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vpid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vpid(vpid: JsonField<String>) = apply { this.vpid = vpid }

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
         * Returns an immutable instance of [ChannelFull].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .classificationMarking()
         * .dataMode()
         * .idTransponder()
         * .name()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChannelFull =
            ChannelFull(
                checkRequired("classificationMarking", classificationMarking),
                checkRequired("dataMode", dataMode),
                checkRequired("idTransponder", idTransponder),
                checkRequired("name", name),
                checkRequired("source", source),
                id,
                apid,
                beamName,
                compression,
                createdAt,
                createdBy,
                encryption,
                idBeam,
                idRfBand,
                origin,
                origNetwork,
                owner,
                pkg,
                res,
                sid,
                type,
                updatedAt,
                updatedBy,
                vpid,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChannelFull = apply {
        if (validated) {
            return@apply
        }

        classificationMarking()
        dataMode().validate()
        idTransponder()
        name()
        source()
        id()
        apid()
        beamName()
        compression()
        createdAt()
        createdBy()
        encryption()
        idBeam()
        idRfBand()
        origin()
        origNetwork()
        owner()
        pkg()
        res()
        sid()
        type()
        updatedAt()
        updatedBy()
        vpid()
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
            (if (idTransponder.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (apid.asKnown().isPresent) 1 else 0) +
            (if (beamName.asKnown().isPresent) 1 else 0) +
            (if (compression.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (encryption.asKnown().isPresent) 1 else 0) +
            (if (idBeam.asKnown().isPresent) 1 else 0) +
            (if (idRfBand.asKnown().isPresent) 1 else 0) +
            (if (origin.asKnown().isPresent) 1 else 0) +
            (if (origNetwork.asKnown().isPresent) 1 else 0) +
            (if (owner.asKnown().isPresent) 1 else 0) +
            (if (pkg.asKnown().isPresent) 1 else 0) +
            (if (res.asKnown().isPresent) 1 else 0) +
            (if (sid.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (updatedBy.asKnown().isPresent) 1 else 0) +
            (if (vpid.asKnown().isPresent) 1 else 0)

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

        return other is ChannelFull &&
            classificationMarking == other.classificationMarking &&
            dataMode == other.dataMode &&
            idTransponder == other.idTransponder &&
            name == other.name &&
            source == other.source &&
            id == other.id &&
            apid == other.apid &&
            beamName == other.beamName &&
            compression == other.compression &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            encryption == other.encryption &&
            idBeam == other.idBeam &&
            idRfBand == other.idRfBand &&
            origin == other.origin &&
            origNetwork == other.origNetwork &&
            owner == other.owner &&
            pkg == other.pkg &&
            res == other.res &&
            sid == other.sid &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            updatedBy == other.updatedBy &&
            vpid == other.vpid &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            classificationMarking,
            dataMode,
            idTransponder,
            name,
            source,
            id,
            apid,
            beamName,
            compression,
            createdAt,
            createdBy,
            encryption,
            idBeam,
            idRfBand,
            origin,
            origNetwork,
            owner,
            pkg,
            res,
            sid,
            type,
            updatedAt,
            updatedBy,
            vpid,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChannelFull{classificationMarking=$classificationMarking, dataMode=$dataMode, idTransponder=$idTransponder, name=$name, source=$source, id=$id, apid=$apid, beamName=$beamName, compression=$compression, createdAt=$createdAt, createdBy=$createdBy, encryption=$encryption, idBeam=$idBeam, idRfBand=$idRfBand, origin=$origin, origNetwork=$origNetwork, owner=$owner, pkg=$pkg, res=$res, sid=$sid, type=$type, updatedAt=$updatedAt, updatedBy=$updatedBy, vpid=$vpid, additionalProperties=$additionalProperties}"
}

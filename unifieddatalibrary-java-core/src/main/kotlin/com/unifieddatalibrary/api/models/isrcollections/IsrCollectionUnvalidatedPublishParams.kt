// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.models.isrcollections

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Service operation to take multiple ISR Collections as a POST body and ingest into the database.
 * This operation is intended to be used for automated feeds into UDL. A specific role is required
 * to perform this service operation. Please contact the UDL team for assistance.
 */
class IsrCollectionUnvalidatedPublishParams
private constructor(
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
         * Returns a mutable builder for constructing an instance of
         * [IsrCollectionUnvalidatedPublishParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IsrCollectionUnvalidatedPublishParams]. */
    class Builder internal constructor() {

        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            isrCollectionUnvalidatedPublishParams: IsrCollectionUnvalidatedPublishParams
        ) = apply {
            body = isrCollectionUnvalidatedPublishParams.body.toMutableList()
            additionalHeaders = isrCollectionUnvalidatedPublishParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                isrCollectionUnvalidatedPublishParams.additionalQueryParams.toBuilder()
        }

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [IsrCollectionUnvalidatedPublishParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IsrCollectionUnvalidatedPublishParams =
            IsrCollectionUnvalidatedPublishParams(
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** ISR Collection data. */
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("classificationMarking")
        @ExcludeMissing
        private val classificationMarking: JsonField<String>,
        @JsonProperty("dataMode") @ExcludeMissing private val dataMode: JsonField<DataMode>,
        @JsonProperty("source") @ExcludeMissing private val source: JsonField<String>,
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String>,
        @JsonProperty("collectionRequirements")
        @ExcludeMissing
        private val collectionRequirements: JsonField<List<CollectionRequirement>>,
        @JsonProperty("createdAt") @ExcludeMissing private val createdAt: JsonField<OffsetDateTime>,
        @JsonProperty("createdBy") @ExcludeMissing private val createdBy: JsonField<String>,
        @JsonProperty("idexVersion") @ExcludeMissing private val idexVersion: JsonField<Int>,
        @JsonProperty("missionAOR") @ExcludeMissing private val missionAor: JsonField<String>,
        @JsonProperty("missionCollectionArea")
        @ExcludeMissing
        private val missionCollectionArea: JsonField<String>,
        @JsonProperty("missionCountry")
        @ExcludeMissing
        private val missionCountry: JsonField<String>,
        @JsonProperty("missionEmphasis")
        @ExcludeMissing
        private val missionEmphasis: JsonField<String>,
        @JsonProperty("missionId") @ExcludeMissing private val missionId: JsonField<String>,
        @JsonProperty("missionJoa") @ExcludeMissing private val missionJoa: JsonField<String>,
        @JsonProperty("missionOperation")
        @ExcludeMissing
        private val missionOperation: JsonField<String>,
        @JsonProperty("missionPrimaryIntelDiscipline")
        @ExcludeMissing
        private val missionPrimaryIntelDiscipline: JsonField<String>,
        @JsonProperty("missionPrimarySubCategory")
        @ExcludeMissing
        private val missionPrimarySubCategory: JsonField<String>,
        @JsonProperty("missionPriority")
        @ExcludeMissing
        private val missionPriority: JsonField<Int>,
        @JsonProperty("missionRegion") @ExcludeMissing private val missionRegion: JsonField<String>,
        @JsonProperty("missionRole") @ExcludeMissing private val missionRole: JsonField<String>,
        @JsonProperty("missionSecondaryIntelDiscipline")
        @ExcludeMissing
        private val missionSecondaryIntelDiscipline: JsonField<String>,
        @JsonProperty("missionSecondarySubCategory")
        @ExcludeMissing
        private val missionSecondarySubCategory: JsonField<String>,
        @JsonProperty("missionStartPointLat")
        @ExcludeMissing
        private val missionStartPointLat: JsonField<Double>,
        @JsonProperty("missionStartPointLong")
        @ExcludeMissing
        private val missionStartPointLong: JsonField<Double>,
        @JsonProperty("missionSubRegion")
        @ExcludeMissing
        private val missionSubRegion: JsonField<String>,
        @JsonProperty("missionSupportedUnit")
        @ExcludeMissing
        private val missionSupportedUnit: JsonField<String>,
        @JsonProperty("missionSyncMatrixBin")
        @ExcludeMissing
        private val missionSyncMatrixBin: JsonField<String>,
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<String>,
        @JsonProperty("origin") @ExcludeMissing private val origin: JsonField<String>,
        @JsonProperty("origNetwork") @ExcludeMissing private val origNetwork: JsonField<String>,
        @JsonProperty("taskings") @ExcludeMissing private val taskings: JsonField<List<Tasking>>,
        @JsonProperty("transit") @ExcludeMissing private val transit: JsonField<List<Transit>>,
        @JsonProperty("updatedAt") @ExcludeMissing private val updatedAt: JsonField<OffsetDateTime>,
        @JsonProperty("updatedBy") @ExcludeMissing private val updatedBy: JsonField<String>,
    ) {

        /**
         * Classification marking of the data in IC/CAPCO Portion-marked format.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun classificationMarking(): String =
            classificationMarking.getRequired("classificationMarking")

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
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun dataMode(): DataMode = dataMode.getRequired("dataMode")

        /**
         * Source of the data.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun source(): String = source.getRequired("source")

        /**
         * Unique identifier of the record, auto-generated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * Mission desired collection requirements.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun collectionRequirements(): Optional<List<CollectionRequirement>> =
            collectionRequirements.getOptional("collectionRequirements")

        /**
         * Time the row was created in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("createdAt")

        /**
         * Application user who created the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * Version of the IDEX software the request came from for compatibility.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun idexVersion(): Optional<Int> = idexVersion.getOptional("idexVersion")

        /**
         * Designation of mission Area Of Responsibility.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionAor(): Optional<String> = missionAor.getOptional("missionAOR")

        /**
         * Mission geographical collection area.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionCollectionArea(): Optional<String> =
            missionCollectionArea.getOptional("missionCollectionArea")

        /**
         * Country code of the mission. A Country may represent countries, multi-national
         * consortiums, and international organizations.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionCountry(): Optional<String> = missionCountry.getOptional("missionCountry")

        /**
         * Text version of what we are emphasizing in this mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionEmphasis(): Optional<String> = missionEmphasis.getOptional("missionEmphasis")

        /**
         * Mission Identifier.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionId(): Optional<String> = missionId.getOptional("missionId")

        /**
         * Joint Operations Area.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionJoa(): Optional<String> = missionJoa.getOptional("missionJoa")

        /**
         * Mission operation name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionOperation(): Optional<String> = missionOperation.getOptional("missionOperation")

        /**
         * Primary type of intelligence to be collected during the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionPrimaryIntelDiscipline(): Optional<String> =
            missionPrimaryIntelDiscipline.getOptional("missionPrimaryIntelDiscipline")

        /**
         * Sub category of primary intelligence to be collected.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionPrimarySubCategory(): Optional<String> =
            missionPrimarySubCategory.getOptional("missionPrimarySubCategory")

        /**
         * Mission Priority (1-n).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionPriority(): Optional<Int> = missionPriority.getOptional("missionPriority")

        /**
         * Region of the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionRegion(): Optional<String> = missionRegion.getOptional("missionRegion")

        /**
         * What is the primary objective(Role) of this mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionRole(): Optional<String> = missionRole.getOptional("missionRole")

        /**
         * Type of intelligence to be collected second.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionSecondaryIntelDiscipline(): Optional<String> =
            missionSecondaryIntelDiscipline.getOptional("missionSecondaryIntelDiscipline")

        /**
         * Mission sub category for secondary intelligence discipline to be collected.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionSecondarySubCategory(): Optional<String> =
            missionSecondarySubCategory.getOptional("missionSecondarySubCategory")

        /**
         * WGS-84 latitude of the start position, in degrees. -90 to 90 degrees (negative values
         * south of equator).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionStartPointLat(): Optional<Double> =
            missionStartPointLat.getOptional("missionStartPointLat")

        /**
         * WGS-84 longitude of the start position, in degrees. -180 to 180 degrees (negative values
         * west of Prime Meridian).
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionStartPointLong(): Optional<Double> =
            missionStartPointLong.getOptional("missionStartPointLong")

        /**
         * Subregion of the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionSubRegion(): Optional<String> = missionSubRegion.getOptional("missionSubRegion")

        /**
         * Name of the Supporting unit/Location that is performing this mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionSupportedUnit(): Optional<String> =
            missionSupportedUnit.getOptional("missionSupportedUnit")

        /**
         * A synchronization matrix is used to organize the logistics synchronization process during
         * a mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun missionSyncMatrixBin(): Optional<String> =
            missionSyncMatrixBin.getOptional("missionSyncMatrixBin")

        /**
         * Human readable Mission Name.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Originating system or organization which produced the data, if different from the source.
         * The origin may be different than the source if the source was a mediating system which
         * forwarded the data on behalf of the origin system. If null, the source may be assumed to
         * be the origin.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origin(): Optional<String> = origin.getOptional("origin")

        /**
         * The originating source network on which this record was created, auto-populated by the
         * system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun origNetwork(): Optional<String> = origNetwork.getOptional("origNetwork")

        /**
         * Individual taskings to complete the mission.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun taskings(): Optional<List<Tasking>> = taskings.getOptional("taskings")

        /**
         * Object for data dissemination.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun transit(): Optional<List<Transit>> = transit.getOptional("transit")

        /**
         * Time the row was updated in the database, auto-populated by the system, example =
         * 2018-01-01T16:00:00.123Z.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updatedAt")

        /**
         * Application user who updated the row in the database, auto-populated by the system.
         *
         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun updatedBy(): Optional<String> = updatedBy.getOptional("updatedBy")

        /**
         * Returns the raw JSON value of [classificationMarking].
         *
         * Unlike [classificationMarking], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Returns the raw JSON value of [collectionRequirements].
         *
         * Unlike [collectionRequirements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("collectionRequirements")
        @ExcludeMissing
        fun _collectionRequirements(): JsonField<List<CollectionRequirement>> =
            collectionRequirements

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
         * Returns the raw JSON value of [idexVersion].
         *
         * Unlike [idexVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idexVersion")
        @ExcludeMissing
        fun _idexVersion(): JsonField<Int> = idexVersion

        /**
         * Returns the raw JSON value of [missionAor].
         *
         * Unlike [missionAor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionAOR")
        @ExcludeMissing
        fun _missionAor(): JsonField<String> = missionAor

        /**
         * Returns the raw JSON value of [missionCollectionArea].
         *
         * Unlike [missionCollectionArea], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionCollectionArea")
        @ExcludeMissing
        fun _missionCollectionArea(): JsonField<String> = missionCollectionArea

        /**
         * Returns the raw JSON value of [missionCountry].
         *
         * Unlike [missionCountry], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionCountry")
        @ExcludeMissing
        fun _missionCountry(): JsonField<String> = missionCountry

        /**
         * Returns the raw JSON value of [missionEmphasis].
         *
         * Unlike [missionEmphasis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionEmphasis")
        @ExcludeMissing
        fun _missionEmphasis(): JsonField<String> = missionEmphasis

        /**
         * Returns the raw JSON value of [missionId].
         *
         * Unlike [missionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionId") @ExcludeMissing fun _missionId(): JsonField<String> = missionId

        /**
         * Returns the raw JSON value of [missionJoa].
         *
         * Unlike [missionJoa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionJoa")
        @ExcludeMissing
        fun _missionJoa(): JsonField<String> = missionJoa

        /**
         * Returns the raw JSON value of [missionOperation].
         *
         * Unlike [missionOperation], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionOperation")
        @ExcludeMissing
        fun _missionOperation(): JsonField<String> = missionOperation

        /**
         * Returns the raw JSON value of [missionPrimaryIntelDiscipline].
         *
         * Unlike [missionPrimaryIntelDiscipline], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("missionPrimaryIntelDiscipline")
        @ExcludeMissing
        fun _missionPrimaryIntelDiscipline(): JsonField<String> = missionPrimaryIntelDiscipline

        /**
         * Returns the raw JSON value of [missionPrimarySubCategory].
         *
         * Unlike [missionPrimarySubCategory], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionPrimarySubCategory")
        @ExcludeMissing
        fun _missionPrimarySubCategory(): JsonField<String> = missionPrimarySubCategory

        /**
         * Returns the raw JSON value of [missionPriority].
         *
         * Unlike [missionPriority], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionPriority")
        @ExcludeMissing
        fun _missionPriority(): JsonField<Int> = missionPriority

        /**
         * Returns the raw JSON value of [missionRegion].
         *
         * Unlike [missionRegion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionRegion")
        @ExcludeMissing
        fun _missionRegion(): JsonField<String> = missionRegion

        /**
         * Returns the raw JSON value of [missionRole].
         *
         * Unlike [missionRole], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("missionRole")
        @ExcludeMissing
        fun _missionRole(): JsonField<String> = missionRole

        /**
         * Returns the raw JSON value of [missionSecondaryIntelDiscipline].
         *
         * Unlike [missionSecondaryIntelDiscipline], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("missionSecondaryIntelDiscipline")
        @ExcludeMissing
        fun _missionSecondaryIntelDiscipline(): JsonField<String> = missionSecondaryIntelDiscipline

        /**
         * Returns the raw JSON value of [missionSecondarySubCategory].
         *
         * Unlike [missionSecondarySubCategory], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionSecondarySubCategory")
        @ExcludeMissing
        fun _missionSecondarySubCategory(): JsonField<String> = missionSecondarySubCategory

        /**
         * Returns the raw JSON value of [missionStartPointLat].
         *
         * Unlike [missionStartPointLat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionStartPointLat")
        @ExcludeMissing
        fun _missionStartPointLat(): JsonField<Double> = missionStartPointLat

        /**
         * Returns the raw JSON value of [missionStartPointLong].
         *
         * Unlike [missionStartPointLong], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionStartPointLong")
        @ExcludeMissing
        fun _missionStartPointLong(): JsonField<Double> = missionStartPointLong

        /**
         * Returns the raw JSON value of [missionSubRegion].
         *
         * Unlike [missionSubRegion], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("missionSubRegion")
        @ExcludeMissing
        fun _missionSubRegion(): JsonField<String> = missionSubRegion

        /**
         * Returns the raw JSON value of [missionSupportedUnit].
         *
         * Unlike [missionSupportedUnit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionSupportedUnit")
        @ExcludeMissing
        fun _missionSupportedUnit(): JsonField<String> = missionSupportedUnit

        /**
         * Returns the raw JSON value of [missionSyncMatrixBin].
         *
         * Unlike [missionSyncMatrixBin], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("missionSyncMatrixBin")
        @ExcludeMissing
        fun _missionSyncMatrixBin(): JsonField<String> = missionSyncMatrixBin

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
        @JsonProperty("origNetwork")
        @ExcludeMissing
        fun _origNetwork(): JsonField<String> = origNetwork

        /**
         * Returns the raw JSON value of [taskings].
         *
         * Unlike [taskings], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taskings")
        @ExcludeMissing
        fun _taskings(): JsonField<List<Tasking>> = taskings

        /**
         * Returns the raw JSON value of [transit].
         *
         * Unlike [transit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transit") @ExcludeMissing fun _transit(): JsonField<List<Transit>> = transit

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

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var classificationMarking: JsonField<String>? = null
            private var dataMode: JsonField<DataMode>? = null
            private var source: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var collectionRequirements: JsonField<MutableList<CollectionRequirement>>? =
                null
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var idexVersion: JsonField<Int> = JsonMissing.of()
            private var missionAor: JsonField<String> = JsonMissing.of()
            private var missionCollectionArea: JsonField<String> = JsonMissing.of()
            private var missionCountry: JsonField<String> = JsonMissing.of()
            private var missionEmphasis: JsonField<String> = JsonMissing.of()
            private var missionId: JsonField<String> = JsonMissing.of()
            private var missionJoa: JsonField<String> = JsonMissing.of()
            private var missionOperation: JsonField<String> = JsonMissing.of()
            private var missionPrimaryIntelDiscipline: JsonField<String> = JsonMissing.of()
            private var missionPrimarySubCategory: JsonField<String> = JsonMissing.of()
            private var missionPriority: JsonField<Int> = JsonMissing.of()
            private var missionRegion: JsonField<String> = JsonMissing.of()
            private var missionRole: JsonField<String> = JsonMissing.of()
            private var missionSecondaryIntelDiscipline: JsonField<String> = JsonMissing.of()
            private var missionSecondarySubCategory: JsonField<String> = JsonMissing.of()
            private var missionStartPointLat: JsonField<Double> = JsonMissing.of()
            private var missionStartPointLong: JsonField<Double> = JsonMissing.of()
            private var missionSubRegion: JsonField<String> = JsonMissing.of()
            private var missionSupportedUnit: JsonField<String> = JsonMissing.of()
            private var missionSyncMatrixBin: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<String> = JsonMissing.of()
            private var origNetwork: JsonField<String> = JsonMissing.of()
            private var taskings: JsonField<MutableList<Tasking>>? = null
            private var transit: JsonField<MutableList<Transit>>? = null
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updatedBy: JsonField<String> = JsonMissing.of()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                classificationMarking = body.classificationMarking
                dataMode = body.dataMode
                source = body.source
                id = body.id
                collectionRequirements = body.collectionRequirements.map { it.toMutableList() }
                createdAt = body.createdAt
                createdBy = body.createdBy
                idexVersion = body.idexVersion
                missionAor = body.missionAor
                missionCollectionArea = body.missionCollectionArea
                missionCountry = body.missionCountry
                missionEmphasis = body.missionEmphasis
                missionId = body.missionId
                missionJoa = body.missionJoa
                missionOperation = body.missionOperation
                missionPrimaryIntelDiscipline = body.missionPrimaryIntelDiscipline
                missionPrimarySubCategory = body.missionPrimarySubCategory
                missionPriority = body.missionPriority
                missionRegion = body.missionRegion
                missionRole = body.missionRole
                missionSecondaryIntelDiscipline = body.missionSecondaryIntelDiscipline
                missionSecondarySubCategory = body.missionSecondarySubCategory
                missionStartPointLat = body.missionStartPointLat
                missionStartPointLong = body.missionStartPointLong
                missionSubRegion = body.missionSubRegion
                missionSupportedUnit = body.missionSupportedUnit
                missionSyncMatrixBin = body.missionSyncMatrixBin
                name = body.name
                origin = body.origin
                origNetwork = body.origNetwork
                taskings = body.taskings.map { it.toMutableList() }
                transit = body.transit.map { it.toMutableList() }
                updatedAt = body.updatedAt
                updatedBy = body.updatedBy
            }

            /** Classification marking of the data in IC/CAPCO Portion-marked format. */
            fun classificationMarking(classificationMarking: String) =
                classificationMarking(JsonField.of(classificationMarking))

            /**
             * Sets [Builder.classificationMarking] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classificationMarking] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classificationMarking(classificationMarking: JsonField<String>) = apply {
                this.classificationMarking = classificationMarking
            }

            /**
             * Indicator of whether the data is EXERCISE, REAL, SIMULATED, or TEST data:
             *
             * EXERCISE:&nbsp;Data pertaining to a government or military exercise. The data may
             * include both real and simulated data.
             *
             * REAL:&nbsp;Data collected or produced that pertains to real-world objects, events,
             * and analysis.
             *
             * SIMULATED:&nbsp;Synthetic data generated by a model to mimic real-world datasets.
             *
             * TEST:&nbsp;Specific datasets used to evaluate compliance with specifications and
             * requirements, and for validating technical, functional, and performance
             * characteristics.
             */
            fun dataMode(dataMode: DataMode) = dataMode(JsonField.of(dataMode))

            /**
             * Sets [Builder.dataMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataMode] with a well-typed [DataMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataMode(dataMode: JsonField<DataMode>) = apply { this.dataMode = dataMode }

            /** Source of the data. */
            fun source(source: String) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<String>) = apply { this.source = source }

            /** Unique identifier of the record, auto-generated by the system. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Mission desired collection requirements. */
            fun collectionRequirements(collectionRequirements: List<CollectionRequirement>) =
                collectionRequirements(JsonField.of(collectionRequirements))

            /**
             * Sets [Builder.collectionRequirements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.collectionRequirements] with a well-typed
             * `List<CollectionRequirement>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun collectionRequirements(
                collectionRequirements: JsonField<List<CollectionRequirement>>
            ) = apply {
                this.collectionRequirements = collectionRequirements.map { it.toMutableList() }
            }

            /**
             * Adds a single [CollectionRequirement] to [collectionRequirements].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCollectionRequirement(collectionRequirement: CollectionRequirement) = apply {
                collectionRequirements =
                    (collectionRequirements ?: JsonField.of(mutableListOf())).also {
                        checkKnown("collectionRequirements", it).add(collectionRequirement)
                    }
            }

            /** Time the row was created in the database, auto-populated by the system. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Application user who created the row in the database, auto-populated by the system.
             */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** Version of the IDEX software the request came from for compatibility. */
            fun idexVersion(idexVersion: Int) = idexVersion(JsonField.of(idexVersion))

            /**
             * Sets [Builder.idexVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idexVersion] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idexVersion(idexVersion: JsonField<Int>) = apply { this.idexVersion = idexVersion }

            /** Designation of mission Area Of Responsibility. */
            fun missionAor(missionAor: String) = missionAor(JsonField.of(missionAor))

            /**
             * Sets [Builder.missionAor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionAor] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionAor(missionAor: JsonField<String>) = apply { this.missionAor = missionAor }

            /** Mission geographical collection area. */
            fun missionCollectionArea(missionCollectionArea: String) =
                missionCollectionArea(JsonField.of(missionCollectionArea))

            /**
             * Sets [Builder.missionCollectionArea] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionCollectionArea] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missionCollectionArea(missionCollectionArea: JsonField<String>) = apply {
                this.missionCollectionArea = missionCollectionArea
            }

            /**
             * Country code of the mission. A Country may represent countries, multi-national
             * consortiums, and international organizations.
             */
            fun missionCountry(missionCountry: String) =
                missionCountry(JsonField.of(missionCountry))

            /**
             * Sets [Builder.missionCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionCountry] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionCountry(missionCountry: JsonField<String>) = apply {
                this.missionCountry = missionCountry
            }

            /** Text version of what we are emphasizing in this mission. */
            fun missionEmphasis(missionEmphasis: String) =
                missionEmphasis(JsonField.of(missionEmphasis))

            /**
             * Sets [Builder.missionEmphasis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionEmphasis] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionEmphasis(missionEmphasis: JsonField<String>) = apply {
                this.missionEmphasis = missionEmphasis
            }

            /** Mission Identifier. */
            fun missionId(missionId: String) = missionId(JsonField.of(missionId))

            /**
             * Sets [Builder.missionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionId(missionId: JsonField<String>) = apply { this.missionId = missionId }

            /** Joint Operations Area. */
            fun missionJoa(missionJoa: String) = missionJoa(JsonField.of(missionJoa))

            /**
             * Sets [Builder.missionJoa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionJoa] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionJoa(missionJoa: JsonField<String>) = apply { this.missionJoa = missionJoa }

            /** Mission operation name. */
            fun missionOperation(missionOperation: String) =
                missionOperation(JsonField.of(missionOperation))

            /**
             * Sets [Builder.missionOperation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionOperation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionOperation(missionOperation: JsonField<String>) = apply {
                this.missionOperation = missionOperation
            }

            /** Primary type of intelligence to be collected during the mission. */
            fun missionPrimaryIntelDiscipline(missionPrimaryIntelDiscipline: String) =
                missionPrimaryIntelDiscipline(JsonField.of(missionPrimaryIntelDiscipline))

            /**
             * Sets [Builder.missionPrimaryIntelDiscipline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionPrimaryIntelDiscipline] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun missionPrimaryIntelDiscipline(missionPrimaryIntelDiscipline: JsonField<String>) =
                apply {
                    this.missionPrimaryIntelDiscipline = missionPrimaryIntelDiscipline
                }

            /** Sub category of primary intelligence to be collected. */
            fun missionPrimarySubCategory(missionPrimarySubCategory: String) =
                missionPrimarySubCategory(JsonField.of(missionPrimarySubCategory))

            /**
             * Sets [Builder.missionPrimarySubCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionPrimarySubCategory] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun missionPrimarySubCategory(missionPrimarySubCategory: JsonField<String>) = apply {
                this.missionPrimarySubCategory = missionPrimarySubCategory
            }

            /** Mission Priority (1-n). */
            fun missionPriority(missionPriority: Int) =
                missionPriority(JsonField.of(missionPriority))

            /**
             * Sets [Builder.missionPriority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionPriority] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionPriority(missionPriority: JsonField<Int>) = apply {
                this.missionPriority = missionPriority
            }

            /** Region of the mission. */
            fun missionRegion(missionRegion: String) = missionRegion(JsonField.of(missionRegion))

            /**
             * Sets [Builder.missionRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionRegion(missionRegion: JsonField<String>) = apply {
                this.missionRegion = missionRegion
            }

            /** What is the primary objective(Role) of this mission. */
            fun missionRole(missionRole: String) = missionRole(JsonField.of(missionRole))

            /**
             * Sets [Builder.missionRole] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionRole] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionRole(missionRole: JsonField<String>) = apply {
                this.missionRole = missionRole
            }

            /** Type of intelligence to be collected second. */
            fun missionSecondaryIntelDiscipline(missionSecondaryIntelDiscipline: String) =
                missionSecondaryIntelDiscipline(JsonField.of(missionSecondaryIntelDiscipline))

            /**
             * Sets [Builder.missionSecondaryIntelDiscipline] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionSecondaryIntelDiscipline] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun missionSecondaryIntelDiscipline(
                missionSecondaryIntelDiscipline: JsonField<String>
            ) = apply { this.missionSecondaryIntelDiscipline = missionSecondaryIntelDiscipline }

            /** Mission sub category for secondary intelligence discipline to be collected. */
            fun missionSecondarySubCategory(missionSecondarySubCategory: String) =
                missionSecondarySubCategory(JsonField.of(missionSecondarySubCategory))

            /**
             * Sets [Builder.missionSecondarySubCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionSecondarySubCategory] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun missionSecondarySubCategory(missionSecondarySubCategory: JsonField<String>) =
                apply {
                    this.missionSecondarySubCategory = missionSecondarySubCategory
                }

            /**
             * WGS-84 latitude of the start position, in degrees. -90 to 90 degrees (negative values
             * south of equator).
             */
            fun missionStartPointLat(missionStartPointLat: Double) =
                missionStartPointLat(JsonField.of(missionStartPointLat))

            /**
             * Sets [Builder.missionStartPointLat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionStartPointLat] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missionStartPointLat(missionStartPointLat: JsonField<Double>) = apply {
                this.missionStartPointLat = missionStartPointLat
            }

            /**
             * WGS-84 longitude of the start position, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             */
            fun missionStartPointLong(missionStartPointLong: Double) =
                missionStartPointLong(JsonField.of(missionStartPointLong))

            /**
             * Sets [Builder.missionStartPointLong] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionStartPointLong] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missionStartPointLong(missionStartPointLong: JsonField<Double>) = apply {
                this.missionStartPointLong = missionStartPointLong
            }

            /** Subregion of the mission. */
            fun missionSubRegion(missionSubRegion: String) =
                missionSubRegion(JsonField.of(missionSubRegion))

            /**
             * Sets [Builder.missionSubRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionSubRegion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun missionSubRegion(missionSubRegion: JsonField<String>) = apply {
                this.missionSubRegion = missionSubRegion
            }

            /** Name of the Supporting unit/Location that is performing this mission. */
            fun missionSupportedUnit(missionSupportedUnit: String) =
                missionSupportedUnit(JsonField.of(missionSupportedUnit))

            /**
             * Sets [Builder.missionSupportedUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionSupportedUnit] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missionSupportedUnit(missionSupportedUnit: JsonField<String>) = apply {
                this.missionSupportedUnit = missionSupportedUnit
            }

            /**
             * A synchronization matrix is used to organize the logistics synchronization process
             * during a mission.
             */
            fun missionSyncMatrixBin(missionSyncMatrixBin: String) =
                missionSyncMatrixBin(JsonField.of(missionSyncMatrixBin))

            /**
             * Sets [Builder.missionSyncMatrixBin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.missionSyncMatrixBin] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun missionSyncMatrixBin(missionSyncMatrixBin: JsonField<String>) = apply {
                this.missionSyncMatrixBin = missionSyncMatrixBin
            }

            /** Human readable Mission Name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Originating system or organization which produced the data, if different from the
             * source. The origin may be different than the source if the source was a mediating
             * system which forwarded the data on behalf of the origin system. If null, the source
             * may be assumed to be the origin.
             */
            fun origin(origin: String) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<String>) = apply { this.origin = origin }

            /**
             * The originating source network on which this record was created, auto-populated by
             * the system.
             */
            fun origNetwork(origNetwork: String) = origNetwork(JsonField.of(origNetwork))

            /**
             * Sets [Builder.origNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origNetwork(origNetwork: JsonField<String>) = apply {
                this.origNetwork = origNetwork
            }

            /** Individual taskings to complete the mission. */
            fun taskings(taskings: List<Tasking>) = taskings(JsonField.of(taskings))

            /**
             * Sets [Builder.taskings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taskings] with a well-typed `List<Tasking>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taskings(taskings: JsonField<List<Tasking>>) = apply {
                this.taskings = taskings.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tasking] to [taskings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTasking(tasking: Tasking) = apply {
                taskings =
                    (taskings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taskings", it).add(tasking)
                    }
            }

            /** Object for data dissemination. */
            fun transit(transit: List<Transit>) = transit(JsonField.of(transit))

            /**
             * Sets [Builder.transit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transit] with a well-typed `List<Transit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transit(transit: JsonField<List<Transit>>) = apply {
                this.transit = transit.map { it.toMutableList() }
            }

            /**
             * Adds a single [Transit] to [Builder.transit].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTransit(transit: Transit) = apply {
                this.transit =
                    (this.transit ?: JsonField.of(mutableListOf())).also {
                        checkKnown("transit", it).add(transit)
                    }
            }

            /**
             * Time the row was updated in the database, auto-populated by the system, example =
             * 2018-01-01T16:00:00.123Z.
             */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Application user who updated the row in the database, auto-populated by the system.
             */
            fun updatedBy(updatedBy: String) = updatedBy(JsonField.of(updatedBy))

            /**
             * Sets [Builder.updatedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedBy(updatedBy: JsonField<String>) = apply { this.updatedBy = updatedBy }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .classificationMarking()
             * .dataMode()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("classificationMarking", classificationMarking),
                    checkRequired("dataMode", dataMode),
                    checkRequired("source", source),
                    id,
                    (collectionRequirements ?: JsonMissing.of()).map { it.toImmutable() },
                    createdAt,
                    createdBy,
                    idexVersion,
                    missionAor,
                    missionCollectionArea,
                    missionCountry,
                    missionEmphasis,
                    missionId,
                    missionJoa,
                    missionOperation,
                    missionPrimaryIntelDiscipline,
                    missionPrimarySubCategory,
                    missionPriority,
                    missionRegion,
                    missionRole,
                    missionSecondaryIntelDiscipline,
                    missionSecondarySubCategory,
                    missionStartPointLat,
                    missionStartPointLong,
                    missionSubRegion,
                    missionSupportedUnit,
                    missionSyncMatrixBin,
                    name,
                    origin,
                    origNetwork,
                    (taskings ?: JsonMissing.of()).map { it.toImmutable() },
                    (transit ?: JsonMissing.of()).map { it.toImmutable() },
                    updatedAt,
                    updatedBy,
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            classificationMarking()
            dataMode().validate()
            source()
            id()
            collectionRequirements().ifPresent { it.forEach { it.validate() } }
            createdAt()
            createdBy()
            idexVersion()
            missionAor()
            missionCollectionArea()
            missionCountry()
            missionEmphasis()
            missionId()
            missionJoa()
            missionOperation()
            missionPrimaryIntelDiscipline()
            missionPrimarySubCategory()
            missionPriority()
            missionRegion()
            missionRole()
            missionSecondaryIntelDiscipline()
            missionSecondarySubCategory()
            missionStartPointLat()
            missionStartPointLong()
            missionSubRegion()
            missionSupportedUnit()
            missionSyncMatrixBin()
            name()
            origin()
            origNetwork()
            taskings().ifPresent { it.forEach { it.validate() } }
            transit().ifPresent { it.forEach { it.validate() } }
            updatedAt()
            updatedBy()
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
            (if (classificationMarking.asKnown().isPresent) 1 else 0) +
                (dataMode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (source.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (collectionRequirements.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (if (idexVersion.asKnown().isPresent) 1 else 0) +
                (if (missionAor.asKnown().isPresent) 1 else 0) +
                (if (missionCollectionArea.asKnown().isPresent) 1 else 0) +
                (if (missionCountry.asKnown().isPresent) 1 else 0) +
                (if (missionEmphasis.asKnown().isPresent) 1 else 0) +
                (if (missionId.asKnown().isPresent) 1 else 0) +
                (if (missionJoa.asKnown().isPresent) 1 else 0) +
                (if (missionOperation.asKnown().isPresent) 1 else 0) +
                (if (missionPrimaryIntelDiscipline.asKnown().isPresent) 1 else 0) +
                (if (missionPrimarySubCategory.asKnown().isPresent) 1 else 0) +
                (if (missionPriority.asKnown().isPresent) 1 else 0) +
                (if (missionRegion.asKnown().isPresent) 1 else 0) +
                (if (missionRole.asKnown().isPresent) 1 else 0) +
                (if (missionSecondaryIntelDiscipline.asKnown().isPresent) 1 else 0) +
                (if (missionSecondarySubCategory.asKnown().isPresent) 1 else 0) +
                (if (missionStartPointLat.asKnown().isPresent) 1 else 0) +
                (if (missionStartPointLong.asKnown().isPresent) 1 else 0) +
                (if (missionSubRegion.asKnown().isPresent) 1 else 0) +
                (if (missionSupportedUnit.asKnown().isPresent) 1 else 0) +
                (if (missionSyncMatrixBin.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (origin.asKnown().isPresent) 1 else 0) +
                (if (origNetwork.asKnown().isPresent) 1 else 0) +
                (taskings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (transit.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (updatedBy.asKnown().isPresent) 1 else 0)

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
        class DataMode @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REAL,
                TEST,
                SIMULATED,
                EXERCISE,
                /**
                 * An enum member indicating that [DataMode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value is a
             *   not a known member.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws UnifieddatalibraryInvalidDataException if this class instance's value does
             *   not have the expected primitive type.
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

        class CollectionRequirement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val country: JsonField<String>,
            private val cridNumbers: JsonField<String>,
            private val criticalTimes: JsonField<CriticalTimes>,
            private val emphasized: JsonField<Boolean>,
            private val exploitationRequirement: JsonField<ExploitationRequirement>,
            private val hash: JsonField<String>,
            private val intelDiscipline: JsonField<String>,
            private val isPrismCr: JsonField<Boolean>,
            private val operation: JsonField<String>,
            private val priority: JsonField<Double>,
            private val reconSurvey: JsonField<String>,
            private val recordId: JsonField<String>,
            private val region: JsonField<String>,
            private val secondary: JsonField<Boolean>,
            private val specialComGuidance: JsonField<String>,
            private val start: JsonField<OffsetDateTime>,
            private val stop: JsonField<OffsetDateTime>,
            private val subregion: JsonField<String>,
            private val supportedUnit: JsonField<String>,
            private val targetList: JsonField<List<String>>,
            private val type: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("cridNumbers")
                @ExcludeMissing
                cridNumbers: JsonField<String> = JsonMissing.of(),
                @JsonProperty("criticalTimes")
                @ExcludeMissing
                criticalTimes: JsonField<CriticalTimes> = JsonMissing.of(),
                @JsonProperty("emphasized")
                @ExcludeMissing
                emphasized: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("exploitationRequirement")
                @ExcludeMissing
                exploitationRequirement: JsonField<ExploitationRequirement> = JsonMissing.of(),
                @JsonProperty("hash") @ExcludeMissing hash: JsonField<String> = JsonMissing.of(),
                @JsonProperty("intelDiscipline")
                @ExcludeMissing
                intelDiscipline: JsonField<String> = JsonMissing.of(),
                @JsonProperty("isPrismCr")
                @ExcludeMissing
                isPrismCr: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("operation")
                @ExcludeMissing
                operation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("priority")
                @ExcludeMissing
                priority: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("reconSurvey")
                @ExcludeMissing
                reconSurvey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recordId")
                @ExcludeMissing
                recordId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("secondary")
                @ExcludeMissing
                secondary: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("specialComGuidance")
                @ExcludeMissing
                specialComGuidance: JsonField<String> = JsonMissing.of(),
                @JsonProperty("start")
                @ExcludeMissing
                start: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("stop")
                @ExcludeMissing
                stop: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("subregion")
                @ExcludeMissing
                subregion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("supportedUnit")
                @ExcludeMissing
                supportedUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("targetList")
                @ExcludeMissing
                targetList: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            ) : this(
                id,
                country,
                cridNumbers,
                criticalTimes,
                emphasized,
                exploitationRequirement,
                hash,
                intelDiscipline,
                isPrismCr,
                operation,
                priority,
                reconSurvey,
                recordId,
                region,
                secondary,
                specialComGuidance,
                start,
                stop,
                subregion,
                supportedUnit,
                targetList,
                type,
                mutableMapOf(),
            )

            /**
             * Collection Requirement Unique Identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Country code of the collection requirement. A Country may represent countries,
             * multi-national consortiums, and international organizations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun country(): Optional<String> = country.getOptional("country")

            /**
             * Collection Requirement Unique Identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun cridNumbers(): Optional<String> = cridNumbers.getOptional("cridNumbers")

            /**
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun criticalTimes(): Optional<CriticalTimes> =
                criticalTimes.getOptional("criticalTimes")

            /**
             * Is this collection requirement an emphasized/critical requirement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun emphasized(): Optional<Boolean> = emphasized.getOptional("emphasized")

            /**
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun exploitationRequirement(): Optional<ExploitationRequirement> =
                exploitationRequirement.getOptional("exploitationRequirement")

            /**
             * Encryption hashing algorithm.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun hash(): Optional<String> = hash.getOptional("hash")

            /**
             * Primary type of intelligence to be collected for this requirement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun intelDiscipline(): Optional<String> = intelDiscipline.getOptional("intelDiscipline")

            /**
             * Is this collection request for the Prism system?.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun isPrismCr(): Optional<Boolean> = isPrismCr.getOptional("isPrismCr")

            /**
             * Human readable name for this operation.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun operation(): Optional<String> = operation.getOptional("operation")

            /**
             * 1-n priority for this collection requirement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun priority(): Optional<Double> = priority.getOptional("priority")

            /**
             * Reconnaissance Survey information the operator needs.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun reconSurvey(): Optional<String> = reconSurvey.getOptional("reconSurvey")

            /**
             * Record id.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun recordId(): Optional<String> = recordId.getOptional("recordId")

            /**
             * Region of the collection requirement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun region(): Optional<String> = region.getOptional("region")

            /**
             * Sub category of primary intelligence to be collected for this requirement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun secondary(): Optional<Boolean> = secondary.getOptional("secondary")

            /**
             * Free text field for the user to specify special instructions needed for this
             * collection.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun specialComGuidance(): Optional<String> =
                specialComGuidance.getOptional("specialComGuidance")

            /**
             * Start time for this requirement, should be within the mission time window.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun start(): Optional<OffsetDateTime> = start.getOptional("start")

            /**
             * Stop time for this requirement, should be within the mission time window.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun stop(): Optional<OffsetDateTime> = stop.getOptional("stop")

            /**
             * Subregion of the collection requirement.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun subregion(): Optional<String> = subregion.getOptional("subregion")

            /**
             * The name of the military unit that this assigned collection requirement will support.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun supportedUnit(): Optional<String> = supportedUnit.getOptional("supportedUnit")

            /**
             * Array of POI Id's for the targets being tasked.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun targetList(): Optional<List<String>> = targetList.getOptional("targetList")

            /**
             * Type collection this requirement applies to.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<String> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [cridNumbers].
             *
             * Unlike [cridNumbers], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cridNumbers")
            @ExcludeMissing
            fun _cridNumbers(): JsonField<String> = cridNumbers

            /**
             * Returns the raw JSON value of [criticalTimes].
             *
             * Unlike [criticalTimes], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("criticalTimes")
            @ExcludeMissing
            fun _criticalTimes(): JsonField<CriticalTimes> = criticalTimes

            /**
             * Returns the raw JSON value of [emphasized].
             *
             * Unlike [emphasized], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("emphasized")
            @ExcludeMissing
            fun _emphasized(): JsonField<Boolean> = emphasized

            /**
             * Returns the raw JSON value of [exploitationRequirement].
             *
             * Unlike [exploitationRequirement], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("exploitationRequirement")
            @ExcludeMissing
            fun _exploitationRequirement(): JsonField<ExploitationRequirement> =
                exploitationRequirement

            /**
             * Returns the raw JSON value of [hash].
             *
             * Unlike [hash], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("hash") @ExcludeMissing fun _hash(): JsonField<String> = hash

            /**
             * Returns the raw JSON value of [intelDiscipline].
             *
             * Unlike [intelDiscipline], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("intelDiscipline")
            @ExcludeMissing
            fun _intelDiscipline(): JsonField<String> = intelDiscipline

            /**
             * Returns the raw JSON value of [isPrismCr].
             *
             * Unlike [isPrismCr], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("isPrismCr")
            @ExcludeMissing
            fun _isPrismCr(): JsonField<Boolean> = isPrismCr

            /**
             * Returns the raw JSON value of [operation].
             *
             * Unlike [operation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operation")
            @ExcludeMissing
            fun _operation(): JsonField<String> = operation

            /**
             * Returns the raw JSON value of [priority].
             *
             * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            /**
             * Returns the raw JSON value of [reconSurvey].
             *
             * Unlike [reconSurvey], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reconSurvey")
            @ExcludeMissing
            fun _reconSurvey(): JsonField<String> = reconSurvey

            /**
             * Returns the raw JSON value of [recordId].
             *
             * Unlike [recordId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recordId") @ExcludeMissing fun _recordId(): JsonField<String> = recordId

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /**
             * Returns the raw JSON value of [secondary].
             *
             * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("secondary")
            @ExcludeMissing
            fun _secondary(): JsonField<Boolean> = secondary

            /**
             * Returns the raw JSON value of [specialComGuidance].
             *
             * Unlike [specialComGuidance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("specialComGuidance")
            @ExcludeMissing
            fun _specialComGuidance(): JsonField<String> = specialComGuidance

            /**
             * Returns the raw JSON value of [start].
             *
             * Unlike [start], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("start") @ExcludeMissing fun _start(): JsonField<OffsetDateTime> = start

            /**
             * Returns the raw JSON value of [stop].
             *
             * Unlike [stop], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<OffsetDateTime> = stop

            /**
             * Returns the raw JSON value of [subregion].
             *
             * Unlike [subregion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subregion")
            @ExcludeMissing
            fun _subregion(): JsonField<String> = subregion

            /**
             * Returns the raw JSON value of [supportedUnit].
             *
             * Unlike [supportedUnit], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("supportedUnit")
            @ExcludeMissing
            fun _supportedUnit(): JsonField<String> = supportedUnit

            /**
             * Returns the raw JSON value of [targetList].
             *
             * Unlike [targetList], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("targetList")
            @ExcludeMissing
            fun _targetList(): JsonField<List<String>> = targetList

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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CollectionRequirement].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CollectionRequirement]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var country: JsonField<String> = JsonMissing.of()
                private var cridNumbers: JsonField<String> = JsonMissing.of()
                private var criticalTimes: JsonField<CriticalTimes> = JsonMissing.of()
                private var emphasized: JsonField<Boolean> = JsonMissing.of()
                private var exploitationRequirement: JsonField<ExploitationRequirement> =
                    JsonMissing.of()
                private var hash: JsonField<String> = JsonMissing.of()
                private var intelDiscipline: JsonField<String> = JsonMissing.of()
                private var isPrismCr: JsonField<Boolean> = JsonMissing.of()
                private var operation: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Double> = JsonMissing.of()
                private var reconSurvey: JsonField<String> = JsonMissing.of()
                private var recordId: JsonField<String> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var secondary: JsonField<Boolean> = JsonMissing.of()
                private var specialComGuidance: JsonField<String> = JsonMissing.of()
                private var start: JsonField<OffsetDateTime> = JsonMissing.of()
                private var stop: JsonField<OffsetDateTime> = JsonMissing.of()
                private var subregion: JsonField<String> = JsonMissing.of()
                private var supportedUnit: JsonField<String> = JsonMissing.of()
                private var targetList: JsonField<MutableList<String>>? = null
                private var type: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(collectionRequirement: CollectionRequirement) = apply {
                    id = collectionRequirement.id
                    country = collectionRequirement.country
                    cridNumbers = collectionRequirement.cridNumbers
                    criticalTimes = collectionRequirement.criticalTimes
                    emphasized = collectionRequirement.emphasized
                    exploitationRequirement = collectionRequirement.exploitationRequirement
                    hash = collectionRequirement.hash
                    intelDiscipline = collectionRequirement.intelDiscipline
                    isPrismCr = collectionRequirement.isPrismCr
                    operation = collectionRequirement.operation
                    priority = collectionRequirement.priority
                    reconSurvey = collectionRequirement.reconSurvey
                    recordId = collectionRequirement.recordId
                    region = collectionRequirement.region
                    secondary = collectionRequirement.secondary
                    specialComGuidance = collectionRequirement.specialComGuidance
                    start = collectionRequirement.start
                    stop = collectionRequirement.stop
                    subregion = collectionRequirement.subregion
                    supportedUnit = collectionRequirement.supportedUnit
                    targetList = collectionRequirement.targetList.map { it.toMutableList() }
                    type = collectionRequirement.type
                    additionalProperties = collectionRequirement.additionalProperties.toMutableMap()
                }

                /** Collection Requirement Unique Identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Country code of the collection requirement. A Country may represent countries,
                 * multi-national consortiums, and international organizations.
                 */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Collection Requirement Unique Identifier. */
                fun cridNumbers(cridNumbers: String) = cridNumbers(JsonField.of(cridNumbers))

                /**
                 * Sets [Builder.cridNumbers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cridNumbers] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cridNumbers(cridNumbers: JsonField<String>) = apply {
                    this.cridNumbers = cridNumbers
                }

                fun criticalTimes(criticalTimes: CriticalTimes) =
                    criticalTimes(JsonField.of(criticalTimes))

                /**
                 * Sets [Builder.criticalTimes] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.criticalTimes] with a well-typed [CriticalTimes]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun criticalTimes(criticalTimes: JsonField<CriticalTimes>) = apply {
                    this.criticalTimes = criticalTimes
                }

                /** Is this collection requirement an emphasized/critical requirement. */
                fun emphasized(emphasized: Boolean) = emphasized(JsonField.of(emphasized))

                /**
                 * Sets [Builder.emphasized] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.emphasized] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun emphasized(emphasized: JsonField<Boolean>) = apply {
                    this.emphasized = emphasized
                }

                fun exploitationRequirement(exploitationRequirement: ExploitationRequirement) =
                    exploitationRequirement(JsonField.of(exploitationRequirement))

                /**
                 * Sets [Builder.exploitationRequirement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.exploitationRequirement] with a well-typed
                 * [ExploitationRequirement] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun exploitationRequirement(
                    exploitationRequirement: JsonField<ExploitationRequirement>
                ) = apply { this.exploitationRequirement = exploitationRequirement }

                /** Encryption hashing algorithm. */
                fun hash(hash: String) = hash(JsonField.of(hash))

                /**
                 * Sets [Builder.hash] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.hash] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun hash(hash: JsonField<String>) = apply { this.hash = hash }

                /** Primary type of intelligence to be collected for this requirement. */
                fun intelDiscipline(intelDiscipline: String) =
                    intelDiscipline(JsonField.of(intelDiscipline))

                /**
                 * Sets [Builder.intelDiscipline] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.intelDiscipline] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun intelDiscipline(intelDiscipline: JsonField<String>) = apply {
                    this.intelDiscipline = intelDiscipline
                }

                /** Is this collection request for the Prism system?. */
                fun isPrismCr(isPrismCr: Boolean) = isPrismCr(JsonField.of(isPrismCr))

                /**
                 * Sets [Builder.isPrismCr] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isPrismCr] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isPrismCr(isPrismCr: JsonField<Boolean>) = apply { this.isPrismCr = isPrismCr }

                /** Human readable name for this operation. */
                fun operation(operation: String) = operation(JsonField.of(operation))

                /**
                 * Sets [Builder.operation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operation(operation: JsonField<String>) = apply { this.operation = operation }

                /** 1-n priority for this collection requirement. */
                fun priority(priority: Double) = priority(JsonField.of(priority))

                /**
                 * Sets [Builder.priority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priority] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                /** Reconnaissance Survey information the operator needs. */
                fun reconSurvey(reconSurvey: String) = reconSurvey(JsonField.of(reconSurvey))

                /**
                 * Sets [Builder.reconSurvey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reconSurvey] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reconSurvey(reconSurvey: JsonField<String>) = apply {
                    this.reconSurvey = reconSurvey
                }

                /** Record id. */
                fun recordId(recordId: String) = recordId(JsonField.of(recordId))

                /**
                 * Sets [Builder.recordId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recordId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

                /** Region of the collection requirement. */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                /** Sub category of primary intelligence to be collected for this requirement. */
                fun secondary(secondary: Boolean) = secondary(JsonField.of(secondary))

                /**
                 * Sets [Builder.secondary] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.secondary] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun secondary(secondary: JsonField<Boolean>) = apply { this.secondary = secondary }

                /**
                 * Free text field for the user to specify special instructions needed for this
                 * collection.
                 */
                fun specialComGuidance(specialComGuidance: String) =
                    specialComGuidance(JsonField.of(specialComGuidance))

                /**
                 * Sets [Builder.specialComGuidance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.specialComGuidance] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun specialComGuidance(specialComGuidance: JsonField<String>) = apply {
                    this.specialComGuidance = specialComGuidance
                }

                /** Start time for this requirement, should be within the mission time window. */
                fun start(start: OffsetDateTime) = start(JsonField.of(start))

                /**
                 * Sets [Builder.start] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.start] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

                /** Stop time for this requirement, should be within the mission time window. */
                fun stop(stop: OffsetDateTime) = stop(JsonField.of(stop))

                /**
                 * Sets [Builder.stop] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stop] with a well-typed [OffsetDateTime] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stop(stop: JsonField<OffsetDateTime>) = apply { this.stop = stop }

                /** Subregion of the collection requirement. */
                fun subregion(subregion: String) = subregion(JsonField.of(subregion))

                /**
                 * Sets [Builder.subregion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subregion] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subregion(subregion: JsonField<String>) = apply { this.subregion = subregion }

                /**
                 * The name of the military unit that this assigned collection requirement will
                 * support.
                 */
                fun supportedUnit(supportedUnit: String) =
                    supportedUnit(JsonField.of(supportedUnit))

                /**
                 * Sets [Builder.supportedUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.supportedUnit] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun supportedUnit(supportedUnit: JsonField<String>) = apply {
                    this.supportedUnit = supportedUnit
                }

                /** Array of POI Id's for the targets being tasked. */
                fun targetList(targetList: List<String>) = targetList(JsonField.of(targetList))

                /**
                 * Sets [Builder.targetList] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.targetList] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun targetList(targetList: JsonField<List<String>>) = apply {
                    this.targetList = targetList.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [Builder.targetList].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTargetList(targetList: String) = apply {
                    this.targetList =
                        (this.targetList ?: JsonField.of(mutableListOf())).also {
                            checkKnown("targetList", it).add(targetList)
                        }
                }

                /** Type collection this requirement applies to. */
                fun type(type: String) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<String>) = apply { this.type = type }

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
                 * Returns an immutable instance of [CollectionRequirement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CollectionRequirement =
                    CollectionRequirement(
                        id,
                        country,
                        cridNumbers,
                        criticalTimes,
                        emphasized,
                        exploitationRequirement,
                        hash,
                        intelDiscipline,
                        isPrismCr,
                        operation,
                        priority,
                        reconSurvey,
                        recordId,
                        region,
                        secondary,
                        specialComGuidance,
                        start,
                        stop,
                        subregion,
                        supportedUnit,
                        (targetList ?: JsonMissing.of()).map { it.toImmutable() },
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): CollectionRequirement = apply {
                if (validated) {
                    return@apply
                }

                id()
                country()
                cridNumbers()
                criticalTimes().ifPresent { it.validate() }
                emphasized()
                exploitationRequirement().ifPresent { it.validate() }
                hash()
                intelDiscipline()
                isPrismCr()
                operation()
                priority()
                reconSurvey()
                recordId()
                region()
                secondary()
                specialComGuidance()
                start()
                stop()
                subregion()
                supportedUnit()
                targetList()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (country.asKnown().isPresent) 1 else 0) +
                    (if (cridNumbers.asKnown().isPresent) 1 else 0) +
                    (criticalTimes.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (emphasized.asKnown().isPresent) 1 else 0) +
                    (exploitationRequirement.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (hash.asKnown().isPresent) 1 else 0) +
                    (if (intelDiscipline.asKnown().isPresent) 1 else 0) +
                    (if (isPrismCr.asKnown().isPresent) 1 else 0) +
                    (if (operation.asKnown().isPresent) 1 else 0) +
                    (if (priority.asKnown().isPresent) 1 else 0) +
                    (if (reconSurvey.asKnown().isPresent) 1 else 0) +
                    (if (recordId.asKnown().isPresent) 1 else 0) +
                    (if (region.asKnown().isPresent) 1 else 0) +
                    (if (secondary.asKnown().isPresent) 1 else 0) +
                    (if (specialComGuidance.asKnown().isPresent) 1 else 0) +
                    (if (start.asKnown().isPresent) 1 else 0) +
                    (if (stop.asKnown().isPresent) 1 else 0) +
                    (if (subregion.asKnown().isPresent) 1 else 0) +
                    (if (supportedUnit.asKnown().isPresent) 1 else 0) +
                    (targetList.asKnown().getOrNull()?.size ?: 0) +
                    (if (type.asKnown().isPresent) 1 else 0)

            class CriticalTimes
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val earliestImagingTime: JsonField<OffsetDateTime>,
                private val latestImagingTime: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("earliestImagingTime")
                    @ExcludeMissing
                    earliestImagingTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("latestImagingTime")
                    @ExcludeMissing
                    latestImagingTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(earliestImagingTime, latestImagingTime, mutableMapOf())

                /**
                 * Critical start time to collect an image for this requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun earliestImagingTime(): OffsetDateTime =
                    earliestImagingTime.getRequired("earliestImagingTime")

                /**
                 * Critical stop time to collect an image for this requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type or is unexpectedly missing or null (e.g. if the server
                 *   responded with an unexpected value).
                 */
                fun latestImagingTime(): OffsetDateTime =
                    latestImagingTime.getRequired("latestImagingTime")

                /**
                 * Returns the raw JSON value of [earliestImagingTime].
                 *
                 * Unlike [earliestImagingTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("earliestImagingTime")
                @ExcludeMissing
                fun _earliestImagingTime(): JsonField<OffsetDateTime> = earliestImagingTime

                /**
                 * Returns the raw JSON value of [latestImagingTime].
                 *
                 * Unlike [latestImagingTime], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("latestImagingTime")
                @ExcludeMissing
                fun _latestImagingTime(): JsonField<OffsetDateTime> = latestImagingTime

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
                     * Returns a mutable builder for constructing an instance of [CriticalTimes].
                     *
                     * The following fields are required:
                     * ```java
                     * .earliestImagingTime()
                     * .latestImagingTime()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CriticalTimes]. */
                class Builder internal constructor() {

                    private var earliestImagingTime: JsonField<OffsetDateTime>? = null
                    private var latestImagingTime: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(criticalTimes: CriticalTimes) = apply {
                        earliestImagingTime = criticalTimes.earliestImagingTime
                        latestImagingTime = criticalTimes.latestImagingTime
                        additionalProperties = criticalTimes.additionalProperties.toMutableMap()
                    }

                    /** Critical start time to collect an image for this requirement. */
                    fun earliestImagingTime(earliestImagingTime: OffsetDateTime) =
                        earliestImagingTime(JsonField.of(earliestImagingTime))

                    /**
                     * Sets [Builder.earliestImagingTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.earliestImagingTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun earliestImagingTime(earliestImagingTime: JsonField<OffsetDateTime>) =
                        apply {
                            this.earliestImagingTime = earliestImagingTime
                        }

                    /** Critical stop time to collect an image for this requirement. */
                    fun latestImagingTime(latestImagingTime: OffsetDateTime) =
                        latestImagingTime(JsonField.of(latestImagingTime))

                    /**
                     * Sets [Builder.latestImagingTime] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.latestImagingTime] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun latestImagingTime(latestImagingTime: JsonField<OffsetDateTime>) = apply {
                        this.latestImagingTime = latestImagingTime
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
                     * Returns an immutable instance of [CriticalTimes].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .earliestImagingTime()
                     * .latestImagingTime()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CriticalTimes =
                        CriticalTimes(
                            checkRequired("earliestImagingTime", earliestImagingTime),
                            checkRequired("latestImagingTime", latestImagingTime),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CriticalTimes = apply {
                    if (validated) {
                        return@apply
                    }

                    earliestImagingTime()
                    latestImagingTime()
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
                    (if (earliestImagingTime.asKnown().isPresent) 1 else 0) +
                        (if (latestImagingTime.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CriticalTimes &&
                        earliestImagingTime == other.earliestImagingTime &&
                        latestImagingTime == other.latestImagingTime &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(earliestImagingTime, latestImagingTime, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CriticalTimes{earliestImagingTime=$earliestImagingTime, latestImagingTime=$latestImagingTime, additionalProperties=$additionalProperties}"
            }

            class ExploitationRequirement
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val amplification: JsonField<String>,
                private val dissemination: JsonField<String>,
                private val eei: JsonField<String>,
                private val poc: JsonField<Poc>,
                private val reportingCriteria: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("amplification")
                    @ExcludeMissing
                    amplification: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("dissemination")
                    @ExcludeMissing
                    dissemination: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("eei") @ExcludeMissing eei: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("poc") @ExcludeMissing poc: JsonField<Poc> = JsonMissing.of(),
                    @JsonProperty("reportingCriteria")
                    @ExcludeMissing
                    reportingCriteria: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    amplification,
                    dissemination,
                    eei,
                    poc,
                    reportingCriteria,
                    mutableMapOf(),
                )

                /**
                 * Exploitation requirement id.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Amplifying data for the exploitation requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun amplification(): Optional<String> = amplification.getOptional("amplification")

                /**
                 * List of e-mails to disseminate collection verification information.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun dissemination(): Optional<String> = dissemination.getOptional("dissemination")

                /**
                 * Essential Elements of Information.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun eei(): Optional<String> = eei.getOptional("eei")

                /**
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun poc(): Optional<Poc> = poc.getOptional("poc")

                /**
                 * The reporting criteria of the collection requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun reportingCriteria(): Optional<String> =
                    reportingCriteria.getOptional("reportingCriteria")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [amplification].
                 *
                 * Unlike [amplification], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amplification")
                @ExcludeMissing
                fun _amplification(): JsonField<String> = amplification

                /**
                 * Returns the raw JSON value of [dissemination].
                 *
                 * Unlike [dissemination], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("dissemination")
                @ExcludeMissing
                fun _dissemination(): JsonField<String> = dissemination

                /**
                 * Returns the raw JSON value of [eei].
                 *
                 * Unlike [eei], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("eei") @ExcludeMissing fun _eei(): JsonField<String> = eei

                /**
                 * Returns the raw JSON value of [poc].
                 *
                 * Unlike [poc], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("poc") @ExcludeMissing fun _poc(): JsonField<Poc> = poc

                /**
                 * Returns the raw JSON value of [reportingCriteria].
                 *
                 * Unlike [reportingCriteria], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reportingCriteria")
                @ExcludeMissing
                fun _reportingCriteria(): JsonField<String> = reportingCriteria

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
                     * [ExploitationRequirement].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ExploitationRequirement]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var amplification: JsonField<String> = JsonMissing.of()
                    private var dissemination: JsonField<String> = JsonMissing.of()
                    private var eei: JsonField<String> = JsonMissing.of()
                    private var poc: JsonField<Poc> = JsonMissing.of()
                    private var reportingCriteria: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(exploitationRequirement: ExploitationRequirement) = apply {
                        id = exploitationRequirement.id
                        amplification = exploitationRequirement.amplification
                        dissemination = exploitationRequirement.dissemination
                        eei = exploitationRequirement.eei
                        poc = exploitationRequirement.poc
                        reportingCriteria = exploitationRequirement.reportingCriteria
                        additionalProperties =
                            exploitationRequirement.additionalProperties.toMutableMap()
                    }

                    /** Exploitation requirement id. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Amplifying data for the exploitation requirement. */
                    fun amplification(amplification: String) =
                        amplification(JsonField.of(amplification))

                    /**
                     * Sets [Builder.amplification] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amplification] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun amplification(amplification: JsonField<String>) = apply {
                        this.amplification = amplification
                    }

                    /** List of e-mails to disseminate collection verification information. */
                    fun dissemination(dissemination: String) =
                        dissemination(JsonField.of(dissemination))

                    /**
                     * Sets [Builder.dissemination] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dissemination] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun dissemination(dissemination: JsonField<String>) = apply {
                        this.dissemination = dissemination
                    }

                    /** Essential Elements of Information. */
                    fun eei(eei: String) = eei(JsonField.of(eei))

                    /**
                     * Sets [Builder.eei] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eei] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun eei(eei: JsonField<String>) = apply { this.eei = eei }

                    fun poc(poc: Poc) = poc(JsonField.of(poc))

                    /**
                     * Sets [Builder.poc] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.poc] with a well-typed [Poc] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun poc(poc: JsonField<Poc>) = apply { this.poc = poc }

                    /** The reporting criteria of the collection requirement. */
                    fun reportingCriteria(reportingCriteria: String) =
                        reportingCriteria(JsonField.of(reportingCriteria))

                    /**
                     * Sets [Builder.reportingCriteria] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reportingCriteria] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun reportingCriteria(reportingCriteria: JsonField<String>) = apply {
                        this.reportingCriteria = reportingCriteria
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
                     * Returns an immutable instance of [ExploitationRequirement].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ExploitationRequirement =
                        ExploitationRequirement(
                            id,
                            amplification,
                            dissemination,
                            eei,
                            poc,
                            reportingCriteria,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): ExploitationRequirement = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    amplification()
                    dissemination()
                    eei()
                    poc().ifPresent { it.validate() }
                    reportingCriteria()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (amplification.asKnown().isPresent) 1 else 0) +
                        (if (dissemination.asKnown().isPresent) 1 else 0) +
                        (if (eei.asKnown().isPresent) 1 else 0) +
                        (poc.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (reportingCriteria.asKnown().isPresent) 1 else 0)

                class Poc
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val callsign: JsonField<String>,
                    private val chatName: JsonField<String>,
                    private val chatSystem: JsonField<String>,
                    private val email: JsonField<String>,
                    private val name: JsonField<String>,
                    private val notes: JsonField<String>,
                    private val phone: JsonField<String>,
                    private val radioFrequency: JsonField<Double>,
                    private val unit: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("callsign")
                        @ExcludeMissing
                        callsign: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("chatName")
                        @ExcludeMissing
                        chatName: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("chatSystem")
                        @ExcludeMissing
                        chatSystem: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("email")
                        @ExcludeMissing
                        email: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("notes")
                        @ExcludeMissing
                        notes: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("phone")
                        @ExcludeMissing
                        phone: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("radioFrequency")
                        @ExcludeMissing
                        radioFrequency: JsonField<Double> = JsonMissing.of(),
                        @JsonProperty("unit")
                        @ExcludeMissing
                        unit: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        id,
                        callsign,
                        chatName,
                        chatSystem,
                        email,
                        name,
                        notes,
                        phone,
                        radioFrequency,
                        unit,
                        mutableMapOf(),
                    )

                    /**
                     * Unique identifier of the collection requirement POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * Callsign of the POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun callsign(): Optional<String> = callsign.getOptional("callsign")

                    /**
                     * Chat name of the POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun chatName(): Optional<String> = chatName.getOptional("chatName")

                    /**
                     * Chat system the POC is accessing.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun chatSystem(): Optional<String> = chatSystem.getOptional("chatSystem")

                    /**
                     * Email address of the POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun email(): Optional<String> = email.getOptional("email")

                    /**
                     * Name of the POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun name(): Optional<String> = name.getOptional("name")

                    /**
                     * Amplifying notes about the POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun notes(): Optional<String> = notes.getOptional("notes")

                    /**
                     * Phone number of the POC.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun phone(): Optional<String> = phone.getOptional("phone")

                    /**
                     * Radio Frequency the POC is on.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun radioFrequency(): Optional<Double> =
                        radioFrequency.getOptional("radioFrequency")

                    /**
                     * Unit the POC belongs to.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun unit(): Optional<String> = unit.getOptional("unit")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [callsign].
                     *
                     * Unlike [callsign], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("callsign")
                    @ExcludeMissing
                    fun _callsign(): JsonField<String> = callsign

                    /**
                     * Returns the raw JSON value of [chatName].
                     *
                     * Unlike [chatName], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("chatName")
                    @ExcludeMissing
                    fun _chatName(): JsonField<String> = chatName

                    /**
                     * Returns the raw JSON value of [chatSystem].
                     *
                     * Unlike [chatSystem], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("chatSystem")
                    @ExcludeMissing
                    fun _chatSystem(): JsonField<String> = chatSystem

                    /**
                     * Returns the raw JSON value of [email].
                     *
                     * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [notes].
                     *
                     * Unlike [notes], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("notes") @ExcludeMissing fun _notes(): JsonField<String> = notes

                    /**
                     * Returns the raw JSON value of [phone].
                     *
                     * Unlike [phone], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("phone") @ExcludeMissing fun _phone(): JsonField<String> = phone

                    /**
                     * Returns the raw JSON value of [radioFrequency].
                     *
                     * Unlike [radioFrequency], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("radioFrequency")
                    @ExcludeMissing
                    fun _radioFrequency(): JsonField<Double> = radioFrequency

                    /**
                     * Returns the raw JSON value of [unit].
                     *
                     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                        /** Returns a mutable builder for constructing an instance of [Poc]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Poc]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var callsign: JsonField<String> = JsonMissing.of()
                        private var chatName: JsonField<String> = JsonMissing.of()
                        private var chatSystem: JsonField<String> = JsonMissing.of()
                        private var email: JsonField<String> = JsonMissing.of()
                        private var name: JsonField<String> = JsonMissing.of()
                        private var notes: JsonField<String> = JsonMissing.of()
                        private var phone: JsonField<String> = JsonMissing.of()
                        private var radioFrequency: JsonField<Double> = JsonMissing.of()
                        private var unit: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(poc: Poc) = apply {
                            id = poc.id
                            callsign = poc.callsign
                            chatName = poc.chatName
                            chatSystem = poc.chatSystem
                            email = poc.email
                            name = poc.name
                            notes = poc.notes
                            phone = poc.phone
                            radioFrequency = poc.radioFrequency
                            unit = poc.unit
                            additionalProperties = poc.additionalProperties.toMutableMap()
                        }

                        /** Unique identifier of the collection requirement POC. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** Callsign of the POC. */
                        fun callsign(callsign: String) = callsign(JsonField.of(callsign))

                        /**
                         * Sets [Builder.callsign] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.callsign] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun callsign(callsign: JsonField<String>) = apply {
                            this.callsign = callsign
                        }

                        /** Chat name of the POC. */
                        fun chatName(chatName: String) = chatName(JsonField.of(chatName))

                        /**
                         * Sets [Builder.chatName] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.chatName] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun chatName(chatName: JsonField<String>) = apply {
                            this.chatName = chatName
                        }

                        /** Chat system the POC is accessing. */
                        fun chatSystem(chatSystem: String) = chatSystem(JsonField.of(chatSystem))

                        /**
                         * Sets [Builder.chatSystem] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.chatSystem] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun chatSystem(chatSystem: JsonField<String>) = apply {
                            this.chatSystem = chatSystem
                        }

                        /** Email address of the POC. */
                        fun email(email: String) = email(JsonField.of(email))

                        /**
                         * Sets [Builder.email] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.email] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun email(email: JsonField<String>) = apply { this.email = email }

                        /** Name of the POC. */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** Amplifying notes about the POC. */
                        fun notes(notes: String) = notes(JsonField.of(notes))

                        /**
                         * Sets [Builder.notes] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.notes] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun notes(notes: JsonField<String>) = apply { this.notes = notes }

                        /** Phone number of the POC. */
                        fun phone(phone: String) = phone(JsonField.of(phone))

                        /**
                         * Sets [Builder.phone] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.phone] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                        /** Radio Frequency the POC is on. */
                        fun radioFrequency(radioFrequency: Double) =
                            radioFrequency(JsonField.of(radioFrequency))

                        /**
                         * Sets [Builder.radioFrequency] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.radioFrequency] with a well-typed
                         * [Double] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun radioFrequency(radioFrequency: JsonField<Double>) = apply {
                            this.radioFrequency = radioFrequency
                        }

                        /** Unit the POC belongs to. */
                        fun unit(unit: String) = unit(JsonField.of(unit))

                        /**
                         * Sets [Builder.unit] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unit] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Poc].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Poc =
                            Poc(
                                id,
                                callsign,
                                chatName,
                                chatSystem,
                                email,
                                name,
                                notes,
                                phone,
                                radioFrequency,
                                unit,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Poc = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        callsign()
                        chatName()
                        chatSystem()
                        email()
                        name()
                        notes()
                        phone()
                        radioFrequency()
                        unit()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (callsign.asKnown().isPresent) 1 else 0) +
                            (if (chatName.asKnown().isPresent) 1 else 0) +
                            (if (chatSystem.asKnown().isPresent) 1 else 0) +
                            (if (email.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (if (notes.asKnown().isPresent) 1 else 0) +
                            (if (phone.asKnown().isPresent) 1 else 0) +
                            (if (radioFrequency.asKnown().isPresent) 1 else 0) +
                            (if (unit.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Poc &&
                            id == other.id &&
                            callsign == other.callsign &&
                            chatName == other.chatName &&
                            chatSystem == other.chatSystem &&
                            email == other.email &&
                            name == other.name &&
                            notes == other.notes &&
                            phone == other.phone &&
                            radioFrequency == other.radioFrequency &&
                            unit == other.unit &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            id,
                            callsign,
                            chatName,
                            chatSystem,
                            email,
                            name,
                            notes,
                            phone,
                            radioFrequency,
                            unit,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Poc{id=$id, callsign=$callsign, chatName=$chatName, chatSystem=$chatSystem, email=$email, name=$name, notes=$notes, phone=$phone, radioFrequency=$radioFrequency, unit=$unit, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ExploitationRequirement &&
                        id == other.id &&
                        amplification == other.amplification &&
                        dissemination == other.dissemination &&
                        eei == other.eei &&
                        poc == other.poc &&
                        reportingCriteria == other.reportingCriteria &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        amplification,
                        dissemination,
                        eei,
                        poc,
                        reportingCriteria,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ExploitationRequirement{id=$id, amplification=$amplification, dissemination=$dissemination, eei=$eei, poc=$poc, reportingCriteria=$reportingCriteria, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CollectionRequirement &&
                    id == other.id &&
                    country == other.country &&
                    cridNumbers == other.cridNumbers &&
                    criticalTimes == other.criticalTimes &&
                    emphasized == other.emphasized &&
                    exploitationRequirement == other.exploitationRequirement &&
                    hash == other.hash &&
                    intelDiscipline == other.intelDiscipline &&
                    isPrismCr == other.isPrismCr &&
                    operation == other.operation &&
                    priority == other.priority &&
                    reconSurvey == other.reconSurvey &&
                    recordId == other.recordId &&
                    region == other.region &&
                    secondary == other.secondary &&
                    specialComGuidance == other.specialComGuidance &&
                    start == other.start &&
                    stop == other.stop &&
                    subregion == other.subregion &&
                    supportedUnit == other.supportedUnit &&
                    targetList == other.targetList &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    country,
                    cridNumbers,
                    criticalTimes,
                    emphasized,
                    exploitationRequirement,
                    hash,
                    intelDiscipline,
                    isPrismCr,
                    operation,
                    priority,
                    reconSurvey,
                    recordId,
                    region,
                    secondary,
                    specialComGuidance,
                    start,
                    stop,
                    subregion,
                    supportedUnit,
                    targetList,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CollectionRequirement{id=$id, country=$country, cridNumbers=$cridNumbers, criticalTimes=$criticalTimes, emphasized=$emphasized, exploitationRequirement=$exploitationRequirement, hash=$hash, intelDiscipline=$intelDiscipline, isPrismCr=$isPrismCr, operation=$operation, priority=$priority, reconSurvey=$reconSurvey, recordId=$recordId, region=$region, secondary=$secondary, specialComGuidance=$specialComGuidance, start=$start, stop=$stop, subregion=$subregion, supportedUnit=$supportedUnit, targetList=$targetList, type=$type, additionalProperties=$additionalProperties}"
        }

        class Tasking
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val collectionPeriods: JsonField<CollectionPeriods>,
            private val collectionType: JsonField<CollectionType>,
            private val eightLine: JsonField<String>,
            private val specialComGuidance: JsonField<String>,
            private val sroTrack: JsonField<String>,
            private val taskingAor: JsonField<String>,
            private val taskingCollectionArea: JsonField<String>,
            private val taskingCollectionRequirements:
                JsonField<List<TaskingCollectionRequirement>>,
            private val taskingCountry: JsonField<String>,
            private val taskingEmphasis: JsonField<String>,
            private val taskingJoa: JsonField<String>,
            private val taskingOperation: JsonField<String>,
            private val taskingPrimaryIntelDiscipline: JsonField<String>,
            private val taskingPrimarySubCategory: JsonField<String>,
            private val taskingPriority: JsonField<Double>,
            private val taskingRegion: JsonField<String>,
            private val taskingRetaskTime: JsonField<OffsetDateTime>,
            private val taskingRole: JsonField<String>,
            private val taskingSecondaryIntelDiscipline: JsonField<String>,
            private val taskingSecondarySubCategory: JsonField<String>,
            private val taskingStartPointLat: JsonField<Double>,
            private val taskingStartPointLong: JsonField<Double>,
            private val taskingSubRegion: JsonField<String>,
            private val taskingSupportedUnit: JsonField<String>,
            private val taskingSyncMatrixBin: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("collectionPeriods")
                @ExcludeMissing
                collectionPeriods: JsonField<CollectionPeriods> = JsonMissing.of(),
                @JsonProperty("collectionType")
                @ExcludeMissing
                collectionType: JsonField<CollectionType> = JsonMissing.of(),
                @JsonProperty("eightLine")
                @ExcludeMissing
                eightLine: JsonField<String> = JsonMissing.of(),
                @JsonProperty("specialComGuidance")
                @ExcludeMissing
                specialComGuidance: JsonField<String> = JsonMissing.of(),
                @JsonProperty("sroTrack")
                @ExcludeMissing
                sroTrack: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingAOR")
                @ExcludeMissing
                taskingAor: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingCollectionArea")
                @ExcludeMissing
                taskingCollectionArea: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingCollectionRequirements")
                @ExcludeMissing
                taskingCollectionRequirements: JsonField<List<TaskingCollectionRequirement>> =
                    JsonMissing.of(),
                @JsonProperty("taskingCountry")
                @ExcludeMissing
                taskingCountry: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingEmphasis")
                @ExcludeMissing
                taskingEmphasis: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingJoa")
                @ExcludeMissing
                taskingJoa: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingOperation")
                @ExcludeMissing
                taskingOperation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingPrimaryIntelDiscipline")
                @ExcludeMissing
                taskingPrimaryIntelDiscipline: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingPrimarySubCategory")
                @ExcludeMissing
                taskingPrimarySubCategory: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingPriority")
                @ExcludeMissing
                taskingPriority: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("taskingRegion")
                @ExcludeMissing
                taskingRegion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingRetaskTime")
                @ExcludeMissing
                taskingRetaskTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("taskingRole")
                @ExcludeMissing
                taskingRole: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingSecondaryIntelDiscipline")
                @ExcludeMissing
                taskingSecondaryIntelDiscipline: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingSecondarySubCategory")
                @ExcludeMissing
                taskingSecondarySubCategory: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingStartPointLat")
                @ExcludeMissing
                taskingStartPointLat: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("taskingStartPointLong")
                @ExcludeMissing
                taskingStartPointLong: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("taskingSubRegion")
                @ExcludeMissing
                taskingSubRegion: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingSupportedUnit")
                @ExcludeMissing
                taskingSupportedUnit: JsonField<String> = JsonMissing.of(),
                @JsonProperty("taskingSyncMatrixBin")
                @ExcludeMissing
                taskingSyncMatrixBin: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(
                id,
                collectionPeriods,
                collectionType,
                eightLine,
                specialComGuidance,
                sroTrack,
                taskingAor,
                taskingCollectionArea,
                taskingCollectionRequirements,
                taskingCountry,
                taskingEmphasis,
                taskingJoa,
                taskingOperation,
                taskingPrimaryIntelDiscipline,
                taskingPrimarySubCategory,
                taskingPriority,
                taskingRegion,
                taskingRetaskTime,
                taskingRole,
                taskingSecondaryIntelDiscipline,
                taskingSecondarySubCategory,
                taskingStartPointLat,
                taskingStartPointLong,
                taskingSubRegion,
                taskingSupportedUnit,
                taskingSyncMatrixBin,
                type,
                mutableMapOf(),
            )

            /**
             * Tasking Unique Identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun collectionPeriods(): Optional<CollectionPeriods> =
                collectionPeriods.getOptional("collectionPeriods")

            /**
             * Type of collection tasked.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun collectionType(): Optional<CollectionType> =
                collectionType.getOptional("collectionType")

            /**
             * Eight line.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun eightLine(): Optional<String> = eightLine.getOptional("eightLine")

            /**
             * Free text field for the user to specify special instructions needed for this
             * collection.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun specialComGuidance(): Optional<String> =
                specialComGuidance.getOptional("specialComGuidance")

            /**
             * Value of the Sensitive Reconnaissance Operations Track.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun sroTrack(): Optional<String> = sroTrack.getOptional("sroTrack")

            /**
             * Human readable definition of this taskings Area Of Responsibility.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingAor(): Optional<String> = taskingAor.getOptional("taskingAOR")

            /**
             * Tasking geographical collection area.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingCollectionArea(): Optional<String> =
                taskingCollectionArea.getOptional("taskingCollectionArea")

            /**
             * Tasking desired collection requirements.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingCollectionRequirements(): Optional<List<TaskingCollectionRequirement>> =
                taskingCollectionRequirements.getOptional("taskingCollectionRequirements")

            /**
             * Country code of the tasking. A Country may represent countries, multi-national
             * consortiums, and international organizations.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingCountry(): Optional<String> = taskingCountry.getOptional("taskingCountry")

            /**
             * Tasking emphasis.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingEmphasis(): Optional<String> = taskingEmphasis.getOptional("taskingEmphasis")

            /**
             * Joint Operations Area.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingJoa(): Optional<String> = taskingJoa.getOptional("taskingJoa")

            /**
             * Tasking operation name.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingOperation(): Optional<String> =
                taskingOperation.getOptional("taskingOperation")

            /**
             * Primary type of intelligence to be collected during the mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingPrimaryIntelDiscipline(): Optional<String> =
                taskingPrimaryIntelDiscipline.getOptional("taskingPrimaryIntelDiscipline")

            /**
             * Sub category of primary intelligence to be collected.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingPrimarySubCategory(): Optional<String> =
                taskingPrimarySubCategory.getOptional("taskingPrimarySubCategory")

            /**
             * Tasking Priority (1-n).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingPriority(): Optional<Double> = taskingPriority.getOptional("taskingPriority")

            /**
             * Region of the tasking.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingRegion(): Optional<String> = taskingRegion.getOptional("taskingRegion")

            /**
             * Time of retasking, in ISO 8601 UTC format.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingRetaskTime(): Optional<OffsetDateTime> =
                taskingRetaskTime.getOptional("taskingRetaskTime")

            /**
             * What is the primary objective (role) of this task.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingRole(): Optional<String> = taskingRole.getOptional("taskingRole")

            /**
             * Type of tasking intelligence to be collected second.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingSecondaryIntelDiscipline(): Optional<String> =
                taskingSecondaryIntelDiscipline.getOptional("taskingSecondaryIntelDiscipline")

            /**
             * Mission sub category for secondary intelligence discipline to be collected.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingSecondarySubCategory(): Optional<String> =
                taskingSecondarySubCategory.getOptional("taskingSecondarySubCategory")

            /**
             * WGS-84 latitude of the start position, in degrees. -90 to 90 degrees (negative values
             * south of equator).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingStartPointLat(): Optional<Double> =
                taskingStartPointLat.getOptional("taskingStartPointLat")

            /**
             * WGS-84 longitude of the start position, in degrees. -180 to 180 degrees (negative
             * values west of Prime Meridian).
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingStartPointLong(): Optional<Double> =
                taskingStartPointLong.getOptional("taskingStartPointLong")

            /**
             * Subregion of the tasking.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingSubRegion(): Optional<String> =
                taskingSubRegion.getOptional("taskingSubRegion")

            /**
             * Military Base to transmit the dissemination of this data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingSupportedUnit(): Optional<String> =
                taskingSupportedUnit.getOptional("taskingSupportedUnit")

            /**
             * A synchronization matrix is used to organize the logistics synchronization process
             * during a mission.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun taskingSyncMatrixBin(): Optional<String> =
                taskingSyncMatrixBin.getOptional("taskingSyncMatrixBin")

            /**
             * Type of tasking.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun type(): Optional<Type> = type.getOptional("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [collectionPeriods].
             *
             * Unlike [collectionPeriods], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("collectionPeriods")
            @ExcludeMissing
            fun _collectionPeriods(): JsonField<CollectionPeriods> = collectionPeriods

            /**
             * Returns the raw JSON value of [collectionType].
             *
             * Unlike [collectionType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("collectionType")
            @ExcludeMissing
            fun _collectionType(): JsonField<CollectionType> = collectionType

            /**
             * Returns the raw JSON value of [eightLine].
             *
             * Unlike [eightLine], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("eightLine")
            @ExcludeMissing
            fun _eightLine(): JsonField<String> = eightLine

            /**
             * Returns the raw JSON value of [specialComGuidance].
             *
             * Unlike [specialComGuidance], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("specialComGuidance")
            @ExcludeMissing
            fun _specialComGuidance(): JsonField<String> = specialComGuidance

            /**
             * Returns the raw JSON value of [sroTrack].
             *
             * Unlike [sroTrack], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("sroTrack") @ExcludeMissing fun _sroTrack(): JsonField<String> = sroTrack

            /**
             * Returns the raw JSON value of [taskingAor].
             *
             * Unlike [taskingAor], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("taskingAOR")
            @ExcludeMissing
            fun _taskingAor(): JsonField<String> = taskingAor

            /**
             * Returns the raw JSON value of [taskingCollectionArea].
             *
             * Unlike [taskingCollectionArea], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingCollectionArea")
            @ExcludeMissing
            fun _taskingCollectionArea(): JsonField<String> = taskingCollectionArea

            /**
             * Returns the raw JSON value of [taskingCollectionRequirements].
             *
             * Unlike [taskingCollectionRequirements], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("taskingCollectionRequirements")
            @ExcludeMissing
            fun _taskingCollectionRequirements(): JsonField<List<TaskingCollectionRequirement>> =
                taskingCollectionRequirements

            /**
             * Returns the raw JSON value of [taskingCountry].
             *
             * Unlike [taskingCountry], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingCountry")
            @ExcludeMissing
            fun _taskingCountry(): JsonField<String> = taskingCountry

            /**
             * Returns the raw JSON value of [taskingEmphasis].
             *
             * Unlike [taskingEmphasis], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingEmphasis")
            @ExcludeMissing
            fun _taskingEmphasis(): JsonField<String> = taskingEmphasis

            /**
             * Returns the raw JSON value of [taskingJoa].
             *
             * Unlike [taskingJoa], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("taskingJoa")
            @ExcludeMissing
            fun _taskingJoa(): JsonField<String> = taskingJoa

            /**
             * Returns the raw JSON value of [taskingOperation].
             *
             * Unlike [taskingOperation], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingOperation")
            @ExcludeMissing
            fun _taskingOperation(): JsonField<String> = taskingOperation

            /**
             * Returns the raw JSON value of [taskingPrimaryIntelDiscipline].
             *
             * Unlike [taskingPrimaryIntelDiscipline], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("taskingPrimaryIntelDiscipline")
            @ExcludeMissing
            fun _taskingPrimaryIntelDiscipline(): JsonField<String> = taskingPrimaryIntelDiscipline

            /**
             * Returns the raw JSON value of [taskingPrimarySubCategory].
             *
             * Unlike [taskingPrimarySubCategory], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("taskingPrimarySubCategory")
            @ExcludeMissing
            fun _taskingPrimarySubCategory(): JsonField<String> = taskingPrimarySubCategory

            /**
             * Returns the raw JSON value of [taskingPriority].
             *
             * Unlike [taskingPriority], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingPriority")
            @ExcludeMissing
            fun _taskingPriority(): JsonField<Double> = taskingPriority

            /**
             * Returns the raw JSON value of [taskingRegion].
             *
             * Unlike [taskingRegion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("taskingRegion")
            @ExcludeMissing
            fun _taskingRegion(): JsonField<String> = taskingRegion

            /**
             * Returns the raw JSON value of [taskingRetaskTime].
             *
             * Unlike [taskingRetaskTime], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingRetaskTime")
            @ExcludeMissing
            fun _taskingRetaskTime(): JsonField<OffsetDateTime> = taskingRetaskTime

            /**
             * Returns the raw JSON value of [taskingRole].
             *
             * Unlike [taskingRole], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("taskingRole")
            @ExcludeMissing
            fun _taskingRole(): JsonField<String> = taskingRole

            /**
             * Returns the raw JSON value of [taskingSecondaryIntelDiscipline].
             *
             * Unlike [taskingSecondaryIntelDiscipline], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("taskingSecondaryIntelDiscipline")
            @ExcludeMissing
            fun _taskingSecondaryIntelDiscipline(): JsonField<String> =
                taskingSecondaryIntelDiscipline

            /**
             * Returns the raw JSON value of [taskingSecondarySubCategory].
             *
             * Unlike [taskingSecondarySubCategory], this method doesn't throw if the JSON field has
             * an unexpected type.
             */
            @JsonProperty("taskingSecondarySubCategory")
            @ExcludeMissing
            fun _taskingSecondarySubCategory(): JsonField<String> = taskingSecondarySubCategory

            /**
             * Returns the raw JSON value of [taskingStartPointLat].
             *
             * Unlike [taskingStartPointLat], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingStartPointLat")
            @ExcludeMissing
            fun _taskingStartPointLat(): JsonField<Double> = taskingStartPointLat

            /**
             * Returns the raw JSON value of [taskingStartPointLong].
             *
             * Unlike [taskingStartPointLong], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingStartPointLong")
            @ExcludeMissing
            fun _taskingStartPointLong(): JsonField<Double> = taskingStartPointLong

            /**
             * Returns the raw JSON value of [taskingSubRegion].
             *
             * Unlike [taskingSubRegion], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingSubRegion")
            @ExcludeMissing
            fun _taskingSubRegion(): JsonField<String> = taskingSubRegion

            /**
             * Returns the raw JSON value of [taskingSupportedUnit].
             *
             * Unlike [taskingSupportedUnit], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingSupportedUnit")
            @ExcludeMissing
            fun _taskingSupportedUnit(): JsonField<String> = taskingSupportedUnit

            /**
             * Returns the raw JSON value of [taskingSyncMatrixBin].
             *
             * Unlike [taskingSyncMatrixBin], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("taskingSyncMatrixBin")
            @ExcludeMissing
            fun _taskingSyncMatrixBin(): JsonField<String> = taskingSyncMatrixBin

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

                /** Returns a mutable builder for constructing an instance of [Tasking]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tasking]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var collectionPeriods: JsonField<CollectionPeriods> = JsonMissing.of()
                private var collectionType: JsonField<CollectionType> = JsonMissing.of()
                private var eightLine: JsonField<String> = JsonMissing.of()
                private var specialComGuidance: JsonField<String> = JsonMissing.of()
                private var sroTrack: JsonField<String> = JsonMissing.of()
                private var taskingAor: JsonField<String> = JsonMissing.of()
                private var taskingCollectionArea: JsonField<String> = JsonMissing.of()
                private var taskingCollectionRequirements:
                    JsonField<MutableList<TaskingCollectionRequirement>>? =
                    null
                private var taskingCountry: JsonField<String> = JsonMissing.of()
                private var taskingEmphasis: JsonField<String> = JsonMissing.of()
                private var taskingJoa: JsonField<String> = JsonMissing.of()
                private var taskingOperation: JsonField<String> = JsonMissing.of()
                private var taskingPrimaryIntelDiscipline: JsonField<String> = JsonMissing.of()
                private var taskingPrimarySubCategory: JsonField<String> = JsonMissing.of()
                private var taskingPriority: JsonField<Double> = JsonMissing.of()
                private var taskingRegion: JsonField<String> = JsonMissing.of()
                private var taskingRetaskTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var taskingRole: JsonField<String> = JsonMissing.of()
                private var taskingSecondaryIntelDiscipline: JsonField<String> = JsonMissing.of()
                private var taskingSecondarySubCategory: JsonField<String> = JsonMissing.of()
                private var taskingStartPointLat: JsonField<Double> = JsonMissing.of()
                private var taskingStartPointLong: JsonField<Double> = JsonMissing.of()
                private var taskingSubRegion: JsonField<String> = JsonMissing.of()
                private var taskingSupportedUnit: JsonField<String> = JsonMissing.of()
                private var taskingSyncMatrixBin: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tasking: Tasking) = apply {
                    id = tasking.id
                    collectionPeriods = tasking.collectionPeriods
                    collectionType = tasking.collectionType
                    eightLine = tasking.eightLine
                    specialComGuidance = tasking.specialComGuidance
                    sroTrack = tasking.sroTrack
                    taskingAor = tasking.taskingAor
                    taskingCollectionArea = tasking.taskingCollectionArea
                    taskingCollectionRequirements =
                        tasking.taskingCollectionRequirements.map { it.toMutableList() }
                    taskingCountry = tasking.taskingCountry
                    taskingEmphasis = tasking.taskingEmphasis
                    taskingJoa = tasking.taskingJoa
                    taskingOperation = tasking.taskingOperation
                    taskingPrimaryIntelDiscipline = tasking.taskingPrimaryIntelDiscipline
                    taskingPrimarySubCategory = tasking.taskingPrimarySubCategory
                    taskingPriority = tasking.taskingPriority
                    taskingRegion = tasking.taskingRegion
                    taskingRetaskTime = tasking.taskingRetaskTime
                    taskingRole = tasking.taskingRole
                    taskingSecondaryIntelDiscipline = tasking.taskingSecondaryIntelDiscipline
                    taskingSecondarySubCategory = tasking.taskingSecondarySubCategory
                    taskingStartPointLat = tasking.taskingStartPointLat
                    taskingStartPointLong = tasking.taskingStartPointLong
                    taskingSubRegion = tasking.taskingSubRegion
                    taskingSupportedUnit = tasking.taskingSupportedUnit
                    taskingSyncMatrixBin = tasking.taskingSyncMatrixBin
                    type = tasking.type
                    additionalProperties = tasking.additionalProperties.toMutableMap()
                }

                /** Tasking Unique Identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun collectionPeriods(collectionPeriods: CollectionPeriods) =
                    collectionPeriods(JsonField.of(collectionPeriods))

                /**
                 * Sets [Builder.collectionPeriods] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.collectionPeriods] with a well-typed
                 * [CollectionPeriods] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun collectionPeriods(collectionPeriods: JsonField<CollectionPeriods>) = apply {
                    this.collectionPeriods = collectionPeriods
                }

                /** Type of collection tasked. */
                fun collectionType(collectionType: CollectionType) =
                    collectionType(JsonField.of(collectionType))

                /**
                 * Sets [Builder.collectionType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.collectionType] with a well-typed
                 * [CollectionType] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun collectionType(collectionType: JsonField<CollectionType>) = apply {
                    this.collectionType = collectionType
                }

                /** Eight line. */
                fun eightLine(eightLine: String) = eightLine(JsonField.of(eightLine))

                /**
                 * Sets [Builder.eightLine] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.eightLine] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun eightLine(eightLine: JsonField<String>) = apply { this.eightLine = eightLine }

                /**
                 * Free text field for the user to specify special instructions needed for this
                 * collection.
                 */
                fun specialComGuidance(specialComGuidance: String) =
                    specialComGuidance(JsonField.of(specialComGuidance))

                /**
                 * Sets [Builder.specialComGuidance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.specialComGuidance] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun specialComGuidance(specialComGuidance: JsonField<String>) = apply {
                    this.specialComGuidance = specialComGuidance
                }

                /** Value of the Sensitive Reconnaissance Operations Track. */
                fun sroTrack(sroTrack: String) = sroTrack(JsonField.of(sroTrack))

                /**
                 * Sets [Builder.sroTrack] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sroTrack] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sroTrack(sroTrack: JsonField<String>) = apply { this.sroTrack = sroTrack }

                /** Human readable definition of this taskings Area Of Responsibility. */
                fun taskingAor(taskingAor: String) = taskingAor(JsonField.of(taskingAor))

                /**
                 * Sets [Builder.taskingAor] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingAor] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taskingAor(taskingAor: JsonField<String>) = apply {
                    this.taskingAor = taskingAor
                }

                /** Tasking geographical collection area. */
                fun taskingCollectionArea(taskingCollectionArea: String) =
                    taskingCollectionArea(JsonField.of(taskingCollectionArea))

                /**
                 * Sets [Builder.taskingCollectionArea] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingCollectionArea] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun taskingCollectionArea(taskingCollectionArea: JsonField<String>) = apply {
                    this.taskingCollectionArea = taskingCollectionArea
                }

                /** Tasking desired collection requirements. */
                fun taskingCollectionRequirements(
                    taskingCollectionRequirements: List<TaskingCollectionRequirement>
                ) = taskingCollectionRequirements(JsonField.of(taskingCollectionRequirements))

                /**
                 * Sets [Builder.taskingCollectionRequirements] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingCollectionRequirements] with a well-typed
                 * `List<TaskingCollectionRequirement>` value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun taskingCollectionRequirements(
                    taskingCollectionRequirements: JsonField<List<TaskingCollectionRequirement>>
                ) = apply {
                    this.taskingCollectionRequirements =
                        taskingCollectionRequirements.map { it.toMutableList() }
                }

                /**
                 * Adds a single [TaskingCollectionRequirement] to [taskingCollectionRequirements].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTaskingCollectionRequirement(
                    taskingCollectionRequirement: TaskingCollectionRequirement
                ) = apply {
                    taskingCollectionRequirements =
                        (taskingCollectionRequirements ?: JsonField.of(mutableListOf())).also {
                            checkKnown("taskingCollectionRequirements", it)
                                .add(taskingCollectionRequirement)
                        }
                }

                /**
                 * Country code of the tasking. A Country may represent countries, multi-national
                 * consortiums, and international organizations.
                 */
                fun taskingCountry(taskingCountry: String) =
                    taskingCountry(JsonField.of(taskingCountry))

                /**
                 * Sets [Builder.taskingCountry] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingCountry] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taskingCountry(taskingCountry: JsonField<String>) = apply {
                    this.taskingCountry = taskingCountry
                }

                /** Tasking emphasis. */
                fun taskingEmphasis(taskingEmphasis: String) =
                    taskingEmphasis(JsonField.of(taskingEmphasis))

                /**
                 * Sets [Builder.taskingEmphasis] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingEmphasis] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingEmphasis(taskingEmphasis: JsonField<String>) = apply {
                    this.taskingEmphasis = taskingEmphasis
                }

                /** Joint Operations Area. */
                fun taskingJoa(taskingJoa: String) = taskingJoa(JsonField.of(taskingJoa))

                /**
                 * Sets [Builder.taskingJoa] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingJoa] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taskingJoa(taskingJoa: JsonField<String>) = apply {
                    this.taskingJoa = taskingJoa
                }

                /** Tasking operation name. */
                fun taskingOperation(taskingOperation: String) =
                    taskingOperation(JsonField.of(taskingOperation))

                /**
                 * Sets [Builder.taskingOperation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingOperation] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingOperation(taskingOperation: JsonField<String>) = apply {
                    this.taskingOperation = taskingOperation
                }

                /** Primary type of intelligence to be collected during the mission. */
                fun taskingPrimaryIntelDiscipline(taskingPrimaryIntelDiscipline: String) =
                    taskingPrimaryIntelDiscipline(JsonField.of(taskingPrimaryIntelDiscipline))

                /**
                 * Sets [Builder.taskingPrimaryIntelDiscipline] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingPrimaryIntelDiscipline] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun taskingPrimaryIntelDiscipline(
                    taskingPrimaryIntelDiscipline: JsonField<String>
                ) = apply { this.taskingPrimaryIntelDiscipline = taskingPrimaryIntelDiscipline }

                /** Sub category of primary intelligence to be collected. */
                fun taskingPrimarySubCategory(taskingPrimarySubCategory: String) =
                    taskingPrimarySubCategory(JsonField.of(taskingPrimarySubCategory))

                /**
                 * Sets [Builder.taskingPrimarySubCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingPrimarySubCategory] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun taskingPrimarySubCategory(taskingPrimarySubCategory: JsonField<String>) =
                    apply {
                        this.taskingPrimarySubCategory = taskingPrimarySubCategory
                    }

                /** Tasking Priority (1-n). */
                fun taskingPriority(taskingPriority: Double) =
                    taskingPriority(JsonField.of(taskingPriority))

                /**
                 * Sets [Builder.taskingPriority] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingPriority] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingPriority(taskingPriority: JsonField<Double>) = apply {
                    this.taskingPriority = taskingPriority
                }

                /** Region of the tasking. */
                fun taskingRegion(taskingRegion: String) =
                    taskingRegion(JsonField.of(taskingRegion))

                /**
                 * Sets [Builder.taskingRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingRegion] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taskingRegion(taskingRegion: JsonField<String>) = apply {
                    this.taskingRegion = taskingRegion
                }

                /** Time of retasking, in ISO 8601 UTC format. */
                fun taskingRetaskTime(taskingRetaskTime: OffsetDateTime) =
                    taskingRetaskTime(JsonField.of(taskingRetaskTime))

                /**
                 * Sets [Builder.taskingRetaskTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingRetaskTime] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun taskingRetaskTime(taskingRetaskTime: JsonField<OffsetDateTime>) = apply {
                    this.taskingRetaskTime = taskingRetaskTime
                }

                /** What is the primary objective (role) of this task. */
                fun taskingRole(taskingRole: String) = taskingRole(JsonField.of(taskingRole))

                /**
                 * Sets [Builder.taskingRole] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingRole] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taskingRole(taskingRole: JsonField<String>) = apply {
                    this.taskingRole = taskingRole
                }

                /** Type of tasking intelligence to be collected second. */
                fun taskingSecondaryIntelDiscipline(taskingSecondaryIntelDiscipline: String) =
                    taskingSecondaryIntelDiscipline(JsonField.of(taskingSecondaryIntelDiscipline))

                /**
                 * Sets [Builder.taskingSecondaryIntelDiscipline] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingSecondaryIntelDiscipline] with a
                 * well-typed [String] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun taskingSecondaryIntelDiscipline(
                    taskingSecondaryIntelDiscipline: JsonField<String>
                ) = apply { this.taskingSecondaryIntelDiscipline = taskingSecondaryIntelDiscipline }

                /** Mission sub category for secondary intelligence discipline to be collected. */
                fun taskingSecondarySubCategory(taskingSecondarySubCategory: String) =
                    taskingSecondarySubCategory(JsonField.of(taskingSecondarySubCategory))

                /**
                 * Sets [Builder.taskingSecondarySubCategory] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingSecondarySubCategory] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun taskingSecondarySubCategory(taskingSecondarySubCategory: JsonField<String>) =
                    apply {
                        this.taskingSecondarySubCategory = taskingSecondarySubCategory
                    }

                /**
                 * WGS-84 latitude of the start position, in degrees. -90 to 90 degrees (negative
                 * values south of equator).
                 */
                fun taskingStartPointLat(taskingStartPointLat: Double) =
                    taskingStartPointLat(JsonField.of(taskingStartPointLat))

                /**
                 * Sets [Builder.taskingStartPointLat] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingStartPointLat] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingStartPointLat(taskingStartPointLat: JsonField<Double>) = apply {
                    this.taskingStartPointLat = taskingStartPointLat
                }

                /**
                 * WGS-84 longitude of the start position, in degrees. -180 to 180 degrees (negative
                 * values west of Prime Meridian).
                 */
                fun taskingStartPointLong(taskingStartPointLong: Double) =
                    taskingStartPointLong(JsonField.of(taskingStartPointLong))

                /**
                 * Sets [Builder.taskingStartPointLong] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingStartPointLong] with a well-typed
                 * [Double] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun taskingStartPointLong(taskingStartPointLong: JsonField<Double>) = apply {
                    this.taskingStartPointLong = taskingStartPointLong
                }

                /** Subregion of the tasking. */
                fun taskingSubRegion(taskingSubRegion: String) =
                    taskingSubRegion(JsonField.of(taskingSubRegion))

                /**
                 * Sets [Builder.taskingSubRegion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingSubRegion] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingSubRegion(taskingSubRegion: JsonField<String>) = apply {
                    this.taskingSubRegion = taskingSubRegion
                }

                /** Military Base to transmit the dissemination of this data. */
                fun taskingSupportedUnit(taskingSupportedUnit: String) =
                    taskingSupportedUnit(JsonField.of(taskingSupportedUnit))

                /**
                 * Sets [Builder.taskingSupportedUnit] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingSupportedUnit] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingSupportedUnit(taskingSupportedUnit: JsonField<String>) = apply {
                    this.taskingSupportedUnit = taskingSupportedUnit
                }

                /**
                 * A synchronization matrix is used to organize the logistics synchronization
                 * process during a mission.
                 */
                fun taskingSyncMatrixBin(taskingSyncMatrixBin: String) =
                    taskingSyncMatrixBin(JsonField.of(taskingSyncMatrixBin))

                /**
                 * Sets [Builder.taskingSyncMatrixBin] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taskingSyncMatrixBin] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun taskingSyncMatrixBin(taskingSyncMatrixBin: JsonField<String>) = apply {
                    this.taskingSyncMatrixBin = taskingSyncMatrixBin
                }

                /** Type of tasking. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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
                 * Returns an immutable instance of [Tasking].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tasking =
                    Tasking(
                        id,
                        collectionPeriods,
                        collectionType,
                        eightLine,
                        specialComGuidance,
                        sroTrack,
                        taskingAor,
                        taskingCollectionArea,
                        (taskingCollectionRequirements ?: JsonMissing.of()).map {
                            it.toImmutable()
                        },
                        taskingCountry,
                        taskingEmphasis,
                        taskingJoa,
                        taskingOperation,
                        taskingPrimaryIntelDiscipline,
                        taskingPrimarySubCategory,
                        taskingPriority,
                        taskingRegion,
                        taskingRetaskTime,
                        taskingRole,
                        taskingSecondaryIntelDiscipline,
                        taskingSecondarySubCategory,
                        taskingStartPointLat,
                        taskingStartPointLong,
                        taskingSubRegion,
                        taskingSupportedUnit,
                        taskingSyncMatrixBin,
                        type,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Tasking = apply {
                if (validated) {
                    return@apply
                }

                id()
                collectionPeriods().ifPresent { it.validate() }
                collectionType().ifPresent { it.validate() }
                eightLine()
                specialComGuidance()
                sroTrack()
                taskingAor()
                taskingCollectionArea()
                taskingCollectionRequirements().ifPresent { it.forEach { it.validate() } }
                taskingCountry()
                taskingEmphasis()
                taskingJoa()
                taskingOperation()
                taskingPrimaryIntelDiscipline()
                taskingPrimarySubCategory()
                taskingPriority()
                taskingRegion()
                taskingRetaskTime()
                taskingRole()
                taskingSecondaryIntelDiscipline()
                taskingSecondarySubCategory()
                taskingStartPointLat()
                taskingStartPointLong()
                taskingSubRegion()
                taskingSupportedUnit()
                taskingSyncMatrixBin()
                type().ifPresent { it.validate() }
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (collectionPeriods.asKnown().getOrNull()?.validity() ?: 0) +
                    (collectionType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (eightLine.asKnown().isPresent) 1 else 0) +
                    (if (specialComGuidance.asKnown().isPresent) 1 else 0) +
                    (if (sroTrack.asKnown().isPresent) 1 else 0) +
                    (if (taskingAor.asKnown().isPresent) 1 else 0) +
                    (if (taskingCollectionArea.asKnown().isPresent) 1 else 0) +
                    (taskingCollectionRequirements.asKnown().getOrNull()?.sumOf {
                        it.validity().toInt()
                    } ?: 0) +
                    (if (taskingCountry.asKnown().isPresent) 1 else 0) +
                    (if (taskingEmphasis.asKnown().isPresent) 1 else 0) +
                    (if (taskingJoa.asKnown().isPresent) 1 else 0) +
                    (if (taskingOperation.asKnown().isPresent) 1 else 0) +
                    (if (taskingPrimaryIntelDiscipline.asKnown().isPresent) 1 else 0) +
                    (if (taskingPrimarySubCategory.asKnown().isPresent) 1 else 0) +
                    (if (taskingPriority.asKnown().isPresent) 1 else 0) +
                    (if (taskingRegion.asKnown().isPresent) 1 else 0) +
                    (if (taskingRetaskTime.asKnown().isPresent) 1 else 0) +
                    (if (taskingRole.asKnown().isPresent) 1 else 0) +
                    (if (taskingSecondaryIntelDiscipline.asKnown().isPresent) 1 else 0) +
                    (if (taskingSecondarySubCategory.asKnown().isPresent) 1 else 0) +
                    (if (taskingStartPointLat.asKnown().isPresent) 1 else 0) +
                    (if (taskingStartPointLong.asKnown().isPresent) 1 else 0) +
                    (if (taskingSubRegion.asKnown().isPresent) 1 else 0) +
                    (if (taskingSupportedUnit.asKnown().isPresent) 1 else 0) +
                    (if (taskingSyncMatrixBin.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class CollectionPeriods
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val actual: JsonField<List<Actual>>,
                private val planned: JsonField<Planned>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("actual")
                    @ExcludeMissing
                    actual: JsonField<List<Actual>> = JsonMissing.of(),
                    @JsonProperty("planned")
                    @ExcludeMissing
                    planned: JsonField<Planned> = JsonMissing.of(),
                ) : this(actual, planned, mutableMapOf())

                /**
                 * Actual start and stop for the collection.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun actual(): Optional<List<Actual>> = actual.getOptional("actual")

                /**
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun planned(): Optional<Planned> = planned.getOptional("planned")

                /**
                 * Returns the raw JSON value of [actual].
                 *
                 * Unlike [actual], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("actual")
                @ExcludeMissing
                fun _actual(): JsonField<List<Actual>> = actual

                /**
                 * Returns the raw JSON value of [planned].
                 *
                 * Unlike [planned], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("planned")
                @ExcludeMissing
                fun _planned(): JsonField<Planned> = planned

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
                     * [CollectionPeriods].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CollectionPeriods]. */
                class Builder internal constructor() {

                    private var actual: JsonField<MutableList<Actual>>? = null
                    private var planned: JsonField<Planned> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(collectionPeriods: CollectionPeriods) = apply {
                        actual = collectionPeriods.actual.map { it.toMutableList() }
                        planned = collectionPeriods.planned
                        additionalProperties = collectionPeriods.additionalProperties.toMutableMap()
                    }

                    /** Actual start and stop for the collection. */
                    fun actual(actual: List<Actual>) = actual(JsonField.of(actual))

                    /**
                     * Sets [Builder.actual] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.actual] with a well-typed `List<Actual>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun actual(actual: JsonField<List<Actual>>) = apply {
                        this.actual = actual.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Actual] to [Builder.actual].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addActual(actual: Actual) = apply {
                        this.actual =
                            (this.actual ?: JsonField.of(mutableListOf())).also {
                                checkKnown("actual", it).add(actual)
                            }
                    }

                    fun planned(planned: Planned) = planned(JsonField.of(planned))

                    /**
                     * Sets [Builder.planned] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planned] with a well-typed [Planned] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun planned(planned: JsonField<Planned>) = apply { this.planned = planned }

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
                     * Returns an immutable instance of [CollectionPeriods].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CollectionPeriods =
                        CollectionPeriods(
                            (actual ?: JsonMissing.of()).map { it.toImmutable() },
                            planned,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CollectionPeriods = apply {
                    if (validated) {
                        return@apply
                    }

                    actual().ifPresent { it.forEach { it.validate() } }
                    planned().ifPresent { it.validate() }
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
                    (actual.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                        (planned.asKnown().getOrNull()?.validity() ?: 0)

                class Actual
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val start: JsonField<OffsetDateTime>,
                    private val stop: JsonField<OffsetDateTime>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("start")
                        @ExcludeMissing
                        start: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("stop")
                        @ExcludeMissing
                        stop: JsonField<OffsetDateTime> = JsonMissing.of(),
                    ) : this(id, start, stop, mutableMapOf())

                    /**
                     * Unique Identifier of actual collection period for historical archive.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * Start time the collection actually occurred, in ISO 8601 UTC format.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun start(): Optional<OffsetDateTime> = start.getOptional("start")

                    /**
                     * Stop time the collection actually occurred, in ISO 8601 UTC format.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun stop(): Optional<OffsetDateTime> = stop.getOptional("stop")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [start].
                     *
                     * Unlike [start], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("start")
                    @ExcludeMissing
                    fun _start(): JsonField<OffsetDateTime> = start

                    /**
                     * Returns the raw JSON value of [stop].
                     *
                     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("stop")
                    @ExcludeMissing
                    fun _stop(): JsonField<OffsetDateTime> = stop

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

                        /** Returns a mutable builder for constructing an instance of [Actual]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Actual]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var start: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var stop: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(actual: Actual) = apply {
                            id = actual.id
                            start = actual.start
                            stop = actual.stop
                            additionalProperties = actual.additionalProperties.toMutableMap()
                        }

                        /** Unique Identifier of actual collection period for historical archive. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** Start time the collection actually occurred, in ISO 8601 UTC format. */
                        fun start(start: OffsetDateTime) = start(JsonField.of(start))

                        /**
                         * Sets [Builder.start] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.start] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

                        /** Stop time the collection actually occurred, in ISO 8601 UTC format. */
                        fun stop(stop: OffsetDateTime) = stop(JsonField.of(stop))

                        /**
                         * Sets [Builder.stop] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stop] with a well-typed [OffsetDateTime]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun stop(stop: JsonField<OffsetDateTime>) = apply { this.stop = stop }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Actual].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Actual =
                            Actual(id, start, stop, additionalProperties.toMutableMap())
                    }

                    private var validated: Boolean = false

                    fun validate(): Actual = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        start()
                        stop()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (start.asKnown().isPresent) 1 else 0) +
                            (if (stop.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Actual &&
                            id == other.id &&
                            start == other.start &&
                            stop == other.stop &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(id, start, stop, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Actual{id=$id, start=$start, stop=$stop, additionalProperties=$additionalProperties}"
                }

                class Planned
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val additional: JsonField<List<Additional>>,
                    private val start: JsonField<OffsetDateTime>,
                    private val stop: JsonField<OffsetDateTime>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("additional")
                        @ExcludeMissing
                        additional: JsonField<List<Additional>> = JsonMissing.of(),
                        @JsonProperty("start")
                        @ExcludeMissing
                        start: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("stop")
                        @ExcludeMissing
                        stop: JsonField<OffsetDateTime> = JsonMissing.of(),
                    ) : this(additional, start, stop, mutableMapOf())

                    /**
                     * Additional start and stop for the collection.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun additional(): Optional<List<Additional>> =
                        additional.getOptional("additional")

                    /**
                     * Start time of collection, in ISO 8601 UTC format.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun start(): Optional<OffsetDateTime> = start.getOptional("start")

                    /**
                     * Stop time of collection, in ISO 8601 UTC format.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun stop(): Optional<OffsetDateTime> = stop.getOptional("stop")

                    /**
                     * Returns the raw JSON value of [additional].
                     *
                     * Unlike [additional], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("additional")
                    @ExcludeMissing
                    fun _additional(): JsonField<List<Additional>> = additional

                    /**
                     * Returns the raw JSON value of [start].
                     *
                     * Unlike [start], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("start")
                    @ExcludeMissing
                    fun _start(): JsonField<OffsetDateTime> = start

                    /**
                     * Returns the raw JSON value of [stop].
                     *
                     * Unlike [stop], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("stop")
                    @ExcludeMissing
                    fun _stop(): JsonField<OffsetDateTime> = stop

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

                        /** Returns a mutable builder for constructing an instance of [Planned]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Planned]. */
                    class Builder internal constructor() {

                        private var additional: JsonField<MutableList<Additional>>? = null
                        private var start: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var stop: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(planned: Planned) = apply {
                            additional = planned.additional.map { it.toMutableList() }
                            start = planned.start
                            stop = planned.stop
                            additionalProperties = planned.additionalProperties.toMutableMap()
                        }

                        /** Additional start and stop for the collection. */
                        fun additional(additional: List<Additional>) =
                            additional(JsonField.of(additional))

                        /**
                         * Sets [Builder.additional] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.additional] with a well-typed
                         * `List<Additional>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun additional(additional: JsonField<List<Additional>>) = apply {
                            this.additional = additional.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Additional] to [Builder.additional].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addAdditional(additional: Additional) = apply {
                            this.additional =
                                (this.additional ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("additional", it).add(additional)
                                }
                        }

                        /** Start time of collection, in ISO 8601 UTC format. */
                        fun start(start: OffsetDateTime) = start(JsonField.of(start))

                        /**
                         * Sets [Builder.start] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.start] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

                        /** Stop time of collection, in ISO 8601 UTC format. */
                        fun stop(stop: OffsetDateTime) = stop(JsonField.of(stop))

                        /**
                         * Sets [Builder.stop] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.stop] with a well-typed [OffsetDateTime]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun stop(stop: JsonField<OffsetDateTime>) = apply { this.stop = stop }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Planned].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Planned =
                            Planned(
                                (additional ?: JsonMissing.of()).map { it.toImmutable() },
                                start,
                                stop,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): Planned = apply {
                        if (validated) {
                            return@apply
                        }

                        additional().ifPresent { it.forEach { it.validate() } }
                        start()
                        stop()
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
                        (additional.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                            (if (start.asKnown().isPresent) 1 else 0) +
                            (if (stop.asKnown().isPresent) 1 else 0)

                    class Additional
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val id: JsonField<String>,
                        private val start: JsonField<OffsetDateTime>,
                        private val stop: JsonField<OffsetDateTime>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("start")
                            @ExcludeMissing
                            start: JsonField<OffsetDateTime> = JsonMissing.of(),
                            @JsonProperty("stop")
                            @ExcludeMissing
                            stop: JsonField<OffsetDateTime> = JsonMissing.of(),
                        ) : this(id, start, stop, mutableMapOf())

                        /**
                         * Unique Identifier of additional collection period.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun id(): Optional<String> = id.getOptional("id")

                        /**
                         * Start time of collection, in ISO 8601 UTC format.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun start(): Optional<OffsetDateTime> = start.getOptional("start")

                        /**
                         * Stop time of collection, in ISO 8601 UTC format.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun stop(): Optional<OffsetDateTime> = stop.getOptional("stop")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                        /**
                         * Returns the raw JSON value of [start].
                         *
                         * Unlike [start], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("start")
                        @ExcludeMissing
                        fun _start(): JsonField<OffsetDateTime> = start

                        /**
                         * Returns the raw JSON value of [stop].
                         *
                         * Unlike [stop], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("stop")
                        @ExcludeMissing
                        fun _stop(): JsonField<OffsetDateTime> = stop

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
                             * [Additional].
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Additional]. */
                        class Builder internal constructor() {

                            private var id: JsonField<String> = JsonMissing.of()
                            private var start: JsonField<OffsetDateTime> = JsonMissing.of()
                            private var stop: JsonField<OffsetDateTime> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(additional: Additional) = apply {
                                id = additional.id
                                start = additional.start
                                stop = additional.stop
                                additionalProperties =
                                    additional.additionalProperties.toMutableMap()
                            }

                            /** Unique Identifier of additional collection period. */
                            fun id(id: String) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<String>) = apply { this.id = id }

                            /** Start time of collection, in ISO 8601 UTC format. */
                            fun start(start: OffsetDateTime) = start(JsonField.of(start))

                            /**
                             * Sets [Builder.start] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.start] with a well-typed
                             * [OffsetDateTime] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun start(start: JsonField<OffsetDateTime>) = apply {
                                this.start = start
                            }

                            /** Stop time of collection, in ISO 8601 UTC format. */
                            fun stop(stop: OffsetDateTime) = stop(JsonField.of(stop))

                            /**
                             * Sets [Builder.stop] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.stop] with a well-typed
                             * [OffsetDateTime] value instead. This method is primarily for setting
                             * the field to an undocumented or not yet supported value.
                             */
                            fun stop(stop: JsonField<OffsetDateTime>) = apply { this.stop = stop }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Additional].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Additional =
                                Additional(id, start, stop, additionalProperties.toMutableMap())
                        }

                        private var validated: Boolean = false

                        fun validate(): Additional = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            start()
                            stop()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (id.asKnown().isPresent) 1 else 0) +
                                (if (start.asKnown().isPresent) 1 else 0) +
                                (if (stop.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Additional &&
                                id == other.id &&
                                start == other.start &&
                                stop == other.stop &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(id, start, stop, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Additional{id=$id, start=$start, stop=$stop, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Planned &&
                            additional == other.additional &&
                            start == other.start &&
                            stop == other.stop &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(additional, start, stop, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Planned{additional=$additional, start=$start, stop=$stop, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CollectionPeriods &&
                        actual == other.actual &&
                        planned == other.planned &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(actual, planned, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CollectionPeriods{actual=$actual, planned=$planned, additionalProperties=$additionalProperties}"
            }

            /** Type of collection tasked. */
            class CollectionType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val SIMULTANEOUS = of("Simultaneous")

                    @JvmField val SEQUENTIAL = of("Sequential")

                    @JvmField val OPERATIONALLY = of("Operationally")

                    @JvmField val DRIVEN = of("Driven")

                    @JvmField val PRIORITY = of("Priority")

                    @JvmField val ORDER = of("Order")

                    @JvmStatic fun of(value: String) = CollectionType(JsonField.of(value))
                }

                /** An enum containing [CollectionType]'s known values. */
                enum class Known {
                    SIMULTANEOUS,
                    SEQUENTIAL,
                    OPERATIONALLY,
                    DRIVEN,
                    PRIORITY,
                    ORDER,
                }

                /**
                 * An enum containing [CollectionType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [CollectionType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SIMULTANEOUS,
                    SEQUENTIAL,
                    OPERATIONALLY,
                    DRIVEN,
                    PRIORITY,
                    ORDER,
                    /**
                     * An enum member indicating that [CollectionType] was instantiated with an
                     * unknown value.
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
                        SIMULTANEOUS -> Value.SIMULTANEOUS
                        SEQUENTIAL -> Value.SEQUENTIAL
                        OPERATIONALLY -> Value.OPERATIONALLY
                        DRIVEN -> Value.DRIVEN
                        PRIORITY -> Value.PRIORITY
                        ORDER -> Value.ORDER
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
                        SIMULTANEOUS -> Known.SIMULTANEOUS
                        SEQUENTIAL -> Known.SEQUENTIAL
                        OPERATIONALLY -> Known.OPERATIONALLY
                        DRIVEN -> Known.DRIVEN
                        PRIORITY -> Known.PRIORITY
                        ORDER -> Known.ORDER
                        else ->
                            throw UnifieddatalibraryInvalidDataException(
                                "Unknown CollectionType: $value"
                            )
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

                fun validate(): CollectionType = apply {
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

                    return other is CollectionType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class TaskingCollectionRequirement
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val country: JsonField<String>,
                private val cridNumbers: JsonField<String>,
                private val criticalTimes: JsonField<CriticalTimes>,
                private val emphasized: JsonField<Boolean>,
                private val exploitationRequirement: JsonField<ExploitationRequirement>,
                private val hash: JsonField<String>,
                private val intelDiscipline: JsonField<String>,
                private val isPrismCr: JsonField<Boolean>,
                private val operation: JsonField<String>,
                private val priority: JsonField<Double>,
                private val reconSurvey: JsonField<String>,
                private val recordId: JsonField<String>,
                private val region: JsonField<String>,
                private val secondary: JsonField<Boolean>,
                private val specialComGuidance: JsonField<String>,
                private val start: JsonField<OffsetDateTime>,
                private val stop: JsonField<OffsetDateTime>,
                private val subregion: JsonField<String>,
                private val supportedUnit: JsonField<String>,
                private val targetList: JsonField<List<String>>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("country")
                    @ExcludeMissing
                    country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("cridNumbers")
                    @ExcludeMissing
                    cridNumbers: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("criticalTimes")
                    @ExcludeMissing
                    criticalTimes: JsonField<CriticalTimes> = JsonMissing.of(),
                    @JsonProperty("emphasized")
                    @ExcludeMissing
                    emphasized: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("exploitationRequirement")
                    @ExcludeMissing
                    exploitationRequirement: JsonField<ExploitationRequirement> = JsonMissing.of(),
                    @JsonProperty("hash")
                    @ExcludeMissing
                    hash: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("intelDiscipline")
                    @ExcludeMissing
                    intelDiscipline: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("isPrismCr")
                    @ExcludeMissing
                    isPrismCr: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("operation")
                    @ExcludeMissing
                    operation: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("priority")
                    @ExcludeMissing
                    priority: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("reconSurvey")
                    @ExcludeMissing
                    reconSurvey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("recordId")
                    @ExcludeMissing
                    recordId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    region: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("secondary")
                    @ExcludeMissing
                    secondary: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("specialComGuidance")
                    @ExcludeMissing
                    specialComGuidance: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("start")
                    @ExcludeMissing
                    start: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("stop")
                    @ExcludeMissing
                    stop: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("subregion")
                    @ExcludeMissing
                    subregion: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("supportedUnit")
                    @ExcludeMissing
                    supportedUnit: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("targetList")
                    @ExcludeMissing
                    targetList: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(
                    id,
                    country,
                    cridNumbers,
                    criticalTimes,
                    emphasized,
                    exploitationRequirement,
                    hash,
                    intelDiscipline,
                    isPrismCr,
                    operation,
                    priority,
                    reconSurvey,
                    recordId,
                    region,
                    secondary,
                    specialComGuidance,
                    start,
                    stop,
                    subregion,
                    supportedUnit,
                    targetList,
                    type,
                    mutableMapOf(),
                )

                /**
                 * Collection Requirement Unique Identifier.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Country code of the collection requirement. A Country may represent countries,
                 * multi-national consortiums, and international organizations.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun country(): Optional<String> = country.getOptional("country")

                /**
                 * Collection Requirement Unique Identifier.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun cridNumbers(): Optional<String> = cridNumbers.getOptional("cridNumbers")

                /**
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun criticalTimes(): Optional<CriticalTimes> =
                    criticalTimes.getOptional("criticalTimes")

                /**
                 * Is this collection requirement an emphasized/critical requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun emphasized(): Optional<Boolean> = emphasized.getOptional("emphasized")

                /**
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun exploitationRequirement(): Optional<ExploitationRequirement> =
                    exploitationRequirement.getOptional("exploitationRequirement")

                /**
                 * Encryption hashing algorithm.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun hash(): Optional<String> = hash.getOptional("hash")

                /**
                 * Primary type of intelligence to be collected for this requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun intelDiscipline(): Optional<String> =
                    intelDiscipline.getOptional("intelDiscipline")

                /**
                 * Is this collection request for the Prism system?.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun isPrismCr(): Optional<Boolean> = isPrismCr.getOptional("isPrismCr")

                /**
                 * Human readable name for this operation.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun operation(): Optional<String> = operation.getOptional("operation")

                /**
                 * 1-n priority for this collection requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun priority(): Optional<Double> = priority.getOptional("priority")

                /**
                 * Reconnaissance Survey information the operator needs.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun reconSurvey(): Optional<String> = reconSurvey.getOptional("reconSurvey")

                /**
                 * Record id.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun recordId(): Optional<String> = recordId.getOptional("recordId")

                /**
                 * Region of the collection requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun region(): Optional<String> = region.getOptional("region")

                /**
                 * Sub category of primary intelligence to be collected for this requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun secondary(): Optional<Boolean> = secondary.getOptional("secondary")

                /**
                 * Free text field for the user to specify special instructions needed for this
                 * collection.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun specialComGuidance(): Optional<String> =
                    specialComGuidance.getOptional("specialComGuidance")

                /**
                 * Start time for this requirement, should be within the mission time window.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun start(): Optional<OffsetDateTime> = start.getOptional("start")

                /**
                 * Stop time for this requirement, should be within the mission time window.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun stop(): Optional<OffsetDateTime> = stop.getOptional("stop")

                /**
                 * Subregion of the collection requirement.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun subregion(): Optional<String> = subregion.getOptional("subregion")

                /**
                 * The name of the military unit that this assigned collection requirement will
                 * support.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun supportedUnit(): Optional<String> = supportedUnit.getOptional("supportedUnit")

                /**
                 * Array of POI Id's for the targets being tasked.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun targetList(): Optional<List<String>> = targetList.getOptional("targetList")

                /**
                 * Type collection this requirement applies to.
                 *
                 * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                 *   unexpected type (e.g. if the server responded with an unexpected value).
                 */
                fun type(): Optional<String> = type.getOptional("type")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [country].
                 *
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

                /**
                 * Returns the raw JSON value of [cridNumbers].
                 *
                 * Unlike [cridNumbers], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("cridNumbers")
                @ExcludeMissing
                fun _cridNumbers(): JsonField<String> = cridNumbers

                /**
                 * Returns the raw JSON value of [criticalTimes].
                 *
                 * Unlike [criticalTimes], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("criticalTimes")
                @ExcludeMissing
                fun _criticalTimes(): JsonField<CriticalTimes> = criticalTimes

                /**
                 * Returns the raw JSON value of [emphasized].
                 *
                 * Unlike [emphasized], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("emphasized")
                @ExcludeMissing
                fun _emphasized(): JsonField<Boolean> = emphasized

                /**
                 * Returns the raw JSON value of [exploitationRequirement].
                 *
                 * Unlike [exploitationRequirement], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("exploitationRequirement")
                @ExcludeMissing
                fun _exploitationRequirement(): JsonField<ExploitationRequirement> =
                    exploitationRequirement

                /**
                 * Returns the raw JSON value of [hash].
                 *
                 * Unlike [hash], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("hash") @ExcludeMissing fun _hash(): JsonField<String> = hash

                /**
                 * Returns the raw JSON value of [intelDiscipline].
                 *
                 * Unlike [intelDiscipline], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("intelDiscipline")
                @ExcludeMissing
                fun _intelDiscipline(): JsonField<String> = intelDiscipline

                /**
                 * Returns the raw JSON value of [isPrismCr].
                 *
                 * Unlike [isPrismCr], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("isPrismCr")
                @ExcludeMissing
                fun _isPrismCr(): JsonField<Boolean> = isPrismCr

                /**
                 * Returns the raw JSON value of [operation].
                 *
                 * Unlike [operation], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operation")
                @ExcludeMissing
                fun _operation(): JsonField<String> = operation

                /**
                 * Returns the raw JSON value of [priority].
                 *
                 * Unlike [priority], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("priority")
                @ExcludeMissing
                fun _priority(): JsonField<Double> = priority

                /**
                 * Returns the raw JSON value of [reconSurvey].
                 *
                 * Unlike [reconSurvey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("reconSurvey")
                @ExcludeMissing
                fun _reconSurvey(): JsonField<String> = reconSurvey

                /**
                 * Returns the raw JSON value of [recordId].
                 *
                 * Unlike [recordId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("recordId")
                @ExcludeMissing
                fun _recordId(): JsonField<String> = recordId

                /**
                 * Returns the raw JSON value of [region].
                 *
                 * Unlike [region], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

                /**
                 * Returns the raw JSON value of [secondary].
                 *
                 * Unlike [secondary], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("secondary")
                @ExcludeMissing
                fun _secondary(): JsonField<Boolean> = secondary

                /**
                 * Returns the raw JSON value of [specialComGuidance].
                 *
                 * Unlike [specialComGuidance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("specialComGuidance")
                @ExcludeMissing
                fun _specialComGuidance(): JsonField<String> = specialComGuidance

                /**
                 * Returns the raw JSON value of [start].
                 *
                 * Unlike [start], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("start")
                @ExcludeMissing
                fun _start(): JsonField<OffsetDateTime> = start

                /**
                 * Returns the raw JSON value of [stop].
                 *
                 * Unlike [stop], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("stop") @ExcludeMissing fun _stop(): JsonField<OffsetDateTime> = stop

                /**
                 * Returns the raw JSON value of [subregion].
                 *
                 * Unlike [subregion], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("subregion")
                @ExcludeMissing
                fun _subregion(): JsonField<String> = subregion

                /**
                 * Returns the raw JSON value of [supportedUnit].
                 *
                 * Unlike [supportedUnit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("supportedUnit")
                @ExcludeMissing
                fun _supportedUnit(): JsonField<String> = supportedUnit

                /**
                 * Returns the raw JSON value of [targetList].
                 *
                 * Unlike [targetList], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("targetList")
                @ExcludeMissing
                fun _targetList(): JsonField<List<String>> = targetList

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [TaskingCollectionRequirement].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TaskingCollectionRequirement]. */
                class Builder internal constructor() {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var country: JsonField<String> = JsonMissing.of()
                    private var cridNumbers: JsonField<String> = JsonMissing.of()
                    private var criticalTimes: JsonField<CriticalTimes> = JsonMissing.of()
                    private var emphasized: JsonField<Boolean> = JsonMissing.of()
                    private var exploitationRequirement: JsonField<ExploitationRequirement> =
                        JsonMissing.of()
                    private var hash: JsonField<String> = JsonMissing.of()
                    private var intelDiscipline: JsonField<String> = JsonMissing.of()
                    private var isPrismCr: JsonField<Boolean> = JsonMissing.of()
                    private var operation: JsonField<String> = JsonMissing.of()
                    private var priority: JsonField<Double> = JsonMissing.of()
                    private var reconSurvey: JsonField<String> = JsonMissing.of()
                    private var recordId: JsonField<String> = JsonMissing.of()
                    private var region: JsonField<String> = JsonMissing.of()
                    private var secondary: JsonField<Boolean> = JsonMissing.of()
                    private var specialComGuidance: JsonField<String> = JsonMissing.of()
                    private var start: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var stop: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var subregion: JsonField<String> = JsonMissing.of()
                    private var supportedUnit: JsonField<String> = JsonMissing.of()
                    private var targetList: JsonField<MutableList<String>>? = null
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(taskingCollectionRequirement: TaskingCollectionRequirement) =
                        apply {
                            id = taskingCollectionRequirement.id
                            country = taskingCollectionRequirement.country
                            cridNumbers = taskingCollectionRequirement.cridNumbers
                            criticalTimes = taskingCollectionRequirement.criticalTimes
                            emphasized = taskingCollectionRequirement.emphasized
                            exploitationRequirement =
                                taskingCollectionRequirement.exploitationRequirement
                            hash = taskingCollectionRequirement.hash
                            intelDiscipline = taskingCollectionRequirement.intelDiscipline
                            isPrismCr = taskingCollectionRequirement.isPrismCr
                            operation = taskingCollectionRequirement.operation
                            priority = taskingCollectionRequirement.priority
                            reconSurvey = taskingCollectionRequirement.reconSurvey
                            recordId = taskingCollectionRequirement.recordId
                            region = taskingCollectionRequirement.region
                            secondary = taskingCollectionRequirement.secondary
                            specialComGuidance = taskingCollectionRequirement.specialComGuidance
                            start = taskingCollectionRequirement.start
                            stop = taskingCollectionRequirement.stop
                            subregion = taskingCollectionRequirement.subregion
                            supportedUnit = taskingCollectionRequirement.supportedUnit
                            targetList =
                                taskingCollectionRequirement.targetList.map { it.toMutableList() }
                            type = taskingCollectionRequirement.type
                            additionalProperties =
                                taskingCollectionRequirement.additionalProperties.toMutableMap()
                        }

                    /** Collection Requirement Unique Identifier. */
                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * Country code of the collection requirement. A Country may represent
                     * countries, multi-national consortiums, and international organizations.
                     */
                    fun country(country: String) = country(JsonField.of(country))

                    /**
                     * Sets [Builder.country] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.country] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** Collection Requirement Unique Identifier. */
                    fun cridNumbers(cridNumbers: String) = cridNumbers(JsonField.of(cridNumbers))

                    /**
                     * Sets [Builder.cridNumbers] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cridNumbers] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun cridNumbers(cridNumbers: JsonField<String>) = apply {
                        this.cridNumbers = cridNumbers
                    }

                    fun criticalTimes(criticalTimes: CriticalTimes) =
                        criticalTimes(JsonField.of(criticalTimes))

                    /**
                     * Sets [Builder.criticalTimes] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.criticalTimes] with a well-typed
                     * [CriticalTimes] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun criticalTimes(criticalTimes: JsonField<CriticalTimes>) = apply {
                        this.criticalTimes = criticalTimes
                    }

                    /** Is this collection requirement an emphasized/critical requirement. */
                    fun emphasized(emphasized: Boolean) = emphasized(JsonField.of(emphasized))

                    /**
                     * Sets [Builder.emphasized] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.emphasized] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun emphasized(emphasized: JsonField<Boolean>) = apply {
                        this.emphasized = emphasized
                    }

                    fun exploitationRequirement(exploitationRequirement: ExploitationRequirement) =
                        exploitationRequirement(JsonField.of(exploitationRequirement))

                    /**
                     * Sets [Builder.exploitationRequirement] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.exploitationRequirement] with a well-typed
                     * [ExploitationRequirement] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun exploitationRequirement(
                        exploitationRequirement: JsonField<ExploitationRequirement>
                    ) = apply { this.exploitationRequirement = exploitationRequirement }

                    /** Encryption hashing algorithm. */
                    fun hash(hash: String) = hash(JsonField.of(hash))

                    /**
                     * Sets [Builder.hash] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.hash] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun hash(hash: JsonField<String>) = apply { this.hash = hash }

                    /** Primary type of intelligence to be collected for this requirement. */
                    fun intelDiscipline(intelDiscipline: String) =
                        intelDiscipline(JsonField.of(intelDiscipline))

                    /**
                     * Sets [Builder.intelDiscipline] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.intelDiscipline] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun intelDiscipline(intelDiscipline: JsonField<String>) = apply {
                        this.intelDiscipline = intelDiscipline
                    }

                    /** Is this collection request for the Prism system?. */
                    fun isPrismCr(isPrismCr: Boolean) = isPrismCr(JsonField.of(isPrismCr))

                    /**
                     * Sets [Builder.isPrismCr] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isPrismCr] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun isPrismCr(isPrismCr: JsonField<Boolean>) = apply {
                        this.isPrismCr = isPrismCr
                    }

                    /** Human readable name for this operation. */
                    fun operation(operation: String) = operation(JsonField.of(operation))

                    /**
                     * Sets [Builder.operation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operation] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operation(operation: JsonField<String>) = apply {
                        this.operation = operation
                    }

                    /** 1-n priority for this collection requirement. */
                    fun priority(priority: Double) = priority(JsonField.of(priority))

                    /**
                     * Sets [Builder.priority] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.priority] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                    /** Reconnaissance Survey information the operator needs. */
                    fun reconSurvey(reconSurvey: String) = reconSurvey(JsonField.of(reconSurvey))

                    /**
                     * Sets [Builder.reconSurvey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.reconSurvey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun reconSurvey(reconSurvey: JsonField<String>) = apply {
                        this.reconSurvey = reconSurvey
                    }

                    /** Record id. */
                    fun recordId(recordId: String) = recordId(JsonField.of(recordId))

                    /**
                     * Sets [Builder.recordId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.recordId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun recordId(recordId: JsonField<String>) = apply { this.recordId = recordId }

                    /** Region of the collection requirement. */
                    fun region(region: String) = region(JsonField.of(region))

                    /**
                     * Sets [Builder.region] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.region] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun region(region: JsonField<String>) = apply { this.region = region }

                    /**
                     * Sub category of primary intelligence to be collected for this requirement.
                     */
                    fun secondary(secondary: Boolean) = secondary(JsonField.of(secondary))

                    /**
                     * Sets [Builder.secondary] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.secondary] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun secondary(secondary: JsonField<Boolean>) = apply {
                        this.secondary = secondary
                    }

                    /**
                     * Free text field for the user to specify special instructions needed for this
                     * collection.
                     */
                    fun specialComGuidance(specialComGuidance: String) =
                        specialComGuidance(JsonField.of(specialComGuidance))

                    /**
                     * Sets [Builder.specialComGuidance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.specialComGuidance] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun specialComGuidance(specialComGuidance: JsonField<String>) = apply {
                        this.specialComGuidance = specialComGuidance
                    }

                    /**
                     * Start time for this requirement, should be within the mission time window.
                     */
                    fun start(start: OffsetDateTime) = start(JsonField.of(start))

                    /**
                     * Sets [Builder.start] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.start] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun start(start: JsonField<OffsetDateTime>) = apply { this.start = start }

                    /** Stop time for this requirement, should be within the mission time window. */
                    fun stop(stop: OffsetDateTime) = stop(JsonField.of(stop))

                    /**
                     * Sets [Builder.stop] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.stop] with a well-typed [OffsetDateTime]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun stop(stop: JsonField<OffsetDateTime>) = apply { this.stop = stop }

                    /** Subregion of the collection requirement. */
                    fun subregion(subregion: String) = subregion(JsonField.of(subregion))

                    /**
                     * Sets [Builder.subregion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subregion] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subregion(subregion: JsonField<String>) = apply {
                        this.subregion = subregion
                    }

                    /**
                     * The name of the military unit that this assigned collection requirement will
                     * support.
                     */
                    fun supportedUnit(supportedUnit: String) =
                        supportedUnit(JsonField.of(supportedUnit))

                    /**
                     * Sets [Builder.supportedUnit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.supportedUnit] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun supportedUnit(supportedUnit: JsonField<String>) = apply {
                        this.supportedUnit = supportedUnit
                    }

                    /** Array of POI Id's for the targets being tasked. */
                    fun targetList(targetList: List<String>) = targetList(JsonField.of(targetList))

                    /**
                     * Sets [Builder.targetList] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.targetList] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun targetList(targetList: JsonField<List<String>>) = apply {
                        this.targetList = targetList.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [Builder.targetList].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTargetList(targetList: String) = apply {
                        this.targetList =
                            (this.targetList ?: JsonField.of(mutableListOf())).also {
                                checkKnown("targetList", it).add(targetList)
                            }
                    }

                    /** Type collection this requirement applies to. */
                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [TaskingCollectionRequirement].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): TaskingCollectionRequirement =
                        TaskingCollectionRequirement(
                            id,
                            country,
                            cridNumbers,
                            criticalTimes,
                            emphasized,
                            exploitationRequirement,
                            hash,
                            intelDiscipline,
                            isPrismCr,
                            operation,
                            priority,
                            reconSurvey,
                            recordId,
                            region,
                            secondary,
                            specialComGuidance,
                            start,
                            stop,
                            subregion,
                            supportedUnit,
                            (targetList ?: JsonMissing.of()).map { it.toImmutable() },
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TaskingCollectionRequirement = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    country()
                    cridNumbers()
                    criticalTimes().ifPresent { it.validate() }
                    emphasized()
                    exploitationRequirement().ifPresent { it.validate() }
                    hash()
                    intelDiscipline()
                    isPrismCr()
                    operation()
                    priority()
                    reconSurvey()
                    recordId()
                    region()
                    secondary()
                    specialComGuidance()
                    start()
                    stop()
                    subregion()
                    supportedUnit()
                    targetList()
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (country.asKnown().isPresent) 1 else 0) +
                        (if (cridNumbers.asKnown().isPresent) 1 else 0) +
                        (criticalTimes.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (emphasized.asKnown().isPresent) 1 else 0) +
                        (exploitationRequirement.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (hash.asKnown().isPresent) 1 else 0) +
                        (if (intelDiscipline.asKnown().isPresent) 1 else 0) +
                        (if (isPrismCr.asKnown().isPresent) 1 else 0) +
                        (if (operation.asKnown().isPresent) 1 else 0) +
                        (if (priority.asKnown().isPresent) 1 else 0) +
                        (if (reconSurvey.asKnown().isPresent) 1 else 0) +
                        (if (recordId.asKnown().isPresent) 1 else 0) +
                        (if (region.asKnown().isPresent) 1 else 0) +
                        (if (secondary.asKnown().isPresent) 1 else 0) +
                        (if (specialComGuidance.asKnown().isPresent) 1 else 0) +
                        (if (start.asKnown().isPresent) 1 else 0) +
                        (if (stop.asKnown().isPresent) 1 else 0) +
                        (if (subregion.asKnown().isPresent) 1 else 0) +
                        (if (supportedUnit.asKnown().isPresent) 1 else 0) +
                        (targetList.asKnown().getOrNull()?.size ?: 0) +
                        (if (type.asKnown().isPresent) 1 else 0)

                class CriticalTimes
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val earliestImagingTime: JsonField<OffsetDateTime>,
                    private val latestImagingTime: JsonField<OffsetDateTime>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("earliestImagingTime")
                        @ExcludeMissing
                        earliestImagingTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("latestImagingTime")
                        @ExcludeMissing
                        latestImagingTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                    ) : this(earliestImagingTime, latestImagingTime, mutableMapOf())

                    /**
                     * Critical start time to collect an image for this requirement.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun earliestImagingTime(): OffsetDateTime =
                        earliestImagingTime.getRequired("earliestImagingTime")

                    /**
                     * Critical stop time to collect an image for this requirement.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun latestImagingTime(): OffsetDateTime =
                        latestImagingTime.getRequired("latestImagingTime")

                    /**
                     * Returns the raw JSON value of [earliestImagingTime].
                     *
                     * Unlike [earliestImagingTime], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("earliestImagingTime")
                    @ExcludeMissing
                    fun _earliestImagingTime(): JsonField<OffsetDateTime> = earliestImagingTime

                    /**
                     * Returns the raw JSON value of [latestImagingTime].
                     *
                     * Unlike [latestImagingTime], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("latestImagingTime")
                    @ExcludeMissing
                    fun _latestImagingTime(): JsonField<OffsetDateTime> = latestImagingTime

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
                         * [CriticalTimes].
                         *
                         * The following fields are required:
                         * ```java
                         * .earliestImagingTime()
                         * .latestImagingTime()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CriticalTimes]. */
                    class Builder internal constructor() {

                        private var earliestImagingTime: JsonField<OffsetDateTime>? = null
                        private var latestImagingTime: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(criticalTimes: CriticalTimes) = apply {
                            earliestImagingTime = criticalTimes.earliestImagingTime
                            latestImagingTime = criticalTimes.latestImagingTime
                            additionalProperties = criticalTimes.additionalProperties.toMutableMap()
                        }

                        /** Critical start time to collect an image for this requirement. */
                        fun earliestImagingTime(earliestImagingTime: OffsetDateTime) =
                            earliestImagingTime(JsonField.of(earliestImagingTime))

                        /**
                         * Sets [Builder.earliestImagingTime] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.earliestImagingTime] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun earliestImagingTime(earliestImagingTime: JsonField<OffsetDateTime>) =
                            apply {
                                this.earliestImagingTime = earliestImagingTime
                            }

                        /** Critical stop time to collect an image for this requirement. */
                        fun latestImagingTime(latestImagingTime: OffsetDateTime) =
                            latestImagingTime(JsonField.of(latestImagingTime))

                        /**
                         * Sets [Builder.latestImagingTime] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.latestImagingTime] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun latestImagingTime(latestImagingTime: JsonField<OffsetDateTime>) =
                            apply {
                                this.latestImagingTime = latestImagingTime
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [CriticalTimes].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .earliestImagingTime()
                         * .latestImagingTime()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CriticalTimes =
                            CriticalTimes(
                                checkRequired("earliestImagingTime", earliestImagingTime),
                                checkRequired("latestImagingTime", latestImagingTime),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CriticalTimes = apply {
                        if (validated) {
                            return@apply
                        }

                        earliestImagingTime()
                        latestImagingTime()
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
                        (if (earliestImagingTime.asKnown().isPresent) 1 else 0) +
                            (if (latestImagingTime.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CriticalTimes &&
                            earliestImagingTime == other.earliestImagingTime &&
                            latestImagingTime == other.latestImagingTime &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(earliestImagingTime, latestImagingTime, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CriticalTimes{earliestImagingTime=$earliestImagingTime, latestImagingTime=$latestImagingTime, additionalProperties=$additionalProperties}"
                }

                class ExploitationRequirement
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val id: JsonField<String>,
                    private val amplification: JsonField<String>,
                    private val dissemination: JsonField<String>,
                    private val eei: JsonField<String>,
                    private val poc: JsonField<Poc>,
                    private val reportingCriteria: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("id")
                        @ExcludeMissing
                        id: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("amplification")
                        @ExcludeMissing
                        amplification: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("dissemination")
                        @ExcludeMissing
                        dissemination: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("eei")
                        @ExcludeMissing
                        eei: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("poc") @ExcludeMissing poc: JsonField<Poc> = JsonMissing.of(),
                        @JsonProperty("reportingCriteria")
                        @ExcludeMissing
                        reportingCriteria: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        id,
                        amplification,
                        dissemination,
                        eei,
                        poc,
                        reportingCriteria,
                        mutableMapOf(),
                    )

                    /**
                     * Exploitation requirement id.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun id(): Optional<String> = id.getOptional("id")

                    /**
                     * Amplifying data for the exploitation requirement.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun amplification(): Optional<String> =
                        amplification.getOptional("amplification")

                    /**
                     * List of e-mails to disseminate collection verification information.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun dissemination(): Optional<String> =
                        dissemination.getOptional("dissemination")

                    /**
                     * Essential Elements of Information.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun eei(): Optional<String> = eei.getOptional("eei")

                    /**
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun poc(): Optional<Poc> = poc.getOptional("poc")

                    /**
                     * The reporting criteria of the collection requirement.
                     *
                     * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun reportingCriteria(): Optional<String> =
                        reportingCriteria.getOptional("reportingCriteria")

                    /**
                     * Returns the raw JSON value of [id].
                     *
                     * Unlike [id], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    /**
                     * Returns the raw JSON value of [amplification].
                     *
                     * Unlike [amplification], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("amplification")
                    @ExcludeMissing
                    fun _amplification(): JsonField<String> = amplification

                    /**
                     * Returns the raw JSON value of [dissemination].
                     *
                     * Unlike [dissemination], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("dissemination")
                    @ExcludeMissing
                    fun _dissemination(): JsonField<String> = dissemination

                    /**
                     * Returns the raw JSON value of [eei].
                     *
                     * Unlike [eei], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("eei") @ExcludeMissing fun _eei(): JsonField<String> = eei

                    /**
                     * Returns the raw JSON value of [poc].
                     *
                     * Unlike [poc], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("poc") @ExcludeMissing fun _poc(): JsonField<Poc> = poc

                    /**
                     * Returns the raw JSON value of [reportingCriteria].
                     *
                     * Unlike [reportingCriteria], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("reportingCriteria")
                    @ExcludeMissing
                    fun _reportingCriteria(): JsonField<String> = reportingCriteria

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
                         * [ExploitationRequirement].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ExploitationRequirement]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String> = JsonMissing.of()
                        private var amplification: JsonField<String> = JsonMissing.of()
                        private var dissemination: JsonField<String> = JsonMissing.of()
                        private var eei: JsonField<String> = JsonMissing.of()
                        private var poc: JsonField<Poc> = JsonMissing.of()
                        private var reportingCriteria: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(exploitationRequirement: ExploitationRequirement) =
                            apply {
                                id = exploitationRequirement.id
                                amplification = exploitationRequirement.amplification
                                dissemination = exploitationRequirement.dissemination
                                eei = exploitationRequirement.eei
                                poc = exploitationRequirement.poc
                                reportingCriteria = exploitationRequirement.reportingCriteria
                                additionalProperties =
                                    exploitationRequirement.additionalProperties.toMutableMap()
                            }

                        /** Exploitation requirement id. */
                        fun id(id: String) = id(JsonField.of(id))

                        /**
                         * Sets [Builder.id] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.id] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun id(id: JsonField<String>) = apply { this.id = id }

                        /** Amplifying data for the exploitation requirement. */
                        fun amplification(amplification: String) =
                            amplification(JsonField.of(amplification))

                        /**
                         * Sets [Builder.amplification] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.amplification] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun amplification(amplification: JsonField<String>) = apply {
                            this.amplification = amplification
                        }

                        /** List of e-mails to disseminate collection verification information. */
                        fun dissemination(dissemination: String) =
                            dissemination(JsonField.of(dissemination))

                        /**
                         * Sets [Builder.dissemination] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.dissemination] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun dissemination(dissemination: JsonField<String>) = apply {
                            this.dissemination = dissemination
                        }

                        /** Essential Elements of Information. */
                        fun eei(eei: String) = eei(JsonField.of(eei))

                        /**
                         * Sets [Builder.eei] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.eei] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun eei(eei: JsonField<String>) = apply { this.eei = eei }

                        fun poc(poc: Poc) = poc(JsonField.of(poc))

                        /**
                         * Sets [Builder.poc] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.poc] with a well-typed [Poc] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun poc(poc: JsonField<Poc>) = apply { this.poc = poc }

                        /** The reporting criteria of the collection requirement. */
                        fun reportingCriteria(reportingCriteria: String) =
                            reportingCriteria(JsonField.of(reportingCriteria))

                        /**
                         * Sets [Builder.reportingCriteria] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.reportingCriteria] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun reportingCriteria(reportingCriteria: JsonField<String>) = apply {
                            this.reportingCriteria = reportingCriteria
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [ExploitationRequirement].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): ExploitationRequirement =
                            ExploitationRequirement(
                                id,
                                amplification,
                                dissemination,
                                eei,
                                poc,
                                reportingCriteria,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): ExploitationRequirement = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        amplification()
                        dissemination()
                        eei()
                        poc().ifPresent { it.validate() }
                        reportingCriteria()
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
                        (if (id.asKnown().isPresent) 1 else 0) +
                            (if (amplification.asKnown().isPresent) 1 else 0) +
                            (if (dissemination.asKnown().isPresent) 1 else 0) +
                            (if (eei.asKnown().isPresent) 1 else 0) +
                            (poc.asKnown().getOrNull()?.validity() ?: 0) +
                            (if (reportingCriteria.asKnown().isPresent) 1 else 0)

                    class Poc
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val id: JsonField<String>,
                        private val callsign: JsonField<String>,
                        private val chatName: JsonField<String>,
                        private val chatSystem: JsonField<String>,
                        private val email: JsonField<String>,
                        private val name: JsonField<String>,
                        private val notes: JsonField<String>,
                        private val phone: JsonField<String>,
                        private val radioFrequency: JsonField<Double>,
                        private val unit: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("id")
                            @ExcludeMissing
                            id: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("callsign")
                            @ExcludeMissing
                            callsign: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("chatName")
                            @ExcludeMissing
                            chatName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("chatSystem")
                            @ExcludeMissing
                            chatSystem: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("email")
                            @ExcludeMissing
                            email: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("notes")
                            @ExcludeMissing
                            notes: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("phone")
                            @ExcludeMissing
                            phone: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("radioFrequency")
                            @ExcludeMissing
                            radioFrequency: JsonField<Double> = JsonMissing.of(),
                            @JsonProperty("unit")
                            @ExcludeMissing
                            unit: JsonField<String> = JsonMissing.of(),
                        ) : this(
                            id,
                            callsign,
                            chatName,
                            chatSystem,
                            email,
                            name,
                            notes,
                            phone,
                            radioFrequency,
                            unit,
                            mutableMapOf(),
                        )

                        /**
                         * Unique identifier of the collection requirement POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun id(): Optional<String> = id.getOptional("id")

                        /**
                         * Callsign of the POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun callsign(): Optional<String> = callsign.getOptional("callsign")

                        /**
                         * Chat name of the POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun chatName(): Optional<String> = chatName.getOptional("chatName")

                        /**
                         * Chat system the POC is accessing.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun chatSystem(): Optional<String> = chatSystem.getOptional("chatSystem")

                        /**
                         * Email address of the POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun email(): Optional<String> = email.getOptional("email")

                        /**
                         * Name of the POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun name(): Optional<String> = name.getOptional("name")

                        /**
                         * Amplifying notes about the POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun notes(): Optional<String> = notes.getOptional("notes")

                        /**
                         * Phone number of the POC.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun phone(): Optional<String> = phone.getOptional("phone")

                        /**
                         * Radio Frequency the POC is on.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun radioFrequency(): Optional<Double> =
                            radioFrequency.getOptional("radioFrequency")

                        /**
                         * Unit the POC belongs to.
                         *
                         * @throws UnifieddatalibraryInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun unit(): Optional<String> = unit.getOptional("unit")

                        /**
                         * Returns the raw JSON value of [id].
                         *
                         * Unlike [id], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                        /**
                         * Returns the raw JSON value of [callsign].
                         *
                         * Unlike [callsign], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("callsign")
                        @ExcludeMissing
                        fun _callsign(): JsonField<String> = callsign

                        /**
                         * Returns the raw JSON value of [chatName].
                         *
                         * Unlike [chatName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("chatName")
                        @ExcludeMissing
                        fun _chatName(): JsonField<String> = chatName

                        /**
                         * Returns the raw JSON value of [chatSystem].
                         *
                         * Unlike [chatSystem], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("chatSystem")
                        @ExcludeMissing
                        fun _chatSystem(): JsonField<String> = chatSystem

                        /**
                         * Returns the raw JSON value of [email].
                         *
                         * Unlike [email], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("email")
                        @ExcludeMissing
                        fun _email(): JsonField<String> = email

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                        /**
                         * Returns the raw JSON value of [notes].
                         *
                         * Unlike [notes], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("notes")
                        @ExcludeMissing
                        fun _notes(): JsonField<String> = notes

                        /**
                         * Returns the raw JSON value of [phone].
                         *
                         * Unlike [phone], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("phone")
                        @ExcludeMissing
                        fun _phone(): JsonField<String> = phone

                        /**
                         * Returns the raw JSON value of [radioFrequency].
                         *
                         * Unlike [radioFrequency], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("radioFrequency")
                        @ExcludeMissing
                        fun _radioFrequency(): JsonField<Double> = radioFrequency

                        /**
                         * Returns the raw JSON value of [unit].
                         *
                         * Unlike [unit], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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

                            /** Returns a mutable builder for constructing an instance of [Poc]. */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Poc]. */
                        class Builder internal constructor() {

                            private var id: JsonField<String> = JsonMissing.of()
                            private var callsign: JsonField<String> = JsonMissing.of()
                            private var chatName: JsonField<String> = JsonMissing.of()
                            private var chatSystem: JsonField<String> = JsonMissing.of()
                            private var email: JsonField<String> = JsonMissing.of()
                            private var name: JsonField<String> = JsonMissing.of()
                            private var notes: JsonField<String> = JsonMissing.of()
                            private var phone: JsonField<String> = JsonMissing.of()
                            private var radioFrequency: JsonField<Double> = JsonMissing.of()
                            private var unit: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(poc: Poc) = apply {
                                id = poc.id
                                callsign = poc.callsign
                                chatName = poc.chatName
                                chatSystem = poc.chatSystem
                                email = poc.email
                                name = poc.name
                                notes = poc.notes
                                phone = poc.phone
                                radioFrequency = poc.radioFrequency
                                unit = poc.unit
                                additionalProperties = poc.additionalProperties.toMutableMap()
                            }

                            /** Unique identifier of the collection requirement POC. */
                            fun id(id: String) = id(JsonField.of(id))

                            /**
                             * Sets [Builder.id] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.id] with a well-typed [String] value
                             * instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun id(id: JsonField<String>) = apply { this.id = id }

                            /** Callsign of the POC. */
                            fun callsign(callsign: String) = callsign(JsonField.of(callsign))

                            /**
                             * Sets [Builder.callsign] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.callsign] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun callsign(callsign: JsonField<String>) = apply {
                                this.callsign = callsign
                            }

                            /** Chat name of the POC. */
                            fun chatName(chatName: String) = chatName(JsonField.of(chatName))

                            /**
                             * Sets [Builder.chatName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.chatName] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun chatName(chatName: JsonField<String>) = apply {
                                this.chatName = chatName
                            }

                            /** Chat system the POC is accessing. */
                            fun chatSystem(chatSystem: String) =
                                chatSystem(JsonField.of(chatSystem))

                            /**
                             * Sets [Builder.chatSystem] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.chatSystem] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun chatSystem(chatSystem: JsonField<String>) = apply {
                                this.chatSystem = chatSystem
                            }

                            /** Email address of the POC. */
                            fun email(email: String) = email(JsonField.of(email))

                            /**
                             * Sets [Builder.email] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.email] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun email(email: JsonField<String>) = apply { this.email = email }

                            /** Name of the POC. */
                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            /** Amplifying notes about the POC. */
                            fun notes(notes: String) = notes(JsonField.of(notes))

                            /**
                             * Sets [Builder.notes] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.notes] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun notes(notes: JsonField<String>) = apply { this.notes = notes }

                            /** Phone number of the POC. */
                            fun phone(phone: String) = phone(JsonField.of(phone))

                            /**
                             * Sets [Builder.phone] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.phone] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

                            /** Radio Frequency the POC is on. */
                            fun radioFrequency(radioFrequency: Double) =
                                radioFrequency(JsonField.of(radioFrequency))

                            /**
                             * Sets [Builder.radioFrequency] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.radioFrequency] with a well-typed
                             * [Double] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun radioFrequency(radioFrequency: JsonField<Double>) = apply {
                                this.radioFrequency = radioFrequency
                            }

                            /** Unit the POC belongs to. */
                            fun unit(unit: String) = unit(JsonField.of(unit))

                            /**
                             * Sets [Builder.unit] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.unit] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Poc].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             */
                            fun build(): Poc =
                                Poc(
                                    id,
                                    callsign,
                                    chatName,
                                    chatSystem,
                                    email,
                                    name,
                                    notes,
                                    phone,
                                    radioFrequency,
                                    unit,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Poc = apply {
                            if (validated) {
                                return@apply
                            }

                            id()
                            callsign()
                            chatName()
                            chatSystem()
                            email()
                            name()
                            notes()
                            phone()
                            radioFrequency()
                            unit()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (id.asKnown().isPresent) 1 else 0) +
                                (if (callsign.asKnown().isPresent) 1 else 0) +
                                (if (chatName.asKnown().isPresent) 1 else 0) +
                                (if (chatSystem.asKnown().isPresent) 1 else 0) +
                                (if (email.asKnown().isPresent) 1 else 0) +
                                (if (name.asKnown().isPresent) 1 else 0) +
                                (if (notes.asKnown().isPresent) 1 else 0) +
                                (if (phone.asKnown().isPresent) 1 else 0) +
                                (if (radioFrequency.asKnown().isPresent) 1 else 0) +
                                (if (unit.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Poc &&
                                id == other.id &&
                                callsign == other.callsign &&
                                chatName == other.chatName &&
                                chatSystem == other.chatSystem &&
                                email == other.email &&
                                name == other.name &&
                                notes == other.notes &&
                                phone == other.phone &&
                                radioFrequency == other.radioFrequency &&
                                unit == other.unit &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                id,
                                callsign,
                                chatName,
                                chatSystem,
                                email,
                                name,
                                notes,
                                phone,
                                radioFrequency,
                                unit,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Poc{id=$id, callsign=$callsign, chatName=$chatName, chatSystem=$chatSystem, email=$email, name=$name, notes=$notes, phone=$phone, radioFrequency=$radioFrequency, unit=$unit, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is ExploitationRequirement &&
                            id == other.id &&
                            amplification == other.amplification &&
                            dissemination == other.dissemination &&
                            eei == other.eei &&
                            poc == other.poc &&
                            reportingCriteria == other.reportingCriteria &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            id,
                            amplification,
                            dissemination,
                            eei,
                            poc,
                            reportingCriteria,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ExploitationRequirement{id=$id, amplification=$amplification, dissemination=$dissemination, eei=$eei, poc=$poc, reportingCriteria=$reportingCriteria, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TaskingCollectionRequirement &&
                        id == other.id &&
                        country == other.country &&
                        cridNumbers == other.cridNumbers &&
                        criticalTimes == other.criticalTimes &&
                        emphasized == other.emphasized &&
                        exploitationRequirement == other.exploitationRequirement &&
                        hash == other.hash &&
                        intelDiscipline == other.intelDiscipline &&
                        isPrismCr == other.isPrismCr &&
                        operation == other.operation &&
                        priority == other.priority &&
                        reconSurvey == other.reconSurvey &&
                        recordId == other.recordId &&
                        region == other.region &&
                        secondary == other.secondary &&
                        specialComGuidance == other.specialComGuidance &&
                        start == other.start &&
                        stop == other.stop &&
                        subregion == other.subregion &&
                        supportedUnit == other.supportedUnit &&
                        targetList == other.targetList &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        country,
                        cridNumbers,
                        criticalTimes,
                        emphasized,
                        exploitationRequirement,
                        hash,
                        intelDiscipline,
                        isPrismCr,
                        operation,
                        priority,
                        reconSurvey,
                        recordId,
                        region,
                        secondary,
                        specialComGuidance,
                        start,
                        stop,
                        subregion,
                        supportedUnit,
                        targetList,
                        type,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TaskingCollectionRequirement{id=$id, country=$country, cridNumbers=$cridNumbers, criticalTimes=$criticalTimes, emphasized=$emphasized, exploitationRequirement=$exploitationRequirement, hash=$hash, intelDiscipline=$intelDiscipline, isPrismCr=$isPrismCr, operation=$operation, priority=$priority, reconSurvey=$reconSurvey, recordId=$recordId, region=$region, secondary=$secondary, specialComGuidance=$specialComGuidance, start=$start, stop=$stop, subregion=$subregion, supportedUnit=$supportedUnit, targetList=$targetList, type=$type, additionalProperties=$additionalProperties}"
            }

            /** Type of tasking. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val DELIBERATE = of("Deliberate")

                    @JvmField val DYNAMIC = of("Dynamic")

                    @JvmField val TRAINING = of("Training")

                    @JvmField val TRANSIT = of("Transit")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    DELIBERATE,
                    DYNAMIC,
                    TRAINING,
                    TRANSIT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DELIBERATE,
                    DYNAMIC,
                    TRAINING,
                    TRANSIT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        DELIBERATE -> Value.DELIBERATE
                        DYNAMIC -> Value.DYNAMIC
                        TRAINING -> Value.TRAINING
                        TRANSIT -> Value.TRANSIT
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
                        DELIBERATE -> Known.DELIBERATE
                        DYNAMIC -> Known.DYNAMIC
                        TRAINING -> Known.TRAINING
                        TRANSIT -> Known.TRANSIT
                        else -> throw UnifieddatalibraryInvalidDataException("Unknown Type: $value")
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

                fun validate(): Type = apply {
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

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tasking &&
                    id == other.id &&
                    collectionPeriods == other.collectionPeriods &&
                    collectionType == other.collectionType &&
                    eightLine == other.eightLine &&
                    specialComGuidance == other.specialComGuidance &&
                    sroTrack == other.sroTrack &&
                    taskingAor == other.taskingAor &&
                    taskingCollectionArea == other.taskingCollectionArea &&
                    taskingCollectionRequirements == other.taskingCollectionRequirements &&
                    taskingCountry == other.taskingCountry &&
                    taskingEmphasis == other.taskingEmphasis &&
                    taskingJoa == other.taskingJoa &&
                    taskingOperation == other.taskingOperation &&
                    taskingPrimaryIntelDiscipline == other.taskingPrimaryIntelDiscipline &&
                    taskingPrimarySubCategory == other.taskingPrimarySubCategory &&
                    taskingPriority == other.taskingPriority &&
                    taskingRegion == other.taskingRegion &&
                    taskingRetaskTime == other.taskingRetaskTime &&
                    taskingRole == other.taskingRole &&
                    taskingSecondaryIntelDiscipline == other.taskingSecondaryIntelDiscipline &&
                    taskingSecondarySubCategory == other.taskingSecondarySubCategory &&
                    taskingStartPointLat == other.taskingStartPointLat &&
                    taskingStartPointLong == other.taskingStartPointLong &&
                    taskingSubRegion == other.taskingSubRegion &&
                    taskingSupportedUnit == other.taskingSupportedUnit &&
                    taskingSyncMatrixBin == other.taskingSyncMatrixBin &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    collectionPeriods,
                    collectionType,
                    eightLine,
                    specialComGuidance,
                    sroTrack,
                    taskingAor,
                    taskingCollectionArea,
                    taskingCollectionRequirements,
                    taskingCountry,
                    taskingEmphasis,
                    taskingJoa,
                    taskingOperation,
                    taskingPrimaryIntelDiscipline,
                    taskingPrimarySubCategory,
                    taskingPriority,
                    taskingRegion,
                    taskingRetaskTime,
                    taskingRole,
                    taskingSecondaryIntelDiscipline,
                    taskingSecondarySubCategory,
                    taskingStartPointLat,
                    taskingStartPointLong,
                    taskingSubRegion,
                    taskingSupportedUnit,
                    taskingSyncMatrixBin,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tasking{id=$id, collectionPeriods=$collectionPeriods, collectionType=$collectionType, eightLine=$eightLine, specialComGuidance=$specialComGuidance, sroTrack=$sroTrack, taskingAor=$taskingAor, taskingCollectionArea=$taskingCollectionArea, taskingCollectionRequirements=$taskingCollectionRequirements, taskingCountry=$taskingCountry, taskingEmphasis=$taskingEmphasis, taskingJoa=$taskingJoa, taskingOperation=$taskingOperation, taskingPrimaryIntelDiscipline=$taskingPrimaryIntelDiscipline, taskingPrimarySubCategory=$taskingPrimarySubCategory, taskingPriority=$taskingPriority, taskingRegion=$taskingRegion, taskingRetaskTime=$taskingRetaskTime, taskingRole=$taskingRole, taskingSecondaryIntelDiscipline=$taskingSecondaryIntelDiscipline, taskingSecondarySubCategory=$taskingSecondarySubCategory, taskingStartPointLat=$taskingStartPointLat, taskingStartPointLong=$taskingStartPointLong, taskingSubRegion=$taskingSubRegion, taskingSupportedUnit=$taskingSupportedUnit, taskingSyncMatrixBin=$taskingSyncMatrixBin, type=$type, additionalProperties=$additionalProperties}"
        }

        class Transit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val base: JsonField<String>,
            private val duration: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("base") @ExcludeMissing base: JsonField<String> = JsonMissing.of(),
                @JsonProperty("duration")
                @ExcludeMissing
                duration: JsonField<Double> = JsonMissing.of(),
            ) : this(id, base, duration, mutableMapOf())

            /**
             * Transit Unique Identifier.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Military Base to transmit the dissemination of this data.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun base(): Optional<String> = base.getOptional("base")

            /**
             * Length of mission in milliseconds.
             *
             * @throws UnifieddatalibraryInvalidDataException if the JSON field has an unexpected
             *   type (e.g. if the server responded with an unexpected value).
             */
            fun duration(): Optional<Double> = duration.getOptional("duration")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [base].
             *
             * Unlike [base], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("base") @ExcludeMissing fun _base(): JsonField<String> = base

            /**
             * Returns the raw JSON value of [duration].
             *
             * Unlike [duration], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("duration") @ExcludeMissing fun _duration(): JsonField<Double> = duration

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

                /** Returns a mutable builder for constructing an instance of [Transit]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Transit]. */
            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var base: JsonField<String> = JsonMissing.of()
                private var duration: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transit: Transit) = apply {
                    id = transit.id
                    base = transit.base
                    duration = transit.duration
                    additionalProperties = transit.additionalProperties.toMutableMap()
                }

                /** Transit Unique Identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Military Base to transmit the dissemination of this data. */
                fun base(base: String) = base(JsonField.of(base))

                /**
                 * Sets [Builder.base] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.base] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun base(base: JsonField<String>) = apply { this.base = base }

                /** Length of mission in milliseconds. */
                fun duration(duration: Double) = duration(JsonField.of(duration))

                /**
                 * Sets [Builder.duration] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.duration] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun duration(duration: JsonField<Double>) = apply { this.duration = duration }

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
                 * Returns an immutable instance of [Transit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Transit =
                    Transit(id, base, duration, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Transit = apply {
                if (validated) {
                    return@apply
                }

                id()
                base()
                duration()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (base.asKnown().isPresent) 1 else 0) +
                    (if (duration.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Transit &&
                    id == other.id &&
                    base == other.base &&
                    duration == other.duration &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, base, duration, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Transit{id=$id, base=$base, duration=$duration, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                classificationMarking == other.classificationMarking &&
                dataMode == other.dataMode &&
                source == other.source &&
                id == other.id &&
                collectionRequirements == other.collectionRequirements &&
                createdAt == other.createdAt &&
                createdBy == other.createdBy &&
                idexVersion == other.idexVersion &&
                missionAor == other.missionAor &&
                missionCollectionArea == other.missionCollectionArea &&
                missionCountry == other.missionCountry &&
                missionEmphasis == other.missionEmphasis &&
                missionId == other.missionId &&
                missionJoa == other.missionJoa &&
                missionOperation == other.missionOperation &&
                missionPrimaryIntelDiscipline == other.missionPrimaryIntelDiscipline &&
                missionPrimarySubCategory == other.missionPrimarySubCategory &&
                missionPriority == other.missionPriority &&
                missionRegion == other.missionRegion &&
                missionRole == other.missionRole &&
                missionSecondaryIntelDiscipline == other.missionSecondaryIntelDiscipline &&
                missionSecondarySubCategory == other.missionSecondarySubCategory &&
                missionStartPointLat == other.missionStartPointLat &&
                missionStartPointLong == other.missionStartPointLong &&
                missionSubRegion == other.missionSubRegion &&
                missionSupportedUnit == other.missionSupportedUnit &&
                missionSyncMatrixBin == other.missionSyncMatrixBin &&
                name == other.name &&
                origin == other.origin &&
                origNetwork == other.origNetwork &&
                taskings == other.taskings &&
                transit == other.transit &&
                updatedAt == other.updatedAt &&
                updatedBy == other.updatedBy
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                classificationMarking,
                dataMode,
                source,
                id,
                collectionRequirements,
                createdAt,
                createdBy,
                idexVersion,
                missionAor,
                missionCollectionArea,
                missionCountry,
                missionEmphasis,
                missionId,
                missionJoa,
                missionOperation,
                missionPrimaryIntelDiscipline,
                missionPrimarySubCategory,
                missionPriority,
                missionRegion,
                missionRole,
                missionSecondaryIntelDiscipline,
                missionSecondarySubCategory,
                missionStartPointLat,
                missionStartPointLong,
                missionSubRegion,
                missionSupportedUnit,
                missionSyncMatrixBin,
                name,
                origin,
                origNetwork,
                taskings,
                transit,
                updatedAt,
                updatedBy,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{classificationMarking=$classificationMarking, dataMode=$dataMode, source=$source, id=$id, collectionRequirements=$collectionRequirements, createdAt=$createdAt, createdBy=$createdBy, idexVersion=$idexVersion, missionAor=$missionAor, missionCollectionArea=$missionCollectionArea, missionCountry=$missionCountry, missionEmphasis=$missionEmphasis, missionId=$missionId, missionJoa=$missionJoa, missionOperation=$missionOperation, missionPrimaryIntelDiscipline=$missionPrimaryIntelDiscipline, missionPrimarySubCategory=$missionPrimarySubCategory, missionPriority=$missionPriority, missionRegion=$missionRegion, missionRole=$missionRole, missionSecondaryIntelDiscipline=$missionSecondaryIntelDiscipline, missionSecondarySubCategory=$missionSecondarySubCategory, missionStartPointLat=$missionStartPointLat, missionStartPointLong=$missionStartPointLong, missionSubRegion=$missionSubRegion, missionSupportedUnit=$missionSupportedUnit, missionSyncMatrixBin=$missionSyncMatrixBin, name=$name, origin=$origin, origNetwork=$origNetwork, taskings=$taskings, transit=$transit, updatedAt=$updatedAt, updatedBy=$updatedBy}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IsrCollectionUnvalidatedPublishParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "IsrCollectionUnvalidatedPublishParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

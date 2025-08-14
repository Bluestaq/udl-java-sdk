// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelRecoveryFullL
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCountParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateBulkParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryFileCreateParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryGetParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListPage
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryListParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpParams
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryQueryhelpResponse
import com.unifieddatalibrary.api.models.personnelrecovery.PersonnelrecoveryTupleParams
import com.unifieddatalibrary.api.services.blocking.personnelrecovery.HistoryService
import java.util.function.Consumer

interface PersonnelrecoveryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonnelrecoveryService

    fun history(): HistoryService

    /**
     * Service operation to take a single Personnel Recovery object as a POST body and ingest into
     * the database. Requires a specific role, please contact the UDL team to gain access.
     */
    fun create(params: PersonnelrecoveryCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PersonnelrecoveryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to dynamically query data by a variety of query parameters not specified in
     * this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for
     * more details on valid/required query parameter information.
     */
    fun list(params: PersonnelrecoveryListParams): PersonnelrecoveryListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: PersonnelrecoveryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PersonnelrecoveryListPage

    /**
     * Service operation to return the count of records satisfying the specified query parameters.
     * This operation is useful to determine how many records pass a particular query criteria
     * without retrieving large amounts of data. See the queryhelp operation
     * (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter
     * information.
     */
    fun count(params: PersonnelrecoveryCountParams): String = count(params, RequestOptions.none())

    /** @see count */
    fun count(
        params: PersonnelrecoveryCountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /**
     * Service operation intended for initial integration only, to take a list of Personnel Recovery
     * records as a POST body and ingest into the database. Requires specific roles, please contact
     * the UDL team to gain access. This operation is not intended to be used for automated feeds
     * into UDL...data providers should contact the UDL team for instructions on setting up a
     * permanent feed through an alternate mechanism.
     */
    fun createBulk(params: PersonnelrecoveryCreateBulkParams) =
        createBulk(params, RequestOptions.none())

    /** @see createBulk */
    fun createBulk(
        params: PersonnelrecoveryCreateBulkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to take a list of Personnel Recovery records as a POST body and ingest into
     * the database. Requires a specific role, please contact the UDL team to gain access. This
     * operation is intended to be used for automated feeds into UDL.
     */
    fun fileCreate(params: PersonnelrecoveryFileCreateParams) =
        fileCreate(params, RequestOptions.none())

    /** @see fileCreate */
    fun fileCreate(
        params: PersonnelrecoveryFileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Service operation to get a single PersonnelRecovery by its unique ID passed as a path
     * parameter.
     */
    fun get(id: String): PersonnelRecoveryFullL = get(id, PersonnelrecoveryGetParams.none())

    /** @see get */
    fun get(
        id: String,
        params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PersonnelRecoveryFullL = get(params.toBuilder().id(id).build(), requestOptions)

    /** @see get */
    fun get(
        id: String,
        params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none(),
    ): PersonnelRecoveryFullL = get(id, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PersonnelrecoveryGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PersonnelRecoveryFullL

    /** @see get */
    fun get(params: PersonnelrecoveryGetParams): PersonnelRecoveryFullL =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(id: String, requestOptions: RequestOptions): PersonnelRecoveryFullL =
        get(id, PersonnelrecoveryGetParams.none(), requestOptions)

    /**
     * Service operation to provide detailed information on available dynamic query parameters for a
     * particular data type.
     */
    fun queryhelp(): PersonnelrecoveryQueryhelpResponse =
        queryhelp(PersonnelrecoveryQueryhelpParams.none())

    /** @see queryhelp */
    fun queryhelp(
        params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PersonnelrecoveryQueryhelpResponse

    /** @see queryhelp */
    fun queryhelp(
        params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none()
    ): PersonnelrecoveryQueryhelpResponse = queryhelp(params, RequestOptions.none())

    /** @see queryhelp */
    fun queryhelp(requestOptions: RequestOptions): PersonnelrecoveryQueryhelpResponse =
        queryhelp(PersonnelrecoveryQueryhelpParams.none(), requestOptions)

    /**
     * Service operation to dynamically query data and only return specified columns/fields.
     * Requested columns are specified by the 'columns' query parameter and should be a comma
     * separated list of valid fields for the specified data type. classificationMarking is always
     * returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on
     * valid/required query parameter information. An example URI:
     * /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of
     * elsets with an epoch greater than 5 hours ago.
     */
    fun tuple(params: PersonnelrecoveryTupleParams): List<PersonnelRecoveryFullL> =
        tuple(params, RequestOptions.none())

    /** @see tuple */
    fun tuple(
        params: PersonnelrecoveryTupleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PersonnelRecoveryFullL>

    /**
     * A view of [PersonnelrecoveryService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PersonnelrecoveryService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /udl/personnelrecovery`, but is otherwise the same
         * as [PersonnelrecoveryService.create].
         */
        @MustBeClosed
        fun create(params: PersonnelrecoveryCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PersonnelrecoveryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/personnelrecovery`, but is otherwise the same
         * as [PersonnelrecoveryService.list].
         */
        @MustBeClosed
        fun list(params: PersonnelrecoveryListParams): HttpResponseFor<PersonnelrecoveryListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PersonnelrecoveryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PersonnelrecoveryListPage>

        /**
         * Returns a raw HTTP response for `get /udl/personnelrecovery/count`, but is otherwise the
         * same as [PersonnelrecoveryService.count].
         */
        @MustBeClosed
        fun count(params: PersonnelrecoveryCountParams): HttpResponseFor<String> =
            count(params, RequestOptions.none())

        /** @see count */
        @MustBeClosed
        fun count(
            params: PersonnelrecoveryCountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /**
         * Returns a raw HTTP response for `post /udl/personnelrecovery/createBulk`, but is
         * otherwise the same as [PersonnelrecoveryService.createBulk].
         */
        @MustBeClosed
        fun createBulk(params: PersonnelrecoveryCreateBulkParams): HttpResponse =
            createBulk(params, RequestOptions.none())

        /** @see createBulk */
        @MustBeClosed
        fun createBulk(
            params: PersonnelrecoveryCreateBulkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /filedrop/udl-personnelrecovery`, but is otherwise
         * the same as [PersonnelrecoveryService.fileCreate].
         */
        @MustBeClosed
        fun fileCreate(params: PersonnelrecoveryFileCreateParams): HttpResponse =
            fileCreate(params, RequestOptions.none())

        /** @see fileCreate */
        @MustBeClosed
        fun fileCreate(
            params: PersonnelrecoveryFileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /udl/personnelrecovery/{id}`, but is otherwise the
         * same as [PersonnelrecoveryService.get].
         */
        @MustBeClosed
        fun get(id: String): HttpResponseFor<PersonnelRecoveryFullL> =
            get(id, PersonnelrecoveryGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PersonnelRecoveryFullL> =
            get(params.toBuilder().id(id).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            params: PersonnelrecoveryGetParams = PersonnelrecoveryGetParams.none(),
        ): HttpResponseFor<PersonnelRecoveryFullL> = get(id, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PersonnelrecoveryGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PersonnelRecoveryFullL>

        /** @see get */
        @MustBeClosed
        fun get(params: PersonnelrecoveryGetParams): HttpResponseFor<PersonnelRecoveryFullL> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PersonnelRecoveryFullL> =
            get(id, PersonnelrecoveryGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/personnelrecovery/queryhelp`, but is otherwise
         * the same as [PersonnelrecoveryService.queryhelp].
         */
        @MustBeClosed
        fun queryhelp(): HttpResponseFor<PersonnelrecoveryQueryhelpResponse> =
            queryhelp(PersonnelrecoveryQueryhelpParams.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PersonnelrecoveryQueryhelpResponse>

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            params: PersonnelrecoveryQueryhelpParams = PersonnelrecoveryQueryhelpParams.none()
        ): HttpResponseFor<PersonnelrecoveryQueryhelpResponse> =
            queryhelp(params, RequestOptions.none())

        /** @see queryhelp */
        @MustBeClosed
        fun queryhelp(
            requestOptions: RequestOptions
        ): HttpResponseFor<PersonnelrecoveryQueryhelpResponse> =
            queryhelp(PersonnelrecoveryQueryhelpParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /udl/personnelrecovery/tuple`, but is otherwise the
         * same as [PersonnelrecoveryService.tuple].
         */
        @MustBeClosed
        fun tuple(
            params: PersonnelrecoveryTupleParams
        ): HttpResponseFor<List<PersonnelRecoveryFullL>> = tuple(params, RequestOptions.none())

        /** @see tuple */
        @MustBeClosed
        fun tuple(
            params: PersonnelrecoveryTupleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PersonnelRecoveryFullL>>
    }
}

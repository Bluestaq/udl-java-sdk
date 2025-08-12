// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.RequestOptions
import com.unifieddatalibrary.api.core.http.HttpResponse
import com.unifieddatalibrary.api.core.http.HttpResponseFor
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelCountParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelGetFileParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryHelpResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelQueryResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelRetrieveResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleParams
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelTupleResponse
import com.unifieddatalibrary.api.models.globalatmosphericmodel.GlobalAtmosphericModelUnvalidatedPublishParams
import com.unifieddatalibrary.api.services.blocking.GlobalAtmosphericModelService
import com.unifieddatalibrary.api.services.blocking.globalatmosphericmodel.HistoryService
import java.util.function.Consumer

interface GlobalAtmosphericModelService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalAtmosphericModelService

    fun history(): HistoryService

    /** Service operation to get a single GlobalAtmosphericModel record by its unique ID passed as a path parameter. */
    fun retrieve(id: String): GlobalAtmosphericModelRetrieveResponse =
        retrieve(
          id, GlobalAtmosphericModelRetrieveParams.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): GlobalAtmosphericModelRetrieveResponse =
        retrieve(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see retrieve */
    fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none()): GlobalAtmosphericModelRetrieveResponse =
        retrieve(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see retrieve */
    fun retrieve(params: GlobalAtmosphericModelRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): GlobalAtmosphericModelRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: GlobalAtmosphericModelRetrieveParams): GlobalAtmosphericModelRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): GlobalAtmosphericModelRetrieveResponse =
        retrieve(
          id,
          GlobalAtmosphericModelRetrieveParams.none(),
          requestOptions,
        )

    /** Service operation to return the count of records satisfying the specified query parameters. This operation is useful to determine how many records pass a particular query criteria without retrieving large amounts of data. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun count(params: GlobalAtmosphericModelCountParams): String =
        count(
          params, RequestOptions.none()
        )

    /** @see count */
    fun count(params: GlobalAtmosphericModelCountParams, requestOptions: RequestOptions = RequestOptions.none()): String

    /** Service operation to get a single GlobalAtmosphericModel compressed data file by its unique ID passed as a path parameter. The compressed data file is returned as an attachment Content-Disposition. */
    @MustBeClosed
    fun getFile(id: String): HttpResponse =
        getFile(
          id, GlobalAtmosphericModelGetFileParams.none()
        )

    /** @see getFile */
    @MustBeClosed
    fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
        getFile(
          params.toBuilder()
              .id(id)
              .build(), requestOptions
        )

    /** @see getFile */
    @MustBeClosed
    fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none()): HttpResponse =
        getFile(
          id,
          params,
          RequestOptions.none(),
        )

    /** @see getFile */
    @MustBeClosed
    fun getFile(params: GlobalAtmosphericModelGetFileParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

    /** @see getFile */
    @MustBeClosed
    fun getFile(params: GlobalAtmosphericModelGetFileParams): HttpResponse =
        getFile(
          params, RequestOptions.none()
        )

    /** @see getFile */
    @MustBeClosed
    fun getFile(id: String, requestOptions: RequestOptions): HttpResponse =
        getFile(
          id,
          GlobalAtmosphericModelGetFileParams.none(),
          requestOptions,
        )

    /** Service operation to dynamically query data by a variety of query parameters not specified in this API documentation. See the queryhelp operation (/udl/&lt;datatype&gt;/queryhelp) for more details on valid/required query parameter information. */
    fun query(params: GlobalAtmosphericModelQueryParams): List<GlobalAtmosphericModelQueryResponse> =
        query(
          params, RequestOptions.none()
        )

    /** @see query */
    fun query(params: GlobalAtmosphericModelQueryParams, requestOptions: RequestOptions = RequestOptions.none()): List<GlobalAtmosphericModelQueryResponse>

    /** Service operation to provide detailed information on available dynamic query parameters for a particular data type. */
    fun queryHelp(): GlobalAtmosphericModelQueryHelpResponse = queryHelp(GlobalAtmosphericModelQueryHelpParams.none())

    /** @see queryHelp */
    fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): GlobalAtmosphericModelQueryHelpResponse

    /** @see queryHelp */
    fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none()): GlobalAtmosphericModelQueryHelpResponse =
        queryHelp(
          params, RequestOptions.none()
        )

    /** @see queryHelp */
    fun queryHelp(requestOptions: RequestOptions): GlobalAtmosphericModelQueryHelpResponse =
        queryHelp(
          GlobalAtmosphericModelQueryHelpParams.none(), requestOptions
        )

    /** Service operation to dynamically query data and only return specified columns/fields. Requested columns are specified by the 'columns' query parameter and should be a comma separated list of valid fields for the specified data type. classificationMarking is always returned. See the queryhelp operation (/udl/<datatype>/queryhelp) for more details on valid/required query parameter information. An example URI: /udl/elset/tuple?columns=satNo,period&epoch=>now-5 hours would return the satNo and period of elsets with an epoch greater than 5 hours ago. */
    fun tuple(params: GlobalAtmosphericModelTupleParams): List<GlobalAtmosphericModelTupleResponse> =
        tuple(
          params, RequestOptions.none()
        )

    /** @see tuple */
    fun tuple(params: GlobalAtmosphericModelTupleParams, requestOptions: RequestOptions = RequestOptions.none()): List<GlobalAtmosphericModelTupleResponse>

    /**
     * Upload a file with its metadata.
     *
     * The request body requires a zip file containing exactly two files:\
     * 1\) A file with the `.json` file extension whose content conforms to the `GlobalAtmosphericModel_Ingest` schema.\
     * 2\) A file with the `.geojson` file extension.
     *
     * The JSON and GEOJSON files will be associated with each other other via the `id` field. Query the metadata via `GET /udl/globalatmosphericmodel` and use `GET /udl/globalatmosphericmodel/getFile/{id}` to retrieve the compressed GEOJSON file as `.gz` extension.
     *
     * This operation only accepts application/zip media. The application/json request body is documented to provide a convenient reference to the ingest schema.
     *
     * This operation is intended to be used for automated feeds into UDL. A specific role is required to perform this service operation. Please contact the UDL team for assistance.
     */
    fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams) =
        unvalidatedPublish(
          params, RequestOptions.none()
        )

    /** @see unvalidatedPublish */
    fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [GlobalAtmosphericModelService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GlobalAtmosphericModelService.WithRawResponse

        fun history(): HistoryService.WithRawResponse

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/{id}`, but is otherwise the same as [GlobalAtmosphericModelService.retrieve]. */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse> =
            retrieve(
              id, GlobalAtmosphericModelRetrieveParams.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse> =
            retrieve(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: GlobalAtmosphericModelRetrieveParams = GlobalAtmosphericModelRetrieveParams.none()): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse> =
            retrieve(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: GlobalAtmosphericModelRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: GlobalAtmosphericModelRetrieveParams): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<GlobalAtmosphericModelRetrieveResponse> =
            retrieve(
              id,
              GlobalAtmosphericModelRetrieveParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/count`, but is otherwise the same as [GlobalAtmosphericModelService.count]. */
        @MustBeClosed
        fun count(params: GlobalAtmosphericModelCountParams): HttpResponseFor<String> =
            count(
              params, RequestOptions.none()
            )

        /** @see count */
        @MustBeClosed
        fun count(params: GlobalAtmosphericModelCountParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<String>

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/getFile/{id}`, but is otherwise the same as [GlobalAtmosphericModelService.getFile]. */
        @MustBeClosed
        fun getFile(id: String): HttpResponse =
            getFile(
              id, GlobalAtmosphericModelGetFileParams.none()
            )

        /** @see getFile */
        @MustBeClosed
        fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            getFile(
              params.toBuilder()
                  .id(id)
                  .build(), requestOptions
            )

        /** @see getFile */
        @MustBeClosed
        fun getFile(id: String, params: GlobalAtmosphericModelGetFileParams = GlobalAtmosphericModelGetFileParams.none()): HttpResponse =
            getFile(
              id,
              params,
              RequestOptions.none(),
            )

        /** @see getFile */
        @MustBeClosed
        fun getFile(params: GlobalAtmosphericModelGetFileParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse

        /** @see getFile */
        @MustBeClosed
        fun getFile(params: GlobalAtmosphericModelGetFileParams): HttpResponse =
            getFile(
              params, RequestOptions.none()
            )

        /** @see getFile */
        @MustBeClosed
        fun getFile(id: String, requestOptions: RequestOptions): HttpResponse =
            getFile(
              id,
              GlobalAtmosphericModelGetFileParams.none(),
              requestOptions,
            )

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel`, but is otherwise the same as [GlobalAtmosphericModelService.query]. */
        @MustBeClosed
        fun query(params: GlobalAtmosphericModelQueryParams): HttpResponseFor<List<GlobalAtmosphericModelQueryResponse>> =
            query(
              params, RequestOptions.none()
            )

        /** @see query */
        @MustBeClosed
        fun query(params: GlobalAtmosphericModelQueryParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<GlobalAtmosphericModelQueryResponse>>

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/queryhelp`, but is otherwise the same as [GlobalAtmosphericModelService.queryHelp]. */
        @MustBeClosed
        fun queryHelp(): HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse> = queryHelp(GlobalAtmosphericModelQueryHelpParams.none())

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse>

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(params: GlobalAtmosphericModelQueryHelpParams = GlobalAtmosphericModelQueryHelpParams.none()): HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse> =
            queryHelp(
              params, RequestOptions.none()
            )

        /** @see queryHelp */
        @MustBeClosed
        fun queryHelp(requestOptions: RequestOptions): HttpResponseFor<GlobalAtmosphericModelQueryHelpResponse> =
            queryHelp(
              GlobalAtmosphericModelQueryHelpParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `get /udl/globalatmosphericmodel/tuple`, but is otherwise the same as [GlobalAtmosphericModelService.tuple]. */
        @MustBeClosed
        fun tuple(params: GlobalAtmosphericModelTupleParams): HttpResponseFor<List<GlobalAtmosphericModelTupleResponse>> =
            tuple(
              params, RequestOptions.none()
            )

        /** @see tuple */
        @MustBeClosed
        fun tuple(params: GlobalAtmosphericModelTupleParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<List<GlobalAtmosphericModelTupleResponse>>

        /** Returns a raw HTTP response for `post /filedrop/udl-globalatmosphericmodel`, but is otherwise the same as [GlobalAtmosphericModelService.unvalidatedPublish]. */
        @MustBeClosed
        fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams): HttpResponse =
            unvalidatedPublish(
              params, RequestOptions.none()
            )

        /** @see unvalidatedPublish */
        @MustBeClosed
        fun unvalidatedPublish(params: GlobalAtmosphericModelUnvalidatedPublishParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse
    }
}

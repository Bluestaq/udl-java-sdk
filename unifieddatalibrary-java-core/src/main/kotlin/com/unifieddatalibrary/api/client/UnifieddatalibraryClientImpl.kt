// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.core.ClientOptions
import com.unifieddatalibrary.api.core.getPackageVersion
import com.unifieddatalibrary.api.services.blocking.AiService
import com.unifieddatalibrary.api.services.blocking.AiServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirEventService
import com.unifieddatalibrary.api.services.blocking.AirEventServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirOperationService
import com.unifieddatalibrary.api.services.blocking.AirOperationServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirTransportMissionService
import com.unifieddatalibrary.api.services.blocking.AirTransportMissionServiceImpl
import com.unifieddatalibrary.api.services.blocking.AircraftService
import com.unifieddatalibrary.api.services.blocking.AircraftServiceImpl
import com.unifieddatalibrary.api.services.blocking.AircraftSortyService
import com.unifieddatalibrary.api.services.blocking.AircraftSortyServiceImpl
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusRemarkServiceImpl
import com.unifieddatalibrary.api.services.blocking.AircraftStatusService
import com.unifieddatalibrary.api.services.blocking.AircraftStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirfieldService
import com.unifieddatalibrary.api.services.blocking.AirfieldServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotConsumptionServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotService
import com.unifieddatalibrary.api.services.blocking.AirfieldSlotServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusService
import com.unifieddatalibrary.api.services.blocking.AirfieldStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirloadPlanService
import com.unifieddatalibrary.api.services.blocking.AirloadPlanServiceImpl
import com.unifieddatalibrary.api.services.blocking.AirspaceControlOrderService
import com.unifieddatalibrary.api.services.blocking.AirspaceControlOrderServiceImpl
import com.unifieddatalibrary.api.services.blocking.AisObjectService
import com.unifieddatalibrary.api.services.blocking.AisObjectServiceImpl
import com.unifieddatalibrary.api.services.blocking.AnalyticImageryService
import com.unifieddatalibrary.api.services.blocking.AnalyticImageryServiceImpl
import com.unifieddatalibrary.api.services.blocking.AntennaService
import com.unifieddatalibrary.api.services.blocking.AntennaServiceImpl
import com.unifieddatalibrary.api.services.blocking.AttitudeDataService
import com.unifieddatalibrary.api.services.blocking.AttitudeDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.AttitudeSetService
import com.unifieddatalibrary.api.services.blocking.AttitudeSetServiceImpl
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementService
import com.unifieddatalibrary.api.services.blocking.AviationRiskManagementServiceImpl
import com.unifieddatalibrary.api.services.blocking.BatteryService
import com.unifieddatalibrary.api.services.blocking.BatteryServiceImpl
import com.unifieddatalibrary.api.services.blocking.BatterydetailService
import com.unifieddatalibrary.api.services.blocking.BatterydetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.BeamContourService
import com.unifieddatalibrary.api.services.blocking.BeamContourServiceImpl
import com.unifieddatalibrary.api.services.blocking.BeamService
import com.unifieddatalibrary.api.services.blocking.BeamServiceImpl
import com.unifieddatalibrary.api.services.blocking.BusService
import com.unifieddatalibrary.api.services.blocking.BusServiceImpl
import com.unifieddatalibrary.api.services.blocking.ChannelService
import com.unifieddatalibrary.api.services.blocking.ChannelServiceImpl
import com.unifieddatalibrary.api.services.blocking.CloselyspacedobjectService
import com.unifieddatalibrary.api.services.blocking.CloselyspacedobjectServiceImpl
import com.unifieddatalibrary.api.services.blocking.CollectRequestService
import com.unifieddatalibrary.api.services.blocking.CollectRequestServiceImpl
import com.unifieddatalibrary.api.services.blocking.CollectResponseService
import com.unifieddatalibrary.api.services.blocking.CollectResponseServiceImpl
import com.unifieddatalibrary.api.services.blocking.CommService
import com.unifieddatalibrary.api.services.blocking.CommServiceImpl
import com.unifieddatalibrary.api.services.blocking.ConjunctionService
import com.unifieddatalibrary.api.services.blocking.ConjunctionServiceImpl
import com.unifieddatalibrary.api.services.blocking.CotService
import com.unifieddatalibrary.api.services.blocking.CotServiceImpl
import com.unifieddatalibrary.api.services.blocking.CountryService
import com.unifieddatalibrary.api.services.blocking.CountryServiceImpl
import com.unifieddatalibrary.api.services.blocking.CrewService
import com.unifieddatalibrary.api.services.blocking.CrewServiceImpl
import com.unifieddatalibrary.api.services.blocking.DeconflictsetService
import com.unifieddatalibrary.api.services.blocking.DeconflictsetServiceImpl
import com.unifieddatalibrary.api.services.blocking.DiffOfArrivalService
import com.unifieddatalibrary.api.services.blocking.DiffOfArrivalServiceImpl
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceServiceImpl
import com.unifieddatalibrary.api.services.blocking.DriftHistoryService
import com.unifieddatalibrary.api.services.blocking.DriftHistoryServiceImpl
import com.unifieddatalibrary.api.services.blocking.DropzoneService
import com.unifieddatalibrary.api.services.blocking.DropzoneServiceImpl
import com.unifieddatalibrary.api.services.blocking.EcpedrService
import com.unifieddatalibrary.api.services.blocking.EcpedrServiceImpl
import com.unifieddatalibrary.api.services.blocking.EffectRequestService
import com.unifieddatalibrary.api.services.blocking.EffectRequestServiceImpl
import com.unifieddatalibrary.api.services.blocking.EffectResponseService
import com.unifieddatalibrary.api.services.blocking.EffectResponseServiceImpl
import com.unifieddatalibrary.api.services.blocking.ElsetService
import com.unifieddatalibrary.api.services.blocking.ElsetServiceImpl
import com.unifieddatalibrary.api.services.blocking.EmireportService
import com.unifieddatalibrary.api.services.blocking.EmireportServiceImpl
import com.unifieddatalibrary.api.services.blocking.EmitterGeolocationService
import com.unifieddatalibrary.api.services.blocking.EmitterGeolocationServiceImpl
import com.unifieddatalibrary.api.services.blocking.EngineDetailService
import com.unifieddatalibrary.api.services.blocking.EngineDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.EngineService
import com.unifieddatalibrary.api.services.blocking.EngineServiceImpl
import com.unifieddatalibrary.api.services.blocking.EntityService
import com.unifieddatalibrary.api.services.blocking.EntityServiceImpl
import com.unifieddatalibrary.api.services.blocking.EopService
import com.unifieddatalibrary.api.services.blocking.EopServiceImpl
import com.unifieddatalibrary.api.services.blocking.EphemerisService
import com.unifieddatalibrary.api.services.blocking.EphemerisServiceImpl
import com.unifieddatalibrary.api.services.blocking.EphemerisSetService
import com.unifieddatalibrary.api.services.blocking.EphemerisSetServiceImpl
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkService
import com.unifieddatalibrary.api.services.blocking.EquipmentRemarkServiceImpl
import com.unifieddatalibrary.api.services.blocking.EquipmentService
import com.unifieddatalibrary.api.services.blocking.EquipmentServiceImpl
import com.unifieddatalibrary.api.services.blocking.EvacService
import com.unifieddatalibrary.api.services.blocking.EvacServiceImpl
import com.unifieddatalibrary.api.services.blocking.EventEvolutionService
import com.unifieddatalibrary.api.services.blocking.EventEvolutionServiceImpl
import com.unifieddatalibrary.api.services.blocking.FeatureAssessmentService
import com.unifieddatalibrary.api.services.blocking.FeatureAssessmentServiceImpl
import com.unifieddatalibrary.api.services.blocking.FlightplanService
import com.unifieddatalibrary.api.services.blocking.FlightplanServiceImpl
import com.unifieddatalibrary.api.services.blocking.GeoStatusService
import com.unifieddatalibrary.api.services.blocking.GeoStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.GlobalAtmosphericModelService
import com.unifieddatalibrary.api.services.blocking.GlobalAtmosphericModelServiceImpl
import com.unifieddatalibrary.api.services.blocking.GnssObservationService
import com.unifieddatalibrary.api.services.blocking.GnssObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetService
import com.unifieddatalibrary.api.services.blocking.GnssObservationsetServiceImpl
import com.unifieddatalibrary.api.services.blocking.GnssRawIfService
import com.unifieddatalibrary.api.services.blocking.GnssRawIfServiceImpl
import com.unifieddatalibrary.api.services.blocking.GroundImageryService
import com.unifieddatalibrary.api.services.blocking.GroundImageryServiceImpl
import com.unifieddatalibrary.api.services.blocking.H3GeoHexCellService
import com.unifieddatalibrary.api.services.blocking.H3GeoHexCellServiceImpl
import com.unifieddatalibrary.api.services.blocking.H3GeoService
import com.unifieddatalibrary.api.services.blocking.H3GeoServiceImpl
import com.unifieddatalibrary.api.services.blocking.HazardService
import com.unifieddatalibrary.api.services.blocking.HazardServiceImpl
import com.unifieddatalibrary.api.services.blocking.IonoObservationService
import com.unifieddatalibrary.api.services.blocking.IonoObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.IrService
import com.unifieddatalibrary.api.services.blocking.IrServiceImpl
import com.unifieddatalibrary.api.services.blocking.IsrCollectionService
import com.unifieddatalibrary.api.services.blocking.IsrCollectionServiceImpl
import com.unifieddatalibrary.api.services.blocking.ItemService
import com.unifieddatalibrary.api.services.blocking.ItemServiceImpl
import com.unifieddatalibrary.api.services.blocking.ItemTrackingService
import com.unifieddatalibrary.api.services.blocking.ItemTrackingServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaserdeconflictrequestService
import com.unifieddatalibrary.api.services.blocking.LaserdeconflictrequestServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaseremitterService
import com.unifieddatalibrary.api.services.blocking.LaseremitterServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionService
import com.unifieddatalibrary.api.services.blocking.LaunchDetectionServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaunchEventService
import com.unifieddatalibrary.api.services.blocking.LaunchEventServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaunchSiteDetailService
import com.unifieddatalibrary.api.services.blocking.LaunchSiteDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaunchSiteService
import com.unifieddatalibrary.api.services.blocking.LaunchSiteServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleDetailService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleService
import com.unifieddatalibrary.api.services.blocking.LaunchVehicleServiceImpl
import com.unifieddatalibrary.api.services.blocking.LinkStatusService
import com.unifieddatalibrary.api.services.blocking.LinkStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.LinkstatusService
import com.unifieddatalibrary.api.services.blocking.LinkstatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.LocationService
import com.unifieddatalibrary.api.services.blocking.LocationServiceImpl
import com.unifieddatalibrary.api.services.blocking.LogisticsSupportService
import com.unifieddatalibrary.api.services.blocking.LogisticsSupportServiceImpl
import com.unifieddatalibrary.api.services.blocking.ManeuverService
import com.unifieddatalibrary.api.services.blocking.ManeuverServiceImpl
import com.unifieddatalibrary.api.services.blocking.ManifoldService
import com.unifieddatalibrary.api.services.blocking.ManifoldServiceImpl
import com.unifieddatalibrary.api.services.blocking.ManifoldelsetService
import com.unifieddatalibrary.api.services.blocking.ManifoldelsetServiceImpl
import com.unifieddatalibrary.api.services.blocking.MissileTrackService
import com.unifieddatalibrary.api.services.blocking.MissileTrackServiceImpl
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentService
import com.unifieddatalibrary.api.services.blocking.MissionAssignmentServiceImpl
import com.unifieddatalibrary.api.services.blocking.MtiService
import com.unifieddatalibrary.api.services.blocking.MtiServiceImpl
import com.unifieddatalibrary.api.services.blocking.NavigationService
import com.unifieddatalibrary.api.services.blocking.NavigationServiceImpl
import com.unifieddatalibrary.api.services.blocking.NavigationalObstructionService
import com.unifieddatalibrary.api.services.blocking.NavigationalObstructionServiceImpl
import com.unifieddatalibrary.api.services.blocking.NotificationService
import com.unifieddatalibrary.api.services.blocking.NotificationServiceImpl
import com.unifieddatalibrary.api.services.blocking.ObjectOfInterestService
import com.unifieddatalibrary.api.services.blocking.ObjectOfInterestServiceImpl
import com.unifieddatalibrary.api.services.blocking.ObservationService
import com.unifieddatalibrary.api.services.blocking.ObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnboardnavigationService
import com.unifieddatalibrary.api.services.blocking.OnboardnavigationServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitService
import com.unifieddatalibrary.api.services.blocking.OnorbitServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitantennaService
import com.unifieddatalibrary.api.services.blocking.OnorbitantennaServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitassessmentService
import com.unifieddatalibrary.api.services.blocking.OnorbitassessmentServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryService
import com.unifieddatalibrary.api.services.blocking.OnorbitbatteryServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailService
import com.unifieddatalibrary.api.services.blocking.OnorbitdetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbiteventService
import com.unifieddatalibrary.api.services.blocking.OnorbiteventServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitlistService
import com.unifieddatalibrary.api.services.blocking.OnorbitlistServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitsolararrayService
import com.unifieddatalibrary.api.services.blocking.OnorbitsolararrayServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterServiceImpl
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusService
import com.unifieddatalibrary.api.services.blocking.OnorbitthrusterstatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.OperatingunitService
import com.unifieddatalibrary.api.services.blocking.OperatingunitServiceImpl
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkService
import com.unifieddatalibrary.api.services.blocking.OperatingunitremarkServiceImpl
import com.unifieddatalibrary.api.services.blocking.OrbitdeterminationService
import com.unifieddatalibrary.api.services.blocking.OrbitdeterminationServiceImpl
import com.unifieddatalibrary.api.services.blocking.OrbittrackService
import com.unifieddatalibrary.api.services.blocking.OrbittrackServiceImpl
import com.unifieddatalibrary.api.services.blocking.OrganizationService
import com.unifieddatalibrary.api.services.blocking.OrganizationServiceImpl
import com.unifieddatalibrary.api.services.blocking.OrganizationdetailService
import com.unifieddatalibrary.api.services.blocking.OrganizationdetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryService
import com.unifieddatalibrary.api.services.blocking.PersonnelrecoveryServiceImpl
import com.unifieddatalibrary.api.services.blocking.PoiService
import com.unifieddatalibrary.api.services.blocking.PoiServiceImpl
import com.unifieddatalibrary.api.services.blocking.PortService
import com.unifieddatalibrary.api.services.blocking.PortServiceImpl
import com.unifieddatalibrary.api.services.blocking.ReportAndActivityService
import com.unifieddatalibrary.api.services.blocking.ReportAndActivityServiceImpl
import com.unifieddatalibrary.api.services.blocking.RfBandService
import com.unifieddatalibrary.api.services.blocking.RfBandServiceImpl
import com.unifieddatalibrary.api.services.blocking.RfBandTypeService
import com.unifieddatalibrary.api.services.blocking.RfBandTypeServiceImpl
import com.unifieddatalibrary.api.services.blocking.RfEmitterService
import com.unifieddatalibrary.api.services.blocking.RfEmitterServiceImpl
import com.unifieddatalibrary.api.services.blocking.RouteStatService
import com.unifieddatalibrary.api.services.blocking.RouteStatServiceImpl
import com.unifieddatalibrary.api.services.blocking.SarObservationService
import com.unifieddatalibrary.api.services.blocking.SarObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.ScService
import com.unifieddatalibrary.api.services.blocking.ScServiceImpl
import com.unifieddatalibrary.api.services.blocking.ScientificService
import com.unifieddatalibrary.api.services.blocking.ScientificServiceImpl
import com.unifieddatalibrary.api.services.blocking.SecureMessagingService
import com.unifieddatalibrary.api.services.blocking.SecureMessagingServiceImpl
import com.unifieddatalibrary.api.services.blocking.SensorMaintenanceService
import com.unifieddatalibrary.api.services.blocking.SensorMaintenanceServiceImpl
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeService
import com.unifieddatalibrary.api.services.blocking.SensorObservationTypeServiceImpl
import com.unifieddatalibrary.api.services.blocking.SensorPlanService
import com.unifieddatalibrary.api.services.blocking.SensorPlanServiceImpl
import com.unifieddatalibrary.api.services.blocking.SensorService
import com.unifieddatalibrary.api.services.blocking.SensorServiceImpl
import com.unifieddatalibrary.api.services.blocking.SensorStatingService
import com.unifieddatalibrary.api.services.blocking.SensorStatingServiceImpl
import com.unifieddatalibrary.api.services.blocking.SensorTypeService
import com.unifieddatalibrary.api.services.blocking.SensorTypeServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailService
import com.unifieddatalibrary.api.services.blocking.SeraDataCommDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningService
import com.unifieddatalibrary.api.services.blocking.SeraDataEarlyWarningServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeraDataNavigationService
import com.unifieddatalibrary.api.services.blocking.SeraDataNavigationServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataOpticalPayloadServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeradataRadarPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataRadarPayloadServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeradataSigintPayloadService
import com.unifieddatalibrary.api.services.blocking.SeradataSigintPayloadServiceImpl
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailService
import com.unifieddatalibrary.api.services.blocking.SeradataSpacecraftDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.SgiService
import com.unifieddatalibrary.api.services.blocking.SgiServiceImpl
import com.unifieddatalibrary.api.services.blocking.SigactService
import com.unifieddatalibrary.api.services.blocking.SigactServiceImpl
import com.unifieddatalibrary.api.services.blocking.SiteRemarkService
import com.unifieddatalibrary.api.services.blocking.SiteRemarkServiceImpl
import com.unifieddatalibrary.api.services.blocking.SiteService
import com.unifieddatalibrary.api.services.blocking.SiteServiceImpl
import com.unifieddatalibrary.api.services.blocking.SiteStatusService
import com.unifieddatalibrary.api.services.blocking.SiteStatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.SkyImageryService
import com.unifieddatalibrary.api.services.blocking.SkyImageryServiceImpl
import com.unifieddatalibrary.api.services.blocking.SoiObservationSetService
import com.unifieddatalibrary.api.services.blocking.SoiObservationSetServiceImpl
import com.unifieddatalibrary.api.services.blocking.SolarArrayDetailService
import com.unifieddatalibrary.api.services.blocking.SolarArrayDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.SolarArrayService
import com.unifieddatalibrary.api.services.blocking.SolarArrayServiceImpl
import com.unifieddatalibrary.api.services.blocking.SortiePprService
import com.unifieddatalibrary.api.services.blocking.SortiePprServiceImpl
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationService
import com.unifieddatalibrary.api.services.blocking.SpaceEnvObservationServiceImpl
import com.unifieddatalibrary.api.services.blocking.StageService
import com.unifieddatalibrary.api.services.blocking.StageServiceImpl
import com.unifieddatalibrary.api.services.blocking.StarCatalogService
import com.unifieddatalibrary.api.services.blocking.StarCatalogServiceImpl
import com.unifieddatalibrary.api.services.blocking.StateVectorService
import com.unifieddatalibrary.api.services.blocking.StateVectorServiceImpl
import com.unifieddatalibrary.api.services.blocking.StatusService
import com.unifieddatalibrary.api.services.blocking.StatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.SubstatusService
import com.unifieddatalibrary.api.services.blocking.SubstatusServiceImpl
import com.unifieddatalibrary.api.services.blocking.SupportingDataService
import com.unifieddatalibrary.api.services.blocking.SupportingDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.SurfaceObstructionService
import com.unifieddatalibrary.api.services.blocking.SurfaceObstructionServiceImpl
import com.unifieddatalibrary.api.services.blocking.SurfaceService
import com.unifieddatalibrary.api.services.blocking.SurfaceServiceImpl
import com.unifieddatalibrary.api.services.blocking.SwirService
import com.unifieddatalibrary.api.services.blocking.SwirServiceImpl
import com.unifieddatalibrary.api.services.blocking.TaiUtcService
import com.unifieddatalibrary.api.services.blocking.TaiUtcServiceImpl
import com.unifieddatalibrary.api.services.blocking.TdoaFdoaService
import com.unifieddatalibrary.api.services.blocking.TdoaFdoaServiceImpl
import com.unifieddatalibrary.api.services.blocking.TrackDetailService
import com.unifieddatalibrary.api.services.blocking.TrackDetailServiceImpl
import com.unifieddatalibrary.api.services.blocking.TrackRouteService
import com.unifieddatalibrary.api.services.blocking.TrackRouteServiceImpl
import com.unifieddatalibrary.api.services.blocking.TrackService
import com.unifieddatalibrary.api.services.blocking.TrackServiceImpl
import com.unifieddatalibrary.api.services.blocking.TransponderService
import com.unifieddatalibrary.api.services.blocking.TransponderServiceImpl
import com.unifieddatalibrary.api.services.blocking.UserService
import com.unifieddatalibrary.api.services.blocking.UserServiceImpl
import com.unifieddatalibrary.api.services.blocking.VesselService
import com.unifieddatalibrary.api.services.blocking.VesselServiceImpl
import com.unifieddatalibrary.api.services.blocking.VideoService
import com.unifieddatalibrary.api.services.blocking.VideoServiceImpl
import com.unifieddatalibrary.api.services.blocking.WeatherDataService
import com.unifieddatalibrary.api.services.blocking.WeatherDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.WeatherReportService
import com.unifieddatalibrary.api.services.blocking.WeatherReportServiceImpl
import java.util.function.Consumer

class UnifieddatalibraryClientImpl(private val clientOptions: ClientOptions) :
    UnifieddatalibraryClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: UnifieddatalibraryClientAsync by lazy {
        UnifieddatalibraryClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: UnifieddatalibraryClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val airEvents: AirEventService by lazy {
        AirEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val airOperations: AirOperationService by lazy {
        AirOperationServiceImpl(clientOptionsWithUserAgent)
    }

    private val airTransportMissions: AirTransportMissionService by lazy {
        AirTransportMissionServiceImpl(clientOptionsWithUserAgent)
    }

    private val aircraft: AircraftService by lazy {
        AircraftServiceImpl(clientOptionsWithUserAgent)
    }

    private val aircraftSorties: AircraftSortyService by lazy {
        AircraftSortyServiceImpl(clientOptionsWithUserAgent)
    }

    private val aircraftStatusRemarks: AircraftStatusRemarkService by lazy {
        AircraftStatusRemarkServiceImpl(clientOptionsWithUserAgent)
    }

    private val aircraftStatuses: AircraftStatusService by lazy {
        AircraftStatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val airfieldSlotConsumptions: AirfieldSlotConsumptionService by lazy {
        AirfieldSlotConsumptionServiceImpl(clientOptionsWithUserAgent)
    }

    private val airfieldSlots: AirfieldSlotService by lazy {
        AirfieldSlotServiceImpl(clientOptionsWithUserAgent)
    }

    private val airfieldStatus: AirfieldStatusService by lazy {
        AirfieldStatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val airfields: AirfieldService by lazy {
        AirfieldServiceImpl(clientOptionsWithUserAgent)
    }

    private val airloadPlans: AirloadPlanService by lazy {
        AirloadPlanServiceImpl(clientOptionsWithUserAgent)
    }

    private val airspaceControlOrders: AirspaceControlOrderService by lazy {
        AirspaceControlOrderServiceImpl(clientOptionsWithUserAgent)
    }

    private val ais: AiService by lazy { AiServiceImpl(clientOptionsWithUserAgent) }

    private val aisObjects: AisObjectService by lazy {
        AisObjectServiceImpl(clientOptionsWithUserAgent)
    }

    private val analyticImagery: AnalyticImageryService by lazy {
        AnalyticImageryServiceImpl(clientOptionsWithUserAgent)
    }

    private val antennas: AntennaService by lazy { AntennaServiceImpl(clientOptionsWithUserAgent) }

    private val attitudeData: AttitudeDataService by lazy {
        AttitudeDataServiceImpl(clientOptionsWithUserAgent)
    }

    private val attitudeSets: AttitudeSetService by lazy {
        AttitudeSetServiceImpl(clientOptionsWithUserAgent)
    }

    private val aviationRiskManagement: AviationRiskManagementService by lazy {
        AviationRiskManagementServiceImpl(clientOptionsWithUserAgent)
    }

    private val batteries: BatteryService by lazy { BatteryServiceImpl(clientOptionsWithUserAgent) }

    private val batterydetails: BatterydetailService by lazy {
        BatterydetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val beam: BeamService by lazy { BeamServiceImpl(clientOptionsWithUserAgent) }

    private val beamContours: BeamContourService by lazy {
        BeamContourServiceImpl(clientOptionsWithUserAgent)
    }

    private val buses: BusService by lazy { BusServiceImpl(clientOptionsWithUserAgent) }

    private val channels: ChannelService by lazy { ChannelServiceImpl(clientOptionsWithUserAgent) }

    private val closelyspacedobjects: CloselyspacedobjectService by lazy {
        CloselyspacedobjectServiceImpl(clientOptionsWithUserAgent)
    }

    private val collectRequests: CollectRequestService by lazy {
        CollectRequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val collectResponses: CollectResponseService by lazy {
        CollectResponseServiceImpl(clientOptionsWithUserAgent)
    }

    private val comm: CommService by lazy { CommServiceImpl(clientOptionsWithUserAgent) }

    private val conjunctions: ConjunctionService by lazy {
        ConjunctionServiceImpl(clientOptionsWithUserAgent)
    }

    private val cots: CotService by lazy { CotServiceImpl(clientOptionsWithUserAgent) }

    private val countries: CountryService by lazy { CountryServiceImpl(clientOptionsWithUserAgent) }

    private val crew: CrewService by lazy { CrewServiceImpl(clientOptionsWithUserAgent) }

    private val deconflictset: DeconflictsetService by lazy {
        DeconflictsetServiceImpl(clientOptionsWithUserAgent)
    }

    private val diffOfArrival: DiffOfArrivalService by lazy {
        DiffOfArrivalServiceImpl(clientOptionsWithUserAgent)
    }

    private val diplomaticClearance: DiplomaticClearanceService by lazy {
        DiplomaticClearanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val driftHistory: DriftHistoryService by lazy {
        DriftHistoryServiceImpl(clientOptionsWithUserAgent)
    }

    private val dropzone: DropzoneService by lazy {
        DropzoneServiceImpl(clientOptionsWithUserAgent)
    }

    private val ecpedr: EcpedrService by lazy { EcpedrServiceImpl(clientOptionsWithUserAgent) }

    private val effectRequests: EffectRequestService by lazy {
        EffectRequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val effectResponses: EffectResponseService by lazy {
        EffectResponseServiceImpl(clientOptionsWithUserAgent)
    }

    private val elsets: ElsetService by lazy { ElsetServiceImpl(clientOptionsWithUserAgent) }

    private val emireport: EmireportService by lazy {
        EmireportServiceImpl(clientOptionsWithUserAgent)
    }

    private val emitterGeolocation: EmitterGeolocationService by lazy {
        EmitterGeolocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val engineDetails: EngineDetailService by lazy {
        EngineDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val engines: EngineService by lazy { EngineServiceImpl(clientOptionsWithUserAgent) }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptionsWithUserAgent) }

    private val eop: EopService by lazy { EopServiceImpl(clientOptionsWithUserAgent) }

    private val ephemeris: EphemerisService by lazy {
        EphemerisServiceImpl(clientOptionsWithUserAgent)
    }

    private val ephemerisSets: EphemerisSetService by lazy {
        EphemerisSetServiceImpl(clientOptionsWithUserAgent)
    }

    private val equipment: EquipmentService by lazy {
        EquipmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val equipmentRemarks: EquipmentRemarkService by lazy {
        EquipmentRemarkServiceImpl(clientOptionsWithUserAgent)
    }

    private val evac: EvacService by lazy { EvacServiceImpl(clientOptionsWithUserAgent) }

    private val eventEvolution: EventEvolutionService by lazy {
        EventEvolutionServiceImpl(clientOptionsWithUserAgent)
    }

    private val featureAssessment: FeatureAssessmentService by lazy {
        FeatureAssessmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val flightplan: FlightplanService by lazy {
        FlightplanServiceImpl(clientOptionsWithUserAgent)
    }

    private val geoStatus: GeoStatusService by lazy {
        GeoStatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val globalAtmosphericModel: GlobalAtmosphericModelService by lazy {
        GlobalAtmosphericModelServiceImpl(clientOptionsWithUserAgent)
    }

    private val gnssObservations: GnssObservationService by lazy {
        GnssObservationServiceImpl(clientOptionsWithUserAgent)
    }

    private val gnssObservationset: GnssObservationsetService by lazy {
        GnssObservationsetServiceImpl(clientOptionsWithUserAgent)
    }

    private val gnssRawIf: GnssRawIfService by lazy {
        GnssRawIfServiceImpl(clientOptionsWithUserAgent)
    }

    private val groundImagery: GroundImageryService by lazy {
        GroundImageryServiceImpl(clientOptionsWithUserAgent)
    }

    private val h3Geo: H3GeoService by lazy { H3GeoServiceImpl(clientOptionsWithUserAgent) }

    private val h3GeoHexCell: H3GeoHexCellService by lazy {
        H3GeoHexCellServiceImpl(clientOptionsWithUserAgent)
    }

    private val hazard: HazardService by lazy { HazardServiceImpl(clientOptionsWithUserAgent) }

    private val ionoObservations: IonoObservationService by lazy {
        IonoObservationServiceImpl(clientOptionsWithUserAgent)
    }

    private val ir: IrService by lazy { IrServiceImpl(clientOptionsWithUserAgent) }

    private val isrCollections: IsrCollectionService by lazy {
        IsrCollectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val item: ItemService by lazy { ItemServiceImpl(clientOptionsWithUserAgent) }

    private val itemTrackings: ItemTrackingService by lazy {
        ItemTrackingServiceImpl(clientOptionsWithUserAgent)
    }

    private val laserdeconflictrequest: LaserdeconflictrequestService by lazy {
        LaserdeconflictrequestServiceImpl(clientOptionsWithUserAgent)
    }

    private val laseremitter: LaseremitterService by lazy {
        LaseremitterServiceImpl(clientOptionsWithUserAgent)
    }

    private val launchDetection: LaunchDetectionService by lazy {
        LaunchDetectionServiceImpl(clientOptionsWithUserAgent)
    }

    private val launchEvent: LaunchEventService by lazy {
        LaunchEventServiceImpl(clientOptionsWithUserAgent)
    }

    private val launchSite: LaunchSiteService by lazy {
        LaunchSiteServiceImpl(clientOptionsWithUserAgent)
    }

    private val launchSiteDetails: LaunchSiteDetailService by lazy {
        LaunchSiteDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val launchVehicle: LaunchVehicleService by lazy {
        LaunchVehicleServiceImpl(clientOptionsWithUserAgent)
    }

    private val launchVehicleDetails: LaunchVehicleDetailService by lazy {
        LaunchVehicleDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val linkStatus: LinkStatusService by lazy {
        LinkStatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val linkstatus: LinkstatusService by lazy {
        LinkstatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val location: LocationService by lazy {
        LocationServiceImpl(clientOptionsWithUserAgent)
    }

    private val logisticsSupport: LogisticsSupportService by lazy {
        LogisticsSupportServiceImpl(clientOptionsWithUserAgent)
    }

    private val maneuvers: ManeuverService by lazy {
        ManeuverServiceImpl(clientOptionsWithUserAgent)
    }

    private val manifold: ManifoldService by lazy {
        ManifoldServiceImpl(clientOptionsWithUserAgent)
    }

    private val manifoldelset: ManifoldelsetService by lazy {
        ManifoldelsetServiceImpl(clientOptionsWithUserAgent)
    }

    private val missileTracks: MissileTrackService by lazy {
        MissileTrackServiceImpl(clientOptionsWithUserAgent)
    }

    private val missionAssignment: MissionAssignmentService by lazy {
        MissionAssignmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val mti: MtiService by lazy { MtiServiceImpl(clientOptionsWithUserAgent) }

    private val navigation: NavigationService by lazy {
        NavigationServiceImpl(clientOptionsWithUserAgent)
    }

    private val navigationalObstruction: NavigationalObstructionService by lazy {
        NavigationalObstructionServiceImpl(clientOptionsWithUserAgent)
    }

    private val notification: NotificationService by lazy {
        NotificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val objectOfInterest: ObjectOfInterestService by lazy {
        ObjectOfInterestServiceImpl(clientOptionsWithUserAgent)
    }

    private val observations: ObservationService by lazy {
        ObservationServiceImpl(clientOptionsWithUserAgent)
    }

    private val onboardnavigation: OnboardnavigationService by lazy {
        OnboardnavigationServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbit: OnorbitService by lazy { OnorbitServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitantenna: OnorbitantennaService by lazy {
        OnorbitantennaServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitbattery: OnorbitbatteryService by lazy {
        OnorbitbatteryServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitdetails: OnorbitdetailService by lazy {
        OnorbitdetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitevent: OnorbiteventService by lazy {
        OnorbiteventServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitlist: OnorbitlistService by lazy {
        OnorbitlistServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitsolararray: OnorbitsolararrayService by lazy {
        OnorbitsolararrayServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitthruster: OnorbitthrusterService by lazy {
        OnorbitthrusterServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitthrusterstatus: OnorbitthrusterstatusService by lazy {
        OnorbitthrusterstatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val onorbitassessment: OnorbitassessmentService by lazy {
        OnorbitassessmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val operatingunit: OperatingunitService by lazy {
        OperatingunitServiceImpl(clientOptionsWithUserAgent)
    }

    private val operatingunitremark: OperatingunitremarkService by lazy {
        OperatingunitremarkServiceImpl(clientOptionsWithUserAgent)
    }

    private val orbitdetermination: OrbitdeterminationService by lazy {
        OrbitdeterminationServiceImpl(clientOptionsWithUserAgent)
    }

    private val orbittrack: OrbittrackService by lazy {
        OrbittrackServiceImpl(clientOptionsWithUserAgent)
    }

    private val organization: OrganizationService by lazy {
        OrganizationServiceImpl(clientOptionsWithUserAgent)
    }

    private val organizationdetails: OrganizationdetailService by lazy {
        OrganizationdetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val personnelrecovery: PersonnelrecoveryService by lazy {
        PersonnelrecoveryServiceImpl(clientOptionsWithUserAgent)
    }

    private val poi: PoiService by lazy { PoiServiceImpl(clientOptionsWithUserAgent) }

    private val port: PortService by lazy { PortServiceImpl(clientOptionsWithUserAgent) }

    private val reportAndActivities: ReportAndActivityService by lazy {
        ReportAndActivityServiceImpl(clientOptionsWithUserAgent)
    }

    private val rfBand: RfBandService by lazy { RfBandServiceImpl(clientOptionsWithUserAgent) }

    private val rfBandType: RfBandTypeService by lazy {
        RfBandTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val rfEmitter: RfEmitterService by lazy {
        RfEmitterServiceImpl(clientOptionsWithUserAgent)
    }

    private val routeStats: RouteStatService by lazy {
        RouteStatServiceImpl(clientOptionsWithUserAgent)
    }

    private val sarObservation: SarObservationService by lazy {
        SarObservationServiceImpl(clientOptionsWithUserAgent)
    }

    private val scientific: ScientificService by lazy {
        ScientificServiceImpl(clientOptionsWithUserAgent)
    }

    private val scs: ScService by lazy { ScServiceImpl(clientOptionsWithUserAgent) }

    private val secureMessaging: SecureMessagingService by lazy {
        SecureMessagingServiceImpl(clientOptionsWithUserAgent)
    }

    private val sensor: SensorService by lazy { SensorServiceImpl(clientOptionsWithUserAgent) }

    private val sensorStating: SensorStatingService by lazy {
        SensorStatingServiceImpl(clientOptionsWithUserAgent)
    }

    private val sensorMaintenance: SensorMaintenanceService by lazy {
        SensorMaintenanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val sensorObservationType: SensorObservationTypeService by lazy {
        SensorObservationTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val sensorPlan: SensorPlanService by lazy {
        SensorPlanServiceImpl(clientOptionsWithUserAgent)
    }

    private val sensorType: SensorTypeService by lazy {
        SensorTypeServiceImpl(clientOptionsWithUserAgent)
    }

    private val seraDataCommDetails: SeraDataCommDetailService by lazy {
        SeraDataCommDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val seraDataEarlyWarning: SeraDataEarlyWarningService by lazy {
        SeraDataEarlyWarningServiceImpl(clientOptionsWithUserAgent)
    }

    private val seraDataNavigation: SeraDataNavigationService by lazy {
        SeraDataNavigationServiceImpl(clientOptionsWithUserAgent)
    }

    private val seradataOpticalPayload: SeradataOpticalPayloadService by lazy {
        SeradataOpticalPayloadServiceImpl(clientOptionsWithUserAgent)
    }

    private val seradataRadarPayload: SeradataRadarPayloadService by lazy {
        SeradataRadarPayloadServiceImpl(clientOptionsWithUserAgent)
    }

    private val seradataSigintPayload: SeradataSigintPayloadService by lazy {
        SeradataSigintPayloadServiceImpl(clientOptionsWithUserAgent)
    }

    private val seradataSpacecraftDetails: SeradataSpacecraftDetailService by lazy {
        SeradataSpacecraftDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val sgi: SgiService by lazy { SgiServiceImpl(clientOptionsWithUserAgent) }

    private val sigact: SigactService by lazy { SigactServiceImpl(clientOptionsWithUserAgent) }

    private val site: SiteService by lazy { SiteServiceImpl(clientOptionsWithUserAgent) }

    private val siteRemark: SiteRemarkService by lazy {
        SiteRemarkServiceImpl(clientOptionsWithUserAgent)
    }

    private val siteStatus: SiteStatusService by lazy {
        SiteStatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val skyImagery: SkyImageryService by lazy {
        SkyImageryServiceImpl(clientOptionsWithUserAgent)
    }

    private val soiObservationSet: SoiObservationSetService by lazy {
        SoiObservationSetServiceImpl(clientOptionsWithUserAgent)
    }

    private val solarArray: SolarArrayService by lazy {
        SolarArrayServiceImpl(clientOptionsWithUserAgent)
    }

    private val solarArrayDetails: SolarArrayDetailService by lazy {
        SolarArrayDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val sortiePpr: SortiePprService by lazy {
        SortiePprServiceImpl(clientOptionsWithUserAgent)
    }

    private val spaceEnvObservation: SpaceEnvObservationService by lazy {
        SpaceEnvObservationServiceImpl(clientOptionsWithUserAgent)
    }

    private val stage: StageService by lazy { StageServiceImpl(clientOptionsWithUserAgent) }

    private val starCatalog: StarCatalogService by lazy {
        StarCatalogServiceImpl(clientOptionsWithUserAgent)
    }

    private val stateVector: StateVectorService by lazy {
        StateVectorServiceImpl(clientOptionsWithUserAgent)
    }

    private val status: StatusService by lazy { StatusServiceImpl(clientOptionsWithUserAgent) }

    private val substatus: SubstatusService by lazy {
        SubstatusServiceImpl(clientOptionsWithUserAgent)
    }

    private val supportingData: SupportingDataService by lazy {
        SupportingDataServiceImpl(clientOptionsWithUserAgent)
    }

    private val surface: SurfaceService by lazy { SurfaceServiceImpl(clientOptionsWithUserAgent) }

    private val surfaceObstruction: SurfaceObstructionService by lazy {
        SurfaceObstructionServiceImpl(clientOptionsWithUserAgent)
    }

    private val swir: SwirService by lazy { SwirServiceImpl(clientOptionsWithUserAgent) }

    private val taiUtc: TaiUtcService by lazy { TaiUtcServiceImpl(clientOptionsWithUserAgent) }

    private val tdoaFdoa: TdoaFdoaService by lazy {
        TdoaFdoaServiceImpl(clientOptionsWithUserAgent)
    }

    private val track: TrackService by lazy { TrackServiceImpl(clientOptionsWithUserAgent) }

    private val trackDetails: TrackDetailService by lazy {
        TrackDetailServiceImpl(clientOptionsWithUserAgent)
    }

    private val trackRoute: TrackRouteService by lazy {
        TrackRouteServiceImpl(clientOptionsWithUserAgent)
    }

    private val transponder: TransponderService by lazy {
        TransponderServiceImpl(clientOptionsWithUserAgent)
    }

    private val user: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    private val vessel: VesselService by lazy { VesselServiceImpl(clientOptionsWithUserAgent) }

    private val video: VideoService by lazy { VideoServiceImpl(clientOptionsWithUserAgent) }

    private val weatherData: WeatherDataService by lazy {
        WeatherDataServiceImpl(clientOptionsWithUserAgent)
    }

    private val weatherReport: WeatherReportService by lazy {
        WeatherReportServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): UnifieddatalibraryClientAsync = async

    override fun withRawResponse(): UnifieddatalibraryClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClient =
        UnifieddatalibraryClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airEvents(): AirEventService = airEvents

    override fun airOperations(): AirOperationService = airOperations

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airTransportMissions(): AirTransportMissionService = airTransportMissions

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    override fun aircraft(): AircraftService = aircraft

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun aircraftSorties(): AircraftSortyService = aircraftSorties

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    override fun aircraftStatusRemarks(): AircraftStatusRemarkService = aircraftStatusRemarks

    /**
     * This service provides operations for manipulation and querying of Aircraft and Aircraft
     * Status data. Aircraft contains the static data of the specific aircraft: tail number, cruise
     * speed, max speed, minimum required runway length, etc. The Aircraft Status contains the
     * dynamic data associated with the specific aircraft: remaining fuel, mission readiness, and
     * inventory for example.
     */
    override fun aircraftStatuses(): AircraftStatusService = aircraftStatuses

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService =
        airfieldSlotConsumptions

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfieldSlots(): AirfieldSlotService = airfieldSlots

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfieldStatus(): AirfieldStatusService = airfieldStatus

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun airfields(): AirfieldService = airfields

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airloadPlans(): AirloadPlanService = airloadPlans

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun airspaceControlOrders(): AirspaceControlOrderService = airspaceControlOrders

    /**
     * These services provide for posting and querying of self-reported information obtained from
     * the Automatic Identification System (AIS) equipment. This contains information such as unique
     * identification, status, position, course, and speed. The AIS is an automatic tracking system
     * that uses transceivers on ships and is used by vessel traffic services. Although technically
     * and operationally distinct, the AIS system is analogous to ADS-B which performs a similar
     * function for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow
     * maritime authorities to track and monitor vessel movements. AIS integrates a standardized VHF
     * transceiver with a positioning system, such as Global Positioning System receiver, with other
     * electronic navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted
     * with AIS transceivers can be tracked by AIS base stations located along coastlines or, when
     * out of range of terrestrial networks, through a growing number of satellites that are fitted
     * with special AIS receivers that are capable of deconflicting a large number of signatures.
     */
    override fun ais(): AiService = ais

    /**
     * These services provide for posting and querying of self-reported information obtained from
     * the Automatic Identification System (AIS) equipment. This contains information such as unique
     * identification, status, position, course, and speed. The AIS is an automatic tracking system
     * that uses transceivers on ships and is used by vessel traffic services. Although technically
     * and operationally distinct, the AIS system is analogous to ADS-B which performs a similar
     * function for aircraft. AIS is intended to assist a vessel's watchstanding officers and allow
     * maritime authorities to track and monitor vessel movements. AIS integrates a standardized VHF
     * transceiver with a positioning system, such as Global Positioning System receiver, with other
     * electronic navigation sensors, such as gyrocompass or rate of turn indicator. Vessels fitted
     * with AIS transceivers can be tracked by AIS base stations located along coastlines or, when
     * out of range of terrestrial networks, through a growing number of satellites that are fitted
     * with special AIS receivers that are capable of deconflicting a large number of signatures.
     */
    override fun aisObjects(): AisObjectService = aisObjects

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun analyticImagery(): AnalyticImageryService = analyticImagery

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun antennas(): AntennaService = antennas

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun attitudeData(): AttitudeDataService = attitudeData

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun attitudeSets(): AttitudeSetService = attitudeSets

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun aviationRiskManagement(): AviationRiskManagementService = aviationRiskManagement

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun batteries(): BatteryService = batteries

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun batterydetails(): BatterydetailService = batterydetails

    /**
     * This collection of services provides operations for querying and manipulation of satellite
     * antenna beams, and querying of beam contours and service areas. Beam contours are the
     * geographic representation of the relative gain levels of beam power off of the maximum gain
     * boresight points. Similarly, service areas are the geographic footprints of the areas served
     * by a particular beam, and may be made up of multiple service regions. Well-Known Text (WKT)
     * and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    override fun beam(): BeamService = beam

    /**
     * This collection of services provides operations for querying and manipulation of satellite
     * antenna beams, and querying of beam contours and service areas. Beam contours are the
     * geographic representation of the relative gain levels of beam power off of the maximum gain
     * boresight points. Similarly, service areas are the geographic footprints of the areas served
     * by a particular beam, and may be made up of multiple service regions. Well-Known Text (WKT)
     * and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    override fun beamContours(): BeamContourService = beamContours

    /**
     * Services for querying and manipulation of satellite buses. A bus is the physical and software
     * infrastructure backbone to which on-orbit satellite payloads are attached for power, control,
     * and other support functions.
     */
    override fun buses(): BusService = buses

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun channels(): ChannelService = channels

    /**
     * This collection of services provides operations for manipulating and querying of closely
     * spaced objects (on orbit) operations including docking, rendezvous, proximity and reporting
     * of payload zone engagements observed and characterized over a period of time.
     */
    override fun closelyspacedobjects(): CloselyspacedobjectService = closelyspacedobjects

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun collectRequests(): CollectRequestService = collectRequests

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun collectResponses(): CollectResponseService = collectResponses

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun comm(): CommService = comm

    /** These services provide operations for manipulation and querying of conjunctions. */
    override fun conjunctions(): ConjunctionService = conjunctions

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun cots(): CotService = cots

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun countries(): CountryService = countries

    /**
     * These services provide operations for posting and querying crew data. Crew data contains
     * information about its members and their assignments.
     */
    override fun crew(): CrewService = crew

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun deconflictset(): DeconflictsetService = deconflictset

    /**
     * These services provide operations for querying and manipulation of Signal time and frequency
     * difference of arrival (TDOA/FDOA) information obtained by using passive RF based sensor
     * phenomenologies and sensor triangulation. The J2000 coordinate frame is the preferred frame
     * for all observations, but in some cases observations may be in another frame depending on the
     * provider.
     */
    override fun diffOfArrival(): DiffOfArrivalService = diffOfArrival

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun diplomaticClearance(): DiplomaticClearanceService = diplomaticClearance

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun driftHistory(): DriftHistoryService = driftHistory

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun dropzone(): DropzoneService = dropzone

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun ecpedr(): EcpedrService = ecpedr

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun effectRequests(): EffectRequestService = effectRequests

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun effectResponses(): EffectResponseService = effectResponses

    /**
     * These services provide operations for querying and manipulation of element set data
     * describing orbital characteristics of on-orbit objects. An element set is a collection of
     * parameters that are used, along with an orbit propagator, to predict the motion of a
     * satellite. The element set, or elset for short, consists of identification data, the
     * classical elements and drag parameters.
     */
    override fun elsets(): ElsetService = elsets

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun emireport(): EmireportService = emireport

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun emitterGeolocation(): EmitterGeolocationService = emitterGeolocation

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun engineDetails(): EngineDetailService = engineDetails

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun engines(): EngineService = engines

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun entities(): EntityService = entities

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    override fun eop(): EopService = eop

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun ephemeris(): EphemerisService = ephemeris

    /**
     * These services provide operations for the posting and querying of satellite Ephemeris Point
     * data. Each point contains a position and velocity vector and optionally, an acceleration
     * vector and/or covariance matrix at a specified time. ECI J2K is the preferred reference frame
     * for ephemeris and covariance, however, several user specified reference frames are
     * accommodated. The EphemerisSet ID (esId) identifies the 'EphemerisSet' record which contains
     * details of the underlying data and models used in the generation of the ephemeris as well as
     * a collection of ephemeris points. Points must be retrieved by first identifying a desired
     * EphemerisSet and pulling its points by that EphemerisSet 'esId'.
     */
    override fun ephemerisSets(): EphemerisSetService = ephemerisSets

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    override fun equipment(): EquipmentService = equipment

    /**
     * This collection of services provide operations for manipulating and querying of equipment
     * related data.
     */
    override fun equipmentRemarks(): EquipmentRemarkService = equipmentRemarks

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun evac(): EvacService = evac

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun eventEvolution(): EventEvolutionService = eventEvolution

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun featureAssessment(): FeatureAssessmentService = featureAssessment

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun flightplan(): FlightplanService = flightplan

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun geoStatus(): GeoStatusService = geoStatus

    /**
     * Models and Simulations is a collection of services that allow consumers to interact with data
     * products representing independent models of various phenomenon, artificial intelligence
     * models and predictions, or of mathematical parameters meant to feed mod and sim tools to
     * produce estimates of environmental entities such as atmospheric models and heat maps.
     */
    override fun globalAtmosphericModel(): GlobalAtmosphericModelService = globalAtmosphericModel

    override fun gnssObservations(): GnssObservationService = gnssObservations

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun gnssObservationset(): GnssObservationsetService = gnssObservationset

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun gnssRawIf(): GnssRawIfService = gnssRawIf

    /**
     * This collection of services provides operations for querying and manipulation of ground
     * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata on
     * the image (time, region, source, etc) as well as binary content (typically GeoTIFF). Binary
     * content must be downloaded individually by ID using the 'getFile' operation. Well-Known Text
     * (WKT) and GeoJSON formats are used for GIS representation and query support (see
     * https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/ for more
     * information on these formats).
     */
    override fun groundImagery(): GroundImageryService = groundImagery

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun h3Geo(): H3GeoService = h3Geo

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun h3GeoHexCell(): H3GeoHexCellService = h3GeoHexCell

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun hazard(): HazardService = hazard

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun ionoObservations(): IonoObservationService = ionoObservations

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun ir(): IrService = ir

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun isrCollections(): IsrCollectionService = isrCollections

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun item(): ItemService = item

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun itemTrackings(): ItemTrackingService = itemTrackings

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    override fun laserdeconflictrequest(): LaserdeconflictrequestService = laserdeconflictrequest

    /**
     * This collection of services provides operations for querying and manipulation of laser
     * related information to include the laser emitters, the laser deconflict requests, and laser
     * deconflict responses.
     */
    override fun laseremitter(): LaseremitterService = laseremitter

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchDetection(): LaunchDetectionService = launchDetection

    /**
     * These services provide operations for manipulation and querying of LaunchEvent data. Launch
     * Event data are known space launches, either future or historic records containing items such
     * as the launch site, launch epoch, and object.
     */
    override fun launchEvent(): LaunchEventService = launchEvent

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchSite(): LaunchSiteService = launchSite

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchSiteDetails(): LaunchSiteDetailService = launchSiteDetails

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchVehicle(): LaunchVehicleService = launchVehicle

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun launchVehicleDetails(): LaunchVehicleDetailService = launchVehicleDetails

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    override fun linkStatus(): LinkStatusService = linkStatus

    /**
     * These services provide operations for manipulation and querying tactical data links and link
     * statuses of beams or a satellite constellation. Communication link statuses provide
     * definitions and status such as, positional endpoints, where each endpoint may be associated
     * with a specific beam or with a satellite constellation. Data links provide detailed
     * instructions regarding the operational use of a tactical data link and interface coordination
     * through various message formats.
     */
    override fun linkstatus(): LinkstatusService = linkstatus

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun location(): LocationService = location

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun logisticsSupport(): LogisticsSupportService = logisticsSupport

    /**
     * This service provides operations for querying and manipulation of detected/possible/confirmed
     * on-orbit maneuvers. The J2000 coordinate frame is the preferred frame for all maneuver data,
     * but in some cases data may be in another frame depending on the provider. Check the
     * Storefront 'Data Products' section under the 'Discover' tab for maneuver data provider
     * information.
     */
    override fun maneuvers(): ManeuverService = maneuvers

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun manifold(): ManifoldService = manifold

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun manifoldelset(): ManifoldelsetService = manifoldelset

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun missileTracks(): MissileTrackService = missileTracks

    /**
     * These services provide operations for manipulation and querying of mission assignment
     * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign missions,
     * designate targets, and provide target information to non-C2 JU platforms. Provision is made
     * for the non-C2 JU platforms to acknowledge the message through receipt/compliance action.
     */
    override fun missionAssignment(): MissionAssignmentService = missionAssignment

    /**
     * These services provide operations for posting and querying Moving Target Indicator (MTI)
     * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less detailed
     * data for applications such as situational awareness used/derived by exploitation systems.
     */
    override fun mti(): MtiService = mti

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun navigation(): NavigationService = navigation

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun navigationalObstruction(): NavigationalObstructionService = navigationalObstruction

    /**
     * A Notification Service allowing the broadcast of generic messages to the community. Users can
     * send free-form messages, publish lists, and notify the community about events or alerts
     * across various domains. Notifications and alerts are categorized by a 'msgType' field and are
     * accessible via the UDL Secure Messaging API and REST API services.
     */
    override fun notification(): NotificationService = notification

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun objectOfInterest(): ObjectOfInterestService = objectOfInterest

    override fun observations(): ObservationService = observations

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun onboardnavigation(): OnboardnavigationService = onboardnavigation

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbit(): OnorbitService = onorbit

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitantenna(): OnorbitantennaService = onorbitantenna

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitbattery(): OnorbitbatteryService = onorbitbattery

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitdetails(): OnorbitdetailService = onorbitdetails

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitevent(): OnorbiteventService = onorbitevent

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitlist(): OnorbitlistService = onorbitlist

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitsolararray(): OnorbitsolararrayService = onorbitsolararray

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitthruster(): OnorbitthrusterService = onorbitthruster

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun onorbitthrusterstatus(): OnorbitthrusterstatusService = onorbitthrusterstatus

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun onorbitassessment(): OnorbitassessmentService = onorbitassessment

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun operatingunit(): OperatingunitService = operatingunit

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun operatingunitremark(): OperatingunitremarkService = operatingunitremark

    /**
     * These services provide operations for manipulating and querying Orbit Determination (OD)
     * data. Orbit Determination data contains algorithm results that describe General Perturbations
     * or Special Perturbations orbital updates.
     */
    override fun orbitdetermination(): OrbitdeterminationService = orbitdetermination

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun orbittrack(): OrbittrackService = orbittrack

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun organization(): OrganizationService = organization

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun organizationdetails(): OrganizationdetailService = organizationdetails

    /**
     * These services provide operations for manipulation and querying of Mission Ops information.
     */
    override fun personnelrecovery(): PersonnelrecoveryService = personnelrecovery

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun poi(): PoiService = poi

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun port(): PortService = port

    override fun reportAndActivities(): ReportAndActivityService = reportAndActivities

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    override fun rfBand(): RfBandService = rfBand

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    override fun rfBandType(): RfBandTypeService = rfBandType

    /**
     * This collection of services provides operations for querying and manipulation of RF related
     * information to include RFEmitters which could potentially interfere with
     * communications/operations of space related entities, and RFBands commonly used by various
     * space related entities.
     */
    override fun rfEmitter(): RfEmitterService = rfEmitter

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun routeStats(): RouteStatService = routeStats

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun sarObservation(): SarObservationService = sarObservation

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun scientific(): ScientificService = scientific

    override fun scs(): ScService = scs

    /**
     * Secure Messaging is based on Apache Kafka which is an open-source stream-processing software
     * platform developed by the Apache Software Foundation, written in Scala and Java. Kafka
     * provides a unified, high-throughput, low-latency platform for handling real-time data feeds.
     * All messaging is secured; consumers will not receive messages unless authorized to do so.
     * J2000 is the preferred coordinate frame for all observations, but in some cases observations
     * may be in another frame depending on the provider. Please see the 'Discover' tab in the
     * storefront to confirm coordinate frames by data provider.
     */
    override fun secureMessaging(): SecureMessagingService = secureMessaging

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensor(): SensorService = sensor

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorStating(): SensorStatingService = sensorStating

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorMaintenance(): SensorMaintenanceService = sensorMaintenance

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorObservationType(): SensorObservationTypeService = sensorObservationType

    /** These services provide operations for posting and querying Sensor Tasking data. */
    override fun sensorPlan(): SensorPlanService = sensorPlan

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun sensorType(): SensorTypeService = sensorType

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun seraDataCommDetails(): SeraDataCommDetailService = seraDataCommDetails

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun seraDataEarlyWarning(): SeraDataEarlyWarningService = seraDataEarlyWarning

    /** These services provide operations for manipulation and querying of on-orbit payloads. */
    override fun seraDataNavigation(): SeraDataNavigationService = seraDataNavigation

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun seradataOpticalPayload(): SeradataOpticalPayloadService = seradataOpticalPayload

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun seradataRadarPayload(): SeradataRadarPayloadService = seradataRadarPayload

    /**
     * This service provides operations for querying and manipulation of sensor data. Sensors are
     * terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
     * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and Radio
     * Frequency (RF). This collection of operations includes 'SensorMaintenance' schedules which
     * define known/planned future maintenance and associated operational impact of sensors as well
     * as 'SensorCalibration' records which contains data about a sensor's overall accuracy and is
     * used to adjust sensor settings.
     */
    override fun seradataSigintPayload(): SeradataSigintPayloadService = seradataSigintPayload

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService =
        seradataSpacecraftDetails

    /**
     * This service provides operations for manipulation and querying of space weather/solar,
     * geomagnetic, and radiation belt index data.
     */
    override fun sgi(): SgiService = sgi

    /**
     * These services provide operations for manipulation and querying of Report and Activity
     * information. This information includes analytic reports, significant events, route
     * statistics, EMI Reports, and other georeferenced reports and activities.
     */
    override fun sigact(): SigactService = sigact

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun site(): SiteService = site

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun siteRemark(): SiteRemarkService = siteRemark

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun siteStatus(): SiteStatusService = siteStatus

    /**
     * This collection of services provides operations for querying and manipulation of sky imagery
     * data. Sky imagery is ground or space based telescope imagery of RSO's and includes metadata
     * on the image (time, source, etc) as well as binary image content (e.g. FITS, EOSSA, EOCHIP,
     * MP4). Binary content must be downloaded individually by ID using the 'getFile' operation.
     */
    override fun skyImagery(): SkyImageryService = skyImagery

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun soiObservationSet(): SoiObservationSetService = soiObservationSet

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun solarArray(): SolarArrayService = solarArray

    /**
     * These services provide operations for manipulation and querying of on-orbit objects of
     * interest, their components, and various lists and status of those objects.
     */
    override fun solarArrayDetails(): SolarArrayDetailService = solarArrayDetails

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun sortiePpr(): SortiePprService = sortiePpr

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun spaceEnvObservation(): SpaceEnvObservationService = spaceEnvObservation

    /**
     * Collection of launch related services which provide operations for querying and manipulation
     * of launch site data and detailed information on launch vehicles including engines, stages,
     * and manufacturers. Sites, engines, and stages can each have multiple 'detail' records which
     * may be compiled by different sources.
     */
    override fun stage(): StageService = stage

    /**
     * These services provide operations for posting and querying Star Catalog data. The Star
     * Catalog model is a representation of astronomical data and photometric data for stars.
     * Astronomical data includes positional information, proper motions, parallaxes and their
     * respective uncertainties. Photometric data contains optical and near-infrared magnitudes, and
     * their uncertainties across multiple bandpasses. Note: Multiple source catalogs may contribute
     * to a single record.
     */
    override fun starCatalog(): StarCatalogService = starCatalog

    /**
     * This service provides operations for querying and manipulation of state vectors for On-orbit
     * objects. State vectors are cartesian vectors of position (r) and velocity (v) that together
     * with their time (epoch) (t) uniquely determine the trajectory of the orbiting body in space.
     * J2000 is the preferred coordinate frame for all state vector positions/velocities in UDL, but
     * in some cases data may be in another frame depending on the provider and/or datatype. Please
     * see the 'Discover' tab in the storefront to confirm coordinate frames by data provider.
     */
    override fun stateVector(): StateVectorService = stateVector

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun status(): StatusService = status

    /**
     * Service operations for querying and manipulation of miscellaneous supporting data such as
     * countries (which can represent countries, multi-national consortiums, and international
     * organizations), data owners, locations, entities, organizations, etc.
     */
    override fun substatus(): SubstatusService = substatus

    override fun supportingData(): SupportingDataService = supportingData

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun surface(): SurfaceService = surface

    /**
     * This collection of services provide operations for manipulating and querying of various site
     * related data, including site status, site operations, and site type-specific records.
     */
    override fun surfaceObstruction(): SurfaceObstructionService = surfaceObstruction

    /**
     * This collection of services provides operations for querying and manipulation of
     * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
     * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
     * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
     * some cases observations may be in an alternate frame depending on the provider and/or
     * datatype.
     */
    override fun swir(): SwirService = swir

    /**
     * This service provides operations for manipulation and querying of earth orientation parameter
     * (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS (International Earth
     * Rotation and Reference Systems Service). Earth Orientation Parameters describe the
     * irregularities of the earth's rotation. Technically, they are the parameters which provide
     * the rotation of the ITRS (International Terrestrial Reference System) to the ICRS
     * (International Celestial Reference System) as a function of time. Universal time -- Universal
     * time (UT1) is the time of the earth clock, which performs one revolution in about 24h. It is
     * practically proportional to the sidereal time. The excess revolution time is called length of
     * day (LOD). Coordinates of the pole -- x and y are the coordinates of the Celestial Ephemeris
     * Pole (CEP) relative to the IRP, the IERS Reference Pole. The CEP differs from the
     * instantaneous rotation axis by quasi-diurnal terms with amplitudes under 0.01" (see
     * Seidelmann, 1982). The x-axis is in the direction of the ITRF zero-meridian; the y-axis is in
     * the direction 90 degrees West longitude. Celestial pole offsets -- Celestial pole offsets are
     * described in the IAU Precession and Nutation models. The observed differences with respect to
     * the conventional celestial pole position defined by the models are monitored and reported by
     * the IERS. IERS Bulletins A and B provide current information on the Earth's orientation in
     * the IERS Reference System. This includes Universal Time, coordinates of the terrestrial pole,
     * and celestial pole offsets. Bulletin A gives an advanced solution updated weekly; the
     * standard solution is given monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B
     * values. All solutions are continuous within their respective uncertainties. Bulletin A is
     * issued by the IERS Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington,
     * DC and Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory.
     * IERS Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
     * offsets at daily intervals based on a combination of contributed analysis results using data
     * from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
     * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
     * variations a year into the future are also provided. Meteorological predictions of variations
     * in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of near-term UT1-UTC
     * changes. This publication is prepared by the IERS Rapid Service/Prediction Center.
     */
    override fun taiUtc(): TaiUtcService = taiUtc

    override fun tdoaFdoa(): TdoaFdoaService = tdoaFdoa

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun track(): TrackService = track

    /**
     * These services provide operations for posting and querying of air, space, and ground
     * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
     * particular timestamp.
     */
    override fun trackDetails(): TrackDetailService = trackDetails

    /**
     * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
     * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
     * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
     * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and Aviation
     * Risk Management data. Aircraft Sortie information contains static and dynamic aircraft
     * assignments, departure and arrival times, and remarks. Aircraft Mission information contains
     * static data for mission planning to include assigned aircraft and crews, cargo pickup and
     * dropoff locations, unique identifiers, and prioritization. Item Tracking information contains
     * data for tracking an item from its origin to destination and how it may be configured during
     * transport. Flight Plan information contains schedule and route details. Air Event provides
     * information concerning various aerial events such as fuel transfer and air drops, as well as
     * the associated aircraft involved. Sortie PPR information contains details on operational
     * access to a runway, taxiway, or airport service. Diplomatic Clearance information contains
     * details on the issuance and coordination of aircraft clearance requests. Diplomatic Clearance
     * Country provides information such as entry/exit points, requirements, and points of contact
     * for countries diplomatic clearances are being created for. Airspace Control Order provides
     * information concerning the allocation, restriction, and deconfliction of airspace. Air
     * Tasking Order information contains details on the coordination of air missions and their
     * tasks, resources, and timelines. Navigational Obstruction provides the locations,
     * characteristics, and boundaries of obstacles and structures that can restrict or interfere
     * with navigation. Logistics Support contains information regarding the transport and
     * maintenance of resources and equipment to sustain air operations. Track Route information
     * defines specific flight paths used by aircraft during the transport of fuel and other
     * resources. Air Load Plan information provides mission actuals concerning the loading and air
     * transport of cargo and passengers. Aviation Risk Management information help aid in mission
     * planning by accounting for factors such as mission complexity and crew fatigue.
     */
    override fun trackRoute(): TrackRouteService = trackRoute

    /**
     * These services provide operations for manipulation and querying of on-orbit communications
     * payloads (Comm), including supporting data such as transponders and channels, etc.
     */
    override fun transponder(): TransponderService = transponder

    override fun user(): UserService = user

    /**
     * This service provides operations for manipulation and querying of maritime Vessel and Vessel
     * Status data. Vessel contains the static data of the specific vessel: mmsi, cruise speed, max
     * speed, etc.
     */
    override fun vessel(): VesselService = vessel

    override fun video(): VideoService = video

    /**
     * These services provide for posting and querying terrestrial weather conditions over a target
     * area or region and raw sensor data used to produce condition reports. Weather Reports
     * describe current weather conditions over a target point or region to include general
     * temperatures, pressures, and moisture accumulation, as well as navigational considerations
     * such as altimeter settings, visibility, wind speeds, and cloud heights etc. Weather Data
     * contains algorithmic parameters and dynamic, raw measurements collected by individual sensors
     * such as signal power, noise level, etc., which are generally processed across multiple
     * sensors to produce weather reports.
     */
    override fun weatherData(): WeatherDataService = weatherData

    /**
     * These services provide for posting and querying terrestrial weather conditions over a target
     * area or region and raw sensor data used to produce condition reports. Weather Reports
     * describe current weather conditions over a target point or region to include general
     * temperatures, pressures, and moisture accumulation, as well as navigational considerations
     * such as altimeter settings, visibility, wind speeds, and cloud heights etc. Weather Data
     * contains algorithmic parameters and dynamic, raw measurements collected by individual sensors
     * such as signal power, noise level, etc., which are generally processed across multiple
     * sensors to produce weather reports.
     */
    override fun weatherReport(): WeatherReportService = weatherReport

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UnifieddatalibraryClient.WithRawResponse {

        private val airEvents: AirEventService.WithRawResponse by lazy {
            AirEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airOperations: AirOperationService.WithRawResponse by lazy {
            AirOperationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airTransportMissions: AirTransportMissionService.WithRawResponse by lazy {
            AirTransportMissionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraft: AircraftService.WithRawResponse by lazy {
            AircraftServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftSorties: AircraftSortyService.WithRawResponse by lazy {
            AircraftSortyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftStatusRemarks: AircraftStatusRemarkService.WithRawResponse by lazy {
            AircraftStatusRemarkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aircraftStatuses: AircraftStatusService.WithRawResponse by lazy {
            AircraftStatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldSlotConsumptions:
            AirfieldSlotConsumptionService.WithRawResponse by lazy {
            AirfieldSlotConsumptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldSlots: AirfieldSlotService.WithRawResponse by lazy {
            AirfieldSlotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfieldStatus: AirfieldStatusService.WithRawResponse by lazy {
            AirfieldStatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airfields: AirfieldService.WithRawResponse by lazy {
            AirfieldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airloadPlans: AirloadPlanService.WithRawResponse by lazy {
            AirloadPlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val airspaceControlOrders: AirspaceControlOrderService.WithRawResponse by lazy {
            AirspaceControlOrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ais: AiService.WithRawResponse by lazy {
            AiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aisObjects: AisObjectService.WithRawResponse by lazy {
            AisObjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val analyticImagery: AnalyticImageryService.WithRawResponse by lazy {
            AnalyticImageryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val antennas: AntennaService.WithRawResponse by lazy {
            AntennaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val attitudeData: AttitudeDataService.WithRawResponse by lazy {
            AttitudeDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val attitudeSets: AttitudeSetService.WithRawResponse by lazy {
            AttitudeSetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aviationRiskManagement: AviationRiskManagementService.WithRawResponse by lazy {
            AviationRiskManagementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batteries: BatteryService.WithRawResponse by lazy {
            BatteryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val batterydetails: BatterydetailService.WithRawResponse by lazy {
            BatterydetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val beam: BeamService.WithRawResponse by lazy {
            BeamServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val beamContours: BeamContourService.WithRawResponse by lazy {
            BeamContourServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val buses: BusService.WithRawResponse by lazy {
            BusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val channels: ChannelService.WithRawResponse by lazy {
            ChannelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val closelyspacedobjects: CloselyspacedobjectService.WithRawResponse by lazy {
            CloselyspacedobjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val collectRequests: CollectRequestService.WithRawResponse by lazy {
            CollectRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val collectResponses: CollectResponseService.WithRawResponse by lazy {
            CollectResponseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val comm: CommService.WithRawResponse by lazy {
            CommServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val conjunctions: ConjunctionService.WithRawResponse by lazy {
            ConjunctionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cots: CotService.WithRawResponse by lazy {
            CotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val countries: CountryService.WithRawResponse by lazy {
            CountryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val crew: CrewService.WithRawResponse by lazy {
            CrewServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val deconflictset: DeconflictsetService.WithRawResponse by lazy {
            DeconflictsetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val diffOfArrival: DiffOfArrivalService.WithRawResponse by lazy {
            DiffOfArrivalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val diplomaticClearance: DiplomaticClearanceService.WithRawResponse by lazy {
            DiplomaticClearanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val driftHistory: DriftHistoryService.WithRawResponse by lazy {
            DriftHistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val dropzone: DropzoneService.WithRawResponse by lazy {
            DropzoneServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ecpedr: EcpedrService.WithRawResponse by lazy {
            EcpedrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val effectRequests: EffectRequestService.WithRawResponse by lazy {
            EffectRequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val effectResponses: EffectResponseService.WithRawResponse by lazy {
            EffectResponseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val elsets: ElsetService.WithRawResponse by lazy {
            ElsetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val emireport: EmireportService.WithRawResponse by lazy {
            EmireportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val emitterGeolocation: EmitterGeolocationService.WithRawResponse by lazy {
            EmitterGeolocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val engineDetails: EngineDetailService.WithRawResponse by lazy {
            EngineDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val engines: EngineService.WithRawResponse by lazy {
            EngineServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entities: EntityService.WithRawResponse by lazy {
            EntityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val eop: EopService.WithRawResponse by lazy {
            EopServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemeris: EphemerisService.WithRawResponse by lazy {
            EphemerisServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ephemerisSets: EphemerisSetService.WithRawResponse by lazy {
            EphemerisSetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val equipment: EquipmentService.WithRawResponse by lazy {
            EquipmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val equipmentRemarks: EquipmentRemarkService.WithRawResponse by lazy {
            EquipmentRemarkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val evac: EvacService.WithRawResponse by lazy {
            EvacServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventEvolution: EventEvolutionService.WithRawResponse by lazy {
            EventEvolutionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val featureAssessment: FeatureAssessmentService.WithRawResponse by lazy {
            FeatureAssessmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val flightplan: FlightplanService.WithRawResponse by lazy {
            FlightplanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val geoStatus: GeoStatusService.WithRawResponse by lazy {
            GeoStatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val globalAtmosphericModel: GlobalAtmosphericModelService.WithRawResponse by lazy {
            GlobalAtmosphericModelServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssObservations: GnssObservationService.WithRawResponse by lazy {
            GnssObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssObservationset: GnssObservationsetService.WithRawResponse by lazy {
            GnssObservationsetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val gnssRawIf: GnssRawIfService.WithRawResponse by lazy {
            GnssRawIfServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val groundImagery: GroundImageryService.WithRawResponse by lazy {
            GroundImageryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val h3Geo: H3GeoService.WithRawResponse by lazy {
            H3GeoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val h3GeoHexCell: H3GeoHexCellService.WithRawResponse by lazy {
            H3GeoHexCellServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val hazard: HazardService.WithRawResponse by lazy {
            HazardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ionoObservations: IonoObservationService.WithRawResponse by lazy {
            IonoObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ir: IrService.WithRawResponse by lazy {
            IrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val isrCollections: IsrCollectionService.WithRawResponse by lazy {
            IsrCollectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val item: ItemService.WithRawResponse by lazy {
            ItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val itemTrackings: ItemTrackingService.WithRawResponse by lazy {
            ItemTrackingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val laserdeconflictrequest: LaserdeconflictrequestService.WithRawResponse by lazy {
            LaserdeconflictrequestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val laseremitter: LaseremitterService.WithRawResponse by lazy {
            LaseremitterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchDetection: LaunchDetectionService.WithRawResponse by lazy {
            LaunchDetectionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchEvent: LaunchEventService.WithRawResponse by lazy {
            LaunchEventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchSite: LaunchSiteService.WithRawResponse by lazy {
            LaunchSiteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchSiteDetails: LaunchSiteDetailService.WithRawResponse by lazy {
            LaunchSiteDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchVehicle: LaunchVehicleService.WithRawResponse by lazy {
            LaunchVehicleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val launchVehicleDetails: LaunchVehicleDetailService.WithRawResponse by lazy {
            LaunchVehicleDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkStatus: LinkStatusService.WithRawResponse by lazy {
            LinkStatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val linkstatus: LinkstatusService.WithRawResponse by lazy {
            LinkstatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val location: LocationService.WithRawResponse by lazy {
            LocationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val logisticsSupport: LogisticsSupportService.WithRawResponse by lazy {
            LogisticsSupportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val maneuvers: ManeuverService.WithRawResponse by lazy {
            ManeuverServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val manifold: ManifoldService.WithRawResponse by lazy {
            ManifoldServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val manifoldelset: ManifoldelsetService.WithRawResponse by lazy {
            ManifoldelsetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val missileTracks: MissileTrackService.WithRawResponse by lazy {
            MissileTrackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val missionAssignment: MissionAssignmentService.WithRawResponse by lazy {
            MissionAssignmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val mti: MtiService.WithRawResponse by lazy {
            MtiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigation: NavigationService.WithRawResponse by lazy {
            NavigationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val navigationalObstruction:
            NavigationalObstructionService.WithRawResponse by lazy {
            NavigationalObstructionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val notification: NotificationService.WithRawResponse by lazy {
            NotificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val objectOfInterest: ObjectOfInterestService.WithRawResponse by lazy {
            ObjectOfInterestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val observations: ObservationService.WithRawResponse by lazy {
            ObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onboardnavigation: OnboardnavigationService.WithRawResponse by lazy {
            OnboardnavigationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbit: OnorbitService.WithRawResponse by lazy {
            OnorbitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitantenna: OnorbitantennaService.WithRawResponse by lazy {
            OnorbitantennaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitbattery: OnorbitbatteryService.WithRawResponse by lazy {
            OnorbitbatteryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitdetails: OnorbitdetailService.WithRawResponse by lazy {
            OnorbitdetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitevent: OnorbiteventService.WithRawResponse by lazy {
            OnorbiteventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitlist: OnorbitlistService.WithRawResponse by lazy {
            OnorbitlistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitsolararray: OnorbitsolararrayService.WithRawResponse by lazy {
            OnorbitsolararrayServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitthruster: OnorbitthrusterService.WithRawResponse by lazy {
            OnorbitthrusterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitthrusterstatus: OnorbitthrusterstatusService.WithRawResponse by lazy {
            OnorbitthrusterstatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val onorbitassessment: OnorbitassessmentService.WithRawResponse by lazy {
            OnorbitassessmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatingunit: OperatingunitService.WithRawResponse by lazy {
            OperatingunitServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val operatingunitremark: OperatingunitremarkService.WithRawResponse by lazy {
            OperatingunitremarkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orbitdetermination: OrbitdeterminationService.WithRawResponse by lazy {
            OrbitdeterminationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val orbittrack: OrbittrackService.WithRawResponse by lazy {
            OrbittrackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val organization: OrganizationService.WithRawResponse by lazy {
            OrganizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val organizationdetails: OrganizationdetailService.WithRawResponse by lazy {
            OrganizationdetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val personnelrecovery: PersonnelrecoveryService.WithRawResponse by lazy {
            PersonnelrecoveryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val poi: PoiService.WithRawResponse by lazy {
            PoiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val port: PortService.WithRawResponse by lazy {
            PortServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reportAndActivities: ReportAndActivityService.WithRawResponse by lazy {
            ReportAndActivityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfBand: RfBandService.WithRawResponse by lazy {
            RfBandServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfBandType: RfBandTypeService.WithRawResponse by lazy {
            RfBandTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val rfEmitter: RfEmitterService.WithRawResponse by lazy {
            RfEmitterServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val routeStats: RouteStatService.WithRawResponse by lazy {
            RouteStatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sarObservation: SarObservationService.WithRawResponse by lazy {
            SarObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scientific: ScientificService.WithRawResponse by lazy {
            ScientificServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val scs: ScService.WithRawResponse by lazy {
            ScServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val secureMessaging: SecureMessagingService.WithRawResponse by lazy {
            SecureMessagingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensor: SensorService.WithRawResponse by lazy {
            SensorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorStating: SensorStatingService.WithRawResponse by lazy {
            SensorStatingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorMaintenance: SensorMaintenanceService.WithRawResponse by lazy {
            SensorMaintenanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorObservationType: SensorObservationTypeService.WithRawResponse by lazy {
            SensorObservationTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorPlan: SensorPlanService.WithRawResponse by lazy {
            SensorPlanServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sensorType: SensorTypeService.WithRawResponse by lazy {
            SensorTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataCommDetails: SeraDataCommDetailService.WithRawResponse by lazy {
            SeraDataCommDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataEarlyWarning: SeraDataEarlyWarningService.WithRawResponse by lazy {
            SeraDataEarlyWarningServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seraDataNavigation: SeraDataNavigationService.WithRawResponse by lazy {
            SeraDataNavigationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataOpticalPayload: SeradataOpticalPayloadService.WithRawResponse by lazy {
            SeradataOpticalPayloadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataRadarPayload: SeradataRadarPayloadService.WithRawResponse by lazy {
            SeradataRadarPayloadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataSigintPayload: SeradataSigintPayloadService.WithRawResponse by lazy {
            SeradataSigintPayloadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val seradataSpacecraftDetails:
            SeradataSpacecraftDetailService.WithRawResponse by lazy {
            SeradataSpacecraftDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sgi: SgiService.WithRawResponse by lazy {
            SgiServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sigact: SigactService.WithRawResponse by lazy {
            SigactServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val site: SiteService.WithRawResponse by lazy {
            SiteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteRemark: SiteRemarkService.WithRawResponse by lazy {
            SiteRemarkServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val siteStatus: SiteStatusService.WithRawResponse by lazy {
            SiteStatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val skyImagery: SkyImageryService.WithRawResponse by lazy {
            SkyImageryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val soiObservationSet: SoiObservationSetService.WithRawResponse by lazy {
            SoiObservationSetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val solarArray: SolarArrayService.WithRawResponse by lazy {
            SolarArrayServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val solarArrayDetails: SolarArrayDetailService.WithRawResponse by lazy {
            SolarArrayDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val sortiePpr: SortiePprService.WithRawResponse by lazy {
            SortiePprServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val spaceEnvObservation: SpaceEnvObservationService.WithRawResponse by lazy {
            SpaceEnvObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stage: StageService.WithRawResponse by lazy {
            StageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val starCatalog: StarCatalogService.WithRawResponse by lazy {
            StarCatalogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stateVector: StateVectorService.WithRawResponse by lazy {
            StateVectorServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val status: StatusService.WithRawResponse by lazy {
            StatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val substatus: SubstatusService.WithRawResponse by lazy {
            SubstatusServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val supportingData: SupportingDataService.WithRawResponse by lazy {
            SupportingDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val surface: SurfaceService.WithRawResponse by lazy {
            SurfaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val surfaceObstruction: SurfaceObstructionService.WithRawResponse by lazy {
            SurfaceObstructionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val swir: SwirService.WithRawResponse by lazy {
            SwirServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val taiUtc: TaiUtcService.WithRawResponse by lazy {
            TaiUtcServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tdoaFdoa: TdoaFdoaService.WithRawResponse by lazy {
            TdoaFdoaServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val track: TrackService.WithRawResponse by lazy {
            TrackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val trackDetails: TrackDetailService.WithRawResponse by lazy {
            TrackDetailServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val trackRoute: TrackRouteService.WithRawResponse by lazy {
            TrackRouteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transponder: TransponderService.WithRawResponse by lazy {
            TransponderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val user: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vessel: VesselService.WithRawResponse by lazy {
            VesselServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val video: VideoService.WithRawResponse by lazy {
            VideoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val weatherData: WeatherDataService.WithRawResponse by lazy {
            WeatherDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val weatherReport: WeatherReportService.WithRawResponse by lazy {
            WeatherReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UnifieddatalibraryClient.WithRawResponse =
            UnifieddatalibraryClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airEvents(): AirEventService.WithRawResponse = airEvents

        override fun airOperations(): AirOperationService.WithRawResponse = airOperations

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airTransportMissions(): AirTransportMissionService.WithRawResponse =
            airTransportMissions

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        override fun aircraft(): AircraftService.WithRawResponse = aircraft

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun aircraftSorties(): AircraftSortyService.WithRawResponse = aircraftSorties

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        override fun aircraftStatusRemarks(): AircraftStatusRemarkService.WithRawResponse =
            aircraftStatusRemarks

        /**
         * This service provides operations for manipulation and querying of Aircraft and Aircraft
         * Status data. Aircraft contains the static data of the specific aircraft: tail number,
         * cruise speed, max speed, minimum required runway length, etc. The Aircraft Status
         * contains the dynamic data associated with the specific aircraft: remaining fuel, mission
         * readiness, and inventory for example.
         */
        override fun aircraftStatuses(): AircraftStatusService.WithRawResponse = aircraftStatuses

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService.WithRawResponse =
            airfieldSlotConsumptions

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfieldSlots(): AirfieldSlotService.WithRawResponse = airfieldSlots

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfieldStatus(): AirfieldStatusService.WithRawResponse = airfieldStatus

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun airfields(): AirfieldService.WithRawResponse = airfields

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airloadPlans(): AirloadPlanService.WithRawResponse = airloadPlans

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse =
            airspaceControlOrders

        /**
         * These services provide for posting and querying of self-reported information obtained
         * from the Automatic Identification System (AIS) equipment. This contains information such
         * as unique identification, status, position, course, and speed. The AIS is an automatic
         * tracking system that uses transceivers on ships and is used by vessel traffic services.
         * Although technically and operationally distinct, the AIS system is analogous to ADS-B
         * which performs a similar function for aircraft. AIS is intended to assist a vessel's
         * watchstanding officers and allow maritime authorities to track and monitor vessel
         * movements. AIS integrates a standardized VHF transceiver with a positioning system, such
         * as Global Positioning System receiver, with other electronic navigation sensors, such as
         * gyrocompass or rate of turn indicator. Vessels fitted with AIS transceivers can be
         * tracked by AIS base stations located along coastlines or, when out of range of
         * terrestrial networks, through a growing number of satellites that are fitted with special
         * AIS receivers that are capable of deconflicting a large number of signatures.
         */
        override fun ais(): AiService.WithRawResponse = ais

        /**
         * These services provide for posting and querying of self-reported information obtained
         * from the Automatic Identification System (AIS) equipment. This contains information such
         * as unique identification, status, position, course, and speed. The AIS is an automatic
         * tracking system that uses transceivers on ships and is used by vessel traffic services.
         * Although technically and operationally distinct, the AIS system is analogous to ADS-B
         * which performs a similar function for aircraft. AIS is intended to assist a vessel's
         * watchstanding officers and allow maritime authorities to track and monitor vessel
         * movements. AIS integrates a standardized VHF transceiver with a positioning system, such
         * as Global Positioning System receiver, with other electronic navigation sensors, such as
         * gyrocompass or rate of turn indicator. Vessels fitted with AIS transceivers can be
         * tracked by AIS base stations located along coastlines or, when out of range of
         * terrestrial networks, through a growing number of satellites that are fitted with special
         * AIS receivers that are capable of deconflicting a large number of signatures.
         */
        override fun aisObjects(): AisObjectService.WithRawResponse = aisObjects

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun analyticImagery(): AnalyticImageryService.WithRawResponse = analyticImagery

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun antennas(): AntennaService.WithRawResponse = antennas

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun attitudeData(): AttitudeDataService.WithRawResponse = attitudeData

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun attitudeSets(): AttitudeSetService.WithRawResponse = attitudeSets

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun aviationRiskManagement(): AviationRiskManagementService.WithRawResponse =
            aviationRiskManagement

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun batteries(): BatteryService.WithRawResponse = batteries

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun batterydetails(): BatterydetailService.WithRawResponse = batterydetails

        /**
         * This collection of services provides operations for querying and manipulation of
         * satellite antenna beams, and querying of beam contours and service areas. Beam contours
         * are the geographic representation of the relative gain levels of beam power off of the
         * maximum gain boresight points. Similarly, service areas are the geographic footprints of
         * the areas served by a particular beam, and may be made up of multiple service regions.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        override fun beam(): BeamService.WithRawResponse = beam

        /**
         * This collection of services provides operations for querying and manipulation of
         * satellite antenna beams, and querying of beam contours and service areas. Beam contours
         * are the geographic representation of the relative gain levels of beam power off of the
         * maximum gain boresight points. Similarly, service areas are the geographic footprints of
         * the areas served by a particular beam, and may be made up of multiple service regions.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        override fun beamContours(): BeamContourService.WithRawResponse = beamContours

        /**
         * Services for querying and manipulation of satellite buses. A bus is the physical and
         * software infrastructure backbone to which on-orbit satellite payloads are attached for
         * power, control, and other support functions.
         */
        override fun buses(): BusService.WithRawResponse = buses

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun channels(): ChannelService.WithRawResponse = channels

        /**
         * This collection of services provides operations for manipulating and querying of closely
         * spaced objects (on orbit) operations including docking, rendezvous, proximity and
         * reporting of payload zone engagements observed and characterized over a period of time.
         */
        override fun closelyspacedobjects(): CloselyspacedobjectService.WithRawResponse =
            closelyspacedobjects

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun collectRequests(): CollectRequestService.WithRawResponse = collectRequests

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun collectResponses(): CollectResponseService.WithRawResponse = collectResponses

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun comm(): CommService.WithRawResponse = comm

        /** These services provide operations for manipulation and querying of conjunctions. */
        override fun conjunctions(): ConjunctionService.WithRawResponse = conjunctions

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun cots(): CotService.WithRawResponse = cots

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun countries(): CountryService.WithRawResponse = countries

        /**
         * These services provide operations for posting and querying crew data. Crew data contains
         * information about its members and their assignments.
         */
        override fun crew(): CrewService.WithRawResponse = crew

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun deconflictset(): DeconflictsetService.WithRawResponse = deconflictset

        /**
         * These services provide operations for querying and manipulation of Signal time and
         * frequency difference of arrival (TDOA/FDOA) information obtained by using passive RF
         * based sensor phenomenologies and sensor triangulation. The J2000 coordinate frame is the
         * preferred frame for all observations, but in some cases observations may be in another
         * frame depending on the provider.
         */
        override fun diffOfArrival(): DiffOfArrivalService.WithRawResponse = diffOfArrival

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse =
            diplomaticClearance

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun driftHistory(): DriftHistoryService.WithRawResponse = driftHistory

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun dropzone(): DropzoneService.WithRawResponse = dropzone

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun ecpedr(): EcpedrService.WithRawResponse = ecpedr

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun effectRequests(): EffectRequestService.WithRawResponse = effectRequests

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun effectResponses(): EffectResponseService.WithRawResponse = effectResponses

        /**
         * These services provide operations for querying and manipulation of element set data
         * describing orbital characteristics of on-orbit objects. An element set is a collection of
         * parameters that are used, along with an orbit propagator, to predict the motion of a
         * satellite. The element set, or elset for short, consists of identification data, the
         * classical elements and drag parameters.
         */
        override fun elsets(): ElsetService.WithRawResponse = elsets

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun emireport(): EmireportService.WithRawResponse = emireport

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun emitterGeolocation(): EmitterGeolocationService.WithRawResponse =
            emitterGeolocation

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun engineDetails(): EngineDetailService.WithRawResponse = engineDetails

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun engines(): EngineService.WithRawResponse = engines

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun entities(): EntityService.WithRawResponse = entities

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        override fun eop(): EopService.WithRawResponse = eop

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun ephemeris(): EphemerisService.WithRawResponse = ephemeris

        /**
         * These services provide operations for the posting and querying of satellite Ephemeris
         * Point data. Each point contains a position and velocity vector and optionally, an
         * acceleration vector and/or covariance matrix at a specified time. ECI J2K is the
         * preferred reference frame for ephemeris and covariance, however, several user specified
         * reference frames are accommodated. The EphemerisSet ID (esId) identifies the
         * 'EphemerisSet' record which contains details of the underlying data and models used in
         * the generation of the ephemeris as well as a collection of ephemeris points. Points must
         * be retrieved by first identifying a desired EphemerisSet and pulling its points by that
         * EphemerisSet 'esId'.
         */
        override fun ephemerisSets(): EphemerisSetService.WithRawResponse = ephemerisSets

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        override fun equipment(): EquipmentService.WithRawResponse = equipment

        /**
         * This collection of services provide operations for manipulating and querying of equipment
         * related data.
         */
        override fun equipmentRemarks(): EquipmentRemarkService.WithRawResponse = equipmentRemarks

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun evac(): EvacService.WithRawResponse = evac

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun eventEvolution(): EventEvolutionService.WithRawResponse = eventEvolution

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun featureAssessment(): FeatureAssessmentService.WithRawResponse =
            featureAssessment

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun flightplan(): FlightplanService.WithRawResponse = flightplan

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun geoStatus(): GeoStatusService.WithRawResponse = geoStatus

        /**
         * Models and Simulations is a collection of services that allow consumers to interact with
         * data products representing independent models of various phenomenon, artificial
         * intelligence models and predictions, or of mathematical parameters meant to feed mod and
         * sim tools to produce estimates of environmental entities such as atmospheric models and
         * heat maps.
         */
        override fun globalAtmosphericModel(): GlobalAtmosphericModelService.WithRawResponse =
            globalAtmosphericModel

        override fun gnssObservations(): GnssObservationService.WithRawResponse = gnssObservations

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun gnssObservationset(): GnssObservationsetService.WithRawResponse =
            gnssObservationset

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun gnssRawIf(): GnssRawIfService.WithRawResponse = gnssRawIf

        /**
         * This collection of services provides operations for querying and manipulation of ground
         * imagery of terrestrial regions from on-orbit, air, and other sensors. Includes metadata
         * on the image (time, region, source, etc) as well as binary content (typically GeoTIFF).
         * Binary content must be downloaded individually by ID using the 'getFile' operation.
         * Well-Known Text (WKT) and GeoJSON formats are used for GIS representation and query
         * support (see https://www.opengeospatial.org/standards/wkt-crs and https://geojson.org/
         * for more information on these formats).
         */
        override fun groundImagery(): GroundImageryService.WithRawResponse = groundImagery

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun h3Geo(): H3GeoService.WithRawResponse = h3Geo

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun h3GeoHexCell(): H3GeoHexCellService.WithRawResponse = h3GeoHexCell

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun hazard(): HazardService.WithRawResponse = hazard

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun ionoObservations(): IonoObservationService.WithRawResponse = ionoObservations

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun ir(): IrService.WithRawResponse = ir

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun isrCollections(): IsrCollectionService.WithRawResponse = isrCollections

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun item(): ItemService.WithRawResponse = item

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun itemTrackings(): ItemTrackingService.WithRawResponse = itemTrackings

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        override fun laserdeconflictrequest(): LaserdeconflictrequestService.WithRawResponse =
            laserdeconflictrequest

        /**
         * This collection of services provides operations for querying and manipulation of laser
         * related information to include the laser emitters, the laser deconflict requests, and
         * laser deconflict responses.
         */
        override fun laseremitter(): LaseremitterService.WithRawResponse = laseremitter

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchDetection(): LaunchDetectionService.WithRawResponse = launchDetection

        /**
         * These services provide operations for manipulation and querying of LaunchEvent data.
         * Launch Event data are known space launches, either future or historic records containing
         * items such as the launch site, launch epoch, and object.
         */
        override fun launchEvent(): LaunchEventService.WithRawResponse = launchEvent

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchSite(): LaunchSiteService.WithRawResponse = launchSite

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchSiteDetails(): LaunchSiteDetailService.WithRawResponse =
            launchSiteDetails

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchVehicle(): LaunchVehicleService.WithRawResponse = launchVehicle

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun launchVehicleDetails(): LaunchVehicleDetailService.WithRawResponse =
            launchVehicleDetails

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        override fun linkStatus(): LinkStatusService.WithRawResponse = linkStatus

        /**
         * These services provide operations for manipulation and querying tactical data links and
         * link statuses of beams or a satellite constellation. Communication link statuses provide
         * definitions and status such as, positional endpoints, where each endpoint may be
         * associated with a specific beam or with a satellite constellation. Data links provide
         * detailed instructions regarding the operational use of a tactical data link and interface
         * coordination through various message formats.
         */
        override fun linkstatus(): LinkstatusService.WithRawResponse = linkstatus

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun location(): LocationService.WithRawResponse = location

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun logisticsSupport(): LogisticsSupportService.WithRawResponse = logisticsSupport

        /**
         * This service provides operations for querying and manipulation of
         * detected/possible/confirmed on-orbit maneuvers. The J2000 coordinate frame is the
         * preferred frame for all maneuver data, but in some cases data may be in another frame
         * depending on the provider. Check the Storefront 'Data Products' section under the
         * 'Discover' tab for maneuver data provider information.
         */
        override fun maneuvers(): ManeuverService.WithRawResponse = maneuvers

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun manifold(): ManifoldService.WithRawResponse = manifold

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun manifoldelset(): ManifoldelsetService.WithRawResponse = manifoldelset

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun missileTracks(): MissileTrackService.WithRawResponse = missileTracks

        /**
         * These services provide operations for manipulation and querying of mission assignment
         * objects. MissionAssignment is used by C2 JUs and, optionally, non-C2 JUs to assign
         * missions, designate targets, and provide target information to non-C2 JU platforms.
         * Provision is made for the non-C2 JU platforms to acknowledge the message through
         * receipt/compliance action.
         */
        override fun missionAssignment(): MissionAssignmentService.WithRawResponse =
            missionAssignment

        /**
         * These services provide operations for posting and querying Moving Target Indicator (MTI)
         * STANAG 4607 data. Detailed MTI data supports activities such as targeting or less
         * detailed data for applications such as situational awareness used/derived by exploitation
         * systems.
         */
        override fun mti(): MtiService.WithRawResponse = mti

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun navigation(): NavigationService.WithRawResponse = navigation

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun navigationalObstruction(): NavigationalObstructionService.WithRawResponse =
            navigationalObstruction

        /**
         * A Notification Service allowing the broadcast of generic messages to the community. Users
         * can send free-form messages, publish lists, and notify the community about events or
         * alerts across various domains. Notifications and alerts are categorized by a 'msgType'
         * field and are accessible via the UDL Secure Messaging API and REST API services.
         */
        override fun notification(): NotificationService.WithRawResponse = notification

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun objectOfInterest(): ObjectOfInterestService.WithRawResponse = objectOfInterest

        override fun observations(): ObservationService.WithRawResponse = observations

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun onboardnavigation(): OnboardnavigationService.WithRawResponse =
            onboardnavigation

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbit(): OnorbitService.WithRawResponse = onorbit

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitantenna(): OnorbitantennaService.WithRawResponse = onorbitantenna

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitbattery(): OnorbitbatteryService.WithRawResponse = onorbitbattery

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitdetails(): OnorbitdetailService.WithRawResponse = onorbitdetails

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitevent(): OnorbiteventService.WithRawResponse = onorbitevent

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitlist(): OnorbitlistService.WithRawResponse = onorbitlist

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitsolararray(): OnorbitsolararrayService.WithRawResponse =
            onorbitsolararray

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitthruster(): OnorbitthrusterService.WithRawResponse = onorbitthruster

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun onorbitthrusterstatus(): OnorbitthrusterstatusService.WithRawResponse =
            onorbitthrusterstatus

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun onorbitassessment(): OnorbitassessmentService.WithRawResponse =
            onorbitassessment

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun operatingunit(): OperatingunitService.WithRawResponse = operatingunit

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun operatingunitremark(): OperatingunitremarkService.WithRawResponse =
            operatingunitremark

        /**
         * These services provide operations for manipulating and querying Orbit Determination (OD)
         * data. Orbit Determination data contains algorithm results that describe General
         * Perturbations or Special Perturbations orbital updates.
         */
        override fun orbitdetermination(): OrbitdeterminationService.WithRawResponse =
            orbitdetermination

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun orbittrack(): OrbittrackService.WithRawResponse = orbittrack

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun organization(): OrganizationService.WithRawResponse = organization

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun organizationdetails(): OrganizationdetailService.WithRawResponse =
            organizationdetails

        /**
         * These services provide operations for manipulation and querying of Mission Ops
         * information.
         */
        override fun personnelrecovery(): PersonnelrecoveryService.WithRawResponse =
            personnelrecovery

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun poi(): PoiService.WithRawResponse = poi

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun port(): PortService.WithRawResponse = port

        override fun reportAndActivities(): ReportAndActivityService.WithRawResponse =
            reportAndActivities

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        override fun rfBand(): RfBandService.WithRawResponse = rfBand

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        override fun rfBandType(): RfBandTypeService.WithRawResponse = rfBandType

        /**
         * This collection of services provides operations for querying and manipulation of RF
         * related information to include RFEmitters which could potentially interfere with
         * communications/operations of space related entities, and RFBands commonly used by various
         * space related entities.
         */
        override fun rfEmitter(): RfEmitterService.WithRawResponse = rfEmitter

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun routeStats(): RouteStatService.WithRawResponse = routeStats

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun sarObservation(): SarObservationService.WithRawResponse = sarObservation

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun scientific(): ScientificService.WithRawResponse = scientific

        override fun scs(): ScService.WithRawResponse = scs

        /**
         * Secure Messaging is based on Apache Kafka which is an open-source stream-processing
         * software platform developed by the Apache Software Foundation, written in Scala and Java.
         * Kafka provides a unified, high-throughput, low-latency platform for handling real-time
         * data feeds. All messaging is secured; consumers will not receive messages unless
         * authorized to do so. J2000 is the preferred coordinate frame for all observations, but in
         * some cases observations may be in another frame depending on the provider. Please see the
         * 'Discover' tab in the storefront to confirm coordinate frames by data provider.
         */
        override fun secureMessaging(): SecureMessagingService.WithRawResponse = secureMessaging

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensor(): SensorService.WithRawResponse = sensor

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorStating(): SensorStatingService.WithRawResponse = sensorStating

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorMaintenance(): SensorMaintenanceService.WithRawResponse =
            sensorMaintenance

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorObservationType(): SensorObservationTypeService.WithRawResponse =
            sensorObservationType

        /** These services provide operations for posting and querying Sensor Tasking data. */
        override fun sensorPlan(): SensorPlanService.WithRawResponse = sensorPlan

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun sensorType(): SensorTypeService.WithRawResponse = sensorType

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun seraDataCommDetails(): SeraDataCommDetailService.WithRawResponse =
            seraDataCommDetails

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun seraDataEarlyWarning(): SeraDataEarlyWarningService.WithRawResponse =
            seraDataEarlyWarning

        /** These services provide operations for manipulation and querying of on-orbit payloads. */
        override fun seraDataNavigation(): SeraDataNavigationService.WithRawResponse =
            seraDataNavigation

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun seradataOpticalPayload(): SeradataOpticalPayloadService.WithRawResponse =
            seradataOpticalPayload

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun seradataRadarPayload(): SeradataRadarPayloadService.WithRawResponse =
            seradataRadarPayload

        /**
         * This service provides operations for querying and manipulation of sensor data. Sensors
         * are terrestrial or on-orbit equipment capable of taking measurements or 'observations' of
         * on-orbit objects via several phenomenologies such as Electro-Optical (EO), Radar, and
         * Radio Frequency (RF). This collection of operations includes 'SensorMaintenance'
         * schedules which define known/planned future maintenance and associated operational impact
         * of sensors as well as 'SensorCalibration' records which contains data about a sensor's
         * overall accuracy and is used to adjust sensor settings.
         */
        override fun seradataSigintPayload(): SeradataSigintPayloadService.WithRawResponse =
            seradataSigintPayload

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService.WithRawResponse =
            seradataSpacecraftDetails

        /**
         * This service provides operations for manipulation and querying of space weather/solar,
         * geomagnetic, and radiation belt index data.
         */
        override fun sgi(): SgiService.WithRawResponse = sgi

        /**
         * These services provide operations for manipulation and querying of Report and Activity
         * information. This information includes analytic reports, significant events, route
         * statistics, EMI Reports, and other georeferenced reports and activities.
         */
        override fun sigact(): SigactService.WithRawResponse = sigact

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun site(): SiteService.WithRawResponse = site

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun siteRemark(): SiteRemarkService.WithRawResponse = siteRemark

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun siteStatus(): SiteStatusService.WithRawResponse = siteStatus

        /**
         * This collection of services provides operations for querying and manipulation of sky
         * imagery data. Sky imagery is ground or space based telescope imagery of RSO's and
         * includes metadata on the image (time, source, etc) as well as binary image content (e.g.
         * FITS, EOSSA, EOCHIP, MP4). Binary content must be downloaded individually by ID using the
         * 'getFile' operation.
         */
        override fun skyImagery(): SkyImageryService.WithRawResponse = skyImagery

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun soiObservationSet(): SoiObservationSetService.WithRawResponse =
            soiObservationSet

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun solarArray(): SolarArrayService.WithRawResponse = solarArray

        /**
         * These services provide operations for manipulation and querying of on-orbit objects of
         * interest, their components, and various lists and status of those objects.
         */
        override fun solarArrayDetails(): SolarArrayDetailService.WithRawResponse =
            solarArrayDetails

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun sortiePpr(): SortiePprService.WithRawResponse = sortiePpr

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun spaceEnvObservation(): SpaceEnvObservationService.WithRawResponse =
            spaceEnvObservation

        /**
         * Collection of launch related services which provide operations for querying and
         * manipulation of launch site data and detailed information on launch vehicles including
         * engines, stages, and manufacturers. Sites, engines, and stages can each have multiple
         * 'detail' records which may be compiled by different sources.
         */
        override fun stage(): StageService.WithRawResponse = stage

        /**
         * These services provide operations for posting and querying Star Catalog data. The Star
         * Catalog model is a representation of astronomical data and photometric data for stars.
         * Astronomical data includes positional information, proper motions, parallaxes and their
         * respective uncertainties. Photometric data contains optical and near-infrared magnitudes,
         * and their uncertainties across multiple bandpasses. Note: Multiple source catalogs may
         * contribute to a single record.
         */
        override fun starCatalog(): StarCatalogService.WithRawResponse = starCatalog

        /**
         * This service provides operations for querying and manipulation of state vectors for
         * On-orbit objects. State vectors are cartesian vectors of position (r) and velocity (v)
         * that together with their time (epoch) (t) uniquely determine the trajectory of the
         * orbiting body in space. J2000 is the preferred coordinate frame for all state vector
         * positions/velocities in UDL, but in some cases data may be in another frame depending on
         * the provider and/or datatype. Please see the 'Discover' tab in the storefront to confirm
         * coordinate frames by data provider.
         */
        override fun stateVector(): StateVectorService.WithRawResponse = stateVector

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun status(): StatusService.WithRawResponse = status

        /**
         * Service operations for querying and manipulation of miscellaneous supporting data such as
         * countries (which can represent countries, multi-national consortiums, and international
         * organizations), data owners, locations, entities, organizations, etc.
         */
        override fun substatus(): SubstatusService.WithRawResponse = substatus

        override fun supportingData(): SupportingDataService.WithRawResponse = supportingData

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun surface(): SurfaceService.WithRawResponse = surface

        /**
         * This collection of services provide operations for manipulating and querying of various
         * site related data, including site status, site operations, and site type-specific
         * records.
         */
        override fun surfaceObstruction(): SurfaceObstructionService.WithRawResponse =
            surfaceObstruction

        /**
         * This collection of services provides operations for querying and manipulation of
         * electro-optical (EO), radar, radio frequency (RF), Global Navigation Satellite Systems
         * (GNSS), Ionospheric (IONO), Infrared (SWIR), and Space Environment observation data. The
         * J2000 coordinate frame is the preferred frame for all observations, as applicable, but in
         * some cases observations may be in an alternate frame depending on the provider and/or
         * datatype.
         */
        override fun swir(): SwirService.WithRawResponse = swir

        /**
         * This service provides operations for manipulation and querying of earth orientation
         * parameter (EOP) data. Earth Orientation Parameters (EOP) are produced by the IERS
         * (International Earth Rotation and Reference Systems Service). Earth Orientation
         * Parameters describe the irregularities of the earth's rotation. Technically, they are the
         * parameters which provide the rotation of the ITRS (International Terrestrial Reference
         * System) to the ICRS (International Celestial Reference System) as a function of time.
         * Universal time -- Universal time (UT1) is the time of the earth clock, which performs one
         * revolution in about 24h. It is practically proportional to the sidereal time. The excess
         * revolution time is called length of day (LOD). Coordinates of the pole -- x and y are the
         * coordinates of the Celestial Ephemeris Pole (CEP) relative to the IRP, the IERS Reference
         * Pole. The CEP differs from the instantaneous rotation axis by quasi-diurnal terms with
         * amplitudes under 0.01" (see Seidelmann, 1982). The x-axis is in the direction of the ITRF
         * zero-meridian; the y-axis is in the direction 90 degrees West longitude. Celestial pole
         * offsets -- Celestial pole offsets are described in the IAU Precession and Nutation
         * models. The observed differences with respect to the conventional celestial pole position
         * defined by the models are monitored and reported by the IERS. IERS Bulletins A and B
         * provide current information on the Earth's orientation in the IERS Reference System. This
         * includes Universal Time, coordinates of the terrestrial pole, and celestial pole offsets.
         * Bulletin A gives an advanced solution updated weekly; the standard solution is given
         * monthly in Bulletin B. Fields suffixed with ''B'' are Bulletin B values. All solutions
         * are continuous within their respective uncertainties. Bulletin A is issued by the IERS
         * Rapid Service/Prediction Centre at the U.S. Naval Observatory, Washington, DC and
         * Bulletin B is issued by the IERS Earth Orientation Centre at the Paris Observatory. IERS
         * Bulletin A reports the latest determinations for polar motion, UT1-UTC, and nutation
         * offsets at daily intervals based on a combination of contributed analysis results using
         * data from Very Long Baseline Interferometry (VLBI), Satellite Laser Ranging (SLR), Global
         * Positioning System (GPS) satellites, and Lunar Laser Ranging (LLR). Predictions for
         * variations a year into the future are also provided. Meteorological predictions of
         * variations in Atmospheric Angular Momentum (AAM) are used to aid in the prediction of
         * near-term UT1-UTC changes. This publication is prepared by the IERS Rapid
         * Service/Prediction Center.
         */
        override fun taiUtc(): TaiUtcService.WithRawResponse = taiUtc

        override fun tdoaFdoa(): TdoaFdoaService.WithRawResponse = tdoaFdoa

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun track(): TrackService.WithRawResponse = track

        /**
         * These services provide operations for posting and querying of air, space, and ground
         * 'tracks'. A track is a position and optionally a heading/velocity of an object at a
         * particular timestamp.
         */
        override fun trackDetails(): TrackDetailService.WithRawResponse = trackDetails

        /**
         * These services provide operations for manipulating and querying Aircraft Sortie, Aircraft
         * Mission, Item Tracking, Flight Plan, Air Event, Sortie Prior Permission Required (PPR),
         * Diplomatic Clearance, Diplomatic Clearance Country, Airspace Control Order, Air Tasking
         * Order, Navigational Obstruction, Logistics Support, Track Route, Air Load Plan, and
         * Aviation Risk Management data. Aircraft Sortie information contains static and dynamic
         * aircraft assignments, departure and arrival times, and remarks. Aircraft Mission
         * information contains static data for mission planning to include assigned aircraft and
         * crews, cargo pickup and dropoff locations, unique identifiers, and prioritization. Item
         * Tracking information contains data for tracking an item from its origin to destination
         * and how it may be configured during transport. Flight Plan information contains schedule
         * and route details. Air Event provides information concerning various aerial events such
         * as fuel transfer and air drops, as well as the associated aircraft involved. Sortie PPR
         * information contains details on operational access to a runway, taxiway, or airport
         * service. Diplomatic Clearance information contains details on the issuance and
         * coordination of aircraft clearance requests. Diplomatic Clearance Country provides
         * information such as entry/exit points, requirements, and points of contact for countries
         * diplomatic clearances are being created for. Airspace Control Order provides information
         * concerning the allocation, restriction, and deconfliction of airspace. Air Tasking Order
         * information contains details on the coordination of air missions and their tasks,
         * resources, and timelines. Navigational Obstruction provides the locations,
         * characteristics, and boundaries of obstacles and structures that can restrict or
         * interfere with navigation. Logistics Support contains information regarding the transport
         * and maintenance of resources and equipment to sustain air operations. Track Route
         * information defines specific flight paths used by aircraft during the transport of fuel
         * and other resources. Air Load Plan information provides mission actuals concerning the
         * loading and air transport of cargo and passengers. Aviation Risk Management information
         * help aid in mission planning by accounting for factors such as mission complexity and
         * crew fatigue.
         */
        override fun trackRoute(): TrackRouteService.WithRawResponse = trackRoute

        /**
         * These services provide operations for manipulation and querying of on-orbit
         * communications payloads (Comm), including supporting data such as transponders and
         * channels, etc.
         */
        override fun transponder(): TransponderService.WithRawResponse = transponder

        override fun user(): UserService.WithRawResponse = user

        /**
         * This service provides operations for manipulation and querying of maritime Vessel and
         * Vessel Status data. Vessel contains the static data of the specific vessel: mmsi, cruise
         * speed, max speed, etc.
         */
        override fun vessel(): VesselService.WithRawResponse = vessel

        override fun video(): VideoService.WithRawResponse = video

        /**
         * These services provide for posting and querying terrestrial weather conditions over a
         * target area or region and raw sensor data used to produce condition reports. Weather
         * Reports describe current weather conditions over a target point or region to include
         * general temperatures, pressures, and moisture accumulation, as well as navigational
         * considerations such as altimeter settings, visibility, wind speeds, and cloud heights
         * etc. Weather Data contains algorithmic parameters and dynamic, raw measurements collected
         * by individual sensors such as signal power, noise level, etc., which are generally
         * processed across multiple sensors to produce weather reports.
         */
        override fun weatherData(): WeatherDataService.WithRawResponse = weatherData

        /**
         * These services provide for posting and querying terrestrial weather conditions over a
         * target area or region and raw sensor data used to produce condition reports. Weather
         * Reports describe current weather conditions over a target point or region to include
         * general temperatures, pressures, and moisture accumulation, as well as navigational
         * considerations such as altimeter settings, visibility, wind speeds, and cloud heights
         * etc. Weather Data contains algorithmic parameters and dynamic, raw measurements collected
         * by individual sensors such as signal power, noise level, etc., which are generally
         * processed across multiple sensors to produce weather reports.
         */
        override fun weatherReport(): WeatherReportService.WithRawResponse = weatherReport
    }
}

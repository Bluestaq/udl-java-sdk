// File generated from our OpenAPI spec by Stainless.

package com.unifieddatalibrary.api.client

import com.unifieddatalibrary.api.client.UnifieddatalibraryClient
import com.unifieddatalibrary.api.client.UnifieddatalibraryClientAsync
import com.unifieddatalibrary.api.client.UnifieddatalibraryClientAsyncImpl
import com.unifieddatalibrary.api.client.UnifieddatalibraryClientImpl
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
import com.unifieddatalibrary.api.services.blocking.DiffOfArrivalService
import com.unifieddatalibrary.api.services.blocking.DiffOfArrivalServiceImpl
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceService
import com.unifieddatalibrary.api.services.blocking.DiplomaticClearanceServiceImpl
import com.unifieddatalibrary.api.services.blocking.DriftHistoryService
import com.unifieddatalibrary.api.services.blocking.DriftHistoryServiceImpl
import com.unifieddatalibrary.api.services.blocking.DropzoneService
import com.unifieddatalibrary.api.services.blocking.DropzoneServiceImpl
import com.unifieddatalibrary.api.services.blocking.EcpSdrService
import com.unifieddatalibrary.api.services.blocking.EcpSdrServiceImpl
import com.unifieddatalibrary.api.services.blocking.EffectRequestService
import com.unifieddatalibrary.api.services.blocking.EffectRequestServiceImpl
import com.unifieddatalibrary.api.services.blocking.EffectResponseService
import com.unifieddatalibrary.api.services.blocking.EffectResponseServiceImpl
import com.unifieddatalibrary.api.services.blocking.ElsetService
import com.unifieddatalibrary.api.services.blocking.ElsetServiceImpl
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
import com.unifieddatalibrary.api.services.blocking.RfEmitterDetailService
import com.unifieddatalibrary.api.services.blocking.RfEmitterDetailServiceImpl
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
import com.unifieddatalibrary.api.services.blocking.ScsViewService
import com.unifieddatalibrary.api.services.blocking.ScsViewServiceImpl
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
import com.unifieddatalibrary.api.services.blocking.VesselService
import com.unifieddatalibrary.api.services.blocking.VesselServiceImpl
import com.unifieddatalibrary.api.services.blocking.VideoService
import com.unifieddatalibrary.api.services.blocking.VideoServiceImpl
import com.unifieddatalibrary.api.services.blocking.WeatherDataService
import com.unifieddatalibrary.api.services.blocking.WeatherDataServiceImpl
import com.unifieddatalibrary.api.services.blocking.WeatherReportService
import com.unifieddatalibrary.api.services.blocking.WeatherReportServiceImpl
import java.util.function.Consumer

class UnifieddatalibraryClientImpl(
    private val clientOptions: ClientOptions,

) : UnifieddatalibraryClient {

    private val clientOptionsWithUserAgent =

      if (clientOptions.headers.names().contains("User-Agent")) clientOptions

      else clientOptions.toBuilder().putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}").build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: UnifieddatalibraryClientAsync by lazy { UnifieddatalibraryClientAsyncImpl(clientOptions) }

    private val withRawResponse: UnifieddatalibraryClient.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    private val airEvents: AirEventService by lazy { AirEventServiceImpl(clientOptionsWithUserAgent) }

    private val airOperations: AirOperationService by lazy { AirOperationServiceImpl(clientOptionsWithUserAgent) }

    private val airTransportMissions: AirTransportMissionService by lazy { AirTransportMissionServiceImpl(clientOptionsWithUserAgent) }

    private val aircraft: AircraftService by lazy { AircraftServiceImpl(clientOptionsWithUserAgent) }

    private val aircraftSorties: AircraftSortyService by lazy { AircraftSortyServiceImpl(clientOptionsWithUserAgent) }

    private val aircraftStatusRemarks: AircraftStatusRemarkService by lazy { AircraftStatusRemarkServiceImpl(clientOptionsWithUserAgent) }

    private val aircraftStatuses: AircraftStatusService by lazy { AircraftStatusServiceImpl(clientOptionsWithUserAgent) }

    private val airfieldSlots: AirfieldSlotService by lazy { AirfieldSlotServiceImpl(clientOptionsWithUserAgent) }

    private val airfieldStatus: AirfieldStatusService by lazy { AirfieldStatusServiceImpl(clientOptionsWithUserAgent) }

    private val airfields: AirfieldService by lazy { AirfieldServiceImpl(clientOptionsWithUserAgent) }

    private val airfieldSlotConsumptions: AirfieldSlotConsumptionService by lazy { AirfieldSlotConsumptionServiceImpl(clientOptionsWithUserAgent) }

    private val airloadPlans: AirloadPlanService by lazy { AirloadPlanServiceImpl(clientOptionsWithUserAgent) }

    private val airspaceControlOrders: AirspaceControlOrderService by lazy { AirspaceControlOrderServiceImpl(clientOptionsWithUserAgent) }

    private val ais: AiService by lazy { AiServiceImpl(clientOptionsWithUserAgent) }

    private val aisObjects: AisObjectService by lazy { AisObjectServiceImpl(clientOptionsWithUserAgent) }

    private val analyticImagery: AnalyticImageryService by lazy { AnalyticImageryServiceImpl(clientOptionsWithUserAgent) }

    private val antennas: AntennaService by lazy { AntennaServiceImpl(clientOptionsWithUserAgent) }

    private val attitudeData: AttitudeDataService by lazy { AttitudeDataServiceImpl(clientOptionsWithUserAgent) }

    private val attitudeSets: AttitudeSetService by lazy { AttitudeSetServiceImpl(clientOptionsWithUserAgent) }

    private val batteries: BatteryService by lazy { BatteryServiceImpl(clientOptionsWithUserAgent) }

    private val batterydetails: BatterydetailService by lazy { BatterydetailServiceImpl(clientOptionsWithUserAgent) }

    private val beam: BeamService by lazy { BeamServiceImpl(clientOptionsWithUserAgent) }

    private val beamContours: BeamContourService by lazy { BeamContourServiceImpl(clientOptionsWithUserAgent) }

    private val buses: BusService by lazy { BusServiceImpl(clientOptionsWithUserAgent) }

    private val channels: ChannelService by lazy { ChannelServiceImpl(clientOptionsWithUserAgent) }

    private val collectRequests: CollectRequestService by lazy { CollectRequestServiceImpl(clientOptionsWithUserAgent) }

    private val collectResponses: CollectResponseService by lazy { CollectResponseServiceImpl(clientOptionsWithUserAgent) }

    private val comm: CommService by lazy { CommServiceImpl(clientOptionsWithUserAgent) }

    private val conjunctions: ConjunctionService by lazy { ConjunctionServiceImpl(clientOptionsWithUserAgent) }

    private val cots: CotService by lazy { CotServiceImpl(clientOptionsWithUserAgent) }

    private val aviationRiskManagement: AviationRiskManagementService by lazy { AviationRiskManagementServiceImpl(clientOptionsWithUserAgent) }

    private val dropzone: DropzoneService by lazy { DropzoneServiceImpl(clientOptionsWithUserAgent) }

    private val emitterGeolocation: EmitterGeolocationService by lazy { EmitterGeolocationServiceImpl(clientOptionsWithUserAgent) }

    private val featureAssessment: FeatureAssessmentService by lazy { FeatureAssessmentServiceImpl(clientOptionsWithUserAgent) }

    private val globalAtmosphericModel: GlobalAtmosphericModelService by lazy { GlobalAtmosphericModelServiceImpl(clientOptionsWithUserAgent) }

    private val routeStats: RouteStatService by lazy { RouteStatServiceImpl(clientOptionsWithUserAgent) }

    private val countries: CountryService by lazy { CountryServiceImpl(clientOptionsWithUserAgent) }

    private val crew: CrewService by lazy { CrewServiceImpl(clientOptionsWithUserAgent) }

    private val diffOfArrival: DiffOfArrivalService by lazy { DiffOfArrivalServiceImpl(clientOptionsWithUserAgent) }

    private val diplomaticClearance: DiplomaticClearanceService by lazy { DiplomaticClearanceServiceImpl(clientOptionsWithUserAgent) }

    private val driftHistory: DriftHistoryService by lazy { DriftHistoryServiceImpl(clientOptionsWithUserAgent) }

    private val ecpSdr: EcpSdrService by lazy { EcpSdrServiceImpl(clientOptionsWithUserAgent) }

    private val effectRequests: EffectRequestService by lazy { EffectRequestServiceImpl(clientOptionsWithUserAgent) }

    private val effectResponses: EffectResponseService by lazy { EffectResponseServiceImpl(clientOptionsWithUserAgent) }

    private val elsets: ElsetService by lazy { ElsetServiceImpl(clientOptionsWithUserAgent) }

    private val engineDetails: EngineDetailService by lazy { EngineDetailServiceImpl(clientOptionsWithUserAgent) }

    private val engines: EngineService by lazy { EngineServiceImpl(clientOptionsWithUserAgent) }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptionsWithUserAgent) }

    private val eop: EopService by lazy { EopServiceImpl(clientOptionsWithUserAgent) }

    private val ephemeris: EphemerisService by lazy { EphemerisServiceImpl(clientOptionsWithUserAgent) }

    private val ephemerisSets: EphemerisSetService by lazy { EphemerisSetServiceImpl(clientOptionsWithUserAgent) }

    private val equipment: EquipmentService by lazy { EquipmentServiceImpl(clientOptionsWithUserAgent) }

    private val equipmentRemarks: EquipmentRemarkService by lazy { EquipmentRemarkServiceImpl(clientOptionsWithUserAgent) }

    private val evac: EvacService by lazy { EvacServiceImpl(clientOptionsWithUserAgent) }

    private val eventEvolution: EventEvolutionService by lazy { EventEvolutionServiceImpl(clientOptionsWithUserAgent) }

    private val flightplan: FlightplanService by lazy { FlightplanServiceImpl(clientOptionsWithUserAgent) }

    private val geoStatus: GeoStatusService by lazy { GeoStatusServiceImpl(clientOptionsWithUserAgent) }

    private val gnssObservationset: GnssObservationsetService by lazy { GnssObservationsetServiceImpl(clientOptionsWithUserAgent) }

    private val groundImagery: GroundImageryService by lazy { GroundImageryServiceImpl(clientOptionsWithUserAgent) }

    private val h3Geo: H3GeoService by lazy { H3GeoServiceImpl(clientOptionsWithUserAgent) }

    private val h3GeoHexCell: H3GeoHexCellService by lazy { H3GeoHexCellServiceImpl(clientOptionsWithUserAgent) }

    private val hazard: HazardService by lazy { HazardServiceImpl(clientOptionsWithUserAgent) }

    private val ir: IrService by lazy { IrServiceImpl(clientOptionsWithUserAgent) }

    private val isrCollections: IsrCollectionService by lazy { IsrCollectionServiceImpl(clientOptionsWithUserAgent) }

    private val item: ItemService by lazy { ItemServiceImpl(clientOptionsWithUserAgent) }

    private val itemTrackings: ItemTrackingService by lazy { ItemTrackingServiceImpl(clientOptionsWithUserAgent) }

    private val launchDetection: LaunchDetectionService by lazy { LaunchDetectionServiceImpl(clientOptionsWithUserAgent) }

    private val launchEvent: LaunchEventService by lazy { LaunchEventServiceImpl(clientOptionsWithUserAgent) }

    private val launchSite: LaunchSiteService by lazy { LaunchSiteServiceImpl(clientOptionsWithUserAgent) }

    private val launchSiteDetails: LaunchSiteDetailService by lazy { LaunchSiteDetailServiceImpl(clientOptionsWithUserAgent) }

    private val launchVehicle: LaunchVehicleService by lazy { LaunchVehicleServiceImpl(clientOptionsWithUserAgent) }

    private val launchVehicleDetails: LaunchVehicleDetailService by lazy { LaunchVehicleDetailServiceImpl(clientOptionsWithUserAgent) }

    private val linkStatus: LinkStatusService by lazy { LinkStatusServiceImpl(clientOptionsWithUserAgent) }

    private val location: LocationService by lazy { LocationServiceImpl(clientOptionsWithUserAgent) }

    private val logisticsSupport: LogisticsSupportService by lazy { LogisticsSupportServiceImpl(clientOptionsWithUserAgent) }

    private val maneuvers: ManeuverService by lazy { ManeuverServiceImpl(clientOptionsWithUserAgent) }

    private val manifold: ManifoldService by lazy { ManifoldServiceImpl(clientOptionsWithUserAgent) }

    private val manifoldelset: ManifoldelsetService by lazy { ManifoldelsetServiceImpl(clientOptionsWithUserAgent) }

    private val missileTracks: MissileTrackService by lazy { MissileTrackServiceImpl(clientOptionsWithUserAgent) }

    private val missionAssignment: MissionAssignmentService by lazy { MissionAssignmentServiceImpl(clientOptionsWithUserAgent) }

    private val mti: MtiService by lazy { MtiServiceImpl(clientOptionsWithUserAgent) }

    private val navigation: NavigationService by lazy { NavigationServiceImpl(clientOptionsWithUserAgent) }

    private val navigationalObstruction: NavigationalObstructionService by lazy { NavigationalObstructionServiceImpl(clientOptionsWithUserAgent) }

    private val notification: NotificationService by lazy { NotificationServiceImpl(clientOptionsWithUserAgent) }

    private val objectOfInterest: ObjectOfInterestService by lazy { ObjectOfInterestServiceImpl(clientOptionsWithUserAgent) }

    private val observations: ObservationService by lazy { ObservationServiceImpl(clientOptionsWithUserAgent) }

    private val onboardnavigation: OnboardnavigationService by lazy { OnboardnavigationServiceImpl(clientOptionsWithUserAgent) }

    private val onorbit: OnorbitService by lazy { OnorbitServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitantenna: OnorbitantennaService by lazy { OnorbitantennaServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitbattery: OnorbitbatteryService by lazy { OnorbitbatteryServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitdetails: OnorbitdetailService by lazy { OnorbitdetailServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitevent: OnorbiteventService by lazy { OnorbiteventServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitlist: OnorbitlistService by lazy { OnorbitlistServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitsolararray: OnorbitsolararrayService by lazy { OnorbitsolararrayServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitthruster: OnorbitthrusterService by lazy { OnorbitthrusterServiceImpl(clientOptionsWithUserAgent) }

    private val onorbitthrusterstatus: OnorbitthrusterstatusService by lazy { OnorbitthrusterstatusServiceImpl(clientOptionsWithUserAgent) }

    private val operatingunit: OperatingunitService by lazy { OperatingunitServiceImpl(clientOptionsWithUserAgent) }

    private val operatingunitremark: OperatingunitremarkService by lazy { OperatingunitremarkServiceImpl(clientOptionsWithUserAgent) }

    private val orbitdetermination: OrbitdeterminationService by lazy { OrbitdeterminationServiceImpl(clientOptionsWithUserAgent) }

    private val orbittrack: OrbittrackService by lazy { OrbittrackServiceImpl(clientOptionsWithUserAgent) }

    private val organization: OrganizationService by lazy { OrganizationServiceImpl(clientOptionsWithUserAgent) }

    private val organizationdetails: OrganizationdetailService by lazy { OrganizationdetailServiceImpl(clientOptionsWithUserAgent) }

    private val personnelrecovery: PersonnelrecoveryService by lazy { PersonnelrecoveryServiceImpl(clientOptionsWithUserAgent) }

    private val poi: PoiService by lazy { PoiServiceImpl(clientOptionsWithUserAgent) }

    private val port: PortService by lazy { PortServiceImpl(clientOptionsWithUserAgent) }

    private val rfBand: RfBandService by lazy { RfBandServiceImpl(clientOptionsWithUserAgent) }

    private val rfBandType: RfBandTypeService by lazy { RfBandTypeServiceImpl(clientOptionsWithUserAgent) }

    private val rfEmitter: RfEmitterService by lazy { RfEmitterServiceImpl(clientOptionsWithUserAgent) }

    private val rfEmitterDetails: RfEmitterDetailService by lazy { RfEmitterDetailServiceImpl(clientOptionsWithUserAgent) }

    private val sarObservation: SarObservationService by lazy { SarObservationServiceImpl(clientOptionsWithUserAgent) }

    private val scientific: ScientificService by lazy { ScientificServiceImpl(clientOptionsWithUserAgent) }

    private val sensor: SensorService by lazy { SensorServiceImpl(clientOptionsWithUserAgent) }

    private val sensorMaintenance: SensorMaintenanceService by lazy { SensorMaintenanceServiceImpl(clientOptionsWithUserAgent) }

    private val sensorObservationType: SensorObservationTypeService by lazy { SensorObservationTypeServiceImpl(clientOptionsWithUserAgent) }

    private val sensorPlan: SensorPlanService by lazy { SensorPlanServiceImpl(clientOptionsWithUserAgent) }

    private val sensorType: SensorTypeService by lazy { SensorTypeServiceImpl(clientOptionsWithUserAgent) }

    private val seraDataCommDetails: SeraDataCommDetailService by lazy { SeraDataCommDetailServiceImpl(clientOptionsWithUserAgent) }

    private val seraDataEarlyWarning: SeraDataEarlyWarningService by lazy { SeraDataEarlyWarningServiceImpl(clientOptionsWithUserAgent) }

    private val seraDataNavigation: SeraDataNavigationService by lazy { SeraDataNavigationServiceImpl(clientOptionsWithUserAgent) }

    private val seradataOpticalPayload: SeradataOpticalPayloadService by lazy { SeradataOpticalPayloadServiceImpl(clientOptionsWithUserAgent) }

    private val seradataRadarPayload: SeradataRadarPayloadService by lazy { SeradataRadarPayloadServiceImpl(clientOptionsWithUserAgent) }

    private val seradataSigintPayload: SeradataSigintPayloadService by lazy { SeradataSigintPayloadServiceImpl(clientOptionsWithUserAgent) }

    private val seradataSpacecraftDetails: SeradataSpacecraftDetailService by lazy { SeradataSpacecraftDetailServiceImpl(clientOptionsWithUserAgent) }

    private val sgi: SgiService by lazy { SgiServiceImpl(clientOptionsWithUserAgent) }

    private val sigact: SigactService by lazy { SigactServiceImpl(clientOptionsWithUserAgent) }

    private val site: SiteService by lazy { SiteServiceImpl(clientOptionsWithUserAgent) }

    private val siteRemark: SiteRemarkService by lazy { SiteRemarkServiceImpl(clientOptionsWithUserAgent) }

    private val siteStatus: SiteStatusService by lazy { SiteStatusServiceImpl(clientOptionsWithUserAgent) }

    private val skyImagery: SkyImageryService by lazy { SkyImageryServiceImpl(clientOptionsWithUserAgent) }

    private val soiObservationSet: SoiObservationSetService by lazy { SoiObservationSetServiceImpl(clientOptionsWithUserAgent) }

    private val solarArray: SolarArrayService by lazy { SolarArrayServiceImpl(clientOptionsWithUserAgent) }

    private val solarArrayDetails: SolarArrayDetailService by lazy { SolarArrayDetailServiceImpl(clientOptionsWithUserAgent) }

    private val sortiePpr: SortiePprService by lazy { SortiePprServiceImpl(clientOptionsWithUserAgent) }

    private val spaceEnvObservation: SpaceEnvObservationService by lazy { SpaceEnvObservationServiceImpl(clientOptionsWithUserAgent) }

    private val stage: StageService by lazy { StageServiceImpl(clientOptionsWithUserAgent) }

    private val starCatalog: StarCatalogService by lazy { StarCatalogServiceImpl(clientOptionsWithUserAgent) }

    private val stateVector: StateVectorService by lazy { StateVectorServiceImpl(clientOptionsWithUserAgent) }

    private val status: StatusService by lazy { StatusServiceImpl(clientOptionsWithUserAgent) }

    private val substatus: SubstatusService by lazy { SubstatusServiceImpl(clientOptionsWithUserAgent) }

    private val supportingData: SupportingDataService by lazy { SupportingDataServiceImpl(clientOptionsWithUserAgent) }

    private val surface: SurfaceService by lazy { SurfaceServiceImpl(clientOptionsWithUserAgent) }

    private val surfaceObstruction: SurfaceObstructionService by lazy { SurfaceObstructionServiceImpl(clientOptionsWithUserAgent) }

    private val swir: SwirService by lazy { SwirServiceImpl(clientOptionsWithUserAgent) }

    private val taiUtc: TaiUtcService by lazy { TaiUtcServiceImpl(clientOptionsWithUserAgent) }

    private val tdoaFdoa: TdoaFdoaService by lazy { TdoaFdoaServiceImpl(clientOptionsWithUserAgent) }

    private val track: TrackService by lazy { TrackServiceImpl(clientOptionsWithUserAgent) }

    private val trackDetails: TrackDetailService by lazy { TrackDetailServiceImpl(clientOptionsWithUserAgent) }

    private val trackRoute: TrackRouteService by lazy { TrackRouteServiceImpl(clientOptionsWithUserAgent) }

    private val transponder: TransponderService by lazy { TransponderServiceImpl(clientOptionsWithUserAgent) }

    private val vessel: VesselService by lazy { VesselServiceImpl(clientOptionsWithUserAgent) }

    private val video: VideoService by lazy { VideoServiceImpl(clientOptionsWithUserAgent) }

    private val weatherData: WeatherDataService by lazy { WeatherDataServiceImpl(clientOptionsWithUserAgent) }

    private val weatherReport: WeatherReportService by lazy { WeatherReportServiceImpl(clientOptionsWithUserAgent) }

    private val gnssObservations: GnssObservationService by lazy { GnssObservationServiceImpl(clientOptionsWithUserAgent) }

    private val gnssRawIf: GnssRawIfService by lazy { GnssRawIfServiceImpl(clientOptionsWithUserAgent) }

    private val ionoObservations: IonoObservationService by lazy { IonoObservationServiceImpl(clientOptionsWithUserAgent) }

    private val reportAndActivities: ReportAndActivityService by lazy { ReportAndActivityServiceImpl(clientOptionsWithUserAgent) }

    private val secureMessaging: SecureMessagingService by lazy { SecureMessagingServiceImpl(clientOptionsWithUserAgent) }

    private val scs: ScService by lazy { ScServiceImpl(clientOptionsWithUserAgent) }

    private val scsViews: ScsViewService by lazy { ScsViewServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): UnifieddatalibraryClientAsync = async

    override fun withRawResponse(): UnifieddatalibraryClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClient = UnifieddatalibraryClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun airEvents(): AirEventService = airEvents

    override fun airOperations(): AirOperationService = airOperations

    override fun airTransportMissions(): AirTransportMissionService = airTransportMissions

    override fun aircraft(): AircraftService = aircraft

    override fun aircraftSorties(): AircraftSortyService = aircraftSorties

    override fun aircraftStatusRemarks(): AircraftStatusRemarkService = aircraftStatusRemarks

    override fun aircraftStatuses(): AircraftStatusService = aircraftStatuses

    override fun airfieldSlots(): AirfieldSlotService = airfieldSlots

    override fun airfieldStatus(): AirfieldStatusService = airfieldStatus

    override fun airfields(): AirfieldService = airfields

    override fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService = airfieldSlotConsumptions

    override fun airloadPlans(): AirloadPlanService = airloadPlans

    override fun airspaceControlOrders(): AirspaceControlOrderService = airspaceControlOrders

    override fun ais(): AiService = ais

    override fun aisObjects(): AisObjectService = aisObjects

    override fun analyticImagery(): AnalyticImageryService = analyticImagery

    override fun antennas(): AntennaService = antennas

    override fun attitudeData(): AttitudeDataService = attitudeData

    override fun attitudeSets(): AttitudeSetService = attitudeSets

    override fun batteries(): BatteryService = batteries

    override fun batterydetails(): BatterydetailService = batterydetails

    override fun beam(): BeamService = beam

    override fun beamContours(): BeamContourService = beamContours

    override fun buses(): BusService = buses

    override fun channels(): ChannelService = channels

    override fun collectRequests(): CollectRequestService = collectRequests

    override fun collectResponses(): CollectResponseService = collectResponses

    override fun comm(): CommService = comm

    override fun conjunctions(): ConjunctionService = conjunctions

    override fun cots(): CotService = cots

    override fun aviationRiskManagement(): AviationRiskManagementService = aviationRiskManagement

    override fun dropzone(): DropzoneService = dropzone

    override fun emitterGeolocation(): EmitterGeolocationService = emitterGeolocation

    override fun featureAssessment(): FeatureAssessmentService = featureAssessment

    override fun globalAtmosphericModel(): GlobalAtmosphericModelService = globalAtmosphericModel

    override fun routeStats(): RouteStatService = routeStats

    override fun countries(): CountryService = countries

    override fun crew(): CrewService = crew

    override fun diffOfArrival(): DiffOfArrivalService = diffOfArrival

    override fun diplomaticClearance(): DiplomaticClearanceService = diplomaticClearance

    override fun driftHistory(): DriftHistoryService = driftHistory

    override fun ecpSdr(): EcpSdrService = ecpSdr

    override fun effectRequests(): EffectRequestService = effectRequests

    override fun effectResponses(): EffectResponseService = effectResponses

    override fun elsets(): ElsetService = elsets

    override fun engineDetails(): EngineDetailService = engineDetails

    override fun engines(): EngineService = engines

    override fun entities(): EntityService = entities

    override fun eop(): EopService = eop

    override fun ephemeris(): EphemerisService = ephemeris

    override fun ephemerisSets(): EphemerisSetService = ephemerisSets

    override fun equipment(): EquipmentService = equipment

    override fun equipmentRemarks(): EquipmentRemarkService = equipmentRemarks

    override fun evac(): EvacService = evac

    override fun eventEvolution(): EventEvolutionService = eventEvolution

    override fun flightplan(): FlightplanService = flightplan

    override fun geoStatus(): GeoStatusService = geoStatus

    override fun gnssObservationset(): GnssObservationsetService = gnssObservationset

    override fun groundImagery(): GroundImageryService = groundImagery

    override fun h3Geo(): H3GeoService = h3Geo

    override fun h3GeoHexCell(): H3GeoHexCellService = h3GeoHexCell

    override fun hazard(): HazardService = hazard

    override fun ir(): IrService = ir

    override fun isrCollections(): IsrCollectionService = isrCollections

    override fun item(): ItemService = item

    override fun itemTrackings(): ItemTrackingService = itemTrackings

    override fun launchDetection(): LaunchDetectionService = launchDetection

    override fun launchEvent(): LaunchEventService = launchEvent

    override fun launchSite(): LaunchSiteService = launchSite

    override fun launchSiteDetails(): LaunchSiteDetailService = launchSiteDetails

    override fun launchVehicle(): LaunchVehicleService = launchVehicle

    override fun launchVehicleDetails(): LaunchVehicleDetailService = launchVehicleDetails

    override fun linkStatus(): LinkStatusService = linkStatus

    override fun location(): LocationService = location

    override fun logisticsSupport(): LogisticsSupportService = logisticsSupport

    override fun maneuvers(): ManeuverService = maneuvers

    override fun manifold(): ManifoldService = manifold

    override fun manifoldelset(): ManifoldelsetService = manifoldelset

    override fun missileTracks(): MissileTrackService = missileTracks

    override fun missionAssignment(): MissionAssignmentService = missionAssignment

    override fun mti(): MtiService = mti

    override fun navigation(): NavigationService = navigation

    override fun navigationalObstruction(): NavigationalObstructionService = navigationalObstruction

    override fun notification(): NotificationService = notification

    override fun objectOfInterest(): ObjectOfInterestService = objectOfInterest

    override fun observations(): ObservationService = observations

    override fun onboardnavigation(): OnboardnavigationService = onboardnavigation

    override fun onorbit(): OnorbitService = onorbit

    override fun onorbitantenna(): OnorbitantennaService = onorbitantenna

    override fun onorbitbattery(): OnorbitbatteryService = onorbitbattery

    override fun onorbitdetails(): OnorbitdetailService = onorbitdetails

    override fun onorbitevent(): OnorbiteventService = onorbitevent

    override fun onorbitlist(): OnorbitlistService = onorbitlist

    override fun onorbitsolararray(): OnorbitsolararrayService = onorbitsolararray

    override fun onorbitthruster(): OnorbitthrusterService = onorbitthruster

    override fun onorbitthrusterstatus(): OnorbitthrusterstatusService = onorbitthrusterstatus

    override fun operatingunit(): OperatingunitService = operatingunit

    override fun operatingunitremark(): OperatingunitremarkService = operatingunitremark

    override fun orbitdetermination(): OrbitdeterminationService = orbitdetermination

    override fun orbittrack(): OrbittrackService = orbittrack

    override fun organization(): OrganizationService = organization

    override fun organizationdetails(): OrganizationdetailService = organizationdetails

    override fun personnelrecovery(): PersonnelrecoveryService = personnelrecovery

    override fun poi(): PoiService = poi

    override fun port(): PortService = port

    override fun rfBand(): RfBandService = rfBand

    override fun rfBandType(): RfBandTypeService = rfBandType

    override fun rfEmitter(): RfEmitterService = rfEmitter

    override fun rfEmitterDetails(): RfEmitterDetailService = rfEmitterDetails

    override fun sarObservation(): SarObservationService = sarObservation

    override fun scientific(): ScientificService = scientific

    override fun sensor(): SensorService = sensor

    override fun sensorMaintenance(): SensorMaintenanceService = sensorMaintenance

    override fun sensorObservationType(): SensorObservationTypeService = sensorObservationType

    override fun sensorPlan(): SensorPlanService = sensorPlan

    override fun sensorType(): SensorTypeService = sensorType

    override fun seraDataCommDetails(): SeraDataCommDetailService = seraDataCommDetails

    override fun seraDataEarlyWarning(): SeraDataEarlyWarningService = seraDataEarlyWarning

    override fun seraDataNavigation(): SeraDataNavigationService = seraDataNavigation

    override fun seradataOpticalPayload(): SeradataOpticalPayloadService = seradataOpticalPayload

    override fun seradataRadarPayload(): SeradataRadarPayloadService = seradataRadarPayload

    override fun seradataSigintPayload(): SeradataSigintPayloadService = seradataSigintPayload

    override fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService = seradataSpacecraftDetails

    override fun sgi(): SgiService = sgi

    override fun sigact(): SigactService = sigact

    override fun site(): SiteService = site

    override fun siteRemark(): SiteRemarkService = siteRemark

    override fun siteStatus(): SiteStatusService = siteStatus

    override fun skyImagery(): SkyImageryService = skyImagery

    override fun soiObservationSet(): SoiObservationSetService = soiObservationSet

    override fun solarArray(): SolarArrayService = solarArray

    override fun solarArrayDetails(): SolarArrayDetailService = solarArrayDetails

    override fun sortiePpr(): SortiePprService = sortiePpr

    override fun spaceEnvObservation(): SpaceEnvObservationService = spaceEnvObservation

    override fun stage(): StageService = stage

    override fun starCatalog(): StarCatalogService = starCatalog

    override fun stateVector(): StateVectorService = stateVector

    override fun status(): StatusService = status

    override fun substatus(): SubstatusService = substatus

    override fun supportingData(): SupportingDataService = supportingData

    override fun surface(): SurfaceService = surface

    override fun surfaceObstruction(): SurfaceObstructionService = surfaceObstruction

    override fun swir(): SwirService = swir

    override fun taiUtc(): TaiUtcService = taiUtc

    override fun tdoaFdoa(): TdoaFdoaService = tdoaFdoa

    override fun track(): TrackService = track

    override fun trackDetails(): TrackDetailService = trackDetails

    override fun trackRoute(): TrackRouteService = trackRoute

    override fun transponder(): TransponderService = transponder

    override fun vessel(): VesselService = vessel

    override fun video(): VideoService = video

    override fun weatherData(): WeatherDataService = weatherData

    override fun weatherReport(): WeatherReportService = weatherReport

    override fun gnssObservations(): GnssObservationService = gnssObservations

    override fun gnssRawIf(): GnssRawIfService = gnssRawIf

    override fun ionoObservations(): IonoObservationService = ionoObservations

    override fun reportAndActivities(): ReportAndActivityService = reportAndActivities

    override fun secureMessaging(): SecureMessagingService = secureMessaging

    override fun scs(): ScService = scs

    override fun scsViews(): ScsViewService = scsViews

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : UnifieddatalibraryClient.WithRawResponse {

        private val airEvents: AirEventService.WithRawResponse by lazy { AirEventServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airOperations: AirOperationService.WithRawResponse by lazy { AirOperationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airTransportMissions: AirTransportMissionService.WithRawResponse by lazy { AirTransportMissionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val aircraft: AircraftService.WithRawResponse by lazy { AircraftServiceImpl.WithRawResponseImpl(clientOptions) }

        private val aircraftSorties: AircraftSortyService.WithRawResponse by lazy { AircraftSortyServiceImpl.WithRawResponseImpl(clientOptions) }

        private val aircraftStatusRemarks: AircraftStatusRemarkService.WithRawResponse by lazy { AircraftStatusRemarkServiceImpl.WithRawResponseImpl(clientOptions) }

        private val aircraftStatuses: AircraftStatusService.WithRawResponse by lazy { AircraftStatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airfieldSlots: AirfieldSlotService.WithRawResponse by lazy { AirfieldSlotServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airfieldStatus: AirfieldStatusService.WithRawResponse by lazy { AirfieldStatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airfields: AirfieldService.WithRawResponse by lazy { AirfieldServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airfieldSlotConsumptions: AirfieldSlotConsumptionService.WithRawResponse by lazy { AirfieldSlotConsumptionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airloadPlans: AirloadPlanService.WithRawResponse by lazy { AirloadPlanServiceImpl.WithRawResponseImpl(clientOptions) }

        private val airspaceControlOrders: AirspaceControlOrderService.WithRawResponse by lazy { AirspaceControlOrderServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ais: AiService.WithRawResponse by lazy { AiServiceImpl.WithRawResponseImpl(clientOptions) }

        private val aisObjects: AisObjectService.WithRawResponse by lazy { AisObjectServiceImpl.WithRawResponseImpl(clientOptions) }

        private val analyticImagery: AnalyticImageryService.WithRawResponse by lazy { AnalyticImageryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val antennas: AntennaService.WithRawResponse by lazy { AntennaServiceImpl.WithRawResponseImpl(clientOptions) }

        private val attitudeData: AttitudeDataService.WithRawResponse by lazy { AttitudeDataServiceImpl.WithRawResponseImpl(clientOptions) }

        private val attitudeSets: AttitudeSetService.WithRawResponse by lazy { AttitudeSetServiceImpl.WithRawResponseImpl(clientOptions) }

        private val batteries: BatteryService.WithRawResponse by lazy { BatteryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val batterydetails: BatterydetailService.WithRawResponse by lazy { BatterydetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val beam: BeamService.WithRawResponse by lazy { BeamServiceImpl.WithRawResponseImpl(clientOptions) }

        private val beamContours: BeamContourService.WithRawResponse by lazy { BeamContourServiceImpl.WithRawResponseImpl(clientOptions) }

        private val buses: BusService.WithRawResponse by lazy { BusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val channels: ChannelService.WithRawResponse by lazy { ChannelServiceImpl.WithRawResponseImpl(clientOptions) }

        private val collectRequests: CollectRequestService.WithRawResponse by lazy { CollectRequestServiceImpl.WithRawResponseImpl(clientOptions) }

        private val collectResponses: CollectResponseService.WithRawResponse by lazy { CollectResponseServiceImpl.WithRawResponseImpl(clientOptions) }

        private val comm: CommService.WithRawResponse by lazy { CommServiceImpl.WithRawResponseImpl(clientOptions) }

        private val conjunctions: ConjunctionService.WithRawResponse by lazy { ConjunctionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val cots: CotService.WithRawResponse by lazy { CotServiceImpl.WithRawResponseImpl(clientOptions) }

        private val aviationRiskManagement: AviationRiskManagementService.WithRawResponse by lazy { AviationRiskManagementServiceImpl.WithRawResponseImpl(clientOptions) }

        private val dropzone: DropzoneService.WithRawResponse by lazy { DropzoneServiceImpl.WithRawResponseImpl(clientOptions) }

        private val emitterGeolocation: EmitterGeolocationService.WithRawResponse by lazy { EmitterGeolocationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val featureAssessment: FeatureAssessmentService.WithRawResponse by lazy { FeatureAssessmentServiceImpl.WithRawResponseImpl(clientOptions) }

        private val globalAtmosphericModel: GlobalAtmosphericModelService.WithRawResponse by lazy { GlobalAtmosphericModelServiceImpl.WithRawResponseImpl(clientOptions) }

        private val routeStats: RouteStatService.WithRawResponse by lazy { RouteStatServiceImpl.WithRawResponseImpl(clientOptions) }

        private val countries: CountryService.WithRawResponse by lazy { CountryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val crew: CrewService.WithRawResponse by lazy { CrewServiceImpl.WithRawResponseImpl(clientOptions) }

        private val diffOfArrival: DiffOfArrivalService.WithRawResponse by lazy { DiffOfArrivalServiceImpl.WithRawResponseImpl(clientOptions) }

        private val diplomaticClearance: DiplomaticClearanceService.WithRawResponse by lazy { DiplomaticClearanceServiceImpl.WithRawResponseImpl(clientOptions) }

        private val driftHistory: DriftHistoryService.WithRawResponse by lazy { DriftHistoryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ecpSdr: EcpSdrService.WithRawResponse by lazy { EcpSdrServiceImpl.WithRawResponseImpl(clientOptions) }

        private val effectRequests: EffectRequestService.WithRawResponse by lazy { EffectRequestServiceImpl.WithRawResponseImpl(clientOptions) }

        private val effectResponses: EffectResponseService.WithRawResponse by lazy { EffectResponseServiceImpl.WithRawResponseImpl(clientOptions) }

        private val elsets: ElsetService.WithRawResponse by lazy { ElsetServiceImpl.WithRawResponseImpl(clientOptions) }

        private val engineDetails: EngineDetailService.WithRawResponse by lazy { EngineDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val engines: EngineService.WithRawResponse by lazy { EngineServiceImpl.WithRawResponseImpl(clientOptions) }

        private val entities: EntityService.WithRawResponse by lazy { EntityServiceImpl.WithRawResponseImpl(clientOptions) }

        private val eop: EopService.WithRawResponse by lazy { EopServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ephemeris: EphemerisService.WithRawResponse by lazy { EphemerisServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ephemerisSets: EphemerisSetService.WithRawResponse by lazy { EphemerisSetServiceImpl.WithRawResponseImpl(clientOptions) }

        private val equipment: EquipmentService.WithRawResponse by lazy { EquipmentServiceImpl.WithRawResponseImpl(clientOptions) }

        private val equipmentRemarks: EquipmentRemarkService.WithRawResponse by lazy { EquipmentRemarkServiceImpl.WithRawResponseImpl(clientOptions) }

        private val evac: EvacService.WithRawResponse by lazy { EvacServiceImpl.WithRawResponseImpl(clientOptions) }

        private val eventEvolution: EventEvolutionService.WithRawResponse by lazy { EventEvolutionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val flightplan: FlightplanService.WithRawResponse by lazy { FlightplanServiceImpl.WithRawResponseImpl(clientOptions) }

        private val geoStatus: GeoStatusService.WithRawResponse by lazy { GeoStatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val gnssObservationset: GnssObservationsetService.WithRawResponse by lazy { GnssObservationsetServiceImpl.WithRawResponseImpl(clientOptions) }

        private val groundImagery: GroundImageryService.WithRawResponse by lazy { GroundImageryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val h3Geo: H3GeoService.WithRawResponse by lazy { H3GeoServiceImpl.WithRawResponseImpl(clientOptions) }

        private val h3GeoHexCell: H3GeoHexCellService.WithRawResponse by lazy { H3GeoHexCellServiceImpl.WithRawResponseImpl(clientOptions) }

        private val hazard: HazardService.WithRawResponse by lazy { HazardServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ir: IrService.WithRawResponse by lazy { IrServiceImpl.WithRawResponseImpl(clientOptions) }

        private val isrCollections: IsrCollectionService.WithRawResponse by lazy { IsrCollectionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val item: ItemService.WithRawResponse by lazy { ItemServiceImpl.WithRawResponseImpl(clientOptions) }

        private val itemTrackings: ItemTrackingService.WithRawResponse by lazy { ItemTrackingServiceImpl.WithRawResponseImpl(clientOptions) }

        private val launchDetection: LaunchDetectionService.WithRawResponse by lazy { LaunchDetectionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val launchEvent: LaunchEventService.WithRawResponse by lazy { LaunchEventServiceImpl.WithRawResponseImpl(clientOptions) }

        private val launchSite: LaunchSiteService.WithRawResponse by lazy { LaunchSiteServiceImpl.WithRawResponseImpl(clientOptions) }

        private val launchSiteDetails: LaunchSiteDetailService.WithRawResponse by lazy { LaunchSiteDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val launchVehicle: LaunchVehicleService.WithRawResponse by lazy { LaunchVehicleServiceImpl.WithRawResponseImpl(clientOptions) }

        private val launchVehicleDetails: LaunchVehicleDetailService.WithRawResponse by lazy { LaunchVehicleDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val linkStatus: LinkStatusService.WithRawResponse by lazy { LinkStatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val location: LocationService.WithRawResponse by lazy { LocationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val logisticsSupport: LogisticsSupportService.WithRawResponse by lazy { LogisticsSupportServiceImpl.WithRawResponseImpl(clientOptions) }

        private val maneuvers: ManeuverService.WithRawResponse by lazy { ManeuverServiceImpl.WithRawResponseImpl(clientOptions) }

        private val manifold: ManifoldService.WithRawResponse by lazy { ManifoldServiceImpl.WithRawResponseImpl(clientOptions) }

        private val manifoldelset: ManifoldelsetService.WithRawResponse by lazy { ManifoldelsetServiceImpl.WithRawResponseImpl(clientOptions) }

        private val missileTracks: MissileTrackService.WithRawResponse by lazy { MissileTrackServiceImpl.WithRawResponseImpl(clientOptions) }

        private val missionAssignment: MissionAssignmentService.WithRawResponse by lazy { MissionAssignmentServiceImpl.WithRawResponseImpl(clientOptions) }

        private val mti: MtiService.WithRawResponse by lazy { MtiServiceImpl.WithRawResponseImpl(clientOptions) }

        private val navigation: NavigationService.WithRawResponse by lazy { NavigationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val navigationalObstruction: NavigationalObstructionService.WithRawResponse by lazy { NavigationalObstructionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val notification: NotificationService.WithRawResponse by lazy { NotificationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val objectOfInterest: ObjectOfInterestService.WithRawResponse by lazy { ObjectOfInterestServiceImpl.WithRawResponseImpl(clientOptions) }

        private val observations: ObservationService.WithRawResponse by lazy { ObservationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onboardnavigation: OnboardnavigationService.WithRawResponse by lazy { OnboardnavigationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbit: OnorbitService.WithRawResponse by lazy { OnorbitServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitantenna: OnorbitantennaService.WithRawResponse by lazy { OnorbitantennaServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitbattery: OnorbitbatteryService.WithRawResponse by lazy { OnorbitbatteryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitdetails: OnorbitdetailService.WithRawResponse by lazy { OnorbitdetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitevent: OnorbiteventService.WithRawResponse by lazy { OnorbiteventServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitlist: OnorbitlistService.WithRawResponse by lazy { OnorbitlistServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitsolararray: OnorbitsolararrayService.WithRawResponse by lazy { OnorbitsolararrayServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitthruster: OnorbitthrusterService.WithRawResponse by lazy { OnorbitthrusterServiceImpl.WithRawResponseImpl(clientOptions) }

        private val onorbitthrusterstatus: OnorbitthrusterstatusService.WithRawResponse by lazy { OnorbitthrusterstatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val operatingunit: OperatingunitService.WithRawResponse by lazy { OperatingunitServiceImpl.WithRawResponseImpl(clientOptions) }

        private val operatingunitremark: OperatingunitremarkService.WithRawResponse by lazy { OperatingunitremarkServiceImpl.WithRawResponseImpl(clientOptions) }

        private val orbitdetermination: OrbitdeterminationService.WithRawResponse by lazy { OrbitdeterminationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val orbittrack: OrbittrackService.WithRawResponse by lazy { OrbittrackServiceImpl.WithRawResponseImpl(clientOptions) }

        private val organization: OrganizationService.WithRawResponse by lazy { OrganizationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val organizationdetails: OrganizationdetailService.WithRawResponse by lazy { OrganizationdetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val personnelrecovery: PersonnelrecoveryService.WithRawResponse by lazy { PersonnelrecoveryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val poi: PoiService.WithRawResponse by lazy { PoiServiceImpl.WithRawResponseImpl(clientOptions) }

        private val port: PortService.WithRawResponse by lazy { PortServiceImpl.WithRawResponseImpl(clientOptions) }

        private val rfBand: RfBandService.WithRawResponse by lazy { RfBandServiceImpl.WithRawResponseImpl(clientOptions) }

        private val rfBandType: RfBandTypeService.WithRawResponse by lazy { RfBandTypeServiceImpl.WithRawResponseImpl(clientOptions) }

        private val rfEmitter: RfEmitterService.WithRawResponse by lazy { RfEmitterServiceImpl.WithRawResponseImpl(clientOptions) }

        private val rfEmitterDetails: RfEmitterDetailService.WithRawResponse by lazy { RfEmitterDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sarObservation: SarObservationService.WithRawResponse by lazy { SarObservationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val scientific: ScientificService.WithRawResponse by lazy { ScientificServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sensor: SensorService.WithRawResponse by lazy { SensorServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sensorMaintenance: SensorMaintenanceService.WithRawResponse by lazy { SensorMaintenanceServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sensorObservationType: SensorObservationTypeService.WithRawResponse by lazy { SensorObservationTypeServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sensorPlan: SensorPlanService.WithRawResponse by lazy { SensorPlanServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sensorType: SensorTypeService.WithRawResponse by lazy { SensorTypeServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seraDataCommDetails: SeraDataCommDetailService.WithRawResponse by lazy { SeraDataCommDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seraDataEarlyWarning: SeraDataEarlyWarningService.WithRawResponse by lazy { SeraDataEarlyWarningServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seraDataNavigation: SeraDataNavigationService.WithRawResponse by lazy { SeraDataNavigationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seradataOpticalPayload: SeradataOpticalPayloadService.WithRawResponse by lazy { SeradataOpticalPayloadServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seradataRadarPayload: SeradataRadarPayloadService.WithRawResponse by lazy { SeradataRadarPayloadServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seradataSigintPayload: SeradataSigintPayloadService.WithRawResponse by lazy { SeradataSigintPayloadServiceImpl.WithRawResponseImpl(clientOptions) }

        private val seradataSpacecraftDetails: SeradataSpacecraftDetailService.WithRawResponse by lazy { SeradataSpacecraftDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sgi: SgiService.WithRawResponse by lazy { SgiServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sigact: SigactService.WithRawResponse by lazy { SigactServiceImpl.WithRawResponseImpl(clientOptions) }

        private val site: SiteService.WithRawResponse by lazy { SiteServiceImpl.WithRawResponseImpl(clientOptions) }

        private val siteRemark: SiteRemarkService.WithRawResponse by lazy { SiteRemarkServiceImpl.WithRawResponseImpl(clientOptions) }

        private val siteStatus: SiteStatusService.WithRawResponse by lazy { SiteStatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val skyImagery: SkyImageryService.WithRawResponse by lazy { SkyImageryServiceImpl.WithRawResponseImpl(clientOptions) }

        private val soiObservationSet: SoiObservationSetService.WithRawResponse by lazy { SoiObservationSetServiceImpl.WithRawResponseImpl(clientOptions) }

        private val solarArray: SolarArrayService.WithRawResponse by lazy { SolarArrayServiceImpl.WithRawResponseImpl(clientOptions) }

        private val solarArrayDetails: SolarArrayDetailService.WithRawResponse by lazy { SolarArrayDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val sortiePpr: SortiePprService.WithRawResponse by lazy { SortiePprServiceImpl.WithRawResponseImpl(clientOptions) }

        private val spaceEnvObservation: SpaceEnvObservationService.WithRawResponse by lazy { SpaceEnvObservationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val stage: StageService.WithRawResponse by lazy { StageServiceImpl.WithRawResponseImpl(clientOptions) }

        private val starCatalog: StarCatalogService.WithRawResponse by lazy { StarCatalogServiceImpl.WithRawResponseImpl(clientOptions) }

        private val stateVector: StateVectorService.WithRawResponse by lazy { StateVectorServiceImpl.WithRawResponseImpl(clientOptions) }

        private val status: StatusService.WithRawResponse by lazy { StatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val substatus: SubstatusService.WithRawResponse by lazy { SubstatusServiceImpl.WithRawResponseImpl(clientOptions) }

        private val supportingData: SupportingDataService.WithRawResponse by lazy { SupportingDataServiceImpl.WithRawResponseImpl(clientOptions) }

        private val surface: SurfaceService.WithRawResponse by lazy { SurfaceServiceImpl.WithRawResponseImpl(clientOptions) }

        private val surfaceObstruction: SurfaceObstructionService.WithRawResponse by lazy { SurfaceObstructionServiceImpl.WithRawResponseImpl(clientOptions) }

        private val swir: SwirService.WithRawResponse by lazy { SwirServiceImpl.WithRawResponseImpl(clientOptions) }

        private val taiUtc: TaiUtcService.WithRawResponse by lazy { TaiUtcServiceImpl.WithRawResponseImpl(clientOptions) }

        private val tdoaFdoa: TdoaFdoaService.WithRawResponse by lazy { TdoaFdoaServiceImpl.WithRawResponseImpl(clientOptions) }

        private val track: TrackService.WithRawResponse by lazy { TrackServiceImpl.WithRawResponseImpl(clientOptions) }

        private val trackDetails: TrackDetailService.WithRawResponse by lazy { TrackDetailServiceImpl.WithRawResponseImpl(clientOptions) }

        private val trackRoute: TrackRouteService.WithRawResponse by lazy { TrackRouteServiceImpl.WithRawResponseImpl(clientOptions) }

        private val transponder: TransponderService.WithRawResponse by lazy { TransponderServiceImpl.WithRawResponseImpl(clientOptions) }

        private val vessel: VesselService.WithRawResponse by lazy { VesselServiceImpl.WithRawResponseImpl(clientOptions) }

        private val video: VideoService.WithRawResponse by lazy { VideoServiceImpl.WithRawResponseImpl(clientOptions) }

        private val weatherData: WeatherDataService.WithRawResponse by lazy { WeatherDataServiceImpl.WithRawResponseImpl(clientOptions) }

        private val weatherReport: WeatherReportService.WithRawResponse by lazy { WeatherReportServiceImpl.WithRawResponseImpl(clientOptions) }

        private val gnssObservations: GnssObservationService.WithRawResponse by lazy { GnssObservationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val gnssRawIf: GnssRawIfService.WithRawResponse by lazy { GnssRawIfServiceImpl.WithRawResponseImpl(clientOptions) }

        private val ionoObservations: IonoObservationService.WithRawResponse by lazy { IonoObservationServiceImpl.WithRawResponseImpl(clientOptions) }

        private val reportAndActivities: ReportAndActivityService.WithRawResponse by lazy { ReportAndActivityServiceImpl.WithRawResponseImpl(clientOptions) }

        private val secureMessaging: SecureMessagingService.WithRawResponse by lazy { SecureMessagingServiceImpl.WithRawResponseImpl(clientOptions) }

        private val scs: ScService.WithRawResponse by lazy { ScServiceImpl.WithRawResponseImpl(clientOptions) }

        private val scsViews: ScsViewService.WithRawResponse by lazy { ScsViewServiceImpl.WithRawResponseImpl(clientOptions) }

        override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UnifieddatalibraryClient.WithRawResponse = UnifieddatalibraryClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier::accept).build())

        override fun airEvents(): AirEventService.WithRawResponse = airEvents

        override fun airOperations(): AirOperationService.WithRawResponse = airOperations

        override fun airTransportMissions(): AirTransportMissionService.WithRawResponse = airTransportMissions

        override fun aircraft(): AircraftService.WithRawResponse = aircraft

        override fun aircraftSorties(): AircraftSortyService.WithRawResponse = aircraftSorties

        override fun aircraftStatusRemarks(): AircraftStatusRemarkService.WithRawResponse = aircraftStatusRemarks

        override fun aircraftStatuses(): AircraftStatusService.WithRawResponse = aircraftStatuses

        override fun airfieldSlots(): AirfieldSlotService.WithRawResponse = airfieldSlots

        override fun airfieldStatus(): AirfieldStatusService.WithRawResponse = airfieldStatus

        override fun airfields(): AirfieldService.WithRawResponse = airfields

        override fun airfieldSlotConsumptions(): AirfieldSlotConsumptionService.WithRawResponse = airfieldSlotConsumptions

        override fun airloadPlans(): AirloadPlanService.WithRawResponse = airloadPlans

        override fun airspaceControlOrders(): AirspaceControlOrderService.WithRawResponse = airspaceControlOrders

        override fun ais(): AiService.WithRawResponse = ais

        override fun aisObjects(): AisObjectService.WithRawResponse = aisObjects

        override fun analyticImagery(): AnalyticImageryService.WithRawResponse = analyticImagery

        override fun antennas(): AntennaService.WithRawResponse = antennas

        override fun attitudeData(): AttitudeDataService.WithRawResponse = attitudeData

        override fun attitudeSets(): AttitudeSetService.WithRawResponse = attitudeSets

        override fun batteries(): BatteryService.WithRawResponse = batteries

        override fun batterydetails(): BatterydetailService.WithRawResponse = batterydetails

        override fun beam(): BeamService.WithRawResponse = beam

        override fun beamContours(): BeamContourService.WithRawResponse = beamContours

        override fun buses(): BusService.WithRawResponse = buses

        override fun channels(): ChannelService.WithRawResponse = channels

        override fun collectRequests(): CollectRequestService.WithRawResponse = collectRequests

        override fun collectResponses(): CollectResponseService.WithRawResponse = collectResponses

        override fun comm(): CommService.WithRawResponse = comm

        override fun conjunctions(): ConjunctionService.WithRawResponse = conjunctions

        override fun cots(): CotService.WithRawResponse = cots

        override fun aviationRiskManagement(): AviationRiskManagementService.WithRawResponse = aviationRiskManagement

        override fun dropzone(): DropzoneService.WithRawResponse = dropzone

        override fun emitterGeolocation(): EmitterGeolocationService.WithRawResponse = emitterGeolocation

        override fun featureAssessment(): FeatureAssessmentService.WithRawResponse = featureAssessment

        override fun globalAtmosphericModel(): GlobalAtmosphericModelService.WithRawResponse = globalAtmosphericModel

        override fun routeStats(): RouteStatService.WithRawResponse = routeStats

        override fun countries(): CountryService.WithRawResponse = countries

        override fun crew(): CrewService.WithRawResponse = crew

        override fun diffOfArrival(): DiffOfArrivalService.WithRawResponse = diffOfArrival

        override fun diplomaticClearance(): DiplomaticClearanceService.WithRawResponse = diplomaticClearance

        override fun driftHistory(): DriftHistoryService.WithRawResponse = driftHistory

        override fun ecpSdr(): EcpSdrService.WithRawResponse = ecpSdr

        override fun effectRequests(): EffectRequestService.WithRawResponse = effectRequests

        override fun effectResponses(): EffectResponseService.WithRawResponse = effectResponses

        override fun elsets(): ElsetService.WithRawResponse = elsets

        override fun engineDetails(): EngineDetailService.WithRawResponse = engineDetails

        override fun engines(): EngineService.WithRawResponse = engines

        override fun entities(): EntityService.WithRawResponse = entities

        override fun eop(): EopService.WithRawResponse = eop

        override fun ephemeris(): EphemerisService.WithRawResponse = ephemeris

        override fun ephemerisSets(): EphemerisSetService.WithRawResponse = ephemerisSets

        override fun equipment(): EquipmentService.WithRawResponse = equipment

        override fun equipmentRemarks(): EquipmentRemarkService.WithRawResponse = equipmentRemarks

        override fun evac(): EvacService.WithRawResponse = evac

        override fun eventEvolution(): EventEvolutionService.WithRawResponse = eventEvolution

        override fun flightplan(): FlightplanService.WithRawResponse = flightplan

        override fun geoStatus(): GeoStatusService.WithRawResponse = geoStatus

        override fun gnssObservationset(): GnssObservationsetService.WithRawResponse = gnssObservationset

        override fun groundImagery(): GroundImageryService.WithRawResponse = groundImagery

        override fun h3Geo(): H3GeoService.WithRawResponse = h3Geo

        override fun h3GeoHexCell(): H3GeoHexCellService.WithRawResponse = h3GeoHexCell

        override fun hazard(): HazardService.WithRawResponse = hazard

        override fun ir(): IrService.WithRawResponse = ir

        override fun isrCollections(): IsrCollectionService.WithRawResponse = isrCollections

        override fun item(): ItemService.WithRawResponse = item

        override fun itemTrackings(): ItemTrackingService.WithRawResponse = itemTrackings

        override fun launchDetection(): LaunchDetectionService.WithRawResponse = launchDetection

        override fun launchEvent(): LaunchEventService.WithRawResponse = launchEvent

        override fun launchSite(): LaunchSiteService.WithRawResponse = launchSite

        override fun launchSiteDetails(): LaunchSiteDetailService.WithRawResponse = launchSiteDetails

        override fun launchVehicle(): LaunchVehicleService.WithRawResponse = launchVehicle

        override fun launchVehicleDetails(): LaunchVehicleDetailService.WithRawResponse = launchVehicleDetails

        override fun linkStatus(): LinkStatusService.WithRawResponse = linkStatus

        override fun location(): LocationService.WithRawResponse = location

        override fun logisticsSupport(): LogisticsSupportService.WithRawResponse = logisticsSupport

        override fun maneuvers(): ManeuverService.WithRawResponse = maneuvers

        override fun manifold(): ManifoldService.WithRawResponse = manifold

        override fun manifoldelset(): ManifoldelsetService.WithRawResponse = manifoldelset

        override fun missileTracks(): MissileTrackService.WithRawResponse = missileTracks

        override fun missionAssignment(): MissionAssignmentService.WithRawResponse = missionAssignment

        override fun mti(): MtiService.WithRawResponse = mti

        override fun navigation(): NavigationService.WithRawResponse = navigation

        override fun navigationalObstruction(): NavigationalObstructionService.WithRawResponse = navigationalObstruction

        override fun notification(): NotificationService.WithRawResponse = notification

        override fun objectOfInterest(): ObjectOfInterestService.WithRawResponse = objectOfInterest

        override fun observations(): ObservationService.WithRawResponse = observations

        override fun onboardnavigation(): OnboardnavigationService.WithRawResponse = onboardnavigation

        override fun onorbit(): OnorbitService.WithRawResponse = onorbit

        override fun onorbitantenna(): OnorbitantennaService.WithRawResponse = onorbitantenna

        override fun onorbitbattery(): OnorbitbatteryService.WithRawResponse = onorbitbattery

        override fun onorbitdetails(): OnorbitdetailService.WithRawResponse = onorbitdetails

        override fun onorbitevent(): OnorbiteventService.WithRawResponse = onorbitevent

        override fun onorbitlist(): OnorbitlistService.WithRawResponse = onorbitlist

        override fun onorbitsolararray(): OnorbitsolararrayService.WithRawResponse = onorbitsolararray

        override fun onorbitthruster(): OnorbitthrusterService.WithRawResponse = onorbitthruster

        override fun onorbitthrusterstatus(): OnorbitthrusterstatusService.WithRawResponse = onorbitthrusterstatus

        override fun operatingunit(): OperatingunitService.WithRawResponse = operatingunit

        override fun operatingunitremark(): OperatingunitremarkService.WithRawResponse = operatingunitremark

        override fun orbitdetermination(): OrbitdeterminationService.WithRawResponse = orbitdetermination

        override fun orbittrack(): OrbittrackService.WithRawResponse = orbittrack

        override fun organization(): OrganizationService.WithRawResponse = organization

        override fun organizationdetails(): OrganizationdetailService.WithRawResponse = organizationdetails

        override fun personnelrecovery(): PersonnelrecoveryService.WithRawResponse = personnelrecovery

        override fun poi(): PoiService.WithRawResponse = poi

        override fun port(): PortService.WithRawResponse = port

        override fun rfBand(): RfBandService.WithRawResponse = rfBand

        override fun rfBandType(): RfBandTypeService.WithRawResponse = rfBandType

        override fun rfEmitter(): RfEmitterService.WithRawResponse = rfEmitter

        override fun rfEmitterDetails(): RfEmitterDetailService.WithRawResponse = rfEmitterDetails

        override fun sarObservation(): SarObservationService.WithRawResponse = sarObservation

        override fun scientific(): ScientificService.WithRawResponse = scientific

        override fun sensor(): SensorService.WithRawResponse = sensor

        override fun sensorMaintenance(): SensorMaintenanceService.WithRawResponse = sensorMaintenance

        override fun sensorObservationType(): SensorObservationTypeService.WithRawResponse = sensorObservationType

        override fun sensorPlan(): SensorPlanService.WithRawResponse = sensorPlan

        override fun sensorType(): SensorTypeService.WithRawResponse = sensorType

        override fun seraDataCommDetails(): SeraDataCommDetailService.WithRawResponse = seraDataCommDetails

        override fun seraDataEarlyWarning(): SeraDataEarlyWarningService.WithRawResponse = seraDataEarlyWarning

        override fun seraDataNavigation(): SeraDataNavigationService.WithRawResponse = seraDataNavigation

        override fun seradataOpticalPayload(): SeradataOpticalPayloadService.WithRawResponse = seradataOpticalPayload

        override fun seradataRadarPayload(): SeradataRadarPayloadService.WithRawResponse = seradataRadarPayload

        override fun seradataSigintPayload(): SeradataSigintPayloadService.WithRawResponse = seradataSigintPayload

        override fun seradataSpacecraftDetails(): SeradataSpacecraftDetailService.WithRawResponse = seradataSpacecraftDetails

        override fun sgi(): SgiService.WithRawResponse = sgi

        override fun sigact(): SigactService.WithRawResponse = sigact

        override fun site(): SiteService.WithRawResponse = site

        override fun siteRemark(): SiteRemarkService.WithRawResponse = siteRemark

        override fun siteStatus(): SiteStatusService.WithRawResponse = siteStatus

        override fun skyImagery(): SkyImageryService.WithRawResponse = skyImagery

        override fun soiObservationSet(): SoiObservationSetService.WithRawResponse = soiObservationSet

        override fun solarArray(): SolarArrayService.WithRawResponse = solarArray

        override fun solarArrayDetails(): SolarArrayDetailService.WithRawResponse = solarArrayDetails

        override fun sortiePpr(): SortiePprService.WithRawResponse = sortiePpr

        override fun spaceEnvObservation(): SpaceEnvObservationService.WithRawResponse = spaceEnvObservation

        override fun stage(): StageService.WithRawResponse = stage

        override fun starCatalog(): StarCatalogService.WithRawResponse = starCatalog

        override fun stateVector(): StateVectorService.WithRawResponse = stateVector

        override fun status(): StatusService.WithRawResponse = status

        override fun substatus(): SubstatusService.WithRawResponse = substatus

        override fun supportingData(): SupportingDataService.WithRawResponse = supportingData

        override fun surface(): SurfaceService.WithRawResponse = surface

        override fun surfaceObstruction(): SurfaceObstructionService.WithRawResponse = surfaceObstruction

        override fun swir(): SwirService.WithRawResponse = swir

        override fun taiUtc(): TaiUtcService.WithRawResponse = taiUtc

        override fun tdoaFdoa(): TdoaFdoaService.WithRawResponse = tdoaFdoa

        override fun track(): TrackService.WithRawResponse = track

        override fun trackDetails(): TrackDetailService.WithRawResponse = trackDetails

        override fun trackRoute(): TrackRouteService.WithRawResponse = trackRoute

        override fun transponder(): TransponderService.WithRawResponse = transponder

        override fun vessel(): VesselService.WithRawResponse = vessel

        override fun video(): VideoService.WithRawResponse = video

        override fun weatherData(): WeatherDataService.WithRawResponse = weatherData

        override fun weatherReport(): WeatherReportService.WithRawResponse = weatherReport

        override fun gnssObservations(): GnssObservationService.WithRawResponse = gnssObservations

        override fun gnssRawIf(): GnssRawIfService.WithRawResponse = gnssRawIf

        override fun ionoObservations(): IonoObservationService.WithRawResponse = ionoObservations

        override fun reportAndActivities(): ReportAndActivityService.WithRawResponse = reportAndActivities

        override fun secureMessaging(): SecureMessagingService.WithRawResponse = secureMessaging

        override fun scs(): ScService.WithRawResponse = scs

        override fun scsViews(): ScsViewService.WithRawResponse = scsViews
    }
}

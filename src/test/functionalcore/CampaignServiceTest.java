package functionalcore;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CampaignServiceTest {
    @InjectMocks
    CampaignService campaignService;
    @Mock
    ProductRepository productRepository;
    @Mock
    PageRepository pageRepository;
    @Mock
    CampaignRepository campaignRepository;
    @Mock
    FunctionalCore functionalCore;
    @Captor
    ArgumentCaptor<Campaign> campaignCaptor;

    @Test
    public void test_assembleCampaign_productGarden_pageRetail() {
        Page page = new Page(1L, "Summer Garden", "Garden");
        Product product = new Product(1L, "Chair", "Garden");

        when(pageRepository.findById(1L)).thenReturn(page);
        when(productRepository.findById(1L)).thenReturn(product);
        when(functionalCore.getCampaign(page, product)).thenReturn(new Campaign("calculated GardenGarden"));

        campaignService.createCampaign(1L, 1L);

        verify(campaignRepository).save(campaignCaptor.capture());
        assertEquals("calculated GardenGarden", campaignCaptor.getValue().getCalc());
    }

    //public void test_assembleCampaign_productGarden_pageOnline(){
    //public void test_assembleCampaign_productGarden_pageOmniChannel(){
    //public void test_assembleCampaign_productChristmans_pageOmniRetail(){
    //...etc

}

class FunctionalCoreeTest {
    FunctionalCore functionalCore = new FunctionalCore();

    @Test
    public void test_assembleCampaign_productGarden_pageRetail() {
        Page page = new Page(1L, "Summer Garden", "Garden");
        Product product = new Product(1L, "Chair", "Garden");

        Campaign campaign = functionalCore.getCampaign(page, product);

        assertEquals("calculated GardenGarden", campaign.getCalc());
    }

    //public void test_assembleCampaign_productGarden_pageOnline(){
    //public void test_assembleCampaign_productGarden_pageOmniChannel(){
    //public void test_assembleCampaign_productChristmans_pageOmniRetail(){
    //...etc

}

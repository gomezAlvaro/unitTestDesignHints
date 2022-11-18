package com.gomezr.functionalcore;

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
class CampaignAssemblerTest {
    @InjectMocks
    CampaignAssembler campaignAssembler;
    @Mock
    ProductRepository productRepository;
    @Mock
    PageRepository pageRepository;
    @Mock
    CampaignRepository campaignRepository;
    @Captor
    ArgumentCaptor<Campaign> campaignCaptor;

    @Test
    public void test_assembleCampaign_productGarden_pageRetail() {
        Page page = new Page(1L, "Summer Garden", "Garden");
        Product product = new Product(1L, "Chair", "Garden");

        when(pageRepository.findById(1L)).thenReturn(page);
        when(productRepository.findById(1L)).thenReturn(product);

        campaignAssembler.createCampaign(1L, 1L);

        verify(campaignRepository).save(campaignCaptor.capture());
        assertEquals("calculated GardenGarden", campaignCaptor.getValue().getCalc());
    }

    //public void test_assembleCampaign_productGarden_pageOnline(){
    //public void test_assembleCampaign_productGarden_pageOmniChannel(){
    //public void test_assembleCampaign_productChristmans_pageOmniRetail(){
    //...etc

}
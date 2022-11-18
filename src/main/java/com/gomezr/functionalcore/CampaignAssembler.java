package com.gomezr.functionalcore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CampaignAssembler {
    private PageRepository pageRepository;
    private ProductRepository productRepository;
    private CampaignRepository campaignRepository;

    public void createCampaign(Long pageId, Long productId) {
        Page page = pageRepository.findById(pageId);
        Product product = productRepository.findById(productId);

        /* complex stuff depending on page type / product type combinations
            some ifs/switch, whatever
         */
        String generatedCalculation = "calculated " + page.getType() + product.getType();
        Campaign campaign = new Campaign(generatedCalculation);
        campaignRepository.save(campaign);

    }
}
package functionalcore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CampaignService {
    private PageRepository pageRepository;
    private ProductRepository productRepository;
    private CampaignRepository campaignRepository;
    private FunctionalCore functionalCore;

    public void createCampaign(Long pageId, Long productId) {
        Page page = pageRepository.findById(pageId);
        Product product = productRepository.findById(productId);

        Campaign campaign = functionalCore.getCampaign(page, product);
        campaignRepository.save(campaign);

    }
}


class FunctionalCore {

    public Campaign getCampaign(Page page, Product product) {
    /* complex stuff depending on page type / product type combinations
        some ifs/switch, whatever
     */
        String generatedCalculation = "calculated " + page.getType() + product.getType();
        Campaign campaign = new Campaign(generatedCalculation);
        return campaign;
    }
}

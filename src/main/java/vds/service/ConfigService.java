package vds.service;

import vds.infrastructure.repository.ConfigRepository;
import vds.infrastructure.repository.PartnerConfigFactory;

public class ConfigService implements vds.spi.ConfigService {

    private PartnerConfigFactory partnerConfigFactory = new PartnerConfigFactory();
    @Override
    public Object getConfig() {
        ConfigRepository configStorage = partnerConfigFactory.getConfigStorage("TIKI");
        return configStorage.getConfig();
    }
}

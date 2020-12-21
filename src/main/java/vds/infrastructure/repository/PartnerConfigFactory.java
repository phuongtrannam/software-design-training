package vds.infrastructure.repository;

public class PartnerConfigFactory {
    private ConfigRepository tikiRepository = new TikiRepository();
    private ConfigRepository lazadaRepository = new LazadaRepository();

    public ConfigRepository getConfigStorage(String type){
        switch(type){
            case "TIKI":
                return tikiRepository;
            default:
                return lazadaRepository;
        }
    }
}

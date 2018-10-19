package com.amazon.ask.helloworld.api.galicia;

public class GetBranchesEndpoint extends GaliciaApi {

    public GetBranchesEndpoint() {
        super();
        setMethod("GET");
        setPath("api/v1/branches");
        appendApiKey();
    }

}

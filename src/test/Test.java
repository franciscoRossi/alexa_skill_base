import com.amazon.ask.helloworld.api.galicia.GetBranchesEndpoint;

public class Test {
    @org.junit.Test
    public void testBranchesEndpoint() {
        GetBranchesEndpoint endpoint = new GetBranchesEndpoint();
        System.out.println(endpoint.getPath());
    }
}

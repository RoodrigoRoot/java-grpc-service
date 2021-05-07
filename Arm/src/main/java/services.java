import com.linecorp.armeria.server.Server;
import com.linecorp.armeria.server.ServerBuilder;
import com.linecorp.armeria.server.grpc.GrpcService;

import user.UserService;



public class services {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerBuilder sb = Server.builder();
		// Configure an HTTP port.
		sb.service(GrpcService.builder()
                .addService(new UserService())
                .build());
		Server server = sb.build();
		server.start();

	}

}
